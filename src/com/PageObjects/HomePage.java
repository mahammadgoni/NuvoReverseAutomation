package com.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	
	public HomePage(AppiumDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver,30,TimeUnit.SECONDS), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
	public WebElement expandBtn;
	

}
