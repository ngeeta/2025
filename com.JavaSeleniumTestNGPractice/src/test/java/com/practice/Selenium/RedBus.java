package com.practice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class RedBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String src="Ashirwad Theatre, Nagpur";
		String dest="Swargate, Pune";
		driver.findElement(By.id("src")).sendKeys(src);
		driver.findElement(By.id("dest")).sendKeys(dest);

		
	}

}
