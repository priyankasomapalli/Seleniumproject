package pageclasses;

import org.openqa.selenium.By;

import util.UserInterfaceActionsUtils;

public class JavaScriptAlertsOptionsPage {

	By heading = By.tagName("h3");

	By jsAlert = By.xpath("//li/button[text()='Click for JS Alert']");

	By jsConfirm = By.xpath("//li/button[text()='Click for JS Confirm']");

	By resultEle = By.id("result");

	By resultJsConfirmEle = By.id("result");

	public String getHeadingTitle() {
		return UserInterfaceActionsUtils.getText(heading,"headingTitle");
	}

	public String clickForJsAlert(String name) {
		UserInterfaceActionsUtils.click(jsAlert,"JavaScriptalert");
		UserInterfaceActionsUtils.acceptAlert();
		return UserInterfaceActionsUtils.getText(resultEle,"JavaScriptalert");

	}

	public String clickForJsConfirm(String name) {
		UserInterfaceActionsUtils.click(jsConfirm,"JavascriptConfirm");
		UserInterfaceActionsUtils.acceptAlert();
		return UserInterfaceActionsUtils.getText(resultJsConfirmEle,"JavascriptConfirm");

	}

}
