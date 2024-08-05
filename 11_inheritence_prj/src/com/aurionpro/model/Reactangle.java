package com.aurionpro.model;

public class Reactangle extends Shape {
	
	private int length;
	private int breadth;
	
	

	public Reactangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}



	@Override
	public void area() {
		System.out.println("Area of Reactangle is: "+(length*breadth));
		
	}

}
