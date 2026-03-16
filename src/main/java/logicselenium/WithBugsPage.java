package logicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithBugsPage {
	public static void main(String[] args) {
		// Opening the Chrome browser
		WebDriver driver = new ChromeDriver();
		// Entering the URL
		driver.get("https://with-bugs.practicesoftwaretesting.com/");
		// Finding WebElement "Sign in"
		WebElement signinButtonEle = driver.findElement(By.xpath("//a[text()='Sign in']"));
		// Clicking on signin
		signinButtonEle.click();
		// Finding "RegisteryourAccount" element
		WebElement registerEle = driver.findElement(By.xpath("//a[text()='Register your account']"));
		// Selecting the Register your account
		registerEle.click();
		//WebElement firstNameText = driver.findElement(By.xpath("//input[@id='first_name']"));
		//firstNameText.sendKeys("Priyanka");
		//WebElement lastNameText = driver.findElement(By.xpath("//input[@id='last_name']"));
		//lastNameText.sendKeys("Somapalli");
		//WebElement dateOfBirthVal = driver.findElement(By.xpath("//input[@id='dob']"));
		//dateOfBirthVal.sendKeys("1994-06-16");
		//WebElement addressText=driver.findElement(By.xpath("//input[@id='address']"));
		//addressText.sendKeys("2021");
		//WebElement postalCodeText=driver.findElement(By.xpath(""));
		//postalCodeText.sendKeys("28213");
		//WebElement cityText=driver.findElement(By.xpath(""));
		//cityText.sendKeys("Charlotte");
		
		

	}
}
