package com.aurionpro.ocp.sln.test;

import com.aurionpro.ocp.violation.FestivalType;
import com.aurionpro.ocp.violation.FixedDeposit;

public class FixwdDepositTest {

	public static void main(String[] args) {
		
		FixedDeposit fixedDeposit = new FixedDeposit(12345, "vinayak", 2000, 12, FestivalType.DIWALI);
		
		
		
		System.out.println("My Info: ");
		desplay(fixedDeposit);
		
		System.out.println("\nMy simple interest "+fixedDeposit.calculateSimpleInterest());
		// TODO Auto-generated method stub

	}
	
	
	public static void desplay(FixedDeposit fixedDeposit) {
		System.out.println("Acoount Number: "+fixedDeposit.getAccountNumber());
		System.out.println("Name: "+fixedDeposit.getName());
		System.out.println("principal : "+fixedDeposit.getPrincipal());
		System.out.println("duration : "+fixedDeposit.getDuration());
		System.out.println("festival : "+fixedDeposit.getFestival());
	}

}
