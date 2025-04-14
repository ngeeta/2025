package com.practice.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;


public class List_ArrList_LinkList_Vector {

	public static void main(String[] args) {
ArrayList<String> al=new ArrayList<String>(Arrays.asList("A","B","Z","X"));
System.out.println("Original "+al);
for(String s:al) {
	System.out.print(s+" ");
}
System.out.println("\n 1. List is useful for add and remove\n 2. ArrayList implements ListInterface\n 3. Internally it uses array to store Elment");
LinkedList<String> ll=new LinkedList<String>(Arrays.asList("A","B","Z","X"));
for(String s:ll) {
	System.out.print(s+" ");
}
System.out.println("\n 1. LinkedList is useful for manupulation\n 2. LinkedList implements ListInterface & deQueInterface\n 3. Internally it uses double linked list which has previous & next node");


Vector<String> v=new Vector<String>(Arrays.asList("A","B","Z","X"));
for(String s:v) {
	System.out.print(s+" ");
}


	}

}
