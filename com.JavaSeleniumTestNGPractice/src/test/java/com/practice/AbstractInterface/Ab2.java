package com.practice.AbstractInterface;

public abstract class Ab2 extends Ab1 {

	private double radius;

    public Ab2(double radius) {
        this.radius = radius;
        System.out.println("Ab2 Constructor "+radius);
    }

    @Override
    public double calculateArea() {
    	double area = radius * radius * 3.14;
		System.out.println("Ab2 calculateArea " + area);

    	return area;

    }

}
