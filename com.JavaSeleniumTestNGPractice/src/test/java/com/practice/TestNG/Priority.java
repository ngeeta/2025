package com.practice.TestNG;

import org.testng.annotations.Test;

public class Priority {
@Test(priority = 1)
public void a() {
	System.out.println("a 1 priority");
}
@Test(priority = 0)
public void b() {
	System.out.println("b 0 priority ");
}
@Test
public void c() {
	System.out.println("c no priority");
}
@Test(priority = -5)
public void d() {
	System.out.println("d -5");
}
}
