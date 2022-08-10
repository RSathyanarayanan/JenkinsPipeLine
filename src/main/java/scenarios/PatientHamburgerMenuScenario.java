package scenarios;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;
import pages.PatientLoginPage;
import pages.PatientHamburgerMenuPage;

public class PatientHamburgerMenuScenario extends ApplicationKeywords {

	BaseClass obj;
	private Boolean status = false;
	PatientLoginPage patientLoginPage;
	PatientHamburgerMenuPage patientHamburgerMenuPage;

	public PatientHamburgerMenuScenario(BaseClass obj) {
		super(obj);
		this.obj = obj;
	}

	// UAT_IND_021
	public void verifyPatientDevicemanagementTaskUsingSettings() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String LastnameField = "Testing";

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientDevicemanagementTaskUsingSettings(LastnameField);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_022
	public void verifyPatientCanViewandEditProfileDetails() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String LastnameField = "Testing";

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientCanViewandEditProfileDetails(LastnameField);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_023
	public void verifyPatientCanViewAndEditPassword() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String CurrentPassword = "";
			String NewPassword = "";
			String ReTypePassword = "";

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientCanViewAndEditPassword(CurrentPassword, NewPassword,
					ReTypePassword);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_024
	public void verifyPatientCanViewAndEditContactDetails() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String CareGiverName = "Testing";
			String MobileNumber = "1234567890";

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientCanViewAndEditContactDetails(CareGiverName, MobileNumber);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_025
	public void verifyPatientCanViewAndEditEmergencyDetails() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String hospitalName = retrieve("Hospital Name");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientCanViewAndEditEmergencyDetails(hospitalName);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_026
	public void verifyPatientSupportandFAQsFunctionality() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientSupportandFAQsFunctionality();

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_027
	public void verifyPatientCanViewAndEditAddressDetails() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String pinCode = retrieve("Pincode");
			String stateName = retrieve("State Name");
			String cityName = retrieve("City Name");
			String houseNumber = retrieve("House Number");
			String streetNumber = retrieve("Street Number");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientCanViewAndEditAddressDetails(pinCode, stateName, cityName,
					houseNumber, streetNumber);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_028
	public void verifyPatientCanViewAndUploadPrescription() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String latestPrescription = retrieve("Latest Prescription");
			String uploadPrescription = retrieve("Upload Prescription");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientCanViewAndUploadPrescription(latestPrescription,
					uploadPrescription);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_029
	public void verifyPatientRequestForMedicineChange() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String requestMedicineChange = retrieve("Request Medicine Change");
			String medicineNames = retrieve("Medicine Names");
			String reasonValue = retrieve("Reason Value");
			String comment = retrieve("Comment");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientRequestForMedicineChange(requestMedicineChange, medicineNames,
					reasonValue, comment);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_030
	public void verifyOrderMedicineFromPrescription() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String prescriptionCategory = retrieve("Prescription Category");// Order Medicines
			String storeCategory = retrieve("Store Category");
			String callBackRequestedVerificationText = retrieve("Call Back Requested Verification Text");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validateOrderMedicineFromPrescription(prescriptionCategory, storeCategory,
					callBackRequestedVerificationText);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_031
	public void verifyViewAndAccessManageNotifications() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String prescriptionCategory = retrieve("Prescription Category");// Manage Notifications
			String notificationMenus = retrieve("Notification Menus");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validateViewAndAccessManageNotifications(prescriptionCategory, notificationMenus);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_032
	public void verifyPrescriptionPageHealthProfile() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String prescriptionCategory = retrieve("Prescription Category");// Health Profile

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);

			patientHamburgerMenuPage.validatePrescriptionPageHealthProfile(prescriptionCategory);

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_033
	public void VerifyUIofHamburgerMenus() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			
			patientHamburgerMenuPage.validateUIofHamburgerMenus();
						
			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_037
	public void VerifyPatientAboutUsOption() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientAboutUsOption();
			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}

	}

	// VerifyPatientAbletoProvideRatings
	// UAT_IND_038
	public void VerifyPatientAbletoProvideFeedback() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientAbletoProvideFeedback();

			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_039
	public void VerifyPatientTermsandConditions() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));
			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientTermsandConditions();
			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_040
	public void verifyAccessNewSubscriptionPlan() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			String callBackRequestedVerificationText = retrieve("Call Back Requested Verification Text");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validateAccessNewSubscriptionPlan(callBackRequestedVerificationText);
			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_041
	public void verifyUserviewActiveSubscriptionPlan() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validateUserviewActiveSubscriptionPlan();

			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_042
	public void verifyMyDevicesUIAndClickBack() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validateMyDevicesUIAndClickBack();
			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_043
	public void verifyPatientConnectDisconnectTrustedDevices() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientConnectDisconnectTrustedDevices();
			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_044
	public void verifyPatientCanAccessDietAndWellnessPage() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientCanAccessDietAndWellnessPage();

			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_045
	public void verifyPatientViewExercisePlanCurrentDate() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientViewExercisePlanCurrentDate();

			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_046
	public void verifyPatientAccessOtherFunctionalitiesofExercisePage() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientAccessOtherFunctionalitiesofExercisePage();
			resetApplication(getConfigProperty("AppName1"));

		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_047
	public void verifyPatientCanViewDietGuidelines() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientCanViewDietGuidelines();

			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;

				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

	// UAT_IND_048
	public void verifyPatientCanViewExerciseGuidelines() {
		try {
			patientLoginPage = new PatientLoginPage(obj);
			patientHamburgerMenuPage = new PatientHamburgerMenuPage(obj);

			String LoginEmail = retrieve("Email Address");
			String LoginPassword = retrieve("Password");

			switchApplication(getConfigProperty("AppName1"));

			patientLoginPage.loginIntoTheApplicationUsingEmail(LoginEmail, LoginPassword);
			patientHamburgerMenuPage.validatePatientCanViewExerciseGuidelines();

			resetApplication(getConfigProperty("AppName1"));
		} catch (Exception e) {
			System.err.println(e.toString());
		} finally {
			if (this.testFailure || patientHamburgerMenuPage.testFailure || patientLoginPage.testFailure) {
				status = true;
				testFailure = status;
				resetApplication(getConfigProperty("AppName1"));
			}
		}
	}

}
