package demo;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Tutorial2UIAutomator extends BaseClass{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> driver=setDesiredCapabilities();
		
		//driver.findElementByAndroidUIAutomator("attribute(\"value\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Preference\")").click();
		
		//driver.findElementByAndroidUIAutomator("new Uiselector().prperty(value)");
		
		//int el=driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size();
		
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	}

}
