package com.aurionpro.model;

public class Operations {
	
	int addition(int number1,int number2) {
		return number1+number2;
	}
	
	int subration(int number1,int number2) {
		return number1-number2;
	}
	
	int multiplication(int number1,int number2) {
		return number1*number2;
	}
	
	double devision(int number1,int number2) {
		if(number2==0) {
			throw new ArithmeticException();
		}
		return number1/number2;
		
	}

}
