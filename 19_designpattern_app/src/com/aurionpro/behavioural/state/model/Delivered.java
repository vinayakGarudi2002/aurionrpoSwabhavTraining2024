package com.aurionpro.behavioural.state.model;

public class Delivered implements IPacketState {

	@Override
	public void next(Packet packet) {
		
		System.out.println("No further State");
		  return;
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("packet is in Delivered state");
		
	}

	@Override
	public void previous(Packet packet) {
		
		
		packet.setPacketState(new Shipped());
		System.out.println("packet moved to Shipped State ");
		
	}

}
