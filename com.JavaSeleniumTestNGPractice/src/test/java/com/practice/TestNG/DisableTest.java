package com.practice.TestNG;

import org.testng.annotations.*;

public class DisableTest {
	static {
		System.out.println("if @Test not avaiable then @Beforemethod & @AfterMethod wont execute ");
	}
	@Test(invocationCount = 0)
	public void t1() {
		System.out.println("@Test");
	}
	@AfterMethod()
	public void t2() {
		System.out.println("@AfterMethod ");
	}
	@BeforeMethod()
	public void t3() {
		System.out.println("@BeforeMethod");
	}
	
	@BeforeClass()
	public void t4() {
		System.out.println("@BeforeClass");
	}
	@AfterClass()
	public void t8() {
		System.out.println("@AfterClass");
	}
	@BeforeTest()
	public void t5() {
		System.out.println("@BeforeTest");
	}@BeforeSuite()
	public void t6() {
		System.out.println("@beforeSuite");
	}
	@Test(enabled = false)
	public void t7() {
		System.out.println("@Test");
	}

}
