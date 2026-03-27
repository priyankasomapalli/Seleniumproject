package testNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsPrompts {
	@Test
	public void sendText() {
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.navigate().to("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();

		WebElement jsPrompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));

		jsPrompt.click();

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		String text = alert.getText();

		Assert.assertEquals(text, "I am a JS prompt");

		System.out.println("Alert requires data");

		alert.sendKeys("Password");

		alert.accept();

		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

		String msg = result.getText();

		Assert.assertEquals(msg, "You entered: Password");

		System.out.println(msg);

		jsPrompt.click();

		alert.dismiss();

		System.out.println("Alert dismissed");

		driver.quit();
	}

}
