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
		driver.manage().window().maximize();

	}

	public static WebDriver getDriver() // returning the current instance of the driver
	{
		return driver;
	}

	public static void goToUrl(String url) // helps to go to the website
	{
		driver.get(url);

	}

	public static void quitDriver() // closing the driver
	{
		driver.quit();
	}
}
