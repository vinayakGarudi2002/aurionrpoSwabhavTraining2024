package com.aurionpro.selection.test;

import java.util.Scanner;

public class MaxOfTwoNumber {
	
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number1: ");
		int number1=scanner.nextInt();
		
        System.out.println("Enter a number2: ");
		int number2=scanner.nextInt();
		
		if(number2>number1) {
			System.out.println("Number1 is Greater "+number2);
		}else {
			System.out.println("Number2 is Greater "+number1);
		}
		
		if(number1==number2) {
			System.out.println("Both Same");
		}

	}

}
