package com.aurionpro.iterative.test;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		int fact=1;
		
		for(int i=1;i<=number;i++) {
			fact=fact*i;
			//System.out.println(i);
		}
		System.out.println("Factorial of a Number "+" is "+fact);
	}

}
