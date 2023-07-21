package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Task10 {

	@Test

	public void getDeviceOrientation() throws MalformedURLException {

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
		
		//Get the Orientation of the device
		String orientation = driver.getOrientation().value();
		System.out.println("Orientation of the device : "+orientation);
	}

}
