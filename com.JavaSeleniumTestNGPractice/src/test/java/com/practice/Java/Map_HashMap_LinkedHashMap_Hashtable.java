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
System.out.println(capital.keySet() +" : "+capital.values());
	}

}
