import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.guru99.com/test/login.html')

WebUI.setText(findTestObject('Object Repository/Formatting/Page_Login Page/input_Email address_email'), 'abcd@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Formatting/Page_Login Page/input_Password_passwd'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Formatting/Page_Login Page/div_Already registeredEmail addressPasswordForgot your passwordSign in'))

WebUI.setText(findTestObject('Object Repository/Formatting/Page_Login Page/input_Email address_email'), '')

WebUI.click(findTestObject('Object Repository/Formatting/Page_Login Page/div_Already registeredEmail addressPasswordForgot your passwordSign in_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/Formatting/Page_Login Page/input_Password_passwd'), '9NLz+4tGZcQ=')

WebUI.setText(findTestObject('Object Repository/Formatting/Page_Login Page/input_Email address_email'), 'abcd@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Formatting/Page_Login Page/input_Password_passwd'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Formatting/Page_Login Page/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Formatting/Page_/a_Telecom Project'))

WebUI.closeBrowser()

