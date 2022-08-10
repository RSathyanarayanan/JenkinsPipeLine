package webPages;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class AdminACEDashboardPage extends ApplicationKeywords {
	
	public AdminACEDashboardPage(BaseClass obj) {
		super(obj);
	}
	
	// WEB_IND_015
	public void validateACEDashboardPageUIElements() {
		try {

			isListOfElementsDisplayed(
					"btn_AdminLoginPage_ACE_Dashboard,btn_AdminLoginPage_ACE_Patients,btn_AdminLoginPage_ACE_Doctor,btn_AdminLoginPage_ACE_Coach,btn_AdminLoginPage_ACE_Professionals,btn_AdminLoginPage_ACE_HealthMall,btn_AdminLoginPage_ACE_Settings,btn_AdminLoginPage_ACE_Logout");

			
		} catch (Exception e) {
			testStepFailed("Exception in the method validateACEDashboardPageUIElements " + e.toString());
		}
	}

	// WEB_IND_018
	public void validateACENaviagtionToSettingsAndValidateSettingsPage() {
		try {

			clickOn("btn_AdminLoginPage_ACE_Settings");

			openShadowRootAndVerifyElement("lbl_AdminLoginPage_Host_ACESettingsHeader",
					"shadowRoot_DivLabel");

			String ActualHeader = openShadowRootGetText("lbl_AdminLoginPage_Host_ACESettingsHeader",
					"shadowRoot_DivLabel");

			if (ActualHeader.equals("Settings")) {

				testStepPassed("ACE User Navigated to Settings Page Successfully");
			} else {

				testStepFailed("ACE User Not Navigated to Settings Page");

			}

		} catch (Exception e) {
			testStepFailed("Exception in the method  " + e.toString());
		}
	}
	
	// WEB_IND_019
		public void validateACESearchFunctionality(String SearchTerm) {
			
			try {

			clickOn("btn_AdminLoginPage_ACE_SearchMagnifier1");
		    
			clickOn("txt_AdminLoginPage_ACE_Host_SearchTxtBox");

			openShadowRootTypeIn("txt_AdminLoginPage_ACE_Host_SearchTxtBox", "txt_AdminLoginPage_ACE_SearchTxtBox", SearchTerm);	
			
			testStepInfo("Search field  is editable");
			
			//Click Not working 
				
			} catch (Exception e) {
				testStepFailed("Exception in the method validateACESearchFunctionality " + e.toString());
			}
		}

	// WEB_IND_020
	public void validateACEAdminLogOutofTheApplication() {
		try {

			clickOn("btn_AdminLoginPage_ACE_Logout");

			openShadowRootAndVerifyElement("txt_AdminLoginPage_Host_EmailId", "txt_AdminLoginPage_EmailId");

			testStepInfo("ACE User Logged out Successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method  " + e.toString());
		}
	}

}
