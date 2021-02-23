package realDevice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import  static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import  static io.appium.java_client.touch.offset.ElementOption.element;

public class DragandDrop extends BaseClass1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=setDesiredCapabilities("real");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		WebElement source=driver.findElementsByClassName("android.view.View").get(0);
		WebElement dest=driver.findElementsByClassName("android.view.View").get(1);
		
		TouchAction touch=new TouchAction(driver);
		//touch.longPress(longPressOptions().withElement(element(source))).moveTo(element(dest)).release().perform();
		touch.longPress(element(source)).moveTo(element(dest)).release().perform();
		
		

	}

}
