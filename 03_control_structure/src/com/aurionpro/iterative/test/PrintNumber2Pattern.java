package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PrintNumber2Pattern {

	public static void main(String[] args) {

		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}
	
	
}
