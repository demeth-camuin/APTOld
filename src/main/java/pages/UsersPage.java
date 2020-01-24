package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class UsersPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//a[contains(@id, 'AddNewUsersButton')]")
	WebElement button_AddNewUser;
	
	@FindBy(xpath = "//a[contains(@id, 'SearchButton')]")
	WebElement button_Find;
	
	@FindBy(xpath = "//*[text() = 'Active']")
	WebElement columnHeader_Active;
	
	@FindBy(xpath = "//*[text() = 'Email']")
	WebElement columnHeader_Email;
	
	@FindBy(xpath = "//*[text() = 'First Name']")
	WebElement columnHeader_FirstName;
	
	@FindBy(xpath = "//*[text() = 'Last Name']")
	WebElement columnHeader_LastName;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[3]")
	WebElement input_EmailFilter;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[2]")
	WebElement input_FirstNameFilter;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[1]")
	WebElement input_LastNameFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'SearchInput')]")
	WebElement input_Search;
	
	@FindBy(xpath = "(//input[@value = 'Active'])[1]")
	WebElement rowData_TopActiveButton;
	
	@FindBy(xpath = "(//a[@title = 'Edit'])[1]")
	WebElement rowData_TopEditButton;
	
	@FindBy(xpath = "(//div[@col-id = 'Email'])[2]")
	WebElement rowData_TopEmail;
	
	@FindBy(xpath = "(//div[@col-id = 'FirstName'])[2]")
	WebElement rowData_TopFirstName;
	
	@FindBy(xpath = "(//div[@col-id = 'LastName'])[2]")
	WebElement rowData_TopLastName;
	
	@FindBy(xpath = "(//a[@title = 'Reset'])[1]")
	WebElement rowData_TopResetButton;
	
	@FindBy(xpath = "(//a[@title = 'Unlock'])[1]")
	WebElement rowData_TopUnlockButton;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public UsersPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void checkTopRowDataActive(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_TopActiveButton, "value", expectedValue);
	}
	
	public void clickActiveColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Active);
	}
	
	public void clickEmailColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Email);
	}
	
	public void clickFindButton() throws Exception {
		CommonFunctions.clickElement(button_Find);
	}
	
	public void clickFirstNameColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_FirstName);
	}
	
	public void clickLastNameColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_LastName);
	}
	
	public void clickTopRowDataActiveButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopActiveButton);
	}
	
	public void clickTopRowDataResetButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopResetButton);
	}
	
	public void clickTopRowDataUnlockButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopUnlockButton);
	}
	
	public void containsValueTopRowDataEmail(String expectedEmail) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopEmail, expectedEmail);
	}
	
	public void containsValueTopRowDataFirstName(String expectedFirstName) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopFirstName, expectedFirstName);
	}
	
	public void containsValueTopRowDataLastName(String expectedLastName) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopLastName, expectedLastName);
	}
	
	public void setEmailFilterInput(String email) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_EmailFilter, email);
	}
	
	public void setFirstNameFilterInput(String firstName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_FirstNameFilter, firstName);
	}
	
	public void setLastNameFilterInput(String lastName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_LastNameFilter, lastName);
	}
	
	public void setSearchValueInput(String searchValue) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Search, searchValue);
	}
	
	public UserDetailsPage clickAddNewUserButton() throws Exception {
		CommonFunctions.clickElement(button_AddNewUser);
		
		return new UserDetailsPage();
	}
	
	public UserDetailsPage clickTopRowDataEditButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopEditButton);
		
		return new UserDetailsPage();
	}
	// End - Actions
}