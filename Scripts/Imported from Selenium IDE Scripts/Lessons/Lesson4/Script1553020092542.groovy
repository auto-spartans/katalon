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
'Generated date: 19-Mar-2019 02:28:12 PM'
'File path: C:\\Users\\Brandon\\Documents\\Katalon Recorder Suites\\Lessons.html'
'Generated by: bolson@northwoodglobal.com'
'----------------------------------------------------'

String baseUrl = "https://weather.com/"

WebUI.openBrowser(baseUrl)

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"pause |  | 5000"
Thread.sleep("5000")

"open | https://weather.com/ | "
selenium.open("https://weather.com/")

"windowMaximize |  | "
selenium.windowMaximize()

"click | //input[@value='undefined'] | "
selenium.click("//input[@value='undefined']")

"waitForEditable | //input[@value='undefined'] | "
selenium.waitFor({selenium.isEditable("//input[@value='undefined']")})

"type | //input[@value='undefined'] | 20165"
selenium.type("//input[@value='undefined']", "20165")

"click | link=Sterling (20165) | "
selenium.click("link=Sterling (20165)")

"pause |  | 5000"
Thread.sleep("")

"captureEntirePageScreenshot |  | "
selenium.captureEntirePageScreenshot("", "")

"click | //div[@id='header-LocalsuiteNav-9e937d06-a4be-493a-bc54-942db4a05af8']/div/div/div/ul/li[4]/a/span | "
selenium.click("//div[@id='header-LocalsuiteNav-9e937d06-a4be-493a-bc54-942db4a05af8']/div/div/div/ul/li[4]/a/span")

"captureEntirePageScreenshot |  | "
selenium.captureEntirePageScreenshot("", "")

"close | win_ser_local | "
selenium.close()

WebUI.closeBrowser()