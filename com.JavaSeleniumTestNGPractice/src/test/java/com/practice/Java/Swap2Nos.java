package com.practice.Java;

public class Swap2Nos {
	public static void withTempVar() {
		int a = 1, b = 2, c;
		System.out.println("a " + a + " b " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("a " + a + " b " + b);
	}

	public static void withoutTemp() {
		int a = 1, b = 2;
		System.out.println("\na " + a + " b " + b);
		a = a + b;//3
		b = a - b;//3-1=2
		a = a - b;//3-2=1
		System.out.println("\na " + a + " b " + b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withTempVar();
		withoutTemp();
	}

}
