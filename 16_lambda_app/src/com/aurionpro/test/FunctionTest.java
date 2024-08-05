package com.aurionpro.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		                // last one is return type 
		Function<Integer,Integer> squareFunction=(Integer number)->(number*number); 
		
		System.out.println(squareFunction.apply(12));
		                           // last one is return type 
		BiFunction<Integer,Integer,Integer> adderFunction=(Integer number_1,Integer number_2)->{
			return(number_1+number_2);
		};
		
		System.out.println(adderFunction.apply(12, 13));
		
	}
}
