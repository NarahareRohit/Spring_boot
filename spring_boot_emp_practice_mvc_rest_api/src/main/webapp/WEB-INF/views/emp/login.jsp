<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<h2>Login Form</h2>
				<form action="" method="post">
					<div class="form-group">
						<label for="username">username:</label> <input type="text"
							class="form-control" id="username" name="username"
							placeholder="Enter your username">
					</div>
					<div class="form-group">
						<label for="password">Password:</label> <input type="password"
							class="form-control" id="password" name="password"
							placeholder="Enter your password">
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
				</form>
			</div>
		</div>
	</div>


</body>
</html>