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

public class JavaScriptAlerts {
	@Test
	public void handlingJsAlerts() {
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.navigate().to("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();

		WebElement jsAlertButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click for JS Alert']")));

		jsAlertButton.click();

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		String firstText = alert.getText();

		Assert.assertEquals(firstText, "I am a JS Alert");

		System.out.println("Text matches with executed text");

		alert.accept();

		WebElement result = driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']"));

		String result1 = result.getText();

		Assert.assertEquals(result1, "You successfully clicked an alert");

		System.out.println("You accepted the alert");

		jsAlertButton.click();

		alert.dismiss();

		System.out.println("You have rejected the alert");

		driver.quit();
	}
}
