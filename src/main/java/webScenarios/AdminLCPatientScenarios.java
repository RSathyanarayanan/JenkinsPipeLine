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
import webPages.AdminLCPatientPage;
import webPages.AdminLoginPage;

public class AdminLCPatientScenarios extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;
	
	AdminLoginPage adminLoginPage;
	AdminLCPatientPage adminLCPatientPage;
	
	public AdminLCPatientScenarios(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	// WEB_IND_003
	public void verifyPatientPageNavigationandPatientsPageUIElements() {
		try {
			
			adminLoginPage = new AdminLoginPage(obj);
			adminLCPatientPage = new AdminLCPatientPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			adminLoginPage.validateLCAdminLoginToTheApplication(LoginEmail, LoginPassword);
			adminLCPatientPage.validatePatientPageNavigationandPatientsPageUIElements();
			adminLoginPage.LogOutofTheAdminApplication();			
			
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || adminLoginPage.testFailure || adminLCPatientPage.testFailure) {
				status = true;
				testFailure = status;
			}
		}
	}
	
	// WEB_IND_004
		public void verifyAdminAbletoViewPatientDetails() {
			try {
				
				adminLoginPage = new AdminLoginPage(obj);
				adminLCPatientPage = new AdminLCPatientPage(obj);

				String LoginEmail = retrieve("Email Address");
				String LoginPassword = retrieve("Password");
				String PatientName = "Zoie Amanda";

				adminLoginPage.validateLCAdminLoginToTheApplication(LoginEmail, LoginPassword);
				adminLCPatientPage.validateAdminAbletoViewPatientDetails(PatientName);
				adminLoginPage.LogOutofTheAdminApplication();			
				
			} catch (Exception e) {
				System.err.println(e.toString());
			} finally {
				if (this.testFailure || adminLoginPage.testFailure || adminLCPatientPage.testFailure) {
					status = true;
					testFailure = status;
				}
			}
		}
	
	
}
