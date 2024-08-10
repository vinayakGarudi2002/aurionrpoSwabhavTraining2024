package com.aurionpro.tictactoe.model;

public class Board {
    private Cell[] cells = new Cell[9];

    public Board() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = new Cell();
        }
    }

    public boolean isBoardFull() {
        for (Cell cell : cells) {
            if (cell.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void setCellMark(int loc, MarkType mark) throws CellAlreadyMarkedException {
        if (loc < 0 || loc >= cells.length) {
            throw new IllegalArgumentException("Invalid location!");
        }
        cells[loc].setMark(mark);
    }

    public Cell[] getCells() {
        return cells;
    }
}

