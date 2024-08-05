package com.aurionpro.behavioural.state.model;

public class Ordered implements IPacketState {

	@Override
	public void next(Packet packet) {
		
		packet.setPacketState(new Shipped());
		
		
		System.out.println("packet moved to Shipped State ");
	
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("packet is in Ordered state");
		
	}

	@Override
	public void previous(Packet packet) {
		  System.out.println("No previous State");
		  return;
		
	}

}
