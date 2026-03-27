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

public class DynamicControlsValidation {
	@Test
	public void validateDc() {
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://the-internet.herokuapp.com/");

		WebElement dc = driver.findElement(By.xpath("//a[text()='Dynamic Controls']"));

		dc.click();

		WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));

		wait.until(ExpectedConditions.elementToBeClickable(removeButton));

		WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@label='blah']")));

		checkBox.click();

		removeButton.click();

		WebElement add = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add')]")));

		String title = add.getText();

		Assert.assertEquals(title, "Add");

		wait.until(ExpectedConditions.elementToBeClickable(add));

		String msg = driver.findElement(By.xpath("//p[@id='message']")).getText();

		Assert.assertEquals(msg, "It's gone!");

		System.out.println("It is validated");

		driver.quit();

	}

}