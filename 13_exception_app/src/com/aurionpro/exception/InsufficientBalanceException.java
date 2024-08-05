package com.aurionpro.exception;

public class InsufficientBalanceException extends RuntimeException {
	
	private int amount;
	
	public InsufficientBalanceException(int amount) {
		this.amount=amount;
	}

	public String getMessage() {
		return "Insufficent balance "+"Entered Amount: "+amount;
	}

}
