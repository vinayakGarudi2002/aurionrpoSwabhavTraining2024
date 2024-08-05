package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Box;

public class BobTest {

	public static void main(String[] args) {
		
		//Box box = new Box();
	
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter height of box: ");
	        int height = scanner.nextInt();
	        //box.setHeight(height);
	        
	        System.out.println("Enter weidth of box: ");
	        int weidth = scanner.nextInt();
	        //box.setWidth(weidth);
	        System.out.println("Enter depth of box: ");
	        int depth = scanner.nextInt();
	       // box.setDepth(depth);
	        
	        Box box = new Box(height,weidth,depth);
	    	 
	        
	        
	        System.out.println("height: "+box.getHeight());
			System.out.println("depth: "+box.getDepth());
			System.out.println("width: "+box.getWidth());
	        

		//Box box2 = new Box();
		
		
	}

}
