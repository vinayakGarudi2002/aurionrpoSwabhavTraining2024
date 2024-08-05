package com.aurionpro.structural.decorator.model;

public class CarServiceDecorator implements ICarService {
	
	ICarService car;

	public CarServiceDecorator(ICarService car) {
		super();
		this.car = car;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return car.getCost();
	}
	
	

}
