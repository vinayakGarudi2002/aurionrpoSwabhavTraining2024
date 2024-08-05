package com.aurionpro.iterative.test;

import java.util.Scanner;

public class CalculateSumDigitNumber {
	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		int sum=0;
		//System.out.println(number%10);
		
		while(number>0) {
			sum =sum+number%10;
			number=number/10;
		}
		
		System.out.println("sumbition is: "+sum);
	}

}
