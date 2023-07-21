package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Task8 {

	@Test
	public void longClickGesture() throws MalformedURLException {
	
		// Creating instace for URL class to initialize the appium server url
		URL appiumServerUrl = new URL("http://127.0.0.1:4723");

		// Creating options for UiAutomator2Options
		UiAutomator2Options options = new UiAutomator2Options();

		// passing the device name created as Android Virtual DEvice
		options.setDeviceName("Pixel");

		// Passing the path of the application to be tested in android device
		options.setApp("D:\\Workspace\\appium\\src\\test\\resources\\ApiDemos-debug.apk");
		// Creating instace for AndroidDriver
		AndroidDriver driver = new AndroidDriver(appiumServerUrl, options);

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();

		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		//long click gesture
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "duration",2000
			));
		
		String actualMenu = driver.findElement(By.id("android:id/title")).getText();
		String expectedMenu = "Sample menu";
		
		Assert.assertEquals(actualMenu, expectedMenu);
	}

}
