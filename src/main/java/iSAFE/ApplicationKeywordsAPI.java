package iSAFE;

import static io.restassured.RestAssured.given;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import automationFramework.APIKeywords;
import baseClass.BaseClass;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class ApplicationKeywordsAPI extends ApplicationKeywords {

	String executionCount = null;

	public ApplicationKeywordsAPI(BaseClass obj) {
		super(obj);
	}

	// ------------------------------------------------------------------API
	// Methods-----------------------------------------------------------------------

	// ----------------------------------------------------------------API
	// AUTOMATION COMMON
	// METHODS--------------------------------------------------------------------------------------------------------------------------
	// Function Number 9:
	// This function can be used to convert strings like 'Today', 'Today+1' into
	// their proper date values [in the appropriate format]

	// Example 1:
	// String paramDateString = "Today";
	// String paramDateFormat = "M/d/yyyy";
	// String returnDate = GenericSelenium.returnFormattedDate(paramDateString,
	// paramDateFormat);
	// The above call would cause the current date to be returned in the 'M/d/yyyy'
	// format like '9/27/2012' etc.

	// Example 2:
	// String paramDateString = "Today+1";
	// String paramDateFormat = "dd MMM yyyy";
	// String returnDate = GenericSelenium.returnFormattedDate(paramDateString,
	// paramDateFormat);
	// The above call would cause tomorrow's date to be returned in the 'dd MMM
	// yyyy' format like '28 Sep 2012' etc.

	// Example 3:
	// String paramDateString = "Today-1";
	// String paramDateFormat = "dd MMM yyyy";
	// String returnDate = returnFormattedDate(paramDateString, paramDateFormat);
	// The above call would cause yesterday's date to be returned in the 'dd MMMM
	// yyyy' format like '26 Sep 2012' etc.
	public String returnFormattedDate(String paramDateString, String paramDateFormat) {
		String returnDate = "";
		try {
			paramDateString = paramDateString.toLowerCase();
			if (paramDateString.contains("today")) {
				int offsetDays;
				if (paramDateString.contains("+")) {
					// 'Java' throws an error when a string is attempted to be split using '+'
					// The error is 'Dangling meta character '+' near index 0 + ^'
					// So, we are replacing '+' with ';' and then splitting by ';' to get the
					// 'offsetDays'
					paramDateString = paramDateString.replace("+", ";");
					String[] dateStringArray = paramDateString.split(";");
					offsetDays = Integer.parseInt(dateStringArray[1]);
				} else if (paramDateString.contains("-")) {
					String[] dateStringArray = paramDateString.split("-");
					offsetDays = Integer.parseInt(dateStringArray[1]);
					// if the tester had given "today - 2", it means that '2' days should be reduced
					// from the current date
					// In order to reduce "2" days, "-2" should be passed to the the '.add' function
					// To convert "2" to "-2", we are subracting the "2" from "100" and then
					// subracting "100" from the
					// difference between "100" and "2", which is "98"
					// int difference = 100 - 2
					// offsetDays = 98 - 100
					// which would make 'offsetDays' as '-2'
					int difference = 100 - offsetDays;
					offsetDays = difference - 100;
				} else { // DateString is 'today'
					offsetDays = 0;
				}
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DATE, offsetDays);
				Date date = calendar.getTime();
				Format formatter = new SimpleDateFormat(paramDateFormat);
				returnDate = formatter.format(date).toString();
			} else {
				stepFailed("Option of date string '" + paramDateString + "' not coded for");
			}
		} catch (Exception e) {
			stepFailed("Exception while attempting to get formatted date :'" + e.getClass().getName()); // stepFailed
			// would not
			// give
			// screenshots
		}
		return returnDate;
	}

	// API Functions
	// Feb. 8th 2019 - Vaidy
	// This function would be used to create a folder named 'Input' under the
	// particular results directory
	// The entire folder path, including the folder name 'Input', would be passed as
	// a parameter to the function
	public void createInputParametersFolder(String paramResultsDirectory) {
		paramResultsDirectory = paramResultsDirectory.replace("/", "\\"); // to make the directory path as
		// "C:\TestResults\Input' when it is given
		// as 'C:/TestResults/Input'
		File file = new File(paramResultsDirectory + "");
		if (!file.exists()) {
			file.mkdir();
		}
	}

	// Feb. 8th 2019 - Vaidy
	// This function would be used to write the input parameters to a file
	// The input parameters would be given as an array like below:
	// parametersArray[0] = "Input Parameters for the 'AddOrUpdateClient' method:";
	// parametersArray[1] = "Username: <<<Username Value>>>";
	// and so on
	public void saveInputParametersToFile(String inputParametersFileName, ArrayList<String> parameterHeadersArray) {
		try {
			inputParametersFileName = inputParametersFileName.replace("/", "\\"); // to make the file path as
			// "C:\TestResults\Input\abcd.txt'
			// when it is given as
			// 'C:/Windows/Input/abcd.txt'
			File file = new File(inputParametersFileName);
			FileOutputStream fileOutputSteam = new FileOutputStream(file);
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputSteam));

			// parameterHeadersArray[0] = "Input Parameters for the 'AddOrUpdateClient'
			// method:";
			// parameterHeadersArray[1] = "Username: <<<Username Value>>>;
			// parameterHeadersArray[2] = "Password: <<<Password Value>>>;
			// Each of the parameter header would be written in a separate line
			// with two line spaces following it
			int numberOfParameters = parameterHeadersArray.size() - 1;
			int i;
			for (i = 0; i <= numberOfParameters; i++) {
				bufferedWriter.write(parameterHeadersArray.get(i));
				bufferedWriter.newLine();
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
		} catch (IOException e) {
			stepFailed("Exception while writing input parameters to file - '" + e.getClass().getName() + "'"); // 'stepFailed'
			// function
			// would
			// not
			// take
			// screenshot
			// in
			// the
			// latest
			// 'isafe'
			// jar -
			// iSAFE_3.0_Tactal_03052019.jar
		}
	}

	// Apr. 30th 2020 - Vaidy
	// This function would be used to create a folder named 'Ouptut' under the
	// particular results directory
	// This would be used in the 'Loan Data Movement' test case as its output would
	// be written in an excel file in the 'Output' folder
	// The entire folder path, including the folder name 'Input', would be passed as
	// a parameter to the function
	public void createOutputResultsolder(String paramResultsDirectory) {
		paramResultsDirectory = paramResultsDirectory.replace("/", "\\"); // to make the directory path as
		// "C:\TestResults\Input' when it is given
		// as 'C:/TestResults/Input'
		File file = new File(paramResultsDirectory + "");
		if (!file.exists()) {
			file.mkdir();
		}
	}

	public String GenerateAccessToken(String URI, String apiParams, String apiHeaders, String Req) {
		String accesstoken = null;
		testStepInfo("About to Generate Access Token");
		String tokenResponse = executehttpRequest(URI, apiParams, apiHeaders, Req);
		try {
			accesstoken = FindStringInResponse(tokenResponse, "idToken");
		} catch (JSONException | ParseException e) {
			e.printStackTrace();
		}
		if (accesstoken != null) {
			testStepPassed("Access Token : " + accesstoken);
		} else {
			testStepFailed("Access Token not Generated");
		}

		return accesstoken;
	}

	public String executehttpRequest(String URI, String apiParams, String apiHeaders, String Req) {

		String actualResponse = null;
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, Req);
		HttpUrl.Builder httpBuilder = HttpUrl.parse(URI).newBuilder();

		int i;
		okhttp3.Headers.Builder headersList = new okhttp3.Headers.Builder();

		if (apiHeaders != null) {
			String[] apiHeadersArray = apiHeaders.split("\\n");
			int numberOfApiHeaders = apiHeadersArray.length;
			String[] individualHeaderArray;
			for (i = 0; i < numberOfApiHeaders; i++) {
				individualHeaderArray = apiHeadersArray[i].split(",");
				headersList.add(individualHeaderArray[0], individualHeaderArray[1]);
			}
		}

		okhttp3.Headers headers = headersList.build();

		if (apiParams != null) {
			String[] apiParamsArray = apiParams.split("\\n");
			int numberOfApiParams = apiParamsArray.length;
			String[] individualParamsArray;
			for (i = 0; i < numberOfApiParams; i++) {
				individualParamsArray = apiParamsArray[i].split("=");
				httpBuilder.addQueryParameter(individualParamsArray[0], individualParamsArray[1]);
			}
		}

		Request request = new Request.Builder().url(httpBuilder.build()).method("POST", body).headers(headers).build();
		try {
			okhttp3.Response response = client.newCall(request).execute();
			actualResponse = response.body().string();

		} catch (Exception e) {

			stepFailed("Exception while attempting to execute the API method  - '" + e.getClass().getName() + "'");
		}
		return actualResponse;
	}

	// The 'API' functions are not getting executed with the default 'API' commands
	// of 'iSafe'
	// So, we had created our own method as below
	// The below method would set the headers and the body before executing the
	// 'API' function
	public Response executeAPIMethod(String apiURI, String apiParams, String apiHeaders, String apiBody) {

		// For 'OTP', 'Auth' etc., there are only two headers - Content Type and Seal
		// But for certain other 'APIs', there are three headers
		// So, we have given 'line-separated' headers in the 'TestData.xls' file as
		// below:
		// Content-Type,application json
		// SealValue,123123AFDasd
		// We form a list of headers with the line-separated headers read from the test
		// data file
		// and set this headers list in the command
		// We do the following:
		// Let us assume that the line-separated headers in the test data file is as
		// below:
		// Content-Type,application json
		// SealValue,seal
		// 1. Splitting by '\n' would cause headers array as follows:
		// headers array[0] = content-Type,application/json
		// headers-array[1] = SealValue,123123AFDasd
		// 2. Splitting each of the above headers array element by ',' would separate
		// the header name and header value as below:
		// Content-Type and application/json
		// SealValue and 123123AFDasd
		// 3. Adding each of the header name and value into a big headers list
		// 4. Setting this headers list in the 'API' command via. the '.headers'
		// function
		int i;
		List<Header> headersList = null;
		Map<String, String> paramsList = null;
		if (apiHeaders != null) {
			String[] apiHeadersArray = apiHeaders.split("\\n");
			int numberOfApiHeaders = apiHeadersArray.length;
			headersList = new ArrayList<Header>();
			String[] individualHeaderArray;
			for (i = 0; i < numberOfApiHeaders; i++) {
				individualHeaderArray = apiHeadersArray[i].split(",");
				headersList.add(new Header(individualHeaderArray[0], individualHeaderArray[1]));
			}
		}

		if (apiParams != null) {
			String[] apiParamsArray = apiParams.split("\\n");
			int numberOfApiParams = apiParamsArray.length;
			paramsList = new HashMap<>();
			String[] individualParamsArray;
			for (i = 0; i < numberOfApiParams; i++) {
				individualParamsArray = apiParamsArray[i].split("=");
				paramsList.put(individualParamsArray[0], individualParamsArray[1]);
			}
		}

		// At times, when the network or VPN is slow, an exception might be thrown
		// So, instead of attempting execution just once, we are attempting six times
		// with a '10-second' wait between each attempts
		for (i = 1; i <= 6; i++) {
			try {
				response = null; // nullifying the response at the start
				if (apiParams != null && apiHeaders != null) {
					response = given().queryParams(paramsList).headers(new Headers(headersList)).body(apiBody)
							.relaxedHTTPSValidation().when().post(apiURI);
				} else if (apiParams != null && apiHeaders == null) {
					response = given().queryParams(paramsList).body(apiBody).relaxedHTTPSValidation().when()
							.post(apiURI);
				} else if (apiParams == null && apiHeaders != null) {
					response = given().headers(new Headers(headersList)).body(apiBody).relaxedHTTPSValidation().when()
							.post(apiURI);
				}

				testStepPassed("API command executed successfully");
				break;
			} catch (Exception e) {
				if (i == 6) {
					stepFailed(
							"Exception while attempting to execute the API method  - '" + e.getClass().getName() + "'");
				} else {
					testStepInfo(
							"Exception while attempting to execute the API method  - '" + e.getClass().getName() + "'");
					waitTime(10); // a small before trying again
				}
			}
		}
		return response;
	}

	// This function can be used to extract the encrypted response from the response
	// file
	// Normally, the response would be given like below:
	// {"clientID":139618,"clientGUID":"c1gca195c551591","clientVendorNumber":"","clientName":"Ind_Client2_Jun21","isManualPayment":false,"callerID":"+12345678910111"}
	// Responses like this would be read by the 'getJSONResponse' method present in
	// 'Application Keywords'
	// But, the encrypted response of 'BFL' would be given as below:
	// "lAckimYZa1Pt8BpnSrfqEerMw9r0jvcRWX7S0XlFz+7VTkh4T0yeVqx73sz79oqw4t6I1s04sa..."
	// Such a response would not be returned by the default 'getJSONResponse' method
	// So, we have used the below function to get the encrypted response from the
	// output response file
	public String getEncryptedResponse() {
		String encryptedResponse = response.getBody().asString();

		// Normally for the APIs, the encrypted response would be like:
		// "lAckimYZa1Pt8BpnSrfqEegbSCcCmpImLUqGfpecQh8cbZFlJW4T8bihHjW\/5gJwg5tz\/pFcmOYvCnh9spU2lhu8X\/PJhHVJy\/4hdwNiv9A=|4e26b3cbbfd6ca34eba63972cdfeba8d"
		// Somehow, the response gets decrypted only when '/' is removed

		// But the encrypted response of 'Generic API Search' would be like:
		// aMoYMAxMkMeBMtlQqu7sWrjB58z2JSbMJgLrqE8lWRN+yw+y7jH/xQdJ2Gz6dFSToW1+BfFg53aK0P/HYNCjqGvEzOIhgb5KXSHXIf4sSNLMOXctN8+ZWspaSBMq+Em1C4JZv5thgMZCeq8lFX...
		// Somehow, the response does not get decrypted for 'Generic API Search' when
		// '/' is removed

		// Also, for other APIs, the response gets decrypted even when '\' is removed
		// In 'Generic API Search', '\' is not present
		// So, we are removing '\' instead of '/'

		// encryptedResponse = encryptedResponse.replace("/", "");
		encryptedResponse = encryptedResponse.replace("\\", "");

		// Also, we are removing the "" present at the start and at the end [double
		// quotes would not be present in 'Generic API Search'. Hence a condition]
		if (encryptedResponse.startsWith("\"")) {
			encryptedResponse = encryptedResponse.substring(1, encryptedResponse.length() - 1);
		}

		if (!encryptedResponse.equals("")) {
			testStepPassed("Encrypted response: " + encryptedResponse);
		} else {
			stepFailed("No response could be found in the execution of the API");
		}

		return encryptedResponse;
	}

	// The below function can be used to verify the values of various keys in the
	// response
	public void verifyResponse(JSONObject paramResponseObject, String paramExpectedValues) {

		// The expected values would normally be line-separated
		// but at times, it would also be given in a single line as:
		// {"PricingFees":"0",""ExtraPricingLimit":"123"...}

		// If it is line-separated, we split by the line separator (\n)
		// Otherwise by ',"

		// Removing any whitespace at the start and at the end via. trim
		// This trimming is needed in a particular case
		// When the expected values is given in a single line but with a single line
		// space
		// at the top, this trim is needed to remove that line space
		// If that line space is not removed, then the code would split
		// 'paramExpectedValues'
		// mistakenly by '\n' instead of ','
		System.out.println(paramExpectedValues);
		paramExpectedValues = paramExpectedValues.trim();
		System.out.println(paramExpectedValues);
		String[] expectedValuesArray = null;
		if (paramExpectedValues.contains("\n")) {
			expectedValuesArray = paramExpectedValues.split("\\n");
		} else {
			expectedValuesArray = paramExpectedValues.split(",");
		}
		int numberofExpectedValues = expectedValuesArray.length;
		int i;
		for (i = 0; i < numberofExpectedValues; i++) {
			// At times, there might be a line space at the start and at the end by mistake
			// Also, at times, the response pasted in the test data file might have the
			// opening and closing flower braces similar to the output given in 'One View'
			// For example, the response would have been pasted in the test data file as:
			//
			// {
			// "Name":"adfad"
			// }
			//
			// Instead of correcting this thing in the test data file, which might consume
			// lot of time, we are handling them in the script
			// by checking if the value is empty

			// If the response is given in a single line separated by 'comma' like below:
			// { "AUTHCODE": "TP123","CN": "2030400601061016","TXNTYPE": "OTPREQ"},
			// Splitting by ',' would cause '{' and '}' would cause as follows:
			// expectedValuesArray[0] = { "AUTHCODE": "TP123"
			// expectedValuesArray[1] = "CN" : "2030400601061016"
			// expectedValuesArra[2] = "TXNTYPE": "OTPREQ"}
			// So, we are removing the '{' and '}' before passing the values for
			// verification
			// We are triming once before verifying the 'Start' and the 'End' characters
			expectedValuesArray[i] = expectedValuesArray[i].trim();
			if (expectedValuesArray[i].startsWith("{")) {
				expectedValuesArray[i] = expectedValuesArray[i].substring(1);
			}
			if (expectedValuesArray[i].endsWith("}")) {
				expectedValuesArray[i] = expectedValuesArray[i].substring(0, expectedValuesArray[i].length() - 1);
			}

			if (!expectedValuesArray[i].isEmpty()) {

				// At times, the response given out by the 'API' would have parent and child
				// keys like
				// "SCHMINFO": [{
				// "ADVANCE_EMI":"0",
				// "SCHEMEID":"51232"
				// },{
				// "ADVANCE_EMI":"0",
				// "SCHEMEID":"51232"
				// }}
				// In such cases, we collect everything within the array into a string and
				// verify the key/value pairs
				// in that string via. a function named 'verifyKeyValuesInResponseArray'
				if (expectedValuesArray[i].contains("[")) {
					String parentResponseString = expectedValuesArray[i];
					while (!parentResponseString.contains("]")) { // from '[' till ']', everything is collected in
						// 'paramResponseString'
						i = i + 1;
						parentResponseString = parentResponseString + System.lineSeparator() + expectedValuesArray[i];
					}
					verifyKeyValuesInResponseArray(paramResponseObject, parentResponseString);
					testStepInfo(""); // to give a line spacing in the output file
				} else {
					testStepInfo("About to verify the Key/Value pair " + expectedValuesArray[i]);
					validateJSONResponseObject(paramResponseObject, expectedValuesArray[i]);
					testStepInfo(""); // to give a line spacing in the output file
				}
			}
		}
	}

	// At times, response would be given in the test data file as follows:
	/*
	 * { "CUSTINFO": [ { "CUSTID":"12345", "MOBNO": "9702295121", . . . }, {
	 * "CUSTID":"9876", "MOBNO": "8654395121", . . . } ], "RESPDESC": "SUCCESS",
	 * "RSPCODE": "00", . . . }
	 */
	// The below function can be used to verify such responses
	public void verifyKeyValuesInResponseArray(JSONObject paramResponseObject, String paramResponseString) {
		try {
			// The response string would be as:
			// "CUSTINFO" :
			// [{"ID":11111,"Name":"aaaa",...},{"ID":22222,"Name":"bbbb",...},...,{"ID":99999,"Name":"zzzz",...}]

			// First, we get the parent key
			// We are going to get the parent key "CUSTINFO" in the following way:
			// 1. Get the index of the character ':'
			// 2. Get from the entire response string, the substring till that index
			// 3. Replace the 'double quotes' and trim
			// The above steps would help to extract the parent key 'CUSTINFO' separately
			int firstColonIndex = paramResponseString.indexOf(":");
			String parentKey = paramResponseString.substring(0, firstColonIndex).replace("\"", "").trim();

			// Next, we collect each of the response items within "{" and "}" into a list
			// As we would not know the number of response items in advance, we have not
			// used an array
			// The response string would be as:
			// "CUSTINFO" :
			// [{"ID":11111,"Name":"aaaa",...},{"ID":22222,"Name":"bbbb",...},...,{"ID":99999,"Name":"zzzz",...}]
			// We are going to collect the values within each "{" and "}" in a list
			// After this process, the list would look like below:
			// 1st item of list = "ID":11111,"Name":"aaaa",...
			// 2nd item of list = "ID":22222,"Name":"bbbb",...

			// We are doing this by getting the index of "{" and its corresponding "}"
			// We then get the substring using these indices and add it to the list
			List<String> expectedResponseItemsList = new ArrayList<String>();
			int previousStartIndex = 0;
			int currentStartIndex, currentEndIndex;
			String responseItem;
			int numberOfExpectedResponseItems = 0;
			String result = "";
			do {
				currentStartIndex = paramResponseString.indexOf("{", previousStartIndex);
				if (currentStartIndex == -1) { // if "{" is not found, 'currentStartIndex' would be '-1'
					result = "responseItemsOver"; // this would cause the loop to break
				} else {
					currentEndIndex = paramResponseString.indexOf("}", currentStartIndex + 1);
					responseItem = paramResponseString.substring(currentStartIndex + 1, currentEndIndex);
					expectedResponseItemsList.add(responseItem);
					numberOfExpectedResponseItems = numberOfExpectedResponseItems + 1;
					previousStartIndex = currentEndIndex + 1;
				}
			} while (result.equals(""));

			if (!paramResponseObject.has(parentKey)) {
				stepFailed("Parent key '" + parentKey + "' is not present in the response '"
						+ paramResponseObject.toString() + "'");
			} else {
				testStepPassed("Parent key '" + parentKey + "' is present in the response");
				testStepInfo(""); // to give a line spacing in the output file

				String actualResponseString = getJSONObjectValue(paramResponseObject, parentKey);
				if (!isJSONValidArray(actualResponseString)) {
					stepFailed("Contrary to the expectation, the response of the parent key '" + parentKey
							+ "' is not an array");
				} else {
					testStepPassed("As expected, the response of the parent key '" + parentKey + "' is an array");
					testStepInfo(""); // to give a line spacing in the output file

					JSONArray actualResponseItemsArray = getJSONArray(paramResponseObject, parentKey);
					int numberOfActualResponseItems = actualResponseItemsArray.length();

					// We are going to compare the number of excepted response items [the one that
					// is read from the test data file]
					// with that of the actual
					// For example, the response -
					// {"ID":11111,"Name":"aaaa",...},{"ID":22222,"Name":"bbbb",...} - has two items
					// We are going to compare the key/value pairs of the expected response item
					// with that of the actual via. a 'for' loop
					// If there are three items in the expected response and only two in the actual
					// response, the 'for' loop should be run
					// only for two times as there would be an exception if it is attempted to run
					// for the third time
					// So, apart from printing failure statements in the report, we are also
					// deciding the end loop counter of the 'for' loop
					int endLoopCounter;
					if (numberOfActualResponseItems != numberOfExpectedResponseItems) {
						stepFailed("Response of Parent Key: " + parentKey);
						stepFailed("Expected number of items: " + numberOfExpectedResponseItems);
						stepFailed("Actual number of items: " + numberOfActualResponseItems);
						stepFailed(
								"Please check the expected and the actual response in the respective links in the test report");
						testStepInfo(""); // to give a line spacing in the output file

						if (numberOfActualResponseItems < numberOfExpectedResponseItems) {
							endLoopCounter = numberOfActualResponseItems;
						} else {
							endLoopCounter = numberOfExpectedResponseItems;
						}
					} else {
						testStepPassed("Response of Parent Key: " + parentKey);
						testStepPassed("Expected number of items: " + numberOfExpectedResponseItems);
						testStepPassed("Actual number of items: " + numberOfActualResponseItems);
						testStepInfo(""); // to give a line spacing in the output file

						endLoopCounter = numberOfExpectedResponseItems;
					}

					// Finally, we compare the expected individual key/value pairs of the child with
					// that of the actual
					// via. the 'validateJSONResponseObject' method
					// The actual child response object would be got from the actual response items
					// array
					// The expected individual key/value pairs of the child would be line separated
					// like below:
					// "ID":"11111"
					// "Name":"aaaa"
					// The individual key/value pairs would be got by splitting the expected pairs
					// by '\n'
					int i;
					JSONObject actualchildResponseObject;
					for (i = 0; i < endLoopCounter; i++) {
						actualchildResponseObject = actualResponseItemsArray.getJSONObject(i);

						String[] expectedChildKeyValuePairsArray = expectedResponseItemsList.get(i).split("\\n");
						int numberOfExpectedChildKeyValuePairs = expectedChildKeyValuePairsArray.length;

						String individualChildKeyValuePair;
						int j;

						testStepInfo("About to verify the values of the child keys of response number '" + (i + 1)
								+ "' of the parent key '" + parentKey + "'");
						testStepInfo(""); // to give a line spacing in the output file
						for (j = 0; j < numberOfExpectedChildKeyValuePairs; j++) {
							individualChildKeyValuePair = expectedChildKeyValuePairsArray[j];
							individualChildKeyValuePair = individualChildKeyValuePair.replace("{", ""); // if in case,
							// there is a
							// '{', we are
							// removing it
							individualChildKeyValuePair = individualChildKeyValuePair.replace("}", ""); // if in case,
							// there is a
							// '}', we are
							// removing it
							individualChildKeyValuePair = individualChildKeyValuePair.trim(); // we are triming once to
							// remove white space
							if (!individualChildKeyValuePair.isEmpty()) {
								testStepInfo("About to verify the Key/Value pair " + individualChildKeyValuePair);
								validateJSONResponseObject(actualchildResponseObject, individualChildKeyValuePair);
								testStepInfo(""); // to give a line spacing in the output file
							}
						}
						testStepInfo("Completed verification of the child keys of response number '" + (i + 1)
								+ "' of the parent key '" + parentKey + "'");
						testStepInfo(""); // to give a line spacing in the output file
					}
				}
			}
		} catch (Exception e) {
			stepFailed("Exception '" + e.getClass().getName()
					+ "' while attempting to get the verify the values in the response '"
					+ paramResponseObject.toString() + "'");
		}
	}

	// The 'validateJSONResponseObject' method in 'iSafe' validates key value pairs
	// but when there is a mismatch, it does not explicitly say that
	// It just says that the actual response for the key does not match the expected
	// response
	// Also, it causes a blank screenshot to be displayed [it might have used the
	// 'testStepFailed' method]
	// Moreover, when the value of the key contains a ':' like
	// 'https://admin-qa2.icommconnect.com',
	// the validation fails
	// Also, it accepts the key/value pair only as 'domain:automation.com'
	// It does not accept it as "domain";"automation.com", which might be the way
	// the key value pairs are given at times
	// To fix these points and to cause the 'Pass/Fail' to be printed in different
	// lines, had overridden the function
	@Override
	public void validateJSONResponseObject(JSONObject paramResponseObject, String paramExpectedKeyValuePair) {

		// If there is a comma in the value that is given in a single line, then
		// splitting by comma
		// in the 'verifyResponse' function would have caused the value to incorrectly
		// get split
		// For example the below key/Value pair
		// "Address":"First Street, Abcd City"
		// would cause the key/value pair to become "Address":"First Street" and "Abcd
		// City"
		// Though there would be a mismatch while verifying the value of "Address",
		// there would be anj
		// exception while attempting to verify "Abcd City" as that is not in the
		// key/value pair format
		// To preent this, we are not perfoming this function when there is no ":" in
		// the 'key/Value' pair
		if (!paramExpectedKeyValuePair.contains(":")) {
			testStepFailed("The text to be verified '" + paramExpectedKeyValuePair
					+ "' does not have a colon [:] in it and hence may not be a proper key/value pair.  This might happen if there is a comma in the original value [due to which it might have incorrectly got separated when splitting by comma at the start of the verification]");
		} else {
			// Let us assume the below key/value pair:
			// Logo: https://admin-qa2.icommconnect.com
			// When this is split with ':', it would cause the resultant array to be as
			// follows:
			// splitArray[0] - "Logo"
			// splitArray[1] = " https"
			// splitArray[2] = "admin-qa2.icommconnect.com"
			// The value would itself get split, which would lead to a failure
			// In order to prevent this, we are splitting the key/value pair only once with
			// ':'
			// We are doing this by passing '2' to the 'limit' parameter of the 'split'
			// command
			// This '2' would cause the split to be done only once
			// So, the resultant array would be proper as follows:
			// splitArray[0] - "Logo"
			// splitArray[1] = "https://admin-qa2.icommconnect.com"

			String[] expectedKeyValueArray = paramExpectedKeyValuePair.split(":", 2);

			// At times, the key/value pair might be given with 'double quotes'as follows:
			// "clientName":"abcd"
			// We are removing the 'double quotes' from both the key and the value
			// We are also removing the leading space present in the value
			// And if the value is given as "" [like "IVRExt":""], we are blanking it out
			String expectedKey = expectedKeyValueArray[0].replace("\"", "").trim();

			// When the key value pairs are separated by '\n', they might have ',' at the
			// end
			// like "RSPCODE":"00",
			// In such cases, we are removing the ',' at the end
			// When the key value pairs are given in a single line, they would be separated
			// by ','
			// in the scenario and hence might have '} at the end like
			// "TXNTYPE":"CAN"}
			// In such cases, we are removing the '}' at the end
			// We are removing extra spaces [via. trim] before checking for the presence of
			// ',' and '} at the end
			// We are removing extra spaces [via. trim] after all the replacements to remove
			// any new whitespace
			String expectedValue = expectedKeyValueArray[1].trim();
			if (expectedValue.endsWith(",")) {
				expectedValue = expectedValue.substring(0, expectedValue.length() - 1);
			}
			if (expectedValue.endsWith("}")) {
				expectedValue = expectedValue.substring(0, expectedValue.length() - 1);
			}
			if (expectedValue.equals("\"\"")) {
				expectedValue = "";
			} else {
				expectedValue = expectedValue.replace("\"", "");
			}
			// We are commenting the below line as it results in the validation failure
			// i.e if the actual value has a space before the closing quotes ["HEADER
			// PROFILE ID "],
			// the expected value is getting printed without the space at the end as we had
			// used the trim function
			// expectedValue = expectedValue.trim();

			String actualValue = getJSONObjectValue(paramResponseObject, expectedKey, expectedValue);

			// If the key is not present in the 'JSON', 'actualValue' would be null
			if (actualValue != null) {
				if (expectedValue.equalsIgnoreCase(actualValue)) {
					testStepPassed("Response Key: " + expectedKey);
					testStepPassed("Expected Value: '" + expectedValue + "'");
					testStepPassed("Actual Value: '" + actualValue + "'");
				} else {
					testStepFailed("Response Key: " + expectedKey);
					testStepFailed("Expected Value: '" + expectedValue + "'");
					testStepFailed("Actual Value: '" + actualValue + "'");
				}
			}
		}
	}

	// When a key is not present, the 'getJSONObjectValue' function in
	// 'ApplicationKeywords' prints failure with a
	// blank screenshot [probably, it would have the 'testStepFailed' function]
	// So, we had overridden the function to print failure with the 'stepFailed'
	// function
	public String getJSONObjectValue(JSONObject paramResponseObject, String paramKey, String expectedValue) {
		String actualValue = null;
		try {
			// At times, response would be got as follows:
			/*
			 * { "CUSTINFO": [ { "CUSTID":"12345", "MOBNO": "9702295121", . . . }, {
			 * "CUSTID":"9876", "MOBNO": "8654395121", . . . } ], "RESPDESC": "SUCCESS",
			 * "RSPCODE": "00", . . . }
			 */
			// Here 'CUSTID' and 'MOBNO' are keys of the parent key 'CUSTINFO'
			// To get their values, we need to first get the array of values of the parent
			// 'CUSTINFO'
			// Then, we would get the values of 'CUSTID' and 'MOBNO' from the appropriate
			// index of the array
			// To get the value of the 'CUSTID' of the first element of the array, we need
			// to get it from
			// the 0th index of the array
			// To get the value of the 'CUSTID' of the second element of the array, we need
			// to get it from
			// the 1st index of the array
			// The key of such values might be given in the 'TestData.xls' file as:
			// CUSTINFO.1.CUSTUD, CUSTINFO.2.MOBNO etc.
			// In these cases, we do the following:
			// 1. Separate the 'Parent Key', 'Parent Key Array Index' and the 'Child Key' by
			// splitting with the dot
			// 2. Get the JSON response array of the parent key
			// 3. Get the element of the appropriate index of the JSON array
			// 4. Get the value of the child key from that particular array element
			if (paramKey.contains(".")) {
				String[] expectedKeysArray = paramKey.split("\\.", 2);
				String parentKey = expectedKeysArray[0];
				String childKey = expectedKeysArray[1];
				if (paramResponseObject.has(parentKey)) {
					Object obj = paramResponseObject.get(parentKey);
					if (obj instanceof JSONArray) {
						JSONArray responseArray = paramResponseObject.getJSONArray(parentKey);
						for (int i = 0; i < responseArray.length(); i++) {
							JSONObject responseObject = responseArray.getJSONObject(i);
							actualValue = getJSONObjectValue(responseObject, childKey, expectedValue);
							if (actualValue.equals(expectedValue)) {
								testStepPassed(expectedValue + "matched with actual Value : " + actualValue);
								break;
							}
						}
					} else if (obj instanceof JSONObject) {
						JSONObject responseObject = paramResponseObject.getJSONObject(parentKey);
						actualValue = getJSONObjectValue(responseObject, childKey, expectedValue);
					}
				} else {
					stepFailed("Key '" + parentKey + "' not present in the response ");
				}
			} else {
				if (paramResponseObject.has(paramKey)) {
					actualValue = paramResponseObject.get(paramKey).toString();
				} else {
					stepFailed("Key '" + paramKey + "' not present in the response ");
				}
			}
		} catch (Exception e) {
			System.err
					.println("Exception '" + e.getClass().getName() + "' while attempting to get the value of the key '"
							+ paramKey + " from the response '" + paramResponseObject.toString() + "'");
		}
		return actualValue;
	}

	public String getJSONObjectWithMultipleValues(JSONObject paramResponseObject, String paramKey) {
		String actualValue = null;
		try {

			{
				if (paramResponseObject.has(paramKey)) {
					actualValue = paramResponseObject.getString(paramKey);
				} else {
					stepFailed("Key'" + paramKey + "' not present in the response '" + paramResponseObject.toString()
							+ "'");
				}
			}
		} catch (Exception e) {
			stepFailed("Exception '" + e.getClass().getName() + "' while attempting to get the value of the key '"
					+ paramKey + " from the response '" + paramResponseObject.toString() + "'");
		}
		return actualValue;

	}

	// This function would be used to write the output responses to a file
	// This would be done by default in the old 'iSafe' jar that used 'CURL'
	// But in the new 'Rest Assured', this file needs to be created manually
	public void saveOutputResponsesToFile(String outputResponsesFileName, String outputResponse) {
		try {

			// In this file, we are going to write the following details:
			// Response Status Line - HTTP 200 OK
			// Response Headers like date, cache-control etc.
			// Response Time in seconds
			// Encrypted Response
			// Decrypted Response

			// We are going to write each of these things under appropriate heading with
			// two line spaces between each

			// Firstly, we would write the heading 'Report Status Line:' and the value of
			// this in the next line
			// Then after two line spaces, we would write the header 'Response Headers:'
			// with each of the headers in separate lines
			// Then, we would write the response time
			// Then the encrypted response
			// Lastly the decrypted response

			// Creating the output responses file
			outputResponsesFileName = outputResponsesFileName.replace("/", "\\"); // to make the file path as
			// "C:\TestResults\Input\abcd.txt'
			// when it is given as
			// 'C:/Windows/Input/abcd.txt'
			File file = new File(outputResponsesFileName);
			FileOutputStream fileOutputSteam = new FileOutputStream(file);
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputSteam));

			// Response Status Line
			String responseStatusLine = response.getStatusLine();
			bufferedWriter.write("Response Status:");
			bufferedWriter.newLine();
			bufferedWriter.write(responseStatusLine);

			// Two line spaces
			bufferedWriter.newLine();
			bufferedWriter.newLine();

			// Response Headers
			Headers responseHeaders = response.headers();
			bufferedWriter.write("Response Headers:");
			for (Header responseHeader : responseHeaders) {
				bufferedWriter.newLine();
				bufferedWriter.write(responseHeader.toString());
			}

			// Two line spaces
			bufferedWriter.newLine();
			bufferedWriter.newLine();

			// Response Time
			// We would get this in milliseconds and write it in seconds
			// For example, '703' milliseconds would be written as '0.703' seconds
			long responseMilliSeconds = response.getTimeIn(TimeUnit.MILLISECONDS);
			bufferedWriter.write("Response Time:");
			bufferedWriter.newLine();
			bufferedWriter.write(responseMilliSeconds / 1000 + "." + responseMilliSeconds % 1000 + " seconds");

			// Two line spaces
			bufferedWriter.newLine();
			bufferedWriter.newLine();

			// Output Response
			bufferedWriter.write("Output Response:");
			bufferedWriter.newLine();
			bufferedWriter.write(outputResponse);

			// Saving the file
			bufferedWriter.close();
		} catch (IOException e) {
			stepFailed("Exception while writing to output responses to file - '" + e.getClass().getName() + "'"); // 'stepFailed'
			// function
			// would
			// not
			// take
			// screenshot
			// in
			// the
			// latest
			// 'isafe'
			// jar
			// -
			// iSAFE_3.0_Tactal_03052019.jar
		}
	}

	// This function would be used to write the output responses to a file
	// This would be done by default in the old 'iSafe' jar that used 'CURL'
	// But in the new 'Rest Assured', this file needs to be created manually
	public void saveXMLOutputResponsesToFile(String outputResponsesFileName, String xmlResponseString) {
		try {

			// In this file, we are going to write the following details:
			// Response Status Line - HTTP 200 OK
			// Response Headers like date, cache-control etc.
			// Response Time in seconds

			// We are going to write each of these things under appropriate heading with
			// two line spaces between each

			// Firstly, we would write the heading 'Report Status Line:' and the value of
			// this in the next line
			// Then after two line spaces, we would write the header 'Response Headers:'
			// with each of the headers in separate lines
			// Then, we would write the response time

			// Creating the output responses file
			outputResponsesFileName = outputResponsesFileName.replace("/", "\\"); // to make the file path as
			// "C:\TestResults\Input\abcd.txt'
			// when it is given as
			// 'C:/Windows/Input/abcd.txt'
			File file = new File(outputResponsesFileName);
			FileOutputStream fileOutputSteam = new FileOutputStream(file);
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputSteam));

			// Response Status Line
			String responseStatusLine = response.getStatusLine();
			bufferedWriter.write("Response Status:");
			bufferedWriter.newLine();
			bufferedWriter.write(responseStatusLine);

			// Two line spaces
			bufferedWriter.newLine();
			bufferedWriter.newLine();

			// Response Headers
			Headers responseHeaders = response.headers();
			bufferedWriter.write("Response Headers:");
			for (Header responseHeader : responseHeaders) {
				bufferedWriter.newLine();
				bufferedWriter.write(responseHeader.toString());
			}

			// Two line spaces
			bufferedWriter.newLine();
			bufferedWriter.newLine();

			// Response Time
			// We would get this in milliseconds and write it in seconds
			// For example, '703' milliseconds would be written as '0.703' seconds
			long responseMilliSeconds = response.getTimeIn(TimeUnit.MILLISECONDS);
			bufferedWriter.write("Response Time:");
			bufferedWriter.newLine();
			bufferedWriter.write(responseMilliSeconds / 1000 + "." + responseMilliSeconds % 1000 + " seconds");

			// Two line spaces
			bufferedWriter.newLine();
			bufferedWriter.newLine();

			// XML Response
			bufferedWriter.write("XML Response:");
			bufferedWriter.newLine();
			bufferedWriter.write(xmlResponseString);

			// Saving the file
			bufferedWriter.close();
		} catch (IOException e) {
			stepFailed("Exception while writing to output responses to file - '" + e.getClass().getName() + "'"); // 'stepFailed'
			// function
			// would
			// not
			// take
			// screenshot
			// in
			// the
			// latest
			// 'isafe'
			// jar
			// -
			// iSAFE_3.0_Tactal_03052019.jar
		}
	}

	// This function would be used to write the output responses to a file
	// This would be done by default in the old 'iSafe' jar that used 'CURL'
	// But in the new 'Rest Assured', this file needs to be created manually
	public void saveXMLOutputResponseToFileUI(String outputResponsesFileName, String xmlResponseString) {
		try {

			// We are going to write each of these things under appropriate heading with
			// two line spaces between each

			// Firstly, we would write the heading 'Report Status Line:' and the value of
			// this in the next line
			// Then after two line spaces, we would write the header 'Response Headers:'
			// with each of the headers in separate lines
			// Then, we would write the response time

			// Creating the output responses file
			outputResponsesFileName = outputResponsesFileName.replace("/", "\\"); // to make the file path as
			// "C:\TestResults\Input\abcd.txt'
			// when it is given as
			// 'C:/Windows/Input/abcd.txt'
			File file = new File(outputResponsesFileName);
			FileOutputStream fileOutputSteam = new FileOutputStream(file);
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputSteam));

			// One line spaces
			bufferedWriter.newLine();

			// XML Response
			bufferedWriter.write("XML Response:");
			bufferedWriter.newLine();
			bufferedWriter.write(xmlResponseString);

			// Saving the file
			bufferedWriter.close();
		} catch (IOException e) {
			stepFailed("Exception while writing to output responses to file - '" + e.getClass().getName() + "'"); // 'stepFailed'
			// function
			// would
			// not
			// take
			// screenshot
			// in
			// the
			// latest
			// 'isafe'
			// jar
			// -
			// iSAFE_3.0_Tactal_03052019.jar
		}
	}

	public void compareTwoValuesWithContains(String pdfText, String actualText) {

		try {
			if (pdfText.contains(actualText)) {
				testStepPassed("Successfully [ " + actualText + " ] text is present in pdf document.");
			} else {
				testStepFailed("Expected value is not present in Present.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void setPropertiesFile(String propertyKey, String propertyValue) {
		try {
			String path = "./PropertiesFile/randomNumbers.properties";
			Properties p = new Properties();
			p.setProperty(propertyKey, propertyValue);
			p.store(new FileWriter(path), "");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Method to validate the Json responses without ISAFE API keywords

	// We are going to retrieve specific data from the response with the help of key
	/**
	 * It takes response and key as inputs And returns value for that key as String
	 * 
	 * @param response API Response from the request
	 * @param key      Key to be found
	 * @return Returns the value of the key
	 */

	public static String FindStringInResponse(String response, String key) throws JSONException, ParseException {
		String res = response;
		String value = null;

		if (!res.isEmpty()) {
			value = GetJsonValue(res, key);
		}

		return value;
	}

	public static String GetJsonValue(String response, String key) throws JSONException {

		JSONObject json = new JSONObject(response);
		Iterator<?> KeysItr;
		String nextKeys, value = "";

		// Check json is not null for further processing
		if (!json.has(key)) {
			// Set first key to the iterator
			KeysItr = json.keys();

			// run the loop until the json has next
			while (KeysItr.hasNext()) {
				nextKeys = (String) KeysItr.next();

				try {
					// Check is the value of key is an instance jsonobject
					if (json.get(nextKeys) instanceof JSONObject) {
						return GetJsonValue(json.getJSONObject(nextKeys).toString(), key);

					}
					// Check is the value of key is an instance of jsonArray
					else if (json.get(nextKeys) instanceof JSONArray) {
						JSONArray jsonArray = json.getJSONArray(nextKeys);
						int i = 0;

						if (i < jsonArray.length()) // Iterate inside the array
							do {
								String jsonArrayString = jsonArray.get(i).toString();
								JSONObject innerJson = new JSONObject(jsonArrayString);
								return GetJsonValue(innerJson.toString(), key);
							} while (i < jsonArray.length());
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} else {
			value = json.get(key).toString();
		}
		return value;
	}

	public Response executeGetAPIMethod(String apiURI, String apiParams, String apiHeaders) {
		int i;
		List<Header> headersList = null;
		Map<String, String> paramsList = null;
		if (apiHeaders != null) {
			String[] apiHeadersArray = apiHeaders.split("\\n");
			int numberOfApiHeaders = apiHeadersArray.length;
			headersList = new ArrayList<Header>();
			String[] individualHeaderArray;
			for (i = 0; i < numberOfApiHeaders; i++) {
				individualHeaderArray = apiHeadersArray[i].split(",");
				headersList.add(new Header(individualHeaderArray[0], individualHeaderArray[1]));
			}
		}
		if (apiParams != null) {
			String[] apiParamsArray = apiParams.split("\\n");
			int numberOfApiParams = apiParamsArray.length;
			paramsList = new HashMap<>();
			String[] individualParamsArray;
			for (i = 0; i < numberOfApiParams; i++) {
				individualParamsArray = apiParamsArray[i].split("=");
				paramsList.put(individualParamsArray[0], individualParamsArray[1]);
			}
		}

		// At times, when the network or VPN is slow, an exception might be thrown
		// So, instead of attempting execution just once, we are attempting six times
		// with a '10-second' wait between each attempts
		for (i = 1; i <= 6; i++) {
			try {
				response = null; // nullifying the response at the start

				if (apiParams != null && apiHeaders != null) {
					response = given().queryParams(paramsList).headers(new Headers(headersList))
							.relaxedHTTPSValidation().when().get(apiURI);
				} else if (apiParams != null && apiHeaders == null) {
					response = given().queryParams(paramsList).relaxedHTTPSValidation().when().get(apiURI);
				} else if (apiParams == null && apiHeaders != null) {
					response = given().headers(new Headers(headersList)).relaxedHTTPSValidation().when().get(apiURI);
				} else if (apiParams == null && apiHeaders == null) {
					response = given().get(apiURI);
				}
				testStepPassed("API command executed successfully");
				break;
			} catch (Exception e) {
				if (i == 6) {
					stepFailed(
							"Exception while attempting to execute the API method - '" + e.getClass().getName() + "'");
				} else {
					testStepInfo(
							"Exception while attempting to execute the API method - '" + e.getClass().getName() + "'");
					waitTime(10); // a small before trying again
				}
			}
		}
		return response;
	}

	public void saveDirectOutputResponse(String inputParametersFileName, String outputResponse) {
		try {
			inputParametersFileName = inputParametersFileName.replace("/", "\\"); // to make the file path as
			// "C:\TestResults\Input\abcd.txt'
			// when it is given as
			// 'C:/Windows/Input/abcd.txt'
			File file = new File(inputParametersFileName);
			FileOutputStream fileOutputSteam = new FileOutputStream(file);
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputSteam));
			testStepInfo("");
			bufferedWriter.write(outputResponse);
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch (IOException e) {
			stepFailed("Exception while writing input parameters to file - '" + e.getClass().getName() + "'"); // 'stepFailed'
			// function
			// would
			// not
			// take
			// screenshot
			// in
			// the
			// latest
			// 'isafe'
			// jar -
			// iSAFE_3.0_Tactal_03052019.jar
		}
	}

	public String getToken(String token) {
		String path = "./src/main/resources/PropertiesFile/Token.properties";
		FileReader reader;
		try {
			reader = new FileReader(path);
			Properties tokenFile = new Properties();
			tokenFile.load(reader);
			token = tokenFile.getProperty(token);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return token;
	}

	public boolean checkJsonObject(org.json.JSONObject jsonObject, String expectedValues) {
		boolean flag = false;
		try {
			String[] expectedArray = expectedValues.split("\\n");

			String[] checkKey = expectedArray[0].replace(",", "").replace("\"", "").trim().split(":");

			if (FindStringInResponse(jsonObject.toString(), checkKey[0]).trim().equalsIgnoreCase(checkKey[1].trim())) {
				flag = true;
			}

		} catch (Exception e) {
			flag = false;
		}

		return flag;
	}
	
	public void validateKeyInJSONArray(String responseBody, String expectedValues)
	{
		try
		{
			boolean status = false;
			JSONArray jsonArray = new JSONArray(responseBody);
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				if (checkJsonObject(jsonObject, expectedValues)) {
					verifyResponse(jsonObject, expectedValues);
					status = true;
					break;
				}
			}
			if(status == false)
			{
				testStepFailed("Error in the method checkJsonObject. Check the expected Values.");
			}
		}
		 catch (Exception e) {
				testStepFailed("Exception in the method validateKeyInJSONArray " +e.toString());
			}

	}

}
