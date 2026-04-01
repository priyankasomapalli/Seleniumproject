package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class XpathAccess {

	WebDriver driver=new ChromeDriver();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	
	@Test
	public void validatingPath()
	{
	
	 driver.navigate().to("https://demo.guru99.com/test/selenium-xpath.html");
	 
	 
	
	}
}
