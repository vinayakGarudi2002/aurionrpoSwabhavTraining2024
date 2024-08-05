package com.aurionpro.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list;
		
		 list = new ArrayList<String>();
		
		list.add("1st");
		
		System.out.println(list);
		
		list.add("2nd");
		
		list.add("3rd");
		
	//	list.add(1, 1);
		System.out.println(list);
		
		list.addAll(list);
		
		System.out.println(list);
		
		System.out.println(list.containsAll(list));
		
		List<Integer> integers=Arrays.asList(1,2,3,4);
		
		System.out.println("normal for loop");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Enhanced for loop");
		
		for(String str:list) {
			System.out.println(str);
		}
		
		System.out.println("Using Iterator");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ListIterator<String> listIterator =list.listIterator(); 
		System.out.println("Using ListIterator");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("reverse order");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		

	}

}
