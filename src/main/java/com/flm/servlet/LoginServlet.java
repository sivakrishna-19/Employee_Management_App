package com.flm.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.flm.User;
import com.flm.dao.UserDao;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		User user = new User(Username,Password);
		UserDao userdao = new UserDao();
		boolean isValid = false;
		try {
			isValid = userdao.validateUser(user);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(isValid) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("EmployeeServlet");
			requestDispatcher.forward(request, response);
		}
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.forward(request, response);
		}
			
	}

}
