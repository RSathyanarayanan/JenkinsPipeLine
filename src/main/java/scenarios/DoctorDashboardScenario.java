package scenarios;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.DoctorAppointmentsPage;
import pages.DoctorDashboardPage;
import pages.DoctorLoginPage;
import pages.DoctorMorePage;
import pages.DoctorPatientsPage;
import pages.PatientDashboardPage;
import pages.PatientLoginPage;

public class DoctorDashboardScenario extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;


	DoctorLoginPage doctorLoginPage;
	DoctorDashboardPage doctorDashboardPage;
	DoctorAppointmentsPage doctorAppointmentsPage;
	DoctorPatientsPage doctorPatientsPage;
	DoctorMorePage doctorMorePage;


	public DoctorDashboardScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	//UAT_IND_PREREQ_001
	public void verifyDoctorResolveActiveChat() {
		try {

			doctorLoginPage = new DoctorLoginPage(obj);
			doctorDashboardPage = new DoctorDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorDashboardPage.validateDoctorResolveActiveChat();

			resetDoctorApp();

			testStepInfo("Testcase UAT_IND_PREREQ_001 Completed successfully");

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorDashboardPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	// UAT_IND_066
	public void verifyDoctorHomePageUIValidations() {
		try {

			doctorLoginPage = new DoctorLoginPage(obj);
			doctorDashboardPage = new DoctorDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorDashboardPage.validateDoctorHomePageUIValidations();

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorDashboardPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	// UAT_IND_067
	public void VerifyDoctorCanAttendpatientAppointments() {
		try {

			doctorLoginPage = new DoctorLoginPage(obj);
			doctorDashboardPage = new DoctorDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorDashboardPage.validateDoctorCanAttendpatientAppointments();

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorDashboardPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	// UAT_IND_068
	public void verifyHealthDashboardisAccessibleandCanAnswerPatientChat() {
		try {

			doctorLoginPage = new DoctorLoginPage(obj);
			doctorDashboardPage = new DoctorDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorDashboardPage.validateHealthDashboardisAccessibleandCanAnswerPatientChat();

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorDashboardPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	// UAT_IND_072
	public void verifyUserAbletoAccessAllTabsUnderPrescription() {
		try {

			doctorLoginPage = new DoctorLoginPage(obj);
			doctorDashboardPage = new DoctorDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");
			
			String chiefComplaint = retrieve("Chief Complaint");

			switchToDoctorApplication();
			
			closeKeyBoard();
			
			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorDashboardPage.validateUserAbletoAccessAllTabsUnderPrescription(chiefComplaint);

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorDashboardPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	// UAT_IND_077
	public void verifyUserAbletoAccessNotifications() {
		try {

			doctorLoginPage = new DoctorLoginPage(obj);
			doctorDashboardPage = new DoctorDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorDashboardPage.validateUserAbletoAccessNotifications();

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorDashboardPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	// UAT_IND_065
	public void VerifyDoctorAbletoLogoutofApplication() {
		try {

			doctorLoginPage = new DoctorLoginPage(obj);
			doctorDashboardPage = new DoctorDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorDashboardPage.validateDoctorAbletoLogoutofApplication();

			resetDoctorApp();

			testStepInfo("Testcase UAT_IND_065 Completed successfully");

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorDashboardPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

}
