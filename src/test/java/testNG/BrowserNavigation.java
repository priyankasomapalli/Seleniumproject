package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserNavigation {
	@Test
	public void BrowserActionTests() throws InterruptedException {
		// Opening the chrome browser

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

		// Sending the URL

		driver.get("https://the-internet.herokuapp.com/");

		// finding webelement dynamic controls

		WebElement DynamicControlEle = driver.findElement(By.xpath("//a[text()='Dynamic Controls']"));

		// Clicking on that element

		DynamicControlEle.click();

		WebElement DynamicControlsheading = driver.findElement(By.xpath("//h4[text()='Dynamic Controls']"));

		// extracting the heading text and storing in heading variable

		String heading = DynamicControlsheading.getText();

		// Verfying whether we have landed on that page by comparing the text of the

		// heading on the page

		Assert.assertEquals(heading, "Dynamic Controls");

		driver.navigate().back();

		driver.navigate().forward();

		// WebElement checkboxEle=driver.findElement(By.xpath("//div[@id='checkbox']"))

		WebElement checkboxEle = driver.findElement(By.xpath("//input[@label='blah']"));

		checkboxEle.click();

		driver.navigate().refresh();
	}

}
