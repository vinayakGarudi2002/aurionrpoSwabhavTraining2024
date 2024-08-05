package com.aurionpro.structural.facade.mode;

public class SoundSystem implements IPlayer {
	
	private int volume;
	

	@Override
	public void on() {
		System.out.println("Switching on SoundSystem");
		
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	

}
