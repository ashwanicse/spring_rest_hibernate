'use strict';


angular.module('myApp').controller('UserController', ['$scope', 'UserService', function($scope, UserService) {
	
	var self = this;
	
	self.users = [];
	
	fetchAllUsers();
	
	function fetchAllUsers(){
        UserService.fetchAllUsers()
            .then(
            function(d) {
                self.users = d;
            },
            function(errResponse){
                console.error('Error while fetching Users');
            }
        );
    }
	
	
}]);