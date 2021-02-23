package demo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import  static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import  static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Gesture_Swipe extends BaseClass{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=setDesiredCapabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		WebElement first=driver.findElement(By.xpath("//*[@content-desc='15']"));
		WebElement second=driver.findElement(By.xpath("//*[@content-desc='45']"));
		TouchAction touch=new TouchAction(driver);
		touch.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
		
		
		
		
		
	}

}
