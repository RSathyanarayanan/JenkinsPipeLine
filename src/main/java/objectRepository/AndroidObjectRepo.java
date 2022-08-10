package objectRepository;

import baseClass.BaseClass;

public class AndroidObjectRepo {

	// Patient_launchPage
	public static final String img_LaunchPage_Carousal = "Launch Page Carousel Image#xpath=//android.widget.ImageView";
	public static final String btn_LaunchPage_Skip = "Skip Button#xpath=//android.widget.TextView[@text = 'Skip']/parent::*";

	// Patient_Login Page//
	public static final String img_loginpage_carouselImg = "Carousel image Texts#xpath=//android.widget.HorizontalScrollView//android.widget.TextView";
	public static final String btn_loginpage_EMailButton = "login Using Mail Link in launch Page#xpath=//android.widget.TextView[@text='OR Login with E-mail']";
	public static final String btn_loginpage_EMailButtonMobile = "login Using Mail Link in Mobile Login Page#xpath=//android.view.ViewGroup[@resource-id='loginWithEmail']";

	public static final String txt_loginpage_EmailValue = "Email TextBox in Login page#xpath=//android.widget.EditText[@text='Enter Email Here']";
	public static final String txt_loginpage_PasswordValue = "Password TextBox in Login page#xpath=//android.widget.EditText[@text='Enter Password here']";
	public static final String btn_loginpage_login = "Login Button in login Page#xpath=//android.view.ViewGroup[contains(@resource-id,'verifyButton')]";

	public static final String Alert_HeaderText = "Alert header text#xpath=//android.widget.TextView[@resource-id='android:id/alertTitle']";
	public static final String Alert_OkButton = "Alert Ok button#xpath=//android.widget.Button[@resource-id='android:id/button1']";

	public static final String txt_loginpage_MobileNumber1 = "MobileNumber text box launch Page#xpath=//android.widget.TextView[@text='Enter Mobile Number']";
	public static final String txt_loginpage_MobileNumber2 = "MobileNumber text box login Page#xpath=//android.widget.EditText[@text='Enter Mobile No']";
	public static final String btn_loginpage_GetOtp = "GetOTp in login Page#xpath=//android.view.ViewGroup[@resource-id='getOtp']";
	public static final String txt_loginPage_EnterOtpTextArea = "Enter OTP Text field in login Page#xpath=//android.widget.TextView[@text='Enter OTP']/following::android.widget.EditText";
	public static final String btn_loginpage_Continue = "Continue button in login Page#xpath=//android.widget.TextView[@text='Continue']";

	public static final String txt_loginpage_MobileNumber_Errormessage = "Login using invalid mobile number#xpath=//android.widget.TextView[@text='Invalid phone number']";
	public static final String txt_loginpage_MobileNumber_Alert2 = "Login using invalid mobile number#id=android:id/alertTitle";// Change
	// locator

	// Patient_logout
	public static final String btn_DashboardPage_Hamburgermenu = "Hamburgermenu in Dashboardpage#xpath=//android.view.ViewGroup[@resource-id = 'Menu']";
	public static final String btn_Hamburgermenu_settings = "setting option in Hamburgermenu#xpath=//android.widget.TextView[@text='Settings']";
	public static final String btn_Hamburgermenu_settings_logout = "setting in logout option Hamburgermenu#xpath=//*[@text='Logout']/parent::*/parent::android.view.ViewGroup";
	public static final String msg_SettingsPage_logout_LogoutUserConfirmation = "Confirmation message during Logout#xpath=//android.widget.TextView[@resource-id='android:id/message']";
	public static final String btn_SettingsPage_No = "No button during Logout #xpath=//android.widget.Button[@resource-id='android:id/button2']";
	public static final String btn_SettingsPage_Proceed = "Proceed Button during Logout#xpath=//android.widget.Button[@resource-id='android:id/button1']";

	// Patient_footer
	public static final String FooterIcons_Home = "Dashboard Home Icon in Footer#xpath=//android.widget.TextView[@text = 'Home']/parent::*";
	public static final String FooterIcons_Tasks = "Tasks Icon in Footer#xpath=//*[@resource-id='menuOption']/parent::*//following::android.widget.TextView[@text='Tasks']/parent::*";
	public static final String FooterIcons_Heartbutton = "Heart Icon in Footer#xpath=//android.widget.TextView[@text = 'Vitals']/parent::*";
	public static final String FooterIcons_Consult = "Consult Icon in Footer#xpath=//android.widget.TextView[@text = 'Consult']/parent::*";
	public static final String FooterIcons_Order = "Order Icon in Footer#xpath=//android.widget.TextView[@text = 'Order']/parent::*";

	// Patient_DashboardPage //

	public static final String btn_DashboardPage_Emergency = "Emergency Button in Dashboardpage#xpath=//android.widget.TextView[@text='Blood Pressure']";// android.widget.TextView[@text='Emergency']
	public static final String lbl_DashboardPage_BloodPressure = "Blood Presure in Dashboard Page#xpath=//android.widget.TextView[@text='Blood Pressure']";
	public static final String lbl_DashboardPage_SPO2 = "SP02 in Dashboard Page#xpath=//android.widget.TextView[@text='SPO2']";
	public static final String lbl_DashboardPage_HeartRate = "Heartrate in Dashboard Page#xpath=//android.widget.TextView[@text='Heart Rate']";
	public static final String lbl_DashboardPage_BMI = "BMI in Dashboard Page#xpath=//android.widget.TextView[@text='BMI']";

	public static final String lbl_DashboardPage_RecordFirst = "Record your first Biovital Page#xpath=//*[@resource-id='biovitalsCard']//*[contains(@text,'Record your first')]";
	public static final String lbl_DashboardPage_AddRecordFirst = "Add your first Biovital Page#xpath=//*[contains(@text,'Record your first')]/parent::*//android.view.ViewGroup";

	public static final String btn_DashboardPage_DoYouHaveSymptoms = "predefined_symptoms#xpath=//android.widget.TextView[@text='Do you have any symptoms?']";
	public static final String btn_SymptomsPage_DifferentSymptoms = "I have different Symptom option#xpath=//android.view.ViewGroup[@resource-id='diffSystem']";
	public static final String txt_SymptomsPage_DifferentSymptomsTextArea = "Different Symptom Text Area#xpath=//android.widget.EditText[@text='Enter text here']";
	public static final String txt_SymptomsPage_DifferentSymptomsMic = "Different Symptom Mic#xpath=//android.widget.EditText[@text='Enter text here']";
	public static final String txt_SymptomsPage_DifferentSymptomsCamera = "Different Symptom Camera#xpath=//android.widget.EditText[@text='Enter text here']";

	// Patient_DashboardPage Vitals
	public static final String val_DashboardPage_BloodPressure = "Blood Presure in Dashboard Page#xpath=";
	public static final String val_DashboardPage_SPO2 = "SP02 in Dashboard Page#xpath=";
	public static final String val_DashboardPage_HeartRate = "Heartrate in Dashboard Page#xpath=";
	public static final String val_DashboardPage_BMI = "BMI in Dashboard Page#xpath=";

	// Patient_DashboardPage Symptoms
	public static final String lbl_DashboardPage_Symptoms = "Do you have any symptoms#xpath=//android.view.ViewGroup[@resource-id = 'symptoms']";

	// Patient_Symptoms Page
	public static final String lbl_SymptomsPage_HaveSymptoms = "Do you have any symptoms#xpath=//android.widget.TextView[@resource-id = 'todaySymptoms']";
	public static final String lbl_SymptomsPage_SympNameAndDesc = "Symptoms Name and Description#xpath=//android.view.ViewGroup[@resource-id = 'symptomsPage']/android.widget.TextView";
	public static final String lbl_SymptomsPage_SelectedSymptoms = "Symptoms Selected Tick Image#xpath=//android.view.ViewGroup[@resource-id = 'symptomsPage']/following-sibling::android.view.ViewGroup//android.widget.ImageView";

	public static final String lbl_SymptomsPage_ChestDiscomfort = "Symptom_checkbox#xpath=(//android.widget.TextView[@text='Chest Discomfort'])[1]";
	public static final String btn_SymptomsPage_Submit = "Symptom_checkbox#xpath=//android.widget.TextView[@text='Submit']/parent::*";
	public static final String btn_SymptomsPage_SucessMessage = "Sucess Alert Message#xpath=//android.widget.TextView[@resource-id='android:id/message']";

	// Vitals and reports

	public static final String lbl_ReportsPage_VitalsAndReports = "Header Vitals and Reports #xpath=//android.widget.TextView[@resource-id='vitalsAndReports']";
	public static final String tab_ReportsPage_VitalsTab = "Vitals Tab#xpath=//android.view.ViewGroup[@resource-id = 'tabs']//android.widget.TextView[@text='Vitals']/parent::android.widget.Button";
	public static final String tab_ReportsPage_ReportsTab = "Report Tab#xpath=//android.view.ViewGroup[@resource-id = 'tabs']//android.widget.TextView[@text='Reports']/parent::android.widget.Button";
	public static final String lbl_ReportsPage_UploadLabReportFileSizeAlert = "File upload size alert text #xpath=//android.view.ViewGroup[@resource-id='uploadLabReport']//android.widget.TextView[contains(@text,'File size')]";
	public static final String lbl_ReportsPage_UploadLabReportTile = "upload lab report tile #xpath=//android.view.ViewGroup[@resource-id='uploadLabReport']//android.widget.TextView[@text='Upload Lab Report']";
	public static final String lbl_ReportsPage_UploadedReports = "Uploaded Reports Count#xpath=//android.widget.TextView[contains(@text,'Uploaded Reports')]";

	// Reports

	public static final String lst_ReportsPage_UploadedReports = "Uploaded Reports List#xpath=//*[@resource-id='allreportscard']/android.view.ViewGroup/android.view.ViewGroup";
	public static final String txt_ReportsPage_UploadedReports = "All Texts under Uploaded Reports#xpath=//android.widget.TextView";
	public static final String lst_ReportsPage_ReportKebabMenu = "Kebab Menus of the list of Reports#xpath=//*[@resource-id='allreportscard']//android.widget.ImageView//parent::*";
	public static final String btn_ReportsPage_Download = "Download Button in Dashboard page#xpath=//*[@text='Download']";
	public static final String btn_ReportsPage_Delete = "Delete Button in Dashboard page#xpath=//*[@text='Delete']";

	// Vitals
	public static final String lbl_VitalsPage_ConnectYourDevices = "Connect Your Devices in VitalsandReports Page#xpath=//android.widget.TextView[@text='Connect your devices']";
	public static final String btn_VitalsPage_AddReading = "VitalsAddReading#xpath=(//android.widget.TextView[@text='+ Add Reading'])[1]";
	public static final String btn_VitalsPage_Entermanually = "BloodPressure_EnterManually#xpath=//android.widget.TextView[@text='Enter Manually']";
	public static final String btn_VitalsPage_BP_Scroll = "Horizontal Scroll#xpath=//android.widget.SeekBar";
	public static final String btn_VitalsPage_BP_AddedSuccessMessage = "BP Added Success Message#xpath=//android.widget.TextView";
	public static final String btn_VitalsPage_SystolicBp_Scroll = "Systolic Bp Seekbar#xpath=//android.widget.SeekBar[1]";
	public static final String btn_VitalsPage_DiastolicBp_Scroll = "Diastolic Bp Seekbar#xpath=//android.widget.SeekBar[2]";

	public static final String btn_VitalsPage_BP_Submit = "Submit Button in BloodPressure in Vitals Page#xpath=//android.widget.TextView[@text='Submit']";
	public static final String btn_VitalsPage_BP_Done = "Vitals Done Button#xpath=//android.widget.TextView[@text = 'Done']/parent::*";

	public static final String btn_VitalsPage_DiscardReading = "Vitals Done Button#xpath=//android.widget.TextView[@text = 'Discard Reading']/parent::*";
	public static final String btn_VitalsPage_Done = "Vitals Done Button#xpath=//android.widget.TextView[@text = 'Done']/parent::*";
	public static final String val_VitalsPage_BiovitalValue = "Value of the BioVitals#xpath=(//android.widget.TextView[@text = 'Discard Reading']/parent::*/preceding-sibling::android.widget.TextView )[1]";
	public static final String btn_VitalsPage_NOSymptomsExperienced = "No after clicking done in BioVitals#xpath=//android.widget.TextView[@text='No']/parent::*";

	public static final String lbl_VitalsPage_OxygenSaturation = "OS HeaderVitalsAddReading#xpath=//android.widget.TextView[contains(@text,'Oxygen Saturation')]";
	public static final String lbl_VitalsPage_BMI = "BMI HeadercVitalsAddReading#xpath=//android.widget.TextView[contains(@text,'Body Mass Index')]";
	public static final String lbl_VitalsPage_BloodGulcose = "Blood Gulcose Header VitalsAddReading#xpath=//android.widget.TextView[contains(@text,'Blood Glucose')]";
	public static final String lbl_VitalsPage_ECG = "ECG Header VitalsAddReading#xpath=//android.widget.TextView[contains(@text,'Electrocardiogram')]";
	public static final String btn_VitalsPage_AddBPReading = "VitalsAddReading#xpath=//android.view.ViewGroup[@resource-id='VitalsAddBtn1']";
	public static final String btn_VitalsPage_AddHeartReading = "VitalsAddReading#xpath=//android.view.ViewGroup[@resource-id='BloodPressure']";

	// Dashboard Page Moods
	public static final String btn_DashboardPage_Mood = "moods Button in Dashboardpage#xpath=//android.view.ViewGroup[@resource-id = 'mood']";

	// Moods Page

	public static final String lbl_MoodsPage_SelectBadMood = "Select Bad Mood#xpath=//android.view.ViewGroup[@resource-id = 'moodToday']/android.view.ViewGroup[1]/android.widget.ImageView/parent::*";// Need
	public static final String lbl_MoodsPage_SelectOkMood = "Select Ok Mood#xpath=//android.view.ViewGroup[@resource-id = 'moodToday']/android.view.ViewGroup[2]/android.widget.ImageView/parent::*";
	public static final String lbl_MoodsPage_SelectGreatMood = "Select Great Mood#xpath=//android.view.ViewGroup[@resource-id = 'moodToday']/android.view.ViewGroup[3]/android.widget.ImageView/parent::*";

	public static final String lbl_MoodsPage_BadMoodResponse = "Bad Mood Submit Response#xpath=//android.widget.TextView[@text = 'Thanks for sharing']";
	public static final String lbl_MoodsPage_OkMoodResponse = "Ok Mood Submit Response#xpath=//android.widget.TextView[@text = 'Thanks for letting us know']";
	public static final String lbl_MoodsPage_GreatMoodResponse = "Great Mood Submit Response#xpath=//android.widget.TextView[@text = ' Glad to hear that!']";

	public static final String val_MoodsPage_DescribeMood = "Describe Your Mood#xpath=//android.widget.EditText[@resource-id = 'descriptionText']";
	public static final String img_MoodsPage_RecordAudio = "Record Audio#xpath=//android.view.ViewGroup[@resource-id = 'mic']";
	public static final String lbl_MoodsPage_StopRecording = "Stop Recording#xpath=//android.widget.TextView[@text = '']/parent::*";
	public static final String lbl_MoodsPage_AudioMoreOptions = "Recorded Audio More Options#xpath=(//android.view.ViewGroup[@resource-id = 'play']//android.widget.ImageView)[2]";// Need

	public static final String lbl_MoodsPage_GladToHearThat = "Glad To Hear That#xpath=//android.widget.TextView[@text = ' Glad to hear that!']";
	public static final String lbl_MoodsPage_Done = "Moods Page Done Button#xpath=//android.widget.TextView[@text = 'Done']/parent::*";
	public static final String img_MoodsPage_FiveMoods = "Last 5 Moods#xpath=//android.view.ViewGroup[@resource-id = 'lastFiveMoods']//android.widget.ImageView";

	public static final String lbl_moodsPage_Bad = "Bad in moods page#xpath=//android.widget.TextView[@text='How is your mood today?']//following::android.widget.ImageView[1]";
	public static final String lbl_moodsPage_Ok = "Ok in moods page#xpath=//android.widget.TextView[@text='How is your mood today?']//following::android.widget.ImageView[2]";
	public static final String lbl_moodsPage_Great = "Great in moods page#xpath=//android.widget.TextView[@text='How is your mood today?']//following::android.widget.ImageView[3]";
	public static final String lbl_moodsPage_Submit = "Submit Mood#xpath=//android.view.ViewGroup[@resource-id = 'submitMoods']";// changed
	// locator
	public static final String lbl_moodsPage_yourmood = "how is your mood in moods page#xpath=//android.widget.TextView[@text='Things you can try']";

	// Hidden Locators(Environment Based PopUp's)
	public static final String lbl_MoodsPage_DeleteAudio = "Delete Recorded Audio#xpath=//*[@class = 'android.widget.TextView' and @text = 'Delete']/parent::*";
	public static final String lbl_MoodsPage_AttachOther = "Attach Other#xpath=//*[@class = 'android.widget.TextView' and @text = 'Attach other']/parent::*";

	// Tasks
	public static final String lbl_TasksPage_Title = "Tasks Title#xpath=//android.widget.TextView[@resource-id = 'vitalsAndReports']";
	public static final String lbl_TasksPage_TaskDate = "Tasks Progresive Date#xpath=//android.view.ViewGroup[@resource-id = 'progresive']";
	public static final String lbl_TasksPage_DateNext = "Tasks Next Date#xpath=//android.view.ViewGroup[@resource-id = 'nextbutton']";
	public static final String lbl_TasksPage_TaskPrevious = "Tasks Previous Date#xpath=(//android.view.ViewGroup[@resource-id='progresive']/android.view.ViewGroup)[1]";
	public static final String lbl_TasksPage_DisplayDay = "Today Current Date#xpath=(//*[@resource-id='tasktabs']/following-sibling::android.widget.TextView)[1]";

	public static final String lbl_TasksPage_TaskCategories = "Tasks Categories#xpath=//android.view.ViewGroup[@resource-id = 'tasktabs']//android.widget.TextView";
	public static final String img_TasksPage_ActiveAlertIcon = "Active Tasks Alert Icon#xpath=//android.widget.TextView[@text = 'Active']/parent::*/following-sibling::*/android.widget.ImageView";
	public static final String lbl_TasksPage_AllTasks = "All Tasks#xpath=//android.widget.ScrollView[@resource-id = 'allTasks']";
	public static final String val_TasksPage_TaskCount = "Task count #xpath=//android.widget.TextView[contains(@text,'Complete')]";

	// Settings

	public static final String lbl_SettingPage_Profile = "Profile label in the settings#xpath=//android.widget.TextView[@text='Profile']/parent::*";
	public static final String lbl_SettingPage_PasswordSecurity = "Password and Security in Settings#xpath=//android.widget.TextView[contains(@text,'Password & Security')]/parent::*";
	public static final String lbl_SettingPage_Contacts = "Contacts in Settings#xpath=//android.widget.TextView[@text='Contact Information']/parent::*";
	public static final String lbl_SettingPage_EmergencySettings = "EmergencySettings in Settings#xpath=//android.widget.TextView[contains(@text,'Emergency Settings')]/parent::*";
	public static final String lbl_SettingPage_MyDevices = "MyDevices in Settings#xpath=//android.widget.TextView[@text='My Devices']/parent::*";
	public static final String lbl_SettingPage_Notifications = "Notifications in Settings#xpath=//android.widget.TextView[@text='Notifications']/parent::*";
	public static final String lbl_SettingPage_AddressBook = " AddressBook in Settings#xpath=//android.widget.TextView[@text='Address Book']/parent::*";

	// Prescriptions

	public static final String lbl_Hamburger_Prescriptions = "Prescriptions#xpath=//android.widget.TextView[@text = 'Prescriptions']";
	public static final String lbl_Prescriptions_Title = "Prescriptions Title#xpath=//android.view.ViewGroup[@resource-id = 'HeaderName']";
	public static final String lbl_Prescriptions_Categories = "Prescriptions Categories#xpath=//android.view.ViewGroup[@resource-id = 'PrescriptionTab']//android.widget.TextView[@resource-id = 'Text']";

	public static final String lbl_Hamburger_Prescriptions_LatestPrescription = "LatestPrescription In  Prescriptions page#xpath=//android.widget.TextView[@text='Latest Prescription']";
	public static final String lbl_Hamburger_Prescriptions_UploadPrescription = "UploadPrescription In  Prescriptions page#xpath=//android.widget.TextView[@text='Upload Prescription']";
	public static final String lbl_Hamburger_Prescriptions_RequestMedicineChange = "RequestMedicineChange In  Prescriptions page#xpath=//android.widget.TextView[@text='Request Medicine Change']";
	public static final String lbl_Hamburger_Prescriptions_ManageNotication = "ManageNotication In  Prescriptions page#xpath=//android.widget.TextView[@text='Manage Notifications']";
	public static final String lbl_Hamburger_Prescriptions_HealthProfile = "HealthProfile In  Prescriptions page#xpath=//android.widget.TextView[@text='Health Profile']";

	// Latest Prescription
	public static final String lbl_LatestPrescription_TerminationDate = "Medicine Termination Date#xpath=//android.view.ViewGroup[@resource-id = 'PrescriptionTab']//android.widget.TextView[contains(@text,'Ends on')]";
	public static final String lbl_LatestPrescription_MedicineNameQuantityAndType = "Meidicine Name Quantity And Type#xpath=//android.view.ViewGroup[@resource-id = 'PrescriptionTab']//android.widget.TextView[contains(@text,'mg')]";
	public static final String lbl_LatestPrescription_Notes = "Latest Prescription Notes#xpath=//android.widget.TextView[@text = 'Notes']";
	public static final String lbl_LatestPrescriprion_NotesImage = "Latest Prescription Notes Image#xpath//android.widget.TextView[@text = 'Notes']/following-sibling::*/android.widget.ImageView";
	public static final String lbl_LatestPrescription_AdditionalInfo = "Additional Information#xpath=//android.widget.TextView[@text = 'Additional Information']";
	public static final String lbl_LatestPrescription_AdditionalInfoImage = "Additional Information Image#xpath=//android.widget.TextView[@text = 'Additional Information']/following-sibling::*/android.widget.ImageView";

	public static final String lbl_LatestPrescription_UseOfMedicine = "Use of the medicine#xpath=//android.widget.TextView[@text = 'Use of the medicine']";
	public static final String lbl_LatestPrescription_ToDoBeforeMedicine = "To do before medicine#xpath=//android.widget.TextView[@text = 'To do before medicines']";
	public static final String lbl_LatestPrescription_ToDoAfterMedicine = "To do after medicine#xpath=//android.widget.TextView[@text = 'To do after medicines']";
	public static final String lbl_LatestPrescription_SideEffects = "Side Effects of the medicine#xpath=//android.widget.TextView[@text = 'Side effects']";
	public static final String lbl_LatestPrescription_Allergies = "Allergies of the medicine#xpath=//android.widget.TextView[@text = 'Allergies']";
	public static final String lbl_LatestPrescription_WhatToAvoid = "What to avoid#xpath=//android.widget.TextView[@text = 'What to avoid']";

	// New
	public static final String lbl_LatestPrescription_Title = "Latest Prescription Title#xpath=//android.view.ViewGroup[@resource-id = 'HeaderName']/android.widget.TextView[@text = 'Latest Prescription']";

	public static final String lbl_LatestPrescription_ChevronBack = "Chevron Back Button#xpath=//android.widget.TextView[@text = '']/parent::*";
	public static final String lbl_LatestPrescription_KebabMenuEllipsis = "Kebab Menu Ellipsis Button#xpath=//android.view.ViewGroup[@resource-id='HeaderName']//android.widget.ImageView/parent::*";
	public static final String lbl_LatestPrescription_ReqMedicineChange = "Request Medicine Change#xpath=//*[contains(@text,'Request Medicine Change')]";
	public static final String lbl_LatestPrescription_DLoadasPDF = "Download as PDF#xpath=//*[contains(@text,'Download as PDF')]";

	public static final String lst_LatestPrescription_MedicineList = "Uploaded Medicine List#xpath=//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup";
	public static final String txt_LatestPrescription_MedicineDetails = "Medicines details#xpath=//android.widget.TextView";

	// Upload Prescription
	public static final String lbl_UploadPrescription_Title = "Upload Prescription Title#xpath=//android.view.ViewGroup[@resource-id = 'HeaderName']/android.widget.TextView[@text = 'Upload Prescription']";
	public static final String btn_UploadPrescription_Upload = "Upload button in Upload Prescription Title#xpath=//android.view.ViewGroup[@resource-id = 'HeaderName']/android.widget.TextView[@text = 'Upload Prescription']";
	public static final String txt_UploadPrescription_FilesizeHelptext = "File Size Help Text Upload Prescription Title#xpath=//android.view.ViewGroup[@resource-id = 'HeaderName']/android.widget.TextView[@text = 'Upload Prescription']";

	public static final String lst_UploadPrescription_PrescriptionList = "Uploaded Reports List#xpath=//android.view.ViewGroup[@resource-id='uploadLabReport']/following-sibling::android.view.ViewGroup";
	public static final String txt_UploadPrescription_PrescriptionDetails = "All Texts under Uploaded Reports#xpath=//android.widget.TextView";
	public static final String lbl_UploadPrescription_KebabMenuEllipsis = "Kebab Menu Ellipsis Button#xpath=(//android.widget.ImageView/parent::android.view.ViewGroup)[3]";
	public static final String lbl_UploadPrescription_View = "View Prescription #xpath=//*[contains(@text,'View')]";
	public static final String lbl_UploadPrescription_Download = "Download medicine#xpath=//*[contains(@text,'Upload')]";
	public static final String lbl_UploadPrescription_Delete = "Use of the medicine#xpath=//*[contains(@text,'Delete')]";

	// Medicine change request
	public static final String lbl_MedicineChangeReq_Title = "Medicine Change Request Title#xpath=//android.view.ViewGroup[@resource-id = 'HeaderName']/android.widget.TextView[@text = 'Medicine change request']";
	public static final String lbl_MedicineChangeReq_MedicineList = "List Of Medicines#xpath=//android.view.ViewGroup[@resource-id = 'MedicineName']/android.widget.TextView";
	public static final String lbl_MedicineChangeReq_ReasonDropdown = "Reason Dropdown#xpath=//android.view.ViewGroup[@resource-id = 'DropDownOption']";
	public String txt_MedicineChangeReq_ReasonValue = "Reason Value#xpath=//android.widget.TextView[@text = '<<REASON>>']";
	public String txt_MedicineChangeReq_Comments = "Comments#xpath=//android.widget.EditText[@resource-id = 'descriptionText']";
	public String btn_MedicineChangeReq_Submit = "Submit Button#xpath=//android.widget.TextView[@text = 'Submit']/parent::*";

	public String lbl_MedicineChangeReq_AddedMedicines = "Added Medicines#xpath=//android.widget.TextView[@resource-id = 'RequestChange']/following-sibling::android.view.ViewGroup/android.widget.TextView";

	// Active Chats & Appointments - My Consultations
	public static final String btn_PatientConsultPage_SupportIcon = "Question mark In My consulation Screen#xpath=//android.widget.TextView[@resource-id='vitalsAndReports']/following-sibling::*";
	public static final String lbl_PatientConsultPage_HealthTeamTitle = "My Consultation Health Team Title#xpath=//android.widget.TextView[@text='Health Team']";
	public static final String lbl_PatientConsultPage_HealthTeamDetails = "My Consultation Health Team Details#xpath=//android.widget.TextView[@text = 'Health Team']/following-sibling::*//android.widget.TextView";
	public static final String lbl_PatientConsultPage_Title = "My Consultations in consult Screen#xpath=//android.widget.TextView[@text='My Consultations']";
	public static final String lbl_PatientConsultPage_ActiveChatsAndAppointmentsTitle = "Active Chats & Appointments Title#xpath=//android.widget.TextView[@text='Active Chats & Appointments']";
	public static final String lst_PatientConsultPage_ActiveChatsAndAppointments = "Active Chats List#xpath=//android.widget.TextView[contains(@text,'ID')]";
	public static final String btn_PatientConsultPage_ActiveChatDoctorName = "Active Chat Screen Doctor Name#xpath=//android.widget.TextView[@text = 'Chat']/parent::*/following-sibling::android.widget.ImageView/following-sibling::android.widget.TextView";
	public static final String lbl_PatientConsultPage_ActiveChatScreenID = "Active Chat Screen Id#xpath=//android.widget.TextView[contains(@text , 'ID')]";
	public static final String btn_PatientConsultPage_ActiveChatScreenJoin = "Active Chat Screen Join Button#xpath=//android.widget.TextView[@text='Join Now']/parent::*";
	public static final String btn_PatientConsultPage_ChevronBack = "Chevron Back Button#xpath=//android.widget.TextView[@text = '']/parent::*";

	// Upcoming Appointment - My Consultations
	public static final String lbl_PatientConsultPage_UpcomingAppointmentHeader = "Upcoming Appointment Header#xpath=//android.view.ViewGroup[@resource-id = 'appointmentId']";

	// Upcoming Appointment --> Appointment Details
	public static final String lbl_PatientAppointmentDetailsPage_Title = "Appointment Details Title#xpath=//android.view.ViewGroup[@resource-id = 'Appointment ']/android.widget.TextView[@text = 'Appointment Details']";
	public static final String lbl_PatientAppointmentDetailsPage_AppointmentId = "Appointment Details Appointment Id#xpath=//android.view.ViewGroup[@resource-id = 'Appointment ']/following-sibling::android.widget.TextView[contains(@text , 'Appointment')]";
	public static final String lbl_PatientAppointmentDetailsPage_AppointmentType = "Appointment Type#xpath=//android.widget.TextView[@text='Online Appointment']";
	public static final String lbl_PatientAppointmentDetailsPage_AppointmentDateAndTime = "Appointment Details Date And Time#xpath=//android.widget.TextView[@text='Online Appointment']/following-sibling::android.widget.TextView";
	public static final String lbl_PatientAppointmentDetailsPage_ReasonForAppointment = "Reason for Appointment#xpath=//android.widget.TextView[@text = 'Reason for appointment']";
	public static final String lbl_PatientAppointmentDetailsPage_AppointmentWith = "Appoinment Assigned With Doctor#xpath=//android.widget.TextView[@text = 'Reason for appointment']/following-sibling::android.view.ViewGroup/android.widget.TextView";
	public static final String lbl_PatientAppointmentDetailsPage_InvoiceTitle = "Invoice#xpath=//android.widget.TextView[@text = 'Invoice']";
	public static final String lbl_PatientAppointmentDetailsPage_InvoiceId = "Invoice Id#xpath=//android.widget.TextView[@text = 'Invoice']/following-sibling::android.view.ViewGroup/android.widget.TextView";
	public static final String lbl_PatientAppointmentDetailsPage_ChevronBack = "Chevron Back Button#xpath=//android.widget.TextView[@text = '']/parent::*";
	public static final String btn_PatientAppointmentDetailsPage_ReSchedule = "Reschedule Button#xpath=//android.widget.TextView[@text='Reschedule']/parent::*";
	public static final String btn_PatientAppointmentDetailsPage_Cancel = "Cancel Appointment Button#xpath=//android.widget.TextView[@text='Cancel Appointment']/parent::*";
	public static final String btn_PatientAppointmentDetailsPage_Proceed = "Proceed Cancellation#id=android:id/button1";
	public static final String btn_PatientAppointmentDetailsPage_Okay = "Appointment Cancelled Okay Button#xpath=//android.widget.Button[@resource-id = 'android:id/button1' and @text = 'OKAY']";

	// Health Team --> Doctor Screenbtn_
	public static final String btn_PatientHealthTeamDoctorPage_BookAppointment = "Book Appointment#xpath=//android.view.ViewGroup[@resource-id = 'bookAppointment']";
	public String lbl_PatientHealthTeamDoctorPage_QueryCategory = "What would you like to ask your doctor#xpath=//android.widget.TextView[@text = '<<QUERY>>']";
	public static final String btn_PatientHealthTeamDoctorPage_Continue = "Continue Button#xpath=//android.widget.TextView[@text = 'Continue']/parent::*";
	public static final String btn_PatientHealthTeamDoctorPage_Comments = "Comments Edit TextBox#xpath=//android.widget.EditText";
	public static final String lbl_PatientHealthTeamDoctorPage_SelectDay = "Select Day#xpath=//android.view.ViewGroup[@resource-id = 'selectDay']/android.view.ViewGroup[2]/android.widget.TextView";
	public static final String lbl_PatientHealthTeamDoctorPage_SelectTime = "Select Time#xpath=//android.view.ViewGroup[@resource-id = 'selectTime']/android.view.ViewGroup//android.widget.TextView[contains(@text,':')]";
	public static final String btn_PatientHealthTeamDoctorPage_ProceedToPayment = "Proceed to payment#xpath=//android.view.ViewGroup[@resource-id ='proceedPaymentId']";
	public static final String btn_PatientHealthTeamDoctorPage_AskDoctor = "Ask Doctor Button#xpath=//android.widget.TextView[@text = 'Ask Doctor']/parent::*";
	public static final String btn_PatientHealthTeamDoctorPage_DoneButton = "Booking Successful Done Button#xpath=//android.widget.TextView[@text = 'Done']/parent::*";

	// What would you like to ask doctor
	public String lbl_PatientHealthTeamDoctorPage_AskDoctor = "Ask Doctor Query#xpath=//android.widget.TextView[@text = '<<QUERY>>']/parent::*";
	public static final String btn_PatientHealthTeamDoctorPage_AskDoctorContinue = "Ask Doctor Continue Button#xpath=//android.view.ViewGroup[@resource-id = 'continueId']";
	public static final String val_PatientHealthTeamDoctorPage_Comments = "Comments#xpath=//android.widget.EditText";

	// Patient Support Screen

	public static final String lbl_Hamburger_Support = "Support#xpath=//android.widget.TextView[@text = 'Support']/parent::*";

	public static final String lbl_PatientSupportPage_Title = "Support Screen Title#xpath=//android.view.ViewGroup[@resource-id = 'support']/android.widget.TextView[@text='Support']";
	public static final String btn_PatientSupportPage_ChevronBack = "Chevron Back Button#xpath=//android.widget.TextView[@text = '']/parent::*";

	public static final String lbl_PatientSupportPage_FAQ = "Support Screen Title#xpath=//*[@resource-id='FAQs']";
	public static final String lbl_PatientSupportPage_Contact = "Contact us Title#xpath=//*[@resource-id='ContactUs']";
	public static final String lbl_PatientSupportPage_SendAQuery = "Send a Query us Title#xpath=//android.widget.TextView[@text='Send a Query']";
	public static final String lbl_PatientSupportPage_Category = "Category Title#xpath=//android.widget.TextView[@text='Category']";
	public static final String lbl_PatientSupportPage_SubCategory = "sub Category Title#xpath=//android.widget.TextView[@text='Sub Category']";
	public static final String txt_PatientSupportPage_Message = "sub Category Title#xpath=//android.widget.TextView[@text='Message']";
	public static final String btn_PatientSupportPage_Submit = "Submit button#xpath=//android.widget.TextView[@text='Submit']/parent::*";
	public static final String btn_PatientSupportPage_Call = "Call button#xpath=//android.widget.TextView[@text='Call']/parent::*";
	public static final String btn_PatientSupportPage_Chat = "Chat button#xpath=//android.widget.TextView[@text='Chat']/parent::*";

	// Store
	public static final String lbl_Store_Categories = "Store Categories#xpath=//android.widget.ScrollView[@resource-id = 'StoreList']//android.widget.TextView";
	public static final String lbl_Store_RequestCallBack = "Request Call Back#xpath=//android.widget.TextView[@text = 'Request Callback']/parent::*";
	public static final String lbl_Store_CallBackRequestedTexts = "Call Back Requested Texts#xpath=//android.widget.TextView[@text = 'Done']/parent::*/preceding-sibling::android.widget.TextView";

	// Notifications
	public static final String lbl_Notifications_Title = "Notifications Title#xpath=//android.view.ViewGroup[@resource-id = 'NotificationText']";
	public static final String lst_Notifications_MenuLists = "Notifications and Reminders List#xpath=//android.widget.TextView";
	public static final String btn_Notifications_GeneralAppNotifications = "General App Notifications Button#xpath=//android.widget.TextView[@resource-id = 'NotifOption']/following-sibling::android.widget.Switch";
	public static final String btn_Notifications_ReadingReminders = "Reading Reminders Button#xpath=//android.widget.TextView[@text = 'Reading reminders']/following-sibling::android.widget.Switch";
	public static final String btn_Notifications_HealthReminders = "Health Reminders Button#xpath=//android.widget.TextView[@text = 'Health Reminders']/following-sibling::android.widget.Switch";
	public static final String btn_Notifications_CalendarReminders = "Calendar Reminders Button#xpath=//android.widget.TextView[@text = 'Calendar Reminders']/following-sibling::android.widget.Switch";

	// Hamburger - Lyfe + Subscription
	public static final String lbl_Hamburger_Subscription = "Lyfe+ Subscription#xpath=//android.widget.TextView[@text = 'Lyfe Subscription']";

	// Subscription Page
	public static final String lbl_Subscription_Title = "Subscription Title#xpath=//android.widget.TextView[@text = 'Subscription']";
	public static final String lbl_Subscription_RequestCallBack = "Request a call back#xpath=//android.widget.TextView[@text = 'Request a call back']/parent::*";
	public static final String lbl_Subscription_CallBackRequestedTexts = "Call Back Requested Texts#xpath=//android.widget.TextView[@text = 'Done']/parent::*/preceding-sibling::android.widget.TextView";
	public static final String btn_Subscription_Done = "Vitals Done Button#xpath=//android.widget.TextView[@text = 'Done']/parent::*";

	public static final String lbl_Subscription_ActiveIcon = "Active Icon in Subscription Page#xpath=//android.widget.TextView[@text = 'Active']";
	public static final String lbl_Subscription_MyDevice = "My Device label in Subscription Page#xpath=//android.widget.TextView[contains(@text ,'My Device')]";
	public static final String lbl_Subscription_ManageDevice = "Manage Device Icon in Subscription Page#xpath=//android.widget.TextView[contains(@text ,'Manage')]";
	public static final String lbl_Subscription_Validity = "validit Label Title in Subscription Page#xpath=//android.widget.TextView[contains(@text ,'Validity')]";
	public static final String lbl_Subscription_Startdate = "Start Date label in Subscription Page#xpath=//android.widget.TextView[contains(@text ,'Start Date')]";
	public static final String lbl_Subscription_EndDate = "End Date label in Subscription Page#xpath=//android.widget.TextView[contains(@text ,'End Date')]";
	public static final String val_Subscription_Startdate = "Start Date value in Subscription Page#xpath=//android.widget.TextView[contains(@text ,'Start Date')]/following::android.widget.TextView[2]";// Need
	public static final String val_Subscription_EndDate = "End Date value in Subscription Page#xpath=//android.widget.TextView[contains(@text ,'End Date')]/following::android.widget.TextView[2]";// Need

	public static final String btn_Subscription_RequestACall = "Request a call Subscription Page#xpath=//android.widget.TextView[@text='Request a call back']/parent::*";

	// Hamburger - Settings

	public static final String lbl_Hamburger_Settings = "Settings#xpath=//android.widget.TextView[@text = 'Settings']";

	// Profile

	public static final String btn_Hamburgermenu_settings_Profile = "Settings in profile option Hamburgermenu #xpath=//android.widget.TextView[@text='Profile']";
	public static final String tab_Hamburgermenu_settings_PersonalDetails = "Personal details tab in Profile Settingspage#xpath=//android.widget.TextView[@text='Personal Details']";
	public static final String txt_Hamburgermenu_settings_Profilescreen_Lastname = "edit by user in profile screen in Hamburgermenu #xpath=//android.widget.TextView[@text='Last Name *']/following::android.widget.EditText";
	public static final String btn_Hamburgermenu_settings_Profilescreen_Save = "Save in profile screen in Profile #xpath=//android.widget.TextView[@text='Save']";

	// Contact

	public static final String tab_Hamburgermenu_settings_MyContact = "My Contacts tab in setting contact#xpath=//android.widget.TextView[@text='My Contact']";
	public static final String tab_Hamburgermenu_settings_ContactCareGiver = "Contacts Caregiver tab in setting contact#xpath=//android.widget.TextView[@text='Caregiver Contact']";
	public static final String tab_Hamburgermenu_settings_Emergencycontact = "Emergency Contacts tab in setting contact#xpath=//android.widget.TextView[@text='Emergency Contact']";
	public static final String lbl_Hamburgermenu_settings_CareGiverLabel = "Caregiver Label in contacts#xpath=//android.widget.TextView[@text='Caregiver Name']";
	public static final String lbl_Hamburgermenu_settings_EmergencyContactnameLabel = "Emergency Contact Name label Label in contacts#xpath=//android.widget.TextView[@text='Emergency Contact Name']";

	public static final String icon_Hamburgermenu_settings_CareGiverNamePencil = "Pencil icon beside Caregiver name#xpath=(//android.widget.TextView[@text='Caregiver name']/parent::android.view.ViewGroup/following::android.view.ViewGroup)[1]";
	public static final String icon_Hamburgermenu_settings_EmergencyNamePencil = "Pencil icon beside Emergency contact name#xpath=(//android.widget.TextView[@text='Emergency contact name']/parent::android.view.ViewGroup/following::android.view.ViewGroup)[1]";

	public static final String txt_Hamburgermenu_settings_CareGiverName = "Caregiver name text box in contacts#xpath=//android.widget.TextView[@text='Caregiver name']//following-sibling::android.widget.EditText";

	public static final String txt_Hamburgermenu_settings_NamePencil = "EmergencyContact name text box in contacts#xpath=(//*[@text='1']/following::android.view.ViewGroup//android.widget.ImageView)[2]";
	public static final String txt_Hamburgermenu_settings_PhoneNumberPencil = "EmergencyContact name text box in contacts#xpath=(//*[@text='1']/following::android.view.ViewGroup//android.widget.ImageView)[3]";

	public static final String txt_Hamburgermenu_settings_EmergencyNameandPhone = "EmergencyContact name text box in contacts#xpath=//*[@text='1']/following::android.widget.EditText";
	public static final String txt_Hamburgermenu_settings_EmergencyPhoneNumber = "EmergencyContact PhoneNumber text box in contacts#xpath=//android.view.ViewGroup[@resource-id='contactNumber']/android.widget.EditText";
	public static final String txt_Hamburgermenu_settings_UpdatedName = "EmergencyContact name text box in contacts#xpath=(//*[@text='1']/following::android.widget.ScrollView)[1]";

	public static final String btn_Hamburgermenu_settings_SaveContact = "Save Button in contacts page#xpath=//android.widget.TextView[@text='Save']/parent::*";

	// About Us, Terms &Condition and Feedback

	public static final String lnk_Hamburgermenu_AboutUs = "About us in Hamburgermenu #xpath=//android.widget.TextView[@text='About us']";
	public static final String lnk_Hamburgermenu_TermsAndCondition = "Terms and condition under Hamburgermenu #xpath=//android.widget.TextView[@text='Terms & Conditions']";
	public static final String lnk_Hamburgermenu_Feedback = "Feedback under Hamburgermenu #xpath=//android.widget.TextView[@text='Feedback']";

	public static final String txtLbl_Hamburgermenu_AboutUS = "About us Screen#xpath=//android.view.ViewGroup[@resource-id='AboutUsScreen']";
	public static final String txtLbl_Hamburgermenu_Version = "Version Details in About us Screen#xpath=//android.widget.TextView[contains(@text,'Version')]";
	public static final String txtLbl_Hamburgermenu_WhoWeAre = "Who we are in about us page under Hamburgermenu #xpath=//android.widget.TextView[@text='Who we are?']";
	public static final String txtLbl_Hamburgermenu_WhatDoWeDo = "What do we do in about us page under Hamburgermenu #xpath=//android.widget.TextView[@text='What do we do?']";

	public static final String lbl_Hamburgermenu_TermsAndCondition = "Terms and condition in Terms and condition Page #xpath=//android.widget.TextView[@resource-id='TextTermCond']";
	public static final String btn_Hamburgermenu_Close = "Screen close button in T&C page#xpath=//android.view.ViewGroup[@resource-id='ScreenClose']//android.widget.TextView";
	public static final String chk_Hamburgermenu_TermsAndCondition_AcknowledgementCheckbox = "Acknowledgement checkbox in Terms and condition Page #xpath=//android.widget.TextView[contains(@text,'I hereby acknowledge')]/parent::*/android.view.ViewGroup";
	public static final String lnk_Hamburgermenu_TermsAndCondition_continue = "Continue Button in Terms and condition Page #xpath=//android.view.ViewGroup[@resource-id='verifyButton']";

	public static final String header_Hamburgermenu_Feedback = "Feedback page header#xpath=//android.view.ViewGroup[@resource-id='Feedback']//android.widget.TextView[@text='Feedback']";
	public static final String txt_Hamburgermenu_Message = " Message box in Feedback page#xpath=//android.widget.EditText[@resource-id='descriptionText']";
	public static final String btn_Hamburgermenu_Submit = "Submit button in Feedback page#xpath=//android.view.ViewGroup[@resource-id='Submit']";

	// Order Page

	public static final String lbl_Order_Store = "Order in orderScreen#xpath=//android.widget.TextView[@text='Store']";
	public static final String lbl_Order_supportIcon = "Question Mark in Order Screen#xpath=//android.view.ViewGroup[@resource-id='HeaderName']";

	public static final String lbl_Order_MedicineOrder = "MedicineOrder under Store Page#xpath=//android.widget.TextView[@text='Medicine Order']";
	public static final String lbl_Order_LabTestOrder = "LabTestorder in Order Screenn#xpath=//android.widget.TextView[contains(@text,'Lab Test Order')]";
	public static final String lbl_Order_DevicesOrder = "Devices in storeScreen#xpath=//android.widget.TextView[@text='Devices']";
	public static final String lbl_Order_HealthyFoods = "Healthyfood in storeScreen#xpath=//android.widget.TextView[@text='Healthy Foods']";

	public static final String msgTxt_OrderPage_TitleandHelpTextElement = "LabTestOrder in storeScreen #xpath=//android.widget.TextView[@text ='Cancel']/parent::*/preceding-sibling::android.widget.TextView";

	public static final String btn_OrderPage_Cancel = "Cancel button in Call back Request Page#xpath=//android.widget.TextView[@text='Cancel']";
	public static final String btn_OrderPage_RequestCallBack = "Request Callback under Lab Test Order#xpath=//android.widget.TextView[@text='Request Callback']";
	public static final String lbl_OrderPage_CallBackRequested = "Callback Requested title lable#xpath=//android.widget.TextView[@text='Callback Requested']";
	public static final String msgTxt_OrderPage_ContactBackSuccessMSg = "CallBackRequest labTest OrderPage#xpath=//android.widget.TextView[@text ='Done']/parent::*/preceding-sibling::android.widget.TextView";
	public static final String btn_OrderPage_Done = "Done in CallBack Requested#xpath=//android.widget.TextView[@text='Done']";

	// Settings Page
	public static final String lbl_Settings_Title = "Subscription Title#xpath=//android.view.ViewGroup[@resource-id = 'SettingsHeader']";
	public static final String lbl_Settings_MyDevices = "My Devices#xpath=//android.widget.TextView[@text = 'My Devices']";

	// My Devices Page
	public static final String lbl_MyDevices_Title = "My Devices Title#xpath=//android.view.ViewGroup[@resource-id = 'HeaderName']";
	public static final String lbl_MyDevices_ConnectYourDevices = "Connect Your Devices#xpath=//android.widget.TextView[@resource-id = 'connectYourDevice']";
	public static final String img_MyDevices_BluetoothIcon = "Bluetooth Icon#xpath=//android.widget.TextView[@resource-id = 'connectYourDevice']/following-sibling::android.view.ViewGroup";
	public static final String img_MyDevices_ChevronBack = "My Devices Back Button#xpath=//android.widget.TextView[@text = '']/parent::*";

	// Password and Security

	public static final String btn_Hamburgermenu_settings_PasswordAndSecurity = "Settings Screen Password&Security#xpath=//android.widget.TextView[contains(@text,'Password & Security')]";
	public static final String lbl_Hamburgermenu_settings_PasswordAndSecurity_ChangePassword = "ChangePassword in password&security screen in Profile#xpath=//android.widget.TextView[@resource-id='ChnagePass']";
	public static final String lbl_Hamburgermenu_settings_PasswordAndSecurity_Currentpassword = "Currentpassword Label in password&security in settings#xpath=//android.widget.TextView[@text='Current Password']";
	public static final String lbl_Hamburgermenu_settings_PasswordAndSecurity_Newpassword = "New Password Label in password&security in settings#xpath=//android.widget.TextView[@text='New Password']";
	public static final String lbl_Hamburgermenu_settings_PasswordAndSecurity_Confirmpassword = "Confirm Password Label in password&security in settings#xpath=//android.widget.TextView[@text='Confirm New Password']";

	public static final String txt_Hamburgermenu_settings_PasswordAndSecurity_Currentpassword = "Currentpassword in password&security in settings#xpath=//android.widget.TextView[@text='Current Password']/following::android.widget.EditText[@text='Enter current password here']";
	public static final String txt_Hamburgermenu_settings_PasswordAndSecurity_Newpassword = "New Password in password&security in settings#xpath=//android.widget.TextView[@text='New Password']/following::android.widget.EditText[@text='Enter new password here']";
	public static final String txt_Hamburgermenu_settings_PasswordAndSecurity_Confirmpassword = "Confirm Password in password&security in settings#xpath=//android.widget.TextView[@text='Confirm New Password']/following::android.widget.EditText[@text='Re-enter password here']";
	public static final String btn_PasswordAndSecurity_UpdatedPassword = "password&security in password&security screen in Profile#xpath=//android.widget.TextView[@text='Update Password']/parent::*";

	public static final String lnk_PasswordAndSecurity_TrustedDevices = "password&Trusted devices in password&security screen in Profile#xpath=//android.widget.TextView[@text='Trusted Devices']";
	public static final String lnk_PasswordAndSecurity_BiometricAuthentication = "BiometricAuthentication screen in Profile#xpath=//android.widget.TextView[@text='Biometric Authentication']";
	public static final String Toggle_BiometricAuthentication_enablebio = "enable biometric screen in Profile#xpath=//android.widget.TextView[contains(@text,'Enable Bio-Metric Auth')]/following::android.widget.Switch";

	// Trusted Devices - Page
	public static final String header_TrustedDevices_device = "device in password&security screen in Profile#xpath=//android.view.ViewGroup[@resource-id = 'Trusted Devices']//android.widget.TextView[@text='Trusted Devices']";
	public static final String lbl_TrustedDevices_ListOfDevices = "List of Trusted Devices#xpath=//android.widget.ScrollView//android.view.ViewGroup//android.widget.TextView";
	public static final String btn_TrustedDevices_SignOutOfAllDevices = "Sign Out Of All Devices#xpath=//android.view.ViewGroup[@resource-id = 'SignOutBtn']";

	// Diet and lifestyle
	public static final String lbl_Hamburger_DietAndLifeStyle = "Diet And LifeStyle#xpath=//android.widget.TextView[@text = 'Diet and lifestyle']";
	public static final String lbl_DietAndWellness_Title = "Diet & Wellness Title#xpath=//android.view.ViewGroup[@resource-id = 'DietLifestyle']/android.widget.TextView[@text = 'Diet & Wellness ']";
	public static final String lbl_DietAndWellness_ViewDietPlan = "View Diet Plan#xpath=//android.view.ViewGroup[@resource-id = 'viewDietPlan']";
	public static final String lbl_DietAndWellness_ViewExercises = "View Exercises#xpath=//android.view.ViewGroup[@resource-id = 'viewExercises']";
	public static final String val_DietAndWellness_TodayGoalCount = "Today Goal#xpath=//android.widget.TextView[contains(@text,'today')]/preceding-sibling::android.widget.TextView";
	public static final String val_DietAndWellness_SleepGoalCount = "Sleep Goal#xpath=//android.widget.TextView[contains(@text,'Sleep Goal')]/preceding-sibling::android.widget.TextView";
	public static final String val_DietAndWellness_StepsGoalCount = "Steps Goal#xpath=//android.widget.TextView[contains(@text,'Steps Goal')]/preceding-sibling::android.widget.TextView";

	public static final String lbl_DietAndWellness_CoachName = "Coach Name#xpath=(//android.view.ViewGroup[@resource-id='viewExercises']/following-sibling::android.view.ViewGroup//android.widget.ImageView)[1]";
	public static final String lbl_DietAndWellness_CoachImage = "Coach Image#xpath=(//android.view.ViewGroup[@resource-id='viewExercises']/following-sibling::android.view.ViewGroup//android.widget.TextView)[1]";
	public static final String lbl_DietAndWellness_CoachChevron = "Coach Chevron#xpath=(//android.view.ViewGroup[@resource-id='viewExercises']/following-sibling::android.view.ViewGroup//android.widget.ImageView)[2]";
	public static final String tab_DietAndWellness_CoachTab = "Coach Chevron#xpath=//android.view.ViewGroup[@resource-id='viewExercises']/following-sibling::android.view.ViewGroup";

	public static final String lbl_CoachPage_CoachName = "Coach Name#xpath=(//android.view.ViewGroup[@resource-id='coachAppointment']/android.widget.TextView)[1]";
	public static final String lbl_CoachPage_CoachActiveChatsLabel = "Active Chats#xpath=//android.widget.TextView[@text='Active']";
	public static final String lbl_CoachPage_CoachUpcomingChats = "Upcoming Chats#xpath=//android.widget.TextView[@text='Upcoming']";
	public static final String lbl_CoachPage_CoachHistory = "Upcoming Chats#xpath=//android.widget.TextView[contains(@text,'History')]";
	public static final String btn_CoachPage_BookAnAppointment = "Book An Appointment#xpath=//android.widget.TextView[@text= 'Book Appointment']/parent::*";

	public static final String btn_DietAndLifeStyle_iButton = "iButton in Exercise and Diet Plans#xpath=//android.widget.TextView[@text='i']/parent::*";
	public static final String btn_DietAndLifeStyle_CloseButton = "Close Button in Diet and Exercise Plans#xpath=//android.widget.TextView[@text='Things to keep in mind']/preceding-sibling::android.view.ViewGroup";
	public static final String btn_DietAndLifeStyle_ContactCoach = "Contact Coach Button in Diet and Exercise Plans#xpath=//*[@text='Contact Coach']";
	public static final String lbl_DietAndLifeStyle_UpdatedOnDate = "Updated On date in Diet and Exercise Plans#xpath=//android.widget.TextView[contains(@text,'Updated on :')]";

	public static final String header_DietAndLifeStyle_DietPlan = "Exercise Plan Header#xpath=//android.view.ViewGroup[@resource-id='DietPlan']";
	public static final String btn_DietAndLifeStyle_DietEllipsis = "Diet Plan Ellipsis#xpath=(//android.widget.TextView[@text='Diet Plan']/following::*/android.widget.ImageView)[1]/parent::*";
	public static final String btn_DietAndLifeStyle_DietDloadAsPDF = "Download PDF in Diet Plans#xpath=//*[@text='Download as PDF']";
	public static final String lbl_DietAndLifeStyle_DietInstructions = "Diet Plan Instructions#xpath=//android.widget.TextView[@text='Instructions']";

	public static final String header_DietAndLifeStyle_ExercisePlan = "Exercise Plan Header#xpath=//android.view.ViewGroup[@resource-id='Exercises']";
	public static final String btn_DietAndLifeStyle_ExerciseEllipsis = "Exercise Plan Ellipsis#xpath=(//android.widget.TextView[@text='Exercises']/following::*/android.widget.ImageView)[1]/parent::*";
	public static final String lbl_DietAndLifeStyle_ExerciseInstructions = "Exercise Plan Instructions#xpath=//android.widget.TextView[@text='Guidelines for these exercises']";
	public static final String lst_DietAndLifeStyle_Exercises = "Exercises Name#xpath=//android.widget.ScrollView//android.view.ViewGroup//android.widget.TextView[1]";
	public static final String lst_DietAndLifeStyle_ExpandArrows = "Expandable Arrows#xpath=//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";
	public static final String lnk_DietAndLifeStyle_YoutubeLink = "Youtube Link#xpath=//*[contains(@text,'https://www.youtube.com')]";

	public static final String lbl_DietPlan_Title = "Diet Plan Title#xpath=//android.view.ViewGroup[@resource-id = 'DietPlan']/android.widget.TextView";
	public static final String lbl_DietPlan_Dropdown = "Diet Plan#xpath=//android.widget.TextView[@text = '<<DietPlan>>']/following-sibling::android.view.ViewGroup[@resource-id = 'listOpen']/android.widget.ImageView";

	// Emergency Settings
	public static final String lbl_EmergencySettings_Title = "Emergency Settings Title#xpath=//android.view.ViewGroup[@resource-id = 'HeaderName']//android.widget.TextView[@text = 'Emergency Settings']";
	public static final String lbl_EmergencySettings_DefaultOption = "Default Emergency Service#xpath=//android.widget.TextView[@resource-id = 'DefaultEmergency']";
	public static final String lbl_EmergencySettings_ChevronBack = "Chevron Back Button#xpath=//android.view.ViewGroup[@resource-id = 'HeaderName']//android.widget.TextView[@text ='']/parent::*";
	public static final String img_EmergencySettings_EmergencyCheckBox = "Emergency Services CheckBox#xpath=//android.widget.TextView[@text = 'Emergency Services']/preceding-sibling::android.widget.ImageView[2]";
	public static final String img_EmergencySettings_HospitalCheckBox = "Emergency Services CheckBox#xpath=//android.widget.TextView[@text = 'Hospital']/preceding-sibling::android.widget.ImageView[2]";

	// Select Preferred Hospital
	public static final String lbl_SelectPreferredHospital_Title = "Select Preferred Hospital#xpath=//android.widget.TextView[@text = 'Select Preferred Hospital']";
	public static final String lbl_SelectPreferredHospital_HospitalName = "Hospital Name List#xpath=//android.widget.TextView";
	public static final String lbl_SelectPreferredHospital_SelectedHospital = "Selected Hospital Name#xpath=//android.widget.TextView[@resource-id = 'SelectPreferred']";

	// My Addresses
	public static final String lbl_MyAddresses_Title = "My Addresses#xpath=//android.view.ViewGroup[@resource-id = 'My Addresses']/android.widget.TextView[@text = 'My Addresses']";
	public static final String lbl_MyAddresses_ChevronBack = "Chevron Back Button#xpath=//android.view.ViewGroup[@resource-id = 'My Addresses']//android.widget.TextView[@text ='']/parent::*";
	public static final String lbl_MyAddresses_PreferredText = "Prefferred Text#xpath=//android.widget.TextView[@text = 'Preferred']";
	public static final String img_MyAddresses_HomeIcon = "My Addresses Home Icon#xpath=//android.widget.TextView[@text = 'Preferred']/preceding-sibling::android.widget.ImageView";
	public static final String lbl_MyAddresses_EditText = "Edit Text#xpath=//android.widget.TextView[@text = 'Edit']";
	public static final String img_MyAddresses_EditIcon = "My Addresses Edit Icon#xpath=//android.widget.TextView[@text = 'Edit']/preceding-sibling::android.widget.ImageView";
	public static final String btn_MyAddresses_AddNewAddress = "Add New Address#xpath=//android.widget.TextView[@text = 'Add new address']/parent::*";

	// New Address
	public static final String lbl_NewAddress_Title = "New Address Page Title#xpath=//android.widget.TextView[@text = 'New Address']";
	public static final String val_NewAddress_EnterPincode = "New Address Enter Pincode Text Box#xpath=//android.widget.TextView[@text = 'Pincode*']/following-sibling::android.widget.EditText";
	public static final String lbl_NewAddress_State = "New Address Enter State Text Box#xpath=//android.widget.TextView[@text = 'State*']/following-sibling::android.view.ViewGroup//android.widget.TextView";
	public static final String lbl_NewAddress_City = "New Address Enter City Text Box#xpath=//android.widget.TextView[@text = 'City *']/following-sibling::android.view.ViewGroup//android.widget.TextView";
	public static final String val_NewAddress_EnterHouseOrFlatNumber = "New Address Enter House/Flat No#xpath=//android.widget.TextView[@text = 'House/Flat Number*']/following-sibling::android.widget.EditText";
	public static final String val_NewAddress_EnterStreetSocietyDistrictNumber = "New Address Enter Street/Society/District#xpath=//android.widget.TextView[@text = 'Street/Society/District*']/following-sibling::android.widget.EditText";
	public static final String lbl_NewAddress_HomeAddressLabel = "Home Address Label#xpath=//android.widget.TextView[@text = 'Home']/parent::*";
	public static final String btn_NewAddress_Save = "New Address Save Button#xpath=//android.widget.TextView[@text = 'Save']/parent::*";

	public String lbl_MyAddresses_AddedAddress = "My Addresses Added New Address#xpath=//android.widget.TextView[@text = '<<ADDRESS>>']";

	// Doctor

	// Doctor launchPage
	public static final String img_DoctorLaunchPage_Carousal = "Launch Page Carousel Image#xpath=//android.widget.HorizontalScrollView//android.widget.ImageView";
	public static final String lbl_DoctorLoginpage_carousel = "Carousel image Texts#xpath=//android.widget.HorizontalScrollView//android.widget.TextView";
	public static final String lbl_DoctorLaunchPage_Title = "Launch Page Title#xpath=//android.view.ViewGroup[@resource-id = 'introSlide']//android.widget.ImageView";
	public static final String txt_DoctorLoginPage_MobileNumber = "MobileNumber text box launch Page#xpath=//android.view.ViewGroup[@resource-id = 'loginOption']//android.widget.TextView";
	public static final String btn_DoctorLoginPage_Email = "Login with Email#xpath=//android.widget.TextView[@text='OR Login with E-mail']/parent::*";

	public static final String txt_DoctorLoginPage_MobileNumber2 = "MobileNumber text box launch Page#xpath=//android.view.ViewGroup[@resource-id ='mobileNumber']//android.widget.EditText";
	public static final String btn_DoctorLoginPage_GetOTP = "Get otp button launch Page#xpath=//android.widget.TextView[@text='Get OTP']/parent::*";
	public static final String btn_DoctorLoginPage_Continue = "Continue button launch Page#xpath=//android.widget.TextView[@text='Continue']/parent::*";

	// Doctor Email Login Page
	public static final String txt_DoctorLoginPage_EmailValue = "Login Page Email Field#xpath=//android.view.ViewGroup[@resource-id='emailInput']//android.widget.EditText";
	public static final String txt_DoctorLoginPage_PasswordValue = "Login Page Password Field#xpath=//android.view.ViewGroup[@resource-id='password']//android.widget.EditText";
	public static final String btn_DoctorLoginPage_login = "Email Login Page Login Button#xpath=//android.widget.TextView[@text = 'Login']/parent::android.view.ViewGroup";

	public static final String lbl_DoctorLoginPage_FailedToProceed = "Failed to Proceed#xpath=//android.widget.TextView[@text = 'Failed to proceed.']";
	public static final String lbl_DoctorLoginPage_EnterValidEmailOrPassword = "Please enter valid email or password#xpath=//android.widget.TextView[@text = 'Please enter valid email and password.']";

	public static final String img_DoctorLoginPage_SupportIcon = "Email Login Support Icon#xpath=//android.view.ViewGroup[@resource-id = 'emailVerification']//android.widget.ImageView/parent::*";
	public static final String lbl_DoctorLoginPage_ForgotPassword = "Login Page Forgot Password#xpath=//android.view.ViewGroup[@resource-id = 'forgotPassword']";

	// Doctor Support Page
	public static final String lbl_DoctorSupportPage_Title = "Support Page Title#xpath=//android.view.ViewGroup/android.widget.TextView[@text = 'Support']";
	public static final String lbl_DoctorSupportPage_ChevronBack = "Support Page Chevron Back Button#xpath=//android.widget.TextView[@text = '']"; // Need
	// id

	// Doctor Forgot Password
	public static final String lbl_DoctorForgotPasswordPage_Title = "Doctor Forgot Password Title#xpath=//android.view.ViewGroup[@resource-id = 'backIcon']//android.widget.TextView[@text = 'Forgot Password']";

	// Terms and Conditions :

	public static final String chk_DrTermsAndCondition_AcknowledgementCheckbox = "Acknowledgement checkbox in Terms and condition Page #xpath=(//android.widget.TextView[contains(@text,'I hereby acknowledge')]/parent::*/android.view.ViewGroup)[1]";
	public static final String lnk_DrTermsAndCondition_continue = "Continue Button in Terms and condition Page#xpath=//android.widget.TextView[contains(@text,'Continue')]/parent::android.view.ViewGroup";

	// footer
	public static final String FooterIcons_DoctorHome = "Doctor Dashboard Home Icon in Footer#xpath=//android.widget.TextView[@text='Home']//preceding-sibling::*";
	public static final String FooterIcons_Appointment = "Appointment Home Icon in Footer#xpath=//android.widget.TextView[@text='Appointments']//preceding-sibling::*";
	public static final String FooterIcons_Patients = "patients Icon in Footer#xpath=//android.widget.TextView[@text='Patients']//preceding-sibling::*";
	public static final String FooterIcons_More = "more Icon in Footer#xpath=//android.widget.TextView[@text='More']//preceding-sibling::*";

	// header
	public static final String btn_DoctorDashboard_notification = "Dashboard alerts notification Icon in Header#xpath=(//android.widget.TextView[contains(@text,'Hello')]//parent::android.view.ViewGroup//android.widget.ImageView)[2]";
	public static final String btn_Dashboard_Search = "Search Icon in Header#xpath=(//android.widget.TextView[@text=(//android.widget.TextView[contains(@text,'Hello')]//parent::android.view.ViewGroup//android.widget.ImageView)[1]";
	public static final String lbl_Dashboard_DoctorNameHeader = "Doctor name in the Header#xpath=//android.widget.TextView[contains(@text,'Hello')]";

	public static final String lbl_Dashboard_PatientAlerts = "Dashboard patient text in Header#xpath=//android.widget.TextView[contains(@text,'with alerts')]";

	public static final String lbl_Dashboard_critical = "critical patient in Header#xpath=//android.widget.TextView[@text='Critical']";
	public static final String lbl_Dashboard_moderate = "Moderate patient in Header#xpath=//android.widget.TextView[@text='Moderate']";
	public static final String lbl_Dashboard_Normal = "Normal patient in Header#xpath=//android.widget.TextView[@text='Normal']";
	public static final String val_Dashboard_critical = "Number of critical patient in Header#xpath=//android.widget.TextView[@text='Critical']/preceding-sibling::android.widget.TextView";
	public static final String val_Dashboard_moderate = "Number Moderate patient in Header#xpath=//android.widget.TextView[@text='Moderate']/preceding-sibling::android.widget.TextView";
	public static final String val_Dashboard_Normal = "Number of Nomral patient in Header#xpath=//android.widget.TextView[@text='Normal']/preceding-sibling::android.widget.TextView";

	// logout

	public static final String btn_Dashboard_Logout = "Logout Button in More Page#xpath=//android.widget.TextView[@text='Logout']/parent::*";
	public static final String lbl_Dashboard_ConfirmationMessage = "Logout Confirmation text#xpath=//android.widget.TextView[@text='Are you sure you want to Log Out?']";
	public static final String btn_Dashboard_LogoutYES = "Logout YES Button#xpath=//android.widget.TextView[@text='Yes']/parent::*";
	public static final String btn_Dashboard_LogoutNO = "Logout NO Button#xpath=//android.widget.TextView[@text='No']/parent::*";

	// Chat

	public static final String lbl_Dashboard_ActiveChatPanel = "ActiveChat in Dashboard#xpath=//android.view.ViewGroup[@resource-id='activeChat']";
	public static final String lst_Dashboard_ActiveChatList = "First ActiveChat in Dashboard#xpath=//android.view.ViewGroup[@resource-id='activeChat']/android.view.ViewGroup";
	public static final String lbl_Dashboard_ResolvedChatPanel = "ResolvedChat in  Dashboard#xpath=//android.view.ViewGroup[@resource-id='activeChat']//following-sibling::android.view.ViewGroup";
	public static final String lbl_Dashboard_ResolvedChatList = "First Resolved Chat in Dashboard#xpath=//android.view.ViewGroup[@resource-id='activeChat']//following-sibling::android.view.ViewGroup/android.view.ViewGroup";
	public static final String lbl_Dashboard_ResolvedChatHeader = "ResolvedChat in  Dashboard=//android.view.ViewGroup[@resource-id='activeChat']/following-sibling::*[contains(@text,'Resolved Chats')]";

	public static final String lbl_Dashboard_ActiveChat_PatientName = "patientName in ActiveChat#xpath=(//android.view.ViewGroup[@resource-id='backIcon']//following-sibling::android.widget.TextView)[2]";// Need
	public static final String lbl_Dashboard_ActiveChat_PatientId = "patientId in ActiveChat#xpath=(//android.view.ViewGroup[@resource-id='backIcon']//following-sibling::android.widget.TextView)[3]";// Need
	public static final String lbl_Dashboard_ActiveChat_ProfilePicture = "patient profile picture in ActiveChat#xpath=(//android.view.ViewGroup[@resource-id='backIcon']//following-sibling::android.widget.ImageView)[1]";// Need
	public static final String lbl_Dashboard_ActiveChat_BackChevron = "backChevron in ActiveChat#xpath=(//android.view.ViewGroup[@resource-id='backIcon']//following-sibling::android.widget.TextView)[1]"; // Need
	public static final String lbl_Dashboard_ActiveChat_Join = "Join in ActiveChat#xpath=(//android.view.ViewGroup[@resource-id='backIcon']//following-sibling::android.widget.ImageView)[2]";// Need

	public static final String lbl_Dashboard_ActiveChat_Chat = "Chat Button in ActiveChat#xpath=//android.widget.TextView[@text='Chat']/parent::*";// Need
	public static final String lbl_Dashboard_ActiveChat_Profile = "Profile Option in ActiveChat#xpath=//android.widget.TextView[@text='Profile']/parent::*";// Need
	public static final String lbl_Dashboard_ActiveChat_RXSummary = "RX Summary in ActiveChat#xpath=//android.widget.TextView[@text='Rx Summary']/parent::*";// Need
	public static final String lbl_Dashboard_ActiveChat_History = "History in ActiveChat#xpath=//android.widget.TextView[@text='History']/parent::*";// Need
	public static final String lbl_Dashboard_ActiveChat_RequestType = "Request Type in ActiveChat#xpath=(//*[@text='Mark as resolved']/parent::*//parent::android.view.ViewGroup//android.widget.TextView)[1]";// Need
	public static final String lbl_Dashboard_ActiveChat_MarkAsResolved = "Mark as resolved in ActiveChat#xpath=//android.widget.TextView[@text='Mark as resolved']/parent::*";// Need
	public static final String lbl_Dashboard_ActiveChat_ResolveChatYes = "Active Chat Mark As Resolved Yes Button#xpath=//android.widget.TextView[@text='Yes']/parent::*";// Need
	public static final String lbl_Dashboard_ActiveChat_ResolveChatNo = "Active Chat Mark As Resolved No Button#xpath=//android.widget.TextView[@text='No']/parent::*";// Need

	public static final String lbl_Dashboard_ActiveChat_QuickResponse = "Quick Response in ActiveChat#xpath=//android.widget.TextView[@text='Quick Response']/parent::*";// Need
	public static final String btn_Dashboard_ActiveChat_Send = "Send Button in ActiveChat#xpath=//android.view.ViewGroup[@content-desc='send']";// Need
	public static final String txt_Dashboard_ActiveChat_ChatTextBox = "Chat Type Box in ActiveChat#xpath=//android.widget.EditText[contains(@content-desc,'Type your message here')]";// Need

	public static final String lst_Dashboard_ActiveChat_QuickResponses = "Quick Responses messages in Active Chat Page#xpath=//*[@text='Quick Response']/parent::*/following-sibling::android.widget.ScrollView//android.widget.TextView";// Need
	// ID

	// Notifications

	public static final String lbl_Notification_Pageheader = "Notifications Header #xpath=//android.widget.TextView[@text='Notifications']";
	public static final String btn_Notification_VerticalEllipses = "Vertiocal Ellipses in notification Screen#xpath=//android.widget.TextView[@text='Notifications']/following-sibling::*";

	public static final String btn_Notification_MarkAllasRead = " Mark All Read in ellipse Screen#xpath=//*[@text='Mark all as Read']";
	public static final String btn_Notification_NotificationSetting = " Notification Setting in ellipse Screen#xpath=//*[@text='Notification Settings']";

	public static final String btn_Notification_All = " All In Notification screen#xpath=//android.widget.TextView[contains(@text,'All')]/parent::*";
	public static final String btn_Notification_Schedule = "Schedule In Notification screen#xpath=//android.widget.TextView[contains(@text,'Schedule')]/parent::*";
	public static final String btn_Notification_Chat = " Chat In Notification screen#xpath=//android.widget.TextView[contains(@text,'Chats')]/parent::*";
	public static final String btn_Notification_Other = "Other In Notification screen#xpath=//android.widget.TextView[contains(@text,'Other')]/parent::*";

	public static final String img_Notification_Chat = " Chat Image In Notification screen#xpath=//android.widget.ScrollView/android.view.ViewGroup//android.widget.TextView[contains(@text,'')]";

	// Page Patient in DoctorApp

	public static final String lbl_PatientsPage_PatientsHeader = "Patient Header in patientscreen#xpath=(//android.widget.TextView[contains(@text,'Patients')])[1]";
	public static final String btn_PatientsPage_searchIcon = "Search Icon in Addpatient screen#xpath=(//android.widget.TextView[contains(@text,'Patients')])[1]//parent::*//android.view.ViewGroup";
	public static final String val_PatientsPage_Search = "Search Text Box#xpath=//android.widget.EditText";
	public static final String lbl_PatientsPage_Patientlist = "Patient list in patients page#xpath=//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup";
	public static final String btn_PatientsPage_AddPatient = "Addpatient screen#xpath=//android.widget.TextView[@text='Add Patient']";
	public static final String btn_PatientsPage_AddPatient_FirstName = "FirstName  in Addpatient screen#xpath=//android.view.ViewGroup[@resource-id='FirstName']//android.widget.EditText";
	public static final String btn_PatientsPage_AddPatient_LastName = "LastNamein Addpatient screen#xpath=//android.view.ViewGroup[@resource-id='LastName']//android.widget.EditText";
	public static final String btn_PatientsPage_AddPatient_Genderlist = "Gender in Addpatient screen#xpath=//android.view.ViewGroup[@resource-id='selectGender']//android.widget.TextView";
	public static final String btn_PatientsPage_AddPatient_MobileNumber = "MobileNumber in Addpatient screen#xpath=//android.view.ViewGroup[@resource-id='mobileNumber']//android.widget.EditText";
	public static final String btn_PatientsPage_AddPatient_RegisterPatients = "RegisterPatients in Addpatient screen#xpath=//android.widget.TextView[@text='Register Patient']//parent::*";
	public static final String btn_PatientsPage_AddPatient_GenderMale = "Male Gender in Addpatient screen#xpath=//android.widget.TextView[contains(@text,'Male')]/parent::*";
	public static final String lbl_PatientsPage_BackButton = "Patients Screen Back Button#xpath=//android.widget.TextView[@text = '']";
	public static final String lbl_PatientsPage_NoPatients = "No Patients#xpath=//android.widget.TextView[@text = 'No patients']";

	// Doctor Appointments Page
	public static final String lbl_DoctorAppointmentsPage_Title = "Appointments Title#xpath=//android.view.ViewGroup[@resource-id = 'ellipseicon']/preceding-sibling::android.widget.TextView[@text = 'Appointments']";
	public static final String lbl_DoctorAppointmentsPage_MonthYear = "Appointments Page Month Year#xpath=//android.widget.TextView";
	public static final String drp_DoctorAppointmentsPage_CalendarDrpdwn = "Appointments Page Calendar Dropdown#xpath=(//android.widget.TextView[''])[3]";
	public String lbl_DoctorAppointmentsPage_CalendarDate = "Appointments Page Calendar Page#xpath=//android.widget.TextView[@text = '<<DATE>>']";
	public static final String btn_DoctorAppointmentsPage_AddEvent = "Appointments Page Add Event#xpath=//android.widget.TextView[@text = 'Add Event']/parent::*";

	// Doctor Event Page
	public static final String drp_DoctorAppointmentsPage_SelectEvent = "Select Event Dropdown#xpath=//android.view.ViewGroup[@resource-id = 'text-input-outline']";
	public static final String lst_DoctorAppointmentsPage_SelectEvent = "Select Event From List#xpath=//android.view.View//android.widget.TextView";
	public static final String btn_DoctorAppointmentsPage_EventCloseIcon = "Close Icon#xpath=//android.view.ViewGroup[@resource-id = 'closeIcon']";

	// Away Time Doctor Event Page
	public static final String txt_DoctorAppointmentsPage_EventStartDate = "Start Date#xpath=//android.widget.TextView[@text = 'Start Date *']/parent::*/following-sibling::android.widget.EditText";
	public static final String txt_DoctorAppointmentsPage_EventEndDate = "End Date#xpath=//android.widget.TextView[@text = 'End Date *']/parent::*/following-sibling::android.widget.EditText";
	public static final String txt_DoctorAppointmentsPage_EventAddDesc = "Add Description#xpath=//android.widget.TextView[@text = 'Add Description *']/parent::*/following-sibling::android.widget.EditText";
	public static final String btn_DoctorAppointmentsPage_EventBlockCalendar = "Block Calendar#xpath=//android.widget.TextView[@text = 'Block Calendar']/parent::*";

	// Appointment Doctor Event Page
	public static final String txt_DoctorAppointmentsPage_AppointmentEventAddDesc = "Add Description#xpath=//android.widget.TextView[@text = 'Add Description']/parent::*/following-sibling::android.widget.EditText";
	public static final String txt_DoctorAppointmentsPage_AppointmentEventStartDate = "Start Date#xpath=//android.widget.TextView[@text = 'Start Date']/parent::*/following-sibling::android.widget.EditText";
	public static final String txt_DoctorAppointmentsPage_AppointmentEventSelectPatient = "Select Patient#xpath=//android.widget.TextView[@text = 'Select Patient']/parent::*/following-sibling::android.widget.EditText";
	public static final String txt_DoctorAppointmentsPage_AppointmentEventReminder = "Event Reminder#xpath=//android.widget.TextView[@text = 'Event Reminder']/parent::*/following-sibling::android.widget.EditText";

	// Doctor Dashboard Page
	public static final String lst_Dashboard_ActiveChatPanel = "Active Chats List#xpath=//android.view.ViewGroup[@resource-id='activeChat']/android.view.ViewGroup";

	// Doctor Rx Summary Page
	public static final String lbl_DoctorRxSummaryPage_PatientDetails = "Patient Details#xpath=//android.widget.TextView[@text = 'Patient Details']";
	public static final String lbl_DoctorRxSummaryPage_Gender = "Gender#xpath=//android.widget.TextView[@text = 'Gender']";
	public static final String lbl_DoctorRxSummaryPage_Age = "Age#xpath=//android.widget.TextView[@text = 'Age']";
	public static final String lbl_DoctorRxSummaryPage_Height = "Height#xpath=//android.widget.TextView[@text = 'Height']";
	public static final String lbl_DoctorRxSummaryPage_Weight = "Weight#xpath=//android.widget.TextView[@text = 'Weight']";
	public static final String txt_DoctorRxSummaryPage_ChiefComplaints = "Chief Complaints EditText#xpath=//android.widget.EditText";
	public static final String lbl_DoctorRxSummaryPage_ChiefComplaints = "Chief Complaints Character Limit#xpath=//android.widget.EditText/following-sibling::android.widget.TextView";

	public static final String btn_DoctorRxSummaryPage_ProvisionalDiagnosisAdd = "Provisional Diagnosis Add Button#xpath=//android.widget.TextView[@text = 'Provisional Diagnosis *']/following-sibling::*";
	public static final String btn_DoctorRxSummaryPage_MedicineAdd = "Medicine Add Button#xpath=//android.widget.TextView[@text = 'Medicine']/following-sibling::*/android.view.ViewGroup//android.widget.TextView";
	public static final String btn_DoctorRxSummaryPage_MedicineAdd_Back = "Add Medicine Back Button#xpath=//android.view.ViewGroup[@resource-id = 'searchIcon']/android.view.ViewGroup";
	public static final String btn_DoctorRxSummaryPage_LabInvestigationAdd = "Lab Investigation Add Button#xpath=//android.widget.TextView[@text = 'Lab Investigation']/following-sibling::*";
	public static final String btn_DoctorRxSummaryPage_FollowUpDateAdd = "Follow Up Date Add Button#xpath=//android.widget.TextView[@text = 'Follow Up Date*']/following-sibling::*";

	public static final String txt_DoctorRxSummaryPage_GeneralAdvice = "General Advice EditText#xpath=//android.widget.TextView[@text = 'General Advice']/following-sibling::*/android.widget.EditText";
	public static final String chk_DoctorRxSummaryPage_SelectCheckBox = "Accept Conditions Check Box#xpath=//android.widget.TextView[@text = '󰄱']/parent::*";
	public static final String btn_DoctorRxSummaryPage_SendButton = "Send Button#xpath=//android.widget.TextView[@text = 'Send']/parent::*";

	// More Page in Doctor Application

	public static final String lbl_MorePage_Profile = "Profile in More page#xpath=//android.widget.TextView[@text='Profile']/parent::*";
	public static final String lbl_MorePage_ManageStaff = "Manage staff in More page#xpath=//android.widget.TextView[@text='Manage Staff']/parent::*";
	public static final String lbl_MorePage_Settings = "Settings in More page#xpath=//android.widget.TextView[@text='Settings']/parent::*";
	public static final String lbl_MorePage_Support = "Support in More page#xpath=//android.widget.TextView[@text='Support']/parent::*";

	public static final String lbl_MorePage_Feedback = "Feedback in More page#xpath=//android.widget.TextView[@text='Feedback']";
	public static final String lbl_MorePage_TermsandConditions = "Terms and Conditions in More page#xpath=//android.widget.TextView[@text='Terms & Conditions']";
	public static final String lbl_MorePage_InviteMorePractioners = "Invite more practioners in More page#xpath=//android.widget.TextView[@text='Invite fellow practitioners']/parent::*";

	// Terms and Conditions in More
	public static final String icn_MorePage_TermsAndConditions_iIcon = "I Button under Terms and Conditions in Hamburger Menu#xpath=//android.widget.TextView[contains(@text,'Terms and Conditions')]/parent::*//android.widget.ImageView";
	public static final String btn_MorePage_TermsAndConditions_Close = "X Button under Terms and Conditions in Hamburger Menu#xpath=//android.widget.TextView[contains(@text,'Terms and Conditions')]/parent::*/preceding-sibling::*";

	// Feedback in More page

	public static final String btn_MorePage_feedback_Helptext = "Help text in the Feedback page#xpath=//android.widget.TextView[contains(@text,'Share your feedback')]";
	public static final String btn_MorePage_feedback_Support = "Support button in the Feedback page#xpath=//android.view.ViewGroup[@resource-id='ellipseicon']";
	public static final String btn_MorePage_feedback_BackChevron = "back chevron in the Feedback page#xpath=//android.widget.TextView[@text='Feedback']/preceding::android.view.ViewGroup//android.widget.TextView";

	public static final String txt_MorePage_feedback_FeedbackTextBox = "Feedback text box in Feedback page#xpath=//android.widget.EditText[contains(@text,'Enter Text Here')]";
	public static final String btn_MorePage_feedback_FeedbackWordCount = "Word Count in the Feedback page#xpath=//android.widget.TextView[contains(@text,'2000')]";

	// Support

	public static final String lbl_MorePage_Support_OnGoing = "Ongoing Label in the Support page#xpath=//android.view.ViewGroup//android.widget.TextView[contains(@text,'Ongoing')]";
	public static final String lbl_MorePage_SupportHeader = "Support Header in More Page#xpath=//android.widget.TextView[@text='Support']";

	public static final String lst_MorePage_Support_Tickets = "Support Page List Of Tickets#xpath=//android.widget.TextView[contains(@text,'Ticket ID')]/following-sibling::android.widget.TextView[1]";
	public static final String lbl_MorePage_Support_TicketDetails = "Support Page Ticket Details#xpath=//android.widget.TextView[@text='Ticket Detail']";
	public static final String lbl_MorePage_Support_TicketID = "Support Page Ticket ID#xpath=//android.widget.TextView[contains(@text,'Ticket ID')]";
	public static final String lbl_MorePage_Support_TicketNumber = "Support Page Ticket Number#xpath=//android.widget.TextView[contains(@text,'Ticket ID')]/following-sibling::*[contains(@text,'#')]";
	public static final String lbl_MorePage_Support_TicketGroup = "Support Page Ticket Group Value#xpath=//android.widget.TextView[contains(@text,'Ticket ID')]/parent::*/android.view.ViewGroup/android.widget.TextView[1]";// need
	// IDs
	// //
	// followings
	public static final String lbl_MorePage_Support_TicketTitle = "Ticket title val page from supportpage#xpath=//android.widget.TextView[contains(@text,'Ticket ID')]/parent::*/android.view.ViewGroup/android.widget.TextView[3]";
	public static final String lbl_MorePage_Support_TicketDateandTime = "Ticket Date and time label page from supportpage#xpath=//android.widget.TextView[contains(@text,'Ticket ID')]/parent::*/android.view.ViewGroup/android.widget.TextView[4]";
	public static final String lbl_MorePage_Support_TicketStatus = "Ticket Status label page from supportpage#xpath=(//android.widget.TextView[contains(@text,'Ticket ID')]/parent::*//android.view.ViewGroup//android.widget.TextView)[5]";
	public static final String btn_MorePage_Support_BackChevron = "back chevron in the Support page#xpath=//android.widget.TextView[@text='Ticket Detail']/preceding::android.view.ViewGroup//android.widget.TextView";

	public static final String lbl_MorePage_Support_FAQ = "FAQ  in Support Screen#xpath=//android.widget.TextView[contains(@text,'Frequently Asked Questions')]";
	public static final String lst_MorePage_Support_FAQ = "List of FAQ  in Support Screen#xpath=//android.widget.TextView[contains(@text,'Frequently Asked Questions')]/following-sibling::android.view.ViewGroup/android.widget.TextView[1]";
	public static final String btn_MorePage_Support_PatientPlan = "List of FAQ  in Support Screen#xpath=//android.widget.TextView[contains(@text,'Patient plans')]/parent::*";

	public static final String lst_MorePage_Support_FAQRightChevron = "List of FAQ  in Support Screen #xpath=//android.widget.TextView[contains(@text,'Frequently Asked Questions')]/following-sibling::android.view.ViewGroup/android.widget.TextView[contains(@text,'Doctor')]";
	public static final String lst_MorePage_FAQ_Header = "FAQ Header in support page#xpath=//android.widget.TextView[@text='FAQs']";
	public static final String btn_MorePage_FAQ_MessageUs = "Message us button in FAQ Page#xpath=//android.widget.LinearLayout[contains(@resource-id,'freshchat_contact_us_group')]";
	public static final String btn_MorePage_FAQ_BackButton = "Back button in FAQ Page#xpath=//android.widget.ImageButton[@content-desc='Navigate up']";
	public static final String btn_MorePage_FAQ_Search = "Search button in FAQ Page#xpath=//android.widget.TextView[@content-desc='Search']";

	public static final String lbl_MorePage_Support_ContactUs = "Contact Us in Support Screen#xpath=//android.widget.TextView[@text='Contact Us']";
	public static final String lbl_MorePage_Support_Category = "Category under Contact Us#xpath=//android.widget.TextView[@text='Category']";
	public static final String drp_MorePage_Support_Category = "Drop down Category under Contact Us#xpath=//android.widget.TextView[@text = 'Category']/following::*//android.view.ViewGroup[@resource-id ='text-input-outline']";
	public String txt_Category_CategoryValue = "Category Value#xpath=//android.widget.TextView[@text = '<<CATEGORY>>']";

	public static final String lbl_MorePage_Support_Subcategory = "SubCategory under Contact Us #xpath=//android.widget.TextView[@text='Sub Category']";
	public static final String drp_MorePage_Support_SubCategory = "Drop down Category under Contact Us#xpath=//android.widget.TextView[@text ='Sub Category']/following::*//android.view.ViewGroup[@resource-id ='text-input-outline']";
	public String txt_Category_SubCategoryValue = "sub Category Value#xpath=//android.widget.TextView[@text = '<<SUBCATEGORY>>']";

	public static final String lbl_MorePage_Support_Message = "Message under Contact Us#xpath=//android.widget.TextView[@text='Message']";
	public static final String txt_MorePage_Support_Message = "Message under Contact Us#xpath=//android.widget.EditText[@text='Type your message here']";
	public static final String txt_MorePage_Contact_MessageTextBox = "Contact  Message TextBoxtext box in Support page#xpath=//android.widget.EditText[contains(@text,'Type your message here')]";
	public static final String btn_MorePage_Contact_MessageWordCount = "Word Count in the Support page#xpath=//android.widget.TextView[contains(@text,'2000')]";

	public static final String btn_MorePage_Support_Submit = "Submit Button in Support page#xpath=//android.widget.TextView[@text='Submit']/parent::*";
	public static final String btn_MorePage_Support_Call = "Call Button in Support page#xpath=//android.widget.TextView[@text='Call']/parent::*";

	public static final String lbl_MorePage_Support_TicketHistory = "Ticket History in Support#xpath=//android.widget.TextView[@text='Ticket History']";

	// profile
	public static final String btn_More_profile = "profile icon in more optionr#xpath=//android.widget.TextView[@text='Profile']/parent::*";
	public static final String btn_More_profile_personalDetails = "personalDetails IN profile#xpath=//android.widget.TextView[@text='Personal Details']/parent::*";
	public static final String btn_More_profile_clinicDetails = "clinicDetails In profile#xpath=//android.widget.TextView[@text='Clinic Details']/parent::*";
	public static final String btn_More_profile_professionalDetails = "professionalDetails IN profile#xpath=//android.widget.TextView[@text='Professional Details']/parent::*";
	public static final String btn_More_profile_prescriptionMnanagement = "prescriptionMnanagement IN profile#xpath=//android.widget.TextView[@text='Prescription Management']/parent::*";
	public static final String btn_More_profile_MyDocument = "MyDocument IN profile#xpath=//android.widget.TextView[@text='My Documents']/parent::*";

	// personal
	public static final String btnSupportIcons_More_profile_support = "QuestienMark IN profile#xpath=//android.view.ViewGroup[@resource-id='ellipseicon']";
	public static final String lbl_profile_profileIcon = "supportIcon IN profile#xpath=(//android.widget.TextView[@text='Ongoing'])[1]";

	public static final String lbl_More_profile_personalDetails_FirstName = " FirstName in Personal Detail Page#xpath=//android.widget.TextView[contains(@text,'First Name *')]";
	public static final String lbl_More_profile_personalDetails_LastNmae = "LastName in Personal Detail Page#xpath=//android.widget.TextView[contains(@text,'Last Name *')]";
	public static final String lbl_More_profile_personalDetails_Gender = "Gender in Personal Detail Page#xpath=//android.widget.TextView[contains(@text,'Gender *')]";
	public static final String lbl_More_profile_personalDetails_primaryPhoneNumber = "Primary Phone Number in Personal Detail Page#xpath=//android.widget.TextView[contains(@text,'Primary Phone Number *')]";
	public static final String lbl_More_profile_personalDetails_SecondaryPhoneNumber = "secondary phoneNumber in Personal Detail Page#xpath=//android.widget.TextView[contains(@text,'Secondary Phone Number *')]";
	public static final String lbl_More_profile_personalDetails_EmailId = "EMail iD in Personal Detail Page#xpath=//android.widget.TextView[contains(@text,'Email ID *')]";
	public static final String txt_More_profile_personalDetails_display = "Dispaly text in Personal Detail Page#xpath=(//android.widget.TextView[contains(@text,'Email ID *')]/following-sibling::android.widget.TextView)[2]";
	public static final String btn_DoctorPersonalDetails_BackButton = "Personal Details Back Button#xpath=//android.view.ViewGroup[@resource-id = 'backIcon']/android.view.ViewGroup";

	// clinic
	public static final String lbl_More_ClinicDetails_clinicName = "clinicName in Clinic Detail Page#xpath=//android.widget.TextView[contains(@text,'Clinic Name')]";
	public static final String lbl_More_ClinicDetails_phoneNumber = "phoneNumber in Clinic Detail Page#xpath=//android.widget.TextView[contains(@text,'Phone Number')]";
	public static final String lbl_More_ClinicDetails_Timing = "Timing in Clinic Detail Page#xpath=//android.widget.TextView[contains(@text,'Timings')]";
	public static final String lbl_More_ClinicDetails_Address = "Address in Clinic Detail Page#xpath=//android.widget.TextView[contains(@text,'Address')]";
	public static final String lbl_More_ClinicDetails_City = "city in Clinic Detail Page#xpath=//android.widget.TextView[contains(@text,'City')]";
	public static final String lbl_More_ClinicDetails_state = "State in Clinic Detail Page#xpath=//android.widget.TextView[contains(@text,'State')]";
	public static final String txt_More_ClinicDetails_Display = "Dispaly Text in Clinic Detail Page#xpath=//android.view.ViewGroup[@resource-id='Bottomtext']//android.widget.TextView";
	public static final String btn_DoctorClinicDetails_BackButton = "Clinic Details Back Button#xpath=//android.view.ViewGroup[@resource-id = 'backIcon']/android.view.ViewGroup";

	// professional
	public static final String lbl_More_professional_QualificationDetails = "HighestQualification in Professional Detail#xpath=//android.widget.TextView[@text='Qualification Details']";
	public static final String lbl_More_professional_HighestQualification = "HighestQualification in Professional Detail#xpath=(//android.widget.TextView[contains(@text,'Highest Qualification')])[1]";
	public static final String lbl_More_professional_OtherQualifiaction = "clinicName in Professional Detail#xpath=//android.widget.TextView[contains(@text,'Other Qualification Details')]";
	public static final String lbl_More_professional_Specialaziation = "Specialaziation in Professional Detail#xpath=//android.widget.TextView[contains(@text,'Specialization')]";
	public static final String lbl_More_professional_Experience = "Experience in Professional Detail#xpath=//android.widget.TextView[contains(@text,'Experience (in years)')]";
	public static final String lbl_More_professional_RegistratinonNumber = "RegistratinonNumber in Professional Detail#xpath=//android.widget.TextView[contains(@text,'Registration Number')]";
	public static final String lbl_More_professional_Council = "Council in Professional Detail#xpath=//android.widget.TextView[contains(@text,'Council')]";
	public static final String txt_More_professional_Display = "Dispaly Message in Professional Detail#xpath=//android.widget.TextView[@resource-id='Bottomtext']";
	public static final String btn_DoctorProfessionalDetails_BackButton = "Professional Details Back Button#xpath=//android.view.ViewGroup[@resource-id = 'backIcon']/android.view.ViewGroup";

	// prescription management
	public static final String lbl_More_prescriptionManagemant_AddressOnPrescription = "AddressOnPrescription in prescriptionManagemantScreen#xpath=//android.widget.TextView[contains(@text,'Address on Prescription')]";
	public static final String lbl_prescriptionManagemant_DigitalSignature = "digitalSignature in prescriptionManagemantScreen#xpath=//android.widget.TextView[contains(@text,'Digital Signature')]";
	public static final String btn_DoctorPrescriptionManagement_BackButton = "Prescription Management Back Button#xpath=//android.view.ViewGroup[@resource-id = 'backIcon']/android.view.ViewGroup";

	// Document
	public static final String lbl_More_MyDocuments = "MyDocuments in profile Section#xpath=//android.widget.TextView[contains(@text,'Upload Document')]";
	public static final String txt_MyDocuments = "MyDocuments text in DocumentSection#xpath=//android.widget.TextView[contains(@text,'Upload Document')]/following-sibling::*";
	public static final String btn_DoctorMyDocuments_BackButton = "My Documents Back Button#xpath=//android.view.ViewGroup[@resource-id = 'backIcon']/android.view.ViewGroup";

	// Settings
	public static final String btn_More_Setting = " Setting in more Icon #xpath=//android.widget.TextView[@text='Settings']";
	public static final String btn_More_Setting_BankAccountDetails = "BankDetails in Setting screen#xpath=//android.widget.TextView[contains(@text,'Bank Account Details')]";
	public static final String btn_More_Setting_ConsultationDetails = "consultationDetails in Setting screen#xpath=//android.widget.TextView[contains(@text,'Consultation Details')]";
	public static final String btn_More_Setting_PasswordAndSecurity = "passwordAndSecurity in Setting screen#xpath=//android.widget.TextView[contains(@text,'Password & Security')]";
	public static final String btn_More_Setting_Notification = "Notification in Setting screen#xpath=//android.widget.TextView[contains(@text,'Notifications')]";

	public static final String btn_More_BackChevron = "Backchevron in Setting screen#xpath=//android.widget.TextView[@text = '']/parent::*";
	public static final String lbl_More_SupportIcon = "Questien mark in Setting screen#xpath=(//android.widget.TextView[contains(@text,'Settings')]/parent::*/android.view.ViewGroup)[2]";

	// 1

	public static final String lbl_Settings_BankDetails_IFSC = "IFSC code Header name in BankPage #xpath=(//android.widget.TextView[contains(@text,'IFSC')])[1]";
	public static final String lbl_Settings_BankDetails_BankName = "Bank name label in BankPage #xpath=(//android.widget.TextView[contains(@text,'Bank Name')])[1]";
	public static final String lbl_Settings_BankDetails_BranchName = "Brach name label  in BankPage #xpath=(//android.widget.TextView[contains(@text,'Branch Name')])[1]";
	public static final String lbl_Settings_BankDetails_CityName = "City name label  in BankPage #xpath=(//android.widget.TextView[contains(@text,'City Name')])[1]";
	public static final String lbl_Settings_BankDetails_AccountNumber = "Account Number label  in BankPage #xpath=(//android.widget.TextView[contains(@text,'Account Number')])[1]";
	public static final String lbl_Settings_BankDetails_BeneficiaryName = "Benificiary Label in BankPage #xpath=(//android.widget.TextView[contains(@text,'Beneficiary Name')])[1]";

	public static final String val_Settings_BankDetails_IFSC = "IFSC code Header name in BankPage #xpath= (//android.widget.TextView[contains(@text,'IFSC')]/parent::*/following::android.widget.EditText)[1]";
	public static final String val_Settings_BankDetails_BankName = "Bank name value in BankPage #xpath=(//android.widget.TextView[contains(@text,'Bank Name')]/parent::*/following::android.widget.EditText)[1]";
	public static final String val_Settings_BankDetails_BranchName = "Branch name value in BankPage #xpath=(//android.widget.TextView[contains(@text,'Branch Name')]/parent::*/following::android.widget.EditText)[1]";
	public static final String val_Settings_BankDetails_CityName = "City name vaue in BankPage #xpath=(//android.widget.TextView[contains(@text,'City Name')]/parent::*/following::android.widget.EditText)[1]";
	public static final String val_Settings_BankDetails_AccountNumber = "Account number value in BankPage #xpath=(//android.widget.TextView[contains(@text,'Account Number')]/parent::*/following::android.widget.EditText)[1]";
	public static final String val_Settings_BankDetails_BeneficiaryName = "Benificiary name  value in BankPage #xpath=(//android.widget.TextView[contains(@text,'Beneficiary Name')]/parent::*/following::android.widget.EditText)[1]";

	// 2

	public static final String lbl_More_Setting_ConsultationDetails_consultationType = "ConsultationType in consultationDetails screen#xpath=//android.widget.TextView[@text='Consultation Type']/parent::android.view.ViewGroup/following-sibling::android.widget.EditText";
	public static final String lbl_More_Setting_ConsultationDetails_ConsultationFee = "ConsultationFee in consultationDetails screen#xpath=//android.widget.TextView[@text='Consultation Fee ₹']/parent::android.view.ViewGroup/following-sibling::android.widget.EditText";
	public static final String lbl_More_Setting_ConsultationDetails_SlotDuration = "SlotDuration in consultationDetails screen#xpath=//android.widget.TextView[@text='Slot Duration']/parent::android.view.ViewGroup/following-sibling::android.widget.EditText";
	public static final String lbl_More_Setting_ConsultationDetails_ADD = "Add in consultationDetails screen#xpath=//android.widget.TextView[@text='+']";
	public static final String lbl_More_Setting_ConsultationDetails_Save = "save in consultationDetails screen#xpath=//android.widget.TextView[@text='Save']";

	public static final String val_More_Setting_ConsultationDetails_consultationType = "consultationType in consultationDetails screen#xpath=(//android.widget.TextView[contains(@text,'Consultation Type')]/parent::*/following::android.widget.EditText)[1]";
	public static final String val_More_Setting_ConsultationDetails_consultationFee = "consultationfee in consultationDetails screen#xpath= (//android.widget.TextView[contains(@text,'Consultation Fee ₹')]/parent::*/following::android.widget.EditText)[1]";
	public static final String val_More_Setting_ConsultationDetails_SlotDuration = "slotDuration in consultationDetails screen#xpath=(//android.widget.TextView[contains(@text,'15 minutes')]/parent::*/following::android.widget.EditText)[1]";

	// 3
	public static final String lbl_More_Setting_PasswordAndSecurity_ChangePassword = "ChangePassword inpasswordAndSecurity screen#xpath=//android.widget.TextView[contains(@text,'Change Password')]";
	public static final String val_More_Setting_PasswordAndSecurity_CurrentPassword = "CurrentPassword inpasswordAndSecurity screen#xpath=//android.widget.TextView[contains(@text,'Current Password')]";
	public static final String val_More_Setting_PasswordAndSecurity_NewPassword = "NewPassword in passwordAndSecurity screen#xpath=//android.widget.TextView[contains(@text,'New Password')]";
	public static final String val_More_Setting_PasswordAndSecurity_ConfirmNewPassword = "ConfirmNewPassword in passwordAndSecurity screen#xpath=//android.widget.TextView[contains(@text,'Confirm New Password')]";
	public static final String btn_More_Setting_PasswordAndSecurity_UpdatePassword = "UpdatePassword in passwordAndSecurity screen#xpath=//android.widget.TextView[contains(@text,'Update Password')]";

	// 4
	public static final String lbl_More_Setting_Notification_Schedule = "Schedule in Notification screen#xpath=//android.widget.TextView[contains(@text,'Schedule')]/following-sibling::android.widget.Switch";
	public static final String lbl_More_Setting_Notification_AlertAndChart = "Notification screen#xpath=//android.widget.TextView[contains(@text,'Alerts and Chats')]/following-sibling::android.widget.Switch";
	public static final String lbl_More_Setting_Notification_GeneralNotification = "Notification screen#xpath=//android.widget.TextView[contains(@text,'General Notifications')]/following-sibling::android.widget.Switch";

	// InviteFellow Practioners
	public static final String lbl_MorePage_InviteFellowPractioners_OnBoarding = "Onboarding header in Invite Fellow practioners in More page#xpath=//android.widget.TextView[@text='Onboard Doctor']";
	public static final String btn_MorePage_InviteFellowPractioners_Invite = "Invite button in Invite Fellow practioners in More page#xpath=//android.widget.TextView[@text='Invite']/parent::*";

	public static final String txt_MorePage_InviteFellowPractioners_FirstName = "First Name under Onboarding in Invite Fellow practioners in More page#xpath=//android.view.ViewGroup[contains(@resource-id,'FirstName')]//android.widget.EditText";
	public static final String txt_MorePage_InviteFellowPractioners_LastName = "Last Name under Onboarding in Invite Fellow practioners in More page#xpath=//android.view.ViewGroup[contains(@resource-id,'LastName')]//android.widget.EditText";
	public static final String txt_MorePage_InviteFellowPractioners_EmailID = "Email ID under Onboarding in Invite Fellow practioners in More page#xpath=//android.view.ViewGroup[contains(@resource-id,'emailInput')]//android.widget.EditText";
	public static final String txt_MorePage_InviteFellowPractioners_MobileNumber = "Mobile Number under Onboarding in Invite Fellow practioners in More page#xpath=//android.view.ViewGroup[contains(@resource-id,'mobileNumber')]//android.widget.EditText";

	// ManageStaff
	public static final String lbl_MorePage_ManageStaff_MyStaff = "My Staff in manage Staff page#xpath=//android.widget.TextView[@text='My Staff']";
	public static final String btn_MorePage_ManageStaff_AddStaff = "Add Staff in managestaff page#xpath=//android.widget.TextView[contains(@text,'Add Staff')]";

	// Doctor Patients Tab >> Profile Screen
	public static final String lbl_PatientsPage_PatientName = "Patient Name#xpath=//android.widget.ScrollView//android.view.ViewGroup/android.widget.ImageView/following-sibling::android.widget.TextView[1]";
	public static final String lbl_PatientsPage_Age = "Patient Age#xpath=//android.widget.TextView[@text = 'Age']/following-sibling::android.widget.TextView[1]";
	public static final String lbl_PatientsPage_Height = "Patient Height#xpath=//android.widget.TextView[@text = 'Height']/following-sibling::android.widget.TextView[1]";
	public static final String lbl_PatientsPage_Weight = "Patient Weight#xpath=//android.widget.TextView[@text = 'Weight']/following-sibling::android.widget.TextView[1]";

	public static final String lbl_PatientsPage_Caregiver = "Patient Care Giver#xpath=//android.widget.TextView[@text = 'Caregiver']/following-sibling::android.widget.TextView[1]";
	public static final String lbl_PatientsPage_DX = "Patient DX#xpath=//android.widget.TextView[@text = 'Dx']/following-sibling::android.widget.TextView[1]";
	public static final String lbl_PatientsPage_SX = "Patient SX#xpath=//android.widget.TextView[@text = 'Sx']/following-sibling::android.widget.TextView[1]";
	public static final String lbl_PatientsPage_KCO = "Patient KCO#xpath=//android.widget.TextView[@text = 'K/C/O']/following-sibling::android.widget.TextView[1]";
	public static final String lbl_PatientsPage_LVEF = "Patient LVEF#xpath=//android.widget.TextView[@text = 'LVEF']/following-sibling::android.widget.TextView[1]";
	public static final String btn_PatientsPage_BackButton = "Patients Profile Back Button#xpath=//android.widget.TextView[@text = '']/parent::*";

	// Doctor Patients Tab >> Profile Screen
	public static final String lbl_PatientsPage_Vitals = "Patient Vitals#xpath=//android.widget.TextView[@text = 'Vitals']/parent::*";
	public static final String lbl_PatientsPage_Medications = "Patient Medications#xpath=//android.widget.TextView[@text = 'Medications']/parent::*";
	public static final String lbl_PatientsPage_Prescriptions = "Patient Prescriptions#xpath=//android.widget.TextView[@text = 'Prescriptions']/parent::*";
	public static final String lbl_PatientsPage_LastLabReports = "Patient Last Lab Reports#xpath=//android.widget.TextView[@text = 'Last lab reports']/parent::*";
	public static final String lbl_PatientsPage_Coach = "Patient Coach#xpath=//android.widget.TextView[@text = 'Coach']/parent::*";
	public static final String lbl_PatientsPage_AdherenceAlerts = "Patient Adherence Alerts#xpath=//android.widget.TextView[@text = 'Adherence alerts']/parent::*";

	public static final String lbl_PatientsPage_VitalsBP = "Patient BP#xpath=//android.widget.TextView[@text = 'Blood Pressure']";
	public static final String lbl_PatientsPage_VitalsHR = "Patient HR#xpath=//android.widget.TextView[@text = 'Heart Rate']";
	public static final String lbl_PatientsPage_VitalsBMI = "Patient BMI#xpath=//android.widget.TextView[@text = 'BMI']";
	public static final String lbl_PatientsPage_VitalsWeight = "Patient Weight#xpath=//android.widget.TextView[@text = 'Weight']";
	public static final String lbl_PatientsPage_VitalsHeight = "Patient Height#xpath=//android.widget.TextView[@text = 'Height']";// Check

	// Doctor Patients Tab >> History Screen
	public static final String lbl_PatientHistoryPage_ChatHistory = "Chat History#xpath=//android.widget.TextView[@text = 'Chat History']/parent::*";
	public static final String lbl_PatientHistoryPage_AppointmentHistory = "Appointment History#xpath=//android.widget.TextView[@text = 'Appointment History']/parent::*";

	// Doctor More Options >> Manage Staff >> Add Staff Screen
	public static final String lbl_DoctorMorePage_AddStaff_UploadYourPhoto = "Upload Your Photo#xpath=//android.widget.TextView[@text = 'Upload Your Photo']";
	public static final String lbl_DoctorMorePage_AddStaff_FirstName = "First Name#xpath=//android.view.ViewGroup[@resource-id = 'fisrtName']//android.widget.EditText";
	public static final String lbl_DoctorMorePage_AddStaff_LastName = "Last Name#xpath=//android.view.ViewGroup[@resource-id = 'lastName']//android.widget.EditText";
	public static final String lbl_DoctorMorePage_AddStaff_ClinicName = "Clinic Name#xpath=//android.view.ViewGroup[@resource-id = 'clinicName']//android.widget.EditText";
	public static final String lbl_DoctorMorePage_AddStaff_Role = "Role#xpath=//android.widget.TextView/parent::android.widget.Button";// Need
																																		// id
	public static final String lbl_DoctorMorePage_AddStaff_RoleReceptionist = "Receptionist Role#xpath=//android.widget.TextView[@text = 'Receptionist']";
	public static final String lbl_DoctorMorePage_AddStaff_RegistrationNumber = "Registration Number#xpath=//android.view.ViewGroup[@resource-id = 'registrationName']//android.widget.EditText";
	public static final String lbl_DoctorMorePage_AddStaff_MobileNumber = "Mobile Number#xpath=//android.view.ViewGroup[@resource-id = 'mobileNumber']//android.widget.EditText";
	public static final String lbl_DoctorMorePage_AddStaff_EmailInput = "Email Input#xpath=//android.view.ViewGroup[@resource-id = 'emailInput']//android.widget.EditText";
	public static final String lbl_DoctorMorePage_AddStaff_Next = "Next Button#xpath=//android.widget.TextView[@text = 'Next']/parent::*";
	public static final String lbl_DoctorMorePage_AddStaff_Scheduling = "Scheduling#xpath=//android.widget.TextView[@text = 'Scheduling']";
	public static final String lbl_DoctorMorePage_AddStaff_PatientManagement = "Patient Management#xpath=//android.widget.TextView[@text = 'Patient Management']";
	public static final String lbl_DoctorMorePage_AddStaff_Save = "Save Button#xpath=//android.widget.TextView[@text = 'Save']/parent::*";
	public static final String lbl_DoctorMorePage_AddStaff_Back = "Back Button#xpath=//android.widget.TextView[@text = 'Back']/parent::*";
	public String lbl_DoctorMorePage_MyStaff_Ellipse = "Required Staff Ellipse Button#xpath=//XCUIElementTypeStaticText[@name = '<<STAFFNAME>>']/parent::*/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther";
	public static final String lbl_DoctorMorePage_MyStaff_EllipseEdit = "Added Staff Edit Button#xpath=//XCUIElementTypeOther[@name = 'Edit']";
	public static final String lbl_DoctorMorePage_MyStaff_EllipsePermissions = "Added Staff View Permissions Button#xpath=//XCUIElementTypeOther[@name = 'Permissions']";
	public static final String lbl_DoctorMorePage_MyStaff_EllipseDelete = "Added Staff Delete Button#xpath=//XCUIElementTypeOther[@name = 'Delete']";
	public static final String lbl_DoctorMorePage_MyStaff_CancelButton = "Confirm Added Staff Cancel Button#xpath=//XCUIElementTypeOther[@name = 'Cancel']";
	public static final String lbl_DoctorMorePage_MyStaff_DeleteButton = "Confirm Added Staff Delete Button#xpath=//XCUIElementTypeOther[@name = 'Delete']";

	// Validation Banner
	public static final String lbl_DoctorMorePage_AddStaff_SuccessBanner = "Add Staff Success Banner#xpath=//android.widget.TextView[@text = 'Successfully added new staff.']";
	public static final String lbl_Dashboard_ActiveChat_ResolveChat_SuccessBanner = "Active Chat Mark As Resolved Success Banner#xpath=//android.widget.TextView[@text='Chat resolved']/parent::*";// Need
	public static final String lbl_DoctorConsultationDetails_SaveConsultation_SuccessBanner = "Consultation Details Save Success Banner#xpath=//android.widget.TextView[@text = 'Consultation details added successfully']/parent::*";

	// Doctor Application Consultation Details
	public static final String btn_DoctorConsultationDetails_Switch = "Consultation Details Switch Button#xpath=//android.widget.Switch";
	public static final String img_DoctorConsultationDetails_DeleteSlot = "Delete Slot#xpath=//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView/parent::*"; // Must
																																																																// need
																																																																// id
	public static final String btn_DoctorConsultationDetails_SelectDays = "Select Days#xpath=//android.widget.TextView[@text = 'Select Days']/following-sibling::android.view.ViewGroup/android.widget.TextView";
	public static final String btn_DoctorConsultationDetails_FromTime = "Select From Time#xpath=//android.widget.TextView[@text = 'From']/parent::*/following-sibling::android.view.ViewGroup[@resource-id = 'text-input-outline']";
	public static final String btn_DoctorConsultationDetails_ToTime = "Select To Time#xpath=//android.widget.TextView[@text = 'To']/parent::*/following-sibling::android.view.ViewGroup[@resource-id = 'text-input-outline']";
	public static final String btn_DoctorConsultationDetails_SelectTimeKeyboard = "Select keyboard#id=android:id/toggle_mode";
	public static final String btn_DoctorConsultationDetails_SetTimeHour = "Set Hour Time#id=android:id/input_hour";
	public static final String btn_DoctorConsultationDetails_SetTimeMinute = "Set Minute Time#id=android:id/input_minute";
	public static final String btn_DoctorConsultationDetails_TimeSlotOkButton = "Confirm Time Slot Ok Button#id=android:id/button1";
	public static final String btn_DoctorConsultationDetails_ConfirmButton = "Confirm Slot Button#xpath=//android.widget.TextView[@text = 'Confirm']/parent::*";
	public static final String btn_DoctorConsultationDetails_SaveButton = "Consultation Details Save Button#xpath=//android.widget.TextView[@text = 'Save']/parent::*";

}
