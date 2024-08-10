package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	
	private Connection connection;
	private Statement statement;

	private static DbUtil dbutil;

	private DbUtil() {
		
	}

	public static DbUtil DbUtilObject() {
	if(dbutil==null) {
		dbutil=new DbUtil();
	}
	
	return new DbUtil();
	}

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root@123");
			System.out.println("Connected succesfully");
			statement = connection.createStatement();
			
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public ResultSet getAllUser() {
		ResultSet dbUser =null;
		
		
			try {
				dbUser=statement.executeQuery("select*from users");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		return dbUser;
	}
	
	public boolean validateUser(String name,String password) {
		ResultSet dbUser =getAllUser();
		
		try {
			while(dbUser.next()) {
				System.out.println(dbUser.getString(1));
				System.out.println(dbUser.getString(2));
				if(dbUser.getString(1).equals(name) && dbUser.getString(2).equals(password)) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	

}
