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

WebUI.click(findTestObject('web ui/Full Test/Page_Procore Log In/span_STF Construction'))

WebUI.click(findTestObject('web ui/Full Test/Page_Portfolio  STF Construction/a_STF Construction_LogoContainer-iPQNsa UuURl'))

WebUI.click(findTestObject('web ui/Full Test/Page_Portfolio  STF Construction/svg_Select a Project_CaretSVG-bHHlHZ ihpZOM'))

WebUI.click(findTestObject('web ui/Full Test/Page_Portfolio  STF Construction/a_Change'))

WebUI.click(findTestObject('web ui/Full Test/Page_Portfolio  STF Construction/span_On-Boarding Account'))

WebUI.click(findTestObject('web ui/Full Test/Page_Portfolio  On-Boarding Account/div_Company ToolsPortfolio'))

WebUI.click(findTestObject('web ui/Full Test/Page_Portfolio  On-Boarding Account/a_Portfolio'))

WebUI.click(findTestObject('web ui/Full Test/Page_Portfolio  On-Boarding Account/div_On-Boarding AccountSelect a Project'))

WebUI.click(findTestObject('web ui/Full Test/Page_Portfolio  On-Boarding Account/a_Change'))

WebUI.click(findTestObject('web ui/Full Test/Page_Portfolio  On-Boarding Account/span_STF Construction'))
