package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actiTIME_Enter_Time_TrackPage {
	WebDriver driver;

	@FindBy(id = "logoutLink")
	private WebElement logout;

	public actiTIME_Enter_Time_TrackPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogoutLink(WebDriverWait wait) {
		try {
		wait.until(ExpectedConditions.visibilityOf(logout));
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
