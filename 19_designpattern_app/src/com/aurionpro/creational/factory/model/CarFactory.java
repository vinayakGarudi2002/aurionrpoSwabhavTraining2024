package com.aurionpro.creational.factory.model;

public class CarFactory {
	
	public static ICar carMaker(TypeOfCar carName) {
		ICar car =null;
		
		if(TypeOfCar.Maruti==carName) {
			car= new Maruti();
		}
         if(TypeOfCar.Tata==carName) {
        	 car= new Tata();
		}
         if(TypeOfCar.Mahindra==carName) {
        	 car= new Mahindra();
 		}
		
		return car;
	}

}
