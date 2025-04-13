package com.practice.AbstractInterface;

public interface InterfaceMath2 extends InterfaceMath1{
	public static int mul(int a, int b) {
		int c=a*b;
		return c;
	}
	public static int div(int a, int b) {
		int c=a/b;
		return c;
	}
	public void mul(int a,int b,int c);

}

