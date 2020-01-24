package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class MarkupRuleDetailsPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//input[@value = 'Close']")
	WebElement button_Close;
	
	@FindBy(xpath = "//input[contains(@id, 'AddCostButton')]")
	WebElement button_CostSettingSection_AddCostSetting;
	
	@FindBy(xpath = "//input[contains(@id, 'AddPriceButton')]")
	WebElement button_PriceSettingSection_AddPriceSetting;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//input[@value = 'Delete'])[1]")
	WebElement button_CostSettingSection_FirstDelete;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//input[@value = 'Delete'])[1]")
	WebElement button_PriceSettingSection_FirstDelete;
	
	@FindBy(xpath = "//input[@value = 'Save Markup Rule']")
	WebElement button_Save;
	
	@FindBy(xpath = "//input[contains(@id, 'IsActiveHolder')]")
	WebElement checkbox_Inactive;
	
	@FindBy(xpath = "//label[text() = 'Airline']//parent::div//button")
	WebElement dropdown_Airline;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//select[contains(@id, 'ApplyOnCombo')])[1]")
	WebElement dropdown_CostSettingSection_FirstApplyOn;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//span[text() = 'Cabin Class']//parent::div//button)[1]")
	WebElement dropdown_CostSettingSection_FirstCabinClass;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//span[text() = 'Fare Type']//parent::div//button)[1]")
	WebElement dropdown_CostSettingSection_FirstFareType;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//span[text() = 'Itinerary Type']//parent::div//button)[1]")
	WebElement dropdown_CostSettingSection_FirstItineraryType;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//select[contains(@id, 'MarkupStyleCombo')])[1]")
	WebElement dropdown_CostSettingSection_FirstMarkupStyle;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//select[contains(@id, 'MarkupTypeCombo')])[1]")
	WebElement dropdown_CostSettingSection_FirstMarkupType;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//span[text() = 'Cabin Class']//parent::div//button)[2]")
	WebElement dropdown_CostSettingSection_SecondCabinClass;
	
	@FindBy(xpath = "//label[text() = 'Customer Market']//parent::div//button")
	WebElement dropdown_CustomerMarket;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//select[contains(@id, 'ApplyOnCombo')])[1]")
	WebElement dropdown_PriceSettingSection_FirstApplyOn;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//span[text() = 'Cabin Class']//parent::div//button)[1]")
	WebElement dropdown_PriceSettingSection_FirstCabinClass;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//span[text() = 'Fare Type']//parent::div//button)[1]")
	WebElement dropdown_PriceSettingSection_FirstFareType;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//span[text() = 'Itinerary Type']//parent::div//button)[1]")
	WebElement dropdown_PriceSettingSection_FirstItineraryType;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//select[contains(@id, 'MarkupStyleCombo')])[1]")
	WebElement dropdown_PriceSettingSection_FirstMarkupStyle;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//select[contains(@id, 'MarkupTypeCombo')])[1]")
	WebElement dropdown_PriceSettingSection_FirstMarkupType;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//span[text() = 'Cabin Class']//parent::div//button)[2]")
	WebElement dropdown_PriceSettingSection_SecondCabinClass;
	
	@FindBy(xpath = "//select[contains(@id, 'SourceCombo')]")
	WebElement dropdown_Source;
	
	@FindBy(xpath = "//label[text() = 'Tour Destination']//parent::div//button")
	WebElement dropdown_TourDestination;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//input[contains(@id, 'AmountInput')])[1]")
	WebElement input_CostSettingSection_FirstAmount;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//input[contains(@id, 'CostFareBasisInput')])[1]")
	WebElement input_CostSettingSection_FirstFareBasisCode;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//input[contains(@id, 'PercentageInput')])[1]")
	WebElement input_CostSettingSection_FirstPercentage;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//input[contains(@id, 'StartDateInput')])[1]")
	WebElement input_CostSettingSection_FirstTravelDateFrom;
	
	@FindBy(xpath = "(//span[contains(@id, 'CostListRecords')]//input[contains(@id, 'EndDateInput')])[1]")
	WebElement input_CostSettingSection_FirstTravelDateTo;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//input[contains(@id, 'AmountInput')])[1]")
	WebElement input_PriceSettingSection_FirstAmount;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//input[contains(@id, 'PriceFareBasisInput')])[1]")
	WebElement input_PriceSettingSection_FirstFareBasisCode;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//input[contains(@id, 'PercentageInput')])[1]")
	WebElement input_PriceSettingSection_FirstPercentage;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//input[contains(@id, 'StartDateInput')])[1]")
	WebElement input_PriceSettingSection_FirstTravelDateFrom;
	
	@FindBy(xpath = "(//span[contains(@id, 'PriceListRecords')]//input[contains(@id, 'EndDateInput')])[1]")
	WebElement input_PriceSettingSection_FirstTravelDateTo;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public MarkupRuleDetailsPage() throws Exception {
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
	
	public void clickCostSettingSectionAddCostSettingButton() throws Exception {
		CommonFunctions.clickElement(button_CostSettingSection_AddCostSetting);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickCostSettingSectionFirstCabinClassDropdownOption(String cabinClassDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CostSettingSection_FirstCabinClass);
		CommonFunctions.clickElement(dropdown_CostSettingSection_FirstFareType);
		CommonFunctions.clickElement(dropdown_CostSettingSection_FirstCabinClass);
		
		if (cabinClassDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_CostSettingSection_FirstCabinClass.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_CostSettingSection_FirstCabinClass.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), cabinClassDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_CostSettingSection_FirstCabinClass.findElement(By.xpath(".//parent::div//ul//span[text() = '" + cabinClassDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickCostSettingSectionFirstDeleteButton() throws Exception {
		CommonFunctions.clickElement(button_CostSettingSection_FirstDelete);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickCostSettingSectionFirstFareTypeDropdownOption(String fareTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CostSettingSection_FirstFareType);
		
		if (fareTypeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_CostSettingSection_FirstFareType.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_CostSettingSection_FirstFareType.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), fareTypeDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_CostSettingSection_FirstFareType.findElement(By.xpath(".//parent::div//ul//span[text() = '" + fareTypeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickCostSettingSectionFirstItineraryTypeDropdownOption(String itineraryTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CostSettingSection_FirstItineraryType);
		
		if (itineraryTypeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_CostSettingSection_FirstItineraryType.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_CostSettingSection_FirstItineraryType.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), itineraryTypeDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_CostSettingSection_FirstItineraryType.findElement(By.xpath(".//parent::div//ul//span[text() = '" + itineraryTypeDropdownOptionValue + "']")));
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
	
	public void clickPriceSettingSectionAddPriceSettingButton() throws Exception {
		CommonFunctions.clickElement(button_PriceSettingSection_AddPriceSetting);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickPriceSettingSectionFirstCabinClassDropdownOption(String cabinClassDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstCabinClass);
		CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstFareType);
		CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstCabinClass);
		
		if (cabinClassDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstCabinClass.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_PriceSettingSection_FirstCabinClass.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), cabinClassDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstCabinClass.findElement(By.xpath(".//parent::div//ul//span[text() = '" + cabinClassDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickPriceSettingSectionFirstDeleteButton() throws Exception {
		CommonFunctions.clickElement(button_PriceSettingSection_FirstDelete);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickPriceSettingSectionFirstFareTypeDropdownOption(String fareTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstFareType);
		
		if (fareTypeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstFareType.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_PriceSettingSection_FirstFareType.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), fareTypeDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstFareType.findElement(By.xpath(".//parent::div//ul//span[text() = '" + fareTypeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickPriceSettingSectionFirstItineraryTypeDropdownOption(String itineraryTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstItineraryType);
		
		if (itineraryTypeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstItineraryType.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_PriceSettingSection_FirstItineraryType.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), itineraryTypeDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstItineraryType.findElement(By.xpath(".//parent::div//ul//span[text() = '" + itineraryTypeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickTourDestinationDropdownOption(String tourDestinationDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_TourDestination);
		CommonFunctions.clickElement(dropdown_Airline);
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
	
	public void containsValueAirlineDropdown(String expectedAirline) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Airline.findElement(By.xpath(".//span")), expectedAirline);
	}
	
	public void containsValueCostSettingSectionFirstApplyOnDropdown(String expectedApplyOn) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CostSettingSection_FirstApplyOn, expectedApplyOn);
	}
	
	public void containsValueCostSettingSectionFirstCabinClassDropdown(String expectedCabinClass) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CostSettingSection_FirstCabinClass.findElement(By.xpath(".//span")), expectedCabinClass);
	}
	
	public void containsValueCostSettingSectionFirstFareTypeDropdown(String expectedFareType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CostSettingSection_FirstFareType.findElement(By.xpath(".//span")), expectedFareType);
	}
	
	public void containsValueCostSettingSectionFirstItineraryTypeDropdown(String expectedItineraryType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CostSettingSection_FirstItineraryType.findElement(By.xpath(".//span")), expectedItineraryType);
	}
	
	public void containsValueCostSettingSectionFirstMarkupStyleDropdown(String expectedMarkupStyle) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CostSettingSection_FirstMarkupStyle, expectedMarkupStyle);
	}
	
	public void containsValueCostSettingSectionFirstMarkupTypeDropdown(String expectedMarkupType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CostSettingSection_FirstMarkupType, expectedMarkupType);
	}
	
	public void containsValueCustomerMarketDropdown(String expectedCustomerMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerMarket.findElement(By.xpath(".//span")), expectedCustomerMarket);
	}
	
	public void containsValuePriceSettingSectionFirstApplyOnDropdown(String expectedApplyOn) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PriceSettingSection_FirstApplyOn, expectedApplyOn);
	}
	
	public void containsValuePriceSettingSectionFirstCabinClassDropdown(String expectedCabinClass) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PriceSettingSection_FirstCabinClass.findElement(By.xpath(".//span")), expectedCabinClass);
	}
	
	public void containsValuePriceSettingSectionFirstFareTypeDropdown(String expectedFareType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PriceSettingSection_FirstFareType.findElement(By.xpath(".//span")), expectedFareType);
	}
	
	public void containsValuePriceSettingSectionFirstItineraryTypeDropdown(String expectedItineraryType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PriceSettingSection_FirstItineraryType.findElement(By.xpath(".//span")), expectedItineraryType);
	}
	
	public void containsValuePriceSettingSectionFirstMarkupStyleDropdown(String expectedMarkupStyle) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PriceSettingSection_FirstMarkupStyle, expectedMarkupStyle);
	}
	
	public void containsValuePriceSettingSectionFirstMarkupTypeDropdown(String expectedMarkupType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PriceSettingSection_FirstMarkupType, expectedMarkupType);
	}
	
	public void containsValueSourceDropdown(String expectedSource) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Source, expectedSource);
	}
	
	public void containsValueTourDestinationDropdown(String expectedTourDestination) throws Exception {
		CommonFunctions.elementContainsText(dropdown_TourDestination.findElement(By.xpath(".//span")), expectedTourDestination);
	}
	
	public void displayedCloseButton() throws Exception {
		CommonFunctions.elementDisplayed(button_Close);
	}
	
	public void displayedCostSettingSectionAddCostSettingButton() throws Exception {
		CommonFunctions.elementDisplayed(button_CostSettingSection_AddCostSetting);
	}
	
	public void displayedCostSettingSectionFirstFareBasisCodeInput() throws Exception {
		CommonFunctions.elementDisplayed(input_CostSettingSection_FirstFareBasisCode);
	}
	
	public void displayedCostSettingSectionFirstTravelDateFromInput() throws Exception {
		CommonFunctions.elementDisplayed(input_CostSettingSection_FirstTravelDateFrom);
	}
	
	public void displayedCostSettingSectionFirstTravelDateToInput() throws Exception {
		CommonFunctions.elementDisplayed(input_CostSettingSection_FirstTravelDateTo);
	}
	
	public void displayedCostSettingSectionSecondCabinClassDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_CostSettingSection_SecondCabinClass);
	}
	
	public void displayedPriceSettingSectionAddPriceSettingButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PriceSettingSection_AddPriceSetting);
	}
	
	public void displayedPriceSettingSectionFirstFareBasisCodeInput() throws Exception {
		CommonFunctions.elementDisplayed(input_PriceSettingSection_FirstFareBasisCode);
	}
	
	public void displayedPriceSettingSectionFirstTravelDateFromInput() throws Exception {
		CommonFunctions.elementDisplayed(input_PriceSettingSection_FirstTravelDateFrom);
	}
	
	public void displayedPriceSettingSectionFirstTravelDateToInput() throws Exception {
		CommonFunctions.elementDisplayed(input_PriceSettingSection_FirstTravelDateTo);
	}
	
	public void displayedPriceSettingSectionSecondCabinClassDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_PriceSettingSection_SecondCabinClass);
	}
	
	public void displayedSaveButton() throws Exception {
		CommonFunctions.elementDisplayed(button_Save);
	}
	
	public void enabledAirlineDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_Airline);
	}
	
	public void enabledCostSettingSectionFirstAmountInput() throws Exception {
		CommonFunctions.elementEnabled(input_CostSettingSection_FirstAmount);
	}
	
	public void enabledCostSettingSectionFirstApplyOnDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CostSettingSection_FirstApplyOn);
	}
	
	public void enabledCostSettingSectionFirstCabinClassDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CostSettingSection_FirstCabinClass);
	}
	
	public void enabledCostSettingSectionFirstFareBasisCodeInput() throws Exception {
		CommonFunctions.elementEnabled(input_CostSettingSection_FirstFareBasisCode);
	}
	
	public void enabledCostSettingSectionFirstFareTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CostSettingSection_FirstFareType);
	}
	
	public void enabledCostSettingSectionFirstItineraryTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CostSettingSection_FirstItineraryType);
	}
	
	public void enabledCostSettingSectionFirstMarkupStyleDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CostSettingSection_FirstMarkupStyle);
	}
	
	public void enabledCostSettingSectionFirstMarkupTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CostSettingSection_FirstMarkupType);
	}
	
	public void enabledCostSettingSectionFirstPercentageInput() throws Exception {
		CommonFunctions.elementEnabled(input_CostSettingSection_FirstPercentage);
	}
	
	public void enabledCostSettingSectionFirstTravelDateFromInput() throws Exception {
		CommonFunctions.elementEnabled(input_CostSettingSection_FirstTravelDateFrom);
	}
	
	public void enabledCostSettingSectionFirstTravelDateToInput() throws Exception {
		CommonFunctions.elementEnabled(input_CostSettingSection_FirstTravelDateTo);
	}
	
	public void enabledCustomerMarketDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CustomerMarket);
	}
	
	public void enabledInactiveCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_Inactive);
	}
	
	public void enabledPriceSettingSectionFirstAmountInput() throws Exception {
		CommonFunctions.elementEnabled(input_PriceSettingSection_FirstAmount);
	}
	
	public void enabledPriceSettingSectionFirstApplyOnDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_PriceSettingSection_FirstApplyOn);
	}
	
	public void enabledPriceSettingSectionFirstCabinClassDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_PriceSettingSection_FirstCabinClass);
	}
	
	public void enabledPriceSettingSectionFirstFareBasisCodeInput() throws Exception {
		CommonFunctions.elementEnabled(input_PriceSettingSection_FirstFareBasisCode);
	}
	
	public void enabledPriceSettingSectionFirstFareTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_PriceSettingSection_FirstFareType);
	}
	
	public void enabledPriceSettingSectionFirstItineraryTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_PriceSettingSection_FirstItineraryType);
	}
	
	public void enabledPriceSettingSectionFirstMarkupStyleDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_PriceSettingSection_FirstMarkupStyle);
	}
	
	public void enabledPriceSettingSectionFirstMarkupTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_PriceSettingSection_FirstMarkupType);
	}
	
	public void enabledPriceSettingSectionFirstPercentageInput() throws Exception {
		CommonFunctions.elementEnabled(input_PriceSettingSection_FirstPercentage);
	}
	
	public void enabledPriceSettingSectionFirstTravelDateFromInput() throws Exception {
		CommonFunctions.elementEnabled(input_PriceSettingSection_FirstTravelDateFrom);
	}
	
	public void enabledPriceSettingSectionFirstTravelDateToInput() throws Exception {
		CommonFunctions.elementEnabled(input_PriceSettingSection_FirstTravelDateTo);
	}
	
	public void enabledSourceDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_Source);
	}
	
	public void enabledTourDestinationDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_TourDestination);
	}
	
	public void selectCostSettingSectionFirstApplyOnValue(String applyOnValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_CostSettingSection_FirstApplyOn, applyOnValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectCostSettingSectionFirstMarkupStyleValue(String markupStyleValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_CostSettingSection_FirstMarkupStyle, markupStyleValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectCostSettingSectionFirstMarkupTypeValue(String markupTypeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_CostSettingSection_FirstMarkupType, markupTypeValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectPriceSettingSectionFirstApplyOnValue(String applyOnValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PriceSettingSection_FirstApplyOn, applyOnValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectPriceSettingSectionFirstMarkupStyleValue(String markupStyleValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PriceSettingSection_FirstMarkupStyle, markupStyleValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectPriceSettingSectionFirstMarkupTypeValue(String markupTypeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PriceSettingSection_FirstMarkupType, markupTypeValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectSourceValue(String sourceValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Source, sourceValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void setCostSettingSectionFirstAmountInput(String amount) throws Exception {
		CommonFunctions.clickElement(dropdown_CostSettingSection_FirstCabinClass);
		CommonFunctions.clearThenEnterElementValue(input_CostSettingSection_FirstAmount, amount);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setCostSettingSectionFirstFareBasisCodeInput(String fareBasisCode) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CostSettingSection_FirstFareBasisCode, fareBasisCode);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setCostSettingSectionFirstPercentageInput(String percentage) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CostSettingSection_FirstPercentage, percentage);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setCostSettingSectionFirstTravelDateFromInput(String travelDateFrom) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CostSettingSection_FirstTravelDateFrom, travelDateFrom);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setCostSettingSectionFirstTravelDateToInput(String travelDateTo) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CostSettingSection_FirstTravelDateTo, travelDateTo);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setPriceSettingSectionFirstAmountInput(String amount) throws Exception {
		CommonFunctions.clickElement(dropdown_PriceSettingSection_FirstCabinClass);
		CommonFunctions.clearThenEnterElementValue(input_PriceSettingSection_FirstAmount, amount);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setPriceSettingSectionFirstFareBasisCodeInput(String fareBasisCode) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PriceSettingSection_FirstFareBasisCode, fareBasisCode);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setPriceSettingSectionFirstPercentageInput(String percentage) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PriceSettingSection_FirstPercentage, percentage);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setPriceSettingSectionFirstTravelDateFromInput(String travelDateFrom) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PriceSettingSection_FirstTravelDateFrom, travelDateFrom);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setPriceSettingSectionFirstTravelDateToInput(String travelDateTo) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PriceSettingSection_FirstTravelDateTo, travelDateTo);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public MarkupRulesPage clickCloseButton() throws Exception {
		CommonFunctions.clickElement(button_Close);
		CommonFunctions.pause(5000, false);
		
		return new MarkupRulesPage();
	}
	
	public MarkupRulesPage clickSaveButton() throws Exception {
		CommonFunctions.clickElement(button_Save);
		CommonFunctions.pause(5000, false);
		
		return new MarkupRulesPage();
	}
	// End - Actions
}