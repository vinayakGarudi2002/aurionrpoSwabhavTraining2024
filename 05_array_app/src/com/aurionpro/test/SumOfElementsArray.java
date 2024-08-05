package com.aurionpro.test;

import java.util.Scanner;

public class SumOfElementsArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter Values of Array: ");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		
		int sumOfArray=0;
		for(int i=0;i<size;i++) {
			sumOfArray+=array[i];
		}
		
		System.out.println("Sum of Array is: "+sumOfArray);
		
	}

}
