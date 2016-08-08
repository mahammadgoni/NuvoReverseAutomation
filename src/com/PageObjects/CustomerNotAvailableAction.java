package com.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CustomerNotAvailableAction {
	
	public CustomerNotAvailableAction(AppiumDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver,30,TimeUnit.SECONDS), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Customer not available']")
	public WebElement customerNotAvailable;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Proceed']")
	public WebElement proceedBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Decline']")
	public WebElement declineBtn;
	
	// Selecting Customer not available method
	public void selectCNA(){
		customerNotAvailable.click();
	}
	
	// Selecting Proceed method
	public void selectProceed(){
		proceedBtn.click();
	}
	// Selecting Decline method
	public void selectDecline(){
		declineBtn.click();
	}

}
