package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class PatientHamburgerMenuPage extends ApplicationKeywords {

	public PatientHamburgerMenuPage(BaseClass obj) {
		super(obj);
	}

	// UAT_IND_021
	public void validatePatientDevicemanagementTaskUsingSettings(String lastname) {
		try {

			if (isElementPresent("btn_DashboardPage_Hamburgermenu")) {

				clickOn("btn_DashboardPage_Hamburgermenu");

				waitForElement("btn_Hamburgermenu_settings", 5);

				clickOn("btn_Hamburgermenu_settings");

				waitForElement("lbl_SettingPage_Profile", 5);

				isListOfElementsDisplayed(
						"lbl_SettingPage_Profile,lbl_SettingPage_PasswordSecurity,lbl_SettingPage_Contacts,lbl_SettingPage_EmergencySettings,lbl_SettingPage_MyDevices,lbl_SettingPage_Notifications,lbl_SettingPage_AddressBook");

				waitForElement("btn_Hamburgermenu_settings_Profile", 5);

				if (isElementPresent("btn_Hamburgermenu_settings_Profile")) {

					clickOn("btn_Hamburgermenu_settings_Profile");

					waitForElement("tab_Hamburgermenu_settings_PersonalDetails", 5);

					verifyElementIsDisplayed("tab_Hamburgermenu_settings_PersonalDetails");

					clickOn("txt_Hamburgermenu_settings_Profilescreen_Lastname");

					typeIn("txt_Hamburgermenu_settings_Profilescreen_Lastname", lastname);

					closeKeyBoard();

					clickOn("btn_Hamburgermenu_settings_Profilescreen_Save");

					verifyElementIsDisplayed("tab_Hamburgermenu_settings_PersonalDetails");

					if (getText("txt_Hamburgermenu_settings_Profilescreen_Lastname").equals(lastname)) {

						testStepPassed("lastname field is editable and updated");
					} else {
						testStepPassed("lastname field is not editable and not updated");

					}

					testStepInfo("Testcase UAT_IND_021 Completed successfully");

				} else {
					testStepFailed("Settings is not displayed");
				}
			} else {
				testStepFailed("hamburger menu is not Displayed");
			}

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientDevicemanagementTaskUsingSettings " + e.toString());
		}
	}

	// UAT_IND_022
	public void validatePatientCanViewandEditProfileDetails(String lastname) {
		try {

			if (isElementPresent("btn_DashboardPage_Hamburgermenu")) {

				clickOn("btn_DashboardPage_Hamburgermenu");

				waitForElement("btn_Hamburgermenu_settings", 5);

				clickOn("btn_Hamburgermenu_settings");

				waitForElement("btn_Hamburgermenu_settings_Profile", 5);

				if (isElementPresent("btn_Hamburgermenu_settings_Profile")) {

					clickOn("btn_Hamburgermenu_settings_Profile");

					waitForElement("tab_Hamburgermenu_settings_PersonalDetails", 5);

					verifyElementIsDisplayed("tab_Hamburgermenu_settings_PersonalDetails");

					clickOn("txt_Hamburgermenu_settings_Profilescreen_Lastname");

					typeIn("txt_Hamburgermenu_settings_Profilescreen_Lastname", lastname);

					closeKeyBoard();

					clickOn("btn_Hamburgermenu_settings_Profilescreen_Save");

					verifyElementIsDisplayed("tab_Hamburgermenu_settings_PersonalDetails");

					if (getText("txt_Hamburgermenu_settings_Profilescreen_Lastname").equals(lastname)) {

						testStepPassed("lastname field is editable and updated");
					} else {
						testStepPassed("lastname field is not editable and not updated");

					}

					testStepInfo("Testcase UAT_IND_022 Completed successfully");

				} else {
					testStepFailed("Settings is not displayed");
				}
			} else {
				testStepFailed("Hamburgermenu not Displayed");
			}
		} catch (

		Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewandEditProfileDetails " + e.toString());
		}
	}

	// UAT_IND_023
	public void validatePatientCanViewAndEditPassword(String currentpassword, String newpassword,
			String confirmpassword) {
		try {

			clickOn("btn_DashboardPage_Hamburgermenu");

			waitForElement("btn_Hamburgermenu_settings", 5);

			clickOn("btn_Hamburgermenu_settings");

			waitForElement("btn_Hamburgermenu_settings_Profile", 5);

			clickOn("btn_Hamburgermenu_settings_PasswordAndSecurity");

			waitForElement("lbl_Hamburgermenu_settings_PasswordAndSecurity_ChangePassword", 5);

			// ********UI Validations of Password and SecurityPage********//

			isListOfElementsDisplayed(
					"lbl_Hamburgermenu_settings_PasswordAndSecurity_Currentpassword,lbl_Hamburgermenu_settings_PasswordAndSecurity_Newpassword,lbl_Hamburgermenu_settings_PasswordAndSecurity_Confirmpassword,txt_Hamburgermenu_settings_PasswordAndSecurity_Currentpassword,txt_Hamburgermenu_settings_PasswordAndSecurity_Newpassword,txt_Hamburgermenu_settings_PasswordAndSecurity_Confirmpassword");

			scrollToText("Update Password");

			verifyElementIsDisplayed("btn_PasswordAndSecurity_UpdatedPassword");

			// ***********Trusted Devices***************//

			scrollToText("Trusted Devices");

			clickOn("lnk_PasswordAndSecurity_TrustedDevices");

			verifyElementIsDisplayed("header_TrustedDevices_device");

			testStepInfo("User navigated to Trusted devices screen");

			navigateBack();

			// *****************BioMetricAuthentication*****************//

			clickOn("btn_Hamburgermenu_settings_PasswordAndSecurity");

			waitForElement("lbl_Hamburgermenu_settings_PasswordAndSecurity_ChangePassword", 5);

			scrollToText("Biometric Authentication");

			verifyElementIsDisplayed("lnk_PasswordAndSecurity_BiometricAuthentication");

			clickOn("lnk_PasswordAndSecurity_BiometricAuthentication");

			verifyElementIsDisplayed("Toggle_BiometricAuthentication_enablebio");

			testStepPassed("user Navigated to biometric authetification");

			testStepInfo("Testcase UAT_IND_023 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewAndEditPassword " + e.toString());

		}
	}

	// UAT_IND_024
	public void validatePatientCanViewAndEditContactDetails(String EditText, String EditNumber) {
		try {

			waitForElement("btn_DashboardPage_Hamburgermenu", 5);

			clickOn("btn_DashboardPage_Hamburgermenu");

			clickOn("btn_Hamburgermenu_settings");

			waitForElement("lbl_SettingPage_Contacts", 5);

			clickOn("lbl_SettingPage_Contacts");

			waitForElement("tab_Hamburgermenu_settings_MyContact", 5);

			isListOfElementsDisplayed(
					"tab_Hamburgermenu_settings_MyContact,tab_Hamburgermenu_settings_ContactCareGiver,tab_Hamburgermenu_settings_Emergencycontact");

			clickOn("tab_Hamburgermenu_settings_ContactCareGiver");

			waitForElement("lbl_Hamburgermenu_settings_CareGiverLabel", 5);

			clickOn("tab_Hamburgermenu_settings_Emergencycontact");

			waitForElement("lbl_Hamburgermenu_settings_EmergencyContactnameLabel", 5);

			clickOn("txt_Hamburgermenu_settings_NamePencil");

			typeIn("txt_Hamburgermenu_settings_EmergencyNameandPhone", EditText);

			closeKeyBoard();

			clickOn("txt_Hamburgermenu_settings_PhoneNumberPencil");

			typeIn("txt_Hamburgermenu_settings_EmergencyNameandPhone", EditNumber);

			closeKeyBoard();

			scrollToText("Save");

			validateElementEnabled("btn_Hamburgermenu_settings_SaveContact", "true");

			clickOn("btn_Hamburgermenu_settings_SaveContact");

			waitForElement("lbl_Hamburgermenu_settings_EmergencyContactnameLabel", 10);

			if (getText("txt_Hamburgermenu_settings_UpdatedName").equals(EditText)) {

				testStepPassed("Emergency contact Name is Updated");
			} else {

				testStepFailed("Emergency contact Name is not Updated");

			}

			navigateBack();

			waitForElement("lbl_SettingPage_Contacts", 5);

			navigateBack();

			verifyElementIsDisplayed("btn_DashboardPage_Emergency");

			testStepInfo("Testcase UAT_IND_024 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewAndEditContactDetails " + e.toString());
		}
	}

	// UAT_IND_025
	public void validatePatientCanViewAndEditEmergencyDetails(String hospitalName) {
		try {

			clickOn("btn_DashboardPage_Hamburgermenu");

			waitForElement("btn_Hamburgermenu_settings", 5);

			clickOn("btn_Hamburgermenu_settings");

			waitForElement("lbl_SettingPage_EmergencySettings", 5);

			clickOn("lbl_SettingPage_EmergencySettings");

			verifyElementIsDisplayed("lbl_EmergencySettings_Title");

			verifyElementIsDisplayed("lbl_EmergencySettings_DefaultOption");

			if (findWebElement("lbl_EmergencySettings_ChevronBack").getAttribute("clickable").equals("true")) {
				testStepPassed(splitLocatorLocatorLabel(getObjectLocator("lbl_EmergencySettings_ChevronBack"))
						+ " is clickable");
			} else {
				testStepPassed(splitLocatorLocatorLabel(getObjectLocator("lbl_EmergencySettings_ChevronBack"))
						+ " is not clickable");
			}

			clickOn("img_EmergencySettings_EmergencyCheckBox");// Couldn't able to verify the color change

			clickOn("img_EmergencySettings_HospitalCheckBox");

			verifyElementIsDisplayed("lbl_SelectPreferredHospital_Title");

			scrollToText(hospitalName);

			getElementAndClick("lbl_SelectPreferredHospital_HospitalName", hospitalName);

			waitForElement("img_EmergencySettings_HospitalCheckBox", 5);

			scrollToText("emergency button");

			verifyElementIsDisplayed("lbl_SelectPreferredHospital_SelectedHospital");

			getText("lbl_SelectPreferredHospital_SelectedHospital", hospitalName);

			testStepInfo("Testcase UAT_IND_025 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewAndEditEmergencyDetails " + e.toString());
		}
	}

	// UAT_IND_026
	public void validatePatientSupportandFAQsFunctionality() {
		try {

			clickOn("btn_DashboardPage_Hamburgermenu");

			waitForElement("btn_Hamburgermenu_settings", 5);

			clickOn("lbl_Hamburger_Support");

			isListOfElementsDisplayed("lbl_PatientSupportPage_Title,btn_PatientSupportPage_ChevronBack");

			scrollToText("FAQs");

			verifyElementIsDisplayed("lbl_PatientSupportPage_FAQ");

			scrollToText("Submit");

			verifyElementIsDisplayed("lbl_PatientSupportPage_Contact");

			isListOfElementsDisplayed(
					"lbl_PatientSupportPage_SendAQuery,lbl_PatientSupportPage_Category,lbl_PatientSupportPage_SubCategory,txt_PatientSupportPage_Message");

			isListOfElementsDisplayed(
					"btn_PatientSupportPage_Submit,btn_PatientSupportPage_Call,btn_PatientSupportPage_Chat");

			testStepInfo("Testcase UAT_IND_026 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientSupportandFAQsFunctionality " + e.toString());
		}
	}

	// UAT_IND_027
	public void validatePatientCanViewAndEditAddressDetails(String pinCode, String stateName, String cityName,
			String houseNumber, String streetNumber) {
		try {

			String address = houseNumber + "," + streetNumber + ", " + cityName + "," + stateName + ", " + pinCode;

			clickOn("btn_DashboardPage_Hamburgermenu");

			waitForElement("btn_Hamburgermenu_settings", 5);

			clickOn("btn_Hamburgermenu_settings");

			waitForElement("lbl_SettingPage_AddressBook", 5);

			clickOn("lbl_SettingPage_AddressBook");

			verifyElementIsDisplayed("lbl_MyAddresses_Title");

			if (findWebElement("lbl_MyAddresses_ChevronBack").getAttribute("clickable").equals("true")) {
				testStepPassed(
						splitLocatorLocatorLabel(getObjectLocator("lbl_MyAddresses_ChevronBack")) + " is clickable");
			} else {
				testStepPassed(splitLocatorLocatorLabel(getObjectLocator("lbl_MyAddresses_ChevronBack"))
						+ " is not clickable");
			}

			isListOfElementsDisplayed(
					"lbl_MyAddresses_PreferredText,img_MyAddresses_HomeIcon,lbl_MyAddresses_EditText,img_MyAddresses_EditIcon");

			clickOn("btn_MyAddresses_AddNewAddress");

			isListOfElementsDisplayed(
					"lbl_NewAddress_Title,val_NewAddress_EnterPincode,lbl_NewAddress_State,lbl_NewAddress_City,val_NewAddress_EnterHouseOrFlatNumber,val_NewAddress_EnterStreetSocietyDistrictNumber");

			clickOn("val_NewAddress_EnterPincode");

			typeIn("val_NewAddress_EnterPincode", pinCode);

			closeKeyBoard();

			getText("lbl_NewAddress_State", stateName);

			getText("lbl_NewAddress_City", cityName);

			clickOn("val_NewAddress_EnterHouseOrFlatNumber");

			typeIn("val_NewAddress_EnterHouseOrFlatNumber", houseNumber);

			closeKeyBoard();

			clickOn("val_NewAddress_EnterStreetSocietyDistrictNumber");

			typeIn("val_NewAddress_EnterStreetSocietyDistrictNumber", streetNumber);

			closeKeyBoard();

			clickOn("lbl_NewAddress_HomeAddressLabel"); // Click not working

			waitTime(2);

			validateElementEnabled("btn_NewAddress_Save", "true");

			clickOn("btn_NewAddress_Save");

			String objLocator = getObjectLocator("lbl_MyAddresses_AddedAddress").replace("<<ADDRESS>>", address);

			updateObjectLocator("lbl_MyAddresses_AddedAddress", objLocator);

			isListOfElementsDisplayed("lbl_MyAddresses_AddedAddress");

			testStepInfo("Testcase UAT_IND_027 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewAndEditAddressDetails " + e.toString());
		}
	}

	// UAT_IND_028
	public void validatePatientCanViewAndUploadPrescription(String latestPrescription, String uploadPrescription) {
		try {

			/*
			 * isListOfElementsDisplayed(
			 * "lbl_LatestPrescription_TerminationDate,lbl_LatestPrescription_MedicineNameQuantityAndType,lbl_LatestPrescription_Notes,lbl_LatestPrescriprion_NotesImage,lbl_LatestPrescription_AdditionalInfo,lbl_LatestPrescription_AdditionalInfoImage"
			 * ); clickOn("lbl_LatestPrescription_AdditionalInfoImage");
			 * waitForElement("lbl_Latestprescription_UseOfMedicine", 5);
			 * isListOfElementsDisplayed(
			 * "lbl_LatestPrescription_UseOfMedicine,lbl_LatestPrescription_ToDoBeforeMedicine,lbl_LatestPrescription_ToDoAfterMedicine,lbl_LatestPrescription_SideEffects,lbl_LatestPrescription_Allergies,lbl_LatestPrescription_WhatToAvoid"
			 * ); clickOn("lbl_LatestPrescription_ChevronBack");
			 * verifyElementIsDisplayed("lbl_Prescriptions_Categories");
			 */

			navigateToPrescriptionPage();

			// Latest Prescription

			getElementAndClick("lbl_Prescriptions_Categories", latestPrescription);

			verifyElementIsDisplayed("lbl_LatestPrescription_Title");
			validateLatestPrescriptions();
			clickOn("lbl_LatestPrescription_KebabMenuEllipsis");
			isListOfElementsDisplayed("lbl_LatestPrescription_ReqMedicineChange,lbl_LatestPrescription_DLoadasPDF");
			clickOn("lbl_LatestPrescription_ChevronBack");
			clickOn("lbl_LatestPrescription_ChevronBack");

			// Upload Prescription

			getElementAndClick("lbl_Prescriptions_Categories", uploadPrescription);
			verifyElementIsDisplayed("lbl_UploadPrescription_Title");
			validateUploadedPrescriptions();
			clickOn("lbl_UploadPrescription_KebabMenuEllipsis");
			isListOfElementsDisplayed(
					"lbl_UploadPrescription_View,lbl_UploadPrescription_Download,lbl_UploadPrescription_Delete");

			testStepInfo("Testcase UAT_IND_028 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewAndEditAddressDetails " + e.toString());
		}
	}

	// UAT_IND_029
	public void validatePatientRequestForMedicineChange(String requestMedicineChange, String medicineNames,
			String reasonValue, String comment) {
		try {

			//String[] medicineName = medicineNames.split(", ");
			
				navigateToPrescriptionPage();

				getElementAndClick("lbl_Prescriptions_Categories", requestMedicineChange);

				verifyElementIsDisplayed("lbl_MedicineChangeReq_Title");
				
				getElementAndClick("lbl_MedicineChangeReq_MedicineList", medicineNames);

				/*for (int i = 0; i < medicineName.length; i++) {
					scrollToText(medicineName[i]);
					getElementAndClick("lbl_MedicineChangeReq_MedicineList", medicineName[i]);

				}*/

				scrollToText("Reason*");

				clickOn("lbl_MedicineChangeReq_ReasonDropdown");

				String objLocator = getObjectLocator("txt_MedicineChangeReq_ReasonValue").replace("<<REASON>>",
						reasonValue);

				updateObjectLocator("txt_MedicineChangeReq_ReasonValue", objLocator);

				clickOn("txt_MedicineChangeReq_ReasonValue");

				typeIn("txt_MedicineChangeReq_Comments", comment);

				closeKeyBoard();
				
			    validateElementEnabled("btn_MedicineChangeReq_Submit", "true");

				clickOn("btn_MedicineChangeReq_Submit");

				waitTime(3);

				getText("lbl_MedicineChangeReq_AddedMedicines", medicineNames);

				testStepInfo("Testcase UAT_IND_029 Completed successfully");
			
		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewAndEditAddressDetails " + e.toString());
		}
	}

	// UAT_IND_030
	public void validateOrderMedicineFromPrescription(String prescriptionCategory, String storeCategory,
			String callBackRequestedVerificationText) {
		try {

			navigateToPrescriptionPage();

			getElementAndClick("lbl_Prescriptions_Categories", prescriptionCategory);// Order Medicines

			verifyElementIsDisplayed("lbl_Store_Categories");

			scrollToText(storeCategory);

			getElementAndClick("lbl_Store_Categories", storeCategory);

			waitForElement("lbl_Store_RequestCallBack", 3);

			clickOn("lbl_Store_RequestCallBack");

			getText("lbl_Store_CallBackRequestedTexts", callBackRequestedVerificationText);

			clickOn("btn_VitalsPage_BP_Done");

			verifyElementIsDisplayed("lbl_Store_Categories");

			testStepInfo("Testcase UAT_IND_030 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validateOrderMedicineFromPrescription " + e.toString());
		}
	}

	// UAT_IND_031
	public void validateViewAndAccessManageNotifications(String prescriptionCategory, String notificationMenus) {
		try {

			navigateToPrescriptionPage();

			getElementAndClick("lbl_Prescriptions_Categories", prescriptionCategory);// Manage Notifications

			verifyElementIsDisplayed("lbl_Notifications_Title");

			testStepPassed("Navigated to Notifications Screen");

			validateNotificationPageMenus("lst_Notifications_MenuLists", notificationMenus);

			validateElementCheckedStatus("btn_Notifications_GeneralAppNotifications");

			validateElementCheckedStatus("btn_Notifications_ReadingReminders");

			validateElementCheckedStatus("btn_Notifications_HealthReminders");

			validateElementCheckedStatus("btn_Notifications_CalendarReminders");

			validateElementChecked("btn_Notifications_GeneralAppNotifications", "true");

			validateElementChecked("btn_Notifications_ReadingReminders", "true");

			validateElementChecked("btn_Notifications_HealthReminders", "true");

			validateElementChecked("btn_Notifications_CalendarReminders", "true");

			navigateBack();

			verifyElementIsDisplayed("lbl_Hamburger_Prescriptions");

			testStepPassed("Navigated to back to Prescription Screen");

			testStepInfo("Testcase UAT_IND_031 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validateViewAndAccessManageNotifications " + e.toString());
		}
	}

	// UAT_IND_032
	public void validatePrescriptionPageHealthProfile(String prescriptionCategory) {
		try {
			navigateToPrescriptionPage();
			getElementAndClick("lbl_Prescriptions_Categories", prescriptionCategory);// Health Profile

			testStepFailed("Unable to Navigate to Health Profile page");

			// Blocker - click doesnt work
			/*
			 * User should see the user's complete health profile under one PDF file, which
			 * should be opened directly in the OS that should include: Patient's profile
			 * Doctor's profile Baseline parameter Medication Lab tests Devices Dietary and
			 * Lifestyle Followed by Doctor's signature.
			 */

			testStepInfo("Testcase UAT_IND_032 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePrescriptionPageHealthProfile " + e.toString());
		}
	}

	// UAT_IND_033
	public void validateUIofHamburgerMenus() {
		try {

			clickOn("btn_DashboardPage_Hamburgermenu");

			isListOfElementsDisplayed(
					"lbl_Hamburger_Prescriptions,lbl_Hamburger_Subscription,lbl_Hamburger_DietAndLifeStyle,btn_Hamburgermenu_settings,");

			isListOfElementsDisplayed(
					"lbl_Hamburger_Support,lnk_Hamburgermenu_AboutUs,lnk_Hamburgermenu_TermsAndCondition,lnk_Hamburgermenu_Feedback");
			
			clickOn("lbl_Hamburger_Prescriptions");

			isListOfElementsDisplayed(
					"lbl_Hamburger_Prescriptions_LatestPrescription,lbl_Hamburger_Prescriptions_UploadPrescription,lbl_Hamburger_Prescriptions_RequestMedicineChange,lbl_Hamburger_Prescriptions_ManageNotication,lbl_Hamburger_Prescriptions_HealthProfile");

			navigateBack();

			waitForElement("btn_DashboardPage_Hamburgermenu", 5);

			clickOn("btn_DashboardPage_Hamburgermenu");

			waitForElement("btn_Hamburgermenu_settings", 5);

			clickOn("btn_Hamburgermenu_settings");

			isListOfElementsDisplayed(
					"lbl_SettingPage_Profile,lbl_SettingPage_PasswordSecurity,lbl_SettingPage_Contacts,lbl_SettingPage_EmergencySettings,lbl_SettingPage_MyDevices,lbl_SettingPage_Notifications,lbl_SettingPage_AddressBook,btn_Dashboard_Logout");

			clickOn("btn_Hamburgermenu_settings_logout");

			isListOfElementsDisplayed(
					"msg_SettingsPage_logout_LogoutUserConfirmation,btn_SettingsPage_No,btn_SettingsPage_Proceed");

			clickOn("btn_SettingsPage_Proceed");

			verifyElementIsDisplayed("img_loginpage_carouselImg");

			testStepInfo("Testcase UAT_IND_033 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validateUIofHamburgerMenus " + e.toString());
		}
	}

	// UAT_IND_037
	public void validatePatientAboutUsOption() {
		try {

			if (isElementPresent("btn_DashboardPage_Hamburgermenu")) {

				clickOn("btn_DashboardPage_Hamburgermenu");

				waitForElement("btn_Hamburgermenu_settings", 5);

				clickOn("lnk_Hamburgermenu_AboutUs");

				waitForElement("txtLbl_Hamburgermenu_AboutUS", 5);

				isListOfElementsDisplayed(
						"txtLbl_Hamburgermenu_AboutUS,txtLbl_Hamburgermenu_Version,txtLbl_Hamburgermenu_WhatDoWeDo");

				testStepPassed("App Version is" + getText("txtLbl_Hamburgermenu_Version"));

				testStepInfo("Testcase UAT_IND_037 Completed successfully");

			} else

			{
				testStepFailed("Hamburger menu is not Displayed");
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewAndEditAddressDetails " + e.toString());
		}
	}

	// UAT_IND_038
	public void validatePatientAbletoProvideFeedback() {
		try {

			clickOn("btn_DashboardPage_Hamburgermenu");

			waitForElement("lnk_Hamburgermenu_TermsAndCondition", 5);

			clickOn("lnk_Hamburgermenu_Feedback");

			verifyElementIsDisplayed("header_Hamburgermenu_Feedback");

			isListOfElementsDisplayed("txt_Hamburgermenu_Message,btn_Hamburgermenu_Submit");

			typeIn("txt_Hamburgermenu_Message", "Feedback Testing Message");

			closeKeyBoard();

			validateElementEnabled("btn_Hamburgermenu_Submit", "true");

			testStepInfo("Testcase UAT_IND_038 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewAndEditAddressDetails " + e.toString());
		}
	}

	// UAT_IND_039
	public void validatePatientTermsandConditions() {
		try {

			clickOn("btn_DashboardPage_Hamburgermenu");

			waitForElement("lnk_Hamburgermenu_TermsAndCondition", 5);

			clickOn("lnk_Hamburgermenu_TermsAndCondition");

			verifyElementIsDisplayed("lbl_Hamburgermenu_TermsAndCondition");

			clickOn("btn_Hamburgermenu_Close");

			waitForElement("btn_DashboardPage_Emergency", 5);

			verifyElementIsDisplayed("btn_DashboardPage_Emergency");

			testStepInfo("Testcase UAT_IND_039 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewAndEditAddressDetails " + e.toString());
		}
	}

	// UAT_IND_040
	public void validateAccessNewSubscriptionPlan(String callBackRequestedVerificationText) {
		try {
			navigateToSubscriptionPage();

			verifyElementIsDisplayed("lbl_Subscription_RequestCallBack");

			clickOn("lbl_Subscription_RequestCallBack");

			waitForElement("lbl_Subscription_CallBackRequestedTexts", 3);

			getText("lbl_Subscription_CallBackRequestedTexts", callBackRequestedVerificationText);

			clickOn("btn_Subscription_Done");

			// verify cheviron back button and click on it

			testStepInfo("Testcase UAT_IND_040 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validateAccessNewSubscriptionPlan " + e.toString());
		}
	}

	// UAT_IND_041
	public void validateUserviewActiveSubscriptionPlan() {
		try {

			navigateToSubscriptionPage();

			verifyElementIsDisplayed("lbl_Subscription_Title");

			isListOfElementsDisplayed(
					"lbl_Subscription_ActiveIcon,lbl_Subscription_MyDevice,lbl_Subscription_ManageDevice");

			clickOn("lbl_Subscription_ManageDevice");

			verifyElementIsDisplayed("lbl_MyDevices_Title");

			clickOn("lbl_LatestPrescription_ChevronBack");

			waitForElement("btn_Subscription_RequestACall", 5);

			clickOn("btn_Subscription_RequestACall");

			getAndMatchListElementTexts("msgTxt_OrderPage_ContactBackSuccessMSg",
					"Callback Requested##One of our executives will contact you in the next 24 hours");

			clickOn("btn_OrderPage_Done");

			testStepPassed("Done button is displayed");

			testStepInfo("Testcase UAT_IND_041 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validateAccessNewSubscriptionPlan " + e.toString());
		}
	}

	// UAT_IND_042
	public void validateMyDevicesUIAndClickBack() {
		try {
			navigateToSettingsPage();

			clickOn("lbl_Settings_MyDevices");

			verifyElementIsDisplayed("lbl_MyDevices_Title");

			verifyElementIsDisplayed("lbl_MyDevices_ConnectYourDevices");

			// validate User should get clickable list of all the paired devices

			// (User device will get connected or disconnected from the application)

			verifyElementIsDisplayed("img_MyDevices_BluetoothIcon");// Unable to check whether bluetooth is mounted or
			// not.

			clickOn("img_MyDevices_ChevronBack");

			if (isElementPresent("lbl_Settings_Title"))// need clarification with excel sheet
			{
				testStepPassed("Successfully navigated back to settings page");
			} else {
				testStepFailed("Unable to navigate back to settings page");
			}

			testStepInfo("Testcase UAT_IND_042 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validateAccessNewSubscriptionPlan " + e.toString());
		}
	}

	// UAT_IND_043
	public void validatePatientConnectDisconnectTrustedDevices() {
		try {
			navigateToSettingsPage();

			clickOn("btn_Hamburgermenu_settings_PasswordAndSecurity");

			isListOfElementsDisplayed(
					"lbl_Hamburgermenu_settings_PasswordAndSecurity_ChangePassword,lbl_Hamburgermenu_settings_PasswordAndSecurity_Currentpassword,lbl_Hamburgermenu_settings_PasswordAndSecurity_Newpassword,lbl_Hamburgermenu_settings_PasswordAndSecurity_Confirmpassword,txt_Hamburgermenu_settings_PasswordAndSecurity_Currentpassword,txt_Hamburgermenu_settings_PasswordAndSecurity_Newpassword,txt_Hamburgermenu_settings_PasswordAndSecurity_Confirmpassword");

			validateElementEnabled("btn_PasswordAndSecurity_UpdatedPassword", "false");

			scrollToText("Trusted Devices");

			clickOn("lnk_PasswordAndSecurity_TrustedDevices");

			verifyElementIsDisplayed("header_TrustedDevices_device");

			verifyElementIsDisplayed("lbl_TrustedDevices_ListOfDevices");

			List<WebElement> elements = findWebElements("lbl_TrustedDevices_ListOfDevices");

			for (WebElement element : elements) {
				String value = element.getText();
				if (!(value.equals(""))) {
					testStepPassed(value + " is displayed");
				}
			}

			clickOn("btn_TrustedDevices_SignOutOfAllDevices");

			// Not displayed
			// 1. Cancel (On click of which the request will be canceled and the user will
			// be navigated back to the Trusted device screen.
			// 2. Disconnect (On click of which the selected mobile phone will be
			// disconnected from the trusted device list.)

			testStepInfo("Testcase UAT_IND_043 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientConnectDisconnectTrustedDevices " + e.toString());
		}
	}

	// UAT_IND_044
	public void validatePatientCanAccessDietAndWellnessPage() {
		try {

			navigateToDietAndWellnessPage();

			testStepPassed("Today's Goal Count is : " + getText("val_DietAndWellness_TodayGoalCount"));

			testStepPassed("Today's Sleep Count is : " + getText("val_DietAndWellness_SleepGoalCount"));

			testStepPassed("Today's Step Count is : " + getText("val_DietAndWellness_StepsGoalCount"));

			isListOfElementsDisplayed("lbl_DietAndWellness_ViewDietPlan,lbl_DietAndWellness_ViewExercises");

			isListOfElementsDisplayed(
					"lbl_DietAndWellness_CoachName,lbl_DietAndWellness_CoachImage,lbl_DietAndWellness_CoachChevron");

			testStepPassed("Coach Name is :" + getText("lbl_DietAndWellness_CoachName"));

			clickOn("tab_DietAndWellness_CoachTab");

			isListOfElementsDisplayed(
					"lbl_CoachPage_CoachName,lbl_CoachPage_CoachActiveChatsLabel,lbl_CoachPage_CoachUpcomingChats,lbl_CoachPage_CoachHistory,btn_CoachPage_BookAnAppointment");

			testStepInfo("Testcase UAT_IND_044 Completed successfully");

		} catch (Exception e) {
			testStepFailed(
					"Exception in the method validatePatientCanAccessAndViewDietAndWellnessPage " + e.toString());
		}
	}

	// UAT_IND_045
	public void validatePatientViewExercisePlanCurrentDate() {
		try {

			navigateToDietAndWellnessPage();

			clickOn("lbl_DietAndWellness_ViewExercises");

			verifyElementIsDisplayed("header_DietAndLifeStyle_ExercisePlan");

			isListOfElementsDisplayed("btn_DietAndLifeStyle_iButton,btn_DietAndLifeStyle_ExerciseEllipsis");

			getListElementsText("lst_DietAndLifeStyle_Exercises");

			if (isElementPresent("lnk_DietAndLifeStyle_YoutubeLink")) {

				testStepFailed("Exercises Tabs in Expanded State");
			} else {
				testStepPassed("Exercises Tabs are not in Expanded State");

			}

			List<WebElement> Exercises = findWebElements("lst_DietAndLifeStyle_ExpandArrows");
			Exercises.get(0).click();

			if (isElementPresent("lnk_DietAndLifeStyle_YoutubeLink")) {
				testStepPassed("Exercise is Expanded Successfully and Youtube Link is Displayed");
			} else {
				testStepFailed("Exercise is not Expanded and Youtube Link is not Displayed");
			}

			testStepInfo("Testcase UAT_IND_045 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientViewExercisePlanCurrentDate " + e.toString());
		}
	}

	// UAT_IND_046
	public void validatePatientAccessOtherFunctionalitiesofExercisePage() {
		try {

			navigateToDietAndWellnessPage();

			clickOn("lbl_DietAndWellness_ViewExercises");

			verifyElementIsDisplayed("header_DietAndLifeStyle_ExercisePlan");

			isListOfElementsDisplayed("btn_DietAndLifeStyle_iButton,btn_DietAndLifeStyle_ExerciseEllipsis");

			testStepPassed(getText("lbl_DietAndLifeStyle_UpdatedOnDate"));

			clickOn("btn_DietAndLifeStyle_ExerciseEllipsis");

			verifyElementIsDisplayed("btn_DietAndLifeStyle_ContactCoach");// Download as PDF is missing

			clickOn("btn_DietAndLifeStyle_ContactCoach");

			isListOfElementsDisplayed(
					"lbl_CoachPage_CoachName,lbl_CoachPage_CoachActiveChatsLabel,lbl_CoachPage_CoachUpcomingChats,lbl_CoachPage_CoachHistory,btn_CoachPage_BookAnAppointment");

			testStepInfo("Testcase UAT_IND_046 Completed successfully");

		} catch (Exception e) {
			testStepFailed(
					"Exception in the method validatePatientAccessOtherFunctionalitiesofExercisePage " + e.toString());
		}
	}

	// UAT_IND_047
	public void validatePatientCanViewDietGuidelines() {
		try {

			navigateToDietAndWellnessPage();

			clickOn("lbl_DietAndWellness_ViewDietPlan");

			verifyElementIsDisplayed("header_DietAndLifeStyle_DietPlan");

			isListOfElementsDisplayed("btn_DietAndLifeStyle_iButton,btn_DietAndLifeStyle_DietEllipsis");

			testStepPassed(getText("lbl_DietAndLifeStyle_UpdatedOnDate"));

			clickOn("btn_DietAndLifeStyle_iButton");

			verifyElementIsDisplayed("lbl_DietAndLifeStyle_DietInstructions");

			clickOn("btn_DietAndLifeStyle_CloseButton");

			verifyElementIsDisplayed("header_DietAndLifeStyle_DietPlan");

			clickOn("btn_DietAndLifeStyle_DietEllipsis");

			isListOfElementsDisplayed("btn_DietAndLifeStyle_ContactCoach,btn_DietAndLifeStyle_DietDloadAsPDF");

			testStepInfo("Testcase UAT_IND_047 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewDietGuidelines " + e.toString());
		}
	}

	// UAT_IND_048
	public void validatePatientCanViewExerciseGuidelines() {
		try {

			navigateToDietAndWellnessPage();

			clickOn("lbl_DietAndWellness_ViewExercises");

			verifyElementIsDisplayed("header_DietAndLifeStyle_ExercisePlan");

			isListOfElementsDisplayed("btn_DietAndLifeStyle_iButton,btn_DietAndLifeStyle_ExerciseEllipsis");

			testStepPassed(getText("lbl_DietAndLifeStyle_UpdatedOnDate"));

			clickOn("btn_DietAndLifeStyle_iButton");

			verifyElementIsDisplayed("lbl_DietAndLifeStyle_ExerciseInstructions");

			clickOn("btn_DietAndLifeStyle_CloseButton");

			verifyElementIsDisplayed("header_DietAndLifeStyle_ExercisePlan");

			testStepInfo("Testcase UAT_IND_048 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCanViewExerciseGuidelines " + e.toString());
		}
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------//

	// Methods
	public void navigateToPrescriptionPage() {

		clickOn("btn_DashboardPage_Hamburgermenu");
		verifyElementIsDisplayed("lbl_Hamburger_Prescriptions");
		clickOn("lbl_Hamburger_Prescriptions");
		if (isElementPresent("lbl_Prescriptions_Title")) {
			testStepPassed("Successfully navigated to prescriptions page");
		} else {
			testStepFailed("Unable to navigate to prescriptions page");
		}
	}

	public void navigateToSubscriptionPage() {

		clickOn("btn_DashboardPage_Hamburgermenu");
		verifyElementIsDisplayed("lbl_Hamburger_Subscription");
		clickOn("lbl_Hamburger_Subscription");
		if (isElementPresent("lbl_Subscription_Title")) {
			testStepPassed("Successfully navigated to subscription page");
		} else {
			testStepFailed("Unable to navigate to subscription page");
		}
	}

	public void navigateToSettingsPage() {
		clickOn("btn_DashboardPage_Hamburgermenu");
		verifyElementIsDisplayed("lbl_Hamburger_Settings");
		clickOn("lbl_Hamburger_Settings");
		if (isElementPresent("lbl_Settings_Title")) {
			testStepPassed("Successfully navigated to settings page");
		} else {
			testStepFailed("Unable to navigate to settings page");
		}
	}

	public void navigateToDietAndWellnessPage() {
		clickOn("btn_DashboardPage_Hamburgermenu");
		verifyElementIsDisplayed("lbl_Hamburger_DietAndLifeStyle");
		clickOn("lbl_Hamburger_DietAndLifeStyle");
		if (isElementPresent("lbl_DietAndWellness_Title")) {
			testStepPassed("Successfully navigated to diet and wellness page");
		} else {
			testStepFailed("Unable to navigate to diet and wellness page");
		}
	}

	public void validateLatestPrescriptions() {
		List<WebElement> elements = findWebElements("lst_LatestPrescription_MedicineList");// 3

		for (int i = 0; i < elements.size(); i++) {
			testStepInfo("Details of the Prescribed Medicine" + i);
			WebElement element = elements.get(i);
			parseidentifyByAndlocator("txt_LatestPrescription_MedicineDetails");
			List<WebElement> elements2 = element.findElements(By.xpath(this.locator));//
			for (int j = 0; j < elements2.size(); j++) {
				testStepPassed(elements2.get(j).getText().trim() + " is displayed");
			}
		}
	}

	public void validateUploadedPrescriptions() {
		List<WebElement> elements = findWebElements("lst_UploadPrescription_PrescriptionList");//
		for (int i = 0; i < elements.size(); i++) {
			testStepInfo("Details of the Prescription Number" + i);
			WebElement element = elements.get(i);
			parseidentifyByAndlocator("txt_UploadPrescription_PrescriptionDetails");
			List<WebElement> elements2 = element.findElements(By.xpath(this.locator));//
			for (int j = 0; j < elements2.size(); j++) {
				testStepPassed(elements2.get(j).getText().trim() + " is displayed");
			}
		}
	}

}
