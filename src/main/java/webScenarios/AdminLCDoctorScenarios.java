package webScenarios;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.DoctorAppointmentsPage;
import pages.DoctorDashboardPage;
import pages.DoctorLoginPage;
import pages.DoctorMorePage;
import pages.DoctorPatientsPage;
import pages.PatientDashboardPage;
import pages.PatientLoginPage;
import webPages.AdminLCDoctorPage;
import webPages.AdminLCPatientPage;
import webPages.AdminLoginPage;

public class AdminLCDoctorScenarios extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;

	AdminLoginPage adminLoginPage;
	AdminLCDoctorPage adminLCDoctorPage;

	public AdminLCDoctorScenarios(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	// WEB_IND_007
	public void verifyDoctorPageNavigationandDoctorssPageUIElements() {
		try {

			adminLoginPage = new AdminLoginPage(obj);
			adminLCDoctorPage = new AdminLCDoctorPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			adminLoginPage.validateLCAdminLoginToTheApplication(LoginEmail, LoginPassword);
			adminLCDoctorPage.validateDoctorPageNavigationandDoctorssPageUIElements();
			adminLoginPage.LogOutofTheAdminApplication();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminLCDoctorPage.testFailure) {
				status = true;
				testFailure = status;
			}
		}
	}

	// WEB_IND_008
	public void verifyAdminAbletoViewDoctorDetails() {
		try {

			adminLoginPage = new AdminLoginPage(obj);
			adminLCDoctorPage = new AdminLCDoctorPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");
			// String DoctorName = "Dr. Hariharan Srinivasan";
			String DoctorName = "Dr. Radhika Dandamudi";

			adminLoginPage.validateLCAdminLoginToTheApplication(LoginEmail, LoginPassword);
			adminLCDoctorPage.validateAdminAbletoViewDoctorDetails(DoctorName);
			adminLoginPage.LogOutofTheAdminApplication();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminLCDoctorPage.testFailure) {
				status = true;
				testFailure = status;
			}
		}
	}

	// WEB_IND_008
	public void verifyAddDoctorScenario() {
		try {

			adminLoginPage = new AdminLoginPage(obj);
			adminLCDoctorPage = new AdminLCDoctorPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String FirstName = "FirstName";
			String LastName = "LastName";
			String PrimaryMobileNumber = "9500119876";
			String SecondaryMobileNumber = "9500119876";
			String GMailID = "GMailID@test.com";
			String YearOfExperince = "10";
			String RegistrationNumber = "123456";
			String AccountNumber = "123456789098765";
			String BenificiaryName = "Automation Tester";
			String IFSCCode = "UDID12345";
			String BankName = "BankName";
			String City = "CityName";
			String Branch = "BrainchName";
			String StaffFirstName ="StaffFirstName";
			String StaffLastName="StaffLastName";
			String StaffPrimaryMobileNumber="StaffPrimaryMobileNumber";
			String StaffSecondaryMobileNumber="StaffSecondaryMobileNumber";
			String StaffEmailID="StaffEmailID";
			String ConsulationFee ="500";
			String ClinicName="ClinicName";
			String PersonName="ClinicPerson Name";
			String ClinicMobileNumber="9500119876";
			String ClinicAddress1="No 2 , XYZ street";
			String ClinicAddress2="Chennai";
			String ClinicPincode="603202";

			adminLoginPage.validateLCAdminLoginToTheApplication(LoginEmail, LoginPassword);
			
			adminLCDoctorPage.validateAddDoctorScenario(FirstName, LastName, PrimaryMobileNumber, SecondaryMobileNumber,
					GMailID, YearOfExperince, RegistrationNumber, AccountNumber, BenificiaryName, IFSCCode, BankName,
					City, Branch,StaffFirstName,StaffLastName,StaffPrimaryMobileNumber,StaffSecondaryMobileNumber,StaffEmailID,ConsulationFee,ClinicName,PersonName,ClinicMobileNumber,ClinicAddress1,ClinicAddress2,ClinicPincode);
			
			adminLoginPage.LogOutofTheAdminApplication();

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminLCDoctorPage.testFailure) {
				status = true;
				testFailure = status;
			}
		}
	}

}
