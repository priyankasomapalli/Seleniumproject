package pageclasses;

import org.openqa.selenium.By;

import util.UserInterfaceActionsUtils;

public class DropDownTitlePage {

	By dropDownTitle = By.tagName("h3");

	By dropDownOptions = By.id("dropdown");

	
	public  void clickDropDown()
	{
		UserInterfaceActionsUtils.click(dropDownOptions,"DropDownlist");
	}
	
	public void getPageTitle()
	{
		UserInterfaceActionsUtils.getText(dropDownTitle, "dropDownTitle");
		
	}

	
	public void selectDropDownOptionsByValue(int val)
	{
		UserInterfaceActionsUtils.selectDropDownByIndex(dropDownOptions,val);
		
	}
	public void selectDropDownOptionsByText(String text)
	{
	UserInterfaceActionsUtils.selectDropDownByVisibleText(dropDownOptions, text);
}}
