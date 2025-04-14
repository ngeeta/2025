package com.practice.Java;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQ_DQ_LLAndArrayDQ {

	public static void main(String[] args) {
Queue<String> q=new PriorityQueue<String>(Arrays.asList("A","Z","X","B","Z","A"));
System.out.println(q);

Deque<String> dq=new ArrayDeque<String>(Arrays.asList("A","Z","X","B","Z","A"));
System.out.println(dq);

	}

}
