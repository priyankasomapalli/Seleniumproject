package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDrownActions {
	@Test
	public void DropDownActionsTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://the-internet.herokuapp.com/");
		WebElement ddEle=driver.findElement(By.xpath("//a[text()='Dropdown']"));
		ddEle.click();
		WebElement ddEleHeader=driver.findElement(By.xpath("//h3[text()='Dropdown List']"));
		String header=ddEleHeader.getText();
		Assert.assertEquals(header,"Dropdown List");
		WebElement selectEle=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select dd=new Select(selectEle);
		dd.selectByIndex(1);
		dd.selectByVisibleText("Option 2");
		
	}

}
