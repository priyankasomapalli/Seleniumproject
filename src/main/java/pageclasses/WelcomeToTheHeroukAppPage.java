package pageclasses;

import org.openqa.selenium.By;

import util.UserInterfaceActionsUtils;

public class WelcomeToTheHeroukAppPage {

	By formAuthEle = By.xpath("//li/a[contains(text(),'Form Authentication')]");

	By javaScriptEle = By.linkText("JavaScript Alerts");
	
	By dropDownLink=By.linkText("Dropdown");

	public void clickFormAuthLink() {
		UserInterfaceActionsUtils.click(formAuthEle);

	}

	public void clickJavaScripAlerts() {

		UserInterfaceActionsUtils.click(javaScriptEle);

	}
	
	public void clickDropDown()
	{
		UserInterfaceActionsUtils.click(dropDownLink);
	}
}
