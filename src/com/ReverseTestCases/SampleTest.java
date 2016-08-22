package com.ReverseTestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjects.AwbDetailsAndAction;
import com.PageObjects.CancelledAction;
import com.PageObjects.CompletePickUpAction;
import com.PageObjects.CustomerNotAvailableAction;
import com.PageObjects.DeferredAction;
import com.PageObjects.LoginAndLogoutPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SampleTest {

	AppiumDriver<WebElement> driver;

	// AppiumDriverLocalService service =
	// AppiumDriverLocalService.buildDefaultService();

	// Setting desire capabilities for your devices test
	@BeforeClass
	public void setUp() throws MalformedURLException {

		// // Starting Appium in Locale sysytem
		// AppiumServer server = new AppiumServer();
		//
		// server.startServer();

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("appium-version", "1.0");

		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("platformVersion", "6.0.1");

		// capabilities.setCapability("deviceName", "Google Nexus 5");

		capabilities.setCapability("deviceName", "Micromax AQ4501");

		// capabilities.setCapability("deviceName", "Y541-U02");

		// Resetting keyboard for App
		// capabilities.setCapability("unicodeKeyboard", true);
		// capabilities.setCapability("resetKeyboard", true);

		capabilities.setCapability("app", "/Users/eshan/Documents/workspace/NuvoExReverse/App/reverse-staging.apk");

		capabilities.setCapability("appPackage", "com.nuvoex.nuvoreverseapp.staging");

		capabilities.setCapability("appActivity", "com.nuvoex.nuvoreverseapp.LoginActivity");

		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

	}

	// Login to your account test
	@Test(priority = 0)
	public void loginTest() {

		LoginAndLogoutPage obj = new LoginAndLogoutPage(driver);

		obj.loginToAccount("parvaz_fe", "parvaz");

		// driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		// System.out.println(driver.getContext());

	}

	// Scroll your awb until last test
	// @Test(priority = 1)
	// public void scrollDownAndUpTest() {
	// HomePage hp = new HomePage(driver);
	// hp.scrollDwonAndUp();
	// }

	// Selecting an AWB and click on Update test
	// @Test(priority = 2)
	// public void selectAwbTest() {
	// AwbDetailsAndAction awb = new AwbDetailsAndAction(driver);
	// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	// awb.select1stAwbAndUpdate();
	// }

	// Selecting Deferred option Test
	@Test(priority = 1)
	public void selectDefferedTest() {
		AwbDetailsAndAction awb = new AwbDetailsAndAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		awb.select1stAwbAndUpdate();

		DeferredAction def = new DeferredAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		def.selectDeferred();
	}

	// Selecting Deferred date 1 Test
	@Test(priority = 2)
	public void selectDeffered1AndSubmitTest() {
		DeferredAction def = new DeferredAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		def.selectDeferredDate1();
		def.clickOnSubmit();
	}

	// Selecting Cancelled option Test
	@Test(priority = 3)
	public void selectCancelledTest() {
		AwbDetailsAndAction awb = new AwbDetailsAndAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		awb.select1stAwbAndUpdate();

		CancelledAction can = new CancelledAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		can.selectCancelled();
	}

	// Selecting Cancelled Remarks1 Test
	@Test(priority = 4)
	public void selectCancelled1AndSubmitTest() {
		CancelledAction can = new CancelledAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		can.selectRemarks();
		can.clickOnSubmit();
	}

	// Selecting Customer Not Available option Test
	@Test(priority = 5)
	public void selectCustomerNotAvailableTest() {
		AwbDetailsAndAction awb = new AwbDetailsAndAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		awb.select1stAwbAndUpdate();

		CustomerNotAvailableAction cna = new CustomerNotAvailableAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cna.selectCNA();
	}

	// Complete Customer Not Available Test
	@Test(priority = 6)
	public void selectCNAAndSubmitTest() {
		CustomerNotAvailableAction cna = new CustomerNotAvailableAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		cna.selectProceed();

	}

	// Select Complete Pickup Test
	@Test(priority = 7)
	public void selectCompleteTest() {
		AwbDetailsAndAction awb = new AwbDetailsAndAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		awb.select1stAwbAndUpdate();
		
		
		CompletePickUpAction com = new CompletePickUpAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		com.selectCompletePick();
	}

	// Tack an Image and click On save Test
	@Test(priority = 8)
	public void takeAnImgTest() throws InterruptedException {
		CompletePickUpAction img = new CompletePickUpAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		img.takeAnImg();

		// img.refreshImg();
		// Thread.sleep(10);
		// img.nextStep();
	}

	// Click on Yes for 1st question
	@Test(priority = 9)
	public void firstQuestionTest() {
		CompletePickUpAction cot = new CompletePickUpAction(driver);
		cot.pressYes();
	}

	// Click on Yes for 2nd question
	@Test(priority = 10)
	public void seccondQuestionTest() {
		CompletePickUpAction cot = new CompletePickUpAction(driver);
		cot.enterNoOfProduct("1");
		
	}

	// Click on Yes for 3rd question
	@Test(priority = 11)
	public void thirdQuestionTest() {
		CompletePickUpAction cot = new CompletePickUpAction(driver);
		cot.pressYes();
	}

	// Click on Yes for 4th question
	@Test(priority = 12)
	public void fouthQuestionTest() {
		CompletePickUpAction cot = new CompletePickUpAction(driver);
		cot.pressYes();
	}

	// Click on Yes for 5th question
	@Test(priority = 13)
	public void fifthQuestionTest() {
		CompletePickUpAction cot = new CompletePickUpAction(driver);
		cot.pressYes();
	}

	// Click on Submit Test
	@Test(priority = 14)
	public void clickOnSubmitTest() {
		CompletePickUpAction cot = new CompletePickUpAction(driver);
		cot.clickOnSubmit();
	}

	// Enter comment for Remarks and print QC review test
	@Test(priority = 15)
	public void enterRemarksTest() {
		CompletePickUpAction cot = new CompletePickUpAction(driver);
		cot.enterCommentAndProceed("Automation Test");
	}

	// Signature Test
	@Test(priority = 16)
	public void signatureTest() {
		CompletePickUpAction sign = new CompletePickUpAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		sign.signInAndProceed();
	}

	// Enter QR Code Test
	@Test(priority = 17)
	public void enterQRCodeTest() {
		CompletePickUpAction code = new CompletePickUpAction(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		code.enterQrAndUpdateStatus("Auto007");
	}

	// Logout from your account Test
	// @Test(priority = 14)
	// public void logoutTest() throws InterruptedException {
	// LoginAndLogoutPage obj = new LoginAndLogoutPage(driver);
	// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	// obj.logoutFromAccount();
	// }

	// Logout from your account Test
	@Test(priority = 18)
	public void logoutTest() throws InterruptedException {
		LoginAndLogoutPage obj = new LoginAndLogoutPage(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		obj.logoutFromAccount();
	}

	// Close your app Test
	@AfterClass
	public void tearDown() {
		// driver.close();
		// service.stop();

	}

}
