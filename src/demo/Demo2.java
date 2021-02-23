package demo;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
 
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
 
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.SupportsNetworkStateManagement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class Demo2 {
 
	static AppiumDriver driver;
	public static void main(String[] args) throws IOException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "kkemulator");
		cap.setCapability(MobileCapabilityType.VERSION, "9.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ApiDemos");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Preference\").instance(0))"); 
		 MobileElement el=(MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']"));
		 el.click();
		//System.out.println(((FindsByAndroidUIAutomator<MobileElement>) driver).findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); 
	/*WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
	new TouchAction(driver).tap(tapOptions().withElement(element(expandList)))
	.waitAction(waitOptions(Duration.ofMillis(250))).perform();*/
}
}