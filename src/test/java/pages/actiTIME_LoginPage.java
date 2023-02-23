package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTIME_LoginPage {
	WebDriver driver;

	@FindBy(id ="username")
	private WebElement unTB;
	
	@FindBy(name = "pwd")
	private WebElement pwTB;
	
	@FindBy(id ="loginButton")
	private WebElement login;
	
	
	public actiTIME_LoginPage(WebDriver driver) {
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
}
