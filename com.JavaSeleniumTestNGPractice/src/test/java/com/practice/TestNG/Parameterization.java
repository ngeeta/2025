package com.practice.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	static {
		System.out.println("TestNG xml is mandatory <parameter name =fruit value=apple");
	}
	@Test

	@Parameters("fruit")

	   public void parameterTest(String fruit) {

	      System.out.println("Parameterized value is : " + fruit);

	   }
}
