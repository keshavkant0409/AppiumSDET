package demo;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;

import  static io.appium.java_client.touch.TapOptions.tapOptions;
import  static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import  static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver; 
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.WaitOptions.waitOptions;

import static java.time.Duration.ofSeconds;

public class Gestureclass_TouchAction extends BaseClass{
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver=setDesiredCapabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Tap
		TouchAction touch=new TouchAction(driver);
		//WebElement expandlist=driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");	
		
		WebElement expandlist=driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));	
		touch.tap(tapOptions().withElement(element(expandlist))).waitAction(waitOptions(Duration.ofMillis(250))).perform();
		WebElement CustomAdapter=driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']"));
		touch.tap(tapOptions().withElement(element(CustomAdapter))).perform();
		
		WebElement PeopleNames=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		touch.longPress(longPressOptions().withElement(element(PeopleNames)).withDuration(ofSeconds(1))).release().perform();
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
		
		
	}

}
