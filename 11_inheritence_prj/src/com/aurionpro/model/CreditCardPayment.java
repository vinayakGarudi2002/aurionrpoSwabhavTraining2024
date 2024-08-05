package com.aurionpro.model;

public class  CreditCardPayment extends Payment {

	@Override
	public void processPayment() {
		System.out.println("Processing Credit card payment processing");
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Processing Credit card refund processing");
		
	}
	
	

}
