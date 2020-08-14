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
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('web ui/Test Objects/Pages/Page_Procore Log In/h1_Select a company'), GlobalVariable.element_timeout)

WebUI.verifyElementVisible(findTestObject('web ui/Test Objects/Pages/Page_Procore Log In/img_Select a company_sc-fznZeY gJlwEu'))

WebUI.verifyTextPresent('Select a company', false)

WebUI.verifyElementPresent(findTestObject('web ui/Test Objects/Pages/Page_Procore Log In/div_Select a companyAdriana Mobile Test Com_4023ef'), 
    GlobalVariable.element_timeout)

WebUI.verifyElementPresent(findTestObject('web ui/Test Objects/Pages/Page_Procore Log In/div_Procore Field Productivity             _aa58a3'), 
    GlobalVariable.element_timeout)

WebUI.verifyElementPresent(findTestObject('web ui/Full Test/Page_Procore Log In/input_Everyone do your best work and get pa_5c9792'), 
    GlobalVariable.element_timeout)

WebUI.verifyElementPresent(findTestObject('web ui/Full Test/Page_Procore Log In/div_Procore Field Productivity             _aa58a3'), 
    GlobalVariable.element_timeout)

WebUI.click(findTestObject('web ui/Full Test/Page_Procore Log In/span_STF Construction'))

