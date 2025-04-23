package com.practice.TestNG;

import org.testng.annotations.Test;

public class TimeOut {
	static {
		System.out.println("can be use in testng-<suite name= Test Suite time-out=500>\n"
				+ "<test name=Test1 verbose=2 time-out=300>	\nTestNG will label it as a failed test and terminate the execution");
	}
	@Test ( timeOut = 500 )

	public void timeOutExample(){

System.out.println();
	}
}
