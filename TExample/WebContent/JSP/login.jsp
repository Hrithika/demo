<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="myAction" value="/selectOption.obj"></c:url>
	<form:form action="${myAction}" method='post'>
		<center>
			Username<input type="text" required pattern= "Srinidhi" placeholder="No spaces allowed.")	
			name="name" /><br />Password<input
				type="password" required required pattern="Sri123" placeholder="No spaces allowed.") name="pass" /><br /> <input type="submit"
				value="login!" name="login!" />
		</center>
<!-- 		[a-zA-Z0-9]+$^[0-9]+$
 -->	</form:form>
</body>
</html>