package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ContractDetailsPage extends Base {
	// Start - Page Objects
	// Start - Main Page Objects
	@FindBy(xpath = "//span[text() = 'Contract Costs']")
	WebElement accordion_ContractCosts;
	
	@FindBy(xpath = "//span[text() = 'Contract Options']")
	WebElement accordion_ContractOptions;
	
	@FindBy(xpath = "(//input[contains(@id, 'SaveAlt')])[1]")
	WebElement button_Save;
	
	@FindBy(xpath = "(//input[contains(@value, 'Close')])[1]")
	WebElement button_TopClose;
	
	@FindBy(xpath = "//input[@value = 'Add Costs']")
	WebElement button_ContractCostsSection_AddCosts;
	
	@FindBy(xpath = "//a[contains(@id, 'CreateBulkCosts')]")
	WebElement button_ContractCostsSection_CreateBulkCosts;
	
	@FindBy(xpath = "//a[contains(@id, 'DeleteAllCostsLink')]")
	WebElement button_ContractCostsSection_DeleteAllCosts;
	
	@FindBy(xpath = "//a[contains(@id, 'ImportDatesLink')]")
	WebElement button_ContractCostsSection_ImportDates;
	
	@FindBy(xpath = "(//div[contains(@id, 'ContractCostWeblockContainer')]//div[contains(@id, 'WebBlockMainContainer')])[1]//a[contains(@id, 'DeleteCostLink')]")
	WebElement button_ContractCostsSection_TopDeleteCosts;
	
	@FindBy(xpath = "//input[contains(@id, 'addPricesButton')]")
	WebElement button_ContractPricesSection_AddPrices;
	
	@FindBy(xpath = "//a[contains(@id, 'CreateBulkPriceCosts')]")
	WebElement button_ContractPricesSection_CreateBulkPrices;
	
	@FindBy(xpath = "//a[contains(@id, 'DeleteAllPricesLink')]")
	WebElement button_ContractPricesSection_DeleteAllPrices;
	
	@FindBy(xpath = "//a[contains(@id, 'ImportDatesPriceLink')]")
	WebElement button_ContractPricesSection_ImportDates;
	
	@FindBy(xpath = "//input[contains(@id, 'editBasicInfo')]")
	WebElement button_EditBasicInfo;
	
	@FindBy(xpath = "//a[contains(@id, 'AddIteneraryLink')]")
	WebElement button_ItirenaryTemplatesSection_AddItirenaryTemplate;
	
	@FindBy(xpath = "(//a[contains(@id, 'EditItineraryLink')])[1]")
	WebElement button_ItirenaryTemplatesSection_TopEditItineraryTemplate;
	
	@FindBy(xpath = "//a[contains(@id, 'LinkAddCancellation')]")
	WebElement button_PaymentRulesSection_AddCancellationRule;
	
	@FindBy(xpath = "//a[contains(@id, 'LinkAddDeposit')]")
	WebElement button_PaymentRulesSection_AddDepositRule;
	
	@FindBy(xpath = "//a[contains(@id, 'LinkAddFinal')]")
	WebElement button_PaymentRulesSection_AddFinalPaymentRule;
	
	@FindBy(xpath = "(//a[contains(@id, 'LinkCancellationDelete')])[1]")
	WebElement button_PaymentRulesSection_TopDeleteCancellationRule;
	
	@FindBy(xpath = "(//a[contains(@id, 'LinkDepositDelete')])[1]")
	WebElement button_PaymentRulesSection_TopDeleteDepositRule;
	
	@FindBy(xpath = "(//a[contains(@id, 'LinkFinalPaymentDelete')])[1]")
	WebElement button_PaymentRulesSection_TopDeleteFinalPaymentRule;
	
	@FindBy(xpath = "(//a[contains(@id, 'LinkCancellationEdit')])[1]")
	WebElement button_PaymentRulesSection_TopEditCancellationRule;
	
	@FindBy(xpath = "(//a[contains(@id, 'LinkDepositEdit')])[1]")
	WebElement button_PaymentRulesSection_TopEditDepositRule;
	
	@FindBy(xpath = "(//a[contains(@id, 'LinkFinalPaymentEdit')])[1]")
	WebElement button_PaymentRulesSection_TopEditFinalPaymentRule;
	
	@FindBy(xpath = "//input[contains(@id, 'UpdatePackage')]")
	WebElement button_UpdatePackages;
	
	@FindBy(xpath = "//div[contains(@id, 'MainContractCostContainer')]//input[contains(@id, 'HidePastDatesCheckbox')]")
	WebElement checkbox_ContractCostsSection_HidePastDates;
	
	@FindBy(xpath = "//div[contains(@id, 'CopyWhenReplicateContainer')]//input")
	WebElement checkbox_ContractCostsSection_IncludeCostsWhenCopyingContract;
	
	@FindBy(xpath = "//input[contains(@id, 'DoNotShowonItineraryCheckbox')]")
	WebElement checkbox_ContractOptionsSection_DoNotShowOnItinerary;
	
	@FindBy(xpath = "//input[contains(@id, 'IndicativePricingCheckbox')]")
	WebElement checkbox_ContractOptionsSection_IndicativePricing;
	
	@FindBy(xpath = "//input[contains(@id, 'PassengerWeightRequiredCheckbox')]")
	WebElement checkbox_ContractOptionsSection_PassengerWeightRequired;
	
	@FindBy(xpath = "//input[contains(@id, 'PrintClubMembershipLevelCheckbox')]")
	WebElement checkbox_ContractOptionsSection_PrintClubMembershipLevel;
	
	@FindBy(xpath = "//input[contains(@id, 'PrintFlightDetailsCheckbox')]")
	WebElement checkbox_ContractOptionsSection_PrintFlightDetails;
	
	@FindBy(xpath = "//input[contains(@id, 'PrintOPRefNumberCheckbox')]")
	WebElement checkbox_ContractOptionsSection_PrintOPRefNumber;
	
	@FindBy(xpath = "//input[contains(@id, 'PrintPassportDetailsCheckbox')]")
	WebElement checkbox_ContractOptionsSection_PrintPassportDetails;
	
	@FindBy(xpath = "//input[contains(@id, 'PrintPaxPreTourContactCheckbox')]")
	WebElement checkbox_ContractOptionsSection_PrintPaxPreTourContact;
	
	@FindBy(xpath = "//input[contains(@id, 'PrintPensionSeniorCardNumberCheckbox')]")
	WebElement checkbox_ContractOptionsSection_PrintPensionSeniorCardNumber;
	
	@FindBy(xpath = "//input[contains(@id, 'PrintSabrePNRCheckbox')]")
	WebElement checkbox_ContractOptionsSection_PrintSabrePNR;
	
	@FindBy(xpath = "//input[contains(@id, 'HidePastPriceDatesCheckbox')]")
	WebElement checkbox_ContractPricesSection_HidePastDates;
	
	@FindBy(xpath = "//input[contains(@id, 'IncludePriceWhenCopyingCheckbox')]")
	WebElement checkbox_ContractPricesSection_IncludePricesWhenCopyingContract;
	
	@FindBy(xpath = "//label[contains(text(), 'Exclude from Cost Update')]//parent::div//input")
	WebElement checkbox_ExcludeFromCostUpdate;
	
	@FindBy(xpath = "(//div[contains(@id, 'ContractPriceContainer')]//span[text() = 'Maximum Commission'])[1]")
	WebElement columnHeader_ContractPricesSection_TopMaximumCommission;
	
	@FindBy(xpath = "//select[contains(@id, 'AutoSendDropdown')]")
	WebElement dropdown_AutoSendToSupplierContact;
	
	@FindBy(xpath = "(//span[contains(@id, 'GridContainer_MaxRowLabel')])[1]")
	WebElement dropdown_ContractCostsSection_TopMaxRowDisplay;
	
	@FindBy(xpath = "//div[contains(@id, 'CurrencyDropdown')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_Currency;
	
	@FindBy(xpath = "//div[contains(@id, 'DeptartmentDropdown')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_Department;
	
	@FindBy(xpath = "//select[contains(@id, 'AirlineCombo')]")
	WebElement dropdown_IndicativeAirSection_Airline;
	
	@FindBy(xpath = "//label[text() = 'Cabin Class']//following-sibling::*[contains(@id, 'CabinCombo')]//a[contains(@class, 'choice')]")
	WebElement dropdown_IndicativeAirSection_CabinClass;
	
	@FindBy(xpath = "//label[text() = 'Location']//parent::div//button")
	WebElement dropdown_IndicativeAirSection_Location;
	
	@FindBy(xpath = "//div[contains(@id, 'OfficeDropdown')]//span[contains(@class, 'select2-chosen')]")
	WebElement dropdown_Office;
	
	@FindBy(xpath = "//select[contains(@id, 'StatusDropdown')]")
	WebElement dropdown_Status;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractTypeDropdown')]")
	WebElement dropdown_Type;
	
	@FindBy(xpath = "(//span[contains(@id, 'ContractCategoriesListRecords')]//img[contains(@class, 'MealPlan')])[1]")
	WebElement image_ContractCostsSection_TopMealPlan;
	
	@FindBy(xpath = "//input[contains(@id, 'CitySearchInput')]")
	WebElement input_City;
	
	@FindBy(xpath = "(//input[@ref = 'eColumnFloatingFilter'])[1]")
	WebElement input_ContractCostsSection_TopDatesFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'IndicativePricingMinInput')]")
	WebElement input_ContractOptionsSection_MinContractValue;
	
	@FindBy(xpath = "//input[contains(@id, 'IndicativePricingMaxInput')]")
	WebElement input_ContractOptionsSection_MaxContractValue;
	
	@FindBy(xpath = "//input[contains(@id, 'ShipCodeInput')]")
	WebElement input_ContractOptionsSection_ShipCode;
	
	@FindBy(xpath = "(//div[contains(@id, 'ContractPriceContainer')]//input[@ref = 'eColumnFloatingFilter'])[2]")
	WebElement input_ContractPricesSection_TopCurrencyFilter;
	
	@FindBy(xpath = "(//div[contains(@id, 'ContractPriceContainer')]//input[@ref = 'eColumnFloatingFilter'])[1]")
	WebElement input_ContractPricesSection_TopDatesFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'EndDateInput')]")
	WebElement input_EndDate;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractNameInput')]")
	WebElement input_Name;
	
	@FindBy(xpath = "//input[contains(@id, 'StartDateInput')]")
	WebElement input_StartDate;
	
	@FindBy(xpath = "//input[contains(@id, 'SupplierSearchInput')]")
	WebElement input_Supplier;
	
	@FindBy(xpath = "(//div[contains(@id, 'AutoSendContainer')]//div)[2]")
	WebElement label_AutoSendToSupplierContact;
	
	@FindBy(xpath = "(//div[contains(@id, 'CityContainer')]//div)[2]")
	WebElement label_City;
	
	@FindBy(xpath = "(//div[contains(@id, 'Row3')]//div)[2]")
	WebElement label_Comments;
	
	@FindBy(xpath = "//*[text() = 'Created By']//parent::div//following-sibling::div//span")
	WebElement label_CreatedBy;
	
	@FindBy(xpath = "//*[text() = 'Created Date']//parent::div//following-sibling::div//span")
	WebElement label_CreatedDate;
	
	@FindBy(xpath = "(//div[contains(@id, 'CurrencyContainer')]//div)[2]")
	WebElement label_Currency;
	
	@FindBy(xpath = "(//div[contains(@id, 'DepartmentContainer')]//div)[2]")
	WebElement label_Department;
	
	@FindBy(xpath = "(//div[contains(@id, 'EndDateContainer')]//div)[2]")
	WebElement label_EndDate;
	
	@FindBy(xpath = "(//span[text() = 'Costs displayed are for adult pax type only, and are GST exclusive.'])[1]")
	WebElement label_ContractCostsSection_TopHelpText1;
	
	@FindBy(xpath = "(//span[text() = 'Estimated Costs'])[1]")
	WebElement label_ContractCostsSection_TopHelpText2;
	
	@FindBy(xpath = "(//span[text() = 'Shared Allowed'])[1]")
	WebElement label_ContractCostsSection_TopHelpText3;
	
	@FindBy(xpath = "(//span[text() = 'GST>0'])[1]")
	WebElement label_ContractCostsSection_TopHelpText4;
	
	@FindBy(xpath = "(//div[contains(@id, 'ContractNameContainer')]//div)[2]")
	WebElement label_Name;
	
	@FindBy(xpath = "(//div[contains(@id, 'OfficeContainer')]//div)[2]")
	WebElement label_Office;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractPaymentRulesContainer')]//div[text() = 'Cancellation']")
	WebElement label_PaymentRulesSection_CancellationTab;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractPaymentRulesContainer')]//div[text() = 'Deposit']")
	WebElement label_PaymentRulesSection_DepositTab;
	
	@FindBy(xpath = "//div[contains(@id, 'ContractPaymentRulesContainer')]//div[text() = 'Final Payment']")
	WebElement label_PaymentRulesSection_FinalPaymentTab;
	
	@FindBy(xpath = "(//div[contains(@id, 'StartDateContainer')]//div)[2]")
	WebElement label_StartDate;
	
	@FindBy(xpath = "(//div[contains(@id, 'StatusContainer')]//div)[2]")
	WebElement label_Status;
	
	@FindBy(xpath = "(//div[contains(@id, 'SupplierContainer')]//div)[2]")
	WebElement label_Supplier;
	
	@FindBy(xpath = "(//div[contains(@id, 'ContractTypeContainer')]//div)[2]")
	WebElement label_Type;
	
	@FindBy(xpath = "//table[contains(@id, 'CancellationTableRecords')]")
	WebElement table_PaymentRulesSection_PaymentCancellationRules;
	
	@FindBy(xpath = "//table[contains(@id, 'DepositTableRecords')]")
	WebElement table_PaymentRulesSection_PaymentDepositRules;
	
	@FindBy(xpath = "//textarea[contains(@id, 'CommentsInput')]")
	WebElement textArea_Comments;
	// End - Main Page Objects
	
	// Start - Update Basic Information Popup Objects
	@FindBy(xpath = "//form[contains(@action, 'Popup')]//input[contains(@id, 'CloseBottomButton')]")
	WebElement button_UpdateBasicInformationPopup_Close;
	
	@FindBy(xpath = "//form[contains(@action, 'Popup')]//input[contains(@id, 'SaveAltBottom')]")
	WebElement button_UpdateBasicInformationPopup_Save;
	
	@FindBy(xpath = "//form[contains(@action, 'Popup')]//*[text() = 'Created By']//parent::div//following-sibling::div//span")
	WebElement label_UpdateBasicInformationPopup_CreatedBy;
	
	@FindBy(xpath = "//form[contains(@action, 'Popup')]//*[text() = 'Created Date']//parent::div//following-sibling::div//span")
	WebElement label_UpdateBasicInformationPopup_CreatedDate;
	// End - Update Basic Information Popup Objects
	
	// Start - Modify Contract Costs Details Popup Objects
	@FindBy(xpath = "//a[contains(@id, 'CancelLinkButton')]")
	WebElement button_ModifyContractCostsDetailsPopup_Cancel;
	
	@FindBy(xpath = "//input[contains(@id, 'PrintVoucherCheckbox')]")
	WebElement checkbox_ModifyContractCostsDetailsPopup_PrintVoucher;
	
	@FindBy(xpath = "//input[contains(@id, 'SharedAllowedCheckbox')]")
	WebElement checkbox_ModifyContractCostsDetailsPopup_ShareAllowed;
	
	@FindBy(xpath = "//div[contains(@id, 'Category1Combobox')]")
	WebElement dropdown_ModifyContractCostsDetailsPopup_Category1;
	
	@FindBy(xpath = "//div[contains(@id, 'Category2Combobox')]")
	WebElement dropdown_ModifyContractCostsDetailsPopup_Category2;
	
	@FindBy(xpath = "//div[contains(@id, 'NormalRateDaysContainer')]//button")
	WebElement dropdown_ModifyContractCostsDetailsPopup_Days;
	
	@FindBy(xpath = "//div[contains(@id, 'GuestConfigurationCombobox')]")
	WebElement dropdown_ModifyContractCostsDetailsPopup_GuestConfiguration;
	
	@FindBy(xpath = "//select[contains(@id, 'RateTypeCombobox')]")
	WebElement dropdown_ModifyContractCostsDetailsPopup_RateType;
	
	@FindBy(xpath = "//input[contains(@id, 'AllotmentCodeInput')]")
	WebElement input_ModifyContractCostsDetailsPopup_AllotmentCode;
	
	@FindBy(xpath = "//input[contains(@id, 'MaxChildAge')]")
	WebElement input_ModifyContractCostsDetailsPopup_MaximumChildAge;
	
	@FindBy(xpath = "//input[contains(@id, 'MaximumPaxInput')]")
	WebElement input_ModifyContractCostsDetailsPopup_MaximumNights;
	
	@FindBy(xpath = "//input[contains(@id, 'MaximumPaxInput')]")
	WebElement input_ModifyContractCostsDetailsPopup_MaximumPax;
	
	@FindBy(xpath = "//input[contains(@id, 'MinimumPaxInput')]")
	WebElement input_ModifyContractCostsDetailsPopup_MinimumNights;
	
	@FindBy(xpath = "//input[contains(@id, 'MinimumPaxInput')]")
	WebElement input_ModifyContractCostsDetailsPopup_MinimumPax;
	
	@FindBy(xpath = "//input[contains(@id, 'NumberOfDaysInput')]")
	WebElement input_ModifyContractCostsDetailsPopup_NumberOfDays;
	
	@FindBy(xpath = "//input[contains(@id, 'QuantityInput')]")
	WebElement input_ModifyContractCostsDetailsPopup_Quantity;
	
	@FindBy(xpath = "//div[contains(@id, 'AllotmentCodeContainer')]//div[text() != '']")
	WebElement label_ModifyContractCostsDetailsPopup_AllotmentCode;
	
	@FindBy(xpath = "//div[contains(@id, 'Category1Container')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_Category1;
	
	@FindBy(xpath = "//div[contains(@id, 'Category2Container')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_Category2;
	
	@FindBy(xpath = "//div[contains(@id, 'NormalRateDaysContainer')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_Days;
	
	@FindBy(xpath = "//div[contains(@id, 'GuestConfigurationContainer')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_GuestConfiguration;
	
	@FindBy(xpath = "//div[contains(@id, 'InvoiceCommentsContainer')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_InvoiceComments;
	
	@FindBy(xpath = "//div[contains(@id, 'MaximumChildAgePaxContainer')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_MaximumChildAge;
	
	@FindBy(xpath = "//div[contains(@id, 'MaximumPaxContainer')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_MaximumNights;
	
	@FindBy(xpath = "//div[contains(@id, 'MinimumPaxContainer')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_MinimumNights;
	
	@FindBy(xpath = "//div[contains(@id, 'NumberOfDaysContainer')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_NumberOfDays;
	
	@FindBy(xpath = "//div[contains(@id, 'QuantityContainer')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_Quantity;
	
	@FindBy(xpath = "//div[contains(@id, 'RateTypeContainer')]//div")
	WebElement label_ModifyContractCostsDetailsPopup_RateType;
	
	@FindBy(xpath = "(//div[contains(@id, 'VoucherCommentsContainer')]//div)[1]")
	WebElement label_ModifyContractCostsDetailsPopup_VoucherComments;
	
	@FindBy(xpath = "//textarea[contains(@id, 'InvoiceCommentsInput')]")
	WebElement textArea_ModifyContractCostsDetailsPopup_InvoiceComments;
	
	@FindBy(xpath = "//textarea[contains(@id, 'VoucherCommentsInput')]")
	WebElement textArea_ModifyContractCostsDetailsPopup_VoucherComments;
	// End - Modify Contract Costs Details Popup Objects
	
	// Start - Update Packages Popup Objects
	@FindBy(xpath = "//div[contains(@class, 'MainContentPopup')]//input[@value = 'Cancel']")
	WebElement button_UpdatePackagesPopup_Cancel;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContentPopup')]//input[@value = 'Update Contract Name']")
	WebElement button_UpdatePackagesPopup_UpdateContractName;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContentPopup')]//input[@value = 'Update Supplier Name']")
	WebElement button_UpdatePackagesPopup_UpdateSupplierName;
	
	@FindBy(xpath = "//div[@class = 'MainContentPopup']//div[contains(@class, 'header')]//div[contains(@col-id, '0')]")
	WebElement checkbox_UpdatePackagesPopup_AllPackages;
	
	@FindBy(xpath = "//span[text() = 'Brand']")
	WebElement columnHeader_UpdatePackagesPopup_Brand;
	
	@FindBy(xpath = "//span[text() = 'Package ID']")
	WebElement columnHeader_UpdatePackagesPopup_PackageId;
	
	@FindBy(xpath = "//span[text() = 'Package Name']")
	WebElement columnHeader_UpdatePackagesPopup_PackageName;
	
	@FindBy(xpath = "//span[text() = 'Package Type']")
	WebElement columnHeader_UpdatePackagesPopup_PackageType;
	
	@FindBy(xpath = "//span[text() = 'Status']")
	WebElement columnHeader_UpdatePackagesPopup_Status;
	
	@FindBy(xpath = "//span[text() = 'Tour Market']")
	WebElement columnHeader_UpdatePackagesPopup_TourMarket;
	
	@FindBy(xpath = "//select[contains(@id, 'PackageStatusCombobox')]//parent::div//button")
	WebElement dropdown_UpdatePackagesPopup_PackageStatus;
	
	@FindBy(xpath = "(//div[@class = 'MainContentPopup']//input[@ref = 'eColumnFloatingFilter'])[2]")
	WebElement input_UpdatePackagesPopup_PackageNameFilter;
	// End - Update Packages Popup Objects
	
	// Start - Create Bulk Costs Popup Objects
	@FindBy(xpath = "//input[contains(@id, 'AddDateButton')]")
	WebElement button_CreateBulkCostsPopup_AddDate;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContentPopup')]//input[@value = 'Cancel']")
	WebElement button_CreateBulkCostsPopup_Cancel;
	
	@FindBy(xpath = "//input[contains(@value, 'Create Costs')]")
	WebElement button_CreateBulkCostsPopup_CreateCosts;
	
	@FindBy(xpath = "//input[contains(@id, 'QuadCheckBox')]")
	WebElement checkbox_CreateBulkCostsPopup_QuadShare;
	
	@FindBy(xpath = "//input[contains(@id, 'TwinCheckBox')]")
	WebElement checkbox_CreateBulkCostsPopup_TwinShare;
	
	@FindBy(xpath = "//div[contains(@id, 'MealPaxConfigDropdown')]")
	WebElement dropdown_CreateBulkCostsPopup_MealPaxConfiguration;
	
	@FindBy(xpath = "//div[contains(@id, 'MealPlansContainer')]//div[contains(@class, 'ms-parent')]")
	WebElement dropdown_CreateBulkCostsPopup_MealPlans;
	
	@FindBy(xpath = "//div[contains(@id, 'RoomTypeContainer')]//button")
	WebElement dropdown_CreateBulkCostsPopup_RoomType;
	
	@FindBy(xpath = "//input[contains(@id, 'AllotmentCodeInput')]")
	WebElement input_CreateBulkCostsPopup_AllotmentCode;
	// End - Create Bulk Costs Popup Objects
	
	// Start - Import Dates From Cost Popup Objects
	@FindBy(xpath = "//input[@value = 'Cancel']")
	WebElement button_ImportDatesFromCostPopup_Cancel;
	
	@FindBy(xpath = "//input[@value = 'Import Dates']")
	WebElement button_ImportDatesFromCostPopup_ImportDates;
	
	@FindBy(xpath = "//select[contains(@id, 'category1dropdown')]")
	WebElement dropdown_ImportDatesFromCostPopup_Category1;
	
	@FindBy(xpath = "//select[contains(@id, 'category2Dropdown')]")
	WebElement dropdown_ImportDatesFromCostPopup_Category2;
	
	@FindBy(xpath = "//div[contains(@id, 'costConfigContainer')]//div[contains(@id, 'dropDownContainer')]")
	WebElement dropdown_ImportDatesFromCostPopup_CostConfiguration;
	
	@FindBy(xpath = "//select[contains(@id, 'CostTypeDropdown')]")
	WebElement dropdown_ImportDatesFromCostPopup_CostType;
	
	@FindBy(xpath = "//select[contains(@id, 'guestConfigDropdown')]//parent::div//div[contains(@id, 'guestConfigDropdown')]")
	WebElement dropdown_ImportDatesFromCostPopup_GuestConfiguration;
	
	@FindBy(xpath = "//select[contains(@id, 'rateTypeDropdown')]")
	WebElement dropdown_ImportDatesFromCostPopup_RateType;
	
	@FindBy(xpath = "//div[contains(@id, 'seasonContainer')]//button[@type= 'button']")
	WebElement dropdown_ImportDatesFromCostPopup_Season;
	
	@FindBy(xpath = "//input[contains(@id, 'costInput')]")
	WebElement input_ImportDatesFromCostPopup_Costs;
	
	@FindBy(xpath = "//input[contains(@id, 'GuestConfigInput')]")
	WebElement input_ImportDatesFromCostPopup_GuestConfigurationFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'maxInput')]")
	WebElement input_ImportDatesFromCostPopup_MaximumPax;
	
	@FindBy(xpath = "//input[contains(@id, 'minPaxInput')]")
	WebElement input_ImportDatesFromCostPopup_MinimumPax;
	
	@FindBy(xpath = "//input[contains(@id, 'noOfDaysInput')]")
	WebElement input_ImportDatesFromCostPopup_NumberOfDays;
	
	@FindBy(xpath = "//input[contains(@id, 'paxRangeSearchInput')]")
	WebElement input_ImportDatesFromCostPopup_PaxRangeFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'quantityInput')]")
	WebElement input_ImportDatesFromCostPopup_Quantity;
	
	@FindBy(xpath = "//div[contains(@id, 'MaxContainer')]//label")
	WebElement label_ImportDatesFromCostPopup_MaximumPax;
	
	@FindBy(xpath = "//div[contains(@id, 'minPaxContainer')]//label")
	WebElement label_ImportDatesFromCostPopup_MinimumPax;
	// End - Import Dates From Cost Popup Objects
	
	// Start - Import Dates From Price Popup Objects
	@FindBy(xpath = "//input[@value = 'Cancel']")
	WebElement button_ImportDatesFromPricePopup_Cancel;
	
	@FindBy(xpath = "//input[@value = 'Import Dates']")
	WebElement button_ImportDatesFromPricePopup_ImportDates;
	
	@FindBy(xpath = "//label[contains(text(), 'Include')]//parent::div//parent::div//input")
	WebElement checkbox_ImportDatesFromPricePopup_IncludePastDates;
	
	@FindBy(xpath = "//div[contains(@id, 'CostConfigContainer')]//span[contains(@id, 'CostConfigInputAjaxRfrsh')]//input")
	WebElement dropdown_ImportDatesFromPricePopup_CostConfiguration;
	
	@FindBy(xpath = "//div[contains(@id, 'CurrencyContainer')]//button")
	WebElement dropdown_ImportDatesFromPricePopup_Currency;
	
	@FindBy(xpath = "//input[contains(@id, 'GuestConfigInput')]")
	WebElement input_ImportDatesFromPricePopup_GuestConfigurationFilter;
	
	@FindBy(xpath = "//input[contains(@id, 'MaxCommInput')]")
	WebElement input_ImportDatesFromPricePopup_MaximumCommission;
	
	@FindBy(xpath = "//input[contains(@id, 'MinCommInput')]")
	WebElement input_ImportDatesFromPricePopup_MinimumCommission;
	
	@FindBy(xpath = "//input[contains(@id, 'Noncommisioninput')]")
	WebElement input_ImportDatesFromPricePopup_NonCommission;
	
	@FindBy(xpath = "//input[contains(@id, 'PriceInput')]")
	WebElement input_ImportDatesFromPricePopup_Price;
	
	@FindBy(xpath = "//label[text() = 'Respective Guest Configurations']//parent::div//parent::div//input")
	WebElement radioButton_ImportDatesFromPricePopup_RespectiveGuestConfigurations;
	
	@FindBy(xpath = "//label[text() = 'Twin Guest Configuration']//parent::div//parent::div//input")
	WebElement radioButton_ImportDatesFromPricePopup_TwinGuestConfiguration;
	// End - Import Dates From Price Popup Objects
	
	// Start - Payment Cancellation Rule Popup Objects
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement button_PaymentCancellationRulePopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'CloseLink')]")
	WebElement button_PaymentCancellationRulePopup_Close;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//a[contains(@id, 'AddIteneraryLink')]")
	WebElement button_PaymentCancellationRulePopup_AddRule;
	
	@FindBy(xpath = "//select[contains(@id, 'ComboBox_Action')]")
	WebElement dropdown_PaymentCancellationRulePopup_Action;
	
	@FindBy(xpath = "//div[contains(@id, 'ComboBox_Currency')]")
	WebElement dropdown_PaymentCancellationRulePopup_Currency;
	
	@FindBy(xpath = "//div[contains(@id, 'ComboBox_CustomerMarket')]")
	WebElement dropdown_PaymentCancellationRulePopup_CustomerMarket;
	
	@FindBy(xpath = "//div[contains(@id, 'ComboBox_CustomerType')]")
	WebElement dropdown_PaymentCancellationRulePopup_CustomerType;
	
	@FindBy(xpath = "//select[contains(@id, 'ComboBox_ItemType')]")
	WebElement dropdown_PaymentCancellationRulePopup_ItemType;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractPaymentRules_Amount_Percentage')]")
	WebElement input_PaymentCancellationRulePopup_AmountPercentage;
	
	@FindBy(xpath = "//label[text() = 'Booking End Date']//following-sibling::input")
	WebElement input_PaymentCancellationRulePopup_BookingEndDate;
	
	@FindBy(xpath = "//label[text() = 'Booking Start Date']//following-sibling::input")
	WebElement input_PaymentCancellationRulePopup_BookingStartDate;
	
	@FindBy(xpath = "//label[text() = 'Departure End Date']//following-sibling::input")
	WebElement input_PaymentCancellationRulePopup_DepartureEndDate;
	
	@FindBy(xpath = "//label[text() = 'Departure Start Date']//following-sibling::input")
	WebElement input_PaymentCancellationRulePopup_DepartureStartDate;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractPaymentRules_MaxDays')]")
	WebElement input_PaymentCancellationRulePopup_MaximumDays;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractPaymentRules_MinDays')]")
	WebElement input_PaymentCancellationRulePopup_MinimumDays;
	// End - Payment Cancellation Rule Popup Objects
	
	// Start - Payment Deposit Rule Popup Objects
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement button_PaymentDepositRulePopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'CloseLink')]")
	WebElement button_PaymentDepositRulePopup_Close;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//a[contains(@id, 'AddIteneraryLink')]")
	WebElement button_PaymentDepositRulePopup_AddRule;
	
	@FindBy(xpath = "//select[contains(@id, 'ComboBox_Action')]")
	WebElement dropdown_PaymentDepositRulePopup_Action;
	
	@FindBy(xpath = "//div[contains(@id, 'ComboBox_Currency')]")
	WebElement dropdown_PaymentDepositRulePopup_Currency;
	
	@FindBy(xpath = "//div[contains(@id, 'ComboBox_CustomerMarket')]")
	WebElement dropdown_PaymentDepositRulePopup_CustomerMarket;
	
	@FindBy(xpath = "//div[contains(@id, 'ComboBox_CustomerType')]")
	WebElement dropdown_PaymentDepositRulePopup_CustomerType;
	
	@FindBy(xpath = "//select[contains(@id, 'ComboBox_ItemType')]")
	WebElement dropdown_PaymentDepositRulePopup_ItemType;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractPaymentRules_Amount_Percentage')]")
	WebElement input_PaymentDepositRulePopup_AmountPercentage;
	
	@FindBy(xpath = "//label[text() = 'Booking End Date']//following-sibling::input")
	WebElement input_PaymentDepositRulePopup_BookingEndDate;
	
	@FindBy(xpath = "//label[text() = 'Booking Start Date']//following-sibling::input")
	WebElement input_PaymentDepositRulePopup_BookingStartDate;
	
	@FindBy(xpath = "//label[text() = 'Departure End Date']//following-sibling::input")
	WebElement input_PaymentDepositRulePopup_DepartureEndDate;
	
	@FindBy(xpath = "//label[text() = 'Departure Start Date']//following-sibling::input")
	WebElement input_PaymentDepositRulePopup_DepartureStartDate;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractPaymentRules_MaxDays')]")
	WebElement input_PaymentDepositRulePopup_MaximumDays;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractPaymentRules_MinDays')]")
	WebElement input_PaymentDepositRulePopup_MinimumDays;
	// End - Payment Deposit Rule Popup Objects
	
	// Start - Payment Final Payment Rule Popup Objects
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement button_PaymentFinalPaymentRulePopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'CloseLink')]")
	WebElement button_PaymentFinalPaymentRulePopup_Close;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//a[contains(@id, 'AddIteneraryLink')]")
	WebElement button_PaymentFinalPaymentRulePopup_AddRule;
	
	@FindBy(xpath = "//div[contains(@id, 'ComboBox_Currency')]")
	WebElement dropdown_PaymentFinalPaymentRulePopup_Currency;
	
	@FindBy(xpath = "//div[contains(@id, 'ComboBox_CustomerMarket')]")
	WebElement dropdown_PaymentFinalPaymentRulePopup_CustomerMarket;
	
	@FindBy(xpath = "//div[contains(@id, 'ComboBox_CustomerType')]")
	WebElement dropdown_PaymentFinalPaymentRulePopup_CustomerType;
	
	@FindBy(xpath = "//label[text() = 'Booking End Date']//following-sibling::input")
	WebElement input_PaymentFinalPaymentRulePopup_BookingEndDate;
	
	@FindBy(xpath = "//label[text() = 'Booking Start Date']//following-sibling::input")
	WebElement input_PaymentFinalPaymentRulePopup_BookingStartDate;
	
	@FindBy(xpath = "//label[text() = 'Departure End Date']//following-sibling::input")
	WebElement input_PaymentFinalPaymentRulePopup_DepartureEndDate;
	
	@FindBy(xpath = "//label[text() = 'Departure Start Date']//following-sibling::input")
	WebElement input_PaymentFinalPaymentRulePopup_DepartureStartDate;
	
	@FindBy(xpath = "//label[text() = 'Date']//following-sibling::input")
	WebElement input_PaymentFinalPaymentRulePopup_DueDate;
	
	@FindBy(xpath = "//input[contains(@id, 'ContractPaymentRules_MinDays')]")
	WebElement input_PaymentFinalPaymentRulePopup_MinimumDays;
	
	@FindBy(xpath = "//input[contains(@id, 'DueDate') and @type = 'radio']")
	WebElement radioButton_PaymentFinalPaymentRulePopup_DueDate;
	
	@FindBy(xpath = "//input[contains(@id, 'MinDays') and @type = 'radio']")
	WebElement radioButton_PaymentFinalPaymentRulePopup_MinimumDays;
	// End - Payment Final Payment Rule Popup Objects
	
	// Start - Itinerary Template Popup Objects
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement button_ItirenaryTemplatePopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'CloseLink')]")
	WebElement button_ItirenaryTemplatePopup_Close;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//a[contains(@id, 'AddIteneraryLink')]")
	WebElement button_ItirenaryTemplatePopup_Save;
	
	@FindBy(xpath = "//div[contains(@id, 'ItineraryContainer')]")
	WebElement dropdown_ItirenaryTemplatePopup_ItineraryTemplate;
	
	@FindBy(xpath = "//input[contains(@id, 'InputNoOfDay')]")
	WebElement input_ItirenaryTemplatePopup_Day;
	
	@FindBy(xpath = "//input[contains(@id, 'EndDateInput')]")
	WebElement input_ItirenaryTemplatePopup_EndDate;
	
	@FindBy(xpath = "//input[contains(@id, 'StartDateInput')]")
	WebElement input_ItirenaryTemplatePopup_StartDate;
	
	@FindBy(xpath = "//input[contains(@id, 'InputTime')]")
	WebElement input_ItirenaryTemplatePopup_Time;
	
	@FindBy(xpath = "//input[contains(@id,'StartDateInput')]//following::span[text()='Dates overlap existing itinerary']")
	WebElement validation_StartDateValidationMessage;
	
	@FindBy(xpath = "//input[contains(@id,'EndDateInput')]//following::span[text()='Dates overlap existing itinerary']")
	WebElement validation_EndDateValidationMessage;
	// End - Itinerary Template Popup Objects
	
	// Start - Contract Price Popup Objects
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content2') and contains(@class, 'PH Tabs')]//input[@value = 'Add to Table']")
	WebElement button_ContractPricePopup_AddCustomDatesSection_AddToTable;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//input[@value = 'Cancel']")
	WebElement button_ContractPricePopup_Cancel;
	
	@FindBy(xpath = "//a[@class = 'CancelRowAction']")
	WebElement button_ContractPricePopup_ContractPricesTable_Cancel;
	
	@FindBy(xpath = "//div[contains(@id, 'PricesContainer')]//button[contains(@class, 'DeletedRowsButton')]")
	WebElement button_ContractPricePopup_ContractPricesTable_Delete;
	
	@FindBy(xpath = "//a[@class = 'SaveRowAction']")
	WebElement button_ContractPricePopup_ContractPricesTable_Save;
	
	@FindBy(xpath = "//div[@class = 'wj-colheaders']//div[text() = 'Start Date']//button")
	WebElement button_ContractPricePopup_ContractPricesTable_StartDateFilter;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content1') and contains(@class, 'PH Tabs')]//input[@value = 'Add to Table']")
	WebElement button_ContractPricePopup_ImportDatesSection_AddToTable;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//input[@value = 'Save Prices']")
	WebElement button_ContractPricePopup_SavePrices;
	
	@FindBy(xpath = "//div[@class = 'wj-row']//div[contains(@class, 'wj-cell')]//input[@class = 'select-all']")
	WebElement checkbox_ContractPricePopup_ContractPricesTable_AllRows;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content1') and contains(@class, 'PH Tabs')]//div[text() = 'Copy Prices']//preceding-sibling::div//input")
	WebElement checkbox_ContractPricePopup_ImportDatesSection_CopyPrices;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content1') and contains(@class, 'PH Tabs')]//div[text() = 'Include Past Dates']//preceding-sibling::div//input")
	WebElement checkbox_ContractPricePopup_ImportDatesSection_IncludePastDates;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content2') and contains(@class, 'PH Tabs')]//span[contains(@id, 'PaxCombo')]//parent::div//button")
	WebElement dropdown_ContractPricePopup_AddCustomDatesSection_PaxType;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content2') and contains(@class, 'PH Tabs')]//span[contains(@id, 'PriceCurrencyCombo')]//parent::div//button")
	WebElement dropdown_ContractPricePopup_AddCustomDatesSection_PriceCurrency;
	
	@FindBy(xpath = "//div[contains(@id, 'PriceImportInput')]")
	WebElement dropdown_ContractPricePopup_ImportDatesSection_ImportFromPrice;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content1') and contains(@class, 'PH Tabs')]//span[contains(@id, 'PaxCombo')]//parent::div//button")
	WebElement dropdown_ContractPricePopup_ImportDatesSection_PaxType;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content1') and contains(@class, 'PH Tabs')]//span[contains(@id, 'PriceCurrencyCombo')]//parent::div//button")
	WebElement dropdown_ContractPricePopup_ImportDatesSection_PriceCurrency;
	
	@FindBy(xpath = "//label[text() = 'Price Configuration']//parent::div//div[contains(@id, 'PriceInput')]")
	WebElement dropdown_ContractPricePopup_PriceConfiguration;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content2') and contains(@class, 'PH Tabs')]//input[contains(@id, 'EndDateInput')]")
	WebElement input_ContractPricePopup_AddCustomDatesSection_EndDate;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content2') and contains(@class, 'PH Tabs')]//input[contains(@id, 'StartDateInput')]")
	WebElement input_ContractPricePopup_AddCustomDatesSection_StartDate;
	
	@FindBy(xpath = "//div[contains(@id, 'PricesContainer')]//table//thead//*[text() = 'Currency']//parent::th//following-sibling::div//input")
	WebElement input_ContractPricePopup_ContractPricesTable_CurrencyFilter;
	
	@FindBy(xpath = "//div[contains(@id, 'PricesContainer')]//table//thead//*[text() = 'End Date']//parent::div//following-sibling::div//input")
	WebElement input_ContractPricePopup_ContractPricesTable_EndDateFilter;
	
	@FindBy(xpath = "//div[contains(@id, 'PricesContainer')]//table//thead//*[text() = 'Pax Type']//parent::div//following-sibling::div//input")
	WebElement input_ContractPricePopup_ContractPricesTable_PaxTypeFilter;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content1') and contains(@class, 'PH Tabs')]//div[contains(@id, 'PriceCostImportInput')]")
	WebElement input_ContractPricePopup_ImportDatesSection_EquivalentCostConfiguration;
	
	@FindBy(xpath = "//div[contains(@class, 'ImportSuggestions')]//div[text() = 'Category 1']//following-sibling::input")
	WebElement input_ContractPricePopup_ImportFromPriceDropdown_Category1Filter;
	
	@FindBy(xpath = "//div[contains(@class, 'ImportSuggestions')]//div[text() = 'Category 2']//following-sibling::input")
	WebElement input_ContractPricePopup_ImportFromPriceDropdown_Category2Filter;
	
	@FindBy(xpath = "//div[contains(@class, 'ImportSuggestions')]//div[text() = 'Guest Configuration']//following-sibling::input")
	WebElement input_ContractPricePopup_ImportFromPriceDropdown_GuestConfigurationFilter;
	
	@FindBy(xpath = "//div[contains(@class, 'ImportSuggestions')]//div[text() = 'Nights']//following-sibling::input")
	WebElement input_ContractPricePopup_ImportFromPriceDropdown_NightsFilter;
	
	@FindBy(xpath = "//div[@class = 'Suggestions']//div[text() = 'Category 1']//following-sibling::input")
	WebElement input_ContractPricePopup_PriceConfigurationDropdown_Category1Filter;
	
	@FindBy(xpath = "//div[@class = 'Suggestions']//div[text() = 'Category 2']//following-sibling::input")
	WebElement input_ContractPricePopup_PriceConfigurationDropdown_Category2Filter;
	
	@FindBy(xpath = "//div[@class = 'Suggestions']//div[text() = 'Guest Configuration']//following-sibling::input")
	WebElement input_ContractPricePopup_PriceConfigurationDropdown_GuestConfigurationFilter;
	
	@FindBy(xpath = "//div[@class = 'Suggestions']//div[text() = 'Nights']//following-sibling::input")
	WebElement input_ContractPricePopup_PriceConfigurationDropdown_NightsFilter;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'TabsContainer')]//span[text() = 'Add Custom Dates']//parent::div")
	WebElement label_ContractPricePopup_AddCustomDatesTab;
	
	@FindBy(xpath = "(//div[contains(@id, 'PriceCostImportInput')]//div//div)[2]")
	WebElement label_ContractPricePopup_EquivalentCostConfigurationDropdown_Category1;
	
	@FindBy(xpath = "(//div[contains(@id, 'PriceCostImportInput')]//div//div)[3]")
	WebElement label_ContractPricePopup_EquivalentCostConfigurationDropdown_Category2;
	
	@FindBy(xpath = "(//div[contains(@id, 'PriceCostImportInput')]//div//div)[1]")
	WebElement label_ContractPricePopup_EquivalentCostConfigurationDropdown_GuestConfiguration;
	
	@FindBy(xpath = "(//div[contains(@id, 'PriceCostImportInput')]//div//div)[4]")
	WebElement label_ContractPricePopup_EquivalentCostConfigurationDropdown_Nights;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'TabsContainer')]//span[text() = 'Import Dates']//parent::div")
	WebElement label_ContractPricePopup_ImportDatesTab;
	
	@FindBy(xpath = "(//label[text() = 'Price Configuration']//parent::div//div[contains(@id, 'PriceInput')]//div[@class = 'SearchInput']//div)[2]")
	WebElement label_ContractPricePopup_PriceConfigurationDropdown_Category1;
	
	@FindBy(xpath = "(//label[text() = 'Price Configuration']//parent::div//div[contains(@id, 'PriceInput')]//div[@class = 'SearchInput']//div)[3]")
	WebElement label_ContractPricePopup_PriceConfigurationDropdown_Category2;
	
	@FindBy(xpath = "(//label[text() = 'Price Configuration']//parent::div//div[contains(@id, 'PriceInput')]//div[@class = 'SearchInput']//div)[1]")
	WebElement label_ContractPricePopup_PriceConfigurationDropdown_GuestConfiguration;
	
	@FindBy(xpath = "(//label[text() = 'Price Configuration']//parent::div//div[contains(@id, 'PriceInput')]//div[@class = 'SearchInput']//div)[4]")
	WebElement label_ContractPricePopup_PriceConfigurationDropdown_Nights;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content1') and contains(@class, 'PH Tabs')]//div[text() = 'Cost']//preceding-sibling::div//input")
	WebElement radioButton_ContractPricePopup_ImportDatesSection_ImportFromCost;
	
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content1') and contains(@class, 'PH Tabs')]//div[text() = 'Price']//preceding-sibling::div//input")
	WebElement radioButton_ContractPricePopup_ImportDatesSection_ImportFromPrice;
	
	@FindBy(xpath = "(//div[contains(@class, 'ImportSuggestions')]//div[@class = 'SuggestionList']//div[@class = 'FullRow'])[1]//input")
	WebElement radioButton_ContractPricePopup_ImportFromPriceDropdown_TopImportFromPrice;
	
	@FindBy(xpath = "(//div[@class = 'Suggestions']//div[@class = 'SuggestionList']//div[@class = 'FullRow'])[1]//input")
	WebElement radioButton_ContractPricePopup_PriceConfigurationDropdown_TopPriceConfiguration;
	
	@FindBy(xpath = "(//div[@class = 'wj-row']//div[contains(@class, 'wj-cell')]//input[@class = 'single-check'])[1]")
	WebElement rowData_ContractPricePopup_ContractPricesTable_TopCheckbox;
	
	@FindBy(xpath = "((//div[contains(@class, 'wj-cells')]//div[@role = 'row'])[2]//div)[3]")
	WebElement rowData_ContractPricePopup_ContractPricesTable_TopCurrencyTypeDropdown;
	
	@FindBy(xpath = "((//div[contains(@class, 'wj-cells')]//div[@role = 'row'])[2]//div)[2]")
	WebElement rowData_ContractPricePopup_ContractPricesTable_TopEndDateInput;
	
	@FindBy(xpath = "((//div[contains(@class, 'wj-cells')]//div[@role = 'row'])[2]//div)[8]")
	WebElement rowData_ContractPricePopup_ContractPricesTable_TopMaxCommissionInput;
	
	@FindBy(xpath = "((//div[contains(@class, 'wj-cells')]//div[@role = 'row'])[2]//div)[7]")
	WebElement rowData_ContractPricePopup_ContractPricesTable_TopMinCommissionInput;
	
	@FindBy(xpath = "((//div[contains(@class, 'wj-cells')]//div[@role = 'row'])[2]//div)[6]")
	WebElement rowData_ContractPricePopup_ContractPricesTable_TopNonCommissionInput;
	
	@FindBy(xpath = "((//div[contains(@class, 'wj-cells')]//div[@role = 'row'])[2]//div)[4]")
	WebElement rowData_ContractPricePopup_ContractPricesTable_TopPaxTypeDropdown;
	
	@FindBy(xpath = "((//div[contains(@class, 'wj-cells')]//div[@role = 'row'])[2]//div)[5]")
	WebElement rowData_ContractPricePopup_ContractPricesTable_TopPriceInput;
	
	@FindBy(xpath = "((//div[contains(@class, 'wj-cells')]//div[@role = 'row'])[2]//div)[1]")
	WebElement rowData_ContractPricePopup_ContractPricesTable_TopStartDateInput;
	// End - Contract Price Popup Objects
	
	// Start - View Contract Price Popup Objects
	@FindBy(xpath = "//div[contains(@class, 'MainContainer')]//*[@value = 'Close']")
	WebElement button_ViewContractPricePopup_Close;
	
	@FindBy(xpath = "//div[contains(@id, 'PricesContainer')]//table//thead//*[text() = 'Currency']//parent::div//following-sibling::div//input")
	WebElement input_ViewContractPricePopup_ContractPricesTable_CurrencyFilter;
	
	@FindBy(xpath = "//div[contains(@id, 'PricesContainer')]//table//thead//*[text() = 'End Date']//parent::div//following-sibling::div//input")
	WebElement input_ViewContractPricePopup_ContractPricesTable_EndDateFilter;
	
	@FindBy(xpath = "//div[contains(@id, 'PricesContainer')]//table//thead//*[text() = 'Pax Type']//parent::div//following-sibling::div//input")
	WebElement input_ViewContractPricePopup_ContractPricesTable_PaxTypeFilter;
	
	@FindBy(xpath = "//div[contains(@id, 'PricesContainer')]//table//thead//*[text() = 'Start Date']//parent::div//following-sibling::div//input")
	WebElement input_ViewContractPricePopup_ContractPricesTable_StartDateFilter;
	
	@FindBy(xpath = "//label[text() = 'Category 1']//parent::div//parent::div[contains(@id, 'Container')]")
	WebElement label_ViewContractPricePopup_Category1;
	
	@FindBy(xpath = "//label[text() = 'Category 2']//parent::div//parent::div[contains(@id, 'Container')]")
	WebElement label_ViewContractPricePopup_Category2;
	
	@FindBy(xpath = "//label[text() = 'Day Range']//parent::div//parent::div[contains(@id, 'Container')]")
	WebElement label_ViewContractPricePopup_DayRange;
	
	@FindBy(xpath = "//label[text() = 'Guest Configuration']//parent::div//following-sibling::span")
	WebElement label_ViewContractPricePopup_GuestConfiguration;
	
	@FindBy(xpath = "((//table[contains(@id, 'PriceTable')]//tbody//tr)[1]//td)[3]//div")
	WebElement rowData_ViewContractPricePopup_ContractPricesTable_TopCurrencyLabel;
	
	@FindBy(xpath = "((//table[contains(@id, 'PriceTable')]//tbody//tr)[1]//td)[2]//div")
	WebElement rowData_ViewContractPricePopup_ContractPricesTable_TopEndDateLabel;
	
	@FindBy(xpath = "((//table[contains(@id, 'PriceTable')]//tbody//tr)[1]//td)[8]//div")
	WebElement rowData_ViewContractPricePopup_ContractPricesTable_TopMaximumCommissionLabel;
	
	@FindBy(xpath = "((//table[contains(@id, 'PriceTable')]//tbody//tr)[1]//td)[7]//div")
	WebElement rowData_ViewContractPricePopup_ContractPricesTable_TopMinimumCommissionLabel;
	
	@FindBy(xpath = "((//table[contains(@id, 'PriceTable')]//tbody//tr)[1]//td)[6]//div")
	WebElement rowData_ViewContractPricePopup_ContractPricesTable_TopNonCommissionLabel;
	
	@FindBy(xpath = "((//table[contains(@id, 'PriceTable')]//tbody//tr)[1]//td)[4]//div")
	WebElement rowData_ViewContractPricePopup_ContractPricesTable_TopPaxTypeLabel;
	
	@FindBy(xpath = "((//table[contains(@id, 'PriceTable')]//tbody//tr)[1]//td)[5]//div")
	WebElement rowData_ViewContractPricePopup_ContractPricesTable_TopPriceLabel;
	
	@FindBy(xpath = "((//table[contains(@id, 'PriceTable')]//tbody//tr)[1]//td)[1]//div")
	WebElement rowData_ViewContractPricePopup_ContractPricesTable_TopStartDateLabel;
	
	@FindBy(xpath = "//table[contains(@id, 'PriceTable')]")
	WebElement table_ViewContractPricePopup_ContractPrices;
	
	@FindBy(xpath = "(//a[contains(@id, 'DeleteIteneraryLink')])[1]")
	WebElement button_ItirenaryTemplatesSection_TopDeleteItineraryTemplate;
	// End - View Contract Price Popup Objects
	
	@FindBy(xpath = "//div[contains(@id,'Cell1')]//input[@value='2']")
	WebElement radiobutton_ContractPricePopup_Price;
	
	@FindBy(xpath = "(//span[contains(@id, 'PaxCombo')]//parent::div//button)[1]")
	WebElement PaxType_ImportFromPrice;
	
	@FindBy(xpath = "//div[contains(@id,'Cell1')]//input[@value='1']")
	WebElement radiobutton_ContractPricePopup_Cost;
	
	@FindBy(xpath = "//div[contains(@class, 'MainPopup')]//div[contains(@id, 'SectionExpandableArea')]//div[@class = 'SectionExpandable_header']")
	WebElement label_ContractPricePopup_EditCustomDatesTab;
	
	@FindBy(xpath = "//input[contains(@value,'Add to Table')]")
	WebElement button_AddtoTable;
	
	@FindBy(xpath = "(//span[@class='fa fa-fw fa-info-circle'])[1]//parent::a")
	WebElement i_icon_below_dates;
	
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public ContractDetailsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	// Start - Main Page Actions
	public void checkContractCostsSectionIncludeCostsWhenCopyingContractCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractCostsSection_IncludeCostsWhenCopyingContract);
	}
	
	public void checkContractCostsSectionHidePastDatesCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_ContractCostsSection_HidePastDates);
	}
	
	public void checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractOptionsSection_DoNotShowOnItinerary);
	}
	
	public void checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_ContractOptionsSection_DoNotShowOnItinerary);
	}
	
	public void checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractOptionsSection_IndicativePricing);
	}
	
	public void checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractOptionsSection_PassengerWeightRequired);
	}
	
	public void checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractOptionsSection_PrintClubMembershipLevel);
	}
	
	public void checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_ContractOptionsSection_PrintClubMembershipLevel);
	}
	
	public void checkContractOptionsSectionPrintFlightDetailsCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractOptionsSection_PrintFlightDetails);
	}
	
	public void checkContractOptionsSectionPrintFlightDetailsCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_ContractOptionsSection_PrintFlightDetails);
	}
	
	public void checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractOptionsSection_PrintOPRefNumber);
	}
	
	public void checkContractOptionsSectionPrintPassportDetailsCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractOptionsSection_PrintPassportDetails);
	}
	
	public void checkContractOptionsSectionPrintPassportDetailsCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_ContractOptionsSection_PrintPassportDetails);
	}
	
	public void checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractOptionsSection_PrintPaxPreTourContact);
	}
	
	public void checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractOptionsSection_PrintPensionSeniorCardNumber);
	}
	
	public void checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_ContractOptionsSection_PrintPensionSeniorCardNumber);
	}
	
	public void checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractOptionsSection_PrintSabrePNR);
	}
	
	public void checkContractPricesSectionHidePastDatesCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractPricesSection_HidePastDates);
	}
	
	public void checkContractPricesSectionHidePastDatesCheckboxIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(checkbox_ContractPricesSection_HidePastDates);
	}
	
	public void checkContractPricesSectionIncludePricesWhenCopyingContractCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ContractPricesSection_IncludePricesWhenCopyingContract);
	}
	
	public void checkExcludeFromCostUpdateCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ExcludeFromCostUpdate);
	}
	
	public void clickContractCostsAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_ContractCosts);
	}
	
	public void clickContractCostsSectionCreateBulkCostsButton() throws Exception {
		CommonFunctions.clickElement(button_ContractCostsSection_CreateBulkCosts);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//input[@value = 'Create Costs']");
	}
	
	public void clickContractCostsSectionDeleteAllCostsButton() throws Exception {
		CommonFunctions.clickElement(button_ContractCostsSection_DeleteAllCosts);
		CommonFunctions.pause(10000, false);
		
		if (driver.findElements(By.tagName("iframe")).size() > 0) {
			CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete all cost records?']");
		}
	}
	
	public void clickContractCostsSectionHidePastDatesCheckbox() throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(checkbox_ContractCostsSection_HidePastDates);
		CommonFunctions.pause(1, true);
	}
	
	public void clickContractCostsSectionImportDatesButton() throws Exception {
		CommonFunctions.clickElement(button_ContractCostsSection_ImportDates);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Import Dates']");
	}
	
	public void clickContractCostsSectionIncludeCostsWhenCopyingContractCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_ContractCostsSection_IncludeCostsWhenCopyingContract);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickContractOptionsAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_ContractOptions);
	}
	
	public void clickContractOptionsSectionIndicativePricingCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_ContractOptionsSection_IndicativePricing);
	}
	
	public void clickContractPricesSectionAddPricesButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPricesSection_AddPrices);
		CommonFunctions.pause(10000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//input[@value = 'Save Prices']");
	}
	
	public void clickContractPricesSectionHidePastDatesCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_ContractPricesSection_HidePastDates);
		CommonFunctions.pause(10000, false);
	}
	
	public void clickContractPricesSectionImportDatesButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPricesSection_ImportDates);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Import Dates']");
	}
	
	public void clickContractPricesSectionDeleteAllPricesButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPricesSection_DeleteAllPrices);
		CommonFunctions.pause(5000, false);
		
		if (driver.findElements(By.tagName("iframe")).size() > 0) {
			CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete all price records?']");
		}
	}
	
	public void clickContractPricesSectionIncludePricesWhenCopyingContractCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_ContractPricesSection_IncludePricesWhenCopyingContract);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickDepartmentDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Department);
	}
	
	public void clickEditBasicInfoButton() throws Exception {
		CommonFunctions.clickElement(button_EditBasicInfo);
		CommonFunctions.pause(10000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//input[@value = 'Save']");
	}
	
	public void clickIndicativeAirSectionCabinClassDropdownOption(String cabinClassOptionValue) throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_CabinClass);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_Location);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_CabinClass);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), cabinClassOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickIndicativeAirSectionLocationDropdownOption(String locationOptionValue) throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_Location);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_CabinClass);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_Location);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(dropdown_IndicativeAirSection_Location.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), locationOptionValue);
		CommonFunctions.clickElement(dropdown_IndicativeAirSection_Location.findElement(By.xpath(".//parent::div//ul//span[contains(text(), '" + locationOptionValue + "')]//preceding-sibling::input")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickItirenaryTemplatesSectionAddItirenaryTemplateButton() throws Exception {
		CommonFunctions.clickElement(button_ItirenaryTemplatesSection_AddItirenaryTemplate);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//span[text() = 'Itinerary Template']");
	}
	
	public void clickItirenaryTemplatesSectionTopEditItineraryTemplateButton() throws Exception {
		CommonFunctions.clickElement(button_ItirenaryTemplatesSection_TopEditItineraryTemplate);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//span[text() = 'Itinerary Template']");
	}
	
	public void clickOfficeDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_Office);
	}
	
	public void clickPaymentRulesSectionAddCancellationRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentRulesSection_AddCancellationRule);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//div[contains(@id, 'CustomerMarket')]");
	}
	
	public void clickPaymentRulesSectionAddDepositRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentRulesSection_AddDepositRule);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//div[contains(@id, 'CustomerMarket')]");
	}
	
	public void clickPaymentRulesSectionAddFinalPaymentRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentRulesSection_AddFinalPaymentRule);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//div[contains(@id, 'CustomerMarket')]");
	}
	
	public void clickPaymentRulesSectionCancellationTabLabel() throws Exception {
		CommonFunctions.clickElement(label_PaymentRulesSection_CancellationTab);
	}
	
	public void clickPaymentRulesSectionDepositTabLabel() throws Exception {
		CommonFunctions.clickElement(label_PaymentRulesSection_DepositTab);
	}
	
	public void clickPaymentRulesSectionFinalPaymentTabLabel() throws Exception {
		CommonFunctions.clickElement(label_PaymentRulesSection_FinalPaymentTab);
	}
	
	public void clickPaymentRulesSectionTopDeleteCancellationRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentRulesSection_TopDeleteCancellationRule);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickPaymentRulesSectionTopDeleteDepositRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentRulesSection_TopDeleteDepositRule);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickPaymentRulesSectionTopDeleteFinalPaymentRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentRulesSection_TopDeleteFinalPaymentRule);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickPaymentRulesSectionTopEditCancellationRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentRulesSection_TopEditCancellationRule);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//div[contains(@id, 'CustomerMarket')]");
	}
	
	public void clickPaymentRulesSectionTopEditDepositRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentRulesSection_TopEditDepositRule);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//div[contains(@id, 'CustomerMarket')]");
	}
	
	public void clickPaymentRulesSectionTopEditFinalPaymentRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentRulesSection_TopEditFinalPaymentRule);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//div[contains(@id, 'CustomerMarket')]");
	}
	
	public void clickUpdatePackagesButton() throws Exception {
		CommonFunctions.clickElement(button_UpdatePackages);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'Popup')]//label[text() = 'Package Status']");
	}
	
	public void containsValueAutoSendToSupplierContactDropdown(String expectedAutoSendToSupplierContact) throws Exception {
		CommonFunctions.elementContainsText(dropdown_AutoSendToSupplierContact, expectedAutoSendToSupplierContact);
	}
	
	public void containsValueAutoSendToSupplierContactLabel(String expectedAutoSendToSupplierContact) throws Exception {
		CommonFunctions.elementContainsText(label_AutoSendToSupplierContact, expectedAutoSendToSupplierContact);
	}
	
	public void containsValueCityInput(String expectedCity) throws Exception {
		CommonFunctions.elementAttributeContains(input_City, "origvalue", expectedCity);
	}
	
	public void containsValueCityLabel(String expectedCity) throws Exception {
		CommonFunctions.elementContainsText(label_City, expectedCity);
	}
	
	public void containsValueCommentsTextArea(String expectedComments) throws Exception {
		CommonFunctions.elementAttributeContains(textArea_Comments, "origvalue", expectedComments);
	}
	
	public void containsValueCommentsLabel(String expectedComments) throws Exception {
		CommonFunctions.elementContainsText(label_Comments, expectedComments);
	}
	
	public void containsValueContractCostsSectionTopMaxRowDisplayDropdown(String expectedTopMaxRowDisplayValue) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ContractCostsSection_TopMaxRowDisplay, expectedTopMaxRowDisplayValue);
	}
	
	public void containsValueContractOptionsSectionMaxContractValueInput(String expectedMaxContractValue) throws Exception {
		CommonFunctions.elementContainsText(input_ContractOptionsSection_MaxContractValue, expectedMaxContractValue);
	}
	
	public void containsValueContractOptionsSectionMinContractValueInput(String expectedMinContractValue) throws Exception {
		CommonFunctions.elementContainsText(input_ContractOptionsSection_MinContractValue, expectedMinContractValue);
	}
	
	public void containsValueCurrencyDropdown(String expectedCurrency) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Currency, expectedCurrency);
	}
	
	public void containsValueCurrencyLabel(String expectedCurrency) throws Exception {
		CommonFunctions.elementContainsText(label_Currency, expectedCurrency);
	}
	
	public void containsValueDepartmentDropdown(String expectedDepartment) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Department, expectedDepartment);
	}
	
	public void containsValueDepartmentLabel(String expectedDepartment) throws Exception {
		CommonFunctions.elementContainsText(label_Department, expectedDepartment);
	}
	
	public void containsValueEndDateInput(String expectedEndDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_EndDate, "origvalue", expectedEndDate);
	}
	
	public void containsValueEndDateLabel(String expectedEndDate) throws Exception {
		CommonFunctions.elementContainsText(label_EndDate, expectedEndDate);
	}
	
	public void containsValueIndicativeAirSectionAirlineDropdown(String expectedAirline) throws Exception {
		CommonFunctions.waitElementSelected(dropdown_IndicativeAirSection_Airline.findElement(By.xpath(".//option[text() = '" + expectedAirline + "']")));
	}
	
	public void containsValueIndicativeAirSectionCabinClassDropdown(String expectedCabinClass) throws Exception {
		CommonFunctions.elementContainsText(dropdown_IndicativeAirSection_CabinClass.findElement(By.xpath(".//span")), expectedCabinClass);
	}
	
	public void containsValueIndicativeAirSectionLocationDropdown(String expectedLocation) throws Exception {
		CommonFunctions.elementContainsText(dropdown_IndicativeAirSection_Location.findElement(By.xpath(".//span")), expectedLocation);
	}
	
	public void containsValueNameInput(String expectedName) throws Exception {
		CommonFunctions.elementAttributeContains(input_Name, "origvalue", expectedName);
	}
	
	public void containsValueNameLabel(String expectedName) throws Exception {
		CommonFunctions.elementContainsText(label_Name, expectedName);
	}
	
	public void containsValueOfficeDropdown(String expectedOffice) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Office, expectedOffice);
	}
	
	public void containsValueOfficeLabel(String expectedOffice) throws Exception {
		CommonFunctions.elementContainsText(label_Office, expectedOffice);
	}
	
	public void containsValueStartDateInput(String expectedStartDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_StartDate, "origvalue", expectedStartDate);
	}
	
	public void containsValueStartDateLabel(String expectedStartDate) throws Exception {
		CommonFunctions.elementContainsText(label_StartDate, expectedStartDate);
	}
	
	public void containsValueStatusDropdown(String expectedStatus) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Status, expectedStatus);
	}
	
	public void containsValueStatusLabel(String expectedStatus) throws Exception {
		CommonFunctions.elementContainsText(label_Status, expectedStatus);
	}
	
	public void containsValueSupplierInput(String expectedSupplier) throws Exception {
		CommonFunctions.elementAttributeContains(input_Supplier, "origvalue", expectedSupplier);
	}
	
	public void containsValueSupplierLabel(String expectedSupplier) throws Exception {
		CommonFunctions.elementContainsText(label_Supplier, expectedSupplier);
	}
	
	public void containsValueTypeDropdown(String expectedType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_Type.findElement(By.xpath(".//span[contains(@class, 'select2-chosen')]")), expectedType);
	}
	
	public void containsValueTypeLabel(String expectedType) throws Exception {
		CommonFunctions.elementContainsText(label_Type, expectedType);
	}
	
	public void disabledContractCostsSectionCreateBulkCostsButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ContractCostsSection_CreateBulkCosts, "disabled", "true");
	}
	
	public void disabledContractCostsSectionDeleteAllCostsButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ContractCostsSection_DeleteAllCosts, "disabled", "true");
	}
	
	public void disabledContractCostsSectionImportDatesButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ContractCostsSection_ImportDates, "disabled", "true");
	}
	
	public void disabledContractCostsSectionIncludeCostsWhenCopyingContractCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractCostsSection_IncludeCostsWhenCopyingContract, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionDoNotShowOnItineraryCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractOptionsSection_DoNotShowOnItinerary, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionIndicativePricingCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractOptionsSection_IndicativePricing, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionMaxContractValueInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_ContractOptionsSection_MaxContractValue, "readonly", "true");
	}
	
	public void disabledContractOptionsSectionMinContractValueInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_ContractOptionsSection_MinContractValue, "readonly", "true");
	}
	
	public void disabledContractOptionsSectionPassengerWeightRequiredCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractOptionsSection_PassengerWeightRequired, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionPrintClubMembershipLevelCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractOptionsSection_PrintClubMembershipLevel, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionPrintFlightDetailsCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractOptionsSection_PrintFlightDetails, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionPrintOPRefNumberCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractOptionsSection_PrintOPRefNumber, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionPrintPassportDetailsCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractOptionsSection_PrintPassportDetails, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionPrintPaxPreTourContactCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractOptionsSection_PrintPaxPreTourContact, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractOptionsSection_PrintPensionSeniorCardNumber, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionPrintSabrePNRCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractOptionsSection_PrintSabrePNR, "disabled", "true");
	}
	
	public void disabledContractOptionsSectionShipCodeInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_ContractOptionsSection_ShipCode, "readonly", "true");
	}
	
	public void disabledContractPricesSectionAddPricesButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ContractPricesSection_AddPrices, "disabled", "true");
	}
	
	public void disabledContractPricesSectionCreateBulkPricesButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ContractPricesSection_CreateBulkPrices, "disabled", "true");
	}
	
	public void disabledContractPricesSectionDeleteAllPricesButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ContractPricesSection_DeleteAllPrices, "disabled", "true");
	}
	
	public void disabledContractPricesSectionHidePastDatesCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractPricesSection_HidePastDates, "disabled", "true");
	}
	
	public void disabledContractPricesSectionImportDatesButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ContractPricesSection_ImportDates, "disabled", "true");
	}
	
	public void disabledContractPricesSectionIncludePricesWhenCopyingContractCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ContractPricesSection_IncludePricesWhenCopyingContract, "disabled", "true");
	}
	
	public void disabledDepartmentDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//div[contains(@id, 'DeptartmentDropdown')]")), "class", "disabled");
	}
	
	public void disabledIndicativeAirSectionAirlineDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_IndicativeAirSection_Airline, "disabled", "true");
	}
	
	public void disabledStatusDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_Status, "disabled", "true");
	}
	
	public void disabledTypeDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_Type, "class", "disabled");
	}
	
	public void displayedAutoSendToSupplierContactDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_AutoSendToSupplierContact);
	}
	
	public void displayedCityInput() throws Exception {
		CommonFunctions.elementDisplayed(input_City);
	}
	
	public void displayedCommentsTextArea() throws Exception {
		CommonFunctions.elementDisplayed(textArea_Comments);
	}
	
	public void displayedContractCostsSectionAddCostsButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractCostsSection_AddCosts);
	}
	
	public void displayedContractCostsSectionCreateBulkCostsButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractCostsSection_CreateBulkCosts);
	}
	
	public void displayedContractCostsSectionDeleteAllCostsButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractCostsSection_DeleteAllCosts);
	}
	
	public void displayedContractCostsSectionImportDatesButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractCostsSection_ImportDates);
	}
	
	public void displayedContractCostsSectionTopDeleteCostsButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractCostsSection_TopDeleteCosts);
	}
	
	public void displayedContractCostsSectionTopDatesFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractCostsSection_TopDatesFilter);
	}
	
	public void displayedContractCostsSectionTopHelpText1Label() throws Exception {
		CommonFunctions.elementDisplayed(label_ContractCostsSection_TopHelpText1);
	}
	
	public void displayedContractCostsSectionTopHelpText2Label() throws Exception {
		CommonFunctions.elementDisplayed(label_ContractCostsSection_TopHelpText2);
	}
	
	public void displayedContractCostsSectionTopHelpText3Label() throws Exception {
		CommonFunctions.elementDisplayed(label_ContractCostsSection_TopHelpText3);
	}
	
	public void displayedContractCostsSectionTopHelpText4Label() throws Exception {
		CommonFunctions.elementDisplayed(label_ContractCostsSection_TopHelpText4);
	}
	
	public void displayedContractCostsSectionTopMealPlanImage() throws Exception {
		CommonFunctions.elementDisplayed(image_ContractCostsSection_TopMealPlan);
	}
	
	public void displayedContractOptionsSectionDoNotShowOnItineraryCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractOptionsSection_DoNotShowOnItinerary);
	}
	
	public void displayedContractOptionsSectionIndicativePricingCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractOptionsSection_IndicativePricing);
	}
	
	public void displayedContractOptionsSectionMaxContractValueInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractOptionsSection_MaxContractValue);
	}
	
	public void displayedContractOptionsSectionMinContractValueInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractOptionsSection_MinContractValue);
	}
	
	public void displayedContractOptionsSectionPassengerWeightRequiredCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractOptionsSection_PassengerWeightRequired);
	}
	
	public void displayedContractOptionsSectionPrintClubMembershipLevelCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractOptionsSection_PrintClubMembershipLevel);
	}
	
	public void displayedContractOptionsSectionPrintFlightDetailsCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractOptionsSection_PrintFlightDetails);
	}
	
	public void displayedContractOptionsSectionPrintOPRefNumberCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractOptionsSection_PrintOPRefNumber);
	}
	
	public void displayedContractOptionsSectionPrintPassportDetailsCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractOptionsSection_PrintPassportDetails);
	}
	
	public void displayedContractOptionsSectionPrintPaxPreTourContactCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractOptionsSection_PrintPaxPreTourContact);
	}
	
	public void displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractOptionsSection_PrintPensionSeniorCardNumber);
	}
	
	public void displayedContractOptionsSectionPrintSabrePNRCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractOptionsSection_PrintSabrePNR);
	}
	
	public void displayedContractOptionsSectionShipCodeInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractOptionsSection_ShipCode);
	}
	
	public void displayedContractPricesSectionAddPricesButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractPricesSection_AddPrices);
	}
	
	public void displayedContractPricesSectionDeleteAllPricesButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractPricesSection_DeleteAllPrices);
	}
	
	public void displayedContractPricesSectionImportDatesButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractPricesSection_ImportDates);
	}
	
	public void displayedContractPricesSectionTopCurrencyFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricesSection_TopCurrencyFilter);
	}
	
	public void displayedContractPricesSectionTopDatesFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricesSection_TopDatesFilter);
	}
	
	public void displayedContractPricesSectionTopMaximumCommissionColumnHeader() throws Exception {
		CommonFunctions.elementDisplayed(columnHeader_ContractPricesSection_TopMaximumCommission);
	}
	
	public void displayedCreatedByLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_CreatedBy);
	}
	
	public void displayedCreatedDateLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_CreatedDate);
	}
	
	public void displayedCurrencyDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Currency);
	}
	
	public void displayedDepartmentDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Department);
	}
	
	public void displayedEndDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_EndDate);
	}
	
	public void displayedExcludeFromCostUpdateCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ExcludeFromCostUpdate);
	}
	
	public void displayedNameInput() throws Exception {
		CommonFunctions.elementDisplayed(input_Name);
	}
	
	public void displayedOfficeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Office);
	}
	
	public void displayedPaymentRulesSectionCancellationTabLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_PaymentRulesSection_CancellationTab);
	}
	
	public void displayedPaymentRulesSectionDepositTabLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_PaymentRulesSection_DepositTab);
	}
	
	public void displayedPaymentRulesSectionFinalPaymentTabLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_PaymentRulesSection_FinalPaymentTab);
	}
	
	public void displayedPaymentRulesSectionPaymentCancellationRulesTable() throws Exception {
		CommonFunctions.elementDisplayed(table_PaymentRulesSection_PaymentCancellationRules);
	}
	
	public void displayedPaymentRulesSectionPaymentDepositRulesTable() throws Exception {
		CommonFunctions.elementDisplayed(table_PaymentRulesSection_PaymentDepositRules);
	}
	
	public void displayedStartDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_StartDate);
	}
	
	public void displayedStatusDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Status);
	}
	
	public void displayedSupplierInput() throws Exception {
		CommonFunctions.elementDisplayed(input_Supplier);
	}
	
	public void displayedTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_Type);
	}
	
	public void displayedUpdatePackagesButton() throws Exception {
		CommonFunctions.elementDisplayed(button_UpdatePackages);
	}
	
	public void enabledContractCostsSectionCreateBulkCostsButton() throws Exception {
		CommonFunctions.elementEnabled(button_ContractCostsSection_CreateBulkCosts);
	}
	
	public void enabledContractCostsSectionDeleteAllCostsButton() throws Exception {
		CommonFunctions.elementEnabled(button_ContractCostsSection_DeleteAllCosts);
	}
	
	public void enabledContractCostsSectionHidePastDatesCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractCostsSection_HidePastDates);
	}
	
	public void enabledContractCostsSectionImportDatesButton() throws Exception {
		CommonFunctions.elementEnabled(button_ContractCostsSection_ImportDates);
	}
	
	public void enabledContractOptionsSectionDoNotShowOnItineraryCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractOptionsSection_DoNotShowOnItinerary);
	}
	
	public void enabledContractOptionsSectionIndicativePricingCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractOptionsSection_IndicativePricing);
	}
	
	public void enabledContractOptionsSectionMaxContractValueInput() throws Exception {
		CommonFunctions.elementEnabled(input_ContractOptionsSection_MaxContractValue);
	}
	
	public void enabledContractOptionsSectionMinContractValueInput() throws Exception {
		CommonFunctions.elementEnabled(input_ContractOptionsSection_MinContractValue);
	}
	
	public void enabledContractOptionsSectionPassengerWeightRequiredCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractOptionsSection_PassengerWeightRequired);
	}
	
	public void enabledContractOptionsSectionPrintClubMembershipLevelCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractOptionsSection_PrintClubMembershipLevel);
	}
	
	public void enabledContractOptionsSectionPrintFlightDetailsCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractOptionsSection_PrintFlightDetails);
	}
	
	public void enabledContractOptionsSectionPrintOPRefNumberCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractOptionsSection_PrintOPRefNumber);
	}
	
	public void enabledContractOptionsSectionPrintPassportDetailsCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractOptionsSection_PrintPassportDetails);
	}
	
	public void enabledContractOptionsSectionPrintPaxPreTourContactCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractOptionsSection_PrintPaxPreTourContact);
	}
	
	public void enabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractOptionsSection_PrintPensionSeniorCardNumber);
	}
	
	public void enabledContractOptionsSectionPrintSabrePNRCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractOptionsSection_PrintSabrePNR);
	}
	
	public void enabledContractOptionsSectionShipCodeInput() throws Exception {
		CommonFunctions.elementEnabled(input_ContractOptionsSection_ShipCode);
	}
	
	public void enabledContractPricesSectionAddPricesButton() throws Exception {
		CommonFunctions.elementEnabled(button_ContractPricesSection_AddPrices);
	}
	
	public void enabledContractPricesSectionCreateBulkPricesButton() throws Exception {
		CommonFunctions.elementEnabled(button_ContractPricesSection_CreateBulkPrices);
	}
	
	public void enabledContractPricesSectionDeleteAllPricesButton() throws Exception {
		CommonFunctions.elementEnabled(button_ContractPricesSection_DeleteAllPrices);
	}
	
	public void enabledContractPricesSectionHidePastDatesCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractPricesSection_HidePastDates);
	}
	
	public void enabledContractPricesSectionImportDatesButton() throws Exception {
		CommonFunctions.elementEnabled(button_ContractPricesSection_ImportDates);
	}
	
	public void enabledContractPricesSectionIncludePricesWhenCopyingContractCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ContractPricesSection_IncludePricesWhenCopyingContract);
	}
	
	public void enabledDepartmentDropdown() throws Exception {
		CommonFunctions.elementAttributeDoesNotContains(driver.findElement(By.xpath("//div[contains(@id, 'DeptartmentDropdown')]")), "class", "disabled");
	}
	
	public void enabledStatusDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_Status);
	}
	
	public void hiddenContractCostsSectionAddCostsButton() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//input[@value = 'Add Costs']");
	}
	
	public void hiddenContractCostsSectionDeleteAllCostsButton() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//a[contains(@id, 'DeleteAllCostsLink')]");
	}
	
	public void hiddenContractCostsSectionTopDeleteCostsButton() throws Exception {
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractCostWeblockContainer')]//div[contains(@id, 'WebBlockMainContainer')])[1]//a[contains(@id, 'DeleteCostLink')]");
	}
	
	public void hiddenContractCostsSectionTopMealPlanImage() throws Exception {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'ContractCategoriesListRecords')]//img[contains(@class, 'MealPlan')])[1]");
	}
	
	public void hiddenContractPricesSectionAddPricesButton() throws Exception {
		CommonFunctions.elementInvisible(button_ContractPricesSection_AddPrices);
	}
	
	public void hiddenContractPricesSectionDeleteAllPricesButton() throws Exception {
		CommonFunctions.elementInvisible(button_ContractPricesSection_DeleteAllPrices);
	}
	
	public void selectAutoSendToSupplierContactValue(String autoSendToSupplierContact) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_AutoSendToSupplierContact, autoSendToSupplierContact);
	}
	
	public void selectCityValue(String cityValue) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_City, cityValue);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'CitySuggestionContainer')]//div[contains(@class, 'ResultSelection')]")));
		CommonFunctions.pause(5000, false);
	}
	
	public void selectCurrencyValue(String currencyValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Currency);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), currencyValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectDepartmentValue(String departmentValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Department);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), departmentValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectOfficeValue(String officeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Office);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), officeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	public void selectStatusValue(String statusValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Status.findElement(By.xpath(".//preceding-sibling::div")));
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), statusValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectSupplierValue(String supplierValue) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Supplier, supplierValue);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//table[contains(@id, 'SupplierSuggestionsTable')]//tr)[2]")));
		CommonFunctions.pause(2500, false);
	}
	
	public void selectTypeValue(String typeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_Type);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), typeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(10000, false);
	}
	
	public void setCommentsTextArea(String comments) throws Exception {
		CommonFunctions.clearThenEnterElementValue(textArea_Comments, comments);
	}
	
	public void setContractCostsSectionTopDatesFilterInput(String dates) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractCostsSection_TopDatesFilter, dates);
		CommonFunctions.pause(5000, false);
	}
	
	public void setContractOptionsSectionMaxContractValueInput(String maxContractValue) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractOptionsSection_MaxContractValue, maxContractValue);
	}
	
	public void setContractOptionsSectionMinContractValueInput(String minContractValue) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractOptionsSection_MinContractValue, minContractValue);
	}
	
	public void setContractPricesSectionTopDatesFilterInput(String dates) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractPricesSection_TopDatesFilter, dates);
	}
	
	public void setEndDateInput(String endDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_EndDate, endDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setStartDateInput(String startDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_StartDate, startDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public String setNameInput(String name) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_Name, name);
		
		return name;
	}
	
	public ContractCostsDetailsPage clickContractCostsSectionAddCostsButton() throws Exception {
		CommonFunctions.clickElement(button_ContractCostsSection_AddCosts);
		CommonFunctions.pause(10000, false);
		// CommonFunctions.switchFrameByXPath("//*[text() = 'Add Costs']");
		
		return new ContractCostsDetailsPage();
	}
	
	public ContractDetailsPage clickSaveButton() throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(button_Save);
		CommonFunctions.pause(5000, false);
		
		return new ContractDetailsPage();
	}
	
	public ContractsPage clickTopCloseButton() throws Exception {
		CommonFunctions.scrollToTop();
		CommonFunctions.clickElement(button_TopClose);
		CommonFunctions.pause(15000, false);
		
		return new ContractsPage();
	}
	// End - Main Page Actions
	
	// Start - Update Basic Information Popup Actions
	public void clickUpdateBasicInformationPopupCloseButton() throws Exception {
		CommonFunctions.clickElement(button_UpdateBasicInformationPopup_Close);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickUpdateBasicInformationPopupSaveButton() throws Exception {
		CommonFunctions.clickElement(checkbox_ExcludeFromCostUpdate);
		CommonFunctions.clickElement(checkbox_ExcludeFromCostUpdate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.SPACE));
		CommonFunctions.pause(1500, false);
	}
	
	public void clickUpdateBasicInformationPopupSaveButton2ndMethod() throws Exception {
		CommonFunctions.clickElement(input_ContractOptionsSection_MaxContractValue);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.SPACE));
		CommonFunctions.pause(6500, false);
	}
	
	public void displayedUpdateBasicInformationPopupCreatedByLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_UpdateBasicInformationPopup_CreatedBy);
	}
	
	public void displayedUpdateBasicInformationPopupCreatedDateLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_UpdateBasicInformationPopup_CreatedDate);
	}
	
	public void hoverUpdateBasicInformationPopupContractNameInput() throws Exception {
		CommonFunctions.hoverElement(input_Name);
		CommonFunctions.pause(2500, false);
	}
	
	public void hoverUpdateBasicInformationPopupDepartmentDropdown() throws Exception {
		CommonFunctions.hoverElement(dropdown_Department);
		CommonFunctions.pause(2500, false);
	}
	
	public void hoverUpdateBasicInformationPopupSupplierInput() throws Exception {
		CommonFunctions.hoverElement(input_Supplier);
		CommonFunctions.pause(2500, false);
	}
	// End - Update Basic Information Popup Actions
	
	// Start - Modify Contract Costs Details Popup Actions
	public void checkModifyContractCostsDetailsPopupPrintVoucherCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ModifyContractCostsDetailsPopup_PrintVoucher);
	}
	
	public void checkModifyContractCostsDetailsPopupShareAllowedCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_ModifyContractCostsDetailsPopup_ShareAllowed);
	}
	
	public void clickModifyContractCostsDetailsPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_ModifyContractCostsDetailsPopup_Cancel);
	}
	
	public void clickModifyContractCostsDetailsPopupGuestConfigurationDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_ModifyContractCostsDetailsPopup_GuestConfiguration);
	}
	
	public void containsValueModifyContractCostsDetailsPopupAllotmentCodeInput(String expectedAllotmentCode) throws Exception {
		CommonFunctions.elementAttributeContains(input_ModifyContractCostsDetailsPopup_AllotmentCode, "value", expectedAllotmentCode);
	}
	
	public void containsValueModifyContractCostsDetailsPopupAllotmentCodeLabel(String expectedAllotmentCode) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_AllotmentCode, expectedAllotmentCode);
	}
	
	public void containsValueModifyContractCostsDetailsPopupCategory1Dropdown(String expectedCategory1) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ModifyContractCostsDetailsPopup_Category1.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCategory1);
	}
	
	public void containsValueModifyContractCostsDetailsPopupCategory1Label(String expectedCategory1) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_Category1, expectedCategory1);
	}
	
	public void containsValueModifyContractCostsDetailsPopupCategory2Dropdown(String expectedCategory2) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ModifyContractCostsDetailsPopup_Category2.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCategory2);
	}
	
	public void containsValueModifyContractCostsDetailsPopupCategory2Label(String expectedCategory2) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_Category2, expectedCategory2);
	}
	
	public void containsValueModifyContractCostsDetailsPopupDaysDropdown(String expectedDays) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ModifyContractCostsDetailsPopup_Days.findElement(By.xpath(".//span")), expectedDays);
	}
	
	public void containsValueModifyContractCostsDetailsPopupDaysLabel(String expectedDays) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_Days, expectedDays);
	}
	
	public void containsValueModifyContractCostsDetailsPopupGuestConfigurationDropdown(String expectedRateType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ModifyContractCostsDetailsPopup_GuestConfiguration.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedRateType);
	}
	
	public void containsValueModifyContractCostsDetailsPopupGuestConfigurationLabel(String expectedGuestConfiguration) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_GuestConfiguration, expectedGuestConfiguration);
	}
	
	public void containsValueModifyContractCostsDetailsPopupInvoiceCommentsLabel(String expectedInvoiceComments) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_InvoiceComments, expectedInvoiceComments);
	}
	
	public void containsValueModifyContractCostsDetailsPopupInvoiceCommentsTextArea(String expectedInvoiceComments) throws Exception {
		CommonFunctions.elementAttributeContains(textArea_ModifyContractCostsDetailsPopup_InvoiceComments, "origvalue", expectedInvoiceComments);
	}
	
	public void containsValueModifyContractCostsDetailsPopupMaximumChildAgeInput(String expectedMaximumChildAge) throws Exception {
		CommonFunctions.elementAttributeContains(input_ModifyContractCostsDetailsPopup_MaximumChildAge, "value", expectedMaximumChildAge);
	}
	
	public void containsValueModifyContractCostsDetailsPopupMaximumChildAgeLabel(String expectedMaximumChildAge) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_MaximumChildAge, expectedMaximumChildAge);
	}
	
	public void containsValueModifyContractCostsDetailsPopupMaximumNightsInput(String expectedMaximumNights) throws Exception {
		CommonFunctions.elementAttributeContains(input_ModifyContractCostsDetailsPopup_MaximumNights, "value", expectedMaximumNights);
	}
	
	public void containsValueModifyContractCostsDetailsPopupMaximumNightsLabel(String expectedMaximumNights) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_MaximumNights, expectedMaximumNights);
	}
	
	public void containsValueModifyContractCostsDetailsPopupMaximumPaxInput(String expectedMaximumPax) throws Exception {
		CommonFunctions.elementAttributeContains(input_ModifyContractCostsDetailsPopup_MaximumPax, "value", expectedMaximumPax);
	}
	
	public void containsValueModifyContractCostsDetailsPopupMinimumNightsInput(String expectedMinimumNights) throws Exception {
		CommonFunctions.elementAttributeContains(input_ModifyContractCostsDetailsPopup_MinimumNights, "value", expectedMinimumNights);
	}
	
	public void containsValueModifyContractCostsDetailsPopupMinimumNightsLabel(String expectedMinimumNights) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_MinimumNights, expectedMinimumNights);
	}
	
	public void containsValueModifyContractCostsDetailsPopupMinimumPaxInput(String expectedMinimumPax) throws Exception {
		CommonFunctions.elementAttributeContains(input_ModifyContractCostsDetailsPopup_MinimumPax, "value", expectedMinimumPax);
	}
	
	public void containsValueModifyContractCostsDetailsPopupNumberOfDaysInput(String expectedNumberOfDays) throws Exception {
		CommonFunctions.elementAttributeContains(input_ModifyContractCostsDetailsPopup_NumberOfDays, "value", expectedNumberOfDays);
	}
	
	public void containsValueModifyContractCostsDetailsPopupNumberOfDaysLabel(String expectedNumberOfDays) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_NumberOfDays, expectedNumberOfDays);
	}
	
	public void containsValueModifyContractCostsDetailsPopupQuantityInput(String expectedQuantity) throws Exception {
		CommonFunctions.elementAttributeContains(input_ModifyContractCostsDetailsPopup_Quantity, "value", expectedQuantity);
	}
	
	public void containsValueModifyContractCostsDetailsPopupQuantityLabel(String expectedQuantity) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_Quantity, expectedQuantity);
	}
	
	public void containsValueModifyContractCostsDetailsPopupRateTypeDropdown(String expectedRateType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ModifyContractCostsDetailsPopup_RateType, expectedRateType);
	}
	
	public void containsValueModifyContractCostsDetailsPopupRateTypeLabel(String expectedRateType) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_RateType, expectedRateType);
	}
	
	public void containsValueModifyContractCostsDetailsPopupVoucherCommentsLabel(String expectedVoucherComments) throws Exception {
		CommonFunctions.elementContainsText(label_ModifyContractCostsDetailsPopup_VoucherComments, expectedVoucherComments);
	}
	
	public void containsValueModifyContractCostsDetailsPopupVoucherCommentsTextArea(String expectedVoucherComments) throws Exception {
		CommonFunctions.elementAttributeContains(textArea_ModifyContractCostsDetailsPopup_VoucherComments, "origvalue", expectedVoucherComments);
	}
	
	public void disabledModifyContractCostsDetailsPopupCategory1Dropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_ModifyContractCostsDetailsPopup_Category1, "class", "disabled");
	}
	
	public void disabledModifyContractCostsDetailsPopupNumberOfDaysInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_ModifyContractCostsDetailsPopup_NumberOfDays, "readonly", "true");
	}
	
	public void disabledModifyContractCostsDetailsPopupShareAllowedCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_ModifyContractCostsDetailsPopup_ShareAllowed, "disabled", "true");
	}
	
	public void displayedModifyContractCostsDetailsPopupCategory1Label() throws Exception {
		CommonFunctions.elementDisplayed(label_ModifyContractCostsDetailsPopup_Category1);
	}
	
	public void enabledModifyContractCostsDetailsPopupCategory1Dropdown() throws Exception {
		CommonFunctions.elementAttributeDoesNotContains(dropdown_ModifyContractCostsDetailsPopup_Category1, "class", "disabled");
	}
	
	public void enabledModifyContractCostsDetailsPopupNumberOfDaysInput() throws Exception {
		CommonFunctions.elementEnabled(input_ModifyContractCostsDetailsPopup_NumberOfDays);
	}
	
	public void enabledModifyContractCostsDetailsPopupShareAllowedCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_ModifyContractCostsDetailsPopup_ShareAllowed);
	}
	
	public void selectModifyContractCostsDetailsPopupCategory1Value(String category1) throws Exception {
		CommonFunctions.clickElement(dropdown_ModifyContractCostsDetailsPopup_Category1);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'searchbox')]//div[contains(@class, 'search')]//input"), category1);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@class, 'searchbox')]//ul[contains(@class, 'results')]//li")));
	}
	
	public void selectModifyContractCostsDetailsPopupCategory2Value(String category2) throws Exception {
		CommonFunctions.clickElement(dropdown_ModifyContractCostsDetailsPopup_Category2);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'searchbox')]//div[contains(@class, 'search')]//input"), category2);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@class, 'searchbox')]//ul[contains(@class, 'results')]//li")));
	}
	
	public void selectModifyContractCostsDetailsPopupGuestConfigurationValue(String guestConfiguration) throws Exception {
		CommonFunctions.clickElement(dropdown_ModifyContractCostsDetailsPopup_GuestConfiguration);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'searchbox')]//div[contains(@class, 'search')]//input"), guestConfiguration);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@class, 'searchbox')]//ul[contains(@class, 'results')]//li")));
	}
	
	public void selectModifyContractCostsDetailsPopupRateTypeValue(String rateType) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_ModifyContractCostsDetailsPopup_RateType, rateType);
		CommonFunctions.pause(2500, false);
	}
	
	public void setModifyContractCostsDetailsPopupAllotmentCodeInput(String allotmentCode) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ModifyContractCostsDetailsPopup_AllotmentCode, allotmentCode);
		CommonFunctions.pause(10000, false);
	}
	
	public void setModifyContractCostsDetailsPopupMaximumChildAgeInput(String maximumChildAge) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ModifyContractCostsDetailsPopup_MaximumChildAge, maximumChildAge);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setModifyContractCostsDetailsPopupMaximumPaxInput(String maximumPax) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ModifyContractCostsDetailsPopup_MaximumPax, maximumPax);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setModifyContractCostsDetailsPopupMinimumPaxInput(String minimumPax) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ModifyContractCostsDetailsPopup_MinimumPax, minimumPax);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setModifyContractCostsDetailsPopupNumberOfDaysInput(String numberOfDays) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ModifyContractCostsDetailsPopup_NumberOfDays, numberOfDays);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setModifyContractCostsDetailsPopupQuantityInput(String quantity) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ModifyContractCostsDetailsPopup_Quantity, quantity);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	// End - Modify Contract Costs Details Popup Actions
	
	// Start - Update Packages Popup Actions
	public void clickUpdatePackagesPopupAllPackagesCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_UpdatePackagesPopup_AllPackages);
	}
	
	public void clickUpdatePackagesPopupBrandColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_UpdatePackagesPopup_Brand);
	}
	
	public void clickUpdatePackagesPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_UpdatePackagesPopup_Cancel);
	}
	
	public void clickUpdatePackagesPopupPackageIdColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_UpdatePackagesPopup_PackageId);
	}
	
	public void clickUpdatePackagesPopupPackageNameColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_UpdatePackagesPopup_PackageName);
	}
	
	public void clickUpdatePackagesPopupPackageTypeColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_UpdatePackagesPopup_PackageType);
	}
	
	public void clickUpdatePackagesPopupStatusColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_UpdatePackagesPopup_Status);
	}
	
	public void clickUpdatePackagesPopupTourMarketColumnHeader() throws Exception {
		CommonFunctions.clickElement(columnHeader_UpdatePackagesPopup_TourMarket);
	}
	
	public void clickUpdatePackagesPopupUpdateSupplierNameButton() throws Exception {
		CommonFunctions.clickElement(button_UpdatePackagesPopup_UpdateSupplierName);
	}
	
	public void containsValueUpdatePackagesPopupPackageStatusDropdown(String expectedPackageStatus) throws Exception {
		CommonFunctions.elementContainsText(dropdown_UpdatePackagesPopup_PackageStatus.findElement(By.xpath(".//span")), expectedPackageStatus);
	}
	
	public void displayedUpdatePackagesPopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_UpdatePackagesPopup_Cancel);
	}
	
	public void displayedUpdatePackagesPopupPackageStatusDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_UpdatePackagesPopup_PackageStatus);
	}
	
	public void displayedUpdatePackagesPopupUpdateContractNameButton() throws Exception {
		CommonFunctions.elementDisplayed(button_UpdatePackagesPopup_UpdateContractName);
	}
	
	public void displayedUpdatePackagesPopupUpdateSupplierNameButton() throws Exception {
		CommonFunctions.elementDisplayed(button_UpdatePackagesPopup_UpdateSupplierName);
	}
	
	public void setUpdatePackagesPopupPackageNameFilterInput(String packageName) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_UpdatePackagesPopup_PackageNameFilter, packageName);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	// End - Update Packages Popup Actions
	
	// Start - Create Bulk Costs Popup Actions
	public void checkCreateBulkCostsPopupQuadShareCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_CreateBulkCostsPopup_QuadShare);
	}
	
	public void checkCreateBulkCostsPopupTwinShareCheckboxIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(checkbox_CreateBulkCostsPopup_TwinShare);
	}
	
	public void clickCreateBulkCostsPopupAddDateButton() throws Exception {
		CommonFunctions.clickElement(button_CreateBulkCostsPopup_AddDate);
	}
	
	public void clickCreateBulkCostsPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_CreateBulkCostsPopup_Cancel);
	}
	
	public void clickCreateBulkCostsPopupCreateCostsButton() throws Exception {
		CommonFunctions.clickElement(button_CreateBulkCostsPopup_CreateCosts);
		CommonFunctions.pause(5000, false);
	}
	
	public void containsValueCreateBulkCostsPopupAllotmentCodeInput(String expectedAllotmentCode) throws Exception {
		CommonFunctions.elementAttributeContains(input_CreateBulkCostsPopup_AllotmentCode, "value", expectedAllotmentCode);
	}
	
	public void containsValueCreateBulkCostsPopupMealPaxConfigurationDropdown(String expectedMealPaxConfiguration) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CreateBulkCostsPopup_MealPaxConfiguration.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedMealPaxConfiguration);
	}
	
	public void containsValueCreateBulkCostsPopupMealPlansDropdown(String expectedMealPlans) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CreateBulkCostsPopup_MealPlans.findElement(By.xpath(".//button//span")), expectedMealPlans);
	}
	
	public void containsValueCreateBulkCostsPopupRoomTypeDropdown(String expectedRoomType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_CreateBulkCostsPopup_RoomType.findElement(By.xpath(".//span")), expectedRoomType);
	}
	
	public void disabledCreateBulkCostsPopupAddDateButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_CreateBulkCostsPopup_AddDate, "disabled", "true");
	}
	
	public void disabledCreateBulkCostsPopupMealPaxConfigurationDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_CreateBulkCostsPopup_MealPaxConfiguration, "class", "disabled");
	}
	
	public void disabledCreateBulkCostsPopupMealPlansDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_CreateBulkCostsPopup_MealPlans.findElement(By.xpath(".//preceding-sibling::select")), "disabled", "true");
	}
	
	public void disabledCreateBulkCostsPopupRoomTypeDropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_CreateBulkCostsPopup_RoomType.findElement(By.xpath(".//parent::div//preceding-sibling::select")), "disabled", "true");
	}
	
	public void disabledCreateBulkCostsPopupQuadShareCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_CreateBulkCostsPopup_QuadShare, "disabled", "true");
	}
	
	public void disabledCreateBulkCostsPopupTwinShareCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_CreateBulkCostsPopup_TwinShare, "disabled", "true");
	}
	
	public void enabledCreateBulkCostsPopupAddDateButton() throws Exception {
		CommonFunctions.elementEnabled(button_CreateBulkCostsPopup_AddDate);
	}
	
	public void enabledCreateBulkCostsPopupMealPaxConfigurationDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CreateBulkCostsPopup_MealPaxConfiguration);
	}
	
	public void enabledCreateBulkCostsPopupMealPlansDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CreateBulkCostsPopup_MealPlans);
	}
	
	public void enabledCreateBulkCostsPopupRoomTypeDropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_CreateBulkCostsPopup_RoomType.findElement(By.xpath(".//parent::div//preceding-sibling::select")));
	}
	
	public void enabledCreateBulkCostsPopupQuadShareCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_CreateBulkCostsPopup_QuadShare);
	}
	
	public void enabledCreateBulkCostsPopupTwinShareCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_CreateBulkCostsPopup_TwinShare);
	}
	
	public void selectCreateBulkCostsPopupMealPaxConfigurationValue(String mealPaxConfigurationValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CreateBulkCostsPopup_MealPaxConfiguration);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), mealPaxConfigurationValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(1000, false);
	}
	
	public void selectCreateBulkCostsPopupRoomTypeValue(String roomTypeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_CreateBulkCostsPopup_RoomType);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@id, 'RoomTypeContainer')]//div[contains(@class, 'search')]//input"), roomTypeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//ul//li//span[text() = '" + roomTypeValue + "']")));
		CommonFunctions.pause(5000, false);
	}
	
	public void setCreateBulkCostsPopupAllotmentCodeInput(String allotmentCode) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_CreateBulkCostsPopup_AllotmentCode, allotmentCode);
		CommonFunctions.pause(1, true);
	}
	// End - Create Bulk Costs Popup Actions
	
	// Start - Import Dates From Cost Popup Actions
	public void clickImportDatesFromCostPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_ImportDatesFromCostPopup_Cancel);
	}
	
	public void clickImportDatesFromCostPopupCostConfigurationDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_ImportDatesFromCostPopup_CostConfiguration);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickImportDatesFromCostPopupImportDatesButton() throws Exception {
		CommonFunctions.clickElement(button_ImportDatesFromCostPopup_ImportDates);
	}
	
	public void clickImportDatesFromCostPopupSeasonDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_ImportDatesFromCostPopup_Season.findElement(By.xpath(".//parent::div")));
	}
	
	public void clickImportDatesFromCostPopupSeasonDropdownOption(String seasonValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ImportDatesFromCostPopup_Season.findElement(By.xpath(".//parent::div")));
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.clickElement(dropdown_ImportDatesFromCostPopup_Season.findElement(By.xpath(".//parent::div")));
		
		if (seasonValue == "Select All") {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'seasonDropDown')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'seasonContainer')]//div[contains(@class, 'search')]//input")), seasonValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'seasonDropDown')]//following-sibling::span[text() = '" + seasonValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void containsValueImportDatesFromCostPopupCategory1Dropdown(String expectedCategory1) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ImportDatesFromCostPopup_Category1, expectedCategory1);
	}
	
	public void containsValueImportDatesFromCostPopupMaximumPaxInput(String expectedMaximumPax) throws Exception {
		CommonFunctions.elementAttributeContains(input_ImportDatesFromCostPopup_MaximumPax, "value", expectedMaximumPax);
	}
	
	public void containsValueImportDatesFromCostPopupMaximumPaxLabel(String expectedMaximumPax) throws Exception {
		CommonFunctions.elementContainsText(label_ImportDatesFromCostPopup_MaximumPax, expectedMaximumPax);
	}
	
	public void containsValueImportDatesFromCostPopupMinimumPaxInput(String expectedMinimumPax) throws Exception {
		CommonFunctions.elementAttributeContains(input_ImportDatesFromCostPopup_MinimumPax, "value", expectedMinimumPax);
	}
	
	public void containsValueImportDatesFromCostPopupMinimumPaxLabel(String expectedMinimumPax) throws Exception {
		CommonFunctions.elementContainsText(label_ImportDatesFromCostPopup_MinimumPax, expectedMinimumPax);
	}
	
	public void containsValueImportDatesFromCostPopupNumberOfDaysInput(String expectedNumberOfDays) throws Exception {
		CommonFunctions.elementAttributeContains(input_ImportDatesFromCostPopup_NumberOfDays, "value", expectedNumberOfDays);
	}
	
	public void containsValueImportDatesFromCostPopupQuantityInput(String expectedQuantity) throws Exception {
		CommonFunctions.elementAttributeContains(input_ImportDatesFromCostPopup_Quantity, "value", expectedQuantity);
	}
	
	public void containsValueImportDatesFromCostPopupRateTypeDropdown(String expectedRateType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ImportDatesFromCostPopup_RateType, expectedRateType);
	}
	
	public void containsValueImportDatesFromCostPopupSeasonDropdown(String expectedSeason) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ImportDatesFromCostPopup_Season.findElement(By.xpath(".//span")), expectedSeason);
	}
	
	public void containsValuePlaceholderImportDatesFromCostPopupPaxRangeFilterPlaceholderInput(String expectedPaxRangeFilterPlaceholder) throws Exception {
		CommonFunctions.elementAttributeContains(input_ImportDatesFromCostPopup_PaxRangeFilter, "placeholder", expectedPaxRangeFilterPlaceholder);
	}
	
	public void displayedImportDatesFromCostPopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ImportDatesFromCostPopup_Cancel);
	}
	
	public void displayedImportDatesFromCostPopupCategory1Dropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportDatesFromCostPopup_Category1.findElement(By.xpath(".//preceding-sibling::div")));
	}
	
	public void displayedImportDatesFromCostPopupCategory2Dropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportDatesFromCostPopup_Category2.findElement(By.xpath(".//preceding-sibling::div")));
	}
	
	public void displayedImportDatesFromCostPopupCostConfigurationDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportDatesFromCostPopup_CostConfiguration);
	}
	
	public void displayedImportDatesFromCostPopupCostsInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ImportDatesFromCostPopup_Costs);
	}
	
	public void displayedImportDatesFromCostPopupCostTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportDatesFromCostPopup_CostType.findElement(By.xpath(".//preceding-sibling::div")));
	}
	
	public void displayedImportDatesFromCostPopupGuestConfigurationDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportDatesFromCostPopup_GuestConfiguration);
	}
	
	public void displayedImportDatesFromCostPopupImportDatesButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ImportDatesFromCostPopup_ImportDates);
	}
	
	public void displayedImportDatesFromCostPopupMaximumPaxInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ImportDatesFromCostPopup_MaximumPax);
	}
	
	public void displayedImportDatesFromCostPopupMinimumPaxInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ImportDatesFromCostPopup_MinimumPax);
	}
	
	public void displayedImportDatesFromCostPopupNumberOfDaysInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ImportDatesFromCostPopup_NumberOfDays);
	}
	
	public void displayedImportDatesFromCostPopupQuantityInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ImportDatesFromCostPopup_Quantity);
	}
	
	public void displayedImportDatesFromCostPopupRateTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportDatesFromCostPopup_RateType);
	}
	
	public void displayedImportDatesFromCostPopupSeasonDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportDatesFromCostPopup_Season);
	}
	
	public void disabledImportDatesFromCostPopupCategory1Dropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_ImportDatesFromCostPopup_Category1, "disabled", "true");
	}
	
	public void disabledImportDatesFromCostPopupNumberOfDaysInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_ImportDatesFromCostPopup_NumberOfDays, "readonly", "true");
	}
	
	public void enabledImportDatesFromCostPopupCategory1Dropdown() throws Exception {
		CommonFunctions.elementEnabled(dropdown_ImportDatesFromCostPopup_Category1);
	}
	
	public void enabledImportDatesFromCostPopupNumberOfDaysInput() throws Exception {
		CommonFunctions.elementEnabled(input_ImportDatesFromCostPopup_NumberOfDays);
	}
	
	public void selectImportDatesFromCostPopupRateTypeValue(String rateType) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_ImportDatesFromCostPopup_RateType, rateType);
	}
	
	public void setImportDatesFromCostPopupCostsInput(String costs) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromCostPopup_Costs, costs);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setImportDatesFromCostPopupGuestConfigurationFilterInput(String guestConfigurationFilter) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromCostPopup_GuestConfigurationFilter, guestConfigurationFilter);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setImportDatesFromCostPopupMaximumPaxInput(String maximumPax) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromCostPopup_MaximumPax, maximumPax);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setImportDatesFromCostPopupMinimumPaxInput(String minimumPax) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromCostPopup_MinimumPax, minimumPax);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setImportDatesFromCostPopupNumberOfDaysInput(String numberOfDays) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromCostPopup_NumberOfDays, numberOfDays);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setImportDatesFromCostPopupQuantityInput(String quantity) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromCostPopup_Quantity, quantity);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	// End - Import Dates From Cost Popup Actions
	
	// Start - Import Dates From Price Popup Actions
	public void checkImportDatesFromPricePopupRespectiveGuestConfigurationsRadioButtonIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(radioButton_ImportDatesFromPricePopup_RespectiveGuestConfigurations);
	}
	
	public void checkImportDatesFromPricePopupTwinGuestConfigurationRadioButtonIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(radioButton_ImportDatesFromPricePopup_TwinGuestConfiguration);
	}
	
	public void clickImportDatesFromPricePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_ImportDatesFromPricePopup_Cancel);
	}
	
	public void clickImportDatesFromPricePopupCostConfigurationDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_ImportDatesFromPricePopup_CostConfiguration);
	}
	
	public void clickImportDatesFromPricePopupCurrencyDropdownOption(String currencyDropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ImportDatesFromPricePopup_Currency);
		
		if (currencyDropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@data-name, 'CurrencyCombobox')])[1]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'CurrencyContainer')]//div[contains(@class, 'search')]//input")), currencyDropdownOptionValue);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'CurrencyCombobox')]//following-sibling::span[text() = '" + currencyDropdownOptionValue + "']")));
		}
		
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickImportDatesFromPricePopupImportDatesButton() throws Exception {
		CommonFunctions.clickElement(button_ImportDatesFromPricePopup_ImportDates);
		CommonFunctions.pause(10000, false);
	}
	
	public void containsValueImportDatesFromPricePopupMaximumCommissionInput(String expectedMaximumCommission) throws Exception {
		CommonFunctions.elementAttributeContains(input_ImportDatesFromPricePopup_MaximumCommission, "value", expectedMaximumCommission);
	}
	
	public void containsValueImportDatesFromPricePopupMinimumCommissionInput(String expectedMinimumCommission) throws Exception {
		CommonFunctions.elementAttributeContains(input_ImportDatesFromPricePopup_MinimumCommission, "value", expectedMinimumCommission);
	}
	
	public void containsValueImportDatesFromPricePopupNonCommissionInput(String expectedNonCommission) throws Exception {
		CommonFunctions.elementAttributeContains(input_ImportDatesFromPricePopup_NonCommission, "value", expectedNonCommission);
	}
	
	public void containsValueImportDatesFromPricePopupPriceInput(String expectedPrice) throws Exception {
		CommonFunctions.elementAttributeContains(input_ImportDatesFromPricePopup_Price, "value", expectedPrice);
	}
	
	public void containsValueImportDatesFromPricePopupCurrencyDropdown(String expectedCurrency) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ImportDatesFromPricePopup_Currency.findElement(By.xpath(".//span")), expectedCurrency);
	}
	
	public void disabledImportDatesFromPricePopupRespectiveGuestConfigurationsRadioButton() throws Exception {
		CommonFunctions.elementAttributeContains(radioButton_ImportDatesFromPricePopup_RespectiveGuestConfigurations, "disabled", "true");
	}
	
	public void disabledImportDatesFromPricePopupTwinGuestConfigurationRadioButton() throws Exception {
		CommonFunctions.elementAttributeContains(radioButton_ImportDatesFromPricePopup_TwinGuestConfiguration, "disabled", "true");
	}
	
	public void displayedImportDatesFromPricePopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ImportDatesFromPricePopup_Cancel);
	}
	
	public void displayedImportDatesFromPricePopupCostConfigurationDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportDatesFromPricePopup_CostConfiguration);
	}
	
	public void displayedImportDatesFromPricePopupCurrencyDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportDatesFromPricePopup_Currency);
	}
	
	public void displayedImportDatesFromPricePopupImportDatesButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ImportDatesFromPricePopup_ImportDates);
	}
	
	public void displayedImportDatesFromPricePopupIncludePastDatesCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ImportDatesFromPricePopup_IncludePastDates);
	}
	
	public void displayedImportDatesFromPricePopupMaximumCommissionInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ImportDatesFromPricePopup_MaximumCommission);
	}
	
	public void displayedImportDatesFromPricePopupMinimumCommissionInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ImportDatesFromPricePopup_MinimumCommission);
	}
	
	public void displayedImportDatesFromPricePopupNonCommissionInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ImportDatesFromPricePopup_NonCommission);
	}
	
	public void displayedImportDatesFromPricePopupPriceInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ImportDatesFromPricePopup_Price);
	}
	
	public void displayedImportDatesFromPricePopupRespectiveGuestConfigurationsRadioButton() throws Exception {
		CommonFunctions.elementDisplayed(radioButton_ImportDatesFromPricePopup_RespectiveGuestConfigurations);
	}
	
	public void displayedImportDatesFromPricePopupTwinGuestConfigurationRadioButton() throws Exception {
		CommonFunctions.elementDisplayed(radioButton_ImportDatesFromPricePopup_TwinGuestConfiguration);
	}
	
	public void enabledImportDatesFromPricePopupRespectiveGuestConfigurationsRadioButton() throws Exception {
		CommonFunctions.elementEnabled(radioButton_ImportDatesFromPricePopup_RespectiveGuestConfigurations);
	}
	
	public void enabledImportDatesFromPricePopupTwinGuestConfigurationRadioButton() throws Exception {
		CommonFunctions.elementEnabled(radioButton_ImportDatesFromPricePopup_TwinGuestConfiguration);
	}
	
	public void setImportDatesFromPricePopupGuestConfigurationFilterInput(String guestConfigurationFilter) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromPricePopup_GuestConfigurationFilter, guestConfigurationFilter);
		CommonFunctions.pause(2500, false);
	}
	
	public void setImportDatesFromPricePopupMaximumCommissionInput(String maximumCommission) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromPricePopup_MaximumCommission, maximumCommission);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setImportDatesFromPricePopupMinimumCommissionInput(String minimumCommission) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromPricePopup_MinimumCommission, minimumCommission);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setImportDatesFromPricePopupNonCommissionInput(String nonCommission) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromPricePopup_NonCommission, nonCommission);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setImportDatesFromPricePopupPriceInput(String price) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportDatesFromPricePopup_Price, price);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	// End - Import Dates From Price Popup Actions
	
	// Start - Payment Cancellation Rule Popup Actions
	public void clickPaymentCancellationRulePopupAddRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentCancellationRulePopup_AddRule);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickPaymentCancellationRulePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentCancellationRulePopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickPaymentCancellationRulePopupCloseButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentCancellationRulePopup_Close);
		CommonFunctions.pause(5000, false);
	}
	
	public void containsValuePaymentCancellationRulePopupAmountPercentageInput(String expectedAmountPercentage) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentCancellationRulePopup_AmountPercentage, "value", expectedAmountPercentage);
	}
	
	public void containsValuePaymentCancellationRulePopupBookingEndDateInput(String expectedBookingEndDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentCancellationRulePopup_BookingEndDate, "value", expectedBookingEndDate);
	}
	
	public void containsValuePaymentCancellationRulePopupActionDropdown(String expectedAction) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentCancellationRulePopup_Action.findElement(By.xpath(".//option[@selected]")), expectedAction);
	}
	
	public void containsValuePaymentCancellationRulePopupCurrencyDropdown(String expectedCurrency) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentCancellationRulePopup_Currency.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCurrency);
	}
	
	public void containsValuePaymentCancellationRulePopupCustomerMarketDropdown(String expectedCustomerMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentCancellationRulePopup_CustomerMarket.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCustomerMarket);
	}
	
	public void containsValuePaymentCancellationRulePopupCustomerTypeDropdown(String expectedCustomerType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentCancellationRulePopup_CustomerType.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCustomerType);
	}
	
	public void containsValuePaymentCancellationRulePopupDepartureEndDateInput(String expectedDepartureEndDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentCancellationRulePopup_DepartureEndDate, "value", expectedDepartureEndDate);
	}
	
	public void containsValuePaymentCancellationRulePopupItemTypeDropdown(String expectedItemType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentCancellationRulePopup_ItemType.findElement(By.xpath(".//option[@selected]")), expectedItemType);
	}
	
	public void containsValuePaymentCancellationRulePopupMaximumDaysInput(String expectedMaximumDays) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentCancellationRulePopup_MaximumDays, "value", expectedMaximumDays);
	}
	
	public void containsValuePaymentCancellationRulePopupMinimumDaysInput(String expectedMinimumDays) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentCancellationRulePopup_MinimumDays, "value", expectedMinimumDays);
	}
	
	public void displayedPaymentCancellationRulePopupAddRuleButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PaymentCancellationRulePopup_AddRule);
	}
	
	public void displayedPaymentCancellationRulePopupBookingStartDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_PaymentCancellationRulePopup_BookingStartDate);
	}
	
	public void displayedPaymentCancellationRulePopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PaymentCancellationRulePopup_Cancel);
	}
	
	public void displayedPaymentCancellationRulePopupDepartureStartDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_PaymentCancellationRulePopup_DepartureStartDate);
	}
	
	public void selectPaymentCancellationRulePopupActionValue(String action) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PaymentCancellationRulePopup_Action, action);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectPaymentCancellationRulePopupCustomerMarketValue(String customerMarketValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PaymentCancellationRulePopup_CustomerMarket);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), customerMarketValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectPaymentCancellationRulePopupCustomerTypeValue(String customerTypeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PaymentCancellationRulePopup_CustomerType);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), customerTypeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void setPaymentCancellationRulePopupAmountPercentageInput(String amountPercentage) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentCancellationRulePopup_AmountPercentage, amountPercentage);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentCancellationRulePopupBookingEndDateInput(String bookingEndDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentCancellationRulePopup_BookingEndDate, bookingEndDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentCancellationRulePopupBookingStartDateInput(String bookingStartDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentCancellationRulePopup_BookingStartDate, bookingStartDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentCancellationRulePopupDepartureEndDateInput(String departureEndDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentCancellationRulePopup_DepartureEndDate, departureEndDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentCancellationRulePopupDepartureStartDateInput(String departureStartDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentCancellationRulePopup_DepartureStartDate, departureStartDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentCancellationRulePopupMaximumDaysInput(String maximumDays) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentCancellationRulePopup_MaximumDays, maximumDays);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentCancellationRulePopupMinimumDaysInput(String minimumDays) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentCancellationRulePopup_MinimumDays, minimumDays);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	// End - Payment Cancellation Rule Popup Actions
	
	// Start - Payment Deposit Rule Popup Actions
	public void clickPaymentDepositRulePopupAddRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentDepositRulePopup_AddRule);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickPaymentDepositRulePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentDepositRulePopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickPaymentDepositRulePopupCloseButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentDepositRulePopup_Close);
		CommonFunctions.pause(5000, false);
	}
	
	public void containsValuePaymentDepositRulePopupAmountPercentageInput(String expectedAmountPercentage) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentDepositRulePopup_AmountPercentage, "value", expectedAmountPercentage);
	}
	
	public void containsValuePaymentDepositRulePopupBookingEndDateInput(String expectedBookingEndDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentDepositRulePopup_BookingEndDate, "value", expectedBookingEndDate);
	}
	
	public void containsValuePaymentDepositRulePopupActionDropdown(String expectedAction) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentDepositRulePopup_Action.findElement(By.xpath(".//option[@selected]")), expectedAction);
	}
	
	public void containsValuePaymentDepositRulePopupCurrencyDropdown(String expectedCurrency) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentDepositRulePopup_Currency.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCurrency);
	}
	
	public void containsValuePaymentDepositRulePopupCustomerMarketDropdown(String expectedCustomerMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentDepositRulePopup_CustomerMarket.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCustomerMarket);
	}
	
	public void containsValuePaymentDepositRulePopupCustomerTypeDropdown(String expectedCustomerType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentDepositRulePopup_CustomerType.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCustomerType);
	}
	
	public void containsValuePaymentDepositRulePopupDepartureEndDateInput(String expectedDepartureEndDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentDepositRulePopup_DepartureEndDate, "value", expectedDepartureEndDate);
	}
	
	public void containsValuePaymentDepositRulePopupItemTypeDropdown(String expectedItemType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentDepositRulePopup_ItemType.findElement(By.xpath(".//option[@selected]")), expectedItemType);
	}
	
	public void containsValuePaymentDepositRulePopupMaximumDaysInput(String expectedMaximumDays) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentDepositRulePopup_MaximumDays, "value", expectedMaximumDays);
	}
	
	public void containsValuePaymentDepositRulePopupMinimumDaysInput(String expectedMinimumDays) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentDepositRulePopup_MinimumDays, "value", expectedMinimumDays);
	}
	
	public void disabledPaymentDepositRulePopupMaximumDaysInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentDepositRulePopup_MaximumDays, "readonly", "true");
	}
	
	public void displayedPaymentDepositRulePopupAddRuleButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PaymentDepositRulePopup_AddRule);
	}
	
	public void displayedPaymentDepositRulePopupBookingStartDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_PaymentDepositRulePopup_BookingStartDate);
	}
	
	public void displayedPaymentDepositRulePopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PaymentDepositRulePopup_Cancel);
	}
	
	public void displayedPaymentDepositRulePopupDepartureStartDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_PaymentDepositRulePopup_DepartureStartDate);
	}
	
	public void selectPaymentDepositRulePopupActionValue(String action) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_PaymentDepositRulePopup_Action, action);
		CommonFunctions.pause(2500, false);
	}
	
	public void selectPaymentDepositRulePopupCustomerMarketValue(String customerMarketValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PaymentDepositRulePopup_CustomerMarket);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), customerMarketValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectPaymentDepositRulePopupCustomerTypeValue(String customerTypeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PaymentDepositRulePopup_CustomerType);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), customerTypeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void setPaymentDepositRulePopupAmountPercentageInput(String amountPercentage) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentDepositRulePopup_AmountPercentage, amountPercentage);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentDepositRulePopupBookingEndDateInput(String bookingEndDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentDepositRulePopup_BookingEndDate, bookingEndDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentDepositRulePopupBookingStartDateInput(String bookingStartDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentDepositRulePopup_BookingStartDate, bookingStartDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentDepositRulePopupDepartureEndDateInput(String departureEndDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentDepositRulePopup_DepartureEndDate, departureEndDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentDepositRulePopupDepartureStartDateInput(String departureStartDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentDepositRulePopup_DepartureStartDate, departureStartDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentDepositRulePopupMaximumDaysInput(String maximumDays) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentDepositRulePopup_MaximumDays, maximumDays);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentDepositRulePopupMinimumDaysInput(String minimumDays) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentDepositRulePopup_MinimumDays, minimumDays);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	// End - Payment Deposit Rule Popup Actions
	
	// Start - Payment Final Payment Rule Popup Actions
	public void checkPaymentFinalPaymentRulePopupDueDateRadioButtonIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(radioButton_PaymentFinalPaymentRulePopup_DueDate);
	}
	
	public void checkPaymentFinalPaymentRulePopupMinimumDaysRadioButtonIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(radioButton_PaymentFinalPaymentRulePopup_MinimumDays);
	}
	
	public void clickPaymentFinalPaymentRulePopupAddRuleButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentFinalPaymentRulePopup_AddRule);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickPaymentFinalPaymentRulePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentFinalPaymentRulePopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickPaymentFinalPaymentRulePopupCloseButton() throws Exception {
		CommonFunctions.clickElement(button_PaymentFinalPaymentRulePopup_Close);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickPaymentFinalPaymentRulePopupDueDateRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_PaymentFinalPaymentRulePopup_DueDate);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickPaymentFinalPaymentRulePopupMinimumDaysRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_PaymentFinalPaymentRulePopup_MinimumDays);
		CommonFunctions.pause(500, false);
	}
	
	public void containsValuePaymentFinalPaymentRulePopupBookingStartDateInput(String expectedBookingStartDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentFinalPaymentRulePopup_BookingStartDate, "value", expectedBookingStartDate);
	}
	
	public void containsValuePaymentFinalPaymentRulePopupBookingEndDateInput(String expectedBookingEndDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentFinalPaymentRulePopup_BookingEndDate, "value", expectedBookingEndDate);
	}
	
	public void containsValuePaymentFinalPaymentRulePopupCustomerMarketDropdown(String expectedCustomerMarket) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentFinalPaymentRulePopup_CustomerMarket.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCustomerMarket);
	}
	
	public void containsValuePaymentFinalPaymentRulePopupCustomerTypeDropdown(String expectedCustomerType) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentFinalPaymentRulePopup_CustomerType.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCustomerType);
	}
	
	public void containsValuePaymentFinalPaymentRulePopupCurrencyDropdown(String expectedCurrency) throws Exception {
		CommonFunctions.elementContainsText(dropdown_PaymentFinalPaymentRulePopup_Currency.findElement(By.xpath(".//span[contains(@class, 'chosen')]")), expectedCurrency);
	}
	
	public void containsValuePaymentFinalPaymentRulePopupDepartureStartDateInput(String expectedDepartureStartDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentFinalPaymentRulePopup_DepartureStartDate, "value", expectedDepartureStartDate);
	}
	
	public void containsValuePaymentFinalPaymentRulePopupDepartureEndDateInput(String expectedDepartureEndDate) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentFinalPaymentRulePopup_DepartureEndDate, "value", expectedDepartureEndDate);
	}
	
	public void containsValuePaymentFinalPaymentRulePopupMinimumDaysInput(String expectedMinimumDays) throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentFinalPaymentRulePopup_MinimumDays, "value", expectedMinimumDays);
	}
	
	public void disabledPaymentFinalPaymentRulePopupDueDateInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentFinalPaymentRulePopup_DueDate, "readonly", "true");
	}
	
	public void disabledPaymentFinalPaymentRulePopupMinimumDaysInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_PaymentFinalPaymentRulePopup_MinimumDays, "readonly", "true");
	}
	
	public void displayedPaymentFinalPaymentRulePopupAddRuleButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PaymentFinalPaymentRulePopup_AddRule);
	}
	
	public void displayedPaymentFinalPaymentRulePopupBookingStartDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_PaymentFinalPaymentRulePopup_BookingStartDate);
	}
	
	public void displayedPaymentFinalPaymentRulePopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_PaymentFinalPaymentRulePopup_Cancel);
	}
	
	public void displayedPaymentFinalPaymentRulePopupDepartureStartDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_PaymentFinalPaymentRulePopup_DepartureStartDate);
	}
	
	public void enabledPaymentFinalPaymentRulePopupDueDateInput() throws Exception {
		CommonFunctions.elementEnabled(input_PaymentFinalPaymentRulePopup_DueDate);
	}
	
	public void enabledPaymentFinalPaymentRulePopupMinimumDaysInput() throws Exception {
		CommonFunctions.elementEnabled(input_PaymentFinalPaymentRulePopup_MinimumDays);
	}
	
	public void selectPaymentFinalPaymentRulePopupCustomerMarketValue(String customerMarketValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PaymentFinalPaymentRulePopup_CustomerMarket);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), customerMarketValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void selectPaymentFinalPaymentRulePopupCustomerTypeValue(String customerTypeValue) throws Exception {
		CommonFunctions.clickElement(dropdown_PaymentFinalPaymentRulePopup_CustomerType);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), customerTypeValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	public void setPaymentFinalPaymentRulePopupBookingEndDateInput(String bookingEndDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentFinalPaymentRulePopup_BookingEndDate, bookingEndDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentFinalPaymentRulePopupBookingStartDateInput(String bookingStartDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentFinalPaymentRulePopup_BookingStartDate, bookingStartDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentFinalPaymentRulePopupDepartureEndDateInput(String departureEndDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentFinalPaymentRulePopup_DepartureEndDate, departureEndDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentFinalPaymentRulePopupDepartureStartDateInput(String departureStartDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentFinalPaymentRulePopup_DepartureStartDate, departureStartDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentFinalPaymentRulePopupDueDateInput(String dueDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentFinalPaymentRulePopup_DueDate, dueDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setPaymentFinalPaymentRulePopupMinimumDaysInput(String minimumDays) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_PaymentFinalPaymentRulePopup_MinimumDays, minimumDays);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	// End - Payment Final Payment Rule Popup Actions
	
	// Start - Itirenary Template Popup Actions
	public void clickItirenaryTemplatePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_ItirenaryTemplatePopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickItirenaryTemplatePopupCloseButton() throws Exception {
		CommonFunctions.clickElement(button_ItirenaryTemplatePopup_Close);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickItirenaryTemplatePopupSaveButton() throws Exception {
		CommonFunctions.clickElement(button_ItirenaryTemplatePopup_Save);
		CommonFunctions.pause(5000, false);
	}
	
	public void containsValueItirenaryTemplatePopupEndDateInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ItirenaryTemplatePopup_EndDate, "value", expectedValue);
	}
	
	public void containsValueItirenaryTemplatePopupStartDateInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ItirenaryTemplatePopup_StartDate, "value", expectedValue);
	}
	
	public void containsValueItirenaryTemplatePopupTimeInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ItirenaryTemplatePopup_Time, "value", expectedValue);
	}
	
	public void selectItirenaryTemplatePopupItineraryTemplateValue(String itineraryTemplateValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ItirenaryTemplatePopup_ItineraryTemplate);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@placeholder, 'Itinerary Template')]")), itineraryTemplateValue);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'SuggestionListContainer')]//div[@class = 'FullRow']")));
		CommonFunctions.pause(5000, false);
	}
	
	public void setItirenaryTemplatePopupDayInput(String day) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ItirenaryTemplatePopup_Day, day);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setItirenaryTemplatePopupEndDateInput(String endDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ItirenaryTemplatePopup_EndDate, endDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setItirenaryTemplatePopupStartDateInput(String startDate) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ItirenaryTemplatePopup_StartDate, startDate);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setItirenaryTemplatePopupTimeInput(String time) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ItirenaryTemplatePopup_Time, time);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void displayedItineraryStartDateValidationMessage() throws Exception {
		CommonFunctions.elementDisplayed(validation_StartDateValidationMessage);
	}
	
	public void displayedItineraryEndDateValidationMessage() throws Exception {
		CommonFunctions.elementDisplayed(validation_EndDateValidationMessage);
	}
	// End - Itirenary Template Popup Actions
	
	// Start - Contract Prices Popup Actions
	public void clickContractPricePopupAddCustomDatesSectionAddToTableButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPricePopup_AddCustomDatesSection_AddToTable);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickContractPricePopupAddCustomDatesSectionPriceCurrencyDropdownOption(String dropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ContractPricePopup_AddCustomDatesSection_PriceCurrency);
		CommonFunctions.clickElement(dropdown_ContractPricePopup_AddCustomDatesSection_PaxType);
		CommonFunctions.clickElement(dropdown_ContractPricePopup_AddCustomDatesSection_PriceCurrency);
		
		if (dropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_ContractPricePopup_AddCustomDatesSection_PriceCurrency.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_ContractPricePopup_AddCustomDatesSection_PriceCurrency.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), dropdownOptionValue);
			CommonFunctions.clickElement(dropdown_ContractPricePopup_AddCustomDatesSection_PriceCurrency.findElement(By.xpath(".//parent::div//ul//span[text() = '" + dropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickContractPricePopupAddCustomDatesTabLabel() throws Exception {
		CommonFunctions.clickElement(label_ContractPricePopup_AddCustomDatesTab);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickContractPricePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPricePopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickContractPricePopupContractPricesTableAllRowsCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_ContractPricePopup_ContractPricesTable_AllRows);
	}
	
	public void clickContractPricePopupContractPricesTableSaveButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPricePopup_ContractPricesTable_Save);
		CommonFunctions.pause(10000, false);
	}
	
	public void clickContractPricePopupContractPricesTableStartDateFilterOptionCheckbox(String value) throws Exception {
		CommonFunctions.clickElement(button_ContractPricePopup_ContractPricesTable_StartDateFilter);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//label[contains(text(), '" + value + "')]//input")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("//button[@wj-part = 'btn-apply']")));
		CommonFunctions.pause(2500, false);
	}
	
	public void clickContractPricePopupContractPricesTableTopCheckboxRowData() throws Exception {
		CommonFunctions.clickElement(rowData_ContractPricePopup_ContractPricesTable_TopCheckbox);
	}
	
	public void clickContractPricePopupContractPricesTableDeleteButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPricePopup_ContractPricesTable_Delete);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the selected record(s)?']");
	}
	
	public void clickContractPricePopupImportDatesSectionAddToTableButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPricePopup_ImportDatesSection_AddToTable);
		CommonFunctions.pause(7500, false);
	}
	
	public void clickContractPricePopupImportDatesSectionIncludePastDatesCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_ContractPricePopup_ImportDatesSection_IncludePastDates);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickContractPricePopupImportDatesSectionPaxTypeDropdownOption(String dropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_PaxType);
		CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_PriceCurrency);
		CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_PaxType);
		
		if (dropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_PaxType.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_ContractPricePopup_ImportDatesSection_PaxType.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), dropdownOptionValue);
			CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_PaxType.findElement(By.xpath(".//parent::div//ul//span[text() = '" + dropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickContractPricePopupImportDatesSectionPriceCurrencyDropdownOption(String dropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_PriceCurrency);
		CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_PaxType);
		CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_PriceCurrency);
		
		if (dropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_PriceCurrency.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_ContractPricePopup_ImportDatesSection_PriceCurrency.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), dropdownOptionValue);
			CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_PriceCurrency.findElement(By.xpath(".//parent::div//ul//span[text() = '" + dropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickContractPricePopupImportDatesTabLabel() throws Exception {
		CommonFunctions.clickElement(label_ContractPricePopup_ImportDatesTab);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickContractPricePopupImportDatesSectionImportFromCostRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_ContractPricePopup_ImportDatesSection_ImportFromCost);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickContractPricePopupImportDatesSectionImportFromPriceDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_ContractPricePopup_ImportDatesSection_ImportFromPrice);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickContractPricePopupImportDatesSectionImportFromPriceRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_ContractPricePopup_ImportDatesSection_ImportFromPrice);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickContractPricePopupImportFromPriceDropdownTopImportFromPriceRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_ContractPricePopup_ImportFromPriceDropdown_TopImportFromPrice);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickContractPricePopupPriceConfigurationDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_ContractPricePopup_PriceConfiguration);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickContractPricePopupPriceConfigurationDropdownTopPriceConfigurationRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_ContractPricePopup_PriceConfigurationDropdown_TopPriceConfiguration);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickContractPricePopupSavePricesButton() throws Exception {
		CommonFunctions.clickElement(button_ContractPricePopup_SavePrices);
		CommonFunctions.pause(7500, false);
	}
	
	public void containsValueContractPricePopupContractPricesTableTopMaxCommissionInputRowData(String expectedValue) throws Exception {
		// CommonFunctions.elementAttributeContains(rowData_ContractPricePopup_ContractPricesTable_TopMaxCommissionInput, "value", expectedValue);
		rowData_ContractPricePopup_ContractPricesTable_TopMaxCommissionInput.getText().contains(expectedValue);
	}
	
	public void containsValueContractPricePopupContractPricesTableTopMinCommissionInputRowData(String expectedValue) throws Exception {
		// CommonFunctions.elementAttributeContains(rowData_ContractPricePopup_ContractPricesTable_TopMinCommissionInput, "value", expectedValue);
		rowData_ContractPricePopup_ContractPricesTable_TopMinCommissionInput.getText().contains(expectedValue);
	}
	
	public void containsValueContractPricePopupContractPricesTableTopNonCommissionInputRowData(String expectedValue) throws Exception {
		// CommonFunctions.elementAttributeContains(rowData_ContractPricePopup_ContractPricesTable_TopNonCommissionInput, "value", expectedValue);
		rowData_ContractPricePopup_ContractPricesTable_TopNonCommissionInput.getText().contains(expectedValue);
	}
	
	public void containsValueContractPricePopupContractPricesTableTopPriceInputRowData(String expectedValue) throws Exception {
		// CommonFunctions.elementContainsText(rowData_ContractPricePopup_ContractPricesTable_TopPriceInput, expectedValue);
		rowData_ContractPricePopup_ContractPricesTable_TopPriceInput.getText().contains(expectedValue);
	}
	
	public void containsValueContractPricePopupEquivalentCostConfigurationDropdownCategory1Label(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(label_ContractPricePopup_EquivalentCostConfigurationDropdown_Category1, expectedValue);
	}
	
	public void containsValueContractPricePopupEquivalentCostConfigurationDropdownCategory2Label(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(label_ContractPricePopup_EquivalentCostConfigurationDropdown_Category2, expectedValue);
	}
	
	public void containsValueContractPricePopupEquivalentCostConfigurationDropdownGuestConfigurationLabel(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(label_ContractPricePopup_EquivalentCostConfigurationDropdown_GuestConfiguration, expectedValue);
	}
	
	public void containsValueContractPricePopupEquivalentCostConfigurationDropdownNightsLabel(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(label_ContractPricePopup_EquivalentCostConfigurationDropdown_Nights, expectedValue);
	}
	
	public void containsValueContractPricePopupImportDatesSectionPaxTypeDropdown(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ContractPricePopup_ImportDatesSection_PaxType.findElement(By.xpath(".//span")), expectedValue);
	}
	
	public void containsValueContractPricePopupImportDatesSectionPriceCurrencyDropdown(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ContractPricePopup_ImportDatesSection_PriceCurrency.findElement(By.xpath(".//span")), expectedValue);
	}
	
	public void containsValueContractPricePopupPriceConfigurationDropdownCategory1Label(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(label_ContractPricePopup_PriceConfigurationDropdown_Category1, expectedValue);
	}
	
	public void containsValueContractPricePopupPriceConfigurationDropdownCategory2Label(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(label_ContractPricePopup_PriceConfigurationDropdown_Category2, expectedValue);
	}
	
	public void containsValueContractPricePopupPriceConfigurationDropdownGuestConfigurationLabel(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(label_ContractPricePopup_PriceConfigurationDropdown_GuestConfiguration, expectedValue);
	}
	
	public void containsValueContractPricePopupPriceConfigurationDropdownNightsLabel(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(label_ContractPricePopup_PriceConfigurationDropdown_Nights, expectedValue);
	}
	
	public void disabledContractPricePopupAddCustomDatesSectionAddToTableButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ContractPricePopup_AddCustomDatesSection_AddToTable, "disabled", "true");
	}
	
	public void displayedContractPricePopupAddCustomDatesSectionAddToTableButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractPricePopup_AddCustomDatesSection_AddToTable);
	}
	
	public void displayedContractPricePopupAddCustomDatesSectionEndDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_AddCustomDatesSection_EndDate);
	}
	
	public void displayedContractPricePopupAddCustomDatesSectionPaxTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ContractPricePopup_AddCustomDatesSection_PaxType);
	}
	
	public void displayedContractPricePopupAddCustomDatesSectionPriceCurrencyDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ContractPricePopup_AddCustomDatesSection_PriceCurrency);
	}
	
	public void displayedContractPricePopupAddCustomDatesSectionStartDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_AddCustomDatesSection_StartDate);
	}
	
	public void displayedContractPricePopupAddCustomDatesTabLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_ContractPricePopup_AddCustomDatesTab);
	}
	
	public void displayedContractPricePopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractPricePopup_Cancel);
	}
	
	public void displayedContractPricePopupContractPricesTableCurrencyFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_ContractPricesTable_CurrencyFilter);
	}
	
	public void displayedContractPricePopupContractPricesTableEndDateFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_ContractPricesTable_EndDateFilter);
	}
	
	public void displayedContractPricePopupContractPricesTablePaxTypeFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_ContractPricesTable_PaxTypeFilter);
	}
	
	public void displayedContractPricePopupContractPricesTableStartDateFilterButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractPricePopup_ContractPricesTable_StartDateFilter);
	}
	
	public void displayedContractPricePopupImportDatesSectionAddToTableButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractPricePopup_ImportDatesSection_AddToTable);
	}
	
	public void displayedContractPricePopupImportDatesSectionCopyPricesCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractPricePopup_ImportDatesSection_CopyPrices);
	}
	
	public void displayedContractPricePopupImportDatesSectionImportFromCostRadioButton() throws Exception {
		CommonFunctions.elementDisplayed(radioButton_ContractPricePopup_ImportDatesSection_ImportFromCost);
	}
	
	public void displayedContractPricePopupImportDatesSectionImportFromPriceRadioButton() throws Exception {
		CommonFunctions.elementDisplayed(radioButton_ContractPricePopup_ImportDatesSection_ImportFromPrice);
	}
	
	public void displayedContractPricePopupImportDatesSectionIncludePastDatesCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ContractPricePopup_ImportDatesSection_IncludePastDates);
	}
	
	public void displayedContractPricePopupImportDatesSectionPaxTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ContractPricePopup_ImportDatesSection_PaxType);
	}
	
	public void displayedContractPricePopupImportDatesSectionPriceCurrencyDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ContractPricePopup_ImportDatesSection_PriceCurrency);
	}
	
	public void displayedContractPricePopupImportDatesSectionEquivalentCostConfigurationInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_ImportDatesSection_EquivalentCostConfiguration);
	}
	
	public void displayedContractPricePopupImportDatesSectionImportFromPriceDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ContractPricePopup_ImportDatesSection_ImportFromPrice);
	}
	
	public void displayedContractPricePopupImportDatesTabLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_ContractPricePopup_ImportDatesTab);
	}
	
	public void displayedContractPricePopupImportFromPriceDropdownCategory1FilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_ImportFromPriceDropdown_Category1Filter);
	}
	
	public void displayedContractPricePopupImportFromPriceDropdownCategory2FilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_ImportFromPriceDropdown_Category2Filter);
	}
	
	public void displayedContractPricePopupImportFromPriceDropdownGuestConfigurationFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_ImportFromPriceDropdown_GuestConfigurationFilter);
	}
	
	public void displayedContractPricePopupImportFromPriceDropdownNightsFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_ImportFromPriceDropdown_NightsFilter);
	}
	
	public void displayedContractPricePopupImportFromPriceDropdownTopImportFromPriceRadioButton() throws Exception {
		CommonFunctions.elementDisplayed(radioButton_ContractPricePopup_ImportFromPriceDropdown_TopImportFromPrice);
	}
	
	public void displayedContractPricePopupPriceConfigurationDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ContractPricePopup_PriceConfiguration);
	}
	
	public void displayedContractPricePopupPriceConfigurationDropdownCategory1FilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_PriceConfigurationDropdown_Category1Filter);
	}
	
	public void displayedContractPricePopupPriceConfigurationDropdownCategory2FilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_PriceConfigurationDropdown_Category2Filter);
	}
	
	public void displayedContractPricePopupPriceConfigurationDropdownGuestConfigurationFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_PriceConfigurationDropdown_GuestConfigurationFilter);
	}
	
	public void displayedContractPricePopupPriceConfigurationDropdownNightsFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractPricePopup_PriceConfigurationDropdown_NightsFilter);
	}
	
	public void displayedContractPricePopupPriceConfigurationDropdownTopPriceConfigurationRadioButton() throws Exception {
		CommonFunctions.elementDisplayed(radioButton_ContractPricePopup_PriceConfigurationDropdown_TopPriceConfiguration);
	}
	
	public void displayedContractPricePopupSavePricesButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ContractPricePopup_SavePrices);
	}
	
	public void enabledContractPricePopupImportDatesSectionAddToTableButton() throws Exception {
		CommonFunctions.elementEnabled(button_ContractPricePopup_ImportDatesSection_AddToTable);
	}
	
	public void setContractPricePopupAddCustomDatesSectionEndDateInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractPricePopup_AddCustomDatesSection_EndDate, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setContractPricePopupAddCustomDatesSectionStartDateInput(String value) throws Exception {
		CommonFunctions.clickElement(input_ContractPricePopup_AddCustomDatesSection_StartDate);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.HOME));
		CommonFunctions.clickKeys(Keys.chord(Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE));
		CommonFunctions.clearThenEnterElementValue(input_ContractPricePopup_AddCustomDatesSection_StartDate, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setContractPricePopupContractPricesTableStartDateFilterInput(String value) throws Exception {
		CommonFunctions.clickElement(button_ContractPricePopup_ContractPricesTable_StartDateFilter);
		
		if (value.equals("Select All")) {
			CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@wj-part = 'cb-select-all']")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[@wj-part = 'input']")), value);
			CommonFunctions.pause(2500, false);
			CommonFunctions.clickElement(driver.findElement(By.xpath("//label[contains(text(), '" + value + "')]//input")));
		}
		
		CommonFunctions.clickElement(driver.findElement(By.xpath("//button[@wj-part = 'btn-apply']")));
		CommonFunctions.pause(2500, false);
	}
	
	public void setContractPricePopupContractPricesTableTopMaxCommissionInputRowData(String value) throws Exception {
		CommonFunctions.clickElement(rowData_ContractPricePopup_ContractPricesTable_TopPaxTypeDropdown);
		CommonFunctions.clickKeys(Keys.chord(Keys.ARROW_RIGHT));
		CommonFunctions.clickKeys(Keys.chord(Keys.ARROW_RIGHT));
		CommonFunctions.clickKeys(Keys.chord(Keys.ARROW_RIGHT));
		CommonFunctions.clickKeys(Keys.chord(Keys.ARROW_RIGHT));
		CommonFunctions.pause(1000, false);
		CommonFunctions.clickKeys(Keys.chord("0"));
		CommonFunctions.pause(1000, false);
		CommonFunctions.clickKeys(Keys.chord(value));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}
	
	public void setContractPricePopupContractPricesTableTopMinCommissionInputRowData(String value) throws Exception {
		CommonFunctions.clickElement(rowData_ContractPricePopup_ContractPricesTable_TopPaxTypeDropdown);
		CommonFunctions.clickKeys(Keys.chord(Keys.ARROW_RIGHT));
		CommonFunctions.clickKeys(Keys.chord(Keys.ARROW_RIGHT));
		CommonFunctions.clickKeys(Keys.chord(Keys.ARROW_RIGHT));
		CommonFunctions.pause(1000, false);
		CommonFunctions.clickKeys(Keys.chord("0"));
		CommonFunctions.pause(1000, false);
		CommonFunctions.clickKeys(Keys.chord(value));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}
	
	public void setContractPricePopupContractPricesTableTopNonCommissionInputRowData(String value) throws Exception {
		CommonFunctions.clickElement(rowData_ContractPricePopup_ContractPricesTable_TopPaxTypeDropdown);
		CommonFunctions.clickKeys(Keys.chord(Keys.ARROW_RIGHT));
		CommonFunctions.clickKeys(Keys.chord(Keys.ARROW_RIGHT));
		CommonFunctions.pause(1000, false);
		CommonFunctions.clickKeys(Keys.chord("0"));
		CommonFunctions.pause(1000, false);
		CommonFunctions.clickKeys(Keys.chord(value));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}
	
	public void setContractPricePopupContractPricesTableTopPriceInputRowData(String value) throws Exception {
		CommonFunctions.clickElement(rowData_ContractPricePopup_ContractPricesTable_TopPaxTypeDropdown);
		CommonFunctions.clickKeys(Keys.chord(Keys.ARROW_RIGHT));
		CommonFunctions.pause(1000, false);
		CommonFunctions.clickKeys(Keys.chord("0"));
		CommonFunctions.pause(1000, false);
		CommonFunctions.clickKeys(Keys.chord(value));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}
	
	public void setContractPricePopupImportFromPriceDropdownCategory1FilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractPricePopup_ImportFromPriceDropdown_Category1Filter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setContractPricePopupImportFromPriceDropdownCategory2FilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractPricePopup_ImportFromPriceDropdown_Category2Filter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setContractPricePopupImportFromPriceDropdownGuestConfigurationFilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractPricePopup_ImportFromPriceDropdown_GuestConfigurationFilter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setContractPricePopupPriceConfigurationDropdownCategory1FilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractPricePopup_PriceConfigurationDropdown_Category1Filter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setContractPricePopupPriceConfigurationDropdownCategory2FilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractPricePopup_PriceConfigurationDropdown_Category2Filter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setContractPricePopupPriceConfigurationDropdownGuestConfigurationFilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ContractPricePopup_PriceConfigurationDropdown_GuestConfigurationFilter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void DefaultPaxTypeDropdownNoDefaultValueImportDatesSection_CostPaxType() throws Exception { // importDates pax dropdown (Cost)
		CommonFunctions.elementContainsText(dropdown_ContractPricePopup_ImportDatesSection_PaxType, "Select Pax");
	}
	
	public void clickContractPricePopupPriceRadioBtn() throws Exception {
		CommonFunctions.clickElement(radiobutton_ContractPricePopup_Price);
		CommonFunctions.pause(2500, false);
	}
	
	public void DefaultPaxTypeDropdownNoDefaultValueImportDatesSection_PricePaxType() throws Exception { // importDates pax dropdown (Cost)
		CommonFunctions.elementContainsText(PaxType_ImportFromPrice, "Select Pax");
	}
	
	public void DefaultPaxTypeDropdownNoDefaultValue() throws Exception { // CustomDates pax dropdown
		CommonFunctions.elementContainsText(dropdown_ContractPricePopup_AddCustomDatesSection_PaxType, "Select Pax");
	}
	
	public void DefaultPaxTypeDropdownValueForHotel() throws Exception {
		int count = CommonFunctions.getElementCountByXPath("//div[contains(@class, 'Popup')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content2') and contains(@class, 'PH Tabs')]//span[contains(@id, 'PaxCombo')]//parent::div//button//following-sibling::div//ul//li//label");
		
		if (count <= 2) {
			CommonFunctions.elementContainsText(dropdown_ContractPricePopup_AddCustomDatesSection_PaxType, "All Selected");
		}
		else {
			CommonFunctions.elementContainsText(dropdown_ContractPricePopup_AddCustomDatesSection_PaxType, "Adult");
		}
	}
	
	public void DefaultPaxTypeDropdownValueForHotelImportFromPrice() throws Exception {
		int count = CommonFunctions.getElementCountByXPath("(//span[contains(@id, 'PaxCombo')]//parent::div//button)[1]");
		
		if (count <= 2) {
			CommonFunctions.elementContainsText(PaxType_ImportFromPrice, "All Selected");
		}
		else {
			CommonFunctions.elementContainsText(PaxType_ImportFromPrice, "Adult");
			
		}
	}
	
	public void clickContractPricePopupCostRadioBtn() throws Exception {
		CommonFunctions.clickElement(radiobutton_ContractPricePopup_Cost);
		CommonFunctions.pause(2500, false);
	}
	
	public void DefaultPaxTypeDropdownValueForHotelImportFromCost() throws Exception {
		int count = CommonFunctions.getElementCountByXPath("//div[contains(@class, 'Popup')]//div[contains(@id, 'Body')]//div[contains(@id, 'Content1') and contains(@class, 'PH Tabs')]//span[contains(@id, 'PaxCombo')]//parent::div//button");
		
		if (count <= 2) {
			CommonFunctions.elementContainsText(dropdown_ContractPricePopup_ImportDatesSection_PaxType, "All Selected");
		}
		else {
			CommonFunctions.elementContainsText(dropdown_ContractPricePopup_ImportDatesSection_PaxType, "Adult");
		}
	}
	
	public void clickContractPricePopupEditCustomDatesTabLabel() throws Exception {
		CommonFunctions.clickElement(label_ContractPricePopup_EditCustomDatesTab);
		CommonFunctions.pause(2500, false);
	}
	
	public void DefaultPaxTypeDropdownValueForCoach() throws Exception {
		String[] options = dropdown_ContractPricePopup_AddCustomDatesSection_PaxType.getText().split("\n");
		int count = options.length;
		
		if (count <= 2) {
			CommonFunctions.elementContainsText(dropdown_ContractPricePopup_AddCustomDatesSection_PaxType, "All Selected");
		}
		else {
			CommonFunctions.elementContainsText(dropdown_ContractPricePopup_AddCustomDatesSection_PaxType, "Adult");
		}
	}
	
	public void ClickAddToTableButton() throws Exception {
		CommonFunctions.clickElement(button_AddtoTable);
	}
	
	public void DisplayediIcon() throws Exception {
		CommonFunctions.elementDisplayed(i_icon_below_dates);
	}
	
	public void ClickiIcon() throws Exception {
		CommonFunctions.clickElement(i_icon_below_dates);
		CommonFunctions.pause(3000, false);
	}
	// End - Contract Prices Popup Actions
	
	// Start - View Contract Price Popup Objects
	public void clickViewContractPricePopupCloseButton() throws Exception {
		CommonFunctions.clickElement(button_ViewContractPricePopup_Close);
		CommonFunctions.pause(2500, false);
	}
	
	public void displayedViewContractPricePopupCategory1Label() throws Exception {
		CommonFunctions.elementDisplayed(label_ViewContractPricePopup_Category1);
	}
	
	public void displayedViewContractPricePopupCategory2Label() throws Exception {
		CommonFunctions.elementDisplayed(label_ViewContractPricePopup_Category2);
	}
	
	public void displayedViewContractPricePopupCloseButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ViewContractPricePopup_Close);
	}
	
	public void displayedViewContractPricePopupContractPricesTable() throws Exception {
		CommonFunctions.elementDisplayed(table_ViewContractPricePopup_ContractPrices);
	}
	
	public void displayedViewContractPricePopupContractPricesTableCurrencyFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ViewContractPricePopup_ContractPricesTable_CurrencyFilter);
	}
	
	public void displayedViewContractPricePopupContractPricesTableEndDateFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ViewContractPricePopup_ContractPricesTable_EndDateFilter);
	}
	
	public void displayedViewContractPricePopupContractPricesTablePaxTypeFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ViewContractPricePopup_ContractPricesTable_PaxTypeFilter);
	}
	
	public void displayedViewContractPricePopupContractPricesTableStartDateFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ViewContractPricePopup_ContractPricesTable_StartDateFilter);
	}
	
	public void displayedViewContractPricePopupContractPricesTableTopCurrencyLabelRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_ViewContractPricePopup_ContractPricesTable_TopCurrencyLabel);
	}
	
	public void displayedViewContractPricePopupContractPricesTableTopEndDateLabelRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_ViewContractPricePopup_ContractPricesTable_TopEndDateLabel);
	}
	
	public void displayedViewContractPricePopupContractPricesTableTopMaximumCommissionLabelRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_ViewContractPricePopup_ContractPricesTable_TopMaximumCommissionLabel);
	}
	
	public void displayedViewContractPricePopupContractPricesTableTopMinimumCommissionLabelRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_ViewContractPricePopup_ContractPricesTable_TopMinimumCommissionLabel);
	}
	
	public void displayedViewContractPricePopupContractPricesTableTopNonCommissionLabelRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_ViewContractPricePopup_ContractPricesTable_TopNonCommissionLabel);
	}
	
	public void displayedViewContractPricePopupContractPricesTableTopPaxTypeLabelRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_ViewContractPricePopup_ContractPricesTable_TopPaxTypeLabel);
	}
	
	public void displayedViewContractPricePopupContractPricesTableTopPriceLabelRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_ViewContractPricePopup_ContractPricesTable_TopPriceLabel);
	}
	
	public void displayedViewContractPricePopupContractPricesTableTopStartDateLabelRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_ViewContractPricePopup_ContractPricesTable_TopStartDateLabel);
	}
	
	public void displayedViewContractPricePopupDayRangeLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_ViewContractPricePopup_DayRange);
	}
	
	public void displayedViewContractPricePopupGuestConfigurationLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_ViewContractPricePopup_GuestConfiguration);
	}
	
	public void disabledAddIterinaryTemplateButton() throws Exception {
		
		CommonFunctions.elementAttributeContains(button_ItirenaryTemplatesSection_AddItirenaryTemplate, "disabled", "true");
	}
	
	public void disabledAddRuleButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_PaymentRulesSection_AddCancellationRule, "disabled", "true");
	}
	
	public void HiddenEditIterinaryTemplateButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ItirenaryTemplatesSection_TopEditItineraryTemplate.findElement(By.xpath(".//parent::div")), "style", "display: none;");
	}
	
	public void HiddenDeleteIterinaryTemplateButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ItirenaryTemplatesSection_TopDeleteItineraryTemplate.findElement(By.xpath(".//parent::div")), "style", "display: none;");
		
	}
	
	public void HiddenEditPaymentRuleButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_PaymentRulesSection_TopEditCancellationRule.findElement(By.xpath(".//parent::div")), "style", "display: none;");
	}
	
	public void HiddenDeletePaymentRuleButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_PaymentRulesSection_TopDeleteCancellationRule.findElement(By.xpath(".//parent::div")), "style", "display: none;");
	}
	// End - View Contract Price Popup Objects
	// End - Actions
}