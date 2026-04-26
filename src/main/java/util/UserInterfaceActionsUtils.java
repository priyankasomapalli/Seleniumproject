package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import managers.ExtentTestManager;

public class UserInterfaceActionsUtils {

	public static void click(By locator, String name) {
		WaitUtils.elementToBeClickable(locator);
		ExtentTestManager.log.info("Clicked on " + name + " link");
	}

	public static void enterText(By locator, String msg) {
		WaitUtils.visibilityOfElements(locator).sendKeys(msg);
		ExtentTestManager.log.info("Entered text is  " + msg);
	}

	public static void enterPassword(By locator, String password) {
		WebElement ele=WaitUtils.presenceOfElement(locator);
		JSUtils.jsEnterPassword(ele);
		WaitUtils.presenceOfElement(locator).sendKeys(password);
		ExtentTestManager.log.info("Entered text is **********");
	}

	public static String getText(By locator, String name) {
		String text = WaitUtils.presenceOfElement(locator).getText();
		ExtentTestManager.log.info("Text of the " + name + "  is  " + text);
		return text;
	}

	public static void acceptAlert() {
		WaitUtils.alertIsPresentAccept();
		ExtentTestManager.log.info("Alert is accepted");
	}

	public static void dismissAlert() {
		WaitUtils.alertIsPresentDismissal();
		ExtentTestManager.log.info("Alert is dismissed");
	}

	public static void selectDropDownByIndex(By locator, int index) {
		WebElement ele = WaitUtils.presenceOfElement(locator);
		Select dd = new Select(ele);
		dd.selectByIndex(index);
		ExtentTestManager.log.info("DropDown option is selected by index value. Index is:   " + index);
	}

	public static void selectDropDownByVisibleText(By locator, String text) {
		WebElement ele = WaitUtils.visibilityOfElements(locator);
		Select dd = new Select(ele);
		dd.selectByVisibleText(text);
		ExtentTestManager.log.info("DropDown option is selected by Visible text on the page. Text is:   " + text);

	}
}
