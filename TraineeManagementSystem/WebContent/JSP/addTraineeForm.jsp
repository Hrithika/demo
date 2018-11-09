<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Trainee Details</title>
</head>
<body>
	<center>
		<h1 style="color: #0066CC">Add Trainee Details</h1>
		<br />
		<br />

		<h3>Please Enter the Trainee Details</h3>
		<c:url var="myAction" value="/addTrainee.obj"></c:url>
		<form:form action="${myAction}" method="post" modelAttribute="trainee">
			<table bgcolor="#DCDCDC">

				<tr>
					<td>Trainee Id:<span style="color: red;">*</span></td>
					<td><form:input path="traineeId" /></td>
					<td style="color: red;"><form:errors path="traineeId"></form:errors></td>

				</tr>

				<tr>
					<td>Trainee Name:<span style="color: red;">*</span></td>
					<td><form:input path="traineeName" /></td>
					<td style="color: red;"><form:errors path="traineeName"></form:errors></td>

				</tr>
				<tr>
					<td>Trainee Domain:<span style="color: red;">*</span>
					<form:select path="traineeDomain" >
                <form:option  value="JEE" />JEE
        
                   <form:option  value=".Net"/>.Net
        
                 <form:option  value="Frameworks"/>Frameworks        
                      </form:select> 
					 <td style="color: red;"><form:errors path="traineeDomain"></form:errors></td> 

				</tr>	


				<tr>
					<td>Trainee Location:<span style="color: red;">*</span></td>
					<%-- <td><form:input path="traineeLocation"/></td> --%>
					<td><form:radiobutton path=traineeLocation" value="Chennai" name="location"/>Chennai</td>
					<td><form:radiobutton path=traineeLocation" value="Bangalore" name="location"/>Bangalore</td>
					<td><form:radiobutton path=traineeLocation" value="Pune" name="location"/>Pune</td>
					<td><form:radiobutton path=traineeLocation" value="Mumbai" name="location"/>Mumbai</td>
					<td style="color: red;"><form:errors path="traineeLocation"></form:errors></td>

				</tr>

					
					<tr align="center">
					<td colspan="2"><input type="submit" name="submit"
						value="Add Details"></input></td>
				</tr>
							
				
			</table>

		</form:form>
		<br> <a href="operations.obj">Back To Operations</a>
	</center>
</body>
</html>