package com.aurionpro.behavioural.state.test;

import com.aurionpro.behavioural.state.model.Ordered;
import com.aurionpro.behavioural.state.model.Packet;

public class PacketTest {

	public static void main(String[] args) {
		
		Packet packet = new Packet(new Ordered());
		
		packet.gotToNextState();
		packet.currentState();
		
		packet.gotToNextState();
		packet.currentState();
		
		packet.gotToNextState();
		packet.currentState();
		
		packet.gotToPreviousState();
		packet.currentState();
		
		

	}

}
