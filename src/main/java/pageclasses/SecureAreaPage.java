package pageclasses;

import org.openqa.selenium.By;

import util.UserInterfaceActionsUtils;

public class SecureAreaPage {

	By secureAreaEle = By.tagName("h2");
	
	
	
	public String verifySecureArea() {

		return UserInterfaceActionsUtils.getText(secureAreaEle);
	}

}
