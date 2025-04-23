package com.practice.TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class DependsOnGroups {
	
	@Test(dependsOnGroups = { "SignIn" })
    public void ViewAcc() {
        System.out.println("SignIn Successful");
    }
 
    @Test(groups = { "SignIn" })
    public void ViewAccLogIn() {
        System.out.println("Logging In Success");
    }
}
