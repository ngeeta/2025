package PagesObject;

import org.testng.Assert;

import Base.BaseTest;
import Utils.ElementFetch;

public class LoginPage extends BaseTest {

	ElementFetch el=new ElementFetch();
	
	public void verifyLoginPageLoaded() {
		System.out.println("Title of Parent Page "+el.getTitle());
		el.windowSwitch();
		System.out.println("Title of Child Page "+el.getTitle());
		Assert.assertEquals(el.getTitle(), "Cogmento CRM");


	}
	
	public void enterCredentials() {
		el.getWebElement("NAME",property.getProperty("usernameName")).sendKeys("geeta@gmail.com");
		el.getWebElement("NAME", property.getProperty("passwordName")).sendKeys("12345");

	}
	
	
}
