package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class TicketingTimeLimitsPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//a[contains(@id, 'AddIteneraryLink')]")
	WebElement button_AddNewTicketingTimeLimit;
	
	@FindBy(xpath = "//div[text() = 'Exclude Inactive Rules']//parent::div//input")
	WebElement checkbox_ExcludeInactiveRules;
	
	@FindBy(xpath = "//a[@class = 'RowOptionLink']")
	WebElement dropdown_Rows;
	
	@FindBy(xpath = "//a[text()= 'Ticketing Name']//parent::div//following-sibling::div//input")
	WebElement input_TicketingNameFilter;
	
	@FindBy(xpath = "((//table[contains(@id, 'TTLTableRecords')]//tbody//tr)[1]//td)[4]")
	WebElement rowData_TopAirline;
	
	@FindBy(xpath = "((//table[contains(@id, 'TTLTableRecords')]//tbody//tr)[1]//td)[1]//a[@title = 'Copy']")
	WebElement rowData_TopCopyButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'TTLTableRecords')]//tbody//tr)[1]//td)[3]")
	WebElement rowData_TopCustomerMarket;
	
	@FindBy(xpath = "((//table[contains(@id, 'TTLTableRecords')]//tbody//tr)[1]//td)[6]")
	WebElement rowData_TopCustomerType;
	
	@FindBy(xpath = "((//table[contains(@id, 'TTLTableRecords')]//tbody//tr)[1]//td)[1]//a[@title = 'Delete']")
	WebElement rowData_TopDeleteButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'TTLTableRecords')]//tbody//tr)[1]//td)[1]//a[@title = 'Edit']")
	WebElement rowData_TopEditButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'TTLTableRecords')]//tbody//tr)[1]//td)[5]")
	WebElement rowData_TopFareType;
	
	@FindBy(xpath = "((//table[contains(@id, 'TTLTableRecords')]//tbody//tr)[1]//td)[7]")
	WebElement rowData_TopStatus;
	
	@FindBy(xpath = "((//table[contains(@id, 'TTLTableRecords')]//tbody//tr)[1]//td)[2]")
	WebElement rowData_TopTicketingName;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public TicketingTimeLimitsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void clickTopDeleteButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopDeleteButton);
		CommonFunctions.pause(5000, false);
	}
	
	public void containsValueRowsDropdown(String expectedRows) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Rows, expectedRows);
	}
	
	public void containsValueTopTicketingNameRowData(String expectedTicketingName) throws Exception {
		CommonFunctions.elementContainsText(rowData_TopTicketingName, expectedTicketingName);
	}
	
	public void displayedExcludeInactiveRulesCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ExcludeInactiveRules);
	}
	
	public void displayedTopAirlineRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopAirline);
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
	
	public void displayedTopFareTypeRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopFareType);
	}
	
	public void displayedTopStatusRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopStatus);
	}
	
	public void displayedTopTicketingNameRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TopTicketingName);
	}
	
	public void setTicketingNameFilterInput(String ticketingNameFilter) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_TicketingNameFilter, ticketingNameFilter);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public TicketingTimeLimitDetailsPage clickAddNewTicketingTimeLimitButton() throws Exception {
		CommonFunctions.clickElement(button_AddNewTicketingTimeLimit);
		
		return new TicketingTimeLimitDetailsPage();
	}
	
	public TicketingTimeLimitDetailsPage clickTopEditButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TopEditButton);
		
		return new TicketingTimeLimitDetailsPage();
	}
	// End - Actions
}