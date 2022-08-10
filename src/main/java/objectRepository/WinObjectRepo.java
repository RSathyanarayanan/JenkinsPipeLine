package objectRepository;

public class WinObjectRepo {

	// Login Page

	public static final String img_AdminLoginPage_Host_Logo = "Login Page Logo#cssSelector=ptcs-image[id*=root_ptcsimage]";
	public static final String img_AdminLoginPage_Logo = "Login Page Logo Image#cssSelector=div[part='image']";
	public static final String lbl_AdminLoginPage_Logo = "Login Page Logo Image#xpath=ptcs-label[id='root_ptcslabel-225']";

	public static final String txt_AdminLoginPage_Host_EmailId = "Login Page Email Id#cssSelector=ptcs-textfield[label = 'User Name']";
	public static final String txt_AdminLoginPage_EmailId = "Login Page Email Id TextField#cssSelector=input[aria-label = 'User Name']";
	public static final String txt_AdminLoginPage_Host_Password = "Login Page Password#cssSelector=ptcs-textfield[label = 'Password']";
	public static final String txt_AdminLoginPage_Password = "Login Page Password TextField#cssSelector=input[aria-label = 'Password']";
	public static final String txt_AdminLoginPage_SignIn = "Login Page Sign In Button#cssSelector=ptcs-button[aria-label='Sign in']";

	public static final String btn_AdminLoginPage_Advanced = "Advanced Button#xpath=//button[@id='details-button']";
	public static final String btn_AdminLoginPage_Proceed = "Proceed Button#xpath=//a[@id='proceed-link']";

	// ShadowRootCommonHost

	public static final String shadowRoot_DivLabel = "Shadow root helpers#cssSelector=div[id='label']";
	public static final String shadowRoot_PTCSLabel = "Shadow root helpers#cssSelector=ptcs-label[id='label']";
	public static final String shadowRoot_PTCSLabelListItem = "Shadow root helpers#cssSelector=ptcs-label[variant='list-item']";
	public static final String shadowRoot_PTCSLabelPartItemValue = "Shadow root helpers#cssSelector=ptcs-label[variant='list-item']";
	public static final String shadowRoot_PTCShbar = "Shadow root helpers#cssSelector=ptcs-hbar[id='select']";
	public static final String shadowRoot_PTCSICon = "Shadow root helpers#cssSelector=ptcs-icon[id*='icon']";

	// LC DashBoard Page
	public static final String lbl_AdminLoginPage_Host_LCHeader = "LC Header#cssSelector=ptcs-label[id*='root_ptcslabel-43']";
	public static final String lbl_AdminLoginPage_LCHeader = "LC Hedaer#cssSelector=div[id='label']";
	public static final String lbl_AdminLoginPage_Host_ACEHeader = "ACE Header#cssSelector=ptcs-label[id*='root_ptcslabel-43']";
	public static final String lbl_AdminLoginPage_ACEHeader = "ACE Header#cssSelector=div[id='label']";
	public static final String lbl_AdminLoginPage_CollapseButton = "side panel#xpath=//div[contains(@id,'flexcontainer-12-collapse-btn')]";

	public static final String btn_AdminLoginPage_LC_Dashboard = "Dashboard Button#xpath=//span[@title='Dashboard']/ancestor::a";
	public static final String btn_AdminLoginPage_LC_Patients = "Patients Button#xpath=//span[@title='Patients']/ancestor::a";
	public static final String btn_AdminLoginPage_LC_Doctor = "Doctor Button#xpath=//span[@title='Doctor']/ancestor::a";
	public static final String btn_AdminLoginPage_LC_Settings = "Settings Button#xpath=//span[@title='Settings']/ancestor::a";
	public static final String btn_AdminLoginPage_LC_Logout = "Logout Button#xpath=//span[@title='Logout']/ancestor::a";

	public static final String lbl_AdminLoginPage_Host_LCName = "LC Name in Dashboard page#cssSelector=ptcs-label[id*='root_ptcslabel-42']";
	public static final String lbl_AdminLoginPage_Host_RecentlyAddedPatients = "Recently Added Patients Label#cssSelector=ptcs-label[id*='ptcslabel-93']";
	public static final String lbl_AdminLoginPage_Host_RecentlyAddedDoctors = "Recently Added Doctors Label#cssSelector=ptcs-label[id*='ptcslabel-129']";

	public static final String btn_AdminLoginPage_Host_AddPatients = "Add Patients button#cssSelector=ptcs-button[id*='ptcsbutton-51']";
	public static final String btn_AdminLoginPage_Host_AddDoctors = "Add Patients button#cssSelector=ptcs-button[id*='ptcsbutton-131']";
	public static final String drp_AdminLoginPage_Host_PatientDropDown = "Patients DropDown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-54']";
	public static final String drp_AdminLoginPage_Host_DoctorsDropDown = "Doctors Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-135']";

	public static final String txt_AdminLoginPage_LC_Host_SearchTxtBox = "Search TextBox#cssSelector=ptcs-textfield[id*='root_mashupcontainer-82_ptcstextfield-8']";
	public static final String txt_AdminLoginPage_LC_SearchTxtBox = "Search TextBox#cssSelector=input[id='input']";
	public static final String btn_AdminLoginPage_LC_SearchMagnifier1 = "Search Magnifier TextBox#cssSelector=ptcs-button[id*='root_mashupcontainer-82_ptcsbutton-22']";
	public static final String btn_AdminLoginPage_LC_Host1_SearchMagnifier2 = "Search Magnifier TextBox#cssSelector=ptcs-button[id*='root_mashupcontainer-82_ptcsbutton-19']";
	public static final String btn_AdminLoginPage_LC_Host2_SearchMagnifier2 = "Search Magnifier TextBox#cssSelector=ptcs-icon[part='icon']";
	public static final String btn_AdminLoginPage_LC_SearchMagnifier2 = "Search Magnifier TextBox#cssSelector=div[part='image']";

	public static final String drp_AdminLoginPage_LC_Host_PatientArrow = "Arrow in Patient Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-54']";
	public static final String drp_AdminLoginPage_LC_Host1_PatientAdded = "Added in Patient Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-54-external-wc']";
	public static final String drp_AdminLoginPage_LC_Host2_PatientAdded = "Added in Patient Dropdown#cssSelector=ptcs-list-item[aria-label='Added'] ptcs-label[variant='list-item']";
	public static final String drp_AdminLoginPage_LC_Host1_DropDownResults = "Dropdown results from Patient Dropdown#cssSelector=ptcs-value-display[id*='ptcsvaluedisplay-47']";
	public static final String drp_AdminLoginPage_LC_Host2_DropDownResults = "Dropdown results from Patient Dropdown#cssSelector=ptcs-label[part*='item-value']";

	public static final String drp_AdminLoginPage_LC_Host_DoctorArrow = "Arrow in Doctor Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-135']";
	public static final String drp_AdminLoginPage_LC_Host1_DoctorActive = "Active in Doctor Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-135-external-wc']";
	public static final String drp_AdminLoginPage_LC_Host2_DoctorActive = "Active in Doctor Dropdown#cssSelector=ptcs-list-item[aria-label='Active'] ptcs-label[variant='list-item']";
	public static final String drp_AdminLoginPage_LC_Host1_DropDownDocResults = "Dropdown results from Doctor Dropdown#cssSelector=ptcs-value-display[id*='ptcsvaluedisplay-47']";
	public static final String drp_AdminLoginPage_LC_Host2_DropDownDocResults = "Dropdown results from Doctor Dropdown#cssSelector=ptcs-label[part*='item-value']";

	// Patient Page

	public static final String lbl_LCPatientPage_Host_PatientsList = "Patient list in Patient page#cssSelector=ptcs-label[id*='ptcslabel-183']";
	public static final String lbl_LCPatientPage_Host_RecentlyAddedPatientsList = "Recently Added Patient list in Patient page#cssSelector=ptcs-label[id*='ptcslabel-93']";
	public static final String drp_LCPatientPage_Host_PatientDropDown1 = "Patients list DropDown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-189']";
	public static final String drp_LCPatientPage_Host_PatientDropDown2 = "Recently Added Patients Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-54']";
	public String lbl_LCPatientPage_PatientName = "Patient Name#cssSelector=ptcs-button[aria-label*='<<Username>>']";
	public static final String drp_LCPatientDetailsPage_Host_PatientName = "Patients Name in patient details Page#cssSelector=ptcs-label[id*='ptcslabel-366']";

	// Doctor Page

	public static final String lbl_LCDoctorPage_Host_DoctorsList = "Doctors list in Patient page#cssSelector=ptcs-label[id*='ptcslabel-93']";
	public static final String lbl_LCDoctorPage_Host_RecentlyAddedDoctorsList = "Recently Added Doctors list in Patient page#cssSelector=ptcs-label[id*='ptcslabel-129']";
	public static final String drp_LCDoctorPage_Host_DcotorsDropDown1 = "Doctors list DropDown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-54']";
	public static final String drp_LCDoctorPage_Host_DoctorsDropDown2 = "Recently Added Doctors Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-135']";
	public String lbl_LCDoctorPage_DoctorName = "Doctor Name#cssSelector=ptcs-button[aria-label*='<<Username>>']";
	public static final String drp_LCDoctorDetailsPage_Host_DoctorsName = "Doctors Name in patient details Page#cssSelector=ptcs-label[id*='ptcslabel-24']";

	// LCSettings

	public static final String lbl_AdminLoginPage_Host_LCSettingsHeader = "Settings Header#cssSelector=ptcs-label[id*='ptcslabel-102']";

	// ACE DashBoard Page

	public static final String btn_AdminLoginPage_ACE_Dashboard = "Dashboard Button#xpath=//span[@title='Dashboard']/ancestor::a";
	public static final String btn_AdminLoginPage_ACE_Patients = "Patients Button#xpath=//span[@title='Patients']/ancestor::a";
	public static final String btn_AdminLoginPage_ACE_Diagnostics = "Diagnostics Button#xpath=//span[@title='Diagnostics']/ancestor::a";
	public static final String btn_AdminLoginPage_ACE_Doctor = "Doctors Button#xpath=//span[@title='Doctor']/ancestor::a";
	public static final String btn_AdminLoginPage_ACE_Coach = "Coach Button#xpath=//span[@title='Coach']/ancestor::a";
	public static final String btn_AdminLoginPage_ACE_Professionals = "Professionals Button#xpath=//span[@title='Professionals']/ancestor::a";
	public static final String btn_AdminLoginPage_ACE_HealthMall = "Logout Button#xpath=//span[@title='Health Mall >']/ancestor::a";
	public static final String btn_AdminLoginPage_ACE_Settings = "Settings Button#xpath=//span[@title='Settings']/ancestor::a";
	public static final String btn_AdminLoginPage_ACE_Logout = "Logout Button#xpath=//span[@title='Logout']/ancestor::a";

	public static final String txt_AdminLoginPage_ACE_Host_SearchTxtBox = "Search TextBox#cssSelector=ptcs-textfield[id*='root_mashupcontainer-82_ptcstextfield-8']";
	public static final String txt_AdminLoginPage_ACE_SearchTxtBox = "Search TextBox#cssSelector=input[id='input']";
	public static final String btn_AdminLoginPage_ACE_SearchMagnifier1 = "Search Magnifier TextBox#cssSelector=ptcs-button[id*='root_mashupcontainer-82_ptcsbutton-22']";
	public static final String btn_AdminLoginPage_ACE_Host1_SearchMagnifier2 = "Search Magnifier TextBox#cssSelector=ptcs-button[id*='root_mashupcontainer-82_ptcsbutton-19']";
	public static final String btn_AdminLoginPage_ACE_Host2_SearchMagnifier2 = "Search Magnifier TextBox#cssSelector=ptcs-icon[part='icon']";
	public static final String btn_AdminLoginPage_ACE_SearchMagnifier2 = "Search Magnifier TextBox#cssSelector=div[part='image']";

	// ACEPatient

	public static final String lbl_ACEPatientPage_Host_PatientAlertsandQueries = "Alerts and queries in Patient page#cssSelector=ptcs-label[id*='ptcslabel-50']";
	public static final String lbl_ACEPatientPage_Host_PatientUpcomingAppointments = "Upcoming appointments Patient list in Patient page#cssSelector=ptcs-label[id*='ptcslabel-51']";
	public static final String lbl_ACEPatientPage_Host_NewPatient = "New Patients list in Patient page#cssSelector=ptcs-label[id*='ptcslabel-66']";

	// ACEDiagnostics

	public static final String lbl_ACEPatientPage_Host_Diagnostics = "Diagnostics header in Diagnostics page#cssSelector=ptcs-label[id*='ptcslabel-7']";
	public static final String lbl_ACEPatientPage_Host_LabTestOrderPlaced = "lab test Order placed in Diagnostics page#cssSelector=ptcs-label[id*='ptcslabel-52']";

	// ACESettings

	public static final String lbl_AdminLoginPage_Host_ACESettingsHeader = "Settings Header#cssSelector=ptcs-label[id*='ptcslabel-102']";

	// AddDoctor

	public static final String btn_AdminLoginPage_AddNewDoctor = "AddnEW Doctor Button#xpath=//ptcs-button[@aria-label='+ Add New Doctor']";
	public static final String btn_AddNewDoctor_Next = "Next Doctor Button#xpath=//ptcs-button[@aria-label='Next']";
	public static final String btn_AddNewDoctor_Submit = "Submit Button#xpath=//ptcs-button[@aria-label='Submit']";

	// BasicDetails

	public static final String txt_AddDoctorPage_Host_DoctorFirstName = "FirstName Shadow#cssSelector=ptcs-textfield[label='First name*']";
	public static final String txt_AddDoctorPage_FirstName = "First name and mobilenumber value #cssSelector=input[aria-label='First name*']";

	public static final String txt_AddDoctorPage_Host_DoctorLastName = "LastName Shadow root helpers#cssSelector=ptcs-textfield[label='Last Name*']";
	public static final String txt_AddDoctorPage_LastName = "Last name  value #cssSelector=input[aria-label='Last Name*']";

	public static final String drp_AddDoctorPage_Host_NameArrow = "Arrow in Patient Dropdown#cssSelector=ptcs-dropdown[id*='root_pagemashupcontainer-8_mashupcontainer-47_ptcsdropdown-120";
	public static final String drp_AddDoctorPage_Host1_Name_Mrs = "Added in Patient Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-120-external-wc']";
	public static final String drp_AddDoctorPage_Host2_Name_Mrs = "Added in Patient Dropdown#cssSelector=ptcs-list-item[aria-label='Dr.'] ptcs-label[variant='list-item']";

	public static final String drp_AddDoctorPage_Host_GenderArrow = "Arrow in Gender Dropdown#cssSelector=ptcs-dropdown[id='root_pagemashupcontainer-8_mashupcontainer-47_ptcsdropdown-41";
	public static final String drp_AddDoctorPage_Host1_GenderMale = "GenderMale Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-41-external-wc']";
	public static final String drp_AddDoctorPage_Host2_GenderMale = "Gender Male Dropdown#cssSelector=ptcs-list-item[aria-label='Male'] ptcs-label[variant='list-item']";

	public static final String txt_AddDoctorPage_Host_PrimaryMobileNumber = "primary MobileNumber Shadow root helpers#cssSelector=ptcs-textfield[label='Primary Mobile Number*']";
	public static final String txt_AddDoctorPage_PrimaryMobileNumber = "Primary mobilenumber value#cssSelector=input[aria-label='Primary Mobile Number*']";

	public static final String txt_AddDoctorPage_Host_SecondaryMobileNumber = "Secondary MobileNumber Shadow root helpers#cssSelector=ptcs-textfield[label='Secondary Mobile Number']";
	public static final String txt_AddDoctorPage_SecondaryMobileNumber = "Secondary mobilenumber value#cssSelector=input[aria-label='Secondary Mobile Number']";

	public static final String txt_AddDoctorPage_Host_GmailId = "GmailId Shadow root helpers#cssSelector=ptcs-textfield[label='Email ID*']";
	public static final String txt_AddDoctorPage_GmailId = "GamilId value#cssSelector=input[aria-label='Email ID*']";

	public static final String btn_AddDoctorPage_Host_Save = "Save Button Shadow root helpers#xpath=//ptcs-button[contains(@aria-label,'Save')]";

	// Professional Details

	public static final String Img_AddNewDoctor_professionaldeatailsIcon = "Imgage Arrow in professional details Dropdown#xpath=//ptcs-button[@id='root_pagemashupcontainer-8_ptcsbutton-53']";

	public static final String drp_AddNewDoctor_Host_HighestQualArrow = "Arrow in Patient Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-101']";
	public static final String drp_AddNewDoctor_Host1_HighestQualBDS = "Added in Patient Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-101-external-wc']";
	public static final String drp_AddNewDoctor_Host2_HighestQualBDS = "Added in Patient Dropdown#cssSelector=ptcs-list-item[aria-label='BDS'] ptcs-label[variant='list-item']";

	public static final String drp_AddNewDoctor_Host_otherQualArrow = "Arrow in other Qulaification Patient Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-103']";
	public static final String drp_AddNewDoctor_Host1_otherQualBAMS = "BAMS Added in Patient Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-103-external-wc']";
	public static final String drp_AddNewDoctor_Host2_otherQualBAMS = "BAMS value other Qulaification Added in Patient Dropdown#cssSelector=ptcs-list-item[aria-label='BAMS'] ptcs-label[variant='list-item']";

	public static final String drp_AddNewDoctor_Host_specialityArrow = "Arrow in other Qulaification Patient Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-105']";
	public static final String drp_AddNewDoctor_Host1_specialityAcheSpeclity = "Ache speclity in Patient Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-105-external-wc']";
	public static final String drp_AddNewDoctor_Host2_specialityAcheSpeclity = "Ache value speciality Added in Patient Dropdown#cssSelector=ptcs-list-item[aria-label='Ache Specialist'] ptcs-label[variant='list-item']";

	public static final String txt_AddNewDoctor_Host_YearOfExperience = "Year in Experience#cssSelector=ptcs-textfield[label='Years of Experience*']";
	public static final String txt_AddNewDoctor_YearOfExperience = "Year in Experience#cssSelector=input[aria-label='Years of Experience*']";

	public static final String txt_AddNewDoctor_Host_RegistrationNumber = "RegistrationNumber in Experience#cssSelector=ptcs-textfield[label='Registration Number*']";
	public static final String txt_AddNewDoctor_RegistrationNumber = "RegistrationNumber in Experience#cssSelector=input[aria-label='Registration Number*']";

	public static final String drp_AddNewDoctor_Host_CounsilArrow = "Arrow in other Qulaification Patient Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-154']";
	public static final String drp_AddNewDoctor_Host1_CounsilAndhraMedicalCounsil = "counsile  in Patient Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-154-external-wc']";
	public static final String drp_AddNewDoctor_Host2_CounsilAndhraMedicalCounsil = "MedicalCounsil value Added in Patient Dropdown#cssSelector=ptcs-list-item[aria-label='Arunachal Pradesh Medical Council'] ptcs-label[variant='list-item']";

	// Add clinic

	public static final String btn_AddNewDoctor_Addclinic = "Add clicnic Button#xpath=//ptcs-button[@aria-label='ADD CLINIC']";

	public static final String txt_AddNewDoctor_Host_ClinicName = " clicnicName In clinic Details#cssSelector=ptcs-textfield[label='Clinic Name']";
	public static final String txt_AddNewDoctor_ClinicName = "clicnicName Value In clinic Details#cssSelector=input[aria-label='Clinic Name']";
	
	public static final String txt_AddNewDoctor_Host_ContactPersonName = " contactpersonName In clinic Details#cssSelector=ptcs-textfield[label='Contact Person Name']";
	public static final String txt_AddNewDoctor_ContactPersonName= "contactpersonNameValue  Value In clinic Details#cssSelector=input[aria-label='Contact Person Name']";

	public static final String txt_AddNewDoctor_Host_MobileNumber = " MobileNumber In clinic Details#cssSelector=ptcs-textfield[label='Mobile Number']";
	public static final String txt_AddNewDoctor_MobileNumber = "MobileNumber  Value In clinic Details#cssSelector=input[aria-label='Mobile Number']";

	//	public static final String txt_AddNewDoctor_Host_GmailId = " GmailId In clinic Details#cssSelector=ptcs-textfield[label='Email ID']";
    //	public static final String txt_AddNewDoctor_GmailId = "GmailIdValue  Value In clinic Details#cssSelector=input[aria-label='Email ID']";

	public static final String txt_AddNewDoctor_Host_AddressLine1 = " AddressLine1 In clinic Details#cssSelector=ptcs-textfield[label='Address Line 1']";
	public static final String txt_AddNewDoctor_AddressLine1 = " AddressLine1Value  In clinic Details#cssSelector=input[aria-label='Address Line 1']";
	
	public static final String txt_AddNewDoctor_Host_AddressLine2 = " AddressLine2  In clinic Details#cssSelector=ptcs-textfield[label='Address Line 2']";
	public static final String txt_AddNewDoctor_AddressLine2 = "AddressLine2Value  Value In clinic Details#cssSelector=input[aria-label='Address Line 2']";

	public static final String txt_AddNewDoctor_Host_Pincode = " Pincode In clinic Details#cssSelector=ptcs-textfield[label='Pincode']";
	public static final String txt_AddNewDoctor_Pincode = " PincodeValue  In clinic Details#cssSelector=input[aria-label='Pincode']";

	
	// Staff Details

	public static final String txt_AddDoctor_Host_StaffFirstName = "Staff First name label#cssSelector=ptcs-textfield[label='First name']";
	public static final String txt_AddDoctor_StaffFirstName = "Staff First Name Value#cssSelector=input[aria-label='First name']";

	public static final String txt_AddDoctor_Host_StaffLastName = "Staff Last name label#cssSelector=ptcs-textfield[label='Last Name']";
	public static final String txt_AddDoctor_StaffLastName = "Staff Last Name Value#cssSelector=input[aria-label='Last Name']";

	public static final String txt_AddDoctor_Host_StaffPrimaryMobileNumber = "Staff Primary Mobile Number label#cssSelector=ptcs-textfield[label='Primary Mobile Number']";
	public static final String txt_AddDoctor_StaffPrimaryMobileNumber = "Staff Primary Mobile Number Value#cssSelector=input[aria-label='Primary Mobile Number']";

	public static final String txt_AddDoctor_Host_StaffSecondaryMobileNumber = "Staff Secondary Mobile Number label#cssSelector=ptcs-textfield[label='Secondary Mobile Number']";
	public static final String txt_AddDoctor_StaffSecondaryMobileNumber = "Staff Secondary Mobile Number Value#cssSelector=input[aria-label='Secondary Mobile Number']";

	public static final String txt_AddDoctor_Host_StaffEmailID = "Staff EmailID label#cssSelector=ptcs-textfield[label='Email ID']";
	public static final String txt_AddDoctor_StaffEmailID = "Staff Email ID Value#cssSelector=input[aria-label='Email ID']";

	public static final String drp_AddDoctor_Host_GenderArrow = "Arrow in Gender Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-319']";
	public static final String drp_AddDoctor_Host1_GenderMale = "GenderMale Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-319-external-wc']";
	public static final String drp_AddDoctor_Host2_GenderMale = "Gender Male Dropdown#cssSelector=ptcs-list-item[aria-label='Male'] ptcs-label[variant='list-item']";

	public static final String drp_AddDoctor_RoleArrow = "Arrow in Role Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-333']";
	public static final String drp_AddDoctor_Host1_StaffTeamDoctor = "Role Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-333-external-wc']";
	public static final String drp_AddDoctor_Host2_StaffTeamDoctor = "Role Staff Team Doctor Dropdown#cssSelector=ptcs-list-item[aria-label='Staff Team Doctor'] ptcs-label[variant='list-item']";

	public static final String btn_AddDoctor_Host_AddStaff = "Add Staff Button#xpath=//ptcs-button[@aria-label='ADD STAFF']";

	// Consultation Slots

	public static final String btn_AddNewDoctor_Consultation_save = "Save Button Shadow root helpers#xpath=//ptcs-button[contains(@id,'root_pagemashupcontainer-8_mashupcontainer-61_ptcsbutton-54')]";
	public static final String btn_AddNewDoctor_AddSlot = "Addslot In AddnewDoctor Details#xpath=//ptcs-button[@aria-label='Add New Slot']";

	public static final String txt_AddNewDoctor_Host_RegularConsultationFee = "RegularConsultationFee In AddnewDoctor Details#cssSelector=ptcs-label[id='root_pagemashupcontainer-8_mashupcontainer-61_ptcslabel-50']";
	public static final String txt_AddNewDoctor_RegularConsultationFee = "RegularConsultationFee In AddnewDoctor Details#cssSelector=//ptcs-button[@aria-label='Add New Slot']";

	public static final String drp_AddNewDoctor_Host_DurationPerConsulation = "Arrow in DurationPerConsulation Doctor Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-15']";
	public static final String drp_AddNewDoctor_Host1_DurationPerConsulation = "DurationPerConsulation in Patient Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-15-external-wc']";
	public static final String drp_AddNewDoctor_Host2_DurationPerConsulation = "DurationPerConsulation value Added in Patient Dropdown#cssSelector=ptcs-list-item[aria-label='15'] ptcs-label[variant='list-item']";

	public static final String drp_AddNewDoctor_Host_ConsulationType = "Arrow in consulationType Doctor Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-28']";
	public static final String drp_AddNewDoctor_Host1_ConsulationType = "openTime  in consulationType Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-28-external-wc']";
	public static final String drp_AddNewDoctor_Host2_ConsulationType = "consulationType value Added in Patient Dropdown#cssSelector=ptcs-list-item[aria-label='Tele-Consultation'] ptcs-label[variant='list-item']";

	public static final String drp_AddNewDoctor_Host_Weekday = "Arrow in State Doctor Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-24']";
	public static final String drp_AddNewDoctor_Host1_Weekday = "Weekday  in State Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-24-external-wc']";
	public static final String drp_AddNewDoctor_Host2_Weekday = "Weekday value Added in Patient Dropdown#cssSelector=ptcs-list-item[aria-label='Sunday'] ptcs-label[variant='list-item']";

	public static final String drp_AddNewDoctor_Host_StartTime = "Arrow in StartTime Doctor Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-29']";
	public static final String drp_AddNewDoctor_Host1_StartTime = "StartTime in Dropdown Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-29-external-wc']";
	public static final String drp_AddNewDoctor_Host2_StartTime = "StartTime value Added in Dropdown#cssSelector=ptcs-list-item[aria-label='12:00 AM'] ptcs-label[variant='list-item']";

	public static final String drp_AddNewDoctor_Host_EndTime = "Arrow in EndTime Doctor Dropdown#cssSelector=ptcs-dropdown[id*='ptcsdropdown-30']";
	public static final String drp_AddNewDoctor_Host1_EndTime = "EndTime in Dropdown Dropdown#cssSelector=ptcs-list[id*='ptcsdropdown-30-external-wc']";
	public static final String drp_AddNewDoctor_Host2_EndTime = "EndTime value Added in Dropdown#cssSelector=ptcs-list-item[aria-label='12:15 AM'] ptcs-label[variant='list-item']";

	// Bank details

	public static final String lbl_LCDoctorPage_BankDetails = "Bank Details Label#cssSelector=ptcs-label[id='root_pagemashupcontainer-8_ptcslabel-45']";

	public static final String txt_AddNewDoctor_Host_AccountNumber = "Account Number Label in Bank Details#cssSelector=ptcs-textfield[label='Account Number']";
	public static final String txt_AddNewDoctor_AccountNumber = "Account Number Value in Bank Details#cssSelector=input[aria-label='Account Number']";

	public static final String txt_AddNewDoctor_Host_BeneficiaryName = "Beneficiary Details Label in Bank Details#cssSelector=ptcs-textfield[label='Beneficiary Name']";
	public static final String txt_AddNewDoctor_BeneficiaryName = "Beneficiary Details Value  in Bank Details#cssSelector=input[aria-label='Beneficiary Name']";

	public static final String txt_AddNewDoctor_Host_IFSCCode = "IFSC Code Label in Bank Details#cssSelector=ptcs-textfield[label='IFSC Code']";
	public static final String txt_AddNewDoctor_IFSCCode = "IFSC Code Value in Bank Details#cssSelector=input[aria-label='IFSC Code']";

	public static final String txt_AddNewDoctor_Host_BankName = "Bank Name Label in Bank Details#cssSelector=ptcs-textfield[label='Bank Name']";
	public static final String txt_AddNewDoctor_BankName = "Bank Name Value in Bank Details#cssSelector=input[aria-label='Bank Name']";

	public static final String txt_AddNewDoctor_Host_City = "City Label in Bank Details#cssSelector=ptcs-textfield[label='City']";
	public static final String txt_AddNewDoctor_City = "City Value in Bank Details#cssSelector=input[aria-label='City']";

	public static final String txt_AddNewDoctor_Host_Branch = "Branch Label in Bank Details#cssSelector=ptcs-textfield[label='Branch']";
	public static final String txt_AddNewDoctor_Branch = "Branch Value in Bank Details#cssSelector=input[aria-label='Branch']";

	public static final String btn_AddNewDoctor_BankDetails_Cancel = "Cancel Button in Bank Details#cssSelector=input[aria-label='Branch']";

}
