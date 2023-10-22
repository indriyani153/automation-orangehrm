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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/a_My Info'))

WebUI.setText(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/input_Employee Full Name_middleName'), 
    'Adrian')

WebUI.setText(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/input_Nickname_oxd-input oxd-input--active'), 
    '')

WebUI.setText(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/input_Nickname_oxd-input oxd-input--focus'), 
    'Powl')

WebUI.setText(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/input_Nickname_oxd-input oxd-input--active'), 
    '')

WebUI.setText(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/input_Nickname_oxd-input oxd-input--focus'), 
    '1234567')

WebUI.click(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/i_License Expiry Date_oxd-icon bi-calendar _fa83c8'))

WebUI.click(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/i_License Expiry Date_oxd-icon bi-caret-dow_b3ecad'))

WebUI.click(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/li_December'))

WebUI.click(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/div_31'))

WebUI.click(findTestObject('Object Repository/Update Personal Details/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

