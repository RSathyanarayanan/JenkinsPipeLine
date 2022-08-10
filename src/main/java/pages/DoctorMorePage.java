package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class DoctorMorePage extends ApplicationKeywords {

	public DoctorMorePage(BaseClass obj) {
		super(obj);
	}

	//UAT_IND_PREREQ_003
	public void validateDoctorCanAddSlotForConsultation(String consultationFees)
	{
		try
		{
			String setFromHour = "01";

			String setFromMinute = "00";

			String setToHour = "23";

			String setToMinute = "45";

			clickOn("FooterIcons_More");

			waitForElement("btn_More_Setting", 5);

			clickOn("btn_More_Setting");

			waitForElement("btn_More_Setting_ConsultationDetails", 5);

			clickOn("btn_More_Setting_ConsultationDetails");

			testStepInfo("Consultation Details Page Verification");

			while(findWebElement("btn_DoctorConsultationDetails_Switch").getText().equalsIgnoreCase("ON"))
			{
				isListOfElementsDisplayed(
						"lbl_More_Setting_ConsultationDetails_consultationType,lbl_More_Setting_ConsultationDetails_ConsultationFee,lbl_More_Setting_ConsultationDetails_SlotDuration,lbl_More_Setting_ConsultationDetails_ADD");

				clickOn("img_DoctorConsultationDetails_DeleteSlot");
				
				waitForElementToDisplay("btn_DoctorConsultationDetails_Switch", 30);

				verifyElementIsDisplayed("btn_DoctorConsultationDetails_Switch");

				waitTime(5);
			}

			if(findWebElement("btn_DoctorConsultationDetails_Switch").getText().equalsIgnoreCase("OFF"))
			{
				clickOn("btn_DoctorConsultationDetails_Switch");

				clickOn("lbl_More_Setting_ConsultationDetails_ConsultationFee");

				typeIn("lbl_More_Setting_ConsultationDetails_ConsultationFee",consultationFees);

				closeKeyBoard();
				
				waitTime(3);
				               
				clickOn("lbl_More_Setting_ConsultationDetails_ADD");

				for(int i = 0; i < 7; i ++)
				{
					List<WebElement> elements = findWebElements("btn_DoctorConsultationDetails_SelectDays");

					elements.get(i).click();
				}

				clickOn("btn_DoctorConsultationDetails_FromTime");

				isListOfElementsDisplayed("btn_DoctorConsultationDetails_SelectTimeKeyboard");

				clickOn("btn_DoctorConsultationDetails_SelectTimeKeyboard");

				typeIn("btn_DoctorConsultationDetails_SetTimeHour" , setFromHour);

				typeIn("btn_DoctorConsultationDetails_SetTimeMinute" , setFromMinute);

				clickOn("btn_DoctorConsultationDetails_TimeSlotOkButton");


				clickOn("btn_DoctorConsultationDetails_ToTime");

				isListOfElementsDisplayed("btn_DoctorConsultationDetails_SelectTimeKeyboard");

				clickOn("btn_DoctorConsultationDetails_SelectTimeKeyboard");

				typeIn("btn_DoctorConsultationDetails_SetTimeHour" , setToHour);

				typeIn("btn_DoctorConsultationDetails_SetTimeMinute" , setToMinute);

				clickOn("btn_DoctorConsultationDetails_TimeSlotOkButton");

				waitTime(2);

				validateElementEnabled("btn_DoctorConsultationDetails_ConfirmButton", "true");

				clickOn("btn_DoctorConsultationDetails_ConfirmButton");

				validateElementEnabled("btn_DoctorConsultationDetails_SaveButton", "true");

				clickOn("btn_DoctorConsultationDetails_SaveButton");

				isListOfElementsDisplayed("lbl_DoctorConsultationDetails_SaveConsultation_SuccessBanner,lbl_More_Setting_ConsultationDetails_consultationType,lbl_More_Setting_ConsultationDetails_ConsultationFee,lbl_More_Setting_ConsultationDetails_SlotDuration,lbl_More_Setting_ConsultationDetails_ADD");
			}

			else
			{
				testStepFailed("Unable to find Teleconsultation Switch Button");
			}
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method validateDoctorCanAddSlotForConsultation " +e.toString());
		}
	}
	// UAT_IND_069
	public void validateDoctorCanSetupProfile() {
		try {

			clickOn("FooterIcons_More");

			waitForElementToDisplay("btn_More_profile", 5);

			clickOn("btn_More_profile");

			isListOfElementsDisplayed(
					"btnSupportIcons_More_profile_support,btn_More_profile_personalDetails,btn_More_profile_clinicDetails,btn_More_profile_professionalDetails,btn_More_profile_prescriptionMnanagement,btn_More_profile_MyDocument");

			clickOn("btnSupportIcons_More_profile_support");

			verifyElementIsDisplayed("lbl_DoctorSupportPage_Title");//lbl_profile_profileIcon

			clickOn("lbl_DoctorSupportPage_ChevronBack");

			// *****************Personal Sub Menu**************/
			testStepInfo("Profile Page Personal Details Verification");

			waitForElementToDisplay("btn_More_profile_personalDetails", 5);

			clickOn("btn_More_profile_personalDetails");

			waitTime(5); //Need to remove in future

			isListOfElementsDisplayed(
					"lbl_More_profile_personalDetails_FirstName,lbl_More_profile_personalDetails_LastNmae,lbl_More_profile_personalDetails_Gender,lbl_More_profile_personalDetails_primaryPhoneNumber,lbl_More_profile_personalDetails_SecondaryPhoneNumber,lbl_More_profile_personalDetails_EmailId,txt_More_profile_personalDetails_display");

			getAndMatchListElementTexts("txt_More_profile_personalDetails_display",
					"To update or change the above information, please contact Lyfe representative");

			clickOn("btn_DoctorPersonalDetails_BackButton");

			// ***************Clinic SubMenu**************/

			testStepInfo("Profile Page Clinic Details Verification");

			waitForElementToDisplay("btn_More_profile_clinicDetails", 5);

			clickOn("btn_More_profile_clinicDetails");

			isListOfElementsDisplayed(
					"lbl_More_ClinicDetails_clinicName,lbl_More_ClinicDetails_phoneNumber,lbl_More_ClinicDetails_Timing,lbl_More_ClinicDetails_Address,lbl_More_ClinicDetails_City,lbl_More_ClinicDetails_state");

			scrollToText("To update or");

			waitForElementToDisplay("txt_More_ClinicDetails_Display", 10);

			getAndMatchListElementTexts("txt_More_ClinicDetails_Display",
					"To update or change the above information, please contact Lyfe representative");

			clickOn("btn_DoctorClinicDetails_BackButton");

			// ***************Professional SubMenu********************/

			testStepInfo("Profile Page Professional Details Verification");

			waitForElementToDisplay("btn_More_profile_professionalDetails", 5);

			clickOn("btn_More_profile_professionalDetails");

			waitForElementToDisplay("lbl_More_professional_HighestQualification", 5);

			isListOfElementsDisplayed(
					"lbl_More_professional_HighestQualification,lbl_More_professional_OtherQualifiaction,lbl_More_professional_Specialaziation,lbl_More_professional_Experience,lbl_More_professional_RegistratinonNumber,lbl_More_professional_Council,");

			getAndMatchListElementTexts("txt_More_professional_Display",
					"To update or change the above information, please contact Lyfe representative");

			clickOn("btn_DoctorProfessionalDetails_BackButton");

			// ****************Prescription Management SubMenu********************/

			testStepInfo("Profile Page Prescription Management Details Verification");

			waitForElementToDisplay("btn_More_profile_prescriptionMnanagement", 5);
			clickOn("btn_More_profile_prescriptionMnanagement");
			isListOfElementsDisplayed(
					"lbl_More_prescriptionManagemant_AddressOnPrescription,lbl_prescriptionManagemant_DigitalSignature");
			clickOn("btn_DoctorPrescriptionManagement_BackButton");

			// ****************My documents SubMenu**********************/

			testStepInfo("My Documents Verification");

			waitForElementToDisplay("btn_More_profile_MyDocument", 5);
			clickOn("btn_More_profile_MyDocument");
			verifyElementIsDisplayed("lbl_More_MyDocuments");
			getText("txt_MyDocuments");
			clickOn("btn_DoctorMyDocuments_BackButton");

			testStepInfo("Testcase UAT_IND_069 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validateDoctorCanSetupProfile " + e.toString());
		}
	}

	// UAT_IND_073
	public void validateDoctorTermsConditionsAndFeedback(String FeedbackData) {
		try {

			clickOn("FooterIcons_More");

			verifyElementIsDisplayed("lbl_MorePage_TermsandConditions");

			clickOn("lbl_MorePage_TermsandConditions");

			isListOfElementsDisplayed("icn_MorePage_TermsAndConditions_iIcon,btn_MorePage_TermsAndConditions_Close");

			// continue button and Check box is missing

			clickOn("btn_MorePage_TermsAndConditions_Close");

			verifyElementIsDisplayed("lbl_MorePage_Profile");

			clickOn("lbl_MorePage_Feedback");

			testStepPassed("Help Text in the Feedback to provide feedback is displayed"
					+ getText("btn_MorePage_feedback_Helptext"));

			isListOfElementsDisplayed(
					"btn_MorePage_feedback_Helptext,btn_MorePage_feedback_Support,btn_MorePage_feedback_BackChevron");

			typeIn("txt_MorePage_feedback_FeedbackTextBox", FeedbackData);

			String ExpectedValue = FeedbackData.length() + "/2000";
			String ActualValue = getText("btn_MorePage_feedback_FeedbackWordCount");
			if (ActualValue.equals(ExpectedValue)) {
				testStepPassed("Character Limit verification sucessful");
			} else {
				testStepFailed("Character Limit verification not sucessful");
			}

			testStepInfo("Testcase UAT_IND_073 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validateDoctorTermsConditionsAndFeedback " + e.toString());
		}
	}

	// UAT_IND_074
	public void validateUserAbletoContactSupport() {
		try {

			clickOn("FooterIcons_More");

			clickOn("lbl_MorePage_Support");

			waitTime(5);

			verifyElementIsDisplayed("lbl_MorePage_SupportHeader");

//			scrollToText("Patient Details");
//
//			verifyElementIsDisplayed("lbl_MorePage_Support_FAQ");

			scrollToText("Sub Category");
			
			findWebElement("lbl_MorePage_Support_ContactUs").click();//Since element is not displayed in ios just performing a clicking to scroll down

			isListOfElementsDisplayed(
					"lbl_MorePage_Support_ContactUs,lbl_MorePage_Support_Category,lbl_MorePage_Support_Subcategory");

			scrollToText("Ticket History");
			
			findWebElement("lbl_MorePage_Support_TicketHistory").click();//Since element is not displayed in ios just performing a clicking to scroll down

			isListOfElementsDisplayed(
					"txt_MorePage_Support_Message,btn_MorePage_Support_Submit,btn_MorePage_Support_Call,lbl_MorePage_Support_TicketHistory");

			testStepInfo("Testcase UAT_IND_074 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Failed in validateUserAbletoContactSupport " + e.toString());
		}
	}

	// UAT_IND_075
	public void validateUserabletoViewFAQandRaiseQueryinContactUs(String ContactUsData) {
		try {

			clickOn("FooterIcons_More");

			clickOn("lbl_MorePage_Support");

			waitTime(5);

			verifyElementIsDisplayed("lbl_MorePage_SupportHeader");

			scrollToText("Alerts and Emergency");

			getAndMatchListElementTexts("lst_MorePage_Support_FAQ",
					"Patient plans##Accounts##Patient Details##Appointments##Teleconsultation and Chat Issues##Prescription##Alerts##Support");

			clickOn("btn_MorePage_Support_PatientPlan");

			isListOfElementsDisplayed(
					"btn_MorePage_FAQ_BackButton,btn_MorePage_FAQ_MessageUs,btn_MorePage_FAQ_Search");

			clickOn("btn_MorePage_FAQ_BackButton");

			scrollToText("Sub Category");

			clickOn("drp_MorePage_Support_Category");

			String objLocator1 = getObjectLocator("txt_Category_CategoryValue").replace("<<CATEGORY>>", "Account");

			updateObjectLocator("txt_Category_CategoryValue", objLocator1);

			clickOn("txt_Category_CategoryValue");

			clickOn("drp_MorePage_Support_SubCategory");

			String objLocator2 = getObjectLocator("txt_Category_SubCategoryValue").replace("<<SUBCATEGORY>>",
					"Login and Setup");

			updateObjectLocator("txt_Category_SubCategoryValue", objLocator2);

			clickOn("txt_Category_SubCategoryValue");

			scrollToText("Ticket History");

			typeIn("txt_MorePage_Contact_MessageTextBox", ContactUsData);

			String ExpectedValue = ContactUsData.length() + "/2000";
			String ActualValue = getText("btn_MorePage_Contact_MessageWordCount");
			if (ActualValue.equals(ExpectedValue)) {
				testStepPassed("Character Limit verification sucessfull");
			} else {
				testStepFailed("Character Limit verification not sucessfull");
			}

			// Not submitting because of Ticket counts

			testStepInfo("Testcase UAT_IND_075 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Failed in validateUserabletoViewFAQandRaiseQueryinContactUs " + e.toString());
		}
	}

	// UAT_IND_076
	public void validateUserViewAllPastTickets() {
		try {

			clickOn("FooterIcons_More");

			clickOn("lbl_MorePage_Support");

			verifyElementIsDisplayed("lbl_MorePage_SupportHeader");

			List<WebElement> elements = findWebElements("lst_MorePage_Support_Tickets");
			elements.get(0).click();

			isListOfElementsDisplayed("lbl_MorePage_Support_TicketDetails,lbl_MorePage_Support_TicketID");

			testStepPassed("Ticket Number is :" + getText("lbl_MorePage_Support_TicketNumber"));

			testStepPassed("Ticket Group is: " + getText("lbl_MorePage_Support_TicketGroup"));

			testStepPassed("Ticket Title is : " + getText("lbl_MorePage_Support_TicketTitle"));

			testStepPassed("Ticket logged timing is : " + getText("lbl_MorePage_Support_TicketDateandTime"));

			testStepPassed("Ticket Status is : " + getText("lbl_MorePage_Support_TicketStatus"));

			clickOn("btn_MorePage_Support_BackChevron");

			waitForElement("lbl_MorePage_SupportHeader", 10);

			testStepInfo("Testcase UAT_IND_076 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Failed in validateUserViewAllPastTickets " + e.toString());
		}
	}

	// UAT_IND_078
	public void validateDoctorSettingPagesandElements() {
		try {

			clickOn("FooterIcons_More");

			waitForElement("btn_More_Setting", 5);

			clickOn("btn_More_Setting");

			isListOfElementsDisplayed(
					"btn_More_Setting_BankAccountDetails,btn_More_Setting_ConsultationDetails,btn_More_Setting_PasswordAndSecurity,btn_More_Setting_Notification,lbl_More_SupportIcon");


			/******************** BankAccountDetails ******************************/

			testStepInfo("Bank Account Details Page Verification");

			clickOn("btn_More_Setting_BankAccountDetails");

			isListOfElementsDisplayed(
					"lbl_Settings_BankDetails_IFSC,lbl_Settings_BankDetails_BankName,lbl_Settings_BankDetails_BranchName,lbl_Settings_BankDetails_CityName,lbl_Settings_BankDetails_AccountNumber,lbl_Settings_BankDetails_BeneficiaryName");

			if (currentMachineName.equalsIgnoreCase("Android") || currentMachineName.contains("Android")) 
			{
				testStepPassed("The IFSC Value is" + getText("val_Settings_BankDetails_IFSC"));

				testStepPassed("The Bank Name Value is" + getText("val_Settings_BankDetails_BankName"));

				testStepPassed("The Branch Name Value is" + getText("val_Settings_BankDetails_BranchName"));

				testStepPassed("The City Name Value is" + getText("val_Settings_BankDetails_CityName"));

				testStepPassed("The Account Number Value is" + getText("val_Settings_BankDetails_AccountNumber"));

				testStepPassed("The Benificary Name Value is" + getText("val_Settings_BankDetails_BeneficiaryName"));
			}

			clickOn("btn_More_BackChevron");


			/************************ Consultation Details**********************/

			testStepInfo("Consultation Details Page Verification");

			waitForElement("btn_More_Setting_ConsultationDetails", 5);

			clickOn("btn_More_Setting_ConsultationDetails");

			isListOfElementsDisplayed(
					"lbl_More_Setting_ConsultationDetails_consultationType,lbl_More_Setting_ConsultationDetails_ConsultationFee,lbl_More_Setting_ConsultationDetails_SlotDuration,lbl_More_Setting_ConsultationDetails_ADD");

			if (currentMachineName.equalsIgnoreCase("Android") || currentMachineName.contains("Android")) 
			{
				testStepPassed(
						"The consultationType Value is" + getText("val_More_Setting_ConsultationDetails_consultationType"));

				testStepPassed(
						"The consultationFee Value is" + getText("val_More_Setting_ConsultationDetails_consultationFee"));

			}
			clickOn("btn_More_BackChevron");


			/********************** Password&security *************************************/

			testStepInfo("Password and Security Page Verification");

			waitForElement("btn_More_Setting_PasswordAndSecurity", 5);

			clickOn("btn_More_Setting_PasswordAndSecurity");


			isListOfElementsDisplayed("lbl_More_Setting_PasswordAndSecurity_ChangePassword");

			testStepPassed(
					"The Currentpassword Value is" + getText("val_More_Setting_PasswordAndSecurity_CurrentPassword"));

			testStepPassed("The Newpassword Value is" + getText("val_More_Setting_PasswordAndSecurity_NewPassword"));

			testStepPassed("The Confirmpassword Value is"
					+ getText("val_More_Setting_PasswordAndSecurity_ConfirmNewPassword"));

			verifyElementIsDisplayed("btn_More_Setting_PasswordAndSecurity_UpdatePassword");

			clickOn("btn_More_BackChevron");



			/********************** Notification *************************************/

			testStepInfo("Notification Page Verification");

			waitForElement("btn_More_Setting_Notification", 5);

			clickOn("btn_More_Setting_Notification");

			isListOfElementsDisplayed(
					"lbl_More_Setting_Notification_Schedule,lbl_More_Setting_Notification_AlertAndChart,lbl_More_Setting_Notification_GeneralNotification");

			if (currentMachineName.equalsIgnoreCase("Android") || currentMachineName.contains("Android")) 
			{
				
				clickOn("lbl_More_Setting_Notification_Schedule");

				validateElementChecked("lbl_More_Setting_Notification_Schedule", "false");

				clickOn("lbl_More_Setting_Notification_AlertAndChart");

				validateElementChecked("lbl_More_Setting_Notification_AlertAndChart", "false");

				clickOn("lbl_More_Setting_Notification_GeneralNotification");

				validateElementChecked("lbl_More_Setting_Notification_GeneralNotification", "false");

				clickOn("lbl_More_Setting_Notification_Schedule");

				validateElementChecked("lbl_More_Setting_Notification_Schedule", "true");

				clickOn("lbl_More_Setting_Notification_AlertAndChart");

				validateElementChecked("lbl_More_Setting_Notification_AlertAndChart", "true");

				clickOn("lbl_More_Setting_Notification_GeneralNotification");

				validateElementChecked("lbl_More_Setting_Notification_GeneralNotification", "true");
			}
			 else if (currentMachineName.equalsIgnoreCase("iOS") || currentMachineName.contains("iOS")) 
			 {
				 validateElementEnabled("lbl_More_Setting_Notification_Schedule", "true");
				 
				 validateElementEnabled("lbl_More_Setting_Notification_AlertAndChart", "true");
				 
				 validateElementEnabled("lbl_More_Setting_Notification_GeneralNotification", "true");
			 }
			 else
			 {
				 testStepFailed("Current Machine Name is not Android / IOS. Kindly Check the Environment");
			 }

			clickOn("btn_More_BackChevron");

			testStepInfo("Testcase UAT_IND_078 Completed successfully");


		} catch (Exception e) {
			testStepFailed("Failed in validateDoctorSettingPagesandElements " + e.toString());
		}
	}

	// UAT_IND_079
	public void validateDoctorManageStaffDetails(String firstName, String lastName, String clinicName, String registrationNumber, String mobileNumber, String emailId) {
		try {

			String name = firstName + " " + lastName;

			clickOn("FooterIcons_More");

			verifyElementIsDisplayed("lbl_MorePage_Profile");

			clickOn("lbl_MorePage_ManageStaff");

			isListOfElementsDisplayed("lbl_MorePage_ManageStaff_MyStaff,btn_MorePage_ManageStaff_AddStaff");

			clickOn("btn_MorePage_ManageStaff_AddStaff");

			verifyElementIsDisplayed("lbl_DoctorMorePage_AddStaff_UploadYourPhoto");

			typeIn("lbl_DoctorMorePage_AddStaff_FirstName", firstName);

			typeIn("lbl_DoctorMorePage_AddStaff_LastName", lastName);

			typeIn("lbl_DoctorMorePage_AddStaff_ClinicName", clinicName);

			closeKeyBoard();

			clickOn("lbl_DoctorMorePage_AddStaff_Role");
			
			verifyElementIsDisplayed("lbl_DoctorMorePage_AddStaff_RoleReceptionist");

			clickOn("lbl_DoctorMorePage_AddStaff_RoleReceptionist");

			waitTime(2);

			clickOn("lbl_DoctorMorePage_AddStaff_RegistrationNumber");

			typeIn("lbl_DoctorMorePage_AddStaff_RegistrationNumber", registrationNumber);

			closeKeyBoard();

			clickOn("lbl_DoctorMorePage_AddStaff_MobileNumber");

			typeIn("lbl_DoctorMorePage_AddStaff_MobileNumber", mobileNumber);

			closeKeyBoard();

			clickOn("lbl_DoctorMorePage_AddStaff_EmailInput");

			typeIn("lbl_DoctorMorePage_AddStaff_EmailInput", emailId);

			closeKeyBoard();

			clickOn("lbl_DoctorMorePage_AddStaff_Next");

			isListOfElementsDisplayed("lbl_DoctorMorePage_AddStaff_Scheduling,lbl_DoctorMorePage_AddStaff_PatientManagement,lbl_DoctorMorePage_AddStaff_Save,lbl_DoctorMorePage_AddStaff_Back");

			clickOn("lbl_DoctorMorePage_AddStaff_Save");

			isListOfElementsDisplayed("lbl_DoctorMorePage_AddStaff_SuccessBanner");

			String objLocator = getObjectLocator("lbl_DoctorMorePage_MyStaff_Ellipse").replace("<<STAFFNAME>>", name);

			updateObjectLocator("lbl_DoctorMorePage_MyStaff_Ellipse",objLocator);

			clickOn("lbl_DoctorMorePage_MyStaff_Ellipse");

			isListOfElementsDisplayed("lbl_DoctorMorePage_MyStaff_EllipseEdit,lbl_DoctorMorePage_MyStaff_EllipsePermissions,lbl_DoctorMorePage_MyStaff_EllipseDelete");

			clickOn("lbl_DoctorMorePage_MyStaff_EllipseDelete");

			isListOfElementsDisplayed("lbl_DoctorMorePage_MyStaff_CancelButton,lbl_DoctorMorePage_MyStaff_DeleteButton");

			clickOn("lbl_DoctorMorePage_MyStaff_DeleteButton");

			testStepPassed("Successfully Deleted Added Staff");

			testStepInfo("Testcase UAT_IND_079 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Failed in validateDoctorManageStaffDetails " + e.toString());
		}
	}

	// UAT_IND_080
	public void validateInviteFellowPractionersFunctionality(String FirstName, String LastName, String EmailID,
			String MobileNumber) {
		try {

			clickOn("FooterIcons_More");

			verifyElementIsDisplayed("lbl_MorePage_InviteMorePractioners");

			clickOn("lbl_MorePage_InviteMorePractioners");

			isListOfElementsDisplayed(
					"lbl_MorePage_InviteFellowPractioners_OnBoarding,btn_MorePage_InviteFellowPractioners_Invite");

			typeIn("txt_MorePage_InviteFellowPractioners_FirstName", FirstName);

			typeIn("txt_MorePage_InviteFellowPractioners_LastName", LastName);

			typeIn("txt_MorePage_InviteFellowPractioners_EmailID", EmailID);

			closeKeyBoard();

			typeIn("txt_MorePage_InviteFellowPractioners_MobileNumber", MobileNumber);

			closeKeyBoard();

			clickOn("btn_MorePage_InviteFellowPractioners_Invite");

			testStepInfo("Testcase UAT_IND_080 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Failed in validateInviteFellowPractionersFunctionality " + e.toString());
		}
	}

}
