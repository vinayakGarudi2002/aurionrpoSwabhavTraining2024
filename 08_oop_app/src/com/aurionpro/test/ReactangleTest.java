package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Reactangle;

public class ReactangleTest {
	public static void main(String[] args) {
		
		
		int height;
		int weidth;
		
		
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter height of ractangle: ");
	        height = scanner.nextInt();
	       // reactangle.setHeight(height);
	        
	        System.out.println("Enter weidth of ractangle: ");
	        weidth = scanner.nextInt();
	       // reactangle.setWidth(weidth);
	        
	        Reactangle reactangle = new Reactangle(height,weidth);
	        
	        System.out.println("height: "+reactangle.getHeight());
			System.out.println("width: "+reactangle.getWidth());
	       
			
	
		reactangle.area(weidth,height);
        
		
	}
	
	public static void getData() {
		
	}

}
