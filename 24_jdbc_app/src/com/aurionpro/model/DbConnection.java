package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {
	
	private Connection connection=null;
	private Statement statement=null;
	PreparedStatement preparedStatement=null;

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
	
	public void getStudentsDetail() {
		try {
			ResultSet studentData = statement.executeQuery("Select * From students");
			while(studentData.next()) {
				System.out.println(studentData.getInt(1)+" "+studentData.getString(2)+" "+studentData.getDouble(3));
			}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addStudent() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eneter Roll Number");
		int rollNumber=scanner.nextInt();
		
		System.out.println("Enter Name: ");
		String name=scanner.next();
		
		System.out.println("Enetr Percentage: ");
		double percentage=scanner.nextDouble();
		
		
		try {
//			statement.executeUpdate("insert into students values("+rollNumber+",'"+name+"',"+percentage+ ")");
			
			 preparedStatement = connection.prepareStatement("insert into students values(?,?,? )");
			preparedStatement.setInt(1, rollNumber);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, percentage);
			preparedStatement.execute();
			
			
			System.out.println("Record inserted succesfully");
		}catch(SQLIntegrityConstraintViolationException e) {
			System.err.println("Enter Valid values");
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateStudent() {
		
         Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eneter Roll Number of student to update");
		int rollNumber=scanner.nextInt();
		
		
		
		System.out.println("Enetr Percentage: ");
		double percentage=scanner.nextDouble();
		
		
		try {
			//statement.executeUpdate("update students set(percentage="+percentage+");
			
			 String sql = "UPDATE students SET percentage = (?) WHERE roolNumber = (?)";
			 
			 preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setDouble(1, percentage);
				preparedStatement.setInt(2, rollNumber);
				preparedStatement.executeUpdate();
				
				
			System.out.println("Record inserted succesfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
