package com.aurionpro.model;

public class WinningStatus {
    public boolean checkWin(Board board, int row, int col) {
        return checkHorizontal(board, row) || checkVertical(board, col) || checkDiagonal(board);
    }

    public boolean checkDraw(int totalMoves, int boardSize) {
        return totalMoves == boardSize * boardSize;
    }

    private boolean checkHorizontal(Board board, int row) {
        char player = board.getCell(row, 0);
        for (int i = 1; i < board.getSize(); i++) {
            if (board.getCell(row, i) != player) return false;
        }
        return player != '-';
    }

    private boolean checkVertical(Board board, int col) {
        char player = board.getCell(0, col);
        for (int i = 1; i < board.getSize(); i++) {
            if (board.getCell(i, col) != player) return false;
        }
        return player != '-';
    }

    private boolean checkDiagonal(Board board) {
        int size = board.getSize();
        char player = board.getCell(0, 0);
        boolean win = true;
        for (int i = 1; i < size; i++) {
            if (board.getCell(i, i) != player) {
                win = false;
                break;
            }
        }
        if (win && player != '-') return true;

        player = board.getCell(0, size - 1);
        win = true;
        for (int i = 1; i < size; i++) {
            if (board.getCell(i, size - 1 - i) != player) {
                win = false;
                break;
            }
        }
        return win && player != '-';
    }
}