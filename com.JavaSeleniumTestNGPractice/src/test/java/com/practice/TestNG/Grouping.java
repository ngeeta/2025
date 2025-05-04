package com.practice.TestNG;

import org.testng.annotations.Test;

public class Grouping {
	static {
		System.out.println("testng.xml is mandatory groups tag in testng add-><groups><run> <include name=\"s.*\"></include>");
	}
	@Test(groups = {"smoke"})

    public void test1() {

                   System.out.println("This is Test case 1-smoke");

    }
   

    @Test(groups = {"sanity"})

    public void test2() {

                   System.out.println("This is Test case 2-sanity");

    }
   

    @Test(groups = {"regression"})

    public void test3() {

                   System.out.println("This is Test case 3-regression");

    }

   
    @Test(groups = {"smoke", "regression"})

    public void test4() {

                   System.out.println("This is Test case 4");

    }
}
