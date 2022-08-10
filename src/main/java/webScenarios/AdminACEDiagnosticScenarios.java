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
import webPages.AdminACEDiagnosticPage;
import webPages.AdminLoginPage;

public class AdminACEDiagnosticScenarios extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;
	
	AdminLoginPage adminLoginPage;
	AdminACEDiagnosticPage adminACEDiagnosticPage;
	
	public AdminACEDiagnosticScenarios(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	// WEB_IND_017
	public void verifyDiagnosticPageNavigationandDiagnosticPageUIElements() {
		try {
			
			adminLoginPage = new AdminLoginPage(obj);
			adminACEDiagnosticPage = new AdminACEDiagnosticPage(obj);


			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			adminLoginPage.validateACEAdminLoginToTheApplication(LoginEmail, LoginPassword);
			adminACEDiagnosticPage.validateDiagnosticPageNavigationandDiagnosticPageUIElements();
			adminLoginPage.LogOutofTheAdminApplication();			

			
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminACEDiagnosticPage.testFailure) {
				status = true;
				testFailure = status;
			}
		}
	}
	
	
}
