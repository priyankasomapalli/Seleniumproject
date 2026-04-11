package internetheroukapp;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import managers.DriverManager;
import util.BaseUtils;
import util.WaitUtils;

public class BaseTest {

	WebDriverWait wait;

	@BeforeMethod

	public void preReq() throws NumberFormatException, IOException {

		DriverManager.initDriver();
		DriverManager.goToUrl(BaseUtils.getConfigValue("url"));
		WaitUtils.initWait();
	}

	@AfterMethod

	public void postTest() {

		System.out.println("Done with the Testing,quitting from the Browser");

		DriverManager.quitDriver();
	}
}
