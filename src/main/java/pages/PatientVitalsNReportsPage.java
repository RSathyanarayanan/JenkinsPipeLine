package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import objectRepository.AndroidObjectRepo;

public class PatientVitalsNReportsPage extends ApplicationKeywords {


	public PatientVitalsNReportsPage(BaseClass obj) {

		super(obj);

	}

	// UAT_IND_009
	public void validateVitalsManualDataFields(String systolicBp, String diastolicBp) {

		try {
			
			//Blood Pressure
			clickOn("lbl_DashboardPage_BloodPressure");
			verifyElementIsDisplayed("lbl_VitalsPage_ConnectYourDevices");
			clickOn("btn_VitalsPage_AddBPReading");
			verifyElementIsDisplayed("btn_VitalsPage_Entermanually");
			clickOn("btn_VitalsPage_Entermanually");
             //Due to New UI Change
			/*selectSeekBarValue("btn_VitalsPage_SystolicBp_Scroll", systolicBp);
			selectSeekBarValue("btn_VitalsPage_DiastolicBp_Scroll", diastolicBp);*/
			clickOn("btn_VitalsPage_BP_Submit");
			isListOfElementsDisplayed("btn_VitalsPage_Done,btn_VitalsPage_DiscardReading");
			testStepPassed("Blood Pressure :"+getText("val_VitalsPage_BiovitalValue"));
			clickOn("btn_VitalsPage_BP_Done");
			verifyElementIsDisplayed("lbl_VitalsPage_ConnectYourDevices");
			
			//HeartRate
			
			scrollToText("Oxygen Saturation");
			clickOn("btn_VitalsPage_AddHeartReading");
			verifyElementIsDisplayed("btn_VitalsPage_Entermanually");
			clickOn("btn_VitalsPage_Entermanually");
			clickOn("btn_VitalsPage_BP_Submit");
			clickOn("btn_VitalsPage_NOSymptomsExperienced");
			
			isListOfElementsDisplayed("btn_VitalsPage_Done,btn_VitalsPage_DiscardReading");
			testStepPassed("Heart Rate :"+getText("val_VitalsPage_BiovitalValue"));
			clickOn("btn_VitalsPage_BP_Done");
			
			scrollToText("Connect your devices");
			verifyElementIsDisplayed("lbl_VitalsPage_ConnectYourDevices");
			
			//Verifying Labels
			
			scrollToText("Oxygen Saturation");
			verifyElementIsDisplayed("lbl_VitalsPage_OxygenSaturation");
			scrollToText("Body Mass Index");
			verifyElementIsDisplayed("lbl_VitalsPage_BMI");
			scrollToText("Blood Glucose");
			verifyElementIsDisplayed("lbl_VitalsPage_BloodGulcose");
			scrollToText("Electrocardiogram");
			verifyElementIsDisplayed("lbl_VitalsPage_ECG");

			navigateBack();
			verifyElementIsDisplayed("lbl_DashboardPage_BloodPressure");

			testStepInfo("Testcase UAT_IND_009 Completed successfully");

		}
		catch (Exception e) 
		{
			testStepFailed("Exception in the method validateVitalsManualDataFields " + e.toString());
		}
	}

	// UAT_IND_010
	public void ValidateViewandDownloadLabReport()
	{
		try
		{
			verifyElementIsDisplayed("FooterIcons_Heartbutton");
			
			clickOn("FooterIcons_Heartbutton");
			
			isListOfElementsDisplayed("lbl_ReportsPage_VitalsAndReports,tab_ReportsPage_VitalsTab,tab_ReportsPage_ReportsTab");
			
			clickOn("tab_ReportsPage_ReportsTab");
			
			waitForElement("lbl_ReportsPage_UploadLabReportFileSizeAlert", 5);
			
			isListOfElementsDisplayed("lbl_ReportsPage_UploadLabReportTile,lbl_ReportsPage_UploadLabReportFileSizeAlert,lbl_ReportsPage_UploadedReports"); 
		
			validateUploadedReports();
			
			clickOn("lst_ReportsPage_ReportKebabMenu");
			
			isListOfElementsDisplayed("btn_ReportsPage_Download,btn_ReportsPage_Delete");

			testStepInfo("Testcase UAT_IND_010 Completed successfully");

		}
		catch (Exception e)
		{
			testStepFailed("Exception in the method ValidateViewandDownloadLabReport " + e.toString());
		}
	}
	
	

	// UAT_IND_011
	public void validateUploadLabReport()
	{
		try
		{ 
			
		verifyElementIsDisplayed("FooterIcons_Heartbutton");
		
		clickOn("FooterIcons_Heartbutton");
		
		isListOfElementsDisplayed("lbl_ReportsPage_VitalsAndReports,tab_ReportsPage_VitalsTab,tab_ReportsPage_ReportsTab");
		
		clickOn("tab_ReportsPage_ReportsTab");
		
		waitForElement("lbl_ReportsPage_UploadLabReportFileSizeAlert", 5);
		
		isListOfElementsDisplayed("lbl_ReportsPage_UploadLabReportTile,lbl_ReportsPage_UploadLabReportFileSizeAlert,lbl_ReportsPage_UploadedReports"); 
		
		validateUploadedReports();
		
		testStepInfo("Testcase UAT_IND_011 Completed successfully");
		
		}
		catch(Exception e)
		{
			testStepFailed("Exception in the method validateUploadLabReport " +e.toString());
		}
	}
	
	public void validateUploadedReports()
    {
		 List<WebElement> elements = findWebElements("lst_ReportsPage_UploadedReports");//3

	        for(int i =0; i < 2; i++)
	        {
	            WebElement element =elements.get(i);
	            parseidentifyByAndlocator("txt_ReportsPage_UploadedReports");
	            List<WebElement> elements2 = element.findElements(By.xpath(this.locator));//3
	            for(int j = 0; j < 3; j++)
	            {
	                testStepPassed(elements2.get(j).getText().trim() + " is displayed");
	            }
	        }
    }

//	//UAT_IND_057(Yes is not displayed) and UAT_IND_058(No is not displayed)
//	public void validatePatientContactDoctorForOffRangeReadingWithSymptoms(String systolicBp, String diastolicBp, String bpValue, String riskStatus, String riskValue) 
//	{
//		try {
//			clickOn("lbl_DashboardPage_BloodPressure");
//
//			verifyElementIsDisplayed("lbl_VitalsPage_ConnectYourDevices");
//			clickOn("btn_VitalsPage_AddReading");
//
//			verifyElementIsDisplayed("btn_VitalsPage_Entermanually");
//			clickOn("btn_VitalsPage_Entermanually");
//
////			selectSeekBarValue("btn_VitalsPage_SystolicBp_Scroll", systolicBp);
////			selectSeekBarValue("btn_VitalsPage_DiastolicBp_Scroll", diastolicBp);
//			clickOn("btn_VitalsPage_BP_Submit");
//			waitTime(3);
//			getText("btn_VitalsPage_BP_AddedSuccessMessage",bpValue);
//			getText("btn_VitalsPage_BP_AddedSuccessMessage",riskStatus);
//			getText("btn_VitalsPage_BP_AddedSuccessMessage",riskValue);
//
//			if (isElementPresent("btn_VitalsPage_BP_Done"))
//			{
//				/*	Verify the values,. 
//				 * Vital status should be displayed (Blue-Normal & Red-High)
//				 * 2. Based on the vital status following text should be displayed 
//				 * Normal - "Great! Your Bp is normal please continue the medication and diet"
//				 * Low and High- "Oops! Your Bp is Low/High. Your Doctor has been informed. You will be contacted soon"
//				 */
//				clickOn("btn_VitalsPage_BP_Done");
//				verifyElementIsDisplayed("lbl_VitalsPage_ConnectYourDevices");
//				navigateBack();
//				verifyElementIsDisplayed("lbl_DashboardPage_BloodPressure");
//				
//				testStepInfo("Test Execution Completed successfully");
//			} 
//			else 
//			{
//				testStepFailed(splitLocatorLocatorLabel(getObjectLocator("btn_VitalsPage_BP_Done")) + " is not Displayed");
//			}
//
//		}
//		catch (Exception e) 
//		{
//			testStepFailed("Exception in the method validatePatientContactDoctorForOffRangeReadingWithSymptoms " + e.toString());
//		}
//	}
}


