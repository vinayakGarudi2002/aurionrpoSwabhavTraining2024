package com.aurionpro.behavioural.state.model;

public class Shipped  implements IPacketState {

	@Override
	public void next(Packet packet) {
		
		packet.setPacketState(new Delivered());
		System.out.println("packet moved to Delivered State ");
	
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("packet is in Shipped state");
		
	}

	@Override
	public void previous(Packet packet) {
		
		
		packet.setPacketState(new Ordered());
		System.out.println("packet moved to Ordered State ");
		
	}

}
