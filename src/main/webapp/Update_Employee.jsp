<%@ page import="com.flm.dao.* , com.flm.*" language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
int emp_id = Integer.parseInt(request.getParameter("id"));
EmployeeDao emp_dao = new EmployeeDao();
Employee emp = emp_dao.chooseEmployees(emp_id);

%>
<form action="UpdateServlet" method="post">

ID : <input type="hidden" name="id" value=<%= emp_id %>>
NAME        : <input type="text" name="emp_name" value=<%=emp.getEmp_name() %>> <br><br>
AGE         : <input type="number" name="emp_age" value=<%=emp.getAge() %>><br><br>
EMAIL       : <input type="text" name="emp_mail" value=<%=emp.getEmail() %>><br><br>

PHONE NUMBER: <input type="text" name="emp_phoneno" value=<%=emp.getPhoneno() %>><br><br>
SALARY      : <input type="number" name="emp_salary" value=<%=emp.getSalary() %>><br><br>
<input type="submit" name="update">

</form>

</body>
</html>