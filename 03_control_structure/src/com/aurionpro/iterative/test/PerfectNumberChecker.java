package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PerfectNumberChecker {

	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		
		
		int sumOfFactor=0;
		int i=1;
		while(i<=number/2) {
			
			if(number%i==0) {
				sumOfFactor=sumOfFactor+i;
			}
			i++;
		}
		//System.out.println(sumOfFactor);
		if(sumOfFactor==number) {
			System.out.println("It is Perfect");
		}else {
			System.out.println("It is Not Perfect");
		}
	}
	
	
}
