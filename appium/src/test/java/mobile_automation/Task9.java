package mobile_automation;

import java.io.File;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Task9 {

	@Test
	public void stopAppiumServer() {
		
		
		int port =4723;
		File appiumJSFile = new File("C:\\Users\\Admin\\.android\\node_modules\\appium-uiautomator2-driver\\node_modules\\@appium\\support\\build\\lib\\main.js");
		String ipAddress = "127.0.0.1";
		
		//Creating instance forAppiumDriverLocalService
		AppiumDriverLocalService service = new AppiumServiceBuilder().usingPort(port).withAppiumJS(appiumJSFile).withIPAddress(ipAddress).build();
		
		System.out.println("Starting the Appium Server..");
		//Start the service
		service.start();
		
		System.out.println("Appium Server is Started");
		
		System.out.println("Stoping the Appium Server..");
		//stop the service
		service.stop();
		System.out.println("Appium Server is Stopped");
		
	}
}
