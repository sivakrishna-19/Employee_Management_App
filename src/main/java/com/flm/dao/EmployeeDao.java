package com.flm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.flm.Employee;
import com.flm.util.Constant;
import com.flm.util.Operations;

public class EmployeeDao {
	
	public ArrayList<Employee> getEmployees() throws ClassNotFoundException, SQLException {
		Connection connection = Operations.getConnection();
		PreparedStatement statement = connection.prepareStatement(Constant.emp_select);
		ResultSet resultset = statement.executeQuery();
		
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		while(resultset.next()) {
			int emp_id = resultset.getInt(1);
			String emp_name = resultset.getString(2);
			int age = resultset.getInt(3);
			String email = resultset.getString(4);
			String phoneno = resultset.getString(5);
			int salary = resultset.getInt(6);
			
			Employee emp = new Employee(emp_id,emp_name,age,email,phoneno,salary);   //there will be n no.of rows in employee table, each time emp object will be updated
			employees.add(emp);                     //inorder to select all the rows , add them to a list 
		}
		return employees;
	}
	
	
	
	public void addEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		Connection connection = Operations.getConnection();
		PreparedStatement statement = connection.prepareStatement(Constant.emp_insert);
		statement.setInt(1, emp.getEmp_id());
		statement.setString(2, emp.getEmp_name());
		statement.setInt(3, emp.getAge());
		statement.setString(4, emp.getEmail());
		statement.setString(5, emp.getPhoneno());
		statement.setInt(6, emp.getSalary());
		
		statement.executeUpdate();
		
	}
	
	
	
	
	public void deleteEmployee(int emp_id) {
		try {
			Connection connection = Operations.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constant.emp_delete);
			statement.setInt(1,emp_id);
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			
		}
		
	}
	
	
	
	public Employee chooseEmployees(int emp_id) throws ClassNotFoundException, SQLException {
		Employee emp = null;
		Connection connection = Operations.getConnection();
		PreparedStatement statement = connection.prepareStatement(Constant.emp_choose);
		statement.setInt(1, emp_id);
		ResultSet resultset = statement.executeQuery();
		while(resultset.next()) {
			
			String emp_name = resultset.getString(2);
			int age = resultset.getInt(3);
			String email = resultset.getString(4);
			String phoneno = resultset.getString(5);
			int salary = resultset.getInt(6);
			
			emp = new Employee(emp_id,emp_name,age,email,phoneno,salary);   //there will be n no.of rows in employee table, each time emp object will be updated

		}
		return emp;
	}
	
	
	
	public void updateEmployee(Employee employ) throws ClassNotFoundException, SQLException {
		Connection connection = Operations.getConnection();
		PreparedStatement statement = connection.prepareStatement(Constant.emp_update);
		
		statement.setString(1, employ.getEmp_name());
		statement.setInt(2, employ.getAge());
		statement.setString(3, employ.getEmail());
		statement.setString(4, employ.getPhoneno());
		statement.setInt(5, employ.getSalary());
		statement.setInt(6, employ.getEmp_id()) ;
		
		
		statement.executeUpdate();
	
	}
	
	
}
