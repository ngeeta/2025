package com.practice.Java;

public class StringVsStringBuilderVsStringBuffer {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "knowledge";
       // String s2 = s1;            // s2 points to the same "knowledge"
        s1.concat(" base");   // creates a new String "knowledge base"

        System.out.println(s1); 
        
        System.out.println("--------");
        
        StringBuilder sb=new StringBuilder("knowledge");
        sb.append(" is awesome!");
        System.out.println("After append: " + sb);
        

	}

}
