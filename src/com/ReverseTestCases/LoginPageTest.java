package com.ReverseTestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjects.AwbDetailsAndAction;
import com.PageObjects.LoginAndLogoutPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LoginPageTest{
	
	AppiumDriver<WebElement> driver;
	
	
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		
DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("appium-version", "1.0");
		
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("platformVersion", "6.0");
		
		//capabilities.setCapability("deviceName", "Google Nexus 5");
		
		capabilities.setCapability("deviceName", "Micromax AQ4501");
		
		//capabilities.setCapability("deviceName", "Y541-U02");
		
		capabilities.setCapability("app", "/Users/eshan/Documents/workspace/NuvoExReverse/App/reverse-staging.apk");
		
		capabilities.setCapability("appPackage", "com.nuvoex.nuvoreverseapp.staging");
		
		capabilities.setCapability("appActivity", "com.nuvoex.nuvoreverseapp.LoginActivity");
		
		driver = new AndroidDriver<WebElement>(new URL("http://192.168.1.22:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		

	}
	
	@Test(priority=1)
	public void loginTest(){
		
		LoginAndLogoutPage obj = new LoginAndLogoutPage(driver);
		
		obj.loginToAccount("arun.kumar1", "arun");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		System.out.println(driver.getContext());
			
		
		
		
	}
	
	@Test(priority=2)
	public void getAWBListTest(){
		AwbDetailsAndAction awb = new AwbDetailsAndAction(driver);
		awb.getAwbList();
	}
	
	@AfterClass
	public void tearDown(){
		//driver.close();
	}

	

}
