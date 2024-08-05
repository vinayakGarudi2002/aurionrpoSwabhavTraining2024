package com.aurionpro.test;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = scanner.nextInt();
		
		int factorial=calculateFactorial(number);
		
		if(factorial==-1) {
			System.out.println("can not calculate fcatorial of: "+number);
			return;
		}
		
		System.out.println("Fcatorial is "+factorial);

	}

	private static int calculateFactorial(int number) {
		
		if(number==0) {
			return 1;
		}
		
		if(number<0) {
			return -1;
		}
		
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact*=i;
		}
		return fact;
	}

}
