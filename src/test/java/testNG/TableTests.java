package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTests extends TableBase {

	By javaCheckBox = By.xpath("//fieldset//label/input[@value='Java']");
	By languageColumn = By.xpath("//table/tbody/tr/td[3]");

	@Test
	public void verifyLanguageFieldTest() {
		WebElement javaCheckBoxEle = driver.findElement(javaCheckBox);

		javaCheckBoxEle.click();

		String language = "Java";

		WebElement languageColumnElements = driver.findElement(languageColumn);

		String textOfLanguageColumn = languageColumnElements.getText();

		Assert.assertEquals(textOfLanguageColumn, language);

		System.out.println("Only java courses are displayed");

	}

}
