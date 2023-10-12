myApp.controller(
  "updateDaoTrangController",
  function ($scope, $http, $window, $routeParams) {
    var id = $routeParams.id;

    $scope.newDaoTrang = {};

    $scope.viewDaoTrang = function (id) {
      var token = $window.localStorage.getItem("token");

      var config = {
        headers: {
          Authorization: "Bearer " + token,
        },
      };
      var apiDetil = "http://localhost:8080/api/v1/dao-trang/detail/" + id;
      $http
        .get(apiDetil, config)
        .then(function (response) {
          $scope.newDaoTrang = response.data;
        })
        .catch(function (error) {
          console.error("Error retrieving products:", error);
        });
    };

    $scope.viewDaoTrang(id);

    $scope.updateDaoTrang = function (idDaoTrang) {
      var token = $window.localStorage.getItem("token");
      var config = {
        headers: {
          Authorization: "Bearer " + token,
        },
      };
      var url =
        "http://localhost:8080/api/v1/dao-trang/update/" + idDaoTrang;
      Swal.fire({
        title: "Bạn có muốn update đạo tràng không?",
        showDenyButton: true,
        showCancelButton: true,
        confirmButtonText: "Xác nhận",
        denyButtonText: `Không xác nhận`,
      }).then((result) => {
        if (result.isConfirmed) {
          $http.put(url, $scope.newDaoTrang, config).then(function (response) {
            Swal.fire("Update Thành Công");
            window.location.assign("/src/index-admin.html#/admin/ashram");
          });
        } else if (result.isDenied) {
          Swal.fire("Hủy update đạo tràng", "", "info");
        }
      });
    };
  }
);
