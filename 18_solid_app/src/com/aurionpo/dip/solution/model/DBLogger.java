package com.aurionpo.dip.solution.model;

public class DBLogger implements ILogger {
	
	public void log(String err) {
		System.out.println("Logged to DataBase "+err);
	}

}
