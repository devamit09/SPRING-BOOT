<%@page import="com.example.demo.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<script type="text/javascript">

  function deleteStudent(){
	  alert("Do you want to delete !!")
	  
	  document.mypage.action="del";
	  document.mypage.submit();
  }
  function editStudent(){
	  alert("Do you want to edit !!")
	  
	  
	  document.mypage.action="edit";
	  document.mypage.submit();
  }


</script>
<body>
	<h1>Student Information</h1>

	<%
		List<Student> slist = (List) request.getAttribute("list");
	%>

   <form name="mypage">
	<table border="5">
		<thead>
			<tr style="background-color:gold;">

				<th>Select</th>
				<th>Id</th>
				<th>Name</th>
				<th>Address</th>
				<th>Username</th>
				<th>Password</th>
				<th>Edit</th>
				<th>Delete</th>

			</tr>

		</thead>

		<tbody style="background-color:powderblue;">
			<tr>
				<%for(Student student: slist){ %>
				
				<td><input type="radio" name="id" value="<%=student.getId()%>"></td>
				<td><%=student.getId() %></td>
				<td><%=student.getName()%></td>
				<td><%=student.getAddress()%></td>
				<td><%=student.getUname()%></td>
				<td><%=student.getPass()%></td>
				<td><input type="submit" value="edit" onclick="editStudent()"></td>
				<td><input type="submit" value="delete" onclick="deleteStudent()"></td>

			</tr>
			<% 
			  } 
			
			%>

		</tbody>


	</table>
	</form>
</html>