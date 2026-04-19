package withbugsapp;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.MediaEntityBuilder;

import managers.DriverManager;
import managers.ExtentManager;
import managers.ExtentTestManager;
import util.BaseUtils;
import util.WaitUtils;

public class BugsBaseTest {
	@BeforeSuite
	public void initialise() throws IOException {
		ExtentManager.initReport();
	}

	@BeforeMethod

	public void preReq(Method method) throws NumberFormatException, IOException {

		ExtentTestManager.createTest(method.getName());

		DriverManager.initDriver();
		DriverManager.goToUrl(BaseUtils.getConfigValue("url2"));
		WaitUtils.initWait();
	}

	@AfterMethod

	public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.SUCCESS) {
			ExtentTestManager.log.pass("Test Passed.");
		} else if (result.getStatus() == ITestResult.FAILURE) {
			ExtentTestManager.log.fail(result.getThrowable(), MediaEntityBuilder
					.createScreenCaptureFromPath(BaseUtils.getScreenShotPath(DriverManager.getDriver(),
							result.getInstance().getClass().getSimpleName() + "," + result.getMethod().getMethodName()))
					.build());
		}

		System.out.println("Done with the Testing,quitting from the Browser");

		DriverManager.quitDriver();
	}

	@AfterSuite
	public static void flushReport() {
		ExtentManager.flushReport();
	}

}
