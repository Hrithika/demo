<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Trainee Details</title>
</head>
<body>
	<center>
		<h1 style="color: #0066CC">Update Operation</h1>
		<br /> <br />

		<c:url var="myAction" value="/modifyTraineeDetails.obj"></c:url>
		<form:form action="${myAction}" method="post" modelAttribute="trainee">
			<table bgcolor="#DCDCDC">

				<tr>
					<td>Please Enter the Trainee Id:<span style="color: red;">*</span></td>
					<td><form:input path="traineeId" /></td>
					<td style="color: red;"><form:errors path="traineeId"></form:errors></td>


					<table border="1" align="center">
						<tr>
							<th bgcolor="bisque">Trainee Id:</th>
							<th bgcolor="bisque">Trainee Name:</th>
							<th bgcolor="bisque">Trainee Location</th>
							<th bgcolor="bisque">Trainee Domain</th>
						</tr>
						<tr>
							<td><c:out value="${trainee1.traineeId}" /></td>
							<td><c:out value="${trainee1.traineeName}" /></td>
							<td><c:out value="${trainee1.traineeLocation}" /></td>
							<td><c:out value="${trainee1.traineeDomain}" /></td>
						</tr>
					</table>
					<table>



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
							<td><form:input path="traineeDomain" /></td>
							<!-- <td><select> 
					<option >Domain</option>
					<option >Jee</option>
					<option >Cloud</option>
					<option >Java</option>
					<option >SAP</option>
					</select></td> -->
							<td style="color: red;"><form:errors path="traineeDomain"></form:errors></td>

						</tr>


						<tr>
							<td>Trainee Location:<span style="color: red;">*</span></td>
							<td><form:input path="traineeLocation" /></td>
							<!-- <td><input type="radio" name="location">Chennai</td>
					<td><input type="radio" name="location">Bangalore</td>
					<td><input type="radio" name="location">Pune</td>
					<td><input type="radio" name="location">Mumbai</td> -->
							<td style="color: red;"><form:errors path="traineeLocation"></form:errors></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" name="submit"
								value="Update"></input></td>

						</tr>

					</table>
		</form:form>
		<%-- <table border="1" align="center">
			<tr>
				<th bgcolor="bisque">Trainee Id:</th>
				<th bgcolor="bisque">Trainee Name:</th>
				<th bgcolor="bisque">Trainee Location</th>
				<th bgcolor="bisque">Trainee Domain</th>
			</tr>
			<tr>
				<td><c:out value="" /></td>
				<td><c:out value="" /></td>
				<td><c:out value="" /></td>
				<td><c:out value="" /></td>
			</tr>
<tr>
				<td> <td><form:input path="traineeId" /></td>
				<td><td><form:input path="traineeName" /></td>
				<td><td><form:input path="traineeLocation" /></td>
				<td><td><form:input path="traineeDomain" /></td>
			</tr>
			<td colspan="5" align="center"><br> <a
				href="operations.obj">Back To Operations</a>
			</tr>
		</table> --%>
</body>
</html>