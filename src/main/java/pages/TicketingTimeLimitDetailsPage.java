package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class TicketingTimeLimitDetailsPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//input[@value = 'Close']")
	WebElement button_Close;
	
	@FindBy(xpath = "//input[contains(@id, 'AddDateRanges')]")
	WebElement button_DateRangesSection_AddDateRanges;
	
	@FindBy(xpath = "//input[@value = 'Save Ticketing Time Limit']")
	WebElement button_SaveTicketingTimeLimit;
	
	@FindBy(xpath = "//input[contains(@id, 'AddTTLSetting')]")
	WebElement button_TicketingTimeSettingsSection_AddTicketingTimeLimitSetting;
	
	@FindBy(xpath = "//label[text() = 'Inactive']//parent::div//parent::div//input")
	WebElement checkbox_Inactive;
	
	@FindBy(xpath = "//label[text() = 'Airline']//parent::div//button")
	WebElement dropdown_Airline;
	
	@FindBy(xpath = "//label[text() = 'Customer Market']//parent::div//button")
	WebElement dropdown_CustomerMarket;
	
	@FindBy(xpath = "//label[text() = 'Customer Type']//parent::div//select")
	WebElement dropdown_CustomerType;
	
	@FindBy(xpath = "//label[text() = 'Fare Type']//parent::div//button")
	WebElement dropdown_FareType;
	
	@FindBy(xpath = "//input[contains(@id, 'TicketingName')]")
	WebElement input_TicketingName;
	
	@FindBy(xpath = "(//span[contains(@id, 'FirstTTLDateRanges')]//span[contains(@class, 'trash')])[1]")
	WebElement rowData_DateRangesSection_FirstDeleteDateRangesButton;
	
	@FindBy(xpath = "(//input[contains(@id, 'StartDateInput')])[1]")
	WebElement rowData_DateRangesSection_FirstEffectiveDateFromInput;
	
	@FindBy(xpath = "(//input[contains(@id, 'EndDateInput')])[1]")
	WebElement rowData_DateRangesSection_FirstEffectiveDateToInput;
	
	@FindBy(xpath = "(//span[contains(@id, 'AddedTTLDateRanges')]//span[contains(@class, 'trash')])[1]")
	WebElement rowData_DateRangesSection_SecondDeleteDateRangesButton;
	
	@FindBy(xpath = "(//input[contains(@id, 'DayRangeFrom')])[1]")
	WebElement rowData_TicketingTimeSettingsSection_FirstDayRangeFromInput;
	
	@FindBy(xpath = "(//input[contains(@id, 'DayRangeTo')])[1]")
	WebElement rowData_TicketingTimeSettingsSection_FirstDayRangeToInput;
	
	@FindBy(xpath = "(//span[contains(@id, 'FirstTicketingTimeLimitSettingsRecord')]//span[contains(@class, 'trash')])[1]")
	WebElement rowData_TicketingTimeSettingsSection_FirstDeleteTicketingTimeLimitSettingButton;
	
	@FindBy(xpath = "(//input[contains(@id, 'TTLasBooking')])[1]")
	WebElement rowData_TicketingTimeSettingsSection_FirstTTLAsBookingPlusInput;
	
	@FindBy(xpath = "(//input[contains(@id, 'TTLasTTL')])[1]")
	WebElement rowData_TicketingTimeSettingsSection_FirstTTLAsTTLMinusInput;
	
	@FindBy(xpath = "(//input[contains(@id, 'DayRangeFrom')])[2]")
	WebElement rowData_TicketingTimeSettingsSection_SecondDayRangeFromInput;
	
	@FindBy(xpath = "(//input[contains(@id, 'DayRangeTo')])[2]")
	WebElement rowData_TicketingTimeSettingsSection_SecondDayRangeToInput;
	
	@FindBy(xpath = "(//span[contains(@id, 'AddedTicketingTimeLimitSettingsRecord')]//span[contains(@class, 'trash')])[1]")
	WebElement rowData_TicketingTimeSettingsSection_SecondDeleteTicketingTimeLimitSettingButton;
	
	@FindBy(xpath = "(//input[contains(@id, 'TTLasBooking')])[2]")
	WebElement rowData_TicketingTimeSettingsSection_SecondTTLAsBookingPlusInput;
	
	@FindBy(xpath = "(//input[contains(@id, 'TTLasTTL')])[2]")
	WebElement rowData_TicketingTimeSettingsSection_SecondTTLAsTTLMinusInput;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public TicketingTimeLimitDetailsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void clickAirlineDropdownOption(String airlineDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Airline);
		CommonFunctions.clickElement(dropdown_CustomerMarket);
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
	
	public void clickCustomerMarketDropdownOption(String customerMarketDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerMarket);
		CommonFunctions.clickElement(dropdown_Airline);
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
	
	public void clickDateRangesSectionAddDateRangesButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangesSection_AddDateRanges);
	}
	
	public void clickDateRangesSectionFirstDeleteDateRangesButtonButton() throws Exception {
		CommonFunctions.clickElement(rowData_DateRangesSection_FirstDeleteDateRangesButton);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickFareTypeDropdownOption(String fareTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_FareType);
		CommonFunctions.clickElement(dropdown_CustomerMarket);
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
	
	public void clickTicketingTimeSettingsSectionAddTicketingTimeLimitSettingButton() throws Exception {
		CommonFunctions.clickElement(button_TicketingTimeSettingsSection_AddTicketingTimeLimitSetting);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickTicketingTimeSettingsSectionFirstDeleteTicketingTimeLimitSettingButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_TicketingTimeSettingsSection_FirstDeleteTicketingTimeLimitSettingButton);
		CommonFunctions.pause(2500, false);
	}
	
	public void containsValueAirlineDropdown(String expectedAirline) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Airline.findElement(By.xpath(".//span")), expectedAirline);
	}
	
	public void containsValueCustomerMarketDropdown(String expectedCustomerMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerMarket.findElement(By.xpath(".//span")), expectedCustomerMarket);
	}
	
	public void containsValueCustomerTypeDropdown(String expectedCustomerType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerType, expectedCustomerType);
	}
	
	public void containsValueFareTypeDropdown(String expectedFareType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_FareType.findElement(By.xpath(".//span")), expectedFareType);
	}
	
	public void containsValueTicketingNameInput(String expectedTicketingName) throws Exception {
		CommonFunctions.elementAttributeContains(input_TicketingName, "value", expectedTicketingName);
	}
	
	public void containsValueTicketingTimeSettingsSectionFirstDayRangeFromInputRowData(String expectedDayRangeFrom) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_TicketingTimeSettingsSection_FirstDayRangeFromInput, "value", expectedDayRangeFrom);
	}
	
	public void containsValueTicketingTimeSettingsSectionFirstDayRangeToInputRowData(String expectedDayRangeTo) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_TicketingTimeSettingsSection_FirstDayRangeToInput, "value", expectedDayRangeTo);
	}
	
	public void containsValueTicketingTimeSettingsSectionFirstTTLAsBookingPlusInputRowData(String expectedTTLAsBookingPlus) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_TicketingTimeSettingsSection_FirstTTLAsBookingPlusInput, "value", expectedTTLAsBookingPlus);
	}
	
	public void containsValueTicketingTimeSettingsSectionFirstTTLAsTTLMinusInputRowData(String expectedTTLAsTTLMinus) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_TicketingTimeSettingsSection_FirstTTLAsTTLMinusInput, "value", expectedTTLAsTTLMinus);
	}
	
	public void disabledDateRangesSectionAddDateRangesButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_DateRangesSection_AddDateRanges, "disabled", "true");
	}
	
	public void displayedCloseButton() throws Exception {
		CommonFunctions.elementDisplayed(button_Close);
	}
	
	public void displayedDateRangesSectionSecondDeleteDateRangesButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_DateRangesSection_SecondDeleteDateRangesButton);
	}
	
	public void displayedSaveTicketingTimeLimitButton() throws Exception {
		CommonFunctions.elementDisplayed(button_SaveTicketingTimeLimit);
	}
	
	public void displayedTicketingTimeSettingsSectionSecondDeleteTicketingTimeLimitSettingButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_TicketingTimeSettingsSection_SecondDeleteTicketingTimeLimitSettingButton);
	}
	
	public void enabledAirlineDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_Airline);
	}
	
	public void enabledCustomerMarketDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CustomerMarket);
	}
	
	public void enabledCustomerTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CustomerType);
	}
	
	public void enabledDateRangesSectionFirstEffectiveDateFromInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_DateRangesSection_FirstEffectiveDateFromInput);
	}
	
	public void enabledDateRangesSectionFirstEffectiveDateToInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_DateRangesSection_FirstEffectiveDateToInput);
	}
	
	public void enabledFareTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_FareType);
	}
	
	public void enabledInactiveCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_Inactive);
	}
	
	public void enabledTicketingNameInput() throws Exception {
		CommonFunctions.elementEnabled(input_TicketingName);
	}
	
	public void enabledTicketingTimeSettingsSectionFirstDayRangeFromInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_TicketingTimeSettingsSection_FirstDayRangeFromInput);
	}
	
	public void enabledTicketingTimeSettingsSectionFirstDayRangeToInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_TicketingTimeSettingsSection_FirstDayRangeToInput);
	}
	
	public void enabledTicketingTimeSettingsSectionFirstTTLAsBookingPlusInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_TicketingTimeSettingsSection_FirstTTLAsBookingPlusInput);
	}
	
	public void enabledTicketingTimeSettingsSectionFirstTTLAsTTLMinusInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_TicketingTimeSettingsSection_FirstTTLAsTTLMinusInput);
	}
	
	public void selectCustomerTypeValue(String customerTypeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_CustomerType, customerTypeValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void setTicketingNameInput(String ticketingName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_TicketingName, ticketingName);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setDateRangesSectionFirstEffectiveDateFromInputRowData(String effectiveDateFrom) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_DateRangesSection_FirstEffectiveDateFromInput, effectiveDateFrom);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setDateRangesSectionFirstEffectiveDateToInputRowData(String effectiveDateTo) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_DateRangesSection_FirstEffectiveDateToInput, effectiveDateTo);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setTicketingTimeSettingsSectionFirstDayRangeFromInputRowData(String dayRangeFrom) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_TicketingTimeSettingsSection_FirstDayRangeFromInput, dayRangeFrom);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setTicketingTimeSettingsSectionFirstDayRangeToInputRowData(String dayRangeTo) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_TicketingTimeSettingsSection_FirstDayRangeToInput, dayRangeTo);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setTicketingTimeSettingsSectionFirstTTLAsBookingPlusInputRowData(String ttlAsBookingPlus) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_TicketingTimeSettingsSection_FirstTTLAsBookingPlusInput, ttlAsBookingPlus);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setTicketingTimeSettingsSectionFirstTTLAsTTLMinusInputRowData(String ttlAsTTLMinus) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_TicketingTimeSettingsSection_FirstTTLAsTTLMinusInput, ttlAsTTLMinus);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public TicketingTimeLimitsPage clickCloseButton() throws Exception {
		CommonFunctions.clickElement(button_Close);
		CommonFunctions.pause(5000, false);
		
		return new TicketingTimeLimitsPage();
	}
	
	public TicketingTimeLimitsPage clickSaveTicketingTimeLimitButton() throws Exception {
		CommonFunctions.clickElement(button_SaveTicketingTimeLimit);
		CommonFunctions.pause(5000, false);
		
		return new TicketingTimeLimitsPage();
	}
	// End - Actions
}