package testNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsAlertImplicitWait extends BaseForInternetHeroukappTest {
	@Test
	public void jsimplicit() {

		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();

		WebElement jsEle = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));

		jsEle.click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

		System.out.println("Accepted alert");

		jsEle.click();

		alert.dismiss();

		System.out.println("Alert Dismissed");

	}
}
