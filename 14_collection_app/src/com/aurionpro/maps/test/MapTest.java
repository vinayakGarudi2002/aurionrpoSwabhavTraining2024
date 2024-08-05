package com.aurionpro.maps.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		
//		HashMap<Integer,String> map = new HashMap<Integer,String>();
//		
//		map.put(1, "vinayak");
//		map.put(3, "sham");
//		map.put(9, "ram");
//		
//		System.out.println(map);
		
//       LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
//		
//		map.put(1, "vinayak");
//		
//		map.put(9, "ram");
//		
//		map.put(3, "sham");
//		
//		System.out.println(map);
		
		 TreeMap<Integer,String> map = new TreeMap<Integer,String>();
			
			map.put(1, "vinayak");
			
			map.put(9, "ram");
			
			map.put(3, "sham");
			
			System.out.println(map);
			
			
			Set<Entry<Integer,String>> entries = map.entrySet();
			
			for(Entry<Integer,String> entry:entries) {
				System.out.println(entry.getKey()+"-"+entry.getValue());
			}
	}

}
