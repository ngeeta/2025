package com.practice.AbstractInterface;

import java.lang.classfile.Superclass;

public class ChildClass extends BaseClass implements InterfaceMath1{
	@Override
	public String drive() {
int a=5;		return super.drive();
	}
	public ChildClass(int a) {
		System.out.println("Def Constructor chil");
	}
	
	public ChildClass(String y) {
		super(y);
	}
	
	@Override
	public void nonStaticMethod() {
		// TODO Auto-generated method stub
		System.out.println("Overrided nonStaticMethod from child");
	}
	public static void staticMethod() {
		System.out.println("Child : : Static Method");
	}
public static void main(String[] args) {
	ChildClass c=new ChildClass(5);
	c.nonStaticMethod();
	//ChildClass c1=new ChildClass("m");

	BaseClass b=new BaseClass();
	b.nonStaticMethod();
	staticMethod();
	b.m2();
	System.out.println(b.drive());
	System.out.println("-----------");
	final BaseClass b1=new ChildClass(0);
	System.out.println(b1.drive());
	
	
}
@Override
public void add(int a, int b, int c) {
	// TODO Auto-generated method stub
	
}
}
