package com.flm.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.flm.Employee;
import com.flm.dao.EmployeeDao;


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
    public UpdateServlet() {
        super();
        
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int emp_id = Integer.parseInt(request.getParameter("id"));
		String emp_name = request.getParameter("emp_name");
		int emp_age = Integer.parseInt(request.getParameter("emp_age"));
		String emp_mail = request.getParameter("emp_mail");
		
		String emp_mobile = request.getParameter("emp_phoneno");
		int emp_salary = Integer.parseInt(request.getParameter("emp_salary"));
		
		Employee emp = new Employee(emp_id,emp_name,emp_age,emp_mail,emp_mobile,emp_salary);
		EmployeeDao empdao = new EmployeeDao();
		try {
			empdao.updateEmployee(emp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("EmployeeServlet");
		
		
	}

}
