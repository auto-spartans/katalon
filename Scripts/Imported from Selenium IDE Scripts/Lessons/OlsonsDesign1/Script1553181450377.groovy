import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions as FirefoxOptions
import org.openqa.selenium.firefox.FirefoxProfile as FirefoxProfile
import org.openqa.selenium.firefox.internal.ProfilesIni as ProfilesIni
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities

//WebUI.openBrowser('')
WebUIDriverType executedBrowser = DriverFactory.getExecutedBrowser()

switch (executedBrowser) {
    case WebUIDriverType.FIREFOX_DRIVER: // "Firefox"
        ProfilesIni profile = new ProfilesIni()
        FirefoxProfile FF = profile.getProfile('Autotest')
        FirefoxOptions options = new FirefoxOptions().setProfile(FF)
        System.setProperty('webdriver.gecko.driver', DriverFactory.getGeckoDriverPath())
        WebDriver driverf = new FirefoxDriver(options)
        DriverFactory.changeWebDriver(driverf)        // let Katalon Studio use the WebDriver created here
        break
	case WebUIDriverType.CHROME_DRIVER: // "Chrome" [!CLOSE ALL CHROME WINDOWS BEFORE RUNNING!]
        //String chromeProfilePath = 'C:\\Users\\Brandon\\AppData\\Local\\Google\\Chrome\\User Data\\'
	    ChromeOptions chromeProfile = new ChromeOptions()
		System.setProperty('webdriver.chrome.driver', DriverFactory.getChromeDriverPath())
        chromeProfile.addArguments('user-data-dir=' + 'C:\\Users\\Brandon\\AppData\\Local\\Google\\Chrome\\User Data\\')
        chromeProfile.addArguments('profile-directory=Profile 2')         // Here you specify the actual profile folder (Profile 2), which goes to your "Autotest" one.
        WebDriver driverc = new ChromeDriver(chromeProfile)
        DriverFactory.changeWebDriver(driverc)
        break
}

WebUI.navigateToUrl('https://olsonsdesign.com')
//WebUI.closeBrowser()