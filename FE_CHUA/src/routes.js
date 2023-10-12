myApp.config(function ($routeProvider, $locationProvider) {

  $locationProvider.hashPrefix("");

  $routeProvider
    .when("/admin/registration", {
      templateUrl: "./pages/don-dang-ky.html",
      controller: "donDangKyController",
    })
    .when("/admin/posts", {
      templateUrl: "./pages/bai-viet.html",
      controller: "baiVietController",
    })
    .when("/admin/ashram", {
      templateUrl: "./pages/dao-trang.html",
      controller: "daoTrangController",
    })
    .when("/admin/nhan-vien", {
      templateUrl: "./pages/nhan-vien.html",
      controller: "nhanVienController",
    })
    .when("/admin/khach-hang", {
      templateUrl: "./pages/khach-hang.html",
      controller: "khachHangController",
    })
    .when("/admin/pagoda", {
      templateUrl: "./pages/chua.html",
      controller: "chuaController",
    })
    .when("/admin/create-dao-trang", {
      templateUrl: "./pages/them-dao-trang.html",
      controller: "daoTrangController",
    })
    .when("/admin/update-dao-trang/:id", {
      templateUrl: "./pages/update-daotrang.html",
      controller: "updateDaoTrangController",
    })
    .when("/admin/update-chua/:id", {
      templateUrl: "./pages/update-chua.html",
      controller: "updateChuaController",
    })
    .when("/admin/update-nhan-vien/:id", {
      templateUrl: "./pages/update-nhan-vien.html",
      controller: "updateNhanVienController",
    })
    .when("/admin/update-phat-tu/:id", {
      templateUrl: "./pages/update-phat-tu.html",
      controller: "updateKhachHangController",
    })
    .when("/admin/create-nhan-vien", {
      templateUrl: "./pages/create-nhan-vien.html",
      controller: "nhanVienController",
    })
    .when("/admin/create-phat-tu", {
      templateUrl: "./pages/create-khach-hang.html",
      controller: "khachHangController",
    })
    .when("/user/home", {
      templateUrl: "./pages/trang-chu.html",
      controller: "homeController",
    })
    .when("/user/post", {
      templateUrl: "./pages/posts.html",
      controller:"baiVietUserController"
    })
    .when("/user/event", {
      templateUrl: "./pages/su-kien.html",
      controller:"EventController"
    })
});
