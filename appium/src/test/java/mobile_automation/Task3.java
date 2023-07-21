package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Task3 {

	@Test
	public void scrollGesture() throws MalformedURLException {

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

		// Navigating to Photos menu to perform swipe action
		driver.findElement(AppiumBy.accessibilityId("View")).click();
		
		//Scrolling to down to select the web view
		
		((JavascriptExecutor)driver).executeScript("mobile:scrollGesture", ImmutableMap.of(
				"direction", "down",
				"left", 100,
				"top", 100,
				"width", 200,
				"height", 200,
				"percent", 3
				
				));
		
		driver.quit();
				
	}
}
