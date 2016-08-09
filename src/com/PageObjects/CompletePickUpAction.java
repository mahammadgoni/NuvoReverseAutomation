package com.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CompletePickUpAction {

	public CompletePickUpAction(AppiumDriver<WebElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Complete Pickup']")
	public WebElement completePickUp;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/iv_take_pic']")
	public WebElement takePhoto;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[4]/android.widget.ImageView[2]")
	public WebElement captureImg;

	// @AndroidFindBy(xpath=".//*[@resource-id='com.android.camera:id/shutter_button']")
	// public WebElement captureImg;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/iv_btn_save']")
	public WebElement saveImg;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/iv_btn_retake']")
	public WebElement retakeImg;

	@AndroidFindBy(xpath = ".//*[@resource-id='com.android.camera:id/btn_cancel']")
	public WebElement cancleImg;

	@AndroidFindBy(xpath = ".//*[@text='NEXT']")
	public WebElement clikcOnNext;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='yes']")
	public WebElement pressYes;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='no']")
	public WebElement pressNo;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter number here']")
	public WebElement enterNoOfProudct;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='done']")
	public WebElement clickOnDone;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
	public WebElement clickOnSubimit;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='restart']")
	public WebElement clickOnRestart;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Comment here']")
	public WebElement enterComment;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Proceed']")
	public WebElement clickOnProceed;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/review_instruction']")
	public WebElement qcReviewMessage;

	// @AndroidFindBy(xpath="//android.widget.Button[@text='com.nuvoex.nuvoreverseapp.staging:id/review_instruction']")
	// public WebElement clickOnProceed;

	@AndroidFindBy(xpath = ".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/signature_pad']")
	public WebElement signIn;

	@AndroidFindBy(xpath = ".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/clear_btn']")
	public WebElement clearBtn;

	@AndroidFindBy(xpath = ".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/next_btn']")
	public WebElement proceedBtn;

	@AndroidFindBy(xpath = ".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/qrCodeValue']")
	public WebElement enterQrCode;

	@AndroidFindBy(xpath = ".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/bt_updateStatus']")
	public WebElement updateStatus;

	@AndroidFindBy(xpath = ".//*[@resource-id='com.nuvoex.nuvoreverseapp.staging:id/done']")
	public WebElement deliveredDone;

	// Select on Complete Pick Up Radio Button
	public void selectCompletePick() {
		completePickUp.click();
	}

	// Take an Image and save it method
	public void takeAnImg() {
		boolean saveBtn = takePhoto.isDisplayed();
		if (saveBtn == true) {
			takePhoto.click();	
			saveImg.click();
		}else {
			saveImg.click();
		}
//		takePhoto.click();
//		captureImg.click();
		
		// AppiumDriver<WebElement> driver = null;
		// Actions action = new Actions(driver);
		// action.sendKeys(Keys.ENTER);
		// action.perform();

	}

	// Refresh the image or cancel image
	public void refreshImg() {
		boolean refrsBtn = retakeImg.isDisplayed();
		if (refrsBtn == true) {
			retakeImg.click();
			takeAnImg();
			
		}
//		retakeImg.click();
//		captureImg.click();
//		saveImg.click();

	}

	// Click on NEXT after save the Image
	public void nextStep() {
		clikcOnNext.click();
	}

	// Press yes method for question
	public void pressYes() {
		pressYes.click();
	}

	// Press no method for question
	public void pressNo() {
		pressNo.click();
	}

	// Enter No of Product to be picked
	public void enterNoOfProduct(String no) {
		enterNoOfProudct.sendKeys(no);
		clickOnDone.click();
	}

	// Click On Submit method
	public void clickOnSubmit() {
		clickOnSubimit.click();

	}

	// Click On Submit method
	public void clickOnRestart() {
		clickOnRestart.click();

	}

	// Click On Submit method
	public void enterCommentAndProceed(String commnt) {
		enterComment.sendKeys(commnt+"\n");
		clickOnProceed.click();
		System.out.println(qcReviewMessage.getText());
		clickOnProceed.click();

	}

	// Sign In and Click on Proceed method
	public void signInAndProceed() {
		signIn.click();
		proceedBtn.click();

	}

	// Enter QR code and Update the status
	public void enterQrAndUpdateStatus(String code) {
		enterQrCode.sendKeys(code+"\n");
		updateStatus.click();
		deliveredDone.click();
	}

}
