package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;
	public final String dBrowser = "chrome";
	public final String dUrl = "https://demo.actitime.com/login.do";
	public final String DTimeout = "10";
	
	
	@Parameters({"browser", "url", "timeout"})
	@BeforeMethod
	public void opeApp(@Optional(dBrowser)String browser, @Optional(dUrl)String url, @Optional(DTimeout)String timeout) {
		Reporter.log("Opening the Browser : " + browser , true);
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		Reporter.log("Maximizing the browser", true);
		driver.manage().window().maximize();
		Reporter.log("Open the url :" + url + "in the Browser :" + browser, true);
		driver.get(url);
		Reporter.log("Setting the implicit wait as: " + timeout , true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(timeout)));
		Reporter.log("Setting the Explicit wait as: " + timeout , true );
		wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(timeout)));		
	}

	
	@AfterMethod
	public void closeApp() {
		Reporter.log("Closing the Browser", true);
		driver.close();
		
	}
}
