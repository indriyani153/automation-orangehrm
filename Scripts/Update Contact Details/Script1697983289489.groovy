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

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/a_My Info'))

WebUI.click(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/a_Contact Details'))

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_Street 1_oxd-input oxd-input--focus'), 
    'Belimbing')

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_City_oxd-input oxd-input--active'), 
    '')

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_Street 1_oxd-input oxd-input--focus'), 
    'Nowhere')

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_City_oxd-input oxd-input--active'), 
    '')

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_Street 1_oxd-input oxd-input--focus'), 
    'Western')

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_City_oxd-input oxd-input--active'), 
    '')

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_Street 1_oxd-input oxd-input--focus'), 
    '124310')

WebUI.click(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_Street 1_oxd-input oxd-input--focus'), 
    '119-878-1234')

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_City_oxd-input oxd-input--active'), 
    '')

WebUI.setText(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/input_Street 1_oxd-input oxd-input--focus'), 
    '65439872')

WebUI.click(findTestObject('Object Repository/Update Contact Details/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

