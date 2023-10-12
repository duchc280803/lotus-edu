myApp.controller("chuaController", function ($scope, $http, $window) {

  //TODO: Phân Quyền
  var role = $window.localStorage.getItem("role");
  console.log(role);

  if(role === "MANAGER_BAI_VIET") {
    Swal.fire({
      icon: 'error',
      title: 'Bạn không có quyền truy cập',
      text: 'Vui lòng liên hệ với quản trị viên để biết thêm chi tiết.'
    });
    window.location.assign("/src/index-admin.html#/admin/posts");
  }
  if(role === "MANAGER_DON_DANG_KY") {
    Swal.fire({
      icon: 'error',
      title: 'Bạn không có quyền truy cập',
      text: 'Vui lòng liên hệ với quản trị viên để biết thêm chi tiết.'
    });
    window.location.assign("/src/index-admin.html#/admin/registration");
  }
  if(role === "MANAGER_ASHRAM") {
    Swal.fire({
      icon: 'error',
      title: 'Bạn không có quyền truy cập',
      text: 'Vui lòng liên hệ với quản trị viên để biết thêm chi tiết.'
    });
    window.location.assign("/src/index-admin.html#/admin/registration");
  }
  if(role === "MANAGER_PAGODA") {
    window.location.assign("/src/index-admin.html#/admin/ashram");
  }
  if (role === "USER") {
    Swal.fire({
      icon: 'error',
      title: 'Bạn không có quyền truy cập',
      text: 'Vui lòng liên hệ với quản trị viên để biết thêm chi tiết.'
    });
    window.location.assign(
      "/src/index-admin.html#/user/home"
    );
  }
  //TODO: Phân Quyền

  $scope.listChua = [];
  $scope.newChua = {};
  $scope.searchKeyword = "";

  // --Phân trang -----
  $scope.currentPage = 0;
  $scope.pageSize = 10;

  $scope.getListChua = function () {
    var token = $window.localStorage.getItem("token");
  
    var config = {
      headers: {
        Authorization: "Bearer " + token,
      },
    };
    var url =
      "http://localhost:8080/api/v1/chua/page-chua?pageNumber=" +
      $scope.currentPage +
      "&pageSize=" +
      $scope.pageSize;
    $http.get(url, config).then(function (response) {
      $scope.listChua = response.data;
      $scope.totalPages = parseInt(response.headers("total-pages")); // Parse the value as an integer
    });
  };

  $scope.getListChua();

  $scope.updatePage = function (pageNumber) {
    $scope.currentPage = pageNumber;
    $scope.getListChua();
  };

  $scope.previousPage = function () {
    if ($scope.currentPage > 0) {
      $scope.currentPage--;
      $scope.getListChua();
    }
  };

  $scope.nextPage = function () {
    // Add logic to handle the last page
    $scope.currentPage++;
    $scope.getListChua();
  };

  $scope.getPages = function () {
    var pages = [];
    for (var i = 1; i <= $scope.totalPages; i++) {
      pages.push(i);
    }
    return pages;
  };

  // --Phân trang -----

  $scope.getChua = function () {
    var token = $window.localStorage.getItem("token");
  
    var config = {
      headers: {
        Authorization: "Bearer " + token,
      },
    };
    $http
      .get(
        "http://localhost:8080/api/v1/chua/search?name=" + $scope.searchKeyword , config
      )
      .then(function (response) {
        $scope.listChua = response.data;
      });
  };
  $scope.createChua = function () {
    var token = $window.localStorage.getItem("token");
  
    var config = {
      headers: {
        Authorization: "Bearer " + token,
      },
    };
    var api = "http://localhost:8080/api/v1/chua/create";
    
    Swal.fire({
      title: "Bạn có muốn thêm chùa không?",
      showDenyButton: true,
      showCancelButton: true,
      confirmButtonText: "Xác nhận",
      denyButtonText: `Không xác nhận`,
    }).then((result) => {
      if (result.isConfirmed) {
        $http.post(api, $scope.newChua, config).then(
          function (response) {
            $scope.listChua.push(response.data);
            Swal.fire("Chùa đã được thêm thành công!", "", "success");
            window.location.assign("/src/index-admin.html#/admin/pagoda");
            $scope.getListChua();
          },
          function (error) {
            $scope.errorTenChua = error.data.tenChua;
            $scope.errorDiaChi = error.data.diaChi;
            $scope.errorNguoiTruTri = error.data.nguoiTruTri;
          }
        );
      } else if (result.isDenied) {
        Swal.fire("Hủy thêm chùa", "", "info");
      }
    });
  };
});
