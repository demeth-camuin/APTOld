package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class UserDetailsPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "(//input[contains(@id, 'CloseButton')])[1]")
	WebElement button_Close;
	
	@FindBy(xpath = "//a[contains(@id, 'ResendActivaionEmailButton')]")
	WebElement button_ResendActivation;
	
	@FindBy(xpath = "//a[contains(@id, 'ResetPasswordButton')]")
	WebElement button_ResetPassword;
	
	@FindBy(xpath = "//input[contains(@id, 'SaveUserButton')]")
	WebElement button_SaveUser;
	
	@FindBy(xpath = "//a[contains(@id, 'UnlockUserButton')]")
	WebElement button_UnlockUser;
	
	@FindBy(xpath = "//input[contains(@id, 'ActiveCheckbox')]")
	WebElement checkbox_ActiveUser;
	
	@FindBy(xpath = "//select[contains(@id, 'AdminAccessInput')]")
	WebElement dropdown_AdministerAccess;
	
	@FindBy(xpath = "//span[contains(text(), 'Promotions')]//ancestor::td//following-sibling::td//select")
	WebElement dropDown_Promotions;
	
	@FindBy(xpath = "//span[contains(text(), 'Packages')]//ancestor::td//following-sibling::td//select")
	WebElement dropdown_Packages;
	
	@FindBy(xpath = "//span[contains(text(), 'Customers')]//ancestor::td//following-sibling::td//select")
	WebElement dropdown_Customers;
	
	@FindBy(xpath = "//span[contains(text(), 'Suppliers')]//ancestor::td//following-sibling::td//select")
	WebElement dropdown_Suppliers;
	
	@FindBy(xpath = "//input[contains(@id, 'FirstNameInput')]")
	WebElement input_FirstName;
	
	@FindBy(xpath = "//input[contains(@id, 'LastNameInput')]")
	WebElement input_LastName;
	
	@FindBy(xpath = "//input[contains(@id, 'OdysseyUserIdInput')]")
	WebElement input_OdysseyUserId;
	
	@FindBy(xpath = "//input[contains(@id, 'UserNameInput')]")
	WebElement input_UserName;
	
	@FindBy(xpath = "//div[contains(@class, 'Title PH')]")
	WebElement label_UserDetailsTitle;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public UserDetailsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void appendOdysseyUserIdInput() throws Exception {
		CommonFunctions.clickElement(input_OdysseyUserId);
		CommonFunctions.enterElementValue(input_OdysseyUserId, "0");
	}
	
	public void clickResendActivationButton() throws Exception {
		CommonFunctions.clickElement(button_ResendActivation);
	}
	
	public void clickResetPasswordButton() throws Exception {
		CommonFunctions.clickElement(button_ResetPassword);
	}
	
	public void containsValueEmailInput(String expectedEmail) throws Exception {
		CommonFunctions.elementAttributeContains(input_UserName, "value", expectedEmail);
	}
	
	public void containsValueFirstNameInput(String firstName) throws Exception {
		CommonFunctions.elementAttributeContains(input_FirstName, "value", firstName);
	}
	
	public void containsValueLastNameInput(String lastName) throws Exception {
		CommonFunctions.elementAttributeContains(input_LastName, "value", lastName);
	}
	
	public void disabledSaveButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_SaveUser, "disabled", "true");
	}
	
	public void hiddenResendActivationButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ResendActivation.findElement(By.xpath(".//parent::div")), "style", "display: none;");
	}
	
	public void selectAdministerAccessValue(String administerAccessValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_AdministerAccess, administerAccessValue);
	}
	
	public void selectCustomersAccessValue(String customersAccessValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Customers, customersAccessValue);
	}
	
	public void selectPackagesAccessValue(String packagesAccessValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Packages, packagesAccessValue);
	}
	
	public void selectPromotionsAccessValue(String promotionsAccessValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropDown_Promotions, promotionsAccessValue);
	}
	
	public void selectSuppliersAccessValue(String suppliersAccessValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Suppliers, suppliersAccessValue);
	}
	
	public void setFirstNameInput(String firstName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_FirstName, firstName);
	}
	
	public void setLastNameInput(String lastName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_LastName, lastName);
	}
	
	public void setOdysseyUserIdInput(String odysseyUserId) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_OdysseyUserId, odysseyUserId);
	}
	
	public UsersPage clickCloseButton() throws Exception {
		CommonFunctions.clickElement(button_Close);
		CommonFunctions.clickOnPopUp("Leave");
		CommonFunctions.pause(2500, false);
		
		return new UsersPage();
	}
	
	public UsersPage clickSaveButton() throws Exception {
		CommonFunctions.clickElement(button_SaveUser);
		
		return new UsersPage();
	}
	
	public String setUserEmailInput(String userEmail) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_UserName, userEmail);
		
		return userEmail;
	}
	// End - Actions
}