package com.week4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButtons {

	public static void main(String[] args) throws Exception {


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// Initialize the driver
		WebDriver driver = new ChromeDriver(co);

		// Get URL
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		driver.manage().window().maximize();
		
		//Inspect the element to be selected
		WebElement mozillaRadioButton = driver.findElement(By.xpath("//form[contains(text(),'current web browser')]/input[2]"));
		
		//Scroll down to the specified element using JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", mozillaRadioButton) ; 
		Thread.sleep(2000);
		
		//click the specified option
		mozillaRadioButton.click();
		
		
		driver.quit();

	}

}
