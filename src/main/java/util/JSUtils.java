package util;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import managers.DriverManager;

public class JSUtils {

	public static void jsClick(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

		js.executeScript("arguments[0].click();", element);

	}
	
	public static void jsEnterText(WebElement element, String text) {

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

		js.executeScript("arguments[0].value='text';", element);

	}
	
	public static void jsEnterPassword(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

		js.executeScript("arguments[0].value='text';", element);
	}


	public static void scrollToAnElement(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

		js.executeScript("arguments[0].scrollInToView(true);", element);
	}

	public static void scrollToRight() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

		js.executeScript("window.scrollBy(500,0)");

	}

	public static void scrollToLeft() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

		js.executeScript("window.scrollBy(-500,0)");

	}

	public static void scrollTOCoordinates(int x, int y) {

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

		js.executeScript("window.scrollTo(" + x + "," + y + ")");

	}
}
