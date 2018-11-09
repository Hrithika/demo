<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trainee Management System</title>
<style>
a {
	font-family: Times New Roman;
	font-size: 14pt;
	font-style: normal;
	text-decoration: initial;
	margin-left: 15px;
	margin-right: 15px;
}

div {
	height: 32px;
	text-align: center;
	padding: 5px;
	background: url('JSP/menu.jpg');
	border-top: 1px solid black;
}

p {
	height: 70px;
	text-align: center;
	padding: 5px;
	background: url('JSP/background.jpg');
	border-top: 1px solid black;
}
</style>
</head>
<body>


<table border=1>
<tr><th><b>Pick Your Option</b></th></tr>
<tr><td><a href="addTraineeForms.obj">Add a Trainee</a></td></tr>
<tr><td><a href="deleteTraineeForms.obj">Delete a Trainee</a></td></tr>
<tr><td><a href="modifyTraineeForms.obj">Modify a Trainee</a></td></tr>
<tr><td><a href="retrieveTraineeForms.obj">Retrieve a Trainee Details</a></td></tr>
<tr><td><a href="retrieveallTraineesForms.obj">Retrieve All Trainee Details</a></td></tr>
</table>



</body>
</html>