package com.practice.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DateSelection {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	public void seleniumBlog() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		// click-calender will appear
		driver.findElement(By.id("datepicker")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='ui-datepicker-title']")));
		String amonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String ayear = driver.findElement(By.className("ui-datepicker-year")).getText();

		while (!(amonth.equals("July") && ayear.equals("2025"))) {
			driver.findElement(By.xpath("//*[@data-handler='next']")).click();
			amonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			ayear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		driver.findElement(By.xpath("//*[@class='ui-state-default' and text()='3']")).click();
Thread.sleep(5000);
	
	}
	
	public void redBus() throws InterruptedException {
		driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	driver.findElement(By.className("dateText")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("labelCalendarContainer")));
	}
	public static void main(String[] args) throws InterruptedException {
DateSelection d=new DateSelection();
d.seleniumBlog();}
}