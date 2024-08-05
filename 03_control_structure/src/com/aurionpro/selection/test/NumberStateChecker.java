package com.aurionpro.selection.test;

import java.util.Scanner;

public class NumberStateChecker {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int number=scanner.nextInt();
		
		if(number<0) {
			System.out.println("Number is Negative");
		}else {
			System.out.println("Number is Positive");
		}

	}

}
