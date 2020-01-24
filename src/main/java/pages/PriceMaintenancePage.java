package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class PriceMaintenancePage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//input[contains(@id, 'ContractIdInput')]")
	WebElement input_ContractId;
	
	@FindBy(xpath = "//input[contains(@id,'SearchContractIdInput')]")
	WebElement input_SearchContractId;
	
	@FindBy(xpath = "//div[contains(@id,'Row')]//div[contains(text(),'89099')]")
	WebElement input_ContractIDSelectedFuture;
	
	@FindBy(xpath = "//div[contains(@id,'Row')]//div[contains(text(),'85705')]")
	WebElement input_ContractIDSelectedProcessed;
	
	@FindBy(xpath = "//div[@id='select2-drop']//input[contains(@class,'select2-input')]")
	WebElement input_BatchNumber;
	
	@FindBy(xpath = "//div[contains(@id,'BatchNumberCB')]")
	WebElement select_BatchNumber;
	
	@FindBy(xpath = "//div[@id='select2-drop']//following-sibling::ul//li[contains(text(),'No results matched')]")
	WebElement search_noResults;
	
	@FindBy(xpath = "//input[contains(@id,'rbFuture')]")
	WebElement button_RadioFuture;
	
	@FindBy(xpath = "//input[contains(@id,'rbProcessed')]")
	WebElement button_RadioProcessed;
	
	@FindBy(xpath = "//a[contains(text(),'Find')]")
	WebElement button_Find;
	
	@FindBy(xpath = "//a[contains(text(),'Download Results')]")
	WebElement button_DownloadResults;
	
	@FindBy(xpath = "//a[contains(@id,'ProcessBatch')]")
	WebElement button_ProcessBatch;
	
	@FindBy(xpath = "//a[contains(@id,'DeleteBatch')]")
	WebElement button_DeleteBatch;
	
	@FindBy(xpath = "//a[contains(@id,'ViewLink')]")
	WebElement button_ViewLink;
	
	@FindBy(xpath = "//a[contains(@title,'View Price')]")
	WebElement tooltip_ViewPrice;
	
	@FindBy(xpath = "//tr//input[contains(@id,'batch')]")
	WebElement filter_batch;
	
	@FindBy(xpath = "//tr//input[contains(@id,'effective')]")
	WebElement filter_effectiveDate;
	
	@FindBy(xpath = "//tr//input[contains(@id,'id')]")
	WebElement filter_contractID;
	
	@FindBy(xpath = "//tr//input[contains(@id,'name')]")
	WebElement filter_contractName;
	
	@FindBy(xpath = "//tr//input[contains(@id,'curr')]")
	WebElement filter_currency;
	
	@FindBy(xpath = "//tr//input[contains(@id,'cat1')]")
	WebElement filter_category1;
	
	@FindBy(xpath = "//tr//input[contains(@id,'cat2')]")
	WebElement filter_category2;
	
	@FindBy(xpath = "//tr//input[contains(@id,'config')]")
	WebElement filter_configType;
	
	@FindBy(xpath = "//tr//input[contains(@id,'start')]")
	WebElement filter_startDate;
	
	@FindBy(xpath = "//tr//input[contains(@id,'end')]")
	WebElement filter_endDate;
	
	@FindBy(xpath = "//tr//input[contains(@id,'price1')]")
	WebElement filter_price1;
	
	@FindBy(xpath = "//tr//input[contains(@id,'price2')]")
	WebElement filter_price2;
	
	@FindBy(xpath = "//tr//input[contains(@id,'price3')]")
	WebElement filter_price3;
	
	@FindBy(xpath = "//tr//input[contains(@id,'price4')]")
	WebElement filter_price4;
	
	@FindBy(xpath = "//tr//input[contains(@id,'price5')]")
	WebElement filter_price5;
	
	@FindBy(xpath = "//tr//input[contains(@id,'UploadDate')]")
	WebElement filter_uploadDate;
	
	@FindBy(xpath = "//tr//input[contains(@id,'UploadBy')]")
	WebElement filter_uploadBy;
	
	@FindBy(xpath = "//tr//input[contains(@id,'ModifiedDate')]")
	WebElement filter_modifiedDate;
	
	@FindBy(xpath = "//tr//input[contains(@id,'ModifiedBy')]")
	WebElement filter_modifiedBy;
	
	@FindBy(xpath = "(//a[@title='View Price'])[1]")
	WebElement button_1stViewPrice;
	
	@FindBy(xpath = "//input[contains(@value, 'Close')]")
	WebElement ViewPricePopupCloseButton;
	
	@FindBy(xpath = "//a[contains(@id,'AddPrice')]")
	WebElement button_AddPrice;
	
	@FindBy(xpath = "//input[contains(@id,'MaximumPaxInput')]")
	WebElement field_MaxComission;
	
	@FindBy(xpath = "//input[contains(@id,'MinimumPaxInput')]")
	WebElement field_MinComission;
	
	@FindBy(xpath = "//span[contains(@id,'TwinInput')]")
	WebElement field_Price1;
	
	@FindBy(xpath = "//span[contains(@id,'SingleInput')]")
	WebElement field_Price2;
	
	@FindBy(xpath = "//span[contains(@id,'TripleInput')]")
	WebElement field_Price3;
	
	@FindBy(xpath = "//span[contains(@id,'ChildInput')]")
	WebElement field_Price4;
	
	@FindBy(xpath = "//span[contains(@id,'PensionerInput')]")
	WebElement field_Price5;
	
	@FindBy(xpath = "//input[contains(@id,'StartDateInput')]")
	WebElement field_EffectiveDatePMpopup;
	
	@FindBy(xpath = "//input[contains(@id,'EffectiveTimeInput')]")
	WebElement field_EffectiveTimePMpopup;
	
	@FindBy(xpath = "//input[@placeholder='hh:mm']")
	WebElement placeHolder_EffectiveTimePMpopup;
	
	@FindBy(xpath = "//input[contains(@id,'SearchPaxType')]")
	WebElement field_paxType;
	
	@FindBy(xpath = "//input[@value='Update Price']")
	WebElement button_UpdatePrice;
	
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement button_Cancel;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public PriceMaintenancePage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void displayedBatchNumber() throws Exception {
		CommonFunctions.elementDisplayed(select_BatchNumber);
	}
	
	public void displayedContractId() throws Exception {
		CommonFunctions.elementDisplayed(input_ContractId);
	}
	
	public void displayedRadioFuture() throws Exception {
		CommonFunctions.elementDisplayed(button_RadioFuture);
	}
	
	public void displayedRadioProcess() throws Exception {
		CommonFunctions.elementDisplayed(button_RadioProcessed);
	}
	
	public void displayedPriceFind() throws Exception {
		CommonFunctions.elementDisplayed(button_Find);
	}
	
	public void displayedDownloadResults() throws Exception {
		CommonFunctions.elementDisplayed(button_DownloadResults);
	}
	
	public void displayColumns() throws Exception {
		CommonFunctions.elementDisplayed(filter_batch);
		CommonFunctions.elementDisplayed(filter_effectiveDate);
		CommonFunctions.elementDisplayed(filter_contractID);
		CommonFunctions.elementDisplayed(filter_contractName);
		CommonFunctions.elementDisplayed(filter_currency);
		CommonFunctions.elementDisplayed(filter_category1);
		CommonFunctions.elementDisplayed(filter_category2);
		CommonFunctions.elementDisplayed(filter_configType);
		CommonFunctions.elementDisplayed(filter_startDate);
		CommonFunctions.elementDisplayed(filter_endDate);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(filter_price1);
		CommonFunctions.elementDisplayed(filter_price2);
		CommonFunctions.elementDisplayed(filter_price3);
		CommonFunctions.elementDisplayed(filter_price4);
		CommonFunctions.elementDisplayed(filter_price5);
		CommonFunctions.elementDisplayed(filter_uploadDate);
		CommonFunctions.elementDisplayed(filter_uploadBy);
		CommonFunctions.elementDisplayed(filter_modifiedDate);
		CommonFunctions.elementDisplayed(filter_modifiedBy);
		CommonFunctions.pause(5000, false);
		
	}
	
	public void clickBatchNumber() throws Exception {
		CommonFunctions.clickElement(select_BatchNumber);
		CommonFunctions.pause(3000, false);
	}
	
	public void clickContractId() throws Exception {
		CommonFunctions.clickElement(input_ContractId);
	}
	
	public void clickRadioFuture() throws Exception {
		CommonFunctions.clickElement(button_RadioFuture);
		CommonFunctions.pause(3000, false);
	}
	
	public void clickRadioProcess() throws Exception {
		CommonFunctions.clickElement(button_RadioProcessed);
		CommonFunctions.pause(3000, false);
	}
	
	public void clickPriceFind() throws Exception {
		CommonFunctions.clickElement(button_Find);
		CommonFunctions.pause(3000, false);
	}
	
	public void clickDownloadResults() throws Exception {
		CommonFunctions.clickElement(button_DownloadResults);
	}
	
	public void clickSearchContractIdFuture() throws Exception {
		CommonFunctions.clickElement(input_ContractIDSelectedFuture);
		CommonFunctions.pause(3000, false);
	}
	
	public void clickSearchContractIdProcessed() throws Exception {
		CommonFunctions.clickElement(input_ContractIDSelectedProcessed);
		CommonFunctions.pause(3000, false);
	}
	
	public void setInputBatchNumberFuture() throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_BatchNumber, "190926141518");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(3000, false);
	}
	
	public void setInputSearchContractIdFuture() throws Exception {
		CommonFunctions.enterElementValue(input_SearchContractId, "89099");
	}
	
	public void setInputSearchContractIdProcessed() throws Exception {
		CommonFunctions.enterElementValue(input_SearchContractId, "85705");
		CommonFunctions.pause(3000, false);
	}
	
	public void setInputBatchNumberProcessed() throws Exception {
		CommonFunctions.enterElementValue(input_BatchNumber, "191003095513");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(3000, false);
	}
	
	public void validateNoBatchNumberFuture() throws Exception {
		CommonFunctions.elementDisplayed(search_noResults);
	}
	
	public void validateBatchNumberProcessed() throws Exception {
		CommonFunctions.textVisibleInPage("191003095513");
		CommonFunctions.pause(3000, false);
	}
	
	public void viewResultsFuture() throws Exception {
		CommonFunctions.textVisibleInPage("190926141518");
	}
	
	public void viewResultsProcess() throws Exception {
		CommonFunctions.textVisibleInPage("191003095513");
	}
	
	public void enabledProcessButton() throws Exception {
		CommonFunctions.elementEnabled(button_ProcessBatch);
		CommonFunctions.pause(3000, false);
	}
	
	public void enabledDeleteButton() throws Exception {
		CommonFunctions.elementEnabled(button_DeleteBatch);
		CommonFunctions.pause(3000, false);
	}
	
	public void disabledProcessButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_ProcessBatch, "disabled", "true");
		CommonFunctions.pause(3000, false);
	}
	
	public void disabledDeleteButton() throws Exception {
		CommonFunctions.elementAttributeContains(button_DeleteBatch, "disabled", "true");
		CommonFunctions.pause(3000, false);
	}
	
	public void clickbutton_1stViewPrice() throws Exception {
		CommonFunctions.clickElement(button_1stViewPrice);
		CommonFunctions.pause(5000, false);
	}
	
	public void clickViewPricePopupCancelButton() throws Exception {
		CommonFunctions.switchFrameByXPath("//div[text()='View Price']");
		CommonFunctions.clickElement(ViewPricePopupCloseButton);
		CommonFunctions.pause(5000, false);
	}
	
	public void CheckFieldsDisplayedinTextualFashion() throws Exception {
		CommonFunctions.switchFrameByXPath("//div[text()='View Price']");
		CommonFunctions.textVisibleInPage("Effective Date");
		CommonFunctions.textVisibleInPage("Effective Time");
		CommonFunctions.textVisibleInPage("Contract ID");
		CommonFunctions.textVisibleInPage("Configuration Type");
		CommonFunctions.textVisibleInPage("Contract Name");
		CommonFunctions.textVisibleInPage("Category 1");
		CommonFunctions.textVisibleInPage("Category 2");
		CommonFunctions.textVisibleInPage("Min Commission");
		CommonFunctions.textVisibleInPage("Max Commission");
		CommonFunctions.textVisibleInPage("Start Date");
		CommonFunctions.textVisibleInPage("End Date");
		CommonFunctions.textVisibleInPage("Currency");
		CommonFunctions.textVisibleInPage("Price 1");
		CommonFunctions.textVisibleInPage("Price 2");
		CommonFunctions.textVisibleInPage("Price 3");
		CommonFunctions.textVisibleInPage("Price 4");
		CommonFunctions.textVisibleInPage("Price 5");
		CommonFunctions.textVisibleInPage("Guest Configuration");
		CommonFunctions.textVisibleInPage("Pax Type");
		CommonFunctions.textVisibleInPage("Price");
		CommonFunctions.textVisibleInPage("Non-Commission");
		
	}
	
	public void clickAddPriceButton() throws Exception {
		CommonFunctions.clickElement(button_AddPrice);
	}
	
	public void CheckFieldinAddPriceMaintenance() throws Exception {
		CommonFunctions.switchFrameByXPath("//span[text()='Add Price Effective in the Future']");
		CommonFunctions.textVisibleInPage("Effective Date");
		CommonFunctions.textVisibleInPage("Effective Time");
		CommonFunctions.textVisibleInPage("Contract ID");
		CommonFunctions.textVisibleInPage("Configuration Type");
		CommonFunctions.textVisibleInPage("Contract Name");
		CommonFunctions.textVisibleInPage("Category 1");
		CommonFunctions.textVisibleInPage("Category 2");
		CommonFunctions.textVisibleInPage("Min Commission");
		CommonFunctions.textVisibleInPage("Max Commission");
		CommonFunctions.textVisibleInPage("Start Date");
		CommonFunctions.textVisibleInPage("End Date");
		CommonFunctions.textVisibleInPage("Currency");
		CommonFunctions.textVisibleInPage("Price 1");
		CommonFunctions.textVisibleInPage("Price 2");
		CommonFunctions.textVisibleInPage("Price 3");
		CommonFunctions.textVisibleInPage("Price 4");
		CommonFunctions.textVisibleInPage("Price 5");
		
	}
	
	public void CheckDefaultValuedinAddPriceMaintenance() throws Exception {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//input[contains(@id,'MinimumPaxInput') and @value='0']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//input[contains(@id,'MaximumPaxInput') and @value='10']")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_MaxComission, "0");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//input[contains(@id,'MaximumPaxInput') and @value='0.00']")));
	}
	
	public void AddMinimumCommissionGreaterThanMaximumComission() throws Exception {
		CommonFunctions.clearThenEnterElementValue(field_MinComission, "1");
		CommonFunctions.pause(1500, false);
		CommonFunctions.clearThenEnterElementValue(field_MaxComission, "0");
		CommonFunctions.pause(1500, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(text(),'Cannot be greater than Max Comm')]")));
	}
	
	public void AddLessthanZeroMinMaxCommission() throws Exception {
		CommonFunctions.clearThenEnterElementValue(field_MinComission, "-1");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'MinimumPaxInput') and contains(text(),'Cannot be less than zero.')]")));
		CommonFunctions.clearThenEnterElementValue(field_MaxComission, "-1");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'MaximumPaxInput') and contains(text(),'Cannot be less than zero.')]")));
	}
	
	public void AddGreaterThanOneHundredMinMaxCommission() throws Exception {
		CommonFunctions.clearThenEnterElementValue(field_MinComission, "101");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'MinimumPaxInput') and contains(text(),'Cannot be greater than 100.')]")));
		CommonFunctions.clearThenEnterElementValue(field_MaxComission, "101");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'MaximumPaxInput') and contains(text(),'Cannot be greater than 100.')]")));
	}
	
	public void CheckPriceFieldValidationMessage() throws Exception {
		CommonFunctions.switchFrameByXPath("//div[contains(@id,'tn_main')]");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'TwinInput') and contains(text(),'*Mandatory field.')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'SingleInput') and contains(text(),'*Mandatory field.')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'TripleInput') and contains(text(),'*Mandatory field.')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'ChildInput') and contains(text(),'*Mandatory field.')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'PensionerInput') and contains(text(),'*Mandatory field.')]")));
	}
	
	public void CheckPriceFieldValidationMessageIsNotDisplayed() throws Exception {
		CommonFunctions.elementNotExistingByXPath("//span[contains(@id,'TwinInput') and contains(text(),'*Mandatory field.')]");
		CommonFunctions.elementNotExistingByXPath("//span[contains(@id,'SingleInput') and contains(text(),'*Mandatory field.')]");
		CommonFunctions.elementNotExistingByXPath("//span[contains(@id,'TripleInput') and contains(text(),'*Mandatory field.')]");
		CommonFunctions.elementNotExistingByXPath("//span[contains(@id,'ChildInput') and contains(text(),'*Mandatory field.')]");
		CommonFunctions.elementNotExistingByXPath("//span[contains(@id,'PensionerInput') and contains(text(),'*Mandatory field.')]");
		
	}
	
	public void enterBatchNumberFuture(String expectedValue) throws Exception {
		CommonFunctions.clearThenEnterElementValue(input_BatchNumber, expectedValue);
		// CommonFunctions.clearThenEnterElementValue(input_BatchNumber, " 20200114091000");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void CheckFieldsDisplayedinTextualFashionPriceMaintenance() throws Exception {
		CommonFunctions.textVisibleInPage("Effective Date");
		CommonFunctions.textVisibleInPage("Effective Time");
		CommonFunctions.textVisibleInPage("Contract ID");
		CommonFunctions.textVisibleInPage("Configuration Type");
		CommonFunctions.textVisibleInPage("Contract Name");
		CommonFunctions.textVisibleInPage("Category 1");
		CommonFunctions.textVisibleInPage("Category 2");
		CommonFunctions.textVisibleInPage("Min Commission");
		CommonFunctions.textVisibleInPage("Max Commission");
		CommonFunctions.textVisibleInPage("Start Date");
		CommonFunctions.textVisibleInPage("End Date");
		CommonFunctions.textVisibleInPage("Currency");
		CommonFunctions.textVisibleInPage("Price 1");
		CommonFunctions.textVisibleInPage("Price 2");
		CommonFunctions.textVisibleInPage("Price 3");
		CommonFunctions.textVisibleInPage("Price 4");
		CommonFunctions.textVisibleInPage("Price 5");
		CommonFunctions.textVisibleInPage("Guest Configuration");
		CommonFunctions.textVisibleInPage("Pax Type");
		CommonFunctions.textVisibleInPage("Price");
		CommonFunctions.textVisibleInPage("Non-Commission");
	}
	
	public void CheckFieldsDisplayedinPriceMaintenanacePopup() throws Exception {
		CommonFunctions.elementDisplayed(field_EffectiveDatePMpopup);
		CommonFunctions.elementDisplayed(field_EffectiveTimePMpopup);
		CommonFunctions.elementDisplayed(placeHolder_EffectiveTimePMpopup);
		CommonFunctions.elementDisplayed(field_paxType);
		CommonFunctions.elementDisplayed(button_UpdatePrice);
		CommonFunctions.elementDisplayed(button_Cancel);
	}
	
	public void ValidateFieldsinPriceMaintenanacePopup() throws Exception {
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(field_EffectiveDatePMpopup, "1.1.1");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		// CommonFunctions.textVisibleInPage("Invalid format");
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(placeHolder_EffectiveTimePMpopup, "1111");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
		CommonFunctions.textVisibleInPage("Invalid 24 hour time");
		CommonFunctions.clearThenEnterElementValue(field_EffectiveDatePMpopup, "15 Jan 2022");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.textVisibleInPage("Effective Date cannot be greater than End Date.");
	}
	
	public void enterEffectiveDateGreaterthanEndDate() throws Exception {
		CommonFunctions.clearThenEnterElementValue(field_EffectiveDatePMpopup, "13 Jan 2022");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void enterValidEffectiveDate() throws Exception {
		CommonFunctions.clearThenEnterElementValue(field_EffectiveDatePMpopup, "13 Jan 2020");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.elementNotExistingByXPath("//span[text()='Effective Date cannot be greater than End Date.']");
		field_EffectiveDatePMpopup.clear();
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.elementNotExistingByXPath("//span[text()='Effective Date cannot be greater than End Date.']");
	}
	
	public void enterInvalidEffectiveTime() throws Exception {
		CommonFunctions.clearThenEnterElementValue(field_EffectiveTimePMpopup, "25:99");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	public void validateThatFieldsAreMandatory() throws Exception {
		field_EffectiveTimePMpopup.clear();
		field_EffectiveDatePMpopup.clear();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Update Price']")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'effectiveDateInvalidaMessage') and contains(text(),'*Mandatory field.')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id,'ValidationMessage_wtEffectiveTimeInput') and contains(text(),'*Mandatory field.')]")));
	}
	
	public void successfullyUpdatePrice() throws Exception {
		CommonFunctions.clearThenEnterElementValue(field_EffectiveDatePMpopup, "15 Sep 2020");
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(field_EffectiveTimePMpopup, "09:09");
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Update Price']")));
	}
	
	public void closeOrCancelPriceUpdate() throws Exception {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//table[contains(@id,'PriceMaintenanceTable')]//a[contains(@id,'EditLink')]")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.switchFrameByXPath("//span[text()='Update Effective Date and Time']");
		CommonFunctions.clickElement(button_Cancel);
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementNotExistingByXPath("//span[text()='Update Effective Date and Time']");
	}
	
	public void enterValidEffectiveTime() throws Exception {
		CommonFunctions.clearThenEnterElementValue(field_EffectiveTimePMpopup, "12:22");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.elementNotExistingByXPath("//span[text()='Invalid 24 hour time']");
		field_EffectiveTimePMpopup.clear();
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.elementNotExistingByXPath("//span[text()='Invalid 24 hour time']");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Update Price']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id,'ctn_main')]")));
	}
	// End - Actions
}