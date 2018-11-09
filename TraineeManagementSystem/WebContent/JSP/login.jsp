<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<c:url var="myAction" value="/operations.obj"></c:url>
	<form:form action="${myAction}" method="post" modelAttribute="trainee">
		<center>
			Username: <input type="text" name="userName">Password:<input
				type="password" name="password"></br> <input type="submit"
				value="login" name="login"></br> 
		</center>
	</form:form>
</body>
</html>