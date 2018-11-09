<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>



<table border=1><tr>
<form:form action="showRegistration.obj" method="post" >

		<tr><td><input type="submit" name="regist" value="Registration"/><br/>	<br/></td></tr>
		    
         </form:form></tr><tr>
       <form:form action="showViewAllRegistrations.obj" method="post" >

		     <tr><td><input type="submit" value="view"/><br/><br/></td></tr>
               
          </form:form></tr>
   </table>
</body>

</html>