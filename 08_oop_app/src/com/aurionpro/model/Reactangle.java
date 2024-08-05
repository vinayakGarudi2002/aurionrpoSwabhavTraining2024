package com.aurionpro.model;

public class Reactangle {
	
	private int width;
	private int height;
	

	
	public Reactangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void area( int height , int width ) {
		
	 System.out.println("Area of Reactangle is : "+height*width);	
	
	}
	
	public void display() {
		System.out.println("height: "+this.height);
		System.out.println("width: "+this.width);
	}
	

	
	
	
	
	
	
	
	
	

}
