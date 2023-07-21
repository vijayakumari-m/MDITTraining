package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumTask1 {

	public void function() throws MalformedURLException {
		
		URL appiumServerUrl = new URL("http://127.0.0.1:4723");
		// Creating instance for UiAutomator2Options class
		UiAutomator2Options options = new UiAutomator2Options();
		// Passing the device name
		options.setDeviceName("Pixel");
		// Path of the apk file
		options.setApp("D:\\Workspace\\appium\\src\\test\\resources\\ApiDemos-debug.apk");

		// Creating instance for AndroidDriver class
		AndroidDriver driver = new AndroidDriver(appiumServerUrl, options);
	}

}
