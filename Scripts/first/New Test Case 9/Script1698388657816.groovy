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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.lambdatest.com/selenium-playground/')

WebUI.mouseOver(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/h1_Selenium Playground'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/h1_Selenium Playground'), 
    'Selenium Playground')

WebUI.click(findTestObject('Object Repository/Page_Selenium Grid Online  Run Selenium Tes_77a03b/a_Status Codes'))

WebUI.click(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/a_Pricing'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_LambdaTest Plans and Pricing  60 MinMo_ae68e6/h2_0'), '$0')

WebUI.verifyElementText(findTestObject('Object Repository/Page_LambdaTest Plans and Pricing  60 MinMo_ae68e6/h3_15'), '$15')

WebUI.click(findTestObject('Object Repository/Page_LambdaTest Plans and Pricing  60 MinMo_ae68e6/span_Monthly'))

WebUI.click(findTestObject('Object Repository/Page_LambdaTest Plans and Pricing  60 MinMo_ae68e6/span_Web Automation Testing'))

WebUI.click(findTestObject('Object Repository/Page_LambdaTest Plans and Pricing  60 MinMo_ae68e6/span_Native App Automation'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_LambdaTest Plans and Pricing  60 MinMo_ae68e6/h3_149'), '$149')

WebUI.click(findTestObject('Object Repository/Page_LambdaTest Plans and Pricing  60 MinMo_ae68e6/span_Smart UI'))

WebUI.mouseOver(findTestObject('Object Repository/Page_LambdaTest Plans and Pricing  60 MinMo_ae68e6/a_Platform'))

WebUI.click(findTestObject('Object Repository/Page_Unified Digital Experience Testing Clo_bac79f/h3_Real Devices Cloud'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Real Device Testing on iOS and Android_177978/h1_Real Device Cloud with Android  iOS Smartphones'), 
    'Real Device Cloud with Android & iOS Smartphones')

WebUI.mouseOver(findTestObject('Object Repository/Page_Real Device Testing on iOS and Android_177978/button_Enterprise'))

WebUI.mouseOver(findTestObject('Page_Selenium Grid Online  Run Selenium Test On Cloud/button_Resources'))

WebUI.click(findTestObject('Object Repository/Page_Real Device Testing on iOS and Android_177978/h3_Blog'))

WebUI.click(findTestObject('Object Repository/Page_LambdaTest Blogs/a_Automation'))

WebUI.setText(findTestObject('Object Repository/Page_Automation  LambdaTest/input_Search for_s'), 'selenium')

WebUI.sendKeys(findTestObject('Object Repository/Page_Automation  LambdaTest/input_Search for_s'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Page_selenium  LambdaTest/a_How to Find Element by Text in Selenium C'), 
    'How to Find Element by Text in Selenium C#')

WebUI.closeBrowser()

