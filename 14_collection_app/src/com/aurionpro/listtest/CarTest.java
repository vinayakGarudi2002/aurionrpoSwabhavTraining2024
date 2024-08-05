package com.aurionpro.listtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Car;


public class CarTest {

	public static void main(String[] args) {


		List<Car> cars = new ArrayList<Car>();
		
		Scanner scanner = new Scanner(System.in);
		
		createListOfCar(cars,scanner);
		
		System.out.println("list of car");
		displayListOfCar(cars);
		
		System.out.println("Car with Max Mileage");
		System.out.println(maxMileage(cars));
		
		

	}

	private static Car maxMileage(List<Car> cars) {
		
		if(cars.size()==0) {
			return null;
		}
		
		Car maxMileageCar=cars.get(0);
		
		for(Car car:cars) {
			if(maxMileageCar.getMileage()<car.getMileage()) {
				maxMileageCar=car;
			}
		}
		
		
		
		return maxMileageCar;
	}

	private static void displayListOfCar(List<Car> cars) {
		
		for(Car car:cars) {
			System.out.println(car);
		}
		
	}

	private static void createListOfCar(List<Car> cars, Scanner scanner) {
	
		boolean exitStatus=false;
		while(!exitStatus) {
			
	        System.out.println("Enter CompanyName: ");
	        String companyName = scanner.next();
	        
	        System.out.println("Enter Car Id: ");
	        int carId = scanner.nextInt();
	        
	        System.out.println("Enter price: ");
	        int price = scanner.nextInt();
	        
	        System.out.println("Enter mileage: ");
	        int mileage = scanner.nextInt();
	        
	        
	        cars.add(new Car(carId,companyName,price,mileage));
			
	        System.out.println("Enter -1 to exit or 0 to continue ");
	        int stauts=scanner.nextInt();
			if(stauts==-1) {
				exitStatus=true;
	        	break;
	        }
		}
		
		
	}

}
