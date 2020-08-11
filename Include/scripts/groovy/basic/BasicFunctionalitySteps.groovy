package basic
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

class BasicFunctionalitySteps {


	@Given('The Dashboard Page is loaded successfully')
	def The_Dashboard_Page_is_loaded_successfully() {
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Select Company Page/The Company Selector Page loaded successfully'), [:],
		FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then('The Company Selector Page is loaded successfully')
	def The_Company_Selector_Page_is_loaded_successfully() {
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Select Company Page/The Company Selector Page loaded successfully'), [:],
		FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then('Select a company and change company workflow works as expected')
	def The_Company_Selector_features_function_correctly() {
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Select Company Page/Select a Company and change company works as expected'), [:],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then('There is an error message for invalid login credentials: "(.*)"')
	def There_is_an_error_message_for_invalid_login_credentials(String error_message) {
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Web Login/Verify login credential error message present'), ['error_message': error_message])
	}
}