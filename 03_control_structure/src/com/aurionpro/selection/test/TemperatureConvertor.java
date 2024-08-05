package com.aurionpro.selection.test;

import java.util.Scanner;

public class TemperatureConvertor {
	
	public static void main(String[] args) {
		
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        
        
        switch (choice) {
		case 1:
			System.out.println("1. Celsius to Fahrenheit is: "+(temperature*1.8)+32);
			break;
		case 2:
			System.out.println("2. Fahrenheit to Celsius is: "+(temperature-32)*0.55);
			break;
		case 3:
			System.out.println("3. Celsius to Kelvin is: "+(temperature+273.15));
			break;
		case 4:
			System.out.println("4. Kelvin to Celsius is: "+(temperature-273.15));
			break;
		case 5:
			System.out.println("5. Fahrenheit to Kelvin is: "+(temperature-32)*0.55+273.15);
			break;
		case 6:
			System.out.println("6. Kelvin to Fahrenheit is: "+(temperature-273.15)*1.8+32);
			break;

		default:
			break;
		}
		
	}

}
