package QA.test;

import Base.BaseTest;
import PagesObject.HomePage;
import PagesObject.LoginPage;
import Utils.ElementFetch;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

public class TestSample extends BaseTest{
ElementFetch el=new ElementFetch();
HomePage hm=new HomePage();
LoginPage lp=new LoginPage();

@Test
public void sampleMethodToForEnteringCred() throws InterruptedException {
	logger.info("Sign in into Login Page");
	hm.signInButton();
	Thread.sleep(2000);
	logger.info("verify Title");

	lp.verifyLoginPageLoaded();
	logger.info("Enter credentials");

	lp.enterCredentials();
}
}
