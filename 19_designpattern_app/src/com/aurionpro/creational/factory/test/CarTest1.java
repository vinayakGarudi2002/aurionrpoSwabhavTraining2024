package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.ICar;
import com.aurionpro.creational.factory.model.ICarFactory;
import com.aurionpro.creational.factory.model.MahindraFactory;
import com.aurionpro.creational.factory.model.MarutiFactory;
import com.aurionpro.creational.factory.model.TataFactory;
import com.aurionpro.creational.factory.model.TypeOfCar;

public class CarTest1 {

	public static void main(String[] args) {
	
		ICarFactory carmaker = new MarutiFactory();
		
		ICar car = carmaker.make();
		car.start();
		car.stop();

       carmaker = new MahindraFactory();
		
		 car = carmaker.make();
		car.start();
		car.stop();
		
	       carmaker = new TataFactory();
			
			 car = carmaker.make();
			car.start();
			car.stop();
   
      

	}

}
