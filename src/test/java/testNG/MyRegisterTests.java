package testNG;

import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class MyRegisterTests {
	@Test // Called Annotations
	public void myRegisterTest() throws InterruptedException {
		// open browser

		WebDriver driver = new ChromeDriver();

		// using implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().window().maximize();

		// Sending URL

		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");

		Faker fake = new Faker();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String DobEle = sdf.format(fake.date().birthday());

		// Finding Signin element

		WebElement signinEle = driver.findElement(By.xpath("//a[text()='Sign in']"));

		// Click signin

		signinEle.click();

		WebElement registerEle = driver.findElement(By.xpath("//a[text()='Register your account']"));

		// Click register

		registerEle.click();

		// Finding firstname element

		WebElement firstNameEle = driver.findElement(By.xpath("//input[@id='first_name']"));

		// Sending fake first name

		firstNameEle.sendKeys(fake.name().firstName());

		// finding last name

		WebElement lastNameEle = driver.findElement(By.xpath("//input[@id='last_name']"));

		// sending last name fake data

		lastNameEle.sendKeys(fake.name().lastName());

		// finding address field

		WebElement addressTextEle = driver.findElement(By.xpath("//input[@id='address']"));

		WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));

		dob.sendKeys(DobEle);

		// sending fake address

		addressTextEle.sendKeys(fake.address().fullAddress());

		// finding postal code

		WebElement postalCodeText = driver.findElement(By.xpath("//input[@id='postcode']"));

		// sending fake postal code

		postalCodeText.sendKeys(fake.address().zipCode());

		// finding phone number element

		WebElement phoneTextEle = driver.findElement(By.xpath("//input[@id='phone']"));

		// sending fake number

		String mobile = fake.number().digits(10);

		phoneTextEle.sendKeys(mobile);

		// finding email element

		WebElement emailIdText = driver.findElement(By.xpath("//input[@id='email']"));

		// sending email using faker

		emailIdText.sendKeys(fake.internet().emailAddress());

		// finding password element

		WebElement passwordTextEle = driver.findElement(By.xpath("//input[@id='password']"));

		// sending password

		passwordTextEle.sendKeys(fake.internet().password());

		passwordTextEle.sendKeys(Keys.TAB);

		// finding register button

		WebElement registerButtonEle = driver.findElement(By.xpath("//div/button[text()='Register ']"));

		// Clicking on register button

		Thread.sleep(3000);

		registerButtonEle.click();

	}
}
