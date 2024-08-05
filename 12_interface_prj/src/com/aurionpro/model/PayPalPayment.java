package com.aurionpro.model;

public class PayPalPayment implements Payment {

	@Override
	public void processPayment() {
		System.out.println("Processing Pay Pal payment processing");
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Processing Pay Pal refund processing");
	}

}
