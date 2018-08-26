'use strict'
/**
 * 
 */
var app = angular.module('myApp',[]);
	app.factory('categoryService',['$http',function($http){
		var service = {};
		service.getAllCategory =function(){
			return $http.get('/categorymanagement/list').then(function(res){return res},function(error){return error});
		}
		service.updateCateGory = function(data){
			return $http.post('/categorymanagement/update',data);
		}
		return service;		
	}]);
	app.controller('categoryCtrl',['$scope','$http','categoryService',function($scope,$http,categoryService){
		$scope.menuTabs =[
			{name:'LIST',href:"list",active:true,isVisible:true,order:1},
			{name:'EDIT',href:"edit",active:false,isVisible:true,order:2},
			{name:'DETAIL',href:"detail",active:false,isVisible:true,order:3}
		]
//		$scope.getAllCategory =categoryService.getAllCategory();
		$scope.activeTab = function(tab,data){
			var data = data
			$scope.data = data;
		    $('.nav-tabs a[href="#' + tab + '"]').tab('show');	
	
		};
	}]);