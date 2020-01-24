package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class CommissionsPage extends Base {
	// Start - Page Objects
	// Start - Main Page Objects
	@FindBy(xpath = "//input[contains(@value, 'Add Rules')]")
	WebElement button_AddRules;
	
	@FindBy(xpath = "//a[contains(@id, 'UpdateCommission')]")
	WebElement button_EditCommissionName;
	
	@FindBy(xpath = "//a[contains(@id, 'CreateNewCommissionLinkButton')]")
	WebElement button_NewCommission;
	
	@FindBy(xpath = "//label[contains(@id, 'showpasttogglebutton')]//input")
	WebElement checkbox_ShowPastCommissionDates;
	
	@FindBy(xpath = "//div[contains(@id, 'CommissionDropDown')]")
	WebElement dropdown_Commission;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[2]")
	WebElement input_BrandFilter;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[6]")
	WebElement input_ContractFilter;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[1]")
	WebElement input_RatePercentFilter;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[5]")
	WebElement input_TourClassFilter;
	
	@FindBy(xpath = "(//a[@title = 'Delete'])[1]")
	WebElement rowData_TopDeleteButton;
	
	@FindBy(xpath = "(//a[@title = 'Edit'])[2]")
	WebElement rowData_TopEditButton;
	
	@FindBy(xpath = "(//a[@title = 'View'])[1]")
	WebElement rowData_TopViewButton;
	
	@FindBy(xpath = "//div[contains(@id, 'AGGridContainer')]")
	WebElement table_CommissionRules;
	// End - Main Page Objects
	
	// Start - Create Commission Name Popup Objects
	@FindBy(xpath = "//a[contains(@id, 'AddRulesLater')]")
	WebElement button_CreateCommissionNamePopup_AddRulesLater;
	
	@FindBy(xpath = "//a[contains(@id, 'AddRulesNow')]")
	WebElement button_CreateCommissionNamePopup_AddRulesNow;
	
	@FindBy(xpath = "//a[contains(@href, '#') and contains(@role, 'button')]")
	WebElement button_CreateCommissionNamePopup_Close;
	
	@FindBy(xpath = "//input[contains(@id, 'Commision_Input')]")
	WebElement input_CreateCommissionNamePopup_Name;
	// End - Create Commission Name Popup Objects
	
	// Start - Delete Commission Rule Popup Objects
	@FindBy(xpath = "//input[@value = 'Cancel']")
	WebElement button_DeleteCommissionRulePopup_Cancel;
	
	@FindBy(xpath = "//input[@value = 'OK']")
	WebElement button_DeleteCommissionRulePopup_OK;
	// End - Delete Commission Rule Popup Objects
	
	// Start - Edit Commission Name Popup Objects
	@FindBy(xpath = "//a[contains(@id, 'CancelLinkButton')]")
	WebElement button_EditCommissionNamePopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'UpdateLinkButton')]")
	WebElement button_EditCommissionNamePopup_UpdateCommissionName;
	
	@FindBy(xpath = "//input[contains(@id, 'Commision_Input')]")
	WebElement input_EditCommissionNamePopup_Name;
	// End - Edit Commission Name Popup Objects
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public CommissionsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	// Start - Main Page Actions
	public void clickCommissionDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Commission);
	}
	
	public void clickEditCommissionNameButton() throws Exception {
		CommonFunctions.clickElement(button_EditCommissionName);
	}
	
	public void clickNewCommissionButton() throws Exception {
		CommonFunctions.clickElement(button_NewCommission);
	}
	
	public void clickShowPastCommissionDatesCheckbox() throws Exception {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//label[contains(@id, 'showpasttogglebutton')]")));
	}
	
	public void clickTopRowDataDeleteButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopDeleteButton);
		CommonFunctions.pause(5000, false);
	}
	
	public void disabledEditCommissionNameButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_EditCommissionName, "disabled", "true");
	}
	
	public void displayedCommissionDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Commission);
	}
	
	public void displayedCommissionTable() throws Exception {
		CommonFunctions.elementDisplayed(table_CommissionRules);
	}
	
	public void displayedNewCommissionButton() throws Exception {
		CommonFunctions.elementDisplayed(button_NewCommission);
	}
	
	public void displayedTopRowDataDeleteButton() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopDeleteButton);
	}
	
	public void displayedTopRowDataEditButton() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopEditButton);
	}
	
	public void displayedTopRowDataViewButton() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopViewButton);
	}
	
	public void enabledAddRulesButton() throws Exception {
		CommonFunctions.elementEnabled(button_AddRules);
	}
	
	public void enabledEditCommissionNameButton() throws Exception {
		CommonFunctions.elementEnabled(button_EditCommissionName);
	}
	
	public void hiddenTopRowDataDeleteButton() throws Exception {
		CommonFunctions.elementNotExistingByXPath("(//a[@title = 'Delete'])[1]");
	}
	
	public void hiddenTopRowDataEditButton() throws Exception {
		CommonFunctions.elementNotExistingByXPath("(//a[@title = 'Edit'])[2]");
	}
	
	public void setBrandFilterInput(String brand) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_BrandFilter, brand);
	}
	
	public void setContractFilterInput(String contract) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractFilter, contract);
	}
	
	public void setRatePercentFilterInput(String ratePercent) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_RatePercentFilter, ratePercent);
	}
	
	public void setTourClassFilterInput(String tourClass) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_TourClassFilter, tourClass);
	}
	
	public CommissionRulesDetailsPage clickAddRulesButton() throws Exception {
		CommonFunctions.clickElement(button_AddRules);
		
		return new CommissionRulesDetailsPage();
	}
	
	public CommissionRulesDetailsPage clickTopRowDataEditButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopEditButton);
		
		return new CommissionRulesDetailsPage();
	}
	
	public CommissionRulesDetailsPage clickTopRowDataViewButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopViewButton);
		
		return new CommissionRulesDetailsPage();
	}
	// End - Main Page Actions
	
	// Start - Create Commission Name Popup Actions
	public CommissionRulesDetailsPage clickCreateCommissionNamePopupAddRulesNowButton() throws Exception {
		CommonFunctions.clickElement(button_CreateCommissionNamePopup_AddRulesNow);
		
		return new CommissionRulesDetailsPage();
	}
	
	public void clickCreateCommissionNamePopupAddRulesLaterButton() throws Exception {
		CommonFunctions.clickElement(button_CreateCommissionNamePopup_AddRulesLater);
	}
	
	public void clickCreateCommissionNamePopupCloseButton() throws Exception {
		CommonFunctions.clickElement(button_CreateCommissionNamePopup_Close);
	}
	
	public void disabledCreateCommissionNamePopupAddRulesLaterButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_CreateCommissionNamePopup_AddRulesLater, "disabled", "true");
	}
	
	public void disabledCreateCommissionNamePopupAddRulesNowButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_CreateCommissionNamePopup_AddRulesNow, "disabled", "true");
	}
	
	public void enabledCreateCommissionNamePopupAddRulesLaterButton() throws Exception {
		CommonFunctions.elementEnabled(button_CreateCommissionNamePopup_AddRulesLater);
	}
	
	public void enabledCreateCommissionNamePopupAddRulesNowButton() throws Exception {
		CommonFunctions.elementEnabled(button_CreateCommissionNamePopup_AddRulesNow);
	}
	
	public void enabledCreateCommissionNamePopupNameInput() throws Exception {
		CommonFunctions.elementEnabled(input_CreateCommissionNamePopup_Name);
	}
	
	public String setCreateCommissionNamePopupNameInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CreateCommissionNamePopup_Name, name);
		
		return name;
	}
	// End - Create Commission Name Popup Actions
	
	// Start - Delete Commission Rule Popup Actions
	public void clickDeleteCommissionRulePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_DeleteCommissionRulePopup_Cancel);
	}
	
	public void clickDeleteCommissionRulePopupOKButton() throws Exception {
		CommonFunctions.clickElement(button_DeleteCommissionRulePopup_OK);
	}
	// End - Delete Commission Rule Popup Actions
	
	// Start - Edit Commission Name Popup Actions
	public void clickEditCommissionNamePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_EditCommissionNamePopup_Cancel);
	}
	
	public void clickEditCommissionNamePopupUpdateCommissionNameButton() throws Exception {
		CommonFunctions.clickElement(button_EditCommissionNamePopup_UpdateCommissionName);
	}
	
	public void setEditCommissionNamePopupNameInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_EditCommissionNamePopup_Name, name);
	}
	// End - Edit Commission Name Popup Actions
	// End - Actions
}