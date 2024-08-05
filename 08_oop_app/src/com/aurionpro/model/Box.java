package com.aurionpro.model;

public class Box {

	private int width;
	private int height;
	private int depth;
	
	public Box() {
		width=10;
		height=12;
		depth=13;
	}
	
	
	
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public Box(int width, int height) {
		this();
		this.width = width;
		this.height = height;
		//this.depth = depth;
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



	public int getDepth() {
		return depth;
	}



	public void setDepth(int depth) {
		this.depth = depth;
	}



	public int area(int width , int height , int depth ) {
		
		
		return 0;
	}
	
	
	
}
