import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TableAssignmentTest {

	By sortDropDown = By.id("sortBy");

	By enrollments = By.xpath("//select/option[@value='col_enroll']");

	By enrollRawList = By.xpath("//tr/th[@id='col_enroll']/following::tr/td[@headers='col_enroll']");

	By enrollmentList = By.xpath("//tr/th[@id='col_enroll']/following::tr/td[@headers='col_enroll']");

	@Test

	public void tableListTest(){
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://practicetestautomation.com/practice-test-table/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		List<WebElement> enrollRawData = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(enrollRawList));

		for (WebElement element : enrollRawData) {

			String text = element.getText();

			System.out.println("List before sorting :  " + text);

		}

		System.out.println("-----------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(sortDropDown)).click();

		wait.until(ExpectedConditions.elementToBeClickable(enrollments)).click();

		List<WebElement> enrollmentSortedListData = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(enrollmentList));

		for (WebElement ele : enrollmentSortedListData) {

			String text = ele.getText();

			System.out.println("List after sorting :  " + text);
		}
		int size = enrollmentSortedListData.size();

		int rawDataSize = enrollRawData.size();

		if (rawDataSize == size)

			System.out.println("All the data is available sorted by number of enrollments");
		else
			System.out.println("Elements count is not matching in the list");

		driver.close();
	}
}
