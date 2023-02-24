package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pages.Enter_Time_TrackPage;
import pages.LoginPage;

public class Valid_Login extends BaseTest {
	
	@Test (priority = 1)
	public void testValidLogin() {
//		1. Enter valid username
		LoginPage loginPage = new LoginPage(driver);
		String username = Excel.getData("./data/InputData.xlsx", "TestCase1", 1, 0);
		loginPage.setUserName(username);
//		2. Enter valid password
		String pwd = Excel.getData("./data/InputData.xlsx", "TestCase1", 1, 1);
		loginPage.setPassword(pwd);
//		3. Click on login
		loginPage.clickLoginBtn();
//		4. verify home page is displayed
		Enter_Time_TrackPage trackPage = new Enter_Time_TrackPage(driver); 
		boolean result = trackPage.validateLogoutLink(wait);
		//true HP- P-Passed, F-Failed
		Assert.assertEquals(result, true);
		
		
	}

}
