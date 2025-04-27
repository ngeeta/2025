package PagesObject;

import Base.BaseTest;
import Utils.ElementFetch;

public class HomePage extends BaseTest {
	ElementFetch el=new ElementFetch();
public void signInButton() {
	//el.getWebElement("XPATH", HomePageElements.signInButton).click();
	el.getWebElement("XPATH", property.getProperty("signInButton")).click();;
	System.out.println("properttyyyyyy : : +"+(property.getProperty("signInButton")));
}
}
