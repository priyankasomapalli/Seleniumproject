package pageclasses;

import org.openqa.selenium.By;

import util.UserInterfaceActionsUtils;

public class RegisterYourAccountPage {

	By firstNameText = By.id("first_name");

	By lastNameText = By.id("last_name");

	By dobText = By.id("dob");

	By addressText = By.id("address");

	By postalCodeText = By.id("postcode");

	By cityField = By.id("city");

	By countryField = By.id("state");

	By stateDropDown = By.id("country");

	By phoneField = By.id("phone");

	By emailField = By.id("email");

	By passwordField = By.id("password");

	By registerButton = By.linkText("Register ");

	public void enterFirstName(String firstName) {
		UserInterfaceActionsUtils.enterText(firstNameText, firstName);
	}

	public void enterLastName(String lastName) {
		UserInterfaceActionsUtils.enterText(lastNameText, lastName);
	}

	public void enterDob(String dob) {
		UserInterfaceActionsUtils.enterText(dobText, dob);
	}

	public void enterAddress(String address) {
		UserInterfaceActionsUtils.enterText(addressText, address);
	}

	public void enterPostCode(String postCode) {
		UserInterfaceActionsUtils.enterText(postalCodeText, postCode);
	}

	public void enterCity(String Cityname) {
		UserInterfaceActionsUtils.enterText(cityField, Cityname);
	}

	public void enterCountry(String state) {
		UserInterfaceActionsUtils.enterText(countryField, state);
	}

	public void selectState(String Country) {
		UserInterfaceActionsUtils.selectDropDownByVisibleText(stateDropDown, Country);
	}

	public void enterPhone(String phone) {
		UserInterfaceActionsUtils.enterText(phoneField, phone);
	}

	public void enterEmail(String email) {
		UserInterfaceActionsUtils.enterText(emailField, email);
	}

	public void enterPassword(String password) {
		UserInterfaceActionsUtils.enterPassword(passwordField, password);
	}

	public void clickRegister() {
		UserInterfaceActionsUtils.click(registerButton, "register Button");
	}

}
