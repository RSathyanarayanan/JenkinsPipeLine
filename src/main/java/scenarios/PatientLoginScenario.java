package scenarios;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.PatientDashboardPage;
import pages.PatientLoginPage;

public class PatientLoginScenario extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;
	PatientLoginPage patientLoginPage;
	PatientDashboardPage patientDashboardPage;

	public PatientLoginScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}
	

	// UAT_IND_001
	public void verifyLaunchPageCarouselImages() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			
			String carousalImageDatas = retrieve("Carousal Image Datas");
			
			
            switchApplication(getConfigProperty("AppName1"));
            resetApplication(getConfigProperty("AppName1"));

			patientLoginPage.validateLaunchPageCarouselImages(carousalImageDatas);
			
            resetApplication(getConfigProperty("AppName1"));

		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
	            resetApplication(getConfigProperty("AppName1"));

			}
		}
	}

	// UAT_IND_002//005(duplicate)
	public void verifyNewPatientLoginWithMobilenumber() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientDashboardPage = new PatientDashboardPage(obj);
			
			String mobilenumber=retrieve("Mobile Number");
			String OTP=retrieve("OTP");
            
			switchApplication(getConfigProperty("AppName1"));
			
			patientLoginPage.loginToApplicationUsingMobileNumberAndVerifyDashboard(mobilenumber , OTP);
			
            resetApplication(getConfigProperty("AppName1"));
		}
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientLoginPage.testFailure || patientDashboardPage.testFailure) {
				status = true;
				testFailure = status;
	            resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_006
	public void verifyUserAbletoLoginWithEmail() {
		try {

			patientLoginPage = new PatientLoginPage(obj);
			patientDashboardPage = new PatientDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientLoginPage.testFailure || patientDashboardPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));

			}
		}
	}


	// UAT_IND_007
	public void verifyInvalidMobNoLoginErrorMessage() {
		try {
			patientLoginPage = new PatientLoginPage(obj);

			String mobilenumber=retrieve("Mobile Number");
			String OTP=retrieve("OTP");

            switchApplication(getConfigProperty("AppName1"));
			patientLoginPage.validateInvalidMobNoLoginErrorMessage(mobilenumber , OTP);
			resetApplication(getConfigProperty("AppName1"));


		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));

			}
		}
	}
}
