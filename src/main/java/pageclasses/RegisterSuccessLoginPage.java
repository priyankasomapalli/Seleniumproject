package pageclasses;

import org.openqa.selenium.By;

import util.UserInterfaceActionsUtils;

public class RegisterSuccessLoginPage {

	By pageTitle = By.tagName("h3");

	public String validateRegisterText(String PageTitle) {
		String text = UserInterfaceActionsUtils.getText(pageTitle,PageTitle );

		return text;
	}

}
