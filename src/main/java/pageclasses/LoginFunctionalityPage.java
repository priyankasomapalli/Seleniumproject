package pageclasses;

import org.openqa.selenium.By;

import util.UserInterfaceActionsUtils;

public class LoginFunctionalityPage {

	By userName = By.id("username");

	By password = By.id("password");

	By loginButton = By.tagName("button");

	public void enterUserName(String username) {
		UserInterfaceActionsUtils.enterText(userName, username);

	}

	public void enterPassword(String passwordData) {
		UserInterfaceActionsUtils.enterText(password, passwordData);

	}

	public void clickLogin() {

		UserInterfaceActionsUtils.click(loginButton);

	}
}
