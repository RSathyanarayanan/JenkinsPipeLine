package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import objectRepository.AndroidObjectRepo;

public class PatientDashboardPage extends ApplicationKeywords {


	public PatientDashboardPage(BaseClass obj) {
		super(obj);
	}

	//UAT_IND_008
	public void validateBioVitalsTilesAndDashboardScreen() {
		try {
			waitForElement("lbl_DashboardPage_BloodPressure", 5);
			if (isElementPresent("lbl_DashboardPage_BloodPressure")) 
			{
				verifyElementIsDisplayed("lbl_DashboardPage_BloodPressure");
				
				verifyElementIsDisplayed("lbl_DashboardPage_SPO2");
				
				verifyElementIsDisplayed("lbl_DashboardPage_HeartRate");
				
				verifyElementIsDisplayed("lbl_DashboardPage_BMI");
				
                 //Verify User able to add his First Bio Vitals (4722)
				
                 isListOfElementsDisplayed("lbl_DashboardPage_RecordFirst,lbl_DashboardPage_AddRecordFirst");
                 
                 clickOn("lbl_DashboardPage_AddRecordFirst");
                 
 				verifyElementIsDisplayed("lbl_VitalsPage_ConnectYourDevices");

				//getText("val_DashboardPage_BloodPressure", bpValue);//need locator
				//getText("val_DashboardPage_SPO2", spo2Value);//need locator
				//getText("val_DashboardPage_HeartRate", hrValue);//need locator
				//getText("val_DashboardPage_BMI", bmiValue);//need locator
 				
 				testStepInfo("Testcase UAT_IND_008 Completed successfully");

			}
			else 
			{
				testStepFailed("Bio Vitals Tiles are not Displayed");
			}
		}
		catch (Exception e) {
			testStepFailed("Exception in the method validateBioVitalsTilesAndDashboardScreen " + e.toString());
		}
	}


	//UAT_IND_012
	public void validateUserSelectOrDeSelectSymptoms(String listOfSymptoms) {
		try 
		{
			testStepInfo("verify patient can view and select/deselect the symptoms");
			
			scrollToText("symptoms");//Do you have any symptoms
			
			clickOn("lbl_DashboardPage_Symptoms");
			
			verifyElementIsDisplayed("lbl_SymptomsPage_HaveSymptoms");
			
			selectSymptoms("lbl_SymptomsPage_SympNameAndDesc", listOfSymptoms);
			
			scrollToText("Submit");

			validateElementEnabled("btn_SymptomsPage_Submit", "true");
			
			scrollToText("Do you have any symptoms");
			
			deselectSymptoms(listOfSymptoms);
			
			scrollToText("Submit");

			validateElementEnabled("btn_SymptomsPage_Submit", "false");
			
			testStepPassed("Successfully patient can able to select / deselect symptoms");
			
		    testStepInfo("Testcase UAT_IND_012 Completed successfully");
		    
		} 
		catch (Exception e) {
			testStepFailed("Exception in the method validateUserSelectOrDeSelectSymptoms " + e.toString());
		}
	}

	//UAT_IND_013
	public void validatePatientNavigatedToEmergencyWhenPrefedefinedSymptomsSelected(String listOfSymptoms) {
		try 
		{
			testStepInfo("verify patient can view and select/deselect the symptoms");
			
			scrollToText("symptoms");//Do you have any symptoms
			
			clickOn("lbl_DashboardPage_Symptoms");
			
			verifyElementIsDisplayed("lbl_SymptomsPage_HaveSymptoms");
			
			selectSymptoms("lbl_SymptomsPage_SympNameAndDesc", listOfSymptoms);
			
			testStepPassed("Successfully patient can able to select symptoms");

			//Blocker 
			//Verify whether it is navigates to Emergency page 
			//Submit without text
			
			scrollToText("Submit");

			validateElementEnabled("btn_SymptomsPage_Submit", "true");
			
			clickOn("btn_SymptomsPage_Submit");

			verifyElementIsDisplayed("btn_SymptomsPage_SucessMessage");
			
			testStepInfo("Testcase UAT_IND_013 Completed successfully");

		} 
		catch (Exception e) {
			testStepFailed("Exception in the method validatePatientNavigatedToEmergencyWhenPrefedefinedSymptomsSelected " + e.toString());
		}
	}

	//UAT_IND_014
	public void validatePatientNotNavigatedToEmergencyWhenPrefedefinedSymptomsSelected() {
		try 
		{
			testStepInfo("verify patient can view and select/deselect the symptoms");

			scrollToText("symptoms");//Do you have any symptoms

			clickOn("lbl_DashboardPage_Symptoms");

			verifyElementIsDisplayed("lbl_SymptomsPage_HaveSymptoms");

			scrollToText("I have a different symptom");

			verifyElementIsDisplayed("btn_SymptomsPage_DifferentSymptoms");

			clickOn("btn_SymptomsPage_DifferentSymptoms");

			testStepPassed("I have different symptoms checkbox is selected");

			scrollToText("Submit");

			typeIn("txt_SymptomsPage_DifferentSymptomsTextArea","Testing");

			closeKeyBoard();

			validateElementEnabled("btn_SymptomsPage_Submit", "true");

			clickOn("btn_SymptomsPage_Submit");
			clickOn("btn_SymptomsPage_Submit");

			verifyElementIsDisplayed("btn_SymptomsPage_SucessMessage");
			
			testStepInfo("Testcase UAT_IND_014 Completed successfully");


		} 
		catch (Exception e) {
			testStepFailed("Exception in the method validatePatientNotNavigatedToEmergencyWhenPrefedefinedSymptomsSelected " + e.toString());
		}
	}

	//UAT_IND_015
	public void validateSubmitBadMoodAndGetResponse(String descriptionValue, String moodSubmissionResponseValue)
	{
		try 
		{
			int count = 0;
			
			selectBadMoodAndClickSubmit(descriptionValue);
			
			verifyElementIsDisplayed("lbl_MoodsPage_BadMoodResponse");
			
			getText("lbl_MoodsPage_BadMoodResponse",moodSubmissionResponseValue);
			
			navigateBack();//Need id for Back button, Click on Back button 
			
			verifyElementIsDisplayed("img_MoodsPage_FiveMoods");
			
			for(WebElement element : findWebElements("img_MoodsPage_FiveMoods"))
			{
				count++;
			}
			if(count == 5)
			{
				testStepPassed("The Number Of Moods Displayed Is : " +count);
			}
			
			//Validation to be done
			//Patient should get the option to talk topsychologist with clickable tile option with professionals details(name and pic) under "Talk to professional"
		
			testStepInfo("Testcase UAT_IND_015 Completed successfully");

		}
		catch (Exception e) 
		{
			testStepFailed("Exception in the method validateSubmitBadMoodAndGetResponse " + e.toString());
		}
	}

	//UAT_IND_016
	public void validateSelectOkMoodAndCheckAbleToProceedFurther(String descriptionValue, String moodSubmissionResponseValue) 
	{
		try 
		{
			selectOkMoodAndClickSubmit(descriptionValue);
			
			verifyElementIsDisplayed("lbl_MoodsPage_OkMoodResponse");
			
			getText("lbl_MoodsPage_OkMoodResponse",moodSubmissionResponseValue);
			
			clickOn("lbl_MoodsPage_Done");
			
			verifyElementIsDisplayed("lbl_MoodsPage_SelectOkMood");
			
			testStepInfo("Testcase UAT_IND_016 Completed successfully");

		} 
		catch (Exception e) 
		{
			testStepFailed("Exception in the method validateSelectOkMoodAndCheckAbleToProceedFurther " + e.toString());
		}
	}
	
	//UAT_IND_018
	public void validateSelectGreatMoodAndCheckAbleToProceedFurther(String descriptionValue, String moodSubmissionResponseValue) 
	{
		try 
		{
			selectGreatMoodAndClickSubmit(descriptionValue);
			
			verifyElementIsDisplayed("lbl_MoodsPage_GreatMoodResponse");
			
			getText("lbl_MoodsPage_GreatMoodResponse",moodSubmissionResponseValue);
			
			clickOn("lbl_MoodsPage_Done");
			
			verifyElementIsDisplayed("lbl_MoodsPage_SelectGreatMood");
			
			testStepInfo("Testcase UAT_IND_018 Completed successfully");

		} 
		catch (Exception e) 
		{
			testStepFailed("Exception in the method validateSelectGreatMoodAndCheckAbleToProceedFurther " + e.toString());
		}
	}

	//Methods
	public void recordAndDeleteAudio()
	{
		try
		{
			//Records Audio
			verifyElementIsDisplayed("img_MoodsPage_RecordAudio");

			clickOn("img_MoodsPage_RecordAudio");
			clickOn("img_MoodsPage_RecordAudio");

			verifyElementIsDisplayed("lbl_MoodsPage_StopRecording");
			clickOn("lbl_MoodsPage_StopRecording");

			//Deletes Audio
			verifyElementIsDisplayed("lbl_MoodsPage_AudioMoreOptions");
			clickOn("lbl_MoodsPage_AudioMoreOptions");
			verifyElementIsDisplayed("lbl_MoodsPage_DeleteAudio");
			verifyElementIsDisplayed("lbl_MoodsPage_AttachOther");
			clickOn("lbl_MoodsPage_DeleteAudio");
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method recordAndDeleteAudio " +e.toString());
		}
	}

	public void selectSymptoms(String objLocator, String listOfSymptoms)
	{
		try
		{
			String[] symptom = listOfSymptoms.split("##");
			for(int i = 0; i < symptom.length; i++)
			{
				scrollToText(symptom[i]);
				getElementAndClick(objLocator, symptom[i]);
				verifyElementIsDisplayed("lbl_SymptomsPage_SelectedSymptoms");
			}
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method selectSymptoms " +e.toString());
		}
	}

	public void deselectSymptoms(String listOfSymptoms)
	{
		try
		{
			//moveToElementActions("lbl_SymptomsPage_SelectedSymptoms");
			List<WebElement> elements = findWebElements("lbl_SymptomsPage_SelectedSymptoms");
			String[] symptom = listOfSymptoms.split("##");
			for(int i = 0; i < symptom.length; i++)
			{
				scrollToText(symptom[i]);
				elements.get(i).click();
				testStepPassed(symptom[i] + " is deselected");
			}
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method deselectSymptoms " +e.toString());
		}
	}

	//UAT_IND_015Method
	public void selectBadMoodAndClickSubmit(String descriptionValue)
	{
		try
		{
			scrollToText("mood");
			clickOn("btn_DashboardPage_Mood");
			verifyElementIsDisplayed("lbl_MoodsPage_SelectBadMood");//Check whether all three moods are displayed
			clickOn("lbl_MoodsPage_SelectBadMood");//Clicks the first mood
			typeIn("val_MoodsPage_DescribeMood", descriptionValue);
			closeKeyBoard();
			recordAndDeleteAudio();
			clickOn("lbl_moodsPage_Submit");
			waitTime(3);
			scrollToText("Done");
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method selectMoodAndClickSubmit " +e.toString());
		}
	}
	
	//UAT_IND_016Method
	public void selectOkMoodAndClickSubmit(String descriptionValue)
	{
		try
		{
			scrollToText("mood");
			clickOn("btn_DashboardPage_Mood");
			verifyElementIsDisplayed("lbl_MoodsPage_SelectOkMood");//Check whether all three moods are displayed
			clickOn("lbl_MoodsPage_SelectOkMood");//Clicks the second mood
			typeIn("val_MoodsPage_DescribeMood", descriptionValue);
			closeKeyBoard();
			recordAndDeleteAudio();
			clickOn("lbl_moodsPage_Submit");
			waitTime(3);
			scrollToText("Done");
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method selectOkMoodAndClickSubmit " +e.toString());
		}
	}
	
	//UAT_IND_018Method
	public void selectGreatMoodAndClickSubmit(String descriptionValue)
	{
		try
		{
			scrollToText("mood");
			clickOn("btn_DashboardPage_Mood");
			verifyElementIsDisplayed("lbl_MoodsPage_SelectGreatMood");//Check whether all three moods are displayed
			clickOn("lbl_MoodsPage_SelectGreatMood");//Clicks the second mood
			typeIn("val_MoodsPage_DescribeMood", descriptionValue);
			closeKeyBoard();
			recordAndDeleteAudio();
			clickOn("lbl_moodsPage_Submit");
			waitTime(3);
			scrollToText("Done");
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method selectOkMoodAndClickSubmit " +e.toString());
		}
	}

}



