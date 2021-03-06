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

WebUI.navigateToUrl('http://dqfn4clx0bazt.cloudfront.net/')

LoginPage = WebUI.getWindowTitle()

WebUI.setText(findTestObject('Login_Page/Page_/email address placeholder'), 'yat@gm.co')

WebUI.setEncryptedText(findTestObject('Login_Page/Page_/Password placeholder'), 'OtrYFRg/YkoNEYy5Z+M3eg==')

WebUI.click(findTestObject('Login_Page/Page_/Log In button'))

dashboardPage = WebUI.getWindowTitle()

WebUI.verifyEqual(dashboardPage, DASHBOARD)

WebUI.back()

LoginPageBk = WebUI.getWindowTitle()

WebUI.verifyEqual(LoginPageBk, LoginPage)

WebUI.forward()

dashboardPageFw = WebUI.getWindowTitle()

WebUI.verifyNotEqual(dashboardPageFw, dashboardPage)

WebUI.verifyEqual(dashboardPageFw, LoginPage)

