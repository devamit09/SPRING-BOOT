<%@page import="com.example.demo.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body style="background-color:powderblue;">
<h3>Edit Student Details</h3>
${emp}

<%
	Employee e = (Employee)request.getAttribute("emp");
%>

<form action="update"><br><br>
<input type="hidden" name="id" value="<%=e.getId()%>"><br><br>
Student Name   :<input type="text" name="name" value="<%=e.getName()%>"><br><br>
 Address       :<input type="text" name="address" value="<%=e.getAddress()%>"><br><br>
User Name      :<input type="text" name="uname" value="<%=e.getUname()%>"><br><br>
Password       :<input type="password" name="pass" value="<%=e.getPass()%>"><br><br>
<input type="submit" value="update">

</body>
</html>