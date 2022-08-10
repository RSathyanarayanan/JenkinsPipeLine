package TestCases;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import apiScenarios.*;
import automationFramework.GenericKeywords;
import baseClass.BaseClass;
import scenarios.*;
import webScenarios.*;

@Listeners({ utilities.HtmlReport.class })
public class TestCases {
	private BaseClass obj;

	////////////////////////////////////////////////////////////////////////////////
	// Function Name :
	// Purpose :
	// Parameters :
	// Return Value :
	// Created by :
	// Created on :
	// Remarks :
	/////////////////////////////////////////////////////////////////////////////////

	private void TestStart(String testCaseName) {

		obj.currentTestCaseName = testCaseName;
		obj.setEnvironmentTimeouts();
		obj.reportStart();
		obj.iterationCount.clear();
		obj.iterationCountInTextData();

	}

	@BeforeClass
	@Parameters({ "selenium.machinename", "selenium.host", "selenium.port", "selenium.browser", "selenium.os",
		"selenium.browserVersion", "selenium.osVersion", "TestData.SheetNumber" })
	public void precondition(String machineName, String host, String port, String browser, String os,
			String browserVersion, String osVersion, String sheetNo) {
		obj = new BaseClass();
		if (os.contains("Android")) {
			obj.startServer(host, port);
			obj.waitTime(10);
		}
		obj.orPackageName = "objectRepository";
		obj.setup(machineName, host, port, browser, os, browserVersion, osVersion, sheetNo);
	}

	@AfterClass
	public void closeSessions() {
		obj.closeAllSessions();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_PREREQ_001(Method method) {

		TestStart(method.getName());
		DoctorDashboardScenario doctorDashboardScenario = new DoctorDashboardScenario(obj);
		for (int i = 0; i < doctorDashboardScenario.iterationCount.size(); i++) {

			doctorDashboardScenario.dataRowNo = Integer
					.parseInt(doctorDashboardScenario.iterationCount.get(i).toString());
			doctorDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorDashboardScenario.verifyDoctorResolveActiveChat();
		}
		obj.testFailure = doctorDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //UAT_IND_064
	public void UAT_IND_PREREQ_002(Method method) {

		TestStart(method.getName());
		PatientConsultScenario patientConsultScenario = new PatientConsultScenario(obj);
		for (int i = 0; i < patientConsultScenario.iterationCount.size(); i++) {

			patientConsultScenario.dataRowNo = Integer
					.parseInt(patientConsultScenario.iterationCount.get(i).toString());
			patientConsultScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientConsultScenario.verifyPatientCanRaiseQueryWithDoctor();
		}
		obj.testFailure = patientConsultScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //UAT_IND_062
	public void UAT_IND_PREREQ_003(Method method) {

		TestStart(method.getName());
		DoctorMoreScenario doctorMoreScenario = new DoctorMoreScenario(obj);
		for (int i = 0; i < doctorMoreScenario.iterationCount.size(); i++) {

			doctorMoreScenario.dataRowNo = Integer
					.parseInt(doctorMoreScenario.iterationCount.get(i).toString());
			doctorMoreScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorMoreScenario.verifyDoctorCanAddSlotForConsultation();
		}
		obj.testFailure = doctorMoreScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //UAT_IND_060
	public void UAT_IND_PREREQ_004(Method method) {

		TestStart(method.getName());
		PatientConsultScenario patientConsultScenario = new PatientConsultScenario(obj);
		for (int i = 0; i < patientConsultScenario.iterationCount.size(); i++) {

			patientConsultScenario.dataRowNo = Integer
					.parseInt(patientConsultScenario.iterationCount.get(i).toString());
			patientConsultScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientConsultScenario.verifyPatientCanBookAppointmentSucessfullywithDoctor();
		}
		obj.testFailure = patientConsultScenario.testFailure;
		TestEnd();
	}


	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4702 4716
	public void UAT_IND_001(Method method) {

		TestStart(method.getName());
		PatientLoginScenario patientLoginScenario = new PatientLoginScenario(obj);
		for (int i = 0; i < patientLoginScenario.iterationCount.size(); i++) {

			patientLoginScenario.dataRowNo = Integer.parseInt(patientLoginScenario.iterationCount.get(i).toString());
			patientLoginScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientLoginScenario.verifyLaunchPageCarouselImages();
		}
		obj.testFailure = patientLoginScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4672
	public void UAT_IND_002(Method method) {

		TestStart(method.getName());
		PatientLoginScenario patientLoginScenario = new PatientLoginScenario(obj);
		for (int i = 0; i < patientLoginScenario.iterationCount.size(); i++) {

			patientLoginScenario.dataRowNo = Integer.parseInt(patientLoginScenario.iterationCount.get(i).toString());
			patientLoginScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientLoginScenario.verifyNewPatientLoginWithMobilenumber();
		}
		obj.testFailure = patientLoginScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4913
	public void UAT_IND_006(Method method) {

		TestStart(method.getName());
		PatientLoginScenario patientLoginScenario = new PatientLoginScenario(obj);
		for (int i = 0; i < patientLoginScenario.iterationCount.size(); i++) {

			patientLoginScenario.dataRowNo = Integer.parseInt(patientLoginScenario.iterationCount.get(i).toString());
			patientLoginScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientLoginScenario.verifyUserAbletoLoginWithEmail();
		}
		obj.testFailure = patientLoginScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4678
	public void UAT_IND_007(Method method) {

		TestStart(method.getName());
		PatientLoginScenario patientLoginScenario = new PatientLoginScenario(obj);
		for (int i = 0; i < patientLoginScenario.iterationCount.size(); i++) {

			patientLoginScenario.dataRowNo = Integer.parseInt(patientLoginScenario.iterationCount.get(i).toString());
			patientLoginScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientLoginScenario.verifyInvalidMobNoLoginErrorMessage();
		}
		obj.testFailure = patientLoginScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4918 4945
	public void UAT_IND_008(Method method) {

		TestStart(method.getName());
		PatientDashboardScenario patientDashboardScenario = new PatientDashboardScenario(obj);
		for (int i = 0; i < patientDashboardScenario.iterationCount.size(); i++) {

			patientDashboardScenario.dataRowNo = Integer
					.parseInt(patientDashboardScenario.iterationCount.get(i).toString());
			patientDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientDashboardScenario.verifyBioVitalsTilesAndDashboardScreen();
		}
		obj.testFailure = patientDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4732
	public void UAT_IND_009(Method method) {

		TestStart(method.getName());
		PatientVitalsScenario patientVitalsScenario = new PatientVitalsScenario(obj);
		for (int i = 0; i < patientVitalsScenario.iterationCount.size(); i++) {

			patientVitalsScenario.dataRowNo = Integer.parseInt(patientVitalsScenario.iterationCount.get(i).toString());
			patientVitalsScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientVitalsScenario.verifyVitalAndReportDashboard();
		}
		obj.testFailure = patientVitalsScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4686
	public void UAT_IND_010(Method method) {

		TestStart(method.getName());
		PatientVitalsScenario patientVitalsScenario = new PatientVitalsScenario(obj);
		for (int i = 0; i < patientVitalsScenario.iterationCount.size(); i++) {

			patientVitalsScenario.dataRowNo = Integer.parseInt(patientVitalsScenario.iterationCount.get(i).toString());
			patientVitalsScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientVitalsScenario.VerifyViewandDownloadLabReport();
		}
		obj.testFailure = patientVitalsScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4682 //4693
	public void UAT_IND_011(Method method) {

		TestStart(method.getName());
		PatientVitalsScenario patientVitalsScenario = new PatientVitalsScenario(obj);
		for (int i = 0; i < patientVitalsScenario.iterationCount.size(); i++) {

			patientVitalsScenario.dataRowNo = Integer.parseInt(patientVitalsScenario.iterationCount.get(i).toString());
			patientVitalsScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientVitalsScenario.verifyUploadLabReport();
		}
		obj.testFailure = patientVitalsScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4699 //4846
	public void UAT_IND_012(Method method) {

		TestStart(method.getName());
		PatientDashboardScenario patientDashboardScenario = new PatientDashboardScenario(obj);
		for (int i = 0; i < patientDashboardScenario.iterationCount.size(); i++) {

			patientDashboardScenario.dataRowNo = Integer
					.parseInt(patientDashboardScenario.iterationCount.get(i).toString());
			patientDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientDashboardScenario.verifyUserSelectOrDeSelectSymptoms();
		}
		obj.testFailure = patientDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4700 4864
	public void UAT_IND_013(Method method) {

		TestStart(method.getName());
		PatientDashboardScenario patientDashboardScenario = new PatientDashboardScenario(obj);
		for (int i = 0; i < patientDashboardScenario.iterationCount.size(); i++) {

			patientDashboardScenario.dataRowNo = Integer
					.parseInt(patientDashboardScenario.iterationCount.get(i).toString());
			patientDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientDashboardScenario.verifyPatientNavigatedToEmergencyWhenPrefedefinedSymptomsSelected();
		}
		obj.testFailure = patientDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4701
	public void UAT_IND_014(Method method) {

		TestStart(method.getName());
		PatientDashboardScenario patientDashboardScenario = new PatientDashboardScenario(obj);
		for (int i = 0; i < patientDashboardScenario.iterationCount.size(); i++) {

			patientDashboardScenario.dataRowNo = Integer
					.parseInt(patientDashboardScenario.iterationCount.get(i).toString());
			patientDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientDashboardScenario.verifyPatientNotNavigatedToEmergencyWhenPrefedefinedSymptomsSelected();
		}
		obj.testFailure = patientDashboardScenario.testFailure;
		TestEnd();
	}
	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4708 4711 4882
	public void UAT_IND_015(Method method) {

		TestStart(method.getName());
		PatientDashboardScenario patientDashboardScenario = new PatientDashboardScenario(obj);
		for (int i = 0; i < patientDashboardScenario.iterationCount.size(); i++) {

			patientDashboardScenario.dataRowNo = Integer
					.parseInt(patientDashboardScenario.iterationCount.get(i).toString());
			patientDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientDashboardScenario.verifySubmitBadMoodAndGetResponse();
		}
		obj.testFailure = patientDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4885 4902
	public void UAT_IND_016(Method method) {

		TestStart(method.getName());
		PatientDashboardScenario patientDashboardScenario = new PatientDashboardScenario(obj);
		for (int i = 0; i < patientDashboardScenario.iterationCount.size(); i++) {

			patientDashboardScenario.dataRowNo = Integer
					.parseInt(patientDashboardScenario.iterationCount.get(i).toString());
			patientDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientDashboardScenario.validateSelectOkMoodAndCheckAbleToProceedFurther();
		}
		obj.testFailure = patientDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4903
	public void UAT_IND_017(Method method) {

		TestStart(method.getName());
		PatientTasksScenario patientTasksScenario = new PatientTasksScenario(obj);
		for (int i = 0; i < patientTasksScenario.iterationCount.size(); i++) {

			patientTasksScenario.dataRowNo = Integer.parseInt(patientTasksScenario.iterationCount.get(i).toString());
			patientTasksScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientTasksScenario.verifySetAlarmGetAlert();

		}
		obj.testFailure = patientTasksScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4885 4902
	public void UAT_IND_018(Method method) {

		TestStart(method.getName());
		PatientDashboardScenario patientDashboardScenario = new PatientDashboardScenario(obj);
		for (int i = 0; i < patientDashboardScenario.iterationCount.size(); i++) {

			patientDashboardScenario.dataRowNo = Integer
					.parseInt(patientDashboardScenario.iterationCount.get(i).toString());
			patientDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientDashboardScenario.validateSelectGreatMoodAndCheckAbleToProceedFurther();
		}
		obj.testFailure = patientDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4744 4828 4829
	public void UAT_IND_019(Method method) {

		TestStart(method.getName());
		PatientTasksScenario patientTasksScenario = new PatientTasksScenario(obj);
		for (int i = 0; i < patientTasksScenario.iterationCount.size(); i++) {

			patientTasksScenario.dataRowNo = Integer.parseInt(patientTasksScenario.iterationCount.get(i).toString());
			patientTasksScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientTasksScenario.verifyPatientViewsTasksAssigned();
		}
		obj.testFailure = patientTasksScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4749
	public void UAT_IND_020(Method method) {

		TestStart(method.getName());
		PatientTasksScenario patientTasksScenario = new PatientTasksScenario(obj);
		for (int i = 0; i < patientTasksScenario.iterationCount.size(); i++) {

			patientTasksScenario.dataRowNo = Integer.parseInt(patientTasksScenario.iterationCount.get(i).toString());
			patientTasksScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientTasksScenario.verifyPatientCanUpdateStatusForAssignedTasksByCheckBox();
		}
		obj.testFailure = patientTasksScenario.testFailure;
		TestEnd();
	}
	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4936
	public void UAT_IND_021(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.verifyPatientDevicemanagementTaskUsingSettings();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_022(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.verifyPatientCanViewandEditProfileDetails();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_023(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.verifyPatientCanViewAndEditPassword();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4790
	public void UAT_IND_024(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.verifyPatientCanViewAndEditContactDetails();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_025(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.verifyPatientCanViewAndEditEmergencyDetails();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//


	@Test(alwaysRun = true)
	public void UAT_IND_026(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.verifyPatientSupportandFAQsFunctionality();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4761
	public void UAT_IND_027(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.verifyPatientCanViewAndEditAddressDetails();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4836 //4843 4893
	public void UAT_IND_028(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.verifyPatientCanViewAndUploadPrescription();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4900 4915 4797
	public void UAT_IND_029(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.verifyPatientRequestForMedicineChange();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4916
	public void UAT_IND_030(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyOrderMedicineFromPrescription();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) // Check on and off scenario
	public void UAT_IND_031(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyViewAndAccessManageNotifications();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) 
	public void UAT_IND_032(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyPrescriptionPageHealthProfile();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;


		TestEnd();
	}
	
	// *************************************************************************************************************//

			@Test(alwaysRun = true) //4941
			public void UAT_IND_033(Method method) {

				TestStart(method.getName());
				PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
				for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

					patientHamburgerMenuScenario.dataRowNo = Integer
							.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
					patientHamburgerMenuScenario.testStepInfo(
							"################################DataSet: " + (i + 1) + "################################");
					patientHamburgerMenuScenario.VerifyUIofHamburgerMenus();
				}
				obj.testFailure = patientHamburgerMenuScenario.testFailure;
				TestEnd();
			}


	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4941
	public void UAT_IND_037(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.VerifyPatientAboutUsOption();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}
	
	
	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_038(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.VerifyPatientAbletoProvideFeedback();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_039(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerMenuScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerMenuScenario.iterationCount.size(); i++) {

			patientHamburgerMenuScenario.dataRowNo = Integer
					.parseInt(patientHamburgerMenuScenario.iterationCount.get(i).toString());
			patientHamburgerMenuScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerMenuScenario.VerifyPatientTermsandConditions();
		}
		obj.testFailure = patientHamburgerMenuScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_040(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyAccessNewSubscriptionPlan();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_041(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyUserviewActiveSubscriptionPlan();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}
	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_042(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyMyDevicesUIAndClickBack();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_043(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyPatientConnectDisconnectTrustedDevices();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//
	@Test(alwaysRun = true) //4704 4719
	public void UAT_IND_044(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyPatientCanAccessDietAndWellnessPage();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//
	@Test(alwaysRun = true) //4687
	public void UAT_IND_045(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyPatientViewExercisePlanCurrentDate();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//
	@Test(alwaysRun = true)
	public void UAT_IND_046(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyPatientAccessOtherFunctionalitiesofExercisePage();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//
	@Test(alwaysRun = true) //4677 4683 4694- Check whether able to add
	public void UAT_IND_047(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyPatientCanViewDietGuidelines();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//
	@Test(alwaysRun = true) //4689
	public void UAT_IND_048(Method method) {

		TestStart(method.getName());
		PatientHamburgerMenuScenario patientHamburgerScenario = new PatientHamburgerMenuScenario(obj);
		for (int i = 0; i < patientHamburgerScenario.iterationCount.size(); i++) {

			patientHamburgerScenario.dataRowNo = Integer
					.parseInt(patientHamburgerScenario.iterationCount.get(i).toString());
			patientHamburgerScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientHamburgerScenario.verifyPatientCanViewExerciseGuidelines();
		}
		obj.testFailure = patientHamburgerScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4835
	public void UAT_IND_049(Method method) {

		TestStart(method.getName());
		PatientConsultScenario patientConsultScenario = new PatientConsultScenario(obj);
		for (int i = 0; i < patientConsultScenario.iterationCount.size(); i++) {

			patientConsultScenario.dataRowNo = Integer
					.parseInt(patientConsultScenario.iterationCount.get(i).toString());
			patientConsultScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientConsultScenario.verifyPatientCanAccessMyConsultationPageAndViewOnGoingProgress();
		}
		obj.testFailure = patientConsultScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_050(Method method) {

		TestStart(method.getName());
		PatientConsultScenario patientConsultScenario = new PatientConsultScenario(obj);
		for (int i = 0; i < patientConsultScenario.iterationCount.size(); i++) {

			patientConsultScenario.dataRowNo = Integer
					.parseInt(patientConsultScenario.iterationCount.get(i).toString());
			patientConsultScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientConsultScenario.verifyPatientRedirectAppointment();
		}
		obj.testFailure = patientConsultScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_051(Method method) {

		TestStart(method.getName());
		PatientConsultScenario patientConsultScenario = new PatientConsultScenario(obj);
		for (int i = 0; i < patientConsultScenario.iterationCount.size(); i++) {

			patientConsultScenario.dataRowNo = Integer
					.parseInt(patientConsultScenario.iterationCount.get(i).toString());
			patientConsultScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientConsultScenario.verifyProfessionalsDashboardfromMyConsultationsPage();
		}
		obj.testFailure = patientConsultScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) //4739
	public void UAT_IND_052(Method method) {

		TestStart(method.getName());
		PatientOrderScenario patientOrderScenario = new PatientOrderScenario(obj);
		for (int i = 0; i < patientOrderScenario.iterationCount.size(); i++) {

			patientOrderScenario.dataRowNo = Integer.parseInt(patientOrderScenario.iterationCount.get(i).toString());
			patientOrderScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientOrderScenario.verifyPatientCouldOrderLabTestFromStore();
		}
		obj.testFailure = patientOrderScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_053(Method method) {

		TestStart(method.getName());
		PatientOrderScenario patientOrderScenario = new PatientOrderScenario(obj);
		for (int i = 0; i < patientOrderScenario.iterationCount.size(); i++) {

			patientOrderScenario.dataRowNo = Integer.parseInt(patientOrderScenario.iterationCount.get(i).toString());
			patientOrderScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientOrderScenario.verifyPatientCouldOrderMedicinesFromStore();
		}
		obj.testFailure = patientOrderScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_054(Method method) {

		TestStart(method.getName());
		PatientOrderScenario patientOrderScenario = new PatientOrderScenario(obj);
		for (int i = 0; i < patientOrderScenario.iterationCount.size(); i++) {

			patientOrderScenario.dataRowNo = Integer.parseInt(patientOrderScenario.iterationCount.get(i).toString());
			patientOrderScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientOrderScenario.verifyPatientLogoutFromtheApplication();
		}
		obj.testFailure = patientOrderScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//
	@Test(alwaysRun = true)
	public void UAT_IND_055(Method method) {

		TestStart(method.getName());
		DoctorLoginScenario doctorLoginScenario = new DoctorLoginScenario(obj);
		for (int i = 0; i < doctorLoginScenario.iterationCount.size(); i++) {

			doctorLoginScenario.dataRowNo = Integer.parseInt(doctorLoginScenario.iterationCount.get(i).toString());
			doctorLoginScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorLoginScenario.verifyDoctorLaunchPageCarouselImages();
		}
		obj.testFailure = doctorLoginScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_056(Method method) {

		TestStart(method.getName());
		DoctorLoginScenario doctorLoginScenario = new DoctorLoginScenario(obj);
		for (int i = 0; i < doctorLoginScenario.iterationCount.size(); i++) {

			doctorLoginScenario.dataRowNo = Integer.parseInt(doctorLoginScenario.iterationCount.get(i).toString());
			doctorLoginScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorLoginScenario.verifyDoctorLoginWithInvalidCredsAndNavigateToForgotPasswordScreen();
		}
		obj.testFailure = doctorLoginScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_057(Method method) {

		TestStart(method.getName());
		DoctorPatientsScenario doctorPatientsScenario = new DoctorPatientsScenario(obj);
		for (int i = 0; i < doctorPatientsScenario.iterationCount.size(); i++) {

			doctorPatientsScenario.dataRowNo = Integer.parseInt(doctorPatientsScenario.iterationCount.get(i).toString());
			doctorPatientsScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorPatientsScenario.verifyDoctorPatientProfileTab();
		}
		obj.testFailure = doctorPatientsScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_058(Method method) {

		TestStart(method.getName());
		DoctorPatientsScenario doctorPatientsScenario = new DoctorPatientsScenario(obj);
		for (int i = 0; i < doctorPatientsScenario.iterationCount.size(); i++) {

			doctorPatientsScenario.dataRowNo = Integer.parseInt(doctorPatientsScenario.iterationCount.get(i).toString());
			doctorPatientsScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorPatientsScenario.verifyDoctorPatientHistoryTab();
		}
		obj.testFailure = doctorPatientsScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_059(Method method) {

		TestStart(method.getName());
		DoctorLoginScenario doctorLoginScenario = new DoctorLoginScenario(obj);
		for (int i = 0; i < doctorLoginScenario.iterationCount.size(); i++) {

			doctorLoginScenario.dataRowNo = Integer.parseInt(doctorLoginScenario.iterationCount.get(i).toString());
			doctorLoginScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorLoginScenario.verifyNewDoctorLoginWithMobilenumber();
		}
		obj.testFailure = doctorLoginScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_061(Method method) {

		TestStart(method.getName());
		PatientConsultScenario patientConsultScenario = new PatientConsultScenario(obj);
		for (int i = 0; i < patientConsultScenario.iterationCount.size(); i++) {

			patientConsultScenario.dataRowNo = Integer
					.parseInt(patientConsultScenario.iterationCount.get(i).toString());
			patientConsultScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientConsultScenario.verifyPatientCanBookAppointmentUnSucessfullywithDoctor();
		}
		obj.testFailure = patientConsultScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_063(Method method) {

		TestStart(method.getName());
		PatientConsultScenario patientConsultScenario = new PatientConsultScenario(obj);
		for (int i = 0; i < patientConsultScenario.iterationCount.size(); i++) {

			patientConsultScenario.dataRowNo = Integer
					.parseInt(patientConsultScenario.iterationCount.get(i).toString());
			patientConsultScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			patientConsultScenario.verifyPatientCanJoinTeleConsultVideoCall();
		}
		obj.testFailure = patientConsultScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_065(Method method) {

		TestStart(method.getName());
		DoctorDashboardScenario doctorDashboardScenario = new DoctorDashboardScenario(obj);
		for (int i = 0; i < doctorDashboardScenario.iterationCount.size(); i++) {

			doctorDashboardScenario.dataRowNo = Integer
					.parseInt(doctorDashboardScenario.iterationCount.get(i).toString());
			doctorDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorDashboardScenario.VerifyDoctorAbletoLogoutofApplication();
		}
		obj.testFailure = doctorDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_066(Method method) {

		TestStart(method.getName());
		DoctorDashboardScenario doctorDashboardScenario = new DoctorDashboardScenario(obj);
		for (int i = 0; i < doctorDashboardScenario.iterationCount.size(); i++) {

			doctorDashboardScenario.dataRowNo = Integer
					.parseInt(doctorDashboardScenario.iterationCount.get(i).toString());
			doctorDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorDashboardScenario.verifyDoctorHomePageUIValidations();
		}
		obj.testFailure = doctorDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_067(Method method) {

		TestStart(method.getName());
		DoctorDashboardScenario doctorDashboardScenario = new DoctorDashboardScenario(obj);
		for (int i = 0; i < doctorDashboardScenario.iterationCount.size(); i++) {

			doctorDashboardScenario.dataRowNo = Integer
					.parseInt(doctorDashboardScenario.iterationCount.get(i).toString());
			doctorDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorDashboardScenario.VerifyDoctorCanAttendpatientAppointments();
		}
		obj.testFailure = doctorDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_068(Method method) {

		TestStart(method.getName());
		DoctorDashboardScenario doctorDashboardScenario = new DoctorDashboardScenario(obj);
		for (int i = 0; i < doctorDashboardScenario.iterationCount.size(); i++) {

			doctorDashboardScenario.dataRowNo = Integer
					.parseInt(doctorDashboardScenario.iterationCount.get(i).toString());
			doctorDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorDashboardScenario.verifyHealthDashboardisAccessibleandCanAnswerPatientChat();
		}
		obj.testFailure = doctorDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) 
	public void UAT_IND_069(Method method) {

		TestStart(method.getName());
		DoctorMoreScenario doctorMoreScenario = new DoctorMoreScenario(obj);
		for (int i = 0; i < doctorMoreScenario.iterationCount.size(); i++) {

			doctorMoreScenario.dataRowNo = Integer.parseInt(doctorMoreScenario.iterationCount.get(i).toString());
			doctorMoreScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorMoreScenario.verifyDoctorCanSetupProfile();
		}
		obj.testFailure = doctorMoreScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_070(Method method) {

		TestStart(method.getName());
		DoctorPatientsScenario doctorPatientsScenario = new DoctorPatientsScenario(obj);
		for (int i = 0; i < doctorPatientsScenario.iterationCount.size(); i++) {

			doctorPatientsScenario.dataRowNo = Integer
					.parseInt(doctorPatientsScenario.iterationCount.get(i).toString());
			doctorPatientsScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorPatientsScenario.verifyDoctorCanAddPatient();
		}
		obj.testFailure = doctorPatientsScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_071(Method method) {

		TestStart(method.getName());
		DoctorAppointmentsScenario doctorAppointmentsScenario = new DoctorAppointmentsScenario(obj);
		for (int i = 0; i < doctorAppointmentsScenario.iterationCount.size(); i++) {

			doctorAppointmentsScenario.dataRowNo = Integer
					.parseInt(doctorAppointmentsScenario.iterationCount.get(i).toString());
			doctorAppointmentsScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorAppointmentsScenario.verifyDoctorCreateVariousEvents();
		}
		obj.testFailure = doctorAppointmentsScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_072(Method method) {

		TestStart(method.getName());
		DoctorDashboardScenario doctorDashboardScenario = new DoctorDashboardScenario(obj);
		for (int i = 0; i < doctorDashboardScenario.iterationCount.size(); i++) {

			doctorDashboardScenario.dataRowNo = Integer
					.parseInt(doctorDashboardScenario.iterationCount.get(i).toString());
			doctorDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorDashboardScenario.verifyUserAbletoAccessAllTabsUnderPrescription();
		}
		obj.testFailure = doctorDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_073(Method method) {

		TestStart(method.getName());
		DoctorMoreScenario doctorMoreScenario = new DoctorMoreScenario(obj);
		for (int i = 0; i < doctorMoreScenario.iterationCount.size(); i++) {

			doctorMoreScenario.dataRowNo = Integer.parseInt(doctorMoreScenario.iterationCount.get(i).toString());
			doctorMoreScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorMoreScenario.verifyDoctorTermsConditionsAndFeedback();
		}
		obj.testFailure = doctorMoreScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_074(Method method) {

		TestStart(method.getName());
		DoctorMoreScenario doctorMoreScenario = new DoctorMoreScenario(obj);
		for (int i = 0; i < doctorMoreScenario.iterationCount.size(); i++) {

			doctorMoreScenario.dataRowNo = Integer.parseInt(doctorMoreScenario.iterationCount.get(i).toString());
			doctorMoreScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorMoreScenario.verifyUserAbletoContactSupport();
		}
		obj.testFailure = doctorMoreScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_075(Method method) {

		TestStart(method.getName());
		DoctorMoreScenario doctorMoreScenario = new DoctorMoreScenario(obj);
		for (int i = 0; i < doctorMoreScenario.iterationCount.size(); i++) {

			doctorMoreScenario.dataRowNo = Integer.parseInt(doctorMoreScenario.iterationCount.get(i).toString());
			doctorMoreScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorMoreScenario.verifyUserabletoViewFAQandRaiseQueryinContactUs();
		}
		obj.testFailure = doctorMoreScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_076(Method method) {

		TestStart(method.getName());
		DoctorMoreScenario doctorMoreScenario = new DoctorMoreScenario(obj);
		for (int i = 0; i < doctorMoreScenario.iterationCount.size(); i++) {

			doctorMoreScenario.dataRowNo = Integer.parseInt(doctorMoreScenario.iterationCount.get(i).toString());
			doctorMoreScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorMoreScenario.verifyUserViewAllPastTickets();
		}
		obj.testFailure = doctorMoreScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_077(Method method) {

		TestStart(method.getName());
		DoctorDashboardScenario doctorDashboardScenario = new DoctorDashboardScenario(obj);
		for (int i = 0; i < doctorDashboardScenario.iterationCount.size(); i++) {

			doctorDashboardScenario.dataRowNo = Integer
					.parseInt(doctorDashboardScenario.iterationCount.get(i).toString());
			doctorDashboardScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorDashboardScenario.verifyUserAbletoAccessNotifications();
		}
		obj.testFailure = doctorDashboardScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_078(Method method) {

		TestStart(method.getName());
		DoctorMoreScenario doctorMoreScenario = new DoctorMoreScenario(obj);
		for (int i = 0; i < doctorMoreScenario.iterationCount.size(); i++) {

			doctorMoreScenario.dataRowNo = Integer.parseInt(doctorMoreScenario.iterationCount.get(i).toString());
			doctorMoreScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorMoreScenario.verifyDoctorSettingPagesandElements();
		}
		obj.testFailure = doctorMoreScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_079(Method method) {

		TestStart(method.getName());
		DoctorMoreScenario doctorMoreScenario = new DoctorMoreScenario(obj);
		for (int i = 0; i < doctorMoreScenario.iterationCount.size(); i++) {

			doctorMoreScenario.dataRowNo = Integer.parseInt(doctorMoreScenario.iterationCount.get(i).toString());
			doctorMoreScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorMoreScenario.verifyDoctorManageStaffDetails();
		}
		obj.testFailure = doctorMoreScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void UAT_IND_080(Method method) {

		TestStart(method.getName());
		DoctorMoreScenario doctorMoreScenario = new DoctorMoreScenario(obj);
		for (int i = 0; i < doctorMoreScenario.iterationCount.size(); i++) {

			doctorMoreScenario.dataRowNo = Integer.parseInt(doctorMoreScenario.iterationCount.get(i).toString());
			doctorMoreScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			doctorMoreScenario.verifyInviteFellowPractionersFunctionality();
		}
		obj.testFailure = doctorMoreScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	// *************************************************************************************************************//

	// ****************************Admin Web Application Test Cases
	// *************************************//

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_001(Method method) {

		TestStart(method.getName());
		AdminLoginScenarios adminLoginScenario = new AdminLoginScenarios(obj);
		for (int i = 0; i < adminLoginScenario.iterationCount.size(); i++) {

			adminLoginScenario.dataRowNo = Integer.parseInt(adminLoginScenario.iterationCount.get(i).toString());
			adminLoginScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLoginScenario.verifyLCAdminLoginToTheApplication();
		}
		obj.testFailure = adminLoginScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_002(Method method) {

		TestStart(method.getName());
		AdminLCDashboardScenarios adminLCDashboardScenarios = new AdminLCDashboardScenarios(obj);
		for (int i = 0; i < adminLCDashboardScenarios.iterationCount.size(); i++) {

			adminLCDashboardScenarios.dataRowNo = Integer
					.parseInt(adminLCDashboardScenarios.iterationCount.get(i).toString());
			adminLCDashboardScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLCDashboardScenarios.verifyLCDashboardPageUIElements();
		}
		obj.testFailure = adminLCDashboardScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_003(Method method) {

		TestStart(method.getName());
		AdminLCPatientScenarios adminLCPatientScenarios = new AdminLCPatientScenarios(obj);
		for (int i = 0; i < adminLCPatientScenarios.iterationCount.size(); i++) {

			adminLCPatientScenarios.dataRowNo = Integer
					.parseInt(adminLCPatientScenarios.iterationCount.get(i).toString());
			adminLCPatientScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLCPatientScenarios.verifyPatientPageNavigationandPatientsPageUIElements();
		}
		obj.testFailure = adminLCPatientScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_004(Method method) {

		TestStart(method.getName());
		AdminLCPatientScenarios adminLCPatientScenarios = new AdminLCPatientScenarios(obj);
		for (int i = 0; i < adminLCPatientScenarios.iterationCount.size(); i++) {

			adminLCPatientScenarios.dataRowNo = Integer
					.parseInt(adminLCPatientScenarios.iterationCount.get(i).toString());
			adminLCPatientScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLCPatientScenarios.verifyAdminAbletoViewPatientDetails();
		}
		obj.testFailure = adminLCPatientScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_006(Method method) {

		TestStart(method.getName());
		AdminLCDashboardScenarios adminLCDashboardScenarios = new AdminLCDashboardScenarios(obj);
		for (int i = 0; i < adminLCDashboardScenarios.iterationCount.size(); i++) {

			adminLCDashboardScenarios.dataRowNo = Integer
					.parseInt(adminLCDashboardScenarios.iterationCount.get(i).toString());
			adminLCDashboardScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLCDashboardScenarios.verifyPatientStatusFilter();
		}
		obj.testFailure = adminLCDashboardScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) 
	public void WEB_IND_007(Method method) {

		TestStart(method.getName());
		AdminLCDoctorScenarios adminLCDoctorScenarios = new AdminLCDoctorScenarios(obj);
		for (int i = 0; i < adminLCDoctorScenarios.iterationCount.size(); i++) {

			adminLCDoctorScenarios.dataRowNo = Integer
					.parseInt(adminLCDoctorScenarios.iterationCount.get(i).toString());
			adminLCDoctorScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLCDoctorScenarios.verifyDoctorPageNavigationandDoctorssPageUIElements();
		}
		obj.testFailure = adminLCDoctorScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_008(Method method) {

		TestStart(method.getName());
		AdminLCDoctorScenarios adminLCDoctorScenarios = new AdminLCDoctorScenarios(obj);
		for (int i = 0; i < adminLCDoctorScenarios.iterationCount.size(); i++) {

			adminLCDoctorScenarios.dataRowNo = Integer
					.parseInt(adminLCDoctorScenarios.iterationCount.get(i).toString());
			adminLCDoctorScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLCDoctorScenarios.verifyAdminAbletoViewDoctorDetails();
		}
		obj.testFailure = adminLCDoctorScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_010(Method method) {

		TestStart(method.getName());
		AdminLCDashboardScenarios adminLCDashboardScenarios = new AdminLCDashboardScenarios(obj);
		for (int i = 0; i < adminLCDashboardScenarios.iterationCount.size(); i++) {

			adminLCDashboardScenarios.dataRowNo = Integer
					.parseInt(adminLCDashboardScenarios.iterationCount.get(i).toString());
			adminLCDashboardScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLCDashboardScenarios.verifyDoctorStatusFilter();
		}
		obj.testFailure = adminLCDashboardScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_011(Method method) {

		TestStart(method.getName());
		AdminLCDashboardScenarios adminLCDashboardScenarios = new AdminLCDashboardScenarios(obj);
		for (int i = 0; i < adminLCDashboardScenarios.iterationCount.size(); i++) {

			adminLCDashboardScenarios.dataRowNo = Integer
					.parseInt(adminLCDashboardScenarios.iterationCount.get(i).toString());
			adminLCDashboardScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLCDashboardScenarios.verifyLCNaviagtionToSettingsAndValidateSettingsPage();
		}
		obj.testFailure = adminLCDashboardScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_012(Method method) {

		TestStart(method.getName());
		AdminLCDashboardScenarios adminLCDashboardScenarios = new AdminLCDashboardScenarios(obj);
		for (int i = 0; i < adminLCDashboardScenarios.iterationCount.size(); i++) {

			adminLCDashboardScenarios.dataRowNo = Integer
					.parseInt(adminLCDashboardScenarios.iterationCount.get(i).toString());
			adminLCDashboardScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLCDashboardScenarios.verifyLCSearchFunctionality();
		}
		obj.testFailure = adminLCDashboardScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_013(Method method) {

		TestStart(method.getName());
		AdminLCDashboardScenarios adminLCDashboardScenarios = new AdminLCDashboardScenarios(obj);
		for (int i = 0; i < adminLCDashboardScenarios.iterationCount.size(); i++) {

			adminLCDashboardScenarios.dataRowNo = Integer
					.parseInt(adminLCDashboardScenarios.iterationCount.get(i).toString());
			adminLCDashboardScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLCDashboardScenarios.verifyLCUserAbletoLogoutofTheApplication();
		}
		obj.testFailure = adminLCDashboardScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_014(Method method) {

		TestStart(method.getName());
		AdminLoginScenarios adminLoginScenario = new AdminLoginScenarios(obj);
		for (int i = 0; i < adminLoginScenario.iterationCount.size(); i++) {

			adminLoginScenario.dataRowNo = Integer.parseInt(adminLoginScenario.iterationCount.get(i).toString());
			adminLoginScenario.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminLoginScenario.verifyACEAdminLoginToTheApplication();
		}
		obj.testFailure = adminLoginScenario.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_015(Method method) {

		TestStart(method.getName());
		AdminACEDashboardScenarios adminACEDashboardScenarios = new AdminACEDashboardScenarios(obj);
		for (int i = 0; i < adminACEDashboardScenarios.iterationCount.size(); i++) {

			adminACEDashboardScenarios.dataRowNo = Integer
					.parseInt(adminACEDashboardScenarios.iterationCount.get(i).toString());
			adminACEDashboardScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminACEDashboardScenarios.verifyACEDashboardPageUIElements();
		}
		obj.testFailure = adminACEDashboardScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) 
	public void WEB_IND_016(Method method) {

		TestStart(method.getName());
		AdminACEPatientScenarios adminACEPatientScenarios = new AdminACEPatientScenarios(obj);
		for (int i = 0; i < adminACEPatientScenarios.iterationCount.size(); i++) {

			adminACEPatientScenarios.dataRowNo = Integer
					.parseInt(adminACEPatientScenarios.iterationCount.get(i).toString());
			adminACEPatientScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminACEPatientScenarios.verifyACEPatientPageNavigationandPatientPageUIElements();
		}
		obj.testFailure = adminACEPatientScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_017(Method method) {

		TestStart(method.getName());
		AdminACEDiagnosticScenarios adminACEDiagnosticScenarios = new AdminACEDiagnosticScenarios(obj);
		for (int i = 0; i < adminACEDiagnosticScenarios.iterationCount.size(); i++) {

			adminACEDiagnosticScenarios.dataRowNo = Integer
					.parseInt(adminACEDiagnosticScenarios.iterationCount.get(i).toString());
			adminACEDiagnosticScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminACEDiagnosticScenarios.verifyDiagnosticPageNavigationandDiagnosticPageUIElements();
		}
		obj.testFailure = adminACEDiagnosticScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_018(Method method) {

		TestStart(method.getName());
		AdminACEDashboardScenarios adminACEDashboardScenarios = new AdminACEDashboardScenarios(obj);
		for (int i = 0; i < adminACEDashboardScenarios.iterationCount.size(); i++) {

			adminACEDashboardScenarios.dataRowNo = Integer
					.parseInt(adminACEDashboardScenarios.iterationCount.get(i).toString());
			adminACEDashboardScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminACEDashboardScenarios.verifyACENaviagtionToSettingsAndValidateSettingsPage();
		}
		obj.testFailure = adminACEDashboardScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true) 
	public void WEB_IND_019(Method method) {

		TestStart(method.getName());
		AdminACEDashboardScenarios adminACEDashboardScenarios = new AdminACEDashboardScenarios(obj);
		for (int i = 0; i < adminACEDashboardScenarios.iterationCount.size(); i++) {

			adminACEDashboardScenarios.dataRowNo = Integer
					.parseInt(adminACEDashboardScenarios.iterationCount.get(i).toString());
			adminACEDashboardScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminACEDashboardScenarios.verifyACESearchFunctionality();
		}
		obj.testFailure = adminACEDashboardScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void WEB_IND_020(Method method) {

		TestStart(method.getName());
		AdminACEDashboardScenarios adminACEDashboardScenarios = new AdminACEDashboardScenarios(obj);
		for (int i = 0; i < adminACEDashboardScenarios.iterationCount.size(); i++) {

			adminACEDashboardScenarios.dataRowNo = Integer
					.parseInt(adminACEDashboardScenarios.iterationCount.get(i).toString());
			adminACEDashboardScenarios.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			adminACEDashboardScenarios.verifyACEUserAbletoLogoutofTheApplication();
		}
		obj.testFailure = adminACEDashboardScenarios.testFailure;
		TestEnd();
	}

	// *************************************************************************************************************//
	
	
	//-------------------------------------------------------------API Test Cases-----------------------------------------------------------------------
	@Test(alwaysRun = true)
	public void getChatsByPatientId(Method method) {

		TestStart(method.getName());
		TeleConsultAPI teleConsultAPI = new TeleConsultAPI(obj);
		for (int i = 0; i < teleConsultAPI.iterationCount.size(); i++) {

			teleConsultAPI.dataRowNo = Integer
					.parseInt(teleConsultAPI.iterationCount.get(i).toString());
			teleConsultAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			teleConsultAPI.getChatsByPatientId();
		}
		obj.testFailure = teleConsultAPI.testFailure;
		TestEnd();
	}
	
	// *************************************************************************************************************//

	
	@Test(alwaysRun = true)
	public void getChatsByDoctorId(Method method) {

		TestStart(method.getName());
		TeleConsultAPI teleConsultAPI = new TeleConsultAPI(obj);
		for (int i = 0; i < teleConsultAPI.iterationCount.size(); i++) {

			teleConsultAPI.dataRowNo = Integer
					.parseInt(teleConsultAPI.iterationCount.get(i).toString());
			teleConsultAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			teleConsultAPI.getChatsByDoctorId();
		}
		obj.testFailure = teleConsultAPI.testFailure;
		TestEnd();
	}
	
	
	// *************************************************************************************************************//

	
	@Test(alwaysRun = true)
	public void addBioVitalHeight(Method method) {

		TestStart(method.getName());
		BioVitalsAPI bioVitalsAPI = new BioVitalsAPI(obj);
		for (int i = 0; i < bioVitalsAPI.iterationCount.size(); i++) {

			bioVitalsAPI.dataRowNo = Integer
					.parseInt(bioVitalsAPI.iterationCount.get(i).toString());
			bioVitalsAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			bioVitalsAPI.addBioVitalHeight();
		}
		obj.testFailure = bioVitalsAPI.testFailure;
		TestEnd();
	}
	
	
	// *************************************************************************************************************//

	
	@Test(alwaysRun = true) // Not working 503 service Unavailable
	public void addBioVitalWeight(Method method) {

		TestStart(method.getName());
		BioVitalsAPI bioVitalsAPI = new BioVitalsAPI(obj);
		for (int i = 0; i < bioVitalsAPI.iterationCount.size(); i++) {

			bioVitalsAPI.dataRowNo = Integer
					.parseInt(bioVitalsAPI.iterationCount.get(i).toString());
			bioVitalsAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			bioVitalsAPI.addBioVitalWeight();
		}
		obj.testFailure = bioVitalsAPI.testFailure;
		TestEnd();
	}
	
	
	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void addBioVitalOxygenLevel(Method method) {

		TestStart(method.getName());
		BioVitalsAPI bioVitalsAPI = new BioVitalsAPI(obj);
		for (int i = 0; i < bioVitalsAPI.iterationCount.size(); i++) {

			bioVitalsAPI.dataRowNo = Integer
					.parseInt(bioVitalsAPI.iterationCount.get(i).toString());
			bioVitalsAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			bioVitalsAPI.addBioVitalOxygenLevel();
		}
		obj.testFailure = bioVitalsAPI.testFailure;
		TestEnd();
	}
	
	
	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void addBioVitalHeartRate(Method method) {

		TestStart(method.getName());
		BioVitalsAPI bioVitalsAPI = new BioVitalsAPI(obj);
		for (int i = 0; i < bioVitalsAPI.iterationCount.size(); i++) {

			bioVitalsAPI.dataRowNo = Integer
					.parseInt(bioVitalsAPI.iterationCount.get(i).toString());
			bioVitalsAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			bioVitalsAPI.addBioVitalHeartRate();
		}
		obj.testFailure = bioVitalsAPI.testFailure;
		TestEnd();
	}
	
	
	// *************************************************************************************************************//

	@Test(alwaysRun = true)
	public void addBioVitalBloodPressure(Method method) {

		TestStart(method.getName());
		BioVitalsAPI bioVitalsAPI = new BioVitalsAPI(obj);
		for (int i = 0; i < bioVitalsAPI.iterationCount.size(); i++) {

			bioVitalsAPI.dataRowNo = Integer
					.parseInt(bioVitalsAPI.iterationCount.get(i).toString());
			bioVitalsAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			bioVitalsAPI.addBioVitalBloodPressure();
		}
		obj.testFailure = bioVitalsAPI.testFailure;
		TestEnd();
	}
	
	// *************************************************************************************************************//
	
	//Need to make dynamic for creating a profile
	@Test(alwaysRun = true)
	public void createProfile(Method method) {

		TestStart(method.getName());
		ProfileAPI profileAPI = new ProfileAPI(obj);
		for (int i = 0; i < profileAPI.iterationCount.size(); i++) {

			profileAPI.dataRowNo = Integer
					.parseInt(profileAPI.iterationCount.get(i).toString());
			profileAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			profileAPI.createProfile();
		}
		obj.testFailure = profileAPI.testFailure;
		TestEnd();
	}
	
	// *************************************************************************************************************//
	@Test(alwaysRun = true)
	public void getProfileById(Method method) {

		TestStart(method.getName());
		ProfileAPI profileAPI = new ProfileAPI(obj);
		for (int i = 0; i < profileAPI.iterationCount.size(); i++) {

			profileAPI.dataRowNo = Integer
					.parseInt(profileAPI.iterationCount.get(i).toString());
			profileAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			profileAPI.getProfileById();
		}
		obj.testFailure = profileAPI.testFailure;
		TestEnd();
	}
	
	// *************************************************************************************************************//
	
	@Test(alwaysRun = true)
	public void getProfileByEmail(Method method) {

		TestStart(method.getName());
		ProfileAPI profileAPI = new ProfileAPI(obj);
		for (int i = 0; i < profileAPI.iterationCount.size(); i++) {

			profileAPI.dataRowNo = Integer
					.parseInt(profileAPI.iterationCount.get(i).toString());
			profileAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			profileAPI.getProfileByEmail();
		}
		obj.testFailure = profileAPI.testFailure;
		TestEnd();
	}
	
	// *************************************************************************************************************//
	
	@Test(alwaysRun = true)
	public void getProfileByPrimaryContactNumber(Method method) {

		TestStart(method.getName());
		ProfileAPI profileAPI = new ProfileAPI(obj);
		for (int i = 0; i < profileAPI.iterationCount.size(); i++) {

			profileAPI.dataRowNo = Integer
					.parseInt(profileAPI.iterationCount.get(i).toString());
			profileAPI.testStepInfo(
					"################################DataSet: " + (i + 1) + "################################");
			profileAPI.getProfileByPrimaryContactNumber();
		}
		obj.testFailure = profileAPI.testFailure;
		
		TestEnd();
	}
	
	// *************************************************************************************************************//
	

	private void TestEnd() {
		obj.waitTime(1);
		if (obj.testFailure) {
			GenericKeywords.testFailed();
		}
	}

	@BeforeMethod
	public void before() {
		obj.testFailure = false;
	}
}
