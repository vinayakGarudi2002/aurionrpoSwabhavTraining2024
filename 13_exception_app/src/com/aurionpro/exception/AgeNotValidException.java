package com.aurionpro.exception;

public class AgeNotValidException extends RuntimeException {
	
	private int age;
	
	
	
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}




	public String ageNotValidException() {
	  return "Age need to be greater than 18 "+"Entered value: "+age;
	}

}
