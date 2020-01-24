package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class CommissionRulesDetailsPage extends Base {
	// Start - Page Objects
	// Start - Main Page Objects
	@FindBy(xpath = "//div[contains(@id, 'Title') and contains(text(), 'Commission Dates')]")
	WebElement accordion_CommissionDates;
	
	@FindBy(xpath = "//div[contains(@id, 'Title') and contains(text(), 'Packages and Contracts')]")
	WebElement accordion_PackagesAndContracts;
	
	@FindBy(xpath = "//input[contains(@id, 'CloseBottomButton')]")
	WebElement button_BottomClose;
	
	@FindBy(xpath = "//input[contains(@id, 'SaveAltBottom')]")
	WebElement button_BottomSave;
	
	@FindBy(xpath = "//input[contains(@id, 'AddContract_Button')]")
	WebElement button_PackagesAndContractsSection_AddContract;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractTypesOption')]//following-sibling::div[contains(@id, 'ContractsOption')]")
	WebElement button_PackagesAndContractsSection_Contracts;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractTypesOption')]")
	WebElement button_PackagesAndContractsSection_ContractTypes;
	
	@FindBy(xpath = "//div[contains(@id, 'PackageOption')]")
	WebElement button_PackagesAndContractsSection_Packages;
	
	@FindBy(xpath = "(//input[contains(@value, 'Close')])[2]")
	WebElement button_ViewBottomClose;
	
	@FindBy(xpath = "//div[contains(@id, 'CustomerMarketContainer')]//button//span")
	WebElement dropdown_CustomerMarket;
	
	@FindBy(xpath = "//select[contains(@id, 'CustomerMarketDropdown')]")
	WebElement dropdown_CustomerMarketUpdate;
	
	@FindBy(xpath = "//div[contains(@id, 'BrandDropdownContainer')]//button//span")
	WebElement dropdown_PackagesAndContractsSection_Brand;
	
	@FindBy(xpath = "//div[contains(@id, 'BrandDropdownContainer')]//a//span[contains(@class, 'chosen')]")
	WebElement dropdown_PackagesAndContractsSection_BrandUpdate;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractTypeContainer')]//button//span")
	WebElement dropdown_PackagesAndContractsSection_ContractType;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractTypeContainer')]//a//span[contains(@class, 'chosen')]")
	WebElement dropdown_PackagesAndContractsSection_ContractTypeUpdate;
	
	@FindBy(xpath = "//div[contains(@id, 'MiscContainer')]//a//span[contains(@class, 'chosen')]")
	WebElement dropdown_PackagesAndContractsSection_MiscellaneousType;
	
	@FindBy(xpath = "//div[contains(@id, 'PackageTypeContainer')]//button//span")
	WebElement dropdown_PackagesAndContractsSection_PackageType;
	
	@FindBy(xpath = "//div[contains(@id, 'PackageTypeContainer')]//a//span[contains(@class, 'chosen')]")
	WebElement dropdown_PackagesAndContractsSection_PackageTypeUpdate;
	
	@FindBy(xpath = "//div[contains(@id, 'TourClassificationDropdownContainer')]//button//span")
	WebElement dropdown_PackagesAndContractsSection_TourClassification;
	
	@FindBy(xpath = "//div[contains(@id, 'TourClassificationDropdownContainer')]//a//span[contains(@class, 'chosen')]")
	WebElement dropdown_PackagesAndContractsSection_TourClassificationUpdate;
	
	@FindBy(xpath = "//div[contains(@id, 'TourMarketDropdownContainer')]//button//span")
	WebElement dropdown_PackagesAndContractsSection_TourMarket;
	
	@FindBy(xpath = "//div[contains(@id, 'TourMarketDropdownContainer')]//a//span[contains(@class, 'chosen')]")
	WebElement dropdown_PackagesAndContractsSection_TourMarketUpdate;
	
	@FindBy(xpath = "//div[contains(@id, 'SalesSourceDropdownContainer')]//button//span")
	WebElement dropdown_SalesSource;
	
	@FindBy(xpath = "//select[contains(@id, 'SalesSourceDropdown')]")
	WebElement dropdown_SalesSourceUpdate;
	
	@FindBy(xpath = "//input[contains(@id, 'bookfromDateInput')]")
	WebElement input_CommissionDatesSection_BookingFromDate;
	
	@FindBy(xpath = "//input[contains(@id, 'booktodateInput')]")
	WebElement input_CommissionDatesSection_BookingToDate;
	
	@FindBy(xpath = "//input[contains(@id, 'departfromInput')]")
	WebElement input_CommissionDatesSection_DepartureFromDate;
	
	@FindBy(xpath = "//input[contains(@id, 'departtoDateInput')]")
	WebElement input_CommissionDatesSection_DepartureToDate;
	
	@FindBy(xpath = "//input[contains(@id, 'CommissionRateInput')]")
	WebElement input_CommissionRate;
	
	@FindBy(xpath = "//table[contains(@id, 'Contracts_TableRecords')]")
	WebElement table_PackagesAndContractsSection_Contracts;
	// End - Main Page Objects
	
	// Start - Add Contract Popup Objects
	@FindBy(xpath = "//div[contains(@id, 'ActionContainer')]//input[contains(@id, 'AddContract_Button')]")
	WebElement button_AddContractPopup_AddContract;
	
	@FindBy(xpath = "//input[contains(@id, 'SearchContracts_Button')]")
	WebElement button_AddContractPopup_SearchContracts;
	
	@FindBy(xpath = "//div[contains(@id, 'MiscType_Container')]//a//span[contains(@class, 'chosen')]")
	WebElement dropdown_AddContractPopup_MiscellaneousType;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractStatus_Container')]//button//span")
	WebElement dropdown_AddContractPopup_Status;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractType_Container')]//a//span[contains(@class, 'chosen')]")
	WebElement dropdown_AddContractPopup_Type;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractID_Input')]")
	WebElement input_AddContractPopup_Id;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractName_Input')]")
	WebElement input_AddContractPopup_Name;
	
	@FindBy(xpath = "//input[contains(@id, 'SupplierName_Input')]")
	WebElement input_AddContractPopup_SupplierName;
	
	@FindBy(xpath = "(//form[contains(@action, 'ContractPopup')]//div[contains(@col-id, '0')])[2]")
	WebElement rowData_AddContractPopup_TopCheckBox;
	// End - Add Contract Popup Objects
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public CommissionRulesDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	// Start - Main Page Actions
	public void clickCommissionDatesAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_CommissionDates);
	}
	
	public void clickCommissionRateInput() throws Exception {
		CommonFunctions.clickElement(input_CommissionRate);
	}
	
	public void clickCustomerMarketDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerMarket);
	}
	
	public void clickPackagesAndContractsAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_PackagesAndContracts);
		CommonFunctions.pause(1000, false);
	}
	
	public void clickPackagesAndContractsSectionAddContractButton() throws Exception {
		CommonFunctions.clickElement(button_PackagesAndContractsSection_AddContract);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Search for a contract']");
	}
	
	public void clickPackagesAndContractsSectionBrandDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_Brand);
	}
	
	public void clickPackagesAndContractsSectionBrandUpdateDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_BrandUpdate);
	}
	
	public void clickPackagesAndContractsSectionContractsButton() throws Exception {
		CommonFunctions.clickElement(button_PackagesAndContractsSection_Contracts);
	}
	
	public void clickPackagesAndContractsSectionContractTypeDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_ContractType);
	}
	
	public void clickPackagesAndContractsSectionContractTypesButton() throws Exception {
		CommonFunctions.clickElement(button_PackagesAndContractsSection_ContractTypes);
	}
	
	public void clickPackagesAndContractsSectionContractTypeUpdateDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_ContractTypeUpdate);
	}
	
	public void clickPackagesAndContractsSectionMiscellaneousTypeDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_MiscellaneousType);
	}
	
	public void clickPackagesAndContractsSectionPackagesButton() throws Exception {
		CommonFunctions.clickElement(button_PackagesAndContractsSection_Packages);
	}
	
	public void clickPackagesAndContractsSectionPackageTypeDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_PackageType);
	}
	
	public void clickPackagesAndContractsSectionPackageTypeUpdateDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_PackageTypeUpdate);
	}
	
	public void clickPackagesAndContractsSectionTourClassificationDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_TourClassification);
	}
	
	public void clickPackagesAndContractsSectionTourClassificationUpdateDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_TourClassificationUpdate);
	}
	
	public void clickPackagesAndContractsSectionTourMarketDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_TourMarket);
	}
	
	public void clickPackagesAndContractsSectionTourMarketUpdateDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackagesAndContractsSection_TourMarketUpdate);
	}
	
	public void clickSalesSourceDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_SalesSource);
	}
	
	public void containsValueCommissionDatesSectionBookingFromDateInput(String expectedBookingFromDate) throws Exception {
		if (expectedBookingFromDate == "" || expectedBookingFromDate != null) {
			CommonFunctions.elementAttributeContains(input_CommissionDatesSection_BookingFromDate, "value", expectedBookingFromDate);
		}
		else {
			CommonFunctions.elementAttributeDoesNotEqualsTo(input_CommissionDatesSection_BookingFromDate, "value", "");
		}
		
	}
	
	public void containsValueCommissionDatesSectionBookingToDateInput(String expectedBookingToDate) throws Exception {
		if (expectedBookingToDate == "" || expectedBookingToDate != null) {
			CommonFunctions.elementAttributeContains(input_CommissionDatesSection_BookingToDate, "value", expectedBookingToDate);
		}
		else {
			CommonFunctions.elementAttributeDoesNotEqualsTo(input_CommissionDatesSection_BookingToDate, "value", "");
		}
	}
	
	public void containsValueCommissionDatesSectionDepartureFromDateInput(String expectedDepartureFromDate) throws Exception {
		if (expectedDepartureFromDate == "" || expectedDepartureFromDate != null) {
			CommonFunctions.elementAttributeContains(input_CommissionDatesSection_DepartureFromDate, "value", expectedDepartureFromDate);
		}
		else {
			CommonFunctions.elementAttributeDoesNotEqualsTo(input_CommissionDatesSection_DepartureFromDate, "value", "");
		}
	}
	
	public void containsValueCommissionDatesSectionDepartureToDateInput(String expectedDepartureToDate) throws Exception {
		if (expectedDepartureToDate == "" || expectedDepartureToDate != null) {
			CommonFunctions.elementAttributeContains(input_CommissionDatesSection_DepartureToDate, "value", expectedDepartureToDate);
		}
		else {
			CommonFunctions.elementAttributeDoesNotEqualsTo(input_CommissionDatesSection_DepartureToDate, "value", "");
		}
	}
	
	public void containsValueCommissionRateInput(String expectedCommissionRate) throws Exception {
		CommonFunctions.elementContainsText(input_CommissionRate, expectedCommissionRate);
	}
	
	public void containsValueCustomerMarketDropdown(String expectedCustomerMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerMarket, expectedCustomerMarket);
	}
	
	public void containsValueCustomerMarketUpdateDropdown(String expectedCustomerMarketUpdate) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerMarketUpdate, expectedCustomerMarketUpdate);
	}
	
	public void containsValuePackagesAndContractsSectionBrandDropdown(String expectedBrand) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_Brand, expectedBrand);
	}
	
	public void containsValuePackagesAndContractsSectionBrandUpdateDropdown(String expectedBrandUpdate) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_BrandUpdate, expectedBrandUpdate);
	}
	
	public void containsValuePackagesAndContractsSectionContractTypeDropdown(String expectedContractType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_ContractType, expectedContractType);
	}
	
	public void containsValuePackagesAndContractsSectionContractTypeUpdateDropdown(String expectedContractTypeUpdate) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_ContractTypeUpdate, expectedContractTypeUpdate);
	}
	
	public void containsValuePackagesAndContractsSectionMiscellaneousTypeDropdown(String expectedMiscellaneousType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_MiscellaneousType, expectedMiscellaneousType);
	}
	
	public void containsValuePackagesAndContractsSectionPackageTypeDropdown(String expectedPackageType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_PackageType, expectedPackageType);
	}
	
	public void containsValuePackagesAndContractsSectionPackageTypeUpdateDropdown(String expectedPackageTypeUpdate) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_PackageTypeUpdate, expectedPackageTypeUpdate);
	}
	
	public void containsValuePackagesAndContractsSectionTourClassificationDropdown(String expectedTourClassification) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_TourClassification, expectedTourClassification);
	}
	
	public void containsValuePackagesAndContractsSectionTourClassificationUpdateDropdown(String expectedTourClassificationUpdate) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_TourClassificationUpdate, expectedTourClassificationUpdate);
	}
	
	public void containsValuePackagesAndContractsSectionTourMarketDropdown(String expectedTourMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_TourMarket, expectedTourMarket);
	}
	
	public void containsValuePackagesAndContractsSectionTourMarketUpdateDropdown(String expectedTourMarketUpdate) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagesAndContractsSection_TourMarketUpdate, expectedTourMarketUpdate);
	}
	
	public void containsValueSalesSourceDropdown(String expectedSalesSource) throws Exception {
		CommonFunctions.elementContainsText(dropdown_SalesSource, expectedSalesSource);
	}
	
	public void containsValueSalesSourceUpdateDropdown(String expectedSalesSourceUpdate) throws Exception {
		CommonFunctions.elementContainsText(dropdown_SalesSourceUpdate, expectedSalesSourceUpdate);
	}
	
	public void displayedCommissionDatesAccordion() throws Exception {
		CommonFunctions.elementDisplayed(accordion_CommissionDates);
	}
	
	public void displayedPackagesAndContractsAccordion() throws Exception {
		CommonFunctions.elementDisplayed(accordion_PackagesAndContracts);
	}
	
	public void displayedPackagesAndContractsSectionAddContractButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PackagesAndContractsSection_AddContract);
	}
	
	public void displayedPackagesAndContractsSectionBrandDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PackagesAndContractsSection_Brand);
	}
	
	public void displayedPackagesAndContractsSectionBrandUpdateDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PackagesAndContractsSection_BrandUpdate);
	}
	
	public void displayedPackagesAndContractsSectionContractsButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PackagesAndContractsSection_Contracts);
	}
	
	public void displayedPackagesAndContractsSectionContractTypesButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PackagesAndContractsSection_ContractTypes);
	}
	
	public void displayedPackagesAndContractsSectionContractTypeUpdateDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PackagesAndContractsSection_ContractTypeUpdate);
	}
	
	public void displayedPackagesAndContractsSectionMiscellaneousTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PackagesAndContractsSection_MiscellaneousType);
	}
	
	public void displayedPackagesAndContractsSectionPackagesButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PackagesAndContractsSection_Packages);
	}
	
	public void displayedPackagesAndContractsSectionPackageTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PackagesAndContractsSection_PackageType);
	}
	
	public void displayedPackagesAndContractsSectionPackageTypeUpdateDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PackagesAndContractsSection_PackageTypeUpdate);
	}
	
	public void displayedPackagesAndContractsSectionTourClassificationDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PackagesAndContractsSection_TourClassification);
	}
	
	public void displayedPackagesAndContractsSectionTourClassificationUpdateDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PackagesAndContractsSection_TourClassificationUpdate);
	}
	
	public void displayedPackagesAndContractsSectionTourMarketDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PackagesAndContractsSection_TourMarket);
	}
	
	public void displayedPackagesAndContractsSectionTourMarketUpdateDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PackagesAndContractsSection_TourMarketUpdate);
	}
	
	public void displayedPackagesAndContractsSectionContractsTable() throws Exception {
		CommonFunctions.elementDisplayed(table_PackagesAndContractsSection_Contracts);
	}
	
	public void hiddenPackagesAndContractsSectionMiscellaneousTypeDropdown() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'MiscContainer')]//a//span[contains(@class, 'chosen')]");
	}
	
	public void setCommissionDatesSectionBookingFromDateInput(String bookingFromDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CommissionDatesSection_BookingFromDate, bookingFromDate);
	}
	
	public void setCommissionDatesSectionBookingToDateInput(String bookingToDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CommissionDatesSection_BookingToDate, bookingToDate);
	}
	
	public void setCommissionDatesSectionDepartureFromDateInput(String departureFromDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CommissionDatesSection_DepartureFromDate, departureFromDate);
	}
	
	public void setCommissionDatesSectionDepartureToDateInput(String departureToDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CommissionDatesSection_DepartureToDate, departureToDate);
	}
	
	public void setCommissionRateInput(String commissionRate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CommissionRate, commissionRate);
	}
	
	public CommissionsPage clickBottomCloseButton() throws Exception {
		CommonFunctions.clickElement(button_BottomClose);
		
		return new CommissionsPage();
	}
	
	public CommissionsPage clickBottomSaveButton() throws Exception {
		CommonFunctions.clickElement(button_BottomSave);
		
		return new CommissionsPage();
	}
	
	public CommissionsPage clickViewBottomCloseButton() throws Exception {
		CommonFunctions.clickElement(button_ViewBottomClose);
		
		return new CommissionsPage();
	}
	// End - Main Page Actions
	
	// Start - Add Contract Popup Actions
	public void clickAddContractPopupAddContractButton() throws Exception {
		CommonFunctions.clickElement(button_AddContractPopup_AddContract);
	}
	
	public void clickAddContractPopupSearchContractsButton() throws Exception {
		CommonFunctions.clickElement(button_AddContractPopup_SearchContracts);
	}
	
	public void clickAddContractPopupStatusDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_AddContractPopup_Status);
	}
	
	public void clickAddContractPopupTopCheckBox() throws Exception {
		CommonFunctions.clickElement(rowData_AddContractPopup_TopCheckBox);
	}
	
	public void disabledAddContractPopupMiscellaneousTypeDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//div[contains(@id, 'Miscellaneous_Combobox')]")), "class", "disabled");
	}
	
	public void displayedAddContractPopupIdInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddContractPopup_Id);
	}
	
	public void displayedAddContractPopupNameInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddContractPopup_Name);
	}
	
	public void displayedAddContractPopupStatusDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_AddContractPopup_Status);
	}
	
	public void displayedAddContractPopupSupplierNameInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddContractPopup_SupplierName);
	}
	
	public void displayedAddContractPopupTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_AddContractPopup_Type);
	}
	
	public void enabledAddContractPopupMiscellaneousTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(driver.findElement(By.xpath("//div[contains(@id, 'Miscellaneous_Combobox')]")));
	}
	
	public void selectAddContractPopupTypeValue(String typeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_AddContractPopup_Type);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), typeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectCustomerMarketUpdateValue(String customerMarketUpdateValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_CustomerMarketUpdate, customerMarketUpdateValue);
	}
	
	public void selectSalesSourceUpdateValue(String salesSourceUpdateValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_SalesSourceUpdate, salesSourceUpdateValue);
	}
	
	public void setAddContractPopupNameInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddContractPopup_Name, name);
	}
	
	public void setAddContractPopupSupplierNameInput(String supplierName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddContractPopup_SupplierName, supplierName);
	}
	// End - Add Contract Popup Actions
	// End - Actions
}