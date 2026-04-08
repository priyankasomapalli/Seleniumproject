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

	By javaButton = By.xpath("//label/input[@value='Java']");

	By javaElements = By.xpath("//table/tbody/tr/td[3][contains(text(),'Java')]");

	By beginnerElements = By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[4]");

	By pythonCheckBox = By.xpath("//fieldset//label/input[@value='Python']");

	By noDataEle = By.xpath("//div[@id='noData']");

	By anyLabel = By.xpath("//div[@role='button']");

	By tenThousandValue = By.xpath("//ul/li[@data-value='10000']");

	By allMinValues = By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[5]");

	By combinedPythonEle = By.xpath("//table//tr[not(contains(@style,'display: none;'))]/td[3]");

	By combinedBeginnerEle = By.xpath("//table//tr[not(contains(@style,'display: none;'))]/td[4]");

	By combinedTenThousandEle = By.xpath("//table//tr[not(contains(@style,'display: none;'))]/td[5]");

	By anyReset = By.xpath("//input[@value='Any']");

	By beginer = By.xpath("//label/input[@value='Beginner']");

	By inter = By.xpath("//label/input[@value='Intermediate']");

	By advanced = By.xpath("//label/input[@value='Advanced']");

	By resetButton = By.xpath("//button[@id='resetFilters']");

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

	@Test

	public void beginnerTest() {

		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");

		wait.until(ExpectedConditions.elementToBeClickable(advanced)).click();

		wait.until(ExpectedConditions.elementToBeClickable(inter)).click();

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

	@Test

	public void verifyNoMatch() {

		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");

		driver.findElement(pythonCheckBox).click();

		driver.findElement(beginer).click();

		String msg = driver.findElement(noDataEle).getText();

		Assert.assertEquals(msg, "No matching courses.");

	}

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

	@Test

	public void combinedFiltersTest() {

		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");

		wait.until(ExpectedConditions.elementToBeClickable(pythonCheckBox)).click();

		wait.until(ExpectedConditions.elementToBeClickable(advanced)).click();

		wait.until(ExpectedConditions.elementToBeClickable(inter)).click();

		wait.until(ExpectedConditions.elementToBeClickable(anyLabel)).click();

		wait.until(ExpectedConditions.elementToBeClickable(tenThousandValue)).click();

		List<WebElement> allPythonElements = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(combinedPythonEle));

		List<WebElement> allBeginnerElements = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(combinedBeginnerEle));

		List<WebElement> allValues = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(combinedTenThousandEle));

		for (WebElement ele1 : allPythonElements) {

			String text = ele1.getText();

			if (text.equals("Python"))
				System.out.println("Only python elements are present");

			else
				System.out.println("Found non python element");
		}

		for (WebElement ele2 : allBeginnerElements) {

			String text = ele2.getText();

			if (text.equals("Beginner"))
				System.out.println("Found only Beginner level");

			else
				System.out.println("Found another elements");
		}

		for (WebElement ele : allValues)

		{
			String text = ele.getText();

			int value = Integer.valueOf(text);

			if (value > 10000)
				System.out.println("Only above 10000 values are present");

			else
				System.out.println("Unfiltered data appeared");

		}

	}

	@Test
	public void resetTest() {

		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");

		wait.until(ExpectedConditions.elementToBeClickable(pythonCheckBox)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(resetButton));

		WebElement resetButtonElement = wait.until(ExpectedConditions.elementToBeClickable(resetButton));

		resetButtonElement.click();

		WebElement anyResetButton = wait.until(ExpectedConditions.visibilityOfElementLocated(anyReset));

		boolean beginnerElement = wait.until(ExpectedConditions.elementSelectionStateToBe(beginer, true));

		boolean intermediateElement = wait.until(ExpectedConditions.elementSelectionStateToBe(inter, true));

		boolean advancedElement = wait.until(ExpectedConditions.elementSelectionStateToBe(advanced, true));

		boolean anyButton = anyResetButton.isEnabled();

		wait.until(ExpectedConditions.invisibilityOfElementLocated(resetButton));

		if ((beginnerElement && intermediateElement && advancedElement && anyButton) == true)
			System.out.println("Good with the required test case");

		else
			System.out.println("Failed test");

	}
	
	@Test
	
	public void courseNameSortTest()
	{
		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");
		
	}

}