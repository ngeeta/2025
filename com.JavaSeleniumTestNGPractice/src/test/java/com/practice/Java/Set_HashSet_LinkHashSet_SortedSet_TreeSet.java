package com.practice.Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_HashSet_LinkHashSet_SortedSet_TreeSet {

	public static void main(String[] args) {
Set<String> s1=new HashSet<String>(Arrays.asList("A","Z","X","B"));
System.out.println(s1);
System.out.println("1. HashSet does not maintain Order \n");
Set<String> s2=new LinkedHashSet<String>(Arrays.asList("A","Z","X","B"));
System.out.println(s2);
System.out.println("1. LinkedHashSet maintain insertion Order \n");


SortedSet<String> s3=new TreeSet<String>(Arrays.asList("A","Z","X","B"));
System.out.println(s3);
System.out.println("1. TreeSet maintain Sorted Order \n");


	}

}
