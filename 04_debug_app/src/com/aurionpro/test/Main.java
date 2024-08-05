package com.aurionpro.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter two number: ");
//		double number1=(int)scanner.nextInt();
//		int number2=scanner.nextInt();
//		
//		int result = sum((int)number1,number2);
//		
//		System.out.println("adition of two number "+result);
//		
//		System.out.println("subract of two number "+subract((int)number1,number2));
//		
//		System.out.println("multiply of two number "+multiply((int)number1,number2));
//		
//		System.out.println("divide of two number "+divide((int)number1,number2));
//		
//		System.out.println((char)9);
		
		byte num1 =19;
		byte num2=(byte)(num1+12);
		short num3=(short) (num1+num2);
		int res = num1+num2;
		Integer objnum1=(int) num1; // wrapper class  use to represent built in data type as object ( Autoboxing)
		System.out.println(objnum1+" i am obj");
		int num=objnum1;    // (un boxing)
		
		System.out.println(res);
		
		
		
		
	}
	
              private static int sum(int num1,int num2) {
            	  return num1+num2;
              }
              
              
              private static int subract(int num1,int num2) {
            	  return num1-num2;
              }
              
              private static int multiply(int num1,int num2) {
            	  return num1*num2;
              }
              
              private static int divide(int num1,int num2) {
            	  if(num2==0) {
            		  return 1;
            	  }
            	  return num1/num2;
              }
              
              
	

}
