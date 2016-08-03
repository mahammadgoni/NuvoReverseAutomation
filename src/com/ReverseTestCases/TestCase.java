package com.ReverseTestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestCase {
	
	public static AppiumDriver<WebElement> driver;
	
	 public static void main(String[] args) throws MalformedURLException {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setCapability("appium-version", "1.0");
			
			capabilities.setCapability("platformName", "Android");
			
			capabilities.setCapability("platformVersion", "4.4");
			
			capabilities.setCapability("deviceName", "Y541-U02");
			
			capabilities.setCapability("app", "/Users/eshan/Documents/workspace/NuvoExReverse/App/app-staging-release.apk");
			
			capabilities.setCapability("appPackage", "com.nuvoex.nuvoreverseapp.staging");
			
			capabilities.setCapability("appActivity", "com.nuvoex.nuvoreverseapp.LoginActivity");
			
			driver = new AndroidDriver<WebElement>(new URL("http://192.168.1.10:4723/wd/hub"), capabilities);
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement userName = driver.findElement(By.xpath(".//*[@text='Enter your username']"));
			userName.sendKeys("arun.kumar1");
			
			WebElement passWord = driver.findElement(By.xpath(".//*[@text='Enter your password']"));
			passWord.sendKeys("arun");
			
			WebElement loginBtn = driver.findElement(By.xpath(".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/bt_login']"));
			loginBtn.click();
			
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement logoutBtn = driver.findElement(By.xpath(".//*[@content-desc= 'logout']"));
			logoutBtn.click();
			
			
			
			
			
	}
    	
    }

