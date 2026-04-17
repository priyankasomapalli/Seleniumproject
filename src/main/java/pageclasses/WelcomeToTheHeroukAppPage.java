package pageclasses;

import org.openqa.selenium.By;

import util.UserInterfaceActionsUtils;

public class WelcomeToTheHeroukAppPage {

	By formAuthEle = By.xpath("//li/a[contains(text(),'Form Authentication')]");

	By javaScriptEle = By.linkText("JavaScript Alerts");

	By dropDownLink = By.linkText("Dropdown");
	
	By dynamicControlsLink=By.linkText("Dynamic Controls");

	public void clickFormAuthLink(String name) {
		UserInterfaceActionsUtils.click(formAuthEle, name);

	}

	public void clickJavaScripAlerts(String name) {

		UserInterfaceActionsUtils.click(javaScriptEle,name);

	}

	public void clickDropDown(String name) {
		UserInterfaceActionsUtils.click(dropDownLink,name);

	}
	
	
	public void clickDynamicControls(String name) {
		UserInterfaceActionsUtils.click(dynamicControlsLink,name);

	}
}
