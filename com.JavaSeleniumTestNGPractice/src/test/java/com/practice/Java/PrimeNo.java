package com.practice.Java;

import java.util.Scanner;

public class PrimeNo {
static String primeOrNot() {
	
	int a=5;
	int count = 0;
	
	for(int i=1;i<=a/2;i++) {
		if(a%i==0) {
			count++;
		}
	}
	if(count>1) {
		System.out.println(a+" is not prime");
	}
	else {
		System.out.println(a+" is prime");

	}
	return "";
	
}
	static void primeFromNos() {
		int num=20,count;
		
		for(int i=0;i<=num;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2)
				System.out.print(i+ ",");
		}
	}

	public static void main(String[] args) {

		PrimeNo p = new PrimeNo();
		
primeOrNot();
primeFromNos();
	}
}
