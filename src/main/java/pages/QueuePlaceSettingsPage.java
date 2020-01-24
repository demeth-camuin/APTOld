package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class QueuePlaceSettingsPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//a[contains(@id, 'link_AddQueue')]")
	WebElement button_AddNewQueuePlaceRule;
	
	@FindBy(xpath = "//img[contains(@src, 'last')]//parent::a")
	WebElement button_PaginationSection_Last;
	
	@FindBy(xpath = "//img[contains(@src, 'next')]//parent::a")
	WebElement button_PaginationSection_Next;
	
	@FindBy(xpath = "//div[text() = 'Exclude Inactive Rules']//parent::div//input")
	WebElement checkbox_ExcludeInactiveRules;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Customer Market']")
	WebElement columnHeader_CustomerMarket;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Customer Type']")
	WebElement columnHeader_CustomerType;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Flight Action']")
	WebElement columnHeader_FlightAction;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Flight Type']")
	WebElement columnHeader_FlightType;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'GDS Queue Number']")
	WebElement columnHeader_GDSQueueNumber;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Setting Name']")
	WebElement columnHeader_SettingName;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Status']")
	WebElement columnHeader_Status;
	
	@FindBy(xpath = "//a[@class = 'RowOptionLink']")
	WebElement dropdown_PaginationSection_Rows;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Customer Market']//ancestor::th//input")
	WebElement input_CustomerMarketFilter;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Customer Type']//ancestor::th//input")
	WebElement input_CustomerTypeFilter;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Flight Action']//ancestor::th//input")
	WebElement input_FlightActionFilter;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Flight Type']//ancestor::th//input")
	WebElement input_FlightTypeFilter;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'GDS Queue Number']//ancestor::th//input")
	WebElement input_GDSQueueNumberFilter;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Setting Name']//ancestor::th//input")
	WebElement input_QueueNameFilter;
	
	@FindBy(xpath = "//table[contains(@id, 'QueuePlaceSetting')]//thead//a[text() = 'Status']//ancestor::th//input")
	WebElement input_StatusFilter;
	
	@FindBy(xpath = "((//table[contains(@id, 'QueuePlaceSetting')]//tbody//tr)[1]//td)[1]//a[@title = 'Copy']")
	WebElement rowData_TopCopyButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'QueuePlaceSetting')]//tbody//tr)[1]//td)[6]")
	WebElement rowData_TopCustomerMarket;
	
	@FindBy(xpath = "((//table[contains(@id, 'QueuePlaceSetting')]//tbody//tr)[1]//td)[7]")
	WebElement rowData_TopCustomerType;
	
	@FindBy(xpath = "((//table[contains(@id, 'QueuePlaceSetting')]//tbody//tr)[1]//td)[1]//a[@title = 'Delete']")
	WebElement rowData_TopDeleteButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'QueuePlaceSetting')]//tbody//tr)[1]//td)[1]//a[@title = 'Edit']")
	WebElement rowData_TopEditButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'QueuePlaceSetting')]//tbody//tr)[1]//td)[4]")
	WebElement rowData_TopFlightAction;
	
	@FindBy(xpath = "((//table[contains(@id, 'QueuePlaceSetting')]//tbody//tr)[1]//td)[3]")
	WebElement rowData_TopFlightType;
	
	@FindBy(xpath = "((//table[contains(@id, 'QueuePlaceSetting')]//tbody//tr)[1]//td)[5]")
	WebElement rowData_TopGDSQueueName;
	
	@FindBy(xpath = "((//table[contains(@id, 'QueuePlaceSetting')]//tbody//tr)[1]//td)[2]")
	WebElement rowData_TopQueueName;
	
	@FindBy(xpath = "((//table[contains(@id, 'QueuePlaceSetting')]//tbody//tr)[1]//td)[8]")
	WebElement rowData_TopStatus;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public QueuePlaceSettingsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void clickExcludeInactiveRulesCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_ExcludeInactiveRules);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickTopDeleteButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopDeleteButton);
		CommonFunctions.pause(5000, false);
	}
	
	public void containsValuePaginationSectionRowsDropdown(String expectedRows) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaginationSection_Rows, expectedRows);
	}
	
	public void containsValueTopQueueNameRowData(String expectedQueueName) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopQueueName, expectedQueueName);
	}
	
	public void containsValueTopStatusRowData(String expectedStatus) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopStatus, expectedStatus);
	}
	
	public void displayedCustomerMarketColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_CustomerMarket);
	}
	
	public void displayedCustomerMarketFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_CustomerMarketFilter);
	}
	
	public void displayedCustomerTypeColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_CustomerType);
	}
	
	public void displayedCustomerTypeFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_CustomerTypeFilter);
	}
	
	public void displayedExcludeInactiveRulesCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ExcludeInactiveRules);
	}
	
	public void displayedFlightActionColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_FlightAction);
	}
	
	public void displayedFlightActionFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_FlightActionFilter);
	}
	
	public void displayedFlightTypeColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_FlightType);
	}
	
	public void displayedFlightTypeFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_FlightTypeFilter);
	}
	
	public void displayedGDSQueueNumberColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_GDSQueueNumber);
	}
	
	public void displayedGDSQueueNumberFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_GDSQueueNumberFilter);
	}
	
	public void displayedQueueNameFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_QueueNameFilter);
	}
	
	public void displayedSettingNameColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_SettingName);
	}
	
	public void displayedStatusColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_Status);
	}
	
	public void displayedStatusFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_StatusFilter);
	}
	
	public void displayedTopCopyButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopCopyButton);
	}
	
	public void displayedTopCustomerMarketRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopCustomerMarket);
	}
	
	public void displayedTopCustomerTypeRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopCustomerType);
	}
	
	public void displayedTopDeleteButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopDeleteButton);
	}
	
	public void displayedTopEditButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopEditButton);
	}
	
	public void displayedTopFlightActionRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopFlightAction);
	}
	
	public void displayedTopGDSQueueNameRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopGDSQueueName);
	}
	
	public void displayedTopQueueNameRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopQueueName);
	}
	
	public void displayedTopStatusRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopStatus);
	}
	
	public void enabledPaginationSectionLastButton() throws Exception {
		CommonFunctions.elementEnabled(button_PaginationSection_Last);
	}
	
	public void enabledPaginationSectionNextButton() throws Exception {
		CommonFunctions.elementEnabled(button_PaginationSection_Next);
	}
	
	public void enabledPaginationSectionRowsDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_PaginationSection_Rows);
	}
	
	public void setQueueNameFilterInput(String queueNameFilter) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_QueueNameFilter, queueNameFilter);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setStatusFilterInput(String statusFilter) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_StatusFilter, statusFilter);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public QueuePlaceSettingDetailsPage clickAddNewQueuePlaceRuleButton() throws Exception {
		CommonFunctions.clickElement(button_AddNewQueuePlaceRule);
		
		return new QueuePlaceSettingDetailsPage();
	}
	
	public QueuePlaceSettingDetailsPage clickTopCopyButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopCopyButton);
		
		return new QueuePlaceSettingDetailsPage();
	}
	
	public QueuePlaceSettingDetailsPage clickTopEditButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopEditButton);
		
		return new QueuePlaceSettingDetailsPage();
	}
	// End - Actions
}