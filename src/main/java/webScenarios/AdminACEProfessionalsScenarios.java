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
import webPages.AdminLoginPage;

public class AdminACEProfessionalsScenarios extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;
	
	AdminLoginPage adminLoginPage;
	
	public AdminACEProfessionalsScenarios(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	// WEB_IND_00
	public void VerifyLCAdminLoginToTheApplication() {
		try {
			
			adminLoginPage = new AdminLoginPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			adminLoginPage.validateLCAdminLoginToTheApplication(LoginEmail, LoginPassword);
			
			
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure) {
				status = true;
				testFailure = status;
			}
		}
	}
	
	
}
