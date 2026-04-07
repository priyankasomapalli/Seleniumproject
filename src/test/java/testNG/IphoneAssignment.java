package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IphoneAssignment {

	@Test
	public void iphoneTest() {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Actions actions = new Actions(driver);
		

		driver.get("https://www.amazon.com/");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox"))).sendKeys("iphone 17");

		actions.sendKeys(Keys.ENTER).perform();

		WebElement iphone = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//h2[@aria-label='Apple iPhone 17 Pro, US Version, 256GB, eSIM, Cosmic Orange- Unlocked (Renewed)']")));

		iphone.click();

		System.out.println("Required iphone is selected");

	}
}