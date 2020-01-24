package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class RecommendedItineraryDetailsPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//a[contains(@id,'CloseButton')]")
	WebElement button_Close;
	
	@FindBy(xpath = "//input[@value = 'Add Date Range']")
	WebElement button_DateRangesSection_AddDateRange;
	
	@FindBy(xpath = "//a[contains(@id,'SaveItineraryButton')]")
	WebElement button_Save;
	
	@FindBy(xpath = "//input[contains(@id, 'AddInboundFlight')]")
	WebElement button_InboundSection_AddFlight;
	
	@FindBy(xpath = "//input[contains(@id, 'AddInternalFlight')]")
	WebElement button_InternalSection_AddFlight;
	
	@FindBy(xpath = "//input[contains(@id, 'AddOutboundFlight')]")
	WebElement button_OutboundSection_AddFlight;
	
	@FindBy(xpath = "//div[text() = 'Inactive']//input")
	WebElement checkbox_Inactive;
	
	@FindBy(xpath = "//div[text() = 'Use Package Specific Rule']//input")
	WebElement checkbox_UsePackageSpecificRule;
	
	@FindBy(xpath = "//label[text() = 'Customer Market']//parent::div//button")
	WebElement dropdown_CustomerMarket;
	
	@FindBy(xpath = "//label[text() = 'Tour Code']//parent::div//button")
	WebElement dropdown_TourCode;
	
	@FindBy(xpath = "//textarea[contains(@id, 'ExternalCommentsInput')]")
	WebElement input_CommentsSection_ExternalComments;
	
	@FindBy(xpath = "//textarea[contains(@id, 'InternalCommentsInput')]")
	WebElement input_CommentsSection_InternalComments;
	
	@FindBy(xpath = "//input[contains(@id, 'StartDateInput')]")
	WebElement input_DateRangesSection_AddDepartureDateFrom;
	
	@FindBy(xpath = "//input[contains(@id, 'EndDateInput')]")
	WebElement input_DateRangesSection_AddDepartureDateTo;
	
	@FindBy(xpath = "//input[contains(@id, 'ItirenaryNameInput')]")
	WebElement input_ItineraryName;
	
	@FindBy(xpath = "(//span[text() = 'Delete Date'])[1]//parent::a")
	WebElement rowData_DateRangesSection_TopDeleteDateButton;
	
	@FindBy(xpath = "(//input[contains(@id, 'StartDateInput')])[2]")
	WebElement rowData_DateRangesSection_SecondDepartureDateFromInput;
	
	@FindBy(xpath = "(//input[contains(@id, 'EndDateInput')])[2]")
	WebElement rowData_DateRangesSection_SecondDepartureDateToInput;
	
	@FindBy(xpath = "(//span[contains(@id, 'InboundFlightRecords')]//div[contains(@id, 'InboundItem')])[2]//div[contains(@id, 'deleteInboundIcon')]//a")
	WebElement rowData_InboundSection_SecondDeleteInboundFlightButton;
	
	@FindBy(xpath = "((//span[contains(@id, 'InboundFlightRecords')]//div[contains(@id, 'InboundItem')])[2]//div[text() = 'Flying From']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_InboundSection_SecondFlyingFromDropdown;
	
	@FindBy(xpath = "((//span[contains(@id, 'InboundFlightRecords')]//div[contains(@id, 'InboundItem')])[2]//div[text() = 'Flying To']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_InboundSection_SecondFlyingToDropdown;
	
	@FindBy(xpath = "(//span[contains(@id, 'InboundFlightRecords')]//div[contains(@id, 'InboundItem')])[2]//div[text() = 'Package Day Indicator']//input")
	WebElement rowData_InboundSection_SecondPackageDayIndicatorInput;
	
	@FindBy(xpath = "((//span[contains(@id, 'InboundFlightRecords')]//div[contains(@id, 'InboundItem')])[1]//div[text() = 'Flying From']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_InboundSection_TopFlyingFromDropdown;
	
	@FindBy(xpath = "((//span[contains(@id, 'InboundFlightRecords')]//div[contains(@id, 'InboundItem')])[1]//div[text() = 'Flying To']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_InboundSection_TopFlyingToDropdown;
	
	@FindBy(xpath = "(//span[contains(@id, 'InboundFlightRecords')]//div[contains(@id, 'InboundItem')])[1]//div[text() = 'Package Day Indicator']//input")
	WebElement rowData_InboundSection_TopPackageDayIndicatorInput;
	
	@FindBy(xpath = "(//span[contains(@id, 'InternalFlightRecords')]//div[contains(@id, 'InternalItem')])[2]//div[contains(@id, 'deleteInternalIcon')]//a")
	WebElement rowData_InternalSection_SecondDeleteInternalFlightButton;
	
	@FindBy(xpath = "((//span[contains(@id, 'InternalFlightRecords')]//div[contains(@id, 'InternalItem')])[2]//div[text() = 'Flying From']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_InternalSection_SecondFlyingFromDropdown;
	
	@FindBy(xpath = "((//span[contains(@id, 'InternalFlightRecords')]//div[contains(@id, 'InternalItem')])[2]//div[text() = 'Flying To']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_InternalSection_SecondFlyingToDropdown;
	
	@FindBy(xpath = "(//span[contains(@id, 'InternalFlightRecords')]//div[contains(@id, 'InternalItem')])[2]//div[text() = 'Package Day Indicator']//input")
	WebElement rowData_InternalSection_SecondPackageDayIndicatorInput;
	
	@FindBy(xpath = "((//span[contains(@id, 'InternalFlightRecords')]//div[contains(@id, 'InternalItem')])[1]//div[text() = 'Flying From']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_InternalSection_TopFlyingFromDropdown;
	
	@FindBy(xpath = "((//span[contains(@id, 'InternalFlightRecords')]//div[contains(@id, 'InternalItem')])[1]//div[text() = 'Flying To']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_InternalSection_TopFlyingToDropdown;
	
	@FindBy(xpath = "(//span[contains(@id, 'InternalFlightRecords')]//div[contains(@id, 'InternalItem')])[1]//div[text() = 'Package Day Indicator']//input")
	WebElement rowData_InternalSection_TopPackageDayIndicatorInput;
	
	@FindBy(xpath = "(//span[contains(@id, 'OutboundFlightRecords')]//div[contains(@id, 'OutboundItem')])[2]//div[contains(@id, 'deleteOutboundIcon')]//a")
	WebElement rowData_OutboundSection_SecondDeleteOutboundFlightButton;
	
	@FindBy(xpath = "((//span[contains(@id, 'OutboundFlightRecords')]//div[contains(@id, 'OutboundItem')])[2]//div[text() = 'Flying From']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_OutboundSection_SecondFlyingFromDropdown;
	
	@FindBy(xpath = "((//span[contains(@id, 'OutboundFlightRecords')]//div[contains(@id, 'OutboundItem')])[2]//div[text() = 'Flying To']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_OutboundSection_SecondFlyingToDropdown;
	
	@FindBy(xpath = "(//span[contains(@id, 'OutboundFlightRecords')]//div[contains(@id, 'OutboundItem')])[2]//div[text() = 'Package Day Indicator']//input")
	WebElement rowData_OutboundSection_SecondPackageDayIndicatorInput;
	
	@FindBy(xpath = "((//span[contains(@id, 'OutboundFlightRecords')]//div[contains(@id, 'OutboundItem')])[1]//div[text() = 'Flying From']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_OutboundSection_TopFlyingFromDropdown;
	
	@FindBy(xpath = "((//span[contains(@id, 'OutboundFlightRecords')]//div[contains(@id, 'OutboundItem')])[1]//div[text() = 'Flying To']//*[contains(@class, 'choice')])[1]")
	WebElement rowData_OutboundSection_TopFlyingToDropdown;
	
	@FindBy(xpath = "(//span[contains(@id, 'OutboundFlightRecords')]//div[contains(@id, 'OutboundItem')])[1]//div[text() = 'Package Day Indicator']//input")
	WebElement rowData_OutboundSection_TopPackageDayIndicatorInput;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public RecommendedItineraryDetailsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void clickCustomerMarketDropdownOption(String customerMarketDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerMarket);
		
		if (customerMarketDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_CustomerMarket.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_CustomerMarket.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), customerMarketDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_CustomerMarket.findElement(By.xpath(".//parent::div//ul//span[text() = '" + customerMarketDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickDateRangesSectionAddDateRangeButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangesSection_AddDateRange);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickDateRangesSectionTopDeleteDateButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_DateRangesSection_TopDeleteDateButton);
		CommonFunctions.pause(10000, false);
	}
	
	public void clickInboundSectionAddFlightButton() throws Exception {
		CommonFunctions.clickElement(button_InboundSection_AddFlight);
		CommonFunctions.pause(45000, false);
	}
	
	public void clickInboundSectionSecondDeleteInboundFlightButton() throws Exception {
		CommonFunctions.clickElement(rowData_InboundSection_SecondDeleteInboundFlightButton);
		CommonFunctions.pause(30000, false);
	}
	
	public void clickInboundSectionSecondFlyingFromDropdownRowDataOption(String flyingFromDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(rowData_InboundSection_SecondFlyingFromDropdown);
		CommonFunctions.pause(7500, false);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flyingFromDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickInboundSectionSecondFlyingToDropdownRowDataOption(String flyingToDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(rowData_InboundSection_SecondFlyingToDropdown);
		CommonFunctions.pause(7500, false);
		
		if (flyingToDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(rowData_InboundSection_SecondFlyingToDropdown.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(rowData_InboundSection_SecondFlyingToDropdown.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), flyingToDropdownOptionValue);
			CommonFunctions.clickElement(rowData_InboundSection_SecondFlyingToDropdown.findElement(By.xpath(".//parent::div//ul//span[contains(text(), '" + flyingToDropdownOptionValue + "')]")));
		}
		
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickInboundSectionTopFlyingFromDropdownRowDataOption(String flyingFromDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(rowData_InboundSection_TopFlyingFromDropdown);
		CommonFunctions.pause(7500, false);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flyingFromDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickInboundSectionTopFlyingToDropdownRowDataOption(String flyingToDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(rowData_InboundSection_TopFlyingToDropdown);
		CommonFunctions.pause(7500, false);
		
		if (flyingToDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(rowData_InboundSection_TopFlyingToDropdown.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(rowData_InboundSection_TopFlyingToDropdown.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), flyingToDropdownOptionValue);
			CommonFunctions.clickElement(rowData_InboundSection_TopFlyingToDropdown.findElement(By.xpath(".//parent::div//ul//span[contains(text(), '" + flyingToDropdownOptionValue + "')]")));
		}
		
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickInternalSectionAddFlightButton() throws Exception {
		CommonFunctions.clickElement(button_InternalSection_AddFlight);
		CommonFunctions.pause(45000, false);
	}
	
	public void clickInternalSectionSecondDeleteInternalFlightButton() throws Exception {
		CommonFunctions.clickElement(rowData_InternalSection_SecondDeleteInternalFlightButton);
		CommonFunctions.pause(30000, false);
	}
	
	public void clickInternalSectionSecondFlyingFromDropdownRowDataOption(String flyingFromDropdownOptionValue) throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(rowData_InternalSection_SecondFlyingFromDropdown);
		CommonFunctions.pause(7500, false);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flyingFromDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickInternalSectionSecondFlyingToDropdownRowDataOption(String flyingToDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(rowData_InternalSection_SecondFlyingToDropdown);
		CommonFunctions.pause(7500, false);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flyingToDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickInternalSectionTopFlyingFromDropdownRowDataOption(String flyingFromDropdownOptionValue) throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(rowData_InternalSection_TopFlyingFromDropdown);
		CommonFunctions.pause(7500, false);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flyingFromDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickInternalSectionTopFlyingToDropdownRowDataOption(String flyingToDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(rowData_InternalSection_TopFlyingToDropdown);
		CommonFunctions.pause(7500, false);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flyingToDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickOutboundSectionAddFlightButton() throws Exception {
		CommonFunctions.clickElement(button_OutboundSection_AddFlight);
		CommonFunctions.pause(45000, false);
	}
	
	public void clickOutboundSectionSecondDeleteOutboundFlightButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_OutboundSection_SecondDeleteOutboundFlightButton);
		CommonFunctions.pause(30000, false);
	}
	
	public void clickOutboundSectionSecondFlyingFromDropdownRowDataOption(String flyingFromDropdownOptionValue) throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(rowData_OutboundSection_SecondFlyingFromDropdown);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.clickElement(rowData_OutboundSection_SecondFlyingToDropdown);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.clickElement(rowData_OutboundSection_SecondFlyingFromDropdown);
		CommonFunctions.pause(7500, false);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flyingFromDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickOutboundSectionSecondFlyingToDropdownRowDataOption(String flyingToDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(rowData_OutboundSection_SecondFlyingToDropdown);
		CommonFunctions.pause(7500, false);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flyingToDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickOutboundSectionTopFlyingFromDropdownRowDataOption(String flyingFromDropdownOptionValue) throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(rowData_OutboundSection_TopFlyingFromDropdown);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.clickElement(rowData_OutboundSection_TopFlyingToDropdown);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.clickElement(rowData_OutboundSection_TopFlyingFromDropdown);
		CommonFunctions.pause(5000, false);
		
		if (flyingFromDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(rowData_OutboundSection_TopFlyingFromDropdown.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(rowData_OutboundSection_TopFlyingFromDropdown.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), flyingFromDropdownOptionValue);
			CommonFunctions.clickElement(rowData_OutboundSection_TopFlyingFromDropdown.findElement(By.xpath(".//parent::div//ul//span[contains(text(), '" + flyingFromDropdownOptionValue + "')]")));
		}
		
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickOutboundSectionTopFlyingToDropdownRowData() throws Exception {
		CommonFunctions.clickElement(rowData_OutboundSection_TopFlyingToDropdown);
		CommonFunctions.pause(7500, false);
	}
	
	public void clickOutboundSectionTopFlyingToDropdownRowDataOption(String flyingToDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(rowData_OutboundSection_TopFlyingToDropdown);
		CommonFunctions.pause(7500, false);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flyingToDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(7500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickTourCodeDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_TourCode);
	}
	
	public void clickTourCodeDropdownOption(String tourCodeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_TourCode);
		CommonFunctions.clickElement(dropdown_CustomerMarket);
		CommonFunctions.clickElement(dropdown_TourCode);
		CommonFunctions.pause(5000, false);
		
		if (tourCodeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_TourCode.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_TourCode.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), tourCodeDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_TourCode.findElement(By.xpath(".//parent::div//ul//span[text() = '" + tourCodeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void containsValueCommentsSectionExternalCommentsInput(String expectedExternalComments) throws Exception {
		CommonFunctions.elementAttributeContains(input_CommentsSection_ExternalComments, "value", expectedExternalComments);
	}
	
	public void containsValueCommentsSectionInternalCommentsInput(String expectedInternalComments) throws Exception {
		CommonFunctions.elementAttributeContains(input_CommentsSection_InternalComments, "value", expectedInternalComments);
	}
	
	public void containsValueCustomerMarketDropdown(String expectedCustomerMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerMarket.findElement(By.xpath(".//span")), expectedCustomerMarket);
	}
	
	public void containsValueDateRangesSectionAddDepartureDateFromInput(String expectedDepartureDateFrom) throws Exception {
		CommonFunctions.elementAttributeContains(input_DateRangesSection_AddDepartureDateFrom, "value", expectedDepartureDateFrom);
	}
	
	public void containsValueDateRangesSectionAddDepartureDateToInput(String expectedDepartureDateTo) throws Exception {
		CommonFunctions.elementAttributeContains(input_DateRangesSection_AddDepartureDateTo, "value", expectedDepartureDateTo);
	}
	
	public void containsValueInboundSectionTopFlyingFromDropdownRowData(String expectedAddFlyingFrom) throws Exception {
		CommonFunctions.elementContainsText(rowData_InboundSection_TopFlyingFromDropdown.findElement(By.xpath(".//span")), expectedAddFlyingFrom);
	}
	
	public void containsValueInboundSectionTopFlyingToDropdownRowData(String expectedAddFlyingTo) throws Exception {
		CommonFunctions.elementContainsText(rowData_InboundSection_TopFlyingToDropdown.findElement(By.xpath(".//span")), expectedAddFlyingTo);
	}
	
	public void containsValueInboundSectionTopPackageDayIndicatorInputRowData(String expectedPackageDayIndicator) throws Exception {
		CommonFunctions.elementContainsText(rowData_InboundSection_TopPackageDayIndicatorInput, expectedPackageDayIndicator);
	}
	
	public void containsValueInternalSectionTopFlyingFromDropdownRowData(String expectedAddFlyingFrom) throws Exception {
		CommonFunctions.elementContainsText(rowData_InternalSection_TopFlyingFromDropdown.findElement(By.xpath(".//span")), expectedAddFlyingFrom);
	}
	
	public void containsValueInternalSectionTopFlyingToDropdownRowData(String expectedAddFlyingTo) throws Exception {
		CommonFunctions.elementContainsText(rowData_InternalSection_TopFlyingToDropdown.findElement(By.xpath(".//span")), expectedAddFlyingTo);
	}
	
	public void containsValueInternalSectionTopPackageDayIndicatorInputRowData(String expectedPackageDayIndicator) throws Exception {
		CommonFunctions.elementContainsText(rowData_InternalSection_TopPackageDayIndicatorInput, expectedPackageDayIndicator);
	}
	
	public void containsValueOutboundSectionTopFlyingFromDropdownRowData(String expectedAddFlyingFrom) throws Exception {
		CommonFunctions.elementContainsText(rowData_OutboundSection_TopFlyingFromDropdown.findElement(By.xpath(".//span")), expectedAddFlyingFrom);
	}
	
	public void containsValueOutboundSectionTopFlyingToDropdownRowData(String expectedAddFlyingTo) throws Exception {
		CommonFunctions.elementContainsText(rowData_OutboundSection_TopFlyingToDropdown.findElement(By.xpath(".//span")), expectedAddFlyingTo);
	}
	
	public void containsValueOutboundSectionTopPackageDayIndicatorInputRowData(String expectedPackageDayIndicator) throws Exception {
		CommonFunctions.elementContainsText(rowData_OutboundSection_TopPackageDayIndicatorInput, expectedPackageDayIndicator);
	}
	
	public void containsValueTourCodeDropdown(String expectedTourCode) throws Exception {
		CommonFunctions.elementContainsText(dropdown_TourCode.findElement(By.xpath(".//span")), expectedTourCode);
	}
	
	public void disabledDateRangesSectionAddDateRangeButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_DateRangesSection_AddDateRange, "disabled", "true");
	}
	
	public void disabledInboundSectionAddFlightButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_InboundSection_AddFlight, "disabled", "true");
	}
	
	public void displayedInactiveCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_Inactive);
	}
	
	public void displayedItineraryNameInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ItineraryName);
	}
	
	public void displayedInboundSectionSecondDeleteInboundFlightButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_InboundSection_SecondDeleteInboundFlightButton);
	}
	
	public void displayedInternalSectionSecondDeleteInternalFlightButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_InternalSection_SecondDeleteInternalFlightButton);
	}
	
	public void displayedOutboundSectionSecondDeleteOutboundFlightButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_OutboundSection_SecondDeleteOutboundFlightButton);
	}
	
	public void displayedUsePackageSpecificRuleCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_UsePackageSpecificRule);
	}
	
	public void enabledCommentsSectionExternalCommentsInput() throws Exception {
		CommonFunctions.elementEnabled(input_CommentsSection_ExternalComments);
	}
	
	public void enabledCommentsSectionInternalCommentsInput() throws Exception {
		CommonFunctions.elementEnabled(input_CommentsSection_InternalComments);
	}
	
	public void enabledCustomerMarketDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CustomerMarket);
	}
	
	public void enabledDateRangesSectionAddDateRangeButton() throws Exception {
		CommonFunctions.elementEnabled(button_DateRangesSection_AddDateRange);
	}
	
	public void enabledDateRangesSectionAddDepartureDateFromInput() throws Exception {
		CommonFunctions.elementEnabled(input_DateRangesSection_AddDepartureDateFrom);
	}
	
	public void enabledDateRangesSectionAddDepartureDateToInput() throws Exception {
		CommonFunctions.elementEnabled(input_DateRangesSection_AddDepartureDateTo);
	}
	
	public void enabledDateRangesSectionSecondDepartureDateFromInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_DateRangesSection_SecondDepartureDateFromInput);
	}
	
	public void enabledDateRangesSectionSecondDepartureDateToInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_DateRangesSection_SecondDepartureDateToInput);
	}
	
	public void enabledInactiveCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_Inactive);
	}
	
	public void enabledInboundSectionAddFlightButton() throws Exception {
		CommonFunctions.elementEnabled(button_InboundSection_AddFlight);
	}
	
	public void enabledInboundSectionTopFlyingFromDropdownRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_InboundSection_TopFlyingFromDropdown);
	}
	
	public void enabledInboundSectionTopFlyingToDropdownRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_InboundSection_TopFlyingToDropdown);
	}
	
	public void enabledInboundSectionTopPackageDayIndicatorInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_InboundSection_TopPackageDayIndicatorInput);
	}
	
	public void enabledInternalSectionAddFlightButton() throws Exception {
		CommonFunctions.elementEnabled(button_InternalSection_AddFlight);
	}
	
	public void enabledInternalSection_TopFlyingFromDropdownRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_InternalSection_TopFlyingFromDropdown);
	}
	
	public void enabledInternalSectionTopFlyingToDropdownRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_InternalSection_TopFlyingToDropdown);
	}
	
	public void enabledInternalSectionTopPackageDayIndicatorInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_InternalSection_TopPackageDayIndicatorInput);
	}
	
	public void enabledItineraryNameInput() throws Exception {
		CommonFunctions.elementEnabled(input_ItineraryName);
	}
	
	public void enabledOutboundSectionAddFlightButton() throws Exception {
		CommonFunctions.elementEnabled(button_OutboundSection_AddFlight);
	}
	
	public void enabledOutboundSectionTopFlyingFromDropdownRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_OutboundSection_TopFlyingFromDropdown);
	}
	
	public void enabledOutboundSectionTopFlyingToDropdownRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_OutboundSection_TopFlyingToDropdown);
	}
	
	public void enabledOutboundSectionTopPackageDayIndicatorInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_OutboundSection_TopPackageDayIndicatorInput);
	}
	
	public void enabledTourCodeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_TourCode);
	}
	
	public void enabledUsePackageSpecificRuleCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_UsePackageSpecificRule);
	}
	
	public void setCommentsSectionExternalCommentsInput(String externalComments) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CommentsSection_ExternalComments, externalComments);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setCommentsSectionInternalCommentsInput(String internalComments) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CommentsSection_InternalComments, internalComments);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setDateRangesSectionAddDepartureDateFromInput(String departureDateFrom) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_DateRangesSection_AddDepartureDateFrom, departureDateFrom);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setInboundSectionSecondPackageDayIndicatorInputRowData(String packageDayIndicator) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_InboundSection_SecondPackageDayIndicatorInput, packageDayIndicator);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setInboundSectionTopPackageDayIndicatorInputRowData(String packageDayIndicator) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_InboundSection_TopPackageDayIndicatorInput, packageDayIndicator);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setInternalSectionSecondPackageDayIndicatorInputRowData(String packageDayIndicator) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_InternalSection_SecondPackageDayIndicatorInput, packageDayIndicator);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setInternalSectionTopPackageDayIndicatorInputRowData(String packageDayIndicator) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_InternalSection_TopPackageDayIndicatorInput, packageDayIndicator);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setItineraryNameInput(String itineraryName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ItineraryName, itineraryName);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setOutboundSectionSecondPackageDayIndicatorInputRowData(String packageDayIndicator) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_OutboundSection_SecondPackageDayIndicatorInput, packageDayIndicator);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setOutboundSectionTopPackageDayIndicatorInputRowData(String packageDayIndicator) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_OutboundSection_TopPackageDayIndicatorInput, packageDayIndicator);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setDateRangesSectionAddDepartureDateToInput(String departureDateTo) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_DateRangesSection_AddDepartureDateTo, departureDateTo);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public RecommendedItinerariesPage clickCloseButton() throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(button_Close);
		CommonFunctions.pause(20000, false);
		
		return new RecommendedItinerariesPage();
	}
	
	public RecommendedItinerariesPage clickSaveButton() throws Exception {
		CommonFunctions.clickElement(button_Save);
		CommonFunctions.pause(12500, false);
		
		return new RecommendedItinerariesPage();
	}
	// End - Actions
}