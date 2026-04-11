package internetheroukapp;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.JavaScriptAlertsOptionsPage;
import pageclasses.WelcomeToTheHeroukAppPage;

public class JavaScriptOptionsTest extends BaseTest{

	
	@Test

	public void verifyJavaScriptSuccessTest() {
		WelcomeToTheHeroukAppPage whObj = new WelcomeToTheHeroukAppPage();
		whObj.clickJavaScripAlerts();

		JavaScriptAlertsOptionsPage jsaObj = new JavaScriptAlertsOptionsPage();
		String heading = jsaObj.getHeadingTitle();
		Assert.assertTrue(heading.contains("JavaScript Alerts"));
		jsaObj.clickForJsAlert();
		String msg=jsaObj.clickForJsAlert();
		Assert.assertEquals(msg,"You successfully clicked an alert");
		String msg1=jsaObj.clickForJsConfirm();
		Assert.assertEquals(msg1,"You clicked: Ok");
	}

}
