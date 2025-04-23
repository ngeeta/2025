package com.practice.TestNG;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(dependsOnMethods = { "Test2" })

	public void Test1() {

		System.out.println("Executes After Test2");

	}

	@Test

	public void Test2() {

		System.out.println("Executes First");

	}
}
