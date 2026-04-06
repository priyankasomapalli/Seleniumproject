package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TableBase {

	WebDriver driver;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@BeforeMethod
	public void prereq() {

		String browser = "chrome";

		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Invalid name");
		}
		driver.get("https://practicetestautomation.com/practice-test-table/");
	}

	@AfterMethod

	public void postTest() {

		System.out.println("Done with the Testing,quitting from the Browser");

		// driver.quit();
	}
}
