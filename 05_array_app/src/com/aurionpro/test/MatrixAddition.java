package com.aurionpro.test;

import java.util.Scanner;

public class MatrixAddition {

    private static int[][] readMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many rows? ");
        int row = scanner.nextInt();

        System.out.println("Enter how many columns? ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

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

        return matrix;
    }

    private static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int column = matrix1[0].length;

        int[][] result = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    private static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        System.out.println("Addition of Matrix is:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Read first matrix:");
        int[][] matrix1 = readMatrix();

        System.out.println("Read second matrix:");
        int[][] matrix2 = readMatrix();

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices cannot be added, dimensions  not match.");
            return;
        }

        int[][] result = addMatrix(matrix1, matrix2);

        printMatrix(result);
    }
}
