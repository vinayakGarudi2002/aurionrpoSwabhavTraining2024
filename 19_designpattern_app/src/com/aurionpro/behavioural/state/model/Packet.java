package com.aurionpro.behavioural.state.model;

public class Packet {
	
	private IPacketState packetState;

	public Packet(IPacketState packetState) {
		super();
		this.packetState = packetState;
	}

	public IPacketState getPacketState() {
		return packetState;
	}

	public void setPacketState(IPacketState packetState) {
		this.packetState = packetState;
	}
	
	
	public void gotToNextState() {
		packetState.next(this);
	}
	
public void gotToPreviousState() {
	packetState.previous(this);
		
	}

public void currentState() {
	
	packetState.current(this);
	
}

}
