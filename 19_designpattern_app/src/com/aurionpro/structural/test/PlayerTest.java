package com.aurionpro.structural.test;

import com.aurionpro.structural.facade.mode.MovieFacade;

public class PlayerTest {
	
	public static void main(String[] args) {
		
		MovieFacade player = new MovieFacade();
		
		player.playDvdPlayer();
		player.playProjector();
		player.playSoundSystem();
		
	}

}
