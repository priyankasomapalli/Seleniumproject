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
		
		WebElement python=driver.findElement(pythonCheckBox);
		
		python.click();
		
		langColumn=driver.findElement(languageColumn);
		
		languageText=langColumn.getText();
		
		Assert.assertEquals(languageText, "Python");

	}
}
