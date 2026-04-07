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

	By pythonCheckBox = By.xpath("//fieldset//label/input[@value='Python']");

	By beginnerCheckBox = By.xpath("//label/input[@value='Beginner']");

	By noDataEle = By.xpath("//div[@id='noData']");

	@Test

	public void verifyNoMatch() {
		driver.findElement(pythonCheckBox).click();

		driver.findElement(beginnerCheckBox).click();

		String msg = driver.findElement(noDataEle).getText();

		Assert.assertEquals(msg, "No matching courses.");

	}

}
