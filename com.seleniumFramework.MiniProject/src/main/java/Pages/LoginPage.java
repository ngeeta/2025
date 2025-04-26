package Pages;

import org.testng.Assert;

import PageObject.LoginPageElements;
import Utils.ElementFetch;

public class LoginPage {

	ElementFetch el=new ElementFetch();
	
	public void verifyLoginPageLoaded() {
		System.out.println("Title of Parent Page "+el.getTitle());
		el.windowSwitch();
		System.out.println("Title of Child Page "+el.getTitle());
		Assert.assertEquals(el.getTitle(), "Cogmento CRM1");


	}
	
	public void enterCredentials() {
		el.getWebElement("NAME", LoginPageElements.usernameName).sendKeys("geeta@gmail.com");
		el.getWebElement("NAME", LoginPageElements.passwordName).sendKeys("12345");

	}
	
	
}
