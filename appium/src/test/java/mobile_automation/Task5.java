package mobile_automation;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Task5 {

	@Test

	public void takeScreeShot() throws IOException {

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
		
		//Capturing the screen shot using getScreenshotAs()
		File srcFile=driver.getScreenshotAs(OutputType.FILE);
	    //Creating jpg file to save the captured screen shot in the desired path  
	    File targetFile=new File("D:\\Workspace\\appium\\Screenshots\\view.jpg");
	    //Copying the screen shot in target file
	    FileUtils.copyFile(srcFile,targetFile);
	    
	    driver.quit();
	}
}
