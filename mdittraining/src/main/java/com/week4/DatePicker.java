package com.week4;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker {

	public static void main(String[] args) {

		//Adding ChromeOptions as Selenium 4.8.1 has some issues in connecting with chrome driver
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// Initialize the driver
		WebDriver driver = new ChromeDriver(co);
		
		// Get URL
		driver.get("https://jqueryui.com/datepicker/#buttonbar");

		driver.manage().window().maximize();

		// inspect the frame and switch to it
		WebElement demoFrame = null;
		WebElement dateField = null;
		WebElement date = null;
		
		//try catch block to handle when the exception occurs
		try {
			demoFrame = driver.findElement(By.className("demo-frame"));
		}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
		driver.switchTo().frame(demoFrame);
		
		try {
			dateField= driver.findElement(By.xpath("//input[@id='datepicker']"));
		}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
		dateField.click();
		
		try {
			date= driver.findElement(By.xpath("//td/a[text()='8']"));
		}
		catch (NoSuchElementException e) {
			System.out.println(e);
		}
		date.click();
		
		
		driver.quit();
		

	}

}
