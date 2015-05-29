(function (){
	
	var app = angular.module("my500pxViewer");
	
	var MyPhotoListController = function($scope, $http, $log, $location) {
		
		var onPhotoComplete = function(response){
			$scope.myPhotos = response.data;
		}; 
		
		var onError = function(reason){
			$scope.error = "No photos in your collection, or something went wrong wen getting the list: " ; 
		}; 

		var search = function() {
			$http.get("http://localhost:8080/my500px/webapi/photos")
				.then(onPhotoComplete, onError);
		};
		
		$scope.showDetails = function(photoid){
			$location.path("/myPhotoDetails/" + photoid);
		};
		
		search();
	}
	
	app.controller("MyPhotoListController", ["$scope", "$http", "$log", "$location", MyPhotoListController]);
	
}());
