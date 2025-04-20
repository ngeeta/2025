package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class OddEven {
@Test
public void Odd() {
	ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	//list.stream().collect(Collectors.partitioningBy(i->i%2==0 ));
	Map<Boolean, List<Integer>> response = list.stream()
	        .collect(Collectors.partitioningBy(n -> n % 2 == 0));	
	List<Integer> evens = response.get(true);
	List<Integer> odds = response.get(false);
	System.out.println(evens);
	System.out.println(odds);

}
@Test
public void charCount() {
	ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	String s="Geeta";
	Map<Character, Long> response = s.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(response);

}
}
