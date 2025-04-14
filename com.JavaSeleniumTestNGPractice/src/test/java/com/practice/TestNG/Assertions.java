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
 String tag=driver.findElement(By.className("_8eso")).getTagName();
System.out.println("tag :"+tag);
 String actTxt=driver.findElement(By.className("_8eso")).getText();
 
 Assert.assertEquals(actTxt, expectedTxt);
 }
	
}
