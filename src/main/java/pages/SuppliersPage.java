package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class SuppliersPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//a[contains(@id, 'CreateNewSupplierLinkButton')]")
	WebElement button_AddNewSupplier;
	
	@FindBy(xpath = "//a[contains(@id, 'FindSuppliers')]")
	WebElement button_Find;
	
	@FindBy(xpath = "//div[contains(@id, 'Countries_Combobox')]")
	WebElement dropdown_Country;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_AirlineCode')]")
	WebElement input_AirlineCode;
	
	@FindBy(xpath = "//input[contains(@id, 'City')]")
	WebElement input_City;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[3]")
	WebElement input_CityFilter;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[4]")
	WebElement input_CountryFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_SupplierID')]")
	WebElement input_Id;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[1]")
	WebElement input_IdFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_SupplierName')]")
	WebElement input_Name;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[2]")
	WebElement input_NameFilter;
	
	@FindBy(xpath = "(//div[@col-id = 'City'])[2]")
	WebElement rowData_TopCity;
	
	@FindBy(xpath = "(//a[@title = 'Copy'])[1]")
	WebElement rowData_TopCopyButton;
	
	@FindBy(xpath = "(//div[@col-id = 'Country'])[2]")
	WebElement rowData_TopCountry;
	
	@FindBy(xpath = "(//a[@title = 'Edit'])[1]")
	WebElement rowData_TopEditButton;
	
	@FindBy(xpath = "(//div[@col-id = 'SupplierId_1'])[2]")
	WebElement rowData_TopId;
	
	@FindBy(xpath = "(//div[@col-id = 'SupplierName'])[2]")
	WebElement rowData_TopName;
	
	@FindBy(xpath = "(//div[@col-id = 'Status'])[2]")
	WebElement rowData_TopStatus;
	
	@FindBy(xpath = "(//div[@col-id = 'ThirdParty'])[2]")
	WebElement rowData_TopThirdParty;
	
	@FindBy(xpath = "(//a[@title = 'View'])[1]")
	WebElement rowData_TopViewButton;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public SuppliersPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void containsValueCountryDropdown(String expectedCountry) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Country, expectedCountry);
	}
	
	public void containsValueTopRowDataCity(String expectedCity) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopCity, expectedCity);
	}
	
	public void containsValueTopRowDataCountry(String expectedCountry) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopCountry, expectedCountry);
	}
	
	public void containsValueTopRowDataId(String expectedId) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopId, expectedId);
	}
	
	public void containsValueTopRowDataName(String expectedName) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopName, expectedName);
	}
	
	public void containsValueTopRowDataStatus(String expectedStatus) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopStatus, expectedStatus);
	}
	
	public void containsValueTopRowDataThirdParty(String expectedThirdParty) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopThirdParty, expectedThirdParty);
	}
	
	public void displayedTopRowDataCopyButton() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopCopyButton);
	}
	
	public void displayedTopRowDataEditButton() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopEditButton);
	}
	
	public void displayedTopRowDataViewButton() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopViewButton);
	}
	
	public void hiddenAddNewSupplierButton() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//a[contains(@id, 'CreateNewSupplierLinkButton')]");
	}
	
	public void hiddenTopRowDataCopyButton() throws Exception {
		CommonFunctions.elementNotExistingByXPath("(//a[@title = 'Copy'])[1]");
	}
	
	public void hiddenTopRowDataEditButton() throws Exception {
		CommonFunctions.elementNotExistingByXPath("(//a[@title = 'Edit'])[1]");
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
	
	public SupplierDetailsPage clickAddNewSupplierButton() throws Exception {
		CommonFunctions.clickElement(button_AddNewSupplier);
		
		return new SupplierDetailsPage();
	}
	
	public SupplierDetailsPage clickFindButton() throws Exception {
		CommonFunctions.clickElement(button_Find);
		
		return new SupplierDetailsPage();
	}
	
	public SupplierDetailsPage clickTopRowDataCopyButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopCopyButton);
		
		return new SupplierDetailsPage();
	}
	
	public SupplierDetailsPage clickTopRowDataEditButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopEditButton);
		
		return new SupplierDetailsPage();
	}
	
	public SupplierDetailsPage clickTopRowDataViewButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopViewButton);
		
		return new SupplierDetailsPage();
	}
	// End - Actions
}