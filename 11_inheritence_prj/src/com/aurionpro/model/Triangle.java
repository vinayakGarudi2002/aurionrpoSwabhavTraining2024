package com.aurionpro.model;

public class Triangle extends Shape{
	
	private int height;
	private int breadth;
	
	

	public Triangle(int height, int breadth) {
		super();
		this.height = height;
		this.breadth = breadth;
	}



	@Override
	public void area() {
		System.out.println("Arra of triangle is: "+(0.5*height*breadth));
		
	}

}
