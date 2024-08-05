package com.aurionpro.creational.factory.model;

import com.aurionpro.creational.factory.model.ICar;

public class Tata implements ICar {

	@Override
	public void start() {
		System.out.println("Starting Tata");
		
	}

	@Override
	public void stop() {
		System.out.println("Stoped Tata");
		
	}
}
