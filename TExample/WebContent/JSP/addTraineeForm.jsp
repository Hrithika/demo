<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>employee Application</title>
</head>
<body>
	<center>
		<h1 style="color: #0066CC">Welcome to the Application form</h1>
		<br />
		<br />

		<!--This code below displays the form to add a Donation to the database	-->
		<h3>Please Enter the Details</h3>
		<c:url var="myAction" value="/addTrainee.obj"></c:url>
		<form:form action="${myAction}" method="post" modelAttribute="trainee">
			<table bgcolor="#DCDCDC">
<tr>
					<td>employee Id:<span style="color: red;">*</span></td>
					<td><form:input  path="employeeId" /></td>
<!-- 		<td><input type="text" required pattern= "[0-9]{6}" ) /></td>
 -->
				<td style="color: red;"><form:errors path="employeeId"></form:errors></td>

				</tr>
				<tr>
					<td>employee Name:<span style="color: red;">*</span></td>
					<td><form:input path="employeeName" /></td>
					<td style="color: red;"><form:errors path="employeeName"></form:errors></td>

				</tr>
<tr>
					<td>salary:<span style="color: red;">*</span></td>
					<td><form:input  path="salary" />
				<!-- 	<td><input type="text"required pattern= "[1-9]{1,}" ) /></td> -->
					<!-- <select> <option value="JEE">JEE</option>
					<option value="Cloud">Cloud</option></select> --></td>
					<td style="color: red;"><form:errors path="salary"></form:errors></td>

				</tr>
<tr>
					<td>project name:<span style="color: red;">*</span></td>
					<td><form:input path="projectName" />
					<!-- <input type="radio" name="traineeLocation" value="Chennai">Chennai</input>
					<input type="radio" name="traineeLocation" value="Bangalore">Bangalore</input>
					<input type="radio" name="traineeLocation" value="Pune">Pune</input>
					<input type="radio" name="traineeLocation" value="Mumbai">	Mumbai</input> --></td>
					<td style="color: red;"><form:errors path="projectName"></form:errors></td>

				</tr>

							
				<tr>
					<td colspan="2"><input type="submit" name="submit"
						value="Add Trainee"></input></td>
				</tr>
			</table>

		</form:form>
		<br> <a href="operations.obj">Back To HomePage</a>
	</center>
</body>
</html>