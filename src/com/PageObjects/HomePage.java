package com.PageObjects;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	AppiumDriver<WebElement> driver;
	
	
	public HomePage(AppiumDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver,30,TimeUnit.SECONDS), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Allow']")
	public WebElement allowBtn;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v7.widget.RecyclerView[1]")
	public WebElement drsLIst;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
	public WebElement expandBtn;
	
	// Accept permission method
	public void acceptMedia(){
		allowBtn.click();
	}
	
	// Scroll till last AWB and Scroll Up method
	public void scrollDwonAndUp(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: scroll", scrollObject);
	}
	
	
	// Get all AWB Lists method
	public void getDrsList(){
		
		   JavascriptExecutor js = (JavascriptExecutor) driver;
           HashMap<String, String> scrollObject = new HashMap<String, String>();
           scrollObject.put("direction", "down");
           js.executeScript("mobile: scroll", scrollObject);
		
	}
	

}
