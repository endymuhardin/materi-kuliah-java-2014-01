'use strict';

angular
  .module('clientSideApp', [
    'ngCookies',
    'ngResource',
    'ngSanitize',
    'ngRoute',
    'ui.date'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl'
      })
      .when('/mahasiswa', {
        templateUrl: 'views/mahasiswa.html',
        controller: 'MahasiswaCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
