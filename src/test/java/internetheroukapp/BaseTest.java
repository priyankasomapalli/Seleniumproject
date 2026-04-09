package internetheroukapp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import util.BaseUtils;

public class BaseTest {

	WebDriver driver;

	WebDriverWait wait;

	@BeforeMethod

	public void preReq() throws NumberFormatException, IOException {

		String browser = BaseUtils.getConfigValue("browser");
		// this browser value changes as per requirements so
		// anything changes can not be
		// put inside the code have to keep separate class and then we call in our
		// methods

		switch (browser.toLowerCase()) {

		case "chrome":

			driver = new ChromeDriver();
			break;

		case "firefox":

			driver = new FirefoxDriver();
			break;

		case "edge":

			driver = new EdgeDriver();
			break;

		default:

			System.out.println("Browser is not supported");

		}

		wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("explicitwait"))));

		driver.navigate().to(BaseUtils.getConfigValue("url"));

	}

	@AfterMethod

	public void postTest() {

		System.out.println("Done with the Testing,quitting from the Browser");

		driver.quit();
	}
}
