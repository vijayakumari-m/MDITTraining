package com.week4;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
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
		
		WebElement speed = null;
		WebElement files = null;
		WebElement titlefield = null;
		WebElement number = null;
		
		try {
			//Select speed as Medium 
			speed = driver.findElement(By.id("speed-button"));
			speed.click();
		
			//Implement Actions class to use mouse or keyboard actions
			Actions act = new Actions(driver);
			act.click(speed);//click on speed menu from the drop down
			act.sendKeys(Keys.ARROW_DOWN).build().perform();//press down arrow from the keyboard
			act.sendKeys(Keys.ARROW_UP).build().perform(); // press down arrow from the keyboard
				
			//Select a title 
			titlefield = driver.findElement(By.id("salutation-button"));
			titlefield.click();
				
				
			act.click(titlefield);//click on desire title from the drop down
			act.sendKeys(Keys.ARROW_DOWN).build().perform();//press down arrow from the keyboard
			act.sendKeys(Keys.ARROW_DOWN).build().perform();//press down arrow from the keyboard
				
			//Select files 
			files = driver.findElement(By.id("files-button"));
				
			act.click(files);//click on desire file from the drop down
			act.sendKeys(Keys.ARROW_DOWN).build().perform();//press down arrow from the keyboard
				
			//Select number 
			number = driver.findElement(By.id("number-button"));
				
			act.click(number);//click on desire number from the drop down
			act.sendKeys(Keys.ARROW_DOWN).build().perform();//press down arrow from the keyboard
			act.sendKeys(Keys.ARROW_DOWN).build().perform();//press down arrow from the keyboard
			act.sendKeys(Keys.ARROW_DOWN).build().perform();//press down arrow from the keyboard
				
		}
		
		
		catch (NoSuchElementException e) {
			
			System.out.println(e);
		}
		
		driver.close();
	
	
	}

}
