package com.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {

	public static void main(String[] args) {
		
	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// Initialize the driver
		WebDriver driver = new ChromeDriver(co);
				
		//Get URL
		driver.get("https://jqueryui.com/selectmenu/");
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				
		//inspect the frame and switch to it
		WebElement demoFrame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(demoFrame);
			
		//Select speed as Medium using index
		WebElement speed = driver.findElement(By.id("speed-button"));
		speed.click();
		WebElement speedOption = driver.findElement(By.xpath("//span[text()='Medium']"));
		speedOption.click();

		//Select speedSelect = new Select(speedOption);
		//speedSelect.selectByIndex(1);
		
		//Select a title using Visible text
		WebElement title = driver.findElement(By.id("salutation"));
		
		Select titleSelect = new Select(title);
		titleSelect.selectByVisibleText("Mrs.");
		
		//Select files using value
		WebElement files = driver.findElement(By.id("files"));
		
		Select filesSelect = new Select(files);
		filesSelect.selectByValue("ui.jQuery.js");
		
		//Select number using index
		WebElement number = driver.findElement(By.id("number"));
		
		Select numberSelect = new Select(number);
		numberSelect.selectByIndex(3);
		
		//driver.close();
	
	
	}

}
