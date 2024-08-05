package com.aurionpro.creational.factory.model;

public class MahindraFactory  implements ICarFactory {

	@Override
	public  ICar make() {
		
		return  new Mahindra();
		
	}
}
