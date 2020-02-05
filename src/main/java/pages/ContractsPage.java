package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ContractsPage extends Base {
	// Start - Page Objects
	// Start - Main Page Objects
	@FindBy(xpath = "//a[contains(@id, 'CreateNewSupplierLinkButton')]")
	WebElement button_CreateNewContract;
	
	@FindBy(xpath = "//a[contains(text(), 'Reset')]")
	WebElement button_Reset;
	
	@FindBy(xpath = "//input[contains(@id, 'ExcludeClosedContract_Checkbox')]")
	WebElement checkbox_ExcludeClosedContracts;
	
	@FindBy(xpath = "//span[text() = 'City']")
	WebElement columnHeader_City;
	
	@FindBy(xpath = "//span[text() = 'Contract ID']")
	WebElement columnHeader_Id;
	
	@FindBy(xpath = "//span[text() = 'Contract Name']")
	WebElement columnHeader_Name;
	
	@FindBy(xpath = "//span[text() = 'Status']")
	WebElement columnHeader_Status;
	
	@FindBy(xpath = "//span[text() = 'Contract Type']")
	WebElement columnHeader_Type;
	
	@FindBy(xpath = "//div[contains(@id, 'Category1Dropdown')]")
	WebElement dropdown_Category1;
	
	@FindBy(xpath = "//div[contains(@id, 'CityDropdown')]")
	WebElement dropdown_City;
	
	@FindBy(xpath = "//div[contains(@id, 'CountryDropdown')]")
	WebElement dropdown_Country;
	
	@FindBy(xpath = "//div[contains(@id, 'CurrencyDropdown')]")
	WebElement dropdown_Currency;
	
	@FindBy(xpath = "//div[contains(@id, 'DepartmentDropdown')]")
	WebElement dropdown_Department;
	
	@FindBy(xpath = "//span[contains(@id, 'MaxRowLabel')]")
	WebElement dropdown_MaxRows;
	
	@FindBy(xpath = "//div[contains(@id, 'OfficeDropdown')]")
	WebElement dropdown_Office;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractTypeInputDropdown')]")
	WebElement dropdown_Type;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[5]")
	WebElement input_CityFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractID')]")
	WebElement input_Id;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractNameInput')]")
	WebElement input_Name;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[2]")
	WebElement input_NameFilter;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[4]")
	WebElement input_StatusFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'SupplierIDInput')]")
	WebElement input_SupplierId;
	
	@FindBy(xpath = "//input[contains(@id, 'SupplierNameInput')]")
	WebElement input_SupplierName;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[3]")
	WebElement input_TypeFilter;
	
	@FindBy(xpath = "(//div[@col-id = 'City'])[2]")
	WebElement rowData_City;
	
	@FindBy(xpath = "(//div[@col-id = 'Comments'])[2]")
	WebElement rowData_Comments;
	
	@FindBy(xpath = "(//div[@col-id = 'Country'])[2]")
	WebElement rowData_Country;
	
	@FindBy(xpath = "(//div[@col-id = 'Currency'])[2]")
	WebElement rowData_Currency;
	
	@FindBy(xpath = "(//a[@title = 'Copy'])[1]")
	WebElement rowData_TopCopyButton;
	
	@FindBy(xpath = "(//a[@title = 'Edit'])[1]")
	WebElement rowData_TopEditButton;
	
	@FindBy(xpath = "(//div[@col-id = 'ContractID_1'])[2]")
	WebElement rowData_TopId;
	
	@FindBy(xpath = "(//div[@col-id = 'ContractName'])[2]")
	WebElement rowData_TopName;
	
	@FindBy(xpath = "(//div[@col-id = 'Status'])[2]")
	WebElement rowData_TopStatus;
	
	@FindBy(xpath = "(//div[@col-id = 'ContractType'])[2]")
	WebElement rowData_TopType;
	
	@FindBy(xpath = "(//a[@title = 'View'])[1]")
	WebElement rowData_TopViewButton;
	
	@FindBy(xpath = "//form[contains(@action, 'Contracts')]//div[contains(@id, 'GridContainer')]")
	WebElement table_Contracts;
	
	@FindBy(xpath = "//a[@title='Delete']")
	WebElement button_DeleteContract;
	
	@FindBy(xpath = "//div[text()='Are you sure you want to delete all details of the selected Contract?']")
	WebElement popup_DeleteContract;
	
	@FindBy(xpath = "//input[contains(@id,'PopupFooter') and @value='Ok']")
	WebElement button_DeletePopupOkButton;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractNameInput')]")
	WebElement input_Name1;
	// End - Main Page Objects
	
	@FindBy(xpath = "//a[@class='far fa-copy ActionIcons' and @title='Copy']")
	WebElement button_Copy;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public ContractsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	// Start - Main Page Actions
	public void checkExcludeClosedContractsCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_ExcludeClosedContracts);
	}
	
	public void clickCategory1Dropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Category1);
	}
	
	public void clickCityColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_City);
	}
	
	public void clickDepartmentDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Department);
	}
	
	public void clickFindButton() throws Exception {
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//a[contains(@id, 'Button_FindCustomers')]"));
		CommonFunctions.pause(10000, false);
	}
	
	public void clickIdColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Id);
	}
	
	public void clickNameColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Name);
	}
	
	public void clickResetButton() throws Exception {
		CommonFunctions.clickElement(button_Reset);
		CommonFunctions.pause(7500, false);
	}
	
	public void clickStatusColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Status);
	}
	
	public void clickTypeColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Type);
	}
	
	public void containsValueCategory1Dropdown(String expectedCategory1) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Category1.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCategory1);
	}
	
	public void containsValueCityDropdown(String expectedCity) throws Exception {
		CommonFunctions.elementContainsText(dropdown_City.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCity);
	}
	
	public void containsValueCountryDropdown(String expectedCountry) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Country.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCountry);
	}
	
	public void containsValueCurrencyDropdown(String expectedCurrency) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Currency.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCurrency);
	}
	
	public void containsValueDepartmentDropdown(String expectedDepartment) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Department.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedDepartment);
	}
	
	public void containsValueMaxRowsDropdown(String expectedMaxRows) throws Exception {
		CommonFunctions.elementContainsText(dropdown_MaxRows, expectedMaxRows);
	}
	
	public void containsValueOfficeDropdown(String expectedOffice) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Office.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedOffice);
	}
	
	public void containsValueTopRowDataCopyButtonTooltip(String expectedTooltip) throws Exception {
		CommonFunctions.elementTooltip(rowData_TopCopyButton, expectedTooltip);
	}
	
	public void containsValueTopRowDataEditButtonTooltip(String expectedTooltip) throws Exception {
		CommonFunctions.elementTooltip(rowData_TopEditButton, expectedTooltip);
	}
	
	public void containsValueTopRowDataName(String expectedName) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopName, expectedName);
	}
	
	public void containsValueTypeDropdown(String expectedType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Type, expectedType);
	}
	
	public void displayedCategory1Dropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Category1);
	}
	
	public void displayedCityDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_City);
	}
	
	public void displayedContractsTable() throws Exception {
		CommonFunctions.elementDisplayed(table_Contracts);
	}
	
	public void displayedCountryDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Country);
	}
	
	public void displayedCreateNewContractButton() throws Exception {
		CommonFunctions.elementDisplayed(button_CreateNewContract);
	}
	
	public void displayedCurrencyDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Currency);
	}
	
	public void displayedDepartmentDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Department);
	}
	
	public void displayedExcludeClosedContractsCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ExcludeClosedContracts);
	}
	
	public void displayedIdInput() throws Exception {
		CommonFunctions.elementDisplayed(input_Id);
	}
	
	public void displayedNameInput() throws Exception {
		CommonFunctions.elementDisplayed(input_Name);
	}
	
	public void displayedOfficeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Office);
	}
	
	public void displayedSupplierIdInput() throws Exception {
		CommonFunctions.elementDisplayed(input_SupplierId);
	}
	
	public void displayedSupplierNameInput() throws Exception {
		CommonFunctions.elementDisplayed(input_SupplierName);
	}
	
	public void displayedTopRowDataCopyButton() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopCopyButton);
	}
	
	public void displayedTopRowDataEditButton() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopEditButton);
	}
	
	public void displayedTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Type);
	}
	
	public void hiddenTopRowDataViewButton() throws Exception {
		CommonFunctions.elementNotExistingByXPath("(//a[@title = 'View'])[1]");
	}
	
	public void selectCategory1Value(String category1Value) throws Exception {
		CommonFunctions.clickElement(dropdown_Category1);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), category1Value);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectDepartmentValue(String departmentValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Department);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), departmentValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectMaxRowsValue(String maxRowsValue) throws Exception {
		CommonFunctions.clickElement(dropdown_MaxRows);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[@class = 'PageSizeOption']//span[contains(@id, '" + maxRowsValue + "')]")));
	}
	
	public void selectOfficeValue(String officeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Office);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), officeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectTypeValue(String typeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Type);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), typeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	public void setCityFilterInput(String city) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CityFilter, city);
	}
	
	public void setIdInput(String id) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Id, id);
	}
	
	public void setNameFilterInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_NameFilter, name);
		CommonFunctions.pause(2500, false);
	}
	
	public void setNameInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Name, name);
	}
	
	public void setStatusFilterInput(String status) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_StatusFilter, status);
	}
	
	public void setTypeFilterInput(String type) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_TypeFilter, type);
	}
	
	public ContractDetailsPage clickCreateNewContractButton() throws Exception {
		CommonFunctions.clickElement(button_CreateNewContract);
		
		return new ContractDetailsPage();
	}
	
	public ContractDetailsPage clickTopRowDataCopyButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopCopyButton);
		CommonFunctions.pause(2500, false);
		
		return new ContractDetailsPage();
	}
	
	public ContractDetailsPage clickTopRowDataEditButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopEditButton);
		CommonFunctions.pause(2500, false);
		
		return new ContractDetailsPage();
	}
	
	public ContractDetailsPage clickTopRowDataViewButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopViewButton);
		CommonFunctions.pause(2500, false);
		
		return new ContractDetailsPage();
	}
	
	public void displayedDeleteContractButton() throws Exception {
		CommonFunctions.elementDisplayed(button_DeleteContract);
	}
	
	public void clickDeleteContractButton() throws Exception {
		CommonFunctions.clickElement(button_DeleteContract);
	}
	
	public void displayedDeleteContractPopup() throws Exception {
		CommonFunctions.elementDisplayed(popup_DeleteContract);
	}
	
	public void clickDeletePopupOkButton() throws Exception {
		CommonFunctions.clickElement(button_DeletePopupOkButton);
	}
	
	public void setNameInput1(String name1) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Name1, name1);
	}
	
	public void OKdisplay() throws Exception {
		CommonFunctions.elementDisplayed(button_DeletePopupOkButton);
	}
	// End - Main Page Actions
	
	public ContractDetailsPage clicksOnCopyButton() throws Exception {
		CommonFunctions.clickElement(button_Copy);
		return new ContractDetailsPage();
	}
	
	public void clearContractId() throws Exception {
		input_Id.clear();
	}
	// End - Actions
}