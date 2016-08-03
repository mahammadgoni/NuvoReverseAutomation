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
import com.PageObjects.CompletePickUpAction;
import com.PageObjects.LoginAndLogoutPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SampleTest {
	
AppiumDriver<WebElement> driver;
	
	
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("appium-version", "1.0");
		
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("platformVersion", "4.4");
		
		//capabilities.setCapability("deviceName", "Google Nexus 5");
		
		capabilities.setCapability("deviceName", "Y541-U02");
		
		capabilities.setCapability("app", "/Users/eshan/Documents/workspace/NuvoExReverse/App/app-staging-release.apk");
		
		capabilities.setCapability("appPackage", "com.nuvoex.nuvoreverseapp.staging");
		
		capabilities.setCapability("appActivity", "com.nuvoex.nuvoreverseapp.LoginActivity");
		
		driver = new AndroidDriver<WebElement>(new URL("http://192.168.1.229:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		

	}
	
	@Test(priority=0)
	public void loginTest(){
		
		LoginAndLogoutPage obj = new LoginAndLogoutPage(driver);
		
		obj.loginToAccount("arun.kumar1", "arun");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//System.out.println(driver.getContext());
			
	}
	@Test(priority=1)
	public void selectAwbTest(){
		AwbDetailsAndAction awb = new AwbDetailsAndAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		awb.selectAwbAndUpdate();
	}
	@Test(priority=2)
	public void selectCompleteTest(){
		CompletePickUpAction com = new CompletePickUpAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		com.selectCompletePick();
	}
	@Test(priority=3)
	public void takeAnImgTest() throws InterruptedException{
		CompletePickUpAction img = new CompletePickUpAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		img.takeAnImg();
		//img.refreshImg();
		Thread.sleep(10);
		img.nextStep();
	}
	
	@Test(priority=4)
	public void signInTest(){
		CompletePickUpAction sign = new CompletePickUpAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		sign.signInAndProceed();
	}
	
	@Test(priority=5)
	public void enterQRCodeTest(){
		CompletePickUpAction code = new CompletePickUpAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		code.enterQrAndUpdateStatus("Auto007");
	}
	
	@Test(priority=6)
	public void logoutTest() throws InterruptedException{	
	LoginAndLogoutPage obj = new LoginAndLogoutPage(driver);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	obj.logoutFromAccount();
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();
	}

}
