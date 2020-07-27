package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_Login extends LeafTapsWrappers {

	@BeforeClass
	public void testDetails() {

		testCaseName = "TC001_Login";
		testDescription = "Login to Leaftaps";
		category = "Smoke";
		authors = "Gopi";
		browserName = "chrome";
		dataSheetName = "TC001";

	}

	@Test(dataProvider = "fetchData")
	public void login(String Username, String Password) {
		new LoginPage(driver, test).enterUserName(Username).enterPassword(Password).clickLogin();
		// .verifyLoginName(LgdUser)
		// .clickLogOut();

	}
}
