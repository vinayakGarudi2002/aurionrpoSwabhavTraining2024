package com.aurionpo.dip.solution.model;

public class FileLogger implements ILogger {

	@Override
	public void log(String err) {
		System.out.println("Log to file: "+err);
		
	}

}
