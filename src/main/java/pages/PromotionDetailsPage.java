package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class PromotionDetailsPage extends Base {
	// Start - Page Objects
	// Start - Main Page Objects
	@FindBy(xpath = "//div[contains(@id, 'Title') and contains(text(), 'Allotment')]")
	WebElement accordion_Allotment;
	
	@FindBy(xpath = "//div[contains(text(), 'Basic Information')]")
	WebElement accordion_BasicInformation;
	
	@FindBy(xpath = "//div[contains(text(), 'Combinability')]")
	WebElement accordion_Combinability;
	
	@FindBy(xpath = "//div[contains(text(), 'Comments')]")
	WebElement accordion_Comments;
	
	@FindBy(xpath = "//*[text() = 'Contract']")
	WebElement accordion_Contract;
	
	@FindBy(xpath = "//div[contains(text(), 'Customer')]")
	WebElement accordion_Customer;
	
	@FindBy(xpath = "//div[contains(text(), 'Date Ranges')]")
	WebElement accordion_DateRanges;
	
	@FindBy(xpath = "//div[contains(text(), 'Market')]")
	WebElement accordion_Market;
	
	@FindBy(xpath = "//div[contains(text(), 'Package')]")
	WebElement accordion_Package;
	
	@FindBy(xpath = "//div[contains(text(), 'Payment Rules')]")
	WebElement accordion_PaymentRules;
	
	@FindBy(xpath = "//div[contains(text(), 'Supplier')]")
	WebElement accordion_Supplier;
	
	@FindBy(xpath = "(//input[contains(@value, 'Close')])[2]")
	WebElement button_BottomClose;
	
	@FindBy(xpath = "//input[contains(@id, 'SaveAltBottom')]")
	WebElement button_BottomSave;
	
	@FindBy(xpath = "//input[contains(@id, 'addContractButton')]")
	WebElement button_ContractSection_AddContract;
	
	@FindBy(xpath = "//a[contains(@id, 'ContractsTableRecords') and contains(@title, 'Remove')]")
	WebElement button_ContractSection_DeleteContract;
	
	@FindBy(xpath = "//input[contains(@id, 'addCustomerButton')]")
	WebElement button_CustomerSection_AddCustomer;
	
	@FindBy(xpath = "//a[contains(@id, 'customerSearchTableRecords') and contains(@title, 'Remove')]")
	WebElement button_CustomerSection_DeleteCustomer;
	
	@FindBy(xpath = "//a[contains(@id, 'AddDateRangesValidationButton')]")
	WebElement button_DateRangeSection_AddDateRange;
	
	@FindBy(xpath = "//a[contains(@id, 'DateRagesGroupList')]//span[contains(@class,'fa-trash-alt')]")
	WebElement button_DateRangeSection_DeleteDateRange;
	
	@FindBy(xpath = "//a[contains(@id, 'DateRagesGroupList')]//span[contains(@class,'fa-edit')]")
	WebElement button_DateRangeSection_EditDateRange;
	
	@FindBy(xpath = "//input[contains(@id, 'addPackageButton')]")
	WebElement button_PackageSection_AddPackage;
	
	@FindBy(xpath = "//a[contains(@id, 'PackageSearchTableRecords')]")
	WebElement button_PackageSection_DeletePackage;
	
	@FindBy(xpath = "//a[contains(@id, 'SupplierListRecords')]")
	WebElement button_SupplierSection_DeleteSupplier;
	
	@FindBy(xpath = "//input[contains(@id, 'closeTopButton')]")
	WebElement button_TopClose;
	
	@FindBy(xpath = "//input[contains(@id, 'SaveAltTop')]")
	WebElement button_TopSave;
	
	@FindBy(xpath = "//input[contains(@id, 'Promotion_travel_trade')]")
	WebElement checkbox_AptGroupTrade;
	
	@FindBy(xpath = "(//input[contains(@id, 'Promotion_consumer_web')])[1]")
	WebElement checkbox_AtgConsumerWeb;
	
	@FindBy(xpath = "//input[contains(@id, 'Promotion_internal_sale')]")
	WebElement checkbox_InternalSale;
	
	@FindBy(xpath = "//input[contains(@id, 'MinimumAppliesCheckBox')]")
	WebElement checkbox_MinimumPax;
	
	@FindBy(xpath = "//input[contains(@id, 'MinorPromoCheckbox')]")
	WebElement checkbox_MinorPromotion;
	
	@FindBy(xpath = "//input[contains(@id, 'overridepromolinecheckbox')]")
	WebElement checkbox_OverridePromotionLineCommission;
	
	@FindBy(xpath = "//input[contains(@id, 'IsEarlyPaymentDiscountCheckbox')]")
	WebElement checkbox_PaymentRulesSection_EarlyPaymentDiscount;
	
	@FindBy(xpath = "//input[contains(@id, 'FinalDueCheckbox')]")
	WebElement checkbox_PaymentRulesSection_FinalDueApplicable;
	
	@FindBy(xpath = "//input[contains(@id, 'firstdepositCheckbo')]")
	WebElement checkbox_PaymentRulesSection_FirstDepositApplicable;
	
	@FindBy(xpath = "//input[contains(@id, 'firstdepositDueDateOverrideCheckbox')]")
	WebElement checkbox_PaymentRulesSection_FirstDepositDueDateOverrideNoOfDays;
	
	@FindBy(xpath = "//input[contains(@id, 'secondDepositAppCheckbox')]")
	WebElement checkbox_PaymentRulesSection_SecondDepositApplicable;
	
	@FindBy(xpath = "//select[contains(@id, 'Combobox_PromotionAction')]")
	WebElement dropdown_Action;
	
	@FindBy(xpath = "//select[contains(@id, 'Combobox_Affiliate')]")
	WebElement dropdown_Affiliate;
	
	@FindBy(xpath = "//select[contains(@id, 'AllotmetnCodeDropdown')]")
	WebElement dropdown_AllotmentSection_AllotmentCode;
	
	@FindBy(xpath = "//select[contains(@id, 'InventoryPoolDropdown')]")
	WebElement dropdown_AllotmentSection_InventoryPool;
	
	@FindBy(xpath = "//select[contains(@id, 'Combobox_Applicable')]")
	WebElement dropdown_Assign;
	
	@FindBy(xpath = "//select[contains(@id, 'Combobox_PromotionCategory')]")
	WebElement dropdown_Category;
	
	@FindBy(xpath = "//select[contains(@id, 'Combobox_PromotionClassification')]")
	WebElement dropdown_Classification;
	
	@FindBy(xpath = "//select[contains(@id, 'CombinabilityGroupDropdown')]")
	WebElement dropdown_CombinabilityGroup;
	
	@FindBy(xpath = "//div[contains(@id, 'AgencyChainContainer')]//button")
	WebElement dropdown_CustomerSection_AgencyChain;
	
	@FindBy(xpath = "//div[contains(@id, 'AgencySubContainer')]//button")
	WebElement dropdown_CustomerSection_AgentSubType;
	
	@FindBy(xpath = "//div[contains(@id, 'AgentTypeDropdownContainer')]//button")
	WebElement dropdown_CustomerSection_AgentType;
	
	@FindBy(xpath = "//div[contains(@id, 'countryContainer')]//button")
	WebElement dropdown_CustomerSection_Country;
	
	@FindBy(xpath = "//div[contains(@id, 'customerMarketContainer2')]//button")
	WebElement dropdown_CustomerSection_Market;
	
	@FindBy(xpath = "//div[contains(@id, 'CustomerTypeContainer')]//button")
	WebElement dropdown_CustomerSection_Type;
	
	@FindBy(xpath = "//div[contains(@id, 'statesContainer')]//button")
	WebElement dropdown_CustomerSection_State;
	
	@FindBy(xpath = "//label[contains(text(), 'Date Range')]//following-sibling::select")
	WebElement dropdown_DateRangesSection_DateRanges;
	
	@FindBy(xpath = "//label[text() = 'Airline Code']//parent::div//button")
	WebElement dropdown_IndicativeAirSection_AirlineCode;
	
	@FindBy(xpath = "//label[text() = 'Cabin Class']//parent::div//button")
	WebElement dropdown_IndicativeAirSection_CabinClass;
	
	@FindBy(xpath = "//label[text() = 'Location']//parent::div//button")
	WebElement dropdown_IndicativeAirSection_Location;
	
	@FindBy(xpath = "//select[contains(@id, 'MarketOfferDropdown')]")
	WebElement dropdown_MarketOffer;
	
	@FindBy(xpath = "//div[contains(@id, 'currencyContainer')]//button")
	WebElement dropdown_MarketSection_Currency;
	
	@FindBy(xpath = "//div[contains(@id, 'departmentContainer')]//button")
	WebElement dropdown_MarketSection_Department;
	
	@FindBy(xpath = "//div[contains(@id, 'OfficeContainer')]//button")
	WebElement dropdown_MarketSection_Office;
	
	@FindBy(xpath = "//div[contains(@id, 'brandContainer')]//button")
	WebElement dropdown_PackageSection_Brand;
	
	@FindBy(xpath = "//div[contains(@id, 'cabinCategoryContainer')]//button//span")
	WebElement dropdown_PackageSection_CabinCategory;
	
	@FindBy(xpath = "//div[contains(@id, 'PackageTypeContainer')]//button")
	WebElement dropdown_PackageSection_PackageType;
	
	@FindBy(xpath = "//div[contains(@id, 'roomconfiContainer')]//button")
	WebElement dropdown_PackageSection_RoomConfiguration;
	
	@FindBy(xpath = "//div[contains(@id, 'tourClassificatinContainer')]//button")
	WebElement dropdown_PackageSection_TourClassification;
	
	@FindBy(xpath = "//select[contains(@id, 'TourLengthDropdown')]")
	WebElement dropdown_PackageSection_TourLength;
	
	@FindBy(xpath = "//div[contains(@id, 'tourMarketContainer')]//button")
	WebElement dropdown_PackageSection_TourMarket;
	
	@FindBy(xpath = "//select[contains(@id, 'FirstDepositType')]")
	WebElement dropdown_PaymentRulesSection_FirstDepositType;
	
	@FindBy(xpath = "//select[contains(@id, 'FinalDueTypeDropdown')]")
	WebElement dropdown_PaymentRulesSection_FinalDueType;
	
	@FindBy(xpath = "//select[contains(@id, 'SecondDepositForDropdown')]")
	WebElement dropdown_PaymentRulesSection_SecondDepositFor;
	
	@FindBy(xpath = "//select[contains(@id, 'SecondDepositType')]")
	WebElement dropdown_PaymentRulesSection_SecondDepositType;
	
	@FindBy(xpath = "//select[contains(@id, 'Combobox_RevenueAllocation')]")
	WebElement dropdown_RevenueAllocation;
	
	@FindBy(xpath = "//select[contains(@id, 'RoundingRulesDropdown')]")
	WebElement dropdown_RoundingRule;
	
	@FindBy(xpath = "//select[contains(@id, 'Combobox_PromotionStatus')]")
	WebElement dropdown_Status;
	
	@FindBy(xpath = "//select[contains(@id, 'Combobox_Supplier')]")
	WebElement dropdown_Supplier;
	
	@FindBy(xpath = "//select[contains(@id, 'Promotion_promo_type')]")
	WebElement dropdown_Type;
	
	@FindBy(xpath = "//input[contains(@id, 'offsetDepartureInput')]")
	WebElement input_AllotmentSection_NoOfDaysOffset;
	
	@FindBy(xpath = "//input[contains(@id, 'Promotion_sale_code')]")
	WebElement input_Code;
	
	@FindBy(xpath = "//input[contains(@id, 'Consumer_Web_Medium_Description')]")
	WebElement input_ConsumerWebMediumDescription;
	
	@FindBy(xpath = "//input[contains(@id, 'Consumer_Web_Short_Description')]")
	WebElement input_ConsumerWebShortDescription;
	
	@FindBy(xpath = "//input[contains(@id, 'Promotion_description')]")
	WebElement input_Description;
	
	@FindBy(xpath = "//input[contains(@id, 'MinimumPaxAppliesInput')]")
	WebElement input_MinimumPax;
	
	@FindBy(xpath = "//input[contains(@id, 'specificcomissionInput')]")
	WebElement input_OverrideDefaultCommission;
	
	@FindBy(xpath = "//input[contains(@id, 'oplcInput')]")
	WebElement input_OverridePromotionLineCommission;
	
	@FindBy(xpath = "//input[contains(@id, 'MaxTourLengthInput')]")
	WebElement input_PackageSection_TourLengthMaximumDays;
	
	@FindBy(xpath = "//input[contains(@id, 'MinTourLength')]")
	WebElement input_PackageSection_TourLengthMinimumDays;
	
	@FindBy(xpath = "//input[contains(@id, 'DepositAmountInput')]")
	WebElement input_PaymentRulesSection_FirstDepositAmount;
	
	@FindBy(xpath = "//input[contains(@id, 'FirstDepositOverrideInput')]")
	WebElement input_PaymentRulesSection_FirstDepositDueDateOverrideNoOfDays;
	
	@FindBy(xpath = "//input[contains(@id, 'FinalDueDateInput')]")
	WebElement input_PaymentRulesSection_FinalDueDate;
	
	@FindBy(xpath = "//input[contains(@id, 'SecondDepositInput')]")
	WebElement input_PaymentRulesSection_SecondDepositAmount;
	
	@FindBy(xpath = "//input[contains(@id, 'SecondDepositDueDateInput')]")
	WebElement input_PaymentRulesSection_SecondDepositDueDate;
	
	@FindBy(xpath = "//input[contains(@id, 'Rate_Per_personInput')]")
	WebElement input_RatePerPerson;
	
	@FindBy(xpath = "//input[contains(@id, 'Rounding_AmountInput')]")
	WebElement input_RoundingAmount;
	
	@FindBy(xpath = "(//div[contains(@id, 'CombinableExpandable')]//div[contains(@col-id, 'PromotionId')])[2]")
	WebElement rowData_CombinabilitySection_TopId;
	
	@FindBy(xpath = "//table[contains(@id, 'PromotionCombinableTableRecords')]")
	WebElement table_CombinabilitySectionView_CombinablePromotions;
	
	@FindBy(xpath = "//textarea[contains(@id, 'InternalResDescInput')]")
	WebElement textArea_CommentsSection_InternalReservationDescription;
	
	@FindBy(xpath = "//textarea[contains(@id, 'TradeCommentInput')]")
	WebElement textArea_CommentsSection_TradeComments;
	
	@FindBy(xpath = "//textarea[contains(@id, 'InvoiceDescInput')]")
	WebElement textArea_InvoiceDescription;
	// End - Main Page Objects
	
	// Start - Contract Popup Objects
	@FindBy(xpath = "//input[contains(@id, 'PopupMain') and contains(@value, 'Add Contract')]")
	WebElement button_ContractPopup_AddContract;
	
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement button_ContractPopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'SearchLink')]")
	WebElement button_ContractPopup_Find;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractNameInput')]")
	WebElement input_ContractPopup_Name;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Id')])[2]")
	WebElement rowData_ContractPopup_TopId;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Name')])[3]")
	WebElement rowData_ContractPopup_TopName;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'SupplierName')])[2]")
	WebElement rowData_ContractPopup_TopSupplierName;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Type')])[2]")
	WebElement rowData_ContractPopup_TopType;
	// End - Contract Popup Objects
	
	// Start - Customer Popup Objects
	@FindBy(xpath = "//input[contains(@id, 'PopupMain') and contains(@value, 'Add Customer')]")
	WebElement button_CustomerPopup_AddCustomer;
	
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement button_CustomerPopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'SearchLink')]")
	WebElement button_CustomerPopup_Find;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Id')]//preceding-sibling::div)[1]")
	WebElement checkbox_CustomerPopup_SelectAll;
	
	@FindBy(xpath = "//form[contains(@action, 'Popup')]//select[contains(@id, 'CountryDropdown')]")
	WebElement dropdown_CustomerPopup_Country;
	
	@FindBy(xpath = "//form[contains(@action, 'Popup')]//select[contains(@id, 'StateDropdown')]")
	WebElement dropdown_CustomerPopup_State;
	
	@FindBy(xpath = "//input[contains(@id, 'NameInput')]")
	WebElement input_CustomerPopup_Name;
	
	@FindBy(xpath = "((//div[contains(@col-id, 'Id')])[2]//parent::div//div)[1]")
	WebElement rowData_CustomerPopup_TopCheckBox;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'City')])[2]")
	WebElement rowData_CustomerPopup_TopCity;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Id')])[2]")
	WebElement rowData_CustomerPopup_TopId;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Name')])[2]")
	WebElement rowData_CustomerPopup_TopName;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Zip')])[2]")
	WebElement rowData_CustomerPopup_TopPostCode;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'State')])[2]")
	WebElement rowData_CustomerPopup_TopState;
	// End - Customer Popup Objects
	
	// Start - Date Range Popup Objects
	@FindBy(xpath = "//a[contains(@id, 'AddLink')]//span")
	WebElement button_DateRangePopup_AddDateRange;
	
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement button_DateRangePopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'DeleteLink')]//span")
	WebElement button_DateRangePopup_Remove;
	
	@FindBy(xpath = "//input[contains(@id, 'PopupMain') and contains(@value, 'Save')]")
	WebElement button_DateRangePopup_Save;
	
	@FindBy(xpath = "//div[contains(text(), 'Suggestions')]//select")
	WebElement dropdown_DateRangePopup_Suggestions;
	
	@FindBy(xpath = "//div[contains(@class, 'AddedDateRanges')]//input[contains(@id, 'FromInput')]")
	WebElement input_DateRangePopup_AddedDateFrom;
	
	@FindBy(xpath = "//div[contains(@class, 'AddedDateRanges')]//input[contains(@id, 'ToInput')]")
	WebElement input_DateRangePopup_AddedDateTo;
	
	@FindBy(xpath = "//input[contains(@id, 'DepartFrom')]")
	WebElement input_DateRangePopup_DateFrom;
	
	@FindBy(xpath = "//input[contains(@id, 'DepartTo')]")
	WebElement input_DateRangePopup_DateTo;
	
	@FindBy(xpath = "//span[contains(text(), 'Add Date Range')]")
	WebElement label_DateRangePopup_DateRangeInfo;
	// End - Date Range Popup Objects
	
	// Start - Package Popup Objects
	@FindBy(xpath = "//input[contains(@id, 'PopupMain') and contains(@value, 'Add Package')]")
	WebElement button_PackagePopup_AddPackage;
	
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement button_PackagePopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'SearchLink')]")
	WebElement button_PackagePopup_Find;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'PackageHeaderId')]//preceding-sibling::div)[1]")
	WebElement checkbox_PackagePopup_SelectAll;
	
	@FindBy(xpath = "//select[contains(@id, 'BrandDropDown')]")
	WebElement dropdown_PackagePopup_Brand;
	
	@FindBy(xpath = "//select[contains(@id, 'PTDropDown')]")
	WebElement dropdown_PackagePopup_Type;
	
	@FindBy(xpath = "//select[contains(@id, 'TCDropdown')]")
	WebElement dropdown_PackagePopup_TourClass;
	
	@FindBy(xpath = "//select[contains(@id, 'TMDropdown')]")
	WebElement dropdown_PackagePopup_TourMarket;
	
	@FindBy(xpath = "//input[contains(@id, 'PackageNameInput')]")
	WebElement input_PackagePopup_Name;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'PackageHeaderId')])[2]//preceding-sibling::div")
	WebElement rowData_PackagePopup_TopCheckBox;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'PackageHeaderId')])[2]")
	WebElement rowData_PackagePopup_TopId;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'PackageString')])[2]")
	WebElement rowData_PackagePopup_TopName;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'PackageType')])[2]")
	WebElement rowData_PackagePopup_TopType;
	// End - Package Popup Objects
	
	// Start - Supplier Popup Objects
	@FindBy(xpath = "//input[contains(@id, 'PopupMain') and contains(@value, 'Add Supplier')]")
	WebElement button_SupplierPopup_AddSupplier;
	
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement button_SupplierPopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'SearchLink')]")
	WebElement button_SupplierPopup_Find;
	
	@FindBy(xpath = "//form[contains(@action, 'Popup')]//label[contains(text(), 'Country')]//following::select[contains(@id, 'StatusDropdown')]")
	WebElement dropdown_SupplierPopup_Status;
	
	@FindBy(xpath = "//input[contains(@id, 'Input_SupplierName')]")
	WebElement input_SupplierPopup_Name;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'City')])[2]")
	WebElement rowData_SupplierPopup_TopCity;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'Country')])[2]")
	WebElement rowData_SupplierPopup_TopCountry;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'SupplierId')])[2]")
	WebElement rowData_SupplierPopup_TopId;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'SupplierName')])[2]")
	WebElement rowData_SupplierPopup_TopName;
	
	@FindBy(xpath = "(//div[contains(@col-id, 'ThirdParty')])[2]")
	WebElement rowData_SupplierPopup_TopThirdParty;
	// End - Supplier Popup Objects
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public PromotionDetailsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	// Start - Main Page Actions
	public void checkAptGroupTradeCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_AptGroupTrade);
	}
	
	public void checkAptGroupTradeCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_AptGroupTrade);
	}
	
	public void checkAtgConsumerWebCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_AtgConsumerWeb);
	}
	
	public void checkInternalSaleCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_InternalSale);
	}
	
	public void checkMinimumPaxCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_MinimumPax);
	}
	
	public void checkMinorPromotionCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_MinorPromotion);
	}
	
	public void checkOverridePromotionLineCommissionCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_OverridePromotionLineCommission);
	}
	
	public void checkPaymentRulesSectionFinalDueApplicableCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_PaymentRulesSection_FinalDueApplicable);
	}
	
	public void checkPaymentRulesSectionFirstDepositApplicableCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_PaymentRulesSection_FirstDepositApplicable);
	}
	
	public void checkPaymentRulesSectionFirstDepositDueDateOverrideNoOfDaysCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_PaymentRulesSection_FirstDepositDueDateOverrideNoOfDays);
	}
	
	public void checkPaymentRulesSectionSecondDepositApplicableCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_PaymentRulesSection_SecondDepositApplicable);
	}
	
	public void clickAllotmentAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Allotment);
	}
	
	public void clickAptGroupTradeCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_AptGroupTrade);
	}
	
	public void clickAtgConsumerWebCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_AtgConsumerWeb);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickCombinabilityAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Combinability);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickCombinabilityGroupDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_CombinabilityGroup);
	}
	
	public void clickCommentsAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Comments);
	}
	
	public void clickContractAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Contract);
	}
	
	public void clickContractSectionAddContractButton() throws Exception {
		CommonFunctions.clickElement(button_ContractSection_AddContract);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//input[@value = 'Add Contract']");
	}
	
	public void clickContractSectionDeleteContractButton() throws Exception {
		CommonFunctions.clickElement(button_ContractSection_DeleteContract);
	}
	
	public void clickCustomerAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Customer);
	}
	
	public void clickCustomerSectionAddCustomerButton() throws Exception {
		CommonFunctions.clickElement(button_CustomerSection_AddCustomer);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//input[@value = 'Add Customer']");
	}
	
	public void clickCustomerSectionAgencyChainDropdownOption(String agencyChainDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerSection_AgencyChain);
		
		if (agencyChainDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'agencyChainDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'AgencyChainContainer')]//div[contains(@class, 'search')]//input")), agencyChainDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'agencyChainDropdown')]//following-sibling::span[text() = '" + agencyChainDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickCustomerSectionAgentSubTypeDropdownOption(String agentSubTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerSection_AgentSubType);
		
		if (agentSubTypeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'AgencySubDropDown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'AgencySubContainer')]//div[contains(@class, 'search')]//input")), agentSubTypeDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'AgencySubDropDown')]//following-sibling::span[text() = '" + agentSubTypeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickCustomerSectionAgentTypeDropdownOption(String agentTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerSection_AgentType);
		
		if (agentTypeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'AgentTypeDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'AgentTypeDropdownContainer')]//div[contains(@class, 'search')]//input")), agentTypeDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'AgentTypeDropdown')]//following-sibling::span[text() = '" + agentTypeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickCustomerSectionCountryDropdownOption(String countryDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerSection_Country);
		
		if (countryDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'CountryDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'countryContainer')]//div[contains(@class, 'search')]//input")), countryDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'CountryDropdown')]//following-sibling::span[text() = '" + countryDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickCustomerSectionDeleteCustomerButton() throws Exception {
		CommonFunctions.clickElement(button_CustomerSection_DeleteCustomer);
	}
	
	public void clickCustomerSectionMarketDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerSection_Market);
	}
	
	public void clickCustomerSectionMarketDropdownOption(String marketDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerSection_Market);
		
		if (marketDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'customerMarketDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'customerMarketContainer2')]//div[contains(@class, 'search')]//input")), marketDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'customerMarketDropdown')]//following-sibling::span[text() = '" + marketDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.pause(2500, false);
	}
	
	public void clickCustomerSectionStateDropdownOption(String stateDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerSection_State);
		
		if (stateDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'StateDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'statesContainer')]//div[contains(@class, 'search')]//input")), stateDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'StateDropdown')]//following-sibling::span[text() = 'stateDropdownOptionValue']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickCustomerSectionTypeDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerSection_Type);
	}
	
	public void clickCustomerSectionTypeDropdownOption(String typeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CustomerSection_Type);
		
		if (typeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'customerTypeDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'CustomerTypeContainer')]//div[contains(@class, 'search')]//input")), typeDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'customerTypeDropdown')]//following-sibling::span[text() = 'typeDropdownOptionValue']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickDateRangeAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_DateRanges);
	}
	
	public void clickDateRangeSectionAddDateRangeButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangeSection_AddDateRange);
		CommonFunctions.pause(7500, false);
		
		if (driver.findElements(By.tagName("iframe")).size() > 0) {
			CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//input[@value = 'Save']");
		}
	}
	
	public void clickDateRangeSectionDeleteDateRangeButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangeSection_DeleteDateRange);
	}
	
	public void clickDateRangeSectionEditDateRangeButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangeSection_EditDateRange);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//input[@value = 'Save']");
	}
	
	public void clickIndicativeAirSectionAirlineCodeDropdownOption(String airlineCodeOptionValue) throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_AirlineCode);
		CommonFunctions.pause(10000, false);
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_CabinClass);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_AirlineCode);
		CommonFunctions.pause(5000, false);
		
		if (airlineCodeOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_IndicativeAirSection_AirlineCode.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_IndicativeAirSection_AirlineCode.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), airlineCodeOptionValue);
			CommonFunctions.clickElement(dropdown_IndicativeAirSection_AirlineCode.findElement(By.xpath(".//parent::div//ul//span[contains(text(), '" + airlineCodeOptionValue + "')]")));
		}
		
		CommonFunctions.pause(10000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickIndicativeAirSectionCabinClassDropdownOption(String cabinClassOptionValue) throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_CabinClass);
		CommonFunctions.pause(10000, false);
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_AirlineCode);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_CabinClass);
		CommonFunctions.pause(5000, false);
		
		if (cabinClassOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_IndicativeAirSection_CabinClass.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_IndicativeAirSection_CabinClass.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), cabinClassOptionValue);
			CommonFunctions.clickElement(dropdown_IndicativeAirSection_CabinClass.findElement(By.xpath(".//parent::div//ul//span[contains(text(), '" + cabinClassOptionValue + "')]")));
		}
		
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickIndicativeAirSectionLocationDropdownOption(String locationOptionValue) throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_Location);
		CommonFunctions.pause(10000, false);
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_CabinClass);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_Location);
		CommonFunctions.pause(5000, false);
		
		if (locationOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_IndicativeAirSection_Location.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_IndicativeAirSection_Location.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), locationOptionValue);
			CommonFunctions.clickElement(dropdown_IndicativeAirSection_Location.findElement(By.xpath(".//parent::div//ul//span[contains(text(), '" + locationOptionValue + "')]")));
		}
		
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickInternalSaleCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_InternalSale);
	}
	
	public void clickMarketAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Market);
	}
	
	public void clickMarketOfferDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_MarketOffer);
	}
	
	public void clickMarketSectionCurrencyDropdownOption(String currencyDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_MarketSection_Currency);
		
		if (currencyDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'currencyDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'currencyContainer')]//div[contains(@class, 'search')]//input")), currencyDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'currencyDropdown')]//following-sibling::span[text() = '" + currencyDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickMarketSectionDepartmentDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_MarketSection_Department);
	}
	
	public void clickMarketSectionDepartmentDropdownOption(String departmentDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_MarketSection_Department);
		
		if (departmentDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'DepartmentsMultipleDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'departmentContainer')]//div[contains(@class, 'search')]//input")), departmentDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'DepartmentsMultipleDropdown')]//following-sibling::span[text() = '" + departmentDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickMarketSectionOfficeDropdownOption(String officeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_MarketSection_Office);
		
		if (officeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'officeMultipleDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'OfficeContainer')]//div[contains(@class, 'search')]//input")), officeDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'officeMultipleDropdown')]//following-sibling::span[text() = '" + officeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickMinimumPaxCheckBox() throws Exception {
		CommonFunctions.clickElement(checkbox_MinimumPax);
		CommonFunctions.pause(1000, false);
	}
	
	public void clickMinorPromotionCheckBox() throws Exception {
		CommonFunctions.clickElement(checkbox_MinorPromotion);
	}
	
	public void clickOverridePromotionLineCommissionCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_OverridePromotionLineCommission);
		CommonFunctions.pause(1000, false);
	}
	
	public void clickPackageAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Package);
	}
	
	public void clickPackageSectionAddPackageButton() throws Exception {
		CommonFunctions.clickElement(button_PackageSection_AddPackage);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Package')]//input[@value = 'Add Package']");
	}
	
	public void clickPackageSectionBrandDropdownOption(String brandDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PackageSection_Brand);
		
		if (brandDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'BrandDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'brandContainer')]//div[contains(@class, 'search')]//input")), brandDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'BrandDropdown')]//following-sibling::span[text() = '" + brandDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickPackageSectionDeletePackageButton() throws Exception {
		CommonFunctions.clickElement(button_PackageSection_DeletePackage);
	}
	
	public void clickPackageSectionPackageTypeDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackageSection_PackageType);
	}
	
	public void clickPackageSectionPackageTypeDropdownOption(String packageTypeDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PackageSection_PackageType);
		
		if (packageTypeDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'PackageTypeDropDown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'PackageTypeContainer')]//div[contains(@class, 'search')]//input")), packageTypeDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'PackageTypeDropDown')]//following-sibling::span[text() = '" + packageTypeDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickPackageSectionRoomConfigurationDropdownOption(String roomConfigurationDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PackageSection_RoomConfiguration);
		
		if (roomConfigurationDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'RoomConfigDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'roomconfiContainer')]//div[contains(@class, 'search')]//input")), roomConfigurationDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'RoomConfigDropdown')]//following-sibling::span[text() = '" + roomConfigurationDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.pause(2500, false);
	}
	
	public void clickPackageSectionTourClassificationDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackageSection_TourClassification);
	}
	
	public void clickPackageSectionTourClassificationDropdownOption(String tourClassificationDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PackageSection_TourClassification);
		
		if (tourClassificationDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'TourClassDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'tourClassificatinContainer')]//div[contains(@class, 'search')]//input")), tourClassificationDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'TourClassDropdown')]//following-sibling::span[text() = '" + tourClassificationDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickPackageSectionTourLengthDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackageSection_TourLength);
	}
	
	public void clickPackageSectionTourMarketDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_PackageSection_TourMarket);
	}
	
	public void clickPackageSectionTourMarketDropdownOption(String tourMarketDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PackageSection_TourMarket);
		
		if (tourMarketDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'TourMarketDropdown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'tourMarketContainer')]//div[contains(@class, 'search')]//input")), tourMarketDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'TourMarketDropdown')]//following-sibling::span[text() = '" + tourMarketDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickPaymentRulesAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_PaymentRules);
	}
	
	public void clickPaymentRulesSectionEarlyPaymentDiscountCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_PaymentRulesSection_EarlyPaymentDiscount);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickPaymentRulesSectionFinalDueApplicableCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_PaymentRulesSection_FinalDueApplicable);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickPaymentRulesSectionFirstDepositApplicableCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_PaymentRulesSection_FirstDepositApplicable);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickPaymentRulesSectionFirstDepositDueDateOverrideNoOfDaysCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_PaymentRulesSection_FirstDepositDueDateOverrideNoOfDays);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickPaymentRulesSectionSecondDepositApplicableCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_PaymentRulesSection_SecondDepositApplicable);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickStatusDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Status);
	}
	
	public void clickSupplierAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Supplier);
	}
	
	public void containsValueActionDropdown(String expectedAction) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Action, expectedAction);
	}
	
	public void containsValueAffiliateDropdown(String expectedAffiliate) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Affiliate, expectedAffiliate);
	}
	
	public void containsValueAllotmentSectionAllotmentCodeDropdown(String expectedAllotmentCode) throws Exception {
		CommonFunctions.elementContainsText(dropdown_AllotmentSection_AllotmentCode, expectedAllotmentCode);
	}
	
	public void containsValueAllotmentSectionInventoryPoolDropdown(String expectedInventoryPool) throws Exception {
		CommonFunctions.elementContainsText(dropdown_AllotmentSection_InventoryPool, expectedInventoryPool);
	}
	
	public void containsValueAllotmentSectionNoOfDaysOffsetInput(String expectedNoOfDaysOffset) throws Exception {
		CommonFunctions.elementAttributeContains(input_AllotmentSection_NoOfDaysOffset, "value", expectedNoOfDaysOffset);
	}
	
	public void containsValueAssignDropdown(String expectedAssign) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Assign, expectedAssign);
	}
	
	public void containsValueCategoryDropdown(String expectedCategory) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Category, expectedCategory);
	}
	
	public void containsValueClassificationDropdown(String expectedClassification) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Classification, expectedClassification);
		CommonFunctions.pause(1000, false);
	}
	
	public void containsValueCodeInput(String expectedCode) throws Exception {
		CommonFunctions.elementAttributeContains(input_Code, "origvalue", expectedCode);
	}
	
	public void containsValueCommentsSectionInternalReservationDescriptionTextArea(String expectedInternalReservationDescription) throws Exception {
		CommonFunctions.elementContainsText(textArea_CommentsSection_InternalReservationDescription, expectedInternalReservationDescription);
	}
	
	public void containsValueCommentsSectionTradeCommentsTextArea(String expectedTradeComments) throws Exception {
		CommonFunctions.elementContainsText(textArea_CommentsSection_TradeComments, expectedTradeComments);
	}
	
	public void containsValueCombinabilityGroupDropdown(String expectedCombinabilityGroup) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CombinabilityGroup, expectedCombinabilityGroup);
	}
	
	public void containsValueConsumerWebMediumDescriptionInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ConsumerWebMediumDescription, "value", expectedValue);
	}
	
	public void containsValueConsumerWebShortDescriptionInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ConsumerWebShortDescription, "value", expectedValue);
	}
	
	public void containsValueCustomerSectionAgencyChainDropdown(String expectedAgencyChain) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerSection_AgencyChain.findElement(By.xpath(".//span")), expectedAgencyChain);
	}
	
	public void containsValueCustomerSectionAgentSubTypeDropdown(String expectedAgentSubType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerSection_AgentSubType.findElement(By.xpath(".//span")), expectedAgentSubType);
	}
	
	public void containsValueCustomerSectionAgentTypeDropdown(String expectedAgentType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerSection_AgentType.findElement(By.xpath(".//span")), expectedAgentType);
	}
	
	public void containsValueCustomerSectionCountryDropdown(String expectedCountry) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerSection_Country.findElement(By.xpath(".//span")), expectedCountry);
	}
	
	public void containsValueCustomerSectionMarketDropdown(String expectedMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerSection_Market.findElement(By.xpath(".//span")), expectedMarket);
	}
	
	public void containsValueCustomerSectionStateDropdown(String expectedState) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerSection_State.findElement(By.xpath(".//span")), expectedState);
	}
	
	public void containsValueCustomerSectionTypeDropdown(String expectedType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerSection_Type.findElement(By.xpath(".//span")), expectedType);
	}
	
	public void containsValueDateRangeSectionDropdown(String expectedDateRange) throws Exception {
		CommonFunctions.elementContainsText(dropdown_DateRangesSection_DateRanges, expectedDateRange);
	}
	
	public void containsValueDescriptionInput(String expectedDescription) throws Exception {
		CommonFunctions.elementAttributeContains(input_Description, "origvalue", expectedDescription);
		CommonFunctions.pause(1000, false);
	}
	
	public void containsValueIndicativeAirSectionAirlineCodeDropdown(String expectedAirline) throws Exception {
		CommonFunctions.elementContainsText(dropdown_IndicativeAirSection_AirlineCode.findElement(By.xpath(".//span")), expectedAirline);
	}
	
	public void containsValueIndicativeAirSectionCabinClassDropdown(String expectedCabinClass) throws Exception {
		CommonFunctions.elementContainsText(dropdown_IndicativeAirSection_CabinClass.findElement(By.xpath(".//span")), expectedCabinClass);
	}
	
	public void containsValueIndicativeAirSectionLocationDropdown(String expectedLocation) throws Exception {
		CommonFunctions.elementContainsText(dropdown_IndicativeAirSection_Location.findElement(By.xpath(".//span")), expectedLocation);
	}
	
	public void containsValueInvoiceDescriptionInput(String expectedInvoiceDescription) throws Exception {
		CommonFunctions.elementContainsText(textArea_InvoiceDescription, expectedInvoiceDescription);
	}
	
	public void containsValueMarketOfferDropdown(String expectedMarketOffer) throws Exception {
		CommonFunctions.elementContainsText(dropdown_MarketOffer, expectedMarketOffer);
	}
	
	public void containsValueMarketSectionCurrencyDropdown(String expectedCurrency) throws Exception {
		CommonFunctions.elementContainsText(dropdown_MarketSection_Currency.findElement(By.xpath(".//span")), expectedCurrency);
	}
	
	public void containsValueMarketSectionDepartmentDropdown(String expectedDepartment) throws Exception {
		CommonFunctions.elementContainsText(dropdown_MarketSection_Department.findElement(By.xpath(".//span")), expectedDepartment);
	}
	
	public void containsValueMarketSectionOfficeDropdown(String expectedOffice) throws Exception {
		CommonFunctions.elementContainsText(dropdown_MarketSection_Office.findElement(By.xpath(".//span")), expectedOffice);
	}
	
	public void containsValueMinimumPaxInput(String expectedMinimumPax) throws Exception {
		CommonFunctions.elementAttributeContains(input_MinimumPax, "origvalue", expectedMinimumPax);
	}
	
	public void containsValueOverrideDefaultCommissionInput(String expectedOverrideDefaultCommission) throws Exception {
		CommonFunctions.elementAttributeContains(input_OverrideDefaultCommission, "origvalue", expectedOverrideDefaultCommission);
	}
	
	public void containsValueOverridePromotionLineCommissionInput(String expectedOverridePromotionLineCommission) throws Exception {
		CommonFunctions.elementAttributeContains(input_OverridePromotionLineCommission, "origvalue", expectedOverridePromotionLineCommission);
	}
	
	public void containsValuePackageSectionBrandDropdown(String expectedBrand) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackageSection_Brand.findElement(By.xpath(".//span")), expectedBrand);
	}
	
	public void containsValuePackageSectionCabinCategoryDropdown(String expectedCabinCategory) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackageSection_CabinCategory, expectedCabinCategory);
	}
	
	public void containsValuePackageSectionPackageTypeDropdown(String expectedPackageType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackageSection_PackageType.findElement(By.xpath(".//span")), expectedPackageType);
	}
	
	public void containsValuePackageSectionRoomConfigurationDropdown(String expectedRoomConfiguration) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackageSection_RoomConfiguration.findElement(By.xpath(".//span")), expectedRoomConfiguration);
	}
	
	public void containsValuePackageSectionTourClassificationDropdown(String expectedTourClassification) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackageSection_TourClassification.findElement(By.xpath(".//span")), expectedTourClassification);
	}
	
	public void containsValuePackageSectionTourLengthDropdown(String expectedTourLength) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackageSection_TourLength, expectedTourLength);
	}
	
	public void containsValuePackageSectionTourLengthMaximumDaysDropdown(String expectedTourLengthMaximumDays) throws Exception {
		CommonFunctions.elementAttributeContains(input_PackageSection_TourLengthMaximumDays, "value", expectedTourLengthMaximumDays);
	}
	
	public void containsValuePackageSectionTourLengthMinimumDaysDropdown(String expectedTourLengthMinimumDays) throws Exception {
		CommonFunctions.elementAttributeContains(input_PackageSection_TourLengthMinimumDays, "value", expectedTourLengthMinimumDays);
	}
	
	public void containsValuePackageSectionTourMarketDropdown(String expectedTourMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackageSection_TourMarket.findElement(By.xpath(".//span")), expectedTourMarket);
	}
	
	public void containsValuePaymentRulesSectionFirstDepositAmountInput(String expectedFirstDepositAmount) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentRulesSection_FirstDepositAmount, "value", expectedFirstDepositAmount);
	}
	
	public void containsValuePaymentRulesSectionFirstDepositTypeDropdown(String expectedFirstDepositType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentRulesSection_FirstDepositType, expectedFirstDepositType);
	}
	
	public void containsValuePaymentRulesSectionFirstDepositDueDateOverrideNoOfDaysInput(String expectedFirstDepositDueDateOverrideNoOfDays) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentRulesSection_FirstDepositDueDateOverrideNoOfDays, "value", expectedFirstDepositDueDateOverrideNoOfDays);
	}
	
	public void containsValuePaymentRulesSectionFinalDueDateInput(String expectedFinalDueDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentRulesSection_FinalDueDate, "value", expectedFinalDueDate);
	}
	
	public void containsValuePaymentRulesSectionFinalDueTypeDropdown(String expectedFinalDueType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentRulesSection_FinalDueType, expectedFinalDueType);
	}
	
	public void containsValuePaymentRulesSectionSecondDepositAmountInput(String expectedSecondDepositAmount) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentRulesSection_SecondDepositAmount, "value", expectedSecondDepositAmount);
	}
	
	public void containsValuePaymentRulesSectionSecondDepositDueDateInput(String expectedSecondDepositDueDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentRulesSection_SecondDepositDueDate, "value", expectedSecondDepositDueDate);
	}
	
	public void containsValuePaymentRulesSectionSecondDepositForDropdown(String expectedSecondDepositFor) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentRulesSection_SecondDepositFor, expectedSecondDepositFor);
	}
	
	public void containsValuePaymentRulesSectionSecondDepositTypeDropdown(String expectedSecondDepositType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentRulesSection_SecondDepositType, expectedSecondDepositType);
	}
	
	public void containsValueRatePerPersonInput(String expectedRatePerPerson) throws Exception {
		CommonFunctions.elementAttributeContains(input_RatePerPerson, "origvalue", expectedRatePerPerson);
	}
	
	public void containsValueRevenueAllocationDropdown(String expectedRevenueAllocation) throws Exception {
		CommonFunctions.elementContainsText(dropdown_RevenueAllocation, expectedRevenueAllocation);
	}
	
	public void containsValueRoundingAmountInput(String expectedRoundingAmount) throws Exception {
		CommonFunctions.elementAttributeContains(input_RoundingAmount, "origvalue", expectedRoundingAmount);
	}
	
	public void containsValueRoundingRuleDropdown(String expectedRoundingRule) throws Exception {
		CommonFunctions.elementContainsText(dropdown_RoundingRule, expectedRoundingRule);
	}
	
	public void containsValueStatusDropdown(String expectedStatus) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Status, expectedStatus);
	}
	
	public void containsValueSupplierDropdown(String expectedStatus) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Supplier, expectedStatus);
	}
	
	public void containsValueSupplierSectionDeleteButtonTooltip(String expectedTooltip) throws Exception {
		CommonFunctions.elementTooltip(button_SupplierSection_DeleteSupplier, expectedTooltip);
	}
	
	public void containsValueTypeDropdown(String expectedType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Type, expectedType);
	}
	
	public void disabledMarketOfferDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_MarketOffer, "disabled", "true");
	}
	
	public void displayedAllotmentSectionAllotmentCodeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_AllotmentSection_AllotmentCode);
	}
	
	public void displayedAllotmentSectionInventoryPoolDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_AllotmentSection_InventoryPool);
	}
	
	public void displayedAllotmentSectionNoOfDaysOffsetInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AllotmentSection_NoOfDaysOffset);
	}
	
	public void displayedCombinabilityAccordion() throws Exception {
		CommonFunctions.elementDisplayed(accordion_Combinability);
	}
	
	public void displayedCombinabilityGroupDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_CombinabilityGroup);
	}
	
	public void displayedCombinabilitySectionViewCombinablePromotionsTable() throws Exception {
		CommonFunctions.elementDisplayed(table_CombinabilitySectionView_CombinablePromotions);
	}
	
	public void displayedCombinabilitySectionTopRowDataId() throws Exception {
		CommonFunctions.elementDisplayed(rowData_CombinabilitySection_TopId);
	}
	
	public void displayedConsumerWebMediumDescriptionInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ConsumerWebMediumDescription);
	}
	
	public void displayedContractAccordion() throws Exception {
		CommonFunctions.elementDisplayed(accordion_Contract);
	}
	
	public void displayedDateRangeAccordion() throws Exception {
		CommonFunctions.elementDisplayed(accordion_DateRanges);
	}
	
	public void displayedDateRangeSectionEditButton() throws Exception {
		CommonFunctions.elementDisplayed(button_DateRangeSection_EditDateRange);
	}
	
	public void displayedDateRangeSectionDeleteButton() throws Exception {
		CommonFunctions.elementDisplayed(button_DateRangeSection_DeleteDateRange);
	}
	
	public void displayedMarketOfferDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_MarketOffer);
	}
	
	public void displayedOverrideDefaultCommissionInput() throws Exception {
		CommonFunctions.elementDisplayed(input_OverrideDefaultCommission);
	}
	
	public void enabledMarketOfferDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_MarketOffer);
	}
	
	public void hiddenAllotmentAccordion() throws Exception {
		CommonFunctions.elementAttributeContains(accordion_Allotment.findElement(By.xpath(".//ancestor::div[contains(@id, 'Allotment')]")), "style", "display: none;");
	}
	
	public void hiddenCategoryDropdown() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//select[contains(@id, 'Combobox_PromotionCategory')]");
	}
	
	public void hiddenCombinabilityGroupDropdown() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//select[contains(@id, 'CombinabilityGroupDropdown')]");
	}
	
	public void hiddenConsumerWebMediumDescriptionInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_ConsumerWebMediumDescription.findElement(By.xpath(".//parent::div")), "style", "display: none;");
	}
	
	public void hiddenConsumerWebShortDescriptionInput() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id, 'Consumer_Web_Short_Description')]");
	}
	
	public void hiddenMarketOfferDropdown() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//select[contains(@id, 'MarketOfferDropdown')]");
	}
	
	public void hiddenMinimimPaxCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_MinimumPax.findElement(By.xpath(".//parent::div")), "style", "display: none;");
	}
	
	public void hiddenMinorPromotionCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_MinorPromotion.findElement(By.xpath(".//ancestor::div[contains(@id, 'MinorPromotion_Container')]")), "style", "display: none;");
	}
	
	public void hiddenPackageSectionCabinCategoryDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_PackageSection_CabinCategory.findElement(By.xpath(".//ancestor::div[contains(@id, 'cabinCategoryContainer')]")), "style", "display: none;");
	}
	
	public void hiddenPackageSectionTourClassificationDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_PackageSection_TourClassification.findElement(By.xpath(".//ancestor::div[contains(@id, 'tourClassDiv')]")), "style", "display: none;");
	}
	
	public void hiddenPackageSectionTourLengthDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_PackageSection_TourLength.findElement(By.xpath(".//ancestor::div[contains(@id, 'tourClassDiv')]")), "style", "display: none;");
	}
	
	public void hiddenRoundingAmountInput() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id, 'Rounding_AmountInput')]");
	}
	
	public void hiddenRoundingRuleDropdown() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//select[contains(@id, 'RoundingRulesDropdown')]");
	}
	
	public void selectActionValue(String actionValue) throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(dropdown_Action, actionValue);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(input_RatePerPerson);
	}
	
	public void selectAffiliateValue(String affiliateValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Affiliate, affiliateValue);
	}
	
	public void selectAllotmentSectionAllotmentCodeValue(String allotmentCodeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_AllotmentSection_AllotmentCode, allotmentCodeValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectAllotmentSectionInventoryPoolValue(String inventoryPoolValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_AllotmentSection_InventoryPool, inventoryPoolValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectAssignValue(String applicableValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Assign, applicableValue);
		CommonFunctions.clickElement(input_Code);
	}
	
	public void selectCategoryValue(String categoryValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Category, categoryValue);
		CommonFunctions.clickElement(input_RatePerPerson);
		CommonFunctions.pause(5000, false);
	}
	
	public void selectClassificationValue(String classificationValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Classification, classificationValue);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
		// CommonFunctions.clickElement(input_Code);
	}
	
	public void selectCombinabilityGroupValue(String combinabilityGroupValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_CombinabilityGroup, combinabilityGroupValue);
		CommonFunctions.pause(5000, false);
	}
	
	public void selectDateRangesSectionValue(String dateRangesValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_DateRangesSection_DateRanges, dateRangesValue);
	}
	
	public void selectMarketOfferValue(String marketOfferValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_MarketOffer, marketOfferValue);
	}
	
	public void selectPackageSectionTourLengthValue(String tourLengthValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PackageSection_TourLength, tourLengthValue);
		CommonFunctions.pause(5000, false);
	}
	
	public void selectPaymentRulesSectionFinalDueTypeValue(String finalDueTypeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PaymentRulesSection_FinalDueType, finalDueTypeValue);
	}
	
	public void selectPaymentRulesSectionSecondDepositForValue(String secondDepositForValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PaymentRulesSection_SecondDepositFor, secondDepositForValue);
	}
	
	public void selectPaymentRulesSectionFirstDepositTypeValue(String firstDepositTypeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PaymentRulesSection_FirstDepositType, firstDepositTypeValue);
	}
	
	public void selectPaymentRulesSectionSecondDepositTypeValue(String secondDepositTypeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PaymentRulesSection_SecondDepositType, secondDepositTypeValue);
	}
	
	public void selectRevenueAllocationValue(String revenueAllocationValue) throws Exception {
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(dropdown_RevenueAllocation, revenueAllocationValue);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(input_Code);
	}
	
	public void selectRoundingRuleValue(String roundingRule) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_RoundingRule, roundingRule);
		CommonFunctions.clickElement(input_Code);
	}
	
	public void selectStatusValue(String statusValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Status, statusValue);
		CommonFunctions.clickElement(input_Code);
	}
	
	public void selectSupplierValue(String supplierValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Supplier, supplierValue);
		CommonFunctions.clickElement(input_Code);
	}
	
	public void selectTypeValue(String typeValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_Type, typeValue);
		CommonFunctions.pause(5000, false);
	}
	
	public void setAllotmentSectionNoOfDaysOffsetInput(String noOfDaysOffset) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AllotmentSection_NoOfDaysOffset, noOfDaysOffset);
	}
	
	public void setCommentsSectionInternalReservationDescriptionTextArea(String internalReservationDescription) throws Exception {
		CommonFunctions.clearThenEnterElementValue(textArea_CommentsSection_InternalReservationDescription, internalReservationDescription);
	}
	
	public void setCommentsSectionTradeCommentsTextArea(String tradeComments) throws Exception {
		CommonFunctions.clearThenEnterElementValue(textArea_CommentsSection_TradeComments, tradeComments);
	}
	
	public void setConsumerWebMediumDescriptionInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ConsumerWebMediumDescription, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setDateRangeSectionDateFromInput(String dateFrom) throws Exception {
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'BookingDateFrom')]"), dateFrom);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setDateRangeSectionDateToInput(String dateTo) throws Exception {
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'BookingDateTo')]"), dateTo);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setDescriptionInput(String description) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Description, description);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setInvoiceDescriptionInput(String invoiceDescription) throws Exception {
		CommonFunctions.clearThenEnterElementValue(textArea_InvoiceDescription, invoiceDescription);
	}
	
	public void setMinimumPaxInput(String minimumPax) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_MinimumPax, minimumPax);
	}
	
	public void setOverrideDefaultCommissionInput(String overrideDefaultCommission) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_OverrideDefaultCommission, overrideDefaultCommission);
	}
	
	public void setOverridePromotionLineCommissionInput(String overridePromotionLineCommission) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_OverridePromotionLineCommission, overridePromotionLineCommission);
	}
	
	public void setPackageSectionTourLengthMaximumDaysInput(String tourLengthMaximumDays) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PackageSection_TourLengthMaximumDays, tourLengthMaximumDays);
	}
	
	public void setPackageSectionTourLengthMinimumDaysInput(String tourLengthMinimumDays) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PackageSection_TourLengthMinimumDays, tourLengthMinimumDays);
	}
	
	public void setPaymentRulesSectionFinalDueDateInput(String finalDueDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentRulesSection_FinalDueDate, finalDueDate);
	}
	
	public void setPaymentRulesSectionFirstDepositAmountInput(String firstDepositAmount) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentRulesSection_FirstDepositAmount, firstDepositAmount);
	}
	
	public void setPaymentRulesSectionFirstDepositOverrideNoOfDaysInput(String firstDepositOverrideNoOfDays) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentRulesSection_FirstDepositDueDateOverrideNoOfDays, firstDepositOverrideNoOfDays);
	}
	
	public void setPaymentRulesSectionSecondDepositAmountInput(String secondDepositAmount) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentRulesSection_SecondDepositAmount, secondDepositAmount);
	}
	
	public void setPaymentRulesSectionSecondDepositDueDateInput(String secondDepositDueDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentRulesSection_SecondDepositDueDate, secondDepositDueDate);
	}
	
	public void setRatePerPersonInput(String ratePerPerson) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_RatePerPerson, ratePerPerson);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setRoundingAmountInput(String roundingAmount) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_RoundingAmount, roundingAmount);
	}
	
	public PromotionsPage clickBottomCloseButton() throws Exception {
		CommonFunctions.clickElement(button_BottomClose);
		
		return new PromotionsPage();
	}
	
	public PromotionsPage clickBottomSavePromotionButton() throws Exception {
		CommonFunctions.clickElement(button_BottomSave);
		
		return new PromotionsPage();
	}
	
	public PromotionsPage clickTopCloseButton() throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(button_TopClose);
		
		return new PromotionsPage();
	}
	
	public PromotionsPage clickTopSavePromotionButton() throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(button_TopSave);
		
		return new PromotionsPage();
	}
	
	public String setCodeInput(String code) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Code, code);
		
		return code;
	}
	// End - Main Page Actions
	
	// Start - Contract Popup Actions
	public void clickContractPopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPopup_AddContract);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickContractPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPopup_Cancel);
	}
	
	public void clickContractPopupFindButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPopup_Find);
	}
	
	public void clickContractPopupName() throws Exception {
		CommonFunctions.clickElement(rowData_ContractPopup_TopName);
	}
	
	public void containsValueContractPopupTopRowDataId(String expectedId) throws Exception {
		CommonFunctions.elementContainsText(rowData_ContractPopup_TopId, expectedId);
	}
	
	public void containsValueContractPopupTopRowDataName(String expectedName) throws Exception {
		CommonFunctions.elementContainsText(rowData_ContractPopup_TopName, expectedName);
	}
	
	public void containsValueContractPopupTopRowDataSupplierName(String expectedSupplierName) throws Exception {
		CommonFunctions.elementContainsText(rowData_ContractPopup_TopSupplierName, expectedSupplierName);
	}
	
	public void containsValueContractPopupTopRowDataType(String expectedType) throws Exception {
		CommonFunctions.elementContainsText(rowData_ContractPopup_TopType, expectedType);
	}
	
	public void setContractPopupNameInput(String contractName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractPopup_Name, contractName);
	}
	// End - Contract Popup Actions
	
	// Start - Customer Popup Actions
	public void clickCustomerPopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_CustomerPopup_AddCustomer);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickCustomerPopupAllRowDataCheckBox() throws Exception {
		CommonFunctions.clickElement(checkbox_CustomerPopup_SelectAll);
	}
	
	public void clickCustomerPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_CustomerPopup_Cancel);
	}
	
	public void clickCustomerPopupCheckBox() throws Exception {
		CommonFunctions.clickElement(rowData_CustomerPopup_TopCheckBox);
	}
	
	public void clickCustomerPopupFindButton() throws Exception {
		CommonFunctions.clickElement(button_CustomerPopup_Find);
	}
	
	public void containsValueCustomerPopupCountryDropdown(String expectedCountry) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerPopup_Country, expectedCountry);
	}
	
	public void containsValueCustomerPopupMarketDropdown(String expectedType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerSection_Market.findElement(By.xpath(".//span")), expectedType);
	}
	
	public void containsValueCustomerPopupStateDropdown(String expectedState) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CustomerPopup_State, expectedState);
	}
	
	public void containsValueCustomerPopupTopRowDataCity(String expectedCity) throws Exception {
		CommonFunctions.elementContainsText(rowData_CustomerPopup_TopCity, expectedCity);
	}
	
	public void containsValueCustomerPopupTopRowDataId(String expectedId) throws Exception {
		CommonFunctions.elementContainsText(rowData_CustomerPopup_TopId, expectedId);
	}
	
	public void containsValueCustomerPopupTopRowDataName(String expectedName) throws Exception {
		CommonFunctions.elementContainsText(rowData_CustomerPopup_TopName, expectedName);
	}
	
	public void containsValueCustomerPopupTopRowDataPostCode(String expectedPostCode) throws Exception {
		CommonFunctions.elementContainsText(rowData_CustomerPopup_TopPostCode, expectedPostCode);
	}
	
	public void containsValueCustomerPopupTopRowDataState(String expectedState) throws Exception {
		CommonFunctions.elementContainsText(rowData_CustomerPopup_TopState, expectedState);
	}
	
	public void selectCustomerPopupCountryValue(String countryValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_CustomerPopup_Country, countryValue);
	}
	
	public void setCustomerPopupNameInput(String customerName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CustomerPopup_Name, customerName);
	}
	// End - Customer Popup Actions
	
	// Start - Date Range Popup Actions
	public void clickDateRangePopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangePopup_AddDateRange);
	}
	
	public void clickDateRangePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangePopup_Cancel);
	}
	
	public void clickDateRangePopupRemoveButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangePopup_Remove);
	}
	
	public void clickDateRangePopupSaveButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangePopup_Save);
		CommonFunctions.pause(5000, false);
	}
	
	public void containsValueDateRangePopupAddedDateFromInput(String addedDateFrom) throws Exception {
		CommonFunctions.elementAttributeContains(input_DateRangePopup_AddedDateFrom, "value", addedDateFrom);
	}
	
	public void containsValueDateRangePopupAddedDateToInput(String addedDateTo) throws Exception {
		CommonFunctions.elementAttributeContains(input_DateRangePopup_AddedDateTo, "value", addedDateTo);
	}
	
	public void displayedDateRangePopupLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_DateRangePopup_DateRangeInfo);
	}
	
	public void displayedDateRangePopupSuggestionsDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_DateRangePopup_Suggestions);
	}
	
	public void hiddenDateRangePopupAddedDateFromInput() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@class, 'AddedDateRanges')]//input[contains(@id, 'FromInput')]");
	}
	
	public void hiddenDateRangePopupAddedDateToInput() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@class, 'AddedDateRanges')]//input[contains(@id, 'ToInput')]");
	}
	
	public void hiddenDateRangePopupSuggestionsDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_DateRangePopup_Suggestions.findElement(By.xpath(".//parent::div/parent::div")), "style", "display: none;");
	}
	
	public void setDateRangePopupDepartDateFromInput(String departDateFrom) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_DateRangePopup_DateFrom, departDateFrom);
	}
	
	public void setDateRangePopupDepartDateToInput(String departDateTo) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_DateRangePopup_DateTo, departDateTo);
	}
	// End - Date Range Popup Actions
	
	// Start - Package Popup Actions
	public void clickPackagePopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_PackagePopup_AddPackage);
		CommonFunctions.pause(1500, false);
	}
	
	public void clickPackagePopupAllRowDataCheckBox() throws Exception {
		CommonFunctions.clickElement(checkbox_PackagePopup_SelectAll);
	}
	
	public void clickPackagePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_PackagePopup_Cancel);
	}
	
	public void clickPackagePopupFindButton() throws Exception {
		CommonFunctions.clickElement(button_PackagePopup_Find);
	}
	
	public void clickPackagePopupTopRowDataCheckBox() throws Exception {
		CommonFunctions.clickElement(rowData_PackagePopup_TopCheckBox);
	}
	
	public void containsValuePackagePopupBrandDropdown(String expectedBrand) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagePopup_Brand, expectedBrand);
	}
	
	public void containsValuePackagePopupTopRowDataId(String expectedId) throws Exception {
		CommonFunctions.elementContainsText(rowData_PackagePopup_TopId, expectedId);
	}
	
	public void containsValuePackagePopupTopRowDataName(String expectedName) throws Exception {
		CommonFunctions.elementContainsText(rowData_PackagePopup_TopName, expectedName);
	}
	
	public void containsValuePackagePopupTopRowDataType(String expectedType) throws Exception {
		CommonFunctions.elementContainsText(rowData_PackagePopup_TopType, expectedType);
	}
	
	public void containsValuePackagePopupTourClassDropdown(String expectedTourClass) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagePopup_TourClass, expectedTourClass);
	}
	
	public void containsValuePackagePopupTourMarketDropdown(String expectedTourMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagePopup_TourMarket, expectedTourMarket);
	}
	
	public void containsValuePackagePopupTypeDropdown(String expectedType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PackagePopup_Type, expectedType);
	}
	
	public void selectPackagePopupBrandValue(String brandValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PackagePopup_Brand, brandValue);
	}
	
	public void setPackagePopupNameInput(String packageName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PackagePopup_Name, packageName);
	}
	// End - Package Popup Actions
	
	// Start - Supplier Popup Actions
	public void clickSupplierPopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_SupplierPopup_AddSupplier);
	}
	
	public void clickSupplierPopupFindButton() throws Exception {
		CommonFunctions.clickElement(button_SupplierPopup_Find);
	}
	
	public void clickSupplierPopupName() throws Exception {
		CommonFunctions.clickElement(rowData_SupplierPopup_TopName);
	}
	
	public void clickSupplierPopupStatusDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_SupplierPopup_Status);
	}
	
	public void containsValueSupplierPopupTopRowDataCity(String expectedCity) throws Exception {
		CommonFunctions.elementContainsText(rowData_SupplierPopup_TopCity, expectedCity);
	}
	
	public void containsValueSupplierPopupTopRowDataCountry(String expectedCountry) throws Exception {
		CommonFunctions.elementContainsText(rowData_SupplierPopup_TopCountry, expectedCountry);
	}
	
	public void containsValueSupplierPopupTopRowDataId(String expectedId) throws Exception {
		CommonFunctions.elementContainsText(rowData_SupplierPopup_TopId, expectedId);
	}
	
	public void containsValueSupplierPopupTopRowDataName(String expectedName) throws Exception {
		CommonFunctions.elementContainsText(rowData_SupplierPopup_TopName, expectedName);
	}
	
	public void containsValueSupplierPopupTopRowDataThirdParty(String expectedThirdParty) throws Exception {
		CommonFunctions.elementContainsText(rowData_SupplierPopup_TopThirdParty, expectedThirdParty);
	}
	
	public void setSupplierPopupNameInput(String supplierName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_SupplierPopup_Name, supplierName);
	}
	// End - Supplier Popup Actions
	// End - Actions
}