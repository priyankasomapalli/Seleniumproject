package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptAlertsOptionsPage {

	WebDriverWait wait;
	WebDriver driver;
	
	public JavaScriptAlertsOptionsPage(WebDriverWait wait,WebDriver driver)
	{
		this.wait=wait;
		this.driver=driver;
	}

	

	By heading = By.tagName("h3");

	By jsAlert = By.xpath("//li/button[text()='Click for JS Alert']");

	By jsConfirm = By.xpath("//li/button[text()='Click for JS Confirm']");

	By resultEle = By.id("result");

	By resultJsConfirmEle = By.id("result");

	public String getHeadingTitle() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(heading)).getText();
	}

	public String clickForJsAlert() {
		wait.until(ExpectedConditions.elementToBeClickable(jsAlert)).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		return wait.until(ExpectedConditions.visibilityOfElementLocated(resultEle)).getText();

	}

	public String clickForJsConfirm() {
		wait.until(ExpectedConditions.elementToBeClickable(jsConfirm)).click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		return wait.until(ExpectedConditions.visibilityOfElementLocated(resultJsConfirmEle)).getText();

	}

}
