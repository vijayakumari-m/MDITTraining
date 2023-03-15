package com.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxes {

	public static void main(String[] args) {


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// Initialize the driver
		WebDriver driver = new ChromeDriver(co);
						
		//Get URL
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
						
		driver.manage().window().maximize();
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='red']"));
		checkbox1.click();
		
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='blue']"));
		checkbox2.click();
		
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='purple']"));
		checkbox3.click();
		
		driver.close();

	}

}
