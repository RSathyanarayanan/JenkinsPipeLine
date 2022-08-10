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

public class DoctorAppointmentsScenario extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;

	DoctorLoginPage doctorLoginPage;
	DoctorDashboardPage doctorDashboardPage;
	DoctorAppointmentsPage doctorAppointmentsPage;
	DoctorPatientsPage doctorPatientsPage;
	DoctorMorePage doctorMorePage;

	public DoctorAppointmentsScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	//UAT_IND_071
	public void verifyDoctorCreateVariousEvents()
	{
		try
		{
			doctorLoginPage = new DoctorLoginPage(obj);
			doctorAppointmentsPage = new DoctorAppointmentsPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String awayTime = retrieve("Away Time");
			String appointments = retrieve("Appointment");
			String others = retrieve("Others");


			switchToDoctorApplication();
			doctorLoginPage.DoctorloginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			doctorAppointmentsPage.validateDoctorCreateVariousEvents(awayTime, appointments, others);
			
			resetDoctorAppAndLogOut();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || doctorAppointmentsPage.testFailure || doctorLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetDoctorApp();
			}
		}
	}

}
