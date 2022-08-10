package webPages;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class AdminACEPatientPage extends ApplicationKeywords {
	
	public AdminACEPatientPage(BaseClass obj) {
		super(obj);
	}
	
	// WEB_IND_016
		public void validateACEPatientPageNavigationandPatientPageUIElements() {
			try {
				
				clickOn("btn_AdminLoginPage_ACE_Patients");
				
				openShadowRootAndVerifyElement("lbl_ACEPatientPage_Host_PatientAlertsandQueries", "shadowRoot_DivLabel");
				
				openShadowRootAndVerifyElement("lbl_ACEPatientPage_Host_PatientUpcomingAppointments", "shadowRoot_DivLabel");
				
				openShadowRootAndVerifyElement("lbl_ACEPatientPage_Host_NewPatient", "shadowRoot_DivLabel");

			} catch (Exception e) {
				testStepFailed("Exception in the method validateACEPatientPageNavigationandPatientPageUIElements " + e.toString());
			}
		}
	
	
	
	
}
