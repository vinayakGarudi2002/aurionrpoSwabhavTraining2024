package com.aurionpro.iterative.test;

public class SumOfEvenNumber {

	public static void main(String[] args) {


		int i=1;
		int sum=0;
		
		while (i<=100) {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}
		
		System.out.println("Sum of First Even 100: "+ sum);

	}

}
