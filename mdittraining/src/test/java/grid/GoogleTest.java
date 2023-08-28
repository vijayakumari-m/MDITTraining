package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void homePageCheck() throws Exception {
		
		ChromeOptions co = new ChromeOptions();
		co.setCapability("browserName", "chrome");
		co.setCapability("se:name", "Google Search");
		co.setCapability("se:sampleMetadata", "Sample metadata value");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), co);
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("test automation");
		driver.close();
	}
	
	@Test
	public void openFaceBook() throws MalformedURLException {
		ChromeOptions co = new ChromeOptions();
		co.setCapability("browserName", "firefox");
		co.setCapability("se:name", "FaceBook");
		co.setCapability("se:sampleMetadata", "Sample metadata value");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), co);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
