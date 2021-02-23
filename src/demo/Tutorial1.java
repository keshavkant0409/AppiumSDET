package demo;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.appium.java_client.TouchAction;
import  static io.appium.java_client.touch.TapOptions.tapOptions;
import  static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Tutorial1 extends BaseClass{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver=setDesiredCapabilities();
		
	 
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("kkemulator");
		driver.findElement(By.id("android:id/button1")).click();
		
		
		/*((FindsByAndroidUIAutomator<AndroidElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Preference\").instance(0))");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();	*/
		
		/*TouchAction t=new TouchAction(driver);
		WebElement el=driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']"));
		t.tap(tapOptions().withElement(element(el))).waitAction(waitOptions(Duration.ofMillis(250))).perform();		*/
	
		
	}

	
	
}
