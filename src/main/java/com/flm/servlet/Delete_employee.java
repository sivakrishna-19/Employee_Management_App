package com.flm.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.flm.dao.EmployeeDao;


@WebServlet("/delete_employee")
public class Delete_employee extends HttpServlet {
       
  
    public Delete_employee() {
        super();
        
    }

    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int emp_id = Integer.parseInt(request.getParameter("id"));
		EmployeeDao empdao = new EmployeeDao();
		
		empdao.deleteEmployee(emp_id);
		
		response.sendRedirect("EmployeeServlet");   //it is used to redirect to a servlet by changing the entire url. Data wont be forwarded using this method. It will always look for a doget method at the destination servlet
	}

}
