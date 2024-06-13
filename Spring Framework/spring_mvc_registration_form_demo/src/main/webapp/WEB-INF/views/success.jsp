<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>

	<h1 text-center>${Header}</h1>
	<p text-center>${Desc}</p>
	<hr>

		<h1>Welcome ${user.userName}</h1>
		<h1>Your email address is ${user.email}</h1>
		<h1>Your password is ${user.userPassword} try to secure the password</h1>
</body>
</html>