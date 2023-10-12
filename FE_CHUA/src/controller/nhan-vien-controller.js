myApp.controller("nhanVienController", function ($scope, $http, $window) {
  //TODO: Phân Quyền
  var role = $window.localStorage.getItem("role");
  console.log(role);

  if (role === "MANAGER_BAI_VIET") {
    Swal.fire({
      icon: "error",
      title: "Bạn không có quyền truy cập",
      text: "Vui lòng liên hệ với quản trị viên để biết thêm chi tiết.",
    });
    window.location.assign("/src/index-admin.html#/admin/posts");
  }
  if (role === "MANAGER_DON_DANG_KY") {
    Swal.fire({
      icon: "error",
      title: "Bạn không có quyền truy cập",
      text: "Vui lòng liên hệ với quản trị viên để biết thêm chi tiết.",
    });
    window.location.assign("/src/index-admin.html#/admin/registration");
  }
  if (role === "MANAGER_ASHRAM") {
    Swal.fire({
      icon: "error",
      title: "Bạn không có quyền truy cập",
      text: "Vui lòng liên hệ với quản trị viên để biết thêm chi tiết.",
    });
    window.location.assign("/src/index-admin.html#/admin/ashram");
  }
  if (role === "USER") {
    Swal.fire({
      icon: "error",
      title: "Bạn không có quyền truy cập",
      text: "Vui lòng liên hệ với quản trị viên để biết thêm chi tiết.",
    });
    window.location.assign("/src/index-admin.html#/user/home");
  }
  //TODO: Phân Quyền

  $scope.listPhatTu = [];

  $scope.newNhanVien = {};

  $scope.searchKeyword = "";

  $scope.getNhanVien = function () {
    var token = $window.localStorage.getItem("token");
    var config = {
      headers: {
        Authorzization: "Bearer " + token,
      },
    };
    var api =
      "http://localhost:8080/api/v1/phat-tu/search-employee?name=" +
      $scope.searchKeyword;
    $http.get(api, config).then(function (response) {
      $scope.listPhatTu = response.data;
    });
  };

  // --Phân trang -----
  $scope.currentPage = 0;

  $scope.getListPhatTu = function () {
    var token = $window.localStorage.getItem("token");

    var config = {
      headers: {
        Authorization: "Bearer " + token,
      },
    };
    var url =
      "http://localhost:8080/api/v1/phat-tu/show-nhan-vien?pageNumber=" +
      $scope.currentPage;
    $http.get(url, config).then(function (response) {
      $scope.listPhatTu = response.data;
    });
  };
  $scope.getListPhatTu();

  $scope.updatePage = function (pageNumber) {
    $scope.currentPage = pageNumber;
    $scope.getListPhatTu();
  };

  $scope.previousPage = function () {
    if ($scope.currentPage > 0) {
      $scope.currentPage--;
      $scope.getListPhatTu();
    }
  };

  $scope.nextPage = function () {
    // Add logic to handle the last page
    $scope.currentPage++;
    $scope.getListPhatTu();
  };

  $scope.getPages = function () {
    var pages = [];
    for (var i = 1; i <= $scope.totalPages; i++) {
      pages.push(i);
    }
    return pages;
  };

  // --Phân trang -----

  $scope.creataNhanVien = function () {
    Swal.fire({
      title: "Bạn có muốn update chùa không?",
      showDenyButton: true,
      showCancelButton: true,
      confirmButtonText: "Xác nhận",
      denyButtonText: `Không xác nhận`,
    }).then((result) => {
      if (result.isConfirmed) {
        var token = $window.localStorage.getItem("token");

        var config = {
          headers: {
            Authorization: "Bearer " + token,
          },
        };
        var api = "http://localhost:8080/api/v1/auth/register";
        $http.post(api, $scope.newNhanVien, config).then(
          function (response) {
            $scope.listPhatTu.push(response.data);
            Swal.fire("Thêm Thành Công");
            window.location.assign("/src/index-admin.html#/admin/nhan-vien");
            $scope.getListPhatTu();
          }
        );
      } else if (result.isDenied) {
        Swal.fire("Hủy update chùa", "", "info");
      }
    });
  };
});
