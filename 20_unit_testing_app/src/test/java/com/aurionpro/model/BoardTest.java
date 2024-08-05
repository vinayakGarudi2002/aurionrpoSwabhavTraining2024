package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board(3); // Initialize a 3x3 board for testing
    }

    @Test
    void testBoard() {
        assertEquals(3, board.getSize(), "Board size should be 3x3");
    }

    @Test
    void testInitialize() {
        board.initialize();
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                assertEquals('-', board.getCell(i, j), "Board cells should be initialized to '-'");
            }
        }
    }

    @Test
    void testPrintBoard() {
        board.initialize();
       
        board.printBoard();
    }

    @Test
    void testUpdateBoard() {
        board.initialize();
        assertTrue(board.updateBoard(0, 0, 'X'), "Board should be updated at (0,0) with 'X'");
        assertEquals('X', board.getCell(0, 0), "Cell (0,0) should contain 'X'");
        
    }

    @Test
    void testGetCell() {
        board.initialize();
        board.updateBoard(1, 1, 'O');
        assertEquals('O', board.getCell(1, 1), "Cell (1,1) should contain 'O'");
        assertEquals('-', board.getCell(0, 0), "Unoccupied cell (0,0) should contain '-'");
    }

    @Test
    void testGetSize() {
        assertEquals(3, board.getSize(), "Board size should be 3x3");
        Board largeBoard = new Board(5);
        assertEquals(5, largeBoard.getSize(), "Board size should be 5x5");
    }
}