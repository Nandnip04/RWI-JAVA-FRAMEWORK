<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<h1>My name is Nandni Patel</h1>
	<h1>This is help page</h1>
	
	<%
		String name=(String)request.getAttribute("name");
		String address=(String)request.getAttribute("address");
		
	%>
	<h1>Hello my name is <%=name%></h1>
	<h1>my address is  <%=address%></h1>
	
</body>
</html>