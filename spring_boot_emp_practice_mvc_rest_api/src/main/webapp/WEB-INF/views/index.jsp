<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Hello, ${requestScope.name}</h1>
	<a href="emp/list">All Employee</a>
	<h4>
		<a href="emp/signin">Employee Sign In</a>
	</h4>
	<h4>
		<a href="dept/list">Emp By Dept ID</a>
	</h4>	
</body>
</html>