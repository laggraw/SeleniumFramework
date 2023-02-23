package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Enter_Time_TrackPage {
	WebDriver driver;

	@FindBy(id = "logoutLink")
	private WebElement logout;

	public Enter_Time_TrackPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogoutLink(WebDriverWait wait) {
		try {
		wait.until(ExpectedConditions.visibilityOf(logout));
		Reporter.log("Home page is displayed", true);
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			Reporter.log("Home Page is not Displayed", true);
			return false;
		}
	}

}
