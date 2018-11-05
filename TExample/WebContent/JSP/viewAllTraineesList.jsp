<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
th {
	color: grey;
	font-size: 16pt;
}
</style>
</head>
<body>
<center>

<h1>Employees List</h1>

<table border=1>
	<tr>
		<th bgcolor="bisque">employee Id</th>
		<th bgcolor="bisque">employee Name</th>
		<th bgcolor="bisque">employee salary</th>
		<th bgcolor="bisque">project name</th>
	</tr>
	<c:forEach var="traineeList" items="${list}">
		<tr>
			<td>${traineeList.employeeId}</td>
			<td>${traineeList.employeeName}</td>
			<td>${traineeList.salary}</td>
			<td>${traineeList.projectName}</td>
		</tr>
	</c:forEach>
	<tr>
			<td colspan="5" align="center"><a href="operations.obj">Click
			Here To Go to services</a></td>
		</tr>
</table>
</center>
</body>
</html>