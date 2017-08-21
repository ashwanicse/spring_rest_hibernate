'use strict';
 
angular.module('myApp').factory('UserService', ['$http', '$q', function($http, $q){
	
	var uri = 'http://localhost:8081/RestFull_Service/user/';
	
	var factory = {
			fetchAllUsers: fetchAllUsers
	};
	return factory;
	
	function fetchAllUsers(){
		var deferred = $q.defer();
		$http.get(uri).
		           then(
		        		   function(response){
		        			   deferred.resolve(response.data);
		        		   	},
		        		   	function(errResponse){
		        		   		console.error('Error while fetching Users');
		        		   		deferred.reject(errResponse);
		        		   	}
		        		);
		return deferred.promise;
	}
}]);