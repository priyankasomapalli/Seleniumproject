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

public class DynamicLoadTest {
	@Test
	public void dynamicLoadActions() {
		// Invoking the Chrome

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://the-internet.herokuapp.com/");

		// Explicit wait declaration

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// Finding the DynamicLoadingElement

		WebElement dl = driver.findElement(By.xpath("//a[text()='Dynamic Loading']"));

		wait.until(ExpectedConditions.elementToBeClickable(dl));

		System.out.println("Dynamic Element page is clickable now");

		dl.click();

		WebElement dlHeader = driver.findElement(By.xpath("//h3[text()='Dynamically Loaded Page Elements']"));

		String dlHead = dlHeader.getText();

		Assert.assertEquals(dlHead, "Dynamically Loaded Page Elements");

		System.out.println("You are on the DYNAMICALLY LOADED PAGE ELEMENTS");

		WebElement exampleTwo = driver
				.findElement(By.xpath("//a[text()='Example 2: Element rendered after the fact']"));

		wait.until(ExpectedConditions.elementToBeClickable(exampleTwo));

		System.out.println("Example 2 option is available to perform click operation");

		exampleTwo.click();

		WebElement exampleTwoTitle = driver
				.findElement(By.xpath("//h4[text()='Example 2: Element rendered after the fact']"));

		String exampleTwoHeader = exampleTwoTitle.getText();

		System.out.println(exampleTwoHeader);

		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));

		wait.until(ExpectedConditions.elementToBeClickable(startButton));

		System.out.println("Start button is clickable");

		startButton.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[text()='Hello World!']")));

		WebElement result = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

		String result1 = result.getText();

		Assert.assertEquals(result1, "Hello World!");

		System.out.println("Executed Successfully");

		driver.quit();
	}
}
