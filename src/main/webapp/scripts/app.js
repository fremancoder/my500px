(function (){
	
	var app = angular.module("my500pxViewer", ["ngRoute"]);
	
	app.config(function($routeProvider){
		console.log($routeProvider);
		
		$routeProvider
			.when("/myPhotos", 
					{
						templateUrl: "views/myPhotos.html",
						controller: "MyPhotoListController"
					})
			.when("/myPhotoDetails/:photoid", 
					{
						templateUrl: "views/myPhotoDetails.html",
						controller: "MyPhotoDetailController"
					})
			.otherwise({redirectTo:"/myPhotos"});
	});
	
}());