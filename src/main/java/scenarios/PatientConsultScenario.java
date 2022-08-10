package scenarios;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.PatientConsultPage;
import pages.PatientDashboardPage;
import pages.PatientHamburgerMenuPage;
import pages.PatientLoginPage;
import pages.PatientOrderPage;

public class PatientConsultScenario extends ApplicationKeywords  {



	BaseClass obj;
	private Boolean status = false;
	PatientLoginPage patientLoginPage;
	PatientDashboardPage patientDashboardPage;
	PatientHamburgerMenuPage patientHamburgerPage;
	PatientOrderPage  patientOrderPage;
	PatientConsultPage patientConsultPage;

	public PatientConsultScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}


	// UAT_IND_049
	public void verifyPatientCanAccessMyConsultationPageAndViewOnGoingProgress() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientConsultPage = new PatientConsultPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));
			
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientConsultPage.validatePatientCanAccessMyConsultationPageAndViewOnGoingProgress();
			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientConsultPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_050
	public void verifyPatientRedirectAppointment() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientConsultPage = new PatientConsultPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));
			
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientConsultPage.validatePatientIsRedirectToAppointmentScreen();
			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientConsultPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}
	
	// UAT_IND_051
		public void verifyProfessionalsDashboardfromMyConsultationsPage() {
			try {
				patientLoginPage = new PatientLoginPage(obj);
				patientConsultPage = new PatientConsultPage(obj);

				String LoginEmail = retrieve("Email Address");
				String LoginPassword = retrieve("Password");

				switchApplication(getConfigProperty("AppName1"));
				
				patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
				patientConsultPage.validateProfessionalsDashboardfromMyConsultationsPage();
				resetApplication(getConfigProperty("AppName1"));
				
			} catch (Exception e) {
				System.err.println(e.toString());
			} finally {
				if (this.testFailure || patientConsultPage.testFailure || patientLoginPage.testFailure) {
					status = true;
					testFailure = status;
					resetApplication(getConfigProperty("AppName1"));
				}
			}
		}


	// UAT_IND_PREREQ_004
	public void verifyPatientCanBookAppointmentSucessfullywithDoctor() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientConsultPage = new PatientConsultPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String queryCategory = retrieve("Query Category");
			String comment = retrieve("Comments");

			switchApplication(getConfigProperty("AppName1"));
			
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientConsultPage.validatePatientCanBookAppointmentSucessfullywithDoctor(queryCategory, comment);
			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientConsultPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_061
	public void verifyPatientCanBookAppointmentUnSucessfullywithDoctor() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientConsultPage = new PatientConsultPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));
			
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientConsultPage.validatePatientCanBookAppointmentUnSucessfullywithDoctor();
			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientConsultPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_063
	public void verifyPatientCanJoinTeleConsultVideoCall() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientConsultPage = new PatientConsultPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));
			
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientConsultPage.validatePatientCanJoinTeleConsultVideoCall();
			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientConsultPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	//UAT_IND_PREREQ_002
	public void verifyPatientCanRaiseQueryWithDoctor() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientConsultPage = new PatientConsultPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");
			
			String queryText = retrieve("Query Category");
			String comments = retrieve("Comments");

			switchApplication(getConfigProperty("AppName1"));
			
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientConsultPage.validatePatientCanRaiseQueryWithDoctor(queryText, comments);
			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientConsultPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}



}
