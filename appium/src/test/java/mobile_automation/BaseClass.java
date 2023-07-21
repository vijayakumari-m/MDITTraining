package mobile_automation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	AndroidDriver driver;
	AppiumDriverLocalService service;

	@BeforeClass
	public void setUp() throws MalformedURLException {

		System.out.println("Starting the Appium Server..");

		/*
		 * //Code to Start the Appium Server 
		 * File appiumJS = new File(
		 * "C:\\Users\\Admin\\.android\\node_modules\\appium-uiautomator2-driver\\node_modules\\@appium\\support\\build\\lib\\main.js"
		 * ); 
		 * String ipAddress = " "; 
		 * int portnumber = 0; 
		 * service = new AppiumServiceBuilder().withAppiumJS(appiumJS).withIPAddress(ipAddress)
		 * .usingPort(portnumber).build(); service.start();
		 * 
		 * System.out.println("Appium server is started");
		 */

		// Port where the Appium server is running in our local machine
		String urlofAppiumServer = "http://127.0.0.1:4723";

		// Creating instance for URL class
		URL appiumServerUrl = new URL(urlofAppiumServer);
		// Creating instance for UiAutomator2Options class
		UiAutomator2Options options = new UiAutomator2Options();
		// Passing the device name
		options.setDeviceName("Pixel");
		// Path of the apk file
		options.setApp("D:\\Workspace\\appium\\src\\test\\resources\\ApiDemos-debug.apk");

		// Creating instance for AndroidDriver class
		driver = new AndroidDriver(appiumServerUrl, options);

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	
	@AfterClass
	public void tearDown() {

		driver.quit();

		System.out.println("Stoping the Appium Server..");
		//service.stop();
		System.out.println("Appium Server is Stopped");
		
	}

}
