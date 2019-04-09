import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.Keys
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

'----------------------------------------------------'
'This test case script is generated by Katalon Studio'
'Generated date: 19-Mar-2019 02:28:08 PM'
'File path: C:\\Users\\Brandon\\Documents\\Katalon Recorder Suites\\Lessons.html'
'Generated by: bolson@northwoodglobal.com'
'----------------------------------------------------'

String baseUrl = "http://demo.guru99.com/test/login.html"

WebUI.openBrowser(baseUrl)

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"pause |  | 5000"
Thread.sleep("")

"open | http://demo.guru99.com/test/login.html | "
selenium.open("http://demo.guru99.com/test/login.html")

"click | id=email | "
selenium.click("id=email")

"type | id=email | abcd@gmail.com"
selenium.type("id=email", "abcd@gmail.com")

"type | id=passwd | abcde"
selenium.type("id=passwd", "abcde")

"echo | Text Fields Set | "
System.out.println("Text Fields Set")

"click | id=email | "
selenium.click("id=email")

"type | id=email | "
selenium.type("id=email", "")

"click | id=passwd | "
selenium.click("id=passwd")

"type | id=passwd | "
selenium.type("id=passwd", "")

"echo | Text Fields Cleared | "
System.out.println("Text Fields Cleared")

"click | id=email | "
selenium.click("id=email")

"type | id=email | abcd@gmail.com"
selenium.type("id=email", "abcd@gmail.com")

"type | id=passwd | abcde"
selenium.type("id=passwd", "abcde")

"click | id=SubmitLogin | "
selenium.click("id=SubmitLogin")

"echo | Login Done with Click | "
System.out.println("Login Done with Click")

"open | http://demo.guru99.com/test/radio.html | "
selenium.open("http://demo.guru99.com/test/radio.html")

"click | id=vfb-7-1 | "
selenium.click("id=vfb-7-1")

"echo | Radio Button 1 is selected | "
System.out.println("Radio Button 1 is selected")

"click | id=vfb-7-2 | "
selenium.click("id=vfb-7-2")

"echo | Radio Button 2 is selected | "
System.out.println("Radio Button 2 is selected")

"click | id=vfb-6-0 | "
selenium.click("id=vfb-6-0")

"echo | Checkbox 1 is selected | "
System.out.println("Checkbox 1 is selected")

"close | win_ser_local | "
selenium.close()

WebUI.closeBrowser()