import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import util.BaseUtils;

public class TableAssignmentTest {

	By sortDropDown = By.id("sortBy");

	By enrollments = By.xpath("//select/option[@value='col_enroll']");

	By enrollRawList = By.xpath("//tr/th[@id='col_enroll']/following::tr/td[@headers='col_enroll']");

	By enrollmentList = By.xpath("//tr/th[@id='col_enroll']/following::tr/td[@headers='col_enroll']");

	public static ExtentReports extent;

	public static ExtentSparkReporter spark;

	@Test

	public void tableListTest() {

		String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh.mm.ss a"));

		spark = new ExtentSparkReporter("target/AutomationReport_" + time + ".html");

		extent = new ExtentReports();

		extent.attachReporter(spark);

		try {

			spark.config().setDocumentTitle(BaseUtils.getConfigValue("documentTitle"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		try {

			spark.config().setReportName(BaseUtils.getConfigValue("reportName"));
		}

		catch (IOException e) {

			e.printStackTrace();
		}

		spark.config().setTheme(Theme.STANDARD);

		ExtentTest test = extent.createTest("Table List Test");

		test.info("Opening browser");

		WebDriver driver = new ChromeDriver();

		test.info("Window maximized");

		driver.manage().window().maximize();

		driver.get("https://practicetestautomation.com/practice-test-table/");

		test.info("The table test page opened");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		List<WebElement> enrollRawData = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(enrollRawList));

		test.info("Unsorted list");

		for (WebElement element : enrollRawData) {

			String text = element.getText();

			test.info(text);

			System.out.println("List before sorting :  " + text);

		}

		System.out.println("-----------------------------------------");

		wait.until(ExpectedConditions.elementToBeClickable(sortDropDown)).click();

		wait.until(ExpectedConditions.elementToBeClickable(enrollments)).click();

		List<WebElement> enrollmentSortedListData = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(enrollmentList));

		test.info("Getting sorted list");

		for (WebElement ele : enrollmentSortedListData) {

			String text = ele.getText();

			test.info(text);

			System.out.println("List after sorting :  " + text);
		}
		int size = enrollmentSortedListData.size();

		int rawDataSize = enrollRawData.size();

		if (rawDataSize == size)

			System.out.println("All the data is available sorted by number of enrollments");

		else

			System.out.println("Elements count is not matching in the list");

		test.pass("Test completed successfully");

		extent.flush();

		driver.close();
	}
}
