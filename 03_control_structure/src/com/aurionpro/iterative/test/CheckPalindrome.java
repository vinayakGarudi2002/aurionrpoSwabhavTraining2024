package com.aurionpro.iterative.test;

import java.util.Scanner;

public class CheckPalindrome {

	
	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		int reverse=0;
		int temp=number;
		//System.out.println(number%10);
		while(number>0) {
			reverse =reverse*10+number%10;
			number=number/10;
		}
		
		
		if(temp==reverse) {
			System.out.println("Number is Palindrome: "+temp);
		}else {
			System.out.println("Number is Not Palindrome: "+temp);
		}
		
		
	}

	
}
