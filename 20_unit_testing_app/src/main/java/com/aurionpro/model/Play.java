package com.aurionpro.model;

import java.util.Scanner;

public class Play {
    private Board board;
    private WinningStatus winningStatus;
    private int totalMoves;
    private boolean playerXTurn;

    public Play(Board board, WinningStatus winningStatus) {
        this.board = board;
        this.winningStatus = winningStatus;
        this.totalMoves = 0;
        this.playerXTurn = true;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (!gameWon && !winningStatus.checkDraw(totalMoves, board.getSize())) {
            board.printBoard();
            char currentPlayer = playerXTurn ? 'X' : 'O';
            System.out.println("Player " + currentPlayer + "'s turn:");
            
            int row, col;
            while (true) {
                System.out.println("Enter row and column (1-" + (board.getSize()) + "): ");
                row = scanner.nextInt()-1;
                col = scanner.nextInt()-1;
                if (board.updateBoard(row, col, currentPlayer)) {
                    break;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }

            gameWon = winningStatus.checkWin(board, row, col);
            if (gameWon) {
                board.printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
            } else if (winningStatus.checkDraw(++totalMoves, board.getSize())) {
                board.printBoard();
                System.out.println("It's a draw!");
            }

            playerXTurn = !playerXTurn;
        }

        scanner.close();
    }
}