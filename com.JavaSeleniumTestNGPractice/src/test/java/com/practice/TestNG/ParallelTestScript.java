package com.practice.TestNG;

import org.testng.annotations.*;

public class ParallelTestScript {
static {
	System.out.println("<suite name = Parallel Test parallel = methods>");
	System.out.println("<suite name = Parallel Test parallel = test>");

}
	@Test
	public void add() {
		int sum=a()+b();
		System.out.println("addition is "+sum);
		System.out.println("Thread ID:"+Thread.currentThread().getId());
	}
	@BeforeMethod
	int a() {
		int num1=5;
	return num1;
	}
	@BeforeMethod
	int b() {
		int num2=10;
	return num2;
	}
	@Test
	public void sub() {
		int sub=b()+a();
		System.out.println("Substraction is "+sub);System.out.println("Thread ID:"+Thread.currentThread().getId());
	}
	
	@Test
	public void mul() {
		int mul=a()*b();
		System.out.println("mul is "+mul);System.out.println("Thread ID:"+Thread.currentThread().getId());
	}
	@Test
	public void div() {
		int div=b()/a();
		System.out.println("div is "+div);System.out.println("Thread ID:"+Thread.currentThread().getId());
	}
}
