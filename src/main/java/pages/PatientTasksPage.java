package pages;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PatientTasksPage extends ApplicationKeywords {


	public PatientTasksPage(BaseClass obj) {

		super(obj);

	}

	//UAT_IND_017
	public void validateSetAlarmGetAlert(String chooseCategory)
	{
		try
		{
			clickOn("FooterIcons_Tasks");
			
			verifyElementIsDisplayed("lbl_TasksPage_Title");
			
            //Verify tasks Page displays current Date 
			
            isListOfElementsDisplayed("lbl_TasksPage_TaskDate,lbl_TasksPage_DateNext,lbl_TasksPage_TaskPrevious");	
           
            if(getText("lbl_TasksPage_DisplayDay").trim().contains("Today")) {
            	
            	testStepPassed("Navigated to current Date");
            }	else {
            	
            	testStepFailed("Not Navigated to current Date ; Navigates to "+getText("lbl_TasksPage_DisplayDay"));
            }
			
			getElementAndClick("lbl_TasksPage_TaskCategories",chooseCategory);//All
			
			verifyElementIsDisplayed("img_TasksPage_ActiveAlertIcon");
			
			clickOn("img_TasksPage_ActiveAlertIcon");//Click not working
						
			testStepFailed("Unable Verify patient can set Alarm for the assigned task due to No Proper Upcoming/overdue/active tasks for validations.");
			//revamp after proper tasks job 
			
			testStepInfo("Testcase UAT_IND_017 Completed successfully");


		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method validateSetAlarmGetAlert " +e.toString());
		}
	}

	// UAT_IND_019
	public void validatePatientViewsTasksAssigned(String tasksCategories, String chooseCategory)
	{
		try
		{
			clickOn("FooterIcons_Tasks");
			
			verifyElementIsDisplayed("lbl_TasksPage_Title");
			
			getAndMatchListElementTexts("lbl_TasksPage_TaskCategories", tasksCategories);//All##Readings##Health##Calendar
			
			//String TaskCount = TotalCompletionCount.substring(TotalCompletionCount.indexOf('/')+1,TotalCompletionCount.indexOf("Complete")-2);
			
			getElementAndClick("lbl_TasksPage_TaskCategories","All");
			
			waitForElementToDisplay("val_TasksPage_TaskCount", 05);
			
		    testStepInfo("Total task Count : "+getText("val_TasksPage_TaskCount"));
		    

		    getElementAndClick("lbl_TasksPage_TaskCategories","Readings");
		    
			waitForElementToDisplay("val_TasksPage_TaskCount", 05);
			
		    testStepInfo("Total Reading task Count : "+getText("val_TasksPage_TaskCount"));


			getElementAndClick("lbl_TasksPage_TaskCategories","Health");
			
			waitForElementToDisplay("val_TasksPage_TaskCount", 05);

		    testStepInfo("Total Health task Count : "+getText("val_TasksPage_TaskCount"));

			
			getElementAndClick("lbl_TasksPage_TaskCategories","Calendar");
			
			waitForElementToDisplay("val_TasksPage_TaskCount", 05);
			
		    testStepInfo("Total Calendar task Count : "+getText("val_TasksPage_TaskCount"));
		    
			testStepInfo("Testcase UAT_IND_019 Completed successfully");

			
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method validatePatientViewsTasksAssigned " +e.toString());
		}
	}

	//UAT_IND_020
	public void validatePatientCanUpdateStatusForAssignedTasksByCheckBox(String tasksCategories, String chooseCategory)
	{
		try
		{
			clickOn("FooterIcons_Tasks");
			
			verifyElementIsDisplayed("lbl_TasksPage_Title");
						
			getAndMatchListElementTexts("lbl_TasksPage_TaskCategories", tasksCategories);//All##Readings##Health##Calendar
			
			getElementAndClick("lbl_TasksPage_TaskCategories",chooseCategory);//Health
			
			waitForElementToDisplay("val_TasksPage_TaskCount", 05);

		    testStepInfo("Total Health task Count : "+getText("val_TasksPage_TaskCount"));
			
			verifyElementIsDisplayed("lbl_TasksPage_AllTasks");
			
			testStepFailed("Unable to click and verify CheckBoxes due to No Proper Upcoming/overdue/active tasks for validations.");
			//revamp after proper tasks job 
			
			testStepInfo("Testcase UAT_IND_020 Completed successfully");

		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method validatePatientCanUpdateStatusForAssignedTasksByCheckBox " +e.toString());
		}
	}


}
