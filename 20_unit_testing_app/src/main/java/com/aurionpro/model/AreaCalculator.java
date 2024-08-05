package com.aurionpro.model;

public class AreaCalculator {
	
	public double calculateAreaOfCircle(int radius) {
		return 3.14*radius*radius;
	}
	

    public double calculateAreaOfRectangle(int length, int width) {
        return length * width;
    }

    public double calculateAreaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

}
