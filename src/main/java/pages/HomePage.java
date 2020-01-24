package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class HomePage extends Base {
	// Start - Page Objects
	@FindBy(xpath = "//span[contains(text(), 'Administration')]")
	WebElement accordion_Administration;
	
	@FindBy(xpath = "//span[contains(text(), 'Air')]")
	WebElement accordion_Air;
	
	@FindBy(xpath = "//span[contains(text(), 'Contracts')]")
	WebElement accordion_Contracts;
	
	@FindBy(xpath = "//a[@class = 'Hamburger']")
	WebElement accordion_Hamburger;
	
	@FindBy(xpath = "//*[contains(text(), 'Modules')]")
	WebElement accordion_Modules;
	
	@FindBy(xpath = "//div[contains(@id, 'LoginInfo_username')]")
	WebElement accordion_UserFullName;
	
	@FindBy(xpath = "//img[contains(@src, 'img') and contains(@style, '32px')]")
	WebElement image_HeaderProfilePicture;
	
	@FindBy(xpath = "//a[contains(text(), 'Application Settings')]")
	WebElement link_ApplicationSetting;
	
	@FindBy(xpath = "//a[contains(text(), 'Audit Trail')]")
	WebElement link_AuditTrail;
	
	@FindBy(xpath = "//a[contains(text(), 'Commissions')]")
	WebElement link_Commissions;
	
	@FindBy(xpath = "//a[contains(text(), 'Contracts')]")
	WebElement link_Contracts;
	
	@FindBy(xpath = "//a[contains(text(), 'Upload Cost')]")
	WebElement link_UploadCost;
	
	@FindBy(xpath = "//a[contains(text(), 'Upload Price')]")
	WebElement link_UploadPrice;
	
	@FindBy(xpath = "//a[contains(text(), 'Customers')]")
	WebElement link_Customers;
	
	@FindBy(xpath = "//a[contains(text(), 'Edit My Profile')]")
	WebElement link_EditUserProfile;
	
	@FindBy(xpath = "//a[contains(text(), 'Log Out')]")
	WebElement link_LogoutSide;
	
	@FindBy(xpath = "//a[contains(text(), 'Logout')]")
	WebElement link_LogoutTop;
	
	@FindBy(xpath = "//a[contains(text(), 'Markup Rule')]")
	WebElement link_MarkupRule;
	
	@FindBy(xpath = "//a[contains(text(), 'Menu Configuration')]")
	WebElement link_MenuConfiguration;
	
	@FindBy(xpath = "//a[contains(text(), 'Promotions')]")
	WebElement link_Promotions;
	
	@FindBy(xpath = "//a[contains(text(), 'Queue Place Setting')]")
	WebElement link_QueuePlaceSetting;
	
	@FindBy(xpath = "//a[contains(text(), 'Recommended Itinerary')]")
	WebElement link_RecommendedItinerary;
	
	@FindBy(xpath = "//a[contains(text(), 'Suppliers')]")
	WebElement link_Suppliers;
	
	@FindBy(xpath = "//a[contains(text(), 'Ticketing Time Limit')]")
	WebElement link_TicketingTimeLimit;
	
	@FindBy(xpath = "//a[contains(text(), 'Users')]")
	WebElement link_Users;
	
	@FindBy(xpath = "//a[contains(text(), 'Price Maintenance')]")
	WebElement link_PriceMainenance;
	// End - Page Objects
	
	// Start - Initializing the Page Objects
	public HomePage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	// End - Initializing the Page Objects
	
	// Start - Actions
	public void clickAdministrationAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Administration);
	}
	
	public void clickAirAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Air);
	}
	
	public void clickContractsAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Contracts);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickHamburgerAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Hamburger);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickModulesAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_Modules);
		CommonFunctions.pause(2500, false);
	}
	
	public void clickUserFullNameAccordion() throws Exception {
		CommonFunctions.clickElement(accordion_UserFullName);
	}
	
	public void containsValueUserFullNameAccordion(String userFirstName) throws Exception {
		CommonFunctions.elementContainsText(accordion_UserFullName, userFirstName);
	}
	
	public void displayedContractsAccordion() throws Exception {
		CommonFunctions.elementDisplayed(accordion_Contracts);
	}
	
	public void displayedContractsLink() throws Exception {
		CommonFunctions.elementDisplayed(link_Contracts);
	}
	
	public void displayedEditUserProfileLink() throws Exception {
		CommonFunctions.elementDisplayed(link_EditUserProfile);
	}
	
	public void displayedHeaderProfilePictureImage() throws Exception {
		CommonFunctions.elementDisplayed(image_HeaderProfilePicture);
	}
	
	public void displayedLogoutLink() throws Exception {
		CommonFunctions.elementDisplayed(link_LogoutTop);
	}
	
	public void displayedMarkupRuleLink() throws Exception {
		CommonFunctions.elementDisplayed(link_MarkupRule);
	}
	
	public void displayedQueuePlaceSettingLink() throws Exception {
		CommonFunctions.elementDisplayed(link_QueuePlaceSetting);
	}
	
	public void displayedRecommendedItineraryLink() throws Exception {
		CommonFunctions.elementDisplayed(link_RecommendedItinerary);
	}
	
	public void displayedTicketingTimeLimitLink() throws Exception {
		CommonFunctions.elementDisplayed(link_TicketingTimeLimit);
	}
	
	public void displayedUploadCostLink() throws Exception {
		CommonFunctions.elementDisplayed(link_UploadCost);
	}
	
	public void displayedUploadPriceLink() throws Exception {
		CommonFunctions.elementDisplayed(link_UploadPrice);
	}
	
	public ApplicationSettingsPage clickApplicationSettingsLink() throws Exception {
		CommonFunctions.clickElement(link_ApplicationSetting);
		
		return new ApplicationSettingsPage();
	}
	
	public AuditTrailPage clickAuditTrailLink() throws Exception {
		CommonFunctions.clickElement(link_AuditTrail);
		
		return new AuditTrailPage();
	}
	
	public CommissionsPage clickCommissionsLink() throws Exception {
		CommonFunctions.clickElement(link_Commissions);
		
		return new CommissionsPage();
	}
	
	public ContractsPage clickContractsLink() throws Exception {
		CommonFunctions.clickElement(link_Contracts);
		
		return new ContractsPage();
	}
	
	public CustomersPage clickCustomersLink() throws Exception {
		CommonFunctions.clickElement(link_Customers);
		
		return new CustomersPage();
	}
	
	public LoginPage clickLogoutLink() throws Exception {
		CommonFunctions.clickElement(link_LogoutTop);
		
		return new LoginPage();
	}
	
	public MarkupRulesPage clickMarkupRuleLink() throws Exception {
		CommonFunctions.clickElement(link_MarkupRule);
		
		return new MarkupRulesPage();
	}
	
	public MenuConfigurationPage clickMenuConfigurationLink() throws Exception {
		CommonFunctions.clickElement(link_MenuConfiguration);
		
		return new MenuConfigurationPage();
	}
	
	public PromotionsPage clickPromotionsLink() throws Exception {
		CommonFunctions.clickElement(link_Promotions);
		CommonFunctions.pause(5000, false);
		
		return new PromotionsPage();
	}
	
	public QueuePlaceSettingsPage clickQueuePlaceSettingLink() throws Exception {
		CommonFunctions.clickElement(link_QueuePlaceSetting);
		
		return new QueuePlaceSettingsPage();
	}
	
	public RecommendedItinerariesPage clickRecommendedItineraryLink() throws Exception {
		CommonFunctions.clickElement(link_RecommendedItinerary);
		
		return new RecommendedItinerariesPage();
	}
	
	public SuppliersPage clickSuppliersLink() throws Exception {
		CommonFunctions.clickElement(link_Suppliers);
		
		return new SuppliersPage();
	}
	
	public TicketingTimeLimitsPage clickTicketingTimeLimitLink() throws Exception {
		CommonFunctions.clickElement(link_TicketingTimeLimit);
		
		return new TicketingTimeLimitsPage();
	}
	
	public UploadCostsPage clickUploadCostLink() throws Exception {
		CommonFunctions.clickElement(link_UploadCost);
		
		return new UploadCostsPage();
	}
	
	public UsersPage clickUsersLink() throws Exception {
		CommonFunctions.clickElement(link_Users);
		
		return new UsersPage();
	}
	
	public UserProfilePage clickEditUserProfileLink() throws Exception {
		CommonFunctions.clickElement(link_EditUserProfile);
		
		return new UserProfilePage();
	}
	
	public PriceMaintenancePage clickPriceMaintenanceLink() throws Exception {
		CommonFunctions.clickElement(link_PriceMainenance);
		
		return new PriceMaintenancePage();
	}
	
	public void displayedPriceMaintenanceLink() throws Exception {
		CommonFunctions.elementDisplayed(link_PriceMainenance);
	}
	
	public void hiddenPriceMaintenanceLink() throws Exception {
		CommonFunctions.elementAttributeContains(link_PriceMainenance.findElement(By.xpath(".//ancestor::div[@class = 'SubMenuContainer CloseMenu']")), "style", "display: none;");
	}
	
	// End - Actions
}