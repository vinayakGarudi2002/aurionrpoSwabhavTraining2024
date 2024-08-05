package com.aurionpro.iterative.test;

public class SumFirstHundered {

	public static void main(String[] args) {


		int i=1;
		int sum=0;
		
		while (i<=100) {
			sum=sum+i;
			i++;
		}
		
		System.out.println("Sum of First 100: "+ sum);

	}

}
