package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Task4 {
	
	
	@Test
	public void cameraFunction() throws MalformedURLException {
		
		URL appiumServerUrl = new URL("http://127.0.0.1:4723");

		// Creating options for UiAutomator2Options
		UiAutomator2Options options = new UiAutomator2Options();

		// passing the device name created as Android Virtual DEvice
		options.setDeviceName("Pixel");
		
		// Creating instace for AndroidDriver
		AndroidDriver driver = new AndroidDriver(appiumServerUrl, options);
		
		//Creating instance for the WebDriverWait class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.accessibilityId("View"))));
		
		driver.quit();
		
	}

}
