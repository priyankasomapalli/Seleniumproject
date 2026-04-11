package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.WaitUtils;

public class SecureAreaPage {

	By secureAreaEle = By.tagName("h2");
	
	
	
	public String verifySecureArea() {

		WebElement secureAreaElement = WaitUtils.visibilityOfElement(secureAreaEle);
		return secureAreaElement.getText();

	}

}
