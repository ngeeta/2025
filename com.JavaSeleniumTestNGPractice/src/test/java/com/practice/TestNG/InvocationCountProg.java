package com.practice.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountProg {
	@Test(invocationCount = 5)
	public void hello() {
		System.out.println("Hello");
	}

	@Test(invocationCount = 5)

	public void testAddition() {

		int a, b, result;
		a = 2;
		b = 3;
		result = a + b;
		Assert.assertEquals(result, 5);
	}
}
