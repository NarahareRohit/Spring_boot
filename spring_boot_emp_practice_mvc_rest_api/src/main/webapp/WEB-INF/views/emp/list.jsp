<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Table</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

</head>
<body>

	<div class="container">
		<h2>Employee Table</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Join Date</th>
					<th>Type</th>
					<th>Password</th>
					<th>Salary</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="emp" items="${requestScope.emp_list}">
					<tr>
						<td>${emp.id}</td>
						<td>${emp.firstName}</td>
						<td>${emp.lastName}</td>
						<td>${emp.email}</td>
						<td>${emp.joinDate}</td>
						<td>${emp.type}</td>
						<td>${emp.password}</td>
						<td>${emp.salary}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>


</body>
</html>