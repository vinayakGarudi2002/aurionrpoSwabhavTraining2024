package com.aurionpro.iterative.test;

import java.util.Scanner;

public class CheckArmstrongNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		int sum=0;
		int temp=number;
		//System.out.println(number%10);
		int power=0;
		while(number>0) {
			power +=1;
			number=number/10;
			
		}
		number=temp;
		
		while(number>0) {
			int digit=number%10;
			sum =sum+(int)Math.pow(digit,power);
			number=number/10;
			
		}
		if(sum==temp) {
			System.out.println("It is Armstrong number: "+temp);
		}else {
			System.out.println("It is Not Armstrong number: "+temp);
		}
		
		
	}

}
