package objectRepository;

public class IOSObjectRepo 
{
	//Doctor Launch Page
	public static final String img_DoctorLaunchPage_Carousal = "Launch Page Carousel Image#xpath=//XCUIElementTypeOther[@name = 'introScreens']//XCUIElementTypeImage";
	public static final String lbl_DoctorLoginpage_carousel = "Launch Page Carousel Image Texts#xpath=//XCUIElementTypeOther[@name = 'introScreens']//XCUIElementTypeStaticText";
	public static final String lbl_DoctorLaunchPage_Title = "Launch Page Title#xpath=//XCUIElementTypeOther[@name = 'introSlide']//XCUIElementTypeImage/parent::*";
	public static final String txt_DoctorLoginPage_MobileNumber = "Launch Page Mobile Number TextBox#id=loginOption";
	public static final String btn_DoctorLoginPage_Email = "Login with Email#id=loginWithEmail";
	
	//Mobile Login Page
	public static final String txt_DoctorLoginPage_MobileNumber2 = "Mobile Login Page TextBox#id=mobileNumber";
	public static final String btn_DoctorLoginPage_GetOTP = "Mobile Login Page Get Otp Button#xpath=//XCUIElementTypeOther[@name='Get OTP']";
	public static final String btn_DoctorLoginPage_Continue = "Mobile Login Page Continue Button#id=Continue";

	//Doctor Email LoginPage
	public static final String txt_DoctorLoginPage_EmailValue = "Email Login Page Email TextBox#id=emailInput";
	public static final String txt_DoctorLoginPage_PasswordValue = "Email Login Page Password TextBox#id=password";
	public static final String btn_DoctorLoginPage_login = "Email Login Page Login Button#id=Login";
	public static final String lbl_DoctorLoginPage_InvalidLoginErrorMessage= "Email Login Page Invalid Login Error Message#xpath=//XCUIElementTypeOther[@name = 'Failed to proceed. Please enter valid email and password.']";
	public static final String img_DoctorLoginPage_SupportIcon = "Email Login Page Support Icon#xpath=//XCUIElementTypeOther[@name = 'emailVerification']/XCUIElementTypeOther[2]";//Need id
	public static final String lbl_DoctorLoginPage_ForgotPassword = "Email Login Page Forgot Password Button#id=forgotPassword";

	//Doctor Support Page
	public static final String lbl_DoctorSupportPage_Title = "Support Page Title#xpath=//XCUIElementTypeStaticText[@name = 'Support']";//Need id
	public static final String lbl_DoctorSupportPage_ChevronBack = "Support Page Chevron Back Button#xpath=//XCUIElementTypeStaticText[@name = 'Support']/preceding-sibling::XCUIElementTypeOther";//Need id

	//Doctor Forgot Password
	public static final String lbl_DoctorForgotPasswordPage_Title = "Forgot Password Page Title#id=backIcon";

	//CloseKeyboard
	public static final String btn_Done = "Keyboard Done Button#xpath=//XCUIElementTypeButton[@name = 'Done']";

	//Terms and Conditions :
	public static final String chk_DrTermsAndCondition_AcknowledgementCheckbox = "Terms And Conditions Acknowledgement checkbox#xpath=//XCUIElementTypeStaticText[contains(@name,'I hereby acknowledge')]/preceding-sibling::XCUIElementTypeOther";
	public static final String lnk_DrTermsAndCondition_continue = "Terms And Conditions Continue Button#id=Continue";

	//Footer
	public static final String FooterIcons_DoctorHome = "Dashboard Footer Home Button#xpath=//XCUIElementTypeButton[@name = 'Home, tab, 1 of 4']";
	public static final String FooterIcons_Appointment = "Dashboard Footer Appointments Button#xpath=//XCUIElementTypeButton[@name = 'Appointments, tab, 2 of 4']";
	public static final String FooterIcons_Patients = "Dashboard Footer Patients Button#xpath=//XCUIElementTypeButton[@name = 'Patients, tab, 3 of 4']";
	public static final String FooterIcons_More = "Dashboard Footer More Button#xpath=//XCUIElementTypeButton[@name = 'More, tab, 4 of 4']";

	//Dashboard Header
	public static final String btn_DoctorDashboard_notification = "Dashboard Page Notification Button#xpath=//XCUIElementTypeStaticText[contains(@name,'Hello')]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[2]";
	public static final String btn_Dashboard_Search = "Dashboard Page Search Button#xpath=//XCUIElementTypeStaticText[contains(@name,'Hello')]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther[1]";
	public static final String lbl_Dashboard_DoctorNameHeader = "Dashboard Page Doctor Name#xpath=//XCUIElementTypeStaticText[contains(@name,'Hello')]";
	public static final String lbl_Dashboard_PatientAlerts = "Dashboard Page Patient Alert#xpath=//XCUIElementTypeStaticText[contains(@name,'with alerts')]";

	public static final String lbl_Dashboard_critical = "Dashboard Page Critical Status#xpath=//XCUIElementTypeStaticText[@name='Critical']";
	public static final String lbl_Dashboard_moderate = "Dashboard Page Moderate Status#xpath=//XCUIElementTypeStaticText[@name='Moderate']";
	public static final String lbl_Dashboard_Normal = "Dashboard Page Normal Status#xpath=//XCUIElementTypeStaticText[@name='Normal']";
	public static final String val_Dashboard_critical = "Dashboard Page Critical Patient Count#xpath=//XCUIElementTypeStaticText[@name='Critical']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText";
	public static final String val_Dashboard_moderate = "Dashboard Page Moderate Patient Count#xpath=//XCUIElementTypeStaticText[@name='Moderate']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText";
	public static final String val_Dashboard_Normal = "Dashboard Page Normal Patient Count#xpath=//XCUIElementTypeStaticText[@name='Normal']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText";

	//Chat 
	public static final String lbl_Dashboard_ActiveChatPanel = "Dashboard Page Active Chat Panel#id=activeChat";
	public static final String lst_Dashboard_ActiveChatList = "Dashboard Page First Active Chat#xpath=//XCUIElementTypeOther[@name = 'activeChat']/XCUIElementTypeOther";
	public static final String lbl_Dashboard_ResolvedChatPanel = "Dashboard Page Resolved Chat Panel#xpath=//XCUIElementTypeOther[contains(@name , 'Resolved Chats')]/following-sibling::XCUIElementTypeOther";
	public static final String lbl_Dashboard_ResolvedChatList = "Dashboard Page First Resolved Chat#xpath=//XCUIElementTypeOther[contains(@name , 'Resolved Chats')]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther";
	public static final String lbl_Dashboard_ResolvedChatHeader = "Dashboard Page Resolved Chat=//XCUIElementTypeOther[contains(@name , 'Resolved Chats')]";

	public static final String lbl_Dashboard_ActiveChat_PatientName = "Active Chat Patient Name#xpath=//XCUIElementTypeOther[@name = 'backIcon']//XCUIElementTypeOther[contains(@name , '#')]/XCUIElementTypeStaticText";// Need
	public static final String lbl_Dashboard_ActiveChat_PatientId = "Active Chat Patient Id#xpath=//XCUIElementTypeOther[@name = 'backIcon']//XCUIElementTypeStaticText[contains(@name , '#')]";// Need
	public static final String lbl_Dashboard_ActiveChat_ProfilePicture = "Active Chat Patient Profile Image#xpath=//XCUIElementTypeOther[@name = 'backIcon']//XCUIElementTypeImage";
	public static final String lbl_Dashboard_ActiveChat_BackChevron = "Active Chat Back Chevron#xpath=//XCUIElementTypeOther[@name = '']"; // Need
	public static final String lbl_Dashboard_ActiveChat_Join = "Active Chat Join Button#xpath=//XCUIElementTypeOther[@x = '334' and @y = '71']";// Need

	public static final String lbl_Dashboard_ActiveChat_Chat = "Active Chat Page Chat Button#id=Chat";
	public static final String lbl_Dashboard_ActiveChat_Profile = "Active Chat Patient Profile Image#xpath=//XCUIElementTypeOther[@name = 'backIcon']//XCUIElementTypeImage";
	public static final String lbl_Dashboard_ActiveChat_RXSummary = "Active Chat Page Rx Summary#xpath=//XCUIElementTypeOther[@name = 'Rx Summary']";
	public static final String lbl_Dashboard_ActiveChat_History = "Active Chat Page History#id=History";
	public static final String lbl_Dashboard_ActiveChat_RequestType = "Active Chat Page Medicine Change Request#xpath=//XCUIElementTypeStaticText[@name = 'Symptom related']";
	public static final String lbl_Dashboard_ActiveChat_MarkAsResolved = "Active Chat Page Mark As Resolved#xpath=//XCUIElementTypeOther[@name = 'Mark as resolved']";

	//Chat Quick Response
	public static final String lbl_Dashboard_ActiveChat_QuickResponse = "Active Chat Page Quick Response#xpath=//android.widget.TextView[@name='Quick Response']/parent::*";// Need
	public static final String btn_Dashboard_ActiveChat_Send = "Active Chat Page Send Button#xpath=//android.view.ViewGroup[@content-desc='send']";// Need
	public static final String txt_Dashboard_ActiveChat_ChatTextBox = "Active Chat Page Text Box#xpath=//android.widget.EditText[contains(@content-desc,'Type your message here')]";// Need
	public static final String lst_Dashboard_ActiveChat_QuickResponses = "Active Chat Page Quick Response Messages#xpath=//*[@name='Quick Response']/parent::*/following-sibling::android.widget.ScrollView//android.widget.TextView";// Need	

	//Profile
	public static final String btn_More_profile = "More Option Page Profile Button#xpath=//XCUIElementTypeOther[@name = 'Profile ']";
	public static final String btn_More_profile_personalDetails = "Profile Page Personal Details#xpath=//XCUIElementTypeOther[@name='Personal Details ']";
	public static final String btn_More_profile_clinicDetails = "Profile Page Clinic Details#xpath=//XCUIElementTypeOther[@name='Clinic Details ']";
	public static final String btn_More_profile_professionalDetails = "Profile Page Professional Details#xpath=//XCUIElementTypeOther[@name='Professional Details ']";
	public static final String btn_More_profile_prescriptionMnanagement = "Profile Page Prescription Management#xpath=//XCUIElementTypeOther[@name='Prescription Management ']";
	public static final String btn_More_profile_MyDocument = "Profile Page My Document#xpath=//XCUIElementTypeOther[@name='My Documents ']";

	//Personal Details
	public static final String btnSupportIcons_More_profile_support = "Doctor Profile Page Support Icon#id=ellipseicon";
	public static final String lbl_More_profile_personalDetails_FirstName = "Personal Details First Name#xpath=//XCUIElementTypeOther[@name = 'pickImage']/parent::*/following-sibling::XCUIElementTypeOther[contains(@name , 'First Name')]";
	public static final String lbl_More_profile_personalDetails_LastNmae = "Personal Details Last Name#xpath=//XCUIElementTypeOther[@name = 'pickImage']/parent::*/following-sibling::XCUIElementTypeOther[contains(@name , 'Last Name')]";
	public static final String lbl_More_profile_personalDetails_Gender = "Personal Details Gender#xpath=//XCUIElementTypeOther[@name = 'pickImage']/parent::*/following-sibling::XCUIElementTypeOther[contains(@name , 'Gender')]";
	public static final String lbl_More_profile_personalDetails_primaryPhoneNumber = "Personal Details Primary Phone Number#xpath=//XCUIElementTypeOther[@name = 'pickImage']/parent::*/following-sibling::XCUIElementTypeOther[contains(@name , 'Primary Phone Number')]";
	public static final String lbl_More_profile_personalDetails_SecondaryPhoneNumber = "Personal Details Secondary Phone Number#xpath=//XCUIElementTypeOther[@name = 'pickImage']/parent::*/following-sibling::XCUIElementTypeOther[contains(@name , 'Secondary Phone Number')]";
	public static final String lbl_More_profile_personalDetails_EmailId = "Personal Details Email Id#xpath=//XCUIElementTypeOther[@name = 'pickImage']/parent::*/following-sibling::XCUIElementTypeOther[contains(@name , 'Email ID')]";
	public static final String txt_More_profile_personalDetails_display = "Personal Details Notes#xpath=//XCUIElementTypeOther[@name = 'pickImage']/parent::*/following-sibling::XCUIElementTypeOther[contains(@name , 'Lyfe representative')]";
	public static final String btn_DoctorPersonalDetails_BackButton = "Personal Details Back Button#id=";

	//Clinical Details
	public static final String lbl_More_ClinicDetails_clinicName = "Clinic Details Page Clinic Name#xpath=//XCUIElementTypeOther[@name = 'Bottomtext']/preceding-sibling::*/XCUIElementTypeOther[contains(@name,'Clinic Name')]";
	public static final String lbl_More_ClinicDetails_phoneNumber = "Clinic Details Page Phone Number#xpath=//XCUIElementTypeOther[@name = 'Bottomtext']/preceding-sibling::*/XCUIElementTypeOther[contains(@name,'Phone Number')]";
	public static final String lbl_More_ClinicDetails_Timing = "Clinic Details Page Timings#xpath=//XCUIElementTypeOther[@name = 'Bottomtext']/preceding-sibling::*/XCUIElementTypeOther[contains(@name,'Timings')]";
	public static final String lbl_More_ClinicDetails_Address = "Address in Clinic Detail Page#xpath=//XCUIElementTypeOther[@name = 'Bottomtext']/preceding-sibling::*/XCUIElementTypeOther[contains(@name,'Address')]";
	public static final String lbl_More_ClinicDetails_City = "city in Clinic Detail Page#xpath=//XCUIElementTypeOther[@name = 'Bottomtext']/preceding-sibling::*/XCUIElementTypeOther/XCUIElementTypeOther[contains(@name,'City')]";
	public static final String lbl_More_ClinicDetails_state = "State in Clinic Detail Page#xpath=//XCUIElementTypeOther[@name = 'Bottomtext']/preceding-sibling::*/XCUIElementTypeOther/XCUIElementTypeOther[contains(@name,'State')]";
	public static final String txt_More_ClinicDetails_Display = "Clinical Details Notes#xpath=//XCUIElementTypeOther[@name = 'Bottomtext']/XCUIElementTypeStaticText";
	public static final String btn_DoctorClinicDetails_BackButton = "Clinic Details Back Button#id=";

	//Professional Details
	public static final String lbl_More_professional_QualificationDetails = "HighestQualification in Professional Detail#xpath=//XCUIElementTypeStaticText[@name = 'Qualification Details']";
	public static final String lbl_More_professional_HighestQualification = "HighestQualification in Professional Detail#id=highestQualification";
	public static final String lbl_More_professional_OtherQualifiaction = "clinicName in Professional Detail#id=OtherQualification";
	public static final String lbl_More_professional_Specialaziation = "Specialaziation in Professional Detail#id=Specialization";
	public static final String lbl_More_professional_Experience = "Experience in Professional Detail#id=Experience";
	public static final String lbl_More_professional_RegistratinonNumber = "RegistratinonNumber in Professional Detail#id=RegistrationNo";
	public static final String lbl_More_professional_Council = "Council in Professional Detail#id=Council";
	public static final String txt_More_professional_Display = "Dispaly Message in Professional Detail#id=Bottomtext";
	public static final String btn_DoctorProfessionalDetails_BackButton = "Professional Details Back Button#id=";

	//Prescription Management
	public static final String lbl_More_prescriptionManagemant_AddressOnPrescription = "Prescription Management Address On Prescription#id=Address on Prescription";//statictext
	public static final String lbl_prescriptionManagemant_DigitalSignature = "Prescription Management Digital Signature#xpath=//XCUIElementTypeStaticText[@name = 'Digital Signature ']";//id removed Digital Signature Draw Signature
	public static final String btn_DoctorPrescriptionManagement_BackButton = "Prescription Management Back Button#id=";

	//My Documents
	public static final String lbl_More_MyDocuments = "My Documents Page Upload Document#xpath=//XCUIElementTypeStaticText[@name = 'Upload Document']";
	public static final String txt_MyDocuments = "My Documents File Size#xpath=//XCUIElementTypeStaticText[contains(@name,'File size')]";
	public static final String btn_DoctorMyDocuments_BackButton = "My Documents Page Back Button#id=";

	//Doctor App Patients Page
	public static final String lbl_PatientsPage_PatientsHeader = "Patients Page Title#xpath=//XCUIElementTypeStaticText[contains(@name,'Patients')]";
	public static final String btn_PatientsPage_searchIcon = "Patients Page Search Patient#xpath=//XCUIElementTypeStaticText[contains(@name,'Patients')]/parent::*/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther";
	public static final String val_PatientsPage_Search = "Role#xpath=//XCUIElementTypeTextField";//Need id
	public static final String lbl_PatientsPage_Patientlist = "Patients Page Patients List#xpath=//XCUIElementTypeScrollView//XCUIElementTypeStaticText/parent::*/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther";//Need id
	public static final String lbl_PatientsPage_NoPatients = "No Patients#xpath=//XCUIElementTypeStaticText[@name = 'No patients']";
	public static final String lbl_PatientsPage_BackButton = "Patients Page Back Button#xpath=//XCUIElementTypeStaticText[@name = '']";
	public static final String btn_PatientsPage_AddPatient = "Patients Page Add Patient#xpath=//XCUIElementTypeOther[@name = 'Add Patient']";
	public static final String btn_PatientsPage_AddPatient_FirstName = "Add Patient First Name#id=FirstName";
	public static final String btn_PatientsPage_AddPatient_LastName = "Add Patient Last Name#id=LastName";
	public static final String btn_PatientsPage_AddPatient_Genderlist = "Gender in Addpatient screen#id=selectGender";
	public static final String btn_PatientsPage_AddPatient_MobileNumber = "MobileNumber in Addpatient screen#id=mobileNumber";
	public static final String btn_PatientsPage_AddPatient_RegisterPatients = "RegisterPatients in Addpatient screen#xpath=//XCUIElementTypeOther[@name = 'Register Patient']";
	public static final String btn_PatientsPage_AddPatient_GenderMale = "Add Patient Select Male#xpath=//XCUIElementTypeOther[@label = 'Male']";

	//Doctor Appointments Page
	public static final String lbl_DoctorAppointmentsPage_Title ="Appointments Title#xpath=//XCUIElementTypeStaticText[@name = 'Appointments']";
	public static final String lbl_DoctorAppointmentsPage_MonthYear = "Appointments Page Month Year#xpath=//XCUIElementTypeOther[@x = '27' and @y = '103']";
	public static final String drp_DoctorAppointmentsPage_CalendarDrpdwn = "Appointments Page Calendar Dropdown#xpath=//XCUIElementTypeOther[@x = '27' and @y = '103']";
	public String lbl_DoctorAppointmentsPage_CalendarDate = "Appointments Page Calendar Page#xpath=//android.widget.TextView[@text = '<<DATE>>']";//Need to check
	public static final String btn_DoctorAppointmentsPage_AddEvent = "Appointments Page Add Event#xpath=//XCUIElementTypeOther[@name = 'Add Event']";

	//Doctor Event Page
	public static final String drp_DoctorAppointmentsPage_SelectEvent = "Select Event Dropdown#xpath=//XCUIElementTypeOther[@name = 'selectEvent']//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther";//Need id
	public static final String lst_DoctorAppointmentsPage_SelectEvent = "Select Event From List#xpath=//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther";
	public static final String btn_DoctorAppointmentsPage_EventCloseIcon = "Close Icon#id=closeIcon";

	//Away Time Doctor Event Page
	public static final String txt_DoctorAppointmentsPage_EventStartDate = "Start Date#xpath=//XCUIElementTypeOther[@name = 'Block Calendar']/preceding-sibling::XCUIElementTypeOther[contains(@name , 'Start Date')]";
	public static final String txt_DoctorAppointmentsPage_EventEndDate = "End Date#xpath=//XCUIElementTypeOther[@name = 'Block Calendar']/preceding-sibling::XCUIElementTypeOther[contains(@name , 'End Date')]";
	public static final String txt_DoctorAppointmentsPage_EventAddDesc = "Add Description#xpath=//XCUIElementTypeOther[@name = 'Block Calendar']/preceding-sibling::XCUIElementTypeOther[contains(@name , 'Add Description')]";
	public static final String btn_DoctorAppointmentsPage_EventBlockCalendar = "Block Calendar#xpath=//XCUIElementTypeOther[@name = 'Block Calendar']";

	//Appointment Doctor Event Page
	public static final String txt_DoctorAppointmentsPage_AppointmentEventAddDesc = "Add Description#xpath=//XCUIElementTypeOther[@name = 'Send Invite']/preceding-sibling::XCUIElementTypeOther[contains(@name , 'Add Description')]";
	public static final String txt_DoctorAppointmentsPage_AppointmentEventStartDate = "Start Date#xpath=//XCUIElementTypeOther[@name = 'Send Invite']/preceding-sibling::XCUIElementTypeOther[contains(@name , 'Start Date')]";
	public static final String txt_DoctorAppointmentsPage_AppointmentEventSelectPatient = "Select Patient#xpath=//XCUIElementTypeOther[@name = 'Send Invite']/preceding-sibling::XCUIElementTypeOther[contains(@name , 'Select Patient')]";
	public static final String txt_DoctorAppointmentsPage_AppointmentEventReminder = "Event Reminder#xpath=//XCUIElementTypeOther[@name = 'Send Invite']/preceding-sibling::XCUIElementTypeOther[contains(@name , 'Event Reminder')]";

	//Doctor DashBoard Page
	public static final String lst_Dashboard_ActiveChatPanel = "Active Chats List#xpath=//XCUIElementTypeOther[@name = 'activeChat']/XCUIElementTypeOther";

	//Doctor RX Summary Page
	public static final String lbl_DoctorRxSummaryPage_PatientDetails = "Patient Details#xpath=//XCUIElementTypeStaticText[@name = 'Patient Details']";
	public static final String lbl_DoctorRxSummaryPage_Gender = "Gender#xpath=//XCUIElementTypeStaticText[@name = 'Gender']";
	public static final String lbl_DoctorRxSummaryPage_Age = "Age#xpath=//XCUIElementTypeStaticText[@name = 'Age']";
	public static final String lbl_DoctorRxSummaryPage_Height = "Height#xpath=//XCUIElementTypeStaticText[@name = 'Height']";
	public static final String lbl_DoctorRxSummaryPage_Weight = "Weight#xpath=//XCUIElementTypeStaticText[@name = 'Weight']";
	public static final String txt_DoctorRxSummaryPage_ChiefComplaints = "Chief Complaints EditText#xpath=//XCUIElementTypeStaticText[@name = 'Chief Complaints']/following-sibling::XCUIElementTypeOther//XCUIElementTypeTextView";
	public static final String lbl_DoctorRxSummaryPage_ChiefComplaints = "Chief Complaints Character Limit#xpath=//XCUIElementTypeStaticText[@name = 'Chief Complaints']/following-sibling::XCUIElementTypeOther//XCUIElementTypeStaticText";
	
	public static final String btn_DoctorRxSummaryPage_ProvisionalDiagnosisAdd = "Provisional Diagnosis Add Button#xpath=//XCUIElementTypeStaticText[@name = 'Provisional Diagnosis *']/preceding-sibling::XCUIElementTypeOther";
	public static final String btn_DoctorRxSummaryPage_MedicineAdd = "Medicine Add Button#xpath=//XCUIElementTypeStaticText[@name = 'Medicine']/preceding-sibling::XCUIElementTypeOther";
	public static final String btn_DoctorRxSummaryPage_MedicineAdd_Back = "Add Medicine Back Button#xpath=//XCUIElementTypeOther[@name = '']";
	public static final String btn_DoctorRxSummaryPage_LabInvestigationAdd = "Lab Investigation Add Button#xpath=//XCUIElementTypeStaticText[@name = 'Lab Investigation']/preceding-sibling::XCUIElementTypeOther";
	public static final String btn_DoctorRxSummaryPage_FollowUpDateAdd = "Follow Up Date Add Button#xpath=//XCUIElementTypeStaticText[@name = 'Follow Up Date*']/preceding-sibling::XCUIElementTypeOther";

	public static final String txt_DoctorRxSummaryPage_GeneralAdvice = "General Advice EditText#xpath=//XCUIElementTypeStaticText[@name = 'General Advice']/following-sibling::*//XCUIElementTypeTextView";
	public static final String chk_DoctorRxSummaryPage_SelectCheckBox = "Accept Conditions Check Box#xpath=//XCUIElementTypeStaticText[@name = 'I agree to affix my signature and digitally send this prescription']/preceding-sibling::XCUIElementTypeOther";
	public static final String btn_DoctorRxSummaryPage_SendButton = "Send Button#xpath=//XCUIElementTypeOther[@name = 'Send']";

	//More Page in Doctor Application
	public static final String lbl_MorePage_Profile = "More Page Profile Button#xpath=//XCUIElementTypeOther[@name = 'Profile ']";
	public static final String lbl_MorePage_ManageStaff = "More Page Manage Staff Button#xpath=//XCUIElementTypeOther[@name = 'Manage Staff ']";
	public static final String lbl_MorePage_Settings = "More Page Settings Button#xpath=//XCUIElementTypeOther[@name = 'Settings ']";
	public static final String lbl_MorePage_Support = "More Page Support Button#xpath=//XCUIElementTypeOther[@name = 'Support ']";
	public static final String btn_More_Setting = "More Page Settings Button#xpath=//XCUIElementTypeOther[@name = 'Settings ']";

	public static final String lbl_MorePage_Feedback = "More Page Feedback Button#xpath=//XCUIElementTypeOther[@name ='Feedback']";
	public static final String lbl_MorePage_TermsandConditions = "More Page Terms and Conditions Button#xpath=//XCUIElementTypeOther[@name = 'Terms & Conditions']";
	public static final String lbl_MorePage_InviteMorePractioners = "More Page Invite Fellow Practitioners Button#xpath=//XCUIElementTypeOther[@name = 'Invite fellow practitioners']";

	//Terms and Conditions in More
	public static final String icn_MorePage_TermsAndConditions_iIcon = "Terms and Conditions Page I Button#xpath=//XCUIElementTypeOther[@name = 'Terms and Conditions']/XCUIElementTypeOther/XCUIElementTypeImage";
	public static final String btn_MorePage_TermsAndConditions_Close = "Terms and Conditions Page X Button#xpath=//XCUIElementTypeOther[@name = 'Terms and Conditions']/parent::*/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther";

	//Feedback in More page
	public static final String btn_MorePage_feedback_Helptext = "Feedback Page Text#xpath=//XCUIElementTypeStaticText[contains(@name,'Share your feedback')]";
	public static final String btn_MorePage_feedback_Support = "Feedback Page Support Icon#id=ellipseicon";
	public static final String btn_MorePage_feedback_BackChevron = "Feedback Page Back Chevron Button#xpath=//XCUIElementTypeOther[@name = 'backIcon']/XCUIElementTypeOther[contains(@name , 'Feedback')]/XCUIElementTypeOther";

	public static final String txt_MorePage_feedback_FeedbackTextBox = "Feedback Page Text Box#id=feedbacktext";
	public static final String btn_MorePage_feedback_FeedbackWordCount = "Feedback Page Word Count#xpath=//XCUIElementTypeTextView[@name = 'feedbacktext']/parent::*/following-sibling::XCUIElementTypeStaticText";

	//Doctor Support Page
	public static final String lbl_MorePage_SupportHeader = "Support Header in More Page#xpath=//XCUIElementTypeStaticText[@name = 'Support']";
	public static final String lst_MorePage_Support_Tickets = "Support Page List Of Tickets#xpath=//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[contains(@name , 'Ticket ID')]/XCUIElementTypeOther";
	public static final String lbl_MorePage_Support_TicketDetails = "Support Page Ticket Details#xpath=//XCUIElementTypeStaticText[@name = 'Ticket Detail']";
	public static final String lbl_MorePage_Support_TicketID = "Support Page Ticket ID#xpath=//XCUIElementTypeStaticText[@name = 'Ticket ID']";
	public static final String lbl_MorePage_Support_TicketNumber = "Support Page Ticket Number#xpath=//XCUIElementTypeStaticText[@name = 'Ticket ID']/following-sibling::XCUIElementTypeStaticText[contains(@name,'#')]";
	public static final String lbl_MorePage_Support_TicketGroup = "Support Page Ticket Type#xpath=//XCUIElementTypeStaticText[@name = '']/preceding-sibling::XCUIElementTypeStaticText";

	//Doctor Ticket Detail Page
	public static final String lbl_MorePage_Support_TicketTitle = "Support Page Ticket Title#xpath=//XCUIElementTypeStaticText[@name = '']/parent::*/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText";
	public static final String lbl_MorePage_Support_TicketDateandTime = "Support Page Ticket Date And Time#xpath=//XCUIElementTypeStaticText[@name = '']/parent::*/following-sibling::XCUIElementTypeOther[2]/XCUIElementTypeStaticText";
	public static final String lbl_MorePage_Support_TicketStatus = "Support Page Ticket Status#xpath=//XCUIElementTypeStaticText[@name = '']/parent::*/following-sibling::XCUIElementTypeOther[3]/XCUIElementTypeStaticText";
	public static final String btn_MorePage_Support_BackChevron = "Support Page Back Chevron Button#xpath=//XCUIElementTypeStaticText[@name = 'Ticket Detail']/preceding-sibling::XCUIElementTypeOther";

	//Doctor Support Page FAQ Section
	public static final String lbl_MorePage_Support_FAQ = "Support Screen FAQ Title#xpath=//XCUIElementTypeStaticText[contains(@name,'Frequently Asked Questions')]";
	public static final String lst_MorePage_Support_FAQ = "Support Screen FAQ Lists#xpath=//XCUIElementTypeStaticText[contains(@name,'Frequently Asked Questions')]/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther";
	public static final String btn_MorePage_Support_PatientPlan = "Support Screen Patient Plan#xpath=//XCUIElementTypeStaticText[@name = 'Frequently Asked Questions (FAQs)']/following-sibling::*/XCUIElementTypeOther[contains(@name , 'Patient plans')]";

	public static final String lst_MorePage_Support_FAQRightChevron = "List of FAQ  in Support Screen #xpath=";//Not Present in DoctorMorePage.java

	//Doctor Support Page --> Patient Plan FAQ Page
	public static final String lst_MorePage_FAQ_Header = "FAQ Page Header#xpath=//XCUIElementTypeNavigationBar[@name = 'Tags']";
	public static final String btn_MorePage_FAQ_MessageUs = "FAQ Page Message Button#xpath=//XCUIElementTypeStaticText[@name = 'Message Us']";
	public static final String btn_MorePage_FAQ_BackButton = "FAQ Page Close Button#xpath=//XCUIElementTypeButton[@name = 'Close']";
	public static final String btn_MorePage_FAQ_Search = "FAQ Page Search Button#xpath=//XCUIElementTypeNavigationBar[@name = 'Tags']/XCUIElementTypeButton";

	//Doctor Support Page Contact Us Section
	public static final String lbl_MorePage_Support_ContactUs = "Support Page Contact Us Title#xpath=//XCUIElementTypeStaticText[@name='Contact Us']";
	public static final String lbl_MorePage_Support_Category = "Category under Contact Us#xpath=//XCUIElementTypeStaticText[@name='Category']";
	public static final String drp_MorePage_Support_Category = "Drop down Category under Contact Us#xpath=//XCUIElementTypeStaticText[@name='Category']/following-sibling::XCUIElementTypeOther[contains(@name , 'Select Categories')]//XCUIElementTypeOther[@accessible = 'true']";
	public static final String lbl_MorePage_Support_Subcategory = "SubCategory under Contact Us #xpath=//XCUIElementTypeStaticText[@name='Sub Category']";
	public static final String drp_MorePage_Support_SubCategory = "Drop down Category under Contact Us#xpath=//XCUIElementTypeStaticText[@name='Sub Category']/following-sibling::XCUIElementTypeOther[contains(@name , 'Select Sub-Categories')]//XCUIElementTypeOther[@accessible = 'true']";
	public static final String lbl_MorePage_Support_Message = "Message under Contact Us#xpath=//XCUIElementTypeStaticText[@name ='Message']";
	public static final String txt_MorePage_Support_Message = "Message under Contact Us#xpath=//XCUIElementTypeOther[@name ='Type your message here']";
	public static final String txt_MorePage_Contact_MessageTextBox = "Contact  Message TextBoxtext box in Support page#xpath=//XCUIElementTypeTextView[@name ='Type your message here']";
	public static final String btn_MorePage_Contact_MessageWordCount = "Word Count in the Support page#xpath=//XCUIElementTypeTextView/parent::*/following-sibling::XCUIElementTypeStaticText";//Need id
	public static final String btn_MorePage_Support_Submit = "Support Page Submit Button#id=Submit";
	public static final String btn_MorePage_Support_Call = "Support Page Call Button#id=Call";
	public static final String lbl_MorePage_Support_TicketHistory = "Support Page Ticket History Title#xpath=//XCUIElementTypeStaticText[@name = 'Ticket History']";
	public String txt_Category_CategoryValue = "Category Value#xpath=//XCUIElementTypeOther[@name = '<<CATEGORY>>']";
	public String txt_Category_SubCategoryValue = "sub Category Value#xpath=//XCUIElementTypeOther[@name = '<<SUBCATEGORY>>']";

	//Doctor Settings Page
	public static final String btn_More_Setting_BankAccountDetails = "BankDetails in Setting screen#xpath=//XCUIElementTypeOther[@name = 'Bank Account Details ']/XCUIElementTypeOther";
	public static final String btn_More_Setting_ConsultationDetails = "consultationDetails in Setting screen#xpath=//XCUIElementTypeOther[@name = 'Consultation Details ']/XCUIElementTypeOther";
	public static final String btn_More_Setting_PasswordAndSecurity = "passwordAndSecurity in Setting screen#xpath=//XCUIElementTypeOther[@x = '0' and @y = '286']";
	public static final String btn_More_Setting_Notification = "Notification in Setting screen#xpath=//XCUIElementTypeOther[@name = 'Notifications ']/XCUIElementTypeOther";

	//Doctor Bank Account Details Page
	public static final String lbl_Settings_BankDetails_IFSC = "IFSC code Header name in BankPage#xpath=//XCUIElementTypeOther[@name = 'IFSC Code* IFSC Code* IFSC Code*']/XCUIElementTypeOther";
	public static final String lbl_Settings_BankDetails_BankName = "Bank name label in BankPage#xpath=//XCUIElementTypeOther[@name = 'Bank Name* Bank Name* Bank Name*']/XCUIElementTypeOther";
	public static final String lbl_Settings_BankDetails_BranchName = "Brach name label  in BankPage#xpath=//XCUIElementTypeOther[@name = 'Branch Name* Branch Name* Branch Name*']/XCUIElementTypeOther";
	public static final String lbl_Settings_BankDetails_CityName = "City name label  in BankPage#xpath=//XCUIElementTypeOther[@name = 'City Name City Name City Name']/XCUIElementTypeOther";
	public static final String lbl_Settings_BankDetails_AccountNumber = "Account Number label  in BankPage#xpath=//XCUIElementTypeOther[@name = 'Account Number Account Number Account Number']/XCUIElementTypeOther";
	public static final String lbl_Settings_BankDetails_BeneficiaryName = "Benificiary Label in BankPage#xpath=//XCUIElementTypeOther[@name = 'Beneficiary Name Beneficiary Name Beneficiary Name']/XCUIElementTypeOther";

	public static final String btn_More_BackChevron = "Back Button#id=";
	public static final String lbl_More_SupportIcon = "Settings Page Question Mark Button#id=ellipseicon";

	//Doctor Consultation Details page
	public static final String lbl_More_Setting_ConsultationDetails_consultationType = "ConsultationType in consultationDetails screen#xpath=//XCUIElementTypeOther[@name = 'Consultation Type Consultation Type Consultation Type']/XCUIElementTypeOther";
	public static final String lbl_More_Setting_ConsultationDetails_ConsultationFee = "ConsultationFee in consultationDetails screen#xpath=//XCUIElementTypeOther[@name = 'Consultation Fee ₹ Consultation Fee ₹ Consultation Fee ₹']/XCUIElementTypeOther";
	public static final String lbl_More_Setting_ConsultationDetails_SlotDuration = "Consultation Details Slot#xpath=//XCUIElementTypeOther[@name = 'Slot Duration Slot Duration Slot Duration 󰍝']/XCUIElementTypeOther/XCUIElementTypeOther";
	public static final String lbl_More_Setting_ConsultationDetails_ADD = "Consultation Details Add Button#xpath=//XCUIElementTypeOther[@name='+ Add']";
	public static final String lbl_More_Setting_ConsultationDetails_Save = "Consultation Details Save Button#id=Save";

	//Doctor Password & Security Page
	public static final String lbl_More_Setting_PasswordAndSecurity_ChangePassword = "ChangePassword inpasswordAndSecurity screen#xpath=//XCUIElementTypeStaticText[@name = 'Change Password']";
	public static final String val_More_Setting_PasswordAndSecurity_CurrentPassword = "Current Password inpasswordAndSecurity screen#xpath=//XCUIElementTypeOther[@name = 'Current Password Current Password Current Password']";
	public static final String val_More_Setting_PasswordAndSecurity_NewPassword = "NewPassword in passwordAndSecurity screen#xpath=//XCUIElementTypeOther[@name = 'New Password New Password New Password']";
	public static final String val_More_Setting_PasswordAndSecurity_ConfirmNewPassword = "ConfirmNewPassword in passwordAndSecurity screen#xpath=//XCUIElementTypeOther[@name = 'Confirm New Password Confirm New Password Confirm New Password']";
	public static final String btn_More_Setting_PasswordAndSecurity_UpdatePassword = "Update Password in passwordAndSecurity screen#xpath=//XCUIElementTypeOther[@name = 'Update Password']";

	//Doctor Notifications Page
	public static final String lbl_More_Setting_Notification_Schedule = "Notification Screen Schedule Button#xpath=//XCUIElementTypeStaticText[@name = 'Schedule']/following-sibling::XCUIElementTypeSwitch";
	public static final String lbl_More_Setting_Notification_AlertAndChart = "Notification Screen Alerts and Chats Button#xpath=//XCUIElementTypeStaticText[@name = 'Alerts and Chats']/following-sibling::XCUIElementTypeSwitch";
	public static final String lbl_More_Setting_Notification_GeneralNotification = "Notification Screen General Notifications Button#xpath=//XCUIElementTypeStaticText[@name = 'General Notifications']/following-sibling::XCUIElementTypeSwitch";

	//Doctor Invite Fellow Practitioners
	public static final String lbl_MorePage_InviteFellowPractioners_OnBoarding = "Onboarding Page Onboard Doctor#xpath=//XCUIElementTypeStaticText[@name = 'Onboard Doctor']";
	public static final String btn_MorePage_InviteFellowPractioners_Invite = "Onboarding Page Invite Button#id=Invite";
	public static final String txt_MorePage_InviteFellowPractioners_FirstName = "Onboarding Page First Name#xpath=//XCUIElementTypeOther[@name = 'FirstName']/XCUIElementTypeOther";
	public static final String txt_MorePage_InviteFellowPractioners_LastName = "Onboarding Page Last Name#xpath=//XCUIElementTypeOther[@name = 'LastName']/XCUIElementTypeOther";
	public static final String txt_MorePage_InviteFellowPractioners_EmailID = "Onboarding Page Email Id#xpath=//XCUIElementTypeOther[@name = 'emailInput']/XCUIElementTypeOther";
	public static final String txt_MorePage_InviteFellowPractioners_MobileNumber = "Onboarding Page Mobile Number#xpath=//XCUIElementTypeOther[@name = 'mobileNumber']/XCUIElementTypeOther";

	//Doctor Manage Staff Page
	public static final String lbl_MorePage_ManageStaff_MyStaff = "My Staff Page Title#xpath=//XCUIElementTypeStaticText[@name = 'My Staff']";
	public static final String btn_MorePage_ManageStaff_AddStaff = "My Staff Page Add Staff#xpath=//XCUIElementTypeOther[@name = 'Add Staff']";

	// Notifications
	public static final String lbl_Notification_Pageheader = "Notifications Page Title#xpath=//XCUIElementTypeStaticText[@name='Notifications']";
	public static final String btn_Notification_VerticalEllipses = "Notifications Page Vertical Ellipse#xpath=//XCUIElementTypeStaticText[@name='Notifications']/parent::*/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther";
	public static final String btn_Notification_MarkAllasRead = "Notifications Page Mark All Read Button#xpath=//XCUIElementTypeOther[@name = 'Mark all as Read']";
	public static final String btn_Notification_NotificationSetting = "Notifications Page Notification Settings Button#xpath=//XCUIElementTypeOther[@name = 'Notification Settings']";
	public static final String btn_Notification_All = "Notifications Page All Button#xpath=//XCUIElementTypeOther[@name = 'Schedule']/preceding-sibling::XCUIElementTypeOther[contains(@name , 'All')]";
	public static final String btn_Notification_Schedule = "Notifications Page Schedule Button#id=Schedule";
	public static final String btn_Notification_Chat = "Notifications Page Chats Button#id=Chats";
	public static final String btn_Notification_Other = "Notifications Page Other Button#id=Other";
	public static final String img_Notification_Chat = "Notifications Chats Section List Of Chats#xpath=//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther";

	//LogOut
	public static final String btn_Dashboard_Logout = "Logout Button in More Page#id=Logout";
	public static final String lbl_Dashboard_ConfirmationMessage = "Logout Confirmation text#xpath=//XCUIElementTypeStaticText[@name='Are you sure you want to Log Out?']";
	public static final String btn_Dashboard_LogoutYES = "Logout YES Button#id=Yes";
	public static final String btn_Dashboard_LogoutNO = "Logout NO Button#id=No";
	
	//Doctor Patients Tab >> Profile Screen
	public static final String lbl_PatientsPage_PatientName = "Patient Name#xpath=//XCUIElementTypeImage/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeStaticText";
	public static final String lbl_PatientsPage_Age = "Patient Age#xpath=//XCUIElementTypeStaticText[@name = 'Age']/following-sibling::XCUIElementTypeStaticText";
	public static final String lbl_PatientsPage_Height = "Patient Height#xpath=//XCUIElementTypeStaticText[@name = 'Height']/following-sibling::XCUIElementTypeStaticText";
	public static final String lbl_PatientsPage_Weight = "Patient Weight#xpath=//XCUIElementTypeStaticText[@name = 'Weight']/following-sibling::XCUIElementTypeStaticText";
	public static final String lbl_PatientsPage_Caregiver = "Patient Care Giver#xpath=//XCUIElementTypeStaticText[@name = 'Caregiver']/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText";
	public static final String lbl_PatientsPage_DX = "Patient DX#xpath=//XCUIElementTypeStaticText[@name = 'Dx']/following-sibling::XCUIElementTypeStaticText";
	public static final String lbl_PatientsPage_SX = "Patient SX#xpath=//XCUIElementTypeStaticText[@name = 'Sx']/following-sibling::XCUIElementTypeStaticText";
	public static final String lbl_PatientsPage_KCO = "Patient KCO#xpath=//XCUIElementTypeStaticText[@name = 'K/C/O']/following-sibling::XCUIElementTypeStaticText";
	public static final String lbl_PatientsPage_LVEF = "Patient LVEF#xpath=//XCUIElementTypeStaticText[@name = 'LVEF']/following-sibling::XCUIElementTypeStaticText";
	public static final String btn_PatientsPage_BackButton = "Patients Profile Back Button#xpath=//XCUIElementTypeOther[@name = '']";
	
	//Doctor Patients Tab >> Profile Screen
	public static final String lbl_PatientsPage_Vitals = "Patient Vitals#id=Vitals ";
	public static final String lbl_PatientsPage_Medications = "Patient Medications#id=Medications ";
	public static final String lbl_PatientsPage_Prescriptions = "Patient Prescriptions#id=Prescriptions ";
	public static final String lbl_PatientsPage_LastLabReports = "Patient Last Lab Reports#id=Last lab reports ";
	public static final String lbl_PatientsPage_Coach = "Patient Coach#id=Coach ";
	public static final String lbl_PatientsPage_AdherenceAlerts = "Patient Adherence Alerts#id=Adherence alerts ";
	
	public static final String lbl_PatientsPage_VitalsBP = "Patient BP#xpath=//XCUIElementTypeStaticText[@name = 'Blood Pressure']";
	public static final String lbl_PatientsPage_VitalsHR = "Patient HR#xpath=//XCUIElementTypeStaticText[@name = 'Heart Rate']";
	public static final String lbl_PatientsPage_VitalsBMI = "Patient BMI#xpath=//XCUIElementTypeStaticText[@name = 'BMI']";
	public static final String lbl_PatientsPage_VitalsWeight = "Patient Weight#xpath=//XCUIElementTypeStaticText[@name = 'Weight']";
	public static final String lbl_PatientsPage_VitalsHeight = "Patient Height#xpath=//XCUIElementTypeStaticText[@name = 'Height']";//Check
	
	//Doctor Patients Tab >> History Screen
	public static final String lbl_PatientHistoryPage_ChatHistory = "Chat History#id=Chat History";
	public static final String lbl_PatientHistoryPage_AppointmentHistory = "Appointment History#id=Appointment History";
	
	//Doctor More Options >> Manage Staff >> Add Staff Screen
	public static final String lbl_DoctorMorePage_AddStaff_UploadYourPhoto = "Upload Your Photo#xpath=//XCUIElementTypeStaticText[@name = 'Upload Your Photo']";
	public static final String lbl_DoctorMorePage_AddStaff_FirstName = "First Name#xpath=//XCUIElementTypeOther[@name = 'fisrtName']/XCUIElementTypeOther";
	public static final String lbl_DoctorMorePage_AddStaff_LastName = "Last Name#xpath=//XCUIElementTypeOther[@name = 'lastName']/XCUIElementTypeOther";
	public static final String lbl_DoctorMorePage_AddStaff_ClinicName = "Clinic Name#xpath=//XCUIElementTypeOther[@name = 'clinicName']/XCUIElementTypeOther";
	public static final String lbl_DoctorMorePage_AddStaff_Role = "Role#xpath=//XCUIElementTypeOther[@x = '22' and @y = '472']/XCUIElementTypeOther/XCUIElementTypeOther";//Need id
	public static final String lbl_DoctorMorePage_AddStaff_RoleReceptionist = "Receptionist Role#id=Receptionist";
	public static final String lbl_DoctorMorePage_AddStaff_RegistrationNumber = "Registration Number#xpath=//XCUIElementTypeOther[@name = 'registrationName']/XCUIElementTypeOther";
	public static final String lbl_DoctorMorePage_AddStaff_MobileNumber = "Mobile Number#xpath=//XCUIElementTypeOther[@name = 'mobileNumber']/XCUIElementTypeOther";
	public static final String lbl_DoctorMorePage_AddStaff_EmailInput = "Email Input#xpath=//XCUIElementTypeOther[@name = 'emailInput']/XCUIElementTypeOther";
	public static final String lbl_DoctorMorePage_AddStaff_Next = "Next Button#id=Next";
	public static final String lbl_DoctorMorePage_AddStaff_Scheduling = "Scheduling#id=Scheduling";
	public static final String lbl_DoctorMorePage_AddStaff_PatientManagement = "Patient Management#id=Patient Management";
	public static final String lbl_DoctorMorePage_AddStaff_Save = "Save Button#id=Save";
	public static final String lbl_DoctorMorePage_AddStaff_Back = "Back Button#id=Back";
	public String lbl_DoctorMorePage_MyStaff_Ellipse = "Required Staff Ellipse Button#xpath=//XCUIElementTypeStaticText[@name = '<<STAFFNAME>>']/parent::*/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther";
	public static final String lbl_DoctorMorePage_MyStaff_EllipseEdit = "Added Staff Edit Button#xpath=//XCUIElementTypeOther[@name = 'Edit']";
	public static final String lbl_DoctorMorePage_MyStaff_EllipsePermissions = "Added Staff View Permissions Button#xpath=//XCUIElementTypeOther[@name = 'Permissions']";
	public static final String lbl_DoctorMorePage_MyStaff_EllipseDelete = "Added Staff Delete Button#xpath=//XCUIElementTypeOther[@name = 'Delete']";
	public static final String lbl_DoctorMorePage_MyStaff_CancelButton = "Confirm Added Staff Cancel Button#xpath=//XCUIElementTypeOther[@name = 'Cancel']";
	public static final String lbl_DoctorMorePage_MyStaff_DeleteButton = "Confirm Added Staff Delete Button#xpath=//XCUIElementTypeOther[@name = 'Delete']";
	
	//Validation Banner
	public static final String lbl_DoctorMorePage_AddStaff_SuccessBanner = "Add Staff Success Banner#xpath=//XCUIElementTypeOther[@name = 'Success Successfully added new staff.']/XCUIElementTypeOther";
}







