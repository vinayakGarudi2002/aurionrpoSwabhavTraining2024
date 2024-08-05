package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PrintNumber1Pattern {

	public static void main(String[] args) {

		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		int k=1;
		for(int i=1;i<=number;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println("");
		}

	}

}
