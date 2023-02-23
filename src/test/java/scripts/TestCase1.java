package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;

public class TestCase1 extends BaseTest{
	
	@Test
	public void testA() {
		Reporter.log("Url page Title is : "+ driver.getTitle(), true);
		String username = Excel.getData("./data/InputData.xlsx", "TestCase1", 1, 0);
		Reporter.log(username, true);
		driver.switchTo().activeElement().sendKeys(username);
	}

}
