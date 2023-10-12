myApp.controller("khachHangController", function ($scope, $http, $window) {
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

  $scope.newPhatTu = {};

  $scope.searchKeyword = "";

  $scope.getPhatTu = function () {
    var token = $window.localStorage.getItem("token");

    var config = {
      headers: {
        Authorization: "Bearer " + token,
      },
    };
    $http
      .get(
        "http://localhost:8080/api/v1/phat-tu/search-customer?name=" +
          $scope.searchKeyword , config
      )
      .then(function (response) {
        $scope.listPhatTu = response.data;
      });
  };

  // --Phân trang -----
  $scope.currentPage = 0;
  $scope.pageSize = 10;

  $scope.getListPhatTu = function () {
    var token = $window.localStorage.getItem("token");

    var config = {
      headers: {
        Authorization: "Bearer " + token,
      },
    };
    var url =
      "http://localhost:8080/api/v1/phat-tu/show-khach-hang?pageNumber=" +
      $scope.currentPage +
      "&pageSize=" +
      $scope.pageSize;
    $http.get(url , config).then(function (response) {
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

  $scope.creataPhatTu = function () {
    Swal.fire({
      title: "Bạn có muốn thêm phật tử không?",
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
        var api = "http://localhost:8080/api/v1/phat-tu/create";
        $http.post(api, $scope.newPhatTu, config).then(function (response) {
          $scope.listPhatTu.push(response.data);
          Swal.fire(
            'Thêm Thành Công',
          )
          window.location.assign("/src/index-admin.html#/admin/khach-hang");
          $scope.getListPhatTu();
        },
        function (error) {
          $scope.phapDanh = error.data.phapDanh;
          $scope.email = error.data.email;
          $scope.soDienThoai = error.data.soDienThoai;
          $scope.gioiTinh = error.data.gioiTinh;
        });
      } else if (result.isDenied) {
        Swal.fire("Hủy thêm phật tử", "", "info");
      }
    });
  };
});
