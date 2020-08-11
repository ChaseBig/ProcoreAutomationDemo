package login
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


class LoginSteps {

	@Given('The Login page is loaded successfully')
	def The_Login_page_is_loaded_successfully() {
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Web Login/Login page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given('I already logged in the system')
	def I_already_logged_in_the_system () {
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Web Login/Login page is loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Web Login/Login with valid username and encrypted password'), [('username') : GlobalVariable.username
			, ('encryptedPassword') : GlobalVariable.encrypted_password], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Select Company Page/The Company Selector Page loaded successfully'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@When('I log into Procore with valid "(.*)" username and "(.*)" password')
	def I_login_the_system_with_valid_user_credentials(String username, String password) {
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Web Login/Login with valid username and password'), [('username') : username
			, ('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When('I attempt login with invalid "(.*)" username and "(.*)" password')
	def I_login_the_system_with_invalid_username(String username, String password) {
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Web Login/Verify login credential error message present'), [('username') : username
			, ('password') : password], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then('There is an error message for invalid password: "(.*)"')
	def There_is_an_error_message_for_invalid_password(String error_message) {
		WebUI.callTestCase(findTestCase('Test Cases/PC Browser Tests/PC Pages/Web Login/Verify login credential error message present'), ['error_message': error_message])
	}
}