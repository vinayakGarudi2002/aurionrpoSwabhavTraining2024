package com.aurionpro.test;

import java.util.Scanner;

public class InputValidator {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		String name=getName(scanner);
		String password=getPassword(scanner);
		String email=getEmail(scanner);
		
	System.out.println(name);

	}

	private static String getPassword(Scanner scanner) {
		
		
		
		return null;
	}

	private static String getName(Scanner scanner) {
		
		Boolean status=false;
		
		while(!status) {
			System.out.println("Enter Name: ");
			String name="";
			name=scanner.nextLine();
			status=basicValidator(scanner,3,20,name);
			if(status) {
				return name;
			}
			
		}
	
		return null;
	}

	private static String getEmail(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static Boolean basicValidator(Scanner scanner,int startIndex,int endIndex,String content) {
		
		
			String name=content;
			if(((name!=null && name.length()<=endIndex)&&(name.length()>=startIndex && name!=""))) {
				return true;
			}
			
			if(name==null) {
				System.out.println("name should not be null");
				return false;
			}else if(name.length()>endIndex) {
				System.out.println("name should not be gretater than 20 char");
				return false;
			}else if(name.length()<startIndex) {
				System.out.println("name should not be less than 3 char");
				return false;
			}
			
			System.out.println("name should not be empty");
		
		
		return false;
	}

}
