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

public class AdminACEDashboardScenarios extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;

	AdminLoginPage adminLoginPage;
	AdminACEDashboardPage adminACEDashboardPage;

	public AdminACEDashboardScenarios(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	// WEB_IND_015
	public void verifyACEDashboardPageUIElements() {
		try {

			adminLoginPage = new AdminLoginPage(obj);
			adminACEDashboardPage = new AdminACEDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			adminLoginPage.LoginToTheAdminApplication(LoginEmail, LoginPassword);
			adminACEDashboardPage.validateACEDashboardPageUIElements();
			adminLoginPage.LogOutofTheAdminApplication();


		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminACEDashboardPage.testFailure) {
				status = true;
				testFailure = status;
			}
		}
	}

	// WEB_IND_018
	public void verifyACENaviagtionToSettingsAndValidateSettingsPage() {
		try {

			adminLoginPage = new AdminLoginPage(obj);
			adminACEDashboardPage = new AdminACEDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			adminLoginPage.LoginToTheAdminApplication(LoginEmail, LoginPassword);
			adminACEDashboardPage.validateACENaviagtionToSettingsAndValidateSettingsPage();
			adminLoginPage.LogOutofTheAdminApplication();


		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminACEDashboardPage.testFailure) {
				status = true;
				testFailure = status;
			}
		}
	}

	// WEB_IND_019
	public void verifyACESearchFunctionality() {
		try {

			adminLoginPage = new AdminLoginPage(obj);
			adminACEDashboardPage = new AdminACEDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String SearchTerm = "Zoie Amanda";

			adminLoginPage.LoginToTheAdminApplication(LoginEmail, LoginPassword);
			adminACEDashboardPage.validateACESearchFunctionality(SearchTerm);
			adminLoginPage.LogOutofTheAdminApplication();


		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminACEDashboardPage.testFailure) {
				status = true;
				testFailure = status;
			}
		}
	}

	// WEB_IND_020
	public void verifyACEUserAbletoLogoutofTheApplication() {
		try {

			adminLoginPage = new AdminLoginPage(obj);
			adminACEDashboardPage = new AdminACEDashboardPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			adminLoginPage.LoginToTheAdminApplication(LoginEmail, LoginPassword);
			adminACEDashboardPage.validateACEAdminLogOutofTheApplication();


		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminACEDashboardPage.testFailure) {
				status = true;
				testFailure = status;
			}
		}
	}

}
