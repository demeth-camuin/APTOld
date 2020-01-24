package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class LoginPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//input[contains(@id, 'LoginButton')]")
	WebElement button_Login;
	
	@FindBy(xpath = "//input[contains(@id, 'UserNameInput')]")
	WebElement input_Email;
	
	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]")
	WebElement input_Password;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public LoginPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void setEmailInput(String email) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Email, email);
	}
	
	public void setPasswordInput(String password) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Password, password);
	}
	
	public HomePage clickLoginButton() throws Exception {
		CommonFunctions.clickElement(button_Login);
		
		return new HomePage();
	}
	// End - Actions
}