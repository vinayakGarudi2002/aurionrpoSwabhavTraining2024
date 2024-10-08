package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {


		List<Integer> numbers = Arrays.asList(1,2,3,4,5,45,60,90,93);
		
//		Stream<Integer> numberStream=numbers.stream(); 
//		
//		numberStream.forEach((number)->System.out.println("number: "+number));
		System.out.println("all number");
		numbers.stream()
		        .forEach((number)->System.out.println("number: "+number));
		System.out.println("Odd Number");
		 numbers.stream()
		        .filter((number)->(number%2)!=0)
		        .filter((number)->(number>25))
                .forEach((number)->System.out.println("number: "+number));
		 
		 List<Integer> filteredNumbers= numbers.stream()
			        .filter((number)->(number%2)!=0)
			        .filter((number)->(number>25))
	                .collect(Collectors.toList());
		 System.out.println("Square of Numbers");
		 List<Integer> squareNumbers   =  numbers.stream()
		                 .map((number)->number*number)
		                 .collect(Collectors.toList());
		 
		 squareNumbers.stream().forEach((number)->System.out.println("number: "+number));
		 
		 int sum=numbers.stream().reduce(0, (number1,number2)->number1+number2);
		 
		 System.out.println(sum);
		 
		 List<Integer> sortedNumber = numbers.stream()
				                             .sorted()
				                             .collect(Collectors.toList());
		 
		 List<Integer> reverseSorted  = numbers.stream()
				                               .sorted(Comparator.reverseOrder())
				                               .collect(Collectors.toList());
		 
		 List<Integer> sorNumber = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		 
		 sorNumber.stream()
		          .limit(3)
                 .forEach((number)->System.out.println("number: "+number));
		 
		 Optional<Integer> max = numbers.stream().max((number1,number2)->number1-number2);
		 if(max.isPresent())
			 System.out.println("Max Value is: "+max.get());
		 
		 Optional<Integer> min = numbers.stream().min((number1,number2)->number1-number2);
		 if(max.isPresent())
			 System.out.println("Min Value is: "+min.get());
		 
		 
		 
		 
		 
		 

	}

}
