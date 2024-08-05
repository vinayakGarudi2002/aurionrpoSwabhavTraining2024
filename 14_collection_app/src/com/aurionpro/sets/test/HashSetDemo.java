package com.aurionpro.sets.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
        
		HashSet<String> set = new HashSet<String>();
		
		set.add("vinayak");
		set.add("sam");
		set.add("rohan");
		
		System.out.println(set);
		
       LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		
		set1.add("vinayak");
		set1.add("sam");
		set1.add("rohan");
		
		System.out.println(set1);
		
		 TreeSet<String> set2 = new TreeSet<String>();
			
			set2.add("vinayak");
			set2.add("sam");
			set2.add("rohan");
			
			System.out.println(set2);
		
	}

}
