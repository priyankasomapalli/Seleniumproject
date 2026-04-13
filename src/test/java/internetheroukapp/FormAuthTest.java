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

		whObj.clickFormAuthLink("form authentication");
		
		
		
		

		LoginFunctionalityPage loginObj = new LoginFunctionalityPage();

		loginObj.enterUserName("tomsmith");

		loginObj.enterPassword("SuperSecretPassword!");

		loginObj.clickLogin();
		
		
		

		SecureAreaPage secureObj = new SecureAreaPage();

		String msg = secureObj.verifySecureArea();

		System.out.println(msg);

		Assert.assertTrue(msg.contains("Secure"));

	}
	
	@Test
	public void loginFailTest()
	{
		WelcomeToTheHeroukAppPage whObj = new WelcomeToTheHeroukAppPage();

		whObj.clickFormAuthLink("form authentication");
		
		
		
		

		LoginFunctionalityPage loginObj = new LoginFunctionalityPage();

		loginObj.enterUserName("tomsmith");

		loginObj.enterPassword("SuperSecretPassword!1");

		loginObj.clickLogin();
		
		
		

		SecureAreaPage secureObj = new SecureAreaPage();

		String msg = secureObj.verifySecureArea();

		System.out.println(msg);

		Assert.assertTrue(msg.contains("Secure"));

	}
	
}
