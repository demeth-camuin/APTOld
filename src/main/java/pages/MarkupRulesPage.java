package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class MarkupRulesPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//a[contains(@id, 'AddIteneraryLink')]")
	WebElement button_AddNewMarkupRule;
	
	@FindBy(xpath = "//a[contains(@id, 'Find')]")
	WebElement button_Find;
	
	@FindBy(xpath = "//input[@value = 'Reset']")
	WebElement button_Reset;
	
	@FindBy(xpath = "//label[text() = 'Include Inactive']//parent::div//parent::div//input")
	WebElement checkbox_Inactive;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Airline']")
	WebElement columnHeader_Airline;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Cabin Class']")
	WebElement columnHeader_CabinClass;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Customer Market']")
	WebElement columnHeader_CustomerMarket;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Fare Basis Code']")
	WebElement columnHeader_FareBasisCode;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Fare Type']")
	WebElement columnHeader_FareType;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Itinerary Type']")
	WebElement columnHeader_ItineraryType;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Source']")
	WebElement columnHeader_Source;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Status']")
	WebElement columnHeader_Status;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Tour Destination']")
	WebElement columnHeader_TourDestination;
	
	@FindBy(xpath = "//label[text() = 'Airline']//parent::div//button")
	WebElement dropdown_Airline;
	
	@FindBy(xpath = "//label[text() = 'Cabin Class']//parent::div//button")
	WebElement dropdown_CabinClass;
	
	@FindBy(xpath = "//label[text() = 'Customer Market']//parent::div//button")
	WebElement dropdown_CustomerMarket;
	
	@FindBy(xpath = "//label[text() = 'Fare Type']//parent::div//button")
	WebElement dropdown_FareType;
	
	@FindBy(xpath = "//label[text() = 'Itinerary Type']//parent::div//button")
	WebElement dropdown_ItineraryType;
	
	@FindBy(xpath = "//select[contains(@id, 'SourceCombo')]")
	WebElement dropdown_Source;
	
	@FindBy(xpath = "//label[text() = 'Tour Destination']//parent::div//button")
	WebElement dropdown_TourDestination;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Airline']//following-sibling::div//input")
	WebElement input_AirlineFilter;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Cabin Class']//following-sibling::div//input")
	WebElement input_CabinClassFilter;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Customer Market']//following-sibling::div//input")
	WebElement input_CustomerMarketFilter;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Fare Basis Code']//following-sibling::div//input")
	WebElement input_FareBasisCodeFilter;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Fare Type']//following-sibling::div//input")
	WebElement input_FareTypeFilter;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Itinerary Type']//following-sibling::div//input")
	WebElement input_ItineraryTypeFilter;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Source']//following-sibling::div//input")
	WebElement input_SourceFilter;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Status']//following-sibling::div//input")
	WebElement input_StatusFilter;
	
	@FindBy(xpath = "//table//thead//th//a[text() = 'Tour Destination']//following-sibling::div//input")
	WebElement input_TourDestinationFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'CostFareBasisInput')]")
	WebElement input_FareBasicCode;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[2]")
	WebElement rowData_TopAirline;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[6]")
	WebElement rowData_TopCabinClass;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[1]//a[@title = 'Copy']")
	WebElement rowData_TopCopyButton;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[4]")
	WebElement rowData_TopCustomerMarket;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[1]//a[@title = 'Delete']")
	WebElement rowData_TopDeleteButton;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[1]//a[@title = 'Edit']")
	WebElement rowData_TopEditButton;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[9]")
	WebElement rowData_TopFareBasisCode;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[7]")
	WebElement rowData_TopFareType;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[8]")
	WebElement rowData_TopItineraryType;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[5]")
	WebElement rowData_TopSource;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[10]")
	WebElement rowData_TopStatus;
	
	@FindBy(xpath = "((//table//tbody//tr)[1]//td)[3]")
	WebElement rowData_TopTourDestination;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public MarkupRulesPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void clickAirlineDropdownOption(String airlineDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Airline);
		CommonFunctions.clickElement(dropdown_TourDestination);
		CommonFunctions.clickElement(dropdown_Airline);
		
		if (airlineDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_Airline.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_Airline.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), airlineDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_Airline.findElement(By.xpath(".//parent::div//ul//span[contains(text(), '" + airlineDropdownOptionValue + "')]")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickCabinClassDropdownOption(String cabinClassDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CabinClass);
		
		if (cabinClassDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_CabinClass.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_CabinClass.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), cabinClassDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_CabinClass.findElement(By.xpath(".//parent::div//ul//span[text() = '" + cabinClassDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickCustomerMarketDropdownOption(String customerMarketDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerMarket);
		
		if (customerMarketDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_CustomerMarket.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_CustomerMarket.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), customerMarketDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_CustomerMarket.findElement(By.xpath(".//parent::div//ul//span[text() = '" + customerMarketDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickFareTypeDropdownOption(String fareTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_FareType);
		
		if (fareTypeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_FareType.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_FareType.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), fareTypeDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_FareType.findElement(By.xpath(".//parent::div//ul//span[text() = '" + fareTypeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickFindButton() throws Exception {
		CommonFunctions.clickElement(button_Find);
		CommonFunctions.pause(15000, false);
	}
	
	public void clickInactiveCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_Inactive);
	}
	
	public void clickItineraryTypeDropdownOption(String itineraryTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ItineraryType);
		
		if (itineraryTypeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_ItineraryType.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_ItineraryType.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), itineraryTypeDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_ItineraryType.findElement(By.xpath(".//parent::div//ul//span[text() = '" + itineraryTypeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickResetButton() throws Exception {
		CommonFunctions.clickElement(button_Reset);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickTopDeleteButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopDeleteButton);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickTourDestinationDropdownOption(String tourDestinationDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_TourDestination);
		CommonFunctions.clickElement(dropdown_CustomerMarket);
		CommonFunctions.clickElement(dropdown_TourDestination);
		
		if (tourDestinationDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_TourDestination.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_TourDestination.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), tourDestinationDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_TourDestination.findElement(By.xpath(".//parent::div//ul//span[text() = '" + tourDestinationDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void containsValueTopAirlineRowData(String expectedAirline) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopAirline, expectedAirline);
	}
	
	public void displayedAddNewMarkupRuleButton() throws Exception {
		CommonFunctions.elementDisplayed(button_AddNewMarkupRule);
	}
	
	public void displayedAirlineColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_Airline);
	}
	
	public void displayedAirlineDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Airline);
	}
	
	public void displayedAirlineFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AirlineFilter);
	}
	
	public void displayedCabinClassColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_CabinClass);
	}
	
	public void displayedCabinClassDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_CabinClass);
	}
	
	public void displayedCabinClassFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_CabinClassFilter);
	}
	
	public void displayedCustomerMarketColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_CustomerMarket);
	}
	
	public void displayedCustomerMarketDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_CustomerMarket);
	}
	
	public void displayedCustomerMarketFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_CustomerMarketFilter);
	}
	
	public void displayedFareBasicCodeColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_FareBasisCode);
	}
	
	public void displayedFareBasisCodeFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_FareBasisCodeFilter);
	}
	
	public void displayedFareBasicCodeInput() throws Exception {
		CommonFunctions.elementDisplayed(input_FareBasicCode);
	}
	
	public void displayedFareTypeColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_FareType);
	}
	
	public void displayedFareTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_FareType);
	}
	
	public void displayedFareTypeFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_FareTypeFilter);
	}
	
	public void displayedFindButton() throws Exception {
		CommonFunctions.elementDisplayed(button_Find);
	}
	
	public void displayedInactiveCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_Inactive);
	}
	
	public void displayedItineraryTypeColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_ItineraryType);
	}
	
	public void displayedItineraryTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ItineraryType);
	}
	
	public void displayedItineraryTypeFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ItineraryTypeFilter);
	}
	
	public void displayedResetButton() throws Exception {
		CommonFunctions.elementDisplayed(button_Reset);
	}
	
	public void displayedSourceColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_Source);
	}
	
	public void displayedSourceDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Source);
	}
	
	public void displayedSourceFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_SourceFilter);
	}
	
	public void displayedStatusColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_Status);
	}
	
	public void displayedStatusFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_StatusFilter);
	}
	
	public void displayedTopAirlineRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopAirline);
	}
	
	public void displayedTopCabinClassRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopCabinClass);
	}
	
	public void displayedTopCopyButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopCopyButton);
	}
	
	public void displayedTopCustomerMarketRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopCustomerMarket);
	}
	
	public void displayedTopDeleteButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopDeleteButton);
	}
	
	public void displayedTopEditButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopEditButton);
	}
	
	public void displayedTopFareBasisCodeRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopFareBasisCode);
	}
	
	public void displayedTopFareTypeRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopFareType);
	}
	
	public void displayedTopItineraryTypeRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopItineraryType);
	}
	
	public void displayedTopSourceRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopSource);
	}
	
	public void displayedTopStatusRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopStatus);
	}
	
	public void displayedTopTourDestinationRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopTourDestination);
	}
	
	public void displayedTourDestinationColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_TourDestination);
	}
	
	public void displayedTourDestinationDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_TourDestination);
	}
	
	public void displayedTourDestinationFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_TourDestinationFilter);
	}
	
	public void setAirlineFilterInput(String airlineFilter) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AirlineFilter, airlineFilter);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setStatusFilterInput(String statusFilter) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_StatusFilter, statusFilter);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public MarkupRuleDetailsPage clickAddNewMarkupRuleButton() throws Exception {
		CommonFunctions.clickElement(button_AddNewMarkupRule);
		
		return new MarkupRuleDetailsPage();
	}
	
	public MarkupRuleDetailsPage clickTopCopyButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopCopyButton);
		
		return new MarkupRuleDetailsPage();
	}
	
	public MarkupRuleDetailsPage clickTopEditButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopEditButton);
		
		return new MarkupRuleDetailsPage();
	}
	// End - Actions
}