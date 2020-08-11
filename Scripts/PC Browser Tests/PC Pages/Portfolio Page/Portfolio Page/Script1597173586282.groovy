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

WebUI.click(findTestObject('web ui/Full Test/Page_Portfolio  STF Construction/div_Projects'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Procore Log In/span_STF Construction'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/a_STF Construction_LogoContainer-iPQNsa UuURl'))

WebUI.setText(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/input_CSV_search_search-input__10W13'), 
    'luna')

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/span_open dropdown'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/li_Program'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_Add Filters_rw-i rw-i-caret-down'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/li_Type'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_open dropdown'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/li_Active'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/div_Group Byopen dropdownProgramAdd Filters_0a5062'))

WebUI.setText(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/input_CSV_search_search-input__10W13'), 
    'luna')

WebUI.sendKeys(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/input_CSV_search_search-input__10W13'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/a_Clear All'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_Help_fa fa-cog'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/div_Filter Configuration'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/input_Enable Owner Type Filter_companyportf_3020f2'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/input_Enable Owner Type Filter_companyportf_3020f2'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/button_Update'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_Configuration saved successfully_fa fa-times'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_Help_fa fa-cog'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/div_Custom Reports'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/div_Permissions Table'))

WebUI.setText(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/input_Search Permissions_permissions_table_search'), 
    'adler')

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/div_Dashboard View Permissions'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/button_Update'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/button_Update'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_Configuration saved successfully_fa fa-times'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/img_Clear All_hover-icon'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/img_Clear All_hover-icon_1'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/span_4'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/a_Sara Tesler_fancybox-item fancybox-close'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/img_Clear All_hover-icon_1_2'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/img'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/button_STF ConstructionUnited States_gm-ui-_3efe51'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/div_Executive Dashboard'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Dashboards  STF Construction/a_STF Construction_LogoContainer-iPQNsa UuURl'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/div_My Open Items'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_Financial Views_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/a_Budget Variance'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_Add Filters_rw-i rw-i-caret-down'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/li_Stage'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/span_Add Filters_rw-select rw-btn'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/li_Status'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/li_Active_1'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_Financial Views_fa fa-caret-down_1'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/a_Contract Variance'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/a_Clear All'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_Financial Views_fa fa-caret-down_1'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/a_Contract Summary'))

WebUI.doubleClick(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/input_CSV_search_search-input__10W13'))

WebUI.setText(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/input_CSV_search_search-input__10W13'), 
    '')

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/i_Financial Views_fa fa-caret-down_1'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/a_Commitment Summary'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/div_Minimize Sidebar'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/a_Sara Tesler_fancybox-item fancybox-close'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/div_Export'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/span_Commitment Summary_caret'))

WebUI.click(findTestObject('Object Repository/web ui/Test Objects/Pages/Portfolio Page/Page_Portfolio  STF Construction/a_STF Construction_LogoContainer-iPQNsa UuURl'))

