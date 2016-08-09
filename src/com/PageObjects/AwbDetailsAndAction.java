package com.PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AwbDetailsAndAction {


	public AwbDetailsAndAction(AppiumDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/card_container']")
	public List<WebElement> getAwbList;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[position()=1 and @resource-id='com.nuvoex.nuvoreverseapp.staging:id/card_container']")
	public WebElement clickOnAwb;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Update']")
	public WebElement clickOnUpdate;

	
	// Select on Awb method
	public void select1stAwbAndUpdate() {
		clickOnAwb.click();
		clickOnUpdate.click();
	}

	// Get AWB List Method
	public void getAwbList() {

		List<WebElement> AWB = getAwbList;
		for (int i = 0; i < AWB.size(); i++) {
			System.out.println(i);
		}
	}

}
