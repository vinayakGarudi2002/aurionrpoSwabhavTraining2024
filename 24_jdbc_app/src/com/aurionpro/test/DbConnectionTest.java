package com.aurionpro.test;

import com.aurionpro.model.DbConnection;

public class DbConnectionTest {
	
	public static void main(String[] args) {
		DbConnection connect = new DbConnection();
		connect.connectToDb();
		connect.getStudentsDetail();
//		connect.addStudent();
//		connect.getStudentsDetail();
		connect.updateStudent();
		connect.getStudentsDetail();
	}

}
