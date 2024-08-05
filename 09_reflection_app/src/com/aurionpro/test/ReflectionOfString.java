package com.aurionpro.test;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

public class ReflectionOfString {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Class stringClass =Class.forName("java.lang.String");
		
		System.out.println(stringClass.getName());
		
		System.out.println(stringClass.getSimpleName());
		

          AnnotatedType anotaions[]=	 stringClass.getAnnotatedInterfaces();
          
          for( AnnotatedType anotaion:anotaions) {
        	  System.out.println(anotaion.getType());
          }
          
          
          Class stringReflection =Class.forName("com.aurionpro.test.ReflectionOfString");
          
          System.out.println(stringReflection.getName());
          System.out.println(stringReflection.getSimpleName());
          System.out.println(stringReflection.getMethods().length);
          
          for(Method method:stringReflection.getMethods()) {
        	  System.out.println(method.getName());
          }
		
		
	}

}
