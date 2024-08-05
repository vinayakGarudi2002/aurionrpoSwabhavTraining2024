package com.aurionpro.creational.factory.model;

import com.aurionpro.creational.factory.model.ICar;

public class Mahindra implements ICar {

	@Override
	public void start() {
		System.out.println("Starting Mahindra");
		
	}

	@Override
	public void stop() {
		System.out.println("Stoped Mahindra");
		
	}
}
