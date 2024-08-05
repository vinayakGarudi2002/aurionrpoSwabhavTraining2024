package com.aurionpro.test;

import com.aurionpro.model.Itest;
import com.aurionpro.model.Refernce;

public class RefernceTest {

	public static void main(String[] args) {
		
		Itest test=Refernce::new;
		
		method(test);
		
		Itest test1=Refernce::staticPrint;
		
		method(test1);
		
		Refernce reference=new Refernce();
		
		Itest test2=reference::print;
		
		method(test2);
		

	}
	
	private static void method(Itest test) {
		test.display();
	}

}
