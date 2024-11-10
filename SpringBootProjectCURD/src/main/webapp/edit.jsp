<%@page import="com.example.demo.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<h3>Edit Student Details</h3>
${stud}

<% Student student = (Student)request.getAttribute("stud");%>

<form action="update"><br><br>
<input type="hidden" name="id" value="<%=student.getId()%>"><br><br>
Student Name   :<input type="text" name="name" value="<%=student.getName()%>"><br><br>
 Address       :<input type="text" name="address" value="<%=student.getAddress()%>"><br><br>
User Name      :<input type="text" name="uname" value="<%=student.getUname()%>"><br><br>
Password       :<input type="password" name="pass" value="<%=student.getPass()%>"><br><br>
<input type="submit" value="update">

</form>

</body>
</html>