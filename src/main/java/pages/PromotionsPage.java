package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class PromotionsPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//a[contains(@id, 'CreatePromotionButton')]")
	WebElement button_AddNewPromotion;
	
	@FindBy(xpath = "//a[contains(@id, 'Button_Advance')]")
	WebElement button_AdvancedFilter;
	
	@FindBy(xpath = "//a[contains(@id, 'FindPromotions')]")
	WebElement button_Find;
	
	@FindBy(xpath = "//a[contains(text(), 'Reset')]")
	WebElement button_Reset;
	
	@FindBy(xpath = "//input[contains(@id, 'DepartureDateRangeEnabled')]")
	WebElement checkbox_DepartureDate;
	
	@FindBy(xpath = "//span[text() = 'Classification']")
	WebElement columnHeader_Classification;
	
	@FindBy(xpath = "//span[text() = 'Code']")
	WebElement columnHeader_Code;
	
	@FindBy(xpath = "//span[text() = 'Description']")
	WebElement columnHeader_Description;
	
	@FindBy(xpath = "//span[text() = 'Promotion ID']")
	WebElement columnHeader_Id;
	//
	// @FindBy(xpath = "//span[text() = 'Type']")
	// WebElement columnHeader_Type;
	//
	@FindBy(xpath = "//span[text() = 'Status']")
	WebElement columnHeader_Status;
	
	@FindBy(xpath = "//select[contains(@id, 'Combobox_Allotment')]")
	WebElement dropdown_Allotment;
	
	@FindBy(xpath = "//select[contains(@id, 'Combobox_Applicable')]")
	WebElement dropdown_Assign;
	
	@FindBy(xpath = "//div[contains(@id, 'Brand_Combobox')]")
	WebElement dropdown_Brand;
	
	@FindBy(xpath = "//div[contains(@id, 'PromotionCategory_Combobox')]")
	WebElement dropdown_Category;
	
	@FindBy(xpath = "//div[contains(@id, 'PromotionClassification_Combobox')]")
	WebElement dropdown_Classification;
	
	@FindBy(xpath = "//div[contains(@id, 'Country_Combobox')]")
	WebElement dropdown_Country;
	
	@FindBy(xpath = "//div[contains(@id, 'CustomerMarket_Combobox')]")
	WebElement dropdown_CustomerMarket;
	
	@FindBy(xpath = "//div[contains(@id, 'RevenueAllocation')]//select")
	WebElement dropdown_RevenueAllocation;
	
	@FindBy(xpath = "//div[contains(@id, 'Combobox_States')]")
	WebElement dropdown_State;
	
	@FindBy(xpath = "//div[contains(@id, 'Status')]//select")
	WebElement dropdown_Status;
	
	@FindBy(xpath = "//div[contains(@id, 'Market_Search')]")
	WebElement dropdown_TourMarket;
	
	@FindBy(xpath = "//div[contains(@id, 'PromotionType')]//select")
	WebElement dropdown_Type;
	
	@FindBy(xpath = "//input[contains(@id, 'BookingDateRangeFrom')]")
	WebElement input_BookingDateFrom;
	
	@FindBy(xpath = "//input[contains(@id, 'BookingDateRangeTo')]")
	WebElement input_BookingDateTo;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[5]")
	WebElement input_ClassificationFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_PromotionCode')]")
	WebElement input_Code;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[2]")
	WebElement input_CodeFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'CustomerSearchInput')]")
	WebElement input_Customer;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_DepartureDateFrom')]")
	WebElement input_DepartureDateFrom;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_DepartureRangeTo')]")
	WebElement input_DepartureDateTo;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_PromotionDescription')]")
	WebElement input_Description;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[3]")
	WebElement input_DescriptionFilter;
	
	@FindBy(xpath = "(//input[contains(@id, 'search')])[7]")
	WebElement input_DropdownFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_PromotionID')]")
	WebElement input_Id;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[1]")
	WebElement input_IdFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'PackageSearchInput')]")
	WebElement input_Package;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[5]")
	WebElement input_StatusFilter;
	//
	// @FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[4]")
	// WebElement input_TypeFilter;
	//
	@FindBy(xpath = "(//ul[contains(@role, 'listbox')])[2]")
	WebElement listBox_Customer;
	
	@FindBy(xpath = "(//ul[contains(@role, 'listbox')])[1]")
	WebElement listBox_Package;
	
	@FindBy(xpath = "(//div[@col-id = 'PromoClassification'])[2]")
	WebElement rowData_TopClassification;
	
	@FindBy(xpath = "(//div[@col-id = 'SaleCode'])[2]")
	WebElement rowData_TopCode;
	
	@FindBy(xpath = "(//a[@title = 'Copy'])[1]")
	WebElement rowData_TopCopyButton;
	
	@FindBy(xpath = "(//div[@col-id = 'Description'])[2]")
	WebElement rowData_TopDescription;
	
	@FindBy(xpath = "(//a[@title = 'Edit'])[1]")
	WebElement rowData_TopEditButton;
	
	@FindBy(xpath = "(//div[@col-id = 'PromotionNumber_1'])[2]")
	WebElement rowData_TopId;
	//
	// @FindBy(xpath = "(//div[@col-id = 'PromoType'])[2]")
	// WebElement rowData_TopType;
	//
	@FindBy(xpath = "(//div[@col-id = 'Status'])[2]")
	WebElement rowData_TopStatus;
	
	@FindBy(xpath = "(//a[@title = 'View'])[1]")
	WebElement rowData_TopViewButton;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public PromotionsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void clickAdvancedFilterButton() throws Exception {
		CommonFunctions.clickElement(button_AdvancedFilter);
	}
	
	public void clickAllotmentDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Allotment);
	}
	
	public void clickBrandDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Brand);
	}
	
	public void clickCategoryDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Category);
	}
	
	public void clickClassificationDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Classification);
	}
	
	public void clickClassificationColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Classification);
	}
	
	public void clickCodeColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Code);
	}
	
	public void clickCountryDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Country);
	}
	
	public void clickCustomerMarketDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerMarket);
	}
	
	public void clickDepartureDateCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_DepartureDate);
	}
	
	public void clickDescriptionColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Description);
	}
	
	public void clickFindButton() throws Exception {
		CommonFunctions.clickElement(button_Find);
	}
	
	public void clickIdColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Id);
	}
	
	public void clickResetButton() throws Exception {
		CommonFunctions.clickElement(button_Reset);
	}
	
	public void clickStateDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_State);
	}
	
	public void clickStatusColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_Status);
	}
	
	public void clickTourMarketDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_TourMarket);
	}
	
	//
	// public void clickTypeColumnHeader() throws Exception {
	// CommonFunctions.clickElement(columnHeader_Type);
	// }
	//
	public void containsValueTopRowDataClassification(String expectedClassification) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopClassification, expectedClassification);
	}
	
	public void containsValueTopRowDataCode(String expectedCode) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopCode, expectedCode);
	}
	
	public void containsValueTopRowDataCopyButtonTooltip(String expectedTooltip) throws Exception {
		CommonFunctions.elementTooltip(rowData_TopCopyButton, expectedTooltip);
	}
	
	public void containsValueTopRowDataDescription(String expectedDescription) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopDescription, expectedDescription);
	}
	
	public void containsValueTopRowDataEditButtonTooltip(String expectedTooltip) throws Exception {
		CommonFunctions.elementTooltip(rowData_TopEditButton, expectedTooltip);
	}
	
	public void containsValueTopRowDataId(String expectedId) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopId, expectedId);
	}
	
	public void containsValueTopRowDataStatus(String expectedStatus) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopStatus, expectedStatus);
	}
	
	//
	// public void containsValueTopRowDataType(String expectedType) throws Exception {
	// CommonFunctions.elementContainsText(rowData_TopType, expectedType);
	// }
	//
	public void containsValueTopRowDataViewButtonTooltip(String expectedTooltip) throws Exception {
		CommonFunctions.elementTooltip(rowData_TopViewButton, expectedTooltip);
	}
	
	public void displayedDropdownFilter() throws Exception {
		CommonFunctions.elementDisplayed(input_DropdownFilter);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void doubleClickCustomerInput() throws Exception {
		CommonFunctions.doubleClickOnElement(input_Customer);
	}
	
	public void doubleClickPackageInput() throws Exception {
		CommonFunctions.doubleClickOnElement(input_Package);
	}
	
	public void hiddenCustomerListBox() throws Exception {
		CommonFunctions.elementAttributeContains(listBox_Customer.findElement(By.xpath(".//parent::div")), "class", "display-none");
	}
	
	public void hiddenPackageListBox() throws Exception {
		CommonFunctions.elementAttributeContains(listBox_Package.findElement(By.xpath(".//parent::div")), "class", "display-none");
	}
	
	public void selectCategoryValue(String categoryValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Category);
		CommonFunctions.clearThenEnterElementValue(input_DropdownFilter, categoryValue);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}
	
	public void selectCustomerMarketValue(String customerMarketValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerMarket);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(text(), '" + customerMarketValue + "')]")));
	}
	
	public void selectRevenueAllocationValue(String value) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_RevenueAllocation, value);
	}
	
	public void selectStatusValue(String statusValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Status, statusValue);
	}
	
	public void selectTypeValue(String typeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Type, typeValue);
	}
	
	public void setClassificationFilterInput(String classification) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ClassificationFilter, classification);
	}
	
	public void setCodeFilterInput(String code) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CodeFilter, code);
		CommonFunctions.pause(2500, false);
	}
	
	public void setCodeInput(String code) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Code, code);
	}
	
	public void setDepartureDateFromInput(String departureDateFrom) throws Exception {
		CommonFunctions.clickElement(input_DepartureDateFrom);
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//div[contains(text(), '×')]"));
		CommonFunctions.clearThenEnterElementValue(input_DepartureDateFrom, departureDateFrom);
	}
	
	public void setDepartureDateToInput(String departureDateTo) throws Exception {
		CommonFunctions.clickElement(input_DepartureDateTo);
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//div[contains(text(), '×')]"));
		CommonFunctions.clearThenEnterElementValue(input_DepartureDateTo, departureDateTo);
	}
	
	public void setDescriptionInput(String description) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Description, description);
	}
	
	public void setDescriptionFilterInput(String description) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_DescriptionFilter, description);
	}
	
	public void setIdFilterInput(String id) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_IdFilter, id);
	}
	
	public void setStatusFilterInput(String status) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_StatusFilter, status);
	}
	
	//
	// public void setTypeFilterInput(String type) throws Exception {
	// CommonFunctions.clearThenEnterElementValue(input_TypeFilter, type);
	// }
	//
	public PromotionDetailsPage clickAddNewPromotionButton() throws Exception {
		CommonFunctions.clickElement(button_AddNewPromotion);
		CommonFunctions.pause(10000, false);
		
		return new PromotionDetailsPage();
	}
	
	public PromotionDetailsPage clickTopRowDataCopyButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopCopyButton);
		
		return new PromotionDetailsPage();
	}
	
	public PromotionDetailsPage clickTopRowDataEditButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopEditButton);
		
		return new PromotionDetailsPage();
	}
	
	public PromotionDetailsPage clickTopRowDataViewButton() throws Exception {
		CommonFunctions.clickElement(rowData_TopViewButton);
		
		return new PromotionDetailsPage();
	}
	// End - Actions
}