package com.aurionpro.tictactoe.model;

public class CellAlreadyMarkedException extends RuntimeException {
    public CellAlreadyMarkedException(String message) {
        super(message);
    }
}
