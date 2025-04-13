package com.practice.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	static {
		System.out.println("get.windowhandle(): This method helps to get the window handle of the current window");
		System.out.println("get.windowhandles(): This method helps to get the handles of all the windows opened");
		System.out.println(
				"set: This method helps to set the window handles in the form of a string. set<string> set= driver.get.windowhandles()");
		System.out.println("switch to: This method helps to switch between the windows");
		System.out.println("action: This method helps to perform certain actions on the windows");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement newWindow = driver.findElement(By.id("openwindow"));
		newWindow.click();
		//Current/Parent Window
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle +": Title :"+driver.getTitle());

		//Child window
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> itr=allWindowHandles.iterator();
		while(itr.hasNext()) {
			String child=itr.next();
			driver.switchTo().window(child);

			System.out.println("Title :"+driver.getTitle());

		}
		//System.out.println(allWindowHandles+": Title :"+driver.getTitle());
		
		driver.quit();
	}

}
