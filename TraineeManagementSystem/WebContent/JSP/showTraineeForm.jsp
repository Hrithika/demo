<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Trainee Details</title>
</head>
<body>
	<center>
		<h1 style="color: #0066CC">View Operation</h1>
		<br /> <br />

		<c:url var="myAction" value="/retrieveDetails.obj"></c:url>
		<form:form action="${myAction}" method="post" modelAttribute="trainee">
			<table bgcolor="#DCDCDC">

				<tr>
					<td>Please Enter the Trainee Id:<span style="color: red;">*</span></td>
					<td><form:input path="traineeId" /></td>
					<td style="color: red;"><form:errors path="traineeId"></form:errors></td>

					<tr align="center">
					<td colspan="2"><input type="submit" name="submit"
						value="View"></input></td>

				</tr>
			</table>
			<%-- <div>
				<%@include file="showDeleteDetails.jsp"%>
			</div> --%>
		</form:form>
		<br> <a href="operations.obj">Back To Operations</a>
	</center>
</body>
</html>