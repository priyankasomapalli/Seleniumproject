package pageclasses;

import org.openqa.selenium.By;

import util.UserInterfaceActionsUtils;

public class SignInPage {

	By registerLink = By.linkText("Register your account");

	public void clickRegisterLink() {
		UserInterfaceActionsUtils.click(registerLink, "register your account link");
	}

}
