package pageclasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomeToTheHeroukAppPage {

	
	WebDriverWait wait;
	
	public WelcomeToTheHeroukAppPage(WebDriverWait wait)
	{
		this.wait=wait;
	}
	
	By formAuthEle = By.xpath("//li/a[contains(text(),'Form Authentication')]");

	public void clickFormAuthLink() throws NumberFormatException, IOException {

		wait.until(ExpectedConditions.elementToBeClickable(formAuthEle)).click();

	}
}
