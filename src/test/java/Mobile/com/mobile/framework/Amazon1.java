package Mobile.com.mobile.framework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Amazon1 {
	
	//WebDriver dr;
	AndroidDriver dr;
	
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		File app=new File("C:/Users/QA/Downloads/com.amazon.mShop.android-5.2.0-APK4Fun.com.apk");
		
		DesiredCapabilities capibilities=new DesiredCapabilities();
		capibilities.setCapability("deviceName", "06975d170b30573a");
		capibilities.setCapability("platformVersion", "6.0.1");
		capibilities.setCapability("platformName", "Android");
		
		capibilities.setCapability("app", app.getAbsolutePath());
		
		dr=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capibilities);
		
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(6000);
		
		dr.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.amazon.mShop.android:id/skip_sign_in_button\")").click();
		
		//Get present screen orientation and change the orientation
		dr.getOrientation();
		
		Thread.sleep(3000);
		
		if(dr.getOrientation().equals("LANDSCAPE")){
			dr.rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
		}
		else{
			dr.rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
		}
		
		
	  // dr.quit();
	}

}
