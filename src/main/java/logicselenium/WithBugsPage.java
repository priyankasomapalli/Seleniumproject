package logicselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class WithBugsPage {
	public static void main(String[] args) throws InterruptedException {

		// Opening the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Entering the URL
		driver.get("https://with-bugs.practicesoftwaretesting.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Finding WebElement "Sign in"
		WebElement signinButtonEle = driver.findElement(By.xpath("//a[text()='Sign in']"));
		// Clicking on signin
		signinButtonEle.click();
		// Finding "RegisteryourAccount" element
		WebElement registerEle = driver.findElement(By.xpath("//a[text()='Register your account']"));
		// Selecting the Register your account
		// Thread.sleep(5000);----->we cant use this method as it waits till the time
		// completes

		// Clicking on register your account button

		registerEle.click();
		// Finfing firstname web element
		WebElement firstNameText = driver.findElement(By.xpath("//input[@id='first_name']"));
		// Sending data to first name
		firstNameText.sendKeys("Priyanka");
		// finding lastname element
		WebElement lastNameText = driver.findElement(By.xpath("//input[@id='last_name']"));
		// Sending last name data
		lastNameText.sendKeys("Somapalli");
		// finding dob element
		WebElement dateOfBirthEle = driver.findElement(By.xpath("//input[@id='dob']"));
		// sending dob value
		dateOfBirthEle.sendKeys("1994-06-16");
		// finding address
		WebElement addressText = driver.findElement(By.xpath("//input[@id='address']"));
		// Sending address
		addressText.sendKeys("2021");
		// Thread.sleep(5000);
		// finding postalcode element
		WebElement postalCodeText = driver.findElement(By.xpath("//input[@id='postcode']"));
		// sending postal value
		postalCodeText.sendKeys("28213");
		// finding city
		WebElement cityText = driver.findElement(By.xpath("//input[@id='city']"));
		// sending city data
		cityText.sendKeys("Charlotte");
		// finding country element
		WebElement countryElement = driver.findElement(By.xpath("//input[@id='state']"));
		// Sending country data
		countryElement.sendKeys("NC");
		// finding country element
		WebElement countryEle = driver.findElement(By.xpath("//select[@id='country']"));
		// selecting country element
		countryEle.sendKeys("USA");
		// finding phone element
		WebElement phoneTextEle = driver.findElement(By.xpath("//input[@id='phone']"));
		// sending phone num
		phoneTextEle.sendKeys("123456789");
		// finding email element
		WebElement emailIdText = driver.findElement(By.xpath("//input[@id='email']"));
		// sending email
		emailIdText.sendKeys("priyanka.mandava1412@gmail.com");
		// finding password element
		WebElement passwordTextEle = driver.findElement(By.xpath("//input[@id='password']"));
		// sending password
		passwordTextEle.sendKeys("password123");
		// Sending tab key
		passwordTextEle.sendKeys(Keys.TAB);

		WebElement registerButton = driver.findElement(By.xpath("//div/button[text()='Register ']"));

		Thread.sleep(3000);
		
		registerButton.click();
	}
}
