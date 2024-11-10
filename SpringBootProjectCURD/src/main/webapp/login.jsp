<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1 style="color:red;">Login Page</h1>
<%String str=(String)request.getAttribute("msg"); %>
<%if(str != null){ %>
 <span style="color:red;"><%out.print(str); %></span>
 <%} %>
<form action="log">
Username:<input type="text" name="uname"><br><br>
Password:<input type="password" name="pass"><br><br>
<input type="submit" value="login">&nbsp;&nbsp;&nbsp;&nbsp;

<a href="index.jsp">back to index page</a>


</form>

</body>
</html>