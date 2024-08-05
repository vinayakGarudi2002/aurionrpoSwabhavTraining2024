package com.aurionpro.test;

import java.util.Scanner;

public class CheckElementExistsArray {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter size of array: ");
			int size = scanner.nextInt();
			
			int array[] = new int[size];
			
			System.out.println("Enter Values of Array: ");
			for(int i=0;i<size;i++) {
				array[i]=scanner.nextInt();
			}
			
			System.out.println("Enter Element to find in Array: ");
			int element = scanner.nextInt();
			
			for(int i=0;i<size;i++) {
				if(element==array[i]) {
					System.out.println("Element Exits in Array");
					return;
				}
			}
			
			
			System.out.println("Element Not Exits in Array");
	}
}
