package pageclasses;

import org.openqa.selenium.By;

import util.WaitUtils;

public class JavaScriptAlertsOptionsPage {

	By heading = By.tagName("h3");

	By jsAlert = By.xpath("//li/button[text()='Click for JS Alert']");

	By jsConfirm = By.xpath("//li/button[text()='Click for JS Confirm']");

	By resultEle = By.id("result");

	By resultJsConfirmEle = By.id("result");

	public String getHeadingTitle() {
		return WaitUtils.visibilityOfElement(heading).getText();
	}

	public String clickForJsAlert() {
		WaitUtils.elementToBeClickable(jsAlert);
		WaitUtils.alertIsPresentAccept();
		// Alert alert = driver.switchTo().alert();
		// alert.accept();
		return WaitUtils.visibilityOfElement(resultEle).getText();

	}

	public String clickForJsConfirm() {
		WaitUtils.elementToBeClickable(jsConfirm);
		WaitUtils.alertIsPresentAccept();

		// Alert alert = driver.switchTo().alert();
		// alert.accept();
		return WaitUtils.visibilityOfElement(resultJsConfirmEle).getText();
	}

}
