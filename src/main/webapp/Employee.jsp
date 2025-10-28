   <%@ page import="java.util.* , com.flm.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Verifier</title>
</head>
<body>
<h1>Directed to employee details</h1>

<a href="AddEmployee.jsp">ADD NEW EMPLOYEE</a><br><br>
<table border=1>
<tr>
	<th>Employee ID</th>
	<th>Employee Name</th>
	<th>Employee Age</th>
	<th>Employee mail</th>
	<th>Phone number</th>
	<th>Employee Salary</th>
	<th>Delete employee</th>
	<th>Update Employee</th>
</tr>

<%  ArrayList<Employee> emp_list = (ArrayList<Employee>) request.getAttribute("emp_list"); 
	for(Employee emp : emp_list){
%>		
	<tr>
	<td> <%= emp.getEmp_id() %></td>
	<td> <%= emp.getEmp_name() %></td>
	<td> <%= emp.getAge() %></td>
	<td> <%= emp.getEmail() %></td>
	<td> <%= emp.getPhoneno() %></td>
	<td> <%= emp.getSalary() %></td>
	<td> <a href="delete_employee?id=<%= emp.getEmp_id() %>">Delete emp</a></td>
	<td> <a href ="Update_Employee.jsp?id=<%= emp.getEmp_id() %>">Update emp</a></td>
	</tr>
	
	
	
<% } %>




</table>

</body>
</html>