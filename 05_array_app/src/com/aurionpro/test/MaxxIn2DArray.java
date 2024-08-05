package com.aurionpro.test;

import java.util.Scanner;

public class MaxxIn2DArray {


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
        
        int maxElement=matrix[0][0];
       
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
            	if(maxElement<matrix[i][j]) {
            		maxElement=matrix[i][j];
            	}
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        
        System.out.println("Max Element in Matrix is: "+maxElement);
    }

}
