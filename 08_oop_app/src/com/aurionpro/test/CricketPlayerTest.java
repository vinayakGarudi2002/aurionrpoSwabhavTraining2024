package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CricketPlayer;

public class CricketPlayerTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		CricketPlayer cricketPlayer = new CricketPlayer();
		System.out.println("I am Default Player");
		cricketPlayer.display();
		cricketPlayer.calculateAverageRun();
		
		CricketPlayer players[] = new CricketPlayer[2];
		
		//System.out.println("Enter Folowing Detail to create new Player: ");
		
		for(int i=0;i<players.length;i++) {
			System.out.println("Enter Folowing Detail to creating Player: "+(i+1));		
			
			System.out.println("Enter Name: ");
			String name = scanner.nextLine();
			
			System.out.println("Enter Age: ");
			int age = scanner.nextInt();
			
			System.out.println("Enter Number of Matches: ");
			int numberOfMatches = scanner.nextInt();
			
			System.out.println("Enter Number of Runs: ");
			int runs = scanner.nextInt();
			
			System.out.println("Enter Number of PlayerId: ");
			int playerId = scanner.nextInt();
			
			
			System.out.println("Enter Number of numberOfWickets: ");
			int numberOfWickets = scanner.nextInt();
			
			players[i] = new CricketPlayer(playerId, name, numberOfMatches, runs,numberOfWickets);
		}
		
		for(int i=0;i<players.length;i++) {
			System.out.println("Displaying info of "+(i+1));
			players[i].display();
			players[i].calculateAverageRun();
		}
		
		
		
		
//		cricketPlayer1.display();
//		
//		cricketPlayer1.calculateAverageRun();
//		
		
		
		
		
		
		

	}

}
