package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginAndLogoutPage {
	
	//AppiumDriver<WebElement> driver;
	
	
	public LoginAndLogoutPage(AppiumDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath=".//*[@text='Enter your username']")
	public WebElement userName;
	
	@AndroidFindBy(xpath=".//*[@text='Enter your password']")
	public WebElement passWord;
	
	@AndroidFindBy(xpath=".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/bt_login']")
	public WebElement loginBtn;
	
	@AndroidFindBy(xpath=".//*[@content-desc='logout']")
	public WebElement logoutBtn;
	
	@AndroidFindBy(xpath=".//*[@text='Confirm']")
	public WebElement confirmBtn;
	
	@AndroidFindBy(xpath=".//*[@text='Retry']")
	public WebElement retryBtn;
	
	
	public void loginToAccount(String feName,String password){
		userName.sendKeys(feName);
		passWord.sendKeys(password);
		loginBtn.click();	
		
	}
	
	public void retryLogin(){
		retryBtn.click();
	}
	public void logoutFromAccount(){
		logoutBtn.click();
		confirmBtn.click();
	}

}
