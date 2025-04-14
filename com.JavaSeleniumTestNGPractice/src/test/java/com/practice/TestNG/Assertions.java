package com.practice.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertions {
	@Test
	public void assertion1() {
String expectedTxt="Facebook helps you connect and share with the people in your life.";
WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 By txt=By.className("_8eso");
 String tag=driver.findElement(txt).getTagName();
System.out.println("tag :"+tag);
 String actTxt=driver.findElement(txt).getText();
 
 Assert.assertEquals(actTxt, expectedTxt);
 
 Assert.assertTrue(driver.findElement(txt).isDisplayed());
 Assert.assertFalse(driver.findElement(txt).isSelected());

 }
	
	@Test
	public void assertion2() {
		//if above method is failed, it will execute another method
		//Scope of assertion is limited to method
	}
	
}
