package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest {
	
	@Test
	public void homePageCheck() throws MalformedURLException {
		
		DesiredCapabilities dcaps = new DesiredCapabilities();
		
		dcaps.setCapability(CapabilityType.BROWSER_NAME,  "Chrome");
		dcaps.setCapability(CapabilityType.BROWSER_VERSION, "100");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), dcaps);
		driver.get("https://techedge.techcanvass.co/Login.aspx");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
