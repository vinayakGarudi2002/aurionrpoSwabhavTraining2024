package com.aurionpro.model;

public class BankTransferPayment extends Payment {

	@Override
	public void processPayment() {
		System.out.println("Processing Bank transfer payment processing");
		
	}

	@Override
	public void refund() {
		System.out.println("Processing Bank transfer refund processing");
		
	}

}
