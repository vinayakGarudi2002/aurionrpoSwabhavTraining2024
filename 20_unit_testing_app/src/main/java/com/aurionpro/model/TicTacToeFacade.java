package com.aurionpro.model;

public class TicTacToeFacade {
    private Board board;
    private Play play;
    private WinningStatus winningStatus;

    public TicTacToeFacade(int size) {
        board = new Board(size);
        winningStatus = new WinningStatus();
        play = new Play(board, winningStatus);
    }

    public void initializeBoard() {
        board.initialize();
    }

    public void beginGame() {
        play.startGame();
    }
}
