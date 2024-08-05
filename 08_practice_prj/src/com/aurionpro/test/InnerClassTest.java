package com.aurionpro.test;

import com.aurionpro.model.InnerClass;

public class InnerClassTest {

	public static void main(String[] args)
	{

		InnerClass obj=new InnerClass();
		
		InnerClass.Inner in = obj.new Inner();

		// Calling show() method over above object created
		in.show();
	}

}
