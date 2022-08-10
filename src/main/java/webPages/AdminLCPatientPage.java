package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class AdminLCPatientPage extends ApplicationKeywords {

	public AdminLCPatientPage(BaseClass obj) {
		super(obj);
	}

	// WEB_IND_003
	public void validatePatientPageNavigationandPatientsPageUIElements() {
		try {

			clickOn("btn_AdminLoginPage_LC_Patients");

			openShadowRootAndVerifyElement("lbl_LCPatientPage_Host_PatientsList", "shadowRoot_DivLabel");
			openShadowRootAndVerifyElement("lbl_LCPatientPage_Host_RecentlyAddedPatientsList", "shadowRoot_DivLabel");

			openTwoShadowRootAndVerifyElement("btn_AdminLoginPage_Host_AddPatients", "shadowRoot_PTCSLabel",
					"shadowRoot_DivLabel");

			openShadowRootAndVerifyElement("drp_LCPatientPage_Host_PatientDropDown1", "shadowRoot_PTCShbar");

			openShadowRootAndVerifyElement("drp_LCPatientPage_Host_PatientDropDown2", "shadowRoot_PTCShbar");

		} catch (Exception e) {
			testStepFailed(
					"Exception in the method validatePatientPageNavigationandPatientsPageUIElements " + e.toString());
		}
	}

	// WEB_IND_004
	public void validateAdminAbletoViewPatientDetails(String PatientName) {
		try {

			clickOn("btn_AdminLoginPage_LC_Patients");

			openShadowRootAndVerifyElement("lbl_LCPatientPage_Host_RecentlyAddedPatientsList", "shadowRoot_DivLabel");
			
			String Patient = getObjectLocator("lbl_LCPatientPage_PatientName").replace("<<Username>>", PatientName);

			updateObjectLocator("lbl_LCPatientPage_PatientName", Patient);
			
			waitForElementToDisplay("lbl_LCPatientPage_PatientName", 10);
			
			clickOn("lbl_LCPatientPage_PatientName");
			
			openShadowRootAndVerifyElement("drp_LCPatientDetailsPage_Host_PatientName", "shadowRoot_DivLabel");

			if (openShadowRootGetText("drp_LCPatientDetailsPage_Host_PatientName", "shadowRoot_DivLabel").contains(PatientName)) {
					
				testStepPassed(PatientName+" Profile Details are displayed");
			}
			else {
				testStepFailed(PatientName+" Profile Details are not displayed");
			}


		} catch (Exception e) {
			testStepFailed("Exception in the method validateAdminAbletoViewPatientDetails " + e.toString());
		}
	}


}
