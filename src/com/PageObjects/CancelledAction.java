package com.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CancelledAction {
	
	public CancelledAction(AppiumDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver,30,TimeUnit.SECONDS), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancelled']")
	public WebElement cancelled;
	
	@AndroidFindBy(xpath="//android.widget.ListView[position()=1]")
	public WebElement remarksList;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[position()=1]")
	public WebElement remarks1;
	
	@AndroidFindBy(xpath="//android.widget.Button[position()=2]")
	public WebElement submitBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[position()=1]")
	public WebElement cancelBtn;
	
	// Select Cancelled option method
	public void selectCancelled(){
		cancelled.click();
	}
	
	// Get Remarks List method
	public void getRemarksList(){
		remarksList.getText();
	}
	
	// Select remarks from list method
	public void selectRemarks(){
		remarks1.click();
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
