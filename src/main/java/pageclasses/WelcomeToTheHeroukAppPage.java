package pageclasses;

import java.io.IOException;

import org.openqa.selenium.By;

import util.WaitUtils;

public class WelcomeToTheHeroukAppPage {

	By formAuthEle = By.xpath("//li/a[contains(text(),'Form Authentication')]");

	By javaScriptEle = By.linkText("JavaScript Alerts");

	public void clickFormAuthLink() throws NumberFormatException, IOException {
		WaitUtils.elementToBeClickable(formAuthEle);

	}

	public void clickJavaScripAlerts() {

		WaitUtils.elementToBeClickable(javaScriptEle);

	}
}
