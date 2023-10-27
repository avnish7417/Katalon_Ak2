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

WebUI.navigateToUrl('https://www.lambdatest.com/automation-demos')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/input_Username_name'), 'lambda')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/input_Password_password'), 
    '1T/w5RS4v4tINLepaYCUCg==')

WebUI.click(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/input_Your Email_email'), 'avnish@123')

WebUI.click(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/input_Every month_os'))

WebUI.scrollToElement(findTestObject('Page_Selenium Playground  LambdaTest/input_Every month_os'), 0)

WebUI.click(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/input_Customer service_customer-service'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/select_Credit or Debit cardWalletsCash on delivery'), 
    'Cash on delivery', true)

WebUI.click(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/input_I have made an eCommerce purchase in _ebb0b9'))

WebUI.scrollToElement(findTestObject('Page_Selenium Playground  LambdaTest/input_I have made an eCommerce purchase in _ebb0b9'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/div'))

WebUI.setText(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/textarea_Please share your feedback here_comments'), 
    'its good')

WebUI.click(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Selenium Playground  LambdaTest/p_You have successfully submitted the form'), 
    'You have successfully submitted the form.')

WebUI.closeBrowser()

