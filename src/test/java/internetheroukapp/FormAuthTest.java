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

		WelcomeToTheHeroukAppPage whObj = new WelcomeToTheHeroukAppPage(wait);

		whObj.clickFormAuthLink();

		
		
		LoginFunctionalityPage loginObj = new LoginFunctionalityPage(wait);

		loginObj.enterUserName("tomsmith");

		loginObj.enterPassword("SuperSecretPassword!");

		loginObj.clickLogin();

		
		
		
		SecureAreaPage secureObj = new SecureAreaPage(wait);

		String msg = secureObj.verifySecureArea();// verifySecureArea() returns string

		System.out.println(msg);

		// Assert.assertEquals(msg, " Secure Area");//
		Assert.assertTrue(msg.contains("Secure"));

	}
}
