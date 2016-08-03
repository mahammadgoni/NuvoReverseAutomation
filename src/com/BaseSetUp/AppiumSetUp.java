package com.BaseSetUp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumSetUp {
	
	
	    public AndroidDriver driver;    
	
		public void setUp() throws MalformedURLException{
			
			//This statement will refer project's folder path.
			File classPathRoot = new File(System.getProperty("user.dir"));
			
			//Set folder name "Apps" where .apk file is stored.
			File appDir = new File(classPathRoot,"/App");
			
			//Set tested app .apk file name. 
			File app = new File(appDir,"app-staging-release.apk");
			
	        	
			// To Create DesiredCapabilities Object of DesiredCapabilities class
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			// Name of the OS
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			
			// Enter Device Android version here
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.4");
			
			//Enter your Device Name
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Androids Emulator");
			
			// Name of the app to be tested 
			capabilities.setCapability(MobileCapabilityType.APP, "app-staging-releas");
			
			//Enter your app package name
		//	capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"com.nuvoex.nuvoreverseapp.staging");
			
			// Mention your app activity
			//capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "MainActivity");
			
			
	        // Initialize Android Driver with URL and capabilities
			driver = new AndroidDriver(new URL("http://192.168.1.176:4723/wd/hub"), capabilities);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
		}
}
