package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowHandles extends BaseForHeroukExWait {
	By windowLink = By.linkText("Alerts, Frame & Windows");

	By browserEle = By.linkText("Browser Windows");

	By newTab = By.id("tabButton");

	By windowHandle = By.id("windowButton");

	@Test

	public void handleWindowTest() {
		driver.navigate().to("https://demoqa.com/");

		WebElement windowLinkEle = driver.findElement(windowLink);

		wait.until(ExpectedConditions.elementToBeClickable(windowLinkEle)).click();

		WebElement browserLink = wait.until(ExpectedConditions.elementToBeClickable(browserEle));

		browserLink.click();

		WebElement newTabEle = wait.until(ExpectedConditions.elementToBeClickable(newTab));

		newTabEle.click();

		WebElement newWindowEle = driver.findElement(windowHandle);

		newWindowEle.click();

		String parentWindowHandle = driver.getWindowHandle();

		System.out.println(parentWindowHandle);

		Set<String> allHandles = driver.getWindowHandles();

		System.out.println(allHandles);

		for (String handle : allHandles) {
			if (!handle.equals(parentWindowHandle))

			{
				driver.switchTo().window(handle);
				WebElement child1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
				String msg = child1.getText();
				Assert.assertEquals(msg, "This is a sample page");

			}
		}

	}

}
