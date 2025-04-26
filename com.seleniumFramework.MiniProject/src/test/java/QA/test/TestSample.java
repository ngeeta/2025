package QA.test;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.ElementFetch;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

public class TestSample extends BaseTest{
ElementFetch el=new ElementFetch();
HomePage hm=new HomePage();
LoginPage lp=new LoginPage();

@Test
public void sampleMethodToForEnteringCred() {
	logger.info("Sign in into Login Page");
	hm.signInButton();
	logger.info("verify Title");

	lp.verifyLoginPageLoaded();
	logger.info("Enter credentials");

	lp.enterCredentials();
}
}
