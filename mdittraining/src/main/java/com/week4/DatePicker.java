package com.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// Initialize the driver
		WebDriver driver = new ChromeDriver(co);
		
		// Get URL
		driver.get("https://jqueryui.com/datepicker/#buttonbar");

		driver.manage().window().maximize();

		// inspect the frame and switch to it
		WebElement demoFrame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(demoFrame);

		WebElement dateField = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateField.click();

		WebElement date = driver.findElement(By.xpath("//td/a[text()='8']"));
		date.click();

		driver.close();

	}

}
