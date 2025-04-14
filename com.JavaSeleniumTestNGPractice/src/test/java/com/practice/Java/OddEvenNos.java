package com.practice.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class OddEvenNos {
public static void oddEvAL() {
	ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	
	al.removeIf(ele->ele%2==0);
	System.out.println("Odd :"+al);
	ArrayList<Integer> a2=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	a2.removeIf(ele->ele%2!=0);
	System.out.println("Even :"+a2);
	ArrayList<String> a3=new ArrayList<String>(Arrays.asList("Geeta","Mina","Leena"));
String rev="";
	for(int i=0;i<a3.size();i++) {
		for(int j=a3.get(i).length()-1;j>=0;j--) {
			rev=rev+a3.get(i).charAt(j);
		}
		rev=rev+" ";
	}
System.out.println(rev);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddEvAL();
	}

}
