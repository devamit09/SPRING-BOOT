<%@page import="com.example.demo.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title >Employee Details</title>
</head>
<body style="background-color:powderblue;">
<script type="text/javascript">

  function deleteEmployee(){
	  alert("Do you want to delete !!")
	  
	  document.mypage.action="del";
	  document.mypage.submit();
  }
  function editEmployee(){
	  alert("Do you want to edit !!")
	  
	  
	  document.mypage.action="edit";
	  document.mypage.submit();
  }


</script>
<body>
	<h1 style="color:red;">Employee Information</h1>

	<%
		List<Employee> elist = (List) request.getAttribute("list");
	%>

   <form name="mypage">
	<table border="5">
		<thead >
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

		<tbody style="background-color:pink;text-align:center;">
			<tr>
				<%
					for(Employee e: elist){
				%>
				
				<td><input type="radio" name="id" value="<%=e.getId()%>"></td>
				<td><%=e.getId() %></td>
				<td><%=e.getName()%></td>
				<td><%=e.getAddress()%></td>
				<td><%=e.getUname()%></td>
				<td><%=e.getPass()%></td>
				<td><input type="submit" value="edit" onclick="editEmployee()"></td>
				<td><input type="submit" value="delete" onclick="deleteEmployee()"></td>

			</tr>
			<% 
			  } 
			
			%>

		</tbody>


	</table>
	</form>

</body>
</html>