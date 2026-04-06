package testNG;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTests extends TableBase {

	By javaCheckBox = By.xpath("//fieldset//label/input[@value='Java']");

	By pythonCheckBox = By.xpath("//fieldset//label/input[@value='Python']");

	By languageColumn = By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[3]");

	By languagePython = By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[3]");

	By beginnerCheckBox = By.xpath("//label/input[@value='Beginner']");

	By advancedCheckBox = By.xpath("//label/input[@value='Advanced']");

	By intermediateEle = By.xpath("//table/tbody/tr/td[4][text()='Intermediate']");

	By noDataEle = By.xpath("//div[@id='noData']");

	@Test
	public void verifyLanguageFieldTest() {

		WebElement javaCBEle = driver.findElement((javaCheckBox));

		javaCBEle.click();

		WebElement langColumn = driver.findElement(languageColumn);

		String languageText = langColumn.getText();

		System.out.println(languageText);

		Assert.assertEquals(languageText, "Java");

		WebElement python = driver.findElement(pythonCheckBox);

		python.click();

		langColumn = driver.findElement(languageColumn);

		languageText = langColumn.getText();

		Assert.assertEquals(languageText, "Python");
	}

	@Test
	public void levelCheckTest() {

		driver.findElement(beginnerCheckBox).click();

		driver.findElement(advancedCheckBox).click();

		String textOfLevelColumn = driver.findElement(intermediateEle).getText();

		Assert.assertEquals(textOfLevelColumn, "Intermediate");

		System.out.println("Only Intermediate Level elements are displayed");

	}

	By ddEle = By.xpath("//div[@class='dropdown-button']");

	
	By range2 = By.xpath("//legend[text()='Min enrollments']/following::ul/li[text()='10,000+'])");

	By values = By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[5]");

	@Test
	public void minRequirementTest() {
		WebElement ddButton = driver.findElement(ddEle);

		wait.until(ExpectedConditions.elementToBeClickable(ddButton)).click();
		
		WebElement range=driver.findElement( By.xpath("//li[@data-value='10000']"));

		range.click();

		WebElement valuesAfterChange = driver.findElement(values);

		String text = valuesAfterChange.getText();

		Integer valAfterChange = Integer.valueOf(text);

		if (valAfterChange >= 10000)
			System.out.println("Changes applied succesfully");

	}

	@Test

	public void verifyNoMatch() {
		driver.findElement(pythonCheckBox).click();

		driver.findElement(beginnerCheckBox).click();

		String msg = driver.findElement(noDataEle).getText();

		Assert.assertEquals(msg, "No matching courses.");

	}

}
