myApp.controller("donDangKyController", function ($scope, $http, $window) {

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
    window.location.assign("/src/index-admin.html#/admin/registration");
  }
  if(role === "MANAGER_ASHRAM") {
    Swal.fire({
      icon: 'error',
      title: 'Bạn không có quyền truy cập',
      text: 'Vui lòng liên hệ với quản trị viên để biết thêm chi tiết.'
    });
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

  $scope.listDonDangKy = [];

  $scope.searchKeyword = "";

  $scope.getDonDangKy = function () {
    var token = $window.localStorage.getItem("token"); // Lấy token từ local storage

        var config = {
          headers: {
            Authorization: "Bearer " + token,
          },
        };
    $http
      .get(
        "http://localhost:8080/api/v1/don-dang-ky/search?name=" +
          $scope.searchKeyword, config
      )
      .then(function (response) {
        $scope.listDonDangKy = response.data;
      });
  };

  // --Phân trang -----
  $scope.currentPage = 0;

  $scope.getListDonDangKy = function () {
    var token = $window.localStorage.getItem("token"); // Lấy token từ local storage

        var config = {
          headers: {
            Authorization: "Bearer " + token,
          },
        };
    var url =
      "http://localhost:8080/api/v1/don-dang-ky/show?pageNumber=" + $scope.currentPage ;
    $http
      .get(url,config)
      .then(function (response) {
        $scope.listDonDangKy = response.data;
      })
      .catch(function (error) {});
  };

  $scope.getListDonDangKy();

  $scope.updatePage = function (pageNumber) {
    $scope.currentPage = pageNumber;
    $scope.getListDonDangKy();
  };

  $scope.previousPage = function () {
    if ($scope.currentPage > 0) {
      $scope.currentPage--;
      $scope.getListDonDangKy();
    }
  };

  $scope.nextPage = function () {
    // Add logic to handle the last page
    $scope.currentPage++;
    $scope.getListDonDangKy();
  };

  $scope.getPages = function () {
    var pages = [];
    for (var i = 1; i <= $scope.totalPages; i++) {
      pages.push(i);
    }
    return pages;
  };

  // --Phân trang -----

  $scope.updateDonDangKy = function (donDangKyId) {
    Swal.fire({
      title: "Bạn có muốn xác nhận đơn không?",
      showDenyButton: true,
      showCancelButton: true,
      confirmButtonText: "Xác nhận",
      denyButtonText: `Không xác nhận`,
    }).then((result) => {
      if (result.isConfirmed) {
        var token = $window.localStorage.getItem("token"); // Lấy token từ local storage

        var config = {
          headers: {
            Authorization: "Bearer " + token,
          },
        };

        var url =
          "http://localhost:8080/api/v1/don-dang-ky/update/" + donDangKyId;

        $http
          .put(url, null, config)
          .then(function (response) {
            Swal.fire(
              'Xác Nhận Thành Công',
            )
            $scope.getListDonDangKy();
          })
          .catch(function (error) {
            // Xử lý lỗi nếu cần thiết
          });
      } else if (result.isDenied) {
        Swal.fire("Hủy xác nhận đơn", "", "info");
      }
    });
  };
});
