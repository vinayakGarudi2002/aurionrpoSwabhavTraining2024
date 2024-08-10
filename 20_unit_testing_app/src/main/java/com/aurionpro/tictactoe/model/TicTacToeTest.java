package com.aurionpro.tictactoe.model;

public class TicTacToeTest {
	
	 public static void main(String[] args) {
	        Player player1 = new Player("Player 1", MarkType.X);
	        Player player2 = new Player("Player 2", MarkType.O);
	        Player[] players = {player1, player2};

	        Board board = new Board();
	        ResultAnalyzer analyzer = new ResultAnalyzer(board);
	        Game game = new Game(players, board, analyzer);

	       
	     
	        int[] moves = {0, 1, 4, 2, 8};  // Sample moves leading to a win
	        for (int move : moves) {
	            game.play(move);
	            if (analyzer.getResult() != ResultType.PROGRESS) {
	                break;
	            }
	        }

	        System.out.println("Game Over: " + analyzer.getResult());
	    }

}
