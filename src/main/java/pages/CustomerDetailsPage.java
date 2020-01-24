package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class CustomerDetailsPage extends Base {
	// Start - Page Objects
	// Start - Main Page Objects
	@FindBy(xpath = "//div[text() = 'Addresses']")
	WebElement accordion_Addresses;
	
	@FindBy(xpath = "//div[text() = 'Billing']")
	WebElement accordion_Billing;
	
	@FindBy(xpath = "//div[text() = 'Trade Booking Setup']")
	WebElement accordion_TradeBookingSetup;
	
	@FindBy(xpath = "(//input[contains(@value, 'Close')])[2]")
	WebElement button_BottomClose;
	
	@FindBy(xpath = "//input[contains(@id, 'SaveAltBottom')]")
	WebElement button_BottomSave;
	
	@FindBy(xpath = "//input[contains(@id, 'addTradeSiteAccess')]")
	WebElement button_TradeBookingSetupSection_AddProductAccessLevel;
	
	@FindBy(xpath = "//span[contains(@id, 'BccLink')]//parent::a")
	WebElement button_TradeBookingSetupSection_BccEmail;
	
	@FindBy(xpath = "//a[contains(@id, 'ccLink')]")
	WebElement button_TradeBookingSetupSection_CcEmail;
	
	@FindBy(xpath = "//label[contains(text(), 'Copy to Postal Address')]//parent::div//preceding-sibling::div//input")
	WebElement checkbox_AddressesSection_CopyToPostalAddress;
	
	@FindBy(xpath = "//div[contains(text(), 'GST/VAT')]//preceding-sibling::div//input")
	WebElement checkbox_BillingSection_GSTVATApplicable;
	
	@FindBy(xpath = "//label[contains(text(), 'Exclude from CRM')]//parent::div//preceding-sibling::div//input")
	WebElement checkbox_ExcludeFromCRM;
	
	@FindBy(xpath = "//label[contains(text(), 'Special Fares')]//parent::div//preceding-sibling::div//input")
	WebElement checkbox_SpecialFares;
	
	@FindBy(xpath = "//input[contains(@id, 'TradeSiteAccessCheckbox')]")
	WebElement checkbox_TradeBookingSetupSection_APTGroupSiteAccess;
	
	@FindBy(xpath = "//div[contains(text(), 'Create Bookings')]//preceding-sibling::div//input")
	WebElement checkbox_TradeBookingSetupSection_CreateBookings;
	
	@FindBy(xpath = "//div[contains(text(), 'Edit Bookings')]//preceding-sibling::div//input")
	WebElement checkbox_TradeBookingSetupSection_EditBookings;
	
	@FindBy(xpath = "//div[contains(text(), 'Edit All Bookings')]//preceding-sibling::div//input")
	WebElement checkbox_TradeBookingSetupSection_EditAllBookings;
	
	@FindBy(xpath = "//div[contains(@id, 'HideCommisionContainer')]//input")
	WebElement checkbox_TradeBookingSetupSection_HideCommission;
	
	@FindBy(xpath = "//div[contains(@id, 'LockedCheckbox_Container')]//input")
	WebElement checkbox_TradeBookingSetupSection_Locked;
	
	@FindBy(xpath = "//div[contains(@id, 'SendEmailYesNoContainer')]//input")
	WebElement checkbox_TradeBookingSetupSection_SendEmailRegistration;
	
	@FindBy(xpath = "//div[contains(text(), 'View All Customer Markets')]//preceding-sibling::div//input")
	WebElement checkbox_TradeBookingSetupSection_ViewAllCustomerMarkets;
	
	@FindBy(xpath = "//div[contains(text(), 'View All Bookings')]//preceding-sibling::div//input")
	WebElement checkbox_TradeBookingSetupSection_ViewAllBookings;
	
	@FindBy(xpath = "//span[text() = 'Accounts Contact']//ancestor::div[contains(@class, 'MarginGutter')]")
	WebElement container_BillingSection_AccountsContract;
	
	@FindBy(xpath = "//div[contains(@id, 'PaymentContainer')]")
	WebElement container_BillingSection_PaymentMethod;
	
	@FindBy(xpath = "//div[contains(@id, 'LocationCountryDropdown')]")
	WebElement dropdown_AddressesSection_LocationCountry;
	
	@FindBy(xpath = "(//select[contains(@id, 'LocationStateDropdown')])[1]")
	WebElement dropdown_AddressesSection_LocationState;
	
	@FindBy(xpath = "//div[contains(@id, 'PostalCountryDropdown')]")
	WebElement dropdown_AddressesSection_PostalCountry;
	
	@FindBy(xpath = "(//select[contains(@id, 'LocationStateDropdown')])[2]")
	WebElement dropdown_AddressesSection_PostalState;
	
	@FindBy(xpath = "//div[contains(@id, 'AgencyChain_Combobox')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_AgencyChain;
	
	@FindBy(xpath = "//div[contains(@id, 'AgentSubType_Combobox')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_AgentSubType;
	
	@FindBy(xpath = "//div[contains(@id, 'AgentType_Combobox')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_AgentType;
	
	@FindBy(xpath = "//div[contains(@id, 'BDM_Dropdown')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_BDM;
	
	@FindBy(xpath = "//div[contains(@id, 'CommissionType_Dropdown')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_CommissionType;
	
	@FindBy(xpath = "//div[contains(@id, 'DefaultCurrency_Combobox')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_DefaultCurrency;
	
	@FindBy(xpath = "//div[contains(@id, 'CustomerMarket_Combobox')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_Market;
	
	@FindBy(xpath = "//div[contains(@id, 'CustomerStatus_Combobox')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_Status;
	
	@FindBy(xpath = "//div[contains(@id, 'CustomerType_Combobox')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_Type;
	
	@FindBy(xpath = "//div[contains(@id, 'emailBodyContainer')]")
	WebElement form_TradeBookingSetupSection_Email;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_AdLine1')]")
	WebElement input_AddressesSection_LocationAddressLine1;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_AdLine2')]")
	WebElement input_AddressesSection_LocationAddressLine2;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_AdLine3')]")
	WebElement input_AddressesSection_LocationAddressLine3;
	
	@FindBy(xpath = "(//input[contains(@id, 'Input_City')])[1]")
	WebElement input_AddressesSection_LocationCity;
	
	@FindBy(xpath = "(//input[contains(@id, 'LocationSearchInput')])[1]")
	WebElement input_AddressesSection_LocationLocationSearch;
	
	@FindBy(xpath = "(//input[contains(@id, 'Input_Postcode')])[1]")
	WebElement input_AddressesSection_LocationPostCode;
	
	@FindBy(xpath = "(//input[contains(@id, 'LocationSearchInput')])[2]")
	WebElement input_AddressesSection_PostalLocationSearch;
	
	@FindBy(xpath = "//input[contains(@id, 'AgencyManager_Textbox')]")
	WebElement input_AgencyManager;
	
	@FindBy(xpath = "//input[contains(@id, 'CustomerName_Textbox2')]")
	WebElement input_BillingSection_ABNVATNumber;
	
	@FindBy(xpath = "//input[contains(@id, 'PaymentBankAcctInput')]")
	WebElement input_BillingSection_BankAccountNumber;
	
	@FindBy(xpath = "//input[contains(@id, 'PaymentBankTitleInput')]")
	WebElement input_BillingSection_BankAccountTitle;
	
	@FindBy(xpath = "//input[contains(@id, 'PaymentBankBsbInput')]")
	WebElement input_BillingSection_BankBSB;
	
	@FindBy(xpath = "//input[contains(@id, 'AccountEmailInput')]")
	WebElement input_BillingSection_Email;
	
	@FindBy(xpath = "//input[contains(@id, 'Email_Textbox')]")
	WebElement input_Email;
	
	@FindBy(xpath = "//input[contains(@id, 'IATA_Textbox')]")
	WebElement input_IATA;
	
	@FindBy(xpath = "//div[contains(@id, 'CustomerName_Container')]//input[contains(@id, 'CustomerName_Textbox')]")
	WebElement input_Name;
	
	@FindBy(xpath = "//input[contains(@id, 'Phone1_Textbox')]")
	WebElement input_Phone;
	
	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]")
	WebElement input_TradeBookingSetupSection_Password;
	
	@FindBy(xpath = "//input[contains(@id, 'ToEmail2')]")
	WebElement input_TradeBookingSetupSection_ToEmail;
	
	@FindBy(xpath = "//input[contains(@id, 'UsernameInput')]")
	WebElement input_TradeBookingSetupSection_Username;
	
	@FindBy(xpath = "//span[text() = 'Password']//parent::td//following-sibling::td")
	WebElement label_Password;
	
	@FindBy(xpath = "//input[contains(@id, 'ChequeRadio')]")
	WebElement radioButton_Cheque;
	
	@FindBy(xpath = "//input[contains(@id, 'EftRadioButton')]")
	WebElement radioButton_EFT;
	
	@FindBy(xpath = "//table[contains(@id, 'TradeSiteAccess_TableRecords')]//a[contains(@id, 'DeleteLink')]")
	WebElement rowData_TradeSiteAccessSetupSection_TopDeleteProductAccessLevelButton;
	
	@FindBy(xpath = "//table[contains(@id, 'TradeSiteAccess_TableRecords')]//a[contains(@id, 'EditLink')]")
	WebElement rowData_TradeSiteAccessSetupSection_TopEditProductAccessLevelButton;
	
	@FindBy(xpath = "//title[contains(@data-cke-title, '')]//parent::head//following-sibling::body//p")
	WebElement textArea_TradeBookingSetupSection_Email;
	// End - Main Page Objects
	
	// Start - Product Access Level Popup Objects
	@FindBy(xpath = "//form[contains(@action, 'TradeSiteAccess')]//input[contains(@value, 'Cancel')]")
	WebElement button_ProductAccessLevelPopup_Cancel;
	
	@FindBy(xpath = "//form[contains(@action, 'TradeSiteAccess')]//input[contains(@value, 'Save')]")
	WebElement button_ProductAccessLevelPopup_Save;
	
	@FindBy(xpath = "//div[contains(@id, 'TradeSiteForm')]//div[contains(@id, 'Currency_Combobox')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_ProductAccessLevelPopup_Currency;
	
	@FindBy(xpath = "//div[contains(@id, 'TradeSiteForm')]//div[contains(@id, 'Department_Combobox')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_ProductAccessLevelPopup_Department;
	
	@FindBy(xpath = "//div[contains(@id, 'TradeSiteForm')]//div[contains(@id, 'Office_Combobox')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_ProductAccessLevelPopup_Office;
	// End - Product Access Level Popup Objects
	
	// Start - Delete Product Access Level Popup Objects
	@FindBy(xpath = "//form[contains(@action, 'ConfirmationPopUp')]//input[contains(@value, 'Cancel')]")
	WebElement button_DeleteProductAccessLevelPopup_Cancel;
	
	@FindBy(xpath = "//form[contains(@action, 'ConfirmationPopUp')]//input[contains(@value, 'OK')]")
	WebElement button_DeleteProductAccessLevelPopup_OK;
	// End - Delete Product Access Level Popup Objects
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public CustomerDetailsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	// Start - Main Page Actions
	public void checkAddressesSectionCopyToPostalAddressCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_AddressesSection_CopyToPostalAddress);
	}
	
	public void checkBillingSectionChequeRadioButtonIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(radioButton_Cheque);
	}
	
	public void checkExcludeFromCRMCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_ExcludeFromCRM);
	}
	
	public void checkTradeBookingSetupSectionAPTGroupSiteAccessCheckboxIsNotToggled() throws Exception {
		CommonFunctions.elementAttributeDoesNotContains(checkbox_TradeBookingSetupSection_APTGroupSiteAccess.findElement(By.xpath(".//parent::label")), "class", "changed");
	}
	
	public void checkTradeBookingSetupSectionAPTGroupSiteAccessCheckboxIsToggled() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_APTGroupSiteAccess.findElement(By.xpath(".//parent::label")), "class", "changed");
	}
	
	public void checkTradeBookingSetupSectionCreateBookingsCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_TradeBookingSetupSection_CreateBookings);
	}
	
	public void checkTradeBookingSetupSectionEditAllBookingsCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_TradeBookingSetupSection_EditAllBookings);
	}
	
	public void checkTradeBookingSetupSectionEditAllBookingsCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_TradeBookingSetupSection_EditAllBookings);
	}
	
	public void checkTradeBookingSetupSectionEditBookingsCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_TradeBookingSetupSection_EditBookings);
	}
	
	public void checkTradeBookingSetupSectionEditBookingsCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_TradeBookingSetupSection_EditBookings);
	}
	
	public void checkTradeBookingSetupSectionHideCommissionCheckboxIsNotToggled() throws Exception {
		CommonFunctions.elementAttributeDoesNotContains(checkbox_TradeBookingSetupSection_HideCommission.findElement(By.xpath(".//parent::label")), "class", "changed");
	}
	
	public void checkTradeBookingSetupSectionHideCommissionCheckboxIsToggled() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_HideCommission.findElement(By.xpath(".//parent::label")), "class", "changed");
	}
	
	public void checkTradeBookingSetupSectionLockedCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_TradeBookingSetupSection_Locked);
	}
	
	public void checkTradeBookingSetupSectionLockedCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_TradeBookingSetupSection_Locked);
	}
	
	public void checkTradeBookingSetupSectionViewAllBookingsCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_TradeBookingSetupSection_ViewAllBookings);
	}
	
	public void clickAddressesAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Addresses);
	}
	
	public void clickAddressesSectionCopyToPostalAddressCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_AddressesSection_CopyToPostalAddress);
	}
	
	public void clickAddressesSectionPostalStateDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_AddressesSection_PostalState);
	}
	
	public void clickBDMDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_BDM);
	}
	
	public void clickBillingAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Billing);
	}
	
	public void clickBillingSectionChequeRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_Cheque);
	}
	
	public void clickBillingSectionEFTRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_EFT);
	}
	
	public void clickTopRowDataDeleteProductAccessLevelButton() throws Exception {
		CommonFunctions.clickElement(rowData_TradeSiteAccessSetupSection_TopDeleteProductAccessLevelButton);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the record?']");
	}
	
	public void clickTopRowDataEditProductAccessLevelButton() throws Exception {
		CommonFunctions.clickElement(rowData_TradeSiteAccessSetupSection_TopEditProductAccessLevelButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Update Product Access Level']");
	}
	
	public void clickTradeBookingSetupAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_TradeBookingSetup);
	}
	
	public void clickTradeBookingSetupSectionAddProductAccessLevelButton() throws Exception {
		CommonFunctions.clickElement(button_TradeBookingSetupSection_AddProductAccessLevel);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Add Product Access Level']");
	}
	
	public void clickTradeBookingSetupSectionAPTGroupSiteAccessCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_TradeBookingSetupSection_APTGroupSiteAccess.findElement(By.xpath(".//parent::label//parent::div")));
	}
	
	public void clickTradeBookingSetupSectionEditAllBookingsCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_TradeBookingSetupSection_EditAllBookings);
	}
	
	public void clickTradeBookingSetupSectionEditBookingsCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_TradeBookingSetupSection_EditBookings);
	}
	
	public void clickTradeBookingSetupSectionHideCommissionCheckbox() throws Exception {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'HideCommisionContainer')]//label")));
	}
	
	public void clickTradeBookingSetupSectionLockedCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_TradeBookingSetupSection_Locked);
	}
	
	public void clickTradeBookingSetupSectionPasswordInput() throws Exception {
		CommonFunctions.clickElement(input_TradeBookingSetupSection_Password);
	}
	
	public void clickTradeBookingSetupSectionSendEmailRegistrationCheckbox() throws Exception {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'SendEmailYesNoContainer')]//label")));
		CommonFunctions.pause(5000, false);
	}
	
	public void clickTradeBookingSetupSectionViewAllBookingsCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_TradeBookingSetupSection_ViewAllBookings);
	}
	
	public void containsValueAgencyManagerInput(String expectedAgencyManager) throws Exception {
		CommonFunctions.elementContainsText(input_AgencyManager, expectedAgencyManager);
	}
	
	public void containsValueAgencyChainDropdown(String expectedAgencyChain) throws Exception {
		CommonFunctions.elementContainsText(dropdown_AgencyChain, expectedAgencyChain);
	}
	
	public void containsValueBDMDropdown(String expectedBDM) throws Exception {
		CommonFunctions.elementContainsText(dropdown_BDM, expectedBDM);
	}
	
	public void containsValueNameInput(String expectedName) throws Exception {
		CommonFunctions.elementContainsText(input_Name, expectedName);
	}
	
	public void containsValueTradeBookingSetupSectionPassword(String expectedPassword) throws Exception {
		CommonFunctions.elementContainsText(label_Password, expectedPassword);
	}
	
	public void containsValueTradeBookingSetupSectionToEmailInput(String expectedToEmail) throws Exception {
		CommonFunctions.elementAttributeContains(input_TradeBookingSetupSection_ToEmail, "value", expectedToEmail);
	}
	
	public void disabledAddressesSectionLocationAddressLine1Input() throws Exception {
		CommonFunctions.elementAttributeContains(input_AddressesSection_LocationAddressLine1, "readonly", "true");
	}
	
	public void disabledAddressesSectionLocationAddressLine2Input() throws Exception {
		CommonFunctions.elementAttributeContains(input_AddressesSection_LocationAddressLine2, "readonly", "true");
	}
	
	public void disabledAddressesSectionLocationAddressLine3Input() throws Exception {
		CommonFunctions.elementAttributeContains(input_AddressesSection_LocationAddressLine3, "readonly", "true");
	}
	
	public void disabledAddressesSectionLocationCityInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_AddressesSection_LocationCity, "readonly", "true");
	}
	
	public void disabledAddressesSectionLocationPostCodeInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_AddressesSection_LocationPostCode, "readonly", "true");
	}
	
	public void disabledAddressesSectionLocationStateDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_AddressesSection_LocationState, "disabled", "true");
	}
	
	public void disabledAddressesSectionPostalCountryDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_AddressesSection_PostalCountry, "class", "disabled");
	}
	
	public void disabledAgencyChainDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//div[contains(@id, 'AgencyChain_Combobox')]")), "class", "disabled");
	}
	
	public void disabledAgencyManagerInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_AgencyManager, "readonly", "true");
	}
	
	public void disabledAgentSubTypeDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//div[contains(@id, 'AgentSubType_Combobox')]")), "class", "disabled");
	}
	
	public void disabledAgentTypeDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//div[contains(@id, 'AgentType_Combobox')]")), "class", "disabled");
	}
	
	public void disabledAPTPartnerClassDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//div[contains(@id, 'APTPartner_Combobox')]")), "class", "disabled");
	}
	
	public void disabledBDMDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//div[contains(@id, 'BDM_Dropdown')]")), "class", "disabled");
	}
	
	public void disabledBillingSectionABNVATNumberInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_BillingSection_ABNVATNumber, "readonly", "true");
	}
	
	public void disabledBillingSectionGSTVATApplicableCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_BillingSection_GSTVATApplicable, "disabled", "true");
	}
	
	public void disabledCommissionTypeDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//div[contains(@id, 'CommissionType_Dropdown')]")), "class", "disabled");
	}
	
	public void disabledIATAInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_IATA, "readonly", "true");
	}
	
	public void disabledSpecialFaresCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_SpecialFares, "disabled", "true");
	}
	
	public void disabledTradeBookingSetupSectionAddProductAccessLevelButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_TradeBookingSetupSection_AddProductAccessLevel, "disabled", "true");
	}
	
	public void disabledTradeBookingSetupSectionAPTGroupSiteAccessCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_APTGroupSiteAccess, "disabled", "true");
	}
	
	public void disabledTradeBookingSetupSectionCreateBookingsCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_CreateBookings, "disabled", "true");
	}
	
	public void disabledTradeBookingSetupSectionEditAllBookingsCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_EditAllBookings, "disabled", "true");
	}
	
	public void disabledTradeBookingSetupSectionEditBookingsCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_EditBookings, "disabled", "true");
	}
	
	public void disabledTradeBookingSetupSectionHideCommissionCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_HideCommission, "disabled", "true");
	}
	
	public void disabledTradeBookingSetupSectionLockedCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_Locked, "disabled", "true");
	}
	
	public void disabledTradeBookingSetupSectionSendEmailRegistrationCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_SendEmailRegistration, "disabled", "true");
	}
	
	public void disabledTradeBookingSetupSectionViewAllBookingsCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_ViewAllBookings, "disabled", "true");
	}
	
	public void disabledTradeBookingSetupSectionViewAllCustomerMarketsCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_TradeBookingSetupSection_ViewAllCustomerMarkets, "disabled", "true");
	}
	
	public void displayedBDMDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_BDM);
	}
	
	public void displayedBillingSectionAccountsContractContainer() throws Exception {
		CommonFunctions.elementDisplayed(container_BillingSection_AccountsContract);
	}
	
	public void displayedBillingSectionBankAccountNumberInput() throws Exception {
		CommonFunctions.elementDisplayed(input_BillingSection_BankAccountNumber);
	}
	
	public void displayedBillingSectionBankAccountTitleInput() throws Exception {
		CommonFunctions.elementDisplayed(input_BillingSection_BankAccountTitle);
	}
	
	public void displayedBillingSectionBankBSBInput() throws Exception {
		CommonFunctions.elementDisplayed(input_BillingSection_BankBSB);
	}
	
	public void displayedBillingSectionPaymentMethodContainer() throws Exception {
		CommonFunctions.elementDisplayed(container_BillingSection_PaymentMethod);
	}
	
	public void displayedTradeBookingSetupSectionBccEmailButton() throws Exception {
		CommonFunctions.elementDisplayed(button_TradeBookingSetupSection_BccEmail);
	}
	
	public void displayedTradeBookingSetupSectionCcEmailButton() throws Exception {
		CommonFunctions.elementDisplayed(button_TradeBookingSetupSection_CcEmail);
	}
	
	public void displayedTradeBookingSetupSectionEmailForm() throws Exception {
		CommonFunctions.elementDisplayed(form_TradeBookingSetupSection_Email);
	}
	
	public void displayedTradeBookingSetupSectionPasswordInput() throws Exception {
		CommonFunctions.elementDisplayed(input_TradeBookingSetupSection_Password);
	}
	
	public void displayedTradeBookingSetupSectionSendEmailRegistrationCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'SendEmailYesNoContainer')]")));
	}
	
	public void displayedTradeBookingSetupSectionUsernameInput() throws Exception {
		CommonFunctions.elementDisplayed(input_TradeBookingSetupSection_Username);
	}
	
	public void enabledAddressesSectionLocationAddressLine1Input() throws Exception {
		CommonFunctions.elementEnabled(input_AddressesSection_LocationAddressLine1);
	}
	
	public void enabledAddressesSectionLocationAddressLine2Input() throws Exception {
		CommonFunctions.elementEnabled(input_AddressesSection_LocationAddressLine2);
	}
	
	public void enabledAddressesSectionLocationAddressLine3Input() throws Exception {
		CommonFunctions.elementEnabled(input_AddressesSection_LocationAddressLine3);
	}
	
	public void enabledAddressesSectionLocationCityInput() throws Exception {
		CommonFunctions.elementEnabled(input_AddressesSection_LocationCity);
	}
	
	public void enabledAddressesSectionLocationPostCodeInput() throws Exception {
		CommonFunctions.elementEnabled(input_AddressesSection_LocationPostCode);
	}
	
	public void enabledAddressesSectionLocationStateDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_AddressesSection_LocationState);
	}
	
	public void enabledAddressesSectionPostalCountryDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_AddressesSection_PostalCountry);
	}
	
	public void enabledAgencyChainDropdown() throws Exception {
		CommonFunctions.elementEnabled(driver.findElement(By.xpath("//div[contains(@id, 'AgencyChain_Combobox')]")));
	}
	
	public void enabledTradeBookingSetupSectionAddProductAccessLevelButton() throws Exception {
		CommonFunctions.elementEnabled(button_TradeBookingSetupSection_AddProductAccessLevel);
	}
	
	public void enabledTradeBookingSetupSectionAPTGroupSiteAccessCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_TradeBookingSetupSection_APTGroupSiteAccess);
	}
	
	public void enabledTradeBookingSetupSectionCreateBookingsCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_TradeBookingSetupSection_CreateBookings);
	}
	
	public void enabledTradeBookingSetupSectionEditAllBookingsCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_TradeBookingSetupSection_EditAllBookings);
	}
	
	public void enabledTradeBookingSetupSectionEditBookingsCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_TradeBookingSetupSection_EditBookings);
	}
	
	public void enabledTradeBookingSetupSectionHideCommissionCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_TradeBookingSetupSection_HideCommission);
	}
	
	public void enabledTradeBookingSetupSectionLockedCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_TradeBookingSetupSection_Locked);
	}
	
	public void enabledTradeBookingSetupSectionSendEmailRegistrationCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_TradeBookingSetupSection_SendEmailRegistration);
	}
	
	public void enabledTradeBookingSetupSectionViewAllBookingsCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_TradeBookingSetupSection_ViewAllBookings);
	}
	
	public void enabledTradeBookingSetupSectionViewAllCustomerMarketsCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_TradeBookingSetupSection_ViewAllCustomerMarkets);
	}
	
	public void hiddenBillingSectionBankAccountNumber() throws Exception {
		CommonFunctions.elementAttributeContains(input_BillingSection_BankAccountNumber.findElement(By.xpath("//ancestor::div[contains(@id, 'BankDetailContainer')]")), "style", "display: none;");
	}
	
	public void hiddenBillingSectionBankAccountTitle() throws Exception {
		CommonFunctions.elementAttributeContains(input_BillingSection_BankAccountTitle.findElement(By.xpath("//ancestor::div[contains(@id, 'BankDetailContainer')]")), "style", "display: none;");
	}
	
	public void hiddenBillingSectionBankBSB() throws Exception {
		CommonFunctions.elementAttributeContains(input_BillingSection_BankBSB.findElement(By.xpath("//ancestor::div[contains(@id, 'BankDetailContainer')]")), "style", "display: none;");
	}
	
	public void hiddenTradeBookingSetupAccordion() throws Exception {
		CommonFunctions.elementAttributeContains(accordion_TradeBookingSetup.findElement(By.xpath(".//ancestor::div[contains(@id, 'TradeSiteSetupContainer')]")), "style", "display: none;");
	}
	
	public void selectAddressesSectionLocationCountryValue(String countryValue) throws Exception {
		CommonFunctions.clickElement(dropdown_AddressesSection_LocationCountry);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), countryValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectAddressesSectionPostalCountryValue(String countryValue) throws Exception {
		CommonFunctions.clickElement(dropdown_AddressesSection_PostalCountry);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), countryValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectAgencyChainValue(String agencyChainValue) throws Exception {
		CommonFunctions.clickElement(dropdown_AgencyChain);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), agencyChainValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	public void selectAgentSubTypeValue(String agentSubTypeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_AgentSubType);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), agentSubTypeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	public void selectAgentTypeValue(String agentTypeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_AgentType);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), agentTypeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	public void selectBDMValue(String bdmValue) throws Exception {
		CommonFunctions.clickElement(dropdown_BDM);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), bdmValue);
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	public void selectDefaultCurrencyValue(String defaultCurrencyValue) throws Exception {
		CommonFunctions.clickElement(dropdown_DefaultCurrency);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), defaultCurrencyValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	public void selectMarketValue(String marketValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Market);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), marketValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	public void selectStatusValue(String statusValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Status);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), statusValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	public void selectTypeValue(String typeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Type);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), typeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void setAddressesSectionLocationLocationSearchInput(String locationSearch) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddressesSection_LocationLocationSearch, locationSearch);
	}
	
	public void setAddressesSectionPostalLocationSearchInput(String locationSearch) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddressesSection_PostalLocationSearch, locationSearch);
	}
	
	public void setBillingSectionEmailInput(String email) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_BillingSection_Email, email);
	}
	
	public void setPhoneInput(String phone) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Phone, phone);
	}
	
	public void setTradeBookingSetupSectionPasswordInput(String password) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_TradeBookingSetupSection_Password, password);
		CommonFunctions.pause(5000, false);
	}
	
	public CustomersPage clickBottomCloseButton() throws Exception {
		CommonFunctions.clickElement(button_BottomClose);
		
		return new CustomersPage();
	}
	
	public CustomersPage clickBottomSaveButton() throws Exception {
		CommonFunctions.clickElement(button_BottomSave);
		
		return new CustomersPage();
	}
	
	public String setEmailInput(String email) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Email, email);
		
		return email;
	}
	
	public String setNameInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Name, name);
		
		return name;
	}
	
	public String setTradeBookingSetupSectionUsernameInput(String username) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_TradeBookingSetupSection_Username, username);
		CommonFunctions.pause(5000, false);
		
		return username;
	}
	// End - Main Page Actions
	
	// Start - Product Access Level Popup Actions
	public void clickProductAccessLevelPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_ProductAccessLevelPopup_Cancel);
	}
	
	public void clickProductAccessLevelPopupSaveButton() throws Exception {
		CommonFunctions.clickElement(button_ProductAccessLevelPopup_Save);
		CommonFunctions.pause(5000, false);
	}
	
	public void selectProductAccessLevelPopupCurrencyValue(String currencyValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ProductAccessLevelPopup_Currency);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), currencyValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectProductAccessLevelPopupDepartmentValue(String departmentValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ProductAccessLevelPopup_Department);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), departmentValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectProductAccessLevelPopupOfficeValue(String officeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ProductAccessLevelPopup_Office);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), officeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	// End - Product Access Level Popup Actions
	
	// Start - Delete Product Access Level Popup Actions
	public void clickDeleteProductAccessLevelPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_DeleteProductAccessLevelPopup_Cancel);
	}
	
	public void clickDeleteProductAccessLevelPopupOKButton() throws Exception {
		CommonFunctions.clickElement(button_DeleteProductAccessLevelPopup_OK);
	}
	// End - Delete Product Access Level Popup Actions
	// End - Actions
}