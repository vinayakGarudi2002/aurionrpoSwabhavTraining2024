package com.aurionpro.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1="vinayak";
		String name2="vinayak";
		
		String name3 = new String("vinayak");
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		
		name3 = name3+" G";
		
		System.out.println(name3.hashCode());
		
		System.out.println(name3);
		System.out.println(name2);
		
		StringBuilder name = new StringBuilder("myNamae");
		System.out.println(name.hashCode());
	    name=name.append(" sur");
	    
	    System.out.println(name.hashCode());
		
		

	}

}
