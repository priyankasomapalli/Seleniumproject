package pageclasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomeToTheHeroukAppPage {

	By formAuthEle = By.xpath("//li/a[contains(text(),'Form Authentication')]");

	By javaScriptEle = By.linkText("JavaScript Alerts");

	WebDriverWait wait;

	public WelcomeToTheHeroukAppPage(WebDriverWait wait) {
		this.wait = wait;
	}

	public void clickFormAuthLink() throws NumberFormatException, IOException {

		wait.until(ExpectedConditions.elementToBeClickable(formAuthEle)).click();

	}

	public void clickJavaScripAlerts() {
		
		wait.until(ExpectedConditions.elementToBeClickable(javaScriptEle)).click();

	}
}
