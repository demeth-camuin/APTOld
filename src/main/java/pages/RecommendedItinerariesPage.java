package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class RecommendedItinerariesPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//a[text() = 'Add New Itinerary']")
	WebElement button_AddNewItinerary;
	
	@FindBy(xpath = "//a[contains(@id, 'Find')]")
	WebElement button_Find;
	
	@FindBy(xpath = "//a[contains(@id, 'ResetButton')]")
	WebElement button_Reset;
	
	@FindBy(xpath = "//input[contains(@id, 'StatusCheckbox')]")
	WebElement checkbox_Inactive;
	
	@FindBy(xpath = "//input[contains(@id, 'PackageSpecificCheckbox')]")
	WebElement checkbox_IncludePackageSpecificRule;
	
	@FindBy(xpath = "//div[contains(@id, 'CustomerMarketContainer')]//button")
	WebElement dropdown_CustomerMarket;
	
	@FindBy(xpath = "//a[@class = 'RowOptionLink']")
	WebElement dropdown_Rows;
	
	@FindBy(xpath = "//div[contains(@id, 'TourCodeContainer')]//button")
	WebElement dropdown_TourCode;
	
	@FindBy(xpath = "//a[text()= 'Customer Market']//parent::div//following-sibling::input")
	WebElement input_CustomerMarketFilter;
	
	@FindBy(xpath = "//label[text() = 'Departure Date From']//following-sibling::input")
	WebElement input_DepartureDateFrom;
	
	@FindBy(xpath = "//label[text() = 'Departure Date To']//following-sibling::input")
	WebElement input_DepartureDateTo;
	
	@FindBy(xpath = "//label[text() = 'Itinerary Name']//following-sibling::input")
	WebElement input_ItineraryName;
	
	@FindBy(xpath = "//a[text()= 'Itinerary Name']//parent::div//following-sibling::input")
	WebElement input_ItineraryNameFilter;
	
	@FindBy(xpath = "//a[text()= 'Status']//parent::div//following-sibling::input")
	WebElement input_StatusFilter;
	
	@FindBy(xpath = "//a[text()= 'Tour Code']//parent::div//following-sibling::input")
	WebElement input_TourCodeFilter;
	
	@FindBy(xpath = "((//table[contains(@id, 'RecInineraryTableRecords')]//tbody//tr)[1]//td)[1]//a[@title = 'Copy']")
	WebElement rowData_TopCopyButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'RecInineraryTableRecords')]//tbody//tr)[1]//td)[4]")
	WebElement rowData_TopCustomerMarket;
	
	@FindBy(xpath = "((//table[contains(@id, 'RecInineraryTableRecords')]//tbody//tr)[1]//td)[1]//a[@title = 'Delete']")
	WebElement rowData_TopDeleteButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'RecInineraryTableRecords')]//tbody//tr)[1]//td)[1]//a[@title = 'Edit']")
	WebElement rowData_TopEditButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'RecInineraryTableRecords')]//tbody//tr)[1]//td)[3]")
	WebElement rowData_TopItineraryName;
	
	@FindBy(xpath = "((//table[contains(@id, 'RecInineraryTableRecords')]//tbody//tr)[1]//td)[5]")
	WebElement rowData_TopStatus;
	
	@FindBy(xpath = "((//table[contains(@id, 'RecInineraryTableRecords')]//tbody//tr)[1]//td)[2]")
	WebElement rowData_TopTourCode;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public RecommendedItinerariesPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void checkIncludePackageSpecificRuleIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_IncludePackageSpecificRule);
	}
	
	public void clickCustomerMarketDropdownOption(String customerMarketDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerMarket);
		CommonFunctions.pause(5000, false);
		
		if (customerMarketDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_CustomerMarket.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_CustomerMarket.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), customerMarketDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_CustomerMarket.findElement(By.xpath(".//parent::div//ul//span[text() = '" + customerMarketDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickFindButton() throws Exception {
		CommonFunctions.clickElement(button_Find);
		CommonFunctions.pause(15000, false);
	}
	
	public void clickInactiveCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_Inactive);
	}
	
	public void clickResetButton() throws Exception {
		CommonFunctions.clickElement(button_Reset);
		CommonFunctions.pause(15000, false);
	}
	
	public void clickTopDeleteButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopDeleteButton);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickTourCodeDropdownOption(String tourCodeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_TourCode);
		CommonFunctions.pause(5000, false);
		
		if (tourCodeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_TourCode.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_TourCode.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), tourCodeDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_TourCode.findElement(By.xpath(".//parent::div//ul//span[text() = '" + tourCodeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickIncludePackageSpecificRuleCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_IncludePackageSpecificRule);
	}
	
	public void containsValueTopCustomerMarketRowData(String expectedCustomerMarket) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopCustomerMarket, expectedCustomerMarket);
	}
	
	public void containsValueTopItineraryNameRowData(String expectedItineraryName) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopItineraryName, expectedItineraryName);
	}
	
	public void containsValueTopStatusRowData(String expectedStatus) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopStatus, expectedStatus);
	}
	
	public void containsValueTopTourCodeRowData(String expectedTourCode) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopTourCode, expectedTourCode);
	}
	
	public void containsValueRowsDropdown(String expectedRows) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Rows, expectedRows);
	}
	
	public void disabledFindButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_Find, "disabled", "true");
	}
	
	public void displayedAddNewItineraryButton() throws Exception {
		CommonFunctions.elementDisplayed(button_AddNewItinerary);
	}
	
	public void displayedCustomerMarketDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_CustomerMarket);
	}
	
	public void displayedCustomerMarketFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_CustomerMarketFilter);
	}
	
	public void displayedDepartureDateFromInput() throws Exception {
		CommonFunctions.elementDisplayed(input_DepartureDateFrom);
	}
	
	public void displayedDepartureDateToInput() throws Exception {
		CommonFunctions.elementDisplayed(input_DepartureDateTo);
	}
	
	public void displayedFindButton() throws Exception {
		CommonFunctions.elementDisplayed(button_Find);
	}
	
	public void displayedItineraryNameInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ItineraryName);
	}
	
	public void displayedItineraryNameFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ItineraryNameFilter);
	}
	
	public void displayedResetButton() throws Exception {
		CommonFunctions.elementDisplayed(button_Reset);
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
	
	public void displayedTopItineraryNameRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopItineraryName);
	}
	
	public void displayedTopStatusRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopStatus);
	}
	
	public void displayedTopTourCodeRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopTourCode);
	}
	
	public void displayedTourCodeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_TourCode);
	}
	
	public void displayedStatusFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_StatusFilter);
	}
	
	public void displayedTourCodeFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_TourCodeFilter);
	}
	
	public void setDepartureDateFromInput(String departureDateFrom) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_DepartureDateFrom, departureDateFrom);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setDepartureDateToInput(String departureDateTo) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_DepartureDateTo, departureDateTo);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setCustomerMarketFilterInput(String customerMarketFilter) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CustomerMarketFilter, customerMarketFilter);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setStatusFilterInput(String statusFilter) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_StatusFilter, statusFilter);
	}
	
	public void setTourCodeFilterInput(String tourCodeFilter) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_TourCodeFilter, tourCodeFilter);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public RecommendedItineraryDetailsPage clickAddNewItineraryButton() throws Exception {
		CommonFunctions.clickElement(button_AddNewItinerary);
		
		return new RecommendedItineraryDetailsPage();
	}
	
	public RecommendedItineraryDetailsPage clickTopCopyButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopCopyButton);
		
		return new RecommendedItineraryDetailsPage();
	}
	
	public RecommendedItineraryDetailsPage clickTopEditButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopEditButton);
		
		return new RecommendedItineraryDetailsPage();
	}
	// End - Actions
}