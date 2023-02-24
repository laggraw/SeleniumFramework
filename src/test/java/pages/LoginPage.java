package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage {
	WebDriver driver;

	@FindBy(id = "username")
	private WebElement unTB;

	@FindBy(name = "pwd")
	private WebElement pwTB;

	@FindBy(id = "loginButton")
	private WebElement login;

	@FindBy(xpath = "//span[contains(text(), 'invalid')]")
	private WebElement errmsg;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String userName) {
		unTB.sendKeys(userName);
	}

	public void setPassword(String pwd) {
		pwTB.sendKeys(pwd);
	}

	public void clickLoginBtn() {
		login.click();
	}

	public boolean validErrorMsg(WebDriverWait wait) {
		try {
			wait.until(ExpectedConditions.visibilityOf(errmsg));
			Reporter.log("Error message is displayed", true );
			return true;
		} catch (Exception e) {
			Reporter.log("Error message is not displayed", true );
			return false;
		}

	}
}
