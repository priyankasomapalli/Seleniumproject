package util;

import org.openqa.selenium.By;

public class UserInterfaceActionsUtils {

	public static void click(By locator) {
		WaitUtils.elementToBeClickable(locator);
	}

	public static void enterText(By locator, String msg) {
		WaitUtils.visibilityOfElement(locator).sendKeys(msg);
	}

	public static String getText(By locator) {
		return WaitUtils.visibilityOfElement(locator).getText();
	}
	
	public static void acceptAlert()
	{
		WaitUtils.alertIsPresentAccept();
	}
	
	public static void dismissAlert()
	{
		WaitUtils.alertIsPresentDismissal();
	}

}
