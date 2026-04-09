package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SecureAreaPage {

	

	public String verifySecureArea(WebDriver driver) {
		WebElement secureAreaElement = driver.findElement(By.tagName("h2"));

		return secureAreaElement.getText();

	}

}
