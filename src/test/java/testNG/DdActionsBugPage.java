package testNG;

import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class DdActionsBugPage {
	@Test
	public void BugsPageDdTests() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

		Faker fake = new Faker();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String DobEle = sdf.format(fake.date().birthday());

		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");

		WebElement signinEle = driver.findElement(By.xpath("//a[text()='Sign in']"));

		signinEle.click();

		WebElement registerLinkEle = driver.findElement(By.xpath("//a[text()='Register your account']"));

		registerLinkEle.click();

		WebElement firstEle = driver.findElement(By.xpath("//input[@id='first_name']"));

		firstEle.sendKeys(fake.name().firstName());

		WebElement lastEle = driver.findElement(By.xpath("//input[@id='last_name']"));

		lastEle.sendKeys(fake.name().lastName());

		WebElement dobEle = driver.findElement(By.xpath("//input[@id='dob']"));

		dobEle.sendKeys(DobEle);

		WebElement addressEle = driver.findElement(By.xpath("//input[@id='address']"));

		addressEle.sendKeys(fake.address().fullAddress());

		WebElement zipEle = driver.findElement(By.xpath("//input[@id='postcode']"));

		zipEle.sendKeys(fake.address().zipCode());

		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));

		city.sendKeys(fake.address().city());

		WebElement country = driver.findElement(By.xpath("//input[@id='state']"));

		country.sendKeys(fake.address().country());

		WebElement state = driver.findElement(By.xpath("//select[@id='country']"));

		Select dropDown = new Select(state);

		int size = dropDown.getOptions().size();

		dropDown.selectByIndex(size - 2);

		WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));

		String mobile = fake.number().digits(10);

		phone.sendKeys(mobile);

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

		email.sendKeys(fake.internet().emailAddress());

		WebElement passwordTextEle = driver.findElement(By.xpath("//input[@id='password']"));

		passwordTextEle.sendKeys(new Faker().internet().password());

		passwordTextEle.sendKeys(Keys.TAB);

		WebElement registerButtonEle = driver.findElement(By.xpath("//div/button[text()='Register ']"));

		Thread.sleep(5000);

		registerButtonEle.click();

	}

}
