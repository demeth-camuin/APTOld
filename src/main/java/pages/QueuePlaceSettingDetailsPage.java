package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class QueuePlaceSettingDetailsPage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//a[text() = 'Add Queue Details']")
	WebElement button_QueueDetailsSection_AddQueueDetails;
	
	@FindBy(xpath = "//a[text()= 'Close']")
	WebElement button_Close;
	
	@FindBy(xpath = "//a[text()= 'Save Queue Place Rule']")
	WebElement button_SaveQueuePlaceRule;
	
	@FindBy(xpath = "//input[contains(@id, 'IsActive')]")
	WebElement checkbox_Inactive;
	
	@FindBy(xpath = "//label[text() = 'Customer Market']//parent::div//button")
	WebElement dropdown_CustomerMarket;
	
	@FindBy(xpath = "//label[text() = 'Customer Type']//parent::div//button")
	WebElement dropdown_CustomerType;
	
	@FindBy(xpath = "//label[text() = 'Flight Action']//parent::div//button")
	WebElement dropdown_FlightAction;
	
	@FindBy(xpath = "//input[contains(@id, 'AirAdminQueue_QueueName')]")
	WebElement input_SettingName;
	
	@FindBy(xpath = "(//span[contains(text(), 'Flight Type')]//parent::div//a)[2]")
	WebElement rowData_QueueDetailsSection_SecondFlightTypeDropdown;
	
	@FindBy(xpath = "(//span[@class = 'ListRecords' and contains(@id, 'AirAdminQueue')]//span[contains(@class, 'trash')]//parent::a)[1]")
	WebElement rowData_QueueDetailsSection_TopDeleteQueueDetailButton;
	
	@FindBy(xpath = "(//span[contains(text(), 'Flight Type')]//parent::div//a)[1]")
	WebElement rowData_QueueDetailsSection_TopFlightTypeDropdown;
	
	@FindBy(xpath = "(//input[contains(@id, 'txtbx_QueueNumber')])[1]")
	WebElement rowData_QueueDetailsSection_TopGDSQueueNumberInput;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public QueuePlaceSettingDetailsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void clickCustomerMarketDropdownOption(String customerMarketDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerMarket);
		CommonFunctions.clickElement(dropdown_CustomerType);
		CommonFunctions.clickElement(dropdown_CustomerMarket);
		
		if (customerMarketDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_CustomerMarket.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_CustomerMarket.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), customerMarketDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_CustomerMarket.findElement(By.xpath(".//parent::div//ul//span[text() = '" + customerMarketDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
	}
	
	public void clickCustomerTypeDropdownOption(String customerTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerType);
		
		if (customerTypeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_CustomerType.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_CustomerType.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), customerTypeDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_CustomerType.findElement(By.xpath(".//parent::div//ul//span[text() = '" + customerTypeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickFlightActionDropdownOption(String flightActionDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_FlightAction);
		
		if (flightActionDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_FlightAction.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_FlightAction.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), flightActionDropdownOptionValue);
			CommonFunctions.clickElement(dropdown_FlightAction.findElement(By.xpath(".//parent::div//ul//span[text() = '" + flightActionDropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickQueueDetailsSectionAddQueueDetailsButton() throws Exception {
		CommonFunctions.clickElement(button_QueueDetailsSection_AddQueueDetails);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickQueueDetailsSectionSecondFlightTypeDropdownRowDataOption(String flightTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(rowData_QueueDetailsSection_SecondFlightTypeDropdown);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flightTypeDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickQueueDetailsSectionTopDeleteQueueDetailButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_QueueDetailsSection_TopDeleteQueueDetailButton);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickQueueDetailsSectionTopFlightTypeDropdownRowDataOption(String flightTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(rowData_QueueDetailsSection_TopFlightTypeDropdown);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), flightTypeDropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void containsValueCustomerMarketDropdown(String expectedCustomerMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerMarket.findElement(By.xpath(".//span")), expectedCustomerMarket);
	}
	
	public void containsValueCustomerTypeDropdown(String expectedCustomerType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerType.findElement(By.xpath(".//span")), expectedCustomerType);
	}
	
	public void containsValueFlightActionDropdown(String expectedFlightAction) throws Exception {
		CommonFunctions.elementContainsText(dropdown_FlightAction.findElement(By.xpath(".//span")), expectedFlightAction);
	}
	
	public void containsValueQueueDetailsSectionSecondFlightTypeDropdownRowData(String expectedFlightType) throws Exception {
		CommonFunctions.elementContainsText(rowData_QueueDetailsSection_SecondFlightTypeDropdown.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedFlightType);
	}
	
	public void containsValueQueueDetailsSectionTopFlightTypeDropdownRowData(String expectedFlightType) throws Exception {
		CommonFunctions.elementContainsText(rowData_QueueDetailsSection_TopFlightTypeDropdown.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedFlightType);
	}
	
	public void containsValueQueueDetailsSectionTopGDSQueueNumberInputRowData(String expectedGDSQueueNumber) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_QueueDetailsSection_TopGDSQueueNumberInput, "value", expectedGDSQueueNumber);
	}
	
	public void displayedCloseButton() throws Exception {
		CommonFunctions.elementDisplayed(button_Close);
	}
	
	public void displayedSaveQueuePlaceRuleButton() throws Exception {
		CommonFunctions.elementDisplayed(button_SaveQueuePlaceRule);
	}
	
	public void displayedInactiveCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_Inactive);
	}
	
	public void enabledCustomerMarketDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CustomerMarket);
	}
	
	public void enabledCustomerTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CustomerType);
	}
	
	public void enabledFlightActionDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_FlightAction);
	}
	
	public void enabledInactiveCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_Inactive);
	}
	
	public void enabledQueueDetailsSectionTopFlightTypeDropdownRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_QueueDetailsSection_TopFlightTypeDropdown);
	}
	
	public void enabledQueueDetailsSectionTopGDSQueueNumberInputRowData() throws Exception {
		CommonFunctions.elementEnabled(rowData_QueueDetailsSection_TopGDSQueueNumberInput);
	}
	
	public void enabledSettingNameInput() throws Exception {
		CommonFunctions.elementEnabled(input_SettingName);
	}
	
	public void setQueueDetailsSectionTopGDSQueueNumberInputRowData(String gdsQueueNumber) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_QueueDetailsSection_TopGDSQueueNumberInput, gdsQueueNumber);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setSettingNameInput(String settingName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_SettingName, settingName);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public QueuePlaceSettingsPage clickCloseButton() throws Exception {
		CommonFunctions.clickElement(button_Close);
		CommonFunctions.pause(5000, false);
		
		return new QueuePlaceSettingsPage();
	}
	
	public QueuePlaceSettingsPage clickSaveQueuePlaceRuleButton() throws Exception {
		CommonFunctions.clickElement(button_SaveQueuePlaceRule);
		CommonFunctions.pause(6000, false);
		
		return new QueuePlaceSettingsPage();
	}
	// End - Actions
}