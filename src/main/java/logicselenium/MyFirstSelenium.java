package logicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {
	public static void main(String[] args) {
		// open the browser

		WebDriver driver = new ChromeDriver();

		// Entering the URL of the Website

		driver.get("https://the-internet.herokuapp.com/");

		// Finding the element we want and giving that element to a reference variable

		WebElement formAuthenticationEle = driver.findElement(By.xpath("//a[text()='Form Authentication']"));

		// Clicking on that element.

		formAuthenticationEle.click();

		// for Entering data in username field,we need to locate first

		WebElement userNameText = driver.findElement(By.xpath("//input[@id='username']"));

		// Entering text

		userNameText.sendKeys("tomsmith");

		// Locating Password text field by xpath

		WebElement passwordText = driver.findElement(By.xpath("//input[@id='password']"));

		// Enetering text for password field

		passwordText.sendKeys("SuperSecretPassword!");

		// Finding Login button

		WebElement loginButtonEle = driver.findElement(By.xpath("//i[text()=' Login']"));

		// Clicking on it

		loginButtonEle.click();

	}

}
