package webPages;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class AdminLoginPage extends ApplicationKeywords {
	
	public AdminLoginPage(BaseClass obj) {
		super(obj);
	}
	
	// WEB_IND_001
	public void validateLCAdminLoginToTheApplication(String EmailID , String Password) {
		try {
			
			LoginToTheAdminApplication(EmailID,Password);

			openShadowRootAndVerifyElement("lbl_AdminLoginPage_Host_LCHeader", "lbl_AdminLoginPage_LCHeader");
			
			String ActualHeader = openShadowRootGetText("lbl_AdminLoginPage_Host_LCHeader", "lbl_AdminLoginPage_LCHeader");
			
			if(ActualHeader.equals("LC")) {
				
				testStepPassed("LC Dashboard Page is Displayed");
			}
			else {
				
				testStepFailed("LC Dashboard Page is not displayed");

			}
			

		} catch (Exception e) {
			testStepFailed("Exception in the method validateLCAdminLoginToTheApplication " + e.toString());
		}
	}
	
	// WEB_IND_014
		public void validateACEAdminLoginToTheApplication(String EmailID , String Password) {
			try {
				
				LoginToTheAdminApplication(EmailID,Password);
				
				openShadowRootAndVerifyElement("lbl_AdminLoginPage_Host_ACEHeader", "lbl_AdminLoginPage_ACEHeader");
				
				String ActualHeader = openShadowRootGetText("lbl_AdminLoginPage_Host_ACEHeader", "lbl_AdminLoginPage_ACEHeader");
				
				if(ActualHeader.equals("ACE")) {
					
					testStepPassed("ACE Dashboard Page is Displayed");
				}
				else {
					
					testStepFailed("ACE Dashboard Page is not displayed");

				}
	
			} catch (Exception e) {
				testStepFailed("Exception in the method LoginToTheAdminApplication " + e.toString());
			}
		}
	
		public void proceedinAdvancedMode() {
			
			testStepPassed("Login Page is Displayed");
			verifyElementIsDisplayed("btn_AdminLoginPage_Advanced");
			clickOn("btn_AdminLoginPage_Advanced");
			clickOn("btn_AdminLoginPage_Proceed");
			
		}
	
	public void LoginToTheAdminApplication(String EmailID , String Password) {
		try {
			
			openShadowRootAndVerifyElement("img_AdminLoginPage_Host_Logo", "img_AdminLoginPage_Logo");

			openShadowRootTypeIn("txt_AdminLoginPage_Host_EmailId", "txt_AdminLoginPage_EmailId", EmailID);	//"mobautotest123@gmail.com"

			openShadowRootAndVerifyElement("txt_AdminLoginPage_Host_EmailId", "txt_AdminLoginPage_EmailId");
			
			openShadowRootTypeInUsingActions("txt_AdminLoginPage_Host_Password","txt_AdminLoginPage_Password",Password);
			
			clickOn("txt_AdminLoginPage_SignIn");
				
		} catch (Exception e) {
			testStepFailed("Exception in the method LoginToTheAdminApplication " + e.toString());
		}
	}
	
	// WEB_IND_013
		public void LogOutofTheAdminApplication() {
			try {

				clickOn("btn_AdminLoginPage_LC_Logout");

				openShadowRootAndVerifyElement("txt_AdminLoginPage_Host_EmailId", "txt_AdminLoginPage_EmailId");

				testStepInfo("LC User Logged out Successfully");

			} catch (Exception e) {
				testStepFailed("Exception in the method validateLCAdminLogOutofTheApplication " + e.toString());
			}
		}

	
	
	
}
