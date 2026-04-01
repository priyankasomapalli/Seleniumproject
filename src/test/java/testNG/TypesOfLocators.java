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

public class TypesOfLocators {

	WebDriver driver = new ChromeDriver();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	@Test

	public void typesTest()

	{

		driver.navigate().to("https://demo.guru99.com/");

		WebElement submitEle = driver.findElement(By.name("btnLogin"));

		System.out.println("Element found using name locator" + submitEle);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("emailid")));

		// sendKeys("abcd@gmail.com");

		submitEle.click();

		WebElement msgEle = driver.findElement(By.id("message9"));

		String text = msgEle.getText();

		Assert.assertEquals(text, "Email ID must not be blank");

		driver.quit();
	}
}