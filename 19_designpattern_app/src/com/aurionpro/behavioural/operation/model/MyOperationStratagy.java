package com.aurionpro.behavioural.operation.model;

public class MyOperationStratagy {
	
	private IOperation operation;

	public MyOperationStratagy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	
	public int doOperation(int a ,int b) {
		return operation.doOperation(a, b);
	}
	
	

}
