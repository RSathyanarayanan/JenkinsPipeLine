package pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import iSAFE.ApplicationKeywords;

public class DoctorAppointmentsPage extends ApplicationKeywords {

	public DoctorAppointmentsPage(BaseClass obj) {
		super(obj);
	}

	// UAT_IND_071
	public void validateDoctorCreateVariousEvents(String awayTime, String appointment, String others) {
		try {
			Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			SimpleDateFormat simpleFormatMonth = new SimpleDateFormat("MMMM");
			SimpleDateFormat simpleFormatDate = new SimpleDateFormat("dd");
			String strMonth = simpleFormatMonth.format(new Date());
			String strDate = simpleFormatDate.format(new Date());
			String currentMonthYear = strMonth + ", " + year;

			clickOn("FooterIcons_Appointment");
			verifyElementIsDisplayed("lbl_DoctorAppointmentsPage_Title");
			getText("lbl_DoctorAppointmentsPage_MonthYear", currentMonthYear);
			verifyElementIsDisplayed("drp_DoctorAppointmentsPage_CalendarDrpdwn");
			if(currentMachineName.equalsIgnoreCase("Android") || currentMachineName.contains("Android"))
			{
				clickOn("drp_DoctorAppointmentsPage_CalendarDrpdwn");
				waitTime(2);
				String objLocator = getObjectLocator("lbl_DoctorAppointmentsPage_CalendarDate").replace("<<DATE>>",
						strDate);
				updateObjectLocator("lbl_DoctorAppointmentsPage_CalendarDate", objLocator);
				verifyElementIsDisplayed("lbl_DoctorAppointmentsPage_CalendarDate");
			}
			// Add Event
			clickOn("btn_DoctorAppointmentsPage_AddEvent");

			// Away Time
			verifyElementIsDisplayed("drp_DoctorAppointmentsPage_SelectEvent");
			clickOn("drp_DoctorAppointmentsPage_SelectEvent");
			getElementAndClick("lst_DoctorAppointmentsPage_SelectEvent", awayTime);
			isListOfElementsDisplayed
				("txt_DoctorAppointmentsPage_EventStartDate,txt_DoctorAppointmentsPage_EventEndDate,txt_DoctorAppointmentsPage_EventAddDesc,btn_DoctorAppointmentsPage_EventBlockCalendar");

			// Appointment
			clickOn("drp_DoctorAppointmentsPage_SelectEvent");
			getElementAndClick("lst_DoctorAppointmentsPage_SelectEvent", appointment);
			isListOfElementsDisplayed("txt_DoctorAppointmentsPage_AppointmentEventStartDate,txt_DoctorAppointmentsPage_AppointmentEventSelectPatient,txt_DoctorAppointmentsPage_AppointmentEventAddDesc,txt_DoctorAppointmentsPage_AppointmentEventReminder");

			// Others
			clickOn("drp_DoctorAppointmentsPage_SelectEvent");
			getElementAndClick("lst_DoctorAppointmentsPage_SelectEvent", others);
			isListOfElementsDisplayed("txt_DoctorAppointmentsPage_EventStartDate,txt_DoctorAppointmentsPage_EventEndDate,txt_DoctorAppointmentsPage_EventAddDesc,btn_DoctorAppointmentsPage_EventBlockCalendar,btn_DoctorAppointmentsPage_EventCloseIcon");
			testStepInfo("Testcase UAT_IND_071 Completed successfully");

		} catch (Exception e) {
			testStepFailed("Exception in the method validateDoctorCreateVariousEvents " + e.toString());
		}
	}

}
