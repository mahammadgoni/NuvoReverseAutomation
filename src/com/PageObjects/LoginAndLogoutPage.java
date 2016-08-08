package com.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginAndLogoutPage {
	
	AppiumDriver<WebElement> driver = null;
	
	
	public LoginAndLogoutPage(AppiumDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver,30,TimeUnit.SECONDS), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your username']")
	public WebElement userName;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your password']")
	public WebElement passWord;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Login']")
	public WebElement loginBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='logout']")
	public WebElement logoutBtn;
	
	@AndroidFindBy(xpath=".//*[@text='Confirm']")
	public WebElement confirmBtn;
	
	@AndroidFindBy(xpath=".//*[@text='Retry']")
	public WebElement retryBtn;
	
	
	public void loginToAccount(String feName,String password){
		
		
		//Actions action = new Actions(driver);
		userName.sendKeys(feName+"\n");
	
		passWord.sendKeys(password+"\n");
		//driver.getKeyboard().sendKeys(Keys.ENTER);
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
