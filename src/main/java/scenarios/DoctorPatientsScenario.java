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

public class DoctorPatientsScenario extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;



	DoctorLoginPage doctorLoginPage;
	DoctorDashboardPage doctorDashboardPage;
	DoctorAppointmentsPage doctorAppointmentsPage;
	DoctorPatientsPage doctorPatientsPage;
	DoctorMorePage doctorMorePage;


	public DoctorPatientsScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	// UAT_IND_070
	public void verifyDoctorCanAddPatient() {
		try {

			doctorLoginPage = new DoctorLoginPage(obj);
			doctorPatientsPage = new DoctorPatientsPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String Gender = retrieve("Gender");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorPatientsPage.validateDoctorCanAddPatient(Gender);

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorPatientsPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	//UAT_IND_057
	public void verifyDoctorPatientProfileTab()
	{
		try
		{
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorPatientsPage = new DoctorPatientsPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");
			
			String patientNames = retrieve("Patient Names");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorPatientsPage.validateDoctorPatientProfileTab(patientNames);

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorPatientsPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

	//UAT_IND_058
	public void verifyDoctorPatientHistoryTab()
	{
		try
		{
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorPatientsPage = new DoctorPatientsPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchToDoctorApplication();

			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			doctorPatientsPage.validateDoctorPatientHistoryTab();

			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorPatientsPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}
}
