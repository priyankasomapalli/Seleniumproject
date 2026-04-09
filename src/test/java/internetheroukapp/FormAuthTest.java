package internetheroukapp;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.LoginFunctionalityPage;

import pageclasses.SecureAreaPage;

import pageclasses.WelcomeToTheHeroukAppPage;

public class FormAuthTest extends BaseTest {

	@Test

	public void loginSuccessTest() throws NumberFormatException, IOException {

		WelcomeToTheHeroukAppPage whObj = new WelcomeToTheHeroukAppPage();

		whObj.clickFormAuthLink(driver, wait);

		LoginFunctionalityPage loginObj = new LoginFunctionalityPage();

		loginObj.enterUserName(driver, wait);

		loginObj.enterPassword(driver, wait);

		loginObj.clickLogin(driver, wait);

		SecureAreaPage secureObj = new SecureAreaPage();

		String msg = secureObj.verifySecureArea(driver);// verifySecureArea() returns string

		System.out.println(msg);

		// Assert.assertEquals(msg, " Secure Area");//
		Assert.assertTrue(msg.contains("Secure"));

	}
}
