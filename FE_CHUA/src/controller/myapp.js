myApp.run(function ($rootScope, $window) {
  $rootScope.$on("$routeChangeStart", function (event, next, current) {
    var token = $window.localStorage.getItem("token");

    if (token == null || token == undefined) {
      setTimeout(() => {
        document.location = "/src/pages/login.html";
      }, 2000);
      sweetError("Mời bạn đăng nhập !");
      Swal.fire({
        icon: "error",
        title: "Mời bạn đăng nhập",
      });
      return;
    }
  });
});
