package scenarios;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.PatientDashboardPage;
import pages.PatientLoginPage;
import pages.PatientTasksPage;
import pages.PatientVitalsNReportsPage;

public class PatientTasksScenario extends ApplicationKeywords{
	
	BaseClass obj;
	private Boolean status = false;
	PatientLoginPage patientLoginPage;
	PatientTasksPage patientTasksPage;


	public PatientTasksScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}
	
	// UAT_IND_017
	public void verifySetAlarmGetAlert() {
		try 
		{
			patientLoginPage = new PatientLoginPage(obj);
			patientTasksPage = new PatientTasksPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");
			
			String taskCategory = retrieve("Task Category");//All
			
			switchApplication(getConfigProperty("AppName1"));
            
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientTasksPage.validateSetAlarmGetAlert(taskCategory);
			
            resetApplication(getConfigProperty("AppName1"));
			
		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientTasksPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				
	            resetApplication(getConfigProperty("AppName1"));
			}
		}
	}
	
	// UAT_IND_019
	public void verifyPatientViewsTasksAssigned() {
		try 
		{
			patientLoginPage = new PatientLoginPage(obj);
			patientTasksPage = new PatientTasksPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");
			
			String tasksCategories = retrieve("Tasks Categories");
			String chooseCategory = retrieve("Choose Category");

            switchApplication(getConfigProperty("AppName1"));
            
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientTasksPage.validatePatientViewsTasksAssigned(tasksCategories, chooseCategory);
            
			resetApplication(getConfigProperty("AppName1"));
			
		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientTasksPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				
	            resetApplication(getConfigProperty("AppName1"));

			}
		}
	}
	
	// UAT_IND_020
	public void verifyPatientCanUpdateStatusForAssignedTasksByCheckBox() {
		try 
		{
			patientLoginPage = new PatientLoginPage(obj);
			patientTasksPage = new PatientTasksPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");
			
			String tasksCategories = retrieve("Tasks Categories");
			String chooseCategory = retrieve("Choose Category");

           switchApplication(getConfigProperty("AppName1"));
           
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientTasksPage.validatePatientCanUpdateStatusForAssignedTasksByCheckBox(tasksCategories, chooseCategory);
            resetApplication(getConfigProperty("AppName1"));

		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientTasksPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
	            resetApplication(getConfigProperty("AppName1"));

			}
		}
	}
}
