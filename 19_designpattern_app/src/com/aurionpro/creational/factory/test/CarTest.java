package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.ICar;
import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Maruti;
import com.aurionpro.creational.factory.model.TypeOfCar;

public class CarTest {

	public static void main(String[] args) {
		
		ICar car = CarFactory.carMaker(TypeOfCar.Maruti);
		
		car.start();
		car.stop();
		
   
        car = CarFactory.carMaker(TypeOfCar.Tata);
		
		car.start();
		car.stop();
		
		
    

	}

}
