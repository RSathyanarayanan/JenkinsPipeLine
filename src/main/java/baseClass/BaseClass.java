
package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import iSAFE.ApplicationKeywords;

public class BaseClass extends ApplicationKeywords
{

	////////////////////////////////////////////////////////////////////////////////
	//Function Name  :
	//Purpose        :
	//Parameters     :
	//Return Value   :
	//Created by     :
	//Created on     :      
	//Remarks        :
	/////////////////////////////////////////////////////////////////////////////////

	public BaseClass() {

		// TODO Auto-generated constructor stub
	}

	public void setup(String machineName, String host, String port,
			String browser, String os, String browserVersion, String osVersion,String sheetNo) {
		testDataSheetNo=Integer.parseInt(sheetNo);
		setEnvironmentTimeouts();

		if(machineName.equalsIgnoreCase("API") || machineName.contains("API")) {
			testStepPassed("API Lunched succesfully");
		}else {
			capability.setCapability("autoGrantPermissions", "true");
			openBrowser(machineName,host,port,browser,os,browserVersion,osVersion);
			if(getConfigProperty("SequentialLaunch").equalsIgnoreCase("Yes")) {
				openApplication(machineName, host, port, browser, os, browserVersion, osVersion);
			}
		}
		testResultsFolder(machineName.replace(" ",""), host, port, browser, os, browserVersion,
				osVersion);
		currentExecutionMachineName(machineName.replace(" ",""));

		if(getConfigProperty("SequentialLaunch").equalsIgnoreCase("Yes")) {

			openApplication(machineName, host, port, browser, os, browserVersion, osVersion);
		}
		testResultsFolder(machineName.replace(" ",""), host, port, browser, os, browserVersion,
				osVersion);
		currentExecutionMachineName(machineName.replace(" ",""));
	}

	public void setEnvironmentTimeouts()
	{
		setTimeouts();
	}
	public void closeAllSessions()
	{
		driver.quit();
	}


}

