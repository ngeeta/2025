package com.practice.TestNG;

import org.testng.annotations.*;

public class TestNGAnnotation {
	static {
		System.out.println("if @Test not avaiable then @Beforemethod & @AfterMethod wont execute ");
	}
	@Ignore
@Test
public void a() {
	System.out.println("From Test1 a");
}
@Test
public void aa() {
	System.out.println("From Test1 aa");
}
@BeforeMethod
public void b() {
	System.out.println("From @BeforeMethod");
}
@AfterMethod
public void c() {
	System.out.println("From @AfterMethod");
}
@BeforeClass
public void d() {
	System.out.println("From @BeforeClass");
}

@AfterClass
public void e() {
	System.out.println("From @AfterClass");
}
@BeforeTest
public void f() {
	System.out.println("From @BeforeTest1");
}
@BeforeTest
public void f1() {
	System.out.println("From @BeforeTest2");
}
@AfterTest
public void g() {
	System.out.println("From @AfterTest1");
}
@AfterTest
public void g1() {
	System.out.println("From @AfterTest2");
}
@BeforeSuite
public void h() {
	System.out.println("From @BeforeSuite");
}
@AfterSuite
public void i() {
	System.out.println("From @AfterSuite");
}

}
