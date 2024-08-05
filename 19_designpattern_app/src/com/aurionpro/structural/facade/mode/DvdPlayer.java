package com.aurionpro.structural.facade.mode;

public class DvdPlayer implements IPlayer {
	
	private int movie;
	

	@Override
	public void on() {
		System.out.println("Switching on Dvd Player");
		
	}


	public int getMovie() {
		return movie;
	}


	public void setMovie(int movie) {
		this.movie = movie;
	}
	
	

}
