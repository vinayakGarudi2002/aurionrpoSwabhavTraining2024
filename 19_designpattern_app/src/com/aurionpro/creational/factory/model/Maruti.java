package com.aurionpro.creational.factory.model;

import com.aurionpro.creational.factory.model.ICar;

public class Maruti implements ICar {

	@Override
	public void start() {
		System.out.println("Starting Maruti");
		
	}

	@Override
	public void stop() {
		System.out.println("Stoped Maruti");
		
	}

}
