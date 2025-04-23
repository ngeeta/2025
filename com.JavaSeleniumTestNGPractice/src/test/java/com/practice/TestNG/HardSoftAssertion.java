package com.practice.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;


public class HardSoftAssertion {
	Assertion hardAssert = new Assertion();
	Assertion softAssert = new SoftAssert();

static {
	System.out.println("Assertions help to verify the expected result and the actual result");
	System.out.println("priority -,0,no priority and positive");

}

@Test(priority=-1)
public void hardAssertion() {
	int a=1,b=2;
	System.out.println("Priority -1");
	softAssert.assertEquals(a, b);
	
}
@Test(priority=0)
public void hardAssertion1() {
	int a=1,b=2;
	System.out.println("priority 0");
	hardAssert.assertEquals(1, 1);
	
}
@Test
public void hardAssertion2() {
	int a=1,b=2;
	System.out.println("No priority");
	hardAssert.assertEquals(1, 1);

	
}
@Test(priority=1)
public void hardAssertion3() {
	int a=1,b=2;
	System.out.println("priority 1");
	hardAssert.assertEquals(1, 1);

	
}
}
