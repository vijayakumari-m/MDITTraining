package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Task2 {
	
	@Test
	public void swipeGesture() throws MalformedURLException {
		
		//Creating instace for URL class to initialize  the appium server url
		URL appiumServerUrl = new URL("http://127.0.0.1:4723");
		
		//Creating options for UiAutomator2Options
		UiAutomator2Options options= new UiAutomator2Options();
		
		//passing the device name created as Android Virtual DEvice 
		options.setDeviceName("Pixel");
		
		//Passing the path of the application to be tested in android device
		options.setApp("D:\\Workspace\\appium\\src\\test\\resources\\ApiDemos-debug.apk");
		
		//Creating instace for AndroidDriver
		AndroidDriver driver = new AndroidDriver(appiumServerUrl, options);
		
		//Navigating to Photos menu to perform swipe action
		driver.findElement(AppiumBy.accessibilityId("View")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
		
		//Swipe Action 
		RemoteWebElement src = (RemoteWebElement) driver.findElement(By.xpath("android.widget.ImageView[1]"));
		((JavascriptExecutor)driver).executeScript("mobile:swipeGesture", ImmutableMap.of(
				"elemntId",((RemoteWebElement) src ).getId(),
				"endX", 100,
				"endY", 200
				));
		
		driver.quit();
		
	}

}
