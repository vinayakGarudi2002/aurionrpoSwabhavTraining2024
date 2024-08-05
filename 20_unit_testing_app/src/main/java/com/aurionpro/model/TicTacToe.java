package com.aurionpro.model;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board;
    private static int size;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the matrix
        System.out.println("Enter the size of the Tic Tac Toe board (minimum 3): ");
        size = scanner.nextInt();
        if (size < 3) {
            System.out.println("Minimum size is 3. Setting size to 3.");
            size = 3;
        }

        // Initialize the board
        char[][] board = new char[size][size];
        initializeBoard();

        // Start the game loop
        boolean gameWon = false;
        boolean playerXTurn = true;
        int totalMoves = 0;

        while (!gameWon && totalMoves < size * size) {
            printBoard();
            if (playerXTurn) {
                System.out.println("Player X's turn:");
            } else {
                System.out.println("Player O's turn:");
            }

            int row, col;
            while (true) {
                System.out.println("Enter row and column (1-" + size + "): ");
                row = scanner.nextInt()-1;
                col = scanner.nextInt()-1;
                if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == '-') {
                    board[row][col] = playerXTurn ? 'X' : 'O';
                    break;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }

            // Check for a win
            gameWon = checkWin(row, col);
            if (gameWon) {
                printBoard();
                System.out.println("Player " + (playerXTurn ? 'X' : 'O') + " wins!");
            } else if (++totalMoves == size * size) {
                printBoard();
                System.out.println("It's a draw!");
            }

            // Switch turn
            playerXTurn = !playerXTurn;
        }

        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkWin(int row, int col) {
        // Horizontal check
        if (checkHorizontal(row)) return true;

        // Vertical check
        if (checkVertical(col)) return true;

        // Diagonal checks
        if (checkDiagonal()) return true;

        return false;
    }

    private static boolean checkHorizontal(int row) {
        char player = board[row][0];
        for (int i = 1; i < size; i++) {
            if (board[row][i] != player) return false;
        }
        return player != '-';
    }

    private static boolean checkVertical(int col) {
        char player = board[0][col];
        for (int i = 1; i < size; i++) {
            if (board[i][col] != player) return false;
        }
        return player != '-';
    }

    private static boolean checkDiagonal() {
        char player = board[0][0];
        boolean win = true;
        for (int i = 1; i < size; i++) {
            if (board[i][i] != player) {
                win = false;
                break;
            }
        }
        if (win && player != '-') return true;

        player = board[0][size - 1];
        win = true;
        for (int i = 1; i < size; i++) {
            if (board[i][size - 1 - i] != player) {
                win = false;
                break;
            }
        }
        return win && player != '-';
    }
}
