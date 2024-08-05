package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentStream {

	public static void main(String[] args) {
		
		String[] names= {"Jayesh","Nimesh","Mark","Mahesh","Ramesh"};
		
		System.out.println("First 3 students sorted in asscending order");
		
		List<String> students= Arrays.asList(names);
	   students.stream().limit(3).sorted().forEach((name)->System.out.println(name));
	   
	   System.out.println("First 3 students sorted in asscending order if it conatains a");
	   
	   students.stream().filter((name)->name.contains("a")).limit(3).sorted().forEach((name)->System.out.println(name));
	   
	   System.out.println("Studemt in descending order");
	   
	   students.stream().sorted(Collections.reverseOrder()).forEach((name)->System.out.println(name));
	   
	   System.out.println("First 3 char of all name");
	   
	   students.stream().map((name)->(name.substring(0,3))).forEach((name)->System.out.println(name));
	   System.out.println("filter for len of char less than 4");
	   
	   students.stream().filter((name)->name.length()<=4).forEach((name)->System.out.println(name));
	   
	   
	   
	   
	   
	   

	}

}
