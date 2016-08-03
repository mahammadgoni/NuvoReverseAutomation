package com.ReverseTestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Demo {
    
	public static void main(String[] args) throws MalformedURLException {
		AppiumDriver<WebElement> driver;	
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "Google Nexus 5");
		capabilities.setCapability("app", "/Users/eshan/Documents/workspace/NuvoExReverse/App/app-staging-release.apk");
		capabilities.setCapability("appPackage", "com.nuvoex.nuvoreverseapp.staging");
		capabilities.setCapability("appActivity", "com.nuvoex.nuvoreverseapp.LoginActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://192.168.1.229:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@text='Enter your username']")).sendKeys("arun.kumar1");
		driver.findElement(By.xpath(".//*[@text='Enter your password']")).sendKeys("arun");
		driver.findElement(By.xpath(".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/bt_login']")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.TextView[2]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[1]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")).click();
		driver.close();
		
	}

}
