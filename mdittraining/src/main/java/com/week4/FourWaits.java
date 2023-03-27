package com.week4;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FourWaits {

	public static void main(String[] args) throws Exception {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// Initialize the driver
		WebDriver driver = new ChromeDriver(co);
		
		// Get URL
		driver.get("https://hms.techcanvass.co/");
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		//Inspect Login ID field
		WebElement loginID = driver.findElement(By.id("txtUserName"));
		loginID.sendKeys("Pradnya");
		
		Thread.sleep(3000);
		//Inspect Password field
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		passWord.sendKeys("1994");
		
		//Explicit wait
		WebElement staySignin = new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.elementToBeClickable(By.id("chkstaysignedin")));
		staySignin.click();
				
		//Fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);

			   WebElement loginButton = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("LoginButton"));
			     }
			   });
		 loginButton.click();

	}

}
