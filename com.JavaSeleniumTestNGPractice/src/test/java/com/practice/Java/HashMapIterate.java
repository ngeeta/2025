package com.practice.Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(1, "India");
map.put(2, "US");
map.put(3, "India");
map.put(1, "IND");
System.out.println(map);



for(Integer i: map.keySet()) {
	System.out.println(i +" : "+map.get(i));
	}
System.out.println("-----------");

for(String s:map.values()) {
System.out.println(s);	
}
System.out.println("-----------");
Iterator itr=map.entrySet().iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
for(int i = 1; i <= 5; i++) {
	 if(i == 4) {
	 break;
	 }
	 System.out.print(i + " ");
	 }
}
}
