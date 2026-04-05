package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableElements {

	WebDriver driver = new ChromeDriver();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

	@Test

	public void tracingAdvancedElementTest() {

		driver.get("https://practicetestautomation.com/practice-test-table/");

		WebElement advancedEle = driver.findElement(
				By.xpath("//table/tbody/tr[5]/td[4]/following::tr/td[3]/following-sibling::td[text()='Advanced']"));

		Actions actions = new Actions(driver);

		String msg = advancedEle.getText();

		System.out.println(msg);

		actions.doubleClick(advancedEle);
		// keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

		Assert.assertEquals(msg, "Advanced");

		System.out.println("Test verified");

		driver.close();

	}

}
