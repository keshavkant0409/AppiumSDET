package realDevice;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Youtube{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

				
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.youtube");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.youtube.app.honeycomb.Shell$HomeActivity");
				
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.1:4723/wd/hub"),cap);
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"AGREE AND CONTINUE\")").click();
		driver.findElementByAndroidUIAutomator("text(\"phone number\")").sendKeys("8013887432");
		driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		driver.findElementByAndroidUIAutomator("text(\"CONTINUE\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Allow\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Allow\")").click();
		driver.findElementByAndroidUIAutomator("text(\"RESTORE\")").click();
		driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Type your name here\")").sendKeys("Keshav");
		driver.findElementByAndroidUIAutomator("text(\"NEXT\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Daily\")").click();
		driver.findElementByAndroidUIAutomator("text(\"CANCEL\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Include videos\")").click();
		driver.findElementByAndroidUIAutomator("text(\"DONE\")").click();*/
		
		
		
		
		
	}

}
