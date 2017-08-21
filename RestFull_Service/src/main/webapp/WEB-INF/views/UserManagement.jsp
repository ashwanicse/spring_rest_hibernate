<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>AngularJS $http Example</title>
</head>
<body ng-app="myApp">
<h1>User data</h1>

	<div ng-controller="UserController as ctrl">


		<table>
			<tr ng-repeat="u in ctrl.users">
				<td><span ng-bind="u.userID"></span></td>
				<td><span ng-bind="u.userName"></span></td>
				<td><span ng-bind="u.email"></span></td>
				<td><span ng-bind="u.password"></span></td>
			</tr>

		</table>

	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
	<script src="<c:url value='/static/js/app.js' />"></script>
	<script src="<c:url value='/static/js/service.js' />"></script>
	<script src="<c:url value='/static/js/controller.js' />"></script>
</body>
</html>