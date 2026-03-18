package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyRegisterTests {
	@Test //Called Annotations
	public void myRegisterTest()
	{
		//open browser
		WebDriver driver=new ChromeDriver();
		//using implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Sending URL
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
		//Finding Signin element
		WebElement signinEle=driver.findElement(By.xpath("//a[text()='Sign in']"));
		//Click signin
		signinEle.click();
		
		
	}

}
