package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunctionalityPage {
	
	
	public LoginFunctionalityPage(WebDriverWait wait)
	{
		this.wait=wait;
	}
	By userName = By.id("username");

	By password = By.id("password");

	By loginButton = By.tagName("button");
	
	
	WebDriverWait wait;

	public void enterUserName(String username) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(username);

	}

	public void enterPassword(String passwordData) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(passwordData);
	}

	public void clickLogin() {

		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

	}
}
