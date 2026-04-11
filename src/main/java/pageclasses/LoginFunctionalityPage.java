package pageclasses;

import org.openqa.selenium.By;

import util.WaitUtils;

public class LoginFunctionalityPage {

	By userName = By.id("username");

	By password = By.id("password");

	By loginButton = By.tagName("button");

	public void enterUserName(String username) {
		WaitUtils.visibilityOfElement(userName).sendKeys(username);

		
	}

	public void enterPassword(String passwordData) {

		WaitUtils.visibilityOfElement(password).sendKeys(passwordData);
		
	}

	public void clickLogin() {

		WaitUtils.elementToBeClickable(loginButton);

	}
}
