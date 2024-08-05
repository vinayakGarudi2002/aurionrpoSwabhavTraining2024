package com.aurionpro.ocp.sln;

public class Reactangle implements Shape {

	private int lenght;
	private int breadth;



	public Reactangle(int lenght, int breadth) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
	}



	@Override
	public void area() {
		
		System.out.println("Area of reactangle: "+lenght*breadth);
		// TODO Auto-generated method stub
		
	}

}
