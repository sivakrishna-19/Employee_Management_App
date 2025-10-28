package com.flm.util;

public class Constant {
	

	public static final String url = "jdbc:mysql://localhost:3306/emp_management";
	public static final String user ="root";
	public static final String password="siva2004";
	public static final String insert = "insert into users(username,password) values(?,?)";
	public static final String select = "select * from users where username=?";
	public static final String emp_select = "select * from employees";
	public static final String emp_choose = "select * from employees where emp_id=?";
	public static final String emp_update = "update employees set emp_name=?,age=?,email=?,phoneno=?,salary=? where emp_id=?" ;
	public static final String emp_insert = "insert into employees(emp_id,emp_name,age,email,phoneno,salary) values(?,?,?,?,?,?)";
	public static final String emp_delete = "delete from employees where emp_id=?";
}
