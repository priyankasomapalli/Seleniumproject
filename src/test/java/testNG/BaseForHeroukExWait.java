package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class BaseForHeroukExWait {

	WebDriver driver;

	WebDriverWait wait;

	@BeforeMethod

	public void preReq() {

		driver = new ChromeDriver();

		driver.navigate().to("https://the-internet.herokuapp.com/");

		wait = new WebDriverWait(driver, Duration.ofSeconds(8));

	}

	@AfterMethod

	public void postTest() {

		System.out.println("Done with the Testing,quitting from the Browser");

		driver.quit();
	}
}
