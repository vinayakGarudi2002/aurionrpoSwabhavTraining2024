package com.aurionpro.model;

public class Board {
    private int size;
    private char[][] board;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
    }

    public void initialize() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean updateBoard(int row, int col, char symbol) {
        if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == '-') {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public char getCell(int row, int col) {
        return board[row][col];
    }

    public int getSize() {
        return size;
    }
}