package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		
		
		
		int i=2;
		while(i<number) {
			
			if(number%i==0) {
				System.out.println("Not Prime");
				return;
				//break;
			}
			i++;
		}
		
		
		System.out.println("It is Prime");	
	}

}
