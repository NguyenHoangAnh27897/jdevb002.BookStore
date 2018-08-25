$(document).ready(function(){
	// for adding a loader
	setTimeout(function() {
		$(".se-pre-con").fadeOut("slow");
	}, 500);	
	
		
	
});


var app = angular.module('myApp',[]);

	app.controller('categoryCtrl',['$scope',function($scope){
		$scope.menuTabs =[
			{name:'HOME',id:"home",href:"home",active:true,isVisible:true,order:1},
			{name:'EDIT',id:"edit",href:"edit",active:false,isVisible:true,order:2},
			{name:'DETAIL',id:"detail",href:"detail",active:false,isVisible:true,order:3}
		]
		$scope.activeTab = function(tab,data){
			var data = {
					id:data.id,
					name:data.name,
					description:data.description,
					parentID:data.parentID		
				};
			$scope.data =data;
		    $('.nav-tabs a[href="#' + tab + '"]').tab('show');	
		    console.log(data);
		};
	}]);
