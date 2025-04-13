package com.practice.AbstractInterface;

public class Math implements InterfaceMath2{

	@Override
	public void add(int a, int b, int c) {
int sum=a+b+c;	
System.out.println(sum);
	}

	@Override
	public void mul(int a, int b, int c) {
int m=a*b*c;	
System.out.println(m);

	}

	

	

}
