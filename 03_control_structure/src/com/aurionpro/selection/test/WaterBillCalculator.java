package com.aurionpro.selection.test;

import java.util.Scanner;

public class WaterBillCalculator {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number of Units Consumed: ");
		
		int units=scanner.nextInt();
		int charge=0;
		int meter_charge=75;
		
		
		if(units<=100) {
			charge=units*5;
		}else {
			if(units<=250) {
				
				charge=units*10;
			}else {
				
				charge=units*20;
			}
		}
		
		int totalBill=charge+meter_charge;
		
		System.out.println("Total Charged of water bill is: "+totalBill+" Rs");
		
		
	}

}
