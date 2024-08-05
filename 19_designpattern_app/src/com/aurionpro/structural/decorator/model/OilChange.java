package com.aurionpro.structural.decorator.model;

public class OilChange extends CarServiceDecorator implements ICarService {

	public OilChange(ICarService car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public double getCost() {
		// TODO Auto-generated method stub
		return car.getCost()+500;
	}

}
