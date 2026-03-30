package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractice extends BaseForHeroukExWait {
	@Test
	public void dragAndDropTest() {
		
		WebElement dragAndDrop = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Drag and Drop']")));

		dragAndDrop.click();

		Actions act = new Actions(driver);

		WebElement boxAEle = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='column-a']")));

		WebElement boxBEle = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='column-b']")));

		act.dragAndDrop(boxAEle, boxBEle).perform();

		boxBEle = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='column-b']/header[text()='A']")));

		String textB = boxBEle.getText();
		
		Assert.assertEquals(textB, "A");
	}

}
