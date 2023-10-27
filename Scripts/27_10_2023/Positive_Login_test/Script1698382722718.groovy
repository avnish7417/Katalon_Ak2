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

WebUI.navigateToUrl('https://practicetestautomation.com/practice-test-login/')

WebUI.setText(findTestObject('Page_Test Login  Practice Test Automation/input_username_Practice'), 'student')

WebUI.setEncryptedText(findTestObject('Page_Test Login  Practice Test Automation/input_Password_Practice'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Page_Test Login  Practice Test Automation/button_Submit'))

WebUI.verifyTextPresent('Congratulations student. You successfully logged in!', true)

WebUI.verifyElementPresent(findTestObject('Page_Test Login  Practice Test Automation/a_Log out'), 1)

WebUI.click(findTestObject('Page_Test Login  Practice Test Automation/a_Log out'))

WebUI.setText(findTestObject('Page_Test Login  Practice Test Automation/input_username_Practice'), 'incorrectUser')

WebUI.setEncryptedText(findTestObject('Page_Test Login  Practice Test Automation/input_Password_Practice'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Page_Test Login  Practice Test Automation/input_username_Practice'))

WebUI.verifyElementPresent(findTestObject('Page_Test Login  Practice Test Automation/div_Your username is invalid'), 0)

WebUI.verifyTextPresent('Your username is invalid!', true)

WebUI.setText(findTestObject('Page_Test Login  Practice Test Automation/input_username_Practice'), 'student')

WebUI.setEncryptedText(findTestObject('Page_Test Login  Practice Test Automation/input_Password_Practice'), 'NaRTu7UBtmpS8FmW0qSAHjP7ggMaif6d')

WebUI.click(findTestObject('Page_Test Login  Practice Test Automation/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Page_Test Login  Practice Test Automation/div_Your password is invalid'), 0)

WebUI.verifyTextPresent('incorrectPassword', true)

WebUI.click(findTestObject('Page_Test Login  Practice Test Automation/button_Submit'))

WebUI.closeBrowser()

