package com.practice.Java;

public class Factorial {
	// Factorial: 1*2*3*4*5=120
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1, num = 5;

		for (int i = 1; i <= num; i++) {
			fact *= i;

		}
		System.out.println(fact);

	}
}
