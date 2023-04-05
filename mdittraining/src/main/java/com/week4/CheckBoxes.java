package com.week4;

import java.util.List;
import java.util.Scanner;

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

		// Get URL
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		driver.manage().window().maximize();
		
		//Pass any three colours to the String variable
		String colour1 = "red";
		String colour2 = "blue";
		String colour3 = "purple";

		//Inspect all the colours checkbox and store it in a list
		List<WebElement> checkBoxOptions = driver.findElements(By.xpath("//input[@type='checkbox']"));

		//Loop through the list and if the desire variable/colour comes, then select them
		for (WebElement options : checkBoxOptions) {
			
			//Get the value of the attribute "value"
			String colour = options.getAttribute("value");

			if (colour.equalsIgnoreCase(colour1)||colour.equalsIgnoreCase(colour2)||colour.equalsIgnoreCase(colour3)) {

				options.click();
			}
		}

		driver.quit();

	}

}
