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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://web.facebook.com/')

WebUI.verifyElementPresent(findTestObject('Login-Register/Button_Create Account'), 3)

WebUI.click(findTestObject('Login-Register/Button_Create Account'))

WebUI.verifyElementPresent(findTestObject('Login-Register/Register Form/Button_Sign Up'), 10)

WebUI.setText(findTestObject('Login-Register/Register Form/Firstname'), 'I Made')

WebUI.setText(findTestObject('Login-Register/Register Form/Lastname'), 'Wirawan')

WebUI.setText(findTestObject('Login-Register/Register Form/Email'), 'wirawan@mail.com')

WebUI.verifyElementPresent(findTestObject('Login-Register/Register Form/Email - Confirmation'), 3)

WebUI.setText(findTestObject('Login-Register/Register Form/Email - Confirmation'), 'wirawan@mail.com')

WebUI.setText(findTestObject('Login-Register/Register Form/Password'), '1234asdf')

WebUI.click(findTestObject('Login-Register/Register Form/Birth_Day'))

WebUI.click(findTestObject('Login-Register/Register Form/Birthdate/10'))

WebUI.click(findTestObject('Login-Register/Register Form/Birth_Month'))

WebUI.click(findTestObject('Login-Register/Register Form/Birthdate/Feb'))

WebUI.click(findTestObject('Login-Register/Register Form/Birth_Year'))

WebUI.click(findTestObject('Login-Register/Register Form/Birthdate/2000'))

WebUI.click(findTestObject('Login-Register/Register Form/sex_male'))

WebUI.click(findTestObject('Login-Register/Register Form/Button_Sign Up'))

