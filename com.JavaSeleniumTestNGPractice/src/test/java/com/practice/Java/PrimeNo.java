package com.practice.Java;

import java.util.Scanner;

public class PrimeNo {

	public void primeNum() {

		int a = 19;
		int count=0;
		if (a <= 1) {
		      System.out.println("The number is not prime");
		      return;
		    }
		for (int i = 1; i <= a/2; i++) {
			if (a % i == 0) {
				count++;
			}


		}			if (count > 1) {
	        System.out.println(a+ " The number is not prime");
	    }
	    else {
	      System.out.println(a +" The number is prime");
	    }

		
	}

	public void primeBetweenTwoNo() {
		int n, counter;
		Scanner scanner = new Scanner(System.in);
		n = 21;

		System.out.print("Enter the n value : ");
		// n = scanner.nextInt();
		System.out.print("Prime numbers between 1 to " + n + " are \n");
		for (int i = 0; i <= n; i++) {
			counter = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 2)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		PrimeNo p = new PrimeNo();
		p.primeNum();
		p.primeBetweenTwoNo();

	}
}
