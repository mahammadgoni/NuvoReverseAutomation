package com.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DeferredAction {
	
	public DeferredAction(AppiumDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver,30,TimeUnit.SECONDS), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Deferred']")
	public WebElement deferred;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[position()=1]")
	public WebElement deferredDate1;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[position()=2]")
	public WebElement deferredDate2;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[position()=3]")
	public WebElement deferredDate3;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Submit']")
	public WebElement submitBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement cancelBtn;
	
	// Select Deferred Option Method
	public void selectDeferred(){
		deferred.click();
	}
	
	// Select Deferred Date to Next Date
	public void selectDeferredDate1(){
		deferredDate1.click();
	}
	// Click On submit method
	public void clickOnSubmit(){
		submitBtn.click();
	}
	// Click On Cancel Method
	public void clickOnCancel(){
		cancelBtn.click();
	}

}
