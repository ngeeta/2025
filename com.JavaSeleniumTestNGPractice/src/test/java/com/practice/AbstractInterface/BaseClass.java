package com.practice.AbstractInterface;

import com.practice.Java.GrandBaseClass;

public class BaseClass extends GrandBaseClass{
	 protected String drive() {
		 int a=1;
	        return "Driving car"+a;
	    }
	public BaseClass() {
		System.out.println("Base:: Default Constructor");
	}

	BaseClass(String a) {
		System.out.println("Base:: Parameterize Constructor " + a);
	}

	public void nonStaticMethod() {
		System.out.println("Non Static Method");
	}

	public static void staticMethod() {
		System.out.println("Base : : Static Method");
	}

//private methods are not overridden
	private void m1() {
		System.out.println("From parent m1()");
	}

	protected void m2() {
		System.out.println("From parent m2()");
	}

}
