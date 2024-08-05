package com.aurionpro.model;

public class CricketPlayer {
	
	private int playerId;
	private String name ;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	
	public CricketPlayer() {
		
		this.playerId = 12345;
		this.name = "default";
		this.numberOfMatches = 10;
		this.runs = 120;
		this.numberOfWickets = 12;
		
	}
	
	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs, int numberOfWickets) {
		this.playerId = playerId;
		this.name = name;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.numberOfWickets = numberOfWickets;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getNumberOfWickets() {
		return numberOfWickets;
	}

	public void setNumberOfWickets(int numberOfWickets) {
		this.numberOfWickets = numberOfWickets;
	}
	
	public void display() {
		System.out.println("Detail Info about player: ");
		System.out.println("Player Id: "+this.playerId);
		System.out.println("Player Name: "+this.name);
		System.out.println("Player Number of Matches: "+this.numberOfMatches);
		System.out.println("Total runs: "+this.runs);
		System.out.println("Total Wicket: "+this.numberOfWickets);
	}
	
	public void calculateAverageRun() {
		int averageRuns=(int)(this.runs/this.numberOfMatches);
		System.out.println("Average run of player: "+averageRuns);
	}
	
	
	

}
