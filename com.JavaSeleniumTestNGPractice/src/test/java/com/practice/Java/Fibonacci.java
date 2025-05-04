package com.practice.Java;

public class Fibonacci {
	//1,2,3,5,8,13,21,34,55,89
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1,b=2,c;
int num=10;
System.out.print(a+ ","+b+",");
for(int i=2;i<num;i++) {
	c=a+b;
	System.out.print(c+",");
	a=b;
	b=c;
}

	}

}
