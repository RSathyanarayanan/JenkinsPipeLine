package pages;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class PatientOrderPage extends ApplicationKeywords {
	
	public PatientOrderPage(BaseClass obj) {
		super(obj);
	}
	
	// UAT_IND_052
	public void validatePatientCouldOrderLabTestFromStore() {
		try {
			
				clickOn("FooterIcons_Order");
				
				//isListOfElementsDisplayed("lbl_Order_Store,lbl_Order_supportIcon,lbl_Order_MedicineOrder,lbl_Order_LabTestOrder,lbl_Order_DevicesOrder");

				isListOfElementsDisplayed("lbl_Order_Store,lbl_Order_supportIcon,lbl_Order_MedicineOrder");

				clickOn("lbl_Order_LabTestOrder");
				
				waitForElementToDisplay("btn_OrderPage_Cancel",5);

				getAndMatchListElementTexts("msgTxt_OrderPage_TitleandHelpTextElement","Call us to place your diagnostic lab orders##Lab Test Order");

				clickOn("btn_OrderPage_Cancel");

				clickOn("lbl_Order_LabTestOrder");

				clickOn("btn_OrderPage_RequestCallBack");

				getAndMatchListElementTexts("msgTxt_OrderPage_ContactBackSuccessMSg","Callback Requested##One of our medical executives will contact you in the next 24 hours");

				clickOn("btn_OrderPage_Done");
				
				testStepInfo("Testcase UAT_IND_052 Completed successfully");


		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCouldOrderLabTestFromStore " + e.toString());
		}
	}

	// UAT_IND_053
	public void validatePatientCouldOrderMedicinesFromStore() {
		try {
			
				clickOn("FooterIcons_Order");

				clickOn("lbl_Order_MedicineOrder");
				
				getAndMatchListElementTexts("msgTxt_OrderPage_TitleandHelpTextElement","Our team will call you to take your order for medicine##Medicine Order");

				clickOn("btn_OrderPage_Cancel");

				clickOn("lbl_Order_MedicineOrder");

				clickOn("btn_OrderPage_RequestCallBack");

				getAndMatchListElementTexts("msgTxt_OrderPage_ContactBackSuccessMSg","Callback Requested##One of our medical executives will contact you in the next 24 hours");

				clickOn("btn_OrderPage_Done");
				
				testStepInfo("Testcase UAT_IND_053 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validatePatientCouldOrderDevicesFromStore " + e.toString());
		}
	}

	
	
	
	/*// UAT_IND_053
		public void validatePatientCouldOrderDevicesFromStore() {
			try {
				
					clickOn("FooterIcons_Order");

					clickOn("lbl_Order_DevicesOrder");
					
					getAndMatchListElementTexts("msgTxt_OrderPage_TitleandHelpTextElement","Request a callback to purchase medical devices##Devices");

					clickOn("btn_OrderPage_Cancel");

					clickOn("lbl_Order_DevicesOrder");

					clickOn("btn_OrderPage_RequestCallBack");

					getAndMatchListElementTexts("msgTxt_OrderPage_ContactBackSuccessMSg","Callback Requested##One of our medical executives will contact you in the next 24 hours");

					clickOn("btn_OrderPage_Done");
					
					testStepInfo("Testcase UAT_IND_053 Completed successfully");

			} catch (Exception e) {
				testStepFailed("Exception in the method validatePatientCouldOrderDevicesFromStore " + e.toString());
			}
		}

		// UAT_IND_054
		public void validatePatientCouldOrderHealthyFoodsFromStore() {
			try {
				
					clickOn("FooterIcons_Order");

					scrollToText("Healthy Foods");
					
					verifyElementIsDisplayed("lbl_Order_HealthyFoods");
									
					clickOn("lbl_Order_HealthyFoods");
					
					getAndMatchListElementTexts("msgTxt_OrderPage_TitleandHelpTextElement","Call us to order healthy foods and products##Healthy Foods");

					clickOn("btn_OrderPage_Cancel");

					clickOn("lbl_Order_HealthyFoods");

					clickOn("btn_OrderPage_RequestCallBack");

					getAndMatchListElementTexts("msgTxt_OrderPage_ContactBackSuccessMSg","Callback Requested##One of our medical executives will contact you in the next 24 hours");

					clickOn("btn_OrderPage_Done");

					testStepInfo("Testcase UAT_IND_054 Completed successfully");

			} catch (Exception e) {
				testStepFailed("Exception in the method VerifyPatientCouldOrderHealthyFoodsFromStore " + e.toString());
			}
		}
*/
	
	
}
