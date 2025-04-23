package com.practice.Java;

import java.util.*;

public class Map_HashMap_LinkedHashMap_Hashtable {

	public static void main(String[] args) {
		Map<String, String> capital=new HashMap<String, String>();
		
		capital.put("Maharashtra", "Mumbai");
		capital.put("Madhya Pradesh", "Bhopal");
		capital.put("Karnataka", "Banglore");
		capital.put("Orrisa", "Puri");
		capital.put("West Bengal", "Kolkata");
		System.out.println("---Keys using KeySet----");
		System.out.println(capital);
		System.out.println(capital.keySet());
		System.out.println(capital.values());
		for(String s:capital.keySet()) {
			System.out.println(s+" :: "+capital.get(s));
		}
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "India");
		map.put(2, "US");
		map.put(3, "India");
		map.put(1, "IND");
		System.out.println(map);
		for(Integer s:map.keySet()) {
			System.out.println(s+" "+map.get(s));
		}
		Map<String, String> test=new HashMap<String, String>();
		
		test.put("", "test");
		test.put("", "tes2");
		test.put("1", "");
		test.put("2", "");
		
		Iterator tr=test.entrySet().iterator();
		while(tr.hasNext()) {
			System.out.println(tr.next());
		}
		

	}

}
