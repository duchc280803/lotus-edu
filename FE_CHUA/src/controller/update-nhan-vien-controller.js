myApp.controller(
  "updateNhanVienController",
  function ($scope, $http, $window, $routeParams) {
    $scope.newPhatTu = {};

    var id = $routeParams.id;

    $scope.viewPhatTu = function (id) {
      var token = $window.localStorage.getItem("token");

      var config = {
        headers: {
          Authorization: "Bearer " + token,
        },
      };
      var apiDetil = "http://localhost:8080/api/v1/phat-tu/detail/" + id;
      $http
        .get(apiDetil, config)
        .then(function (response) {
          response.data.ngaySinh = new Date(response.data.ngaySinh);
          $scope.newPhatTu = response.data;
        })
        .catch(function (error) {
          console.error("Error retrieving products:", error);
        });
    };

    $scope.viewPhatTu(id);

    $scope.updatePhatTu = function (idPhatTu) {
      var url = "http://localhost:8080/api/v1/phat-tu/update/" + idPhatTu;
      var token = $window.localStorage.getItem("token");
      var config = {
        headers: {
          Authorization: "Bearer " + token,
        },
      };
      Swal.fire({
        title: "Bạn có muốn update nhân viên không?",
        showDenyButton: true,
        showCancelButton: true,
        confirmButtonText: "Xác nhận",
        denyButtonText: `Không xác nhận`,
      }).then((result) => {
        if (result.isConfirmed) {
          $http.put(url, $scope.newPhatTu, config).then(function (response) {
            Swal.fire("Update Thành Công");
            window.location.assign("/src/index-admin.html#/admin/nhan-vien");
          });
        } else if (result.isDenied) {
          Swal.fire("Hủy update nhân viên", "", "info");
        }
      });
    };
  }
);
