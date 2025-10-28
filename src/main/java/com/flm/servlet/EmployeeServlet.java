package com.flm.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.flm.Employee;
import com.flm.dao.EmployeeDao;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
    public EmployeeServlet() {
        super();
        
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request,response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeDao empdao = new EmployeeDao();
		try {
			
			ArrayList<Employee> employees = empdao.getEmployees();
			request.setAttribute( "emp_list" , employees);
			   
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Employee.jsp");
			requestDispatcher.forward(request, response);
			
			  
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
