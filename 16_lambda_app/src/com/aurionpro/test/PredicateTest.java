package com.aurionpro.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<Integer> evenChecker = (Integer number)->(number%2==0);
		
		System.out.println(evenChecker.test(8));
		
BiPredicate<Integer,Integer> greatesNumberChecker = (Integer number1,Integer number2)->(number1>number2);
		
		System.out.println(greatesNumberChecker.test(0,7));
		
		
	}

}
