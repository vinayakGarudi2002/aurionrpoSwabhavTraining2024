package com.aurionpro.test;

import com.aurionpro.model.ISlayble;

public class SlaybleTest {

//	public static void main(String[] args) {
//		
		public  ISlayble slayble=new ISlayble() {

			@Override
			public void say() {
				System.out.println("I am in");
				
			}
			
		};
//		
//		ISlayble slayble1=()->System.out.println("I am in");
//				
//		sayHello(slayble1);
//			
//		
//		
//		//slayble1.say();
//		
//	}

	public static void sayHello(ISlayble slayble1) {
		
		slayble1.say();
		
	}
	
}
			
		

