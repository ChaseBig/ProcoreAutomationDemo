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

WebUI.setText(findTestObject('Page_Procore Log In/input_Email_sessionemail'), 'admin@procore.com')

WebUI.setEncryptedText(findTestObject('Page_Procore Log In/input_Password_sessionpassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Procore Log In/button_Log In'))

WebUI.click(findTestObject('Page_Procore Log In/span_STF Construction'))

WebUI.click(findTestObject('Page_Portfolio  STF Construction/svg_Select a Project_CaretSVG-bHHlHZ ihpZOM'))

WebUI.click(findTestObject('Page_Portfolio  STF Construction/a_Change'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/span_STF Construction'))

WebUI.click(findTestObject('Page_Portfolio  STF Construction/a_STF Construction_LogoContainer-iPQNsa UuURl'))

WebUI.click(findTestObject('Page_Portfolio  STF Construction/div_Executive Dashboard'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Dashboards  STF Construction/i_Add Filter_rw-i rw-i-caret-down'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Dashboards  STF Construction/span_Project Number'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Dashboards  STF Construction/input_(Blank)_filter-checkbox-input'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Dashboards  STF Construction/div_Add Filteropen dropdownProject Number00_b88477'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Dashboards  STF Construction/svg_Reports_CaretSVG-bHHlHZ ihpZOM'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Dashboards  STF Construction/a_Concierge'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/a_Luna Stadium'))

WebUI.click(findTestObject('Page_Home  Luna Stadium/a_Click for forecast'))

WebUI.click(findTestObject('Page_Home  Luna Stadium/a_High_fancybox-item fancybox-close'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Home  Luna Stadium/span_Due Date_collapsible_module collapsed _c0e9fb'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Home  Luna Stadium/span_Sara Farley_collapsible_module collaps_b7ce62'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Home  Luna Stadium/span__collapsible_module collapsed black-icon'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Home  Luna Stadium/div_Minimize Sidebar'))

WebUI.click(findTestObject('Page_Home  Luna Stadium/a_High_fancybox-item fancybox-close'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Home  Luna Stadium/span_86'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Home  Luna Stadium/a_011000-30'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Submittals  Luna Stadium/a_Related Items (0)'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Related Items  Luna Stadium/svg_Submittals_CaretSVG-bHHlHZ ihpZOM'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Related Items  Luna Stadium/a_Documents'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Documents  Luna Stadium/span_Testing this'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Documents  Luna Stadium/span_new new'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Documents  Luna Stadium/span_New Documents This Week'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Documents  Luna Stadium/span_Items You Are Tracking'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Documents  Luna Stadium/span_Recycle Bin'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Documents  Luna Stadium/svg_Documents_CaretSVG-bHHlHZ ihpZOM'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Documents  Luna Stadium/div_Project ToolsDocuments'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Documents  Luna Stadium/a_Directory'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Directory  Luna Stadium/div_Project ToolsDirectory'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Directory  Luna Stadium/div_Contacts'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Directory  Luna Stadium/div_Companies'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Directory  Luna Stadium/div_Distribution Groups'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Directory  Luna Stadium/div_Inactive Users'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Directory  Luna Stadium/div_Inactive Contacts'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Directory  Luna Stadium/div_Inactive Companies'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Directory  Luna Stadium/i_Help_fa fa-cog'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Directory  Luna Stadium/div_Project ToolsDirectory'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Directory  Luna Stadium/a_Meetings'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Meetings  Luna Stadium/span_Add Filter_collapsible_module collapse_b58f0c'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Meetings  Luna Stadium/span_Add Filter_collapsible_module collapse_b58f0c'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Meetings  Luna Stadium/div_Project ToolsMeetings'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Meetings  Luna Stadium/a_Schedule'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Schedule  Luna Stadium/span_Day'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Schedule  Luna Stadium/i_Send Feedback_core-l-tool-header__icon ci ci-cog'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Schedule  Luna Stadium/div_Project ToolsSchedule'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Schedule  Luna Stadium/a_Drawings'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Drawings  Luna Stadium/div_Updated 2 months ago'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Drawings  Luna Stadium/a_A002'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Drawings  Luna Stadium/div_Info'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Drawings  Luna Stadium/img'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Drawings  Luna Stadium/div_Project ToolsDrawings'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Drawings  Luna Stadium/a_Bidding'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/a_Package one'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/svg'))

WebUI.setText(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/input___input_input__2nVpu_QHByb search-bar_82ecf1'), 
    'curtains')

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/div_View all results'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/img_ArchitecturalArea 1_result_result__imag_bdfc95'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/span_Drawings'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/img_ArchitecturalTOWER 1_result_result__ima_bbd01b'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/span___icon_icon__3YyB__QHByb results-page__711905'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/div_AppsSelect an App'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/div_Project ToolsBidding'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Bidding  Luna Stadium/a_Photos'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Photos  Luna Stadium/img_August 22 2019_img_image__hiJmy img_wid_ddc652'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Photos  Luna Stadium/i_Confirm_fa fa-ellipsis-v viewer_infoIcon__2NP3k'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Photos  Luna Stadium/i_Confirm_fa fa-times viewer_closeIcon__3H3_8ae3df'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Photos  Luna Stadium/span_3'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Photos  Luna Stadium/div_All Procore web users may now individua_06aac4'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Photos  Luna Stadium/span_Select an App__icon_icon__3YyB__QHByb _7b289a'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Photos  Luna Stadium/span_STF Construction__icon_icon__3YyB__QHByb'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/i_Help_fa fa-cog'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/input_Overview_companyportfolio_ual_id'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/input_Overview_companyportfolio_ual_id'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/input_Overview_companyportfolio_ual_id_1'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/button_Update'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/i_Configuration saved successfully_fa fa-times'))

WebUI.click(findTestObject('Page_Portfolio  STF Construction/div_SA'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/p_My Profile Settings'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/a_My Connected Apps'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/a_Personal'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/button_Update'))

WebUI.click(findTestObject('Object Repository/web ui/Full Test/Page_Portfolio  STF Construction/i_Configuration saved successfully_fa fa-times'))

WebUI.click(findTestObject('Page_Portfolio  STF Construction/div_SA'))

WebUI.click(findTestObject('Page_Portfolio  STF Construction/a_Log Out'))

WebUI.closeBrowser()

