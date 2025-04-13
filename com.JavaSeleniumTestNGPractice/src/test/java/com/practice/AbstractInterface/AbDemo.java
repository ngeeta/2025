package com.practice.AbstractInterface;

public class AbDemo extends Ab2 {
	public AbDemo(double radius) {
		super(radius);
		System.out.println("abdemo "+radius);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Ab1-print display shape & cal area abstract meth
		//Ab2-overloaded area using radius value in constructor
		AbDemo ab = new AbDemo(2);
		ab.display();
		System.out.println(ab.calculateArea());
		
		

	}

}
