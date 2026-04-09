package pageclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.BaseUtils;

public class WelcomeToTheHeroukAppPage {

	By formAuthEle = By.xpath("//li/a[contains(text(),'Form Authentication')]");

	public void clickFormAuthLink(WebDriver driver,WebDriverWait wait) throws NumberFormatException, IOException {

	
		
		Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("explicitwait")));

		wait.until(ExpectedConditions.elementToBeClickable(formAuthEle)).click();

	}
}
