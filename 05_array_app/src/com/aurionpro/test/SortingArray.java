package com.aurionpro.test;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter size of array: ");
			int size = scanner.nextInt();
			
			int array[] = new int[size];
			
			System.out.println("Enter Values of Array: ");
			for(int i=0;i<size;i++) {
				array[i]=scanner.nextInt();
			}
			
			//Arrays.sort(array);   
			
			int key;
	
			
			for(int i=1;i<size;i++) {
				key=array[i];
				int j =i-1;
				while(key<array[j]) {
					array[j+1]=array[j];
					j--;
					if(j<=-1) {
						break;
					}
				}
				array[j+1]=key;
				
			}
			
			
			
			System.out.println("Sorted Array: ");
			for(int i=0;i<size;i++) {
				System.out.println(array[i]);
			}
		    
			scanner.close();

	}

}
