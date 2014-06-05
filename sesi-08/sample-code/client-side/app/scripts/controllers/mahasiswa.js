'use strict';

angular.module('clientSideApp')
  .controller('MahasiswaCtrl', function ($scope) {
  	$scope.mahasiswa;

    $scope.daftarMahasiswa = [
      {
      	id: 1,
      	npm: '012345',
      	nama: 'Endy Muhardin',
      	tanggalLahir: '17-August-1945',
      	email: 'endy.muhardin@gmail.com'
      },
      {
      	id: 2,
      	npm: '54321',
      	nama: 'Adi Sulistiono',
      	tanggalLahir: '28-September-1928',
      	email: 'adi.sulistiono@gmail.com'
      }
    ];

    $scope.edit = function(x){
    	$scope.mahasiswa = x;
    };
  });
