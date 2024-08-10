package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root@123");
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
				dbUser=statement.executeQuery("select*from students");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		return dbUser;
	}
	
	public ArrayList<Student> getStudents() {
		ResultSet dbUser =getAllUser();
		ArrayList<Student> students=new ArrayList<Student>();
		
		try {
			while(dbUser.next()) {
				students.add(new Student(dbUser.getInt(1),dbUser.getString(2) , dbUser.getDouble(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return students;
	}

	

}
