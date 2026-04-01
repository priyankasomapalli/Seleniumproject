package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IphoneAssignment {
WebDriver driver=new ChromeDriver();

WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));

Actions actions=new Actions(driver);

@Test
public void iphoneTest()
{
driver.get("https://www.amazon.com/");



wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox"))).sendKeys("iphone 17");

actions.sendKeys(Keys.ENTER).perform();

WebElement iphone=driver.findElement(By.xpath("//span[contains(text(),'Cosmic Orange')]"));

iphone.click();



}
}