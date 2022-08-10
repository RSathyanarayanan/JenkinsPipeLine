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

public class DoctorMoreScenario extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;


	DoctorLoginPage doctorLoginPage;
	DoctorDashboardPage doctorDashboardPage;
	DoctorAppointmentsPage doctorAppointmentsPage;
	DoctorPatientsPage doctorPatientsPage;
	DoctorMorePage doctorMorePage;

	public DoctorMoreScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	// UAT_IND_PREREQ_003
	public void verifyDoctorCanAddSlotForConsultation() {
		try {
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorMorePage = new DoctorMorePage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");
			
			String consultationFees = retrieve("Consultation Fees");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorMorePage.validateDoctorCanAddSlotForConsultation(consultationFees);

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorLoginPage.testFailure || doctorMorePage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}
	
	// UAT_IND_069
	public void verifyDoctorCanSetupProfile() {
		try {
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorMorePage = new DoctorMorePage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorMorePage.validateDoctorCanSetupProfile();

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorLoginPage.testFailure || doctorMorePage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	// UAT_IND_073
	public void verifyDoctorTermsConditionsAndFeedback() {
		try {
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorMorePage = new DoctorMorePage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String feedBackdata = retrieve("Feedback Data");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorMorePage.validateDoctorTermsConditionsAndFeedback(feedBackdata);

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorLoginPage.testFailure || doctorMorePage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	// UAT_IND_074
	public void verifyUserAbletoContactSupport() {
		try {
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorMorePage = new DoctorMorePage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorMorePage.validateUserAbletoContactSupport();

			resetDoctorAppAndLogOut();
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorLoginPage.testFailure || doctorMorePage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	// UAT_IND_075
	public void verifyUserabletoViewFAQandRaiseQueryinContactUs() {
		try {
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorMorePage = new DoctorMorePage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");
			String contactUsdata = retrieve("Contact Us Data");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorMorePage.validateUserabletoViewFAQandRaiseQueryinContactUs(contactUsdata);

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorLoginPage.testFailure || doctorMorePage.testFailure) {
				status = true;
				testFailure = status;

				resetDoctorApp();
			}
		}
	}

	// UAT_IND_076
	public void verifyUserViewAllPastTickets() {
		try {
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorMorePage = new DoctorMorePage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorMorePage.validateUserViewAllPastTickets();

			resetDoctorAppAndLogOut();


		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorLoginPage.testFailure || doctorMorePage.testFailure) {
				status = true;
				testFailure = status;

				resetDoctorApp();
			}
		}
	}

	// UAT_IND_078
	public void verifyDoctorSettingPagesandElements() {
		try {
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorMorePage = new DoctorMorePage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");


			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorMorePage.validateDoctorSettingPagesandElements();

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorLoginPage.testFailure || doctorMorePage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}


	// UAT_IND_079
	public void verifyDoctorManageStaffDetails() {
		try {
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorMorePage = new DoctorMorePage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String firstName = retrieve("First Name");
			String lastName = retrieve("Last Name");
			String clinicName = retrieve("Clinic Name");
			String registrationNumber = retrieve("Registration Number");
			String mobileNumber = retrieve("Mobile Number");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorMorePage.validateDoctorManageStaffDetails(firstName, lastName, clinicName, registrationNumber, mobileNumber, LoginEmail);

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorLoginPage.testFailure || doctorMorePage.testFailure) {
				status = true;
				testFailure = status;

				resetDoctorApp();
			}
		}
	}


	// UAT_IND_080
	public void verifyInviteFellowPractionersFunctionality() {
		try {
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorMorePage = new DoctorMorePage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String firstName = retrieve("First Name");
			String lastName = retrieve("Last Name");
			String emailID = retrieve("Email ID");
			String mobileNumber = retrieve("Mobile Number");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorMorePage.validateInviteFellowPractionersFunctionality(firstName,lastName,emailID,mobileNumber);

			resetDoctorAppAndLogOut();


		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorLoginPage.testFailure || doctorMorePage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

}
