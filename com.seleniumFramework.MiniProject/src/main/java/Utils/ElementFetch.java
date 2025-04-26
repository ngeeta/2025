package Utils;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseTest;

public class ElementFetch {
public WebElement getWebElement(String identifierType,String identifierValue) {
	switch (identifierType) {
	case "XPATH":
		return BaseTest.driver.findElement(By.xpath(identifierValue));
	
	case "CSS":
		return BaseTest.driver.findElement(By.cssSelector(identifierValue));
	case "ID":
		return BaseTest.driver.findElement(By.id(identifierValue));
	case "NAME":
		return BaseTest.driver.findElement(By.name(identifierValue));
	case "TAGNAME":
		return BaseTest.driver.findElement(By.tagName(identifierValue));
	default:
		return null;
	}
	
	
}
public List<WebElement> getWebElements(String identifierType,String identifierValue) {
	switch (identifierType) {
	case "XPATH":
		return BaseTest.driver.findElements(By.xpath(identifierValue));
	
	case "CSS":
		return BaseTest.driver.findElements(By.cssSelector(identifierValue));
	case "ID":
		return BaseTest.driver.findElements(By.id(identifierValue));
	case "NAME":
		return BaseTest.driver.findElements(By.name(identifierValue));
	case "TAGNAME":
		return BaseTest.driver.findElements(By.tagName(identifierValue));
	default:
		return null;
	}
	
	
}
public String getTitle() {
	String title=BaseTest.driver.getTitle();
	return   title;
}
public void windowSwitch() {
	String mainwindow=BaseTest.driver.getWindowHandle();
	Set<String> window=BaseTest.driver.getWindowHandles();
	for(String windowHandle:window) {
		if(!windowHandle.equals(mainwindow)) {
			BaseTest.driver.switchTo().window(windowHandle);
			break;
		}
	}
}
}
