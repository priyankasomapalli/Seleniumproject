package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class FormAuthenticationActions extends BaseForHeroukExWait {

	@Test
	public void formActionsTest() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Form Authentication']"))).click();

		WebElement userNameText = driver.findElement(By.xpath("//input[@id='username']"));

		userNameText.sendKeys("Tomsmith");

		Actions actions = new Actions(driver);

		actions.click(userNameText).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

	}

}
