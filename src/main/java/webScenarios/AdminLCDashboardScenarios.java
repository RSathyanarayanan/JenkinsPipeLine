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
import webPages.AdminACEDashboardPage;
import webPages.AdminLCDashboardPage;
import webPages.AdminLoginPage;

public class AdminLCDashboardScenarios extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;
	
	AdminLoginPage adminLoginPage;
	AdminLCDashboardPage adminLCDashboardPage;
	
	public AdminLCDashboardScenarios(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}
	
	// WEB_IND_002
	public void verifyLCDashboardPageUIElements() {
		try {

			adminLoginPage = new AdminLoginPage(obj);
			adminLCDashboardPage = new AdminLCDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			adminLoginPage.LoginToTheAdminApplication(LoginEmail, LoginPassword);
			adminLCDashboardPage.validateLCDashboardPageUIElements();
			adminLoginPage.LogOutofTheAdminApplication();


		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminLCDashboardPage.testFailure) {
				status = true;
				testFailure = status;
				adminLoginPage.LogOutofTheAdminApplication();
			}
		}
	}
	
	// WEB_IND_006
			public void verifyPatientStatusFilter() {
				try {

					adminLoginPage = new AdminLoginPage(obj);
					adminLCDashboardPage = new AdminLCDashboardPage(obj);

					String LoginEmail = retrieve("Email Address");
					String LoginPassword = retrieve("Password");

					adminLoginPage.LoginToTheAdminApplication(LoginEmail, LoginPassword);
					adminLCDashboardPage.validateLCPatientStatusFilter();
					adminLoginPage.LogOutofTheAdminApplication();


				} catch (Exception e) {
					System.err.println(e.toString());
				} finally {
					if (this.testFailure || adminLoginPage.testFailure || adminLCDashboardPage.testFailure) {
						status = true;
						testFailure = status;
						adminLoginPage.LogOutofTheAdminApplication();
					}
				}
			}
	
	// WEB_IND_010
		public void verifyDoctorStatusFilter() {
			try {

				adminLoginPage = new AdminLoginPage(obj);
				adminLCDashboardPage = new AdminLCDashboardPage(obj);

				String LoginEmail = retrieve("Email Address");
				String LoginPassword = retrieve("Password");

				adminLoginPage.LoginToTheAdminApplication(LoginEmail, LoginPassword);
				adminLCDashboardPage.validateLCDoctorStatusFilter();
				adminLoginPage.LogOutofTheAdminApplication();


			} catch (Exception e) {
				System.err.println(e.toString());
			} finally {
				if (this.testFailure || adminLoginPage.testFailure || adminLCDashboardPage.testFailure) {
					status = true;
					testFailure = status;
					adminLoginPage.LogOutofTheAdminApplication();
				}
			}
		}

	// WEB_IND_011
	public void verifyLCNaviagtionToSettingsAndValidateSettingsPage() {
		try {

			adminLoginPage = new AdminLoginPage(obj);
			adminLCDashboardPage = new AdminLCDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			adminLoginPage.LoginToTheAdminApplication(LoginEmail, LoginPassword);
			adminLCDashboardPage.validateLCNaviagtionToSettingsAndValidateSettingsPage();
			adminLoginPage.LogOutofTheAdminApplication();
			
			
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminLCDashboardPage.testFailure) {
				status = true;
				testFailure = status;
				adminLoginPage.LogOutofTheAdminApplication();
			}
		}
	}
	
	// WEB_IND_012
		public void verifyLCSearchFunctionality() {
			try {

				adminLoginPage = new AdminLoginPage(obj);
				adminLCDashboardPage = new AdminLCDashboardPage(obj);

				String LoginEmail = retrieve("Email Address");
				String LoginPassword = retrieve("Password");
				String SearchTerm = "Zoie Amanda";

				adminLoginPage.LoginToTheAdminApplication(LoginEmail, LoginPassword);
				adminLCDashboardPage.validateLCSearchFunctionality(SearchTerm);
				adminLoginPage.LogOutofTheAdminApplication();
				
				
			} catch (Exception e) {
				System.err.println(e.toString());
			} finally {
				if (this.testFailure || adminLoginPage.testFailure || adminLCDashboardPage.testFailure) {
					status = true;
					testFailure = status;
					adminLoginPage.LogOutofTheAdminApplication();
				}
			}
		}

	// WEB_IND_013
	public void verifyLCUserAbletoLogoutofTheApplication() {
		try {

			adminLoginPage = new AdminLoginPage(obj);
			adminLCDashboardPage = new AdminLCDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			adminLoginPage.LoginToTheAdminApplication(LoginEmail, LoginPassword);
			adminLCDashboardPage.validateLCAdminLogOutofTheApplication();


		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminLCDashboardPage.testFailure) {
				status = true;
				testFailure = status;
				adminLoginPage.LogOutofTheAdminApplication();
			}
		}
	}

}
