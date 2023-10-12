myApp.controller("homeController", function ($scope, $http) {

  $scope.listBaiViet = [];

  // --Phân trang -----
  $scope.currentPage = 0;
  $scope.pageSize = 10;
  $scope.getListBaiViet = function () {
    var url =
      "http://localhost:8080/api/user/bai-viet/page-bai?pageNumber=" +
      $scope.currentPage +
      "&pageSize=" +
      $scope.pageSize;
    $http.get(url).then(function (response) {
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

  $scope.getBaiViet = function (searchKeyword) {
    $http
      .get(
        "http://localhost:8080/api/v1/bai-viet/search/ " + searchKeyword
      )
      .then(function (response) {
        $scope.listBaiViet = response.data;
      });
  };

  $scope.thongBao = function () {
    Swal.fire(
      'Good job!',
      'You clicked the button!',
      'success'
    )
  }
});
