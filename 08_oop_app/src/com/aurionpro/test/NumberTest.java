package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.model.Number;

public class NumberTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int num1=scanner.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2=scanner.nextInt();
		
		Number number1=new Number(num1);
		Number number2=new Number(num2);
		
		System.out.println("Number before swaping "+number1.getValue()+"and"+number2.getValue());
		
		swap(number1,number2);
		
		System.out.println("Number after swaping "+number1.getValue()+"and"+number2.getValue());

	}
	
	
	public static void swap(Number number1 , Number number2) {
		int temp = number1.getValue();
		number1.setValue(number2.getValue());
		number2.setValue(temp);
	}

}
