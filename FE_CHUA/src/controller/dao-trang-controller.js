myApp.controller("daoTrangController", function ($scope, $http, $window) {
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

  $scope.listDaoTrang = [];

  $scope.newDaoTrang = {};

  $scope.searchKeyword = "";

  $scope.getDaoTrang = function () {
    var token = $window.localStorage.getItem("token"); // Lấy token từ local storage

    var config = {
      headers: {
        Authorization: "Bearer " + token,
      },
    };
    var api =
      "http://localhost:8080/api/v1/dao-trang/search?name=" +
      $scope.searchKeyword;
    $http.get(api, config).then(function (response) {
      $scope.listDaoTrang = response.data;
    });
  };

  // --Phân trang -----
  $scope.currentPage = 0;
  $scope.pageSize = 10;

  $scope.getListDaoTrang = function () {
    var token = $window.localStorage.getItem("token"); // Lấy token từ local storage

    var config = {
      headers: {
        Authorization: "Bearer " + token,
      },
    };
    var url =
      "http://localhost:8080/api/v1/dao-trang/show?pageNumber=" +
      $scope.currentPage +
      "&pageSize=" +
      $scope.pageSize;
    $http.get(url, config).then(function (response) {
      $scope.listDaoTrang = response.data;
    });
  };
  $scope.getListDaoTrang();

  $scope.updatePage = function (pageNumber) {
    $scope.currentPage = pageNumber;
    $scope.getListDaoTrang();
  };

  $scope.previousPage = function () {
    if ($scope.currentPage > 0) {
      $scope.currentPage--;
      $scope.getListDaoTrang();
    }
  };

  $scope.nextPage = function () {
    // Add logic to handle the last page
    $scope.currentPage++;
    $scope.getListDaoTrang();
  };

  $scope.getPages = function () {
    var pages = [];
    for (var i = 1; i <= $scope.totalPages; i++) {
      pages.push(i);
    }
    return pages;
  };

  // --Phân trang -----

  $scope.createDaoTrang = function () {
    Swal.fire({
      title: "Bạn có muốn tạo đạo tràng không?",
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
        var url = "http://localhost:8080/api/v1/dao-trang/create";
        $http
          .post(url, $scope.newDaoTrang, config)
          .then(function (response) {
            $scope.listDaoTrang.push(response.data);
            Swal.fire("Thêm Thành Công");
            window.location.assign("/src/index-admin.html#/admin/ashram");
          })
          .catch(function (error) {
            $scope.errorNoiDung = error.data.noiDung;
            $scope.errorNoiToChuc = error.data.noiToChuc;
            $scope.errorSoThanhVienThamGia = error.data.soThanhVienThamGia;
            $scope.errorNguoiChuChi = error.data.nguoiTruTri;
          });
      } else if (result.isDenied) {
        Swal.fire("Hủy tạo đạo tràng", "", "info");
      }
    });
  };
});
