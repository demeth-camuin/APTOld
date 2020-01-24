package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class UserProfilePage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//input[contains(@id, 'Cancel')]")
	WebElement button_Cancel;
	
	@FindBy(xpath = "//input[contains(@id, 'ChangePassword')]")
	WebElement button_ChangePassword;
	
	@FindBy(xpath = "//input[contains(@id, 'UploadAvatar')]")
	WebElement button_Upload;
	
	@FindBy(xpath = "//input[contains(@id, 'SaveChanges')]")
	WebElement button_Save;
	
	@FindBy(xpath = "//img[contains(@src, 'img') and contains(@style, '150px')]")
	WebElement image_ProfilePicture;
	
	@FindBy(xpath = "//input[contains(@id, 'CurrentPassword')]")
	WebElement input_CurrentPassword;
	
	@FindBy(xpath = "//input[contains(@id, 'FirstNameInput')]")
	WebElement input_FirstName;
	
	@FindBy(xpath = "//input[contains(@id, 'LastNameInput')]")
	WebElement input_LastName;
	
	@FindBy(xpath = "//input[contains(@id, 'wtNewPassword')]")
	WebElement input_NewPassword;
	
	@FindBy(xpath = "//input[contains(@id, 'VerifyNewPassword')]")
	WebElement input_VerifyNewPassword;
	
	@FindBy(xpath = "//span[contains(@id, 'OdysseyUserID')]")
	WebElement label_OdysseyUserId;
	
	@FindBy(xpath = "//span[contains(@id, 'OdysseyUsername')]")
	WebElement label_OdysseyUserName;
	
	@FindBy(xpath = "//a[contains(@id, 'ChangePasswordToggle')]")
	WebElement link_ChangePassword;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public UserProfilePage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void clickChangePasswordLink() throws Exception {
		CommonFunctions.clickElement(link_ChangePassword);
	}
	
	public void displayedFirstName() throws Exception {
		CommonFunctions.elementDisplayed(input_FirstName);
	}
	
	public void displayedLastName() throws Exception {
		CommonFunctions.elementDisplayed(input_LastName);
	}
	
	public void displayedOdysseyUserId() throws Exception {
		CommonFunctions.elementDisplayed(label_OdysseyUserId);
	}
	
	public void displayedOdysseyUserName() throws Exception {
		CommonFunctions.elementDisplayed(label_OdysseyUserName);
	}
	
	public void displayedProfilePicture() throws Exception {
		CommonFunctions.elementDisplayed(image_ProfilePicture);
	}
	
	public void setCurrentPasswordInput(String currentPassword) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CurrentPassword, currentPassword);
	}
	
	public void setFirstNameInput(String firstName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_FirstName, firstName);
	}
	
	public void setLastNameInput(String lastName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_LastName, lastName);
	}
	
	public void setNewPasswordInput(String newPassword) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_NewPassword, newPassword);
	}
	
	public void setVerifiedNewPasswordInput(String verifiedNewPassword) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_VerifyNewPassword, verifiedNewPassword);
	}
	
	public UserProfilePage clickChangePasswordButton() throws Exception {
		CommonFunctions.clickElement(button_ChangePassword);
		
		return new UserProfilePage();
	}
	
	public UserProfilePage clickSaveButton() throws Exception {
		CommonFunctions.clickElement(button_Save);
		
		return new UserProfilePage();
	}
	// End - Actions
}