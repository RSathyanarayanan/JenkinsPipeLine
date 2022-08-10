package scenarios;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.DoctorLoginPage;
import pages.PatientDashboardPage;
import pages.PatientLoginPage;

public class DoctorLoginScenario extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;
	DoctorLoginPage doctorLoginPage;

	public DoctorLoginScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	// UAT_IND_055
	public void verifyDoctorLaunchPageCarouselImages() {
		try {
			doctorLoginPage = new DoctorLoginPage(obj);

			String carousalImageDatas = retrieve("Carousal Image Datas");

			switchToDoctorApplication();
			
			resetDoctorApp();
			
			doctorLoginPage.validateDoctorLaunchPageCarouselImages(carousalImageDatas);

			resetDoctorApp();

		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetDoctorApp();
			}
		}
	}

	//UAT_IND_056
	public void verifyDoctorLoginWithInvalidCredsAndNavigateToForgotPasswordScreen() {
		try {

			doctorLoginPage = new DoctorLoginPage(obj);


			String LoginEmail = retrieve("Email Address"); 
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.validateDoctorLoginWithInvalidCredsAndNavigateToForgotPasswordScreen(LoginEmail, LoginPassword);

			resetDoctorApp();

		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetDoctorApp();
			}
		}
	}


	//UAT_IND_059
	public void verifyNewDoctorLoginWithMobilenumber() {
		try {

			doctorLoginPage = new DoctorLoginPage(obj);

			String mobilenumber=retrieve("Mobile Number");
			String OTP=retrieve("OTP");

			switchToDoctorApplication();

			doctorLoginPage.doctorloginIntoTheApplicationUsingMobileNumberAndVerifyDashboard(mobilenumber,OTP);

			resetDoctorAppAndLogOut();
		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

}
