<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" value="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin login</title>
</head>
<body>
	
	<h5 style="color:red;">${sessionScope.message}</h5>
	<h1>Admin form</h1>
	<h6>UserDetails - ${sessionScope.user_details}</h6>

</body>
</html>