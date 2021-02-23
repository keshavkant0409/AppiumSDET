package realDevice;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChromeProram1 extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=setDesiredCapabilities("real");
		driver.get("http://facebook.com");
		

	}

}
