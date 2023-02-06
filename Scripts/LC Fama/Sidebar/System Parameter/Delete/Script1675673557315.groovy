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

WebUI.openBrowser('http://23.96.29.46:8203/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('LC Fama/Login Page/Button Login'), 10)

WebUI.setText(findTestObject('LC Fama/Login Page/Field Username'), 'LC_admin_maker')

WebUI.setText(findTestObject('LC Fama/Login Page/Field Password'), 'P@ssw0rd')

WebUI.click(findTestObject('LC Fama/Login Page/Button Login'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('LC Fama/Home Page/Sidebar/Sidebar System Parameter'), 10)

WebUI.click(findTestObject('LC Fama/Home Page/Sidebar/Sidebar System Parameter'))

WebUI.verifyElementPresent(findTestObject('LC Fama/Home Page/Sidebar/Child SP - Group Management'), 10)

WebUI.click(findTestObject('LC Fama/Home Page/Sidebar/Child SP - Group Management'))

WebUI.verifyElementPresent(findTestObject('LC Fama/Home Page/Sidebar/Child SP - Group Menu View'), 10)

WebUI.click(findTestObject('LC Fama/Home Page/Sidebar/Child SP - Group Menu View'))

WebUI.verifyElementPresent(findTestObject('LC Fama/Home Page/Edit/button_true_nawatable-row2-delete'), 10)

WebUI.click(findTestObject('LC Fama/Home Page/Edit/button_true_nawatable-row2-delete'))

WebUI.verifyElementPresent(findTestObject('LC Fama/Home Page/Edit/Delete'), 10)

WebUI.click(findTestObject('LC Fama/Home Page/Edit/Delete'))

WebUI.verifyElementPresent(findTestObject('LC Fama/Home Page/Edit/Delete - Confirm'), 10)

WebUI.click(findTestObject('LC Fama/Home Page/Edit/Delete - Confirm'))

WebUI.verifyElementPresent(findTestObject('LC Fama/Home Page/Add/div_Pending To Approval'), 10)

WebUI.verifyElementPresent(findTestObject('LC Fama/Home Page/Button Profile'), 10)

WebUI.click(findTestObject('LC Fama/Home Page/Button Profile'))

WebUI.verifyElementPresent(findTestObject('LC Fama/Home Page/Button Logout'), 10)

WebUI.click(findTestObject('LC Fama/Home Page/Button Logout'))

WebUI.closeBrowser()

