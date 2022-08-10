package scenarios;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.PatientDashboardPage;
import pages.PatientHamburgerMenuPage;
import pages.PatientLoginPage;
import pages.PatientOrderPage;

public class PatientOrderScenario extends ApplicationKeywords {

	BaseClass obj;
	private Boolean status = false;
	PatientLoginPage patientLoginPage;
	PatientDashboardPage patientDashboardPage;
	PatientHamburgerMenuPage patientHamburgerPage;
	PatientOrderPage  patientOrderPage;
	
	
	public PatientOrderScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}
	
	
	// UAT_IND_052
	public void verifyPatientCouldOrderLabTestFromStore() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientOrderPage = new PatientOrderPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

             switchApplication(getConfigProperty("AppName1"));
             
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientOrderPage.validatePatientCouldOrderLabTestFromStore();
			
            resetApplication(getConfigProperty("AppName1"));

			
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientOrderPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				
	            resetApplication(getConfigProperty("AppName1"));

			}
		}
	}
	
	
	// UAT_IND_053
			public void verifyPatientCouldOrderMedicinesFromStore() {
				try {
					patientLoginPage = new PatientLoginPage(obj);
					patientOrderPage = new PatientOrderPage(obj);

					String LoginEmail = retrieve("Email Address");
					String LoginPassword = retrieve("Password");

		            switchApplication(getConfigProperty("AppName1"));
		            
					patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
					patientOrderPage.validatePatientCouldOrderMedicinesFromStore();
					
		            resetApplication(getConfigProperty("AppName1"));

				} catch (Exception e) {
					System.err.println(e.toString());
				} finally {
					if (this.testFailure || patientOrderPage.testFailure || patientLoginPage.testFailure) {
						status = true;
						testFailure = status;
						
			            resetApplication(getConfigProperty("AppName1"));

					}
				}
			}
			
			// UAT_IND_054
			public void verifyPatientLogoutFromtheApplication() {
				try {
					patientLoginPage = new PatientLoginPage(obj);
					patientOrderPage = new PatientOrderPage(obj);

					String LoginEmail = retrieve("Email Address");
					String LoginPassword = retrieve("Password");

		            switchApplication(getConfigProperty("AppName1"));
		            
					patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
					patientLoginPage.validatePatientLogoutFromtheApplication();
					
		            resetApplication(getConfigProperty("AppName1"));

					
				} catch (Exception e) {
					System.err.println(e.toString());
				} finally {
					if (this.testFailure || patientOrderPage.testFailure || patientLoginPage.testFailure) {
						status = true;
						testFailure = status;
			            resetApplication(getConfigProperty("AppName1"));

					}
				}
			}
	
	/*// UAT_IND_053
		public void verifyPatientCouldOrderDevicesFromStore() {
			try {
				patientLoginPage = new PatientLoginPage(obj);
				patientOrderPage = new PatientOrderPage(obj);

				String LoginEmail = retrieve("Email Address");
				String LoginPassword = retrieve("Password");

	            switchApplication(getConfigProperty("AppName"));
				patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
				patientOrderPage.validatePatientCouldOrderDevicesFromStore();
				patientOrderPage.resetApp();
			} catch (Exception e) {
				System.err.println(e.toString());
			} finally {
				if (this.testFailure || patientOrderPage.testFailure || patientLoginPage.testFailure) {
					status = true;
					testFailure = status;
					resetApp();
				}
			}
		}
		
		// UAT_IND_054
		public void verifyPatientCouldOrderHealthyFoodsFromStore() {
			try {
				patientLoginPage = new PatientLoginPage(obj);
				patientOrderPage = new PatientOrderPage(obj);

				String LoginEmail = retrieve("Email Address");
				String LoginPassword = retrieve("Password");

	            switchApplication(getConfigProperty("AppName"));
				patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
				patientOrderPage.validatePatientCouldOrderHealthyFoodsFromStore();
				patientOrderPage.resetApp();
				
			} catch (Exception e) {
				System.err.println(e.toString());
			} finally {
				if (this.testFailure || patientOrderPage.testFailure || patientLoginPage.testFailure) {
					status = true;
					testFailure = status;
					resetApp();
				}
			}
		}*/
	
	
	
	

}
