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

public class JavaScriptConfirm {
	@Test
	public void jsConfirmation() {
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.navigate().to("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();

		WebElement jsConfirmEle = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));

		jsConfirmEle.click();

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		alert.dismiss();

		WebElement result = driver.findElement(By.xpath("//p[text()='You clicked: Cancel']"));

		String msg = result.getText();

		Assert.assertEquals(msg, "You clicked: Cancel");

		System.out.println("You clicked: Cancel");

		jsConfirmEle.click();

		alert.accept();

		WebElement result1 = driver.findElement(By.xpath("//p[text()='You clicked: Ok']"));

		String msg1 = result1.getText();

		Assert.assertEquals(msg1, "You clicked: Ok");

		System.out.println("You clicked: Ok");

		driver.quit();

	}

}
