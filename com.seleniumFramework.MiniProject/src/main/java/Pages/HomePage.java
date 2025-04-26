package Pages;

import Base.BaseTest;
import PageObject.HomePageElements;
import Utils.ElementFetch;

public class HomePage extends BaseTest {
	ElementFetch el=new ElementFetch();
public void signInButton() {
	el.getWebElement("XPATH", HomePageElements.signInButton).click();
}
}
