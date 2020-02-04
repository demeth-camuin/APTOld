package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class SupplierDetailsPage extends Base {
	// Start - Page Objects
	// Start - Main Page Objects
	@FindBy(xpath = "//div[text() = 'Additional Addresses']")
	WebElement accordion_AdditionalAddresses;
	
	@FindBy(xpath = "//div[text() = 'Additional Contacts']")
	WebElement accordion_AdditionalContacts;
	
	@FindBy(xpath = "//div[text() = 'Airline']")
	WebElement accordion_Airline;
	
	@FindBy(xpath = "//div[text() = 'Location Contact and Address']")
	WebElement accordion_LocationContactAndAddress;
	
	@FindBy(xpath = "//div[text() = 'Sage']")
	WebElement accordion_Sage;
	
	@FindBy(xpath = "//div[text() = 'Third Party']")
	WebElement accordion_ThirdParty;
	
	@FindBy(xpath = "//a[contains(@id, 'AddAirlineClassLink')]")
	WebElement button_AirlineSection_AddAirlineClass;
	
	@FindBy(xpath = "//a[contains(@id, 'AddPriceEntryCodeLink')]")
	WebElement button_AirlineSection_AddPriceEntryCode;
	
	@FindBy(xpath = "//a[contains(@id, 'EditAirlineClassLink')]")
	WebElement button_AirlineSection_EditAirlineClass;
	
	@FindBy(xpath = "//a[contains(@id, 'EditPriceLink')]")
	WebElement button_AirlineSection_EditPriceEntryCode;
	
	@FindBy(xpath = "//div[contains(@id, 'LocationDetailsContainer')]//a[contains(@id, 'LocationEmailAdd')]")
	WebElement button_LocationContactAndAddressSection_AddEmailAddress;
	
	@FindBy(xpath = "//a[contains(@id, 'SupplierViewTable')]//span")
	WebElement button_SageSection_Delete;
	
	@FindBy(xpath = "//input[contains(@id, 'ButtonAddRollUp')]")
	WebElement button_SageSection_ManageRollup;
	
	@FindBy(xpath = "//a[contains(@id, 'ThirdPartyPopup')]")
	WebElement button_ThirdPartySection_AddThirdPartySupplier;
	
	@FindBy(xpath = "//input[contains(@value, 'Close')]")
	WebElement button_TopClose;
	
	@FindBy(xpath = "//input[contains(@id, 'SaveAltTop')]")
	WebElement button_TopSave;
	
	@FindBy(xpath = "//input[contains(@id, 'CheckBox_CopyToBA')]")
	WebElement checkbox_LocationContactAndAddressSection_CopyToBillingAddress;
	
	@FindBy(xpath = "//input[contains(@id, 'CheckBox_CopyToCA')]")
	WebElement checkbox_LocationContactAndAddressSection_CopyToCorrespondenceAddress;
	
	@FindBy(xpath = "//input[contains(@id, 'BillingtoThirdParty_Checkbox')]")
	WebElement checkbox_ThirdPartySection_BillingToThirdParty;
	
	@FindBy(xpath = "//input[contains(@id, 'CorrespondenceToThirdParty_Checkbox')]")
	WebElement checkbox_ThirdPartySection_CorrespondenceToThirdParty;
	
	@FindBy(xpath = "//input[contains(@id, 'PrintVoucherForThirdParty_Checkbox')]")
	WebElement checkbox_ThirdPartySection_PrintVoucherForThirdParty;
	
	@FindBy(xpath = "//select[contains(@id, 'ComboBox_BAContactType')]")
	WebElement dropdown_AdditionalAddressesSection_BillingContactType;
	
	@FindBy(xpath = "//div[contains(@id, 'Countries_BACity')]")
	WebElement dropdown_AdditionalAddressesSection_BillingCountry;
	
	@FindBy(xpath = "//select[contains(@id, 'BAStateDropdown')]")
	WebElement dropdown_AdditionalAddressesSection_BillingState;
	
	@FindBy(xpath = "//select[contains(@id, 'ComboBox_CAContactType')]")
	WebElement dropdown_AdditionalAddressesSection_CorrespondenceContactType;
	
	@FindBy(xpath = "//div[contains(@id, 'CACountryDropdown')]")
	WebElement dropdown_AdditionalAddressesSection_CorrespondenceCountry;
	
	@FindBy(xpath = "//select[contains(@id, 'CaStateDropdown')]")
	WebElement dropdown_AdditionalAddressesSection_CorrespondenceState;
	
	@FindBy(xpath = "//div[contains(@id, 'BasiCityDropdown')]")
	WebElement dropdown_City;
	
	@FindBy(xpath = "//div[contains(@id, 'LocationCountryDropdown')]")
	WebElement dropdown_LocationContactAndAddressSection_Country;
	
	@FindBy(xpath = "//select[contains(@id, 'LocationStateDropdown')]")
	WebElement dropdown_LocationContactAndAddressSection_State;
	
	@FindBy(xpath = "//input[contains(@id, 'BAAddressLine1')]")
	WebElement input_AdditionalAddressesSection_BillingAddressLine1;
	
	@FindBy(xpath = "//input[contains(@id, 'BAAddressLine2')]")
	WebElement input_AdditionalAddressesSection_BillingAddressLine2;
	
	@FindBy(xpath = "//input[contains(@id, 'BAAddressLine3')]")
	WebElement input_AdditionalAddressesSection_BillingAddressLine3;
	
	@FindBy(xpath = "//input[contains(@id, 'BACityInput')]")
	WebElement input_AdditionalAddressesSection_BillingCity;
	
	@FindBy(xpath = "//input[contains(@id, 'BaSearchInput')]")
	WebElement input_AdditionalAddressesSection_BillingLocationSearch;
	
	@FindBy(xpath = "//input[contains(@id, 'BAZipCodeInput')]")
	WebElement input_AdditionalAddressesSection_BillingPostcode;
	
	@FindBy(xpath = "//input[contains(@id, 'CAAddressLine1')]")
	WebElement input_AdditionalAddressesSection_CorrespondenceAddressLine1;
	
	@FindBy(xpath = "//input[contains(@id, 'CAAddressLine2')]")
	WebElement input_AdditionalAddressesSection_CorrespondenceAddressLine2;
	
	@FindBy(xpath = "//input[contains(@id, 'CAAddressLine3')]")
	WebElement input_AdditionalAddressesSection_CorrespondenceAddressLine3;
	
	@FindBy(xpath = "//input[contains(@id, 'CACity')]")
	WebElement input_AdditionalAddressesSection_CorrespondenceCity;
	
	@FindBy(xpath = "//input[contains(@id, 'CASearchInput')]")
	WebElement input_AdditionalAddressesSection_CorrespondenceLocationSearch;
	
	@FindBy(xpath = "//input[contains(@id, 'CAZip')]")
	WebElement input_AdditionalAddressesSection_CorrespondencePostcode;
	
	@FindBy(xpath = "//div[contains(@id, 'Reservations')]//input[contains(@id, 'Input_FN')]")
	WebElement input_AdditionalContactsSection_ReservationsFirstName;
	
	@FindBy(xpath = "//input[contains(@id, 'AirlineCode_Textbox')]")
	WebElement input_AirlineSection_AirlineCode;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_AdLine1')]")
	WebElement input_LocationContactAndAddressSection_AddressLine1;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_AdLine2')]")
	WebElement input_LocationContactAndAddressSection_AddressLine2;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_AdLine3')]")
	WebElement input_LocationContactAndAddressSection_AddressLine3;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_City')]")
	WebElement input_LocationContactAndAddressSection_City;
	
	@FindBy(xpath = "//input[contains(@id, 'LocationSearchInput')]")
	WebElement input_LocationContactAndAddressSection_LocationSearch;
	
	@FindBy(xpath = "//input[contains(@id, 'LocationSearchInput') and contains(@class, 'disabled')]")
	WebElement input_LocationContactAndAddressSection_LocationSearchDisabled;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_Postcode')]")
	WebElement input_LocationContactAndAddressSection_Postcode;
	
	@FindBy(xpath = "//input[contains(@id, 'NameInput')]")
	WebElement input_Name;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_Phone')]")
	WebElement input_Phone;
	
	@FindBy(xpath = "(//table[contains(@id, 'SelectedAirclassTableRecords')]//td)[1]")
	WebElement rowData_AirlineSection_TopClassCode;
	// End - Main Page Objects
	
	// Start - Third Party Popup Objects
	@FindBy(xpath = "//input[@value = 'Add Third Party']")
	WebElement button_ThirdPartyPopup_AddThirdParty;
	
	@FindBy(xpath = "//input[@value = 'Cancel']")
	WebElement button_ThirdPartyPopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'SearchLink')]")
	WebElement button_ThirdPartyPopup_Find;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_CountryName')]")
	WebElement input_ThirdPartyPopup_City;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_SupplierName')]")
	WebElement input_ThirdPartyPopup_Name;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[2]")
	WebElement input_ThirdPartyPopup_NameFilter;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Id')])[2]")
	WebElement rowData_ThirdPartyPopup_TopId;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Name')])[2]")
	WebElement rowData_ThirdPartyPopup_TopName;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'City')])[2]")
	WebElement rowData_ThirdPartyPopup_TopCity;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Country')])[2]")
	WebElement rowData_ThirdPartyPopup_TopCountry;
	// End - Third Party Popup Objects
	
	// Start - Airline Class Popup Objects
	@FindBy(xpath = "//div[contains(@class, 'IconButton')]//a[contains(@id, 'AddAirlineClass')]")
	WebElement button_AirlineClassPopup_Add;
	
	@FindBy(xpath = "//input[@value = 'Save']")
	WebElement button_AirlineClassPopup_Save;
	// End - Airline Class Popup Objects
	
	// Start - Price Entry Code Popup Objects
	@FindBy(xpath = "//div[contains(@class, 'IconButton')]//a[contains(@id, 'AddAirlineClass')]")
	WebElement button_PriceEntryCodePopup_Add;
	
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement button_PriceEntryCodePopup_Cancel;
	
	@FindBy(xpath = "//input[@value = 'Save']")
	WebElement button_PriceEntryCodePopup_Save;
	
	@FindBy(xpath = "//div[contains(@id, 'PriceEntryForm')]//select[contains(@id, 'PriceEntry_Combobox')]")
	WebElement dropdown_PriceEntryCodePopup_PriceEntry;
	
	@FindBy(xpath = "//select[contains(@id, 'SelectedPriceEntry_Combobox')]")
	WebElement dropdown_PriceEntryCodePopup_SelectedPriceEntry;
	
	@FindBy(xpath = "//div[contains(@id, 'PriceEntryForm')]//input[contains(@id, 'CostCalcRate_Textbox')]")
	WebElement input_PriceEntryCodePopup_CostCalcRate;
	
	@FindBy(xpath = "//div[contains(@id, 'PriceEntryForm')]//input[contains(@id, 'PriceCalcRate_Textbox')]")
	WebElement input_PriceEntryCodePopup_PriceCalcRate;
	
	@FindBy(xpath = "//div[contains(@id, 'PriceEntryForm')]//input[contains(@id, 'PriceEntryCode_Textbox')]")
	WebElement input_PriceEntryCodePopup_PriceEntryCode;
	
	@FindBy(xpath = "//input[contains(@id, 'SelectedPriceEntryCode_Textbox')]")
	WebElement input_PriceEntryCodePopup_SelectedPriceEntryCode;
	// End - Price Entry Code Popup Objects
	
	// Start - Rollup Popup Objects
	@FindBy(xpath = "//div[contains(@class, 'IconButton')]//a[contains(@id, 'AddAirlineClass')]")
	WebElement button_RollupPopup_Add;
	
	@FindBy(xpath = "//input[contains(@value, 'Remove')]")
	WebElement button_RollupPopup_Remove;
	
	@FindBy(xpath = "//input[@value = 'Save']")
	WebElement button_RollupPopup_Save;
	
	@FindBy(xpath = "//label[contains(text(), 'Rollup Option')]//following-sibling::select")
	WebElement dropdown_RollupPopup_Option;
	
	@FindBy(xpath = "//input[contains(@id, 'Effectivity')]")
	WebElement input_RollupPopup_EffectiveDate;
	// End - Rollup Popup Objects
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public SupplierDetailsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	// Start - Main Page Actions
	public void checkLocationContactAndAddressSectionCopyToBillingAddressCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_LocationContactAndAddressSection_CopyToBillingAddress);
	}
	
	public void checkLocationContactAndAddressSectionCopyToCorrespondenceAddressCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_LocationContactAndAddressSection_CopyToCorrespondenceAddress);
	}
	
	public void checkThirdPartySectionPrintVoucherForThirdPartyCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_ThirdPartySection_PrintVoucherForThirdParty);
	}
	
	public void clickAdditionalAddressesAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_AdditionalAddresses);
	}
	
	public void clickAdditionalContactsAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_AdditionalContacts);
	}
	
	public void clickAirlineAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Airline);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickAirlineSectionAddAirlineClassButton() throws Exception {
		CommonFunctions.clickElement(button_AirlineSection_AddAirlineClass);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//input[@value = 'Save']");
	}
	
	public void clickAirlineSectionAddPriceEntryCodeButton() throws Exception {
		CommonFunctions.clickElement(button_AirlineSection_AddPriceEntryCode);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//input[@value = 'Save']");
	}
	
	public void clickAirlineSectionEditAirlineClassButton() throws Exception {
		CommonFunctions.clickElement(button_AirlineSection_EditAirlineClass);
		CommonFunctions.pause(2500, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//input[@value = 'Save']");
	}
	
	public void clickAirlineSectionEditPriceEntryCodeButton() throws Exception {
		CommonFunctions.clickElement(button_AirlineSection_EditPriceEntryCode);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//input[@value = 'Save']");
	}
	
	public void clickLocationContactAndAddressAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_LocationContactAndAddress);
	}
	
	public void clickLocationContactAndAddressSectionAddEmailAddressButton() throws Exception {
		CommonFunctions.clickElement(button_LocationContactAndAddressSection_AddEmailAddress);
	}
	
	public void clickLocationContactAndAddressSectionCopyToBillingAddressCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_LocationContactAndAddressSection_CopyToBillingAddress);
	}
	
	public void clickLocationContactAndAddressSectionCopyToCorrespondenceAddressCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_LocationContactAndAddressSection_CopyToCorrespondenceAddress);
	}
	
	public void clickSageAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Sage);
	}
	
	public void clickSageSectionDeleteButton() throws Exception {
		CommonFunctions.clickElement(button_SageSection_Delete);
	}
	
	public void clickSageSectionManageRollupButton() throws Exception {
		CommonFunctions.clickElement(button_SageSection_ManageRollup);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Sage')]//input[@value = 'Save']");
	}
	
	public void clickThirdPartyAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_ThirdParty);
	}
	
	public void clickThirdPartySectionAddThirdPartySupplierButton() throws Exception {
		CommonFunctions.clickElement(button_ThirdPartySection_AddThirdPartySupplier);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//input[@value = 'Add Third Party']");
	}
	
	public void clickThirdPartySectionBillingToThirdPartyCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_ThirdPartySection_BillingToThirdParty);
	}
	
	public void clickThirdPartySectionCorrespondenceToThirdPartyCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_ThirdPartySection_CorrespondenceToThirdParty);
	}
	
	public void containsValueAirlineSectionTopRowDataClassCode(String expectedClassCode) throws Exception {
		CommonFunctions.elementContainsText(rowData_AirlineSection_TopClassCode, expectedClassCode);
	}
	
	public void containsValueLocationContactAndAddressSectionCountryDropdown(String expectedCountry) throws Exception {
		CommonFunctions.elementContainsText(dropdown_LocationContactAndAddressSection_Country, expectedCountry);
	}
	
	public void disabledLocationContactAndAddressSectionLocationSearchInput() throws Exception {
		CommonFunctions.elementDisplayed(input_LocationContactAndAddressSection_LocationSearchDisabled);
	}
	
	public void disabledLocationContactAndAddressSectionAddressLine1Input() throws Exception {
		CommonFunctions.elementAttributeContains(input_LocationContactAndAddressSection_AddressLine1, "readonly", "true");
	}
	
	public void disabledLocationContactAndAddressSectionAddressLine2Input() throws Exception {
		CommonFunctions.elementAttributeContains(input_LocationContactAndAddressSection_AddressLine2, "readonly", "true");
	}
	
	public void disabledLocationContactAndAddressSectionAddressLine3Input() throws Exception {
		CommonFunctions.elementAttributeContains(input_LocationContactAndAddressSection_AddressLine3, "readonly", "true");
	}
	
	public void disabledLocationContactAndAddressSectionCityInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_LocationContactAndAddressSection_City, "readonly", "true");
	}
	
	public void disabledLocationContactAndAddressSectionPostcodeInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_LocationContactAndAddressSection_Postcode, "readonly", "true");
	}
	
	public void disabledLocationContactAndAddressSectionStateDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_LocationContactAndAddressSection_State, "disabled", "true");
	}
	
	public void displayedThirdPartySectionBillingToThirdPartyCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ThirdPartySection_BillingToThirdParty);
	}
	
	public void displayedThirdPartySectionCorrespondenceToThirdPartyCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ThirdPartySection_CorrespondenceToThirdParty);
	}
	
	public void enabledAdditionalAddressesSectionBillingAddressLine1Input() throws Exception {
		CommonFunctions.elementEnabled(input_AdditionalAddressesSection_BillingAddressLine1);
	}
	
	public void enabledAdditionalAddressesSectionBillingAddressLine2Input() throws Exception {
		CommonFunctions.elementEnabled(input_AdditionalAddressesSection_BillingAddressLine2);
	}
	
	public void enabledAdditionalAddressesSectionBillingAddressLine3Input() throws Exception {
		CommonFunctions.elementEnabled(input_AdditionalAddressesSection_BillingAddressLine3);
	}
	
	public void enabledAdditionalAddressesSectionBillingCityInput() throws Exception {
		CommonFunctions.elementEnabled(input_AdditionalAddressesSection_BillingCity);
	}
	
	public void enabledAdditionalAddressesSectionBillingPostcodeInput() throws Exception {
		CommonFunctions.elementEnabled(input_AdditionalAddressesSection_BillingPostcode);
	}
	
	public void enabledAdditionalAddressesSectionBillingStateDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_AdditionalAddressesSection_BillingState);
	}
	
	public void enabledAdditionalAddressesSectionCorrespondenceAddressLine1Input() throws Exception {
		CommonFunctions.elementEnabled(input_AdditionalAddressesSection_CorrespondenceAddressLine1);
	}
	
	public void enabledAdditionalAddressesSectionCorrespondenceAddressLine2Input() throws Exception {
		CommonFunctions.elementEnabled(input_AdditionalAddressesSection_CorrespondenceAddressLine2);
	}
	
	public void enabledAdditionalAddressesSectionCorrespondenceAddressLine3Input() throws Exception {
		CommonFunctions.elementEnabled(input_AdditionalAddressesSection_CorrespondenceAddressLine3);
	}
	
	public void enabledAdditionalAddressesSectionCorrespondenceCityInput() throws Exception {
		CommonFunctions.elementEnabled(input_AdditionalAddressesSection_CorrespondenceCity);
	}
	
	public void enabledAdditionalAddressesSectionCorrespondencePostcodeInput() throws Exception {
		CommonFunctions.elementEnabled(input_AdditionalAddressesSection_CorrespondencePostcode);
	}
	
	public void enabledAdditionalAddressesSectionCorrespondenceStateDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_AdditionalAddressesSection_CorrespondenceState);
	}
	
	public void enabledLocationContactAndAddressSectionAddressLine1Input() throws Exception {
		CommonFunctions.elementEnabled(input_LocationContactAndAddressSection_AddressLine1);
	}
	
	public void enabledLocationContactAndAddressSectionAddressLine2Input() throws Exception {
		CommonFunctions.elementEnabled(input_LocationContactAndAddressSection_AddressLine2);
	}
	
	public void enabledLocationContactAndAddressSectionAddressLine3Input() throws Exception {
		CommonFunctions.elementEnabled(input_LocationContactAndAddressSection_AddressLine3);
	}
	
	public void enabledLocationContactAndAddressSectionCityInput() throws Exception {
		CommonFunctions.elementEnabled(input_LocationContactAndAddressSection_City);
	}
	
	public void enabledLocationContactAndAddressSectionPostcodeInput() throws Exception {
		CommonFunctions.elementEnabled(input_LocationContactAndAddressSection_Postcode);
	}
	
	public void enabledLocationContactAndAddressSectionStateDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_LocationContactAndAddressSection_State);
	}
	
	public void enabledSageSectionManageRollupButton() throws Exception {
		CommonFunctions.elementEnabled(button_SageSection_ManageRollup);
	}
	
	public void selectAdditionalAddressesSectionBillingContactTypeValue(String billingContactTypeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_AdditionalAddressesSection_BillingContactType, billingContactTypeValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectAdditionalAddressesSectionCorrespondenceContactTypeValue(String correspondenceContactTypeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_AdditionalAddressesSection_CorrespondenceContactType, correspondenceContactTypeValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectAdditionalAddressesSectionBillingCountryValue(String billingCountryValue) throws Exception {
		CommonFunctions.clickElement(dropdown_AdditionalAddressesSection_BillingCountry);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), billingCountryValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectAdditionalAddressesSectionCorrespondenceCountryValue(String correspondenceCountryValue) throws Exception {
		CommonFunctions.clickElement(dropdown_AdditionalAddressesSection_CorrespondenceCountry);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), correspondenceCountryValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectCityValue(String cityValue) throws Exception {
		CommonFunctions.clickElement(dropdown_City);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), cityValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectLocationContactAndAddressSectionCountryValue(String countryValue) throws Exception {
		CommonFunctions.clickElement(dropdown_LocationContactAndAddressSection_Country);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), countryValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void setAdditionalAddressesSectionBillingLocationSearchInput(String locationSearch) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AdditionalAddressesSection_BillingLocationSearch, locationSearch);
	}
	
	public void setAdditionalAddressesSectionCorrespondenceLocationSearchInput(String locationSearch) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AdditionalAddressesSection_CorrespondenceLocationSearch, locationSearch);
	}
	
	public void setAdditionalContactsSectionReservationsFirstNameInput(String firstName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AdditionalContactsSection_ReservationsFirstName, firstName);
	}
	
	public void setAirlineSectionAirlineCodeInput(String airlineCode) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AirlineSection_AirlineCode, airlineCode);
	}
	
	public void setLocationContactAndAddressSectionAddressLine1Input(String addressLine1) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_LocationContactAndAddressSection_AddressLine1, addressLine1);
	}
	
	public void setLocationContactAndAddressSectionCityInput(String city) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_LocationContactAndAddressSection_City, city);
	}
	
	public void setLocationContactAndAddressSectionEmailInput(String email) throws Exception {
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@id, 'LocationDetailsContainer')]//input[contains(@id, 'EmailInput')]"), email);
		CommonFunctions.pause(1000, false);
	}
	
	public void setLocationContactAndAddressSectionLocationSearchInput(String locationSearch) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_LocationContactAndAddressSection_LocationSearch, locationSearch);
	}
	
	public void setPhoneInput(String phone) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Phone, phone);
	}
	
	public SuppliersPage clickTopCloseButton() throws Exception {
		CommonFunctions.clickElement(button_TopClose);
		
		return new SuppliersPage();
	}
	
	public SuppliersPage clickTopSaveButton() throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickElement(button_TopSave);
		
		return new SuppliersPage();
	}
	
	public String setNameInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Name, name);
		
		return name;
	}
	// End - Main Page Actions
	
	// Start - Third Party Popup Actions
	public void clickThirdPartyPopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_ThirdPartyPopup_AddThirdParty);
	}
	
	public void clickThirdPartyPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_ThirdPartyPopup_Cancel);
	}
	
	public void clickThirdPartyPopupFindButton() throws Exception {
		CommonFunctions.clickElement(button_ThirdPartyPopup_Find);
	}
	
	public void clickThirdPartyPopupName() throws Exception {
		CommonFunctions.clickElement(rowData_ThirdPartyPopup_TopName);
	}
	
	public void containsValueThirdPartyPopupTopRowDataId(String expectedId) throws Exception {
		CommonFunctions.elementContainsText(rowData_ThirdPartyPopup_TopId, expectedId);
	}
	
	public void containsValueThirdPartyPopupTopRowDataName(String expectedName) throws Exception {
		CommonFunctions.elementContainsText(rowData_ThirdPartyPopup_TopName, expectedName);
	}
	
	public void containsValueThirdPartyPopupTopRowDataCity(String expectedCity) throws Exception {
		CommonFunctions.elementContainsText(rowData_ThirdPartyPopup_TopCity, expectedCity);
	}
	
	public void containsValueThirdPartyPopupTopRowDataCountry(String expectedCountry) throws Exception {
		CommonFunctions.elementContainsText(rowData_ThirdPartyPopup_TopCountry, expectedCountry);
	}
	
	public void setThirdPartyPopupCityInput(String thirdPartyCity) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ThirdPartyPopup_City, thirdPartyCity);
	}
	
	public void setThirdPartyPopupNameInput(String thirdPartyName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ThirdPartyPopup_Name, thirdPartyName);
	}
	
	public void setThirdPartyPopupNameFilterInput(String thirdPartyName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ThirdPartyPopup_NameFilter, thirdPartyName);
	}
	// End - Third Party Popup Actions
	
	// Start - Airline Class Popup Actions
	public void clickAirlineClassPopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_AirlineClassPopup_Add);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickAirlineClassPopupSaveButton() throws Exception {
		CommonFunctions.clickElement(button_AirlineClassPopup_Save);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickAirlineClassPopupDeleteButton() throws Exception {
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//table[contains(@id, 'SelectedAirlineClassTableRecords')]//td//a"));
	}
	
	public void setAirlineClassPopupAirlineClassCodeInput(String airlineClassCode) throws Exception {
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'AirclassCode_Textbox')]"), airlineClassCode);
	}
	// End - Airline Class Popup Actions
	
	// Start - Price Entry Code Popup Actions
	public void clickPriceEntryCodePopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_PriceEntryCodePopup_Add);
	}
	
	public void clickPriceEntryCodePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_PriceEntryCodePopup_Cancel);
	}
	
	public void clickPriceEntryCodePopupLastRowDataDeleteButton() throws Exception {
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//table[contains(@id, 'SelectedPriceEntryTableRecords')]//span[contains(@class, 'fa-trash-alt')]"));
	}
	
	public void clickPriceEntryCodePopupSaveButton() throws Exception {
		CommonFunctions.clickElement(button_PriceEntryCodePopup_Save);
		CommonFunctions.pause(2500, false);
	}
	
	public void containsValuePriceEntryCodePopupPriceEntryCodeInput(String expectedPriceEntryCode) throws Exception {
		CommonFunctions.elementContainsText(input_PriceEntryCodePopup_SelectedPriceEntryCode, expectedPriceEntryCode);
	}
	
	public void disabledPriceEntryCodePopupPriceEntryDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_PriceEntryCodePopup_SelectedPriceEntry, "disabled", "true");
	}
	
	public void selectPriceEntryCodePopupPriceEntryValue(String priceEntryValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PriceEntryCodePopup_PriceEntry, priceEntryValue);
	}
	
	public void setPriceEntryCodePopupCostCalcRateInput(String costCalcRate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PriceEntryCodePopup_CostCalcRate, costCalcRate);
	}
	
	public void setPriceEntryCodePopupPriceCalcRateInput(String priceCalcRate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PriceEntryCodePopup_PriceCalcRate, priceCalcRate);
	}
	
	public void setPriceEntryCodePopupPriceEntryCodeInput(String priceEntryCode) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PriceEntryCodePopup_PriceEntryCode, priceEntryCode);
	}
	// End - Price Entry Code Popup Actions
	
	// Start - Rollup Popup Actions
	public void clickRollupPopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_RollupPopup_Add);
	}
	
	public void clickRollupPopupRemoveButton() throws Exception {
		CommonFunctions.clickElement(button_RollupPopup_Remove);
	}
	
	public void clickRollupPopupSaveButton() throws Exception {
		CommonFunctions.clickElement(button_RollupPopup_Save);
	}
	
	public void selectRollupPopupOptionValue(String optionValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_RollupPopup_Option, optionValue);
	}
	
	public void setRollupPopupEffectiveDateInput(String effectiveDate) throws Exception {
		CommonFunctions.clickElement(input_RollupPopup_EffectiveDate);
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//div[contains(text(), '×')]"));
		CommonFunctions.clearThenEnterElementValue(input_RollupPopup_EffectiveDate, effectiveDate);
	}
	// End - Rollup Popup Actions
	// End - Actions
}