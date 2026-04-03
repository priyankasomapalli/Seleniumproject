package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XpathAccess {

	WebDriver driver = new ChromeDriver();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	@Test
	public void validatingPath() {

		driver.navigate().to("https://demo.guru99.com/test/selenium-xpath.html");

		WebElement sapcrmEle = driver
				.findElement(By.xpath("//li/a[text()='SAP CRM']/following::li/a[text()='SAP CO']"));

		sapcrmEle.click();

		WebElement sapcrmEleTextEle = driver
				.findElement(By.xpath("//p[text()='The requested URL was not found on this server.']"));

		String msg = sapcrmEleTextEle.getText();

		Assert.assertEquals(msg, "The requested URL was not found on this server.");

		driver.quit();

	}
}
