import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('web ui/Test Objects/Pages/Page_Procore Log In/input_Email_sessionemail'), 'fake@prokore.com')

WebUI.setText(findTestObject('web ui/Test Objects/Pages/Page_Procore Log In/input_Password_sessionpassword'), 'fakepassword')

WebUI.click(findTestObject('web ui/Test Objects/Pages/Page_Procore Log In/button_Log In'))

WebUI.verifyElementPresent(findTestObject('web ui/Test Objects/Pages/Login Page/Page_Procore Log In/div_The email address or password you enter_2484ea'), 
    GlobalVariable.element_timeout)

WebUI.setText(findTestObject('web ui/Test Objects/Pages/Login Page/Page_Procore Log In/input_Email_sessionemail'), 'admin@procore.com')

WebUI.setText(findTestObject('web ui/Test Objects/Pages/Login Page/Page_Procore Log In/input_Password_sessionpassword'), 
    'fakePassworddd')

WebUI.click(findTestObject('web ui/Test Objects/Pages/Login Page/Page_Procore Log In/button_Log In'))

WebUI.verifyElementPresent(findTestObject('web ui/Test Objects/Pages/Login Page/Page_Procore Log In/div_The email address or password you enter_2484ea'), 
    GlobalVariable.element_timeout)

