myApp.controller("loginController", function ($scope, $http, $window) {
  var token = $window.localStorage.getItem("token");
  if (token) {
    $scope.isLoggedIn = true;
  } else {
    $scope.isLoggedIn = false;
  }

  $scope.login = function () {
    var data = {
      username: $scope.username,
      password: $scope.password,
    };

    $http.post("http://localhost:8080/api/v1/auth/login", data).then(
      function (response) {
        // Lấy thông tin chi tiết về người dùng
        $window.localStorage.setItem("token", response.data.accessToken);
        $http
          .get("http://localhost:8080/api/v1/auth/all/" + $scope.username)
          .then(function (userResponse) {
            $window.localStorage.setItem("role", userResponse.data.role);
            // Kiểm tra vai trò của người dùng
            if (userResponse.data.role === "ADMIN") {
              window.location.assign(
                "/src/index-admin.html#/admin/registration"
              );
              Swal.fire("Đăng Nhập Thành Công", "success");
            }
            if (userResponse.data.role === "MANAGER_BAI_VIET") {
              window.location.assign("/src/index-admin.html#/admin/posts");
              Swal.fire("Đăng Nhập Thành Công", "success");
            }
            if (userResponse.data.role === "MANAGER_DON_DANG_KY") {
              window.location.assign(
                "/src/index-admin.html#/admin/registration"
              );
              Swal.fire("Đăng Nhập Thành Công", "success");
            }
            if (userResponse.data.role === "MANAGER_ASHRAM") {
              window.location.assign("/src/index-admin.html#/admin/ashram");
              Swal.fire("Đăng Nhập Thành Công", "success");
            }
            if (userResponse.data.role === "USER") {
              window.location.assign(
                "/src/index-admin.html#/admin/registration"
              );
              Swal.fire("Đăng Nhập Thành Công", "success");
            }
          });
      },
      function (error) {
        $scope.usernameError = error.data.username;
        $scope.passwordError = error.data.password;
      }
    );
  };
  $scope.logout = function () {
    // Xóa token khỏi localStorage
    $window.localStorage.removeItem("token");
    $scope.isLoggedIn = false;
    // Chuyển hướng người dùng về trang đăng nhập
    window.location.href = "/src/pages/login.html";
  };
});
