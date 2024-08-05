package com.aurionpro.model;

public class MyClass {
	private int balance;
	
	public MyClass() {
		// TODO Auto-generated constructor stub
		balance=0;
		
	}
	
	public int sum(int num1,int num2) {
		
		return num1+num2;
		
	}
	
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		System.out.println(ob.sum(20, 10));
		System.out.println(ob.balance);
	}

}
