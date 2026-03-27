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

public class DynamicAssignment {
	@Test
	public void validateDc() {
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://the-internet.herokuapp.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));

		clickElement(By.xpath("//a[text()='Dynamic Controls']"), wait);

		validateText(By.xpath("//h4[text()='Remove/add']"), "Remove/add", wait);

		clickElement(By.xpath("//input[@label='blah']"), wait);

		clickElement(By.xpath("//button[text()='Remove']"), wait);

		validateText(By.xpath("//button[text()='Add']"), "Add", wait);

		validateText(By.xpath("//p[@id='message']"), "It's gone!", wait);

		clickElement(By.xpath("//button[text()='Add']"), wait);

		WebElement add = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));

		wait.until(ExpectedConditions.elementToBeClickable(add));

		String msg = add.getText();

		Assert.assertNotEquals(msg, "Add");

		System.out.println("It is validated");

		driver.quit();
	}

	public void clickElement(By xpath, WebDriverWait wait) {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(xpath));

		element.click();
	}

	public void validateText(By xpath, String expectedText, WebDriverWait wait) {

		String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).getText();

		Assert.assertEquals(actualText, expectedText);

	}
}
