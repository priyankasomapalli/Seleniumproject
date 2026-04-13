package internetheroukapp;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import managers.DriverManager;
import managers.ExtentManager;
import managers.ExtentTestManager;
import util.BaseUtils;
import util.WaitUtils;

public class BaseTest {
	@BeforeSuite
	public void initialise() throws IOException
	{
		ExtentManager.initReport();
	}

	@BeforeMethod

	public void preReq(Method method) throws NumberFormatException, IOException {
		
		ExtentTestManager.createTest(method.getName());

		DriverManager.initDriver();
		DriverManager.goToUrl(BaseUtils.getConfigValue("url"));
		WaitUtils.initWait();
	}

	@AfterMethod

	public void endTest() {

		System.out.println("Done with the Testing,quitting from the Browser");

		DriverManager.quitDriver();
	}
	
	@AfterSuite
	public static void flushReport()
	{
		ExtentManager.flushReport();
	}
	
}
