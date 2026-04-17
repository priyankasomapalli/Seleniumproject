import org.testng.annotations.Test;

import internetheroukapp.BaseTest;
import pageclasses.DropDownTitlePage;
import pageclasses.WelcomeToTheHeroukAppPage;

public class DropDownTest extends BaseTest {
	@Test
	public void validateDropDownActionsTestByValue() {
		WelcomeToTheHeroukAppPage wcObj = new WelcomeToTheHeroukAppPage();
		wcObj.clickDropDown("DropDowntitle");

		DropDownTitlePage ddTitleObj = new DropDownTitlePage();
		ddTitleObj.getPageTitle();
		ddTitleObj.clickDropDown();
		ddTitleObj.selectDropDownOptionsByValue(2);

	}
	
	

	@Test
	public void validateDropDownActionsTestByText() {
		WelcomeToTheHeroukAppPage wcObj = new WelcomeToTheHeroukAppPage();
		wcObj.clickDropDown("DropDowntitle");

		DropDownTitlePage ddTitleObj = new DropDownTitlePage();
		ddTitleObj.getPageTitle();
		ddTitleObj.clickDropDown();
		ddTitleObj.selectDropDownOptionsByText("Option 1");

	}

	
	
	@Test
	public void validateDropDownFailTestByVlalue() {
		WelcomeToTheHeroukAppPage wcObj = new WelcomeToTheHeroukAppPage();
		wcObj.clickDropDown("DropDowntitle");

		DropDownTitlePage ddTitleObj = new DropDownTitlePage();
		ddTitleObj.getPageTitle();
		ddTitleObj.clickDropDown();
		ddTitleObj.selectDropDownOptionsByValue(3);

	}

}
