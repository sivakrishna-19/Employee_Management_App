package com.flm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Operations {
	
	public static Connection connection = null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		if(connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(Constant.url,Constant.user, Constant.password);
		}
		return connection;
	}

}
