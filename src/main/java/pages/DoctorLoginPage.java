package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import io.appium.java_client.ios.IOSDriver;

public class DoctorLoginPage extends ApplicationKeywords {


	public DoctorLoginPage(BaseClass obj) {
		super(obj);
	}

	//UAT_IND_055
	public void validateDoctorLaunchPageCarouselImages(String carousalImageDatas) 
	{
		try 
		{
			verifyElementIsDisplayed("lbl_DoctorLaunchPage_Title");//UAT_IND_059
			
			String[] carousalImageData = carousalImageDatas.split("##");
			
			for(int i = 0; i < carousalImageData.length; i++)
			{
				getText("lbl_DoctorLoginpage_carousel",carousalImageData[i]);
				
				horizontalScroll(driver, 0.9, 0.3, 0.1, 0.3);
			}
			verifyElementIsDisplayed("txt_DoctorLoginPage_MobileNumber");
			
			testStepInfo("Testcase UAT_IND_055 Completed successfully");

		}
		catch (Exception e) 
		{
			testStepFailed("Failed in validateDoctorLaunchPageCarouselImages " + e.toString());
		}
	}

	//UAT_IND_056
	public void validateDoctorLoginWithInvalidCredsAndNavigateToForgotPasswordScreen(String Email, String Password) {
		try {
			//horizontalScrollToElement("E-mail");
			
			verifyElementIsDisplayed("btn_DoctorLoginPage_Email");
			
			if (isElementPresent("btn_DoctorLoginPage_Email")) 
			{
				clickOn("btn_DoctorLoginPage_Email");
				
				typeIn("txt_DoctorLoginPage_EmailValue", Email);
				
				typeIn("txt_DoctorLoginPage_PasswordValue", Password);
				
				closeKeyBoard();
				
				clickOn("btn_DoctorLoginPage_login");
				
				if(currentMachineName.equalsIgnoreCase("Android") || currentMachineName.contains("Android"))
				{
					verifyElementIsDisplayed("lbl_DoctorLoginPage_FailedToProceed");//Need id
					verifyElementIsDisplayed("lbl_DoctorLoginPage_EnterValidEmailOrPassword");//Need id
				}
				else if(currentMachineName.equalsIgnoreCase("ios") || currentMachineName.contains("iOS"))
				{
					verifyElementIsDisplayed("lbl_DoctorLoginPage_InvalidLoginErrorMessage");
				}
				
				waitTime(3);
				clickOn("img_DoctorLoginPage_SupportIcon");
				
				verifyElementIsDisplayed("lbl_DoctorSupportPage_Title");
				
				clickOn("lbl_DoctorSupportPage_ChevronBack");
				
				validateNavigateToForgotPasswordScreen();
				
				testStepInfo("Testcase UAT_IND_056 Completed successfully");

			} 
			else
			{
				testStepFailed(splitLocatorLocatorLabel(getObjectLocator("btn_DoctorLoginPage_Email")) + " is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method validateDoctorLoginWithInvalidCredsAndNavigateToForgotPasswordScreen " + e.toString());
		}
	}
	
	
	public void doctorloginIntoTheApplicationUsingMobileNumberAndVerifyDashboard(String MobileNumber, String OTP) {
		try 
		{
			doctorloginToApplicationUsingMobileNumber(MobileNumber, OTP);
			
			waitForElementToDisplay("chk_DrTermsAndCondition_AcknowledgementCheckbox", 10);
			
			clickOn("chk_DrTermsAndCondition_AcknowledgementCheckbox");
			
			clickOn("lnk_DrTermsAndCondition_continue");
			
			verifyElementIsDisplayed("FooterIcons_DoctorHome");
			
			testStepPassed("Tutor successfully logged into the Application");	
			
		}
		catch (Exception e) 
		{
			testStepFailed("Exception in the method loginToApplicationUsingMobileNumber " + e.toString());
		}
	}

	public void DoctorloginIntoTheApplicationUsingEmail(String Email, String Password) 
	{
		try 
		{
			//horizontalScrollToElement("E-mail");
			
			verifyElementIsDisplayed("btn_DoctorLoginPage_Email");
			
			if (isElementPresent("btn_DoctorLoginPage_Email")) 
				
			{
				clickOn("btn_DoctorLoginPage_Email");
				
				typeIn("txt_DoctorLoginPage_EmailValue", Email);
				
				typeIn("txt_DoctorLoginPage_PasswordValue", Password);
				
				closeKeyBoard();
				
				clickOn("btn_DoctorLoginPage_login");

				if(isElementPresent("chk_DrTermsAndCondition_AcknowledgementCheckbox"))
				{				
					clickOn("chk_DrTermsAndCondition_AcknowledgementCheckbox");
					
					clickOn("lnk_DrTermsAndCondition_continue");
				}
				verifyElementIsDisplayed("FooterIcons_DoctorHome");
				
				testStepPassed("Tutor successfully logged into the Application");
				
			} 
			else
			{
				testStepFailed(splitLocatorLocatorLabel(getObjectLocator("btn_DoctorLoginPage_Email")) + " is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method DoctorloginIntoTheApplicationUsingEmail " + e.toString());
		}
	}
	
	public void doctorloginToApplicationUsingMobileNumber(String MobileNumber, String OTP) {
		try {
			//horizontalScrollToElement("E-mail");
			
			verifyElementIsDisplayed("txt_DoctorLoginPage_MobileNumber");
			
			clickOn("txt_DoctorLoginPage_MobileNumber");
			
			waitForElement("txt_DoctorLoginPage_MobileNumber2", 5);
			
			typeIn("txt_DoctorLoginPage_MobileNumber2", MobileNumber);
			
			verifyElementIsDisplayed("btn_DoctorLoginPage_GetOTP");
			
			clickOn("btn_DoctorLoginPage_GetOTP");
			
			// Manual Wait for OTP Entering
			// Waiting for Dummy OTP
			waitTime(10);
			
			waitForElement("btn_DoctorLoginPage_Continue", 5);
			
			clickOn("btn_DoctorLoginPage_Continue");

		} catch (Exception e) {
			testStepFailed("Exception in the method doctorloginToApplicationUsingMobileNumber " + e.toString());
		}
	}

	//Methods
	public void validateNavigateToForgotPasswordScreen()
	{
		verifyElementIsDisplayed("lbl_DoctorLoginPage_ForgotPassword");
		
		clickOn("lbl_DoctorLoginPage_ForgotPassword");
		
		if(isElementPresent("lbl_DoctorForgotPasswordPage_Title"))
		{
			testStepPassed("Successfully navigated to Forgot Password screen");
		}
		else
		{
			testStepFailed("Unable to navigate to Forgot Password screen");
		}
	}

}
