(function (){
	
	var app = angular.module("my500pxViewer");
	
	var MyPhotoDetailController = function($scope, $http, $log, $routeParams) {
		
		var onPhotoGet = function(response){
			console.log('MyPhotoDetailController in onPhotoGet');
			$scope.photoDetails = response.data; 
		}; 
		
		var onError = function(reason){
			console.log('MyPhotoDetailController in onError');
			$scope.error = "Could not fetch the data."; 
		}; 


		var getPhoto = function(){
			console.log('MyPhotoDetailController in getPhoto');
			$http.get("http://localhost:8080/my500px/webapi/photo/" + $routeParams.photoid )
				.then(onPhotoGet, onError);
		};
		
		getPhoto();

	}
	
	app.controller("MyPhotoDetailController", ["$scope", "$http", "$log", "$routeParams", MyPhotoDetailController]);
	
}());
