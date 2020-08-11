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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.procore.com/')

WebUI.setText(findTestObject('Object Repository/Attribute Objects/Page_Procore Log In/input_Email_sessionemail'), 'admin@procore.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Attribute Objects/Page_Procore Log In/input_Password_sessionpassword'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.sendKeys(findTestObject('Object Repository/Attribute Objects/Page_Procore Log In/input_Password_sessionpassword'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Procore Log In/span_STF Construction'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Portfolio  STF Construction/path_Select a Project_CaretPath-STcPe soyKf'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Portfolio  STF Construction/a_Change'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Portfolio  STF Construction/span_On-Boarding Account'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Portfolio  On-Boarding Account/a_On-Boarding Account_LogoContainer-iPQNsa htNyoo'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Portfolio  On-Boarding Account/div_Company ToolsPortfolio'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Portfolio  On-Boarding Account/a_Portfolio'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Portfolio  On-Boarding Account/svg_Select a Project_CaretSVG-bHHlHZ ihpZOM'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Portfolio  On-Boarding Account/a_Change'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Portfolio  On-Boarding Account/span_STF Construction'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Portfolio  STF Construction/a_0001420'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/svg'))

WebUI.setText(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/input___input_input__2nVpu_QHByb search-bar_82ecf1'), 
    'curtain')

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/div_View all results'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/img_ArchitecturalArea 1_result_result__imag_bdfc95'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/img_ArchitecturalTOWER 1_result_result__ima_bbd01b'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/img_ArchitecturalTOWER 1_result_result__ima_bbd01b_1'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/img_ArchitecturalArea 1_result_result__imag_bdfc95_1'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/span_Drawings (4)'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/span___icon_icon__3YyB__QHByb results-page__711905'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/a_Click for forecast'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/a_High_fancybox-item fancybox-close'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/div_SA'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Home  Luna Stadium/a_Account  Admin Settings'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Account Information  STF Construction/a_Licensed_sidebar-collapse-bar sidebar-toggle'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Account Information  STF Construction/i_Licensed_fa fa-caret-left'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Account Information  STF Construction/span_0'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Account Information  STF Construction/div_SA'))

WebUI.click(findTestObject('Object Repository/Attribute Objects/Page_Account Information  STF Construction/a_Log Out'))

WebUI.closeBrowser()

