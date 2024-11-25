package com.cdac.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection connection;
	
	public static void openConnection() throws SQLException {
		String dburl = "jdbc:mysql://localhost:3306/test";
		String userName = "root";
		String password = "student";
		
		connection = DriverManager.getConnection(dburl,userName,password);
		System.out.println("DB Connection Created");
	}
	public static void closeConnection() throws SQLException {
		connection.close();
		System.out.println("Connection with DB Closed");
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
