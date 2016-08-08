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

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]")
	public WebElement clickOnAwb;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Update']")
	public WebElement clickOnUpdate;

	// Select on Awb method
	public void selectAwbAndUpdate() {
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
