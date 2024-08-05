package com.aurionpro.listtest;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		
		LinkedList<String> list =new LinkedList<String>();
		
		list.add("1st");
		list.add("2nd");
		list.add("3rd");
		list.addFirst("0");
		System.out.println(list.poll());
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		
		for(String str : list) {
			System.out.println(str);
		}

	}

}
