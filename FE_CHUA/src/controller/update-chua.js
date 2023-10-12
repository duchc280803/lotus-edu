myApp.controller(
  "updateChuaController",
  function ($scope, $http, $window, $routeParams) {
    var id = $routeParams.id;

    $scope.newChua = {};

    $scope.viewChua = function (id) {
      var token = $window.localStorage.getItem("token");

      var config = {
        headers: {
          Authorization: "Bearer " + token,
        },
      };
      var apiDetil = "http://localhost:8080/api/v1/chua/detail/" + id;
      $http
        .get(apiDetil, config)
        .then(function (response) {
          $scope.newChua = response.data;
        })
        .catch(function (error) {
          console.error("Error retrieving products:", error);
        });
    };

    $scope.viewChua(id);

    $scope.updateChua = function (idDaoTrang) {
      var url = "http://localhost:8080/api/v1/chua/update/" + idDaoTrang;
      var token = $window.localStorage.getItem("token");
      var config = {
        headers: {
          Authorization: "Bearer " + token,
        },
      };
      Swal.fire({
        title: "Bạn có muốn update chùa không?",
        showDenyButton: true,
        showCancelButton: true,
        confirmButtonText: "Xác nhận",
        denyButtonText: `Không xác nhận`,
      }).then((result) => {
        if (result.isConfirmed) {
          $http.put(url, $scope.newChua, config).then(function (response) {
            Swal.fire("Update Thành Công", "success");
            window.location.assign("/src/index-admin.html#/admin/pagoda");
          });
        } else if (result.isDenied) {
          Swal.fire("Hủy update chùa", "", "info");
        }
      });
    };
  }
);
