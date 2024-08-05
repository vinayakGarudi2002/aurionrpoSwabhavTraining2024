package com.aurionpro.transaction;



public class Swapper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number1=Integer.parseInt(args[0]);
		
		int number2=Integer.parseInt(args[1]);
		
		
			
		int temp=0;
		
		System.out.println("Before Swapping");
		System.out.println("number 1: "+number1+" number 2: "+number2);
	    System.out.println("After Swapping");	
	    temp=number1;
	    number1=number2;
	    number2=temp;
	    System.out.println("number 1: "+number1+" number 2: "+number2);

	}

}
