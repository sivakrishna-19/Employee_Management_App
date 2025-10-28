package com.flm.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.flm.User;
import com.flm.dao.UserDao;
import com.flm.util.Constant;
import com.flm.util.Operations;

@WebServlet("/signupservlet")
public class Signupservlet extends HttpServlet {
	
    public Signupservlet() {
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		String ConfirmPassword = request.getParameter("confirm-password");
		if(Password!=ConfirmPassword) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Signup.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			User user = new User(Username , Password);       //passing values to user pojo class
			UserDao userdao = new UserDao();
			try {
				userdao.Insert_user(user);                   //calling insert method from userDao and passing user object
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
				requestDispatcher.forward(request, response);
			
		}
		
			
			
		
	}

}
