package testNG;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTests {

	WebDriver driver = new ChromeDriver();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	By advancedCheckBox = By.xpath("//legend[text()='Level']/following::label[text()=' Advanced']");

	By javaButton = By.xpath("//label/input[@value='Java']");

	By javaElements = By.xpath("//table/tbody/tr/td[3][contains(text(),'Java')]");

	@Test

	public void languageFilterTest() {

		wait.until(ExpectedConditions.elementToBeClickable(javaButton)).click();

		List<WebElement> javaAllElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(javaElements));

		for (WebElement ele : javaAllElements) {

			String textAfterChange = ele.getText();

			if (textAfterChange.equals("Java"))

				System.out.println("Changes applied succesfully!! Only Java elements are present.");

			else

				System.out.println("Test Failed!!!!!!");

		}
	}

	By beginnerCheckBox = By.xpath("//legend[text()='Level']/following::label[text()=' Beginner']");

	By beginnerElements = By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[4]");

	By intermediateCheckBox = By.xpath("//legend[text()='Level']/following::label[text()=' Intermediate']");

	@Test

	public void beginnerTest() {

		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");

		wait.until(ExpectedConditions.elementToBeClickable(advancedCheckBox)).click();

		wait.until(ExpectedConditions.elementToBeClickable(intermediateCheckBox)).click();

		List<WebElement> beginnerAllElements = wait

				.until(ExpectedConditions.presenceOfAllElementsLocatedBy((beginnerElements)));

		for (WebElement ele : beginnerAllElements) {

			String text = ele.getText();

			if (text.equals("Beginner"))

				System.out.println("Test Passed!!");

			else

				System.out.println("Other elements are found.");

		}

	}

	By pythonCheckBox = By.xpath("//fieldset//label/input[@value='Python']");

	By noDataEle = By.xpath("//div[@id='noData']");

	@Test

	public void verifyNoMatch() {

		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");

		driver.findElement(pythonCheckBox).click();

		driver.findElement(beginnerCheckBox).click();

		String msg = driver.findElement(noDataEle).getText();

		Assert.assertEquals(msg, "No matching courses.");

	}

	By anyLabel = By.xpath("//div[@role='button']");

	By tenThousandValue = By.xpath("//ul/li[@data-value='10000']");

	By allMinValues = By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[5]");

	@Test

	public void minValuetest() {

		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");

		wait.until(ExpectedConditions.elementToBeClickable(anyLabel)).click();

		wait.until(ExpectedConditions.elementToBeClickable(tenThousandValue)).click();

		List<WebElement> allValues = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(allMinValues));

		for (WebElement ele : allValues) {

			String text = ele.getText();

			int value = Integer.parseInt(text);

			if (value >= 10000) {
				System.out.println("Values are sorted");
			} else
				System.out.println("Not sorted elements found");

		}

	}

}