package iSAFE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import automationFramework.APIKeywords;
import baseClass.BaseClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.PushesFiles;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import io.appium.java_client.android.AndroidElement;

public class ApplicationKeywords extends APIKeywords {

	public String randomNumber = null;
	String executionCount = null;
	public static final String file_upload = "File upload#xpath=//input[@type='file']";

	@SuppressWarnings("unchecked")
	// public AndroidDriver<MobileElement> androidDriver =
	// (AndroidDriver<MobileElement>) driver;

	public ApplicationKeywords(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
	}

	public ApplicationKeywords() {

	}

	protected String getRandomtString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 8) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}

	public void scroll() {
		try {
			AndroidDriver<MobileElement> androidDriver = (AndroidDriver) driver;
			Dimension dimensions = androidDriver.manage().window().getSize();
			int Startpoint = (int) (dimensions.getHeight() * 0.90);
			int scrollEnd = (int) (dimensions.getHeight() * 0.30);
			// androidDriver.swipe(250, Startpoint,250,scrollEnd,2000); //(x,y) to (x1,y1)
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.press(point(250, Startpoint));
			action.waitAction(waitOptions(ofSeconds(2)));
			action.moveTo(point(250, scrollEnd));
			action.release().perform();
			waitTime(2);
		} catch (Exception e) {
			testStepFailed("ERROR", "Exception :" + e);
		}
	}

	public void scrollAndClick(String visibleText) {
		AndroidDriver<MobileElement> androidDriver = (AndroidDriver) driver;
		androidDriver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
				.click();
	}

	// Scroll to the particular element on the webPage
	public void scrollUp() throws Exception {

		AndroidDriver<MobileElement> androidDriver = (AndroidDriver) driver;
		// The viewing size of the device
		Dimension size = driver.manage().window().getSize();

		// Starting y location set to 20% of the height (near bottom)
		int starty = (int) (size.height * 0.20);
		// Ending y location set to 80% of the height (near top)
		int endy = (int) (size.height * 0.80);
		// x position set to mid-screen horizontally
		int startx = size.width / 2;

		// scroll(startx, starty, startx, endy);
		// androidDriver.swipe(startx, starty, startx, endy,2000);
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(point(startx, starty));
		action.waitAction(waitOptions(ofSeconds(2)));
		action.moveTo(point(startx, endy));
		action.release().perform();
	}

	public void dropDown(String locator, String value) {
		try {
			waitTime(2);// Load comment test
			clickOn(locator);
			// String text = " drop down #xpath=//android.widget.TextView[@text='" + value +
			// "']";
			// String text=" drop down #xpath=//android.view.View[@text='"+value+"']";

			// String text =" drop down #xpath=//android.widget.TextView[@text='" + value +
			// "']"; //FARMER
			String text = " drop down #xpath=//android.view.View[contains(@text,'" + value + "')]"; // FPO
			{
				clickOn(text);
			}
		} catch (Exception e) {
			testStepFailed("Exception in method selectDropDownList " + e.toString());
		}
	}

	public void clickWidget(String value) {
		String Menus = "" + value + "click menus #xpath=//android.widget.TextView[@text='" + value + "']";
		if (isElementPresent(Menus)) {
			clickOn(Menus);
			testStepPassed("successfully clicked on" + value);
		} else {
			testStepFailed("failed click on" + value);
		}
	}

	// Scroll to the particular element on the webPage
	public void scrollToElement(String locator) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", locator);
			// js.executeScript("window.scrollBy(0,1600)", "");
			waitTime(2);
		} catch (Exception e) {
			testStepFailed("ERROR", "Exception :" + e);
		}
	}

	// Scroll to the particular element on the webPage
	public void scrollUpToElement(String locator) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("arguments[0].scrollIntoView();", locator);
			js.executeScript("window.scrollBy(0,-1600)", "");
			waitTime(2);
		} catch (Exception e) {
			testStepFailed("ERROR", "Exception :" + e);
		}
	}

	public void clickWidgetNavigation(String value) {
		String Menus = "" + value + "click menus #xpath=//android.widget.TextView[@text='" + value + "']";
		if (isElementPresent(Menus)) {
			clickOn(Menus);
			testStepPassed("successfully clicked on" + value);
		} else {
			testStepFailed("failed click on" + value);
		}
	}

	public void scrollDownWithCoordinates(int x, int starty, int endy) {
		// ((AppiumDriver<MobileElement>) driver).swipe(x, starty, x, endy, 900);
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(point(x, starty));
		action.waitAction(waitOptions(ofSeconds(2)));
		action.moveTo(point(x, endy));
		action.release().perform();
	}

	public void tapWithCoordinates(int x, int y) {
		try {
			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			action.tap(point(x, y)).waitAction(waitOptions(ofMillis(250))).perform();

		} catch (Exception e) {
			testStepFailed("ERROR", "Exception :" + e);
		}
	}

	public void scrollToText(String text) {
		try {
			// Send Element Text
			if (currentMachineName.contains("Android") || currentMachineName.equalsIgnoreCase("Android")) {
				((AndroidDriver<?>) driver).findElementByAndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
								+ text + "\").instance(0))");
				testStepPassed("Scrolled to element containing " + text);
			} else if (currentMachineName.contains("iOS") || currentMachineName.equalsIgnoreCase("iOS")) {
				// RemoteWebElement element = (RemoteWebElement) findWebElement(objLocator);
				// String elementID = element.getId();
				// HashMap<String, String> scrollObject = new HashMap<String, String>();
				// scrollObject.put("element", elementID); // Only for ‘scroll in element’
				// scrollObject.put("direction", "down");
				// driver.executeScript("mobile:scroll", scrollObject);
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method scrollToText " + e.toString());
		}
	}

	public void hidekeyboard() {
		try {
			AndroidDriver<MobileElement> androidDriver = (AndroidDriver) driver;
			androidDriver.hideKeyboard();
		} catch (Exception e) {
			ApplicationKeywords.writeToLogFile("ERROR", e.toString());
		}
	}

	public void getKeyboard() {
		try {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).perform();
		} catch (Exception e) {
			ApplicationKeywords.writeToLogFile("ERROR", e.toString());
		}

	}

	public void getTab() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	public void scrollDown() {
		Dimension size = driver.manage().window().getSize();
		int x = size.getWidth() / 2;
		int starty = (int) (size.getHeight() * 0.60);
		int endy = (int) (size.getHeight() * 0.10);
		// ((AndroidDriver<?>) driver).swipe(x, starty, x, endy, 2000);
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(point(x, starty));
		action.waitAction(waitOptions(ofSeconds(2)));
		action.moveTo(point(x, endy));
		action.release().perform();
	}

	/*
	 * public void pushPhoto() { ((AndroidDriver<?>)
	 * driver).pushFile("/mnt/sdcard/Pictures/myPhoto.jpg",
	 * "/path/to/photo/locally/myPhoto.jpg");
	 * findWebElement(executionCount).sendKeys("/mnt/sdcard/Pictures/myPhoto.jpg");
	 * }
	 */

	public void clickOnTab(String tabName) {
		clickOnSpecialElement(tabName + " tab#xpath=//a[contains(text(),'" + tabName + "')]");
	}

	public String getRandomNumber() {

		int randomNumber = (int) Math.round(Math.random() * 1000000);
		String value = Integer.toString(randomNumber);
		return value;
	}

	public String updateEmailID(String emailID, String randomNumber) {
		String[] inputEmail = null;
		if (emailID.contains("@")) {
			inputEmail = emailID.split("@");
		}
		emailID = null;
		emailID = inputEmail[0];

		return emailID = emailID.concat("_").concat(currentBrowser).concat(randomNumber).concat("@")
				.concat(inputEmail[1]);
	}

	public void clickOnRadioButton(String value) {
		clickOnSpecialElement("'" + value + "' radio button#xpath=//input[@value='" + value + "']");
	}

	public void selectItemInDropdown(String NameOfDropdownlist, String item) {
		clickOnSpecialElement("'" + item + "' from " + NameOfDropdownlist
				+ " drop down list#xpath=//div[@class='x-combo-list-item' and contains(text(),'" + item + "')]");

	}

	public void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			ApplicationKeywords.writeToLogFile("INFO", e.toString());
		}

	}

	public void pressTabKey() {
		if (!currentExecutionMachineName.equals("MotoG")) {
			try {
				driver.findElement(By.id("modelCombo")).sendKeys(Keys.TAB);
			} catch (NoSuchElementException e) {
				ApplicationKeywords.writeToLogFile("INFO", e.toString());
			}
		}
	}

	public boolean searchElementUntil(String objlocator, int rounds) {
		String label = splitLocatorLocatorLabel(objlocator);
		boolean status = false;
		try {
			for (int i = 0; i < rounds; i++) {
				waitTime(1);
				if (elementDisplayed(objlocator)) {
					status = true;
					testStepPassed(label + " is displayed");
					break;
				} else {
					continue;
				}
			}
			if (status == false) {
				testStepFailed(label + " is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("Exception in method searchElementUntil " + e);
		}
		return status;
	}

	public String splitLocatorLocatorLabel(String locator) {
		String splitLocator = null;
		try {
			String[] splitPath = locator.split("#");
			splitLocator = splitPath[0];
		} catch (Exception e) {
			testStepFailed("Exception in method splitLocatorLocatorLabel " + e.toString());
		}

		return splitLocator;
	}

	public String splitLocatorValue(String locator) {
		String splitLocator = null;
		try {
			String[] splitPath = locator.split("#xpath=");
			splitLocator = splitPath[1];
		} catch (Exception e) {
			e.printStackTrace();
		}
		return splitLocator;
	}

	public boolean elementDisplayed(String objLocator) {
		boolean status = false;
		WebElement element;
		try {
			element = findWebElement(objLocator);
			if (element.isDisplayed()) {
				status = true;
			} else {
				status = false;
			}

		} catch (Exception e) {
			status = false;
		}

		return status;
	}

	public boolean isElementPresent(String locatorValue, int timeUnit) {
		hidekeyboard();
		driver.manage().timeouts().implicitlyWait(timeUnit, TimeUnit.SECONDS);
		try {
			waitForElementToDisplay(locatorValue, timeUnit);
			String locator = splitLocatorValue(locatorValue);

			System.out.println("Locator = " + locator);
			// parseidentifyByAndlocator(locatorValue);
			driver.findElement(By.xpath(locator));
			return true;
		} catch (NoSuchElementException e) {
			ApplicationKeywords.writeToLogFile("INFO", "Element was not found");
			return false;
		}
	}

	// Scroll to the particular element on the webPage
	public void scrollToTheElement(String locator) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("arguments[0].scrollIntoView();", locator);
			js.executeScript("window.scrollBy(0,700)", "");
			waitTime(2);
		} catch (Exception e) {
			testStepFailed("ERROR", "Exception :" + e);
		}
	}

	public void getElementAndClick(String locator, String expectedText) {
		try {
			waitTime(1);
			List<WebElement> namelist = findWebElements(locator);
			String actualText = "";
			boolean status = false;
			for (WebElement element : namelist) {

				actualText = element.getText().trim();
				if (actualText.equalsIgnoreCase(expectedText)) {
					element.click();
					status = true;
					testStepPassed(actualText + " is validated and clicked");
					break;
				}

			}
			if (status == false)
				testStepFailed("Expected Text " + expectedText + " does not match with Actual Text " + actualText);
		} catch (Exception e) {
			testStepFailed("Exception in the method getElementAndClick " + e.toString());
		}
	}

	public void validatePageTitle(String expectedtitle) {
		String txt_title = "title#xpath=//div[contains(@class,'content-header')]//h1";
		if (isElementDisplayed(txt_title)) {
			String actualtitle = getText(txt_title);
			if (actualtitle.equals(expectedtitle)) {
				testStepPassed("Successfully validated the page title : " + actualtitle);
			} else {
				testStepFailed("Failed to validate the page title Actual title = " + actualtitle
						+ " -> Expected title = " + expectedtitle + "");
			}
		} else {
			testStepFailed("Failed to display page title for '" + expectedtitle + "'");
		}
	}

	public String getCurrentDirectory() {
		String currentDirectory = System.getProperty("user.dir");
		System.out.println("The current working directory is " + currentDirectory);
		return currentDirectory;
	}

	public void fileUpload(String foldername, String filename) {
		String currentDirectory = getCurrentDirectory();
		String path = currentDirectory + "\\" + foldername + "\\" + filename;
		findWebElement(file_upload).sendKeys(path);
	}

	// Scroll to the particular element on the webPage
	public void scrollToTheElement() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("arguments[0].scrollIntoView();", locator);
			js.executeScript("window.scrollBy(0,400)", "");
			waitTime(2);
		} catch (Exception e) {
			testStepFailed("ERROR", "Exception :" + e);
		}
	}

	public void scrollToTop() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("arguments[0].scrollIntoView();", locator);
			js.executeScript("window.scrollBy(0,-600)", "");
			waitTime(2);
		} catch (Exception e) {
			testStepFailed("ERROR", "Exception :" + e);
		}
	}

	public String retrieveDate(int daysToAdd, String dateFormat) {
		String parsedDate = null;
		try {
			SimpleDateFormat setDateFormat = new SimpleDateFormat(dateFormat);
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, daysToAdd);
			parsedDate = setDateFormat.format(cal.getTime());
			System.out.println(parsedDate);
			String[] value = parsedDate.split(" ");
			String year = value[2];
			System.out.println(year);
			String monthYear = value[1] + " " + value[2];
			System.out.println(monthYear);
		} catch (Exception e) {
			testStepFailed("[-] FAIL :: '" + e.getClass() + "' thrown | check log file");
			writeToLogFile("ERROR", "[E] :: Exception thrown: " + e);
		}
		return parsedDate;
	}

	public void dropDownWeb(String locator, String value) {
		try {
			waitTime(2);// Load comment test
			clickOn(locator);
			// String text=" drop down #xpath=//android.widget.TextView[@text='"+value+"']";
			String text = " drop down #xpath=//li[text()='" + value + "']";
			// android.view.View[contains(@text,'" + value + "')]
			{
				clickOn(text);
			}
		} catch (Exception e) {
			testStepFailed("Exception in method selectDropDownList " + e.toString());
		}
	}

	// Scroll to the particular element on the webPage
	public void scrollDownToElement(String locator) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("arguments[0].scrollIntoView();", locator);
			js.executeScript("window.scrollBy(0,1600)", "");
			waitTime(2);
		} catch (Exception e) {
			testStepFailed("ERROR", "Exception :" + e);
		}
	}
	
	
	
	
	

	public static Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
		return prop;
	}

	public void scrollUp_Mobile() {
		Dimension size = driver.manage().window().getSize();
		int endY = (int) (size.height * 0.60);
		int startY = (int) (size.height * 0.10);
		int startX = (size.width / 2);
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.press(point(startX, startY));
		action.waitAction(waitOptions(ofSeconds(2)));
		action.moveTo(point(startX, endY));
		action.release().perform();
	}

	protected String getRandomData() {
		String SALTCHARS = "1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 6) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}

	public String getTimeStamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String timeStamp[] = timestamp.toString().split("\\.");
		return timeStamp[0];
	}

	public String readTestConfigurationProperty(String key) {
		String value = null;
		try {
			String currentDirectory = System.getProperty("user.dir");
			String path = currentDirectory + "\\config\\TestConfiguration.properties";
			Properties prop = readPropertiesFile(path);
			value = prop.getProperty("AppName1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public String getPhoneNumber() {
		String CHARS = "19347";
		String startNumber = "33588";
		StringBuilder sb = new StringBuilder();
		Random rnd = new Random();
		while (sb.length() < 5) { // length of the random string.
			int index = (int) (rnd.nextFloat() * CHARS.length());
			sb.append(CHARS.charAt(index));
		}
		String rndomStr = sb.toString();
		String rndNumber = "" + startNumber + "" + rndomStr + "";
		writeToLogFile("INFO", rndNumber);
		return rndNumber;
	}

	public String getcontext() {
		AndroidDriver<MobileElement> androidDriver = (AndroidDriver<MobileElement>) driver;
		String pagename = androidDriver.getContext();
		return pagename;
	}

	public void jsclick(WebElement locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", locator);
	}

	public void jsclear(WebElement locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '';", locator);
	}

	public void jssendkeys(WebElement locator, String values) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + values + "'", locator);
		testStepPassed("User Entered the " + values + " in time of app");
	}

	public void jsscrollintoview(WebElement locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", locator);
		waitTime(5);
	}

	public void switchDriver(String driver) {
		switch (driver) {
		case "ANDROID":
			this.driver = ((AndroidDriver) this.driver);
			break;
		case "IOS":
			this.driver = ((IOSDriver) this.driver);
			break;
		case "WEB":
			this.driver = ((RemoteWebDriver) this.driver);
			break;
		default:
			this.driver = ((RemoteWebDriver) this.driver);
			break;
		}
	}

	public enum Driver {
		ANDROID, IOS, WEB
	}

	/*
	 * public void resetApp() { try { if
	 * (currentMachineName.equalsIgnoreCase("Android") ||
	 * currentMachineName.contains("Android")) { ((AndroidDriver<?>)
	 * driver).resetApp(); waitTime(5); } } catch (Exception e) {
	 * testStepFailed("Exception in the method resetApp " + e.toString()); } }
	 */

	public void horizontalScrollToElement(String visibleText) {
		try {
			if (currentMachineName.contains("Android") || currentMachineName.equalsIgnoreCase("Android")) {
				((AndroidDriver<?>) driver).findElementByAndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(false).instance(0)).setAsHorizontalList().scrollIntoView(new UiSelector().textContains(\""
								+ visibleText + "\").instance(0))");
				testStepPassed("Sucessfully navigated to Login Screen");
			} else if (currentMachineName.contains("iOS") || currentMachineName.equalsIgnoreCase("iOS")) {
				horizontalScroll(driver, 0.9, 0.3, 0.1, 0.3);
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method horizontalScrollToEmail " + e.toString());
		}
	}

	public void horizontalScroll(RemoteWebDriver driver, double start_xd, double start_yd, double end_xd,
			double end_yd) {
		try {
			Dimension dimension = driver.manage().window().getSize();
			int start_x = (int) (dimension.width * start_xd);
			int start_y = (int) (dimension.height * start_yd);

			int end_x = (int) (dimension.width * end_xd);
			int end_y = (int) (dimension.height * end_yd);

			TouchAction touch = new TouchAction((PerformsTouchActions) driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(end_x, end_y)).release().perform();

		} catch (Exception e) {
			testStepFailed("Exception in the method horizontalScroll " + e.toString());
		}
	}

	public void getText(String locator, String expectedText) {
		try {
			boolean status = false;
			List<WebElement> elementList = findWebElements(locator);
			String actualText = "";

			for (WebElement element : elementList) {
				actualText = element.getText().trim();
				if (actualText.contains(expectedText)) {
					status = true;
					testStepPassed("Expected condition meets with Actual condition " + actualText);
					break;
				}
			}
			if (status == false) {
				testStepFailed("<< Expected condition doesn't meet with Actual condition >> " + expectedText);
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method getText " + e.toString());
		}
	}

	public void selectSeekBarValue(String objLocator, String percentage) {

		try {
			WebElement element = findWebElement(objLocator);

			int startX = element.getLocation().getX();
			int endX = element.getSize().getWidth();
			int startY = element.getLocation().getY();
			int integer = Integer.parseInt(percentage);
			double value = (double) integer / 100;

			TouchAction action = new TouchAction((PerformsTouchActions) driver);
			int moveXTo = (int) (endX * value);
			action.press(PointOption.point(startX, startY)).moveTo(PointOption.point(moveXTo, startY)).release()
					.perform();
		} catch (Exception e) {
			testStepFailed("Exception in the method selectSeekBarValue " + e.toString());
		}
	}

	public void isListOfElementsDisplayed(String objLocators) {
		try {
			String[] objLocator = objLocators.split(",");
			for (int i = 0; i < objLocator.length; i++) {
				if (isElementPresent(objLocator[i])) {
					testStepPassed(splitLocatorLocatorLabel(getObjectLocator(objLocator[i])) + " is displayed");
				} else {
					testStepFailed(splitLocatorLocatorLabel(getObjectLocator(objLocator[i])) + " is not displayed");
				}
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method isListOfElementsDisplayed " + e.toString());
		}
	}

	public void getAndMatchListElementTexts(String objLocator, String listOfTexts) {
		try {
			String actualValue = null;
			boolean status;
			waitForElementToDisplay(objLocator,10);
			List<WebElement> elements = findWebElements(objLocator);
			String[] expectedText = listOfTexts.split("##");
			for (WebElement element : elements) {
				status = false;
				actualValue = element.getText().trim();
				for (int i = 0; i < expectedText.length; i++) {

					if (actualValue.contains(expectedText[i])) {

						testStepPassed("Expected Value : " + expectedText[i] + " and Actual value :" + actualValue);
						status = true;
						testStepPassed(actualValue + " is displayed");
						break;
					}
				}
				if (status == false) {
					testStepFailed("Expected value does not match with the actual Value ");
				}
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method getAndMatchListElementTexts " + e.toString());
		}
	}

	public void validateElementEnabled(String objLocator, String ExpectedBoolean) {
		try {
			WebElement element = findWebElement(objLocator);
			if (element.getAttribute("enabled").equals(ExpectedBoolean)) {
				testStepPassed(splitLocatorLocatorLabel(getObjectLocator(objLocator)) + " is " + ExpectedBoolean);
			} else {
				testStepFailed(splitLocatorLocatorLabel(getObjectLocator(objLocator)) + " is not " + ExpectedBoolean);
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method validateElementEnabled " + e.toString());
		}
	}

	public void getListElementsText(String objLocator) {
		try {
			waitForElementToDisplay(objLocator, 5);
			List<WebElement> listElements = findWebElements(objLocator);
			for (WebElement element : listElements) {
				if (element.isDisplayed()) {
					testStepPassed(element.getText() + " is displayed");
				}
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method getListElementsText " + e.toString());
		}
	}
	
	public void moveToElementActions(String objLocator) {
		try {
			WebElement element = findWebElement(objLocator);

		    new Actions(driver).moveToElement(element).perform();
		    
		} catch (Exception e) {
			testStepFailed("ERROR in moveToElementActions ", "Exception :" + e);
		}
	}
	

	public void validateElementChecked(String objLocator, String ExpectedBoolean) {
		try {
			WebElement element = findWebElement(objLocator);
			
			verifyElementIsDisplayed(objLocator);
			
			if (element.getAttribute("checked").equals(ExpectedBoolean)) {
				testStepPassed(splitLocatorLocatorLabel(getObjectLocator(objLocator)) + " is " + ExpectedBoolean);
			} else {
				testStepFailed(splitLocatorLocatorLabel(getObjectLocator(objLocator)) + " is not " + ExpectedBoolean);
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method validateElementEnabled " + e.toString());
		}
	}
	
	public void validateElementCheckedStatus(String objLocator) {
		try {
			WebElement element = findWebElement(objLocator);
			
			verifyElementIsDisplayed(objLocator);
			
			String ActualBoolean = element.getAttribute("checked");
			testStepPassed(splitLocatorLocatorLabel(getObjectLocator(objLocator)) + " is " + ActualBoolean);
			
		} catch (Exception e) {
			testStepFailed("Exception in the method validateElementEnabled " + e.toString());
		}
	}

	public void validateNotificationPageMenus(String objLocator, String listOfTexts) {
		try {
			String actualValue = null;
			int count = 0;
			verifyElementIsDisplayed(objLocator);
			List<WebElement> elements = findWebElements(objLocator);
			String[] expectedText = listOfTexts.split("##");
			for (WebElement element : elements) {
				actualValue = element.getText().trim();
				for (int i = 0; i < expectedText.length; i++) {
					if (actualValue.equals(expectedText[i])) {
						testStepPassed(actualValue + " is displayed");
						count++;
						break;
					}
				}
			}
			if (count != expectedText.length) {
				testStepFailed("Some verifications hasn't been done from the provided element texts: "
						+ expectedText.toString());
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method getAndMatchListElementTexts " + e.toString());
		}
	}

	public void closeKeyBoard() {
		if (currentMachineName.equalsIgnoreCase("Android") || currentMachineName.contains("Android")) {
			((AndroidDriver<?>) driver).hideKeyboard();
			testStepPassed("The Android KeyBoard is closed");
		} else if (currentMachineName.equalsIgnoreCase("iOS") || currentMachineName.contains("iOS")) {
			((IOSDriver<?>) driver).hideKeyboard();
			testStepPassed("The IOS KeyBoard is closed");
		}
	}

	public void resetAppAndLogOut(String appName) {
		try {
			if (currentMachineName.equalsIgnoreCase("Android") || currentMachineName.contains("Android")) {
				resetApplication(getConfigProperty(appName));
			} else if (currentMachineName.equalsIgnoreCase("ios") || currentMachineName.contains("iOS")) {

				((IOSDriver<?>) driver).resetApp();
				validateDoctorAbletoLogoutofApplication();
				((IOSDriver<?>) driver).resetApp();
			} else if (currentMachineName.equalsIgnoreCase("desktop") || currentMachineName.contains("Desktop")) {
				driver.quit();
				driver = new ChromeDriver();
				driver.get(getConfigProperty("AppURL"));
				driver.manage().window().maximize();
				waitTime(2);
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method resetApp " + e.toString());
		}
	}

	public void resetAppDoctor(String appName) {
		try {
			if (currentMachineName.equalsIgnoreCase("Android") || currentMachineName.contains("Android")) {
				resetApplication(getConfigProperty(appName));
			} else if (currentMachineName.equalsIgnoreCase("ios") || currentMachineName.contains("iOS")) {
				((IOSDriver<?>) driver).resetApp();
			} else if (currentMachineName.equalsIgnoreCase("desktop") || currentMachineName.contains("Desktop")) {
				driver.quit();
				driver = new ChromeDriver();
				driver.get(getConfigProperty("AppURL"));
				driver.manage().window().maximize();
				waitTime(2);
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method resetApp " + e.toString());
		}
	}

	public void switchApplicationAndResetApp(String appName) {
		if (currentMachineName.equalsIgnoreCase("Android") || currentMachineName.contains("Android")) {
			switchApplication(getConfigProperty(appName));
			// resetApplication(getConfigProperty(appName));

		}
	}

	// UAT_IND_065
	public void validateDoctorAbletoLogoutofApplication() {
		try {
			if (isElementPresent("FooterIcons_DoctorHome")) {

				clickOn("FooterIcons_More");

				waitForElementToDisplay("btn_More_profile", 5);

				clickOn("btn_Dashboard_Logout");

				isListOfElementsDisplayed(
						"lbl_Dashboard_ConfirmationMessage,btn_Dashboard_LogoutYES,btn_Dashboard_LogoutNO");

				clickOn("btn_Dashboard_LogoutYES");

				// verifyElementIsDisplayed("chk_DrTermsAndCondition_AcknowledgementCheckbox");
				waitTime(3);

			} else {
				testStepFailed("Doctor Homepage is not displayed");
			}

		} catch (Exception e) {
			resetDoctorAppAndLogOut();

			testStepFailed("Failed in validateDoctorAbletoLogoutofApplication " + e.toString());
		}
	}

	// Shadow Root Web Application Methods

	public WebElement openShadowRootTypeInUsingActions(String hostObjLocator, String childObjLocator,
			String textValue) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		try {
			WebElement root1 = findWebElement(hostObjLocator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");

			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(childObjLocator);
			WebElement shadowContent = shadowRootElement.findElement(By.cssSelector(this.locator));
			Actions ob = new Actions(driver);
			ob.moveToElement(shadowContent).doubleClick().sendKeys(textValue).build().perform();
		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot and Type " + e.toString());
		}
		return shadowRootElement;
	}

	public String openShadowRootGetText(String hostObjLocator, String childObjLocator) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		String returnFindText = null;
		try {
			WebElement root1 = findWebElement(hostObjLocator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");

			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(childObjLocator);
			WebElement shadowContent = shadowRootElement.findElement(By.cssSelector(this.locator));
			returnFindText = shadowContent.getText();
		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot and Type " + e.toString());
		}

		return returnFindText;
	}

	public void openShadowRootClickOn(String hostObjLocator, String childObjLocator) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		try {
			WebElement root1 = findWebElement(hostObjLocator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");

			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(childObjLocator);
			WebElement shadowContent = shadowRootElement.findElement(By.cssSelector(this.locator));
			shadowContent.click();

		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot and Type " + e.toString());
		}
	}

	public WebElement openShadowRootTypeIn(String hostObjLocator, String childObjLocator, String textValue) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		try {
			WebElement root1 = findWebElement(hostObjLocator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");

			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(childObjLocator);
			shadowRootElement.findElement(By.cssSelector(this.locator)).sendKeys(textValue);
		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot " + e.toString());
		}
		return shadowRootElement;
	}

	public void openShadowRootAndVerifyElement(String hostObjLocator, String childObjLocator) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		try {
			WebElement root1 = findWebElement(hostObjLocator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");

			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(childObjLocator);
			if (shadowRootElement.findElement(By.cssSelector(this.locator)).isDisplayed()) {
				parseidentifyByAndlocator(hostObjLocator);
				testStepPassed(this.locatorDescription + " is displayed");
			} else {
				parseidentifyByAndlocator(hostObjLocator);
				testStepFailed(this.locatorDescription + " is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot " + e.toString());
		}
	}

	public void openTwoShadowRootAndVerifyElement(String hostObjLocator, String hostObjLocator1,
			String childObjLocator) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		RemoteWebElement shadowRootElement2 = new RemoteWebElement();

		try {

			parseidentifyByAndlocator(hostObjLocator);
			WebElement root1 = driver.findElement(By.cssSelector(this.locator));

			// WebElement root1 = findWebElement(hostObjLocator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(hostObjLocator1);
			WebElement root2 = shadowRootElement.findElement(By.cssSelector(this.locator));
			Object shadowRoot2 = js.executeScript("return arguments[0].shadowRoot", root2);
			String id2 = (String) ((Map<String, Object>) shadowRoot2).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement2.setParent((RemoteWebDriver) driver);
			shadowRootElement2.setId(id2);

			parseidentifyByAndlocator(childObjLocator);
			if (shadowRootElement2.findElement(By.cssSelector(this.locator)).isDisplayed()) {
				testStepPassed(this.locatorDescription + " is displayed");
			} else {
				testStepFailed(this.locatorDescription + " is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot " + e.toString());
		}
	}
	public String openTwoShadowRootAndGetText(String hostObjLocator, String hostObjLocator1,String childObjLocator) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		RemoteWebElement shadowRootElement2 = new RemoteWebElement();
		String returnFindText = null;
		try {

			parseidentifyByAndlocator(hostObjLocator);
			WebElement root1 = driver.findElement(By.cssSelector(this.locator));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(hostObjLocator1);
			WebElement root2 = shadowRootElement.findElement(By.cssSelector(this.locator));
			Object shadowRoot2 = js.executeScript("return arguments[0].shadowRoot", root2);
			String id2 = (String) ((Map<String, Object>) shadowRoot2).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement2.setParent((RemoteWebDriver) driver);
			shadowRootElement2.setId(id2);

			parseidentifyByAndlocator(childObjLocator);
			WebElement shadowContent = shadowRootElement2.findElement(By.cssSelector(this.locator));
			returnFindText = shadowContent.getText();		
			
		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot " + e.toString());
		}
		return returnFindText;

	}
	
	
	public String openTwoShadowRootAndGetTextList(String hostObjLocator, String hostObjLocator1,String childObjLocator, String listOfTexts) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		RemoteWebElement shadowRootElement2 = new RemoteWebElement();
		String returnFindText = null;
		String actualValue = null;
		boolean status;
		try {

			parseidentifyByAndlocator(hostObjLocator);
			WebElement root1 = driver.findElement(By.cssSelector(this.locator));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(hostObjLocator1);
			WebElement root2 = shadowRootElement.findElement(By.cssSelector(this.locator));
			Object shadowRoot2 = js.executeScript("return arguments[0].shadowRoot", root2);
			String id2 = (String) ((Map<String, Object>) shadowRoot2).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement2.setParent((RemoteWebDriver) driver);
			shadowRootElement2.setId(id2);

			
			parseidentifyByAndlocator(childObjLocator);
			List <WebElement> shadowContent = shadowRootElement2.findElements(By.cssSelector(this.locator));
			String[] expectedText = listOfTexts.split("##");
			for (WebElement element : shadowContent) {
				status = false;
				actualValue = element.getText().trim();
				for (int i = 0; i < expectedText.length; i++) {
					if (actualValue.contains(expectedText[i])) {

						testStepPassed("Expected Value : " + expectedText[i] + " and Actual value :" + actualValue);
						status = true;
						testStepPassed(actualValue + " is displayed");
						break;
					}
				}
				if (status == false) {
					testStepFailed("Expected value does not match with the actual Value ");
				}
			}			
						
		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot " + e.toString());
		}
		return returnFindText;

	}

	public void openTwoShadowRootAndClickOn(String hostObjLocator, String hostObjLocator1, String childObjLocator) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		RemoteWebElement shadowRootElement2 = new RemoteWebElement();

		try {

			parseidentifyByAndlocator(hostObjLocator);
			WebElement root1 = driver.findElement(By.cssSelector(this.locator));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(hostObjLocator1);
			WebElement root2 = shadowRootElement.findElement(By.cssSelector(this.locator));
			Object shadowRoot2 = js.executeScript("return arguments[0].shadowRoot", root2);
			String id2 = (String) ((Map<String, Object>) shadowRoot2).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement2.setParent((RemoteWebDriver) driver);
			shadowRootElement2.setId(id2);

			parseidentifyByAndlocator(childObjLocator);
			WebElement ClickElement = shadowRootElement2.findElement(By.cssSelector(this.locator));
			js.executeScript("arguments[0].click();", ClickElement);

		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot " + e.toString());
		}
	}

	public void openThreeShadowRootAndVerifyElement(String hostObjLocator, String hostObjLocator1,
			String hostObjLocator2, String childObjLocator) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		RemoteWebElement shadowRootElement2 = new RemoteWebElement();
		RemoteWebElement shadowRootElement3 = new RemoteWebElement();

		try {

			parseidentifyByAndlocator(hostObjLocator);
			WebElement root1 = driver.findElement(By.cssSelector(this.locator));

			// WebElement root1 = findWebElement(hostObjLocator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(hostObjLocator1);
			WebElement root2 = shadowRootElement.findElement(By.cssSelector(this.locator));
			Object shadowRoot2 = js.executeScript("return arguments[0].shadowRoot", root2);
			String id2 = (String) ((Map<String, Object>) shadowRoot2).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement2.setParent((RemoteWebDriver) driver);
			shadowRootElement2.setId(id2);

			parseidentifyByAndlocator(hostObjLocator2);
			WebElement root3 = shadowRootElement.findElement(By.cssSelector(this.locator));
			Object shadowRoot3 = js.executeScript("return arguments[0].shadowRoot", root2);
			String id3 = (String) ((Map<String, Object>) shadowRoot3).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement3.setParent((RemoteWebDriver) driver);
			shadowRootElement3.setId(id3);

			parseidentifyByAndlocator(childObjLocator);
			if (shadowRootElement3.findElement(By.cssSelector(this.locator)).isDisplayed()) {
				testStepPassed(this.locatorDescription + " is displayed");
			} else {
				testStepFailed(this.locatorDescription + " is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot " + e.toString());
		}
	}

	public void openThreeShadowRootAndClickOn(String hostObjLocator, String hostObjLocator1, String hostObjLocator2,
			String childObjLocator) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		RemoteWebElement shadowRootElement2 = new RemoteWebElement();
		RemoteWebElement shadowRootElement3 = new RemoteWebElement();

		try {

			parseidentifyByAndlocator(hostObjLocator);
			WebElement root1 = driver.findElement(By.cssSelector(this.locator));

			// WebElement root1 = findWebElement(hostObjLocator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(hostObjLocator1);
			WebElement root2 = shadowRootElement.findElement(By.cssSelector(this.locator));
			Object shadowRoot2 = js.executeScript("return arguments[0].shadowRoot", root2);
			String id2 = (String) ((Map<String, Object>) shadowRoot2).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement2.setParent((RemoteWebDriver) driver);
			shadowRootElement2.setId(id2);

			parseidentifyByAndlocator(hostObjLocator2);
			WebElement root3 = shadowRootElement.findElement(By.cssSelector(this.locator));
			Object shadowRoot3 = js.executeScript("return arguments[0].shadowRoot", root2);
			String id3 = (String) ((Map<String, Object>) shadowRoot3).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement3.setParent((RemoteWebDriver) driver);
			shadowRootElement3.setId(id3);

			parseidentifyByAndlocator(childObjLocator);
			if (shadowRootElement3.findElement(By.cssSelector(this.locator)).isDisplayed()) {
				testStepPassed(this.locatorDescription + " is displayed");
			} else {
				testStepFailed(this.locatorDescription + " is not displayed");
			}
		} catch (Exception e) {
			testStepFailed("Exception in the method openShadowRoot " + e.toString());
		}
	}


	public void switchToDoctorApplication() {
		if (getConfigProperty("SequentialLaunch").equalsIgnoreCase("Yes")) {
			switchApplicationAndResetApp("AppName2");
		} else {
			switchApplicationAndResetApp("AppName1");
		}
	}

	public void resetDoctorAppAndLogOut() {
		if (getConfigProperty("SequentialLaunch").equalsIgnoreCase("Yes")) {
			resetAppAndLogOut("AppName2");
		} else {
			resetAppAndLogOut("AppName1");
		}
	}

	public void resetDoctorApp() {
		if (getConfigProperty("SequentialLaunch").equalsIgnoreCase("Yes")) {
			resetAppDoctor("AppName2");
		} else {
			resetAppDoctor("AppName1");
		}
	}

	public void openTwoShadowRootCompareText(String hostObjLocator, String hostObjLocator1,String childObjLocator, String expectedText) {
		RemoteWebElement shadowRootElement = new RemoteWebElement();
		RemoteWebElement shadowRootElement2 = new RemoteWebElement();

		try {

			parseidentifyByAndlocator(hostObjLocator);
			WebElement root1 = driver.findElement(By.cssSelector(this.locator));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Object shadowRoot = js.executeScript("return arguments[0].shadowRoot", root1);
			String id = (String) ((Map<String, Object>) shadowRoot).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement.setParent((RemoteWebDriver) driver);
			shadowRootElement.setId(id);

			parseidentifyByAndlocator(hostObjLocator1);
			WebElement root2 = shadowRootElement.findElement(By.cssSelector(this.locator));
			Object shadowRoot2 = js.executeScript("return arguments[0].shadowRoot", root2);
			String id2 = (String) ((Map<String, Object>) shadowRoot2).get("shadow-6066-11e4-a52e-4f735466cecf");
			shadowRootElement2.setParent((RemoteWebDriver) driver);
			shadowRootElement2.setId(id2);

			parseidentifyByAndlocator(childObjLocator);
			
			
			getAndMatchListElementTexts(this.locator, expectedText);
			
		} catch (Exception e) {
			testStepFailed("Exception in the method getText " + e.toString());
		}
	}
}