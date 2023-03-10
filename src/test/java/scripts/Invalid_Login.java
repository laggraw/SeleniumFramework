package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pages.LoginPage;

public class Invalid_Login extends BaseTest {

	@Test (priority = 1)
	public void testInValidLogin() {
//		Get the data from excel file
		String username = Excel.getData("./data/InputData.xlsx", "Invalid_Login", 1, 0);
		String pwd = Excel.getData("./data/InputData.xlsx", "Invalid_Login", 1, 1);
//		1. Enter Invalid user name
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(username);
//		2. Enter Invalid password
		loginPage.setPassword(pwd);
//		3. Click on login
		loginPage.clickLoginBtn();
//		4. verify error message is displayed
		boolean result = loginPage.validErrorMsg(wait);
		//true HP- P-Passed, F-Failed
		Assert.assertEquals(result, true);
		
		
	}
}
