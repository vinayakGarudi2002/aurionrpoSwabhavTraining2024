package com.aurionpro.test;

import java.util.Scanner;

public class MatrixOperation {

	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter how many rows? ");
	        int row = scanner.nextInt();
	        
	        System.out.println("Enter how many columns? ");
	        int column = scanner.nextInt();
	        
	        int matrix[][] = new int[row][column];
	        
	        System.out.println("Enter Matrix Elements:");
	        
	       
	       
	        createMatrix(matrix,scanner);
	     
	        
	        System.out.println("Matrix is:");
	        
	        printMatrix(matrix,scanner);
	       

}
	 public static void createMatrix(int matrix[][],Scanner scanner) {
		 
		 for (int i = 0; i < matrix[0].length; i++) {
	        	readRows(matrix,i,scanner);
	        }
		 
	 }
	 
	 
	 public static void readRows(int matrix[][],int row,Scanner scanner) {
		 int i=row;
		 for (int j = 0; j < matrix.length; j++) {
             System.out.print("Element [" + i + "][" + j + "]: ");
             matrix[i][j] = scanner.nextInt();
         }
	 }
	 
	 
	 public static void printMatrix(int matrix[][],Scanner scanner) {
		 for (int i = 0; i <  matrix[0].length; i++) {
			 printRows(matrix,i,scanner);
	            System.out.println();
	        }
		 
	 }
	 
	 public static void printRows(int matrix[][],int row,Scanner scanner) {
		 int i=row;
		 for (int j = 0; j < matrix.length; j++) {
             System.out.print(matrix[i][j] + " ");
         }
	 }
	 
}
