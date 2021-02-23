package demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass {

//	public static void main(String[] args) throws MalformedURLException 
	public static AndroidDriver<AndroidElement> setDesiredCapabilities() throws MalformedURLException
	{
		File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "kkemulator");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		
		
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.1:4723/wd/hub"),cap);
		
	//	AppiumDriver<MobileElement> driver=new AppiumDriver<MobileElement>(new URL("http://127.0.1:4723/wd/hub"),cap);
		
		
		return driver;
	}
	
	
}
