package com.aurionpro.test;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  Number: ");
		int numberTest=scanner.nextInt();
		
		System.out.println("Enter Second Number: ");
		int number2=scanner.nextInt();
	
		Consumer<Integer> consumerSquare =(Integer number)->{
			System.out.println("Square of number is: "+number*number);
		};
		
		Consumer<Integer> consumerFcatorial =(Integer number)->{
			int result=1;
			if(number==0 || number==1) {
				System.out.println("Factorial of number is: "+result);
				return;
			}
			
			for(int i=number;i>=1;i-- ) {
				result=result*i;
			}
			
			System.out.println("Factorial of number is: "+result);
		};
		
		BiConsumer<Integer,Integer> consumerAdder=(Integer number_1,Integer number_2)->{
			System.out.println("Addition of number is: "+(number_1+number_2));
		};
		
		
		consumerSquare.accept(numberTest);
		consumerFcatorial.accept(numberTest);
		consumerAdder.accept(numberTest, number2);
		
		
		
		


	}

}
