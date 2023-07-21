package mobile_automation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MobileTest extends BaseClass {
	
	//@Test
	public void firstTest() throws MalformedURLException {
		
		
		
		System.out.println("First Mobile Automation Script");
		
		//Locating Preference element using Appium inspector
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		//Selecting 3. Preference dependencies
		String preferenceDepXpath = "//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]";
		driver.findElement(By.xpath(preferenceDepXpath)).click();	
		
		//Check the WiFi checkbox
		driver.findElement(By.id("android:id/checkbox")).click();
		
		//Select Wifi Settings
		driver.findElement(By.className("android.widget.RelativeLayout")).click();
		
		//Assert the Alert window title
		String actualTitle = driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).getText();
		System.out.println(actualTitle);
		String expectedTitle = "WiFi settings";
		Assert.assertEquals(actualTitle, expectedTitle);
		
		//Send values to the text field
		driver.findElement(By.id("android:id/edit")).sendKeys("DemoWiFi");
		
		//Click ok button
		driver.findElement(By.id("android:id/button1")).click();
		
		
	}

}
