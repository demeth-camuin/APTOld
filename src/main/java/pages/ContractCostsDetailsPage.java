package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ContractCostsDetailsPage extends Base {
	// Start - Page Objects
	// Start - Main Page Objects
	@FindBy(xpath = "//a[contains(@id, 'EditConfigurationButton')]")
	WebElement button_ConfigurationDetailsSection_EditConfiguration;
	
	@FindBy(xpath = "//a[contains(@id, 'link_ErrorPopupCost')]")
	WebElement button_ConfigurationDetailsSection_ExistingConfigurationDetails;
	
	@FindBy(xpath = "//span[text() = 'View']//parent::a")
	WebElement button_ConfigurationDetailsSection_View;
	
	@FindBy(xpath = "//a[@class = 'CancelRowAction']")
	WebElement button_CostsSection_Cancel;
	
	@FindBy(xpath = "//a[@class = 'SaveRowAction']")
	WebElement button_CostsSection_Save;
	
	@FindBy(xpath = "//span[contains(text(), 'Add Cost')]//parent::a")
	WebElement button_CostsSection_AddCost;
	
	@FindBy(xpath = "//span[contains(text(), 'Add Date Range')]//parent::a")
	WebElement button_DateRangesSection_AddDateRange;
	
	@FindBy(xpath = "//a[@class = 'CancelRowAction']")
	WebElement button_DateRangesSection_Cancel;
	
	@FindBy(xpath = "//a[@class = 'SaveRowAction']")
	WebElement button_DateRangesSection_Save;
	
	@FindBy(xpath = "//input[@value = 'Add']")
	WebElement button_SeasonGroupsSection_Add;
	
	@FindBy(xpath = "//input[@value = 'Import']")
	WebElement button_SeasonGroupsSection_Import;
	
	@FindBy(xpath = "(//input[@value = 'Cancel'])[1]")
	WebElement button_TopCancel;
	
	@FindBy(xpath = "(//input[@value = 'Close'])[1]")
	WebElement button_TopClose;
	
	@FindBy(xpath = "(//input[@value = 'Save Costs'])[1]")
	WebElement button_TopSaveCosts;
	
	@FindBy(xpath = "//label[text() = 'Category 1']//parent::div//button")
	WebElement dropdown_ConfigurationDetailsSection_Category1;
	
	@FindBy(xpath = "//label[text() = 'Category 2']//parent::div//button")
	WebElement dropdown_ConfigurationDetailsSection_Category2;
	
	@FindBy(xpath = "//label[text() = 'Guest Configuration']//parent::div//button")
	WebElement dropdown_ConfigurationDetailsSection_GuestConfiguration;
	
	@FindBy(xpath = "//label[text() = 'Guest Configuration']//parent::div//select")
	WebElement dropdown_ConfigurationDetailsSection_GuestConfigurationSingleSelect;
	
	@FindBy(xpath = "//label[text() = 'Maximum Child Age']//parent::div//input")
	WebElement input_ConfigurationDetailsSection_MaximumChildAge;
	
	@FindBy(xpath = "//label[text() = 'Maximum Days']//parent::div//input")
	WebElement input_ConfigurationDetailsSection_MaximumDays;
	
	@FindBy(xpath = "//label[text() = 'Maximum Nights']//parent::div//input")
	WebElement input_ConfigurationDetailsSection_MaximumNights;
	
	@FindBy(xpath = "//label[text() = 'Maximum Pax']//parent::div//input")
	WebElement input_ConfigurationDetailsSection_MaximumPax;
	
	@FindBy(xpath = "//label[text() = 'Minimum Days']//parent::div//input")
	WebElement input_ConfigurationDetailsSection_MinimumDays;
	
	@FindBy(xpath = "//label[text() = 'Minimum Nights']//parent::div//input")
	WebElement input_ConfigurationDetailsSection_MinimumNights;
	
	@FindBy(xpath = "//label[text() = 'Minimum Pax']//parent::div//input")
	WebElement input_ConfigurationDetailsSection_MinimumPax;
	
	@FindBy(xpath = "((//table[contains(@id, 'CostsLists')]//tbody//tr)[1]//td)[6]//input")
	WebElement rowData_CostsSection_TopCostInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'CostsLists')]//tbody//tr)[1]//td)[2]//select")
	WebElement rowData_CostsSection_TopCostTypeDropdown;
	
	@FindBy(xpath = "((//table[contains(@id, 'CostsLists')]//tbody//tr)[1]//td)[1]//a")
	WebElement rowData_CostsSection_TopDeleteCostButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'CostsLists')]//tbody//tr)[1]//td)[3]//select")
	WebElement rowData_CostsSection_TopEstimatedActualDropdown;
	
	@FindBy(xpath = "((//table[contains(@id, 'CostsLists')]//tbody//tr)[1]//td)[8]//input")
	WebElement rowData_CostsSection_TopGSTInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'CostsLists')]//tbody//tr)[1]//td)[9]//input")
	WebElement rowData_CostsSection_TopNumberOfDaysInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'CostsLists')]//tbody//tr)[1]//td)[4]//input")
	WebElement rowData_CostsSection_TopQuantityInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'CostsLists')]//tbody//tr)[1]//td)[5]//select")
	WebElement rowData_CostsSection_TopRateTypeDropdown;
	
	@FindBy(xpath = "((//table[contains(@id, 'CostsLists')]//tbody//tr)[1]//td)[7]//input")
	WebElement rowData_CostsSection_TopTaxInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'DateRangesLists')]//tbody//tr)[1]//td)[4]//input[contains(@id, 'AllotmentCodeInput')]")
	WebElement rowData_DateRangesSection_TopAllotmentCodeInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'DateRangesLists')]//tbody//tr)[1]//td)[1]//a")
	WebElement rowData_DateRangesSection_TopDeleteDateRangeButton;
	
	@FindBy(xpath = "((//table[contains(@id, 'DateRangesLists')]//tbody//tr)[1]//td)[3]//input")
	WebElement rowData_DateRangesSection_TopEndDateInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'DateRangesLists')]//tbody//tr)[1]//td)[7]//textarea")
	WebElement rowData_DateRangesSection_TopInvoiceCommentsInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'DateRangesLists')]//tbody//tr)[1]//td)[9]//input")
	WebElement rowData_DateRangesSection_TopPrintVoucherInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'DateRangesLists')]//tbody//tr)[1]//td)[6]//input")
	WebElement rowData_DateRangesSection_TopShareAllowedInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'DateRangesLists')]//tbody//tr)[1]//td)[2]//input")
	WebElement rowData_DateRangesSection_TopStartDateInput;
	
	@FindBy(xpath = "((//table[contains(@id, 'DateRangesLists')]//tbody//tr)[1]//td)[8]//textarea")
	WebElement rowData_DateRangesSection_TopVoucherCommentsInput;
	
	@FindBy(xpath = "(//span[@class = 'ListRecords TableSeasons']//span[contains(@class, 'trash')])[1]")
	WebElement rowData_SeasonGroupsSection_TopDeleteSeasonGroupButton;
	
	@FindBy(xpath = "(//span[@class = 'ListRecords TableSeasons']//a)[1]")
	WebElement rowData_SeasonGroupsSection_TopSeasonGroupLink;
	
	@FindBy(xpath = "//table[contains(@id, 'CostsLists')]")
	WebElement table_CostsSection_Costs;
	
	@FindBy(xpath = "//table[contains(@id, 'DateRangesLists')]")
	WebElement table_DateRangesSection_DateRanges;
	// End - Main Page Objects
	
	// Start - Add Cost Popup Objects
	@FindBy(xpath = "//div[contains(@id, 'Popup')]//input[@value = 'Add']")
	WebElement button_AddCostPopup_Add;
	
	@FindBy(xpath = "//div[contains(@id, 'Popup')]//input[@value = 'Cancel']")
	WebElement button_AddCostPopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@id, 'CloseLink')]")
	WebElement button_AddCostPopup_Close;
	
	@FindBy(xpath = "//label[text() = 'Cost Type']//parent::div//select")
	WebElement dropdown_AddCostPopup_CostType;
	
	@FindBy(xpath = "//label[text() = 'Estimated/Actual']//parent::div//select")
	WebElement dropdown_AddCostPopup_EstimatedActual;
	
	@FindBy(xpath = "//label[text() = 'Cost']//parent::div//input")
	WebElement input_AddCostPopup_Cost;
	
	@FindBy(xpath = "//label[text() = 'GST']//parent::div//input")
	WebElement input_AddCostPopup_GST;
	
	@FindBy(xpath = "//label[text() = 'Number of Days']//parent::div//input")
	WebElement input_AddCostPopup_NumberOfDays;
	
	@FindBy(xpath = "//label[text() = 'Quantity']//parent::div//input")
	WebElement input_AddCostPopup_Quantity;
	
	@FindBy(xpath = "//label[text() = 'Tax']//parent::div//input")
	WebElement input_AddCostPopup_Tax;
	
	@FindBy(xpath = "//div[contains(text(), 'Per Day')]//parent::div//input")
	WebElement radioButton_AddCostPopup_PerDay;
	
	@FindBy(xpath = "//div[contains(text(), 'Per Duration')]//parent::div//input")
	WebElement radioButton_AddCostPopup_PerDuration;
	// End - Add Cost Popup Objects
	
	// Start - Add Date Range Popup Objects
	@FindBy(xpath = "//div[contains(@class, 'Popup')]//input[@value = 'Add']")
	WebElement button_AddDateRangePopup_Add;
	
	@FindBy(xpath = "//div[contains(@class, 'Popup')]//input[@value = 'Add to Table']")
	WebElement button_AddDateRangePopup_AddToTable;
	
	@FindBy(xpath = "//div[contains(@class, 'Popup')]//input[@value = 'Cancel']")
	WebElement button_AddDateRangePopup_Cancel;
	
	@FindBy(xpath = "//a[contains(@class, 'CloseLink')]")
	WebElement button_AddDateRangePopup_Close;
	
	@FindBy(xpath = "//label[text() = 'Print Voucher']//parent::div//parent::div//input")
	WebElement checkbox_AddDateRangePopup_PrintVoucher;
	
	@FindBy(xpath = "//label[text() = 'Share Allowed']//parent::div//parent::div//input")
	WebElement checkbox_AddDateRangePopup_ShareAllowed;
	
	@FindBy(xpath = "//label[text() = 'Days']//parent::div//button")
	WebElement dropdown_AddDateRangePopup_Days;
	
	@FindBy(xpath = "(//label[text() = 'Allotment Code']//parent::div//div[contains(@id, 'Suggestions')]//div[@class = 'FullRow'])[3]//div[@class = 'Cell2']")
	WebElement label_AddDateRangePopup_AllotmentCodeDropdown_TopSearchResultAllotmentCode;
	
	@FindBy(xpath = "(//label[text() = 'Allotment Code']//parent::div//div[contains(@id, 'Suggestions')]//div[@class = 'FullRow'])[3]//div[contains(@class, 'MarginGutter')]")
	WebElement label_AddDateRangePopup_AllotmentCodeDropdown_TopSearchResultInventoryPool;
	
	@FindBy(xpath = "//label[text() = 'Allotment Code']//parent::div//input[contains(@id, 'AllotmentCodeInput')]")
	WebElement input_AddDateRangePopup_AllotmentCode;
	
	@FindBy(xpath = "//label[text() = 'Allotment Code']//parent::div//div[contains(@id, 'Suggestions')]//div[text() = 'Allotment Code']//following-sibling::div//input")
	WebElement input_AddDateRangePopup_AllotmentCodeDropdown_AllotmentCodeFilter;
	
	@FindBy(xpath = "//label[text() = 'Allotment Code']//parent::div//div[contains(@id, 'Suggestions')]//div[text() = 'Inventory Pool']//following-sibling::div//input")
	WebElement input_AddDateRangePopup_AllotmentCodeDropdown_InventoryPoolFilter;
	
	@FindBy(xpath = "//label[text() = 'End Date']//parent::div//input")
	WebElement input_AddDateRangePopup_EndDate;
	
	@FindBy(xpath = "//label[text() = 'Start Date']//parent::div//input")
	WebElement input_AddDateRangePopup_StartDate;
	
	@FindBy(xpath = "(//label[text() = 'Allotment Code']//parent::div//div[contains(@id, 'Suggestions')]//div[@class = 'FullRow'])[3]//div[@class = 'Cell1']")
	WebElement radioButton_AddDateRangePopup_AllotmentCodeDropdown_TopSearchResult;
	
	@FindBy(xpath = "//label[text() = 'Invoice Comments']//parent::div//textarea")
	WebElement textArea_AddDateRangePopup_InvoiceComments;
	
	@FindBy(xpath = "//label[text() = 'Voucher Comments']//parent::div//textarea")
	WebElement textArea_AddDateRangePopup_VoucherComments;
	// End - Add Date Range Popup Objects
	
	// Start - Edit Invoice Comment Popup Objects
	@FindBy(xpath = "//form[contains(@action, 'Comment')]//input[@value = 'Cancel']")
	WebElement button_EditInvoiceCommentPopup_Cancel;
	
	@FindBy(xpath = "//form[contains(@action, 'Comment')]//input[@value = 'Done']")
	WebElement button_EditInvoiceCommentPopup_Done;
	
	@FindBy(xpath = "//*[text() = 'Edit Invoice Comment']//following-sibling::div//textarea")
	WebElement textArea_EditInvoiceCommentPopup_InvoiceComments;
	// End - Edit Invoice Comment Popup Objects
	
	// Start - Edit Voucher Comment Popup Objects
	@FindBy(xpath = "//form[contains(@action, 'Comment')]//input[@value = 'Cancel']")
	WebElement button_EditVoucherCommentPopup_Cancel;
	
	@FindBy(xpath = "//form[contains(@action, 'Comment')]//input[@value = 'Done']")
	WebElement button_EditVoucherCommentPopup_Done;
	
	@FindBy(xpath = "//*[text() = 'Edit Voucher Comment']//following-sibling::div//textarea")
	WebElement textArea_EditVoucherCommentPopup_VoucherComments;
	// End - Edit Voucher Comment Popup Objects
	
	// Start - Edit Configuration Details Popup Objects
	@FindBy(xpath = "//form[contains(@action, 'ConfigurationDetails')]//input[@value = 'Close']")
	WebElement button_EditConfigurationDetailsPopup_Close;
	
	@FindBy(xpath = "//form[contains(@action, 'ConfigurationDetails')]//input[@value = 'Update']")
	WebElement button_EditConfigurationDetailsPopup_Update;
	
	@FindBy(xpath = "//label[text() = 'Category 1']//parent::div//a[contains(@class, 'choice')]")
	WebElement dropdown_EditConfigurationDetailsPopup_Category1;
	
	@FindBy(xpath = "//label[text() = 'Category 2']//parent::div//a[contains(@class, 'choice')]")
	WebElement dropdown_EditConfigurationDetailsPopup_Category2;
	
	@FindBy(xpath = "//label[text() = 'Guest Configuration']//parent::div//a[contains(@class, 'choice')]")
	WebElement dropdown_EditConfigurationDetailsPopup_GuestConfiguration;
	
	@FindBy(xpath = "//label[text() = 'Maximum Child Age']//parent::div//input")
	WebElement input_EditConfigurationDetailsPopup_MaximumChildAge;
	
	@FindBy(xpath = "//label[text() = 'Maximum Nights']//parent::div//input")
	WebElement input_EditConfigurationDetailsPopup_MaximumNights;
	
	@FindBy(xpath = "//label[text() = 'Minimum Nights']//parent::div//input")
	WebElement input_EditConfigurationDetailsPopup_MinimumNights;
	// End - Edit Configuration Details Popup Objects
	
	// Start - Allotment Code Popup Objects
	@FindBy(xpath = "//form[contains(@action, 'Allotment')]//input[@value = 'Cancel']")
	WebElement button_AllotmentCodePopup_Cancel;
	
	@FindBy(xpath = "//form[contains(@action, 'Allotment')]//input[@value = 'Done']")
	WebElement button_AllotmentCodePopup_Done;
	
	@FindBy(xpath = "//form[contains(@action, 'Allotment')]//input[contains(@id, 'SelectAllotmentCodeInput')]")
	WebElement input_AllotmentCodePopup_AllotmentCode;
	
	@FindBy(xpath = "//form[contains(@action, 'Allotment')]//div[@class = 'AllotmentSearchContainer']//input[contains(@id, 'AllotmentCodeInput')]")
	WebElement input_AllotmentCodePopup_AllotmentCodeFilter;
	
	@FindBy(xpath = "//form[contains(@action, 'Allotment')]//div[@class = 'AllotmentSearchContainer']//input[contains(@id, 'InventoryPoolInput')]")
	WebElement input_AllotmentCodePopup_InventoryPoolFilter;
	
	@FindBy(xpath = "((//form[contains(@action, 'Allotment')]//span[@class = 'ListRecords']//div[@class = 'FullRow'])[1]//div[@class = 'OSInline'])[1]//div[@class = 'Cell2']")
	WebElement rowData_AllotmentCodePopup_FirstAllotmentCode;
	
	@FindBy(xpath = "((//form[contains(@action, 'Allotment')]//span[@class = 'ListRecords']//div[@class = 'FullRow'])[1]//div[@class = 'OSInline'])[2]//div[@class = 'Cell2']")
	WebElement rowData_AllotmentCodePopup_FirstInventoryPool;
	
	@FindBy(xpath = "((//form[contains(@action, 'Allotment')]//span[@class = 'ListRecords']//div[@class = 'FullRow'])[1]//div)[1]//input")
	WebElement rowData_AllotmentCodePopup_FirstRadioButton;
	
	@FindBy(xpath = "((//form[contains(@action, 'Allotment')]//span[@class = 'ListRecords']//div[@class = 'FullRow'])[2]//div[@class = 'OSInline'])[1]//div[@class = 'Cell2']")
	WebElement rowData_AllotmentCodePopup_SecondAllotmentCode;
	
	@FindBy(xpath = "((//form[contains(@action, 'Allotment')]//span[@class = 'ListRecords']//div[@class = 'FullRow'])[2]//div[@class = 'OSInline'])[2]//div[@class = 'Cell2']")
	WebElement rowData_AllotmentCodePopup_SecondInventoryPool;
	
	@FindBy(xpath = "((//form[contains(@action, 'Allotment')]//span[@class = 'ListRecords']//div[@class = 'FullRow'])[2]//div)[1]//input")
	WebElement rowData_AllotmentCodePopup_SecondRadioButton;
	
	@FindBy(xpath = "((//form[contains(@action, 'Allotment')]//span[@class = 'ListRecords']//div[@class = 'FullRow'])[3]//div[@class = 'OSInline'])[1]//div[@class = 'Cell2']")
	WebElement rowData_AllotmentCodePopup_ThirdAllotmentCode;
	
	@FindBy(xpath = "((//form[contains(@action, 'Allotment')]//span[@class = 'ListRecords']//div[@class = 'FullRow'])[3]//div[@class = 'OSInline'])[2]//div[@class = 'Cell2']")
	WebElement rowData_AllotmentCodePopup_ThirdInventoryPool;
	
	@FindBy(xpath = "((//form[contains(@action, 'Allotment')]//span[@class = 'ListRecords']//div[@class = 'FullRow'])[3]//div)[1]//input")
	WebElement rowData_AllotmentCodePopup_ThirdRadioButton;
	// End - Allotment Code Popup Objects
	
	// Start - Import Seasons Popup Objects
	@FindBy(xpath = "//form[contains(@action, 'ImportSeason')]//input[@value = 'Cancel']")
	WebElement button_ImportSeasonsPopup_Cancel;
	
	@FindBy(xpath = "//form[contains(@action, 'ImportSeason')]//input[@value = 'Import']")
	WebElement button_ImportSeasonsPopup_Done;
	
	@FindBy(xpath = "//label[text() = 'Include past dates']//parent::div//input")
	WebElement checkbox_ImportSeasonsPopup_IncludePastDates;
	
	@FindBy(xpath = "//label[text() = 'Import from:']//parent::div//input[contains(@id, 'ImportFrom')]")
	WebElement dropdown_ImportSeasonsPopup_ImportFrom;
	
	@FindBy(xpath = "//label[text() = 'Season']//parent::div//button")
	WebElement dropdown_ImportSeasonsPopup_Season;
	
	@FindBy(xpath = "//div[contains(@class, 'GuestConfigParentContainer')]//label[text() = 'Category 1']//following-sibling::input")
	WebElement input_ImportSeasonsPopup_ImportFromDropdown_Category1Filter;
	
	@FindBy(xpath = "//div[contains(@class, 'GuestConfigParentContainer')]//label[text() = 'Category 2']//following-sibling::input")
	WebElement input_ImportSeasonsPopup_ImportFromDropdown_Category2Filter;
	
	@FindBy(xpath = "//div[contains(@class, 'GuestConfigParentContainer')]//label[text() = 'Guest Configuration']//following-sibling::input")
	WebElement input_ImportSeasonsPopup_ImportFromDropdown_GuestConfigurationFilter;
	
	@FindBy(xpath = "(//div[contains(@class, 'GuestConfigParentContainer')]//div[contains(@id, 'GuestConfigContainer')]//table//tbody//tr)[1]//td//input")
	WebElement radioButton_ImportSeasonsPopup_ImportFromDropdown_TopImportFrom;
	// End - Import Seasons Popup Objects
	
	// Start - Existing Configuration Details Popup Objects
	@FindBy(xpath = "//a[contains(@class,  'close')]")
	WebElement button_ExistingConfigurationDetailsPopup_Close;
	
	@FindBy(xpath = "//input[@value = 'Remove All']")
	WebElement button_ExistingConfigurationDetailsPopup_RemoveAll;
	
	@FindBy(xpath = "((//form[@action = 'ErrorPopupCost.aspx']//table//tbody//tr)[1]//td)[2]//span")
	WebElement rowData_ExistingConfigurationDetailsPopup_TopCategory1;
	
	@FindBy(xpath = "((//form[@action = 'ErrorPopupCost.aspx']//table//tbody//tr)[1]//td)[3]//span")
	WebElement rowData_ExistingConfigurationDetailsPopup_TopCategory2;
	
	@FindBy(xpath = "((//form[@action = 'ErrorPopupCost.aspx']//table//tbody//tr)[1]//td)[1]//span")
	WebElement rowData_ExistingConfigurationDetailsPopup_TopGuestConfiguration;
	
	@FindBy(xpath = "((//form[@action = 'ErrorPopupCost.aspx']//table//tbody//tr)[1]//td)[5]//span")
	WebElement rowData_ExistingConfigurationDetailsPopup_TopMaxPax;
	
	@FindBy(xpath = "((//form[@action = 'ErrorPopupCost.aspx']//table//tbody//tr)[1]//td)[4]//span")
	WebElement rowData_ExistingConfigurationDetailsPopup_TopMinPax;
	// End - Existing Configuration Details Popup Objects
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public ContractCostsDetailsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	// Start - Main Page Actions
	public void checkConfigurationDetailsSectionGuestConfigurationDropdownOptions(String[] expectedOptions) throws Exception {
		CommonFunctions.checkDropdownOptionsAvailable(dropdown_ConfigurationDetailsSection_GuestConfiguration.findElement(By.xpath(".//parent::div//parent::div//select")), expectedOptions);
	}
	
	public void clickAddCostButton() throws Exception {
		CommonFunctions.clickElement(button_CostsSection_AddCost);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//*[text() = 'Cost Type']");
	}
	
	public void clickConfigurationDetailsSectionCategory1DropdownOption(String dropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_Category1);
		CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_Category2);
		CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_Category1);
		
		if (dropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_Category1.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_ConfigurationDetailsSection_Category1.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), dropdownOptionValue);
			CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_Category1.findElement(By.xpath(".//parent::div//ul//span[text() = '" + dropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickConfigurationDetailsSectionCategory2DropdownOption(String dropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_Category2);
		
		if (dropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_Category2.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_ConfigurationDetailsSection_Category2.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), dropdownOptionValue);
			CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_Category2.findElement(By.xpath(".//parent::div//ul//span[text() = '" + dropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickConfigurationDetailsSectionEditConfigurationButton() throws Exception {
		CommonFunctions.clickElement(button_ConfigurationDetailsSection_EditConfiguration);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'ConfigurationDetails')]//label[contains(@id, 'GuestConfiguration')]");
	}
	
	public void clickConfigurationDetailsSectionExistingConfigurationDetailsButton() throws Exception {
		CommonFunctions.clickElement(button_ConfigurationDetailsSection_ExistingConfigurationDetails);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickConfigurationDetailsSectionGuestConfigurationDropdownOption(String dropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_GuestConfiguration);
		CommonFunctions.clickElement(input_ConfigurationDetailsSection_MaximumChildAge);
		CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_GuestConfiguration);
		
		if (dropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_GuestConfiguration.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_ConfigurationDetailsSection_GuestConfiguration.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), dropdownOptionValue);
			CommonFunctions.clickElement(dropdown_ConfigurationDetailsSection_GuestConfiguration.findElement(By.xpath(".//parent::div//ul//span[text() = '" + dropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickConfigurationDetailsSectionViewButton() throws Exception {
		CommonFunctions.clickElement(button_ConfigurationDetailsSection_View);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'CostConfigurationView')]//*[text() = 'Guest Configuration']");
	}
	
	public void clickCostsSectionSaveButton() throws Exception {
		CommonFunctions.clickElement(button_CostsSection_Save);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickCostsSectionTopDeleteCostButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_CostsSection_TopDeleteCostButton);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickDateRangesSectionAddDateRangeButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangesSection_AddDateRange);
		CommonFunctions.pause(10000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Popup')]//*[text() = 'Selected Date Range(s)']");
	}
	
	public void clickDateRangesSectionSaveButton() throws Exception {
		CommonFunctions.clickElement(button_DateRangesSection_Save);
		CommonFunctions.pause(15000, false);
	}
	
	public void clickDateRangesSectionTopAllotmentCodeInputRowData() throws Exception {
		CommonFunctions.clickElement(rowData_DateRangesSection_TopAllotmentCodeInput);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Allotment')]//input[contains(@id, 'SelectAllotmentCodeInput')]");
	}
	
	public void clickDateRangesSectionTopDeleteDateRangeButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_DateRangesSection_TopDeleteDateRangeButton);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickDateRangesSectionTopInvoiceCommentsInputRowData() throws Exception {
		CommonFunctions.clickElement(rowData_DateRangesSection_TopInvoiceCommentsInput);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Comment')]//input[@value = 'Done']");
	}
	
	public void clickDateRangesSectionTopVoucherCommentsInputRowData() throws Exception {
		CommonFunctions.clickElement(rowData_DateRangesSection_TopVoucherCommentsInput);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'Comment')]//input[@value = 'Done']");
	}
	
	public void clickSeasonGroupsSectionAddButton() throws Exception {
		CommonFunctions.clickElement(button_SeasonGroupsSection_Add);
		CommonFunctions.pause(7500, false);
	}
	
	public void clickSeasonGroupsSectionImportButton() throws Exception {
		CommonFunctions.clickElement(button_SeasonGroupsSection_Import);
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//form[contains(@action, 'ImportSeason')]//input[@value = 'Import']");
	}
	
	public void clickSeasonGroupsSectionTopDeleteSeasonGroupButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_SeasonGroupsSection_TopDeleteSeasonGroupButton);
		CommonFunctions.pause(7500, false);
	}
	
	public void clickSeasonGroupsSectionTopSeasonGroupLinkRowData() throws Exception {
		CommonFunctions.clickElement(rowData_SeasonGroupsSection_TopSeasonGroupLink);
		CommonFunctions.pause(7500, false);
	}
	
	public void containsValueConfigurationDetailsSectionCategory1Dropdown(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ConfigurationDetailsSection_Category1.findElement(By.xpath(".//span")), expectedValue);
	}
	
	public void containsValueConfigurationDetailsSectionCategory2Dropdown(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ConfigurationDetailsSection_Category2.findElement(By.xpath(".//span")), expectedValue);
	}
	
	public void containsValueConfigurationDetailsSectionGuestConfigurationDropdown(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ConfigurationDetailsSection_GuestConfiguration.findElement(By.xpath(".//span")), expectedValue);
	}
	
	public void containsValueConfigurationDetailsSectionGuestConfigurationSingleSelectDropdown(String expectedValue) throws Exception {
		CommonFunctions.checkSingleSelectDropdownSelectedOption(dropdown_ConfigurationDetailsSection_GuestConfigurationSingleSelect, expectedValue);
	}
	
	public void containsValueConfigurationDetailsSectionMaximumChildAgeInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ConfigurationDetailsSection_MaximumChildAge, "value", expectedValue);
	}
	
	public void containsValueConfigurationDetailsSectionMaximumDaysInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ConfigurationDetailsSection_MaximumDays, "value", expectedValue);
	}
	
	public void containsValueConfigurationDetailsSectionMaximumNightsInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ConfigurationDetailsSection_MaximumNights, "value", expectedValue);
	}
	
	public void containsValueConfigurationDetailsSectionMaximumPaxInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ConfigurationDetailsSection_MaximumPax, "value", expectedValue);
	}
	
	public void containsValueConfigurationDetailsSectionMinimumDaysInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ConfigurationDetailsSection_MinimumDays, "value", expectedValue);
	}
	
	public void containsValueConfigurationDetailsSectionMinimumNightsInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ConfigurationDetailsSection_MinimumNights, "value", expectedValue);
	}
	
	public void containsValueConfigurationDetailsSectionMinimumPaxInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_ConfigurationDetailsSection_MinimumPax, "value", expectedValue);
	}
	
	public void containsValueCostsSectionTopCostInputRowData(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_CostsSection_TopCostInput, "value", expectedValue);
	}
	
	public void containsValueCostsSectionTopCostTypeDropdownRowData(String expectedValue) throws Exception {
		CommonFunctions.checkSingleSelectDropdownSelectedOption(rowData_CostsSection_TopCostTypeDropdown, expectedValue);
	}
	
	public void containsValueCostsSectionTopEstimatedActualDropdownRowData(String expectedValue) throws Exception {
		CommonFunctions.checkSingleSelectDropdownSelectedOption(rowData_CostsSection_TopEstimatedActualDropdown, expectedValue);
	}
	
	public void containsValueCostsSectionTopGSTInputRowData(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_CostsSection_TopGSTInput, "value", expectedValue);
	}
	
	public void containsValueCostsSectionTopNumberOfDaysInputRowData(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_CostsSection_TopNumberOfDaysInput, "value", expectedValue);
	}
	
	public void containsValueCostsSectionTopQuantityInputRowData(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_CostsSection_TopQuantityInput, "value", expectedValue);
	}
	
	public void containsValueCostsSectionTopRateTypeDropdownRowData(String expectedValue) throws Exception {
		CommonFunctions.checkSingleSelectDropdownSelectedOption(rowData_CostsSection_TopRateTypeDropdown, expectedValue);
	}
	
	public void containsValueCostsSectionTopTaxInputRowData(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_CostsSection_TopTaxInput, "value", expectedValue);
	}
	
	public void containsValueDateRangesSectionTopAllotmentCodeInputRowData(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_DateRangesSection_TopAllotmentCodeInput, "value", expectedValue);
	}
	
	public void containsValueDateRangesSectionTopInvoiceCommentsInputRowData(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_DateRangesSection_TopInvoiceCommentsInput, "value", expectedValue);
	}
	
	public void containsValueDateRangesSectionTopStartDateInputRowData(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_DateRangesSection_TopStartDateInput, "value", expectedValue);
	}
	
	public void containsValueDateRangesSectionTopVoucherCommentsInputRowData(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(rowData_DateRangesSection_TopVoucherCommentsInput, "value", expectedValue);
	}
	
	public void disabledConfigurationDetailsSectionCategory1Dropdown() throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_ConfigurationDetailsSection_Category1, "class", "disabled");
	}
	
	public void disabledCostsSectionTopCostTypeDropdownRowData() throws Exception {
		CommonFunctions.elementAttributeContains(rowData_CostsSection_TopCostTypeDropdown, "disabled", "true");
	}
	
	public void disabledCostsSectionTopNumberOfDaysInputRowData() throws Exception {
		CommonFunctions.elementAttributeContains(rowData_CostsSection_TopNumberOfDaysInput, "data-orig-readonly", "true");
	}
	
	public void disabledCostsSectionTopQuantityInputRowData() throws Exception {
		CommonFunctions.elementAttributeContains(rowData_CostsSection_TopQuantityInput, "readonly", "true");
	}
	
	public void displayedConfigurationDetailsSectionEditConfigurationButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ConfigurationDetailsSection_EditConfiguration);
	}
	
	public void displayedConfigurationDetailsSectionViewButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ConfigurationDetailsSection_View);
	}
	
	public void displayedCostsSectionCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_CostsSection_Cancel);
	}
	
	public void displayedCostsSectionSaveButton() throws Exception {
		CommonFunctions.elementDisplayed(button_CostsSection_Save);
	}
	
	public void displayedCostsSectionAddCostButton() throws Exception {
		CommonFunctions.elementDisplayed(button_CostsSection_AddCost);
	}
	
	public void displayedDateRangesSectionAddDateRangeButton() throws Exception {
		CommonFunctions.elementDisplayed(button_DateRangesSection_AddDateRange);
	}
	
	public void displayedSeasonGroupsSectionAddButton() throws Exception {
		CommonFunctions.elementDisplayed(button_SeasonGroupsSection_Add);
	}
	
	public void displayedSeasonGroupsSectionImportButton() throws Exception {
		CommonFunctions.elementDisplayed(button_SeasonGroupsSection_Import);
	}
	
	public void displayedTopCloseButton() throws Exception {
		CommonFunctions.elementDisplayed(button_TopClose);
	}
	
	public void displayedTopSaveCostsButton() throws Exception {
		CommonFunctions.elementDisplayed(button_TopSaveCosts);
	}
	
	public void displayedConfigurationDetailsSectionCategory1Dropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ConfigurationDetailsSection_Category1);
	}
	
	public void displayedConfigurationDetailsSectionCategory2Dropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ConfigurationDetailsSection_Category2);
	}
	
	public void displayedConfigurationDetailsSectionGuestConfigurationDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ConfigurationDetailsSection_GuestConfiguration);
	}
	
	public void displayedConfigurationDetailsSectionGuestConfigurationSingleSelectDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ConfigurationDetailsSection_GuestConfigurationSingleSelect);
	}
	
	public void displayedConfigurationDetailsSectionMaximumChildAgeInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ConfigurationDetailsSection_MaximumChildAge);
	}
	
	public void displayedConfigurationDetailsSectionMaximumDaysInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ConfigurationDetailsSection_MaximumDays);
	}
	
	public void displayedConfigurationDetailsSectionMaximumNightsInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ConfigurationDetailsSection_MaximumNights);
	}
	
	public void displayedConfigurationDetailsSectionMaximumPaxInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ConfigurationDetailsSection_MaximumPax);
	}
	
	public void displayedConfigurationDetailsSectionMinimumDaysInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ConfigurationDetailsSection_MinimumDays);
	}
	
	public void displayedConfigurationDetailsSectionMinimumNightsInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ConfigurationDetailsSection_MinimumNights);
	}
	
	public void displayedConfigurationDetailsSectionMinimumPaxInput() throws Exception {
		CommonFunctions.elementDisplayed(input_ConfigurationDetailsSection_MinimumPax);
	}
	
	public void displayedCostsSectionCostsTable() throws Exception {
		CommonFunctions.elementDisplayed(table_CostsSection_Costs);
	}
	
	public void displayedCostsSectionTopCostInputRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_CostsSection_TopCostInput);
	}
	
	public void displayedCostsSectionTopCostTypeDropdownRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_CostsSection_TopCostTypeDropdown);
	}
	
	public void displayedCostsSectionTopDeleteCostButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_CostsSection_TopDeleteCostButton);
	}
	
	public void displayedCostsSectionTopEstimatedActualDropdownRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_CostsSection_TopEstimatedActualDropdown);
	}
	
	public void displayedCostsSectionTopGSTInputRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_CostsSection_TopGSTInput);
	}
	
	public void displayedCostsSectionTopNumberOfDaysInputRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_CostsSection_TopNumberOfDaysInput);
	}
	
	public void displayedCostsSectionTopQuantityInputRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_CostsSection_TopQuantityInput);
	}
	
	public void displayedCostsSectionTopRateTypeDropdownRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_CostsSection_TopRateTypeDropdown);
	}
	
	public void displayedCostsSectionTopTaxInputRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_CostsSection_TopTaxInput);
	}
	
	public void displayedDateRangesSectionDateRangesTable() throws Exception {
		CommonFunctions.elementDisplayed(table_DateRangesSection_DateRanges);
	}
	
	public void displayedSeasonGroupsSectionTopDeleteSeasonGroupButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_SeasonGroupsSection_TopDeleteSeasonGroupButton);
	}
	
	public void displayedSeasonGroupsSectionTopSeasonGroupLinkRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_SeasonGroupsSection_TopSeasonGroupLink);
	}
	
	public void selectConfigurationDetailsSectionGuestConfigurationSingleSelectDropdown(String dropdownOptionValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_ConfigurationDetailsSection_GuestConfigurationSingleSelect, dropdownOptionValue);
		CommonFunctions.pause(2500, false);
	}
	
	public void setConfigurationDetailsSectionMaximumChildAgeInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ConfigurationDetailsSection_MaximumChildAge, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setConfigurationDetailsSectionMaximumDaysInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ConfigurationDetailsSection_MaximumDays, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setConfigurationDetailsSectionMaximumNightsInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ConfigurationDetailsSection_MaximumNights, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setConfigurationDetailsSectionMaximumPaxInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ConfigurationDetailsSection_MaximumPax, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setConfigurationDetailsSectionMinimumDaysInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ConfigurationDetailsSection_MinimumDays, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setConfigurationDetailsSectionMinimumNightsInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ConfigurationDetailsSection_MinimumNights, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setConfigurationDetailsSectionMinimumPaxInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ConfigurationDetailsSection_MinimumPax, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setCostsSectionTopCostInputRowData(String value) throws Exception {
		CommonFunctions.clickElement(rowData_CostsSection_TopCostInput);
		CommonFunctions.clearThenEnterElementValue(rowData_CostsSection_TopCostInput, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setCostsSectionTopGSTInputRowData(String value) throws Exception {
		CommonFunctions.clickElement(rowData_CostsSection_TopGSTInput);
		CommonFunctions.clearThenEnterElementValue(rowData_CostsSection_TopGSTInput, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setCostsSectionTopQuantityInputRowData(String value) throws Exception {
		CommonFunctions.clickElement(rowData_CostsSection_TopQuantityInput);
		CommonFunctions.clearThenEnterElementValue(rowData_CostsSection_TopQuantityInput, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setCostsSectionTopTaxInputRowData(String value) throws Exception {
		CommonFunctions.clickElement(rowData_CostsSection_TopTaxInput);
		CommonFunctions.clearThenEnterElementValue(rowData_CostsSection_TopTaxInput, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setDateRangesSectionTopAllotmentCodeInputRowData(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(rowData_DateRangesSection_TopAllotmentCodeInput, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setDateRangesSectionTopEndDateInputRowData(String value) throws Exception {
		CommonFunctions.clickElement(rowData_DateRangesSection_TopEndDateInput);
		CommonFunctions.pause(10000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.HOME));
		CommonFunctions.clickKeys(Keys.chord(Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE));
		CommonFunctions.clearThenEnterElementValue(rowData_DateRangesSection_TopEndDateInput, value);
		CommonFunctions.pause(10000, false);
	}
	
	public void setDateRangesSectionTopStartDateInputRowData(String value) throws Exception {
		CommonFunctions.clickElement(rowData_DateRangesSection_TopStartDateInput);
		CommonFunctions.pause(10000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.HOME));
		CommonFunctions.clickKeys(Keys.chord(Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE));
		CommonFunctions.clearThenEnterElementValue(rowData_DateRangesSection_TopStartDateInput, value);
		CommonFunctions.pause(10000, false);
	}
	
	public ContractDetailsPage clickTopCancelButton() throws Exception {
		CommonFunctions.clickElement(button_TopCancel);
		CommonFunctions.pause(10000, false);
		
		return new ContractDetailsPage();
	}
	
	public ContractDetailsPage clickTopCloseButton() throws Exception {
		CommonFunctions.clickElement(button_TopClose);
		CommonFunctions.pause(10000, false);
		
		return new ContractDetailsPage();
	}
	
	public ContractDetailsPage clickTopSaveButton() throws Exception {
		CommonFunctions.clickElement(button_TopSaveCosts);
		CommonFunctions.pause(10000, false);
		
		return new ContractDetailsPage();
	}
	// End - Main Page Actions
	
	// Start - Add Cost Popup Actions
	public void clickAddCostPopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_AddCostPopup_Add);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickAddCostPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_AddCostPopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickAddCostPopupPerDayRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_AddCostPopup_PerDay);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickAddCostPopupPerDurationRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_AddCostPopup_PerDuration);
		CommonFunctions.pause(2500, false);
	}
	
	public void checkAddCostPopupPerDayRadioButtonIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(radioButton_AddCostPopup_PerDay);
	}
	
	public void checkAddCostPopupPerDayRadioButtonIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(radioButton_AddCostPopup_PerDay);
	}
	
	public void checkAddCostPopupPerDurationRadioButtonIsNotToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsNotToggled(radioButton_AddCostPopup_PerDuration);
	}
	
	public void checkAddCostPopupPerDurationRadioButtonIsToggled() throws Exception {
		CommonFunctions.checkIfCheckboxIsToggled(radioButton_AddCostPopup_PerDuration);
	}
	
	public void containsValueAddCostPopupCostInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_AddCostPopup_Cost, "value", expectedValue);
	}
	
	public void containsValueAddCostPopupGSTInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_AddCostPopup_GST, "value", expectedValue);
	}
	
	public void containsValueAddCostPopupNumberOfDaysInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_AddCostPopup_NumberOfDays, "value", expectedValue);
	}
	
	public void containsValueAddCostPopupQuantityInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_AddCostPopup_Quantity, "value", expectedValue);
	}
	
	public void containsValueAddCostPopupTaxInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_AddCostPopup_Tax, "value", expectedValue);
	}
	
	public void disabledAddCostPopupNumberOfDaysInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_AddCostPopup_NumberOfDays, "readonly", "true");
	}
	
	public void disabledAddCostPopupQuantityInput() throws Exception {
		CommonFunctions.elementAttributeContains(input_AddCostPopup_Quantity, "readonly", "true");
	}
	
	public void displayedAddCostPopupAddButton() throws Exception {
		CommonFunctions.elementDisplayed(button_AddCostPopup_Add);
	}
	
	public void displayedAddCostPopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_AddCostPopup_Cancel);
	}
	
	public void displayedAddCostPopupCostInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddCostPopup_Cost);
	}
	
	public void displayedAddCostPopupCostTypeDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_AddCostPopup_CostType);
	}
	
	public void displayedAddCostPopupEstimatedActualDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_AddCostPopup_EstimatedActual);
	}
	
	public void displayedAddCostPopupGSTInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddCostPopup_GST);
	}
	
	public void displayedAddCostPopupNumberOfDaysInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddCostPopup_NumberOfDays);
	}
	
	public void displayedAddCostPopupPerDayRadioButton() throws Exception {
		CommonFunctions.elementDisplayed(radioButton_AddCostPopup_PerDay);
	}
	
	public void displayedAddCostPopupPerDurationRadioButton() throws Exception {
		CommonFunctions.elementDisplayed(radioButton_AddCostPopup_PerDuration);
	}
	
	public void displayedAddCostPopupQuantityInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddCostPopup_Quantity);
	}
	
	public void displayedAddCostPopupTaxInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddCostPopup_Tax);
	}
	
	public void enabledAddCostPopupNumberOfDaysInput() throws Exception {
		CommonFunctions.elementEnabled(input_AddCostPopup_NumberOfDays);
	}
	
	public void selectAddCostPopupCostTypeDropdownValue(String dropdownOptionValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_AddCostPopup_CostType, dropdownOptionValue);
		CommonFunctions.pause(5000, false);
	}
	
	public void selectCostsSectionTopCostTypeDropdownRowDataValue(String dropdownOptionValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(rowData_CostsSection_TopCostTypeDropdown, dropdownOptionValue);
		CommonFunctions.pause(5000, false);
	}
	
	public void selectAddCostPopupEstimatedActualDropdownValue(String dropdownOptionValue) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_AddCostPopup_EstimatedActual, dropdownOptionValue);
	}
	
	public void setAddCostPopupCostInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddCostPopup_Cost, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setAddCostPopupGSTInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddCostPopup_GST, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setAddCostPopupNumberOfDaysInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddCostPopup_NumberOfDays, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setAddCostPopupQuantityInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddCostPopup_Quantity, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setAddCostPopupTaxInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddCostPopup_Tax, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	// End - Add Cost Popup Actions
	
	// Start - Add Date Range Popup Actions
	public void clickAddDateRangePopupAddButton() throws Exception {
		CommonFunctions.clickElement(button_AddDateRangePopup_Add);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickAddDateRangePopupAddToTableButton() throws Exception {
		CommonFunctions.clickElement(button_AddDateRangePopup_AddToTable);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickAddDateRangePopupAllotmentCodeDropdownTopSearchResultRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_AddDateRangePopup_AllotmentCodeDropdown_TopSearchResult);
		CommonFunctions.pause(10000, false);
	}
	
	public void clickAddDateRangePopupAllotmentCodeInput() throws Exception {
		CommonFunctions.clickElement(input_AddDateRangePopup_AllotmentCode);
		CommonFunctions.pause(10000, false);
	}
	
	public void clickAddDateRangePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_AddDateRangePopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void containsValueAddDateRangePopupAllotmentCodeInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_AddDateRangePopup_AllotmentCode, "value", expectedValue);
	}
	
	public void containsValueAddDateRangePopupDaysDropdown(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(dropdown_AddDateRangePopup_Days.findElement(By.xpath(".//span")), expectedValue);
	}
	
	public void containsValueAddDateRangePopupEndDateInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_AddDateRangePopup_EndDate, "value", expectedValue);
	}
	
	public void disabledAddDateRangePopupShareAllowedCheckbox() throws Exception {
		CommonFunctions.elementAttributeContains(checkbox_AddDateRangePopup_ShareAllowed, "disabled", "true");
	}
	
	public void displayedAddDateRangePopupAddButton() throws Exception {
		CommonFunctions.elementDisplayed(button_AddDateRangePopup_Add);
	}
	
	public void displayedAddDateRangePopupAddToTableButton() throws Exception {
		CommonFunctions.elementDisplayed(button_AddDateRangePopup_AddToTable);
	}
	
	public void displayedAddDateRangePopupAllotmentCodeDropdownAllotmentCodeFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddDateRangePopup_AllotmentCodeDropdown_AllotmentCodeFilter);
	}
	
	public void displayedAddDateRangePopupAllotmentCodeDropdownInventoryPoolFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddDateRangePopup_AllotmentCodeDropdown_InventoryPoolFilter);
	}
	
	public void displayedAddDateRangePopupAllotmentCodeDropdownTopSearchResultAllotmentCodeLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_AddDateRangePopup_AllotmentCodeDropdown_TopSearchResultAllotmentCode);
	}
	
	public void displayedAddDateRangePopupAllotmentCodeDropdownTopSearchResultInventoryPoolLabel() throws Exception {
		CommonFunctions.elementDisplayed(label_AddDateRangePopup_AllotmentCodeDropdown_TopSearchResultInventoryPool);
	}
	
	public void displayedAddDateRangePopupAllotmentCodeDropdownTopSearchResultRadioButton() throws Exception {
		CommonFunctions.elementDisplayed(radioButton_AddDateRangePopup_AllotmentCodeDropdown_TopSearchResult);
	}
	
	public void displayedAddDateRangePopupAllotmentCodeInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddDateRangePopup_AllotmentCode);
	}
	
	public void displayedAddDateRangePopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_AddDateRangePopup_Cancel);
	}
	
	public void displayedAddDateRangePopupCloseButton() throws Exception {
		CommonFunctions.elementDisplayed(button_AddDateRangePopup_Close);
	}
	
	public void displayedAddDateRangePopupDaysDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_AddDateRangePopup_Days);
	}
	
	public void displayedAddDateRangePopupEndDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddDateRangePopup_EndDate);
	}
	
	public void displayedAddDateRangePopupInvoiceCommentsTextArea() throws Exception {
		CommonFunctions.elementDisplayed(textArea_AddDateRangePopup_InvoiceComments);
	}
	
	public void displayedAddDateRangePopupPrintVoucherCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_AddDateRangePopup_PrintVoucher.findElement(By.xpath(".//parent::label")));
	}
	
	public void displayedAddDateRangePopupShareAllowedCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_AddDateRangePopup_ShareAllowed.findElement(By.xpath(".//parent::label")));
	}
	
	public void displayedAddDateRangePopupStartDateInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AddDateRangePopup_StartDate);
	}
	
	public void displayedAddDateRangePopupVoucherCommentsTextArea() throws Exception {
		CommonFunctions.elementDisplayed(textArea_AddDateRangePopup_VoucherComments);
	}
	
	public void enabledAddDateRangePopupShareAllowedCheckbox() throws Exception {
		CommonFunctions.elementEnabled(checkbox_AddDateRangePopup_ShareAllowed);
	}
	
	public void setAddDateRangePopupAllotmentCodeDropdownAllotmentCodeFilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddDateRangePopup_AllotmentCodeDropdown_AllotmentCodeFilter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setAddDateRangePopupAllotmentCodeDropdownInventoryPoolFilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddDateRangePopup_AllotmentCodeDropdown_InventoryPoolFilter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setAddDateRangePopupAllotmentCodeInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddDateRangePopup_AllotmentCode, value);
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickElement(input_AddDateRangePopup_AllotmentCodeDropdown_InventoryPoolFilter);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void setAddDateRangePopupEndDateInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddDateRangePopup_EndDate, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setAddDateRangePopupStartDateInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AddDateRangePopup_StartDate, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	// End - Add Date Range Popup Actions
	
	// Start - Edit Invoice Comments Popup Actions
	public void clickEditInvoiceCommentPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_EditInvoiceCommentPopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickEditInvoiceCommentPopupDoneButton() throws Exception {
		CommonFunctions.clickElement(button_EditInvoiceCommentPopup_Done);
		CommonFunctions.pause(5000, false);
	}
	
	public void setEditInvoiceCommentPopupInvoiceCommentsTextArea(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(textArea_EditInvoiceCommentPopup_InvoiceComments, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	// End - Edit Invoice Comments Popup Actions
	
	// Start - Edit Voucher Comments Popup Actions
	public void clickEditVoucherCommentPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_EditVoucherCommentPopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickEditVoucherCommentPopupDoneButton() throws Exception {
		CommonFunctions.clickElement(button_EditVoucherCommentPopup_Done);
		CommonFunctions.pause(5000, false);
	}
	
	public void setEditVoucherCommentPopupVoucherCommentsTextArea(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(textArea_EditVoucherCommentPopup_VoucherComments, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	// End - Edit Voucher Comments Popup Actions
	
	// Start - Edit Configuration Details Popup Actions
	public void clickEditConfigurationDetailsPopupCloseButton() throws Exception {
		CommonFunctions.clickElement(button_EditConfigurationDetailsPopup_Close);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickEditConfigurationDetailsPopupUpdateButton() throws Exception {
		CommonFunctions.clickElement(button_EditConfigurationDetailsPopup_Update);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickEditConfigurationDetailsPopupCategory1DropdownOption(String dropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_EditConfigurationDetailsPopup_Category1);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), dropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickEditConfigurationDetailsPopupCategory2DropdownOption(String dropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_EditConfigurationDetailsPopup_Category2);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), dropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void clickEditConfigurationDetailsPopupGuestConfigurationDropdownOption(String dropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_EditConfigurationDetailsPopup_GuestConfiguration);
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'search')]//input"), dropdownOptionValue);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void containsValueEditConfigurationDetailsPopupMaximumChildAgeInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_EditConfigurationDetailsPopup_MaximumChildAge, "value", expectedValue);
	}
	
	public void containsValueEditConfigurationDetailsPopupMaximumNightsInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_EditConfigurationDetailsPopup_MaximumNights, "value", expectedValue);
	}
	
	public void containsValueEditConfigurationDetailsPopupMinimumNightsInput(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(input_EditConfigurationDetailsPopup_MinimumNights, "value", expectedValue);
	}
	
	public void displayedEditConfigurationDetailsPopupCloseButton() throws Exception {
		CommonFunctions.elementDisplayed(button_EditConfigurationDetailsPopup_Close);
	}
	
	public void displayedEditConfigurationDetailsPopupCategory1Dropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_EditConfigurationDetailsPopup_Category1);
	}
	
	public void displayedEditConfigurationDetailsPopupCategory2Dropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_EditConfigurationDetailsPopup_Category2);
	}
	
	public void displayedEditConfigurationDetailsPopupGuestConfigurationDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_EditConfigurationDetailsPopup_GuestConfiguration);
	}
	
	public void displayedEditConfigurationDetailsPopupUpdateButton() throws Exception {
		CommonFunctions.elementDisplayed(button_EditConfigurationDetailsPopup_Update);
	}
	
	public void displayedEditConfigurationDetailsPopupMaximumChildAgeInput() throws Exception {
		CommonFunctions.elementDisplayed(input_EditConfigurationDetailsPopup_MaximumChildAge);
	}
	
	public void displayedEditConfigurationDetailsPopupMaximumNightsInput() throws Exception {
		CommonFunctions.elementDisplayed(input_EditConfigurationDetailsPopup_MaximumNights);
	}
	
	public void displayedEditConfigurationDetailsPopupMinimumNightsInput() throws Exception {
		CommonFunctions.elementDisplayed(input_EditConfigurationDetailsPopup_MinimumNights);
	}
	
	public void setEditConfigurationDetailsPopupMaximumChildAgeInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_EditConfigurationDetailsPopup_MaximumChildAge, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setEditConfigurationDetailsPopupMaximumNightsInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_EditConfigurationDetailsPopup_MaximumNights, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setEditConfigurationDetailsPopupMinimumNightsInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_EditConfigurationDetailsPopup_MinimumNights, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	// End - Edit Configuration Details Popup Actions
	
	// Start - Allotment Code Popup Actions
	public void clickAllotmentCodePopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_AllotmentCodePopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickAllotmentCodePopupDoneButton() throws Exception {
		CommonFunctions.clickElement(button_AllotmentCodePopup_Done);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickAllotmentCodePopupThirdRadioButtonRowData() throws Exception {
		CommonFunctions.clickElement(rowData_AllotmentCodePopup_ThirdRadioButton);
	}
	
	public void containsValueAllotmentCodePopupFirstAllotmentCodeRowData(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(rowData_AllotmentCodePopup_FirstAllotmentCode, expectedValue);
	}
	
	public void containsValueAllotmentCodePopupFirstInventoryPoolRowData(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(rowData_AllotmentCodePopup_FirstInventoryPool, expectedValue);
	}
	
	public void containsValueAllotmentCodePopupSecondAllotmentCodeRowData(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(rowData_AllotmentCodePopup_SecondAllotmentCode, expectedValue);
	}
	
	public void containsValueAllotmentCodePopupSecondInventoryPoolRowData(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(rowData_AllotmentCodePopup_SecondInventoryPool, expectedValue);
	}
	
	public void displayedAllotmentCodePopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_AllotmentCodePopup_Cancel);
	}
	
	public void displayedAllotmentCodePopupDoneButton() throws Exception {
		CommonFunctions.elementDisplayed(button_AllotmentCodePopup_Done);
	}
	
	public void displayedAllotmentCodePopupAllotmentCodeInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AllotmentCodePopup_AllotmentCode);
	}
	
	public void displayedAllotmentCodePopupAllotmentCodeFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AllotmentCodePopup_AllotmentCodeFilter);
	}
	
	public void displayedAllotmentCodePopupInventoryPoolFilterInput() throws Exception {
		CommonFunctions.elementDisplayed(input_AllotmentCodePopup_InventoryPoolFilter);
	}
	
	public void displayedAllotmentCodePopupFirstRadioButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_AllotmentCodePopup_FirstRadioButton);
	}
	
	public void displayedAllotmentCodePopupSecondRadioButtonRowData() throws Exception {
		CommonFunctions.elementDisplayed(rowData_AllotmentCodePopup_SecondRadioButton);
	}
	
	public void setAllotmentCodePopupAllotmentCodeFilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AllotmentCodePopup_AllotmentCodeFilter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	
	public void setAllotmentCodePopupAllotmentCodeInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AllotmentCodePopup_AllotmentCode, value);
	}
	
	public void setAllotmentCodePopupInventoryPoolFilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_AllotmentCodePopup_InventoryPoolFilter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}
	// End - Allotment Code Popup Actions
	
	// Start - Import Seasons Popup Actions
	public void clickImportSeasonsPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_ImportSeasonsPopup_Cancel);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickImportSeasonsPopupImportFromDropdown() throws Exception {
		CommonFunctions.clickElement(dropdown_ImportSeasonsPopup_ImportFrom);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickImportSeasonsPopupImportFromDropdownTopImportFromRadioButton() throws Exception {
		CommonFunctions.clickElement(radioButton_ImportSeasonsPopup_ImportFromDropdown_TopImportFrom);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickImportSeasonsPopupIncludePastDatesCheckbox() throws Exception {
		CommonFunctions.clickElement(checkbox_ImportSeasonsPopup_IncludePastDates);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickImportSeasonsPopupSeasonDropdownOption(String dropdownOptionValue) throws Exception {
		CommonFunctions.clickElement(dropdown_ImportSeasonsPopup_Season);
		
		if (dropdownOptionValue.equals("Select All")) {
			CommonFunctions.clickElement(dropdown_ImportSeasonsPopup_Season.findElement(By.xpath(".//following-sibling::div//ul//li//label[contains(text(), 'Select All')]")));
		}
		else {
			CommonFunctions.clearThenEnterElementValue(dropdown_ImportSeasonsPopup_Season.findElement(By.xpath(".//parent::div//div[contains(@class, 'search')]//input")), dropdownOptionValue);
			CommonFunctions.clickElement(dropdown_ImportSeasonsPopup_Season.findElement(By.xpath(".//parent::div//ul//span[text() = '" + dropdownOptionValue + "']")));
		}
		
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	public void containsValueImportSeasonsPopupImportFromDropdown(String expectedValue) throws Exception {
		CommonFunctions.elementAttributeContains(dropdown_ImportSeasonsPopup_ImportFrom, "value", expectedValue);
	}
	
	public void containsValueImportSeasonsPopupSeasonDropdown(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(dropdown_ImportSeasonsPopup_Season.findElement(By.xpath(".//span")), expectedValue);
	}
	
	public void displayedImportSeasonsPopupCancelButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ImportSeasonsPopup_Cancel);
	}
	
	public void displayedImportSeasonsPopupDoneButton() throws Exception {
		CommonFunctions.elementDisplayed(button_ImportSeasonsPopup_Done);
	}
	
	public void displayedImportSeasonsPopupIncludePastDatesCheckbox() throws Exception {
		CommonFunctions.elementDisplayed(checkbox_ImportSeasonsPopup_IncludePastDates);
	}
	
	public void displayedImportSeasonsPopupImportFromDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportSeasonsPopup_ImportFrom);
	}
	
	public void displayedImportSeasonsPopupSeasonDropdown() throws Exception {
		CommonFunctions.elementDisplayed(dropdown_ImportSeasonsPopup_Season);
	}
	
	public void setImportSeasonsPopupImportFromDropdownCategory1FilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportSeasonsPopup_ImportFromDropdown_Category1Filter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setImportSeasonsPopupImportFromDropdownCategory2FilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportSeasonsPopup_ImportFromDropdown_Category2Filter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	
	public void setImportSeasonsPopupImportFromDropdownGuestConfigurationFilterInput(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_ImportSeasonsPopup_ImportFromDropdown_GuestConfigurationFilter, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
	}
	// End - Import Seasons Popup Actions
	
	// Start - Existing Configuration Details Popup Action
	public void clickExistingConfigurationDetailsPopupCloseButton() throws Exception {
		CommonFunctions.clickElement(button_ExistingConfigurationDetailsPopup_Close);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickExistingConfigurationDetailsPopupRemoveAllButton() throws Exception {
		CommonFunctions.clickElement(button_ExistingConfigurationDetailsPopup_RemoveAll);
		CommonFunctions.pause(10000, false);
	}
	
	public void containsValueExistingConfigurationDetailsPopupTopCategory1RowData(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(rowData_ExistingConfigurationDetailsPopup_TopCategory1, expectedValue);
	}
	
	public void containsValueExistingConfigurationDetailsPopupTopCategory2RowData(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(rowData_ExistingConfigurationDetailsPopup_TopCategory2, expectedValue);
	}
	
	public void containsValueExistingConfigurationDetailsPopupTopGuestConfigurationRowData(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(rowData_ExistingConfigurationDetailsPopup_TopGuestConfiguration, expectedValue);
	}
	
	public void containsValueExistingConfigurationDetailsPopupTopMaxPaxRowData(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(rowData_ExistingConfigurationDetailsPopup_TopMaxPax, expectedValue);
	}
	
	public void containsValueExistingConfigurationDetailsPopupTopMinPaxRowData(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(rowData_ExistingConfigurationDetailsPopup_TopMinPax, expectedValue);
	}
	// End - Existing Configuration Details Popup Actions
	// End - Actions
}