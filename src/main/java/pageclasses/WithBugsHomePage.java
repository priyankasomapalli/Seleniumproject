package pageclasses;

import org.openqa.selenium.By;

import util.UserInterfaceActionsUtils;

public class WithBugsHomePage {

	By signInLink = By.xpath("//a[contains(text(),'Sign in')]");

	public void clickSignin() {
		UserInterfaceActionsUtils.click(signInLink, "signinlink");
	}

}
