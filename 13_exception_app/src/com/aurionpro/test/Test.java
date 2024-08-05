package com.aurionpro.test;

public class Test {

	public static void main(String[] args) {
		
		try {
		
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		
	
		double result = number1/number2;
		
		System.out.println("result: "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid input for number 2");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Need two inputs");
		}catch(NumberFormatException e) {
			System.out.println("Enter Numberical Values");
		}catch(Exception e) {
			System.out.println("New Exception: "+e );
		}finally {
			System.out.println("I am finally");
		}
		
		System.out.println("I am still running");
		
		


	}

}
