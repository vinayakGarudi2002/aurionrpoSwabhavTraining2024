package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Reactangle;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		
		
		 Shape shape = new Circle(12);
		
		shape.area();
		
		 shape = new Reactangle(12,13);
		 
		 shape.area();
		 
		 shape=new Triangle(12,4);
		
		 shape.area();
		 
		 final int arr[]= {1,2,3};
		 
		 arr[2]=0;
		 
		 System.out.println(arr[2]);
		
		
		
		

	}

}
