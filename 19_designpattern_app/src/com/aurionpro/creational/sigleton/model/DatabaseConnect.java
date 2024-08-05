package com.aurionpro.creational.sigleton.model;

public class DatabaseConnect {

private static DatabaseConnect dbConnect;
	
	
	private DatabaseConnect() {
		System.out.println("DatabaseConnect connected");
	}
	
	public static DatabaseConnect getDatabaseConnectReference() {
		if(dbConnect==null) {
			dbConnect=new DatabaseConnect();
		}
		
		return dbConnect;
	}
	
	public void status() {
		System.out.println("Comunicating with databases");
	}
	
	
}
