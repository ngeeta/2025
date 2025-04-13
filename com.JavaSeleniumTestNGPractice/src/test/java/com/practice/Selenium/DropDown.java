package com.practice.Selenium;

import static org.testng.Assert.assertEquals;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert; 
public class DropDown {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
WebElement we=driver.findElement(By.id("dropdown-class-example"));
Select sel=new Select(we);

List<WebElement> actWe=sel.getOptions();
ArrayList<String> expOp=new ArrayList<String>(Arrays.asList("Select","Option1","Option2","Option3"));
ArrayList<String> actOp=new ArrayList<String>();

for(int i=0;i<actWe.size();i++) {
	actOp.add(actWe.get(i).getText());
}
System.out.println(actOp);
System.out.println(expOp);

Assert.assertEquals(actOp, expOp);

	}
	

}
