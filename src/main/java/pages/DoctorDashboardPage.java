package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class DoctorDashboardPage extends ApplicationKeywords {

	public DoctorDashboardPage(BaseClass obj) {
		super(obj);
	}

	//UAT_IND_PREREQ_001
	public void validateDoctorResolveActiveChat()
	{
		try
		{
			if(isElementPresent("lbl_Dashboard_ActiveChatPanel"))
			{
				List<WebElement> elements = findWebElements("lst_Dashboard_ActiveChatList");

				elements.get(0).click();

				verifyElementIsDisplayed("lbl_Dashboard_ActiveChat_MarkAsResolved");

				clickOn("lbl_Dashboard_ActiveChat_MarkAsResolved");

				isListOfElementsDisplayed("lbl_Dashboard_ActiveChat_ResolveChatYes,lbl_Dashboard_ActiveChat_ResolveChatNo");

				clickOn("lbl_Dashboard_ActiveChat_ResolveChatYes");

				verifyElementIsDisplayed("lbl_Dashboard_ActiveChat_ResolveChat_SuccessBanner");
			}
			else
			{
				testStepPassed("There are no active chat. Ask Patient to initiate a chat");
			}
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method validateDoctorResolveActiveChat " +e.toString());
		}
	}

	// UAT_IND_066
	public void validateDoctorHomePageUIValidations() {
		try {
			if (isElementDisplayed("FooterIcons_DoctorHome")) {

				isListOfElementsDisplayed("btn_DoctorDashboard_notification,lbl_Dashboard_DoctorNameHeader,lbl_Dashboard_PatientAlerts");

				isListOfElementsDisplayed("lbl_Dashboard_critical,lbl_Dashboard_moderate,lbl_Dashboard_Normal");

				isListOfElementsDisplayed("val_Dashboard_critical,val_Dashboard_moderate,val_Dashboard_Normal");

				verifyElementIsDisplayed("lbl_Dashboard_ActiveChatPanel");

				isListOfElementsDisplayed(
						"FooterIcons_DoctorHome,FooterIcons_Appointment,FooterIcons_Patients,FooterIcons_More");

				testStepInfo("Testcase UAT_IND_066 Completed successfully");


			} else {
				testStepFailed("Doctor Homepage is not displayed");
			}

		} catch (Exception e) {
			testStepFailed("Failed in validateDoctorHomePageUIValidations " + e.toString());
		}
	}

	// UAT_IND_072,67,68
	public void OpenFirstActiveChat() {
		try {

			verifyElementIsDisplayed("lst_Dashboard_ActiveChatList");

			List<WebElement> elements = findWebElements("lst_Dashboard_ActiveChatList");

			elements.get(0).click();

			waitForElement("lbl_Dashboard_ActiveChat_PatientName", 5);

			testStepPassed("Doctor able to Enter patient's active chat");

		} catch (Exception e) {
			testStepFailed("Failed in OpenFirstActiveChat " + e.toString());
		}
	}

	// UAT_IND_067
	public void validateDoctorCanAttendpatientAppointments() {
		try {

			verifyElementIsDisplayed("lbl_Dashboard_ActiveChatPanel");
			
			scrollToText("Resolved Chats");

			isListOfElementsDisplayed("lbl_Dashboard_ResolvedChatPanel,lbl_Dashboard_ResolvedChatList");

			clickOn("lbl_Dashboard_ResolvedChatList");

			verifyElementIsDisplayed("lbl_PatientsPage_PatientName");

			clickOn("btn_PatientsPage_BackButton");

			OpenFirstActiveChat();

			isListOfElementsDisplayed(
					"lbl_Dashboard_ActiveChat_PatientName,lbl_Dashboard_ActiveChat_PatientId,lbl_Dashboard_ActiveChat_ProfilePicture,lbl_Dashboard_ActiveChat_BackChevron,lbl_Dashboard_ActiveChat_Join");

			testStepInfo("Testcase UAT_IND_067 Completed successfully");


		} catch (Exception e) {
			testStepFailed("Failed in validateDoctorCanAttendpatientAppointments " + e.toString());
		}
	}

	// UAT_IND_068
	public void validateHealthDashboardisAccessibleandCanAnswerPatientChat() {
		try {

			OpenFirstActiveChat();

			isListOfElementsDisplayed("lbl_Dashboard_ActiveChat_Profile,lbl_Dashboard_ActiveChat_RXSummary,lbl_Dashboard_ActiveChat_History,lbl_Dashboard_ActiveChat_RequestType,lbl_Dashboard_ActiveChat_MarkAsResolved");

			if (currentMachineName.equalsIgnoreCase("Android") || currentMachineName.contains("Android"))
			{

				isListOfElementsDisplayed("lbl_Dashboard_ActiveChat_Chat,lbl_Dashboard_ActiveChat_QuickResponse,btn_Dashboard_ActiveChat_Send,txt_Dashboard_ActiveChat_ChatTextBox");

				clickOn("lbl_Dashboard_ActiveChat_QuickResponse");

				getListElementsText("lst_Dashboard_ActiveChat_QuickResponses");
			}
			testStepInfo("Testcase UAT_IND_068 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Failed in validateHealthDashboardisAccessibleandCanAnswerPatientChat " + e.toString());
		}
	}


	// UAT_IND_072
	public void validateUserAbletoAccessAllTabsUnderPrescription(String chiefComplaint) {
		try {

			OpenFirstActiveChat();

			verifyElementIsDisplayed("lbl_Dashboard_ActiveChat_RXSummary");

			clickOn("lbl_Dashboard_ActiveChat_RXSummary");

			verifyElementIsDisplayed("lbl_DoctorRxSummaryPage_PatientDetails");

			isListOfElementsDisplayed("lbl_DoctorRxSummaryPage_Gender,lbl_DoctorRxSummaryPage_Age,lbl_DoctorRxSummaryPage_Height,lbl_DoctorRxSummaryPage_Weight,txt_DoctorRxSummaryPage_ChiefComplaints");

			typeIn("txt_DoctorRxSummaryPage_ChiefComplaints", chiefComplaint);
			
			clickOn("lbl_DoctorRxSummaryPage_Age");

			String ExpectedValue = (chiefComplaint.length() + "/2000").trim();
			String ActualValue = getText("lbl_DoctorRxSummaryPage_ChiefComplaints").trim();
			if (ActualValue.equalsIgnoreCase(ExpectedValue)) {
				testStepPassed("Character Limit Verification Successful");
			} else {
				testStepFailed("Character Limit Verification Is Not Successful");
				
			}

			scrollToText("Provisional Diagnosis");

			isListOfElementsDisplayed("btn_DoctorRxSummaryPage_ProvisionalDiagnosisAdd");

			scrollToText("Medicine");

			isListOfElementsDisplayed("btn_DoctorRxSummaryPage_MedicineAdd");

			clickOn("btn_DoctorRxSummaryPage_MedicineAdd");

			verifyElementIsDisplayed("btn_DoctorRxSummaryPage_MedicineAdd_Back");

			clickOn("btn_DoctorRxSummaryPage_MedicineAdd_Back");

			waitTime(2);

			scrollToText("Lab Investigation");

			isListOfElementsDisplayed("btn_DoctorRxSummaryPage_LabInvestigationAdd");

			scrollToText("Follow Up Date");

			isListOfElementsDisplayed("btn_DoctorRxSummaryPage_FollowUpDateAdd");

			scrollToText("General Advice");

			isListOfElementsDisplayed("txt_DoctorRxSummaryPage_GeneralAdvice");

			scrollToText("Send");

			isListOfElementsDisplayed("chk_DoctorRxSummaryPage_SelectCheckBox,btn_DoctorRxSummaryPage_SendButton");

			testStepInfo("Testcase UAT_IND_072 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Failed in validateUserAbletoAccessAllTabsUnderPrescription " + e.toString());
		}
	}

	// UAT_IND_077
	public void validateUserAbletoAccessNotifications() {
		try {

			clickOn("btn_DoctorDashboard_notification");

			isListOfElementsDisplayed("lbl_Notification_Pageheader,btn_Notification_VerticalEllipses");

			clickOn("btn_Notification_VerticalEllipses");

			isListOfElementsDisplayed("btn_Notification_MarkAllasRead,btn_Notification_NotificationSetting");

			isListOfElementsDisplayed("btn_Notification_All,btn_Notification_Schedule,btn_Notification_Chat,btn_Notification_Other");

			clickOn("btn_Notification_Chat");

			if(isElementPresent("img_Notification_Chat"))
			{
				testStepPassed("Chats are displayed");
			}
			else {
				testStepPassed("Chats are not available");
			}

			testStepPassed("Notifications are filtered correctly");

			testStepInfo("Testcase UAT_IND_077 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Failed in validateUserAbletoAccessNotifications " + e.toString());
		}
	}




}
