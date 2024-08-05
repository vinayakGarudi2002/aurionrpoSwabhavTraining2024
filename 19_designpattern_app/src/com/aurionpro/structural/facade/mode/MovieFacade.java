package com.aurionpro.structural.facade.mode;

public class MovieFacade {
	

	
	public void playDvdPlayer() {
		
		DvdPlayer player =new DvdPlayer();
		player.on();
		player.setMovie(12);
		
		
	}
	
public void playSoundSystem() {
	SoundSystem player =new SoundSystem();
	player.on();
	player.setVolume(12);
		
	}

public void playProjector() {
	Projector player = new Projector();
	
	player.on();
	
}

}
