package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class CustomersPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//a[contains(@id, 'CreateNewSupplierLinkButton')]")
	WebElement button_AddNewCustomer;
	
	@FindBy(xpath = "//a[contains(@id, 'Button_Advance')]")
	WebElement button_AdvancedFilter;
	
	@FindBy(xpath = "//a[contains(@id, 'FindCustomers')]")
	WebElement button_Find;
	
	@FindBy(xpath = "//a[contains(@id, 'Button_ResetFilter')]")
	WebElement button_Reset;
	
	@FindBy(xpath = "//select[contains(@id, 'CustomerTypeInputDropdown')]")
	WebElement dropdown_Type;
	
	@FindBy(xpath = "(//input[contains(@ref, 'eColumnFloatingFilter')])[4]")
	WebElement input_AgencyChainFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'CustomerIDInput')]")
	WebElement input_Id;
	
	@FindBy(xpath = "(//input[contains(@ref, 'eColumnFloatingFilter')])[1]")
	WebElement input_IdFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'CustomerNameInput')]")
	WebElement input_Name;
	
	@FindBy(xpath = "(//input[contains(@ref, 'eColumnFloatingFilter')])[2]")
	WebElement input_NameFilter;
	
	@FindBy(xpath = "(//input[contains(@ref, 'eColumnFloatingFilter')])[3]")
	WebElement input_TypeFilter;
	
	@FindBy(xpath = "(//a[@title = 'Copy'])[1]")
	WebElement rowData_TopCopyButton;
	
	@FindBy(xpath = "(//a[@title = 'Edit'])[1]")
	WebElement rowData_TopEditButton;
	
	@FindBy(xpath = "(//div[@col-id = 'CustomerID'])[2]")
	WebElement rowData_TopId;
	
	@FindBy(xpath = "(//div[@col-id = 'CustomerName'])[2]")
	WebElement rowData_TopName;
	
	@FindBy(xpath = "(//a[@title = 'View'])[1]")
	WebElement rowData_TopViewButton;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public CustomersPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void clickAdvancedFilterButton() throws Exception {
		CommonFunctions.clickElement(button_AdvancedFilter);
	}
	
	public void clickResetButton() throws Exception {
		CommonFunctions.clickElement(button_Reset);
	}
	
	public void containsValueIdInput(String expectedId) throws Exception {
		CommonFunctions.elementContainsText(input_Id, expectedId);
	}
	
	public void displayedTopRowDataViewButton() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopViewButton);
	}
	
	public void hiddenAddNewCustomerButton() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//a[contains(@id, 'CreateNewSupplierLinkButton')]");
	}
	
	public void selectTypeValue(String typeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Type, typeValue);
	}
	
	public void setAgencyChainFilterInput(String agencyChain) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AgencyChainFilter, agencyChain);
	}
	
	public void setIdInput(String id) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Id, id);
	}
	
	public void setIdFilterInput(String id) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_IdFilter, id);
	}
	
	public void setNameFilterInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_NameFilter, name);
	}
	
	public void setNameInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Name, name);
	}
	
	public void setTypeFilterInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_TypeFilter, name);
	}
	
	public CustomerDetailsPage clickAddNewCustomerButton() throws Exception {
		CommonFunctions.clickElement(button_AddNewCustomer);
		
		return new CustomerDetailsPage();
	}
	
	public CustomerDetailsPage clickFindButton() throws Exception {
		CommonFunctions.clickElement(button_Find);
		
		return new CustomerDetailsPage();
	}
	
	public CustomerDetailsPage clickTopRowDataCopyButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopCopyButton);
		
		return new CustomerDetailsPage();
	}
	
	public CustomerDetailsPage clickTopRowDataEditButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopEditButton);
		
		return new CustomerDetailsPage();
	}
	
	public CustomerDetailsPage clickTopRowDataViewButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopViewButton);
		
		return new CustomerDetailsPage();
	}
	// End - Actions
}