package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GitHubActionsExample {
	@Test
	public void hoverAndClick() {

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://github.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement openSourceEle = driver.findElement(By.xpath(
				"//button[@class='NavDropdown-module__button__PEHWX js-details-target' and text()='Open Source']"));

		Actions act = new Actions(driver);

		act.moveToElement(openSourceEle).perform();

		WebElement acceleratorEle = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accelerator']")));

		act.moveToElement(acceleratorEle).click().perform();

		String acceleratorPageText = driver.findElement(By.xpath("//h1[text()='Powering AI advancements in the open']"))
				.getText();

		Assert.assertEquals(acceleratorPageText, "Powering AI advancements in the open");

		System.out.println("Testing is done, Text on the page matches with the string extracted");

		driver.quit();
	}

}
