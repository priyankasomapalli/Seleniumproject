package managers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.BaseUtils;

public class DriverManager {

	private static WebDriver driver;

	public static void initDriver() throws IOException // Initializing the driver

	{
		String browser = BaseUtils.getConfigValue("browser");

		switch (browser.toLowerCase()) {

		case "chrome":
			
			

			driver = new ChromeDriver();
			ExtentTestManager.log.info("Chrome was launched");
			break;

		case "firefox":
			
			

			driver = new FirefoxDriver();
			ExtentTestManager.log.info("FireFox was launched");
			break;

		case "edge":
		
			driver = new EdgeDriver();
			
			ExtentTestManager.log.info("Edge was launched");

			break;

		default:

			System.out.println("Browser is not supported");
			
			ExtentTestManager.log.info("No matching browser entry was matched");

		}
		driver.manage().window().maximize();
		
		ExtentTestManager.log.info("Window was maximised");


	}

	public static WebDriver getDriver() // returning the current instance of the driver
	{
		return driver;
	}

	public static void goToUrl(String url) // helps to go to the website
	{
		
		
		driver.get(url);
		ExtentTestManager.log.info("URL : "  +url  + "opened");


	}

	public static void quitDriver() // closing the driver
	{
		driver.quit();
		ExtentTestManager.log.info("Browser was closed !!");

	}
}
