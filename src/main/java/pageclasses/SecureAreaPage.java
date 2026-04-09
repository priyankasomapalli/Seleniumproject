package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecureAreaPage {

	By secureAreaEle = By.tagName("h2");
	
	WebDriverWait wait;
	public SecureAreaPage(WebDriverWait wait)
	{
		this.wait=wait;
	}

	public String verifySecureArea() {

		WebElement secureAreaElement = wait.until(ExpectedConditions.visibilityOfElementLocated(secureAreaEle));

		return secureAreaElement.getText();

	}

}
