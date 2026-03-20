package logicselenium;

import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class UsingFaker {
	public static void main(String[] args)
	{
		
		//Opening the browser
		WebDriver driver=new ChromeDriver();
		//implicitWait()
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Opening the web page
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
		//finding the element signin
		Faker faker=new Faker();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String dobEle=sdf.format(faker.date().birthday());
			
		
		WebElement signinEle=driver.findElement(By.xpath("//a[text()='Sign in']"));
		//Clicking on sign in
		signinEle.click();
		//Finding Register your account 
		WebElement registerYourAccountEle=driver.findElement(By.xpath("//a[text()='Register your account']"));
		//Clicking on the register your account
		registerYourAccountEle.click();
		//finding First name element
		WebElement firstNameEle=driver.findElement(By.xpath("//input[@id='first_name']"));
		//sending data to first name element
		firstNameEle.sendKeys(new Faker().name().firstName());
		//Find last name element
		WebElement lastNameEle=driver.findElement(By.xpath("//input[@id='last_name']"));
		//Sending fake data
		lastNameEle.sendKeys(new Faker().name().lastName());
		//Finding date of birth element
		WebElement dobElement=driver.findElement(By.xpath("//input[@id='dob']"));
		//dobElement.sendKeys("1994-06-16");
		dobElement.sendKeys(dobEle);
		driver.quit();
		
		

		
		
		
	}

}
