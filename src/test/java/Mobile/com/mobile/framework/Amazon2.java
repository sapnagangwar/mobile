////launch application with app activity and package name(without setup file)
package Mobile.com.mobile.framework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Amazon2 {

	AndroidDriver dr;

	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		//	File app=new File("C:/Users/QA/Downloads/com.amazon.mShop.android.shopping.apk");

		DesiredCapabilities capibilities=new DesiredCapabilities();
		capibilities.setCapability("deviceName", "06975d170b30573a");
		capibilities.setCapability("platformVersion", "6.0.1");
		capibilities.setCapability("platformName", "Android");

		//		capibilities.setCapability("app", app.getAbsolutePath());

		capibilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		capibilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

		dr=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capibilities);

		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(dr.isAppInstalled("com.amazon.mShop.android.shopping"));
		Thread.sleep(6000);
		//dr.quit();
	}

}
