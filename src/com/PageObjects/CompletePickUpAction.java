package com.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CompletePickUpAction {
	
	public CompletePickUpAction(AppiumDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver,30,TimeUnit.SECONDS), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[1]")
	public WebElement completePickUp;
	
	@AndroidFindBy(xpath=".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/capture_image']")
	public WebElement takePhoto;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[4]/android.widget.ImageView[2]")
	public WebElement captureImg;
	
	//@AndroidFindBy(xpath=".//*[@resource-id='com.android.camera:id/shutter_button']")
//	public WebElement captureImg;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")
	public WebElement saveImg;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
	public WebElement retakeImg;
	
	@AndroidFindBy(xpath=".//*[@resource-id='com.android.camera:id/btn_cancel']")
	public WebElement cancleImg;
	
	@AndroidFindBy(xpath=".//*[@text='NEXT']")
	public WebElement clikcOnNext;
	
	@AndroidFindBy(xpath=".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/signature_pad']")
	public WebElement signIn;
	
	@AndroidFindBy(xpath=".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/clear_btn']")
	public WebElement clearBtn;
	
	@AndroidFindBy(xpath=".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/next_btn']")
	public WebElement proceedBtn;
	
	@AndroidFindBy(xpath=".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/qrCodeValue']")
	public WebElement enterQrCode;
	
	@AndroidFindBy(xpath=".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/bt_updateStatus']")
	public WebElement updateStatus;
	
	@AndroidFindBy(xpath=".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/done']")
	public WebElement deliveredDone;
	
	// Select on Complete Pick Up Radio Button
	public void selectCompletePick(){
		completePickUp.click();
	}
	// Take an Image and save it method
	public void takeAnImg(){
		takePhoto.click();
		captureImg.click();
		saveImg.click();
	}
	
	// Refresh the image or cancel image
		public void refreshImg(){
			retakeImg.click();
			captureImg.click();
			saveImg.click();
			
			
		}
	
	// Click on NEXT after save the Image
		public void nextStep(){
			clikcOnNext.click();
		}
	
	// Sign In and Click on Proceed method	
	    public void signInAndProceed(){
	    	signIn.click();
	    	proceedBtn.click();
		
	}
	    
	// Enter QR code and Update the status
	    public void enterQrAndUpdateStatus(String code){
	    	enterQrCode.sendKeys(code);
	    	updateStatus.click();
	    	deliveredDone.click();
	    }

}























