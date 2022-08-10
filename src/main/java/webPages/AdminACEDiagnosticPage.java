package webPages;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class AdminACEDiagnosticPage extends ApplicationKeywords {
	
	public AdminACEDiagnosticPage(BaseClass obj) {
		super(obj);
	}
	
	// WEB_IND_017
	public void validateDiagnosticPageNavigationandDiagnosticPageUIElements() {
		try {
			
			clickOn("btn_AdminLoginPage_ACE_Diagnostics");
			
			openShadowRootAndVerifyElement("lbl_ACEPatientPage_Host_Diagnostics", "shadowRoot_DivLabel");
			
			openShadowRootAndVerifyElement("lbl_ACEPatientPage_Host_LabTestOrderPlaced", "shadowRoot_DivLabel");
			

		} catch (Exception e) {
			testStepFailed("Exception in the method validateDiagnosticPageNavigationandDiagnosticPageUIElements " + e.toString());
		}
	}
	
	
	
	
}
