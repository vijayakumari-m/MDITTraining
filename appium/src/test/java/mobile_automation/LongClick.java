package mobile_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LongClick extends BaseClass {

	
	@Test
	public void longClickGesture() {

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();

		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "duration",2000
			));
		
		String actualMenu = driver.findElement(By.id("android:id/title")).getText();
		String expectedMenu = "Sample menu";
		
		Assert.assertEquals(actualMenu, expectedMenu);
		
		//KeyEvent enterKeyEvent = new KeyEvent(AndroidKey.ENTER);
		//driver.pressKey(enterKeyEvent);
	}

}
