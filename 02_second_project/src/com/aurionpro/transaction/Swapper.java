package com.aurionpro.transaction;

import java.util.Scanner;

public class Swapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1=scanner.nextInt();
		System.out.println("Enter Second Number: ");
		int num2=scanner.nextInt();
		
		
			
		int temp=0;
		
		System.out.println("Before Swapping");
		System.out.println("number 1: "+num1+" number 2: "+num2);
	    System.out.println("After Swapping");	
	    temp=num1;
	    num1=num2;
	    num2=temp;
	    System.out.println("number 1: "+num1+" number 2: "+num2);
    
	}

}
