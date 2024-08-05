package com.aurionpro.selection.test;

import java.util.Scanner;

public class MaxOfThreeNumber {

	public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number1: ");
		int number1=scanner.nextInt();
		
        System.out.println("Enter a number2: ");
		int number2=scanner.nextInt();
		
		System.out.println("Enter a number3: ");
		int number3=scanner.nextInt();
		
		if(number2<number1) {    // can also use and operator
			if(number1>number3) {
				System.out.println("Number1 is Greater "+number1);
			}
			
		}else if(number2>number3) {
			System.out.println("Number2 is Greater "+number2);
		}else {
			System.out.println("Number3 is Greater "+number3);	
		}
		
		
		
		
		
	}

}
