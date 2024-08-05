package com.aurionpro.behavioural.operation.test;

import java.rmi.server.Operation;

import com.aurionpro.behavioural.operation.model.AddOperation;
import com.aurionpro.behavioural.operation.model.MultiplyOPeration;
import com.aurionpro.behavioural.operation.model.MyOperationStratagy;

public class OperationTest {
	
	public static void main(String[] args) {
		int a=12;
		int b=13;
		MyOperationStratagy opearation = new MyOperationStratagy(new AddOperation());
		
		System.out.println("Addition of: "+a+" , "+b+" is "+opearation.doOperation(a, b));
		opearation.setOperation(new MultiplyOPeration());
		System.out.println("Multiplication of: "+a+" , "+b+" is "+opearation.doOperation(a, b));
		
	}

}
