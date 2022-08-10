package webPages;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class AdminLCDashboardPage extends ApplicationKeywords {

	public AdminLCDashboardPage(BaseClass obj) {
		super(obj);
	}

	// WEB_IND_002
	public void validateLCDashboardPageUIElements() {
		try {

			isListOfElementsDisplayed(
					"btn_AdminLoginPage_LC_Dashboard,btn_AdminLoginPage_LC_Patients,btn_AdminLoginPage_LC_Doctor,btn_AdminLoginPage_LC_Settings,btn_AdminLoginPage_LC_Logout");

			testStepPassed(
					"LC Name is" + openShadowRootGetText("lbl_AdminLoginPage_Host_LCName", "shadowRoot_DivLabel"));

			openShadowRootAndVerifyElement("lbl_AdminLoginPage_Host_RecentlyAddedPatients", "shadowRoot_DivLabel");
			openShadowRootAndVerifyElement("lbl_AdminLoginPage_Host_RecentlyAddedDoctors", "shadowRoot_DivLabel");

			openTwoShadowRootAndVerifyElement("btn_AdminLoginPage_Host_AddPatients", "shadowRoot_PTCSLabel",
					"shadowRoot_DivLabel");

			openTwoShadowRootAndVerifyElement("btn_AdminLoginPage_Host_AddDoctors", "shadowRoot_PTCSLabel",
					"shadowRoot_DivLabel");

			openShadowRootAndVerifyElement("drp_AdminLoginPage_Host_PatientDropDown", "shadowRoot_PTCShbar");
			openShadowRootAndVerifyElement("drp_AdminLoginPage_Host_DoctorsDropDown", "shadowRoot_PTCShbar");

			/*
			 * openTwoShadowRootAndVerifyElement("drp_AdminLoginPage_Host_PatientDropDown",
			 * "shadowRoot_PTCSLabel","shadowRoot_PTCShbar");
			 * 
			 * openTwoShadowRootAndVerifyElement("drp_AdminLoginPage_Host_DoctorsDropDown",
			 * "shadowRoot_PTCSLabel","shadowRoot_PTCShbar");
			 */

		} catch (Exception e) {
			testStepFailed("Exception in the method validateLCDashboardPageUIElements " + e.toString());
		}
	}

	// WEB_IND_011
	public void validateLCNaviagtionToSettingsAndValidateSettingsPage() {
		try {

			clickOn("btn_AdminLoginPage_LC_Settings");

			openShadowRootAndVerifyElement("lbl_AdminLoginPage_Host_LCSettingsHeader", "shadowRoot_DivLabel");

			String ActualHeader = openShadowRootGetText("lbl_AdminLoginPage_Host_LCSettingsHeader",
					"shadowRoot_DivLabel");

			if (ActualHeader.equals("Settings")) {

				testStepPassed("LC User Navigated to Settings Page Successfully");
			} else {

				testStepFailed("LC User Not Navigated to Settings Page");

			}

		} catch (Exception e) {
			testStepFailed(
					"Exception in the method validateLCNaviagtionToSettingsAndValidateSettingsPage " + e.toString());
		}
	}

	// WEB_IND_006
	public void validateLCPatientStatusFilter() {
		
		try {
			
		waitForElementToDisplay("btn_AdminLoginPage_LC_Dashboard", 10);
		
		openShadowRootClickOn("drp_AdminLoginPage_LC_Host_PatientArrow", "shadowRoot_PTCSICon");
				
		openTwoShadowRootAndClickOn("drp_AdminLoginPage_LC_Host1_PatientAdded","drp_AdminLoginPage_LC_Host2_PatientAdded","shadowRoot_DivLabel");
		
		String ActualStatus = openTwoShadowRootAndGetText("drp_AdminLoginPage_LC_Host1_DropDownResults","drp_AdminLoginPage_LC_Host2_DropDownResults","shadowRoot_DivLabel").trim();

		testStepInfo(ActualStatus);
		
		if(ActualStatus.equals("Added")) {
			testStepPassed("Patient Filter is working as expected");
		}
		else {
			testStepFailed("Patient Filter is not working");
		}
		
		} catch (Exception e) {
			testStepFailed("Exception in the method validateLCPatientStatusFilter " + e.toString());
		}
	}
	
	

	// WEB_IND_010
	public void validateLCDoctorStatusFilter() {
		try {
			
			waitForElementToDisplay("btn_AdminLoginPage_LC_Dashboard", 10);
			
			/*clickOn("btn_AdminLoginPage_LC_Doctor");
			
			clickOn("lbl_AdminLoginPage_CollapseButton");
			
			waitForElementToDisplay("drp_AdminLoginPage_LC_Host_DoctorArrow",05);*/
			
			moveToElementActions("drp_AdminLoginPage_LC_Host_DoctorArrow");
			
			openShadowRootClickOn("drp_AdminLoginPage_LC_Host_DoctorArrow", "shadowRoot_PTCSICon");
					
			moveToElementActions("drp_AdminLoginPage_LC_Host1_DoctorActive");

			openTwoShadowRootAndClickOn("drp_AdminLoginPage_LC_Host1_DoctorActive","drp_AdminLoginPage_LC_Host2_DoctorActive","shadowRoot_DivLabel");

			moveToElementActions("drp_AdminLoginPage_LC_Host1_DropDownDocResults");

			openTwoShadowRootAndGetTextList("drp_AdminLoginPage_LC_Host1_DropDownDocResults","drp_AdminLoginPage_LC_Host2_DropDownDocResults","shadowRoot_DivLabel","Active");


			} catch (Exception e) {
				testStepFailed("Exception in the method validateLCDoctorStatusFilter " + e.toString());
			}
		}
	

	// WEB_IND_012
	public void validateLCSearchFunctionality(String SearchTerm) {
		try {

			clickOn("btn_AdminLoginPage_LC_SearchMagnifier1");
		    
			clickOn("txt_AdminLoginPage_LC_Host_SearchTxtBox");

			openShadowRootTypeIn("txt_AdminLoginPage_LC_Host_SearchTxtBox", "txt_AdminLoginPage_LC_SearchTxtBox", SearchTerm);	
			
			testStepInfo("Search field  is editable");
			
			//Click Not working 
				
			} catch (Exception e) {
				testStepFailed("Exception in the method validateACESearchFunctionality " + e.toString());
			}
	}

	// WEB_IND_013
	public void validateLCAdminLogOutofTheApplication() {
		try {

			clickOn("btn_AdminLoginPage_LC_Logout");

			openShadowRootAndVerifyElement("txt_AdminLoginPage_Host_EmailId", "txt_AdminLoginPage_EmailId");

			testStepInfo("LC User Logged out Successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validateLCAdminLogOutofTheApplication " + e.toString());
		}
	}

}
