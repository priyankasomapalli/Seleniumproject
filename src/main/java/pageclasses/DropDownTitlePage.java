package pageclasses;

import org.openqa.selenium.By;

import util.WaitUtils;

public class DropDownTitlePage {
	
	By dropDownTitle=By.tagName("h3");
	
	By dropDownOptions=By.id("dropdown");
	
	public String getPageTitle()
	{
		return WaitUtils.visibilityOfElement(dropDownTitle).getText();
	}
	
}