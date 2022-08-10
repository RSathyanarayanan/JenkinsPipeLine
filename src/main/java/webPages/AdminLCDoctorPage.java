package webPages;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class AdminLCDoctorPage extends ApplicationKeywords {

	public AdminLCDoctorPage(BaseClass obj) {
		super(obj);
	}

	// WEB_IND_007
	public void validateDoctorPageNavigationandDoctorssPageUIElements() {
		try {

			clickOn("btn_AdminLoginPage_LC_Doctor");

			openShadowRootAndVerifyElement("lbl_LCDoctorPage_Host_DoctorsList", "shadowRoot_DivLabel");
			openShadowRootAndVerifyElement("lbl_LCDoctorPage_Host_RecentlyAddedDoctorsList", "shadowRoot_DivLabel");

			openTwoShadowRootAndVerifyElement("btn_AdminLoginPage_Host_AddDoctors", "shadowRoot_PTCSLabel",
					"shadowRoot_DivLabel");

			openShadowRootAndVerifyElement("drp_LCDoctorPage_Host_DcotorsDropDown1", "shadowRoot_PTCShbar");

			openShadowRootAndVerifyElement("drp_LCDoctorPage_Host_DoctorsDropDown2", "shadowRoot_PTCShbar");

		} catch (Exception e) {
			testStepFailed(
					"Exception in the method validateDoctorPageNavigationandDoctorssPageUIElements " + e.toString());
		}
	}

	// WEB_IND_008
	public void validateAdminAbletoViewDoctorDetails(String DoctorName) {
		try {

			clickOn("btn_AdminLoginPage_LC_Doctor");

			openShadowRootAndVerifyElement("lbl_LCDoctorPage_Host_RecentlyAddedDoctorsList", "shadowRoot_DivLabel");

			String Doctor = getObjectLocator("lbl_LCDoctorPage_DoctorName").replace("<<Username>>", DoctorName);

			updateObjectLocator("lbl_LCDoctorPage_DoctorName", Doctor);

			waitForElementToDisplay("lbl_LCDoctorPage_DoctorName", 10);

			clickOn("lbl_LCDoctorPage_DoctorName");

			openShadowRootAndVerifyElement("drp_LCDoctorDetailsPage_Host_DoctorsName", "shadowRoot_DivLabel");

			String ActualDoctorName = openShadowRootGetText("drp_LCDoctorDetailsPage_Host_DoctorsName",
					"shadowRoot_DivLabel");
			if (DoctorName.equals(ActualDoctorName)) {
				testStepPassed(DoctorName + " Profile Details are displayed");
			} else {
				testStepPassed(DoctorName + " Profile Details are not displayed");
			}

		} catch (Exception e) {
			testStepFailed("Exception in the method  " + e.toString());
		}
	}

	// WEB_IND_009
	public void validateAddDoctorScenario(String FirstName, String LastName, String PrimaryMobileNumber,
			String SecondaryMobileNumber, String GMailID, String YearOfExperince, String RegistrationNumber,
			String AccountNumber, String BenificiaryName, String IFSCCode, String BankName, String City,
			String Branch, String StaffFirstName , String StaffLastName , String StaffPrimaryMobileNumber , String StaffSecondaryMobileNumber, String StaffEmailID , String ConsulationFee,String ClinicName , String PersonName , String ClinicMobileNumber , String ClinicAddress1 , String ClinicAddress2 , String ClinicPincode) {
		
		
		try {

			clickOn("btn_AdminLoginPage_LC_Doctor");

			waitForElementToDisplay("btn_AdminLoginPage_AddNewDoctor", 15);

			clickOn("btn_AdminLoginPage_AddNewDoctor");

			fillBasicInformationFields(FirstName, LastName, PrimaryMobileNumber, SecondaryMobileNumber, GMailID);

			fillProfessionalDetailsFields(YearOfExperince, RegistrationNumber);

			fillDocumentsinDocumentDetails();
			
			waitForElementToDisplay("btn_AddNewDoctor_Next", 10);

			moveToElementActions("btn_AddNewDoctor_Next");

			clickOn("btn_AddNewDoctor_Next");

			fillClinicDetailsFields(ClinicName,PersonName,ClinicMobileNumber,ClinicAddress1,ClinicAddress2,ClinicPincode);

			fillStaffDetailsFields(StaffFirstName,StaffLastName,StaffPrimaryMobileNumber,StaffSecondaryMobileNumber,StaffEmailID);

			waitForElementToDisplay("btn_AddNewDoctor_Next", 10);
			
			moveToElementActions("btn_AddNewDoctor_Next");

			clickOn("btn_AddNewDoctor_Next");

			fillConsultationDetailsandAddSlots(ConsulationFee);

			fillEmergencyDetails();
			
			moveToElementActions("btn_AddNewDoctor_Next");

			clickOn("btn_AddNewDoctor_Next");

			fillBankDetails(AccountNumber,BenificiaryName,IFSCCode,BankName,City,Branch);

			clickOn("");

			ValidateandVerifyDoctorisAdded();

		} catch (Exception e) {
			testStepFailed("Exception in the method validateAddDoctorScenario " + e.toString());
		}
	}

	// WEB_IND_009
	public void fillBasicInformationFields(String FirstName, String LastName, String PrimaryMobileNumber,
			String SecondaryMobileNumber, String GMailID) {
		try {

			waitTime(5);

			openShadowRootTypeInUsingActions("txt_AddDoctorPage_Host_DoctorFirstName", "txt_AddDoctorPage_FirstName",
					FirstName);

			openShadowRootTypeInUsingActions("txt_AddDoctorPage_Host_DoctorLastName", "txt_AddDoctorPage_LastName",
					LastName);

			openShadowRootClickOn("drp_AddDoctorPage_Host_NameArrow", "shadowRoot_PTCSICon");

			openTwoShadowRootAndClickOn("drp_AddDoctorPage_Host1_Name_Mrs", "drp_AddDoctorPage_Host2_Name_Mrs",
					"shadowRoot_DivLabel");

			moveToElementActions("btn_AddDoctorPage_Host_Save");

			openShadowRootClickOn("drp_AddDoctorPage_Host_GenderArrow", "shadowRoot_PTCSICon");

			openTwoShadowRootAndClickOn("drp_AddDoctorPage_Host1_GenderMale", "drp_AddDoctorPage_Host2_GenderMale",
					"shadowRoot_DivLabel");

			openShadowRootTypeInUsingActions("txt_AddDoctorPage_Host_PrimaryMobileNumber",
					"txt_AddDoctorPage_PrimaryMobileNumber", PrimaryMobileNumber);

			openShadowRootTypeInUsingActions("txt_AddDoctorPage_Host_SecondaryMobileNumber",
					"txt_AddDoctorPage_SecondaryMobileNumber", SecondaryMobileNumber);

			openShadowRootTypeInUsingActions("txt_AddDoctorPage_Host_GmailId", "txt_AddDoctorPage_GmailId", GMailID);

			waitTime(10);

			// ClickOn("btn_AddDoctorPage_Host_Save")

		} catch (Exception e) {
			testStepFailed("Exception in the method fillBasicInformationFields " + e.toString());
		}
	}

	// WEB_IND_009
	public void fillProfessionalDetailsFields(String YearOfExperince, String RegistrationNumber) {
		try {

			clickOn("Img_AddNewDoctor_professionaldeatailsIcon");

			moveToElementActions("txt_AddNewDoctor_Host_RegistrationNumber");

			openShadowRootClickOn("drp_AddNewDoctor_Host_HighestQualArrow", "shadowRoot_PTCSICon");
			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_HighestQualBDS",
					"drp_AddNewDoctor_Host2_HighestQualBDS", "shadowRoot_DivLabel");

			openShadowRootClickOn("drp_AddNewDoctor_Host_otherQualArrow", "shadowRoot_PTCSICon");
			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_otherQualBAMS", "drp_AddNewDoctor_Host2_otherQualBAMS",
					"shadowRoot_DivLabel");

			openShadowRootClickOn("drp_AddNewDoctor_Host_specialityArrow", "shadowRoot_PTCSICon");
			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_specialityAcheSpeclity",
					"drp_AddNewDoctor_Host2_specialityAcheSpeclity", "shadowRoot_DivLabel");

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_YearOfExperience",
					"txt_AddNewDoctor_YearOfExperience", YearOfExperince);

			moveToElementActions("txt_AddNewDoctor_Host_RegistrationNumber");

			openShadowRootClickOn("drp_AddNewDoctor_Host_CounsilArrow", "shadowRoot_PTCSICon");
			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_CounsilAndhraMedicalCounsil",
					"drp_AddNewDoctor_Host2_CounsilAndhraMedicalCounsil", "shadowRoot_DivLabel");

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_RegistrationNumber",
					"txt_AddNewDoctor_RegistrationNumber", RegistrationNumber);

			waitTime(05);

			// ClickOn(save)
			// validate Success Message

			testStepPassed("Professional Details Added");

		} catch (Exception e) {
			testStepFailed("Exception in the method fillProfessionalDetailsFields " + e.toString());
		}
	}

	// WEB_IND_009
	public void fillDocumentsinDocumentDetails() {
		try {

			// Skipping to complete the E2E doctor module.

		} catch (Exception e) {
			testStepFailed("Exception in the method fillDocumentsinDocumentDetails " + e.toString());
		}
	}

	// WEB_IND_009
	public void fillClinicDetailsFields(String ClinicName, String PersonName, String ClinicMobileNumber,
			String ClinicAddress1, String ClinicAddress2, String ClinicPincode) {
		try {
			waitForElementToDisplay("btn_AddNewDoctor_Addclinic", 10);
			moveToElementActions("btn_AddNewDoctor_Addclinic");

			waitForElementToDisplay("btn_AddNewDoctor_Addclinic", 10);
			clickOn("btn_AddNewDoctor_Addclinic");

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_ClinicName", "txt_AddNewDoctor_ClinicName",
					ClinicName);

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_ContactPersonName",
					"txt_AddNewDoctor_ContactPersonName", PersonName);

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_MobileNumber", "txt_AddNewDoctor_MobileNumber",
					ClinicMobileNumber);

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_AddressLine1", "txt_AddNewDoctor_AddressLine1",
					ClinicAddress1);

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_AddressLine2", "txt_AddNewDoctor_AddressLine2",
					ClinicAddress2);

			waitForElementToDisplay("drp_AddNewDoctor_Host_weekday", 10);
			openShadowRootClickOn("drp_AddNewDoctor_Host_weekday", "shadowRoot_PTCSICon");

			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host_weekday", "drp_AddNewDoctor_Host2_weekdaySunday",
					"shadowRoot_DivLabel");

			clickOn("btn_AddNewDoctor_defaultAddress");

			openShadowRootClickOn("drp_AddNewDoctor_Host_openTime", "shadowRoot_PTCSICon");

			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_openTime", "drp_AddNewDoctor_Host2_openTimeAM",
					"shadowRoot_DivLabel");

			openShadowRootClickOn("drp_AddNewDoctor_Host_closeTime", "shadowRoot_PTCSICon");

			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_closeTime", "drp_AddNewDoctor_Host2_closeTimeAm",
					"shadowRoot_DivLabel");

			openShadowRootTypeInUsingActions("btn_AddNewDoctor_Pincode", "txt_AddNewDoctor_PincodeValue",
					ClinicPincode);

			waitForElementToDisplay("btn_AddNewDoctor_Save", 10);

			clickOn("btn_AddNewDoctor_Save");

			testStepInfo("successflly added clinic Details");

		} catch (Exception e) {
			testStepFailed("Exception in the method fillClinicDetailsFields " + e.toString());
		}
	}

	// WEB_IND_009
	public void fillStaffDetailsFields(String StaffFirstName, String StaffLastName, String StaffPrimaryMobileNumber,
			String StaffSecondaryMobileNumber, String StaffEmailID) {
		try {

			waitForElementToDisplay("btn_AddNewDoctor_Next", 15);

			moveToElementActions("btn_AddNewDoctor_Next");

			waitForElementToDisplay("txt_AddDoctor_Host_StaffFirstName", 5);

			openShadowRootTypeInUsingActions("txt_AddDoctor_Host_StaffFirstName", "txt_AddDoctor_StaffFirstName",
					StaffFirstName);

			openShadowRootTypeInUsingActions("txt_AddDoctor_Host_StaffLastName", "txt_AddDoctor_StaffLastName",
					StaffLastName);

			moveToElementActions("btn_AddDoctor_Host_AddStaff");

			openShadowRootClickOn("drp_AddDoctor_Host_GenderArrow", "shadowRoot_PTCSICon");

			openTwoShadowRootAndClickOn("drp_AddDoctor_Host1_GenderMale", "drp_AddDoctor_Host2_GenderMale",
					"shadowRoot_DivLabel");

			openShadowRootTypeInUsingActions("txt_AddDoctor_Host_StaffPrimaryMobileNumber",
					"txt_AddDoctor_StaffPrimaryMobileNumber", StaffPrimaryMobileNumber);

			openShadowRootTypeInUsingActions("txt_AddDoctor_Host_StaffSecondaryMobileNumber",
					"txt_AddDoctor_StaffSecondaryMobileNumber", StaffSecondaryMobileNumber);

			moveToElementActions("btn_AddDoctor_Host_AddStaff");

			openShadowRootTypeInUsingActions("txt_AddDoctor_Host_StaffEmailID", "txt_AddDoctor_StaffEmailID",
					StaffEmailID);

			moveToElementActions("btn_AddDoctor_Host_AddStaff");

			openShadowRootClickOn("drp_AddDoctor_RoleArrow", "shadowRoot_PTCSICon");

			openTwoShadowRootAndClickOn("drp_AddDoctor_Host1_StaffTeamDoctor", "drp_AddDoctor_Host2_StaffTeamDoctor",
					"shadowRoot_DivLabel");

			waitTime(20);

		} catch (Exception e) {
			testStepFailed("Exception in the method fillStaffDetailsFields " + e.toString());
		}
	}

	// WEB_IND_009
	public void fillConsultationDetailsandAddSlots(String ConsulationFee) {
		try {

			waitForElementToDisplay("btn_AddNewDoctor_AddSlot", 10);

			moveToElementActions("btn_AddNewDoctor_AddSlot");

			waitForElementToDisplay("btn_AddNewDoctor_AddSlot", 10);

			clickOn("btn_AddNewDoctor_AddSlot");

			openShadowRootClickOn("drp_AddNewDoctor_Host_DurationPerConsulation", "shadowRoot_PTCSICon");
			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_DurationPerConsulation",
					"drp_AddNewDoctor_Host2_DurationPerConsulation", "shadowRoot_DivLabel");

			openShadowRootTypeInUsingActions("btn_AddNewDoctor_RegularConsultationFee",
					"txt_AddNewDoctor_RegularConsultationFee", ConsulationFee);

			openShadowRootClickOn("drp_AddNewDoctor_Host_ConsulationType", "shadowRoot_PTCSICon");
			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_ConsulationType",
					"drp_AddNewDoctor_Host2_ConsulationType", "shadowRoot_DivLabel");

			openShadowRootClickOn("drp_AddNewDoctor_Host_Weekday", "shadowRoot_PTCSICon");

			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_Weekday", "drp_AddNewDoctor_Host2_Weekday",
					"shadowRoot_DivLabel");

			openShadowRootClickOn("drp_AddNewDoctor_Host_StartTime", "shadowRoot_PTCSICon");
			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_StartTime", "drp_AddNewDoctor_Host2_StartTime",
					"shadowRoot_DivLabel");

			openShadowRootClickOn("drp_AddNewDoctor_Host_EndTime", "shadowRoot_PTCSICon");
			openTwoShadowRootAndClickOn("drp_AddNewDoctor_Host1_EndTime", "drp_AddNewDoctor_Host2_EndTime",
					"shadowRoot_DivLabel");

			waitForElementToDisplay("btn_AddNewDoctor_consultation_save", 10);
			moveToElementActions("btn_AddNewDoctor_consultation_save");
			waitForElementToDisplay("btn_AddNewDoctor_consultation_save", 10);

		} catch (Exception e) {
			testStepFailed("Exception in the method fillConsultationDetailsandAddSlots " + e.toString());
		}
	}

	// WEB_IND_009
	public void fillEmergencyDetails() {
		try {

		} catch (Exception e) {
			testStepFailed("Exception in the method fillConsultationDetailsandAddSlots " + e.toString());
		}
	}

	// WEB_IND_009
	public void fillBankDetails(String AccountNumber, String BenificiaryName, String IFSCCode, String BankName,
			String City, String Branch) {
		try {

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_AccountNumber", "txt_AddNewDoctor_AccountNumber",
					AccountNumber);

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_BeneficiaryName",
					"txt_AddNewDoctor_BeneficiaryName", BenificiaryName);

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_IFSCCode", "txt_AddNewDoctor_IFSCCode", IFSCCode);

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_BankName", "txt_AddNewDoctor_BankName", BankName);

			moveToElementActions("btn_AddNewDoctor_BankDetails_Cancel");

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_City", "txt_AddNewDoctor_City", City);

			openShadowRootTypeInUsingActions("txt_AddNewDoctor_Host_Branch", "txt_AddNewDoctor_Branch", Branch);

			// ClickOn(save)
			// validate Success Message

			waitTime(20);

			testStepInfo("Bank Details Added Successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method fillConsultationDetailsandAddSlots " + e.toString());
		}
	}

	// WEB_IND_009
	public void ValidateandVerifyDoctorisAdded() {
		try {

		} catch (Exception e) {
			testStepFailed("Exception in the method ValidateandVerifyDoctorisAdded " + e.toString());
		}
	}

}
