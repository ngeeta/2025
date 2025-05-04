package com.practice.TestNG;

import org.testng.annotations.*;

public class TestNGAnnotation2 {
	static {
		System.out.println("if @Test not avaiable then @Beforemethod & @AfterMethod wont execute ");
	}


@BeforeMethod
public void b() {
	System.out.println("From @BeforeMethod");
}

@BeforeTest
public void f() {
	System.out.println("From @BeforeTest1");
}
@BeforeTest
public void f1() {
	System.out.println("From @BeforeTest2");
}


}
