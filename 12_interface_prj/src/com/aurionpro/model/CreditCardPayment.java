package com.aurionpro.model;

public class  CreditCardPayment implements Payment {

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
