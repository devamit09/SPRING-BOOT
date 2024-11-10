<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body style="background-color:powderblue;">
<h1 style="color:red;text-align:center;">Register Page</h1>
<form action="reg">
    <input type="hidden" value="0" name="id"><br><br>
    NAME     :<input type="text" name="name"><br><br>
    ADDRESS  :<input type="text" name="address"><br><br>
    USERNAME :<input type="text" name="uname"><br><br>
    PASSWORD :<input type="text" name="pass"><br><br>
    <input type="submit" value="register"><br><br>
    
    <a href="index.jsp">back to index page</a>&nbsp;&nbsp;&nbsp;

</form>

</body>
</html>