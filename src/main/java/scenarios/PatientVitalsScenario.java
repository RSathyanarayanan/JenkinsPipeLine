package scenarios;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.PatientDashboardPage;
import pages.PatientLoginPage;
import pages.PatientVitalsNReportsPage;

public class PatientVitalsScenario extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;
	PatientLoginPage patientLoginPage;
	PatientDashboardPage patientDashboardPage;
	PatientVitalsNReportsPage patientVitalsNReportsPage;


	public PatientVitalsScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}


	// UAT_IND_009
	public void verifyVitalAndReportDashboard() 
	{
		try 
		{
			patientLoginPage = new PatientLoginPage(obj);
			patientVitalsNReportsPage = new PatientVitalsNReportsPage(obj);

			String LoginEmail = retrieve("Email Address"); 
			String LoginPassword = retrieve("Password");
			
			String systolicBp = retrieve("Systolic Bp");
			String diastolicBp = retrieve("Diastolic Bp");
			
            switchApplication(getConfigProperty("AppName1"));
            
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientVitalsNReportsPage.validateVitalsManualDataFields(systolicBp, diastolicBp);
			
			resetApplication(getConfigProperty("AppName1"));
			
			
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientVitalsNReportsPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_010
	public void VerifyViewandDownloadLabReport() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientVitalsNReportsPage = new PatientVitalsNReportsPage(obj);

			String LoginEmail = retrieve("Email Address"); 
			String LoginPassword = retrieve("Password");
			
            switchApplication(getConfigProperty("AppName1"));
            
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientVitalsNReportsPage.ValidateViewandDownloadLabReport();
			
            resetApplication(getConfigProperty("AppName1"));


			
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			
			if (this.testFailure || patientVitalsNReportsPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	//UAT_IND_011
	public void verifyUploadLabReport() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientDashboardPage = new PatientDashboardPage(obj);
			patientVitalsNReportsPage = new PatientVitalsNReportsPage(obj);

			String emailId = retrieve("Email Address");
			String password = retrieve("Password");

            switchApplication(getConfigProperty("AppName1"));
            
			patientLoginPage.loginIntoTheApplicationUsingEmail(emailId, password);
			patientVitalsNReportsPage.validateUploadLabReport();
			
			resetApplication(getConfigProperty("AppName1"));

			
		} catch (Exception e) {
			testStepFailed("Exception: " + e.toString());
		} finally {
			if (this.testFailure || patientLoginPage.testFailure || patientVitalsNReportsPage.testFailure) {
				status = true;
				testFailure = status;
				
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}
	
//	//UAT_IND_057 and UAT_IND_058
//	public void verifyPatientContactDoctorForOffRangeReadingWithSymptoms() 
//	{
//		try 
//		{
//			patientLoginPage = new PatientLoginPage(obj);
//			patientVitalsNReportsPage = new PatientVitalsNReportsPage(obj);
//
//			String LoginEmail = retrieve("Email Address"); 
//			String LoginPassword = retrieve("Password");
//			
//			String systolicBp = retrieve("Systolic Bp");
//			String diastolicBp = retrieve("Diastolic Bp");
//			String bpValue = retrieve("Bp Value");
//			String riskStatus = retrieve("Risk Status");
//			String riskValue = retrieve("Risk Value");
//			
//            switchApplication(getConfigProperty("AppName1"));
//            
//			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
//			patientVitalsNReportsPage.validatePatientContactDoctorForOffRangeReadingWithSymptoms(systolicBp, diastolicBp, bpValue, riskStatus, riskValue);
//			
//			resetApplication(getConfigProperty("AppName1"));
//			
//			
//		} catch (Exception e) {
//			System.err.println(e.toString());
//		} finally {
//			if (this.testFailure || patientVitalsNReportsPage.testFailure || patientLoginPage.testFailure) {
//				status = true;
//				testFailure = status;
//				
//				resetApplication(getConfigProperty("AppName1"));
//			}
//		}
//	}
}
