package withbugsapp;

import org.testng.annotations.Test;

import pageclasses.RegisterSuccessLoginPage;
import pageclasses.RegisterYourAccountPage;
import pageclasses.SignInPage;
import pageclasses.WithBugsHomePage;

public class RegisterSuccessLoginTest extends BugsBaseTest {
	@Test
	public void registerSuccessTest() {

		WithBugsHomePage wbhObj = new WithBugsHomePage();

		wbhObj.clickSignin();
		
		

		SignInPage sObj = new SignInPage();

		sObj.clickRegisterLink();

		RegisterYourAccountPage rObj = new RegisterYourAccountPage();

		rObj.enterFirstName("Priya");

		rObj.enterLastName("Mandava");

		rObj.enterDob("1994-06-16");

		rObj.enterCity("Charlotte");

		rObj.enterCountry("North Carolina");

		rObj.selectState("India");

		rObj.enterPhone("8368428926");

		rObj.enterEmail("somapllipriyanka0354@gmail.com");

		rObj.enterPassword("4734@jap934");

		rObj.clickRegister();
		
		
		RegisterSuccessLoginPage rsObj=new RegisterSuccessLoginPage();
		
		rsObj.validateRegisterText("Login");
		
	}

}
