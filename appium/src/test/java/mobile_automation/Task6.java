package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Task6 {

	@Test
	public void getElementText() throws MalformedURLException {

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

		// Navigating from Preference menu
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();

		// Navigating to Preference dependencies
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();

		// Navigating to Wifi menu and check the checkbox
		driver.findElement(By.id("android:id/checkbox")).click();

		// Navigating to WiFi setting menu
		driver.findElement(By.xpath("android.widget.RelativeLayout[2]")).click();

		//Get the text of the title using getText()
		String actualTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		String expectedTitle = "WiFi Settings";
		// Assert the title of alert window
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.quit();
	}

}
