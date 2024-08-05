package com.aurionpro.test;

import com.aurionpro.model.Demo;

public class DemoTest {
	 static {
			System.out.println("I am on in test");
		}
	public static void main(String[] args) {
		
		
		
		Demo d1 = new Demo();
		d1.display();
		d1.increment();
		d1.display();
		
		Demo d2 = new Demo();
		d2.display();
		d2.increment();
		d2.display();
		
		Demo d3 = new Demo();
		d3.display();
		d3.increment();
		d3.display();
		
	}

}
