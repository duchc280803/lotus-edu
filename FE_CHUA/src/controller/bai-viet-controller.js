myApp.controller("baiVietController", function ($scope, $http, $window) {
  //TODO: Phân Quyền
  var role = $window.localStorage.getItem("role");
  console.log(role);

  if (role === "MANAGER_BAI_VIET") {
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

  $scope.listBaiViet = [];

  // --Phân trang -----
  $scope.currentPage = 0;
  $scope.pageSize = 10;
  $scope.getListBaiViet = function () {
    var token = $window.localStorage.getItem("token"); // Lấy token từ local storage

    var config = {
      headers: {
        Authorization: "Bearer " + token,
      },
    };
    var url =
      "http://localhost:8080/api/v1/bai-viet/detail?pageNumber=" +
      $scope.currentPage +
      "&pageSize=" +
      $scope.pageSize;
    $http.get(url, config).then(function (response) {
      $scope.listBaiViet = response.data;
    });
  };
  $scope.getListBaiViet();

  $scope.updatePage = function (pageNumber) {
    $scope.currentPage = pageNumber;
    $scope.getListBaiViet();
  };

  $scope.previousPage = function () {
    if ($scope.currentPage > 0) {
      $scope.currentPage--;
      $scope.getListBaiViet();
    }
  };

  $scope.nextPage = function () {
    // Add logic to handle the last page
    $scope.currentPage++;
    $scope.getListBaiViet();
  };

  $scope.getPages = function () {
    var pages = [];
    for (var i = 1; i <= $scope.totalPages; i++) {
      pages.push(i);
    }
    return pages;
  };

  // --Phân trang -----

  $scope.searchKeyword = "";

  $scope.getBaiViet = function () {
    var token = $window.localStorage.getItem("token"); // Lấy token từ local storage

    var config = {
      headers: {
        Authorization: "Bearer " + token,
      },
    };
    $http
      .get(
        "http://localhost:8080/api/v1/bai-viet/search/?name=" +
          $scope.searchKeyword,
        config
      )
      .then(function (response) {
        $scope.listBaiViet = response.data;
      });
  };

  $scope.updateBaiViet = function (idBaiViet) {
    var url = "http://localhost:8080/api/v1/bai-viet/delete/" + idBaiViet;
    var token = $window.localStorage.getItem("token");
      var config = {
        headers: {
          Authorization: "Bearer " + token,
        },
      };
    Swal.fire({
      title: "Bạn có muốn xóa bài viết không?",
      showDenyButton: true,
      showCancelButton: true,
      confirmButtonText: "Xác nhận",
      denyButtonText: `Không xác nhận`,
    }).then((result) => {
      if (result.isConfirmed) {
        $http.put(url,{} ,config).then(function (response) {
          Swal.fire("Xóa Thành Công");
          window.location.assign("/src/index-admin.html#/admin/posts");
          $scope.getListBaiViet();
        });
      } else if (result.isDenied) {
        Swal.fire("Hủy xóa bài viết", "", "info");
      }
    });
  };
});
