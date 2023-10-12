myApp.controller("EventController", function ($scope, $http,$window) {

    $scope.listEvent = [];
  
    // --Phân trang -----
    $scope.currentPage = 0;
    $scope.getListBaiViet = function () {
      var url =
        "http://localhost:8080/api/user/dao-trang/show?pageNumber=" +
        $scope.currentPage;
      $http.get(url).then(function (response) {
        $scope.listEvent = response.data;
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

    $scope.creataDon = function (idDaoTrang) {
        Swal.fire({
          title: "Bạn Có muốn Đăng Ký Đạo Tràng Này Không không?",
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
            var api = "http://localhost:8080/api/user/don-dang-ky/create/" + idDaoTrang;
            $http.post(api, [],config).then(function (response) {
              $scope.listEvent.push(response.data);
              Swal.fire("Đăng Ký Thành Công Vui Lòng Chờ Nhân Viên Xác Nhận !");
              $scope.getListBaiViet();
              window.location.assign("/src/index-admin.html#/user/event");
            });
          } else if (result.isDenied) {
            Swal.fire("Hủy Đăng Ký", "", "info");
          }
        });
      };
  });
  