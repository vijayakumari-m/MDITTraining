package com.week4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenShots {

	public static void main(String[] args) throws Exception {


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// Initialize the driver
		WebDriver driver = new ChromeDriver(co);

		// Get URL
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		driver.manage().window().maximize();

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='red']"));
		checkbox1.click();

		WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='blue']"));
		checkbox2.click();

		WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='purple']"));
		checkbox3.click();
		
		ScreenShot ss = new ScreenShot();
		ss.takeScreenShots(driver, "D:\\Workspace\\mdittraining\\ScreenShots\\ironspider.png");

		driver.close();

	}
	
}

class ScreenShot{
	
	public void takeScreenShots(WebDriver driver, String filePath) throws IOException {

		// TakesScreenshots - Interface
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(filePath);

		FileUtils.copyFile(src, dest);
	}
	
}
