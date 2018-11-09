<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Application</title>
</head>
<body>
	<center>
		
		

		<!--This code below displays the form to add a Donation to the database	-->
		<h3>Please Enter the Registration Details</h3>
		<c:url var="myAction" value="/addRegistration.obj"></c:url>
		<form:form action="${myAction}" method="post" modelAttribute="registration">
			<table bgcolor="#DCDCDC">

                <tr>
					<td>Employee Id:<span style="color: red;">*</span></td>
					<td><form:input path="empId" /></td>
					<td style="color: red;"><form:errors path="empId"></form:errors></td>

				</tr>
				<tr>
					<td>Employee Name:<span style="color: red;">*</span></td>
					<td><form:input path="empName" /></td>
					<td style="color: red;"><form:errors path="empName"></form:errors></td>

				</tr>

				<tr>
					<td>Employee Salary:<span style="color: red;">*</span></td>
					<td><form:input path="salary" /></td>
					<td style="color: red;"><form:errors path="salary"></form:errors></td>

				</tr>

				<tr>
					<td>Project name:<span style="color: red;">*</span></td>
					<td><form:input path="projName" /></td>
					<td style="color: red;"><form:errors path="projName"></form:errors></td>

				</tr>
                <tr>
					<td colspan="2"><input type="submit" name="submit"
						value="Add Register"></input></td>
				</tr>
			</table>

		</form:form>
		<br> <a href="showHomePage.obj">Back To HomePage</a>
	</center>
</body>
</html>