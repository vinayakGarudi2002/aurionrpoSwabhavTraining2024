package com.aurionpro.model;

import java.util.Scanner;

import com.aurionpro.model.TicTacToeFacade;

public class TicTacToeTest {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the size of the matrix
        System.out.println("Enter the size of the Tic Tac Toe board (minimum 3): ");
        int size = scanner.nextInt();
        if (size < 3) {
            System.out.println("Minimum size is 3. Setting size to 3.");
            size = 3;
        }

        // Facade object to manage the game
        TicTacToeFacade ticTacToeFacade = new TicTacToeFacade(size);
        ticTacToeFacade.initializeBoard();
        ticTacToeFacade.beginGame();
    }

}
