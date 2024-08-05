package com.aurionpro.test;

import java.util.Scanner;

public class CheckElementExist2DArray {

	   public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter how many rows? ");
	        int row = scanner.nextInt();
	        
	        System.out.println("Enter how many columns? ");
	        int column = scanner.nextInt();
	        
	       
	        int matrix[][] = new int[row][column];
	        
	        System.out.println("Enter Matrix Elements:");
	        
	       
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	        
	     
	        
	        System.out.println("Matrix is:");
	        
	       
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        System.out.println("Enter Element to Search in Matrix: ");
	        int element = scanner.nextInt();
	        
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                //System.out.print(matrix[i][j] + " ");
	            	if(matrix[i][j]==element) {
	            		System.out.println("Elemet exist in 2d array");
	            		return;
	            	}
	            }
	            System.out.println();
	        }
	        
	        System.out.println("Element does not 2d exist in array");
	        
	    }
	
}
