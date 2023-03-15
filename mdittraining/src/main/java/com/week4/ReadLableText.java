package com.week4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadLableText {

	public static void main(String[] args) {


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// Initialize the driver
		WebDriver driver = new ChromeDriver(co);

		// Get URL
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		driver.manage().window().maximize();
		
		
		System.out.println(driver.getTitle());
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//form[contains(text(),'favourite colors')]/input"));
		System.out.println("Number of Check Boxes: "+checkBoxes.size());
	
		
		for(WebElement checkBox :checkBoxes){
			
			
			 
			 System.out.println(checkBox.getAttribute("value"));

		  }


		//driver.close();

	}

}
