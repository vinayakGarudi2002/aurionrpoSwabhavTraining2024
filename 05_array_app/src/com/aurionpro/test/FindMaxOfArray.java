package com.aurionpro.test;

import java.util.Scanner;

public class FindMaxOfArray {

	public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter Values of Array: ");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		
		int maxElement=array[0];
		for(int i=1;i<size;i++) {
			if(maxElement<array[i]) {
				maxElement=array[i];
			}
		}
	
		System.out.println("Maximum Elemnet of Array is: "+maxElement);

	}

}
