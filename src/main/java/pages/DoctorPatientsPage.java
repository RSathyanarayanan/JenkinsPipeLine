package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.slack.api.audit.Actions;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class DoctorPatientsPage extends ApplicationKeywords {

	public DoctorPatientsPage(BaseClass obj) {
		super(obj);
	}

	//UAT_IND_057
	public void validateDoctorPatientProfileTab(String patientNames) {
		try {

			String[] patientName = patientNames.split("##");

			clickOn("FooterIcons_Patients");

			isListOfElementsDisplayed(
					"lbl_PatientsPage_PatientsHeader,btn_PatientsPage_searchIcon,btn_PatientsPage_AddPatient");

			List<WebElement> elements = findWebElements("lbl_PatientsPage_Patientlist");

			testStepPassed(elements.size() + " Number of patients is displayed in the List");

			searchPatient(patientName[0]);

			verifyElementIsDisplayed("lbl_PatientsPage_NoPatients");

			clickOn("lbl_PatientsPage_BackButton");

			searchPatient(patientName[1]);

			verifyElementIsDisplayed("lbl_PatientsPage_Patientlist");

			clickOn("lbl_PatientsPage_BackButton");

			clickOn("lbl_PatientsPage_Patientlist");

			waitForElementToDisplay("lbl_PatientsPage_PatientName",5);

			isListOfElementsDisplayed(
					"lbl_PatientsPage_PatientName,lbl_PatientsPage_Age,lbl_PatientsPage_Height,lbl_PatientsPage_Weight,lbl_PatientsPage_Caregiver,lbl_PatientsPage_DX,lbl_PatientsPage_SX,lbl_PatientsPage_KCO,lbl_PatientsPage_LVEF");

//			scrollToText("Blood Pressure");
//			isListOfElementsDisplayed(
//					"lbl_PatientsPage_Vitals,lbl_PatientsPage_VitalsBP");
//
//			scrollToText("BMI");
//
//			isListOfElementsDisplayed("lbl_PatientsPage_VitalsHR,lbl_PatientsPage_VitalsBMI");
//
//			scrollToText("Weight");
//
//			isListOfElementsDisplayed("lbl_PatientsPage_VitalsWeight");
//
//			scrollToText("Medications");
//
//			verifyElementIsDisplayed("lbl_PatientsPage_Medications");
//
//			scrollToText("Prescriptions");
//
//			verifyElementIsDisplayed("lbl_PatientsPage_Prescriptions");
//
//			scrollToText("Last lab reports");
//
//			verifyElementIsDisplayed("lbl_PatientsPage_LastLabReports");
//
//			scrollToText("Coach");
//
//			verifyElementIsDisplayed("lbl_PatientsPage_Coach");
//
//			scrollToText("Adherence alerts");
//
//			verifyElementIsDisplayed("lbl_PatientsPage_AdherenceAlerts");

		} catch (Exception e) {
			testStepFailed("Failed in validateDoctorPatientProfileTab " + e.toString());

		}
	}

	//UAT_IND_058
	public void validateDoctorPatientHistoryTab() {
		try {

			clickOn("FooterIcons_Patients");

			isListOfElementsDisplayed(
					"lbl_PatientsPage_PatientsHeader,btn_PatientsPage_searchIcon,lbl_PatientsPage_Patientlist");

			clickOn("lbl_PatientsPage_Patientlist");

			waitForElementToDisplay("lbl_Dashboard_ActiveChat_History",5);

			clickOn("lbl_Dashboard_ActiveChat_History");

			verifyElementIsDisplayed("lbl_PatientHistoryPage_ChatHistory");

			verifyElementIsDisplayed("lbl_PatientHistoryPage_AppointmentHistory");

			//No data for both Chat History and Appointment History

		} catch (Exception e) {
			testStepFailed("Failed in validateDoctorPatientHistoryTab " + e.toString());

		}
	}

	// UAT_IND_070
	public void validateDoctorCanAddPatient(String gender) {
		try {

			clickOn("FooterIcons_Patients");

			isListOfElementsDisplayed(
					"lbl_PatientsPage_PatientsHeader,btn_PatientsPage_searchIcon,btn_PatientsPage_AddPatient");

			List<WebElement> elements = findWebElements("lbl_PatientsPage_Patientlist");

			testStepPassed(elements.size() + " Number of patients is displayed in the List");

			// VerifySearchPatient

			clickOn("btn_PatientsPage_AddPatient");

			verifyElementIsDisplayed("btn_PatientsPage_AddPatient_Genderlist");

			typeIn("btn_PatientsPage_AddPatient_FirstName", "testing");

			typeIn("btn_PatientsPage_AddPatient_LastName", "testing");

			getAndMatchListElementTexts("btn_PatientsPage_AddPatient_Genderlist", "Male##Female##Other");

			//getElementAndClick("btn_PatientsPage_AddPatient_Genderlist", gender);

			clickOn("btn_PatientsPage_AddPatient_GenderMale");

			typeIn("btn_PatientsPage_AddPatient_MobileNumber", "1234567890");

			closeKeyBoard();

			clickOn("btn_PatientsPage_AddPatient_RegisterPatients");			

			testStepInfo("Onboarding request has been successfully");

			testStepInfo("Testcase UAT_IND_070 Completed successfully");


		} catch (Exception e) {
			testStepFailed("Failed in validateDoctorCanAddPatient " + e.toString());
		}
	}

	//Methods
	public void searchPatient(String patientName)
	{
		try
		{
			if(isElementPresent("btn_PatientsPage_searchIcon"))
			{
				testStepPassed("Search Icon is displayed");
				clickOn("btn_PatientsPage_searchIcon");
				waitForElementToDisplay("val_PatientsPage_Search",5);
				typeIn("val_PatientsPage_Search", patientName);
				testStepPassed("Patient Name entered as " + patientName);
			}
			else
			{
				testStepFailed("Search Icon is not displayed");
			}
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method searchPatient" +e.toString());
		}
	}

}
