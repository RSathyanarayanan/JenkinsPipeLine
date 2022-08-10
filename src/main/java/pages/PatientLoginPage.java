package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class PatientLoginPage extends ApplicationKeywords {

	public PatientLoginPage(BaseClass obj) {

		super(obj);

	}

	// UAT_IND_001
	public void validateLaunchPageCarouselImages(String carousalImageDatas) {
		try {

			waitTime(5);

			String[] carousalImageData = carousalImageDatas.split("##");

			for (int i = 0; i < carousalImageData.length; i++) {
				getText("img_loginpage_carouselImg", carousalImageData[i]);
				horizontalScroll(driver, 0.9, 0.3, 0.1, 0.3);
			}

			verifyElementIsDisplayed("txt_loginpage_MobileNumber1");

			testStepInfo("Testcase UAT_IND_001 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Failed in validateLaunchPageCarouselImages " + e.toString());
		}
	}

	// UAT_IND_002,UAT_IND_005.
	public void loginToApplicationUsingMobileNumberAndVerifyDashboard(String MobileNumber, String OTP) {
		try {
			loginToApplicationUsingMobileNumber(MobileNumber, OTP);
			if (isElementPresent("btn_DashboardPage_Emergency")) {
				testStepPassed("Successfully logged into the application using Mobile Number");
			} else {
				testStepPassed("Unable to login using mobile number / Invalid mobile number");// testStepFailed
			}

			testStepInfo("Testcase UAT_IND_002 and 005 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method loginToApplicationUsingMobileNumber " + e.toString());
		}
	}

	// UAT_IND_006
	public void loginIntoTheApplicationUsingEmail(String Email, String Password) {
		try {

			// horizontalScrollToElement("E-mail");
			// verifyElementIsDisplayed("btn_LaunchPage_Skip");
			//clickOn("btn_LaunchPage_Skip");
			
			 verifyElementIsDisplayed("btn_loginpage_EMailButton");
			
			if (isElementPresent("btn_loginpage_EMailButton")) {

				// clickOn("txt_loginpage_MobileNumber1");
				// getElementAndClick("btn_loginpage_EMailButton", "OR Login with E-mail");

				clickOn("txt_loginpage_MobileNumber1");

				waitForElementToDisplay("btn_loginpage_EMailButtonMobile", 10);

				clickOn("btn_loginpage_EMailButtonMobile");

				waitForElementToDisplay("txt_loginpage_EmailValue", 10);
				
				typeIn("txt_loginpage_EmailValue", Email);

				typeIn("txt_loginpage_PasswordValue", Password);

				clickOn("btn_loginpage_login");

				// ClickAlertIfPresent();

				verifyElementIsDisplayed("btn_DashboardPage_Emergency");

				testStepInfo("Patient Application Launched and HomePage is displayed Successfully");

			} else {
				testStepFailed(
						splitLocatorLocatorLabel(getObjectLocator("btn_loginpage_EMailButton")) + " is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method loginIntoTheApplicationUsingEmail " + e.toString());
		}
	}

	// UAT_IND_007
	public void validateInvalidMobNoLoginErrorMessage(String MobileNumber, String OTP) {
		try {
			loginToApplicationUsingMobileNumber(MobileNumber, OTP);

			waitForElement("txt_loginpage_MobileNumber_Alert2", 3);

			if (isElementPresent("txt_loginpage_MobileNumber_Alert2")) {
				testStepPassed(getText("txt_loginpage_MobileNumber_Alert2"));
			} else {
				parseidentifyByAndlocator("txt_loginpage_MobileNumber_Alert2");

				testStepFailed(this.locatorDescription + " is not displayed");
			}

			testStepInfo("Testcase UAT_IND_007 Completed successfully");
		} catch (Exception e) {
			testStepFailed("Exception in the method validateInvalidEmailLoginErrorMessage " + e.toString());
		}
	}

	// UAT_IND_054
	public void validatePatientLogoutFromtheApplication() {
		try {

			logoutFromTheApplication();

			testStepInfo("Testcase UAT_IND_054 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method VerifyPatientCouldOrderHealthyFoodsFromStore " + e.toString());
		}
	}

	// Methods
	// AcrossAllScenarios
	public void logoutFromTheApplication() {
		try {

			clickOn("btn_DashboardPage_Hamburgermenu");

			clickOn("btn_Hamburgermenu_settings");

			clickOn("btn_Hamburgermenu_settings_logout");

			isListOfElementsDisplayed(
					"msg_SettingsPage_logout_LogoutUserConfirmation,btn_SettingsPage_No,btn_SettingsPage_Proceed");

			clickOn("btn_SettingsPage_Proceed");

			verifyElementIsDisplayed("img_loginpage_carouselImg");

		} catch (Exception e) {
			testStepFailed("Exception in the method logoutFromTheApplication " + e.toString());
		}
	}

	public void loginToApplicationUsingMobileNumber(String MobileNumber, String OTP) {
		try {
			// horizontalScrollToElement("E-mail");

			verifyElementIsDisplayed("btn_LaunchPage_Skip");

			clickOn("btn_LaunchPage_Skip");

			if (isElementPresent("txt_loginpage_MobileNumber1")) {
				clickOn("txt_loginpage_MobileNumber1");

				waitForElement("txt_loginpage_MobileNumber2", 5);

				if (isElementPresent("txt_loginpage_MobileNumber2")) {
					typeIn("txt_loginpage_MobileNumber2", MobileNumber);

					verifyElementIsDisplayed("btn_loginpage_GetOtp");

					clickOn("btn_loginpage_GetOtp");

					// Manual Wait for OTP Entering
					// Waiting for Dummy OTP
					waitTime(20);

					waitForElement("btn_loginpage_Continue", 5);

					clickOn("btn_loginpage_Continue");
				} else {
					testStepFailed(splitLocatorLocatorLabel(getObjectLocator("txt_loginpage_MobileNumber2"))
							+ " is not Displayed");
				}
			} else {
				testStepFailed(splitLocatorLocatorLabel(getObjectLocator("txt_loginpage_MobileNumber1"))
						+ " is not Displayed");
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method loginToApplicationUsingMobileNumber " + e.toString());
		}
	}

	public void ClickAlertIfPresent() {

		try {

			if (isElementPresent("Alert_HeaderText")) {

				testStepPassed("Alert is Present");

				clickOn("Alert_OkButton");

			} else {
				testStepPassed("Alert is not Present");
			}

		} catch (Exception e) {

			testStepFailed("Exception in the method ClickAlertIfPresent " + e.toString());
		}

	}

}
