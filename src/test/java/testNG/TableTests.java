package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTests extends TableBase {

	By javaCheckBox = By.xpath("//fieldset//label/input[@value='Java']");

	By pythonCheckBox = By.xpath("//fieldset//label/input[@value='Python']");

	By languageColumn = By.xpath("//table/tbody/tr/td[3]");

	By languagePython = By.xpath("//table/tbody/tr/td[3][text()='Python']");

	By beginnerCheckBox = By.xpath("//label/input[@value='Beginner']");

	By advancedCheckBox = By.xpath("//label/input[@value='Advanced']");

	By intermediateEle = By.xpath("//table/tbody/tr/td[4][text()='Intermediate']");

	By noDataEle = By.xpath("//div[@id='noData']");

	@Test
	public void verifyLanguageFieldTest() {
		WebElement javaCheckBoxEle = driver.findElement(javaCheckBox);

		javaCheckBoxEle.click();

		String language = "Java";

		String textOfLanguageColumn = driver.findElement(languageColumn).getText();

		Assert.assertEquals(textOfLanguageColumn, language);

		System.out.println("Only java courses are displayed");

		driver.findElement(pythonCheckBox).click();

		String pythonText = driver.findElement(languagePython).getText();

		Assert.assertEquals(pythonText, "Python");

		System.out.println("Only Python courses are displayed");

	}

	@Test
	public void levelCheckTest() {

		driver.findElement(beginnerCheckBox).click();

		driver.findElement(advancedCheckBox).click();

		String textOfLevelColumn = driver.findElement(intermediateEle).getText();

		Assert.assertEquals(textOfLevelColumn, "Intermediate");

		System.out.println("Only Intermediate Level elements are displayed");

	}

	@Test

	public void verifyNoMatch() {
		driver.findElement(pythonCheckBox).click();

		driver.findElement(beginnerCheckBox).click();

		String msg = driver.findElement(noDataEle).getText();

		Assert.assertEquals(msg, "No matching courses.");

	}

}
