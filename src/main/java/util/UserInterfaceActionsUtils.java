package util;

import org.openqa.selenium.By;

import managers.ExtentTestManager;

public class UserInterfaceActionsUtils {

	public static void click(By locator, String name) {
		WaitUtils.elementToBeClickable(locator);
		ExtentTestManager.log.info("Clicked on " +name +" link");
	}

	public static void enterText(By locator, String msg) {
		WaitUtils.visibilityOfElement(locator).sendKeys(msg);
		ExtentTestManager.log.info("Entered text for is" +msg);
	}
	
	public static void enterPassword(By locator, String password)
	{
		WaitUtils.visibilityOfElement(locator).sendKeys(password);
		ExtentTestManager.log.info("Entered text for " + "is **********");
	}

	public static String getText(By locator,String name) {
		String text=WaitUtils.visibilityOfElement(locator).getText();
		ExtentTestManager.log.info("Text of the "+name + "is" +text);
		return text;
	}
	
	public static void acceptAlert()
	{
		WaitUtils.alertIsPresentAccept();
		ExtentTestManager.log.info("Alert is accepted");
	}
	
	public static void dismissAlert()
	{
		WaitUtils.alertIsPresentDismissal();
		ExtentTestManager.log.info("Alert is dismissed");
	}

}
