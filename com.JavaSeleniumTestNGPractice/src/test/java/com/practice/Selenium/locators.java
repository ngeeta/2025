package com.practice.Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://practicetestautomation.com/");
//linkText for practice page

driver.findElement(By.xpath("//a[text()='Practice']")).click();

Thread.sleep(1000);
driver.findElement(By.linkText("Test Login Page")).click();
driver.quit();
	}

}
