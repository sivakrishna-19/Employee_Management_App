package com.flm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flm.User;
import com.flm.util.Constant;
import com.flm.util.Operations;

public class UserDao {
	
	public void Insert_user(User user) throws SQLException, ClassNotFoundException {     //collecting the user object and connecting to the database using getConnection method and passing client entered details to database
		
		Connection connection = Operations.getConnection();
		PreparedStatement statement = connection.prepareStatement(Constant.insert);
		statement.setString(1,user.getUsername());
		statement.setString(2,user.getPassword());
		statement.executeUpdate();
	}
	
	public boolean validateUser(User user) throws ClassNotFoundException, SQLException {
		Connection connection = Operations.getConnection();
		PreparedStatement statement = connection.prepareStatement(Constant.select);
		statement.setString(1, user.getUsername());
		ResultSet resultSet = statement.executeQuery();
		String Username = null;
		String Password = null;
		while(resultSet.next()) {
			 Username = resultSet.getString(1);
			 Password = resultSet.getString(2);
			}
		return(user.getUsername().equals(Username) && user.getPassword().equals(Password));
	}
	
	

}
