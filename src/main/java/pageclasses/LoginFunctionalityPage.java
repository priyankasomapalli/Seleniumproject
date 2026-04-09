package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginFunctionalityPage {

	By userName=By.id("username");

	public void enterUserName(WebDriver driver, WebDriverWait wait) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys("tomsmith");

	}

	public void enterPassword(WebDriver driver, WebDriverWait wait) {

		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	}

	public void clickLogin(WebDriver driver, WebDriverWait wait) {

		driver.findElement(By.tagName("button")).click();
	}
}
