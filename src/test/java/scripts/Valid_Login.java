package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.Enter_Time_TrackPage;
import pages.LoginPage;

public class Valid_Login extends BaseTest {
	
	@Test (priority = 1)
	public void testValidLogin() {
//		1. Enter valid username
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName("admin");
//		2. Enter valid password
		loginPage.setPassword("manager");
//		3. Click on login
		loginPage.clickLoginBtn();
//		4. verify home page is displayed
		Enter_Time_TrackPage trackPage = new Enter_Time_TrackPage(driver); 
		boolean result = trackPage.validateLogoutLink(wait);
		//true HP- P-Passed, F-Failed
		Assert.assertEquals(result, true);
		
		
	}

}
