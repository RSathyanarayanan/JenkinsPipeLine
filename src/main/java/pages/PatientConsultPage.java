package pages;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class PatientConsultPage extends ApplicationKeywords {


	public PatientConsultPage(BaseClass obj) {
		super(obj);
	}



	// UAT_IND_049
	public void validatePatientCanAccessMyConsultationPageAndViewOnGoingProgress() {
		try {
			clickOn("FooterIcons_Consult");

			isListOfElementsDisplayed(
					"lbl_PatientConsultPage_Title,btn_PatientConsultPage_SupportIcon,lbl_PatientConsultPage_ActiveChatsAndAppointmentsTitle");

			clickOn("lst_PatientConsultPage_ActiveChatsAndAppointments");

			verifyElementIsDisplayed("btn_PatientConsultPage_ActiveChatDoctorName");

			testStepPassed(
					"The Doctor Name : " + getText("btn_PatientConsultPage_ActiveChatDoctorName") + " is displayed");

			verifyElementIsDisplayed("lbl_PatientConsultPage_ActiveChatScreenID");

			testStepPassed(
					"The Patient ID : " + getText("lbl_PatientConsultPage_ActiveChatScreenID") + " is displayed");

			//			verifyElementIsDisplayed("btn_PatientConsultPage_ActiveChatScreenJoin"); //Join Button is not displayed

			clickOn("btn_PatientConsultPage_ChevronBack");

			// Upcoming Appointments

			scrollToText("Upcoming");

			verifyElementIsDisplayed("lbl_PatientConsultPage_UpcomingAppointmentHeader");

			clickOn("lbl_PatientConsultPage_UpcomingAppointmentHeader");

			waitForElement("lbl_PatientAppointmentDetailsPage_Title", 5);

			isListOfElementsDisplayed(
					"lbl_PatientAppointmentDetailsPage_Title,lbl_PatientAppointmentDetailsPage_AppointmentId");

			testStepPassed("The Appointment ID : " + getText("lbl_PatientAppointmentDetailsPage_AppointmentId")
			+ " is displayed");

			testStepPassed("The Appointment Date and Time : "
					+ getText("lbl_PatientAppointmentDetailsPage_AppointmentDateAndTime") + " is displayed");

			//Reschedule and Cancel btn verification

			clickOn("lbl_PatientAppointmentDetailsPage_ChevronBack");

			// Health Team

			scrollToText("Coach");

			verifyElementIsDisplayed("lbl_PatientConsultPage_HealthTeamTitle");

			getListElementsText("lbl_PatientConsultPage_HealthTeamDetails");

			clickOn("lbl_PatientConsultPage_HealthTeamDetails");

			verifyElementIsDisplayed("btn_PatientConsultPage_ActiveChatDoctorName");

			testStepPassed(
					"The Doctor Name : " + getText("btn_PatientConsultPage_ActiveChatDoctorName") + " is displayed");

			getListElementsText("lbl_PatientConsultPage_ActiveChatScreenID");

			verifyElementIsDisplayed("btn_PatientHealthTeamDoctorPage_BookAppointment");

		} catch (Exception e) {

			testStepFailed("Exception in the method validatePatientCanAccessMyConsultationPageAndViewOnGoingProgress "
					+ e.toString());

		}

	}

	// UAT_IND_050(patient)
	public void validatePatientIsRedirectToAppointmentScreen() {
		try {
			// My Consultations
			clickOn("FooterIcons_Consult");
			isListOfElementsDisplayed("lbl_PatientConsultPage_Title,btn_PatientConsultPage_SupportIcon,lbl_PatientConsultPage_ActiveChatsAndAppointmentsTitle");

			// Support
			clickOn("btn_PatientConsultPage_SupportIcon");

			verifyElementIsDisplayed("lbl_PatientSupportPage_Title");

			clickOn("btn_PatientSupportPage_ChevronBack");

			// Active Chat and Appointments

			verifyElementIsDisplayed("lst_PatientConsultPage_ActiveChatsAndAppointments");

			testStepPassed("Successfully able to navigate back from Support Page");

			clickOn("lst_PatientConsultPage_ActiveChatsAndAppointments");

			verifyElementIsDisplayed("btn_PatientConsultPage_ActiveChatDoctorName");

			testStepPassed("The Doctor Name : " + getText("btn_PatientConsultPage_ActiveChatDoctorName") + " is displayed");

			verifyElementIsDisplayed("lbl_PatientConsultPage_ActiveChatScreenID");

			testStepPassed("The Patient ID : " + getText("lbl_PatientConsultPage_ActiveChatScreenID") + " is displayed");

			//			verifyElementIsDisplayed("btn_PatientConsultPage_ActiveChatScreenJoin"); //Join Button is not displayed

			clickOn("btn_PatientConsultPage_ChevronBack");

			// Upcoming Appointments
			scrollToText("Upcoming");

			verifyElementIsDisplayed("lbl_PatientConsultPage_UpcomingAppointmentHeader");

			clickOn("lbl_PatientConsultPage_UpcomingAppointmentHeader");

			waitForElement("lbl_PatientAppointmentDetailsPage_Title", 5);

			isListOfElementsDisplayed("lbl_PatientAppointmentDetailsPage_Title,lbl_PatientAppointmentDetailsPage_AppointmentId");

			testStepPassed("The Appointment ID : " + getText("lbl_PatientAppointmentDetailsPage_AppointmentId")
			+ " is displayed");

			verifyElementIsDisplayed("lbl_PatientAppointmentDetailsPage_AppointmentType");

			testStepPassed("The Appointment Date and Time : "
					+ getText("lbl_PatientAppointmentDetailsPage_AppointmentDateAndTime") + " is displayed");

			verifyElementIsDisplayed("lbl_PatientAppointmentDetailsPage_ReasonForAppointment");

			verifyElementIsDisplayed("lbl_PatientAppointmentDetailsPage_AppointmentWith");

			testStepPassed(getText("lbl_PatientAppointmentDetailsPage_AppointmentWith") + " is displayed");

			verifyElementIsDisplayed("lbl_PatientAppointmentDetailsPage_InvoiceTitle");

			verifyElementIsDisplayed("lbl_PatientAppointmentDetailsPage_InvoiceId");

			testStepPassed(getText("lbl_PatientAppointmentDetailsPage_InvoiceId") + " is displayed");

		} catch (Exception e) {
			testStepFailed("Failed in validatePatientIsRedirectToAppointmentScreen " + e.toString());
		}
	}


	// UAT_IND_051(patient)
	public void validateProfessionalsDashboardfromMyConsultationsPage() {
		try {
			clickOn("FooterIcons_Consult");

			verifyElementIsDisplayed("lbl_PatientConsultPage_Title");

			scrollToText("Health Team");

			verifyElementIsDisplayed("lbl_PatientConsultPage_HealthTeamTitle");

			//Blocker
			//Other Specialities is not displayed

		} catch (Exception e) {
			testStepFailed("Failed in validatePatientCanBookAppointmentSucessfullywithDoctor " + e.toString());
		}
	}


	// UAT_IND_PREREQ_004(patient)
	public void validatePatientCanBookAppointmentSucessfullywithDoctor(String queryCategory, String comment) {
		try {
			clickOn("FooterIcons_Consult");

			verifyElementIsDisplayed("lbl_PatientConsultPage_Title");

			scrollToText("Health Team");

			verifyElementIsDisplayed("lbl_PatientConsultPage_HealthTeamTitle");

			getListElementsText("lbl_PatientConsultPage_HealthTeamDetails");

			clickOn("lbl_PatientConsultPage_HealthTeamDetails");

			verifyElementIsDisplayed("btn_PatientHealthTeamDoctorPage_BookAppointment");
			
			scrollToText("Upcoming");
			
			if(isElementPresent(("lbl_PatientConsultPage_UpcomingAppointmentHeader")))
			{
//				clickOn("lbl_PatientConsultPage_UpcomingAppointmentHeader");
//
//				isListOfElementsDisplayed("btn_PatientAppointmentDetailsPage_ReSchedule,btn_PatientAppointmentDetailsPage_Cancel");
//				
//				clickOn("btn_PatientAppointmentDetailsPage_Cancel");
//				
//				verifyElementIsDisplayed("btn_PatientAppointmentDetailsPage_Proceed");
//				
//				clickOn("btn_PatientAppointmentDetailsPage_Proceed");
//				
//				verifyElementIsDisplayed("btn_PatientAppointmentDetailsPage_Okay");
//				
//				clickOn("btn_PatientAppointmentDetailsPage_Okay");
				
				testStepPassed("There Is Already An Upcoming Appointment");
				
			}
			else
			{
				validatePatientBookAppointment(queryCategory , comment);
				
			}
			testStepInfo("UAT_IND_PREREQ_004 Completed Successfully");


		} catch (Exception e) {

			testStepFailed("Failed in validatePatientCanBookAppointmentSucessfullywithDoctor " + e.toString());

		}
	}

	// UAT_IND_061(patient)
	public void validatePatientCanBookAppointmentUnSucessfullywithDoctor() {
		try {
			clickOn("FooterIcons_Consult");

			verifyElementIsDisplayed("lbl_PatientConsultPage_Title");

			scrollToText("Health Team");

			verifyElementIsDisplayed("lbl_PatientConsultPage_HealthTeamTitle");

			getListElementsText("lbl_PatientConsultPage_HealthTeamDetails");

			clickOn("lbl_PatientConsultPage_HealthTeamDetails");

			verifyElementIsDisplayed("btn_PatientHealthTeamDoctorPage_BookAppointment");

			clickOn("btn_PatientHealthTeamDoctorPage_BookAppointment");

			//Validate Unsuccessful

		} catch (Exception e) {
			testStepFailed("Failed in validatePatientCanBookAppointmentSucessfullywithDoctor " + e.toString());
		}
	}

	// UAT_IND_063(patient)
	public void validatePatientCanJoinTeleConsultVideoCall() {
		try 
		{
			clickOn("FooterIcons_Consult");

			verifyElementIsDisplayed("lbl_PatientConsultPage_Title");

			scrollToText("Health Team");

			verifyElementIsDisplayed("lbl_PatientConsultPage_HealthTeamTitle");

			getListElementsText("lbl_PatientConsultPage_HealthTeamDetails");

			clickOn("lbl_PatientConsultPage_HealthTeamDetails");

			verifyElementIsDisplayed("btn_PatientConsultPage_ActiveChatDoctorName");

			testStepPassed("The Doctor Name : " + getText("btn_PatientConsultPage_ActiveChatDoctorName") + " is displayed");

			getListElementsText("lbl_PatientConsultPage_ActiveChatScreenID");

			verifyElementIsDisplayed("btn_PatientHealthTeamDoctorPage_BookAppointment");

			scrollToText("Upcoming");

			verifyElementIsDisplayed("lbl_PatientConsultPage_UpcomingAppointmentHeader");

			clickOn("lbl_PatientConsultPage_UpcomingAppointmentHeader");

			verifyElementIsDisplayed("lbl_PatientAppointmentDetailsPage_Title");

			if(isElementPresent("btn_PatientConsultPage_ActiveChatScreenJoin"))
			{
				testStepPassed("Video Call Join Button is Displayed");
			}
			else
			{
				testStepFailed("Video Call Join Button is not displayed");
			}
		} 
		catch (Exception e)
		{
			testStepFailed("Failed in validatePatientCanJoinTeleConsultVideoCall " + e.toString());
		}
	}

	//UAT_IND_PREREQ_002
	public void validatePatientCanRaiseQueryWithDoctor(String queryText, String comments) {
		try 
		{
			String objLocator = getObjectLocator("lbl_PatientHealthTeamDoctorPage_AskDoctor").replace("<<QUERY>>", queryText);

			updateObjectLocator("lbl_PatientHealthTeamDoctorPage_AskDoctor", objLocator);

			clickOn("FooterIcons_Consult");

			verifyElementIsDisplayed("lbl_PatientConsultPage_Title");

			scrollToText("Health Team");

			verifyElementIsDisplayed("lbl_PatientConsultPage_HealthTeamTitle");

			getListElementsText("lbl_PatientConsultPage_HealthTeamDetails");

			clickOn("lbl_PatientConsultPage_HealthTeamDetails");

			verifyElementIsDisplayed("btn_PatientHealthTeamDoctorPage_AskDoctor");

			clickOn("btn_PatientHealthTeamDoctorPage_AskDoctor");

			isListOfElementsDisplayed("lbl_PatientHealthTeamDoctorPage_AskDoctor");

			clickOn("lbl_PatientHealthTeamDoctorPage_AskDoctor");

			validateElementEnabled("btn_PatientHealthTeamDoctorPage_AskDoctorContinue", "true");

			clickOn("btn_PatientHealthTeamDoctorPage_AskDoctorContinue");

			isListOfElementsDisplayed("val_PatientHealthTeamDoctorPage_Comments");

			typeIn("val_PatientHealthTeamDoctorPage_Comments", comments);

			validateElementEnabled("btn_PatientHealthTeamDoctorPage_AskDoctorContinue", "true");

			clickOn("btn_PatientHealthTeamDoctorPage_AskDoctorContinue");

			isListOfElementsDisplayed("btn_PatientConsultPage_ActiveChatDoctorName");

		} catch (Exception e) {
			testStepFailed("Failed in validatePatientCanRaiseQueryWithDoctor " + e.toString());
		}
	}
	
	//Methods
	public void validatePatientBookAppointment(String queryCategory, String comment)
	{
		try
		{
			clickOn("btn_PatientHealthTeamDoctorPage_BookAppointment");

			verifyElementIsDisplayed("btn_PatientHealthTeamDoctorPage_Continue");

			scrollToText(queryCategory);

			updateObjectLocator("lbl_PatientHealthTeamDoctorPage_QueryCategory",getObjectLocator("lbl_PatientHealthTeamDoctorPage_QueryCategory").replace("<<QUERY>>", queryCategory));

			clickOn("lbl_PatientHealthTeamDoctorPage_QueryCategory");

			validateElementEnabled("btn_PatientHealthTeamDoctorPage_Continue", "true");

			clickOn("btn_PatientHealthTeamDoctorPage_Continue");

			verifyElementIsDisplayed("btn_PatientHealthTeamDoctorPage_Comments");

			typeIn("btn_PatientHealthTeamDoctorPage_Comments", comment);

			validateElementEnabled("btn_PatientHealthTeamDoctorPage_Continue", "true");

			clickOn("btn_PatientHealthTeamDoctorPage_Continue");

			verifyElementIsDisplayed("lbl_PatientHealthTeamDoctorPage_SelectDay");

			clickOn("lbl_PatientHealthTeamDoctorPage_SelectDay");//Selects the Tomorrow Day

			clickOn("lbl_PatientHealthTeamDoctorPage_SelectTime");

			validateElementEnabled("btn_PatientHealthTeamDoctorPage_Continue", "true");

			clickOn("btn_PatientHealthTeamDoctorPage_Continue");

			verifyElementIsDisplayed("btn_PatientHealthTeamDoctorPage_ProceedToPayment");

			clickOn("btn_PatientHealthTeamDoctorPage_ProceedToPayment");

			verifyElementIsDisplayed("btn_PatientHealthTeamDoctorPage_DoneButton");

			clickOn("btn_PatientHealthTeamDoctorPage_DoneButton");
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method validatePatientBookAppointment " +e.toString());
		}
	}

}


