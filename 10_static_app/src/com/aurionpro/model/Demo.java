package com.aurionpro.model;

public class Demo {
	 {
			//System.out.println("I am on");
			display();
		}
	

	private int a=1;
	
	private static int b =1;
	
	private int c=1;
	
	
	public void increment() {
		a++;
		b++;
		c++;
	}
	
	
	public void display() {
		System.out.print("a"+a+" ");
		System.out.print("b"+b+" ");
		System.out.println("c"+c+" ");
	}
	
	public static void display(String name) {
		System.out.println(name);
	}
	
	 
	
	
}
