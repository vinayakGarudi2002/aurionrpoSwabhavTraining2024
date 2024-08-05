package com.aurionpro.creational.sigleton.test;

import com.aurionpro.creational.sigleton.model.DatabaseConnect;


public class DatabaseConnectTest {

	public static void main(String[] args) {
	
		DatabaseConnect db=DatabaseConnect.getDatabaseConnectReference();
		db.status();
		
	
		
		DatabaseConnect db1=DatabaseConnect.getDatabaseConnectReference();
		db1.status();

	}

}
