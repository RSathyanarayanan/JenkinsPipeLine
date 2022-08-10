package scenarios;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.PatientDashboardPage;
import pages.PatientLoginPage;

public class PatientDashboardScenario extends ApplicationKeywords {
	BaseClass obj;
	private Boolean status = false;
	PatientLoginPage patientLoginPage;
	PatientDashboardPage patientDashboardPage;

	public PatientDashboardScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	// UAT_IND_008
	public void verifyBioVitalsTilesAndDashboardScreen() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientDashboardPage = new PatientDashboardPage(obj);

			String LoginEmail = retrieve("Email Address"); 
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientDashboardPage.validateBioVitalsTilesAndDashboardScreen();
			

			resetApplication(getConfigProperty("AppName1"));


		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientDashboardPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_012
	public void verifyUserSelectOrDeSelectSymptoms() 
	{
		try 
		{
			patientLoginPage = new PatientLoginPage(obj);
			patientDashboardPage = new PatientDashboardPage(obj);

			String LoginEmail = retrieve("Email Address"); 
			String LoginPassword = retrieve("Password");

			String listOfSymptoms = retrieve("List Of Symptoms");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientDashboardPage.validateUserSelectOrDeSelectSymptoms(listOfSymptoms);

			resetApplication(getConfigProperty("AppName1"));

		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientDashboardPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_013
	public void verifyPatientNavigatedToEmergencyWhenPrefedefinedSymptomsSelected() 
	{
		try 
		{
			patientLoginPage = new PatientLoginPage(obj);
			patientDashboardPage = new PatientDashboardPage(obj);

			String LoginEmail = retrieve("Email Address"); 
			String LoginPassword = retrieve("Password");

			String listOfSymptoms = retrieve("List Of Symptoms");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientDashboardPage.validatePatientNavigatedToEmergencyWhenPrefedefinedSymptomsSelected(listOfSymptoms);

			resetApplication(getConfigProperty("AppName1"));

		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientDashboardPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));

			}
		}
	}


	// UAT_IND_014
	public void verifyPatientNotNavigatedToEmergencyWhenPrefedefinedSymptomsSelected() 
	{
		try 
		{
			patientLoginPage = new PatientLoginPage(obj);
			patientDashboardPage = new PatientDashboardPage(obj);

			String LoginEmail = retrieve("Email Address"); 
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientDashboardPage.validatePatientNotNavigatedToEmergencyWhenPrefedefinedSymptomsSelected();

			resetApplication(getConfigProperty("AppName1"));

		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientDashboardPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));

			}
		}
	}


	//UAT_IND_015
	public void verifySubmitBadMoodAndGetResponse() {
		try 
		{
			patientLoginPage = new PatientLoginPage(obj);
			patientDashboardPage = new PatientDashboardPage(obj);

			String LoginEmail = retrieve("Email Address"); 
			String LoginPassword = retrieve("Password");

			String descriptionValue = retrieve("Description Value");
			String moodSubmissionResponseValue = retrieve("Mood Submission Response Value");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientDashboardPage.validateSubmitBadMoodAndGetResponse(descriptionValue,moodSubmissionResponseValue);

			resetApplication(getConfigProperty("AppName1"));

		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientDashboardPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));

			}
		}
	}


	// UAT_IND_016
	public void validateSelectOkMoodAndCheckAbleToProceedFurther() {
		try 
		{
			patientLoginPage = new PatientLoginPage(obj);
			patientDashboardPage = new PatientDashboardPage(obj);

			String LoginEmail = retrieve("Email Address"); 
			String LoginPassword = retrieve("Password");

			String descriptionValue = retrieve("Description Value");
			String moodSubmissionResponseValue = retrieve("Mood Submission Response Value");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientDashboardPage.validateSelectOkMoodAndCheckAbleToProceedFurther(descriptionValue,moodSubmissionResponseValue);

			resetApplication(getConfigProperty("AppName1"));

		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientDashboardPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));

			}
		}
	}

	//UAT_IND_018
	public void validateSelectGreatMoodAndCheckAbleToProceedFurther() {
		try 
		{
			patientLoginPage = new PatientLoginPage(obj);
			patientDashboardPage = new PatientDashboardPage(obj);

			String LoginEmail = retrieve("Email Address"); 
			String LoginPassword = retrieve("Password");

			String descriptionValue = retrieve("Description Value");
			String moodSubmissionResponseValue = retrieve("Mood Submission Response Value");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientDashboardPage.validateSelectGreatMoodAndCheckAbleToProceedFurther(descriptionValue,moodSubmissionResponseValue);

			resetApplication(getConfigProperty("AppName1"));

		} 
		catch (Exception e) {
			System.err.println(e.toString());
		} 
		finally {
			if (this.testFailure || patientDashboardPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));

			}
		}
	}


}
