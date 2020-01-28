package steps;

import static org.junit.Assert.assertTrue;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AuditTrailPage;
import pages.CommissionRulesDetailsPage;
import pages.CommissionsPage;
import pages.ContractCostsDetailsPage;
import pages.ContractDetailsPage;
import pages.ContractsPage;
import pages.CustomerDetailsPage;
import pages.CustomersPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MarkupRuleDetailsPage;
import pages.MarkupRulesPage;
import pages.PriceMaintenancePage;
import pages.PromotionDetailsPage;
import pages.PromotionsPage;
import pages.QueuePlaceSettingDetailsPage;
import pages.QueuePlaceSettingsPage;
import pages.RecommendedItinerariesPage;
import pages.RecommendedItineraryDetailsPage;
import pages.SupplierDetailsPage;
import pages.SuppliersPage;
import pages.TicketingTimeLimitDetailsPage;
import pages.TicketingTimeLimitsPage;
import pages.UploadCostsPage;
import pages.UserDetailsPage;
import pages.UserProfilePage;
import pages.UsersPage;
import utilities.Base;
import utilities.CommonFunctions;

public class StepDefinitions extends Base {
	LoginPage loginPage;
	HomePage homePage;
	UserProfilePage userProfilePage;
	UsersPage usersPage;
	UserDetailsPage userDetailsPage;
	PromotionsPage promotionsPage;
	PromotionDetailsPage promotionDetailsPage;
	AuditTrailPage auditTrailPage;
	SuppliersPage suppliersPage;
	SupplierDetailsPage supplierDetailsPage;
	CustomersPage customersPage;
	CustomerDetailsPage customerDetailsPage;
	CommissionsPage commissionsPage;
	CommissionRulesDetailsPage commissionRulesDetailsPage;
	ContractsPage contractsPage;
	ContractDetailsPage contractDetailsPage;
	ContractCostsDetailsPage contractCostsDetailsPage;
	RecommendedItinerariesPage recommendedItinerariesPage;
	RecommendedItineraryDetailsPage recommendedItineraryDetailsPage;
	QueuePlaceSettingDetailsPage queuePlaceSettingDetailsPage;
	QueuePlaceSettingsPage queuePlaceSettingsPage;
	MarkupRulesPage markupRulesPage;
	MarkupRuleDetailsPage markupRuleDetailsPage;
	TicketingTimeLimitsPage ticketingTimeLimitsPage;
	TicketingTimeLimitDetailsPage ticketingTimeLimitDetailsPage;
	UploadCostsPage uploadCostsPage;
	PriceMaintenancePage priceMaintenancePage;
	String usedUserEmail;
	String usedPromotionName;
	String usedSupplierName;
	String usedCustomerName;
	String usedCommissionName;
	String usedCustomerEmail;
	String usedCustomerUsername;
	String usedContractName;
	String usedItineraryName;
	
	// Start - Functions
	@Before
	public void setup(Scenario scenario) {
		
	}
	
	@After
	public void tearDown(Scenario scenario) throws Exception {
		CommonFunctions.screenshotFailedTest(scenario);
		driver.quit();
	}
	
	// Start - Universal Functions
	@Then("^user is on \"(.*?)\" page$")
	public void user_is_on_page(String arg1) throws Throwable {
		CommonFunctions.checkPageTitle(arg1);
	}
	
	@Then("^user sees feedback message \"(.*?)\"$")
	public void user_sees_feedback_message(String arg1) throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayedEqualsToString(arg1);
	}
	
	@When("^user becomes inactive for \"(.*?)\" minutes$")
	public void user_becomes_inactive_for_minutes(Integer arg1) throws Throwable {
		CommonFunctions.pause(arg1, true);
	}
	
	@Then("^user sees no results in the table$")
	public void user_sees_no_results_in_the_table() throws Throwable {
		CommonFunctions.textVisibleInPage("No matching records found.");
	}
	
	@Then("^user sees all of the data in the table$")
	public void user_sees_all_of_the_data_in_the_table() throws Throwable {
		CommonFunctions.textHiddenInPage("No matching records found.");
	}
	
	@When("^user sees prompt message saying \"(.*?)\" and clicks on \"(.*?)\"$")
	public void user_sees_prompt_message_saying_and_clicks_on(String arg1, String arg2) throws Throwable {
		CommonFunctions.checkPopUpMessageDisplayed(arg1);
		CommonFunctions.clickOnPopUp(arg2);
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user does not see popup displayed$")
	public void user_does_not_see_popup_displayed() throws Throwable {
		CommonFunctions.checkPopUpNotDisplayed();
	}
	
	@Then("^user does not see feedback message \"([^\"]*)\"$")
	public void user_does_not_see_feedback_message(String arg1) throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//span[text() = '" + arg1 + "']");
	}
	
	@Then("^user sees error message \"(.*?)\"$")
	public void user_sees_error_message(String arg1) throws Throwable {
		CommonFunctions.textVisibleInPage(arg1);
	}
	
	@Then("^user does not see the error message \"([^\"]*)\"$")
	public void user_does_not_see_the_error_message(String arg1) throws Throwable {
		CommonFunctions.textHiddenInPage(arg1);
	}
	
	@When("^user removes the focus on the field$")
	public void user_removes_the_focus_on_the_field() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	@When("^user hits the escape key$")
	public void user_hits_the_escape_key() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	@When("^user presses the enter key$")
	public void user_presses_the_enter_key() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}
	
	@Then("^user sees prompt message saying \"([^\"]*)\"$")
	public void user_sees_prompt_message_saying(String arg1) throws Throwable {
		CommonFunctions.checkPopUpMessageDisplayed(arg1);
	}
	// End - Universal Functions
	
	// Start - APT Functions
	@When("^user selects an address in the address search field results$")
	public void user_selects_an_address_in_the_address_search_field_results() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@class, 'address-picklist')]//div)[2]")));
	}
	
	@When("^user decides to enter the address manually$")
	public void user_decides_to_enter_the_address_manually() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@class, 'use-address-entered')]")));
	}
	// End - APT Functions
	
	// Start - Login Page Functions
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		Base.initialization();
		
		loginPage = new LoginPage();
	}
	
	@When("^user logs into app$")
	public void user_logs_into_app() throws Throwable {
		if (driver.getCurrentUrl().contains("oxyadmin-test") || driver.getCurrentUrl().contains("apt-tst")) {
			loginPage.setEmailInput(prop.getProperty("primaryAccountEmail"));
			loginPage.setPasswordInput(prop.getProperty("primaryAccountPassword"));
		}
		else if (driver.getCurrentUrl().contains("oxyadmin-stg")) {
			loginPage.setEmailInput(prop.getProperty("stagingPrimaryAccountEmail"));
			loginPage.setPasswordInput(prop.getProperty("stagingPrimaryAccountPassword"));
		}
		
		homePage = loginPage.clickLoginButton();
	}
	
	@When("^user logs into app with invalid credentials$")
	public void user_logs_into_app_with_invalid_credentials() throws Throwable {
		loginPage.setEmailInput(prop.getProperty("primaryAccountEmail"));
		loginPage.setPasswordInput(prop.getProperty("wrongString"));
		
		homePage = loginPage.clickLoginButton();
	}
	
	@When("^user logs into app with invalid credentials \"(.*?)\" times$")
	public void user_logs_into_app_with_invalid_credentials_times(int arg1) throws Throwable {
		while (arg1 != 0) {
			loginPage.setEmailInput(prop.getProperty("lockedAccountEmail"));
			loginPage.setPasswordInput(prop.getProperty("wrongString"));
			
			homePage = loginPage.clickLoginButton();
			
			arg1--;
		}
	}
	
	@When("^user with view rights logs into app$")
	public void user_with_view_rights_logs_into_app() throws Throwable {
		if (driver.getCurrentUrl().contains("oxyadmin-test") || driver.getCurrentUrl().contains("apt-tst")) {
			loginPage.setEmailInput(prop.getProperty("secondaryAccountEmail"));
			loginPage.setPasswordInput(prop.getProperty("secondaryAccountPassword"));
		}
		else if (driver.getCurrentUrl().contains("oxyadmin-stg")) {
			loginPage.setEmailInput(prop.getProperty("stagingSecondaryAccountEmail"));
			loginPage.setPasswordInput(prop.getProperty("stagingSecondaryAccountPassword"));
		}
		
		homePage = loginPage.clickLoginButton();
	}
	// End - Login Page Functions
	
	// Start - Home Page Functions
	@Then("^user validates his account is logged in$")
	public void user_validates_his_account_is_logged_in() throws Throwable {
		homePage.containsValueUserFullNameAccordion(prop.getProperty("primaryAccountFirstName"));
	}
	
	@When("^user logs out of the app$")
	public void user_logs_out_of_the_app() throws Throwable {
		homePage.clickUserFullNameAccordion();
		
		loginPage = homePage.clickLogoutLink();
	}
	
	@When("^user navigates to user profile page$")
	public void user_navigates_to_user_profile_page() throws Throwable {
		homePage.clickUserFullNameAccordion();
		
		userProfilePage = homePage.clickEditUserProfileLink();
	}
	
	@Then("^user profile picture is displayed$")
	public void user_profile_picture_is_displayed() throws Throwable {
		homePage.displayedHeaderProfilePictureImage();
	}
	
	@When("^user clicks on user dropdown$")
	public void user_clicks_on_user_dropdown() throws Throwable {
		homePage.clickUserFullNameAccordion();
	}
	
	@Then("^user sees user profile menu$")
	public void user_sees_user_profile_menu() throws Throwable {
		homePage.displayedEditUserProfileLink();
		homePage.displayedLogoutLink();
		homePage.clickUserFullNameAccordion();
	}
	
	@When("^user navigates to users page$")
	public void user_navigates_to_users_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		homePage.clickAdministrationAccordion();
		
		usersPage = homePage.clickUsersLink();
	}
	
	@When("^user navigates to promotions page$")
	public void user_navigates_to_promotions_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		
		promotionsPage = homePage.clickPromotionsLink();
	}
	
	@When("^user navigates to audit trail page$")
	public void user_navigates_to_audit_trail_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		homePage.clickAdministrationAccordion();
		
		auditTrailPage = homePage.clickAuditTrailLink();
	}
	
	@When("^user navigates to suppliers page$")
	public void user_navigates_to_suppliers_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		
		suppliersPage = homePage.clickSuppliersLink();
	}
	
	@When("^user navigates to customers page$")
	public void user_navigates_to_customers_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		
		customersPage = homePage.clickCustomersLink();
	}
	
	@When("^user navigates to commissions page$")
	public void user_navigates_to_commissions_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		
		commissionsPage = homePage.clickCommissionsLink();
	}
	
	@When("^user goes to commissions page$")
	public void user_goes_to_commissions_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		commissionsPage = homePage.clickCommissionsLink();
	}
	
	@When("^user navigates to contracts page$")
	public void user_navigates_to_contracts_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickContractsAccordion();
		
		contractsPage = homePage.clickContractsLink();
	}
	
	@When("^user opens the air accordion$")
	public void user_opens_the_air_accordion() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickAirAccordion();
	}
	
	@Then("^user sees the sub menus of the air accordion$")
	public void user_sees_the_sub_menus_of_the_air_accordion() throws Throwable {
		homePage.displayedRecommendedItineraryLink();
		homePage.displayedMarkupRuleLink();
		homePage.displayedTicketingTimeLimitLink();
		homePage.displayedQueuePlaceSettingLink();
	}
	
	@When("^user navigates to recommended itinerary page$")
	public void user_navigates_to_recommended_itinerary_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickAirAccordion();
		
		recommendedItinerariesPage = homePage.clickRecommendedItineraryLink();
	}
	
	@When("^user navigates to queue place setting page$")
	public void user_navigates_to_queue_place_setting_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickAirAccordion();
		
		queuePlaceSettingsPage = homePage.clickQueuePlaceSettingLink();
	}
	
	@When("^user navigates to mark up rule page$")
	public void user_navigates_to_mark_up_rule_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickAirAccordion();
		
		markupRulesPage = homePage.clickMarkupRuleLink();
	}
	
	@When("^user navigates to ticketing time limit page$")
	public void user_navigates_to_ticketing_time_limit_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickAirAccordion();
		
		ticketingTimeLimitsPage = homePage.clickTicketingTimeLimitLink();
	}
	
	@Then("^user sees the contracts accordion and its sub-menu links$")
	public void user_sees_the_contracts_accordion_and_its_sub_menu_links() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		homePage.displayedContractsAccordion();
		homePage.clickContractsAccordion();
		homePage.displayedContractsLink();
		homePage.displayedUploadCostLink();
		homePage.displayedUploadPriceLink();
		homePage.clickContractsAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickUserFullNameAccordion();
	}
	
	@When("^user navigates to upload costs page$")
	public void user_navigates_to_upload_costs_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickContractsAccordion();
		
		uploadCostsPage = homePage.clickUploadCostLink();
	}
	
	@When("^user navigates to price maintenance page$")
	public void user_navigates_to_price_maintenance_page() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickContractsAccordion();
		
		priceMaintenancePage = homePage.clickPriceMaintenanceLink();
	}
	
	@Then("^user sees price maintenance under contracts$")
	public void user_sees_price_maintenance_under_contracts() throws Throwable {
		homePage.displayedPriceMaintenanceLink();
	}
	
	@Then("^user does not see price maintenance$")
	public void user_does_not_see_price_maintenance() throws Throwable {
		homePage.hiddenPriceMaintenanceLink();
	}
	
	@When("^user expands contracts accordion$")
	public void user_expands_contracts_accordion() throws Throwable {
		homePage.clickHamburgerAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickContractsAccordion();
	}
	
	@When("^user collapses contracts accordion$")
	public void user_collapses_contracts_accordion() throws Throwable {
		homePage.clickContractsAccordion();
		// homePage.clickModulesAccordion();
		homePage.clickUserFullNameAccordion();
	}
	
	@Then("^user sees the hamburger menu icon is displayed$")
	public void user_sees_the_hamburger_menu_icon_is_displayed() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//a[@class='Hamburger']")));
	}
	
	@When("^user clicks on the hamburger menu$")
	public void user_clicks_on_the_hamburger_menu() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//a[@class='Hamburger']")));
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user sees the hamburger menu is expanded$")
	public void user_sees_the_hamburger_menu_is_expanded() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class='Application_Menu']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[text()='Modules']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[text()='Administration']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//a[text()='Log out']")));
	}
	
	@Then("^user sees the selected menu is higlighted$")
	public void user_sees_the_selected_menu_is_higlighted() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//a[@title='View Contracts' and text()='Contracts']")), "style", "color");
	}
	
	@When("^user clicks on the header$")
	public void user_clicks_on_the_header() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id,'Header' ) and @class='Header']")));
	}
	
	@Then("^user sees the hamburger menu is collapsed$")
	public void user_sees_the_hamburger_menu_is_collapsed() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//div[@class = 'Application_Menu']/parent::div")), "style", "display: none");
	}
	// End - Home Page Functions
	
	// Start - User Profile Page Functions
	@Then("^user sees own information$")
	public void user_sees_own_information() throws Throwable {
		userProfilePage.displayedFirstName();
		userProfilePage.displayedLastName();
		userProfilePage.displayedOdysseyUserId();
		userProfilePage.displayedOdysseyUserName();
		userProfilePage.displayedProfilePicture();
	}
	
	@When("^user updates own information$")
	public void user_updates_own_information() throws Throwable {
		userProfilePage.setFirstNameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("primaryAccountFirstName")));
		userProfilePage.setLastNameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("primaryAccountLastName")));
		
		userProfilePage = userProfilePage.clickSaveButton();
	}
	
	@When("^user updates password$")
	public void user_updates_password() throws Throwable {
		userProfilePage.clickChangePasswordLink();
		userProfilePage.setCurrentPasswordInput(prop.getProperty("primaryAccountPassword"));
		userProfilePage.setNewPasswordInput(prop.getProperty("primaryAccountPassword"));
		userProfilePage.setVerifiedNewPasswordInput(prop.getProperty("primaryAccountPassword"));
		
		userProfilePage = userProfilePage.clickChangePasswordButton();
	}
	
	@When("^user updates password invalidly$")
	public void user_updates_password_invalidly() throws Throwable {
		userProfilePage.clickChangePasswordLink();
		userProfilePage.setCurrentPasswordInput(prop.getProperty("primaryAccountPassword"));
		userProfilePage.setNewPasswordInput(prop.getProperty("primaryAccountPassword"));
		userProfilePage.setVerifiedNewPasswordInput(prop.getProperty("wrongString"));
		
		userProfilePage = userProfilePage.clickChangePasswordButton();
	}
	// End - User Profile Page Functions
	
	// Start - Users Page Functions
	@When("^user navigates to new user creation page$")
	public void user_navigates_to_new_user_creation_page() throws Throwable {
		userDetailsPage = usersPage.clickAddNewUserButton();
	}
	
	@When("^user uses column filters to filter the users result$")
	public void user_uses_column_filters_to_filter_the_users_result() throws Throwable {
		usersPage.setLastNameFilterInput("Test");
		usersPage.setFirstNameFilterInput("Test");
		usersPage.setEmailFilterInput("aptours");
	}
	
	@When("^user removes the users column filters$")
	public void user_removes_the_users_column_filters() throws Throwable {
		usersPage.setLastNameFilterInput("");
		usersPage.setFirstNameFilterInput("");
		usersPage.setEmailFilterInput("");
	}
	
	@When("^user searches for an existing user")
	public void user_searches_for_an_existing_user() throws Throwable {
		usersPage.setSearchValueInput(prop.getProperty("lockedAccountEmail"));
		usersPage.clickFindButton();
	}
	
	@Then("^user sees the existing user in the table$")
	public void user_sees_the_existing_user_in_the_table() throws Throwable {
		usersPage.containsValueTopRowDataEmail(prop.getProperty("lockedAccountEmail"));
		usersPage.containsValueTopRowDataFirstName(prop.getProperty("lockedAccountFirstName"));
		usersPage.containsValueTopRowDataLastName(prop.getProperty("lockedAccountLastName"));
	}
	
	@When("^user searches for a user that is not existing$")
	public void user_searches_for_a_user_that_is_not_existing() throws Throwable {
		usersPage.setSearchValueInput(prop.getProperty("wrongString"));
		usersPage.clickFindButton();
	}
	
	@When("^user unlocks the existing user$")
	public void user_unlocks_the_existing_user() throws Throwable {
		usersPage.clickTopRowDataUnlockButton();
		
		String popUpMessage = "Unlock account for " + prop.getProperty("lockedAccountFirstName") + " " + prop.getProperty("lockedAccountLastName") + "?";
		
		CommonFunctions.checkPopUpMessageDisplayed(popUpMessage);
		CommonFunctions.clickOnPopUp("OK");
	}
	
	@When("^user resets the password of the existing user$")
	public void user_resets_the_password_of_the_existing_user() throws Throwable {
		usersPage.clickTopRowDataResetButton();
		
		String popUpMessage = "Reset password for " + prop.getProperty("lockedAccountFirstName") + " " + prop.getProperty("lockedAccountLastName") + "?";
		
		CommonFunctions.checkPopUpMessageDisplayed(popUpMessage);
		CommonFunctions.clickOnPopUp("OK");
	}
	
	@When("^user deactivates the existing user but cancels the request$")
	public void user_deactivates_the_existing_user_but_cancels_the_request() throws Throwable {
		usersPage.clickTopRowDataActiveButton();
		
		String popUpMessage = "Deactivate account for user " + prop.getProperty("lockedAccountFirstName") + " " + prop.getProperty("lockedAccountLastName") + "?";
		
		CommonFunctions.checkPopUpMessageDisplayed(popUpMessage);
		CommonFunctions.clickOnPopUp("Cancel");
	}
	
	@Then("^user sees that the user is still active$")
	public void user_sees_that_the_user_is_still_active() throws Throwable {
		usersPage.checkTopRowDataActive("Active");
	}
	
	@When("^user searches for a user to be updated$")
	public void user_searches_for_a_user_to_be_updated() throws Throwable {
		usersPage.setSearchValueInput(prop.getProperty("dummyUserEmail"));
		usersPage.clickFindButton();
		
		userDetailsPage = usersPage.clickTopRowDataEditButton();
	}
	
	@When("^user searches for a user to have his password reset$")
	public void user_searches_for_a_user_to_have_his_password_reset() throws Throwable {
		usersPage.setSearchValueInput(prop.getProperty("lockedAccountEmail"));
		usersPage.clickFindButton();
		
		userDetailsPage = usersPage.clickTopRowDataEditButton();
	}
	
	@When("^user searches for a user to be activated$")
	public void user_searches_for_a_user_to_be_activated() throws Throwable {
		usersPage.setSearchValueInput(prop.getProperty("dummyUserEmail"));
		usersPage.clickFindButton();
		
		userDetailsPage = usersPage.clickTopRowDataEditButton();
	}
	
	@When("^user searches for a user that is already activated$")
	public void user_searches_for_a_user_that_is_already_activated() throws Throwable {
		usersPage.setSearchValueInput(prop.getProperty("lockedAccountEmail"));
		usersPage.clickFindButton();
		
		userDetailsPage = usersPage.clickTopRowDataEditButton();
	}
	// End - Users Page Functions
	
	// Start - User Details Page Functions
	@Then("^user sees save button is disabled$")
	public void user_sees_save_button_is_disabled() throws Throwable {
		CommonFunctions.pause(2500, false);
		userDetailsPage.disabledSaveButton();
	}
	
	@When("^user creates a new user$")
	public void user_creates_a_new_user() throws Throwable {
		userDetailsPage.setOdysseyUserIdInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newUserOUID")));
		userDetailsPage.setFirstNameInput(prop.getProperty("newUserFirstName"));
		userDetailsPage.setLastNameInput(prop.getProperty("newUserLastName"));
		userDetailsPage.selectAdministerAccessValue(prop.getProperty("newUserAdministerAccess"));
		userDetailsPage.selectPromotionsAccessValue(prop.getProperty("newUserPromotionsAccess"));
		// userDetailsPage.selectPackagesAccessValue(prop.getProperty("newUserPackagesAccess"));
		userDetailsPage.selectCustomersAccessValue(prop.getProperty("newUserCustomersAccess"));
		userDetailsPage.selectSuppliersAccessValue(prop.getProperty("newUserSuppliersAccess"));
		
		usedUserEmail = userDetailsPage.setUserEmailInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newUserEmail")) + "@test.com");
		
		userDetailsPage.appendOdysseyUserIdInput();
		
		usersPage = userDetailsPage.clickSaveButton();
	}
	
	@When("^user creates a user that is already existing$")
	public void user_creates_a_user_that_is_already_existing() throws Throwable {
		userDetailsPage.setOdysseyUserIdInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newUserOUID")));
		userDetailsPage.setUserEmailInput(usedUserEmail);
		userDetailsPage.setFirstNameInput(prop.getProperty("newUserFirstName"));
		userDetailsPage.setLastNameInput(prop.getProperty("newUserLastName"));
		userDetailsPage.selectAdministerAccessValue(prop.getProperty("newUserAdministerAccess"));
		userDetailsPage.selectPromotionsAccessValue(prop.getProperty("newUserPromotionsAccess"));
		// userDetailsPage.selectPackagesAccessValue(prop.getProperty("newUserPackagesAccess"));
		userDetailsPage.selectCustomersAccessValue(prop.getProperty("newUserCustomersAccess"));
		userDetailsPage.selectSuppliersAccessValue(prop.getProperty("newUserSuppliersAccess"));
		userDetailsPage.appendOdysseyUserIdInput();
		
		usersPage = userDetailsPage.clickSaveButton();
	}
	
	@When("^user closes add user page$")
	public void user_closes_add_user_page() throws Throwable {
		usersPage = userDetailsPage.clickCloseButton();
	}
	
	@Then("^user sees user details information$")
	public void user_sees_user_details_information() throws Throwable {
		userDetailsPage.containsValueEmailInput(prop.getProperty("dummyUserEmail"));
		userDetailsPage.containsValueFirstNameInput("Test");
		userDetailsPage.containsValueLastNameInput("Test");
	}
	
	@When("^user updates user information$")
	public void user_updates_user_information() throws Throwable {
		userDetailsPage.appendOdysseyUserIdInput();
		
		usersPage = userDetailsPage.clickSaveButton();
	}
	
	@When("^user updates user email address$")
	public void user_updates_user_email_address() throws Throwable {
		usedUserEmail = userDetailsPage.setUserEmailInput(CommonFunctions.stringAppendDateTime(prop.getProperty("dummyUserEmail")) + "@test.com.au");
		usersPage = userDetailsPage.clickSaveButton();
	}
	
	@When("^user cleared a mandatory field$")
	public void user_cleared_a_mandatory_field() throws Throwable {
		userDetailsPage.setOdysseyUserIdInput("");
	}
	
	@When("^user sent a request for the link for the reset password$")
	public void user_sent_a_request_for_the_link_for_the_reset_password() throws Throwable {
		userDetailsPage.clickResetPasswordButton();
	}
	
	@When("^user sent a request for the link for the activation$")
	public void user_sent_a_request_for_the_link_for_the_activation() throws Throwable {
		userDetailsPage.clickResendActivationButton();
	}
	
	@Then("^user does not see the reactivation email button$")
	public void user_does_not_see_the_reactivation_email_button() throws Throwable {
		userDetailsPage.hiddenResendActivationButton();
	}
	
	@Then("^user sees feedback message a reset password email has been sent$")
	public void user_sees_feedback_message_a_reset_password_email_has_been_sent() throws Throwable {
		CommonFunctions.pause(2500, false);
		CommonFunctions.checkFeedbackMessageDisplayedContainsString("A Reset Password email has been sent to the user");
	}
	// End - User Details Page Functions
	
	// Start - Promotions Page Functions
	@When("^user sorts promotion$")
	public void user_sorts_promotion() throws Throwable {
		promotionsPage.clickIdColumnHeader();
		promotionsPage.clickCodeColumnHeader();
		promotionsPage.clickDescriptionColumnHeader();
		// promotionsPage.clickTypeColumnHeader();
		promotionsPage.clickClassificationColumnHeader();
		promotionsPage.clickStatusColumnHeader();
	}
	
	@When("^user uses column filters to filter the promotions result$")
	public void user_uses_column_filters_to_filter_the_promotions_result() throws Throwable {
		promotionsPage.setIdFilterInput("371");
		promotionsPage.setCodeFilterInput("APT");
		promotionsPage.setDescriptionFilterInput("NZD");
		// promotionsPage.setTypeFilterInput("Gen");
		promotionsPage.setClassificationFilterInput("Dollar");
		promotionsPage.setStatusFilterInput("Open");
	}
	
	@When("^user removes the promotions column filters$")
	public void user_removes_the_promotions_column_filters() throws Throwable {
		promotionsPage.setIdFilterInput("");
		promotionsPage.setCodeFilterInput("");
		promotionsPage.setDescriptionFilterInput("");
		// promotionsPage.setTypeFilterInput("");
		promotionsPage.setClassificationFilterInput("");
		promotionsPage.setStatusFilterInput("");
	}
	
	@When("^user searches for a promotion$")
	public void user_searches_for_a_promotion() throws Throwable {
		promotionsPage.setCodeInput(prop.getProperty("searchPromotionCode"));
		promotionsPage.clickFindButton();
	}
	
	@Then("^user sees the promotion$")
	public void user_sees_the_promotion() throws Throwable {
		promotionsPage.containsValueTopRowDataId(prop.getProperty("searchPromotionId"));
		promotionsPage.containsValueTopRowDataCode(prop.getProperty("searchPromotionCode"));
		promotionsPage.containsValueTopRowDataDescription(prop.getProperty("searchPromotionDescription"));
		// promotionsPage.containsValueTopRowDataType(prop.getProperty("searchPromotionType"));
		promotionsPage.containsValueTopRowDataClassification(prop.getProperty("searchPromotionClassification"));
		promotionsPage.containsValueTopRowDataStatus(prop.getProperty("searchPromotionStatus"));
	}
	
	@When("^user searches for a non existing promotion$")
	public void user_searches_for_a_non_existing_promotion() throws Throwable {
		promotionsPage.setCodeInput(prop.getProperty("wrongString"));
		promotionsPage.clickFindButton();
	}
	
	@When("^user uses the advance search to find a promotion$")
	public void user_uses_the_advance_search_to_find_a_promotion() throws Throwable {
		promotionsPage.setCodeInput(prop.getProperty("searchPromotionCode"));
		promotionsPage.setDescriptionInput(prop.getProperty("searchPromotionDescription"));
		promotionsPage.clickAdvancedFilterButton();
		promotionsPage.selectCustomerMarketValue(prop.getProperty("searchPromotionCustomerMarket"));
		promotionsPage.clickFindButton();
	}
	
	@When("^user resets the search results$")
	public void user_resets_the_search_results() throws Throwable {
		promotionsPage.clickResetButton();
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user navigates to add promotion page$")
	public void user_navigates_to_add_promotion_page() throws Throwable {
		promotionDetailsPage = promotionsPage.clickAddNewPromotionButton();
	}
	
	@When("^user opens the advanced search filters of the promotions$")
	public void user_opens_the_advanced_search_filters_of_the_promotions() throws Throwable {
		promotionsPage.clickAdvancedFilterButton();
	}
	
	@Then("^user sees allotment dropdown with its values$")
	public void user_sees_allotment_dropdown_with_its_values() throws Throwable {
		promotionsPage.clickAllotmentDropdown();
		CommonFunctions.textVisibleInPage("All");
		CommonFunctions.textVisibleInPage("Promotion Has Allotment");
		CommonFunctions.textVisibleInPage("Promotion Does Not Have Allotment");
	}
	
	@When("^user views the promotion$")
	public void user_views_the_promotion() throws Throwable {
		promotionDetailsPage = promotionsPage.clickTopRowDataViewButton();
	}
	
	@When("^user edits the promotion$")
	public void user_edits_the_promotion() throws Throwable {
		promotionDetailsPage = promotionsPage.clickTopRowDataEditButton();
	}
	
	@When("^user copies the promotion$")
	public void user_copies_the_promotion() throws Throwable {
		promotionDetailsPage = promotionsPage.clickTopRowDataCopyButton();
	}
	
	@When("^user searches for a promotion within a specific departure date$")
	public void user_searches_for_a_promotion_within_a_specific_departure_date() throws Throwable {
		promotionsPage.setCodeInput(prop.getProperty("searchPromotionCode"));
		promotionsPage.clickDepartureDateCheckbox();
		promotionsPage.setDepartureDateFromInput("18 Jan 2019");
		promotionsPage.setDepartureDateToInput("18 Jan 2019");
		promotionsPage.clickFindButton();
	}
	
	@When("^user double clicks on package textbox$")
	public void user_double_clicks_on_package_textbox() throws Throwable {
		promotionsPage.doubleClickPackageInput();
	}
	
	@Then("^user does not see list of package$")
	public void user_does_not_see_list_of_package() throws Throwable {
		promotionsPage.hiddenPackageListBox();
	}
	
	@When("^user double clicks on customer textbox$")
	public void user_double_clicks_on_customer_textbox() throws Throwable {
		promotionsPage.doubleClickCustomerInput();
	}
	
	@Then("^user does not see list of customer$")
	public void user_does_not_see_list_of_customer() throws Throwable {
		promotionsPage.hiddenCustomerListBox();
	}
	
	@Then("^user sees the tooltips on the functional icons when hovered$")
	public void user_sees_the_tooltips_on_the_functional_icons_when_hovered() throws Throwable {
		promotionsPage.containsValueTopRowDataCopyButtonTooltip("Copy");
		promotionsPage.containsValueTopRowDataEditButtonTooltip("Edit");
	}
	
	@When("^user selects a promotion with general promotion type to copy$")
	public void user_selects_a_promotion_with_general_promotion_type_to_copy() throws Throwable {
		promotionsPage.clickAdvancedFilterButton();
		promotionsPage.selectTypeValue("Gen Promotion");
		promotionsPage.clickFindButton();
		promotionDetailsPage = promotionsPage.clickTopRowDataCopyButton();
	}
	
	@When("^user selects a promotion with special fare type to copy$")
	public void user_selects_a_promotion_with_special_fare_type_to_copy() throws Throwable {
		promotionsPage.clickAdvancedFilterButton();
		promotionsPage.selectTypeValue("Special Fare");
		promotionsPage.clickFindButton();
		promotionDetailsPage = promotionsPage.clickTopRowDataCopyButton();
	}
	
	@Then("^user sees filter bars for certain promotion field dropdowns available$")
	public void user_sees_filter_bars_for_certain_promotion_field_dropdowns_available() throws Throwable {
		promotionsPage.clickBrandDropdown();
		promotionsPage.displayedDropdownFilter();
		promotionsPage.clickTourMarketDropdown();
		promotionsPage.displayedDropdownFilter();
		promotionsPage.clickCustomerMarketDropdown();
		promotionsPage.displayedDropdownFilter();
		promotionsPage.clickCountryDropdown();
		promotionsPage.displayedDropdownFilter();
		promotionsPage.clickStateDropdown();
		promotionsPage.displayedDropdownFilter();
		promotionsPage.clickCategoryDropdown();
		promotionsPage.displayedDropdownFilter();
		promotionsPage.clickClassificationDropdown();
		promotionsPage.displayedDropdownFilter();
	}
	
	@When("^user edits the promotion with promotion combinability$")
	public void user_edits_the_promotion_with_promotion_combinability() throws Throwable {
		promotionsPage.setCodeInput(prop.getProperty("searchPromotionCodePromoCombiAble"));
		promotionsPage.clickFindButton();
		
		promotionDetailsPage = promotionsPage.clickTopRowDataEditButton();
	}
	
	@When("^user searches for a promotion that is closed$")
	public void user_searches_for_a_promotion_that_is_closed() throws Throwable {
		promotionsPage.setCodeInput(prop.getProperty("searchPromotionCodePromoCombiNotAble"));
		promotionsPage.clickAdvancedFilterButton();
		promotionsPage.selectStatusValue("Closed");
		promotionsPage.clickFindButton();
		
		promotionDetailsPage = promotionsPage.clickTopRowDataViewButton();
	}
	
	@When("^user searches for a combinable promotion$")
	public void user_searches_for_a_combinable_promotion() throws Throwable {
		promotionsPage.setCodeInput(prop.getProperty("searchPromotionCodePromoCombiAble"));
		promotionsPage.clickFindButton();
		
		promotionDetailsPage = promotionsPage.clickTopRowDataViewButton();
	}
	
	@When("^user selects a promotion with special fare type to view$")
	public void user_selects_a_promotion_with_special_fare_type_to_view() throws Throwable {
		promotionsPage.clickAdvancedFilterButton();
		promotionsPage.selectTypeValue("Special Fare");
		promotionsPage.clickFindButton();
		
		promotionDetailsPage = promotionsPage.clickTopRowDataViewButton();
	}
	
	@When("^user searches for a promotion that in the internal discount category$")
	public void user_searches_for_a_promotion_that_in_the_internal_discount_category() throws Throwable {
		promotionsPage.setCodeInput(prop.getProperty("searchPromotionCodePromoCombiAbleInternal"));
		promotionsPage.clickFindButton();
	}
	
	@When("^user edits a general promotion$")
	public void user_edits_a_general_promotion() throws Throwable {
		promotionsPage.clickAdvancedFilterButton();
		promotionsPage.selectTypeValue("Gen Promotion");
		promotionsPage.clickFindButton();
		promotionsPage.clickTopRowDataEditButton();
	}
	
	@Then("^user sees feedback message Promotion ID \"(.*?)\" displayed$")
	public void user_sees_feedback_message_Promotion_ID_displayed(String arg1) throws Throwable {
		CommonFunctions.pause(2500, false);
		CommonFunctions.checkFeedbackMessageDisplayedContainsString(arg1);
	}
	
	@When("^user searches for the newly added promotion$")
	public void user_searches_for_the_newly_added_promotion() throws Throwable {
		promotionsPage.setCodeInput(usedPromotionName);
		promotionsPage.clickFindButton();
	}
	
	@When("^user searches for the recently updated promotion$")
	public void user_searches_for_the_recently_updated_promotion() throws Throwable {
		promotionsPage.setCodeInput(usedPromotionName);
		promotionsPage.clickAdvancedFilterButton();
		promotionsPage.selectStatusValue("Closed");
		promotionsPage.clickFindButton();
	}
	
	@When("^user searches for a promotion with the revenue location air$")
	public void user_searches_for_a_promotion_with_the_revenue_location_air() throws Throwable {
		promotionsPage.clickAdvancedFilterButton();
		promotionsPage.selectRevenueAllocationValue("Air");
		promotionsPage.clickFindButton();
	}
	
	@Then("^user does not see the type column in the promotions table$")
	public void user_does_not_see_the_type_column_in_the_promotions_table() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//span[text() = 'Type']");
	}
	// End - Promotions Page Functions
	
	// Start - Promotion Details Page Functions
	@When("^user provides necessary and valid information for the new promotion$")
	public void user_provides_necessary_and_valid_information_for_the_new_promotion() throws Throwable {
		user_provides_basic_information();
		user_provides_suppliers();
		user_provides_comments();
		user_selects_main_as_the_market_offer();
		user_provides_date_ranges();
		promotionDetailsPage.clickPaymentRulesAccordion();
		promotionDetailsPage.clickPaymentRulesSectionFirstDepositDueDateOverrideNoOfDaysCheckbox();
		promotionDetailsPage.setPaymentRulesSectionFirstDepositOverrideNoOfDaysInput(prop.getProperty("newPromotionFirstDepositOverrideNoOfDays"));
	}
	
	@When("^user provides necessary information for the copied promotion$")
	public void user_provides_necessary_information_for_the_copied_promotion() throws Throwable {
		promotionDetailsPage.setCodeInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newPromotionCode")));
		promotionDetailsPage.setDescriptionInput(prop.getProperty("newPromotionDescription"));
		user_selects_main_as_the_market_offer();
		user_selects_a_promotion_combinability_group();
	}
	
	@When("^user provides basic information$")
	public void user_provides_basic_information() throws Throwable {
		promotionDetailsPage.setCodeInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newPromotionCode")));
		promotionDetailsPage.selectRevenueAllocationValue(prop.getProperty("newPromotionRevenueAllocation"));
		promotionDetailsPage.setDescriptionInput(prop.getProperty("newPromotionDescription"));
		promotionDetailsPage.clickInternalSaleCheckbox();
		promotionDetailsPage.selectAssignValue(prop.getProperty("newPromotionAssign"));
		promotionDetailsPage.selectCategoryValue(prop.getProperty("newPromotionCategory"));
		promotionDetailsPage.selectClassificationValue(prop.getProperty("newPromotionClassification"));
		promotionDetailsPage.selectActionValue(prop.getProperty("newPromotionAction"));
		promotionDetailsPage.setOverrideDefaultCommissionInput(prop.getProperty("newPromotionOverrideDefaultCommission"));
	}
	
	@When("^user provides date ranges$")
	public void user_provides_date_ranges() throws Throwable {
		promotionDetailsPage.clickDateRangeAccordion();
		promotionDetailsPage.setDateRangeSectionDateFromInput("18 Dec 2018");
		promotionDetailsPage.setDateRangeSectionDateToInput("19 Dec 2018");
		promotionDetailsPage.clickDateRangeSectionAddDateRangeButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("20 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("21 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.clickDateRangePopupSaveButton();
	}
	
	@When("^user provides suppliers$")
	public void user_provides_suppliers() throws Throwable {
		promotionDetailsPage.selectSupplierValue(prop.getProperty("newPromotionSupplier"));
	}
	
	@When("^user provides comments$")
	public void user_provides_comments() throws Throwable {
		promotionDetailsPage.setInvoiceDescriptionInput(prop.getProperty("newPromotionInvoiceDescription"));
	}
	
	@When("^user saves the promotion$")
	public void user_saves_the_promotion() throws Throwable {
		CommonFunctions.pause(5000, false);
		promotionsPage = promotionDetailsPage.clickBottomSavePromotionButton();
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user saves the promotion data$")
	public void user_saves_the_promotion_data() throws Throwable {
		promotionsPage = promotionDetailsPage.clickTopSavePromotionButton();
	}
	
	@When("^user expands the customer accordion$")
	public void user_expands_the_customer_accordion() throws Throwable {
		promotionDetailsPage.clickCustomerAccordion();
	}
	
	@When("^user opens the add customer popup$")
	public void user_opens_the_add_customer_popup() throws Throwable {
		promotionDetailsPage.clickCustomerSectionAddCustomerButton();
	}
	
	@When("^user searches for a customer in the customer popup$")
	public void user_searches_for_a_customer_in_the_customer_popup() throws Throwable {
		promotionDetailsPage.setCustomerPopupNameInput(prop.getProperty("searchPromotionCustomerName"));
		promotionDetailsPage.clickCustomerPopupFindButton();
	}
	
	@Then("^user sees the customer information in the table of the customer popup$")
	public void user_sees_the_customer_information_in_the_table_of_the_customer_popup() throws Throwable {
		promotionDetailsPage.containsValueCustomerPopupTopRowDataName(prop.getProperty("searchPromotionCustomerName"));
	}
	
	@When("^user adds a customer to the promotion$")
	public void user_adds_a_customer_to_the_promotion() throws Throwable {
		promotionDetailsPage.clickCustomerPopupCheckBox();
		promotionDetailsPage.clickCustomerPopupAddButton();
	}
	
	@Then("^user sees the customer in the list under the promotion$")
	public void user_sees_the_customer_in_the_list_under_the_promotion() throws Throwable {
		CommonFunctions.textVisibleInPage(prop.getProperty("searchPromotionCustomerName"));
	}
	
	@When("^user searches for a customer in the customer popup that is not existing$")
	public void user_searches_for_a_customer_in_the_customer_popup_that_is_not_existing() throws Throwable {
		promotionDetailsPage.setCustomerPopupNameInput(prop.getProperty("wrongString"));
		promotionDetailsPage.clickCustomerPopupFindButton();
	}
	
	@When("^user closes the customer popup$")
	public void user_closes_the_customer_popup() throws Throwable {
		promotionDetailsPage.clickCustomerPopupCancelButton();
	}
	
	@When("^user deletes a customer from the promotion$")
	public void user_deletes_a_customer_from_the_promotion() throws Throwable {
		promotionDetailsPage.clickCustomerSectionDeleteCustomerButton();
	}
	
	@Then("^user does not see the customer in the list under the promotion$")
	public void user_does_not_see_the_customer_in_the_list_under_the_promotion() throws Throwable {
		CommonFunctions.textHiddenInPage(prop.getProperty("searchPromotionCustomerName"));
	}
	
	@When("^user expands the package accordion$")
	public void user_expands_the_package_accordion() throws Throwable {
		promotionDetailsPage.clickPackageAccordion();
	}
	
	@When("^user opens the add package popup$")
	public void user_opens_the_add_package_popup() throws Throwable {
		promotionDetailsPage.clickPackageSectionAddPackageButton();
	}
	
	@When("^user searches for a package$")
	public void user_searches_for_a_package() throws Throwable {
		promotionDetailsPage.setPackagePopupNameInput(prop.getProperty("searchPromotionPackageName"));
		promotionDetailsPage.clickPackagePopupFindButton();
	}
	
	@Then("^user sees the package information in the table$")
	public void user_sees_the_package_information_in_the_table() throws Throwable {
		promotionDetailsPage.containsValuePackagePopupTopRowDataName(prop.getProperty("searchPromotionPackageName"));
	}
	
	@When("^user adds a package to the promotion$")
	public void user_adds_a_package_to_the_promotion() throws Throwable {
		promotionDetailsPage.clickPackagePopupTopRowDataCheckBox();
		promotionDetailsPage.clickPackagePopupAddButton();
	}
	
	@Then("^user sees the package in the list under the promotion$")
	public void user_sees_the_package_in_the_list_under_the_promotion() throws Throwable {
		CommonFunctions.textVisibleInPage(prop.getProperty("searchPromotionPackageName"));
	}
	
	@When("^user searches for a package that is not existing$")
	public void user_searches_for_a_package_that_is_not_existing() throws Throwable {
		promotionDetailsPage.setPackagePopupNameInput(prop.getProperty("wrongString"));
		promotionDetailsPage.clickPackagePopupFindButton();
	}
	
	@When("^user closes the package popup$")
	public void user_closes_the_package_popup() throws Throwable {
		promotionDetailsPage.clickPackagePopupCancelButton();
	}
	
	@When("^user deletes a package from the promotion$")
	public void user_deletes_a_package_from_the_promotion() throws Throwable {
		promotionDetailsPage.clickPackageSectionDeletePackageButton();
	}
	
	@Then("^user does not see the package in the list$")
	public void user_does_not_see_the_package_in_the_list() throws Throwable {
		CommonFunctions.textHiddenInPage(prop.getProperty("searchPromotionPackageName"));
	}
	
	@When("^user changes the promotion type to special fare$")
	public void user_changes_the_promotion_type_to_special_fare() throws Throwable {
		promotionDetailsPage.selectTypeValue("Special Fare");
	}
	
	@Then("^user sees contract section$")
	public void user_sees_contract_section() throws Throwable {
		promotionDetailsPage.displayedContractAccordion();
	}
	
	@When("^user expands the contract accordion$")
	public void user_expands_the_contract_accordion() throws Throwable {
		promotionDetailsPage.clickContractAccordion();
	}
	
	@When("^user opens the add contract popup$")
	public void user_opens_the_add_contract_popup() throws Throwable {
		promotionDetailsPage.clickContractSectionAddContractButton();
	}
	
	@When("^user searches for a contract for the promotion$")
	public void user_searches_for_a_contract_for_the_promotion() throws Throwable {
		promotionDetailsPage.setContractPopupNameInput(prop.getProperty("searchPromotionContractName"));
		promotionDetailsPage.clickContractPopupFindButton();
	}
	
	@Then("^user sees the contract information in the table$")
	public void user_sees_the_contract_information_in_the_table() throws Throwable {
		promotionDetailsPage.containsValueContractPopupTopRowDataName(prop.getProperty("searchPromotionContractName"));
	}
	
	@When("^user adds a contract to the promotion$")
	public void user_adds_a_contract_to_the_promotion() throws Throwable {
		promotionDetailsPage.clickContractPopupName();
		promotionDetailsPage.clickContractPopupAddButton();
	}
	
	@Then("^user sees the contract in the list under the promotion$")
	public void user_sees_the_contract_in_the_list_under_the_promotion() throws Throwable {
		CommonFunctions.textVisibleInPage(prop.getProperty("searchPromotionContractName"));
	}
	
	@When("^user searches for a contract that is not existing$")
	public void user_searches_for_a_contract_that_is_not_existing() throws Throwable {
		promotionDetailsPage.setContractPopupNameInput(prop.getProperty("wrongString"));
		promotionDetailsPage.clickContractPopupFindButton();
	}
	
	@When("^user closes the contract popup$")
	public void user_closes_the_contract_popup() throws Throwable {
		promotionDetailsPage.clickContractPopupCancelButton();
	}
	
	@When("^user deletes a contract from the promotion$")
	public void user_deletes_a_contract_from_the_promotion() throws Throwable {
		promotionDetailsPage.clickContractSectionDeleteContractButton();
	}
	
	@Then("^user does not see the contract in the list of customers$")
	public void user_does_not_see_the_contract_in_the_list_of_customers() throws Throwable {
		CommonFunctions.textHiddenInPage(prop.getProperty("searchPromotionContractName"));
	}
	
	@When("^user expands the supplier accordion$")
	public void user_expands_the_supplier_accordion() throws Throwable {
		promotionDetailsPage.clickSupplierAccordion();
	}
	
	@When("^user searches for a supplier in the table of the popup$")
	public void user_searches_for_a_supplier_in_the_table_of_the_popup() throws Throwable {
		promotionDetailsPage.setSupplierPopupNameInput(prop.getProperty("searchPromotionSupplierName"));
		promotionDetailsPage.clickSupplierPopupFindButton();
	}
	
	@Then("^user sees the supplier information in the table of the popup$")
	public void user_sees_the_supplier_information_in_the_table_of_the_popup() throws Throwable {
		promotionDetailsPage.containsValueSupplierPopupTopRowDataName(prop.getProperty("searchPromotionSupplierName"));
	}
	
	@When("^user adds a supplier to the promotion$")
	public void user_adds_a_supplier_to_the_promotion() throws Throwable {
		promotionDetailsPage.clickSupplierPopupName();
		promotionDetailsPage.clickSupplierPopupAddButton();
	}
	
	@Then("^user sees the supplier in the list under the promotion$")
	public void user_sees_the_supplier_in_the_list_under_the_promotion() throws Throwable {
		CommonFunctions.textVisibleInPage(prop.getProperty("searchPromotionSupplierName"));
	}
	
	@Then("^user sees promotion status dropdown with its values$")
	public void user_sees_promotion_status_dropdown_with_its_values() throws Throwable {
		promotionDetailsPage.clickStatusDropdown();
		CommonFunctions.textVisibleInPage("Open");
		CommonFunctions.textVisibleInPage("Closed");
	}
	
	@When("^user closes the promotion details page$")
	public void user_closes_the_promotion_details_page() throws Throwable {
		promotionsPage = promotionDetailsPage.clickTopCloseButton();
	}
	
	@Then("^user sees promotion id$")
	public void user_sees_promotion_id() throws Throwable {
		CommonFunctions.textVisibleInPage(prop.getProperty("searchPromotionId"));
	}
	
	@When("^user expands the allotment accordion$")
	public void user_expands_the_allotment_accordion() throws Throwable {
		promotionDetailsPage.clickAllotmentAccordion();
	}
	
	@Then("^user sees allotment options$")
	public void user_sees_allotment_options() throws Throwable {
		promotionDetailsPage.displayedAllotmentSectionInventoryPoolDropdown();
		promotionDetailsPage.displayedAllotmentSectionAllotmentCodeDropdown();
		promotionDetailsPage.displayedAllotmentSectionNoOfDaysOffsetInput();
	}
	
	@Then("^user does not see allotment accordion$")
	public void user_does_not_see_allotment_accordion() throws Throwable {
		promotionDetailsPage.hiddenAllotmentAccordion();
	}
	
	@Then("^user sees customer dropdowns defaulted to all$")
	public void user_sees_customer_dropdowns_defaulted_to_all() throws Throwable {
		promotionDetailsPage.containsValueCustomerPopupCountryDropdown("All");
		promotionDetailsPage.containsValueCustomerPopupStateDropdown("All");
	}
	
	@When("^user selects a specific customer market$")
	public void user_selects_a_specific_customer_market() throws Throwable {
		promotionDetailsPage.clickCustomerSectionMarketDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'customerMarketDropdown')]//parent::label[contains(text(), 'Select All')]")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'customerMarketDropdown')]//parent::label//span[contains(text(), 'Asia')]")));
	}
	
	@When("^user selects a specific customer type$")
	public void user_selects_a_specific_customer_type() throws Throwable {
		promotionDetailsPage.clickCustomerSectionTypeDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'customerTypeDropdown')]//parent::label[contains(text(), 'Select All')]")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'customerTypeDropdown')]//parent::label//span[contains(text(), 'Travel Agent')]")));
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user sees customer market dropdown changed back to all$")
	public void user_sees_customer_market_dropdown_changed_back_to_all() throws Throwable {
		promotionDetailsPage.containsValueCustomerPopupMarketDropdown("All Selected");
	}
	
	@Then("^user sees package popup dropdowns defaulted to All$")
	public void user_sees_package_popup_dropdowns_defaulted_to_All() throws Throwable {
		promotionDetailsPage.containsValuePackagePopupBrandDropdown("All");
		promotionDetailsPage.containsValuePackagePopupTourMarketDropdown("All");
		promotionDetailsPage.containsValuePackagePopupTypeDropdown("All");
		promotionDetailsPage.containsValuePackagePopupTourClassDropdown("All");
	}
	
	@When("^user searches packages without putting any filters$")
	public void user_searches_packages_without_putting_any_filters() throws Throwable {
		promotionDetailsPage.clickPackagePopupFindButton();
	}
	
	@When("^user searches contract without putting any filters$")
	public void user_searches_contract_without_putting_any_filters() throws Throwable {
		promotionDetailsPage.clickContractPopupFindButton();
	}
	
	@Then("^user does not see tour classification and tour length dropdowns$")
	public void user_does_not_see_tour_classification_and_tour_length_dropdowns() throws Throwable {
		promotionDetailsPage.hiddenPackageSectionTourClassificationDropdown();
		promotionDetailsPage.hiddenPackageSectionTourLengthDropdown();
	}
	
	@When("^user enables minimum pax and puts invalid number of pax$")
	public void user_enables_minimum_pax_and_puts_invalid_number_of_pax() throws Throwable {
		promotionDetailsPage.clickMinimumPaxCheckBox();
		promotionDetailsPage.setMinimumPaxInput("1");
	}
	
	@Then("^user does not see promotion group$")
	public void user_does_not_see_promotion_group() throws Throwable {
		CommonFunctions.textHiddenInPage("Promotion Group");
	}
	
	@When("^user expands the payment rules accordion$")
	public void user_expands_the_payment_rules_accordion() throws Throwable {
		promotionDetailsPage.clickPaymentRulesAccordion();
	}
	
	@When("^user enables final due applicable and puts necessary information$")
	public void user_enables_final_due_applicable_and_puts_necessary_information() throws Throwable {
		promotionDetailsPage.clickPaymentRulesSectionFinalDueApplicableCheckbox();
		promotionDetailsPage.selectPaymentRulesSectionFinalDueTypeValue("Fixed Date");
	}
	
	@When("^user decides to enable early payment discount$")
	public void user_decides_to_enable_early_payment_discount() throws Throwable {
		promotionDetailsPage.clickPaymentRulesSectionEarlyPaymentDiscountCheckbox();
	}
	
	@Then("^user sees that final due type is defaulted to before departure date$")
	public void user_sees_that_final_due_type_is_defaulted_to_before_departure_date() throws Throwable {
		promotionDetailsPage.containsValuePaymentRulesSectionFinalDueTypeDropdown("Before Departure Date");
	}
	
	@Then("^user sees the description field empty$")
	public void user_sees_the_description_field_empty() throws Throwable {
		promotionDetailsPage.containsValueDescriptionInput("");
	}
	
	@Then("^user sees the promotion code field empty$")
	public void user_sees_the_promotion_code_field_empty() throws Throwable {
		promotionDetailsPage.containsValueCodeInput("");
	}
	
	@When("^user provides necessary information for the new promotion but puts an invalid data on override promotion line commission$")
	public void user_provides_necessary_information_for_the_new_promotion_but_puts_an_invalid_data_on_override_promotion_line_commission() throws Throwable {
		user_provides_basic_information();
		user_provides_suppliers();
		user_provides_comments();
		promotionDetailsPage.clickOverridePromotionLineCommissionCheckbox();
		promotionDetailsPage.setOverridePromotionLineCommissionInput("101");
		user_provides_date_ranges();
	}
	
	@Then("^user sees status dropdown in supplier popup$")
	public void user_sees_status_dropdown_in_supplier_popup() throws Throwable {
		promotionDetailsPage.clickSupplierPopupStatusDropdown();
		CommonFunctions.textVisibleInPage("Active");
		CommonFunctions.textVisibleInPage("Inactive");
	}
	
	@Then("^user sees the tooltip on the remove supplier icon when hovered$")
	public void user_sees_the_tooltip_on_the_remove_supplier_icon_when_hovered() throws Throwable {
		promotionDetailsPage.containsValueSupplierSectionDeleteButtonTooltip("Remove");
	}
	
	@When("^user searches for packages that has a specific brand$")
	public void user_searches_for_packages_that_has_a_specific_brand() throws Throwable {
		promotionDetailsPage.selectPackagePopupBrandValue("APT");
		promotionDetailsPage.clickPackagePopupFindButton();
	}
	
	@When("^user adds the packages in the table$")
	public void user_adds_the_packages_in_the_table() throws Throwable {
		promotionDetailsPage.clickPackagePopupAllRowDataCheckBox();
		promotionDetailsPage.clickPackagePopupAddButton();
	}
	
	@Then("^user sees 20 packages added to the promotion$")
	public void user_sees_packages_added_to_the_promotion() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//a[contains(@id, 'PackageSearchTableRecords')])[20]")));
	}
	
	@When("^user tries to add packages without selecting to the promotions$")
	public void user_tries_to_add_packages_without_selecting_to_the_promotions() throws Throwable {
		promotionDetailsPage.clickPackagePopupAddButton();
	}
	
	@When("^user expands the market accordion$")
	public void user_expands_the_market_accordion() throws Throwable {
		promotionDetailsPage.clickMarketAccordion();
	}
	
	@Then("^user sees on department dropdown that values are appended with the office associated to it$")
	public void user_sees_on_department_dropdown_that_values_are_appended_with_the_office_associated_to_it() throws Throwable {
		promotionDetailsPage.clickMarketSectionDepartmentDropdown();
		
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//input[contains(@data-name, 'DepartmentsMultipleDropdown')]//parent::label//span[contains(text(), 'APT Cheltenham - CCR Res')]")));
	}
	
	@When("^user searches without putting any filters$")
	public void user_searches_without_putting_any_filters() throws Throwable {
		promotionDetailsPage.clickPackagePopupFindButton();
	}
	
	@Then("^user does not see Rounding Rule and Rounding amount fields$")
	public void user_does_not_see_Rounding_Rule_and_Rounding_amount_fields() throws Throwable {
		promotionDetailsPage.hiddenRoundingRuleDropdown();
		promotionDetailsPage.hiddenRoundingAmountInput();
	}
	
	@When("^user does not see cabin category dropdown$")
	public void user_does_not_see_cabin_category_dropdown() throws Throwable {
		promotionDetailsPage.hiddenPackageSectionCabinCategoryDropdown();
	}
	
	@Then("^user sees cabin category dropdown$")
	public void user_sees_cabin_category_dropdown() throws Throwable {
		CommonFunctions.textVisibleInPage("Cabin Category");
	}
	
	@When("^user searches for customers in a specific country$")
	public void user_searches_for_customers_in_a_specific_country() throws Throwable {
		promotionDetailsPage.selectCustomerPopupCountryValue("NEW ZEALAND");
		promotionDetailsPage.clickCustomerPopupFindButton();
	}
	
	@When("^user adds the customers in the table$")
	public void user_adds_the_customers_in_the_table() throws Throwable {
		promotionDetailsPage.clickCustomerPopupAllRowDataCheckBox();
		promotionDetailsPage.clickCustomerPopupAddButton();
	}
	
	@Then("^user sees 20 customers added to the promotion$")
	public void user_sees_customers_added_to_the_promotion() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//a[contains(@id, 'customerSearchTableRecords')])[20]")));
	}
	
	@When("^user tries to add customers without selecting to the promotions$")
	public void user_tries_to_add_customers_without_selecting_to_the_promotions() throws Throwable {
		promotionDetailsPage.clickCustomerPopupAddButton();
	}
	
	@Then("^user sees date ranges accordion$")
	public void user_sees_date_ranges_accordion() throws Throwable {
		promotionDetailsPage.displayedDateRangeAccordion();
	}
	
	@When("^user expands the date ranges accordion$")
	public void user_expands_the_date_ranges_accordion() throws Throwable {
		promotionDetailsPage.clickDateRangeAccordion();
	}
	
	@Then("^user sees date range dropdown defaulted to booking date$")
	public void user_sees_date_range_dropdown_defaulted_to_booking_date() throws Throwable {
		promotionDetailsPage.containsValueDateRangeSectionDropdown("Booking Date");
	}
	
	@When("^user adds an empty date range$")
	public void user_adds_an_empty_date_range() throws Throwable {
		promotionDetailsPage.clickDateRangeSectionAddDateRangeButton();
	}
	
	@When("^user adds a date range with the start date is greater than the end date$")
	public void user_adds_a_date_range_with_the_start_date_is_greater_than_the_end_date() throws Throwable {
		promotionDetailsPage.setDateRangeSectionDateFromInput("18 Dec 2018");
		promotionDetailsPage.setDateRangeSectionDateToInput("17 Dec 2018");
		promotionDetailsPage.clickDateRangeSectionAddDateRangeButton();
	}
	
	@When("^user adds a valid date range$")
	public void user_adds_a_valid_date_range() throws Throwable {
		promotionDetailsPage.setDateRangeSectionDateFromInput("18 Dec 2018");
		promotionDetailsPage.setDateRangeSectionDateToInput("19 Dec 2018");
		promotionDetailsPage.clickDateRangeSectionAddDateRangeButton();
	}
	
	@Then("^user sees booking date range popup$")
	public void user_sees_booking_date_range_popup() throws Throwable {
		promotionDetailsPage.displayedDateRangePopupLabel();
	}
	
	@Then("^user sees suggestions based on packages$")
	public void user_sees_suggestions_based_on_packages() throws Throwable {
		promotionDetailsPage.displayedDateRangePopupSuggestionsDropdown();
	}
	
	@When("^user removes the existing packages in the promotion$")
	public void user_removes_the_existing_packages_in_the_promotion() throws Throwable {
		promotionDetailsPage.clickDateRangePopupCancelButton();
		promotionDetailsPage.clickPackageSectionDeletePackageButton();
	}
	
	@Then("^user does not see any suggested dates based on packages$")
	public void user_does_not_see_any_suggested_dates_based_on_packages() throws Throwable {
		promotionDetailsPage.hiddenDateRangePopupSuggestionsDropdown();
	}
	
	@When("^user adds an empty departure date range on the booking date range popup$")
	public void user_adds_an_empty_departure_date_range_on_the_booking_date_range_popup() throws Throwable {
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("");
		promotionDetailsPage.clickDateRangePopupAddButton();
	}
	
	@When("^user adds a departure date range with the start date is greater than the end date on the booking date range popup$")
	public void user_adds_a_departure_date_range_with_the_start_date_is_greater_than_the_end_date_on_the_booking_date_range_popup() throws Throwable {
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("18 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("17 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
	}
	
	@When("^user adds a valid departure date range on the booking date range popup$")
	public void user_adds_a_valid_departure_date_range_on_the_booking_date_range_popup() throws Throwable {
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("20 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("21 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
	}
	
	@When("^user adds a departure date range that falls between the existing departure date ranges on the booking date range popup$")
	public void user_adds_a_departure_date_range_that_falls_between_the_existing_departure_date_ranges_on_the_booking_date_range_popup() throws Throwable {
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("19 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("20 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
	}
	
	@When("^user removes a departure date range on the booking date range popup$")
	public void user_removes_a_departure_date_range_on_the_booking_date_range_popup() throws Throwable {
		promotionDetailsPage.clickDateRangePopupRemoveButton();
	}
	
	@Then("^user does not see departure date range deleted on the booking date range popup$")
	public void user_does_not_see_departure_date_range_deleted_on_the_booking_date_range_popup() throws Throwable {
		promotionDetailsPage.hiddenDateRangePopupAddedDateFromInput();
		promotionDetailsPage.hiddenDateRangePopupAddedDateToInput();
	}
	
	@When("^user adds valid departure date ranges on the booking date range popup$")
	public void user_adds_valid_departure_date_ranges_on_the_booking_date_range_popup() throws Throwable {
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("20 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("21 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("22 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("23 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
	}
	
	@When("^user saves the booking date range popup entries$")
	public void user_saves_the_booking_date_range_popup_entries() throws Throwable {
		promotionDetailsPage.clickDateRangePopupSaveButton();
	}
	
	@Then("^user sees the new date range entries in the list$")
	public void user_sees_the_new_date_range_entries_in_the_list() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[contains(@id, 'DateRagesGroupList')]//div[contains(@class, 'GroupRangeDiv')]")));
	}
	
	@When("^user adds a date range that falls between on a start and end date of an existing booking$")
	public void user_adds_a_date_range_that_falls_between_on_a_start_and_end_date_of_an_existing_booking() throws Throwable {
		promotionDetailsPage.setDateRangeSectionDateFromInput("19 Dec 2018");
		promotionDetailsPage.setDateRangeSectionDateToInput("20 Dec 2018");
		promotionDetailsPage.clickDateRangeSectionAddDateRangeButton();
	}
	
	@Then("^user sees date range entry with edit and remove icons$")
	public void user_sees_date_range_entry_with_edit_and_remove_icons() throws Throwable {
		promotionDetailsPage.displayedDateRangeSectionEditButton();
		promotionDetailsPage.displayedDateRangeSectionDeleteButton();
	}
	
	@When("^user edits a date range entry$")
	public void user_edits_a_date_range_entry() throws Throwable {
		promotionDetailsPage.clickDateRangeSectionEditDateRangeButton();
	}
	
	@Then("^user sees the dates entered and can be changed$")
	public void user_sees_the_dates_entered_and_can_be_changed() throws Throwable {
		promotionDetailsPage.containsValueDateRangePopupAddedDateFromInput("20 Dec 2018");
		promotionDetailsPage.containsValueDateRangePopupAddedDateToInput("21 Dec 2018");
	}
	
	@When("^user removes a date range entry$")
	public void user_removes_a_date_range_entry() throws Throwable {
		promotionDetailsPage.clickDateRangePopupCancelButton();
		promotionDetailsPage.clickDateRangeSectionDeleteDateRangeButton();
	}
	
	@Then("^user does not see the date range entry in the list$")
	public void user_does_not_see_the_date_range_entry_in_the_list() throws Throwable {
		CommonFunctions.textHiddenInPage("From: 18 Dec 2018 To:  19 Dec 2018");
	}
	
	@When("^user provides necessary information for the new promotion but leaves date ranges empty$")
	public void user_provides_necessary_information_for_the_new_promotion_but_leaves_date_ranges_empty() throws Throwable {
		user_provides_basic_information();
		user_provides_suppliers();
		user_provides_comments();
		user_selects_main_as_the_market_offer();
	}
	
	@When("^user provides necessary information for the new promotion and user enables second deposit applicable but puts an invalid date$")
	public void user_provides_necessary_information_for_the_new_promotion_and_user_enables_second_deposit_applicable_but_puts_an_invalid_date() throws Throwable {
		user_provides_basic_information();
		user_provides_suppliers();
		user_provides_comments();
		user_provides_date_ranges();
		user_selects_main_as_the_market_offer();
		promotionDetailsPage.clickPaymentRulesAccordion();
		promotionDetailsPage.clickPaymentRulesSectionSecondDepositApplicableCheckbox();
		promotionDetailsPage.setPaymentRulesSectionSecondDepositAmountInput("8");
		promotionDetailsPage.setPaymentRulesSectionSecondDepositDueDateInput("31 Dec 9999");
	}
	
	@When("^user puts a valid second deposit due date$")
	public void user_puts_a_valid_second_deposit_due_date() throws Throwable {
		promotionDetailsPage.setPaymentRulesSectionSecondDepositDueDateInput("08 Dec 2018");
	}
	
	@When("^user enables final due applicable and puts an invalid date$")
	public void user_enables_final_due_applicable_and_puts_an_invalid_date() throws Throwable {
		promotionDetailsPage.clickPaymentRulesSectionFinalDueApplicableCheckbox();
		promotionDetailsPage.selectPaymentRulesSectionFinalDueTypeValue("Fixed Date");
		promotionDetailsPage.setPaymentRulesSectionFinalDueDateInput("31 Dec 9999");
	}
	
	@When("^user selected departure date to start entering date ranges by$")
	public void user_selected_departure_date_to_start_entering_date_ranges_by() throws Throwable {
		promotionDetailsPage.selectDateRangesSectionValue("Departure Date");
	}
	
	@Then("^user sees departure date range popup$")
	public void user_sees_departure_date_range_popup() throws Throwable {
		promotionDetailsPage.displayedDateRangePopupLabel();
	}
	
	@When("^user adds an empty booking date range on the departure date range popup$")
	public void user_adds_an_empty_booking_date_range_on_the_departure_date_range_popup() throws Throwable {
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("");
		promotionDetailsPage.clickDateRangePopupAddButton();
	}
	
	@When("^user adds a booking date range with the start date is greater than the end date on the departure date range popup$")
	public void user_adds_a_booking_date_range_with_the_start_date_is_greater_than_the_end_date_on_the_departure_date_range_popup() throws Throwable {
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("18 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("17 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
	}
	
	@When("^user adds a valid booking date range on the departure date range popup$")
	public void user_adds_a_valid_booking_date_range_on_the_departure_date_range_popup() throws Throwable {
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("20 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("21 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
	}
	
	@When("^user adds a booking date range that falls between the existing booking date ranges on the departure date range popup$")
	public void user_adds_a_booking_date_range_that_falls_between_the_existing_booking_date_ranges_on_the_departure_date_range_popup() throws Throwable {
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("19 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("20 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
	}
	
	@When("^user removes a booking date range on the departure date range popup$")
	public void user_removes_a_booking_date_range_on_the_departure_date_range_popup() throws Throwable {
		promotionDetailsPage.clickDateRangePopupRemoveButton();
	}
	
	@Then("^user does not see booking date range deleted on the departure date rage popup$")
	public void user_does_not_see_booking_date_range_deleted_on_the_departure_date_rage_popup() throws Throwable {
		promotionDetailsPage.hiddenDateRangePopupAddedDateFromInput();
		promotionDetailsPage.hiddenDateRangePopupAddedDateToInput();
	}
	
	@When("^user adds valid booking date ranges on the departure date range popup$")
	public void user_adds_valid_booking_date_ranges_on_the_departure_date_range_popup() throws Throwable {
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("20 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("21 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("22 Dec 2018");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("23 Dec 2018");
		promotionDetailsPage.clickDateRangePopupAddButton();
	}
	
	@When("^user saves the departure date range popup entries$")
	public void user_saves_the_departure_date_range_popup_entries() throws Throwable {
		promotionDetailsPage.clickDateRangePopupSaveButton();
	}
	
	@When("^user adds a date range that falls between on a start and end date of an existing departure$")
	public void user_adds_a_date_range_that_falls_between_on_a_start_and_end_date_of_an_existing_departure() throws Throwable {
		promotionDetailsPage.setDateRangeSectionDateFromInput("19 Dec 2018");
		promotionDetailsPage.setDateRangeSectionDateToInput("20 Dec 2018");
		promotionDetailsPage.clickDateRangeSectionAddDateRangeButton();
	}
	
	@When("^user cancels the adding of promotion$")
	public void user_cancels_the_adding_of_promotion() throws Throwable {
		promotionsPage = promotionDetailsPage.clickTopCloseButton();
	}
	
	@When("^user puts some information and cancels the adding of promotion$")
	public void user_puts_some_information_and_cancels_the_adding_of_promotion() throws Throwable {
		promotionDetailsPage.setCodeInput(prop.getProperty("wrongString"));
		promotionDetailsPage.selectCategoryValue(prop.getProperty("newPromotionCategory"));
		
		promotionsPage = promotionDetailsPage.clickTopCloseButton();
	}
	
	@When("^user saves the promotion with incomplete information$")
	public void user_saves_the_promotion_with_incomplete_information() throws Throwable {
		promotionDetailsPage.setCodeInput(prop.getProperty("wrongString"));
		promotionDetailsPage.clickTopSavePromotionButton();
	}
	
	@When("^user updates the information of the promotion$")
	public void user_updates_the_information_of_the_promotion() throws Throwable {
		promotionDetailsPage.setDescriptionInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newPromotionDescription")));
		user_selects_main_as_the_market_offer();
		user_selects_a_promotion_combinability_group();
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user discards saving of the promotion$")
	public void user_discards_saving_of_the_promotion() throws Throwable {
		promotionsPage = promotionDetailsPage.clickTopCloseButton();
	}
	
	@Then("^user sees promotion ID$")
	public void user_sees_promotion_ID() throws Throwable {
		CommonFunctions.textVisibleInPage("View Promotion ID");
	}
	
	@Then("^user does not see promotion group related fields$")
	public void user_does_not_see_promotion_group_related_fields() throws Throwable {
		CommonFunctions.textHiddenInPage("Promotion Group");
	}
	
	@When("^user closes the view promotions page$")
	public void user_closes_the_view_promotions_page() throws Throwable {
		promotionsPage = promotionDetailsPage.clickBottomCloseButton();
	}
	
	@Then("^user sees contract information$")
	public void user_sees_contract_information() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'Contract_Wrapper')]//div[contains(@id, 'SectionExpandableArea')]//div[contains(@class, 'content')]")));
	}
	
	@Then("^user does not see some certain fields when promotion type is special fare$")
	public void user_does_not_see_some_certain_fields_when_promotion_type_is_special_fare() throws Throwable {
		promotionDetailsPage.selectTypeValue("Special Fare");
		promotionDetailsPage.hiddenConsumerWebShortDescriptionInput();
		promotionDetailsPage.hiddenMinimimPaxCheckbox();
		promotionDetailsPage.hiddenMinorPromotionCheckbox();
	}
	
	@Then("^user sees override default commission is defaulted to 10%")
	public void user_sees_override_default_commission_is_defaulted_to() throws Throwable {
		promotionDetailsPage.displayedOverrideDefaultCommissionInput();
	}
	
	@When("^user decides to enable first deposit applicable$")
	public void user_decides_to_enable_first_deposit_applicable() throws Throwable {
		promotionDetailsPage.clickPaymentRulesSectionFirstDepositApplicableCheckbox();
	}
	
	@Then("^user sees first deposit type is defaulted to per person$")
	public void user_sees_first_deposit_type_is_defaulted_to_per_person() throws Throwable {
		promotionDetailsPage.containsValuePaymentRulesSectionFirstDepositTypeDropdown("Per Person");
	}
	
	@When("^user decides to enable second deposit applicable$")
	public void user_decides_to_enable_second_deposit_applicable() throws Throwable {
		promotionDetailsPage.clickPaymentRulesSectionSecondDepositApplicableCheckbox();
	}
	
	@Then("^user sees second deposit type is defaulted to per person$")
	public void user_sees_second_deposit_type_is_defaulted_to_per_person() throws Throwable {
		promotionDetailsPage.containsValuePaymentRulesSectionSecondDepositTypeDropdown("Per Person");
	}
	
	@Then("^user sees supplier id label$")
	public void user_sees_supplier_id_label() throws Throwable {
		CommonFunctions.textVisibleInPage("Supplier ID");
	}
	
	@Then("^user sees applicable to and assign labels$")
	public void user_sees_applicable_to_and_assign_labels() throws Throwable {
		CommonFunctions.textVisibleInPage("Assign");
		CommonFunctions.textVisibleInPage("Applicable to");
	}
	
	@Then("^user sees assign dropdown defaulted to per passenger$")
	public void user_sees_assign_dropdown_defaulted_to_per_passenger() throws Throwable {
		promotionDetailsPage.containsValueAssignDropdown("Per Passenger");
	}
	
	@When("^user selects blank promotion combinability group$")
	public void user_selects_blank_promotion_combinability_group() throws Throwable {
		promotionDetailsPage.selectCombinabilityGroupValue("Select");
	}
	
	@When("^user opens the promotion combinability group dropdown$")
	public void user_opens_the_promotion_combinability_group_dropdown() throws Throwable {
		promotionDetailsPage.clickCombinabilityGroupDropdown();
	}
	
	@Then("^user sees the promotion combinability group dropdown contains several options to be selected$")
	public void user_sees_the_promotion_combinability_group_dropdown_contains_several_options_to_be_selected() throws Throwable {
		CommonFunctions.textVisibleInPage("Bonus Offer");
		CommonFunctions.textVisibleInPage("Hot Deal");
		CommonFunctions.textVisibleInPage("Event Offer");
		CommonFunctions.textVisibleInPage("Internal Discount");
		CommonFunctions.textVisibleInPage("Loyalty Offer");
		CommonFunctions.textVisibleInPage("Air Deal");
		CommonFunctions.textVisibleInPage("Saving");
		CommonFunctions.textVisibleInPage("Solo Traveller Offer");
		CommonFunctions.textVisibleInPage("Miscellaneous");
	}
	
	@When("^user selects \"([^\"]*)\" as promotion category$")
	public void user_selects_as_promotion_category(String arg1) throws Throwable {
		promotionDetailsPage.selectCategoryValue(arg1);
	}
	
	@Then("^user sees \"([^\"]*)\" as promotion combinability group$")
	public void user_sees_as_promotion_combinability_group(String arg1) throws Throwable {
		promotionDetailsPage.containsValueCombinabilityGroupDropdown(arg1);
	}
	
	@When("^user selects a promotion combinability group$")
	public void user_selects_a_promotion_combinability_group() throws Throwable {
		promotionDetailsPage.selectCombinabilityGroupValue("Bonus Offer");
	}
	
	@Then("^user sees unchanged promotion category$")
	public void user_sees_unchanged_promotion_category() throws Throwable {
		promotionDetailsPage.containsValueCategoryDropdown("Miscellaneous");
	}
	
	@When("^user sees combinability group dropdown value is defaulted to select$")
	public void user_sees_combinability_group_dropdown_value_is_defaulted_to_select() throws Throwable {
		promotionDetailsPage.containsValueCombinabilityGroupDropdown("Select");
	}
	
	@Then("^user sees market offer dropdown is disabled$")
	public void user_sees_market_offer_dropdown_is_disabled() throws Throwable {
		promotionDetailsPage.disabledMarketOfferDropdown();
	}
	
	@Then("^user sees market offer dropdown is defaulted to select$")
	public void user_sees_market_offer_dropdown_is_defaulted_to_select() throws Throwable {
		promotionDetailsPage.containsValueMarketOfferDropdown("Select");
	}
	
	@When("^user selects air deal as the promotion category$")
	public void user_selects_air_deal_as_the_promotion_category() throws Throwable {
		promotionDetailsPage.selectCategoryValue("Air Deal");
	}
	
	@Then("^user sees market offer dropdown is enabled$")
	public void user_sees_market_offer_dropdown_is_enabled() throws Throwable {
		promotionDetailsPage.enabledMarketOfferDropdown();
	}
	
	@When("^user selects bonus offer as the promotion category$")
	public void user_selects_bonus_offer_as_the_promotion_category() throws Throwable {
		promotionDetailsPage.selectCategoryValue("Bonus Offer");
	}
	
	@When("^user expands the market offer dropdown$")
	public void user_expands_the_market_offer_dropdown() throws Throwable {
		promotionDetailsPage.clickMarketOfferDropdown();
	}
	
	@When("^user selects main as the market offer$")
	public void user_selects_main_as_the_market_offer() throws Throwable {
		promotionDetailsPage.selectMarketOfferValue("Main");
	}
	
	@Then("^user sees table of checked promotions$")
	public void user_sees_table_of_checked_promotions() throws Throwable {
		promotionDetailsPage.clickCombinabilityAccordion();
		promotionDetailsPage.displayedCombinabilitySectionViewCombinablePromotionsTable();
	}
	
	@Then("^user sees promotion is not combinable with any promotions$")
	public void user_sees_promotion_is_not_combinable_with_any_promotions() throws Throwable {
		promotionDetailsPage.clickCombinabilityAccordion();
		CommonFunctions.textVisibleInPage("This promotion has not been marked combinable with any other promotions.");
	}
	
	@When("^user chose \"([^\"]*)\" as combinability group for the promotion$")
	public void user_chose_as_combinability_group_for_the_promotion(String arg1) throws Throwable {
		promotionDetailsPage.selectCombinabilityGroupValue(arg1);
	}
	
	@Then("^user sees \"([^\"]*)\" as the promotion category$")
	public void user_sees_as_the_promotion_category(String arg1) throws Throwable {
		promotionDetailsPage.containsValueCategoryDropdown(arg1);
	}
	
	@When("^user chose \"([^\"]*)\" as category for the promotion$")
	public void user_chose_as_category_for_the_promotion(String arg1) throws Throwable {
		promotionDetailsPage.selectCategoryValue(arg1);
	}
	
	@Then("^user sees \"([^\"]*)\" as the combinability group$")
	public void user_sees_as_the_combinability_group(String arg1) throws Throwable {
		promotionDetailsPage.containsValueCombinabilityGroupDropdown(arg1);
	}
	
	@When("^user expands the combinability accordion$")
	public void user_expands_the_combinability_accordion() throws Throwable {
		promotionDetailsPage.clickCombinabilityAccordion();
		CommonFunctions.pause(10000, false);
	}
	
	@Then("^user sees a warning message about the promotion being invalid with the change$")
	public void user_sees_a_warning_message_about_the_promotion_being_invalid_with_the_change() throws Throwable {
		CommonFunctions.switchFrameByXPath("//div[text() = 'One or more promotions marked as combinable may be invalid with this change. Please review and verify combined promotions before save.']");
		CommonFunctions.textVisibleInPage("One or more promotions marked as combinable may be invalid with this change. Please review and verify combined promotions before save.");
	}
	
	@When("^user changes the promotion category from internal discount to air deal$")
	public void user_changes_the_promotion_category_from_internal_discount_to_air_deal() throws Throwable {
		promotionDetailsPage.selectCategoryValue("Air Deal");
	}
	
	@Then("^user sees a warning message about the promotion being combinable to specific promotions only$")
	public void user_sees_a_warning_message_about_the_promotion_being_combinable_to_specific_promotions_only() throws Throwable {
		CommonFunctions.switchFrameByXPath("//div[text() = 'Combinability rule(s) exist. If you continue, this promotion will be combinable with promotion(s) specified in Combinability section.']");
		CommonFunctions.textVisibleInPage("Combinability rule(s) exist. If you continue, this promotion will be combinable with promotion(s) specified in Combinability section.");
	}
	
	@When("^user provides a promotion description$")
	public void user_provides_a_promotion_description() throws Throwable {
		promotionDetailsPage.setDescriptionInput("TestPromotionDescriptionCopy");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees promotion description input text is copied into invoice description input$")
	public void user_sees_promotion_description_input_text_is_copied_into_invoice_description_input() throws Throwable {
		CommonFunctions.textVisibleInPage("TestPromotionDescriptionCopy");
	}
	
	@Then("^user sees a warning that the invoice description has been updated$")
	public void user_sees_a_warning_that_the_invoice_description_has_been_updated() throws Throwable {
		CommonFunctions.textVisibleInPage("Invoice Description has been updated as per Promotion Description. Please review before save.");
	}
	
	@When("^user changes market offer to none$")
	public void user_changes_market_offer_to_none() throws Throwable {
		promotionDetailsPage.selectMarketOfferValue("None");
	}
	
	@Then("^user sees the market offer dropdown is none$")
	public void user_sees_the_market_offer_dropdown_is_none() throws Throwable {
		promotionDetailsPage.containsValueMarketOfferDropdown("None");
	}
	
	@Then("^user sees cabin category value is defaulted to all selected$")
	public void user_sees_cabin_category_value_is_defaulted_to_all_selected() throws Throwable {
		promotionDetailsPage.containsValuePackageSectionCabinCategoryDropdown("All Selected");
	}
	
	@Then("^user sees second deposit for is defaulted to miscellaneous$")
	public void user_sees_second_deposit_for_is_defaulted_to_miscellaneous() throws Throwable {
		promotionDetailsPage.containsValuePaymentRulesSectionSecondDepositForDropdown("Miscellaneous");
	}
	
	@When("^user enter a booking date from by typing$")
	public void user_enter_a_booking_date_from_by_typing() throws Throwable {
		promotionDetailsPage.setDateRangeSectionDateFromInput("06/03/2019");
	}
	
	@Then("^user sees the booking date from in the calendar shows the entered date$")
	public void user_sees_the_booking_date_from_in_the_calendar_shows_the_entered_date() throws Throwable {
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'BookingDateFrom')]"));
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("//div[@class = 'calendar']//thead//td[contains(@class, 'title') and contains(text(), 'March, 2019')]")), "March, 2019");
	}
	
	@Then("^user sees market offer, and combinability group fields$")
	public void user_sees_market_offer_and_combinability_group_fields() throws Throwable {
		promotionDetailsPage.clickMarketOfferDropdown();
		promotionDetailsPage.displayedCombinabilityGroupDropdown();
	}
	
	@Then("^user does not see promotion category, market offer, and combinability group fields$")
	public void user_does_not_see_promotion_category_market_offer_and_combinability_group_fields() throws Throwable {
		promotionDetailsPage.hiddenCategoryDropdown();
		promotionDetailsPage.hiddenMarketOfferDropdown();
		promotionDetailsPage.hiddenCombinabilityGroupDropdown();
	}
	
	@When("^user changes the promotion type to gen promotion$")
	public void user_changes_the_promotion_type_to_gen_promotion() throws Throwable {
		promotionDetailsPage.selectTypeValue("Gen Promotion");
	}
	
	@Then("^user sees previously selected values for promotion category, market offer, and combinability group fields$")
	public void user_sees_previously_selected_values_for_promotion_category_market_offer_and_combinability_group_fields() throws Throwable {
		promotionDetailsPage.containsValueCategoryDropdown("Air Deal");
		promotionDetailsPage.containsValueMarketOfferDropdown("Main");
		promotionDetailsPage.containsValueCombinabilityGroupDropdown("Air Deal");
	}
	
	@When("^user fills up the form for the new promotion$")
	public void user_fills_up_the_form_for_the_new_promotion() throws Throwable {
		usedPromotionName = promotionDetailsPage.setCodeInput(CommonFunctions.stringAppendDateTime("AutomationData"));
		promotionDetailsPage.selectRevenueAllocationValue("Other");
		promotionDetailsPage.selectStatusValue("Open");
		promotionDetailsPage.selectSupplierValue("APT Cheltenham");
		promotionDetailsPage.setDescriptionInput("DO NOT CHANGE OR DELETE");
		promotionDetailsPage.clickInternalSaleCheckbox();
		promotionDetailsPage.clickAptGroupTradeCheckbox();
		promotionDetailsPage.clickAtgConsumerWebCheckbox();
		promotionDetailsPage.selectCategoryValue("Bonus Offer");
		promotionDetailsPage.selectMarketOfferValue("Main");
		promotionDetailsPage.selectClassificationValue("2 for 1");
		promotionDetailsPage.selectActionValue("$ - Dollar Amount");
		promotionDetailsPage.setRatePerPersonInput("1");
		promotionDetailsPage.selectRoundingRuleValue("Nearest");
		promotionDetailsPage.setRoundingAmountInput("1");
		promotionDetailsPage.selectAffiliateValue("Botanica Telegraph");
		promotionDetailsPage.clickMinorPromotionCheckBox();
		promotionDetailsPage.clickMinimumPaxCheckBox();
		promotionDetailsPage.setMinimumPaxInput("3");
		promotionDetailsPage.setOverrideDefaultCommissionInput("11");
		promotionDetailsPage.clickOverridePromotionLineCommissionCheckbox();
		promotionDetailsPage.setOverridePromotionLineCommissionInput("2");
		promotionDetailsPage.clickPackageAccordion();
		promotionDetailsPage.clickPackageSectionAddPackageButton();
		CommonFunctions.textVisibleInPage("Add Package");
		promotionDetailsPage.clickPackagePopupCancelButton();
		promotionDetailsPage.clickPackageSectionBrandDropdownOption("Select All");
		promotionDetailsPage.clickPackageSectionBrandDropdownOption("APT");
		promotionDetailsPage.clickPackageSectionBrandDropdownOption("Botanica World Discoveries");
		promotionDetailsPage.clickPackageSectionBrandDropdownOption("Kimberley Wilderness Adventures");
		promotionDetailsPage.clickPackageSectionBrandDropdownOption("Travelmarvel");
		promotionDetailsPage.clickPackageSectionTourMarketDropdownOption("Select All");
		promotionDetailsPage.clickPackageSectionTourMarketDropdownOption("Asia");
		promotionDetailsPage.clickPackageSectionTourMarketDropdownOption("Australia");
		promotionDetailsPage.clickPackageSectionTourMarketDropdownOption("Europe");
		promotionDetailsPage.clickPackageSectionTourMarketDropdownOption("North America");
		promotionDetailsPage.clickPackageSectionPackageTypeDropdownOption("Select All");
		promotionDetailsPage.clickPackageSectionPackageTypeDropdownOption("Cruising");
		promotionDetailsPage.clickPackageSectionPackageTypeDropdownOption("Day Tours");
		promotionDetailsPage.clickPackageSectionPackageTypeDropdownOption("Escorted");
		promotionDetailsPage.clickPackageSectionPackageTypeDropdownOption("NT Short Breaks");
		promotionDetailsPage.clickPackageSectionTourClassificationDropdownOption("Select All");
		promotionDetailsPage.clickPackageSectionTourClassificationDropdownOption("4WD Birdsville");
		promotionDetailsPage.clickPackageSectionTourClassificationDropdownOption("AWT Kimberley");
		promotionDetailsPage.clickPackageSectionTourClassificationDropdownOption("Brisbane");
		promotionDetailsPage.clickPackageSectionTourClassificationDropdownOption("Broome");
		promotionDetailsPage.clickPackageSectionTourClassificationDropdownOption("Cairns");
		promotionDetailsPage.clickPackageSectionTourClassificationDropdownOption("Charter USA");
		promotionDetailsPage.clickPackageSectionTourClassificationDropdownOption("Coastal Cruising Adriatic");
		promotionDetailsPage.clickPackageSectionTourClassificationDropdownOption("Expedition Europe");
		promotionDetailsPage.selectPackageSectionTourLengthValue("CD - Coach Days");
		promotionDetailsPage.setPackageSectionTourLengthMinimumDaysInput("1");
		promotionDetailsPage.setPackageSectionTourLengthMaximumDaysInput("5");
		promotionDetailsPage.clickPackageSectionRoomConfigurationDropdownOption("Twin");
		promotionDetailsPage.clickDateRangeAccordion();
		promotionDetailsPage.selectDateRangesSectionValue("Booking Date");
		promotionDetailsPage.setDateRangeSectionDateFromInput("27 Mar 2019");
		promotionDetailsPage.setDateRangeSectionDateToInput("07 Apr 2019");
		promotionDetailsPage.clickDateRangeSectionAddDateRangeButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("27 Mar 2019");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("30 Apr 2019");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("01 May 2019");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("31 May 2019");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.clickDateRangePopupSaveButton();
		promotionDetailsPage.selectDateRangesSectionValue("Departure Date");
		promotionDetailsPage.setDateRangeSectionDateFromInput("27 Mar 2020");
		promotionDetailsPage.setDateRangeSectionDateToInput("07 Apr 2020");
		promotionDetailsPage.clickDateRangeSectionAddDateRangeButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("27 Mar 2020");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("30 Apr 2020");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("01 May 2020");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("31 May 2020");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.clickDateRangePopupSaveButton();
		promotionDetailsPage.clickMarketAccordion();
		promotionDetailsPage.clickMarketSectionOfficeDropdownOption("Select All");
		promotionDetailsPage.clickMarketSectionOfficeDropdownOption("APT Cheltenham");
		promotionDetailsPage.clickMarketSectionOfficeDropdownOption("APT United Kingdom");
		promotionDetailsPage.clickMarketSectionDepartmentDropdownOption("Select All");
		promotionDetailsPage.clickMarketSectionDepartmentDropdownOption("APT Cheltenham - Accounts Payable");
		promotionDetailsPage.clickMarketSectionDepartmentDropdownOption("APT Cheltenham - Accounts Receivable");
		promotionDetailsPage.clickMarketSectionDepartmentDropdownOption("APT United Kingdom - Customer Service");
		promotionDetailsPage.clickMarketSectionDepartmentDropdownOption("APT United Kingdom - Reservations");
		promotionDetailsPage.clickMarketSectionCurrencyDropdownOption("Select All");
		promotionDetailsPage.clickMarketSectionCurrencyDropdownOption("AUD - Australian Dollar");
		promotionDetailsPage.clickMarketSectionCurrencyDropdownOption("GBP - British Pounds");
		promotionDetailsPage.clickCustomerAccordion();
		promotionDetailsPage.clickCustomerSectionAddCustomerButton();
		CommonFunctions.textVisibleInPage("Add Customer");
		promotionDetailsPage.clickCustomerPopupCancelButton();
		promotionDetailsPage.clickCustomerSectionTypeDropdownOption("Select All");
		promotionDetailsPage.clickCustomerSectionTypeDropdownOption("Direct");
		promotionDetailsPage.clickCustomerSectionTypeDropdownOption("Direct Day Tours");
		promotionDetailsPage.clickCustomerSectionTypeDropdownOption("Travel Agent");
		promotionDetailsPage.clickCustomerSectionTypeDropdownOption("Wholesaler");
		promotionDetailsPage.clickCustomerSectionMarketDropdownOption("Select All");
		promotionDetailsPage.clickCustomerSectionMarketDropdownOption("Australia Domestic");
		promotionDetailsPage.clickCustomerSectionMarketDropdownOption("UK");
		promotionDetailsPage.clickCustomerSectionAgencyChainDropdownOption("Select All");
		promotionDetailsPage.clickCustomerSectionAgencyChainDropdownOption("Australia Tours");
		promotionDetailsPage.clickCustomerSectionAgencyChainDropdownOption("Australian Affair");
		promotionDetailsPage.clickCustomerSectionAgencyChainDropdownOption("Cox & Kings");
		promotionDetailsPage.clickCustomerSectionAgencyChainDropdownOption("First Class Holidays");
		promotionDetailsPage.clickCustomerSectionAgencyChainDropdownOption("Flight Centre");
		promotionDetailsPage.clickCustomerSectionAgencyChainDropdownOption("helloworld");
		promotionDetailsPage.clickCustomerSectionAgentTypeDropdownOption("Select All");
		promotionDetailsPage.clickCustomerSectionAgentTypeDropdownOption("Flight Centre");
		promotionDetailsPage.clickCustomerSectionAgentTypeDropdownOption("Flight Centre Direct");
		promotionDetailsPage.clickCustomerSectionAgentTypeDropdownOption("helloworld Associates");
		promotionDetailsPage.clickCustomerSectionAgentTypeDropdownOption("helloworld Branded");
		promotionDetailsPage.clickCustomerSectionAgentSubTypeDropdownOption("Select All");
		promotionDetailsPage.clickCustomerSectionAgentSubTypeDropdownOption("Aussie Specialist");
		promotionDetailsPage.clickCustomerSectionAgentSubTypeDropdownOption("Brit Specialist");
		promotionDetailsPage.clickCustomerSectionAgentSubTypeDropdownOption("iTravel Business Unit");
		promotionDetailsPage.clickCustomerSectionCountryDropdownOption("Select All");
		promotionDetailsPage.clickCustomerSectionCountryDropdownOption("AUSTRALIA");
		promotionDetailsPage.clickCustomerSectionCountryDropdownOption("UNITED KINGDOM");
		promotionDetailsPage.clickCustomerSectionStateDropdownOption("Select All");
		promotionDetailsPage.clickCustomerSectionStateDropdownOption("AVON");
		promotionDetailsPage.clickCustomerSectionStateDropdownOption("VIC");
		promotionDetailsPage.clickAllotmentAccordion();
		promotionDetailsPage.setAllotmentSectionNoOfDaysOffsetInput("5");
		promotionDetailsPage.clickPaymentRulesAccordion();
		promotionDetailsPage.clickPaymentRulesSectionFirstDepositApplicableCheckbox();
		promotionDetailsPage.setPaymentRulesSectionFirstDepositAmountInput("10");
		promotionDetailsPage.clickPaymentRulesSectionFirstDepositDueDateOverrideNoOfDaysCheckbox();
		promotionDetailsPage.setPaymentRulesSectionFirstDepositOverrideNoOfDaysInput("5");
		promotionDetailsPage.clickPaymentRulesSectionSecondDepositApplicableCheckbox();
		promotionDetailsPage.setPaymentRulesSectionSecondDepositAmountInput("20");
		promotionDetailsPage.setPaymentRulesSectionSecondDepositDueDateInput("30 Apr 2019");
		promotionDetailsPage.clickPaymentRulesSectionFinalDueApplicableCheckbox();
		promotionDetailsPage.selectPaymentRulesSectionFinalDueTypeValue("Fixed Date");
		promotionDetailsPage.setPaymentRulesSectionFinalDueDateInput("31 May 2019");
		promotionDetailsPage.clickCombinabilityAccordion();
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'CombinableExpandable')]//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'CombinableExpandable')]//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[2]")));
		CommonFunctions.pause(5000, false);
		promotionDetailsPage.clickCommentsAccordion();
		promotionDetailsPage.setCommentsSectionTradeCommentsTextArea("DO NOT CHANGE OR DELETE");
		promotionDetailsPage.setCommentsSectionInternalReservationDescriptionTextArea("DO NOT CHANGE OR DELETE");
	}
	
	@Then("^user sees the promotion created recently$")
	public void user_sees_the_promotion_created_recently() throws Throwable {
		promotionDetailsPage.containsValueCodeInput(usedPromotionName);
		promotionDetailsPage.containsValueTypeDropdown("Gen Promotion");
		promotionDetailsPage.containsValueAssignDropdown("Per Passenger");
		promotionDetailsPage.containsValueRevenueAllocationDropdown("Other");
		promotionDetailsPage.containsValueStatusDropdown("Open");
		promotionDetailsPage.containsValueSupplierDropdown("APT Cheltenham");
		promotionDetailsPage.containsValueDescriptionInput("DO NOT CHANGE OR DELETE");
		promotionDetailsPage.containsValueInvoiceDescriptionInput("DO NOT CHANGE OR DELETE");
		promotionDetailsPage.checkInternalSaleCheckboxIsToggled();
		promotionDetailsPage.checkAptGroupTradeCheckboxIsToggled();
		promotionDetailsPage.checkAtgConsumerWebCheckboxIsToggled();
		promotionDetailsPage.containsValueCategoryDropdown("Bonus Offer");
		promotionDetailsPage.containsValueMarketOfferDropdown("Main");
		promotionDetailsPage.containsValueCombinabilityGroupDropdown("Bonus Offer");
		promotionDetailsPage.containsValueClassificationDropdown("2 for 1");
		promotionDetailsPage.containsValueConsumerWebShortDescriptionInput("2 for 1*");
		promotionDetailsPage.containsValueActionDropdown("$ - Dollar Amount");
		promotionDetailsPage.containsValueRatePerPersonInput("1");
		promotionDetailsPage.containsValueRoundingRuleDropdown("Nearest");
		promotionDetailsPage.containsValueAffiliateDropdown("Botanica Telegraph");
		promotionDetailsPage.checkMinorPromotionCheckboxIsToggled();
		promotionDetailsPage.checkMinimumPaxCheckboxIsToggled();
		promotionDetailsPage.containsValueMinimumPaxInput("3");
		promotionDetailsPage.containsValueOverrideDefaultCommissionInput("11");
		promotionDetailsPage.checkOverridePromotionLineCommissionCheckboxIsToggled();
		promotionDetailsPage.containsValueOverridePromotionLineCommissionInput("2");
		promotionDetailsPage.clickPackageAccordion();
		promotionDetailsPage.containsValuePackageSectionBrandDropdown("4 of 16 selected");
		promotionDetailsPage.containsValuePackageSectionTourMarketDropdown("4 of 11 selected");
		promotionDetailsPage.containsValuePackageSectionPackageTypeDropdown("4 of 11 selected");
		promotionDetailsPage.containsValuePackageSectionTourClassificationDropdown("8 of 158 selected");
		promotionDetailsPage.containsValuePackageSectionTourLengthDropdown("CD - Coach Days");
		promotionDetailsPage.containsValuePackageSectionTourLengthMinimumDaysDropdown("1");
		promotionDetailsPage.containsValuePackageSectionTourLengthMaximumDaysDropdown("5");
		promotionDetailsPage.containsValuePackageSectionRoomConfigurationDropdown("5 of 6 selected");
		promotionDetailsPage.clickDateRangeAccordion();
		CommonFunctions.textVisibleInPage("From: 27 Mar 2019 To:");
		CommonFunctions.textVisibleInPage("07 Apr 2019");
		CommonFunctions.textVisibleInPage("○    27 Mar 2019 - 30 Apr 2019");
		CommonFunctions.textVisibleInPage("○    01 May 2019 - 31 May 2019");
		CommonFunctions.textVisibleInPage("From: 27 Mar 2020 To:");
		CommonFunctions.textVisibleInPage("07 Apr 2020");
		CommonFunctions.textVisibleInPage("○    27 Mar 2020 - 30 Apr 2020");
		CommonFunctions.textVisibleInPage("○    01 May 2020 - 31 May 2020");
		promotionDetailsPage.clickMarketAccordion();
		promotionDetailsPage.containsValueMarketSectionOfficeDropdown("APT Cheltenham, APT United Kingdom");
		promotionDetailsPage.containsValueMarketSectionDepartmentDropdown("4 of 51 selected");
		promotionDetailsPage.containsValueMarketSectionCurrencyDropdown("AUD - Australian Dollar, GBP - British Pounds");
		promotionDetailsPage.clickCustomerAccordion();
		promotionDetailsPage.containsValueCustomerSectionTypeDropdown("4 of 7 selected");
		promotionDetailsPage.containsValueCustomerSectionMarketDropdown("Australia Domestic, UK");
		promotionDetailsPage.containsValueCustomerSectionAgencyChainDropdown("6 of 212 selected");
		promotionDetailsPage.containsValueCustomerSectionAgentTypeDropdown("4 of 21 selected");
		promotionDetailsPage.containsValueCustomerSectionAgentSubTypeDropdown("Aussie Specialist, Brit Specialist, iTravel Business Unit");
		promotionDetailsPage.containsValueCustomerSectionCountryDropdown("AUSTRALIA, UNITED KINGDOM");
		promotionDetailsPage.containsValueCustomerSectionStateDropdown("AVON, VIC");
		promotionDetailsPage.clickAllotmentAccordion();
		promotionDetailsPage.containsValueAllotmentSectionInventoryPoolDropdown("Select");
		promotionDetailsPage.containsValueAllotmentSectionAllotmentCodeDropdown("FREESALE");
		promotionDetailsPage.containsValueAllotmentSectionNoOfDaysOffsetInput("5");
		promotionDetailsPage.clickPaymentRulesAccordion();
		promotionDetailsPage.checkPaymentRulesSectionFirstDepositApplicableCheckboxIsToggled();
		promotionDetailsPage.containsValuePaymentRulesSectionFirstDepositAmountInput("10");
		promotionDetailsPage.containsValuePaymentRulesSectionFirstDepositTypeDropdown("Per Person");
		promotionDetailsPage.checkPaymentRulesSectionFirstDepositDueDateOverrideNoOfDaysCheckboxIsToggled();
		promotionDetailsPage.containsValuePaymentRulesSectionFirstDepositDueDateOverrideNoOfDaysInput("5");
		promotionDetailsPage.checkPaymentRulesSectionSecondDepositApplicableCheckboxIsToggled();
		promotionDetailsPage.containsValuePaymentRulesSectionSecondDepositAmountInput("20");
		promotionDetailsPage.containsValuePaymentRulesSectionSecondDepositTypeDropdown("Per Person");
		promotionDetailsPage.containsValuePaymentRulesSectionSecondDepositDueDateInput("30 Apr 2019");
		promotionDetailsPage.containsValuePaymentRulesSectionSecondDepositForDropdown("Miscellaneous");
		promotionDetailsPage.checkPaymentRulesSectionFinalDueApplicableCheckboxIsToggled();
		promotionDetailsPage.containsValuePaymentRulesSectionFinalDueTypeDropdown("Fixed Date");
		promotionDetailsPage.containsValuePaymentRulesSectionFinalDueDateInput("31 May 2019");
		promotionDetailsPage.clickCombinabilityAccordion();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'CombinableExpandable')]//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]//span[contains(@class, '-checked')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'CombinableExpandable')]//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[2]//span[contains(@class, '-checked')]")));
		promotionDetailsPage.clickCommentsAccordion();
		promotionDetailsPage.containsValueCommentsSectionTradeCommentsTextArea("DO NOT CHANGE OR DELETE");
		promotionDetailsPage.containsValueCommentsSectionInternalReservationDescriptionTextArea("DO NOT CHANGE OR DELETE");
	}
	
	@When("^user fills up the form for the promotion to be updated$")
	public void user_fills_up_the_form_for_the_promotion_to_be_updated() throws Throwable {
		promotionDetailsPage.selectAssignValue("Per Package");
		promotionDetailsPage.selectRevenueAllocationValue("Air");
		promotionDetailsPage.selectStatusValue("Closed");
		promotionDetailsPage.selectSupplierValue("APT United Kingdom");
		promotionDetailsPage.setDescriptionInput("DO NOT CHANGE OR DELETE PLEASE");
		promotionDetailsPage.clickAptGroupTradeCheckbox();
		promotionDetailsPage.selectCategoryValue("Distress Offer");
		promotionDetailsPage.selectMarketOfferValue("Preview");
		promotionDetailsPage.selectCombinabilityGroupValue("Event Offer");
		promotionDetailsPage.selectClassificationValue("2 for 1 Airfares Excluding Taxes");
		promotionDetailsPage.selectActionValue("$ - Dollar Amount");
		promotionDetailsPage.setRatePerPersonInput("2");
		promotionDetailsPage.selectRoundingRuleValue("Round Up");
		promotionDetailsPage.setRoundingAmountInput("2");
		promotionDetailsPage.selectAffiliateValue("RSL Victoria");
		promotionDetailsPage.setMinimumPaxInput("6");
		promotionDetailsPage.setOverrideDefaultCommissionInput("22");
		promotionDetailsPage.setOverridePromotionLineCommissionInput("4");
		promotionDetailsPage.clickPackageSectionAddPackageButton();
		promotionDetailsPage.setPackagePopupNameInput("VEMR08 - 8 Day Luxury Mekong River Cruise 19/20");
		promotionDetailsPage.clickPackagePopupFindButton();
		promotionDetailsPage.clickPackagePopupTopRowDataCheckBox();
		promotionDetailsPage.clickPackagePopupAddButton();
		promotionDetailsPage.clickDateRangeSectionDeleteDateRangeButton();
		promotionDetailsPage.clickDateRangeSectionDeleteDateRangeButton();
		promotionDetailsPage.selectDateRangesSectionValue("Booking Date");
		promotionDetailsPage.setDateRangeSectionDateFromInput("28 Mar 2019");
		promotionDetailsPage.setDateRangeSectionDateToInput("08 Apr 2019");
		promotionDetailsPage.clickDateRangeSectionAddDateRangeButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("28 Mar 2019");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("01 May 2019");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("02 May 2019");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("01 Jun 2019");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.clickDateRangePopupSaveButton();
		promotionDetailsPage.selectDateRangesSectionValue("Departure Date");
		promotionDetailsPage.setDateRangeSectionDateFromInput("28 Mar 2020");
		promotionDetailsPage.setDateRangeSectionDateToInput("08 Apr 2020");
		promotionDetailsPage.clickDateRangeSectionAddDateRangeButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("28 Mar 2020");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("01 May 2020");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.setDateRangePopupDepartDateFromInput("02 May 2020");
		promotionDetailsPage.setDateRangePopupDepartDateToInput("01 Jun 2020");
		promotionDetailsPage.clickDateRangePopupAddButton();
		promotionDetailsPage.clickDateRangePopupSaveButton();
		promotionDetailsPage.clickMarketSectionOfficeDropdownOption("APT Brisbane");
		promotionDetailsPage.clickMarketSectionCurrencyDropdownOption("NZD - New Zealand Dollars");
		promotionDetailsPage.clickCustomerSectionAddCustomerButton();
		CommonFunctions.textVisibleInPage("Add Customer");
		promotionDetailsPage.setCustomerPopupNameInput("Flight Centre Bacchus Marsh");
		promotionDetailsPage.clickCustomerPopupFindButton();
		promotionDetailsPage.clickCustomerPopupCheckBox();
		promotionDetailsPage.clickCustomerPopupAddButton();
		promotionDetailsPage.selectAllotmentSectionInventoryPoolValue("Promotion");
		promotionDetailsPage.selectAllotmentSectionAllotmentCodeValue("ONREQUEST");
		promotionDetailsPage.setAllotmentSectionNoOfDaysOffsetInput("10");
		promotionDetailsPage.setPaymentRulesSectionFirstDepositAmountInput("20");
		promotionDetailsPage.selectPaymentRulesSectionFirstDepositTypeValue("Per Booking");
		promotionDetailsPage.setPaymentRulesSectionFirstDepositOverrideNoOfDaysInput("10");
		promotionDetailsPage.setPaymentRulesSectionSecondDepositAmountInput("40");
		promotionDetailsPage.selectPaymentRulesSectionSecondDepositTypeValue("Per Booking");
		promotionDetailsPage.setPaymentRulesSectionSecondDepositDueDateInput("01 May 2019");
		promotionDetailsPage.selectPaymentRulesSectionSecondDepositForValue("Hotel");
		promotionDetailsPage.selectPaymentRulesSectionFinalDueTypeValue("Fixed Date");
		promotionDetailsPage.setPaymentRulesSectionFinalDueDateInput("01 Jun 2019");
		promotionDetailsPage.clickCombinabilityAccordion();
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//div[text() = 'One or more promotions marked as combinable may be invalid with this change. Please review and verify combined promotions before save.']");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@class, 'FooterButtonsPopup')]//input[contains(@value, 'Ok')]")));
		promotionDetailsPage.setCommentsSectionTradeCommentsTextArea("DO NOT CHANGE OR DELETE PLEASE");
		promotionDetailsPage.setCommentsSectionInternalReservationDescriptionTextArea("DO NOT CHANGE OR DELETE PLEASE");
	}
	
	@Then("^user sees the promotion updated recently$")
	public void user_sees_the_promotion_updated_recently() throws Throwable {
		promotionDetailsPage.containsValueCodeInput(usedPromotionName);
		promotionDetailsPage.containsValueTypeDropdown("Gen Promotion");
		promotionDetailsPage.containsValueAssignDropdown("Per Package");
		promotionDetailsPage.containsValueRevenueAllocationDropdown("Air");
		promotionDetailsPage.containsValueStatusDropdown("Closed");
		promotionDetailsPage.containsValueSupplierDropdown("APT United Kingdom");
		promotionDetailsPage.containsValueDescriptionInput("DO NOT CHANGE OR DELETE PLEASE");
		promotionDetailsPage.containsValueInvoiceDescriptionInput("DO NOT CHANGE OR DELETE PLEASE");
		promotionDetailsPage.checkAptGroupTradeCheckboxIsNotToggled();
		promotionDetailsPage.containsValueCategoryDropdown("Distress Offer");
		promotionDetailsPage.containsValueMarketOfferDropdown("Preview");
		promotionDetailsPage.containsValueCombinabilityGroupDropdown("Event Offer");
		promotionDetailsPage.containsValueClassificationDropdown("2 for 1 Airfares Excluding Taxes");
		promotionDetailsPage.containsValueConsumerWebShortDescriptionInput("2 for 1 Airfares*");
		promotionDetailsPage.containsValueActionDropdown("$ - Dollar Amount");
		promotionDetailsPage.containsValueRatePerPersonInput("2");
		promotionDetailsPage.containsValueRoundingRuleDropdown("Round Up");
		promotionDetailsPage.containsValueRoundingAmountInput("2");
		promotionDetailsPage.containsValueAffiliateDropdown("RSL Victoria");
		promotionDetailsPage.checkMinorPromotionCheckboxIsToggled();
		promotionDetailsPage.checkMinimumPaxCheckboxIsToggled();
		promotionDetailsPage.containsValueMinimumPaxInput("6");
		promotionDetailsPage.containsValueOverrideDefaultCommissionInput("22");
		promotionDetailsPage.checkOverridePromotionLineCommissionCheckboxIsToggled();
		promotionDetailsPage.containsValueOverridePromotionLineCommissionInput("4");
		promotionDetailsPage.clickPackageAccordion();
		CommonFunctions.textVisibleInPage("VEMR08 - 8 Day Luxury Mekong River Cruise 19/20");
		promotionDetailsPage.clickDateRangeAccordion();
		CommonFunctions.textVisibleInPage("From: 28 Mar 2019 To:");
		CommonFunctions.textVisibleInPage("08 Apr 2019");
		CommonFunctions.textVisibleInPage("○    28 Mar 2019 - 01 May 2019");
		CommonFunctions.textVisibleInPage("○    02 May 2019 - 01 Jun 2019");
		CommonFunctions.textVisibleInPage("From: 28 Mar 2020 To:");
		CommonFunctions.textVisibleInPage("08 Apr 2020");
		CommonFunctions.textVisibleInPage("○    28 Mar 2020 - 01 May 2020");
		CommonFunctions.textVisibleInPage("○    02 May 2020 - 01 Jun 2020");
		promotionDetailsPage.clickMarketAccordion();
		promotionDetailsPage.containsValueMarketSectionOfficeDropdown("APT Brisbane, APT Cheltenham, APT United Kingdom");
		promotionDetailsPage.containsValueMarketSectionDepartmentDropdown("All Selected");
		promotionDetailsPage.containsValueMarketSectionCurrencyDropdown("AUD - Australian Dollar, GBP - British Pounds, NZD - New Zealand Dollars");
		promotionDetailsPage.clickCustomerAccordion();
		CommonFunctions.textVisibleInPage("Flight Centre Bacchus Marsh");
		promotionDetailsPage.clickAllotmentAccordion();
		promotionDetailsPage.containsValueAllotmentSectionInventoryPoolDropdown("Promotion");
		promotionDetailsPage.containsValueAllotmentSectionAllotmentCodeDropdown("ONREQUEST");
		promotionDetailsPage.containsValueAllotmentSectionNoOfDaysOffsetInput("10");
		promotionDetailsPage.clickPaymentRulesAccordion();
		promotionDetailsPage.containsValuePaymentRulesSectionFirstDepositAmountInput("20.00");
		promotionDetailsPage.containsValuePaymentRulesSectionFirstDepositTypeDropdown("Per Booking");
		promotionDetailsPage.containsValuePaymentRulesSectionFirstDepositDueDateOverrideNoOfDaysInput("10");
		promotionDetailsPage.containsValuePaymentRulesSectionSecondDepositAmountInput("40");
		promotionDetailsPage.containsValuePaymentRulesSectionSecondDepositTypeDropdown("Per Booking");
		promotionDetailsPage.containsValuePaymentRulesSectionSecondDepositDueDateInput("01 May 2019");
		promotionDetailsPage.containsValuePaymentRulesSectionSecondDepositForDropdown("Hotel");
		promotionDetailsPage.containsValuePaymentRulesSectionFinalDueTypeDropdown("Fixed Date");
		promotionDetailsPage.containsValuePaymentRulesSectionFinalDueDateInput("01 Jun 2019");
		promotionDetailsPage.clickCommentsAccordion();
		promotionDetailsPage.containsValueCommentsSectionTradeCommentsTextArea("DO NOT CHANGE OR DELETE PLEASE");
		promotionDetailsPage.containsValueCommentsSectionInternalReservationDescriptionTextArea("DO NOT CHANGE OR DELETE PLEASE");
	}
	
	@When("^user provides necessary and valid information for the promotion that has the revenue allocation air$")
	public void user_provides_necessary_and_valid_information_for_the_promotion_that_has_the_revenue_allocation_air() throws Throwable {
		promotionDetailsPage.setCodeInput(CommonFunctions.stringAppendDateTime("ProIndAir"));
		promotionDetailsPage.selectRevenueAllocationValue("Air");
		user_removes_the_focus_on_the_field();
		promotionDetailsPage.selectSupplierValue("APT United Kingdom");
		promotionDetailsPage.setDescriptionInput("Test Indicative Air");
		promotionDetailsPage.clickInternalSaleCheckbox();
		promotionDetailsPage.selectCategoryValue("Air Deal");
		promotionDetailsPage.selectMarketOfferValue("Main");
		promotionDetailsPage.selectClassificationValue("Air Credit");
		promotionDetailsPage.selectActionValue("$ - Dollar Amount");
		user_provides_date_ranges();
	}
	
	@Then("^user sees the promotion indicative air section$")
	public void user_sees_the_promotion_indicative_air_section() throws Throwable {
		CommonFunctions.textVisibleInPage("Indicative Air");
	}
	
	@Then("^user sees the promotion indicative air airline dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_promotion_indicative_air_airline_dropdown_contains(String arg1) throws Throwable {
		promotionDetailsPage.containsValueIndicativeAirSectionAirlineCodeDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the promotion indicative air airline dropdown$")
	public void user_ticks_the_option_of_the_promotion_indicative_air_airline_dropdown(String arg1) throws Throwable {
		promotionDetailsPage.clickIndicativeAirSectionAirlineCodeDropdownOption(arg1);
	}
	
	@Then("^user sees the promotion indicative air cabin class dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_promotion_indicative_air_cabin_class_dropdown_contains(String arg1) throws Throwable {
		promotionDetailsPage.containsValueIndicativeAirSectionCabinClassDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the promotion indicative air cabin class dropdown$")
	public void user_ticks_the_option_of_the_promotion_indicative_air_cabin_class_dropdown(String arg1) throws Throwable {
		promotionDetailsPage.clickIndicativeAirSectionCabinClassDropdownOption(arg1);
	}
	
	@Then("^user sees the promotion indicative air location dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_promotion_indicative_air_location_dropdown_contains(String arg1) throws Throwable {
		promotionDetailsPage.containsValueIndicativeAirSectionLocationDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the promotion indicative air location dropdown$")
	public void user_ticks_the_option_of_the_promotion_indicative_air_location_dropdown(String arg1) throws Throwable {
		promotionDetailsPage.clickIndicativeAirSectionLocationDropdownOption(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the promotion code column filter to filter the promotion results$")
	public void user_puts_in_the_promotion_code_column_filter_to_filter_the_promotion_results(String arg1) throws Throwable {
		promotionsPage.setCodeFilterInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the code for the promotion$")
	public void user_puts_as_the_code_for_the_promotion(String arg1) throws Throwable {
		promotionDetailsPage.setCodeInput(CommonFunctions.stringAppendDateTime(arg1));
	}
	
	@Then("^user sees the promotion consumer web medium description field$")
	public void user_sees_the_promotion_consumer_web_medium_description_field() throws Throwable {
		CommonFunctions.textVisibleInPage("Consumer Web Medium Description");
	}
	
	@When("^user toggles the atg consumer web option$")
	public void user_toggles_the_atg_consumer_web_option() throws Throwable {
		promotionDetailsPage.clickAtgConsumerWebCheckbox();
	}
	
	@Then("^user does not see the promotion consumer web medium description field$")
	public void user_does_not_see_the_promotion_consumer_web_medium_description_field() throws Throwable {
		promotionDetailsPage.hiddenConsumerWebMediumDescriptionInput();
	}
	
	@When("^user puts \"([^\"]*)\" in the promotion basic information description field$")
	public void user_puts_in_the_promotion_basic_information_description_field(String arg1) throws Throwable {
		promotionDetailsPage.setDescriptionInput(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the promotion basic information classification dropdown$")
	public void user_ticks_the_option_of_the_promotion_basic_information_classification_dropdown(String arg1) throws Throwable {
		promotionDetailsPage.selectClassificationValue(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the promotion basic information rate per person field$")
	public void user_puts_in_the_promotion_basic_information_rate_per_person_field(String arg1) throws Throwable {
		promotionDetailsPage.setRatePerPersonInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the promotion basic information consumer web medium description field$")
	public void user_puts_in_the_promotion_basic_information_consumer_web_medium_description_field(String arg1) throws Throwable {
		promotionDetailsPage.setConsumerWebMediumDescriptionInput(arg1);
	}
	
	@Then("^user sees that the promotion consumer web medium description field contains \"([^\"]*)\"$")
	public void user_sees_that_the_promotion_consumer_web_medium_description_field_contains(String arg1) throws Throwable {
		promotionDetailsPage.containsValueConsumerWebMediumDescriptionInput(arg1);
	}
	
	@Then("^user sees the promotion indicative air section fields$")
	public void user_sees_the_promotion_indicative_air_section_fields() throws Throwable {
		CommonFunctions.textVisibleInPage("Indicative Air");
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the promotion basic information action dropdown$")
	public void user_ticks_the_option_of_the_promotion_basic_information_action_dropdown(String arg1) throws Throwable {
		promotionDetailsPage.selectActionValue(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the promotion basic information revenue allocation dropdown$")
	public void user_ticks_the_option_of_the_promotion_basic_information_revenue_allocation_dropdown(String arg1) throws Throwable {
		promotionDetailsPage.selectRevenueAllocationValue(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the promotion customer market dropdown$")
	public void user_ticks_the_option_of_the_promotion_customer_market_dropdown(String arg1) throws Throwable {
		promotionDetailsPage.clickCustomerSectionMarketDropdownOption(arg1);
	}
	
	@Then("^user sees that the promotion consumer web short description field contains \"([^\"]*)\"$")
	public void user_sees_that_the_promotion_consumer_web_short_description_field_contains(String arg1) throws Throwable {
		promotionDetailsPage.containsValueConsumerWebShortDescriptionInput(arg1);
	}
	// End - Promotion Details Page Functions
	
	// Start - Supplier Page Functions
	@When("^user uses column filters to filter the suppliers result$")
	public void user_uses_column_filters_to_filter_the_suppliers_result() throws Throwable {
		suppliersPage.setIdFilterInput("5");
		suppliersPage.setNameFilterInput("tets");
	}
	
	@When("^user removes the suppliers column filters$")
	public void user_removes_the_suppliers_column_filters() throws Throwable {
		suppliersPage.setIdFilterInput("");
		suppliersPage.setNameFilterInput("");
	}
	
	@When("^user searches for a supplier$")
	public void user_searches_for_a_supplier() throws Throwable {
		suppliersPage.setNameInput("Test_S");
		suppliersPage.clickFindButton();
	}
	
	@Then("^user sees the supplier in the table$")
	public void user_sees_the_supplier_in_the_table() throws Throwable {
		suppliersPage.containsValueTopRowDataId(prop.getProperty("searchSupplierId"));
		suppliersPage.containsValueTopRowDataName(prop.getProperty("searchSupplierName"));
		suppliersPage.containsValueTopRowDataCity(prop.getProperty("searchSupplierCity"));
		suppliersPage.containsValueTopRowDataCountry(prop.getProperty("searchSupplierCountry"));
		suppliersPage.containsValueTopRowDataThirdParty(prop.getProperty("searchSupplierThirdParty"));
		suppliersPage.containsValueTopRowDataStatus(prop.getProperty("searchSupplierStatus"));
	}
	
	@Then("^user does not see add supplier button$")
	public void user_does_not_see_add_supplier_button() throws Throwable {
		suppliersPage.hiddenAddNewSupplierButton();
	}
	
	@Then("^user sees view supplier icon$")
	public void user_sees_view_supplier_icon() throws Throwable {
		suppliersPage.displayedTopRowDataViewButton();
	}
	
	@Then("^user does not see edit and copy supplier icons$")
	public void user_does_not_see_edit_and_copy_supplier_icons() throws Throwable {
		suppliersPage.hiddenTopRowDataCopyButton();
		suppliersPage.hiddenTopRowDataEditButton();
	}
	
	@When("^user searches for a supplier that is not existing$")
	public void user_searches_for_a_supplier_that_is_not_existing() throws Throwable {
		suppliersPage.setNameInput(prop.getProperty("wrongString"));
		suppliersPage.clickFindButton();
	}
	
	@When("^user searches for a supplier by his id$")
	public void user_searches_for_a_supplier_by_his_id() throws Throwable {
		suppliersPage.setNameInput("");
		suppliersPage.setIdInput(prop.getProperty("searchSupplierId"));
		
		supplierDetailsPage = suppliersPage.clickFindButton();
	}
	
	@Then("^user sees country is defaulted to all$")
	public void user_sees_country_is_defaulted_to_all() throws Throwable {
		suppliersPage.containsValueCountryDropdown("All");
	}
	
	@When("^user navigates to add new suppliers page$")
	public void user_navigates_to_add_new_suppliers_page() throws Throwable {
		supplierDetailsPage = suppliersPage.clickAddNewSupplierButton();
	}
	
	@When("^user views the supplier details$")
	public void user_views_the_supplier_details() throws Throwable {
		supplierDetailsPage = suppliersPage.clickTopRowDataViewButton();
	}
	
	@Then("^user sees edit and copy supplier icons$")
	public void user_sees_edit_and_copy_supplier_icons() throws Throwable {
		suppliersPage.displayedTopRowDataCopyButton();
		suppliersPage.displayedTopRowDataEditButton();
		
	}
	
	@When("^user edits the supplier$")
	public void user_edits_the_supplier() throws Throwable {
		supplierDetailsPage = suppliersPage.clickTopRowDataEditButton();
	}
	
	@Then("^user sees feedback message Supplier ID \"([^\"]*)\" displayed$")
	public void user_sees_feedback_message_Supplier_ID_displayed(String arg1) throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayedContainsString(arg1);
	}
	
	@When("^user copies the supplier$")
	public void user_copies_the_supplier() throws Throwable {
		supplierDetailsPage = suppliersPage.clickTopRowDataCopyButton();
	}
	// End - Supplier Page Functions
	
	// Start - Supplier Details Page Functions
	@When("^user selects \"([^\"]*)\" as the city in basic information section$")
	public void user_selects_as_the_city_in_basic_information_section(String arg1) throws Throwable {
		supplierDetailsPage.selectCityValue(arg1);
	}
	
	@When("^user expands the location contact and address accordion$")
	public void user_expands_the_location_contact_and_address_accordion() throws Throwable {
		supplierDetailsPage.clickLocationContactAndAddressAccordion();
	}
	
	@Then("^user sees country in the location contact and address section empty$")
	public void user_sees_country_in_the_location_contact_and_address_section_empty() throws Throwable {
		supplierDetailsPage.containsValueLocationContactAndAddressSectionCountryDropdown("Select a country then search for an address");
	}
	
	@Then("^user sees address search field in location contact and address section disabled$")
	public void user_sees_address_search_field_in_location_contact_and_address_section_disabled() throws Throwable {
		supplierDetailsPage.disabledLocationContactAndAddressSectionLocationSearchInput();
	}
	
	@Then("^user sees supplier headings renamed$")
	public void user_sees_supplier_headings_renamed() throws Throwable {
		CommonFunctions.textVisibleInPage("Additional Addresses");
	}
	
	@When("^user closes the view suppliers page$")
	public void user_closes_the_view_suppliers_page() throws Throwable {
		suppliersPage = supplierDetailsPage.clickTopCloseButton();
	}
	
	@When("^user saves the supplier$")
	public void user_saves_the_supplier() throws Throwable {
		suppliersPage = supplierDetailsPage.clickTopSaveButton();
	}
	
	@When("^user selects \"([^\"]*)\" in the location contact and address section$")
	public void user_selects_in_the_location_contact_and_address_section(String arg1) throws Throwable {
		supplierDetailsPage.selectLocationContactAndAddressSectionCountryValue(arg1);
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user searches for a specific address in the location contact and address section and selects it$")
	public void user_searches_for_a_specific_address_in_the_location_contact_and_address_section_and_selects_it() throws Throwable {
		CommonFunctions.pause(2500, false);
		supplierDetailsPage.setLocationContactAndAddressSectionLocationSearchInput("Test");
		CommonFunctions.pause(2500, false);
		user_selects_an_address_in_the_address_search_field_results();
	}
	
	@When("^user disables copying of billing address$")
	public void user_disables_copying_of_billing_address() throws Throwable {
		supplierDetailsPage.clickLocationContactAndAddressSectionCopyToBillingAddressCheckbox();
	}
	
	@When("^user disables copying of correspondence address$")
	public void user_disables_copying_of_correspondence_address() throws Throwable {
		supplierDetailsPage.clickLocationContactAndAddressSectionCopyToCorrespondenceAddressCheckbox();
	}
	
	@Then("^user sees address fields in the location contact and address section enabled$")
	public void user_sees_address_fields_in_the_location_contact_and_address_section_enabled() throws Throwable {
		supplierDetailsPage.enabledLocationContactAndAddressSectionAddressLine1Input();
		supplierDetailsPage.enabledLocationContactAndAddressSectionAddressLine2Input();
		supplierDetailsPage.enabledLocationContactAndAddressSectionAddressLine3Input();
		supplierDetailsPage.enabledLocationContactAndAddressSectionCityInput();
		supplierDetailsPage.enabledLocationContactAndAddressSectionStateDropdown();
		supplierDetailsPage.enabledLocationContactAndAddressSectionPostcodeInput();
	}
	
	@When("^user expands the additional addresses accordion$")
	public void user_expands_the_additional_addresses_accordion() throws Throwable {
		supplierDetailsPage.clickAdditionalAddressesAccordion();
	}
	
	@When("^user selects a country in the billing address section$")
	public void user_selects_a_country_in_the_billing_address_section() throws Throwable {
		supplierDetailsPage.selectAdditionalAddressesSectionBillingCountryValue("AUSTRALIA");
	}
	
	@When("^user searches for a specific address in the billing address section and selects it$")
	public void user_searches_for_a_specific_address_in_the_billing_address_section_and_selects_it() throws Throwable {
		CommonFunctions.pause(2500, false);
		supplierDetailsPage.setAdditionalAddressesSectionBillingLocationSearchInput("Test");
		CommonFunctions.pause(2500, false);
		user_selects_an_address_in_the_address_search_field_results();
	}
	
	@Then("^user sees address fields in the billing address section enabled$")
	public void user_sees_address_fields_in_the_billing_address_section_enabled() throws Throwable {
		supplierDetailsPage.enabledAdditionalAddressesSectionBillingAddressLine1Input();
		supplierDetailsPage.enabledAdditionalAddressesSectionBillingAddressLine2Input();
		supplierDetailsPage.enabledAdditionalAddressesSectionBillingAddressLine3Input();
		supplierDetailsPage.enabledAdditionalAddressesSectionBillingCityInput();
		supplierDetailsPage.enabledAdditionalAddressesSectionBillingStateDropdown();
		supplierDetailsPage.enabledAdditionalAddressesSectionBillingPostcodeInput();
	}
	
	@Given("^user selects a country in the correspondence address section$")
	public void user_selects_a_country_in_the_correspondence_address_section() throws Throwable {
		supplierDetailsPage.selectAdditionalAddressesSectionCorrespondenceCountryValue("AUSTRALIA");
	}
	
	@Given("^user searches for a specific address in the correspondence address section and selects it$")
	public void user_searches_for_a_specific_address_in_the_correspondence_address_section_and_selects_it() throws Throwable {
		CommonFunctions.pause(2500, false);
		supplierDetailsPage.setAdditionalAddressesSectionCorrespondenceLocationSearchInput("Test");
		CommonFunctions.pause(2500, false);
		user_selects_an_address_in_the_address_search_field_results();
	}
	
	@Then("^user sees address fields in the correspondence address section enabled$")
	public void user_sees_address_fields_in_the_correspondence_address_section_enabled() throws Throwable {
		supplierDetailsPage.enabledAdditionalAddressesSectionCorrespondenceAddressLine1Input();
		supplierDetailsPage.enabledAdditionalAddressesSectionCorrespondenceAddressLine2Input();
		supplierDetailsPage.enabledAdditionalAddressesSectionCorrespondenceAddressLine3Input();
		supplierDetailsPage.enabledAdditionalAddressesSectionCorrespondenceCityInput();
		supplierDetailsPage.enabledAdditionalAddressesSectionCorrespondenceStateDropdown();
		supplierDetailsPage.enabledAdditionalAddressesSectionCorrespondencePostcodeInput();
	}
	
	@When("^user expands the third party accordion$")
	public void user_expands_the_third_party_accordion() throws Throwable {
		supplierDetailsPage.clickThirdPartyAccordion();
	}
	
	@When("^user opens the third party popup$")
	public void user_opens_the_third_party_popup() throws Throwable {
		supplierDetailsPage.clickThirdPartySectionAddThirdPartySupplierButton();
	}
	
	@When("^user searches for a third party$")
	public void user_searches_for_a_third_party() throws Throwable {
		supplierDetailsPage.setThirdPartyPopupNameInput(prop.getProperty("searchSupplierName"));
		supplierDetailsPage.setThirdPartyPopupCityInput(prop.getProperty("searchSupplierCity"));
		supplierDetailsPage.clickThirdPartyPopupFindButton();
	}
	
	@Then("^user sees the third party information in the table$")
	public void user_sees_the_third_party_information_in_the_table() throws Throwable {
		supplierDetailsPage.containsValueThirdPartyPopupTopRowDataId(prop.getProperty("searchSupplierId"));
		supplierDetailsPage.containsValueThirdPartyPopupTopRowDataName(prop.getProperty("searchSupplierName"));
		supplierDetailsPage.containsValueThirdPartyPopupTopRowDataCity(prop.getProperty("searchSupplierCity"));
		supplierDetailsPage.containsValueThirdPartyPopupTopRowDataCountry(prop.getProperty("searchSupplierCountry"));
	}
	
	@When("^user searches for a third party that is not existing$")
	public void user_searches_for_a_third_party_that_is_not_existing() throws Throwable {
		supplierDetailsPage.setThirdPartyPopupNameInput(prop.getProperty("wrongString"));
		supplierDetailsPage.clickThirdPartyPopupFindButton();
	}
	
	@When("^user adds a third party to the supplier$")
	public void user_adds_a_third_party_to_the_supplier() throws Throwable {
		supplierDetailsPage.clickThirdPartyPopupName();
		supplierDetailsPage.clickThirdPartyPopupAddButton();
	}
	
	@Then("^user sees the third party under the supplier$")
	public void user_sees_the_third_party_under_the_supplier() throws Throwable {
		CommonFunctions.textVisibleInPage(prop.getProperty("searchSupplierName"));
	}
	
	@Then("^user sees third party check boxes where print voucher for third party is selected by default$")
	public void user_sees_third_party_check_boxes_where_print_voucher_for_third_party_is_selected_by_default() throws Throwable {
		supplierDetailsPage.displayedThirdPartySectionCorrespondenceToThirdPartyCheckbox();
		supplierDetailsPage.displayedThirdPartySectionBillingToThirdPartyCheckbox();
		supplierDetailsPage.checkThirdPartySectionPrintVoucherForThirdPartyCheckboxIsToggled();
	}
	
	@When("^user closes the third party popup$")
	public void user_closes_the_third_party_popup() throws Throwable {
		supplierDetailsPage.clickThirdPartyPopupCancelButton();
	}
	
	@Then("^user sees third party accordion$")
	public void user_sees_third_party_accordion() throws Throwable {
		CommonFunctions.textVisibleInPage("Third Party");
	}
	
	@When("^user enables billing to third party$")
	public void user_enables_billing_to_third_party() throws Throwable {
		supplierDetailsPage.clickThirdPartySectionBillingToThirdPartyCheckbox();
	}
	
	@When("^user enables correspondence to third party$")
	public void user_enables_correspondence_to_third_party() throws Throwable {
		supplierDetailsPage.clickThirdPartySectionCorrespondenceToThirdPartyCheckbox();
	}
	
	@Then("^user sees copy to billing address in location contact and address section is disabled$")
	public void user_sees_copy_to_billing_address_in_location_contact_and_address_section_is_disabled() throws Throwable {
		supplierDetailsPage.checkLocationContactAndAddressSectionCopyToBillingAddressCheckboxIsNotToggled();
	}
	
	@Then("^user sees copy to correspondence address in location contact and address section is disabled$")
	public void user_sees_copy_to_correspondence_address_in_location_contact_and_address_section_is_disabled() throws Throwable {
		supplierDetailsPage.checkLocationContactAndAddressSectionCopyToCorrespondenceAddressCheckboxIsNotToggled();
	}
	
	@When("^user expands the airline accordion$")
	public void user_expands_the_airline_accordion() throws Throwable {
		supplierDetailsPage.clickAirlineAccordion();
	}
	
	@When("^user enters an airline code$")
	public void user_enters_an_airline_code() throws Throwable {
		supplierDetailsPage.setAirlineSectionAirlineCodeInput("tst");
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user opens the airline class popup$")
	public void user_opens_the_airline_class_popup() throws Throwable {
		supplierDetailsPage.clickAirlineSectionAddAirlineClassButton();
	}
	
	@When("^user adds an airline class code$")
	public void user_adds_an_airline_class_code() throws Throwable {
		supplierDetailsPage.setAirlineClassPopupAirlineClassCodeInput("A");
		CommonFunctions.pause(2500, false);
		supplierDetailsPage.clickAirlineClassPopupAddButton();
	}
	
	@When("^user saves the airline class$")
	public void user_saves_the_airline_class() throws Throwable {
		supplierDetailsPage.clickAirlineClassPopupSaveButton();
	}
	
	@Then("^user sees the airline class information added$")
	public void user_sees_the_airline_class_information_added() throws Throwable {
		supplierDetailsPage.containsValueAirlineSectionTopRowDataClassCode("A");
	}
	
	@When("^user updates the airline class$")
	public void user_updates_the_airline_class() throws Throwable {
		supplierDetailsPage.clickAirlineSectionEditAirlineClassButton();
	}
	
	@When("^user adds a blank airline code$")
	public void user_adds_a_blank_airline_code() throws Throwable {
		supplierDetailsPage.clickAirlineClassPopupAddButton();
	}
	
	@When("^user adds an existing airline code$")
	public void user_adds_an_existing_airline_code() throws Throwable {
		supplierDetailsPage.setAirlineClassPopupAirlineClassCodeInput("A");
		supplierDetailsPage.clickAirlineClassPopupAddButton();
	}
	
	@When("^user adds a new airline class code$")
	public void user_adds_a_new_airline_class_code() throws Throwable {
		supplierDetailsPage.setAirlineClassPopupAirlineClassCodeInput("B");
		supplierDetailsPage.clickAirlineClassPopupAddButton();
	}
	
	@When("^user deletes the newly added airline class code$")
	public void user_deletes_the_newly_added_airline_class_code() throws Throwable {
		supplierDetailsPage.clickAirlineClassPopupDeleteButton();
	}
	
	@When("^user opens the price entry code popup$")
	public void user_opens_the_price_entry_code_popup() throws Throwable {
		supplierDetailsPage.clickAirlineSectionAddPriceEntryCodeButton();
	}
	
	@When("^user provides a price entry code information that has an empty price entry code$")
	public void user_provides_a_price_entry_code_information_that_has_an_empty_price_entry_code() throws Throwable {
		supplierDetailsPage.setPriceEntryCodePopupPriceEntryCodeInput("");
		supplierDetailsPage.setPriceEntryCodePopupPriceCalcRateInput("1");
		supplierDetailsPage.setPriceEntryCodePopupCostCalcRateInput("1");
	}
	
	@When("^user saves the price entry code$")
	public void user_saves_the_price_entry_code() throws Throwable {
		supplierDetailsPage.clickPriceEntryCodePopupSaveButton();
	}
	
	@When("^user provides a price entry code information that has an empty price calc rate$")
	public void user_provides_a_price_entry_code_information_that_has_an_empty_price_calc_rate() throws Throwable {
		supplierDetailsPage.selectPriceEntryCodePopupPriceEntryValue("WP");
		supplierDetailsPage.setPriceEntryCodePopupPriceCalcRateInput("");
		supplierDetailsPage.setPriceEntryCodePopupCostCalcRateInput("1");
	}
	
	@When("^user provides a price entry code information that has an empty cost calc rate$")
	public void user_provides_a_price_entry_code_information_that_has_an_empty_cost_calc_rate() throws Throwable {
		supplierDetailsPage.selectPriceEntryCodePopupPriceEntryValue("WP");
		supplierDetailsPage.setPriceEntryCodePopupPriceCalcRateInput("1");
		supplierDetailsPage.setPriceEntryCodePopupCostCalcRateInput("");
	}
	
	@When("^user closes the price entry code popup$")
	public void user_closes_the_price_entry_code_popup() throws Throwable {
		supplierDetailsPage.clickPriceEntryCodePopupCancelButton();
	}
	
	@When("^user adds an price entry code$")
	public void user_adds_an_price_entry_code() throws Throwable {
		supplierDetailsPage.selectPriceEntryCodePopupPriceEntryValue("WP");
		supplierDetailsPage.setPriceEntryCodePopupPriceCalcRateInput("1");
		supplierDetailsPage.setPriceEntryCodePopupCostCalcRateInput("1");
		supplierDetailsPage.clickPriceEntryCodePopupAddButton();
	}
	
	@When("^user adds an already existing price entry code$")
	public void user_adds_an_already_existing_price_entry_code() throws Throwable {
		supplierDetailsPage.selectPriceEntryCodePopupPriceEntryValue("WP");
		supplierDetailsPage.setPriceEntryCodePopupPriceCalcRateInput("1");
		supplierDetailsPage.setPriceEntryCodePopupCostCalcRateInput("1");
	}
	
	@When("^user removes the entry of the new price entry code$")
	public void user_removes_the_entry_of_the_new_price_entry_code() throws Throwable {
		supplierDetailsPage.setPriceEntryCodePopupPriceEntryCodeInput("");
		supplierDetailsPage.setPriceEntryCodePopupPriceCalcRateInput("");
		supplierDetailsPage.setPriceEntryCodePopupCostCalcRateInput("");
	}
	
	@Then("^user sees the price entry code information added$")
	public void user_sees_the_price_entry_code_information_added() throws Throwable {
		CommonFunctions.textVisibleInPage("TST*WP");
	}
	
	@When("^user edits an existing price entry code$")
	public void user_edits_an_existing_price_entry_code() throws Throwable {
		supplierDetailsPage.clickAirlineSectionEditPriceEntryCodeButton();
	}
	
	@Then("^user sees price entry and price entry code disabled for existing data$")
	public void user_sees_price_entry_and_price_entry_code_disabled_for_existing_data() throws Throwable {
		supplierDetailsPage.disabledPriceEntryCodePopupPriceEntryDropdown();
	}
	
	@When("^user adds a new price entry code$")
	public void user_adds_a_new_price_entry_code() throws Throwable {
		supplierDetailsPage.selectPriceEntryCodePopupPriceEntryValue("WPNC");
		supplierDetailsPage.setPriceEntryCodePopupPriceCalcRateInput("1");
		supplierDetailsPage.setPriceEntryCodePopupCostCalcRateInput("1");
		supplierDetailsPage.clickPriceEntryCodePopupAddButton();
	}
	
	@When("^user deletes the last price entry code$")
	public void user_deletes_the_last_price_entry_code() throws Throwable {
		supplierDetailsPage.clickPriceEntryCodePopupLastRowDataDeleteButton();
	}
	
	@Then("^user sees the price entry code information updated$")
	public void user_sees_the_price_entry_code_information_updated() throws Throwable {
		CommonFunctions.textVisibleInPage("TST*WP");
	}
	
	@When("^user enters a valid email address for the location contact and address section$")
	public void user_enters_a_valid_email_address_for_the_location_contact_and_address_section() throws Throwable {
		supplierDetailsPage.setLocationContactAndAddressSectionEmailInput("test1@test.com");
		supplierDetailsPage.clickLocationContactAndAddressSectionAddEmailAddressButton();
	}
	
	@When("^user adds a second valid email address for the location contact and address section$")
	public void user_adds_a_second_valid_email_address_for_the_location_contact_and_address_section() throws Throwable {
		supplierDetailsPage.setLocationContactAndAddressSectionEmailInput("test2@test.com");
		supplierDetailsPage.clickLocationContactAndAddressSectionAddEmailAddressButton();
	}
	
	@When("^user add three more valid email addresses for the location contact and address section$")
	public void user_add_three_more_valid_email_addresses_for_the_location_contact_and_address_section() throws Throwable {
		supplierDetailsPage.setLocationContactAndAddressSectionEmailInput("test3@test.com");
		supplierDetailsPage.clickLocationContactAndAddressSectionAddEmailAddressButton();
		supplierDetailsPage.setLocationContactAndAddressSectionEmailInput("test4@test.com");
		supplierDetailsPage.clickLocationContactAndAddressSectionAddEmailAddressButton();
		supplierDetailsPage.setLocationContactAndAddressSectionEmailInput("test5@test.com");
	}
	
	@Then("^user sees five valid email addresses in the location contact and address section$")
	public void user_sees_five_valid_email_addresses_in_the_location_contact_and_address_section() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'LocationDetailsContainer')]//input[contains(@id, 'EmailInput')])[4]")), "value", "test1@test.com");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'LocationDetailsContainer')]//input[contains(@id, 'EmailInput')])[3]")), "value", "test2@test.com");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'LocationDetailsContainer')]//input[contains(@id, 'EmailInput')])[2]")), "value", "test3@test.com");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'LocationDetailsContainer')]//input[contains(@id, 'EmailInput')])[1]")), "value", "test4@test.com");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'LocationDetailsContainer')]//input[contains(@id, 'EmailInput')])[5]")), "value", "test5@test.com");
	}
	
	@When("^user removes the last email addresses entered in the location contact and address section$")
	public void user_removes_the_last_email_addresses_entered_in_the_location_contact_and_address_section() throws Throwable {
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//div[contains(@id, 'LocationEmailContainer')]//a[contains(@id, 'RemoveEmailWebBlock')]"));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user does not see the email address removed from the location contact and address section$")
	public void user_does_not_see_the_email_address_removed_from_the_location_contact_and_address_section() throws Throwable {
		CommonFunctions.textHiddenInPage("test5@test.com");
	}
	
	@When("^user enters an invalid email address for the location contact and address section$")
	public void user_enters_an_invalid_email_address_for_the_location_contact_and_address_section() throws Throwable {
		supplierDetailsPage.clickLocationContactAndAddressSectionAddEmailAddressButton();
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("(//div[contains(@id, 'LocationDetailsContainer')]//input[contains(@id, 'EmailInput')])[5]"), "test");
		CommonFunctions.getLastElementInListByXPath("//div[contains(@id, 'LocationDetailsContainer')]//input[contains(@id, 'EmailInput')]").sendKeys(Keys.TAB);
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user selects billing address contact type as \"([^\"]*)\"$")
	public void user_selects_billing_address_contact_type_as(String arg1) throws Throwable {
		supplierDetailsPage.selectAdditionalAddressesSectionBillingContactTypeValue(arg1);
		user_removes_the_focus_on_the_field();
	}
	
	@When("^user selects correspondence address contact type as \"([^\"]*)\"$")
	public void user_selects_correspondence_address_contact_type_as(String arg1) throws Throwable {
		supplierDetailsPage.selectAdditionalAddressesSectionCorrespondenceContactTypeValue(arg1);
		user_removes_the_focus_on_the_field();
	}
	
	@When("^user expands the additional contacts accordion$")
	public void user_expands_the_additional_contacts_accordion() throws Throwable {
		CommonFunctions.scrollToTop();
		supplierDetailsPage.clickAdditionalContactsAccordion();
	}
	
	@When("^user provides information in the reservation fields$")
	public void user_provides_information_in_the_reservation_fields() throws Throwable {
		supplierDetailsPage.setAdditionalContactsSectionReservationsFirstNameInput("Test");
	}
	
	@When("^user expands the sage accordion$")
	public void user_expands_the_sage_accordion() throws Throwable {
		supplierDetailsPage.clickSageAccordion();
	}
	
	@When("^user opens the rollup popup$")
	public void user_opens_the_rollup_popup() throws Throwable {
		supplierDetailsPage.clickSageSectionManageRollupButton();
	}
	
	@When("^user adds a rollup$")
	public void user_adds_a_rollup() throws Throwable {
		supplierDetailsPage.selectRollupPopupOptionValue("Full Rollup");
		supplierDetailsPage.setRollupPopupEffectiveDateInput("20 Dec 2018");
	}
	
	@When("^user saves the supplier purchase rollup$")
	public void user_saves_the_supplier_purchase_rollup() throws Throwable {
		supplierDetailsPage.clickRollupPopupSaveButton();
	}
	
	@Then("^user sees the added rollup in the list of rollups$")
	public void user_sees_the_added_rollup_in_the_list_of_rollups() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'AccPORollupTable')]//td//div[contains(text(), 'Full Rollup')]")));
	}
	
	@When("^user adds a rollup without an option$")
	public void user_adds_a_rollup_without_an_option() throws Throwable {
		supplierDetailsPage.setRollupPopupEffectiveDateInput("20 Dec 2018");
		supplierDetailsPage.clickRollupPopupAddButton();
	}
	
	@When("^user removes all rollups of the supplier$")
	public void user_removes_all_rollups_of_the_supplier() throws Throwable {
		supplierDetailsPage.clickRollupPopupRemoveButton();
	}
	
	@Then("^user does not see any rollups for the supplier$")
	public void user_does_not_see_any_rollups_for_the_supplier() throws Throwable {
		CommonFunctions.textHiddenInPage("Full Rollup");
	}
	
	@Then("^user sees address fields in the location contact and address section disabled$")
	public void user_sees_address_fields_in_the_location_contact_and_address_section_disabled() throws Throwable {
		supplierDetailsPage.disabledLocationContactAndAddressSectionAddressLine1Input();
		supplierDetailsPage.disabledLocationContactAndAddressSectionAddressLine2Input();
		supplierDetailsPage.disabledLocationContactAndAddressSectionAddressLine3Input();
		supplierDetailsPage.disabledLocationContactAndAddressSectionCityInput();
		supplierDetailsPage.disabledLocationContactAndAddressSectionStateDropdown();
		supplierDetailsPage.disabledLocationContactAndAddressSectionPostcodeInput();
	}
	
	@When("^user searches for a specific address in the location contact and address section$")
	public void user_searches_for_a_specific_address_in_the_location_contact_and_address_section() throws Throwable {
		supplierDetailsPage.setLocationContactAndAddressSectionLocationSearchInput("Testar G");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the list of addresses that matches the entered text in the address search field$")
	public void user_sees_the_list_of_addresses_that_matches_the_entered_text_in_the_address_search_field() throws Throwable {
		CommonFunctions.textVisibleInPage("Testar Grove");
	}
	
	@Then("^user sees the address auto populated the appropriate address fields$")
	public void user_sees_the_address_auto_populated_the_appropriate_address_fields() throws Throwable {
		if (driver.getCurrentUrl().contains("SupplierDetails")) {
			supplierDetailsPage.enabledLocationContactAndAddressSectionAddressLine1Input();
			supplierDetailsPage.enabledLocationContactAndAddressSectionAddressLine2Input();
			supplierDetailsPage.enabledLocationContactAndAddressSectionAddressLine3Input();
			supplierDetailsPage.enabledLocationContactAndAddressSectionCityInput();
			supplierDetailsPage.enabledLocationContactAndAddressSectionStateDropdown();
			supplierDetailsPage.enabledLocationContactAndAddressSectionPostcodeInput();
		}
		else if (driver.getTitle().contains("CustomerDetails")) {
			customerDetailsPage.enabledAddressesSectionLocationAddressLine1Input();
			customerDetailsPage.enabledAddressesSectionLocationAddressLine2Input();
			customerDetailsPage.enabledAddressesSectionLocationAddressLine3Input();
			customerDetailsPage.enabledAddressesSectionLocationCityInput();
			customerDetailsPage.enabledAddressesSectionLocationStateDropdown();
			customerDetailsPage.enabledAddressesSectionLocationPostCodeInput();
		}
	}
	
	@Then("^user sees the new supplier form$")
	public void user_sees_the_new_supplier_form() throws Throwable {
		CommonFunctions.textVisibleInPage("Add New Supplier");
	}
	
	@When("^user provides necessary and valid information for the new supplier$")
	public void user_provides_necessary_and_valid_information_for_the_new_supplier() throws Throwable {
		usedSupplierName = supplierDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newSupplierName")));
		
		supplierDetailsPage.selectCityValue(prop.getProperty("newSupplierCity"));
		supplierDetailsPage.clickLocationContactAndAddressAccordion();
		supplierDetailsPage.setPhoneInput(prop.getProperty("newSupplierLCAPhone"));
		supplierDetailsPage.selectLocationContactAndAddressSectionCountryValue(prop.getProperty("newSupplierLCACountry"));
		CommonFunctions.pause(2500, false);
		supplierDetailsPage.setLocationContactAndAddressSectionLocationSearchInput("Test");
		CommonFunctions.pause(2500, false);
		user_selects_an_address_in_the_address_search_field_results();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user puts Canada as the country of the new supplier$")
	public void user_puts_Canada_as_the_country_of_the_new_supplier() throws Throwable {
		supplierDetailsPage.clickLocationContactAndAddressAccordion();
		supplierDetailsPage.selectLocationContactAndAddressSectionCountryValue("CANADA");
	}
	
	@When("^user provides some information for the new supplier$")
	public void user_provides_some_information_for_the_new_supplier() throws Throwable {
		supplierDetailsPage.setNameInput(prop.getProperty("newSupplierName"));
	}
	
	@When("^user cancels the adding of supplier$")
	public void user_cancels_the_adding_of_supplier() throws Throwable {
		suppliersPage = supplierDetailsPage.clickTopCloseButton();
	}
	
	@When("^user adds an already existing supplier$")
	public void user_adds_an_already_existing_supplier() throws Throwable {
		supplierDetailsPage.setNameInput(usedSupplierName);
		supplierDetailsPage.selectCityValue(prop.getProperty("newSupplierCity"));
		supplierDetailsPage.clickLocationContactAndAddressAccordion();
		supplierDetailsPage.setPhoneInput(prop.getProperty("newSupplierLCAPhone"));
		supplierDetailsPage.selectLocationContactAndAddressSectionCountryValue(prop.getProperty("newSupplierLCACountry"));
		CommonFunctions.pause(2500, false);
		supplierDetailsPage.setLocationContactAndAddressSectionLocationSearchInput("Test");
		CommonFunctions.pause(2500, false);
		user_selects_an_address_in_the_address_search_field_results();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees feedback message that supplier name already exists$")
	public void user_sees_feedback_message_that_supplier_name_already_exists() throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayedContainsString("already exists");
	}
	
	@When("^user provides airline information that is already existing$")
	public void user_provides_airline_information_that_is_already_existing() throws Throwable {
		usedSupplierName = supplierDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newSupplierName")));
		
		supplierDetailsPage.selectCityValue(prop.getProperty("newSupplierCity"));
		supplierDetailsPage.setPhoneInput(prop.getProperty("newSupplierLCAPhone"));
		supplierDetailsPage.selectLocationContactAndAddressSectionCountryValue(prop.getProperty("newSupplierLCACountry"));
		CommonFunctions.pause(2500, false);
		supplierDetailsPage.setLocationContactAndAddressSectionLocationSearchInput("Test");
		CommonFunctions.pause(2500, false);
		user_selects_an_address_in_the_address_search_field_results();
		CommonFunctions.pause(2500, false);
		user_expands_the_airline_accordion();
		user_enters_an_airline_code();
		user_opens_the_airline_class_popup();
		user_adds_an_airline_class_code();
		user_saves_the_airline_class();
	}
	
	@Then("^user sees feedback message that the airline is already existing$")
	public void user_sees_feedback_message_that_the_airline_is_already_existing() throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayedContainsString("The airline code tst is being used by");
	}
	
	@When("^user modifies certain information of the supplier$")
	public void user_modifies_certain_information_of_the_supplier() throws Throwable {
		supplierDetailsPage.setNameInput("Test_N_C");
	}
	
	@When("^user cancels the editing of the supplier$")
	public void user_cancels_the_editing_of_the_supplier() throws Throwable {
		suppliersPage = supplierDetailsPage.clickTopCloseButton();
	}
	
	@When("^user removes the airline code$")
	public void user_removes_the_airline_code() throws Throwable {
		supplierDetailsPage.clickAirlineAccordion();
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.BACK_SPACE));
		CommonFunctions.pause(500, false);
		CommonFunctions.clickOnPopUp("OK");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the airline class and pricing of the airline code removed$")
	public void user_sees_the_airline_class_and_pricing_of_the_airline_code_removed() throws Throwable {
		CommonFunctions.textHiddenInPage("Economy");
	}
	
	@Then("^user sees sage roll up button enabled$")
	public void user_sees_sage_roll_up_button_enabled() throws Throwable {
		supplierDetailsPage.enabledSageSectionManageRollupButton();
	}
	
	@When("^user deletes the third party of the supplier$")
	public void user_deletes_the_third_party_of_the_supplier() throws Throwable {
		supplierDetailsPage.clickSageSectionDeleteButton();
	}
	
	@Then("^user does not see the third party connected to the supplier$")
	public void user_does_not_see_the_third_party_connected_to_the_supplier() throws Throwable {
		CommonFunctions.textHiddenInPage("Test_N_");
	}
	
	@When("^user provides supplier name that is already existing$")
	public void user_provides_supplier_name_that_is_already_existing() throws Throwable {
		supplierDetailsPage.setNameInput("Test_SupplierPH");
	}
	
	@When("^user provides a new supplier name$")
	public void user_provides_a_new_supplier_name() throws Throwable {
		supplierDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newSupplierName")));
	}
	
	@When("^user cancels the copying of the supplier$")
	public void user_cancels_the_copying_of_the_supplier() throws Throwable {
		suppliersPage = supplierDetailsPage.clickTopCloseButton();
	}
	
	@When("^user uses the column filters then hit enter to lessen the third party results shown$")
	public void user_uses_the_column_filters_then_hit_enter_to_lessen_the_third_party_results_shown() throws Throwable {
		supplierDetailsPage.setThirdPartyPopupNameInput("TB");
		supplierDetailsPage.clickThirdPartyPopupFindButton();
		CommonFunctions.pause(2500, false);
		supplierDetailsPage.setThirdPartyPopupNameFilterInput("tb");
		user_presses_the_enter_key();
	}
	
	@Then("^user sees the third party supplier$")
	public void user_sees_the_third_party_supplier() throws Throwable {
		supplierDetailsPage.containsValueThirdPartyPopupTopRowDataName("TB");
	}
	// End - Supplier Details Page Functions
	
	// Start - Customers Page Functions
	@When("^user searches for a customer$")
	public void user_searches_for_a_customer() throws Throwable {
		customersPage.setNameInput(prop.getProperty("searchCustomerName"));
		customersPage.clickFindButton();
	}
	
	@When("^user views the customer$")
	public void user_views_the_customer() throws Throwable {
		customerDetailsPage = customersPage.clickTopRowDataViewButton();
	}
	
	@When("^user uses column filters to filter the customers result$")
	public void user_uses_column_filters_to_filter_the_customers_result() throws Throwable {
		customersPage.setIdFilterInput("8");
		customersPage.setNameFilterInput("test");
		customersPage.setTypeFilterInput("agent");
		customersPage.setAgencyChainFilterInput("travel");
	}
	
	@When("^user removes the customers column filters$")
	public void user_removes_the_customers_column_filters() throws Throwable {
		customersPage.setIdFilterInput("");
		customersPage.setNameFilterInput("");
		customersPage.setTypeFilterInput("");
		customersPage.setAgencyChainFilterInput("");
	}
	
	@When("^user opens the advanced search filters of the customers$")
	public void user_opens_the_advanced_search_filters_of_the_customers() throws Throwable {
		customersPage.clickAdvancedFilterButton();
	}
	
	@Then("^user sees the additional search options for the customers$")
	public void user_sees_the_additional_search_options_for_the_customers() throws Throwable {
		CommonFunctions.textVisibleInPage("Agent Type");
		CommonFunctions.textVisibleInPage("Agent Sub-Type");
		CommonFunctions.textVisibleInPage("Commission Type");
		CommonFunctions.textVisibleInPage("Default Currency");
		CommonFunctions.textVisibleInPage("Partner Class");
		CommonFunctions.textVisibleInPage("IATA");
		CommonFunctions.textVisibleInPage("Agent Status");
	}
	
	@When("^user searches for a customer by id$")
	public void user_searches_for_a_customer_by_id() throws Throwable {
		customersPage.setIdInput(prop.getProperty("searchCustomerId"));
		customersPage.clickFindButton();
	}
	
	@When("^user sees the customer information$")
	public void user_sees_the_customer_in_the_table() throws Throwable {
		CommonFunctions.textVisibleInPage("View Customer ID");
	}
	
	@Then("^user does not see the add new customer button$")
	public void user_does_not_see_the_add_new_customer_button() throws Throwable {
		customersPage.hiddenAddNewCustomerButton();
	}
	
	@When("^user searches for a customer that is not existing$")
	public void user_searches_for_a_customer_that_is_not_existing() throws Throwable {
		customersPage.setNameInput(prop.getProperty("wrongString"));
		customersPage.clickFindButton();
	}
	
	@When("^user resets the customer search options$")
	public void user_resets_the_customer_search_options() throws Throwable {
		customersPage.clickResetButton();
	}
	
	@Then("^user sees the customer search options will be emptied$")
	public void user_sees_the_customer_search_options_will_be_emptied() throws Throwable {
		customersPage.containsValueIdInput("");
	}
	
	@When("^user copies the customer$")
	public void user_copies_the_customer() throws Throwable {
		customerDetailsPage = customersPage.clickTopRowDataCopyButton();
	}
	
	@When("^user searches for a customer that has the type direct$")
	public void user_searches_for_a_customer_that_has_the_type_direct() throws Throwable {
		customersPage.selectTypeValue("Direct");
		
		customerDetailsPage = customersPage.clickFindButton();
		
		CommonFunctions.pause(1, true);
	}
	
	@Then("^user sees feedback message Customer ID \"([^\"]*)\" displayed$")
	public void user_sees_feedback_message_Customer_ID_displayed(String arg1) throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayedContainsString(arg1);
	}
	
	@When("^user navigates to add new customers page$")
	public void user_navigates_to_add_new_customers_page() throws Throwable {
		customerDetailsPage = customersPage.clickAddNewCustomerButton();
	}
	// End - Customers Page Functions
	
	// Start - Customer Details Page Functions
	@When("^user clicks on addresses accordion$")
	public void user_clicks_on_addresses_accordion() throws Throwable {
		customerDetailsPage.clickAddressesAccordion();
	}
	
	@Then("^user sees the customer address information$")
	public void user_sees_the_customer_address_information() throws Throwable {
		CommonFunctions.textVisibleInPage("Location");
		CommonFunctions.textVisibleInPage("Postal");
	}
	
	@When("^user clicks on trade booking setup accordion$")
	public void user_clicks_on_trade_booking_setup_accordion() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupAccordion();
	}
	
	@Then("^user sees the password is encrypted$")
	public void user_sees_the_password_is_encrypted() throws Throwable {
		customerDetailsPage.containsValueTradeBookingSetupSectionPassword("XXXXXXXX");
	}
	
	@When("^user closes the view customer page$")
	public void user_closes_the_view_customer_page() throws Throwable {
		customersPage = customerDetailsPage.clickBottomCloseButton();
	}
	
	@Then("^user sees some customer fields after copy are emptied$")
	public void user_sees_some_customer_fields_after_copy_are_emptied() throws Throwable {
		customerDetailsPage.containsValueNameInput("");
		customerDetailsPage.containsValueAgencyManagerInput("");
		customerDetailsPage.containsValueBDMDropdown("Select");
	}
	
	@When("^user provides the required information for the new customer after copying an existing customer$")
	public void user_provides_the_required_information_for_the_new_customer_after_copying_an_existing_customer() throws Throwable {
		usedCustomerName = customerDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("searchCustomerName")));
	}
	
	@When("^user saves the customer$")
	public void user_saves_the_customer() throws Throwable {
		customersPage = customerDetailsPage.clickBottomSaveButton();
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user cancels the copying of the customer$")
	public void user_cancels_the_copying_of_the_customer() throws Throwable {
		customersPage = customerDetailsPage.clickBottomCloseButton();
	}
	
	@When("^user provides a name that is the same as the original customer$")
	public void user_provides_a_name_that_is_the_same_as_the_original_customer() throws Throwable {
		customerDetailsPage.setNameInput(usedCustomerName);
	}
	
	@Then("^user sees the agency chain is direct$")
	public void user_sees_the_agency_chain_is_direct() throws Throwable {
		customerDetailsPage.containsValueAgencyChainDropdown("Direct");
	}
	
	@Then("^user sees some fields are disabled due to the customer type being direct$")
	public void user_sees_some_fields_are_disabled_due_to_the_customer_type_being_direct() throws Throwable {
		customerDetailsPage.disabledIATAInput();
		customerDetailsPage.disabledAgencyManagerInput();
		customerDetailsPage.disabledSpecialFaresCheckbox();
		customerDetailsPage.disabledAgentTypeDropdown();
		customerDetailsPage.disabledAgentSubTypeDropdown();
		customerDetailsPage.disabledCommissionTypeDropdown();
		customerDetailsPage.disabledBillingSectionABNVATNumberInput();
		customerDetailsPage.disabledBillingSectionGSTVATApplicableCheckbox();
		customerDetailsPage.disabledAPTPartnerClassDropdown();
		customerDetailsPage.disabledBDMDropdown();
	}
	
	@Then("^user does not see trade booking setup accordion$")
	public void user_does_not_see_trade_booking_setup_accordion() throws Throwable {
		customerDetailsPage.hiddenTradeBookingSetupAccordion();
	}
	
	@When("^user changes the customer type from direct to wholesaler$")
	public void user_changes_the_customer_type_from_direct_to_wholesaler() throws Throwable {
		customerDetailsPage.selectTypeValue("Wholesaler");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the agency chain is empty$")
	public void user_sees_the_agency_chain_is_empty() throws Throwable {
		customerDetailsPage.containsValueAgencyChainDropdown("Select");
	}
	
	@When("^user changes the customer type from wholesaler to staff$")
	public void user_changes_the_customer_type_from_wholesaler_to_staff() throws Throwable {
		customerDetailsPage.selectTypeValue("Staff");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the agency chain is disabled$")
	public void user_sees_the_agency_chain_is_disabled() throws Throwable {
		customerDetailsPage.disabledAgencyChainDropdown();
	}
	
	@Then("^user sees some fields are disabled due to the customer type being staff$")
	public void user_sees_some_fields_are_disabled_due_to_the_customer_type_being_staff() throws Throwable {
		customerDetailsPage.disabledIATAInput();
		customerDetailsPage.disabledAgencyManagerInput();
		customerDetailsPage.disabledSpecialFaresCheckbox();
		customerDetailsPage.disabledAgencyChainDropdown();
		customerDetailsPage.disabledAgentTypeDropdown();
		customerDetailsPage.disabledAgentSubTypeDropdown();
		customerDetailsPage.disabledCommissionTypeDropdown();
		customerDetailsPage.disabledBillingSectionABNVATNumberInput();
		customerDetailsPage.disabledBillingSectionGSTVATApplicableCheckbox();
		customerDetailsPage.disabledAPTPartnerClassDropdown();
	}
	
	@Then("^user sees exclude from crm option is auto-selected$")
	public void user_sees_exclude_from_crm_option_is_auto_selected() throws Throwable {
		customerDetailsPage.checkExcludeFromCRMCheckboxIsToggled();
	}
	
	@When("^user searches and selects a bdm$")
	public void user_searches_and_selects_a_bdm() throws Throwable {
		customerDetailsPage.selectBDMValue("Waikato");
	}
	
	@Then("^user sees the selected bdm in the bdm field$")
	public void user_sees_the_selected_bdm_in_the_bdm_field() throws Throwable {
		customerDetailsPage.containsValueBDMDropdown("APT AKL - 02 WAIKATO ; APT AKL - 111 (Anja Mansell)");
	}
	
	@When("^user searches for a bdm that is not existing$")
	public void user_searches_for_a_bdm_that_is_not_existing() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'BDM_Dropdown')]//span[contains(@class, 'select2-chosen')]")));
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), prop.getProperty("wrongString"));
		user_removes_the_focus_on_the_field();
	}
	
	@When("^user expands the addresses accordion$")
	public void user_expands_the_addresses_accordion() throws Throwable {
		customerDetailsPage.clickAddressesAccordion();
	}
	
	@When("^user selects \"([^\"]*)\" in the location addresses section$")
	public void user_selects_in_the_location_addresses_section(String arg1) throws Throwable {
		customerDetailsPage.selectAddressesSectionLocationCountryValue(arg1);
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees address fields in the location addresses section disabled$")
	public void user_sees_address_fields_in_the_location_addresses_section_disabled() throws Throwable {
		customerDetailsPage.disabledAddressesSectionLocationAddressLine1Input();
		customerDetailsPage.disabledAddressesSectionLocationAddressLine2Input();
		customerDetailsPage.disabledAddressesSectionLocationAddressLine3Input();
		customerDetailsPage.disabledAddressesSectionLocationCityInput();
		customerDetailsPage.disabledAddressesSectionLocationPostCodeInput();
		customerDetailsPage.disabledAddressesSectionLocationStateDropdown();
	}
	
	@When("^user searches for a specific address in the location addresses section$")
	public void user_searches_for_a_specific_address_in_the_location_addresses_section() throws Throwable {
		customerDetailsPage.setAddressesSectionLocationLocationSearchInput("Testar G");
		CommonFunctions.pause(10000, false);
	}
	
	@Then("^user sees address fields in the location addresses section enabled$")
	public void user_sees_address_fields_in_the_location_addresses_section_enabled() throws Throwable {
		customerDetailsPage.enabledAddressesSectionLocationAddressLine1Input();
		customerDetailsPage.enabledAddressesSectionLocationAddressLine2Input();
		customerDetailsPage.enabledAddressesSectionLocationAddressLine3Input();
		customerDetailsPage.enabledAddressesSectionLocationCityInput();
		customerDetailsPage.enabledAddressesSectionLocationPostCodeInput();
		customerDetailsPage.enabledAddressesSectionLocationStateDropdown();
	}
	
	@Then("^user sees copy to postal address in the location addresses section is enabled by default$")
	public void user_sees_copy_to_postal_address_in_the_location_addresses_section_is_enabled_by_default() throws Throwable {
		customerDetailsPage.checkAddressesSectionCopyToPostalAddressCheckboxIsToggled();
	}
	
	@Then("^user sees the country field in the postal addresses section disabled$")
	public void user_sees_the_country_field_in_the_postal_addresses_section_disabled() throws Throwable {
		customerDetailsPage.disabledAddressesSectionPostalCountryDropdown();
	}
	
	@When("^user disables the copy to postal address in the location addresses section$")
	public void user_disables_the_copy_to_postal_address_in_the_location_addresses_section() throws Throwable {
		customerDetailsPage.clickAddressesSectionCopyToPostalAddressCheckbox();
	}
	
	@Then("^user sees the country field in the postal addresses section enabled$")
	public void user_sees_the_country_field_in_the_postal_addresses_section_enabled() throws Throwable {
		customerDetailsPage.enabledAddressesSectionPostalCountryDropdown();
	}
	
	@When("^user searches for a specific address in the postal addresses section$")
	public void user_searches_for_a_specific_address_in_the_postal_addresses_section() throws Throwable {
		customerDetailsPage.setAddressesSectionPostalLocationSearchInput("Test");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees state dropdown in the postal addresses section contains values that can be selected$")
	public void user_sees_state_dropdown_in_the_postal_addresses_section_contains_values_that_can_be_selected() throws Throwable {
		customerDetailsPage.clickAddressesSectionPostalStateDropdown();
		CommonFunctions.textVisibleInPage("BUCKINGHAMSHIRE");
	}
	
	@When("^user selects \"([^\"]*)\" in the postal addresses section$")
	public void user_selects_in_the_postal_addresses_section(String arg1) throws Throwable {
		customerDetailsPage.selectAddressesSectionPostalCountryValue(arg1);
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user provides username and password for trade booking authentication$")
	public void user_provides_username_and_password_for_trade_booking_authentication() throws Throwable {
		usedCustomerUsername = customerDetailsPage.setTradeBookingSetupSectionUsernameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newCustomerUsername")));
		CommonFunctions.pause(2500, false);
		customerDetailsPage.setTradeBookingSetupSectionPasswordInput(prop.getProperty("newCustomerPassword"));
		CommonFunctions.pause(2500, false);
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user gives customer access to apt group site$")
	public void user_gives_customer_access_to_apt_group_site() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionAPTGroupSiteAccessCheckbox();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user enables customer to edit bookings$")
	public void user_enables_customer_to_edit_bookings() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionEditBookingsCheckbox();
	}
	
	@Then("^user sees certain fields of the trade booking setup accordion enabled$")
	public void user_sees_certain_fields_of_the_trade_booking_setup_accordion_enabled() throws Throwable {
		customerDetailsPage.enabledTradeBookingSetupSectionCreateBookingsCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionEditBookingsCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionViewAllBookingsCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionEditAllBookingsCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionViewAllCustomerMarketsCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionHideCommissionCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionLockedCheckbox();
	}
	
	@Then("^user sees customer is enabled to create bookings$")
	public void user_sees_customer_is_enabled_to_create_bookings() throws Throwable {
		customerDetailsPage.enabledTradeBookingSetupSectionCreateBookingsCheckbox();
	}
	
	@When("^user gives customer rights to edit all bookings$")
	public void user_gives_customer_rights_to_edit_all_bookings() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionEditAllBookingsCheckbox();
	}
	
	@Then("^user sees customer is also enabled to view all bookings$")
	public void user_sees_customer_is_also_enabled_to_view_all_bookings() throws Throwable {
		customerDetailsPage.checkTradeBookingSetupSectionViewAllBookingsCheckboxIsToggled();
	}
	
	@When("^user revokes the customer rights to view all bookings$")
	public void user_revokes_the_customer_rights_to_view_all_bookings() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionViewAllBookingsCheckbox();
	}
	
	@Then("^user sees customer is also disabled to edit all bookings$")
	public void user_sees_customer_is_also_disabled_to_edit_all_bookings() throws Throwable {
		customerDetailsPage.checkTradeBookingSetupSectionEditAllBookingsCheckboxIsNotToggled();
	}
	
	@When("^user revokes the access of the customer to apt group site$")
	public void user_revokes_the_access_of_the_customer_to_apt_group_site() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionAPTGroupSiteAccessCheckbox();
	}
	
	@Then("^user sees trade booking setup options remain unchanged$")
	public void user_sees_trade_booking_setup_options_remain_unchanged() throws Throwable {
		customerDetailsPage.checkTradeBookingSetupSectionCreateBookingsCheckboxIsToggled();
	}
	
	@When("^user expands the trade booking setup accordion$")
	public void user_expands_the_trade_booking_setup_accordion() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupAccordion();
	}
	
	@When("^user provides necessary information for the new customer$")
	public void user_provides_necessary_information_for_the_new_customer() throws Throwable {
		customerDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newCustomerName")));
		
		usedCustomerEmail = customerDetailsPage.setEmailInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newCustomerEmail")).concat("@test.com"));
		
		customerDetailsPage.setPhoneInput(prop.getProperty("newCustomerPhone"));
		customerDetailsPage.selectTypeValue(prop.getProperty("newCustomerType"));
		CommonFunctions.pause(5000, false);
		customerDetailsPage.selectAgencyChainValue(prop.getProperty("newCustomerAgencyChain"));
		customerDetailsPage.selectAgentTypeValue(prop.getProperty("newCustomerAgentType"));
		customerDetailsPage.selectAgentSubTypeValue(prop.getProperty("newCustomerAgentSubType"));
		customerDetailsPage.selectMarketValue(prop.getProperty("newCustomerMarket"));
		customerDetailsPage.selectDefaultCurrencyValue(prop.getProperty("newCustomerDefaultCurrency"));
		customerDetailsPage.selectStatusValue(prop.getProperty("newCustomerStatus"));
		customerDetailsPage.clickAddressesAccordion();
		user_selects_in_the_location_addresses_section("AUSTRALIA");
		user_searches_for_a_specific_address_in_the_location_addresses_section();
		user_selects_an_address_in_the_address_search_field_results();
	}
	
	@When("^user opens the add product access level popup$")
	public void user_opens_the_add_product_access_level_popup() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionAddProductAccessLevelButton();
	}
	
	@When("^user cancels the addition of new product access level$")
	public void user_cancels_the_addition_of_new_product_access_level() throws Throwable {
		customerDetailsPage.clickProductAccessLevelPopupCancelButton();
	}
	
	@Then("^user does not see the add product access level popup$")
	public void user_does_not_see_the_add_product_access_level_popup() throws Throwable {
		CommonFunctions.textHiddenInPage("Add Product Access Level");
	}
	
	@Then("^user sees the customer field in the add product access level popup$")
	public void user_sees_the_customer_field_in_the_add_product_access_level_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Customer:");
	}
	
	@When("^user saves the product access level$")
	public void user_saves_the_product_access_level() throws Throwable {
		customerDetailsPage.clickProductAccessLevelPopupSaveButton();
	}
	
	@Then("^user sees the add product access level popup with its fields$")
	public void user_sees_the_add_product_access_level_popup_with_its_fields() throws Throwable {
		CommonFunctions.textVisibleInPage("Brand");
		CommonFunctions.textVisibleInPage("Tour Market");
		CommonFunctions.textVisibleInPage("Package Type");
		CommonFunctions.textVisibleInPage("Tour Classification");
		CommonFunctions.textVisibleInPage("Currency");
		CommonFunctions.textVisibleInPage("Office");
		CommonFunctions.textVisibleInPage("Department");
	}
	
	@When("^user selects valid product access level information$")
	public void user_selects_valid_product_access_level_information() throws Throwable {
		customerDetailsPage.selectProductAccessLevelPopupCurrencyValue("AUD");
		customerDetailsPage.selectProductAccessLevelPopupOfficeValue("APT Auckland");
		CommonFunctions.pause(2500, false);
		customerDetailsPage.selectProductAccessLevelPopupDepartmentValue("Sales");
	}
	
	@Then("^user sees the added product access level$")
	public void user_sees_the_added_product_access_level() throws Throwable {
		CommonFunctions.textVisibleInPage("APT Auckland");
	}
	
	@When("^user edits the recently added product access level$")
	public void user_edits_the_recently_added_product_access_level() throws Throwable {
		customerDetailsPage.clickTopRowDataEditProductAccessLevelButton();
	}
	
	@Then("^user sees the existing product access level$")
	public void user_sees_the_existing_product_access_level() throws Throwable {
		CommonFunctions.textVisibleInPage("APT Auckland");
	}
	
	@When("^user modifies the recently added product access level$")
	public void user_modifies_the_recently_added_product_access_level() throws Throwable {
		customerDetailsPage.selectProductAccessLevelPopupDepartmentValue("Operations");
	}
	
	@Then("^user sees the modified product access level$")
	public void user_sees_the_modified_product_access_level() throws Throwable {
		CommonFunctions.textVisibleInPage("Operations");
	}
	
	@When("^user decides to add a new product access level$")
	public void user_decides_to_add_a_new_product_access_level() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionAddProductAccessLevelButton();
		user_selects_valid_product_access_level_information();
		customerDetailsPage.clickProductAccessLevelPopupSaveButton();
	}
	
	@Then("^user sees the additional product access level$")
	public void user_sees_the_additional_product_access_level() throws Throwable {
		CommonFunctions.textVisibleInPage("Sales");
	}
	
	@When("^user expands the billing accordion$")
	public void user_expands_the_billing_accordion() throws Throwable {
		customerDetailsPage.clickBillingAccordion();
	}
	
	@Then("^user can see the payments and accounts contract section$")
	public void user_can_see_the_payments_and_accounts_contract_section() throws Throwable {
		customerDetailsPage.displayedBillingSectionPaymentMethodContainer();
		customerDetailsPage.displayedBillingSectionAccountsContractContainer();
	}
	
	@Then("^user sees cheque as default payment type$")
	public void user_sees_cheque_as_default_payment_type() throws Throwable {
		customerDetailsPage.checkBillingSectionChequeRadioButtonIsToggled();
	}
	
	@Then("^user sees some payment method fields are hidden$")
	public void user_sees_some_payment_method_fields_are_hidden() throws Throwable {
		customerDetailsPage.hiddenBillingSectionBankBSB();
		customerDetailsPage.hiddenBillingSectionBankAccountNumber();
		customerDetailsPage.hiddenBillingSectionBankAccountTitle();
	}
	
	@When("^user selects eft as payment type$")
	public void user_selects_eft_as_payment_type() throws Throwable {
		customerDetailsPage.clickBillingSectionEFTRadioButton();
	}
	
	@Then("^user sees some payment method fields are shown$")
	public void user_sees_some_payment_method_fields_are_shown() throws Throwable {
		customerDetailsPage.displayedBillingSectionBankBSBInput();
		customerDetailsPage.displayedBillingSectionBankAccountNumberInput();
		customerDetailsPage.displayedBillingSectionBankAccountTitleInput();
	}
	
	@When("^user provides email for billing$")
	public void user_provides_email_for_billing() throws Throwable {
		customerDetailsPage.setBillingSectionEmailInput("Test");
	}
	
	@When("^user updates the customer$")
	public void user_updates_the_customer() throws Throwable {
		customerDetailsPage = customersPage.clickTopRowDataEditButton();
	}
	
	@When("^user selects cheque as payment type$")
	public void user_selects_cheque_as_payment_type() throws Throwable {
		customerDetailsPage.clickBillingSectionChequeRadioButton();
	}
	
	@When("^user provides invalid email for billing$")
	public void user_provides_invalid_email_for_billing() throws Throwable {
		customerDetailsPage.setBillingSectionEmailInput("test");
	}
	
	@When("^user deletes the recently added product access level$")
	public void user_deletes_the_recently_added_product_access_level() throws Throwable {
		customerDetailsPage.clickTopRowDataDeleteProductAccessLevelButton();
	}
	
	@When("^user cancels the deletion of the recently added product access level$")
	public void user_cancels_the_deletion_of_the_recently_added_product_access_level() throws Throwable {
		customerDetailsPage.clickDeleteProductAccessLevelPopupCancelButton();
	}
	
	@Then("^user sees the recently added product access level$")
	public void user_sees_the_recently_added_produc_access_level() throws Throwable {
		CommonFunctions.textVisibleInPage("Operations");
	}
	
	@When("^user confirms the deletion of the recently added product access level$")
	public void user_confirms_the_deletion_of_the_recently_added_product_access_level() throws Throwable {
		customerDetailsPage.clickDeleteProductAccessLevelPopupOKButton();
	}
	
	@Then("^user does not see the recently added product access level$")
	public void user_does_not_see_the_recently_added_product_access_level() throws Throwable {
		CommonFunctions.textHiddenInPage("Operations");
	}
	
	@Then("^user sees bdm field$")
	public void user_sees_bdm_field() throws Throwable {
		customerDetailsPage.displayedBDMDropdown();
	}
	
	@When("^user searches for a bdm$")
	public void user_searches_for_a_bdm() throws Throwable {
		customerDetailsPage.clickBDMDropdown();
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), "APT Special");
	}
	
	@Then("^user sees the bdm search results$")
	public void user_sees_the_bdm_search_results() throws Throwable {
		CommonFunctions.textVisibleInPage("APT SPECIAL");
	}
	
	@When("^user selects a bdm among the search results$")
	public void user_selects_a_bdm_among_the_search_results() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	@When("^user searches for an invalid bdm$")
	public void user_searches_for_an_invalid_bdm() throws Throwable {
		customerDetailsPage.clickBDMDropdown();
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), prop.getProperty("wrongString"));
	}
	
	@Then("^user sees there are no bdm search results$")
	public void user_sees_there_are_no_bdm_search_results() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//li[contains(@class, 'no-results')]")));
	}
	
	@When("^user searches for a new bdm$")
	public void user_searches_for_a_new_bdm() throws Throwable {
		customerDetailsPage.selectBDMValue("NSW Directs");
	}
	
	@Then("^user sees the newly selected bdm in the bdm field$")
	public void user_sees_the_newly_selected_bdm_in_the_bdm_field() throws Throwable {
		customerDetailsPage.containsValueBDMDropdown("BS4 DUD NSW DIRECTS ; BS4 DUD NSW Directs ( BS4 DUD NSW Directs)");
	}
	
	@Then("^user sees the new bdm in the bdm field$")
	public void user_sees_the_new_bdm_in_the_bdm_field() throws Throwable {
		customerDetailsPage.containsValueBDMDropdown("AS4 SYD APT SPECIAL AGENTS ; AS4 SYD APT Special Agents ( AS4 SYD APT Special Agents)");
	}
	
	@When("^user provides some information for the new customer$")
	public void user_provides_some_information_for_the_new_customer() throws Throwable {
		customerDetailsPage.setNameInput("Test");
	}
	
	@When("^user cancels the addition of the new customer$")
	public void user_cancels_the_addition_of_the_new_customer() throws Throwable {
		customersPage = customerDetailsPage.clickBottomCloseButton();
	}
	
	@When("^user provides email for customer$")
	public void user_provides_email_for_customer() throws Throwable {
		customerDetailsPage.setEmailInput("test");
	}
	
	@When("^user updates some information for the customer$")
	public void user_updates_some_information_for_the_customer() throws Throwable {
		customerDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("searchCustomerName")));
	}
	
	@When("^user cancels the update of the customer$")
	public void user_cancels_the_update_of_the_customer() throws Throwable {
		customersPage = customerDetailsPage.clickBottomCloseButton();
	}
	
	@When("^user updates some information for the customer but misses some fields$")
	public void user_updates_some_information_for_the_customer_but_misses_some_fields() throws Throwable {
		customerDetailsPage.setNameInput("");
		customerDetailsPage.selectTypeValue("Inbound Operator");
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user changes the customer type to direct$")
	public void user_changes_the_customer_type_to_direct() throws Throwable {
		customerDetailsPage.selectTypeValue("Direct");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the agency chain is direct and is disabled$")
	public void user_sees_the_agency_chain_is_direct_and_is_disabled() throws Throwable {
		customerDetailsPage.containsValueAgencyChainDropdown("Direct");
		customerDetailsPage.disabledAgencyChainDropdown();
	}
	
	@When("^user changes the customer type to inbound operator$")
	public void user_changes_the_customer_type_to_inbound_operator() throws Throwable {
		customerDetailsPage.selectTypeValue("Inbound Operator");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the agency chain is empty and enabled$")
	public void user_sees_the_agency_chain_is_empty_and_enabled() throws Throwable {
		customerDetailsPage.containsValueAgencyChainDropdown("Select");
		customerDetailsPage.enabledAgencyChainDropdown();
	}
	
	@When("^user changes the customer type to staff$")
	public void user_changes_the_customer_type_to_staff() throws Throwable {
		customerDetailsPage.selectTypeValue("Staff");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees copy to postal address in the location addresses section is enabled$")
	public void user_sees_copy_to_postal_address_in_the_location_addresses_section_is_enabled() throws Throwable {
		customerDetailsPage.checkAddressesSectionCopyToPostalAddressCheckboxIsToggled();
	}
	
	@Then("^user sees the username and password fields and the disabled toggle for giving customers the apt group site access$")
	public void user_sees_the_username_and_password_fields_and_the_disabled_toggle_for_giving_customers_the_apt_group_site_access() throws Throwable {
		customerDetailsPage.displayedTradeBookingSetupSectionUsernameInput();
		customerDetailsPage.displayedTradeBookingSetupSectionPasswordInput();
		customerDetailsPage.disabledTradeBookingSetupSectionAPTGroupSiteAccessCheckbox();
	}
	
	@When("^user provides username but left password empty for trade booking authentication$")
	public void user_provides_username_but_left_password_empty_for_trade_site_authentication() throws Throwable {
		customerDetailsPage.setTradeBookingSetupSectionUsernameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newCustomerUsername")));
		customerDetailsPage.setTradeBookingSetupSectionPasswordInput("");
	}
	
	@Then("^user sees the toggle for giving customers the apt group site access disabled$")
	public void user_sees_the_toggle_for_giving_customers_the_apt_group_site_access_disabled() throws Throwable {
		customerDetailsPage.disabledTradeBookingSetupSectionAPTGroupSiteAccessCheckbox();
	}
	
	@When("^user provides password but left username empty for trade booking authentication$")
	public void user_provides_password_but_left_username_empty_for_trade_site_authentication() throws Throwable {
		customerDetailsPage.setTradeBookingSetupSectionPasswordInput(prop.getProperty("newCustomerPassword"));
		customerDetailsPage.setTradeBookingSetupSectionUsernameInput("");
	}
	
	@When("^user provides existing username$")
	public void user_provides_existing_username() throws Throwable {
		customerDetailsPage.setTradeBookingSetupSectionUsernameInput("Test");
	}
	
	@When("^user provides invalid password$")
	public void user_provides_invalid_password() throws Throwable {
		customerDetailsPage.setTradeBookingSetupSectionPasswordInput("Test");
	}
	
	@When("^user clicks on the password field$")
	public void user_clicks_on_the_password_field() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionPasswordInput();
	}
	
	@Then("^user sees the password rules$")
	public void user_sees_the_password_rules() throws Throwable {
		CommonFunctions.textVisibleInPage("Must be between");
	}
	
	@When("^user provides username with quotation marks$")
	public void user_provides_username_with_quotation_marks() throws Throwable {
		customerDetailsPage.setTradeBookingSetupSectionUsernameInput("\"Test'\"");
	}
	
	@Then("^user sees the toggle for giving customers the apt group site access enabled$")
	public void user_sees_the_toggle_for_giving_customers_the_apt_group_site_access_enabled() throws Throwable {
		customerDetailsPage.enabledTradeBookingSetupSectionAPTGroupSiteAccessCheckbox();
	}
	
	@Then("^user sees customer access levels and login tracking enabled$")
	public void user_sees_customer_access_levels_and_login_tracking_enabled() throws Throwable {
		customerDetailsPage.enabledTradeBookingSetupSectionCreateBookingsCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionEditBookingsCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionLockedCheckbox();
	}
	
	@Then("^user sees the toggle for generating an email for registration$")
	public void user_sees_the_toggle_for_generating_an_email_for_registration() throws Throwable {
		customerDetailsPage.displayedTradeBookingSetupSectionSendEmailRegistrationCheckbox();
	}
	
	@Then("^user sees that the customer does not have apt group site access$")
	public void user_sees_that_the_customer_does_not_have_apt_group_site_access() throws Throwable {
		customerDetailsPage.checkTradeBookingSetupSectionAPTGroupSiteAccessCheckboxIsNotToggled();
	}
	
	@Then("^user sees certain fields of the trade booking setup accordion disabled$")
	public void user_sees_certain_fields_of_the_trade_site_setup_accordion_disabled() throws Throwable {
		customerDetailsPage.disabledTradeBookingSetupSectionCreateBookingsCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionEditBookingsCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionViewAllBookingsCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionEditAllBookingsCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionViewAllCustomerMarketsCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionAPTGroupSiteAccessCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionSendEmailRegistrationCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionHideCommissionCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionLockedCheckbox();
	}
	
	@Then("^user sees the option for sending a registration email enabled$")
	public void user_sees_the_option_for_sending_a_registration_email_enabled() throws Throwable {
		customerDetailsPage.enabledTradeBookingSetupSectionSendEmailRegistrationCheckbox();
	}
	
	@When("^user enables the sending a registration email option$")
	public void user_enables_the_sending_a_registration_email_option() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionSendEmailRegistrationCheckbox();
	}
	
	@Then("^user sees the email form$")
	public void user_sees_the_email_form() throws Throwable {
		customerDetailsPage.displayedTradeBookingSetupSectionEmailForm();
	}
	
	@Then("^user sees the to field with the value from the basic information$")
	public void user_sees_the_to_field_with_the_value_from_the_basic_information() throws Throwable {
		customerDetailsPage.containsValueTradeBookingSetupSectionToEmailInput(usedCustomerEmail);
	}
	
	@Then("^user sees the username and password provided in the authentication section$")
	public void user_sees_the_username_and_password_provided_in_the_authentication_section() throws Throwable {
		// Assert.assertTrue(driver.findElement(By.xpath("(//title[contains(@data-cke-title,
		// '')]//parent::head//following-sibling::body//p//child::text())[5]")).getText().contains(usedCustomerUsername));
		// Assert.assertTrue(driver.findElement(By.xpath("(//title[contains(@data-cke-title,
		// '')]//parent::head//following-sibling::body//p//child::text())[6]")).getText().contains(prop.getProperty("newCustomerPassword")));
	}
	
	@Then("^user sees the url source from the database$")
	public void user_sees_the_url_source_from_the_database() throws Throwable {
		// Assert.assertTrue(driver.findElement(By.xpath("(//title[contains(@data-cke-title,
		// '')]//parent::head//following-sibling::body//p//child::text())[3]")).getText().contains("http://www.aptgroup.travel"));
	}
	
	@Then("^user sees the cc and bcc fields$")
	public void user_sees_the_cc_and_bcc_fields() throws Throwable {
		customerDetailsPage.displayedTradeBookingSetupSectionCcEmailButton();
		customerDetailsPage.displayedTradeBookingSetupSectionBccEmailButton();
	}
	
	@Then("^user sees the fields under the booking permissions group enabled$")
	public void user_sees_the_fields_under_the_booking_permissions_group_enabled() throws Throwable {
		customerDetailsPage.enabledTradeBookingSetupSectionCreateBookingsCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionEditBookingsCheckbox();
	}
	
	@Then("^user sees the locked checkbox under the login tracking group enabled$")
	public void user_sees_the_locked_checkbox_under_the_login_tracking_group_enabled() throws Throwable {
		customerDetailsPage.enabledTradeBookingSetupSectionLockedCheckbox();
	}
	
	@Then("^user sees the fields under the agency chain group disabled$")
	public void user_sees_the_fields_under_the_agency_chain_group_disabled() throws Throwable {
		customerDetailsPage.disabledTradeBookingSetupSectionViewAllBookingsCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionEditAllBookingsCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionViewAllCustomerMarketsCheckbox();
	}
	
	@Then("^user sees the add product access level button disabled$")
	public void user_sees_the_add_product_access_level_button_disabled() throws Throwable {
		customerDetailsPage.disabledTradeBookingSetupSectionAddProductAccessLevelButton();
	}
	
	@Then("^user sees the hide commissions toggle disabled$")
	public void user_sees_the_hide_commissions_toggle_disabled() throws Throwable {
		customerDetailsPage.disabledTradeBookingSetupSectionHideCommissionCheckbox();
	}
	
	@Then("^user sees the fields under the agency chain group enabled$")
	public void user_sees_the_fields_under_the_agency_chain_group_enabled() throws Throwable {
		customerDetailsPage.enabledTradeBookingSetupSectionViewAllBookingsCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionEditAllBookingsCheckbox();
		customerDetailsPage.enabledTradeBookingSetupSectionViewAllCustomerMarketsCheckbox();
	}
	
	@Then("^user sees the add product access level button enabled$")
	public void user_sees_the_add_product_access_level_button_enabled() throws Throwable {
		customerDetailsPage.enabledTradeBookingSetupSectionAddProductAccessLevelButton();
	}
	
	@Then("^user sees the hide commissions toggle enabled$")
	public void user_sees_the_hide_commissions_toggle_enabled() throws Throwable {
		customerDetailsPage.enabledTradeBookingSetupSectionHideCommissionCheckbox();
	}
	
	@When("^user decides to hide the commissions of the customer$")
	public void user_decides_to_hide_the_commissions_of_the_customer() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionHideCommissionCheckbox();
	}
	
	@When("^user decides to lock the login tracking of the customer$")
	public void user_decides_to_lock_the_login_tracking_of_the_customer() throws Throwable {
		customerDetailsPage.clickTradeBookingSetupSectionLockedCheckbox();
	}
	
	@Then("^user sees the fields under the booking permissions group disabled$")
	public void user_sees_the_fields_under_the_booking_permissions_group_disabled() throws Throwable {
		customerDetailsPage.disabledTradeBookingSetupSectionCreateBookingsCheckbox();
		customerDetailsPage.disabledTradeBookingSetupSectionEditBookingsCheckbox();
	}
	
	@Then("^user sees the locked checkbox under the login tracking group disabled$")
	public void user_sees_the_locked_checkbox_under_the_login_tracking_group_disabled() throws Throwable {
		customerDetailsPage.disabledTradeBookingSetupSectionLockedCheckbox();
	}
	
	@Then("^user sees that the customer is unable to edit bookings$")
	public void user_sees_that_the_customer_is_unable_to_edit_bookings() throws Throwable {
		customerDetailsPage.checkTradeBookingSetupSectionEditBookingsCheckboxIsNotToggled();
	}
	
	@Then("^user sees that the customer does not have rights to edit all bookings$")
	public void user_sees_that_the_customer_does_not_have_rights_to_edit_all_bookings() throws Throwable {
		customerDetailsPage.checkTradeBookingSetupSectionEditAllBookingsCheckboxIsNotToggled();
	}
	
	@Then("^user sees that the toggle for hiding the commissions of the customer has been turned off$")
	public void user_sees_that_the_toggle_for_hiding_the_commissions_of_the_customer_has_been_turned_off() throws Throwable {
		customerDetailsPage.checkTradeBookingSetupSectionHideCommissionCheckboxIsNotToggled();
	}
	
	@Then("^user sees that the toggle for locking the login tracking of the customer has been turned off$")
	public void user_sees_that_the_toggle_for_locking_the_login_tracking_of_the_customer_has_been_turned_off() throws Throwable {
		customerDetailsPage.checkTradeBookingSetupSectionLockedCheckboxIsNotToggled();
	}
	
	@Then("^user sees the trade booking setup values thats been provided is not removed$")
	public void user_sees_the_trade_booking_setup_values_thats_been_provided_is_not_removed() throws Throwable {
		customerDetailsPage.checkTradeBookingSetupSectionAPTGroupSiteAccessCheckboxIsToggled();
		customerDetailsPage.checkTradeBookingSetupSectionEditBookingsCheckboxIsToggled();
		customerDetailsPage.checkTradeBookingSetupSectionEditAllBookingsCheckboxIsToggled();
		CommonFunctions.textVisibleInPage("APT Auckland");
		customerDetailsPage.checkTradeBookingSetupSectionHideCommissionCheckboxIsToggled();
		customerDetailsPage.checkTradeBookingSetupSectionLockedCheckboxIsToggled();
	}
	
	@When("^user provides both username and password empty for trade booking authentication$")
	public void user_provides_both_username_and_password_empty_for_trade_booking_authentication() throws Throwable {
		customerDetailsPage.setTradeBookingSetupSectionUsernameInput("");
		CommonFunctions.pause(2500, false);
		customerDetailsPage.setTradeBookingSetupSectionPasswordInput("");
		CommonFunctions.pause(2500, false);
	}
	// End - Customer Details Page Functions
	
	// Start - Commissions Page Functions
	@Then("^user sees new commission button$")
	public void user_sees_new_commission_button() throws Throwable {
		commissionsPage.displayedNewCommissionButton();
	}
	
	@When("^user opens the create commission name popup$")
	public void user_opens_the_create_commission_name_popup() throws Throwable {
		commissionsPage.clickNewCommissionButton();
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user sees commission name field enabled and two add rules buttons disabled$")
	public void user_sees_commission_name_field_enabled_and_two_add_rules_buttons_disabled() throws Throwable {
		CommonFunctions.switchFrameByXPath("//span[text() = 'Create Commission Name']");
		commissionsPage.enabledCreateCommissionNamePopupNameInput();
		commissionsPage.disabledCreateCommissionNamePopupAddRulesLaterButton();
		commissionsPage.disabledCreateCommissionNamePopupAddRulesNowButton();
	}
	
	@When("^user provides a new commission name$")
	public void user_provides_a_new_commission_name() throws Throwable {
		usedCommissionName = commissionsPage.setCreateCommissionNamePopupNameInput(CommonFunctions.stringAppendDateTime(prop.getProperty("newCommissionName")));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the two add rules buttons enabled$")
	public void user_sees_the_two_add_rules_buttons_enabled() throws Throwable {
		commissionsPage.enabledCreateCommissionNamePopupAddRulesLaterButton();
		commissionsPage.enabledCreateCommissionNamePopupAddRulesNowButton();
	}
	
	@When("^user saves the new commission name and decides to add rules later$")
	public void user_saves_the_new_commission_name_and_decides_to_add_rules_later() throws Throwable {
		commissionsPage.clickCreateCommissionNamePopupAddRulesLaterButton();
	}
	
	@When("^user closes the create commission name popup$")
	public void user_closes_the_create_commission_name_popup() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	@Then("^user does not see the create commission name popup$")
	public void user_does_not_see_the_create_commission_name_popup() throws Throwable {
		CommonFunctions.textHiddenInPage("Create Commission Name");
	}
	
	@When("^user provides an existing commission name$")
	public void user_provides_an_existing_commission_name() throws Throwable {
		CommonFunctions.switchFrameByXPath("//span[text() = 'Create Commission Name']");
		commissionsPage.setCreateCommissionNamePopupNameInput(usedCommissionName);
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user saves the new commission name and decides to add rules now$")
	public void user_saves_the_new_commission_name_and_decides_to_add_rules_now() throws Throwable {
		commissionRulesDetailsPage = commissionsPage.clickCreateCommissionNamePopupAddRulesNowButton();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user provides a commission name$")
	public void user_provides_a_commission_name() throws Throwable {
		commissionsPage.setCreateCommissionNamePopupNameInput(usedCommissionName + "F");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees commission dropdown with search functionality$")
	public void user_sees_commission_dropdown_with_search_functionality() throws Throwable {
		commissionsPage.displayedCommissionDropdown();
	}
	
	@When("^user clicks on commission dropdown$")
	public void user_clicks_on_commission_dropdown() throws Throwable {
		commissionsPage.clickCommissionDropdown();
	}
	
	@Then("^user sees commissions list$")
	public void user_sees_commissions_list() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//ul[contains(@class, 'select2-results')]")));
	}
	
	@When("^user searches for a commission by wildcard$")
	public void user_searches_for_a_commission_by_wildcard() throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id, 'search')]")), "Agent 11 S");
	}
	
	@Then("^user sees the commissions list related to the entered word$")
	public void user_sees_the_commissions_list_related_to_the_entered_word() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//ul[contains(@class, 'select2-results')]")));
	}
	
	@When("^user selects the commission$")
	public void user_selects_the_commission() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	@Then("^user sees the commission rules table$")
	public void user_sees_the_commission_rules_table() throws Throwable {
		commissionsPage.displayedCommissionTable();
	}
	
	@When("^user searches for a commission$")
	public void user_searches_for_a_commission() throws Throwable {
		commissionsPage.clickCommissionDropdown();
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id, 'search')]")), "Agent 11 S");
	}
	
	@When("^user uses column filters to filter the commission rules$")
	public void user_uses_column_filters_to_filter_the_commission_rules() throws Throwable {
		commissionsPage.setRatePercentFilterInput("1");
		commissionsPage.setBrandFilterInput("B");
		commissionsPage.setTourClassFilterInput("Tour");
		commissionsPage.setContractFilterInput("Grove");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the filtered commission rules table$")
	public void user_sees_the_filtered_commission_rules_table() throws Throwable {
		CommonFunctions.textVisibleInPage("The Grove");
	}
	
	@When("^user removes the commission rules column filters$")
	public void user_removes_the_commission_rules_column_filters() throws Throwable {
		commissionsPage.setRatePercentFilterInput("");
		commissionsPage.setBrandFilterInput("");
		commissionsPage.setTourClassFilterInput("");
		commissionsPage.setContractFilterInput("");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the unfiltered commission rules table$")
	public void user_sees_the_unfiltered_commission_rules_table() throws Throwable {
		CommonFunctions.textVisibleInPage("Asia");
	}
	
	@Then("^user only sees the view icon for each commission rule$")
	public void user_only_sees_the_view_icon_for_each_commission_rule() throws Throwable {
		commissionsPage.displayedTopRowDataViewButton();
		commissionsPage.hiddenTopRowDataEditButton();
		commissionsPage.hiddenTopRowDataDeleteButton();
	}
	
	@When("^user views a commission rule$")
	public void user_views_a_commission_rule() throws Throwable {
		commissionRulesDetailsPage = commissionsPage.clickTopRowDataViewButton();
	}
	
	@Then("^user sees toggle for showing past date commissions is turned off by default$")
	public void user_sees_toggle_for_showing_past_date_commissions_is_turned_off_by_default() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//label[contains(@id, 'showpasttogglebutton')]//input//parent::label[contains(@class, 'changed')]");
	}
	
	@When("^user toggles on the option to show the past date commissions$")
	public void user_toggles_on_the_option_to_show_the_past_date_commissions() throws Throwable {
		commissionsPage.clickShowPastCommissionDatesCheckbox();
	}
	
	@Then("^user sees the past dated commissions$")
	public void user_sees_the_past_dated_commissions() throws Throwable {
		CommonFunctions.textVisibleInPage("Billy Can");
	}
	
	@When("^user toggles off the option to show the past date commissions$")
	public void user_toggles_off_the_option_to_show_the_past_date_commissions() throws Throwable {
		commissionsPage.clickShowPastCommissionDatesCheckbox();
	}
	
	@Then("^user does not see the past dated commissions$")
	public void user_does_not_see_the_past_dated_commissions() throws Throwable {
		CommonFunctions.textHiddenInPage("Billy Can");
	}
	
	@Then("^user can see edit icon for each commission rule$")
	public void user_can_see_edit_icon_for_each_commission_rule() throws Throwable {
		commissionsPage.displayedTopRowDataEditButton();
	}
	
	@When("^user updates the commission rule$")
	public void user_updates_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage = commissionsPage.clickTopRowDataEditButton();
	}
	
	@When("^user decides to add a new commission rule$")
	public void user_decides_to_add_a_new_commission_rule() throws Throwable {
		commissionRulesDetailsPage = commissionsPage.clickAddRulesButton();
	}
	
	@Then("^user sees the add rule button is enabled by default$")
	public void user_sees_the_add_rule_button_is_enabled_by_default() throws Throwable {
		commissionsPage.enabledAddRulesButton();
	}
	
	@When("^user views the commission rule$")
	public void user_views_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage = commissionsPage.clickTopRowDataViewButton();
	}
	
	@When("^user uses column filters to find the newly added commission rule$")
	public void user_uses_column_filters_to_find_the_newly_added_commission_rule() throws Throwable {
		commissionsPage.setRatePercentFilterInput("49.99");
		commissionsPage.setBrandFilterInput("All");
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user decides to delete the commission rule$")
	public void user_decides_to_delete_the_commission_rule() throws Throwable {
		commissionsPage.clickTopRowDataDeleteButton();
		CommonFunctions.switchFrameByXPath("//span[text() = 'Deleting the record may affect the existing bookings. Are you sure you want to delete the commission rule?']");
	}
	
	@Then("^user sees delete message for the commission rule$")
	public void user_sees_delete_message_for_the_commission_rule() throws Throwable {
		CommonFunctions.textVisibleInPage("Deleting the record may affect the existing bookings. Are you sure you want to delete the commission rule?");
	}
	
	@When("^user cancels the deletion of the commission rule$")
	public void user_cancels_the_deletion_of_the_commission_rule() throws Throwable {
		commissionsPage.clickDeleteCommissionRulePopupCancelButton();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user confirms the deletion of the commission rule$")
	public void user_confirms_the_deletion_of_the_commission_rule() throws Throwable {
		commissionsPage.clickDeleteCommissionRulePopupOKButton();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user does not see the commission rule$")
	public void user_does_not_see_the_commission_rule() throws Throwable {
		CommonFunctions.textHiddenInPage("49.99");
	}
	
	@When("^user uses column filters to find the commission rule that will be added with a contract$")
	public void user_uses_column_filters_to_find_the_commission_rule_that_will_be_added_with_a_contract() throws Throwable {
		CommonFunctions.pause(2500, false);
		commissionsPage.setRatePercentFilterInput("2.5");
		commissionsPage.setBrandFilterInput("All");
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user uses column filters to display the newly added commission rule$")
	public void user_uses_column_filters_to_display_the_newly_added_commission_rule() throws Throwable {
		commissionsPage.setRatePercentFilterInput("19.99");
		commissionsPage.setBrandFilterInput("All");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the newly added commission rule$")
	public void user_sees_the_newly_added_commission_rule() throws Throwable {
		CommonFunctions.textVisibleInPage("19.99 %");
	}
	
	@When("^user uses column filters to display the recently updated commission rule$")
	public void user_uses_column_filters_to_display_the_recently_updated_commission_rule() throws Throwable {
		commissionsPage.setRatePercentFilterInput("29.99");
		commissionsPage.setBrandFilterInput("All");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees edit commission name is disabled by default$")
	public void user_sees_edit_commission_name_is_disabled_by_default() throws Throwable {
		commissionsPage.disabledEditCommissionNameButton();
	}
	
	@Then("^user sees edit commission name is enabled$")
	public void user_sees_edit_commission_name_is_enabled() throws Throwable {
		commissionsPage.enabledEditCommissionNameButton();
	}
	
	@When("^user edits the commission name$")
	public void user_edits_the_commission_name() throws Throwable {
		CommonFunctions.pause(2500, false);
		commissionsPage.clickEditCommissionNameButton();
		CommonFunctions.switchFrameByXPath("//span[text() = 'Update Commission Name']");
	}
	
	@Then("^user sees the update commission name popup$")
	public void user_sees_the_update_commission_name_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Update Commission Name");
		CommonFunctions.textVisibleInPage("Aust Travel Agent 11 Special");
	}
	
	@When("^user enters a new commission name$")
	public void user_enters_a_new_commission_name() throws Throwable {
		commissionsPage.setEditCommissionNamePopupNameInput("Aust Travel Agent 11 Special");
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user saves the new commission name$")
	public void user_saves_the_new_commission_name() throws Throwable {
		commissionsPage.clickEditCommissionNamePopupUpdateCommissionNameButton();
	}
	
	@When("^user cancels the editing of the commission name$")
	public void user_cancels_the_editing_of_the_commission_name() throws Throwable {
		commissionsPage.clickEditCommissionNamePopupCancelButton();
	}
	
	@Then("^user does not see the update commission name popup$")
	public void user_does_not_see_the_update_commission_name_popup() throws Throwable {
		CommonFunctions.textHiddenInPage("Update Commission Name");
	}
	// End - Commissions Page Functions
	
	// Start - Commission Details Page Functions
	@Then("^user sees the commission rule fields$")
	public void user_sees_the_commission_rule_fields() throws Throwable {
		CommonFunctions.textVisibleInPage("Sales Source");
		CommonFunctions.textVisibleInPage("Customer Market");
		CommonFunctions.textVisibleInPage("Commission Rate");
	}
	
	@Then("^user sees the commission rules default values of the fields$")
	public void user_sees_the_commission_rules_default_values_of_the_fields() throws Throwable {
		commissionRulesDetailsPage.containsValueSalesSourceDropdown("All Selected");
		commissionRulesDetailsPage.containsValueCustomerMarketDropdown("All Selected");
		commissionRulesDetailsPage.containsValueCommissionRateInput("");
	}
	
	@When("^user selects value for the sales source field$")
	public void user_selects_value_for_the_sales_source_field() throws Throwable {
		commissionRulesDetailsPage.clickSalesSourceDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'SalesSourceDropdown')]//parent::label[contains(text(), 'Select All')]")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'SalesSourceDropdown')]//parent::label//span[contains(text(), 'Consumer Web')]")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'SalesSourceDropdown')]//parent::label//span[contains(text(), 'Internal Sale')]")));
		commissionRulesDetailsPage.clickSalesSourceDropdown();
	}
	
	@Then("^user sees the sales source field value changed$")
	public void user_sees_the_sales_source_field_value_changed() throws Throwable {
		commissionRulesDetailsPage.containsValueSalesSourceDropdown("Consumer Web, Internal Sale");
	}
	
	@When("^user selects value for the customer market field$")
	public void user_selects_value_for_the_customer_market_field() throws Throwable {
		commissionRulesDetailsPage.clickCustomerMarketDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[contains(@data-name, 'CustomerMarketDropdown')]//parent::label[contains(text(), 'Select All')]")));
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'CustomerMarketContainer')]//div[contains(@class, 'search')]//input")), "Australia Inbound");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'CustomerMarketContainer')]//ul//li//span[contains(text(), 'Australia Inbound')]")));
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'CustomerMarketContainer')]//div[contains(@class, 'search')]//input")), "Asia");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'CustomerMarketContainer')]//ul//li//span[contains(text(), 'Asia')]")));
		commissionRulesDetailsPage.clickCustomerMarketDropdown();
	}
	
	@Then("^user sees the customer market field value changed$")
	public void user_sees_the_customer_market_field_value_changed() throws Throwable {
		commissionRulesDetailsPage.containsValueCustomerMarketDropdown("Asia, Australia Inbound");
	}
	
	@When("^user provides a commission rate with alphabets and special characters and is above (\\d+) characters$")
	public void user_provides_a_commission_rate_with_alphabets_and_special_characters_and_is_above_characters(int arg1) throws Throwable {
		commissionRulesDetailsPage.setCommissionRateInput("ABC!@#DEF");
	}
	
	@Then("^user sees commission rate field is empty due to provided invalid characters being restricted$")
	public void user_sees_commission_rate_field_is_empty_due_to_provided_invalid_characters_being_restricted() throws Throwable {
		commissionRulesDetailsPage.containsValueCommissionRateInput("");
	}
	
	@When("^user provides a commission rate that exceeds the limit$")
	public void user_provides_a_commission_rate_that_exceeds_the_limit() throws Throwable {
		commissionRulesDetailsPage.setCommissionRateInput("60");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	@When("^user cancels the creation of the new commission rule$")
	public void user_cancels_the_creation_of_the_new_commission_rule() throws Throwable {
		commissionsPage = commissionRulesDetailsPage.clickBottomCloseButton();
	}
	
	@Then("^user sees the packages and contracts accordion$")
	public void user_sees_the_packages_and_contracts_accordion() throws Throwable {
		commissionRulesDetailsPage.displayedPackagesAndContractsAccordion();
	}
	
	@When("^user expands the packages and contracts accordion$")
	public void user_expands_the_packages_and_contracts_accordion() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsAccordion();
	}
	
	@Then("^user sees the contract type dropdown with all selected as the default value$")
	public void user_sees_the_contract_types_dropdown_with_all_selected_as_the_default_value() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionContractTypeDropdown("All Selected");
	}
	
	@Then("^user sees the miscellaneous type dropdown with all selected as the default value$")
	public void user_sees_the_miscellaneous_types_dropdown_with_all_selected_as_the_default_value() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionMiscellaneousTypeDropdown("All Selected");
	}
	
	@When("^user opens the contract type dropdown$")
	public void user_opens_the_contract_types_dropdown() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionContractTypeDropdown();
	}
	
	@Then("^user sees the list of contract types in the contract types dropdown$")
	public void user_sees_the_list_of_contract_types_in_the_contract_types_dropdown() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractTypeContainer')]//ul")));
	}
	
	@When("^user opens the miscellaneous type dropdown$")
	public void user_opens_the_miscellaneous_types_dropdown() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionMiscellaneousTypeDropdown();
	}
	
	@Then("^user sees the list of miscellaneous types in the dropdown$")
	public void user_sees_the_list_of_miscellaneous_types_in_the_dropdown() throws Throwable {
		CommonFunctions.textVisibleInPage("1 Day French Guide");
	}
	
	@When("^user selects option contract types for the commission rule$")
	public void user_selects_option_contract_types_for_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionContractTypesButton();
	}
	
	@When("^user selects option contracts for the commission rule$")
	public void user_selects_option_contracts_for_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionContractsButton();
	}
	
	@Then("^user can see the add contract button$")
	public void user_can_see_the_add_contract_button() throws Throwable {
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionAddContractButton();
	}
	
	@When("^user provides basic information for the commission rule$")
	public void user_provides_basic_information_for_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage.setCommissionRateInput("49.99");
	}
	
	@When("^user saves the commission rule$")
	public void user_saves_the_commission_rule() throws Throwable {
		commissionsPage = commissionRulesDetailsPage.clickBottomSaveButton();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user decides to add a contract to the commission rule$")
	public void user_decides_to_add_a_contract_to_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionAddContractButton();
	}
	
	@Then("^user sees the popup for adding contract to the commission rule$")
	public void user_sees_the_popup_for_adding_contract_to_the_commission_rule() throws Throwable {
		CommonFunctions.textVisibleInPage("Search for a contract");
	}
	
	@Then("^user sees different search criterias for finding specific contracts and the miscellaneous type field disabled by default$")
	public void user_sees_different_search_criterias_for_finding_specific_contracts_and_the_miscellaneous_type_field_disabled_by_default() throws Throwable {
		commissionRulesDetailsPage.displayedAddContractPopupIdInput();
		commissionRulesDetailsPage.displayedAddContractPopupNameInput();
		commissionRulesDetailsPage.displayedAddContractPopupStatusDropdown();
		commissionRulesDetailsPage.displayedAddContractPopupTypeDropdown();
		commissionRulesDetailsPage.displayedAddContractPopupSupplierNameInput();
		commissionRulesDetailsPage.disabledAddContractPopupMiscellaneousTypeDropdown();
	}
	
	@When("^user selects miscellaneous as the contract type in the search criteria$")
	public void user_selects_miscellaneous_as_the_contract_type_in_the_search_criteria() throws Throwable {
		commissionRulesDetailsPage.selectAddContractPopupTypeValue("Miscellaneous");
	}
	
	@Then("^user sees the miscellaneous type field enabled$")
	public void user_sees_the_miscellaneous_type_field_enabled() throws Throwable {
		commissionRulesDetailsPage.enabledAddContractPopupMiscellaneousTypeDropdown();
	}
	
	@When("^user searches for a contract to be added to the commission rule$")
	public void user_searches_for_a_contract_to_be_added_to_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage.setAddContractPopupNameInput("The");
		commissionRulesDetailsPage.clickAddContractPopupStatusDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'ContractStatus_Container')]//label[contains(text(), 'Select All')]")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'ContractStatus_Container')]//label//span[contains(text(), 'Closed')]")));
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		commissionRulesDetailsPage.selectAddContractPopupTypeValue("All");
		commissionRulesDetailsPage.setAddContractPopupSupplierNameInput("Grove");
		CommonFunctions.pause(2500, false);
		commissionRulesDetailsPage.clickAddContractPopupSearchContractsButton();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the result of the search in the table$")
	public void user_sees_the_result_of_the_search_in_the_table() throws Throwable {
		CommonFunctions.textVisibleInPage("Grove");
	}
	
	@When("^user adds the contract to the commission rule$")
	public void user_adds_the_contract_to_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage.clickAddContractPopupTopCheckBox();
		commissionRulesDetailsPage.clickAddContractPopupAddContractButton();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the contract in the packages and contracts section of the commission rule$")
	public void user_sees_the_contract_in_the_packages_and_contracts_section_of_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionContractsTable();
	}
	
	@Then("^user sees the commission dates accordion$")
	public void user_sees_the_commission_dates_accordion() throws Throwable {
		commissionRulesDetailsPage.displayedCommissionDatesAccordion();
	}
	
	@When("^user expands the commission dates accordion$")
	public void user_expands_the_commission_dates_accordion() throws Throwable {
		commissionRulesDetailsPage.clickCommissionDatesAccordion();
	}
	
	@Then("^user sees commission dates default values$")
	public void user_sees_commission_dates_default_values() throws Throwable {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		
		commissionRulesDetailsPage.containsValueCommissionDatesSectionBookingFromDateInput(sdf.format(calendar.getTime()));
		commissionRulesDetailsPage.containsValueCommissionDatesSectionBookingToDateInput("31 Dec 2050");
		commissionRulesDetailsPage.containsValueCommissionDatesSectionDepartureFromDateInput(sdf.format(calendar.getTime()));
		commissionRulesDetailsPage.containsValueCommissionDatesSectionDepartureToDateInput("31 Dec 2050");
	}
	
	@When("^user provides empty date ranges for the commission dates$")
	public void user_provides_empty_date_ranges_for_the_commission_dates() throws Throwable {
		commissionRulesDetailsPage.setCommissionDatesSectionBookingFromDateInput("");
		commissionRulesDetailsPage.setCommissionDatesSectionBookingToDateInput("");
		commissionRulesDetailsPage.setCommissionDatesSectionDepartureFromDateInput("");
		commissionRulesDetailsPage.setCommissionDatesSectionDepartureToDateInput("");
	}
	
	@When("^user provides commission booking dates that the from date is greater than the to date$")
	public void user_provides_commission_booking_dates_that_the_from_date_is_greater_than_the_to_date() throws Throwable {
		commissionRulesDetailsPage.setCommissionDatesSectionBookingFromDateInput("28 Feb 2019");
		commissionRulesDetailsPage.setCommissionDatesSectionBookingToDateInput("27 Feb 2019");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	@When("^user provides commission departure dates that the from date is greater than the to date$")
	public void user_provides_commission_departure_dates_that_the_from_date_is_greater_than_the_to_date() throws Throwable {
		commissionRulesDetailsPage.setCommissionDatesSectionDepartureFromDateInput("28 Feb 2019");
		commissionRulesDetailsPage.setCommissionDatesSectionDepartureToDateInput("27 Feb 2019");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}
	
	@Then("^user sees the package, contract types, and contracts options$")
	public void user_sees_the_package_contract_types_and_contracts_options() throws Throwable {
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionContractsButton();
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionContractTypesButton();
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionPackagesButton();
	}
	
	@Then("^user sees packages options is selected by default$")
	public void user_sees_packages_options_is_selected_by_default() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("//div[contains(@id, 'PackageOption')]")), "class", "SelectedOption");
	}
	
	@Then("^user sees commission name and cannot be modified$")
	public void user_sees_commission_name_and_cannot_be_modified() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//label[contains(text(), 'Commission Name:')]//following-sibling::div//span[text() != '']")));
	}
	
	@When("^user selects value for the sales source$")
	public void user_selects_value_for_the_sales_source() throws Throwable {
		commissionRulesDetailsPage.selectSalesSourceUpdateValue("Internal Sale");
	}
	
	@When("^user selects value for the customer market$")
	public void user_selects_value_for_the_customer_market() throws Throwable {
		commissionRulesDetailsPage.selectCustomerMarketUpdateValue("Australia Inbound");
	}
	
	@Then("^user sees the sales source dropdown value changed$")
	public void user_sees_the_sales_source_dropdown_value_changed() throws Throwable {
		commissionRulesDetailsPage.containsValueSalesSourceUpdateDropdown("Internal Sale");
	}
	
	@Then("^user sees the customer market dropdown value changed$")
	public void user_sees_the_customer_market_dropdown_value_changed() throws Throwable {
		commissionRulesDetailsPage.containsValueCustomerMarketUpdateDropdown("Australia Inbound");
	}
	
	@When("^user cancels the update of the commission rule$")
	public void user_cancels_the_update_of_the_commission_rule() throws Throwable {
		commissionsPage = commissionRulesDetailsPage.clickBottomCloseButton();
	}
	
	@When("^user selects option packages for the existing commission rule$")
	public void user_selects_option_packages_for_the_existing_commission_rule() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionPackagesButton();
	}
	
	@Then("^user sees packages option fields$")
	public void user_sees_packages_option_fields() throws Throwable {
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionBrandUpdateDropdown();
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionTourMarketUpdateDropdown();
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionPackageTypeUpdateDropdown();
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionTourClassificationUpdateDropdown();
	}
	
	@Then("^user sees packages option dropdowns$")
	public void user_sees_packages_option_dropdowns() throws Throwable {
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionBrandDropdown();
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionTourMarketDropdown();
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionPackageTypeDropdown();
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionTourClassificationDropdown();
	}
	
	@When("^user selects \"([^\"]*)\" as the new value for the existing tour classification$")
	public void user_selects_as_the_new_value_for_the_existing_tour_classification(String arg1) throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionTourClassificationUpdateDropdown();
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), arg1);
		driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")).click();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user selects \"([^\"]*)\" as the new value for the existing package type$")
	public void user_selects_as_the_new_value_for_the_existing_package_type(String arg1) throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionPackageTypeUpdateDropdown();
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), arg1);
		driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")).click();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the value of the tour classification changed to default$")
	public void user_sees_the_value_of_the_tour_classification_changed_to_default() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourClassificationUpdateDropdown("All Selected");
	}
	
	@Then("^user sees the value of the existing package type is changed to \"([^\"]*)\"$")
	public void user_sees_the_value_of_the_existing_package_type_is_changed_to(String arg1) throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionPackageTypeUpdateDropdown(arg1);
	}
	
	@When("^user selects \"([^\"]*)\" as the new value for the existing tour market$")
	public void user_selects_as_the_new_value_for_the_existing_tour_market(String arg1) throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionTourMarketUpdateDropdown();
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), arg1);
		driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")).click();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the value of the package type changed to default$")
	public void user_sees_the_value_of_the_package_type_changed_to_default() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionPackageTypeUpdateDropdown("All Selected");
	}
	
	@Then("^user sees the value of the existing tour market is changed to \"([^\"]*)\"$")
	public void user_sees_the_value_of_the_existing_tour_market_is_changed_to(String arg1) throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourMarketUpdateDropdown(arg1);
	}
	
	@When("^user selects \"([^\"]*)\" as the new value for the existing brand$")
	public void user_selects_as_the_new_value_for_the_existing_brand(String arg1) throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionBrandUpdateDropdown();
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), arg1);
		driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")).click();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the value of the tour market changed to default$")
	public void user_sees_the_value_of_the_tour_market_changed_to_default() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourMarketUpdateDropdown("All Selected");
	}
	
	@Then("^user sees the value of the existing brand is changed to \"([^\"]*)\"$")
	public void user_sees_the_value_of_the_existing_brand_is_changed_to(String arg1) throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionBrandUpdateDropdown(arg1);
	}
	
	@Then("^user sees contract types option fields$")
	public void user_sees_contract_types_option_fields() throws Throwable {
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionContractTypeUpdateDropdown();
	}
	
	@When("^user selects \"([^\"]*)\" as the new value for the existing contract type$")
	public void user_selects_as_the_new_value_for_the_existing_contract_type(String arg1) throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionContractTypeUpdateDropdown();
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), arg1);
		driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")).click();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the value of the existing contract type is changed to \"([^\"]*)\"$")
	public void user_sees_the_value_of_the_existing_contract_type_is_changed_to(String arg1) throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionContractTypeUpdateDropdown(arg1);
	}
	
	@Then("^user sees the miscellaneous type dropdown$")
	public void user_sees_the_miscellaneous_type_dropdown() throws Throwable {
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionMiscellaneousTypeDropdown();
	}
	
	@When("^user selects a contract type other than miscellaneous$")
	public void user_selects_a_contract_type_other_than_miscellaneous() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		commissionRulesDetailsPage.clickPackagesAndContractsSectionContractTypeDropdown();
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//div[contains(@id, 'ContractTypeDropDownContainer')]//div[contains(@class, 'search')]//input")), "Miscellaneous");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'ContractTypeDropDownContainer')]//ul//li//span[contains(text(), 'Miscellaneous')]")));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user does not see the miscellaneous type dropdown$")
	public void user_does_not_see_the_miscellaneous_type_dropdown() throws Throwable {
		commissionRulesDetailsPage.hiddenPackagesAndContractsSectionMiscellaneousTypeDropdown();
	}
	
	@When("^user updates contract type to miscellaneous$")
	public void user_updates_contract_type_to_miscellaneous() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionContractTypeUpdateDropdown();
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), "Miscellaneous");
		driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")).click();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user updates contract type to any type other than miscellaneous$")
	public void user_updates_contract_type_to_any_type_other_than_miscellaneous() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionContractTypeUpdateDropdown();
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), "Cruise");
		driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")).click();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user closes the view commission rule$")
	public void user_closes_the_view_commission_rule() throws Throwable {
		commissionsPage = commissionRulesDetailsPage.clickViewBottomCloseButton();
	}
	
	@Then("^user sees packages option fields is defaulted to all selected$")
	public void user_sees_packages_option_fields_is_defaulted_to_all_selected() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionBrandDropdown("All Selected");
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourMarketDropdown("All Selected");
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionPackageTypeDropdown("All Selected");
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourClassificationDropdown("All Selected");
	}
	
	@When("^user deselects all brands$")
	public void user_deselects_all_brands() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionBrandDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'BrandDropdownContainer')]//div//ul//label[contains(text(), 'Select All')]")));
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees tour market, package type, and tour classification fields are emptied$")
	public void user_sees_tour_market_package_type_and_tour_classification_fields_are_emptied() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourMarketDropdown("Select");
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionPackageTypeDropdown("Select");
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourClassificationDropdown("Select");
	}
	
	@When("^user selects all brands$")
	public void user_selects_all_brands() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionBrandDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'BrandDropdownContainer')]//div//ul//label[contains(text(), 'Select All')]")));
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees tour market, package type, and tour classification fields are changed to all selected$")
	public void user_sees_tour_market_package_type_and_tour_classification_fields_are_changed_to_all_selected() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourMarketDropdown("All Selected");
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionPackageTypeDropdown("All Selected");
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourClassificationDropdown("All Selected");
	}
	
	@When("^user deselects all tour markets$")
	public void user_deselects_all_tour_markets() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionTourMarketDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'TourMarketDropdownContainer')]//div//ul//label[contains(text(), 'Select All')]")));
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees package type, and tour classification fields are emptied$")
	public void user_sees_package_type_and_tour_classification_fields_are_emptied() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionPackageTypeDropdown("Select");
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourClassificationDropdown("Select");
	}
	
	@When("^user selects all tour markets$")
	public void user_selects_all_tour_markets() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionTourMarketDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'TourMarketDropdownContainer')]//div//ul//label[contains(text(), 'Select All')]")));
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees package type, and tour classification fields are changed to all selected$")
	public void user_sees_package_type_and_tour_classification_fields_are_changed_to_all_selected() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionPackageTypeDropdown("All Selected");
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourClassificationDropdown("All Selected");
	}
	
	@When("^user deselects all package types$")
	public void user_deselects_all_package_types() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionPackageTypeDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'PackageTypeContainer')]//div//ul//label[contains(text(), 'Select All')]")));
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees tour classification field is emptied$")
	public void user_sees_tour_classification_field_is_emptied() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourClassificationDropdown("Select");
	}
	
	@When("^user selects all package types$")
	public void user_selects_all_package_types() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionPackageTypeDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'PackageTypeContainer')]//div//ul//label[contains(text(), 'Select All')]")));
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees tour classification field is changed to all selected$")
	public void user_sees_tour_classification_field_is_changed_to_all_selected() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionTourClassificationDropdown("All Selected");
	}
	
	@Then("^user sees previous booking and departure dates values$")
	public void user_sees_previous_booking_and_departure_dates_values() throws Throwable {
		commissionRulesDetailsPage.containsValueCommissionDatesSectionBookingFromDateInput(null);
		commissionRulesDetailsPage.containsValueCommissionDatesSectionBookingToDateInput(null);
		commissionRulesDetailsPage.containsValueCommissionDatesSectionDepartureFromDateInput(null);
		commissionRulesDetailsPage.containsValueCommissionDatesSectionDepartureToDateInput(null);
	}
	
	@Then("^user sees contract types option fields have retained the values selected$")
	public void user_sees_contract_types_option_fields_have_retained_the_values_selected() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionContractTypeUpdateDropdown("Miscellaneous");
	}
	
	@Then("^user sees packages option fields have retained the values selected$")
	public void user_sees_packages_option_fields_have_retained_the_values_selected() throws Throwable {
		commissionRulesDetailsPage.containsValuePackagesAndContractsSectionBrandUpdateDropdown("Newmans");
	}
	
	@Then("^user sees contracts option fields have retained the values selected$")
	public void user_sees_contracts_option_fields_have_retained_the_values_selected() throws Throwable {
		commissionRulesDetailsPage.displayedPackagesAndContractsSectionContractsTable();
	}
	
	@When("^user provides information for the commission rule$")
	public void user_provides_information_for_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage.setCommissionRateInput("19.99");
	}
	
	@When("^user provides valid commission booking dates$")
	public void user_provides_valid_commission_booking_dates() throws Throwable {
		commissionRulesDetailsPage.setCommissionDatesSectionBookingFromDateInput("10 May 2019");
		commissionRulesDetailsPage.setCommissionDatesSectionBookingToDateInput("11 May 2019");
		commissionRulesDetailsPage.setCommissionDatesSectionDepartureFromDateInput("01 Jun 2019");
		commissionRulesDetailsPage.setCommissionDatesSectionDepartureToDateInput("30 Jun 2019");
	}
	
	@When("^user deselects all contract types$")
	public void user_deselects_all_contract_types() throws Throwable {
		commissionRulesDetailsPage.clickPackagesAndContractsSectionContractTypeDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//select[contains(@id, 'ContractTypeDropdown')]//following-sibling::div//ul//li)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user provides updated information for the commission rule$")
	public void user_provides_updated_information_for_the_commission_rule() throws Throwable {
		commissionRulesDetailsPage.setCommissionRateInput("29.99");
	}
	
	@When("^user provides a blank commission rate$")
	public void user_provides_a_blank_commission_rate() throws Throwable {
		commissionRulesDetailsPage.setCommissionRateInput("");
	}
	
	@When("^user provides blank commission booking dates$")
	public void user_provides_blank_commission_booking_dates() throws Throwable {
		commissionRulesDetailsPage.setCommissionDatesSectionBookingFromDateInput("");
		commissionRulesDetailsPage.setCommissionDatesSectionBookingToDateInput("");
		commissionRulesDetailsPage.setCommissionDatesSectionDepartureFromDateInput("");
		commissionRulesDetailsPage.setCommissionDatesSectionDepartureToDateInput("");
	}
	// End - Commission Details Page Functions
	
	// Start - Contracts Page Functions
	@Then("^user sees contracts fields and its default values$")
	public void user_sees_contracts_fields_and_its_default_values() throws Throwable {
		contractsPage.displayedIdInput();
		contractsPage.displayedNameInput();
		contractsPage.displayedTypeDropdown();
		contractsPage.displayedCityDropdown();
		contractsPage.displayedCountryDropdown();
		contractsPage.displayedCurrencyDropdown();
		contractsPage.displayedSupplierIdInput();
		contractsPage.displayedSupplierNameInput();
		contractsPage.displayedOfficeDropdown();
		contractsPage.displayedDepartmentDropdown();
		contractsPage.displayedExcludeClosedContractsCheckbox();
		contractsPage.containsValueTypeDropdown("All");
		contractsPage.containsValueCityDropdown("All");
		contractsPage.containsValueCountryDropdown("All");
		contractsPage.containsValueCurrencyDropdown("All");
		contractsPage.containsValueOfficeDropdown("All");
		contractsPage.containsValueDepartmentDropdown("All");
		contractsPage.checkExcludeClosedContractsCheckboxIsToggled();
	}
	
	@Then("^user sees contracts table$")
	public void user_sees_contracts_table() throws Throwable {
		contractsPage.displayedContractsTable();
	}
	
	@Then("^user sees edit and copy icons with tooltips and does not see view icon for each contract$")
	public void user_sees_edit_and_copy_icons_with_tooltips_and_does_not_see_view_icon_for_each_contract() throws Throwable {
		contractsPage.displayedTopRowDataCopyButton();
		contractsPage.displayedTopRowDataEditButton();
		contractsPage.containsValueTopRowDataCopyButtonTooltip("Copy");
		contractsPage.containsValueTopRowDataEditButtonTooltip("Edit");
		contractsPage.hiddenTopRowDataViewButton();
	}
	
	@When("^user sorts contracts$")
	public void user_sorts_contracts() throws Throwable {
		contractsPage.clickIdColumnHeader();
		contractsPage.clickNameColumnHeader();
		contractsPage.clickTypeColumnHeader();
		contractsPage.clickStatusColumnHeader();
		contractsPage.clickCityColumnHeader();
	}
	
	@When("^user uses column filters to filter the contracts result$")
	public void user_uses_column_filters_to_filter_the_contracts_result() throws Throwable {
		contractsPage.setNameFilterInput("A");
		contractsPage.setTypeFilterInput("E");
		contractsPage.setCityFilterInput("A");
	}
	
	@When("^user removes the contracts column filters$")
	public void user_removes_the_contracts_column_filters() throws Throwable {
		contractsPage.setNameFilterInput("");
		contractsPage.setTypeFilterInput("");
		contractsPage.setCityFilterInput("");
	}
	
	@When("^user selects an office for filtering the contracts search results$")
	public void user_selects_an_office_for_filtering_the_contracts_search_results() throws Throwable {
		contractsPage.selectOfficeValue("APT Melbourne City");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees department list is based on the office selected$")
	public void user_sees_department_list_is_based_on_the_office_selected() throws Throwable {
		contractsPage.clickDepartmentDropdown();
		CommonFunctions.textVisibleInPage("APT Melbourne City - Day Tours");
	}
	
	@When("^user selects a department for filtering the contracts search results$")
	public void user_selects_a_department_for_filtering_the_contracts_search_results() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
		contractsPage.selectDepartmentValue("APT Melbourne City - Day Tours");
	}
	
	@When("^user selects all offices for filtering the contracts search results$")
	public void user_selects_all_offices_for_filtering_the_contracts_search_results() throws Throwable {
		contractsPage.selectOfficeValue("All");
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees department is back to default$")
	public void user_sees_department_is_back_to_default() throws Throwable {
		contractsPage.containsValueDepartmentDropdown("All");
	}
	
	@When("^user resets the search filters$")
	public void user_resets_the_search_filters() throws Throwable {
		contractsPage.clickResetButton();
	}
	
	@When("^user searches for a contract by id$")
	public void user_searches_for_a_contract_by_id() throws Throwable {
		contractsPage.setIdInput(prop.getProperty("searchContractId"));
		contractsPage.clickFindButton();
	}
	
	@Then("^user sees the contract$")
	public void user_sees_the_contract() throws Throwable {
		contractsPage.containsValueTopRowDataName(prop.getProperty("searchContractName"));
	}
	
	@When("^user searches for a contract$")
	public void user_searches_for_a_contract() throws Throwable {
		contractsPage.setNameInput(prop.getProperty("searchContractName"));
		contractsPage.clickFindButton();
	}
	
	@When("^user decides to add a new contract$")
	public void user_decides_to_add_a_new_contract() throws Throwable {
		contractDetailsPage = contractsPage.clickCreateNewContractButton();
	}
	
	@When("^user updates the contract$")
	public void user_updates_the_contract() throws Throwable {
		contractDetailsPage = contractsPage.clickTopRowDataEditButton();
	}
	
	@When("^user copies the contract$")
	public void user_copies_the_contract() throws Throwable {
		contractDetailsPage = contractsPage.clickTopRowDataCopyButton();
	}
	
	@When("^user views the contract$")
	public void user_views_the_contract() throws Throwable {
		contractDetailsPage = contractsPage.clickTopRowDataViewButton();
	}
	
	@When("^user finds a contract by id$")
	public void user_finds_a_contract_by_id() throws Throwable {
		contractsPage.setIdInput(prop.getProperty("searchContractIdDummy"));
		contractsPage.clickFindButton();
	}
	
	@When("^user searches for a contract with type foreign operator / land and with contract costs$")
	public void user_searches_for_a_contract_with_type_foreign_operator_land_and_with_contract_costs() throws Throwable {
		contractsPage.setIdInput(prop.getProperty("searchContractIdWithForeignOperatorLandType"));
		contractsPage.clickFindButton();
	}
	
	@Then("^user sees the create new contract button$")
	public void user_sees_the_create_new_contract_button() throws Throwable {
		contractsPage.displayedCreateNewContractButton();
	}
	
	@Then("^user sees the contracts table is defaulted to display 20 records per page$")
	public void user_sees_the_contracts_table_is_defaulted_to_display_records_per_page() throws Throwable {
		contractsPage.containsValueMaxRowsDropdown("20");
	}
	
	@When("^user changes the number of records to be displayed in the contracts table to 50$")
	public void user_changes_the_number_of_records_to_be_displayed_in_the_contracts_table_to() throws Throwable {
		contractsPage.selectMaxRowsValue("50");
	}
	
	@Then("^user sees the contracts table is displaying 50 records per page$")
	public void user_sees_the_contracts_table_is_displaying_records_per_page() throws Throwable {
		contractsPage.containsValueMaxRowsDropdown("50");
		CommonFunctions.scrollToTop();
	}
	
	@When("^user searches for contracts with type \"([^\"]*)\" and on loading status$")
	public void user_searches_for_contracts_with_type_and_on_loading_status(String arg1) throws Throwable {
		contractsPage.selectTypeValue(arg1);
		CommonFunctions.pause(5000, false);
		contractsPage.clickFindButton();
		CommonFunctions.pause(15000, false);
		contractsPage.setStatusFilterInput("Loading");
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user searches for a contract without costs$")
	public void user_searches_for_a_contract_without_costs() throws Throwable {
		contractsPage.setIdInput(prop.getProperty("searchContractIdWithoutCosts"));
		contractsPage.clickFindButton();
	}
	
	@When("^user searches for a contract without contract prices$")
	public void user_searches_for_a_contract_without_contract_prices() throws Throwable {
		contractsPage.setIdInput(prop.getProperty("searchContractIdWithoutPrices"));
		contractsPage.clickFindButton();
	}
	
	@When("^user searches for the newly created contract$")
	public void user_searches_for_the_newly_created_contract() throws Throwable {
		contractsPage.setNameInput(usedContractName);
		contractsPage.clickFindButton();
	}
	
	@When("^user searches for a contract with contract prices$")
	public void user_searches_for_a_contract_with_contract_prices() throws Throwable {
		contractsPage.setIdInput(prop.getProperty("searchContractIdManyPrices"));
		contractsPage.clickFindButton();
	}
	
	@When("^user puts \"([^\"]*)\" in the name column filter to filter the contract results$")
	public void user_puts_in_the_name_column_filter_to_filter_the_contract_results(String arg1) throws Throwable {
		contractsPage.setNameFilterInput(arg1);
	}
	
	@When("^user searches for a contract with type miscellaneous$")
	public void user_searches_for_a_contract_with_type_miscellaneous() throws Throwable {
		contractsPage.setIdInput(prop.getProperty("searchContractIdMiscellaneous"));
		contractsPage.clickFindButton();
	}
	
	@Then("^user sees the tooltip for the contract name when hovered over contract name in the contracts page$")
	public void user_sees_the_tooltip_for_the_contract_name_when_hovered_over_contract_name_in_the_contracts_page() throws Throwable {
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(//div[@col-id = 'ContractName'])[2]//span")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'tooltipster-content']")));
	}
	
	@Then("^user sees the tooltip for the comments when hovered over comments in the contracts page$")
	public void user_sees_the_tooltip_for_the_comments_when_hovered_over_comments_in_the_contracts_page() throws Throwable {
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(//div[@col-id = 'Comments'])[2]//span")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'tooltipster-content']")));
	}
	
	@When("^user searches for a contract with \"([^\"]*)\" id$")
	public void user_searches_for_a_contract_with_id(String arg1) throws Throwable {
		contractsPage.setIdInput(arg1);
		contractsPage.clickFindButton();
	}
	
	@When("^user clicks on edit contract button of any contracts in the list$")
	public void user_clicks_on_edit_contract_button_of_any_contracts_in_the_list() throws Throwable {
		contractDetailsPage = contractsPage.clickTopRowDataEditButton();
	}
	// End - Contracts Page Functions
	
	// Start - Contract Details Page Functions
	@Then("^user sees the add new contract page title, fields and its default values$")
	public void user_sees_the_add_new_contract_page_title_fields_and_its_default_values() throws Throwable {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		
		CommonFunctions.textVisibleInPage("Create New Contract");
		contractDetailsPage.displayedNameInput();
		contractDetailsPage.containsValueNameInput("");
		contractDetailsPage.displayedTypeDropdown();
		contractDetailsPage.containsValueTypeDropdown("Select");
		contractDetailsPage.displayedSupplierInput();
		contractDetailsPage.containsValueSupplierInput("");
		contractDetailsPage.displayedCityInput();
		contractDetailsPage.containsValueCityInput("");
		contractDetailsPage.displayedOfficeDropdown();
		contractDetailsPage.containsValueOfficeDropdown("Select");
		contractDetailsPage.displayedDepartmentDropdown();
		contractDetailsPage.containsValueDepartmentDropdown("Select");
		contractDetailsPage.disabledDepartmentDropdown();
		contractDetailsPage.displayedStartDateInput();
		contractDetailsPage.containsValueStartDateInput(sdf.format(calendar.getTime()));
		contractDetailsPage.displayedEndDateInput();
		contractDetailsPage.containsValueEndDateInput("31 Dec 2050");
		contractDetailsPage.displayedCurrencyDropdown();
		contractDetailsPage.containsValueCurrencyDropdown("AUD - Australian Dollar");
		contractDetailsPage.displayedStatusDropdown();
		contractDetailsPage.containsValueStatusDropdown("Loading");
		contractDetailsPage.disabledStatusDropdown();
		contractDetailsPage.displayedAutoSendToSupplierContactDropdown();
		contractDetailsPage.containsValueAutoSendToSupplierContactDropdown("Select");
		contractDetailsPage.displayedCommentsTextArea();
		contractDetailsPage.containsValueCommentsTextArea("");
		contractDetailsPage.displayedExcludeFromCostUpdateCheckbox();
		contractDetailsPage.checkExcludeFromCostUpdateCheckboxIsNotToggled();
	}
	
	@When("^user cancels the creation of the new contract$")
	public void user_cancels_the_creation_of_the_new_contract() throws Throwable {
		contractsPage = contractDetailsPage.clickTopCloseButton();
	}
	
	@Then("^user sees the update contract page title, fields and its values$")
	public void user_sees_the_update_contract_page_title_fields_and_its_values() throws Throwable {
		CommonFunctions.textVisibleInPage("Update Basic Information - Contract ID 53");
		contractDetailsPage.containsValueNameInput(prop.getProperty("searchContractName"));
		contractDetailsPage.containsValueTypeDropdown(prop.getProperty("searchContractType"));
		contractDetailsPage.containsValueSupplierInput(prop.getProperty("searchContractSupplier"));
		contractDetailsPage.containsValueCityInput(prop.getProperty("searchContractCity"));
		contractDetailsPage.containsValueOfficeDropdown(prop.getProperty("searchContractOffice"));
		contractDetailsPage.containsValueDepartmentDropdown(prop.getProperty("searchContractDepartment"));
		contractDetailsPage.containsValueStartDateInput(prop.getProperty("searchContractStartDate"));
		contractDetailsPage.containsValueEndDateInput(prop.getProperty("searchContractEndDate"));
		contractDetailsPage.containsValueCurrencyDropdown(prop.getProperty("searchContractCurrency"));
		contractDetailsPage.containsValueStatusDropdown(prop.getProperty("searchContractStatus"));
		contractDetailsPage.enabledStatusDropdown();
		contractDetailsPage.containsValueAutoSendToSupplierContactDropdown(prop.getProperty("searchContractAutoSendToSupplierContact"));
		contractDetailsPage.containsValueCommentsTextArea(prop.getProperty("searchContractComments"));
		contractDetailsPage.checkExcludeFromCostUpdateCheckboxIsNotToggled();
	}
	
	@When("^user cancels the update of the contract$")
	public void user_cancels_the_update_of_the_contract() throws Throwable {
		contractsPage = contractDetailsPage.clickTopCloseButton();
	}
	
	@Then("^user sees the copy contract page title, fields and its values$")
	public void user_sees_the_copy_contract_page_title_fields_and_its_values() throws Throwable {
		CommonFunctions.textVisibleInPage("Copy Contract ID 53");
		contractDetailsPage.containsValueNameInput("");
		contractDetailsPage.containsValueTypeDropdown(prop.getProperty("searchContractType"));
		contractDetailsPage.containsValueSupplierInput(prop.getProperty("searchContractSupplier"));
		contractDetailsPage.containsValueCityInput(prop.getProperty("searchContractCity"));
		contractDetailsPage.containsValueOfficeDropdown(prop.getProperty("searchContractOffice"));
		contractDetailsPage.containsValueDepartmentDropdown(prop.getProperty("searchContractDepartment"));
		contractDetailsPage.containsValueStartDateInput(prop.getProperty("searchContractStartDate"));
		contractDetailsPage.containsValueEndDateInput(prop.getProperty("searchContractEndDate"));
		contractDetailsPage.containsValueCurrencyDropdown(prop.getProperty("searchContractCurrency"));
		contractDetailsPage.containsValueStatusDropdown(prop.getProperty("searchContractStatus"));
		contractDetailsPage.disabledStatusDropdown();
		contractDetailsPage.containsValueAutoSendToSupplierContactDropdown(prop.getProperty("searchContractAutoSendToSupplierContact"));
		contractDetailsPage.containsValueCommentsTextArea(prop.getProperty("searchContractComments"));
		contractDetailsPage.checkExcludeFromCostUpdateCheckboxIsNotToggled();
	}
	
	@When("^user opens the office dropdown of the contract$")
	public void user_opens_the_office_dropdown_of_the_contract() throws Throwable {
		contractDetailsPage.clickOfficeDropdown();
	}
	
	@When("^user searches for an office with a specific keyword for the contract$")
	public void user_searches_for_an_office_with_a_specific_keyword_for_the_contract() throws Throwable {
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), "Top");
	}
	
	@Then("^user sees the list of offices that can be selected for the contract$")
	public void user_sees_the_list_of_offices_that_can_be_selected_for_the_contract() throws Throwable {
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]//span")), "Top");
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	@Then("^user sees the view contract page title, fields and its values$")
	public void user_sees_the_view_contract_page_title_fields_and_its_values() throws Throwable {
		CommonFunctions.textVisibleInPage("View Contract ID 53");
		contractDetailsPage.containsValueNameLabel(prop.getProperty("searchContractName"));
		contractDetailsPage.containsValueTypeLabel(prop.getProperty("searchContractType"));
		contractDetailsPage.containsValueSupplierLabel(prop.getProperty("searchContractSupplier"));
		contractDetailsPage.containsValueCityLabel(prop.getProperty("searchContractCity"));
		contractDetailsPage.containsValueOfficeLabel(prop.getProperty("searchContractOffice"));
		contractDetailsPage.containsValueDepartmentLabel(prop.getProperty("searchContractDepartment"));
		contractDetailsPage.containsValueStartDateLabel(prop.getProperty("searchContractStartDate"));
		contractDetailsPage.containsValueEndDateLabel(prop.getProperty("searchContractEndDate"));
		contractDetailsPage.containsValueCurrencyLabel(prop.getProperty("searchContractCurrency"));
		contractDetailsPage.containsValueStatusLabel(prop.getProperty("searchContractStatus"));
		contractDetailsPage.containsValueAutoSendToSupplierContactLabel(prop.getProperty("searchContractAutoSendToSupplierContact"));
		contractDetailsPage.containsValueCommentsLabel(prop.getProperty("searchContractComments"));
	}
	
	@When("^user expands the contract options accordion$")
	public void user_expands_the_contract_options_accordion() throws Throwable {
		contractDetailsPage.clickContractOptionsAccordion();
	}
	
	@Then("^user sees the add new contract page contract options fields and its default values$")
	public void user_sees_the_add_new_contract_page_contract_options_fields_and_its_default_values() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.enabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.enabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionMinContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionShipCodeInput();
		contractDetailsPage.enabledContractOptionsSectionShipCodeInput();
	}
	
	@Then("^user sees the update contract page contract options fields and its values$")
	public void user_sees_the_update_contract_page_contract_options_fields_and_its_values() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.enabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsToggled();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.disabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionMinContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionShipCodeInput();
		contractDetailsPage.disabledContractOptionsSectionShipCodeInput();
	}
	
	@Then("^user sees the copy contract page contract options fields and its values$")
	public void user_sees_the_copy_contract_page_contract_options_fields_and_its_values() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.enabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsToggled();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.disabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionMinContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionShipCodeInput();
		contractDetailsPage.disabledContractOptionsSectionShipCodeInput();
	}
	
	@Then("^user sees the view contract page contract options fields and its values$")
	public void user_sees_the_view_contract_page_contract_options_fields_and_its_values() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.disabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.disabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintSabrePNRCheckbox();
	}
	
	@When("^user provides the contract dates in invalid format$")
	public void user_provides_the_contract_dates_in_invalid_format() throws Throwable {
		contractDetailsPage.setStartDateInput("March 20, 2019");
		contractDetailsPage.setEndDateInput("March 21, 2019");
	}
	
	@When("^user adds a contract date range with the start date is greater than the end date$")
	public void user_adds_a_contract_date_range_with_the_start_date_is_greater_than_the_end_date() throws Throwable {
		contractDetailsPage.setStartDateInput("21 Mar 2019");
		contractDetailsPage.setEndDateInput("20 Mar 2019");
	}
	
	@When("^user selects \"([^\"]*)\" as the type for the new contract$")
	public void user_selects_as_the_type_for_the_new_contract(String arg1) throws Throwable {
		contractDetailsPage.selectTypeValue(arg1);
	}
	
	@Then("^user sees the add new contract page contract options fields defaults for the contract type coach$")
	public void user_sees_the_add_new_contract_page_contract_options_fields_defaults_for_the_contract_type_coach() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.disabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.disabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionMinContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionShipCodeInput();
		contractDetailsPage.disabledContractOptionsSectionShipCodeInput();
	}
	
	@Then("^user sees the add new contract page contract options fields defaults for the contract type cruise$")
	public void user_sees_the_add_new_contract_page_contract_options_fields_defaults_for_the_contract_type_cruise() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.enabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.disabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionMinContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionShipCodeInput();
		contractDetailsPage.enabledContractOptionsSectionShipCodeInput();
	}
	
	@Then("^user sees the add new contract page contract options fields defaults for the contract type foreign operator / land$")
	public void user_sees_the_add_new_contract_page_contract_options_fields_defaults_for_the_contract_type_foreign_operator_land() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.enabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.disabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionMinContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionShipCodeInput();
		contractDetailsPage.disabledContractOptionsSectionShipCodeInput();
	}
	
	@Then("^user sees the add new contract page contract options fields defaults for the contract type hotel$")
	public void user_sees_the_add_new_contract_page_contract_options_fields_defaults_for_the_contract_type_hotel() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.enabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.disabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionMinContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionShipCodeInput();
		contractDetailsPage.disabledContractOptionsSectionShipCodeInput();
	}
	
	@Then("^user sees the add new contract page contract options fields defaults for the contract type miscellaneous$")
	public void user_sees_the_add_new_contract_page_contract_options_fields_defaults_for_the_contract_type_miscellaneous() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.disabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.enabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionMinContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionShipCodeInput();
		contractDetailsPage.disabledContractOptionsSectionShipCodeInput();
	}
	
	@When("^user enables the option indicative pricing for the contract$")
	public void user_enables_the_option_indicative_pricing_for_the_contract() throws Throwable {
		contractDetailsPage.clickContractOptionsSectionIndicativePricingCheckbox();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the min and max contract value fields enabled$")
	public void user_sees_the_min_and_max_contract_value_fields_enabled() throws Throwable {
		contractDetailsPage.enabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.enabledContractOptionsSectionMinContractValueInput();
	}
	
	@When("^user disables the option indicative pricing for the contract$")
	public void user_disables_the_option_indicative_pricing_for_the_contract() throws Throwable {
		contractDetailsPage.clickContractOptionsSectionIndicativePricingCheckbox();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the min and max contract value fields disabled$")
	public void user_sees_the_min_and_max_contract_value_fields_disabled() throws Throwable {
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
	}
	
	@Then("^user sees the add new contract page contract options fields defaults for the contract type rail$")
	public void user_sees_the_add_new_contract_page_contract_options_fields_defaults_for_the_contract_type_rail() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.enabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.disabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionMinContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionShipCodeInput();
		contractDetailsPage.disabledContractOptionsSectionShipCodeInput();
	}
	
	@Then("^user sees the add new contract page contract options fields defaults for the contract type transfer$")
	public void user_sees_the_add_new_contract_page_contract_options_fields_defaults_for_the_contract_type_transfer() throws Throwable {
		contractDetailsPage.displayedContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.disabledContractOptionsSectionDoNotShowOnItineraryCheckbox();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.disabledContractOptionsSectionIndicativePricingCheckbox();
		contractDetailsPage.checkContractOptionsSectionIndicativePricingCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMaxContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionMinContractValueInput();
		contractDetailsPage.disabledContractOptionsSectionMinContractValueInput();
		contractDetailsPage.displayedContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPassengerWeightRequiredCheckbox();
		contractDetailsPage.checkContractOptionsSectionPassengerWeightRequiredCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintClubMembershipLevelCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintFlightDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintOPRefNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintOPRefNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPassportDetailsCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintPaxPreTourContactCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPaxPreTourContactCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.disabledContractOptionsSectionPrintPensionSeniorCardNumberCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.enabledContractOptionsSectionPrintSabrePNRCheckbox();
		contractDetailsPage.checkContractOptionsSectionPrintSabrePNRCheckboxIsNotToggled();
		contractDetailsPage.displayedContractOptionsSectionShipCodeInput();
		contractDetailsPage.disabledContractOptionsSectionShipCodeInput();
	}
	
	@When("^user provides alphabets in the min and max contract value fields$")
	public void user_provides_alphabets_in_the_min_and_max_contract_value_fields() throws Throwable {
		contractDetailsPage.setContractOptionsSectionMinContractValueInput("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		contractDetailsPage.setContractOptionsSectionMaxContractValueInput("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	@Then("^user sees the the min and max contract value fields rejected the alphabets$")
	public void user_sees_the_the_min_and_max_contract_value_fields_rejected_the_alphabets() throws Throwable {
		contractDetailsPage.containsValueContractOptionsSectionMinContractValueInput("");
		contractDetailsPage.containsValueContractOptionsSectionMaxContractValueInput("");
	}
	
	@When("^user provides special characters in the min and max contract value fields$")
	public void user_provides_special_characters_in_the_min_and_max_contract_value_fields() throws Throwable {
		contractDetailsPage.setContractOptionsSectionMinContractValueInput("!@#$%^&*()_+-={}|:<>?[];,./");
		contractDetailsPage.setContractOptionsSectionMaxContractValueInput("!@#$%^&*()_+-={}|:<>?[];,./");
	}
	
	@Then("^user sees the the min and max contract value fields rejected the special characters$")
	public void user_sees_the_the_min_and_max_contract_value_fields_rejected_the_special_characters() throws Throwable {
		contractDetailsPage.containsValueContractOptionsSectionMinContractValueInput("");
		contractDetailsPage.containsValueContractOptionsSectionMaxContractValueInput("");
	}
	
	@When("^user provides min and max contract values with the min contract value is greater than the max contract value$")
	public void user_provides_min_and_max_contract_values_with_the_min_contract_value_is_greater_than_the_max_contract_value() throws Throwable {
		contractDetailsPage.setContractOptionsSectionMinContractValueInput("1");
		contractDetailsPage.setContractOptionsSectionMaxContractValueInput("0");
	}
	
	@When("^user provides valid min and max contract values$")
	public void user_provides_valid_min_and_max_contract_values() throws Throwable {
		contractDetailsPage.setContractOptionsSectionMinContractValueInput("1");
		contractDetailsPage.setContractOptionsSectionMaxContractValueInput("8");
	}
	
	@When("^user selects a supplier for the contract$")
	public void user_selects_a_supplier_for_the_contract() throws Throwable {
		contractDetailsPage.selectSupplierValue("SupplierPH");
	}
	
	@Then("^user sees the selected supplier for the contract in the supplier field$")
	public void user_sees_the_selected_supplier_for_the_contract_in_the_supplier_field() throws Throwable {
		contractDetailsPage.containsValueSupplierInput(prop.getProperty("searchSupplierName"));
	}
	
	@When("^user selects a city for the contract$")
	public void user_selects_a_city_for_the_contract() throws Throwable {
		contractDetailsPage.selectCityValue("Auck");
	}
	
	@Then("^user sees the selected city for the contract in the city field$")
	public void user_sees_the_selected_city_for_the_contract_in_the_city_field() throws Throwable {
		contractDetailsPage.containsValueCityInput("Auckland, NEW ZEALAND");
	}
	
	@When("^user expands the contract costs accordion$")
	public void user_expands_the_contract_costs_accordion() throws Throwable {
		contractDetailsPage.clickContractCostsAccordion();
	}
	
	@Then("^user sees the add costs button$")
	public void user_sees_the_add_costs_button() throws Throwable {
		contractDetailsPage.displayedContractCostsSectionAddCostsButton();
	}
	
	@Then("^user sees the delete all costs button disabled$")
	public void user_sees_the_delete_all_costs_button_disabled() throws Throwable {
		contractDetailsPage.displayedContractCostsSectionDeleteAllCostsButton();
		contractDetailsPage.disabledContractCostsSectionDeleteAllCostsButton();
	}
	
	@When("^user uses column filters to filter the first contract costs category data$")
	public void user_uses_column_filters_to_filter_the_first_contract_costs_category_data() throws Throwable {
		contractDetailsPage.setContractCostsSectionTopDatesFilterInput("01 Sep 2007");
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user sees the delete all costs button enabled$")
	public void user_sees_the_delete_all_costs_button_enabled() throws Throwable {
		contractDetailsPage.enabledContractCostsSectionDeleteAllCostsButton();
	}
	
	@Then("^user sees the first contract costs category accordion expanded and its contents$")
	public void user_sees_the_first_contract_costs_category_accordion_expanded_and_its_contents() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[1]//div[@class = 'customHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[2]//div[@class = 'customAllotmentHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//i[@title = 'Delete'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//i[@title = 'Allotment Code'])[1]")));
		contractDetailsPage.displayedContractCostsSectionTopDatesFilterInput();
		contractDetailsPage.displayedContractCostsSectionTopDeleteCostsButton();
		contractDetailsPage.displayedContractCostsSectionTopHelpText1Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText2Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText3Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText4Label();
	}
	
	@Then("^user sees the second contract costs category accordion collapsed$")
	public void user_sees_the_second_contract_costs_category_accordion_collapsed() throws Throwable {
		CommonFunctions.elementAttributeDoesNotContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostWeblockContainer')]//div[contains(@id, 'WebBlockMainContainer')])[2]//div[contains(@class, 'AccordionExpandable')]")), "class", "expanded");
	}
	
	@When("^user expands the second contract costs category accordion$")
	public void user_expands_the_second_contract_costs_category_accordion() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostWeblockContainer')]//div[contains(@id, 'WebBlockMainContainer')])[2]")));
		CommonFunctions.pause(1500, false);
	}
	
	@Then("^user sees the second contract costs category contents$")
	public void user_sees_the_second_contract_costs_category_contents() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostWeblockContainer')]//div[contains(@id, 'WebBlockMainContainer')])[2]//div[contains(@class, 'AccordionExpandable')]")), "class", "expanded");
	}
	
	@When("^user collapses the second contract costs category accordion$")
	public void user_collapses_the_second_contract_costs_category_accordion() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostWeblockContainer')]//div[contains(@id, 'WebBlockMainContainer')])[2]")));
		CommonFunctions.pause(1500, false);
	}
	
	@Then("^user does not see the second contract costs category contents$")
	public void user_does_not_see_the_second_contract_costs_category_contents() throws Throwable {
		CommonFunctions.elementAttributeDoesNotContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostWeblockContainer')]//div[contains(@id, 'WebBlockMainContainer')])[2]//div[contains(@class, 'AccordionExpandable')]")), "class", "expanded");
	}
	
	@Then("^user does not see the add costs button$")
	public void user_does_not_see_the_add_costs_button() throws Throwable {
		contractDetailsPage.hiddenContractCostsSectionAddCostsButton();
	}
	
	@Then("^user does not see the delete all costs button$")
	public void user_does_not_see_the_delete_all_costs_button() throws Throwable {
		contractDetailsPage.hiddenContractCostsSectionDeleteAllCostsButton();
	}
	
	@Then("^user sees the first contract costs category accordion expanded and its contents without the write options$")
	public void user_sees_the_first_contract_costs_category_accordion_expanded_and_its_contents_without_the_write_options() throws Throwable {
		// user_expands_the_first_contract_costs_category_accordion();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[1]//div[@class = 'customHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[2]//div[@class = 'customAllotmentHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//i[@title = 'Allotment Code'])[1]")));
		contractDetailsPage.displayedContractCostsSectionTopDatesFilterInput();
		contractDetailsPage.hiddenContractCostsSectionTopDeleteCostsButton();
		contractDetailsPage.displayedContractCostsSectionTopHelpText1Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText2Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText3Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText4Label();
	}
	
	@When("^user hovers over a certain cell that is not empty in the contract costs table$")
	public void user_hovers_over_a_certain_cell_that_is_not_empty_in_the_contract_costs_table() throws Throwable {
		CommonFunctions.hoverElement(driver.findElement(By.xpath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[contains(@class, 'center')]//div[@row-index='0'])[1]//div[@role = 'gridcell'])[3]")));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the edit and delete icons beside the contract cost data$")
	public void user_sees_the_edit_and_delete_icons_beside_the_contract_cost_data() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Edit Cost']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Delete Cost']")));
	}
	
	@Then("^user sees the view icon beside the contract cost data$")
	public void user_sees_the_view_icon_beside_the_contract_cost_data() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'View Cost']")));
	}
	
	@Then("^user sees the guest configuration with gst with a coloured dot and also the legend explaining the coloured dot means$")
	public void user_sees_the_guest_configuration_ith_gst_with_a_coloured_dot_and_also_the_legend_explaining_the_coloured_dot_means() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'AGGridLeftDiv']//span[contains(@class, 'GST')]")));
		contractDetailsPage.displayedContractCostsSectionTopHelpText4Label();
	}
	
	@Then("^user sees the guest configuration twin with double coloured dots and also the legend explaining the coloured dot means$")
	public void user_sees_the_guest_configuration_twin_with_double_coloured_dots_and_also_the_legend_explaining_the_coloured_dot_means() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'AGGridLeftDiv']//span[contains(@class, 'Shared')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'AGGridLeftDiv']//span[contains(@class, 'GST')]")));
		contractDetailsPage.displayedContractCostsSectionTopHelpText3Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText4Label();
	}
	
	@When("^user selects \"([^\"]*)\" as the new type for the existing contract$")
	public void user_selects_as_the_new_type_for_the_existing_contract(String arg1) throws Throwable {
		contractDetailsPage.selectTypeValue(arg1);
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the meal plan$")
	public void user_sees_the_meal_plan() throws Throwable {
		contractDetailsPage.displayedContractCostsSectionTopMealPlanImage();
	}
	
	@Then("^user does not see the meal plan$")
	public void user_does_not_see_the_meal_plan() throws Throwable {
		contractDetailsPage.hiddenContractCostsSectionTopMealPlanImage();
	}
	
	@Then("^user sees the guest configuration with defined pax number$")
	public void user_sees_the_guest_configuration_with_defined_pax_number() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//i[contains(@title, 'Pax Number')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'customPaxHeader']//following-sibling::div")));
	}
	
	@Then("^user sees the contract cost table is paginated to display 100 rows in a page by default$")
	public void user_sees_the_contract_cost_table_is_paginated_to_display_rows_in_a_page_by_default() throws Throwable {
		contractDetailsPage.containsValueContractCostsSectionTopMaxRowDisplayDropdown("100");
	}
	
	@When("^user selects an office for the contract$")
	public void user_selects_an_office_for_the_contract() throws Throwable {
		contractDetailsPage.selectOfficeValue("APT Auckland");
	}
	
	@Then("^user sees the department dropdown is enabled$")
	public void user_sees_the_department_dropdown_is_enabled() throws Throwable {
		contractDetailsPage.enabledDepartmentDropdown();
	}
	
	@When("^user opens the department dropdown$")
	public void user_opens_the_department_dropdown() throws Throwable {
		contractDetailsPage.clickDepartmentDropdown();
	}
	
	@Then("^user sees the department dropdown options that is based on the office selected$")
	public void user_sees_the_department_dropdown_options_that_is_based_on_the_office_selected() throws Throwable {
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[2]//div")), "APT Auckland");
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	@When("^user selects an empty office for the contract$")
	public void user_selects_an_empty_office_for_the_contract() throws Throwable {
		contractDetailsPage.selectOfficeValue("Select");
	}
	
	@Then("^user sees the department dropdown is empty and disabled$")
	public void user_sees_the_department_dropdown_is_empty_and_disabled() throws Throwable {
		contractDetailsPage.containsValueDepartmentDropdown("Select");
		contractDetailsPage.disabledDepartmentDropdown();
	}
	
	@When("^user opens the update contract basic information popup$")
	public void user_opens_the_update_contract_basic_information_popup() throws Throwable {
		CommonFunctions.scrollToTop();
		contractDetailsPage.clickEditBasicInfoButton();
	}
	
	@When("^user cancels the update of the contract basic information$")
	public void user_cancels_the_update_of_the_contract_basic_information() throws Throwable {
		contractDetailsPage.clickUpdateBasicInformationPopupCloseButton();
	}
	
	@When("^user opens the add new contract cost popup$")
	public void user_opens_the_add_new_contract_cost_popup() throws Throwable {
		contractCostsDetailsPage = contractDetailsPage.clickContractCostsSectionAddCostsButton();
	}
	
	@Then("^user sees the add new contract cost popup$")
	public void user_sees_the_add_new_contract_cost_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Add Costs");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupGuestConfigurationDropdown("Twin");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupCategory1Dropdown("3 Star Room");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupCategory2Dropdown("");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMinimumNightsInput("1");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMaximumNightsInput("99");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMaximumChildAgeInput("0");
		contractDetailsPage.checkModifyContractCostsDetailsPopupShareAllowedCheckboxIsNotToggled();
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupAllotmentCodeInput("FREESALE");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupRateTypeDropdown("Per Day");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupQuantityInput("1");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupNumberOfDaysInput("");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupDaysDropdown("All Selected");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupInvoiceCommentsTextArea("");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupVoucherCommentsTextArea("");
		contractDetailsPage.checkModifyContractCostsDetailsPopupPrintVoucherCheckboxIsNotToggled();
	}
	
	@When("^user closes the add new contract cost popup$")
	public void user_closes_the_add_new_contract_cost_popup() throws Throwable {
		contractDetailsPage.clickModifyContractCostsDetailsPopupCancelButton();
	}
	
	@When("^user edits the contract cost$")
	public void user_edits_the_contract_cost() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv']//div[@class = 'AGGridRightDiv']//span[@title = 'Edit Cost']")));
		CommonFunctions.pause(10000, false);
		
		contractCostsDetailsPage = new ContractCostsDetailsPage();
	}
	
	@Then("^user sees the edit contract cost popup$")
	public void user_sees_the_edit_contract_cost_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Edit Cost");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupGuestConfigurationDropdown("Double");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupCategory1Dropdown("Run of House");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupCategory2Dropdown("DBB");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMinimumNightsInput("1");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMaximumNightsInput("99");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMaximumChildAgeInput("0");
		contractDetailsPage.checkModifyContractCostsDetailsPopupShareAllowedCheckboxIsNotToggled();
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupAllotmentCodeInput("HBAGRA");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupRateTypeDropdown("Per Day");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupQuantityInput("2");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupNumberOfDaysInput("");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupDaysDropdown("All Selected");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupInvoiceCommentsTextArea("");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupVoucherCommentsTextArea("");
		contractDetailsPage.checkModifyContractCostsDetailsPopupPrintVoucherCheckboxIsNotToggled();
	}
	
	@When("^user closes the edit contract cost popup$")
	public void user_closes_the_edit_contract_cost_popup() throws Throwable {
		contractDetailsPage.clickModifyContractCostsDetailsPopupCancelButton();
	}
	
	@When("^user views the contract cost$")
	public void user_views_the_contract_cost() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'View Cost']")));
		CommonFunctions.pause(10000, false);
		
		contractCostsDetailsPage = new ContractCostsDetailsPage();
	}
	
	@Then("^user sees the view contract cost popup$")
	public void user_sees_the_view_contract_cost_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("View Cost");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupGuestConfigurationLabel("Triple");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupCategory1Label("Run of House");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupCategory2Label("DBB");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMinimumNightsLabel("1");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMaximumNightsLabel("99");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMaximumChildAgeLabel("0");
		contractDetailsPage.checkModifyContractCostsDetailsPopupShareAllowedCheckboxIsNotToggled();
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupAllotmentCodeLabel("HBAGRA");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupRateTypeLabel("Per Day");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupQuantityLabel("2");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupNumberOfDaysLabel("");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupDaysLabel("SMTWQFJ");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupInvoiceCommentsLabel("");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupVoucherCommentsLabel("");
		contractDetailsPage.checkModifyContractCostsDetailsPopupPrintVoucherCheckboxIsNotToggled();
	}
	
	@When("^user saves the contract basic information update$")
	public void user_saves_the_contract_basic_information_update() throws Throwable {
		contractDetailsPage.clickUpdateBasicInformationPopupSaveButton();
	}
	
	@Then("^user does not see contract cost category grouped$")
	public void user_does_not_see_contract_cost_category_grouped() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[text() = 'Contract Costs']//parent::div//parent::div//parent::div//parent::div//div[@class = 'AccordionExpandable_header'])[1]");
	}
	
	@Then("^user does not see the season column in the contract cost category table$")
	public void user_does_not_see_the_season_column_in_the_contract_cost_category_table() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'ContractCategoriesListRecords')]//div[@ref = 'headerRoot']//span[text() = 'Season']");
	}
	
	@When("^user saves the contract$")
	public void user_saves_the_contract() throws Throwable {
		contractDetailsPage = contractDetailsPage.clickSaveButton();
	}
	
	@When("^user provides a contract name that is already existing$")
	public void user_provides_a_contract_name_that_is_already_existing() throws Throwable {
		contractDetailsPage.setNameInput(prop.getProperty("searchContractName"));
	}
	
	@When("^user provides the basic information of the contract but with a name that is already existing$")
	public void user_provides_the_basic_information_of_the_contract_but_with_a_name_that_is_already_existing() throws Throwable {
		contractDetailsPage.setNameInput(prop.getProperty("searchContractName"));
		contractDetailsPage.selectTypeValue("Coach");
		contractDetailsPage.selectSupplierValue("Test_SupplierPH");
		contractDetailsPage.selectCityValue("Auckland, NEW ZEALAND");
		contractDetailsPage.selectOfficeValue("APT Auckland");
		contractDetailsPage.selectDepartmentValue("APT Auckland - Sales");
		contractDetailsPage.selectCurrencyValue("NZD - New Zealand Dollars");
		contractDetailsPage.selectAutoSendToSupplierContactValue("FIT");
		contractDetailsPage.setCommentsTextArea("Test Create Contract");
	}
	
	@Then("^user sees feedback message Contract ID has been \"([^\"]*)\" displayed$")
	public void user_sees_feedback_message_Contract_ID_has_been_displayed(String arg1) throws Throwable {
		CommonFunctions.pause(2500, false);
		CommonFunctions.checkFeedbackMessageDisplayedContainsString(arg1);
	}
	
	@When("^user provides the basic information of the contract$")
	public void user_provides_the_basic_information_of_the_contract() throws Throwable {
		contractDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime("Test_C"));
		contractDetailsPage.selectTypeValue("Coach");
		contractDetailsPage.selectSupplierValue("Test_SupplierPH");
		contractDetailsPage.selectCityValue("Auckland, NEW ZEALAND");
		contractDetailsPage.selectOfficeValue("APT Auckland");
		contractDetailsPage.selectDepartmentValue("APT Auckland - Sales");
		contractDetailsPage.selectCurrencyValue("NZD - New Zealand Dollars");
		contractDetailsPage.selectAutoSendToSupplierContactValue("FIT");
		contractDetailsPage.setCommentsTextArea("Test Create Contract");
	}
	
	@Then("^user sees the contract information, options, and costs in view mode$")
	public void user_sees_the_contract_information_options_and_costs_in_view_mode() throws Throwable {
		CommonFunctions.textVisibleInPage("View Contract ID 53");
		contractDetailsPage.containsValueNameLabel(prop.getProperty("searchContractName"));
		contractDetailsPage.containsValueTypeLabel(prop.getProperty("searchContractType"));
		contractDetailsPage.containsValueSupplierLabel(prop.getProperty("searchContractSupplier"));
		contractDetailsPage.containsValueCityLabel(prop.getProperty("searchContractCity"));
		contractDetailsPage.containsValueOfficeLabel(prop.getProperty("searchContractOffice"));
		contractDetailsPage.containsValueDepartmentLabel(prop.getProperty("searchContractDepartment"));
		contractDetailsPage.containsValueStartDateLabel(prop.getProperty("searchContractStartDate"));
		contractDetailsPage.containsValueEndDateLabel(prop.getProperty("searchContractEndDate"));
		contractDetailsPage.containsValueCurrencyLabel(prop.getProperty("searchContractCurrency"));
		contractDetailsPage.containsValueStatusLabel(prop.getProperty("searchContractStatus"));
		contractDetailsPage.containsValueAutoSendToSupplierContactLabel(prop.getProperty("searchContractAutoSendToSupplierContact"));
		contractDetailsPage.containsValueCommentsLabel(prop.getProperty("searchContractComments"));
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsToggled();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCategoriesListRecords')]//div[@class = 'AccordionExpandable_content'])[1]")));
	}
	
	@When("^user closes the view contract page$")
	public void user_closes_the_view_contract_page() throws Throwable {
		contractsPage = contractDetailsPage.clickTopCloseButton();
	}
	
	@When("^user puts alphabets, special characters, negative numbers, and decimals in the maximum child age field$")
	public void user_puts_alphabets_special_characters_negative_numbers_and_decimals_in_the_maximum_child_age_field() throws Throwable {
		contractDetailsPage.setModifyContractCostsDetailsPopupMaximumChildAgeInput("-1!@#$%^&*()=_+[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	@Then("^user sees that the maximum child age field does not accept alphabets, special characters, negative numbers, and decimals$")
	public void user_sees_that_the_maximum_child_age_field_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals() throws Throwable {
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMaximumChildAgeInput("1");
	}
	
	@When("^user puts alphabets, special characters, negative numbers, and decimals in the minimum and maximum pax fields$")
	public void user_puts_alphabets_special_characters_negative_numbers_and_decimals_in_the_minimum_and_maximum_pax_fields() throws Throwable {
		contractDetailsPage.setModifyContractCostsDetailsPopupMinimumPaxInput("-1!@#$%^&*()=_+[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		contractDetailsPage.setModifyContractCostsDetailsPopupMaximumPaxInput("-2!@#$%^&*()=_+[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	@Then("^user sees that the minimum and maximum pax fields does not accept alphabets, special characters, negative numbers, and decimals$")
	public void user_sees_that_the_minimum_and_maximum_pax_fields_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals() throws Throwable {
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMinimumPaxInput("1");
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupMaximumPaxInput("2");
	}
	
	@When("^user puts zero in both the minimum and maximum pax fields$")
	public void user_puts_zero_in_both_the_minimum_and_maximum_pax_fields() throws Throwable {
		contractDetailsPage.setModifyContractCostsDetailsPopupMinimumPaxInput("0");
		contractDetailsPage.setModifyContractCostsDetailsPopupMaximumPaxInput("0");
	}
	
	@When("^user enters minimum pax greater than maximum pax$")
	public void user_enters_minimum_pax_greater_than_maximum_pax() throws Throwable {
		contractDetailsPage.setModifyContractCostsDetailsPopupMinimumPaxInput("2");
		contractDetailsPage.setModifyContractCostsDetailsPopupMaximumPaxInput("1");
		contractDetailsPage.setModifyContractCostsDetailsPopupMaximumPaxInput("101");
	}
	
	@Then("^user sees the number of days field is disabled and the default value is empty$")
	public void user_sees_the_number_of_days_field_is_disabled_and_the_default_value_is_empty() throws Throwable {
		contractDetailsPage.disabledModifyContractCostsDetailsPopupNumberOfDaysInput();
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupNumberOfDaysInput("");
	}
	
	@When("^user changes the contract cost rate type to \"([^\"]*)\"$")
	public void user_changes_the_contract_cost_rate_type_to(String arg1) throws Throwable {
		contractDetailsPage.selectModifyContractCostsDetailsPopupRateTypeValue(arg1);
	}
	
	@Then("^user sees the number of days field is enabled and the default value is 1$")
	public void user_sees_the_number_of_days_field_is_enabled_and_the_default_value_is() throws Throwable {
		contractDetailsPage.enabledModifyContractCostsDetailsPopupNumberOfDaysInput();
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupNumberOfDaysInput("1");
	}
	
	@When("^user puts alphabets, special characters, negative numbers, and decimals in the number of days field$")
	public void user_puts_alphabets_special_characters_negative_numbers_and_decimals_in_the_number_of_days_field() throws Throwable {
		contractDetailsPage.setModifyContractCostsDetailsPopupNumberOfDaysInput("5!@#$%^&*()-=_+[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	@Then("^user sees that the number of days field does not accept alphabets, special characters, negative numbers, and decimals$")
	public void user_sees_that_the_number_of_days_field_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals() throws Throwable {
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupNumberOfDaysInput("5");
	}
	
	@Then("^user sees the contract cost rate type is defaulted to \"([^\"]*)\"$")
	public void user_sees_the_contract_cost_rate_type_is_defaulted_to(String arg1) throws Throwable {
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupRateTypeDropdown(arg1);
	}
	
	@When("^user puts alphabets, special characters, negative numbers, and decimals in the quantity field$")
	public void user_puts_alphabets_special_characters_negative_numbers_and_decimals_in_the_quantity_field() throws Throwable {
		contractDetailsPage.setModifyContractCostsDetailsPopupQuantityInput("-5!@#$%^&*()=_+[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	@Then("^user sees that the quantity field does not accept alphabets, special characters, negative numbers, and decimals$")
	public void user_sees_that_the_quantity_field_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals() throws Throwable {
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupQuantityInput("5");
	}
	
	@Then("^user sees include costs when copying contract option is disabled and untoggled$")
	public void user_sees_include_costs_when_copying_contract_option_is_disabled_and_untoggled() throws Throwable {
		contractDetailsPage.disabledContractCostsSectionIncludeCostsWhenCopyingContractCheckbox();
	}
	
	@When("^user provides an existing name for the contract$")
	public void user_provides_an_existing_name_for_the_contract() throws Throwable {
		contractDetailsPage.setNameInput(prop.getProperty("searchContractName"));
	}
	
	@Then("^user sees the newly created contract from copying without contract costs$")
	public void user_sees_the_newly_created_contract_from_copying_without_contract_costs() throws Throwable {
		contractDetailsPage.clickEditBasicInfoButton();
		contractDetailsPage.containsValueNameInput(prop.getProperty("searchContractName"));
		contractDetailsPage.containsValueTypeDropdown("Coach");
		contractDetailsPage.containsValueSupplierInput("Coach TS08");
		contractDetailsPage.containsValueCityInput("Launceston, AUSTRALIA");
		contractDetailsPage.containsValueOfficeDropdown("APT Cheltenham");
		contractDetailsPage.containsValueDepartmentDropdown("APT Cheltenham - Yield");
		contractDetailsPage.containsValueStartDateInput("01 Sep 2002");
		contractDetailsPage.containsValueEndDateInput("31 May 2012");
		contractDetailsPage.containsValueCurrencyDropdown("AUD - Australian Dollar");
		contractDetailsPage.containsValueStatusDropdown("Loading");
		contractDetailsPage.containsValueAutoSendToSupplierContactDropdown("Select");
		contractDetailsPage.containsValueCommentsTextArea("");
		contractDetailsPage.clickContractOptionsAccordion();
		contractDetailsPage.checkExcludeFromCostUpdateCheckboxIsNotToggled();
		contractDetailsPage.clickUpdateBasicInformationPopupCloseButton();
	}
	
	@Then("^user sees the copy contract basic information, options, and costs$")
	public void user_sees_the_copy_contract_basic_information_options_and_costs() throws Throwable {
		CommonFunctions.textVisibleInPage("Copy Contract ID 53");
		contractDetailsPage.containsValueNameInput("");
		contractDetailsPage.containsValueTypeDropdown(prop.getProperty("searchContractType"));
		contractDetailsPage.containsValueSupplierInput(prop.getProperty("searchContractSupplier"));
		contractDetailsPage.containsValueCityInput(prop.getProperty("searchContractCity"));
		contractDetailsPage.containsValueOfficeDropdown(prop.getProperty("searchContractOffice"));
		contractDetailsPage.containsValueDepartmentDropdown(prop.getProperty("searchContractDepartment"));
		contractDetailsPage.containsValueStartDateInput(prop.getProperty("searchContractStartDate"));
		contractDetailsPage.containsValueEndDateInput(prop.getProperty("searchContractEndDate"));
		contractDetailsPage.containsValueCurrencyDropdown(prop.getProperty("searchContractCurrency"));
		contractDetailsPage.containsValueStatusDropdown(prop.getProperty("searchContractStatus"));
		contractDetailsPage.disabledStatusDropdown();
		contractDetailsPage.containsValueAutoSendToSupplierContactDropdown(prop.getProperty("searchContractAutoSendToSupplierContact"));
		contractDetailsPage.containsValueCommentsTextArea(prop.getProperty("searchContractComments"));
		contractDetailsPage.checkExcludeFromCostUpdateCheckboxIsNotToggled();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsToggled();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[1]//div[@class = 'customHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[2]//div[@class = 'customAllotmentHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//i[@title = 'Allotment Code'])[1]")));
		contractDetailsPage.displayedContractCostsSectionTopDatesFilterInput();
		contractDetailsPage.displayedContractCostsSectionTopHelpText1Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText2Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText3Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText4Label();
	}
	
	@Then("^user sees the newly created contract from copying with contract costs$")
	public void user_sees_the_newly_created_contract_from_copying_with_contract_costs() throws Throwable {
		contractDetailsPage.clickEditBasicInfoButton();
		contractDetailsPage.containsValueNameInput(prop.getProperty("searchContractName"));
		contractDetailsPage.containsValueTypeDropdown(prop.getProperty("searchContractType"));
		contractDetailsPage.containsValueSupplierInput(prop.getProperty("searchContractSupplier"));
		contractDetailsPage.containsValueCityInput(prop.getProperty("searchContractCity"));
		contractDetailsPage.containsValueOfficeDropdown(prop.getProperty("searchContractOffice"));
		contractDetailsPage.containsValueDepartmentDropdown(prop.getProperty("searchContractDepartment"));
		contractDetailsPage.containsValueStartDateInput(prop.getProperty("searchContractStartDate"));
		contractDetailsPage.containsValueEndDateInput(prop.getProperty("searchContractEndDate"));
		contractDetailsPage.containsValueCurrencyDropdown(prop.getProperty("searchContractCurrency"));
		contractDetailsPage.containsValueStatusDropdown(prop.getProperty("searchContractStatus"));
		contractDetailsPage.containsValueAutoSendToSupplierContactDropdown(prop.getProperty("searchContractAutoSendToSupplierContact"));
		contractDetailsPage.containsValueCommentsTextArea(prop.getProperty("searchContractComments"));
		contractDetailsPage.clickContractOptionsAccordion();
		contractDetailsPage.checkExcludeFromCostUpdateCheckboxIsNotToggled();
		contractDetailsPage.checkContractOptionsSectionPrintPassportDetailsCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionPrintFlightDetailsCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionPrintPensionSeniorCardNumberCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionDoNotShowOnItineraryCheckboxIsToggled();
		contractDetailsPage.checkContractOptionsSectionPrintClubMembershipLevelCheckboxIsToggled();
		contractDetailsPage.clickUpdateBasicInformationPopupCloseButton();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[1]//div[@class = 'customHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[2]//div[@class = 'customAllotmentHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//i[@title = 'Allotment Code'])[1]")));
		contractDetailsPage.displayedContractCostsSectionTopDatesFilterInput();
		contractDetailsPage.displayedContractCostsSectionTopHelpText1Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText2Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText3Label();
		contractDetailsPage.displayedContractCostsSectionTopHelpText4Label();
	}
	
	@When("^user provides a new name for the contract$")
	public void user_provides_a_new_name_for_the_contract() throws Throwable {
		usedContractName = contractDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime("Test_C"));
	}
	
	@When("^user cancels the copying of the contract$")
	public void user_cancels_the_copying_of_the_contract() throws Throwable {
		contractsPage = contractDetailsPage.clickTopCloseButton();
	}
	
	@When("^user provides an empty name for the contract$")
	public void user_provides_an_empty_name_for_the_contract() throws Throwable {
		contractDetailsPage.setNameInput("");
	}
	
	@Then("^user does not see the update contract basic information popup$")
	public void user_does_not_see_the_update_contract_basic_information_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//span[text() = 'Update Basic Information - Contract ID 53']");
	}
	
	@When("^user sees the name of the contract is not updated$")
	public void user_sees_the_name_of_the_contract_is_not_updated() throws Throwable {
		contractDetailsPage.containsValueNameInput(usedContractName);
	}
	
	@Then("^user sees the name of the contract is updated$")
	public void user_sees_the_name_of_the_contract_is_updated() throws Throwable {
		CommonFunctions.pause(5000, false);
		contractDetailsPage.containsValueNameLabel(prop.getProperty("searchContractName"));
	}
	
	@When("^user saves the update of contract basic information$")
	public void user_saves_the_update_of_contract_basic_information() throws Throwable {
		contractDetailsPage.clickUpdateBasicInformationPopupSaveButton2ndMethod();
	}
	
	@When("^user selects \"([^\"]*)\" option as the guest configuration$")
	public void user_selects_option_as_the_guest_configuration(String arg1) throws Throwable {
		contractDetailsPage.selectModifyContractCostsDetailsPopupGuestConfigurationValue(arg1);
	}
	
	@Then("^user sees the share allowed box is enabled$")
	public void user_sees_the_share_allowed_box_is_enabled() throws Throwable {
		contractDetailsPage.enabledModifyContractCostsDetailsPopupShareAllowedCheckbox();
	}
	
	@Then("^user sees the share allowed box is disabled$")
	public void user_sees_the_share_allowed_box_is_disabled() throws Throwable {
		contractDetailsPage.disabledModifyContractCostsDetailsPopupShareAllowedCheckbox();
	}
	
	@Then("^user sees the minimum and maximum nights fields$")
	public void user_sees_the_minimum_and_maximum_nights_fields() throws Throwable {
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("//div[contains(@id, 'MinimumPaxContainer')]//label")), "Minimum Nights");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("//div[contains(@id, 'MaximumPaxContainer')]//label")), "Maximum Nights");
	}
	
	@Then("^user sees the minimum and maximum pax fields$")
	public void user_sees_the_minimum_and_maximum_pax_fields() throws Throwable {
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("//div[contains(@id, 'MinimumPaxContainer')]//label")), "Minimum Pax");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("//div[contains(@id, 'MaximumPaxContainer')]//label")), "Maximum Pax");
	}
	
	@When("^user closes the view contract cost popup$")
	public void user_closes_the_view_contract_cost_popup() throws Throwable {
		contractDetailsPage.clickModifyContractCostsDetailsPopupCancelButton();
	}
	
	@Then("^user sees the minimum and maximum days fields$")
	public void user_sees_the_minimum_and_maximum_days_fields() throws Throwable {
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("//div[contains(@id, 'MinimumPaxContainer')]//label")), "Minimum Days");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("//div[contains(@id, 'MaximumPaxContainer')]//label")), "Maximum Days");
	}
	
	@When("^user selects \"([^\"]*)\" option as the category 2$")
	public void user_selects_option_as_the_category_2(String arg1) throws Throwable {
		contractDetailsPage.selectModifyContractCostsDetailsPopupCategory2Value(arg1);
	}
	
	@Then("^user sees \"([^\"]*)\" as the category 2 value for the contract cost$")
	public void user_sees_as_the_category_value_for_the_contract_cost(String arg1) throws Throwable {
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupCategory2Dropdown(arg1);
	}
	
	@When("^user opens the guest configuration dropdown$")
	public void user_opens_the_guest_configuration_dropdown() throws Throwable {
		contractDetailsPage.clickModifyContractCostsDetailsPopupGuestConfigurationDropdown();
	}
	
	@Then("^user sees the options are per person and per item$")
	public void user_sees_the_options_are_per_person_and_per_item() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@class, 'searchbox')]//div[text() = 'Per Person']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@class, 'searchbox')]//div[text() = 'Per Item']")));
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	@Then("^user does not see the options per person and per item$")
	public void user_does_not_see_the_options_per_person_and_per_item() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@class, 'searchbox')]//div[text() = 'Per Person']");
		CommonFunctions.elementNotExistingByXPath("//div[contains(@class, 'searchbox')]//div[text() = 'Per Item']");
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}
	
	@When("^user toggles the hide past dates option$")
	public void user_toggles_the_hide_past_dates_option() throws Throwable {
		contractDetailsPage.clickContractCostsSectionHidePastDatesCheckbox();
	}
	
	@When("^user clicks a certain cell in the contract costs table$")
	public void user_clicks_a_certain_cell_in_the_contract_costs_table() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]")));
		CommonFunctions.pause(1000, false);
	}
	
	@Then("^user sees the save and cancel icons beside the contract cost data$")
	public void user_sees_the_save_and_cancel_icons_beside_the_contract_cost_data() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Save Cost']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Cancel']")));
	}
	
	@When("^user provides \"([^\"]*)\" as the contract cost$")
	public void user_provides_as_the_contract_cost(String arg1) throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[@class = 'costInput'])[1]")), arg1);
	}
	
	@When("^user saves the contract cost$")
	public void user_saves_the_contract_cost() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Save Cost']")));
		CommonFunctions.pause(20000, false);
	}
	
	@Then("^user sees the contract cost cannot be saved$")
	public void user_sees_the_contract_cost_cannot_be_saved() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[contains(@class, 'Not_Valid')]")));
	}
	
	@Then("^user does not see the save and cancel icons beside the contract cost data$")
	public void user_does_not_see_the_save_and_cancel_icons_beside_the_contract_cost_data() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Save Cost']//parent::div/parent::div")), "class", "hide");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Cancel']//parent::div/parent::div")), "class", "hide");
	}
	
	@When("^user clicks outside the contract cost data$")
	public void user_clicks_outside_the_contract_cost_data() throws Throwable {
		user_hits_the_escape_key();
		CommonFunctions.pause(1000, false);
	}
	
	@Then("^user sees the contract cost is changed to \"([^\"]*)\"$")
	public void user_sees_the_contract_cost_is_changed_to(String arg1) throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridLeftDiv']//span[text() = '" + arg1 + "']")));
	}
	
	@Then("^user sees the category 1 dropdown is empty and disabled$")
	public void user_sees_the_category_1_dropdown_is_empty_and_disabled() throws Throwable {
		contractDetailsPage.disabledModifyContractCostsDetailsPopupCategory1Dropdown();
	}
	
	@Then("^user sees the category 1 dropdown is enabled$")
	public void user_sees_the_category_1_dropdown_is_enabled() throws Throwable {
		contractDetailsPage.enabledModifyContractCostsDetailsPopupCategory1Dropdown();
	}
	
	@Then("^user does not see the category 1 field$")
	public void user_does_not_see_the_category_1_field() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'Category1Container')]//div");
	}
	
	@Then("^user sees the category 1 field$")
	public void user_sees_the_category_1_field() throws Throwable {
		contractDetailsPage.displayedModifyContractCostsDetailsPopupCategory1Label();
	}
	
	@Then("^user sees the allotment code is \"([^\"]*)\"$")
	public void user_sees_the_allotment_code_is(String arg1) throws Throwable {
		CommonFunctions.pause(2500, false);
		contractDetailsPage.containsValueModifyContractCostsDetailsPopupAllotmentCodeInput(arg1);
	}
	
	@When("^user selects \"([^\"]*)\" option as the category 1$")
	public void user_selects_option_as_the_category_1(String arg1) throws Throwable {
		contractDetailsPage.selectModifyContractCostsDetailsPopupCategory1Value(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the allotment field$")
	public void user_puts_in_the_allotment_field(String arg1) throws Throwable {
		contractDetailsPage.setModifyContractCostsDetailsPopupAllotmentCodeInput(arg1);
	}
	
	@Then("^user sees the list of suggestions for the allotment code with the inventory pool$")
	public void user_sees_the_list_of_suggestions_for_the_allotment_code_with_the_inventory_pool() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'SuggestionListContainer')]//table[contains(@id, 'AllotmentCodeTable')]")));
	}
	
	@When("^user selects one from the list of suggestions for the allotment code$")
	public void user_selects_one_from_the_list_of_suggestions_for_the_allotment_code() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'SuggestionListContainer')]//table[contains(@id, 'AllotmentCodeTable')]//div)[1]")));
	}
	
	@Then("^user does not see the list of suggestions for the allotment code$")
	public void user_does_not_see_the_list_of_suggestions_for_the_allotment_code() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'SuggestionListContainer')]//table[contains(@id, 'AllotmentCodeTable')]");
		user_hits_the_escape_key();
	}
	
	@Then("^user sees the category 1 field for filtering the contracts search results$")
	public void user_sees_the_category_1_field_for_filtering_the_contracts_search_results() throws Throwable {
		contractsPage.displayedCategory1Dropdown();
	}
	
	@When("^user opens the category 1 field$")
	public void user_opens_the_category_1_field() throws Throwable {
		contractsPage.clickCategory1Dropdown();
	}
	
	@Then("^user sees category 1 field option is only all$")
	public void user_sees_category_1_field_option_is_only_all() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//ul[contains(@role, 'listbox')]//div[text() = 'All']")));
		CommonFunctions.elementNotExistingByXPath("(//ul[contains(@role, 'listbox')]//li)[2]");
	}
	
	@Then("^user sees category 1 field value is \"([^\"]*)\"$")
	public void user_sees_category_1_field_value_is(String arg1) throws Throwable {
		contractsPage.containsValueCategory1Dropdown(arg1);
		user_hits_the_escape_key();
	}
	
	@When("^user changes the type of contract to be searched to \"([^\"]*)\"$")
	public void user_changes_the_type_of_contract_to_be_searched_to(String arg1) throws Throwable {
		contractsPage.selectTypeValue(arg1);
	}
	
	@Then("^user sees category 1 field options$")
	public void user_sees_category_field_options() throws Throwable {
		CommonFunctions.textVisibleInPage("Manifest");
	}
	
	@When("^user finds and selects one of the options as the contract 1 field value$")
	public void user_finds_and_selects_one_of_the_options_as_the_contract_1_field_value() throws Throwable {
		CommonFunctions.clearThenEnterElementValue(CommonFunctions.getLastElementInListByXPath("//input[contains(@id, 'search')]"), "Manifest");
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//ul[contains(@role, 'listbox')]//li)[1]")));
	}
	
	@Then("^user sees update packages button$")
	public void user_sees_update_packages_button() throws Throwable {
		contractDetailsPage.displayedUpdatePackagesButton();
	}
	
	@When("^user opens the update packages popup$")
	public void user_opens_the_update_packages_popup() throws Throwable {
		contractDetailsPage.clickUpdatePackagesButton();
	}
	
	@Then("^user sees the update packages popup package selected status is loading, one sale, and pending by default$")
	public void user_sees_the_update_packages_popup_package_selected_status_is_loading_one_sale_and_pending_by_default() throws Throwable {
		contractDetailsPage.displayedUpdatePackagesPopupPackageStatusDropdown();
		contractDetailsPage.containsValueUpdatePackagesPopupPackageStatusDropdown("Loading, On Sale, Pending");
	}
	
	@Then("^user sees the update packages popup table with its columns, rows, filters, and pagination elements$")
	public void user_sees_the_update_packages_popup_table_with_its_columns_rows_filters_and_pagination_elements() throws Throwable {
		contractDetailsPage.clickUpdatePackagesPopupPackageIdColumnHeader();
		contractDetailsPage.clickUpdatePackagesPopupPackageNameColumnHeader();
		contractDetailsPage.clickUpdatePackagesPopupPackageTypeColumnHeader();
		contractDetailsPage.clickUpdatePackagesPopupStatusColumnHeader();
		contractDetailsPage.clickUpdatePackagesPopupBrandColumnHeader();
		contractDetailsPage.clickUpdatePackagesPopupTourMarketColumnHeader();
		contractDetailsPage.setUpdatePackagesPopupPackageNameFilterInput("8");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@col-id, 'PackageDescription')])[2]")), "8");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("//div[@class = 'MainContentPopup']//span[contains(@id, 'MaxRowLabel')]")), "Rows: 50");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'MainContentPopup']//img[contains(@id, 'First')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'MainContentPopup']//img[contains(@id, 'Previous')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'MainContentPopup']//span[contains(@id, 'CurrentPage')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'MainContentPopup']//span[contains(@id, 'TotalPage')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'MainContentPopup']//img[contains(@id, 'Next')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'MainContentPopup']//img[contains(@id, 'Last')]")));
	}
	
	@Then("^user sees the update packages popup buttons$")
	public void user_sees_the_update_packages_popup_buttons() throws Throwable {
		contractDetailsPage.displayedUpdatePackagesPopupCancelButton();
		contractDetailsPage.displayedUpdatePackagesPopupUpdateSupplierNameButton();
		contractDetailsPage.displayedUpdatePackagesPopupUpdateContractNameButton();
	}
	
	@When("^user cancels the update of packages of the contracts$")
	public void user_cancels_the_update_of_packages_of_the_contracts() throws Throwable {
		contractDetailsPage.clickUpdatePackagesPopupCancelButton();
	}
	
	@Then("^user does not see the update packages popup$")
	public void user_does_not_see_the_update_packages_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[text() = 'Update Packages']");
	}
	
	@When("^user unselects all the packages in the update packages popup$")
	public void user_unselects_all_the_packages_in_the_update_packages_popup() throws Throwable {
		contractDetailsPage.clickUpdatePackagesPopupAllPackagesCheckbox();
	}
	
	@When("^user decides to update supplier name$")
	public void user_decides_to_update_supplier_name() throws Throwable {
		contractDetailsPage.clickUpdatePackagesPopupUpdateSupplierNameButton();
	}
	
	@When("^user changes the status of the contract to \"([^\"]*)\"$")
	public void user_changes_the_status_of_the_contract_to(String arg1) throws Throwable {
		contractDetailsPage.selectStatusValue(arg1);
	}
	
	@Then("^user sees the contracts costs accordion contents are disabled$")
	public void user_sees_the_contracts_costs_accordion_contents_are_disabled() throws Throwable {
		CommonFunctions.pause(2, true);
		contractDetailsPage.disabledContractCostsSectionDeleteAllCostsButton();
		// contractDetailsPage.disabledContractCostsSectionImportDatesButton();
		contractDetailsPage.disabledContractCostsSectionCreateBulkCostsButton();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//i[@title = 'Delete' and contains(@class, 'disable')])[1]")));
		user_hovers_over_a_certain_cell_that_is_not_empty_in_the_contract_costs_table();
		user_sees_the_view_icon_beside_the_contract_cost_data();
	}
	
	@Then("^user sees the contracts costs accordion contents are enabled$")
	public void user_sees_the_contracts_costs_accordion_contents_are_enabled() throws Throwable {
		CommonFunctions.pause(1, true);
		contractDetailsPage.enabledContractCostsSectionDeleteAllCostsButton();
		// contractDetailsPage.enabledContractCostsSectionImportDatesButton();
		contractDetailsPage.enabledContractCostsSectionCreateBulkCostsButton();
		user_hovers_over_a_certain_cell_that_is_not_empty_in_the_contract_costs_table();
		user_sees_the_edit_and_delete_icons_beside_the_contract_cost_data();
	}
	
	@Then("^user sees the buttons of the contract price section$")
	public void user_sees_the_buttons_of_the_contract_price_section() throws Throwable {
		contractDetailsPage.displayedContractPricesSectionDeleteAllPricesButton();
		contractDetailsPage.displayedContractPricesSectionAddPricesButton();
	}
	
	@When("^user uses column filters to filter the first contract prices category data$")
	public void user_uses_column_filters_to_filter_the_first_contract_prices_category_data() throws Throwable {
		contractDetailsPage.setContractPricesSectionTopDatesFilterInput("01 Jan 2018");
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user sees the first contract prices category accordion expanded and its contents$")
	public void user_sees_the_first_contract_prices_category_accordion_expanded_and_its_contents() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[@class = 'RoomType'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[@class = 'MealPlan'])[1]")));
		contractDetailsPage.displayedContractPricesSectionTopMaximumCommissionColumnHeader();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//i[@title = 'Delete'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class= 'customHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class= 'customAllotmentHeaderLabel'])[1]")));
		contractDetailsPage.displayedContractPricesSectionTopDatesFilterInput();
		contractDetailsPage.displayedContractPricesSectionTopCurrencyFilterInput();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'trash')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_First')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Previous')])[1]")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")), "Rows: 100");
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '20']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '50']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '100']")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '50']")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")), "Rows: 50");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Next')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Last')])[1]")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[1]")), "Prices displayed are for adult pax type only, and are GST exclusive.");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[2]")), "Non Commissionable");
	}
	
	@When("^user expands the second contract price category$")
	public void user_expands_the_second_contract_price_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'AccordionExpandable_header'])[2]")));
		CommonFunctions.pause(1500, false);
	}
	
	@Then("^user sees the second contract price category contents$")
	public void user_sees_the_second_contract_price_category_contents() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'AccordionExpandable_content'])[2]/parent::div")), "class", "expanded");
	}
	
	@When("^user collapses the second contract price category$")
	public void user_collapses_the_second_contract_price_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'AccordionExpandable_header'])[2]")));
		CommonFunctions.pause(1500, false);
	}
	
	@Then("^user does not see the second contract price category contents$")
	public void user_does_not_see_the_second_contract_price_category_contents() throws Throwable {
		CommonFunctions.elementAttributeDoesNotContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'AccordionExpandable_content'])[2]/parent::div")), "class", "expanded");
	}
	
	@Then("^user sees the contract price section and its contents without the write options$")
	public void user_sees_the_contract_price_section_and_its_contents_without_the_write_options() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[@class = 'RoomType'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[@class = 'MealPlan'])[1]")));
		contractDetailsPage.displayedContractPricesSectionTopMaximumCommissionColumnHeader();
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//i[@title = 'Delete'])[1]");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class= 'customHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class= 'customAllotmentHeaderLabel'])[1]")));
		contractDetailsPage.displayedContractPricesSectionTopDatesFilterInput();
		contractDetailsPage.displayedContractPricesSectionTopCurrencyFilterInput();
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'trash')])[1]");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")), "Rows: 100");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[1]")), "Prices displayed are for adult pax type only, and are GST exclusive.");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[2]")), "Non Commissionable");
	}
	
	@Then("^user sees the price that is non commission with a coloured dot and also the legend explaining the coloured dot means$")
	public void user_sees_the_price_that_is_non_commission_with_a_coloured_dot_and_also_the_legend_explaining_the_coloured_dot_means() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'AGGridLeftDiv']//span[contains(@class, 'GST')]")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[2]")), "Non Commissionable");
	}
	
	@When("^user hovers over a certain cell that is not empty in the contract prices table$")
	public void user_hovers_over_a_certain_cell_that_is_not_empty_in_the_contract_prices_table() throws Throwable {
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(((//div[contains(@id, 'MainContractPriceContainer')]//div[@class = 'WebBlockMainContainer'])[1]//div[@ref = 'eBodyViewport']//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]//div[@col-id = 'MaximumCommission']//following-sibling::div[@role = 'gridcell'])[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the edit and delete icons beside the contract price data$")
	public void user_sees_the_edit_and_delete_icons_beside_the_contract_price_data() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(((//div[contains(@id, 'MainContractPriceContainer')]//div[@class = 'WebBlockMainContainer'])[1]//div[@ref = 'eBodyViewport']//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]//div[@col-id = 'MaximumCommission']//following-sibling::div[@role = 'gridcell'])[1]//span[@title = 'Edit Price']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(((//div[contains(@id, 'MainContractPriceContainer')]//div[@class = 'WebBlockMainContainer'])[1]//div[@ref = 'eBodyViewport']//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]//div[@col-id = 'MaximumCommission']//following-sibling::div[@role = 'gridcell'])[1]//span[@title = 'Delete Price']")));
	}
	
	@Then("^user sees the view icon beside the contract price data$")
	public void user_sees_the_view_icon_beside_the_contract_price_data() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(((//div[contains(@id, 'MainContractPriceContainer')]//div[@class = 'WebBlockMainContainer'])[1]//div[@ref = 'eBodyViewport']//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]//div[@col-id = 'MaximumCommission']//following-sibling::div[@role = 'gridcell'])[1]//span[@title = 'View Price']")));
	}
	
	@Then("^user sees contract type dropdown is disabled$")
	public void user_sees_contract_type_dropdown_is_disabled() throws Throwable {
		contractDetailsPage.disabledTypeDropdown();
	}
	
	@Then("^user does not see the delete icons in the left hand side of the contract cost table$")
	public void user_does_not_see_the_delete_icons_in_the_left_hand_side_of_the_contract_cost_table() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'ContractCostContainer')]//div[@class = 'deleteRowDiv']");
	}
	
	@Then("^user sees include prices when copying contract option is unchecked and disabled$")
	public void user_sees_include_prices_when_copying_contract_option_is_unchecked_and_disabled() throws Throwable {
		contractDetailsPage.checkContractPricesSectionIncludePricesWhenCopyingContractCheckboxIsNotToggled();
		contractDetailsPage.disabledContractPricesSectionIncludePricesWhenCopyingContractCheckbox();
	}
	
	@When("^user ticks the include costs when copying contract option$")
	public void user_ticks_the_include_costs_when_copying_contract_option() throws Throwable {
		contractDetailsPage.clickContractCostsSectionIncludeCostsWhenCopyingContractCheckbox();
	}
	
	@Then("^user sees include costs when copying contract option is unchecked$")
	public void user_sees_include_costs_when_copying_contract_option_is_unchecked() throws Throwable {
		contractDetailsPage.checkContractCostsSectionIncludeCostsWhenCopyingContractCheckboxIsNotToggled();
	}
	
	@Then("^user sees include prices when copying contract option is enabled$")
	public void user_sees_include_prices_when_copying_contract_option_is_enabled() throws Throwable {
		contractDetailsPage.enabledContractPricesSectionIncludePricesWhenCopyingContractCheckbox();
	}
	
	@When("^user ticks the include prices when copying contract option$")
	public void user_ticks_the_include_prices_when_copying_contract_option() throws Throwable {
		contractDetailsPage.clickContractPricesSectionIncludePricesWhenCopyingContractCheckbox();
	}
	
	@Then("^user sees the contract prices of the original contract has been copied$")
	public void user_sees_the_contract_prices_of_the_original_contract_has_been_copied() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceWeblockContainer')]//div[@class = 'WebBlockMainContainer']")));
	}
	
	@Then("^user sees the contract prices of the original contract has not been copied$")
	public void user_sees_the_contract_prices_of_the_original_contract_has_not_been_copied() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'ContractPriceWeblockContainer')]//div[@class = 'WebBlockMainContainer']");
	}
	
	@Then("^user sees the contract prices content of the contract with type foreign operator / land while editing$")
	public void user_sees_the_contract_prices_content_of_the_contract_with_type_foreign_operator_land_while_editing() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//span[@class = 'RoomType'])[1]");
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//span[@class = 'MealPlan'])[1]");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//i[@title = 'Delete'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class= 'customHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class= 'customAllotmentHeaderLabel'])[1]")));
		contractDetailsPage.displayedContractPricesSectionTopDatesFilterInput();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'trash')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_First')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Previous')])[1]")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")), "Rows: 100");
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '20']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '50']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '100']")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '50']")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")), "Rows: 50");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Next')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Last')])[1]")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[1]")), "Prices are for adult pax type. All prices are GST inclusive.");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[2]")), "Non Commissionable");
	}
	
	@Then("^user sees the contract prices content of the contract with type foreign operator / land while copying$")
	public void user_sees_the_contract_prices_content_of_the_contract_with_type_foreign_operator_land_while_copying() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//span[@class = 'RoomType'])[1]");
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//span[@class = 'MealPlan'])[1]");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class= 'customHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class= 'customAllotmentHeaderLabel'])[1]")));
		contractDetailsPage.displayedContractPricesSectionTopDatesFilterInput();
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'trash')])[1]");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_First')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Previous')])[1]")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")), "Rows: 100");
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '20']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '50']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '100']")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '50']")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")), "Rows: 50");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Next')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Last')])[1]")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[1]")), "Prices are for adult pax type. All prices are GST inclusive.");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[2]")), "Non Commissionable");
	}
	
	@Then("^user sees the contract prices content without the write options$")
	public void user_sees_the_contract_prices_content_without_the_write_options() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//span[@class = 'RoomType'])[1]");
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//span[@class = 'MealPlan'])[1]");
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//i[@title = 'Delete'])[1]");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class= 'customHeaderLabel'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class= 'customAllotmentHeaderLabel'])[1]")));
		contractDetailsPage.displayedContractPricesSectionTopDatesFilterInput();
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'trash')])[1]");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_First')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Previous')])[1]")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")), "Rows: 100");
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '20']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '50']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '100']")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'PageSizeOption']//span[text() = '50']")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@id, 'MaxRowLabel')])[1]")), "Rows: 50");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Next')])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//img[@class = 'navigationButtons' and contains(@id, 'GridContainer_Last')])[1]")));
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[1]")), "Prices are for adult pax type. All prices are GST inclusive.");
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//span[contains(@class, 'ContractCostText')])[2]")), "Non Commissionable");
	}
	
	@Then("^user sees the contract prices add prices and delete all prices buttons$")
	public void user_sees_the_contract_prices_add_prices_and_delete_all_prices_buttons() throws Throwable {
		contractDetailsPage.displayedContractPricesSectionAddPricesButton();
		contractDetailsPage.displayedContractPricesSectionDeleteAllPricesButton();
	}
	
	@Then("^user does not see the contract prices add prices and delete all prices buttons$")
	public void user_does_not_see_the_contract_prices_add_prices_and_delete_all_prices_buttons() throws Throwable {
		// contractDetailsPage.hiddenContractPricesSectionAddPricesButton(); // UPDATE???
		contractDetailsPage.hiddenContractPricesSectionDeleteAllPricesButton();
	}
	
	@When("^user uses column filters to find a specific contract cost data$")
	public void user_uses_column_filters_to_find_a_specific_contract_cost_data() throws Throwable {
		contractDetailsPage.setContractCostsSectionTopDatesFilterInput("01 Jan 2015 - 02 Jan 2017");
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user decides to delete the row of the contract cost data$")
	public void user_decides_to_delete_the_row_of_the_contract_cost_data() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//span[contains(@class, 'trash')])[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user selects one package in the update packages popup$")
	public void user_selects_one_package_in_the_update_packages_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@col-id, 'PackageDescription')]//preceding-sibling::div[@col-id = '0'])[2]")));
	}
	
	@When("^user updates the supplier name of the selected packages$")
	public void user_updates_the_supplier_name_of_the_selected_packages() throws Throwable {
		contractDetailsPage.clickUpdatePackagesPopupUpdateSupplierNameButton();
	}
	
	@Then("^user sees the selected packages are the only ones checked after the update of the supplier name$")
	public void user_sees_the_selected_packages_are_the_only_ones_checked_after_the_update_of_the_supplier_name() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@col-id, 'PackageDescription')]//preceding-sibling::div[@col-id = '0'])[2]//span[contains(@class, '-checked')]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@col-id, 'PackageDescription')]//preceding-sibling::div[@col-id = '0'])[3]//span[contains(@class, '-unchecked')]")));
	}
	
	@When("^user opens the create bulk costs popup$")
	public void user_opens_the_create_bulk_costs_popup() throws Throwable {
		contractDetailsPage.clickContractCostsSectionCreateBulkCostsButton();
	}
	
	@Then("^user sees import dates button inside the contract costs accordion$")
	public void user_sees_import_dates_button_inside_the_contract_costs_accordion() throws Throwable {
		contractDetailsPage.displayedContractCostsSectionImportDatesButton();
	}
	
	@When("^user opens the import dates from cost popup$")
	public void user_opens_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.clickContractCostsSectionImportDatesButton();
	}
	
	@Then("^user sees the import dates from cost popup fields and buttons$")
	public void user_sees_the_import_dates_from_cost_popup_fields_and_buttons() throws Throwable {
		contractDetailsPage.displayedImportDatesFromCostPopupCostConfigurationDropdown();
		contractDetailsPage.displayedImportDatesFromCostPopupSeasonDropdown();
		contractDetailsPage.displayedImportDatesFromCostPopupGuestConfigurationDropdown();
		contractDetailsPage.displayedImportDatesFromCostPopupCategory1Dropdown();
		contractDetailsPage.displayedImportDatesFromCostPopupCategory2Dropdown();
		contractDetailsPage.displayedImportDatesFromCostPopupMinimumPaxInput();
		contractDetailsPage.displayedImportDatesFromCostPopupMaximumPaxInput();
		contractDetailsPage.displayedImportDatesFromCostPopupCostTypeDropdown();
		contractDetailsPage.displayedImportDatesFromCostPopupRateTypeDropdown();
		contractDetailsPage.displayedImportDatesFromCostPopupQuantityInput();
		contractDetailsPage.displayedImportDatesFromCostPopupNumberOfDaysInput();
		contractDetailsPage.displayedImportDatesFromCostPopupCancelButton();
		contractDetailsPage.displayedImportDatesFromCostPopupImportDatesButton();
	}
	
	@When("^user searches for a specific cost configuration for the import dates from cost$")
	public void user_searches_for_a_specific_cost_configuration_for_the_import_dates_from_cost() throws Throwable {
		contractDetailsPage.clickImportDatesFromCostPopupCostConfigurationDropdown();
		contractDetailsPage.setImportDatesFromCostPopupGuestConfigurationFilterInput("E");
	}
	
	@Then("^user sees the specific cost configuration for the import dates from cost$")
	public void user_sees_the_specific_cost_configuration_for_the_import_dates_from_cost() throws Throwable {
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("//div[contains(@id, 'costConfigContainer')]//tbody//td//div")), "e");
	}
	
	@When("^user selects a specific cost configuration for the import dates from cost$")
	public void user_selects_a_specific_cost_configuration_for_the_import_dates_from_cost() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'costConfigContainer')]//tbody//td//div[contains(text(), 'E') or contains(text(), 'e')]")));
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user sees season for the import dates from cost is \"([^\"]*)\"$")
	public void user_sees_season_for_the_import_dates_from_cost_is(String arg1) throws Throwable {
		contractDetailsPage.containsValueImportDatesFromCostPopupSeasonDropdown(arg1);
	}
	
	@When("^user selects few seasons for the import dates from cost$")
	public void user_selects_few_seasons_for_the_import_dates_from_cost() throws Throwable {
		contractDetailsPage.clickImportDatesFromCostPopupSeasonDropdownOption("Select All");
		contractDetailsPage.clickImportDatesFromCostPopupSeasonDropdownOption("Season 1");
	}
	
	@Then("^user sees that the minimum and maximum pax fields does not accept alphabets, special characters, negative numbers, and decimals in the import dates from cost popup$")
	public void user_sees_that_the_minimum_and_maximum_pax_fields_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals_in_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromCostPopupMinimumPaxInput("");
		contractDetailsPage.containsValueImportDatesFromCostPopupMaximumPaxInput("");
	}
	
	@When("^user puts \"([^\"]*)\" into minimum pax field in the import dates from cost popup$")
	public void user_puts_into_minimum_pax_field_in_the_import_dates_from_cost_popup(String arg1) throws Throwable {
		contractDetailsPage.setImportDatesFromCostPopupMinimumPaxInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" into maximum pax field in the import dates from cost popup$")
	public void user_puts_into_maximum_pax_field_in_the_import_dates_from_cost_popup(String arg1) throws Throwable {
		contractDetailsPage.setImportDatesFromCostPopupMaximumPaxInput(arg1);
	}
	
	@Then("^user sees that the quantity field does not accept alphabets, special characters, negative numbers, and decimals in the import dates from cost popup$")
	public void user_sees_that_the_quantity_field_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals_in_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromCostPopupQuantityInput("");
	}
	
	@When("^user puts \"([^\"]*)\" into quantity field in the import dates from cost popup$")
	public void user_puts_into_quantity_field_in_the_import_dates_from_cost_popup(String arg1) throws Throwable {
		contractDetailsPage.setImportDatesFromCostPopupQuantityInput(arg1);
	}
	
	@Then("^user sees category 1 field is enabled in the import dates from cost popup$")
	public void user_sees_category_1_field_is_enabled_in_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.enabledImportDatesFromCostPopupCategory1Dropdown();
	}
	
	@Then("^user sees rate type is defaulted to \"([^\"]*)\" in the import dates from cost popup$")
	public void user_sees_rate_type_is_defaulted_to_in_the_import_dates_from_cost_popup(String arg1) throws Throwable {
		contractDetailsPage.containsValueImportDatesFromCostPopupRateTypeDropdown(arg1);
	}
	
	@Then("^user sees number of days field is disabled and empty in the import dates from cost popup$")
	public void user_sees_number_of_days_field_is_disabled_and_empty_in_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.disabledImportDatesFromCostPopupNumberOfDaysInput();
		contractDetailsPage.containsValueImportDatesFromCostPopupNumberOfDaysInput("");
	}
	
	@Then("^user sees the pax range column inside the cost configuration table$")
	public void user_sees_the_pax_range_column_inside_the_cost_configuration_table() throws Throwable {
		contractDetailsPage.containsValuePlaceholderImportDatesFromCostPopupPaxRangeFilterPlaceholderInput("Pax Range");
		contractDetailsPage.clickImportDatesFromCostPopupCostConfigurationDropdown();
	}
	
	@Then("^user sees the minimum and maximum pax fields in the import dates from cost popup$")
	public void user_sees_the_minimum_and_maximum_pax_fields_in_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromCostPopupMinimumPaxLabel("Minimum Pax");
		contractDetailsPage.containsValueImportDatesFromCostPopupMaximumPaxLabel("Maximum Pax");
	}
	
	@When("^user closes the import dates from cost popup$")
	public void user_closes_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.clickImportDatesFromCostPopupCancelButton();
	}
	
	@Then("^user sees the days column inside the cost configuration table$")
	public void user_sees_the_days_column_inside_the_cost_configuration_table() throws Throwable {
		contractDetailsPage.containsValuePlaceholderImportDatesFromCostPopupPaxRangeFilterPlaceholderInput("Days");
		contractDetailsPage.clickImportDatesFromCostPopupCostConfigurationDropdown();
	}
	
	@Then("^user sees the minimum and maximum days fields in the import dates from cost popup$")
	public void user_sees_the_minimum_and_maximum_days_fields_in_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromCostPopupMinimumPaxLabel("Minimum Days");
		contractDetailsPage.containsValueImportDatesFromCostPopupMaximumPaxLabel("Maximum Days");
	}
	
	@Then("^user sees category 1 field is disabled and empty in the import dates from cost popup$")
	public void user_sees_category_1_field_is_disabled_and_empty_in_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.disabledImportDatesFromCostPopupCategory1Dropdown();
		contractDetailsPage.containsValueImportDatesFromCostPopupCategory1Dropdown("");
	}
	
	@Then("^user sees the nights column inside the cost configuration table$")
	public void user_sees_the_nights_column_inside_the_cost_configuration_table() throws Throwable {
		contractDetailsPage.containsValuePlaceholderImportDatesFromCostPopupPaxRangeFilterPlaceholderInput("Nights");
		contractDetailsPage.clickImportDatesFromCostPopupCostConfigurationDropdown();
	}
	
	@Then("^user sees the minimum and maximum nights fields in the import dates from cost popup$")
	public void user_sees_the_minimum_and_maximum_nights_fields_in_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromCostPopupMinimumPaxLabel("Minimum Nights");
		contractDetailsPage.containsValueImportDatesFromCostPopupMaximumPaxLabel("Maximum Nights");
	}
	
	@When("^user selects \"([^\"]*)\" as the rate type in the import dates from cost popup$")
	public void user_selects_as_the_rate_type_in_the_import_dates_from_cost_popup(String arg1) throws Throwable {
		contractDetailsPage.selectImportDatesFromCostPopupRateTypeValue(arg1);
	}
	
	@Then("^user sees number of days is enabled and defaulted to (\\d+) in the import dates from cost popup$")
	public void user_sees_number_of_days_is_enabled_and_defaulted_to_in_the_import_dates_from_cost_popup(int arg1) throws Throwable {
		contractDetailsPage.enabledImportDatesFromCostPopupNumberOfDaysInput();
		contractDetailsPage.containsValueImportDatesFromCostPopupNumberOfDaysInput("");
	}
	
	@Then("^user sees that the number of days field does not accept alphabets, special characters, negative numbers, and decimals in the import dates from cost popup$")
	public void user_sees_that_the_number_of_days_field_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals_in_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromCostPopupNumberOfDaysInput("");
	}
	
	@When("^user puts \"([^\"]*)\" into number of days field in the import dates from cost popup$")
	public void user_puts_into_number_of_days_field_in_the_import_dates_from_cost_popup(String arg1) throws Throwable {
		contractDetailsPage.setImportDatesFromCostPopupNumberOfDaysInput(arg1);
	}
	
	@When("^user opens the cost configuration for the import dates from cost$")
	public void user_opens_the_cost_configuration_for_the_import_dates_from_cost() throws Throwable {
		contractDetailsPage.clickImportDatesFromCostPopupCostConfigurationDropdown();
	}
	
	@When("^user saves the import dates from cost popup$")
	public void user_saves_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.clickImportDatesFromCostPopupImportDatesButton();
	}
	
	@When("^user provides the necessary information for the import dates from cost popup$")
	public void user_provides_the_necessary_information_for_the_import_dates_from_cost_popup() throws Throwable {
		contractDetailsPage.clickImportDatesFromCostPopupCostConfigurationDropdown();
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'costConfigContainer')]//tbody//tr)[1]")));
		contractDetailsPage.setImportDatesFromCostPopupMinimumPaxInput("1");
		contractDetailsPage.setImportDatesFromCostPopupMaximumPaxInput("50");
		contractDetailsPage.setImportDatesFromCostPopupCostsInput("123");
		contractDetailsPage.setImportDatesFromCostPopupQuantityInput("100");
	}
	
	@When("^user opens the import dates from price popup$")
	public void user_opens_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.clickContractPricesSectionImportDatesButton();
	}
	
	@Then("^user sees respective guest configuration is selected by default$")
	public void user_sees_respective_guest_configuration_is_selected_by_default() throws Throwable {
		contractDetailsPage.checkImportDatesFromPricePopupRespectiveGuestConfigurationsRadioButtonIsToggled();
	}
	
	@Then("^user sees radio buttons in import dates from price popup is enabled$")
	public void user_sees_radio_buttons_in_import_dates_from_price_popup_is_enabled() throws Throwable {
		contractDetailsPage.enabledImportDatesFromPricePopupRespectiveGuestConfigurationsRadioButton();
		// contractDetailsPage.enabledImportDatesFromPricePopupTwinGuestConfigurationRadioButton();
	}
	
	@Then("^user sees radio buttons in import dates from price popup is disabled$")
	public void user_sees_radio_buttons_in_import_dates_from_price_popup_is_disabled() throws Throwable {
		contractDetailsPage.disabledImportDatesFromPricePopupRespectiveGuestConfigurationsRadioButton();
		contractDetailsPage.disabledImportDatesFromPricePopupTwinGuestConfigurationRadioButton();
	}
	
	@When("^user closes the import dates from price popup$")
	public void user_closes_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.clickImportDatesFromPricePopupCancelButton();
	}
	
	@When("^user searches for an old contract by id$")
	public void user_searches_for_an_old_contract_by_id() throws Throwable {
		contractsPage.setIdInput(prop.getProperty("searchContractIdOld"));
		contractsPage.clickFindButton();
	}
	
	@Then("^user sees hide past dates option enabled and toggled$")
	public void user_sees_hide_past_dates_option_enabled_and_toggled() throws Throwable {
		contractDetailsPage.enabledContractCostsSectionHidePastDatesCheckbox();
		contractDetailsPage.checkContractCostsSectionHidePastDatesCheckboxIsToggled();
	}
	
	@Then("^user sees that the minimum and maximum commission fields does not accept alphabets, and special characters in the import dates from price popup$")
	public void user_sees_that_the_minimum_and_maximum_commission_fields_does_not_accept_alphabets_and_special_characters_in_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromPricePopupMinimumCommissionInput("");
		contractDetailsPage.containsValueImportDatesFromPricePopupMaximumCommissionInput("");
	}
	
	@Then("^user sees that the minimum and maximum commission fields does accept decimals in the import dates from price popup$")
	public void user_sees_that_the_minimum_and_maximum_commission_fields_does_accept_decimals_in_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromPricePopupMinimumCommissionInput(".1");
		contractDetailsPage.containsValueImportDatesFromPricePopupMaximumCommissionInput(".2");
	}
	
	@When("^user puts \"([^\"]*)\" into the minimum commission field in the import dates from price popup$")
	public void user_puts_into_the_minimum_commission_field_in_the_import_dates_from_price_popup(String arg1) throws Throwable {
		contractDetailsPage.setImportDatesFromPricePopupMinimumCommissionInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" into the maximum commission field in the import dates from price popup$")
	public void user_puts_into_the_maximum_commission_field_in_the_import_dates_from_price_popup(String arg1) throws Throwable {
		contractDetailsPage.setImportDatesFromPricePopupMaximumCommissionInput(arg1);
	}
	
	@Then("^user sees that the price field does not accept alphabets, and special characters in the import dates from price popup$")
	public void user_sees_that_the_price_field_does_not_accept_alphabets_and_special_characters_in_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromPricePopupPriceInput("");
	}
	
	@Then("^user sees that the price field does accept decimals in the import dates from price popup$")
	public void user_sees_that_the_price_field_does_accept_decimals_in_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromPricePopupPriceInput(".12");
	}
	
	@When("^user puts \"([^\"]*)\" into the price field in the import dates from price popup$")
	public void user_puts_into_the_price_field_in_the_import_dates_from_price_popup(String arg1) throws Throwable {
		contractDetailsPage.setImportDatesFromPricePopupPriceInput(arg1);
	}
	
	@Then("^user sees that the price field does accept negative numbers in the import dates from price popup$")
	public void user_sees_that_the_price_field_does_accept_negative_numbers_in_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromPricePopupPriceInput("-1");
	}
	
	@Then("^user sees that the non-commission field does not accept alphabets, and special characters in the import dates from price popup$")
	public void user_sees_that_the_non_commission_field_does_not_accept_alphabets_and_special_characters_in_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromPricePopupNonCommissionInput("");
	}
	
	@Then("^user sees that the non-commission field does accept decimals in the import dates from price popup$")
	public void user_sees_that_the_non_commission_field_does_accept_decimals_in_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromPricePopupNonCommissionInput(".12");
	}
	
	@When("^user puts \"([^\"]*)\" into the non-commission field in the import dates from price popup$")
	public void user_puts_into_the_non_commission_field_in_the_import_dates_from_price_popup(String arg1) throws Throwable {
		contractDetailsPage.setImportDatesFromPricePopupNonCommissionInput(arg1);
	}
	
	@Then("^user sees that the non-commission field does accept negative numbers in the import dates from price popup$")
	public void user_sees_that_the_non_commission_field_does_accept_negative_numbers_in_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromPricePopupNonCommissionInput("-1");
	}
	
	@When("^user provides \"([^\"]*)\" as the contract price$")
	public void user_provides_as_the_contract_price(String arg1) throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//input[@class = 'costInput'])[3]")), arg1);
	}
	
	@When("^user saves the contract price$")
	public void user_saves_the_contract_price() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[3]//div[@class = 'AGGridRightDiv']//span[@title = 'Save Price']")));
		CommonFunctions.pause(10000, false);
	}
	
	@Then("^user sees the contract price cannot be saved$")
	public void user_sees_the_contract_price_cannot_be_saved() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[3]//div[contains(@class, 'Not_Valid')]")));
	}
	
	@Then("^user does not see the save and cancel icons beside the contract price data$")
	public void user_does_not_see_the_save_and_cancel_icons_beside_the_contract_price_data() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Save Price']//parent::div/parent::div")), "class", "hide");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Cancel']//parent::div/parent::div")), "class", "hide");
	}
	
	@When("^user clicks a certain cell in the contract prices table$")
	public void user_clicks_a_certain_cell_in_the_contract_prices_table() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[3]")));
		CommonFunctions.pause(1500, false);
	}
	
	@Then("^user sees the save and cancel icons beside the contract price data$")
	public void user_sees_the_save_and_cancel_icons_beside_the_contract_price_data() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[@title = 'Save Price']//parent::div/parent::div[@class = 'AGUpdateDiv']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//span[@title = 'Cancel']//parent::div/parent::div[@class = 'AGUpdateDiv']")));
	}
	
	@When("^user clicks outside the contract price data$")
	public void user_clicks_outside_the_contract_price_data() throws Throwable {
		user_hits_the_escape_key();
		CommonFunctions.pause(1500, false);
	}
	
	@Then("^user sees the contract price is changed to \"([^\"]*)\"$")
	public void user_sees_the_contract_price_is_changed_to(String arg1) throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[3]//div[@class = 'AGGridLeftDiv']//span[text() = '" + arg1 + "']")));
	}
	
	@When("^user enters \"([^\"]*)\" at the \"([^\"]*)\" adult cost field in the create bulk costs popup$")
	public void user_enters_at_the_adult_cost_field_in_the_create_bulk_costs_popup(String arg1, String arg2) throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//td[text() = '" + arg2 + "']//parent::tr//td)[2]//input")), arg1);
	}
	
	@Then("^user sees that the cost fields does not accept alphabets, and special characters in the create bulk costs popup$")
	public void user_sees_that_the_cost_fields_does_not_accept_alphabets_and_special_characters_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//td[text() = 'Room Only Twin']//parent::tr//td)[2]//input")), "value", "");
	}
	
	@Then("^user sees that the cost fields does accept decimals in the create bulk costs popup$")
	public void user_sees_that_the_cost_fields_does_accept_decimals_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//td[text() = 'Room Only Twin']//parent::tr//td)[2]//input")), "value", "12.34");
	}
	
	@Then("^user sees the list of suggestions for the allotment code with the inventory pool in the create bulk costs popup$")
	public void user_sees_the_list_of_suggestions_for_the_allotment_code_with_the_inventory_pool_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'SuggestionListContainer')]//span[contains(@id, 'AllotmentCode')]")));
	}
	
	@When("^user selects one from the list of suggestions for the allotment code in the create bulk costs popup$")
	public void user_selects_one_from_the_list_of_suggestions_for_the_allotment_code_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'SuggestionListContainer')]//span[contains(@id, 'AllotmentCode')]//div)[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user does not see the list of suggestions for the allotment code in the create bulk costs popup$")
	public void user_does_not_see_the_list_of_suggestions_for_the_allotment_code_in_the_create_bulk_costs_popup() throws Throwable {
		user_removes_the_focus_on_the_field();
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'SuggestionListContainer')]//span[contains(@id, 'AllotmentCode')]");
	}
	
	@Then("^user sees the create bulk costs popup icon$")
	public void user_sees_the_create_bulk_costs_popup_icon() throws Throwable {
		contractDetailsPage.displayedContractCostsSectionCreateBulkCostsButton();
	}
	
	@Then("^user sees the create bulk costs popup$")
	public void user_sees_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Create Bulk Costs");
	}
	
	@Then("^user sees the newly added date ranges along with the delete button in the create bulk costs popup$")
	public void user_sees_the_newly_added_date_ranges_along_with_the_delete_button_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[2]")), "value", "01 May 2020");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[2]")), "value", "02 May 2020");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[3]")), "value", "11 May 2020");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[3]")), "value", "12 May 2020");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[4]")), "value", "21 May 2020");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[4]")), "value", "22 May 2020");
	}
	
	@When("^user deletes a date range in the create bulk costs popup$")
	public void user_deletes_a_date_range_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(text(), 'Delete Date')])[1]")));
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user sees the date range fields and add date range button enabled in the create bulk costs popup$")
	public void user_sees_the_date_range_fields_and_add_date_range_button_enabled_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementEnabled(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")));
		CommonFunctions.elementEnabled(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")));
	}
	
	@When("^user decides to delete all costs of the contract$")
	public void user_decides_to_delete_all_costs_of_the_contract() throws Throwable {
		contractDetailsPage.clickContractCostsSectionDeleteAllCostsButton();
	}
	
	@When("^user decides to delete a row of costs$")
	public void user_decides_to_delete_a_row_of_costs() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@class = 'deleteRowDiv']//span)[2]")));
		CommonFunctions.pause(10000, false);
		// CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the dates 01 Sep 2019 - 31 Aug 2020 across all Guest Configurations in Harbour View Room and BB?']");
		CommonFunctions.switchFrameByXPath("//*[text() = 'Price exists that overlaps other cost records. Are you sure you want to delete the selected cost record(s) followed by adjusting the price dates manually?']");
	}
	
	@Then("^user sees a confirmation message for the deletion of the row of costs$")
	public void user_sees_a_confirmation_message_for_the_deletion_of_the_row_of_costs() throws Throwable {
		// CommonFunctions.textVisibleInPage("Are you sure you want to delete the dates 01 Sep 2019 - 31 Aug 2020 across all Guest Configurations in Harbour View Room and BB?");
		CommonFunctions.textVisibleInPage("Price exists that overlaps other cost records. Are you sure you want to delete the selected cost record(s) followed by adjusting the price dates manually?");
	}
	
	@When("^user cancels the deletion of the row of costs$")
	public void user_cancels_the_deletion_of_the_row_of_costs() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'Cancel']")));
	}
	
	@Then("^user sees the row of costs is not deleted$")
	public void user_sees_the_row_of_costs_is_not_deleted() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'AccordionExpandableArea')])[1]//*[text() = '01 Sep 2020 - 31 Aug 2021']")));
	}
	
	@When("^user confirms the deletion of the row of costs$")
	public void user_confirms_the_deletion_of_the_row_of_costs() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'OK']")));
	}
	
	@Then("^user sees the row of costs is deleted$")
	public void user_sees_the_row_of_costs_is_deleted() throws Throwable {
		CommonFunctions.pause(15000, false);
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'AccordionExpandableArea')])[1]//*[text() = '01 Sep 2020 - 31 Aug 2021']");
	}
	
	@When("^user deletes the contract cost$")
	public void user_deletes_the_contract_cost() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Delete Cost']")));
		CommonFunctions.pause(5000, false);
		// CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this cost record?");
		CommonFunctions.switchFrameByXPath("//*[text() = 'Price exists that overlaps other cost records. Are you sure you want to delete the selected cost record(s) followed by adjusting the price dates manually?']");
	}
	
	@When("^user cancels the deletion of the contract cost$")
	public void user_cancels_the_deletion_of_the_contract_cost() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'Cancel']")));
	}
	
	@Then("^user sees the contract cost is not deleted$")
	public void user_sees_the_contract_cost_is_not_deleted() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[contains(@class, 'center')]//div[@row-index='0'])[1]//div[@role = 'gridcell'])[3]//span[text() = '146.82']")));
	}
	
	@When("^user confirms the deletion of the contract cost$")
	public void user_confirms_the_deletion_of_the_contract_cost() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'OK']")));
	}
	
	@Then("^user sees the contract cost is deleted$")
	public void user_sees_the_contract_cost_is_deleted() throws Throwable {
		CommonFunctions.pause(20000, false);
		CommonFunctions.elementNotExistingByXPath("((//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eBodyViewport']//div[contains(@class, 'center')]//div[@row-index='0'])[1]//div[@role = 'gridcell'])[3]//span[text() = '146.82']");
	}
	
	@When("^user decides to delete a guest configuration of the cost category$")
	public void user_decides_to_delete_a_guest_configuration_of_the_cost_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//i[@title = 'Delete'])[1]")));
		CommonFunctions.pause(10000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Do you wish to remove costs of this guest configuration from all Harbour View Room configurations?']");
	}
	
	@When("^user cancels the deletion of the guest configuration of the cost category$")
	public void user_cancels_the_deletion_of_the_guest_configuration_of_the_cost_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//span[@class = 'fas fa-fw fas fa-times']/parent::a/parent::div")));
	}
	
	@Then("^user sees the guest configuration of the cost category is not deleted$")
	public void user_sees_the_guest_configuration_of_the_cost_category_is_not_deleted() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[1]//div[@class = 'customHeaderLabel' and text() = 'Double']")));
	}
	
	@When("^user chooses to delete the guest configuration for the cost category only$")
	public void user_chooses_to_delete_the_guest_configuration_for_the_cost_category_only() throws Throwable {
		// CommonFunctions.switchFrameByXPath("//*[text() = 'Do you wish to remove costs of this guest configuration from all Harbour View Room configurations?']");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'This Configuration Only']")));
	}
	
	@Then("^user sees the guest configuration for the cost category is deleted$")
	public void user_sees_the_guest_configuration_for_the_cost_category_is_deleted() throws Throwable {
		CommonFunctions.pause(20000, false);
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[1]//div[@class = 'customHeaderLabel' and text() = 'Double']");
	}
	
	@When("^user chooses to delete the guest configuration for all cost categories$")
	public void user_chooses_to_delete_the_guest_configuration_for_all_cost_categories() throws Throwable {
		// CommonFunctions.switchFrameByXPath("//*[text() = 'Do you wish to remove costs of this guest configuration from all Harbour View Room configurations?']");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'All Configurations']")));
	}
	
	@Then("^user sees the guest configuration for all cost categories is deleted$")
	public void user_sees_the_guest_configuration_for_all_cost_categories_is_deleted() throws Throwable {
		CommonFunctions.pause(20000, false);
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractCostContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[1]//div[@class = 'customHeaderLabel' and text() = 'Single']");
	}
	
	@When("^user decides to delete a contract cost category$")
	public void user_decides_to_delete_a_contract_cost_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//a[contains(@id, 'DeleteCostLink')])[1]")));
		CommonFunctions.pause(5000, false);
		// CommonFunctions.switchFrameByXPath("//*[contains(text(), 'Are you sure you want to delete cost records for')]");
		CommonFunctions.switchFrameByXPath("//*[text() = 'Price exists that overlaps other cost records. Are you sure you want to delete the selected cost record(s) followed by adjusting the price dates manually?']");
	}
	
	@When("^user cancels the deletion of the contract cost category$")
	public void user_cancels_the_deletion_of_the_contract_cost_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'Cancel']")));
	}
	
	@Then("^user sees the contract cost category is not deleted$")
	public void user_sees_the_contract_cost_category_is_not_deleted() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Harbour View Room']//following-sibling::span[text() = 'BB']")));
	}
	
	@When("^user confirms the deletion of the contract cost category$")
	public void user_confirms_the_deletion_of_the_contract_cost_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'OK']")));
	}
	
	@Then("^user sees the contract cost category is deleted$")
	public void user_sees_the_contract_cost_category_is_deleted() throws Throwable {
		CommonFunctions.pause(15000, false);
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractCostWeblockContainer')]//div[@class = 'WebBlockMainContainer'])[1]//*[text() = 'Harbour View Room']//following-sibling::span[text() = 'BB']");
	}
	
	@When("^user cancels the deletion of the costs$")
	public void user_cancels_the_deletion_of_the_costs() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'Cancel']")));
	}
	
	@Then("^user sees the costs are not deleted$")
	public void user_sees_the_costs_are_not_deleted() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractCostContainer')]//div[contains(@id, 'RoomAndMealPlanContainer')]")));
	}
	
	@When("^user confirms the deletion of costs of the contract$")
	public void user_confirms_the_deletion_of_costs_of_the_contract() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'OK']")));
	}
	
	@Then("^user sees the costs of the contract are deleted$")
	public void user_sees_the_costs_of_the_contract_are_deleted() throws Throwable {
		CommonFunctions.pause(15000, false);
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'ContractCostContainer')]//div[contains(@id, 'RoomAndMealPlanContainer')]");
	}
	
	@When("^user decides to delete all prices of the contract$")
	public void user_decides_to_delete_all_prices_of_the_contract() throws Throwable {
		contractDetailsPage.clickContractPricesSectionDeleteAllPricesButton();
	}
	
	@When("^user decides to delete a row of prices$")
	public void user_decides_to_delete_a_row_of_prices() throws Throwable {
		contractDetailsPage.setContractPricesSectionTopDatesFilterInput("01 Jan 2018 - 31 Dec 2018");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@class = 'deleteRowDiv']//span)[1]")));
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user sees the row of prices is not deleted$")
	public void user_sees_the_row_of_prices_is_not_deleted() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[contains(@id, 'AccordionExpandableArea')])[1]//div[@ref = 'eCenterViewport']//div[@role = 'row']//*[text() = '01 Jan 2018 - 31 Dec 2018']")));
	}
	
	@Then("^user sees the row of prices is deleted$")
	public void user_sees_the_row_of_prices_is_deleted() throws Throwable {
		CommonFunctions.pause(15000, false);
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//div[contains(@id, 'AccordionExpandableArea')])[1]//div[@ref = 'eCenterViewport']//div[@role = 'row']//*[text() = '01 Jan 2018 - 31 Dec 2018']");
	}
	
	@When("^user deletes the contract price$")
	public void user_deletes_the_contract_price() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(((//div[contains(@id, 'MainContractPriceContainer')]//div[@class = 'WebBlockMainContainer'])[1]//div[@ref = 'eBodyViewport']//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]//div[@col-id = 'MaximumCommission']//following-sibling::div[@role = 'gridcell'])[1]//span[@title = 'Delete Price']")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this price record?']");
	}
	
	@When("^user cancels the deletion of the contract price$")
	public void user_cancels_the_deletion_of_the_contract_price() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'Cancel']")));
	}
	
	@Then("^user sees the contract price is not deleted$")
	public void user_sees_the_contract_price_is_not_deleted() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(((//div[contains(@id, 'MainContractPriceContainer')]//div[@class = 'WebBlockMainContainer'])[1]//div[@ref = 'eBodyViewport']//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]//div[@col-id = 'MaximumCommission']//following-sibling::div[@role = 'gridcell'])[1]//*[text() = '0.00']")));
	}
	
	@When("^user confirms the deletion of the contract price$")
	public void user_confirms_the_deletion_of_the_contract_price() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'OK']")));
	}
	
	@Then("^user sees the contract price is deleted$")
	public void user_sees_the_contract_price_is_deleted() throws Throwable {
		CommonFunctions.pause(15000, false);
		CommonFunctions.elementNotExistingByXPath("(((//div[contains(@id, 'MainContractPriceContainer')]//div[@class = 'WebBlockMainContainer'])[1]//div[@ref = 'eBodyViewport']//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]//div[@col-id = 'MaximumCommission']//following-sibling::div[@role = 'gridcell'])[1]//*[text() = '0.00']");
	}
	
	@When("^user decides to delete a guest configuration of the price category$")
	public void user_decides_to_delete_a_guest_configuration_of_the_price_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//i[@title = 'Delete'])[1]")));
		CommonFunctions.pause(15000, false);
	}
	
	@When("^user cancels the deletion of the guest configuration of the price category$")
	public void user_cancels_the_deletion_of_the_guest_configuration_of_the_price_category() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[contains(text(), 'Do you wish to remove the Twin guest configuration?')]");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//form[contains(@action, 'Popup')]//div[@class = 'DefaultClose']//a")));
		CommonFunctions.pause(15000, false);
	}
	
	@Then("^user sees the guest configuration of the price category is not deleted$")
	public void user_sees_the_guest_configuration_of_the_price_category_is_not_deleted() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[1]//div[@class = 'customHeaderLabel' and text() = 'Twin']")));
	}
	
	@When("^user chooses to delete the guest configuration for the price category only$")
	public void user_chooses_to_delete_the_guest_configuration_for_the_price_category_only() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[contains(text(), 'Do you wish to remove the Twin guest configuration?')]");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'This Category Only']")));
	}
	
	@Then("^user sees the guest configuration for the price category is deleted$")
	public void user_sees_the_guest_configuration_for_the_price_category_is_deleted() throws Throwable {
		CommonFunctions.pause(15000, false);
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')])[1]//div[@class = 'customHeaderLabel' and text() = 'Twin']");
	}
	
	@When("^user chooses to delete the guest configuration for all price categories$")
	public void user_chooses_to_delete_the_guest_configuration_for_all_price_categories() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[contains(text(), 'Do you wish to remove the Double guest configuration?')]");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'All Categories']")));
	}
	
	@Then("^user sees the guest configuration for all price categories is deleted$")
	public void user_sees_the_guest_configuration_for_all_price_categories_is_deleted() throws Throwable {
		CommonFunctions.pause(15000, false);
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eHeaderViewport']//div[contains(@class, 'row')]//div[@class = 'customHeaderLabel' and text() = 'Double']");
	}
	
	@When("^user decides to delete a contract price category$")
	public void user_decides_to_delete_a_contract_price_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//a[contains(@id, 'DeletePriceLink')])[1]")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[contains(text(), 'Are you sure you want to delete price records for')]");
	}
	
	@When("^user cancels the deletion of the contract price category$")
	public void user_cancels_the_deletion_of_the_contract_price_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'Cancel']")));
	}
	
	@Then("^user sees the contract price category is not deleted$")
	public void user_sees_the_contract_price_category_is_not_deleted() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//*[text() = 'Category VC']")));
	}
	
	@When("^user confirms the deletion of the contract price category$")
	public void user_confirms_the_deletion_of_the_contract_price_category() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'OK']")));
	}
	
	@Then("^user sees the contract price category is deleted$")
	public void user_sees_the_contract_price_category_is_deleted() throws Throwable {
		CommonFunctions.pause(15000, false);
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'ContractPriceContainer')]//*[text() = 'Category VC']");
	}
	
	@When("^user cancels the deletion of the prices$")
	public void user_cancels_the_deletion_of_the_prices() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'Cancel']")));
	}
	
	@Then("^user sees the prices are not deleted$")
	public void user_sees_the_prices_are_not_deleted() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[contains(@id, 'Title')]//span[@class = 'RoomType']")));
	}
	
	@When("^user confirms the deletion of prices of the contract$")
	public void user_confirms_the_deletion_of_prices_of_the_contract() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value = 'OK']")));
	}
	
	@Then("^user sees the prices of the contract are deleted$")
	public void user_sees_the_prices_of_the_contract_are_deleted() throws Throwable {
		CommonFunctions.pause(15000, false);
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'ContractPriceContainer')]//div[contains(@id, 'Title')]//span[@class = 'RoomType']");
	}
	
	@Then("^user sees the delete all prices button disabled$")
	public void user_sees_the_delete_all_prices_button_disabled() throws Throwable {
		contractDetailsPage.disabledContractPricesSectionDeleteAllPricesButton();
	}
	
	@When("^user decides to delete a specific row of costs$")
	public void user_decides_to_delete_a_specific_row_of_costs() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@class = 'deleteRowDiv']//span)[1]")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the dates 01 May 2020 - 31 Dec 2050 across all Guest Configurations?']");
	}
	
	@Then("^user sees the confirmation message for the deletion of the specific row of costs$")
	public void user_sees_the_confirmation_message_for_the_deletion_of_the_specific_row_of_costs() throws Throwable {
		CommonFunctions.textVisibleInPage("Are you sure you want to delete the dates 01 May 2020 - 31 Dec 2050 across all Guest Configurations?");
	}
	
	@When("^user clicks on the start date field in the create bulk costs popup$")
	public void user_clicks_on_the_start_date_field_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")));
	}
	
	@Then("^user sees the calendar popup$")
	public void user_sees_the_calendar_popup() throws Throwable {
		CommonFunctions.elementDisplayed(CommonFunctions.getLastElementInListByXPath("//div[contains(@class, 'calendar')]"));
	}
	
	@When("^user clicks on the end date field in the create bulk costs popup$")
	public void user_clicks_on_the_end_date_field_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")));
	}
	
	@When("^user provides dates in unsupported formats in the start and end date fields in the create bulk costs popup$")
	public void user_provides_dates_in_unsupported_formats_in_the_start_and_end_date_fields_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")), "ABC");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")), "ABC");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user empties the start and end date fields in the create bulk costs popup$")
	public void user_empties_the_start_and_end_date_fields_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")), "");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")), "");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user provides a date range where the start date is greater than the end date in the create bulk costs popup date fields$")
	public void user_provides_a_date_range_where_the_start_date_is_greater_than_the_end_date_in_the_create_bulk_costs_popup_date_fields() throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")), "01 Dec 2020");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")), "01 Nov 2020");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user provides a date range where the date range is not within the date range of the contract$")
	public void user_provides_a_date_range_where_the_date_range_is_not_within_the_date_range_of_the_contract() throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")), "01 Sep 2001");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")), "31 Dec 2050");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user provides a valid date range in the create bulk costs popup$")
	public void user_provides_a_valid_date_range_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")), "01 Sep 2004");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")), "31 Dec 2049");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the import dates from price popup fields and buttons$")
	public void user_sees_the_import_dates_from_price_popup_fields_and_buttons() throws Throwable {
		contractDetailsPage.displayedImportDatesFromPricePopupRespectiveGuestConfigurationsRadioButton();
		contractDetailsPage.displayedImportDatesFromPricePopupTwinGuestConfigurationRadioButton();
		contractDetailsPage.displayedImportDatesFromPricePopupIncludePastDatesCheckbox();
		contractDetailsPage.displayedImportDatesFromPricePopupCostConfigurationDropdown();
		contractDetailsPage.displayedImportDatesFromPricePopupCurrencyDropdown();
		contractDetailsPage.displayedImportDatesFromPricePopupPriceInput();
		contractDetailsPage.displayedImportDatesFromPricePopupNonCommissionInput();
		contractDetailsPage.displayedImportDatesFromPricePopupMinimumCommissionInput();
		contractDetailsPage.displayedImportDatesFromPricePopupMaximumCommissionInput();
		contractDetailsPage.displayedImportDatesFromPricePopupCancelButton();
		contractDetailsPage.displayedImportDatesFromPricePopupImportDatesButton();
	}
	
	@When("^user searches for a specific cost configuration for the import dates from price$")
	public void user_searches_for_a_specific_cost_configuration_for_the_import_dates_from_price() throws Throwable {
		contractDetailsPage.clickImportDatesFromPricePopupCostConfigurationDropdown();
		contractDetailsPage.setImportDatesFromPricePopupGuestConfigurationFilterInput("Double");
	}
	
	@Then("^user sees the specific cost configuration for the import dates from price$")
	public void user_sees_the_specific_cost_configuration_for_the_import_dates_from_price() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'GuestConfigContainer')]//tbody//tr//td//div[text() = 'Double'])[1]")));
		user_hits_the_escape_key();
	}
	
	@Then("^user sees the twin guest configuration radio button is not toggled in the import dates from price popup$")
	public void user_sees_the_twin_guest_configuration_radio_button_is_not_toggled_in_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.checkImportDatesFromPricePopupTwinGuestConfigurationRadioButtonIsNotToggled();
	}
	
	@When("^user selects few currencies for the import dates from price$")
	public void user_selects_few_currencies_for_the_import_dates_from_price() throws Throwable {
		contractDetailsPage.clickImportDatesFromPricePopupCurrencyDropdownOption("NZD");
		contractDetailsPage.clickImportDatesFromPricePopupCurrencyDropdownOption("EUR");
	}
	
	@Then("^user sees the selected currencies displayed in the import dates from price popup$")
	public void user_sees_the_selected_currencies_displayed_in_the_import_dates_from_price_popup() throws Throwable {
		contractDetailsPage.containsValueImportDatesFromPricePopupCurrencyDropdown("NZD, AUD, EUR");
	}
	
	@When("^user provides information for the import dates from price but leaves some fields empty$")
	public void user_provides_information_for_the_import_dates_from_price_but_leaves_some_fields_empty() throws Throwable {
		contractDetailsPage.setImportDatesFromPricePopupPriceInput("");
	}
	
	@When("^user provides valid information for the import dates from price$")
	public void user_provides_valid_information_for_the_import_dates_from_price() throws Throwable {
		contractDetailsPage.setImportDatesFromPricePopupPriceInput("456");
		contractDetailsPage.setImportDatesFromPricePopupNonCommissionInput("123");
	}
	
	@When("^user decides to import the dates from price$")
	public void user_decides_to_import_the_dates_from_price() throws Throwable {
		contractDetailsPage.clickImportDatesFromPricePopupImportDatesButton();
	}
	
	@Then("^user does not see the import dates from price popup$")
	public void user_does_not_see_the_import_dates_from_price_popup() throws Throwable {
		CommonFunctions.textHiddenInPage("Import Dates");
	}
	
	@Then("^user sees costs table in the create bulk costs popup empty$")
	public void user_sees_costs_table_in_the_create_bulk_costs_popup_empty() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//table[contains(@id, 'ContractCost')]");
	}
	
	@Then("^user sees the triple field inside the adult column in the costs table in the create bulk costs popup$")
	public void user_sees_the_triple_field_inside_the_adult_column_in_the_costs_table_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'ContractCost')]//td[text() = 'Triple']//following-sibling::td//input[@value = '0.00']")));
	}
	
	@Then("^user sees the twin, and single fields inside the adult column in the costs table in the create bulk costs popup$")
	public void user_sees_the_twin_and_single_fields_inside_the_adult_column_in_the_costs_table_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'ContractCost')]//td[text() = 'Twin']//following-sibling::td//input[@value = '0.00']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'ContractCost')]//td[text() = 'Single']//following-sibling::td//input[@value = '0.00']")));
	}
	
	@Then("^user sees the triple, and quad fields inside the adult, and child columns in the costs table in the create bulk costs popup$")
	public void user_sees_the_triple_and_quad_fields_inside_the_adult_and_child_columns_in_the_costs_table_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Triple']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Triple']//following-sibling::td//input[@value = '0.00'])[2]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Quad']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Quad']//following-sibling::td//input[@value = '0.00'])[2]")));
	}
	
	@Then("^user sees the triple, and quad fields in both the pensioner and senior columns while the child field inside the pensioner column only in the costs table in the create bulk costs popup$")
	public void user_sees_the_triple_and_quad_fields_in_both_the_pensioner_and_senior_columns_while_the_child_field_inside_the_pensioner_column_only_in_the_costs_table_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Triple']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Triple']//following-sibling::td//input[@value = '0.00'])[2]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Quad']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Quad']//following-sibling::td//input[@value = '0.00'])[2]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Child']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementNotExistingByXPath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Child']//following-sibling::td//input[@value = '0.00'])[2]");
	}
	
	@Then("^user sees the twin, and single fields inside the adult, and child columns in the costs table in the create bulk costs popup$")
	public void user_sees_the_twin_and_single_fields_inside_the_adult_and_child_columns_in_the_costs_table_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Twin']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Twin']//following-sibling::td//input[@value = '0.00'])[2]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Single']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Single']//following-sibling::td//input[@value = '0.00'])[2]")));
	}
	
	@Then("^user sees the twin, and single fields in both the pensioner and senior columns while the child field inside the pensioner column only in the costs table in the create bulk costs popup$")
	public void user_sees_the_twin_and_single_fields_in_both_the_pensioner_and_senior_columns_while_the_child_field_inside_the_pensioner_column_only_in_the_costs_table_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Twin']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Twin']//following-sibling::td//input[@value = '0.00'])[2]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Single']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Single']//following-sibling::td//input[@value = '0.00'])[2]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Child']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementNotExistingByXPath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Child']//following-sibling::td//input[@value = '0.00'])[2]");
	}
	
	@Then("^user sees the extra person, breakfast, lunch and dinner fields in both the adult and child columns while the room only twin, and room only single fields inside the adult column only in the costs table in the create bulk costs popup$")
	public void user_sees_the_extra_person_breakfast_lunch_and_dinner_fields_in_both_the_adult_and_child_columns_while_the_room_only_twin_and_room_only_single_fields_inside_the_adult_column_only_in_the_costs_table_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Extra Person']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Extra Person']//following-sibling::td//input[@value = '0.00'])[2]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Breakfast']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Breakfast']//following-sibling::td//input[@value = '0.00'])[2]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Lunch']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Lunch']//following-sibling::td//input[@value = '0.00'])[2]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Dinner']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Dinner']//following-sibling::td//input[@value = '0.00'])[2]")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Room Only Twin']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementNotExistingByXPath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Room Only Twin']//following-sibling::td//input[@value = '0.00'])[2]");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Room Only Single']//following-sibling::td//input[@value = '0.00'])[1]")));
		CommonFunctions.elementNotExistingByXPath("(//table[contains(@id, 'ContractCost')]//td[text() = 'Room Only Single']//following-sibling::td//input[@value = '0.00'])[2]");
	}
	
	@Then("^user sees the room only twin, room only single, and breakfast fields inside the adult column in the costs table in the create bulk costs popup$")
	public void user_sees_the_room_only_twin_room_only_single_and_breakfast_fields_inside_the_adult_column_in_the_costs_table_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'ContractCost')]//td[text() = 'Room Only Twin']//following-sibling::td//input[@value = '0.00']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'ContractCost')]//td[text() = 'Room Only Single']//following-sibling::td//input[@value = '0.00']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'ContractCost')]//td[text() = 'Breakfast']//following-sibling::td//input[@value = '0.00']")));
	}
	
	@Then("^user sees the room only twin, room only single, breakfast, and dinner fields inside the adult column in the costs table in the create bulk costs popup$")
	public void user_sees_the_room_only_twin_room_only_single_breakfast_and_dinner_fields_inside_the_adult_column_in_the_costs_table_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'ContractCost')]//td[text() = 'Room Only Twin']//following-sibling::td//input[@value = '0.00']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'ContractCost')]//td[text() = 'Room Only Single']//following-sibling::td//input[@value = '0.00']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'ContractCost')]//td[text() = 'Breakfast']//following-sibling::td//input[@value = '0.00']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'ContractCost')]//td[text() = 'Dinner']//following-sibling::td//input[@value = '0.00']")));
	}
	
	@Then("^user does not see the create bulk costs popup$")
	public void user_does_not_see_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.textHiddenInPage("Create Bulk Costs");
	}
	
	@When("^user clicks on a certain maximum commission cell in the contract prices table$")
	public void user_clicks_on_a_certain_maximum_commission_cell_in_the_contract_prices_table() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//td//span")));
	}
	
	@Then("^user sees the save and cancel icons beside the contract price maximum commission data$")
	public void user_sees_the_save_and_cancel_icons_beside_the_contract_price_maximum_commission_data() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Save Price']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Cancel']")));
	}
	
	@When("^user clicks outside the contract price maximum commission data$")
	public void user_clicks_outside_the_contract_price_maximum_commission_data() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@Then("^user does not see the save and cancel icons beside the contract price maximum commission data$")
	public void user_does_not_see_the_save_and_cancel_icons_beside_the_contract_price_maximum_commission_data() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Save Price']//parent::div/parent::div")), "class", "hide");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Cancel']//parent::div/parent::div")), "class", "hide");
	}
	
	@When("^user provides \"([^\"]*)\" as the contract price maximum commission$")
	public void user_provides_as_the_contract_price_maximum_commission(String arg1) throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//input[@class = 'costInput'])[1]")), arg1);
	}
	
	@When("^user saves the contract price maximum commission$")
	public void user_saves_the_contract_price_maximum_commission() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'Save Price']")));
		CommonFunctions.pause(7500, false);
	}
	
	@Then("^user sees the contract price maximum commission cannot be saved$")
	public void user_sees_the_contract_price_maximum_commission_cannot_be_saved() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[contains(@class, 'Not_Valid')]")));
	}
	
	@Then("^user sees the contract price maximum commission is changed to \"([^\"]*)\"$")
	public void user_sees_the_contract_price_maximum_commission_is_changed_to(String arg1) throws Throwable {
		// CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv'])[1]//div[@class =
		// 'AGGridLeftDiv']//span[text() = '" + arg1 + "']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eCenterContainer'])[1]//div[@row-index = '0']//div[@col-id = 'MaximumCommission']//table//span[text()='" + arg1 + "']")));
	}
	
	@When("^user hovers over a certain maximum commission cell that is not empty in the contract prices table$")
	public void user_hovers_over_a_certain_maximum_commission_cell_that_is_not_empty_in_the_contract_prices_table() throws Throwable {
		CommonFunctions.hoverElement(driver.findElement(By.xpath("((//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport'])[1]//div[contains(@col-id, 'MaximumCommission')])[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user opens the payment cancellation rules tab$")
	public void user_opens_the_payment_cancellation_rules_tab() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionCancellationTabLabel();
	}
	
	@When("^user opens the add payment cancellation rule popup$")
	public void user_opens_the_add_payment_cancellation_rule_popup() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionAddCancellationRuleButton();
	}
	
	@Then("^user sees the add payment cancellation rule popup fields$")
	public void user_sees_the_add_payment_cancellation_rule_popup_fields() throws Throwable {
		contractDetailsPage.containsValuePaymentCancellationRulePopupCustomerMarketDropdown("All");
		contractDetailsPage.containsValuePaymentCancellationRulePopupCustomerTypeDropdown("All");
		contractDetailsPage.containsValuePaymentCancellationRulePopupCurrencyDropdown("All");
		contractDetailsPage.displayedPaymentCancellationRulePopupBookingStartDateInput();
		contractDetailsPage.containsValuePaymentCancellationRulePopupBookingEndDateInput("31 Dec 2050");
		contractDetailsPage.displayedPaymentCancellationRulePopupDepartureStartDateInput();
		contractDetailsPage.containsValuePaymentCancellationRulePopupDepartureEndDateInput("31 Dec 2050");
		contractDetailsPage.containsValuePaymentCancellationRulePopupMinimumDaysInput("0");
		contractDetailsPage.containsValuePaymentCancellationRulePopupMaximumDaysInput("0");
		contractDetailsPage.containsValuePaymentCancellationRulePopupItemTypeDropdown("Per Person");
		contractDetailsPage.containsValuePaymentCancellationRulePopupActionDropdown("Amount");
		CommonFunctions.textVisibleInPage("$");
		contractDetailsPage.containsValuePaymentCancellationRulePopupAmountPercentageInput("0");
		contractDetailsPage.displayedPaymentCancellationRulePopupCancelButton();
		contractDetailsPage.displayedPaymentCancellationRulePopupAddRuleButton();
	}
	
	@When("^user selects \"([^\"]*)\" as the customer market value for the cancellation rule$")
	public void user_selects_as_the_customer_market_value_for_the_cancellation_rule(String arg1) throws Throwable {
		contractDetailsPage.selectPaymentCancellationRulePopupCustomerMarketValue(arg1);
	}
	
	@When("^user selects \"([^\"]*)\" as the customer type value for the cancellation rule$")
	public void user_selects_as_the_customer_type_value_for_the_cancellation_rule(String arg1) throws Throwable {
		contractDetailsPage.selectPaymentCancellationRulePopupCustomerTypeValue(arg1);
	}
	
	@Then("^user sees \"([^\"]*)\" as the customer market value for the cancellation rule$")
	public void user_sees_as_the_customer_market_value_for_the_cancellation_rule(String arg1) throws Throwable {
		contractDetailsPage.containsValuePaymentCancellationRulePopupCustomerMarketDropdown(arg1);
	}
	
	@Then("^user sees \"([^\"]*)\" as the customer type value for the cancellation rule$")
	public void user_sees_as_the_customer_type_value_for_the_cancellation_rule(String arg1) throws Throwable {
		contractDetailsPage.containsValuePaymentCancellationRulePopupCustomerTypeDropdown(arg1);
	}
	
	@When("^user selects \"([^\"]*)\" as the action for the cancellation rule$")
	public void user_selects_as_the_action_for_the_cancellation_rule(String arg1) throws Throwable {
		contractDetailsPage.selectPaymentCancellationRulePopupActionValue(arg1);
	}
	
	@Then("^user sees the percentage field$")
	public void user_sees_the_percentage_field() throws Throwable {
		CommonFunctions.textVisibleInPage("%");
	}
	
	@Then("^user sees the amount field$")
	public void user_sees_the_amount_field() throws Throwable {
		CommonFunctions.textVisibleInPage("$");
	}
	
	@When("^user puts \"([^\"]*)\" into minimum days field in the payment cancellation rule popup$")
	public void user_puts_into_minimum_days_field_in_the_payment_cancellation_rule_popup(String arg1) throws Throwable {
		contractDetailsPage.setPaymentCancellationRulePopupMinimumDaysInput(arg1);
	}
	
	@Then("^user sees that the minimum days field does not accept alphabets, special characters, negative numbers, and decimals in the payment cancellation rule popup$")
	public void user_sees_that_the_minimum_days_field_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals_in_the_payment_cancellation_rule_popup() throws Throwable {
		contractDetailsPage.containsValuePaymentCancellationRulePopupMinimumDaysInput("");
	}
	
	@When("^user puts \"([^\"]*)\" into maximum days field in the payment cancellation rule popup$")
	public void user_puts_into_maximum_days_field_in_the_payment_cancellation_rule_popup(String arg1) throws Throwable {
		contractDetailsPage.setPaymentCancellationRulePopupMaximumDaysInput(arg1);
	}
	
	@Then("^user sees that the maximum days field does not accept alphabets, special characters, negative numbers, and decimals in the payment cancellation rule popup$")
	public void user_sees_that_the_maximum_days_field_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals_in_the_payment_cancellation_rule_popup() throws Throwable {
		contractDetailsPage.containsValuePaymentCancellationRulePopupMaximumDaysInput("");
	}
	
	@When("^user opens the payment deposit rules tab$")
	public void user_opens_the_payment_deposit_rules_tab() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionDepositTabLabel();
	}
	
	@When("^user opens the add payment deposit rule popup$")
	public void user_opens_the_add_payment_deposit_rule_popup() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionAddDepositRuleButton();
	}
	
	@Then("^user sees the add payment deposit rule popup fields$")
	public void user_sees_the_add_payment_deposit_rule_popup_fields() throws Throwable {
		contractDetailsPage.containsValuePaymentDepositRulePopupCustomerMarketDropdown("All");
		contractDetailsPage.containsValuePaymentDepositRulePopupCustomerTypeDropdown("All");
		contractDetailsPage.containsValuePaymentDepositRulePopupCurrencyDropdown("All");
		contractDetailsPage.displayedPaymentDepositRulePopupBookingStartDateInput();
		contractDetailsPage.containsValuePaymentDepositRulePopupBookingEndDateInput("31 Dec 2050");
		contractDetailsPage.displayedPaymentDepositRulePopupDepartureStartDateInput();
		contractDetailsPage.containsValuePaymentDepositRulePopupDepartureEndDateInput("31 Dec 2050");
		contractDetailsPage.containsValuePaymentDepositRulePopupMinimumDaysInput("0");
		contractDetailsPage.containsValuePaymentDepositRulePopupMaximumDaysInput("0");
		contractDetailsPage.disabledPaymentDepositRulePopupMaximumDaysInput();
		contractDetailsPage.containsValuePaymentDepositRulePopupItemTypeDropdown("Per Person");
		contractDetailsPage.containsValuePaymentDepositRulePopupActionDropdown("Amount");
		CommonFunctions.textVisibleInPage("$");
		contractDetailsPage.containsValuePaymentDepositRulePopupAmountPercentageInput("0");
		contractDetailsPage.displayedPaymentDepositRulePopupCancelButton();
		contractDetailsPage.displayedPaymentDepositRulePopupAddRuleButton();
	}
	
	@When("^user puts \"([^\"]*)\" into minimum days field in the payment deposit rule popup$")
	public void user_puts_into_minimum_days_field_in_the_payment_deposit_rule_popup(String arg1) throws Throwable {
		contractDetailsPage.setPaymentDepositRulePopupMinimumDaysInput(arg1);
	}
	
	@Then("^user sees that the minimum days field does not accept alphabets, special characters, negative numbers, and decimals in the payment deposit rule popup$")
	public void user_sees_that_the_minimum_days_field_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals_in_the_payment_deposit_rule_popup() throws Throwable {
		contractDetailsPage.containsValuePaymentDepositRulePopupMinimumDaysInput("");
	}
	
	@When("^user selects \"([^\"]*)\" as the customer market value for the deposit rule$")
	public void user_selects_as_the_customer_market_value_for_the_deposit_rule(String arg1) throws Throwable {
		contractDetailsPage.selectPaymentDepositRulePopupCustomerMarketValue(arg1);
	}
	
	@When("^user selects \"([^\"]*)\" as the customer type value for the deposit rule$")
	public void user_selects_as_the_customer_type_value_for_the_deposit_rule(String arg1) throws Throwable {
		contractDetailsPage.selectPaymentDepositRulePopupCustomerTypeValue(arg1);
	}
	
	@Then("^user sees \"([^\"]*)\" as the customer market value for the deposit rule$")
	public void user_sees_as_the_customer_market_value_for_the_deposit_rule(String arg1) throws Throwable {
		contractDetailsPage.containsValuePaymentDepositRulePopupCustomerMarketDropdown(arg1);
	}
	
	@Then("^user sees \"([^\"]*)\" as the customer type value for the deposit rule$")
	public void user_sees_as_the_customer_type_value_for_the_deposit_rule(String arg1) throws Throwable {
		contractDetailsPage.containsValuePaymentDepositRulePopupCustomerTypeDropdown(arg1);
	}
	
	@When("^user selects \"([^\"]*)\" as the action for the deposit rule$")
	public void user_selects_as_the_action_for_the_deposit_rule(String arg1) throws Throwable {
		contractDetailsPage.selectPaymentDepositRulePopupActionValue(arg1);
	}
	
	@When("^user opens the add itinerary template popup$")
	public void user_opens_the_add_itinerary_template_popup() throws Throwable {
		contractDetailsPage.clickItirenaryTemplatesSectionAddItirenaryTemplateButton();
	}
	
	@When("^user puts \"([^\"]*)\" as the day for the itinerary template$")
	public void user_puts_as_the_day_for_the_itinerary_template(String arg1) throws Throwable {
		contractDetailsPage.setItirenaryTemplatePopupDayInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the time for the itinerary template$")
	public void user_puts_as_the_time_for_the_itinerary_template(String arg1) throws Throwable {
		contractDetailsPage.setItirenaryTemplatePopupTimeInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the start date for the itinerary template$")
	public void user_puts_as_the_start_date_for_the_itinerary_template(String arg1) throws Throwable {
		contractDetailsPage.setItirenaryTemplatePopupStartDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the end date for the itinerary template$")
	public void user_puts_as_the_end_date_for_the_itinerary_template(String arg1) throws Throwable {
		contractDetailsPage.setItirenaryTemplatePopupEndDateInput(arg1);
	}
	
	@When("^user cancels the addition of the new cancellation rule$")
	public void user_cancels_the_addition_of_the_new_cancellation_rule() throws Throwable {
		contractDetailsPage.clickPaymentCancellationRulePopupCancelButton();
	}
	
	@Then("^user sees the add payment cancellation rule popup$")
	public void user_sees_the_add_payment_cancellation_rule_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Add Cancellation Rule");
	}
	
	@Then("^user does not see the add payment cancellation rule popup$")
	public void user_does_not_see_the_add_payment_cancellation_rule_popup() throws Throwable {
		CommonFunctions.textHiddenInPage("Add Cancellation Rule");
	}
	
	@When("^user cancels the addition of the new deposit rule$")
	public void user_cancels_the_addition_of_the_new_deposit_rule() throws Throwable {
		contractDetailsPage.clickPaymentDepositRulePopupCancelButton();
	}
	
	@Then("^user sees the add payment deposit rule popup$")
	public void user_sees_the_add_payment_deposit_rule_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Add Deposit Rule");
	}
	
	@Then("^user does not see the add payment deposit rule popup$")
	public void user_does_not_see_the_add_payment_deposit_rule_popup() throws Throwable {
		CommonFunctions.textHiddenInPage("Add Deposit Rule");
	}
	
	@When("^user provides valid information on all the fields of create bulk costs popup$")
	public void user_provides_valid_information_on_all_the_fields_of_create_bulk_costs_popup() throws Throwable {
		contractDetailsPage.selectCreateBulkCostsPopupRoomTypeValue("3 Star Room");
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")), "01 Sep 2004");
		user_removes_the_focus_on_the_field();
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")), "31 Dec 2049");
		user_removes_the_focus_on_the_field();
		contractDetailsPage.clickCreateBulkCostsPopupAddDateButton();
	}
	
	@When("^user decides to create the costs$")
	public void user_decides_to_create_the_costs() throws Throwable {
		contractDetailsPage.clickCreateBulkCostsPopupCreateCostsButton();
	}
	
	@When("^user selects \"([^\"]*)\" as the meal/pax configuration in the create bulk costs popup$")
	public void user_selects_as_the_meal_pax_configuration_in_the_create_bulk_costs_popup(String arg1) throws Throwable {
		contractDetailsPage.selectCreateBulkCostsPopupMealPaxConfigurationValue(arg1);
	}
	
	@Then("^user sees that the add date button is enabled in the create bulk costs popup$")
	public void user_sees_that_the_add_date_button_is_enabled_in_the_create_bulk_costs_popup() throws Throwable {
		contractDetailsPage.enabledCreateBulkCostsPopupAddDateButton();
	}
	
	@Then("^user sees that the add date button is disabled in the create bulk costs popup$")
	public void user_sees_that_the_add_date_button_is_disabled_in_the_create_bulk_costs_popup() throws Throwable {
		contractDetailsPage.disabledCreateBulkCostsPopupAddDateButton();
	}
	
	@Then("^user sees the date range fields and add date range button disabled in the create bulk costs popup$")
	public void user_sees_the_date_range_fields_and_add_date_range_button_disabled_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")), "readonly", "true");
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")), "readonly", "true");
		contractDetailsPage.disabledCreateBulkCostsPopupAddDateButton();
	}
	
	@Then("^user sees the create bulk costs popup fields and its default values$")
	public void user_sees_the_create_bulk_costs_popup_fields_and_its_default_values() throws Throwable {
		contractDetailsPage.enabledCreateBulkCostsPopupRoomTypeDropdown();
		contractDetailsPage.containsValueCreateBulkCostsPopupRoomTypeDropdown("Select");
		contractDetailsPage.disabledCreateBulkCostsPopupMealPaxConfigurationDropdown();
		contractDetailsPage.containsValueCreateBulkCostsPopupMealPaxConfigurationDropdown("Select");
		contractDetailsPage.disabledCreateBulkCostsPopupMealPlansDropdown();
		contractDetailsPage.containsValueCreateBulkCostsPopupMealPlansDropdown("Select");
		CommonFunctions.elementEnabled(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")));
		CommonFunctions.elementEnabled(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")));
		contractDetailsPage.disabledCreateBulkCostsPopupAddDateButton();
	}
	
	@When("^user selects \"([^\"]*)\" as the room type in the create bulk costs popup$")
	public void user_selects_as_the_room_type_in_the_create_bulk_costs_popup(String arg1) throws Throwable {
		contractDetailsPage.selectCreateBulkCostsPopupRoomTypeValue(arg1);
	}
	
	@Then("^user sees the meal / pax configuration and meal plans fields are enabled$")
	public void user_sees_the_meal_pax_configuration_and_meal_plans_fields_are_enabled() throws Throwable {
		contractDetailsPage.enabledCreateBulkCostsPopupMealPaxConfigurationDropdown();
		contractDetailsPage.containsValueCreateBulkCostsPopupMealPaxConfigurationDropdown("1. APT Pre/Post");
		contractDetailsPage.enabledCreateBulkCostsPopupMealPlansDropdown();
		contractDetailsPage.containsValueCreateBulkCostsPopupMealPlansDropdown("All Selected");
	}
	
	@Then("^user sees the meal / pax configuration and meal plans fields are disabled$")
	public void user_sees_the_meal_pax_configuration_and_meal_plans_fields_are_disabled() throws Throwable {
		contractDetailsPage.disabledCreateBulkCostsPopupMealPaxConfigurationDropdown();
		contractDetailsPage.containsValueCreateBulkCostsPopupMealPaxConfigurationDropdown("Select");
		contractDetailsPage.disabledCreateBulkCostsPopupMealPlansDropdown();
		contractDetailsPage.containsValueCreateBulkCostsPopupMealPlansDropdown("Select");
	}
	
	@When("^user enters 3 new date ranges in the create bulk costs popup$")
	public void user_enters_3_new_date_ranges_in_the_create_bulk_costs_popup() throws Throwable {
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")), "01 May 2020");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")), "02 May 2020");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		contractDetailsPage.clickCreateBulkCostsPopupAddDateButton();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")), "11 May 2020");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")), "12 May 2020");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		contractDetailsPage.clickCreateBulkCostsPopupAddDateButton();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'StartDateInput')])[1]")), "21 May 2020");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("(//input[contains(@id, 'EndDateInput')])[1]")), "22 May 2020");
		user_removes_the_focus_on_the_field();
		CommonFunctions.pause(2500, false);
		contractDetailsPage.clickCreateBulkCostsPopupAddDateButton();
		CommonFunctions.pause(2500, false);
	}
	
	@Then("^user sees the allotment code is \"([^\"]*)\" in the create bulk costs popup$")
	public void user_sees_the_allotment_code_is_in_the_create_bulk_costs_popup(String arg1) throws Throwable {
		contractDetailsPage.containsValueCreateBulkCostsPopupAllotmentCodeInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the allotment field in the create bulk costs popup$")
	public void user_puts_in_the_allotment_field_in_the_create_bulk_costs_popup(String arg1) throws Throwable {
		contractDetailsPage.setCreateBulkCostsPopupAllotmentCodeInput(arg1);
	}
	
	@Then("^user sees the create bulk costs popup fields and its default values for the contract type \"([^\"]*)\"$")
	public void user_sees_the_create_bulk_costs_popup_fields_and_its_default_values_for_the_contract_type(String arg1) throws Throwable {
		if (arg1.equals("Coach") || arg1.equals("Foreign Operator / Land") || arg1.equals("Miscellaneous") || arg1.equals("Transfer")) {
			contractDetailsPage.disabledCreateBulkCostsPopupRoomTypeDropdown();
			contractDetailsPage.containsValueCreateBulkCostsPopupRoomTypeDropdown("");
			contractDetailsPage.disabledCreateBulkCostsPopupMealPaxConfigurationDropdown();
			contractDetailsPage.containsValueCreateBulkCostsPopupMealPaxConfigurationDropdown("");
			contractDetailsPage.disabledCreateBulkCostsPopupMealPlansDropdown();
			contractDetailsPage.containsValueCreateBulkCostsPopupMealPlansDropdown("Select");
			contractDetailsPage.disabledCreateBulkCostsPopupTwinShareCheckbox();
			contractDetailsPage.checkCreateBulkCostsPopupTwinShareCheckboxIsNotToggled();
			contractDetailsPage.disabledCreateBulkCostsPopupQuadShareCheckbox();
			contractDetailsPage.checkCreateBulkCostsPopupQuadShareCheckboxIsNotToggled();
		}
		else if (arg1.equals("Cruise") || arg1.equals("Hotel") || arg1.equals("Rail")) {
			contractDetailsPage.enabledCreateBulkCostsPopupRoomTypeDropdown();
			contractDetailsPage.containsValueCreateBulkCostsPopupRoomTypeDropdown("Select");
			contractDetailsPage.disabledCreateBulkCostsPopupMealPaxConfigurationDropdown();
			contractDetailsPage.containsValueCreateBulkCostsPopupMealPaxConfigurationDropdown("Select");
			contractDetailsPage.disabledCreateBulkCostsPopupMealPlansDropdown();
			contractDetailsPage.containsValueCreateBulkCostsPopupMealPlansDropdown("Select");
			contractDetailsPage.enabledCreateBulkCostsPopupTwinShareCheckbox();
			contractDetailsPage.checkCreateBulkCostsPopupTwinShareCheckboxIsNotToggled();
			contractDetailsPage.enabledCreateBulkCostsPopupQuadShareCheckbox();
			contractDetailsPage.checkCreateBulkCostsPopupQuadShareCheckboxIsNotToggled();
		}
	}
	
	@When("^user closes the create bulk costs popup$")
	public void user_closes_the_create_bulk_costs_popup() throws Throwable {
		contractDetailsPage.clickCreateBulkCostsPopupCancelButton();
	}
	
	@When("^user toggles the hide past dates option for the contract prices$")
	public void user_toggles_the_hide_past_dates_option_for_the_contract_prices() throws Throwable {
		contractDetailsPage.clickContractPricesSectionHidePastDatesCheckbox();
	}
	
	@When("^user puts \"([^\"]*)\" as the booking start date for the cancellation rule$")
	public void user_puts_as_the_booking_start_date_for_the_cancellation_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentCancellationRulePopupBookingStartDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the booking end date for the cancellation rule$")
	public void user_puts_as_the_booking_end_date_for_the_cancellation_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentCancellationRulePopupBookingEndDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the departure start date for the cancellation rule$")
	public void user_puts_as_the_departure_start_date_for_the_cancellation_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentCancellationRulePopupDepartureStartDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the departure end date for the cancellation rule$")
	public void user_puts_as_the_departure_end_date_for_the_cancellation_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentCancellationRulePopupDepartureEndDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the percentage for the cancellation rule$")
	public void user_puts_as_the_percentage_for_the_cancellation_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentCancellationRulePopupAmountPercentageInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the booking start date for the deposit rule$")
	public void user_puts_as_the_booking_start_date_for_the_deposit_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentDepositRulePopupBookingStartDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the booking end date for the deposit rule$")
	public void user_puts_as_the_booking_end_date_for_the_deposit_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentDepositRulePopupBookingEndDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the departure start date for the deposit rule$")
	public void user_puts_as_the_departure_start_date_for_the_deposit_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentDepositRulePopupDepartureStartDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the departure end date for the deposit rule$")
	public void user_puts_as_the_departure_end_date_for_the_deposit_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentDepositRulePopupDepartureEndDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the percentage for the deposit rule$")
	public void user_puts_as_the_percentage_for_the_deposit_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentDepositRulePopupAmountPercentageInput(arg1);
	}
	
	@Then("^user sees hide past dates option disabled for the contract prices$")
	public void user_sees_hide_past_dates_option_disabled_for_the_contract_prices() throws Throwable {
		contractDetailsPage.disabledContractPricesSectionHidePastDatesCheckbox();
		contractDetailsPage.checkContractPricesSectionHidePastDatesCheckboxIsNotToggled();
	}
	
	@Then("^user sees hide past dates option enabled and toggled for the contract prices$")
	public void user_sees_hide_past_dates_option_enabled_and_toggled_for_the_contract_prices() throws Throwable {
		contractDetailsPage.enabledContractPricesSectionHidePastDatesCheckbox();
		contractDetailsPage.checkContractPricesSectionHidePastDatesCheckboxIsToggled();
	}
	
	@When("^user cancels the addition of itinerary template$")
	public void user_cancels_the_addition_of_itinerary_template() throws Throwable {
		contractDetailsPage.clickItirenaryTemplatePopupCancelButton();
	}
	
	@Then("^user does not see the add itinerary template popup$")
	public void user_does_not_see_the_add_itinerary_template_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'PopupTitle')]//span[contains(text(), 'Itinerary Template')]");
	}
	
	@When("^user saves the itinerary template$")
	public void user_saves_the_itinerary_template() throws Throwable {
		contractDetailsPage.clickItirenaryTemplatePopupSaveButton();
	}
	
	@When("^user disregards the cancellation of the new itinerary template$")
	public void user_disregards_the_cancellation_of_the_new_itinerary_template() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'You have not added this itinerary template to the contract yet. Are you sure you want to discard this itinerary template?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
		CommonFunctions.pause(1000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'PopupTitle')]//*[contains(text(), 'Itinerary Template')]");
	}
	
	@Then("^user sees the add itinerary template popup$")
	public void user_sees_the_add_itinerary_template_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'PopupTitle')]//span[contains(text(), 'Itinerary Template')]")));
	}
	
	@When("^user confirms the cancellation of the new itinerary template$")
	public void user_confirms_the_cancellation_of_the_new_itinerary_template() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'You have not added this itinerary template to the contract yet. Are you sure you want to discard this itinerary template?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user selects \"([^\"]*)\" as the itinerary template$")
	public void user_selects_as_the_itinerary_template(String arg1) throws Throwable {
		contractDetailsPage.selectItirenaryTemplatePopupItineraryTemplateValue(arg1);
	}
	
	@Then("^user sees the itinerary template description for \"([^\"]*)\"$")
	public void user_sees_the_itinerary_template_description(String arg1) throws Throwable {
		if (arg1 == "APTCLUB ADAPTOR") {
			CommonFunctions.textVisibleInPage("As a returning traveller you have selected an APT Club Adaptor included with your Documentation.");
		}
		else if (arg1 == "APTCLUB TOTE BAG") {
			CommonFunctions.textVisibleInPage("As a returning traveller you have selected an APT Club Tote Bag included with your Documentation.");
		}
	}
	
	@When("^user edits the top itinerary template$")
	public void user_edits_the_top_itinerary_template() throws Throwable {
		contractDetailsPage.clickItirenaryTemplatesSectionTopEditItineraryTemplateButton();
	}
	
	@When("^user cancels the update of the itinerary template$")
	public void user_cancels_the_update_of_the_itinerary_template() throws Throwable {
		contractDetailsPage.clickItirenaryTemplatePopupCancelButton();
	}
	
	@Then("^user does not see the update itinerary template popup$")
	public void user_does_not_see_the_update_itinerary_template_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'PopupTitle')]//span[contains(text(), 'Itinerary Template')]");
	}
	
	@When("^user disregards the cancellation of the update of the itinerary template$")
	public void user_disregards_the_cancellation_of_the_update_of_the_itinerary_template() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
		CommonFunctions.pause(1000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'PopupTitle')]//*[contains(text(), 'Itinerary Template')]");
	}
	
	@Then("^user sees the update itinerary template popup$")
	public void user_sees_the_update_itinerary_template_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'PopupTitle')]//span[contains(text(), 'Itinerary Template')]")));
	}
	
	@When("^user confirms the cancellation of the update of the itinerary template$")
	public void user_confirms_the_cancellation_of_the_update_of_the_itinerary_template() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user deletes the top itinerary template$")
	public void user_deletes_the_top_itinerary_template() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//a[contains(@id, 'DeleteIteneraryLink')])[1]")));
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user disregards the deletion of the itinerary template$")
	public void user_disregards_the_deletion_of_the_itinerary_template() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to remove this itinerary template from the contract?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
	}
	
	@Then("^user sees the itinerary template$")
	public void user_sees_the_itinerary_template() throws Throwable {
		CommonFunctions.textVisibleInPage("APTCLUB TOTE BAG");
	}
	
	@When("^user confirms the deletion of the itinerary template$")
	public void user_confirms_the_deletion_of_the_itinerary_template() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to remove this itinerary template from the contract?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Delete Itinerary Template')]"));
		CommonFunctions.pause(10000, false);
	}
	
	@Then("^user does not see the itinerary template$")
	public void user_does_not_see_the_itinerary_template() throws Throwable {
		CommonFunctions.textVisibleInPage("No records found.");
	}
	
	@When("^user saves the cancellation rule$")
	public void user_saves_the_cancellation_rule() throws Throwable {
		contractDetailsPage.clickPaymentCancellationRulePopupAddRuleButton();
	}
	
	@When("^user edits the top cancellation rule$")
	public void user_edits_the_top_cancellation_rule() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionTopEditCancellationRuleButton();
	}
	
	@When("^user cancels the update of the cancellation rule$")
	public void user_cancels_the_update_of_the_cancellation_rule() throws Throwable {
		contractDetailsPage.clickPaymentCancellationRulePopupCancelButton();
	}
	
	@Then("^user does not see the update cancellation rule popup$")
	public void user_does_not_see_the_update_cancellation_rule_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'PopupTitle')]//*[contains(text(), 'Cancellation Rule')]");
	}
	
	@When("^user disregards the cancellation of the update of the cancellation rule$")
	public void user_disregards_the_cancellation_of_the_update_of_the_cancellation_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
		CommonFunctions.pause(2500, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@id, 'PopupTitle')]//*[contains(text(), 'Cancellation Rule')]");
	}
	
	@Then("^user sees the update cancellation rule popup$")
	public void user_sees_the_update_cancellation_rule_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'PopupTitle')]//span[contains(text(), 'Cancellation Rule')]")));
	}
	
	@When("^user confirms the cancellation of the update of the cancellation rule$")
	public void user_confirms_the_cancellation_of_the_update_of_the_cancellation_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user deletes the top cancellation rule$")
	public void user_deletes_the_top_cancellation_rule() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionTopDeleteCancellationRuleButton();
	}
	
	@Then("^user sees the cancellation rule is not deleted$")
	public void user_sees_the_cancellation_rule_is_not_deleted() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//table[contains(@id, 'CancellationTableRecords')]//tbody//tr//td[text() = 'No records found.']");
	}
	
	@Then("^user sees the cancellation rule is deleted$")
	public void user_sees_the_cancellation_rule_is_deleted() throws Throwable {
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'CancellationTableRecords')]//tbody//tr//td[text() = 'No records found.']")));
	}
	
	@When("^user saves the deposit rule$")
	public void user_saves_the_deposit_rule() throws Throwable {
		contractDetailsPage.clickPaymentDepositRulePopupAddRuleButton();
	}
	
	@When("^user edits the top deposit rule$")
	public void user_edits_the_top_deposit_rule() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionTopEditDepositRuleButton();
	}
	
	@When("^user cancels the update of the deposit rule$")
	public void user_cancels_the_update_of_the_deposit_rule() throws Throwable {
		contractDetailsPage.clickPaymentDepositRulePopupCancelButton();
	}
	
	@Then("^user does not see the update deposit rule popup$")
	public void user_does_not_see_the_update_deposit_rule_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'PopupTitle')]//*[contains(text(), 'Deposit Rule')]");
	}
	
	@When("^user disregards the cancellation of the update of the deposit rule$")
	public void user_disregards_the_cancellation_of_the_update_of_the_deposit_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
		CommonFunctions.pause(2500, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@id, 'PopupTitle')]//*[contains(text(), 'Deposit Rule')]");
	}
	
	@Then("^user sees the update deposit rule popup$")
	public void user_sees_the_update_deposit_rule_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'PopupTitle')]//span[contains(text(), 'Deposit Rule')]")));
	}
	
	@When("^user confirms the cancellation of the update of the deposit rule$")
	public void user_confirms_the_cancellation_of_the_update_of_the_deposit_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user deletes the top deposit rule$")
	public void user_deletes_the_top_deposit_rule() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionTopDeleteDepositRuleButton();
	}
	
	@Then("^user sees the deposit rule is not deleted$")
	public void user_sees_the_deposit_rule_is_not_deleted() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//table[contains(@id, 'DepositTableRecords')]//tbody//tr//td[text() = 'No records found.']");
	}
	
	@Then("^user sees the deposit rule is deleted$")
	public void user_sees_the_deposit_rule_is_deleted() throws Throwable {
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'DepositTableRecords')]//tbody//tr//td[text() = 'No records found.']")));
	}
	
	@When("^user disregards the cancellation of the new cancellation rule$")
	public void user_disregards_the_cancellation_of_the_new_cancellation_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
		CommonFunctions.pause(1000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'PopupTitle')]//*[contains(text(), 'Cancellation Rule')]");
	}
	
	@When("^user confirms the cancellation of the new cancellation rule$")
	public void user_confirms_the_cancellation_of_the_new_cancellation_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user disregards the cancellation of the new deposit rule$")
	public void user_disregards_the_cancellation_of_the_new_deposit_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
		CommonFunctions.pause(1000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'PopupTitle')]//*[contains(text(), 'Deposit Rule')]");
	}
	
	@When("^user confirms the cancellation of the new deposit rule$")
	public void user_confirms_the_cancellation_of_the_new_deposit_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@Then("^user sees the payment deposit rules tab table$")
	public void user_sees_the_payment_deposit_rules_tab_table() throws Throwable {
		contractDetailsPage.displayedPaymentRulesSectionPaymentDepositRulesTable();
	}
	
	@Then("^user sees the payment cancellation rules tab table$")
	public void user_sees_the_payment_cancellation_rules_tab_table() throws Throwable {
		contractDetailsPage.displayedPaymentRulesSectionPaymentCancellationRulesTable();
	}
	
	@When("^user disregards the deletion of the row of prices$")
	public void user_disregards_the_deletion_of_the_row_of_prices() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the dates 01 Jan 2018 - 31 Dec 2018 for all Currencies across all Guest Configurations in Category VC and FB?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
	}
	
	@When("^user confirms the deletion of the row of prices$")
	public void user_confirms_the_deletion_of_the_row_of_prices() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the dates 01 Jan 2018 - 31 Dec 2018 for all Currencies across all Guest Configurations in Category VC and FB?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user disregards the cancellation of the update of the contract basic information$")
	public void user_disregards_the_cancellation_of_the_update_of_the_contract_basic_information() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this cancellation rule?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
	}
	
	@When("^user confirms the cancellation of the update of the contract basic information$")
	public void user_confirms_the_cancellation_of_the_update_of_the_contract_basic_information() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'This Contract has been modified. Are you sure you want to discard the changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user disregards the deletion of the cancellation rule$")
	public void user_disregards_the_deletion_of_the_cancellation_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this cancellation rule?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'Cancel']"));
	}
	
	@When("^user confirms the deletion of the cancellation rule$")
	public void user_confirms_the_deletion_of_the_cancellation_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this cancellation rule?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Delete Cancellation Rule')]"));
	}
	
	@When("^user disregards the deletion of the deposit rule$")
	public void user_disregards_the_deletion_of_the_deposit_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this deposit rule from the contract?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
	}
	
	@When("^user confirms the deletion of the deposit rule$")
	public void user_confirms_the_deletion_of_the_deposit_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this deposit rule from the contract?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Delete Deposit Rule')]"));
	}
	
	@Then("^user sees the contracts prices accordion contents are disabled$")
	public void user_sees_the_contracts_prices_accordion_contents_are_disabled() throws Throwable {
		CommonFunctions.pause(1, true);
		contractDetailsPage.disabledContractPricesSectionAddPricesButton();
		contractDetailsPage.disabledContractPricesSectionDeleteAllPricesButton();
		// contractDetailsPage.disabledContractPricesSectionImportDatesButton();
		// contractDetailsPage.disabledContractPricesSectionCreateBulkPricesButton();
		CommonFunctions.elementAttributeContains(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//a[contains(@id, 'DeletePriceLink')])[1]")), "disabled", "true");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//i[@title = 'Delete' and contains(@class, 'disable')])[1]")));
		user_hovers_over_a_certain_cell_that_is_not_empty_in_the_contract_prices_table();
		user_sees_the_view_icon_beside_the_contract_price_data();
	}
	
	@Then("^user sees the contracts prices accordion contents are enabled$")
	public void user_sees_the_contracts_prices_accordion_contents_are_enabled() throws Throwable {
		CommonFunctions.pause(1, true);
		contractDetailsPage.enabledContractPricesSectionAddPricesButton();
		contractDetailsPage.enabledContractPricesSectionDeleteAllPricesButton();
		// contractDetailsPage.enabledContractPricesSectionImportDatesButton();
		// contractDetailsPage.enabledContractPricesSectionCreateBulkPricesButton();
		CommonFunctions.elementEnabled(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//a[contains(@id, 'DeletePriceLink')])[1]")));
		CommonFunctions.elementNotExistingByXPath("(//div[contains(@id, 'ContractPriceContainer')]//i[@title = 'Delete' and contains(@class, 'disable')])[1]");
		user_hovers_over_a_certain_cell_that_is_not_empty_in_the_contract_prices_table();
		user_sees_the_edit_and_delete_icons_beside_the_contract_price_data();
	}
	
	@When("^user disregards the saving of the contract with duplicate name$")
	public void user_disregards_the_saving_of_the_contract_with_duplicate_name() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user disregards the cancellation of the new contract$")
	public void user_disregards_the_cancellation_of_the_new_contract() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user confirms the cancellation of the new contract$")
	public void user_confirms_the_cancellation_of_the_new_contract() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'You have not created this contract yet. Are you sure you want to discard this contract?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user confirms the saving of the contract with duplicate name$")
	public void user_confirms_the_saving_of_the_contract_with_duplicate_name() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'The contract name is already in use. Do you want to continue creating a new contract with the duplicate name?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user disregards the cancellation of the contract duplication$")
	public void user_disregards_the_cancellation_of_the_contract_duplication() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user confirms the cancellation of the contract duplication$")
	public void user_confirms_the_cancellation_of_the_contract_duplication() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'You have not created this contract yet. Are you sure you want to discard this contract?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'OK']"));
	}
	
	@When("^user disregards the updating of the contract with duplicate name$")
	public void user_disregards_the_updating_of_the_contract_with_duplicate_name() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user confirms the updating of the contract with duplicate name$")
	public void user_confirms_the_updating_of_the_contract_with_duplicate_name() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'The contract name is already in use. Do you want to continue updating the contract with the duplicate name?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'OK']"));
	}
	
	@When("^user opens the final payment rules tab$")
	public void user_opens_the_final_payment_rules_tab() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionFinalPaymentTabLabel();
	}
	
	@When("^user opens the add final payment rule popup$")
	public void user_opens_the_add_final_payment_rule_popup() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionAddFinalPaymentRuleButton();
	}
	
	@When("^user puts \"([^\"]*)\" as the booking start date for the final payment rule$")
	public void user_puts_as_the_booking_start_date_for_the_final_payment_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentFinalPaymentRulePopupBookingStartDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the booking end date for the final payment rule$")
	public void user_puts_as_the_booking_end_date_for_the_final_payment_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentFinalPaymentRulePopupBookingEndDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the departure start date for the final payment rule$")
	public void user_puts_as_the_departure_start_date_for_the_final_payment_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentFinalPaymentRulePopupDepartureStartDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the departure end date for the final payment rule$")
	public void user_puts_as_the_departure_end_date_for_the_final_payment_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentFinalPaymentRulePopupDepartureEndDateInput(arg1);
	}
	
	@When("^user selects \"([^\"]*)\" as the customer market value for the final payment rule$")
	public void user_selects_as_the_customer_market_value_for_the_final_payment_rule(String arg1) throws Throwable {
		contractDetailsPage.selectPaymentFinalPaymentRulePopupCustomerMarketValue(arg1);
	}
	
	@When("^user cancels the addition of the new final payment rule$")
	public void user_cancels_the_addition_of_the_new_final_payment_rule() throws Throwable {
		contractDetailsPage.clickPaymentFinalPaymentRulePopupCancelButton();
	}
	
	@When("^user disregards the cancellation of the new final payment rule$")
	public void user_disregards_the_cancellation_of_the_new_final_payment_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
		CommonFunctions.pause(1000, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@class, 'PopupTitle')]//*[contains(text(), 'Final Payment Rule')]");
	}
	
	@Then("^user sees the add final payment rule popup$")
	public void user_sees_the_add_final_payment_rule_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Add Final Payment Rule");
	}
	
	@When("^user confirms the cancellation of the new final payment rule$")
	public void user_confirms_the_cancellation_of_the_new_final_payment_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@Then("^user does not see the add final payment rule popup$")
	public void user_does_not_see_the_add_final_payment_rule_popup() throws Throwable {
		CommonFunctions.textHiddenInPage("Add Final Payment Rule");
	}
	
	@Then("^user sees the add final payment rule popup fields$")
	public void user_sees_the_add_final_payment_rule_popup_fields() throws Throwable {
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupCustomerMarketDropdown("All");
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupCustomerTypeDropdown("All");
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupCurrencyDropdown("All");
		contractDetailsPage.displayedPaymentFinalPaymentRulePopupBookingStartDateInput();
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupBookingEndDateInput("31 Dec 2050");
		contractDetailsPage.displayedPaymentFinalPaymentRulePopupDepartureStartDateInput();
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupDepartureEndDateInput("31 Dec 2050");
		contractDetailsPage.checkPaymentFinalPaymentRulePopupMinimumDaysRadioButtonIsToggled();
		contractDetailsPage.enabledPaymentFinalPaymentRulePopupMinimumDaysInput();
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupMinimumDaysInput("0");
		contractDetailsPage.checkPaymentFinalPaymentRulePopupDueDateRadioButtonIsNotToggled();
		contractDetailsPage.disabledPaymentFinalPaymentRulePopupDueDateInput();
		contractDetailsPage.displayedPaymentFinalPaymentRulePopupCancelButton();
		contractDetailsPage.displayedPaymentFinalPaymentRulePopupAddRuleButton();
	}
	
	@When("^user selects \"([^\"]*)\" as the customer type value for the final payment rule$")
	public void user_selects_as_the_customer_type_value_for_the_final_payment_rule(String arg1) throws Throwable {
		contractDetailsPage.selectPaymentFinalPaymentRulePopupCustomerTypeValue(arg1);
	}
	
	@Then("^user sees \"([^\"]*)\" as the customer market value for the final payment rule$")
	public void user_sees_as_the_customer_market_value_for_the_final_payment_rule(String arg1) throws Throwable {
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupCustomerMarketDropdown(arg1);
	}
	
	@Then("^user sees \"([^\"]*)\" as the customer type value for the final payment rule$")
	public void user_sees_as_the_customer_type_value_for_the_final_payment_rule(String arg1) throws Throwable {
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupCustomerTypeDropdown(arg1);
	}
	
	@When("^user selects due date as the option for the final payment rule$")
	public void user_selects_due_date_as_the_option_for_the_final_payment_rule() throws Throwable {
		contractDetailsPage.clickPaymentFinalPaymentRulePopupDueDateRadioButton();
	}
	
	@Then("^user sees due date field is enabled and minimum days field is disabled$")
	public void user_sees_due_date_field_is_enabled_and_minimum_days_field_is_disabled() throws Throwable {
		contractDetailsPage.enabledPaymentFinalPaymentRulePopupDueDateInput();
		contractDetailsPage.disabledPaymentFinalPaymentRulePopupMinimumDaysInput();
	}
	
	@When("^user selects minimum days as the option for the final payment rule$")
	public void user_selects_minimum_days_as_the_option_for_the_final_payment_rule() throws Throwable {
		contractDetailsPage.clickPaymentFinalPaymentRulePopupMinimumDaysRadioButton();
	}
	
	@Then("^user sees minimum days field is enabled and due date field is disabled$")
	public void user_sees_minimum_days_field_is_enabled_and_due_date_field_is_disabled() throws Throwable {
		contractDetailsPage.enabledPaymentFinalPaymentRulePopupMinimumDaysInput();
		contractDetailsPage.disabledPaymentFinalPaymentRulePopupDueDateInput();
	}
	
	@When("^user puts \"([^\"]*)\" into minimum days field in the final payment rule popup$")
	public void user_puts_into_minimum_days_field_in_the_final_payment_rule_popup(String arg1) throws Throwable {
		contractDetailsPage.setPaymentFinalPaymentRulePopupMinimumDaysInput(arg1);
	}
	
	@Then("^user sees that the minimum days field does not accept alphabets, special characters, negative numbers, and decimals in the final payment rule popup$")
	public void user_sees_that_the_minimum_days_field_does_not_accept_alphabets_special_characters_negative_numbers_and_decimals_in_the_final_payment_rule_popup() throws Throwable {
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupMinimumDaysInput("");
	}
	
	@When("^user provides empty values on the final payment rule popup fields$")
	public void user_provides_empty_values_on_the_final_payment_rule_popup_fields() throws Throwable {
		contractDetailsPage.setPaymentFinalPaymentRulePopupBookingStartDateInput("");
		contractDetailsPage.setPaymentFinalPaymentRulePopupBookingEndDateInput("");
		contractDetailsPage.setPaymentFinalPaymentRulePopupDepartureStartDateInput("");
		contractDetailsPage.setPaymentFinalPaymentRulePopupDepartureEndDateInput("");
		contractDetailsPage.setPaymentFinalPaymentRulePopupMinimumDaysInput("");
	}
	
	@When("^user saves the final payment rule$")
	public void user_saves_the_final_payment_rule() throws Throwable {
		contractDetailsPage.clickPaymentFinalPaymentRulePopupAddRuleButton();
	}
	
	@When("^user provides valid values on the final payment rule popup fields$")
	public void user_provides_valid_values_on_the_final_payment_rule_popup_fields() throws Throwable {
		contractDetailsPage.setPaymentFinalPaymentRulePopupBookingStartDateInput("08 Dec 2019");
		contractDetailsPage.setPaymentFinalPaymentRulePopupBookingEndDateInput("31 Dec 2050");
		contractDetailsPage.setPaymentFinalPaymentRulePopupDepartureStartDateInput("08 Dec 2019");
		contractDetailsPage.setPaymentFinalPaymentRulePopupDepartureEndDateInput("31 Dec 2050");
		contractDetailsPage.setPaymentFinalPaymentRulePopupMinimumDaysInput("5");
	}
	
	@When("^user deletes the top final payment rule$")
	public void user_deletes_the_top_final_payment_rule() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionTopDeleteFinalPaymentRuleButton();
	}
	
	@When("^user disregards the deletion of the final payment rule$")
	public void user_disregards_the_deletion_of_the_final_payment_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this final payment rule from the contract?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
	}
	
	@Then("^user sees the final payment rule is not deleted$")
	public void user_sees_the_final_payment_rule_is_not_deleted() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//table[contains(@id, 'FinalPaymentTableRecords')]//tbody//tr//td[text() = 'No records found.']");
	}
	
	@When("^user confirms the deletion of the final payment rule$")
	public void user_confirms_the_deletion_of_the_final_payment_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this final payment rule from the contract?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Delete Final Payment Rule')]"));
	}
	
	@Then("^user sees the final payment rule is deleted$")
	public void user_sees_the_final_payment_rule_is_deleted() throws Throwable {
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//table[contains(@id, 'FinalPaymentTableRecords')]//tbody//tr//td[text() = 'No records found.']")));
	}
	
	@Then("^user sees the contract indicative air section$")
	public void user_sees_the_contract_indicative_air_section() throws Throwable {
		CommonFunctions.textVisibleInPage("Indicative Air");
	}
	
	@When("^user provides the basic information of the contract with the type miscellaneous$")
	public void user_provides_the_basic_information_of_the_contract_with_the_type_miscellaneous() throws Throwable {
		contractDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime("AirInd"));
		contractDetailsPage.selectTypeValue("Miscellaneous");
		contractDetailsPage.selectSupplierValue("Test_SupplierPH");
		contractDetailsPage.selectCityValue("Auckland, NEW ZEALAND");
		contractDetailsPage.selectOfficeValue("APT Auckland");
		contractDetailsPage.selectDepartmentValue("APT Auckland - Sales");
		contractDetailsPage.selectCurrencyValue("NZD - New Zealand Dollars");
		contractDetailsPage.selectAutoSendToSupplierContactValue("FIT");
		contractDetailsPage.setCommentsTextArea("Test Air Indicative");
	}
	
	@Then("^user sees contract indicative air airline input is readonly$")
	public void user_sees_contract_indicative_air_airline_input_is_readonly() throws Throwable {
		contractDetailsPage.disabledIndicativeAirSectionAirlineDropdown();
	}
	
	@Then("^user sees the contract indicative air airline input contains \"([^\"]*)\"$")
	public void user_sees_the_contract_indicative_air_airline_input_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueIndicativeAirSectionAirlineDropdown(arg1);
	}
	
	@Then("^user sees the contract indicative air cabin class dropdown and its options$")
	public void user_sees_the_contract_indicative_air_cabin_class_dropdown_and_its_options() throws Throwable {
		contractDetailsPage.clickIndicativeAirSectionCabinClassDropdownOption("Economy");
		contractDetailsPage.containsValueIndicativeAirSectionCabinClassDropdown("Economy");
		contractDetailsPage.clickIndicativeAirSectionCabinClassDropdownOption("Premium Economy");
		contractDetailsPage.containsValueIndicativeAirSectionCabinClassDropdown("Premium Economy");
		contractDetailsPage.clickIndicativeAirSectionCabinClassDropdownOption("Business Class");
		contractDetailsPage.containsValueIndicativeAirSectionCabinClassDropdown("Business Class");
		contractDetailsPage.clickIndicativeAirSectionCabinClassDropdownOption("First Class");
		contractDetailsPage.containsValueIndicativeAirSectionCabinClassDropdown("First Class");
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract indicative air location dropdown$")
	public void user_ticks_the_option_of_the_contract_indicative_air_location_dropdown(String arg1) throws Throwable {
		contractDetailsPage.clickIndicativeAirSectionLocationDropdownOption(arg1);
	}
	
	@Then("^user sees the contract indicative air location dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_contract_indicative_air_location_dropdown_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueIndicativeAirSectionLocationDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract indicative air cabin class dropdown$")
	public void user_ticks_the_option_of_the_contract_indicative_air_cabin_class_dropdown(String arg1) throws Throwable {
		contractDetailsPage.clickIndicativeAirSectionCabinClassDropdownOption(arg1);
	}
	
	@Then("^user sees the contract indicative air cabin class dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_contract_indicative_air_cabin_class_dropdown_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueIndicativeAirSectionCabinClassDropdown(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" as the name for the contract$")
	public void user_puts_as_the_name_for_the_contract(String arg1) throws Throwable {
		contractDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime("AirInd"));
	}
	
	@When("^user provides different information for the contract$")
	public void user_provides_different_information_for_the_contract() throws Throwable {
		contractDetailsPage.setNameInput(CommonFunctions.stringAppendDateTime("TDD"));
		contractDetailsPage.selectSupplierValue("Nelson");
	}
	
	@When("^user edits the top final payment rule$")
	public void user_edits_the_top_final_payment_rule() throws Throwable {
		contractDetailsPage.clickPaymentRulesSectionTopEditFinalPaymentRuleButton();
	}
	
	@When("^user updates some values on the final payment rule$")
	public void user_updates_some_values_on_the_final_payment_rule() throws Throwable {
		contractDetailsPage.setPaymentFinalPaymentRulePopupMinimumDaysInput("1");
	}
	
	@When("^user cancels the update of the final payment rule$")
	public void user_cancels_the_update_of_the_final_payment_rule() throws Throwable {
		contractDetailsPage.clickPaymentFinalPaymentRulePopupCancelButton();
	}
	
	@When("^user disregards the cancellation of the update final payment rule$")
	public void user_disregards_the_cancellation_of_the_update_final_payment_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'Cancel')]"));
		CommonFunctions.pause(2500, false);
		CommonFunctions.switchFrameByXPath("//div[contains(@id, 'PopupTitle')]//*[contains(text(), 'Final Payment Rule')]");
	}
	
	@Then("^user sees the update final payment rule popup$")
	public void user_sees_the_update_final_payment_rule_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Update Final Payment Rule");
	}
	
	@When("^user confirms the cancellation of the update final payment rule$")
	public void user_confirms_the_cancellation_of_the_update_final_payment_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@Then("^user does not see the update final payment rule popup$")
	public void user_does_not_see_the_update_final_payment_rule_popup() throws Throwable {
		CommonFunctions.textHiddenInPage("Update Final Payment Rule");
	}
	
	@Then("^user sees the category 1 field options when the indicative air cabin class is \"([^\"]*)\"$")
	public void user_sees_the_category_field_options_when_the_indicative_air_cabin_class_is(String arg1) throws Throwable {
		if (arg1.equals("Economy")) {
			contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption("Flight Price EC");
			contractCostsDetailsPage.containsValueConfigurationDetailsSectionCategory1Dropdown("Flight Price EC");
			contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption("Flight Price EC");
			contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption("Flight Tax EC");
			contractCostsDetailsPage.containsValueConfigurationDetailsSectionCategory1Dropdown("Flight Tax EC");
		}
		else if (arg1.equals("Premium Economy")) {
			contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption("Flight Price PE");
			contractCostsDetailsPage.containsValueConfigurationDetailsSectionCategory1Dropdown("Flight Price PE");
			contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption("Flight Price PE");
			contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption("Flight Tax PE");
			contractCostsDetailsPage.containsValueConfigurationDetailsSectionCategory1Dropdown("Flight Tax PE");
		}
		else if (arg1.equals("Business Class")) {
			contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption("Flight Price BC");
			contractCostsDetailsPage.containsValueConfigurationDetailsSectionCategory1Dropdown("Flight Price BC");
			contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption("Flight Tax BC");
			contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption("Flight Price BC");
			contractCostsDetailsPage.containsValueConfigurationDetailsSectionCategory1Dropdown("Flight Tax BC");
		}
		else if (arg1.equals("First Class")) {
			contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption("Guide");
			contractCostsDetailsPage.containsValueConfigurationDetailsSectionCategory1Dropdown("Guide");
		}
	}
	
	@Then("^user sees the edit final payment rule popup fields$")
	public void user_sees_the_edit_final_payment_rule_popup_fields() throws Throwable {
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupCustomerMarketDropdown("All");
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupCustomerTypeDropdown("All");
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupCurrencyDropdown("All");
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupBookingStartDateInput("08 Dec 2019");
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupBookingEndDateInput("31 Dec 2050");
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupDepartureStartDateInput("08 Dec 2019");
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupDepartureEndDateInput("31 Dec 2050");
		contractDetailsPage.checkPaymentFinalPaymentRulePopupMinimumDaysRadioButtonIsToggled();
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupMinimumDaysInput("5");
		contractDetailsPage.checkPaymentFinalPaymentRulePopupDueDateRadioButtonIsNotToggled();
	}
	
	@Then("^user sees \"([^\"]*)\" as the minimum days value for the final payment rule$")
	public void user_sees_as_the_minimum_days_value_for_the_final_payment_rule(String arg1) throws Throwable {
		contractDetailsPage.containsValuePaymentFinalPaymentRulePopupMinimumDaysInput(arg1);
	}
	
	@When("^user closes the addition of itinerary template$")
	public void user_closes_the_addition_of_itinerary_template() throws Throwable {
		contractDetailsPage.clickItirenaryTemplatePopupCloseButton();
	}
	
	@When("^user puts \"([^\"]*)\" as the due date for the final payment rule$")
	public void user_puts_as_the_due_date_for_the_final_payment_rule(String arg1) throws Throwable {
		contractDetailsPage.setPaymentFinalPaymentRulePopupDueDateInput(arg1);
	}
	
	@When("^closes the add payment cancellation rule popup$")
	public void closes_the_add_payment_cancellation_rule_popup() throws Throwable {
		contractDetailsPage.clickPaymentCancellationRulePopupCloseButton();
	}
	
	@When("^closes the add payment deposit rule popup$")
	public void closes_the_add_payment_deposit_rule_popup() throws Throwable {
		contractDetailsPage.clickPaymentDepositRulePopupCloseButton();
	}
	
	@Then("^user does not see the create bulk costs and import dates icon in the contract costs accordion$")
	public void user_does_not_see_the_create_bulk_costs_and_import_dates_icon_in_the_contract_costs_accordion() throws Throwable {
		// CommonFunctions.elementNotExistingByXPath("//a[contains(@id, 'CreateBulkCosts')]");
		CommonFunctions.elementNotExistingByXPath("//a[contains(@id, 'ImportDatesLink')]");
	}
	
	@Then("^user does not see the create bulk costs and import dates icon in the contract prices accordion$")
	public void user_does_not_see_the_create_bulk_costs_and_import_dates_icon_in_the_contract_prices_accordion() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//a[contains(@id, 'CreateBulkPriceCosts')]");
		CommonFunctions.elementNotExistingByXPath("//a[contains(@id, 'ImportDatesPriceLink')]");
	}
	
	@When("^closes the add final payment rule popup$")
	public void closes_the_add_final_payment_rule_popup() throws Throwable {
		contractDetailsPage.clickPaymentFinalPaymentRulePopupCloseButton();
	}
	
	@When("^user opens the add contract costs page$")
	public void user_opens_the_add_contract_costs_page() throws Throwable {
		contractCostsDetailsPage = contractDetailsPage.clickContractCostsSectionAddCostsButton();
	}
	
	@When("^user puts \"([^\"]*)\" in the contract price start date field$")
	public void user_puts_in_the_contract_price_start_date_field(String arg1) throws Throwable {
		contractDetailsPage.setContractPricePopupAddCustomDatesSectionStartDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract price end date field$")
	public void user_puts_in_the_contract_price_end_date_field(String arg1) throws Throwable {
		contractDetailsPage.setContractPricePopupAddCustomDatesSectionEndDateInput(arg1);
	}
	
	@When("^user opens the add contract price popup$")
	public void user_opens_the_add_contract_price_popup() throws Throwable {
		contractDetailsPage.clickContractPricesSectionAddPricesButton();
	}
	
	@Then("^user sees the contract price popup import from cost option contents$")
	public void user_sees_the_contract_price_popup_import_from_cost_option_contents() throws Throwable {
		contractDetailsPage.displayedContractPricePopupPriceConfigurationDropdown();
		contractDetailsPage.displayedContractPricePopupImportDatesTabLabel();
		contractDetailsPage.displayedContractPricePopupAddCustomDatesTabLabel();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionImportFromCostRadioButton();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionImportFromPriceRadioButton();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionIncludePastDatesCheckbox();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionEquivalentCostConfigurationInput();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionPriceCurrencyDropdown();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionPaxTypeDropdown();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionAddToTableButton();
	}
	
	@When("^user toggles the import from price option of the contract price popup$")
	public void user_toggles_the_import_from_price_option_of_the_contract_price_popup() throws Throwable {
		contractDetailsPage.clickContractPricePopupImportDatesSectionImportFromPriceRadioButton();
	}
	
	@Then("^user sees the contract price popup import from price option contents$")
	public void user_sees_the_contract_price_popup_import_from_price_option_contents() throws Throwable {
		contractDetailsPage.displayedContractPricePopupPriceConfigurationDropdown();
		contractDetailsPage.displayedContractPricePopupImportDatesTabLabel();
		contractDetailsPage.displayedContractPricePopupAddCustomDatesTabLabel();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionImportFromCostRadioButton();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionImportFromPriceRadioButton();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionIncludePastDatesCheckbox();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionCopyPricesCheckbox();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionImportFromPriceDropdown();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionPriceCurrencyDropdown();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionPaxTypeDropdown();
		contractDetailsPage.displayedContractPricePopupImportDatesSectionAddToTableButton();
	}
	
	@When("^user opens the contract price add custom dates section$")
	public void user_opens_the_contract_price_add_custom_dates_section() throws Throwable {
		contractDetailsPage.clickContractPricePopupAddCustomDatesTabLabel();
	}
	
	@When("^user opens the contract price add custom dates accordion$")
	public void user_opens_the_contract_price_add_custom_dates_accordion() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//span[text() = 'Add Custom Dates']//ancestor::div[contains(@id, 'SectionExpandableArea')]")));
	}
	
	@When("^user opens the contract price import dates section$")
	public void user_opens_the_contract_price_import_dates_section() throws Throwable {
		contractDetailsPage.clickContractPricePopupImportDatesTabLabel();
	}
	
	@Then("^user sees the contract price popup add custom dates section contents$")
	public void user_sees_the_contract_price_popup_add_custom_dates_section_contents() throws Throwable {
		contractDetailsPage.displayedContractPricePopupAddCustomDatesSectionStartDateInput();
		contractDetailsPage.displayedContractPricePopupAddCustomDatesSectionEndDateInput();
		contractDetailsPage.displayedContractPricePopupAddCustomDatesSectionPriceCurrencyDropdown();
		contractDetailsPage.displayedContractPricePopupAddCustomDatesSectionPaxTypeDropdown();
		contractDetailsPage.displayedContractPricePopupAddCustomDatesSectionAddToTableButton();
	}
	
	@When("^user toggles the import from cost option of the contract price popup$")
	public void user_toggles_the_import_from_cost_option_of_the_contract_price_popup() throws Throwable {
		contractDetailsPage.clickContractPricePopupImportDatesSectionImportFromCostRadioButton();
	}
	
	@When("^user searches for the contract price configuration with \"([^\"]*)\" as the guest configuration, \"([^\"]*)\" as the category 1 and \"([^\"]*)\" as the category 2$")
	public void user_searches_for_the_contract_price_configuration_with_as_the_guest_configuration_as_the_category_and_as_the_category(String arg1, String arg2, String arg3) throws Throwable {
		contractDetailsPage.clickContractPricePopupPriceConfigurationDropdown();
		contractDetailsPage.setContractPricePopupPriceConfigurationDropdownGuestConfigurationFilterInput(arg1);
		contractDetailsPage.setContractPricePopupPriceConfigurationDropdownCategory1FilterInput(arg2);
		contractDetailsPage.setContractPricePopupPriceConfigurationDropdownCategory2FilterInput(arg3);
	}
	
	@When("^user selects the top price configuration search result in the list$")
	public void user_selects_the_top_price_configuration_search_result_in_the_list() throws Throwable {
		contractDetailsPage.clickContractPricePopupPriceConfigurationDropdownTopPriceConfigurationRadioButton();
	}
	
	@Then("^user sees the contract price configuration with \"([^\"]*)\" as the guest configuration, \"([^\"]*)\" as the category 1 and \"([^\"]*)\" as the category 2$")
	public void user_sees_the_contract_price_configuration_with_as_the_guest_configuration_as_the_category_and_as_the_category(String arg1, String arg2, String arg3) throws Throwable {
		contractDetailsPage.containsValueContractPricePopupPriceConfigurationDropdownGuestConfigurationLabel(arg1);
		contractDetailsPage.containsValueContractPricePopupPriceConfigurationDropdownCategory1Label(arg2);
		contractDetailsPage.containsValueContractPricePopupPriceConfigurationDropdownCategory2Label(arg3);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract price import dates currency dropdown$")
	public void user_ticks_the_option_of_the_contract_import_dates_price_currency_dropdown(String arg1) throws Throwable {
		contractDetailsPage.clickContractPricePopupImportDatesSectionPriceCurrencyDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract price add custom dates currency dropdown$")
	public void user_ticks_the_option_of_the_contract_price_add_custom_dates_currency_dropdown(String arg1) throws Throwable {
		contractDetailsPage.clickContractPricePopupAddCustomDatesSectionPriceCurrencyDropdownOption(arg1);
	}
	
	@Then("^user sees the contract price import dates currency dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_contract_price_import_dates_currency_dropdown_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueContractPricePopupImportDatesSectionPriceCurrencyDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract price import dates pax type dropdown$")
	public void user_ticks_the_option_of_the_contract_price_import_dates_pax_type_dropdown(String arg1) throws Throwable {
		contractDetailsPage.clickContractPricePopupImportDatesSectionPaxTypeDropdownOption(arg1);
	}
	
	@Then("^user sees the contract price import dates pax type dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_contract_price_import_dates_pax_type_dropdown_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueContractPricePopupImportDatesSectionPaxTypeDropdown(arg1);
	}
	
	@When("^user adds the contract prices custom dates to the table$")
	public void user_adds_the_contract_prices_custom_dates_to_the_table() throws Throwable {
		contractDetailsPage.clickContractPricePopupAddCustomDatesSectionAddToTableButton();
	}
	
	@Then("^user sees the contract prices table filters$")
	public void user_sees_the_contract_prices_table_filters() throws Throwable {
		contractDetailsPage.displayedContractPricePopupContractPricesTableStartDateFilterButton();
	}
	
	@When("^user puts \"([^\"]*)\" in the contract price start date filter field$")
	public void user_puts_in_the_contract_price_start_date_filter_field(String arg1) throws Throwable {
		contractDetailsPage.setContractPricePopupContractPricesTableStartDateFilterInput(arg1);
	}
	
	@When("^user ticks \"([^\"]*)\" in the contract price start date filter field$")
	public void user_ticks_in_the_contract_price_start_date_filter_field(String arg1) throws Throwable {
		contractDetailsPage.clickContractPricePopupContractPricesTableStartDateFilterOptionCheckbox(arg1);
	}
	
	@When("^user ticks the checkbox of the top row of the contract price table$")
	public void user_ticks_the_checkbox_of_the_top_row_of_the_contract_price_table() throws Throwable {
		contractDetailsPage.clickContractPricePopupContractPricesTableTopCheckboxRowData();
	}
	
	@When("^user decides to delete the selected rows of the contract price table$")
	public void user_decides_to_delete_the_selected_rows_of_the_contract_price_table() throws Throwable {
		contractDetailsPage.clickContractPricePopupContractPricesTableDeleteButton();
	}
	
	@When("^user cancels the deletion of the selected rows of the contract price table$")
	public void user_cancels_the_deletion_of_the_selected_rows_of_the_contract_price_table() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[@class = 'ConfirmationPopupMainContainer']//input[@value = 'Cancel']")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Add Contract Prices']");
	}
	
	@Then("^user sees the selected row of the contract price table is not deleted$")
	public void user_sees_the_selected_row_of_the_contract_price_table_is_not_deleted() throws Throwable {
		// CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'PricesContainer')]//table//tbody//tr[1]")));
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'GridCont')]//*[text() = 'No results to show']");
	}
	
	@When("^user confirms the deletion of the selected rows of the contract price table$")
	public void user_confirms_the_deletion_of_the_selected_rows_of_the_contract_price_table() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[@class = 'ConfirmationPopupMainContainer']//input[@value = 'OK']")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Add Contract Prices']");
	}
	
	@Then("^user sees the selected row of the contract price table is deleted$")
	public void user_sees_the_selected_row_of_the_contract_price_table_is_deleted() throws Throwable {
		// CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'PricesContainer')]//table//tbody//tr[2]");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'GridCont')]//*[text() = 'No results to show']")));
	}
	
	@When("^user ticks the checkbox of all rows of the contract price table$")
	public void user_ticks_the_checkbox_of_all_rows_of_the_contract_price_table() throws Throwable {
		contractDetailsPage.clickContractPricePopupContractPricesTableAllRowsCheckbox();
	}
	
	@Then("^user sees the selected rows of the contract price table is not deleted$")
	public void user_sees_the_selected_rows_of_the_contract_price_table_is_not_deleted() throws Throwable {
		// CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'PricesContainer')]//table//tbody//tr[1]")));
		CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'GridCont')]//*[text() = 'No results to show']");
	}
	
	@Then("^user sees the selected rows of the contract price table is deleted$")
	public void user_sees_the_selected_rows_of_the_contract_price_table_is_deleted() throws Throwable {
		// CommonFunctions.elementNotExistingByXPath("//div[contains(@id, 'PricesContainer')]//table//tbody//tr[2]");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'GridCont')]//*[text() = 'No results to show']")));
	}
	
	@Then("^user sees the contract price equivalent cost configuration with \"([^\"]*)\" as the guest configuration, \"([^\"]*)\" as the category 1 and \"([^\"]*)\" as the category 2$")
	public void user_sees_the_contract_price_equivalent_cost_configuration_with_as_the_guest_configuration_as_the_category_and_as_the_category(String arg1, String arg2, String arg3) throws Throwable {
		contractDetailsPage.containsValueContractPricePopupEquivalentCostConfigurationDropdownGuestConfigurationLabel(arg1);
		contractDetailsPage.containsValueContractPricePopupEquivalentCostConfigurationDropdownCategory1Label(arg2);
		contractDetailsPage.containsValueContractPricePopupEquivalentCostConfigurationDropdownCategory2Label(arg3);
	}
	
	@Then("^user adds the contract prices import dates add to table button enabled$")
	public void user_adds_the_contract_prices_import_dates_add_to_table_button_enabled() throws Throwable {
		contractDetailsPage.enabledContractPricePopupImportDatesSectionAddToTableButton();
	}
	
	@When("^user puts \"([^\"]*)\" in the contract prices popup contract prices table top price field$")
	public void user_puts_in_the_contract_prices_popup_contract_prices_table_top_price_field(String arg1) throws Throwable {
		contractDetailsPage.setContractPricePopupContractPricesTableTopPriceInputRowData(arg1);
	}
	
	@Then("^user sees that the contract prices popup contract prices table top price field contains \"([^\"]*)\"$")
	public void user_sees_that_the_contract_prices_popup_contract_prices_table_top_price_field_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueContractPricePopupContractPricesTableTopPriceInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract prices popup contract prices table top non-commission field$")
	public void user_puts_in_the_contract_prices_popup_contract_prices_table_top_non_commission_field(String arg1) throws Throwable {
		contractDetailsPage.setContractPricePopupContractPricesTableTopNonCommissionInputRowData(arg1);
	}
	
	@Then("^user sees that the contract prices popup contract prices table top non-commission field contains \"([^\"]*)\"$")
	public void user_sees_that_the_contract_prices_popup_contract_prices_table_top_non_commission_field_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueContractPricePopupContractPricesTableTopNonCommissionInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract prices popup contract prices table top minimum commission field$")
	public void user_puts_in_the_contract_prices_popup_contract_prices_table_top_minimum_commission_field(String arg1) throws Throwable {
		contractDetailsPage.setContractPricePopupContractPricesTableTopMinCommissionInputRowData(arg1);
	}
	
	@Then("^user sees that the contract prices popup contract prices table top minimum commission field contains \"([^\"]*)\"$")
	public void user_sees_that_the_contract_prices_popup_contract_prices_table_top_minimum_commission_field_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueContractPricePopupContractPricesTableTopMinCommissionInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract prices popup contract prices table top maximum commission field$")
	public void user_puts_in_the_contract_prices_popup_contract_prices_table_top_maximum_commission_field(String arg1) throws Throwable {
		contractDetailsPage.setContractPricePopupContractPricesTableTopMaxCommissionInputRowData(arg1);
	}
	
	@Then("^user sees that the contract prices popup contract prices table top maximum commission field contains \"([^\"]*)\"$")
	public void user_sees_that_the_contract_prices_popup_contract_prices_table_top_maximum_commission_field_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueContractPricePopupContractPricesTableTopMaxCommissionInputRowData(arg1);
	}
	
	@When("^user accepts the changes made on the contract prices popup table row$")
	public void user_accepts_the_changes_made_on_the_contract_prices_popup_table_row() throws Throwable {
		contractDetailsPage.clickContractPricePopupContractPricesTableSaveButton();
	}
	
	@When("^user adds the contract prices import dates from cost to the table$")
	public void user_adds_the_contract_prices_import_dates_from_cost_to_the_table() throws Throwable {
		contractDetailsPage.clickContractPricePopupImportDatesSectionAddToTableButton();
	}
	
	@When("^user ticks the include past dates in importing dates for the contract prices$")
	public void user_ticks_the_include_past_dates_in_importing_dates_for_the_contract_prices() throws Throwable {
		contractDetailsPage.clickContractPricePopupImportDatesSectionIncludePastDatesCheckbox();
	}
	
	@When("^user expands the first contract costs category accordion$")
	public void user_expands_the_first_contract_costs_category_accordion() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[@class = 'AccordionExpandable_header'])[1]")));
	}
	
	@When("^user saves the contract prices$")
	public void user_saves_the_contract_prices() throws Throwable {
		contractDetailsPage.clickContractPricePopupSavePricesButton();
	}
	
	@When("^user edits the contract price$")
	public void user_edits_the_contract_price() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport']//div[@class = 'AGGridMainDiv']//div[@class = 'AGGridRightDiv']//span[@title = 'Edit Price']")));
		CommonFunctions.pause(10000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Update Contract Price']");
	}
	
	@Then("^user sees the edit contract price popup$")
	public void user_sees_the_edit_contract_price_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Update Contract Price");
	}
	
	@When("^user closes the contract prices details popup$")
	public void user_closes_the_contract_prices_details_popup() throws Throwable {
		contractDetailsPage.clickContractPricePopupCancelButton();
	}
	
	@When("^user cancels the closing of the contract prices details popup$")
	public void user_cancels_the_closing_of_the_contract_prices_details_popup() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[@class = 'ConfirmationPopupMainContainer']//input[@value = 'Cancel']")));
		CommonFunctions.switchFrameByXPath("//*[text() = 'Add Contract Prices']");
	}
	
	@Then("^user sees the add contract price popup$")
	public void user_sees_the_add_contract_price_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("Add Contract Prices");
	}
	
	@When("^user confirms the closing of the contract prices details popup$")
	public void user_confirms_the_closing_of_the_contract_prices_details_popup() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.pause(2500, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[@class = 'ConfirmationPopupMainContainer']//input[@value = 'OK']")));
	}
	
	@Then("^user does not see the add contract price popup$")
	public void user_does_not_see_the_add_contract_price_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[text() = 'Add Contract Prices']");
	}
	
	@When("^user adds the contract prices import dates from price to the table$")
	public void user_adds_the_contract_prices_import_dates_from_price_to_the_table() throws Throwable {
		contractDetailsPage.clickContractPricePopupImportDatesSectionAddToTableButton();
	}
	
	@When("^user searches for the contract price import from price with \"([^\"]*)\" as the guest configuration, \"([^\"]*)\" as the category 1 and \"([^\"]*)\" as the category 2$")
	public void user_searches_for_the_contract_price_import_from_price_with_as_the_guest_configuration_as_the_category_and_as_the_category(String arg1, String arg2, String arg3) throws Throwable {
		contractDetailsPage.clickContractPricePopupImportDatesSectionImportFromPriceDropdown();
		contractDetailsPage.setContractPricePopupImportFromPriceDropdownCategory1FilterInput(arg1);
		contractDetailsPage.setContractPricePopupImportFromPriceDropdownCategory1FilterInput(arg2);
		contractDetailsPage.setContractPricePopupImportFromPriceDropdownCategory2FilterInput(arg3);
	}
	
	@When("^user selects the top import from price search result in the list$")
	public void user_selects_the_top_import_from_price_search_result_in_the_list() throws Throwable {
		contractDetailsPage.clickContractPricePopupImportFromPriceDropdownTopImportFromPriceRadioButton();
	}
	
	@Then("^user sees the contract prices custom dates add to table button disabled$")
	public void user_sees_the_contract_prices_custom_dates_add_to_table_button_disabled() throws Throwable {
		contractDetailsPage.disabledContractPricePopupAddCustomDatesSectionAddToTableButton();
	}
	
	@When("^user views the contract price$")
	public void user_views_the_contract_price() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractPriceContainer')]//div[@ref = 'eBodyViewport'])[1]//div[@class = 'AGGridRightDiv']//span[@title = 'View Price']")));
		CommonFunctions.pause(10000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'View Contract Prices']");
	}
	
	@Then("^user sees the view contract price popup$")
	public void user_sees_the_view_contract_price_popup() throws Throwable {
		CommonFunctions.textVisibleInPage("View Contract Prices");
		contractDetailsPage.displayedViewContractPricePopupGuestConfigurationLabel();
		contractDetailsPage.displayedViewContractPricePopupCategory1Label();
		contractDetailsPage.displayedViewContractPricePopupCategory2Label();
		contractDetailsPage.displayedViewContractPricePopupDayRangeLabel();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTable();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableStartDateFilterInput();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableEndDateFilterInput();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableCurrencyFilterInput();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTablePaxTypeFilterInput();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableTopStartDateLabelRowData();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableTopEndDateLabelRowData();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableTopCurrencyLabelRowData();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableTopPaxTypeLabelRowData();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableTopPriceLabelRowData();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableTopNonCommissionLabelRowData();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableTopMinimumCommissionLabelRowData();
		contractDetailsPage.displayedViewContractPricePopupContractPricesTableTopMaximumCommissionLabelRowData();
	}
	
	@When("^user closes the view contract price popup$")
	public void user_closes_the_view_contract_price_popup() throws Throwable {
		contractDetailsPage.clickViewContractPricePopupCloseButton();
	}
	
	@Then("^user does not see the view contract price popup$")
	public void user_does_not_see_the_view_contract_price_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[text() = 'View Contract Prices']");
	}
	
	@Then("^user sees the created by and created date information$")
	public void user_sees_the_created_by_and_created_date_information() throws Throwable {
		contractDetailsPage.displayedCreatedByLabel();
		contractDetailsPage.displayedCreatedDateLabel();
	}
	
	@Then("^user sees the created by and created date information on the update contract basic information popup$")
	public void user_sees_the_created_by_and_created_date_information_on_the_update_contract_basic_information_popup() throws Throwable {
		contractDetailsPage.displayedUpdateBasicInformationPopupCreatedByLabel();
		contractDetailsPage.displayedUpdateBasicInformationPopupCreatedDateLabel();
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract price import dates from cost pax type dropdown$")
	public void user_ticks_the_option_of_the_contract_price_import_dates_from_cost_pax_type_dropdown(String arg1) throws Throwable {
		contractDetailsPage.clickContractPricePopupImportDatesSectionPaxTypeDropdownOption(arg1);
	}
	
	@Then("^user sees the error message Cannot be greater than Price$")
	public void user_sees_the_error_message_Cannot_be_greater_than_Price() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[@title = 'Cannot be greater than Price.']")));
	}
	
	@Then("^user does not see the error message Cannot be greater than Price$")
	public void user_does_not_see_the_error_message_Cannot_be_greater_than_Price() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[@title = 'Cannot be greater than Price.']");
	}
	
	@Then("^user sees the error message Cannot be greater than Max Comm$")
	public void user_sees_the_error_message_Cannot_be_greater_than_Max_Comm() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[@title = 'Cannot be greater than Max Comm.']")));
	}
	
	@Then("^user sees the error message Cannot be less than Min Comm$")
	public void user_sees_the_error_message_Cannot_be_less_than_Min_Comm() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[@title = 'Cannot be less than Min Comm.']")));
	}
	
	@Then("^user does not see the error message Cannot be greater than Max Comm$")
	public void user_does_not_see_the_error_message_Cannot_be_greater_than_Max_Comm() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[@title = 'Cannot be greater than Max Comm.']");
	}
	
	@Then("^user does not see the error message Cannot be less than Min Comm$")
	public void user_does_not_see_the_error_message_Cannot_be_less_than_Min_Comm() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[@title = 'Cannot be less than Min Comm.']");
	}
	
	@Then("^user sees the itinerary template start date input field contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_template_start_date_input_field_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueItirenaryTemplatePopupStartDateInput(arg1);
	}
	
	@Then("^user sees the itinerary template end date input field contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_template_end_date_input_field_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueItirenaryTemplatePopupEndDateInput(arg1);
	}
	
	@Then("^user sees the itinerary template time input field contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_template_time_input_field_contains(String arg1) throws Throwable {
		contractDetailsPage.containsValueItirenaryTemplatePopupTimeInput(arg1);
	}
	
	@Then("^user sees an error message that contains the message Configurations already exists in contract$")
	public void user_sees_an_error_message_that_contains_the_message_Configurations_already_exists_in_contract() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[contains(text(), 'Configuration') and contains(text(), 'already exists in contract')]")));
	}
	
	@When("^user clicks on copy contract button of any contracts in the list$")
	public void user_clicks_on_copy_contract_button_of_any_contracts_in_the_list() throws Throwable {
		contractDetailsPage = contractsPage.clickTopRowDataCopyButton();
	}
	
	@When("^user checks if Add iterinary template button is disabled$")
	public void user_checks_if_Add_iterinary_template_button_is_disabled() throws Throwable {
		contractDetailsPage.disabledAddIterinaryTemplateButton();
	}
	
	@When("^user checks if Add rule button is disabled$")
	public void user_checks_if_Add_rule_button_is_disabled() throws Throwable {
		contractDetailsPage.disabledAddRuleButton();
	}
	
	@When("^user checks if Edit iterinary template button is disabled$")
	public void user_checks_if_Edit_iterinary_template_button_is_disabled() throws Throwable {
		contractDetailsPage.HiddenEditIterinaryTemplateButton();
	}
	
	@When("^user checks if Delete iterinary template button is disabled$")
	public void user_checks_if_Delete_iterinary_template_button_is_disabled() throws Throwable {
		contractDetailsPage.HiddenDeleteIterinaryTemplateButton();
	}
	
	@When("^user checks if Edit payment rule button is disabled$")
	public void user_checks_if_Edit_payment_rule_button_is_disabled() throws Throwable {
		contractDetailsPage.HiddenEditPaymentRuleButton();
	}
	
	@When("^user checks if Delete payment rule button is disabled$")
	public void user_checks_if_Delete_payment_rule_button_is_disabled() throws Throwable {
		contractDetailsPage.HiddenDeletePaymentRuleButton();
	}
	
	@When("^user searches for a contract with iterinary template and payment rule by id$")
	public void user_searches_for_a_contract_with_iterinary_template_and_payment_rule_by_id() throws Throwable {
		contractsPage.setIdInput(prop.getProperty("searchContractIdWithoutCosts"));
		contractsPage.clickFindButton();
		CommonFunctions.pause(10000, false);
	}
	
	@Then("^user sees feedback message a that the Queue Place Rule with the combinations given is already existing$")
	public void user_sees_feedback_message_a_that_the_Queue_Place_Rule_with_the_combinations_given_is_already_existing() throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayedContainsString("Queue Place Rule with ");
		CommonFunctions.checkFeedbackMessageDisplayedContainsString("Australia Domestic");
		CommonFunctions.checkFeedbackMessageDisplayedContainsString("Direct Customer");
		CommonFunctions.checkFeedbackMessageDisplayedContainsString(" already exists.");
	}
	
	@Then("^user checks if the default value for pax type dropdown on cost import date is not set$")
	public void user_checks_if_the_default_value_for_pax_type_dropdown_on_cost_import_date_is_not_set() throws Throwable {
		contractDetailsPage.DefaultPaxTypeDropdownNoDefaultValueImportDatesSection_CostPaxType();
	}
	
	@When("^user selects Import from price$")
	public void user_selects_Import_from_price() throws Throwable {
		contractDetailsPage.clickContractPricePopupPriceRadioBtn();
		CommonFunctions.pause(10000, false);
	}
	
	@Then("^user checks if the default value for pax type dropdown on price import date is not set$")
	public void user_checks_if_the_default_value_for_pax_type_dropdown_on_price_import_date_is_not_set() throws Throwable {
		contractDetailsPage.DefaultPaxTypeDropdownNoDefaultValueImportDatesSection_PricePaxType();
	}
	
	@Then("^user checks if the default value for pax type dropdown is not set$")
	public void user_checks_if_the_default_value_for_pax_type_dropdown_is_not_set() throws Throwable {
		contractDetailsPage.DefaultPaxTypeDropdownNoDefaultValue();
	}
	
	@Then("^user checks if the default value for pax type dropdown is set to adult$")
	public void user_checks_if_the_default_value_for_pax_type_dropdown_is_set_to_adult() throws Throwable {
		contractDetailsPage.DefaultPaxTypeDropdownValueForHotel();
	}
	
	@Then("^user checks if the default value for pax type dropdown on price import date is set to adult$")
	public void user_checks_if_the_default_value_for_pax_type_dropdown_on_price_import_date_is_set_to_adult() throws Throwable {
		contractDetailsPage.DefaultPaxTypeDropdownValueForHotelImportFromPrice();
	}
	
	@Then("^user checks if import from price field value is null$")
	public void user_checks_if_import_from_price_field_value_is_null() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@id, 'PriceImportInput')]//div//div)[1]")).getText().isEmpty());
		Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@id, 'PriceImportInput')]//div//div)[2]")).getText().isEmpty());
		Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@id, 'PriceImportInput')]//div//div)[3]")).getText().isEmpty());
		Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(@id, 'PriceImportInput')]//div//div)[4]")).getText().isEmpty());
	}
	
	@When("^user selects Import from cost$")
	public void user_selects_Import_from_cost() throws Throwable {
		contractDetailsPage.clickContractPricePopupCostRadioBtn();
		CommonFunctions.pause(10000, false);
	}
	
	@Then("^user checks if the default value for pax type dropdown on cost import date is set to adult$")
	public void user_checks_if_the_default_value_for_pax_type_dropdown_on_cost_import_date_is_set_to_adult() throws Throwable {
		contractDetailsPage.DefaultPaxTypeDropdownValueForHotelImportFromCost();
	}
	
	@Then("^user checks if import from price field value is contains to \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_checks_if_import_from_price_field_value_is_contains_to(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		Assert.assertEquals(arg1, driver.findElement(By.xpath("(//div[contains(@id, 'PriceImportInput')]//div//div)[1]")).getText());
		Assert.assertEquals(arg2, driver.findElement(By.xpath("(//div[contains(@id, 'PriceImportInput')]//div//div)[2]")).getText());
		Assert.assertEquals(arg3, driver.findElement(By.xpath("(//div[contains(@id, 'PriceImportInput')]//div//div)[3]")).getText());
		Assert.assertEquals(arg4, driver.findElement(By.xpath("(//div[contains(@id, 'PriceImportInput')]//div//div)[4]")).getText());
	}
	
	@When("^user hovers over a certain cell that is not empty in the contract price table$")
	public void user_hovers_over_a_certain_cell_that_is_not_empty_in_the_contract_price_table() throws Throwable {
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(((//div[contains(@id, 'MainContractPriceContainer')]//div[@class = 'WebBlockMainContainer'])[1]//div[@ref = 'eBodyViewport']//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]//div[@col-id = 'MaximumCommission']//following-sibling::div[@role = 'gridcell'])[1]")));
		CommonFunctions.pause(2500, false);
	}
	
	@When("^user opens the contract price edit custom dates section$")
	public void user_opens_the_contract_price_edit_custom_dates_section() throws Throwable {
		contractDetailsPage.clickContractPricePopupEditCustomDatesTabLabel();
	}
	
	@Then("^user checks if the default value for pax type dropdown is equal to category two of the chosen price configuration$")
	public void user_checks_if_the_default_value_for_pax_type_dropdown_is_equal_to_category_two_of_the_chosen_price_configuration() throws Throwable {
		contractDetailsPage.DefaultPaxTypeDropdownValueForCoach();
	}
	
	@When("^user click add to table button$")
	public void user_click_add_to_table_button() throws Throwable {
		contractDetailsPage.ClickAddToTableButton();
	}
	
	@Then("^user sees error message for no existing cost in adding custom price$")
	public void user_sees_error_message_for_no_existing_cost_in_adding_custom_price() throws Throwable {
		contractDetailsPage.DisplayediIcon();
		CommonFunctions.textVisibleInPage("Price does not exist for entered criteria");
		contractDetailsPage.ClickiIcon();
		CommonFunctions.switchFrameByXPath("//div[text()='Error message(s)']");
		CommonFunctions.textVisibleInPage("Error message(s)");
		// CommonFunctions.textVisibleInPage("No cost exist for:");
		// CommonFunctions.textVisibleInPage("Adult: 01 Oct 2002 - 31 Aug 2007");
	}
	
	@When("^user search for future batch number \"([^\"]*)\"$")
	public void user_search_for_future_batch_number(String arg1) throws Throwable {
		priceMaintenancePage.clickRadioFuture();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickBatchNumber();
		priceMaintenancePage.enterBatchNumberFuture(arg1);
		CommonFunctions.pause(3000, false);
	}
	
	@When("^user open update effective date and time popup$")
	public void user_open_update_effective_date_and_time_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//table[contains(@id,'PriceMaintenanceTable')]//a[contains(@id,'EditLink')]")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Update Effective Date and Time']");
	}
	
	@Then("^user sees fields displayed in textual fashion for price maintenance page$")
	public void user_sees_fields_displayed_in_textual_fashion_for_price_maintenance_page() throws Throwable {
		priceMaintenancePage.CheckFieldsDisplayedinTextualFashionPriceMaintenance();
	}
	
	@Then("^user checks contract id and contract name$")
	public void user_checks_contract_id_and_contract_name() throws Throwable {
		CommonFunctions.textVisibleInPage("41376");
		CommonFunctions.textVisibleInPage("ms AmaReina -- Concerto Class - 14 Night Cruise");
	}
	
	@Then("^user checks price maintenance popup fields$")
	public void user_checks_price_maintenance_popup_fields() throws Throwable {
		priceMaintenancePage.CheckFieldsDisplayedinPriceMaintenanacePopup();
	}
	
	@When("^user enter invalid data in the price maintenance popup$")
	public void user_enter_invalid_data_in_the_price_maintenance_popup() throws Throwable {
		priceMaintenancePage.ValidateFieldsinPriceMaintenanacePopup();
	}
	
	@When("^user enter effective date greater than the end date$")
	public void user_enter_effective_date_greater_than_the_end_date() throws Throwable {
		priceMaintenancePage.enterEffectiveDateGreaterthanEndDate();
	}
	
	@When("^user enter valid effective date error message is not displayed$")
	public void user_enter_valid_effective_date_error_message_is_not_displayed() throws Throwable {
		priceMaintenancePage.enterValidEffectiveDate();
	}
	
	@When("^user enter invalid effective time$")
	public void user_enter_invalid_effective_time() throws Throwable {
		priceMaintenancePage.enterInvalidEffectiveTime();
	}
	
	@When("^effective date and time are mandatory fields$")
	public void effective_date_and_time_are_mandatory_fields() throws Throwable {
		priceMaintenancePage.validateThatFieldsAreMandatory();
	}
	
	@When("^user successfully updated a price$")
	public void user_successfully_updated_a_price() throws Throwable {
		priceMaintenancePage.successfullyUpdatePrice();
		CommonFunctions.pause(5000, false);
		CommonFunctions.textVisibleInPage("15 Sep 2020 09:09 AM");
	}
	
	@Then("^user click cancel button or close icon then price maintenance popup disappear$")
	public void user_click_cancel_button_or_close_icon_then_price_maintenance_popup_disappear() throws Throwable {
		priceMaintenancePage.closeOrCancelPriceUpdate();
	}
	
	@When("^user enter valid effective time error message is not displayed$")
	public void user_enter_valid_effective_time_error_message_is_not_displayed() throws Throwable {
		priceMaintenancePage.enterValidEffectiveTime();
	}
	
	@When("^user clicks on edit icon in the contract prices$")
	public void user_clicks_on_edit_icon_in_the_contract_prices() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(((//div[contains(@id, 'MainContractPriceContainer')]//div[@class = 'WebBlockMainContainer'])[1]//div[@ref = 'eBodyViewport']//div[@ref = 'eCenterColsClipper']//div[@role = 'row'])[1]//div[@col-id = 'MaximumCommission']//following-sibling::div[@role = 'gridcell'])[1]//span[@title = 'Edit Price']")));
		CommonFunctions.pause(10000, false);
	}
	
	@Then("^user sees notification prompt regarding non commission$")
	public void user_sees_notification_prompt_regarding_non_commission() throws Throwable {
		CommonFunctions.switchFrameByXPath("//div[contains(@id,'MessangePlaceholder')]");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Please update Non-commission if required']")));
	}
	
	@When("^user close notification prompt regarding non commission$")
	public void user_close_notification_prompt_regarding_non_commission() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id,'ClosePlaceholder')]")));
	}
	
	@Then("^user sees in itinerary template start and end date fields validation message$")
	public void user_sees_in_itinerary_template_start_and_end_date_fields_validation_message() throws Throwable {
		contractDetailsPage.displayedItineraryStartDateValidationMessage();
		contractDetailsPage.displayedItineraryEndDateValidationMessage();
	}
	
	@Then("^user sees the added price in the contract prices table$")
	public void user_sees_the_added_price_in_the_contract_prices_table() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id,'PricesContainer')]//div[contains(@id,'GridCont')]//div[@class='wj-row'][10]//div[text()='EUR']")));
	}
	
	@Then("^user sees the update contract basic information fields tooltips when hovered$")
	public void user_sees_the_update_contract_basic_information_fields_tooltips_when_hovered() throws Throwable {
		contractDetailsPage.hoverUpdateBasicInformationPopupContractNameInput();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@data-tip, 'Hotel Grand Chancellor')]")));
		contractDetailsPage.hoverUpdateBasicInformationPopupSupplierInput();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@data-tip, 'Hotel Grand Chancellor Hobart (277)')]")));
		contractDetailsPage.hoverUpdateBasicInformationPopupDepartmentDropdown();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@data-tip, 'APT Cheltenham - Tour Operations')]")));
	}
	// End - Contract Details Page Functions
	
	// Start - Contract Costs Details Page Functions
	@When("^user opens the add cost popup$")
	public void user_opens_the_add_cost_popup() throws Throwable {
		contractCostsDetailsPage.clickAddCostButton();
	}
	
	@Then("^user sees the add contract costs fields and buttons with its default values for the contract type \"([^\"]*)\"$")
	public void user_sees_the_add_contract_costs_fields_and_buttons_with_its_default_values_for_the_contract_type(String arg1) throws Throwable {
		// String[] expectedGuestConfigurationValuesFew = { "Per Person", "Per Item" };
		// String[] expectedGuestConfigurationValuesMany = { "Twin", "Double", "Single", "Crew - Single", "Triple", "Twin - 1 Adult & 1 Child", "Triple - 2 Adults & 1 Child", "Triple - 1 Adult & 2
		// Children", "Quad", "Quad - 2 Adults & 2 Children", "Crew - Twin", "Crew - Double", "Crew - Quad", "Multi Share", "Crew - Multi Share" };
		
		if (arg1.contains("Coach")) {
			contractCostsDetailsPage.displayedConfigurationDetailsSectionGuestConfigurationSingleSelectDropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory1Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory2Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMinimumPaxInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumPaxInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumChildAgeInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionViewButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionImportButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionAddButton();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopDeleteSeasonGroupButtonRowData();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopSeasonGroupLinkRowData();
			contractCostsDetailsPage.displayedDateRangesSectionAddDateRangeButton();
			// contractCostsDetailsPage.displayedDateRangesSectionDateRangesTable();
			contractCostsDetailsPage.displayedCostsSectionAddCostButton();
			// contractCostsDetailsPage.displayedCostsSectionCostsTable();
			contractCostsDetailsPage.displayedTopCloseButton();
			contractCostsDetailsPage.displayedTopSaveCostsButton();
			// contractCostsDetailsPage.checkConfigurationDetailsSectionGuestConfigurationDropdownOptions(expectedGuestConfigurationValuesFew);
		}
		else if (arg1.contains("Cruise")) {
			contractCostsDetailsPage.displayedConfigurationDetailsSectionGuestConfigurationDropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory1Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory2Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMinimumDaysInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumDaysInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumChildAgeInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionViewButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionImportButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionAddButton();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopDeleteSeasonGroupButtonRowData();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopSeasonGroupLinkRowData();
			contractCostsDetailsPage.displayedDateRangesSectionAddDateRangeButton();
			// contractCostsDetailsPage.displayedDateRangesSectionDateRangesTable();
			contractCostsDetailsPage.displayedCostsSectionAddCostButton();
			// contractCostsDetailsPage.displayedCostsSectionCostsTable();
			// contractCostsDetailsPage.displayedCostsSectionTopDeleteCostButtonRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopCostTypeDropdownRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopEstimatedActualDropdownRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopQuantityInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopRateTypeDropdownRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopCostInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopTaxInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopGSTInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopNumberOfDaysInputRowData();
			contractCostsDetailsPage.displayedTopCloseButton();
			contractCostsDetailsPage.displayedTopSaveCostsButton();
			// contractCostsDetailsPage.containsValueCostsSectionTopCostTypeDropdownRowData("Adult");
			// contractCostsDetailsPage.containsValueCostsSectionTopEstimatedActualDropdownRowData("Actual");
			// contractCostsDetailsPage.containsValueCostsSectionTopQuantityInputRowData("1");
			// contractCostsDetailsPage.containsValueCostsSectionTopRateTypeDropdownRowData("Per Day");
			// contractCostsDetailsPage.containsValueCostsSectionTopCostInputRowData("0.00");
			// contractCostsDetailsPage.containsValueCostsSectionTopTaxInputRowData("0.00");
			// contractCostsDetailsPage.containsValueCostsSectionTopGSTInputRowData("0.00");
			// contractCostsDetailsPage.checkConfigurationDetailsSectionGuestConfigurationDropdownOptions(expectedGuestConfigurationValuesMany);
		}
		else if (arg1.contains("Foreign Operator / Land")) {
			contractCostsDetailsPage.displayedConfigurationDetailsSectionGuestConfigurationDropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory1Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory2Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMinimumPaxInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumPaxInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumChildAgeInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionViewButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionImportButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionAddButton();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopDeleteSeasonGroupButtonRowData();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopSeasonGroupLinkRowData();
			contractCostsDetailsPage.displayedDateRangesSectionAddDateRangeButton();
			// contractCostsDetailsPage.displayedDateRangesSectionDateRangesTable();
			contractCostsDetailsPage.displayedCostsSectionAddCostButton();
			// contractCostsDetailsPage.displayedCostsSectionCostsTable();
			// contractCostsDetailsPage.displayedCostsSectionTopDeleteCostButtonRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopCostTypeDropdownRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopEstimatedActualDropdownRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopQuantityInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopRateTypeDropdownRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopCostInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopTaxInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopGSTInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopNumberOfDaysInputRowData();
			contractCostsDetailsPage.displayedTopCloseButton();
			contractCostsDetailsPage.displayedTopSaveCostsButton();
			// contractCostsDetailsPage.containsValueCostsSectionTopCostTypeDropdownRowData("Adult");
			// contractCostsDetailsPage.containsValueCostsSectionTopEstimatedActualDropdownRowData("Actual");
			// contractCostsDetailsPage.containsValueCostsSectionTopQuantityInputRowData("1");
			// contractCostsDetailsPage.containsValueCostsSectionTopRateTypeDropdownRowData("Per Day");
			// contractCostsDetailsPage.containsValueCostsSectionTopCostInputRowData("0.00");
			// contractCostsDetailsPage.containsValueCostsSectionTopTaxInputRowData("0.00");
			// contractCostsDetailsPage.containsValueCostsSectionTopGSTInputRowData("0.00");
			// contractCostsDetailsPage.checkConfigurationDetailsSectionGuestConfigurationDropdownOptions(expectedGuestConfigurationValuesMany);
		}
		else if (arg1.contains("Hotel")) {
			contractCostsDetailsPage.displayedConfigurationDetailsSectionGuestConfigurationDropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory1Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory2Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMinimumNightsInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumNightsInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumChildAgeInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionViewButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionImportButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionAddButton();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopDeleteSeasonGroupButtonRowData();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopSeasonGroupLinkRowData();
			contractCostsDetailsPage.displayedDateRangesSectionAddDateRangeButton();
			// contractCostsDetailsPage.displayedDateRangesSectionDateRangesTable();
			contractCostsDetailsPage.displayedCostsSectionAddCostButton();
			// contractCostsDetailsPage.displayedCostsSectionCostsTable();
			// contractCostsDetailsPage.displayedCostsSectionTopDeleteCostButtonRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopCostTypeDropdownRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopEstimatedActualDropdownRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopQuantityInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopRateTypeDropdownRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopCostInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopTaxInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopGSTInputRowData();
			// contractCostsDetailsPage.displayedCostsSectionTopNumberOfDaysInputRowData();
			contractCostsDetailsPage.displayedTopCloseButton();
			contractCostsDetailsPage.displayedTopSaveCostsButton();
			// contractCostsDetailsPage.containsValueCostsSectionTopCostTypeDropdownRowData("Adult");
			// contractCostsDetailsPage.containsValueCostsSectionTopEstimatedActualDropdownRowData("Actual");
			// contractCostsDetailsPage.containsValueCostsSectionTopQuantityInputRowData("1");
			// contractCostsDetailsPage.containsValueCostsSectionTopRateTypeDropdownRowData("Per Day");
			// contractCostsDetailsPage.containsValueCostsSectionTopCostInputRowData("0.00");
			// contractCostsDetailsPage.containsValueCostsSectionTopTaxInputRowData("0.00");
			// contractCostsDetailsPage.containsValueCostsSectionTopGSTInputRowData("0.00");
			// contractCostsDetailsPage.checkConfigurationDetailsSectionGuestConfigurationDropdownOptions(expectedGuestConfigurationValuesMany);
		}
		else if (arg1.contains("Miscellaneous")) {
			contractCostsDetailsPage.displayedConfigurationDetailsSectionGuestConfigurationSingleSelectDropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory1Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory2Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMinimumPaxInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumPaxInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumChildAgeInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionViewButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionImportButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionAddButton();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopDeleteSeasonGroupButtonRowData();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopSeasonGroupLinkRowData();
			contractCostsDetailsPage.displayedDateRangesSectionAddDateRangeButton();
			// contractCostsDetailsPage.displayedDateRangesSectionDateRangesTable();
			contractCostsDetailsPage.displayedCostsSectionAddCostButton();
			// contractCostsDetailsPage.displayedCostsSectionCostsTable();
			contractCostsDetailsPage.displayedTopCloseButton();
			contractCostsDetailsPage.displayedTopSaveCostsButton();
			// contractCostsDetailsPage.checkConfigurationDetailsSectionGuestConfigurationDropdownOptions(expectedGuestConfigurationValuesFew);
		}
		else if (arg1.contains("Rail")) {
			contractCostsDetailsPage.displayedConfigurationDetailsSectionGuestConfigurationDropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory1Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory2Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMinimumDaysInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumDaysInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumChildAgeInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionViewButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionImportButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionAddButton();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopDeleteSeasonGroupButtonRowData();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopSeasonGroupLinkRowData();
			contractCostsDetailsPage.displayedDateRangesSectionAddDateRangeButton();
			// contractCostsDetailsPage.displayedDateRangesSectionDateRangesTable();
			contractCostsDetailsPage.displayedCostsSectionAddCostButton();
			// contractCostsDetailsPage.displayedCostsSectionCostsTable();
			contractCostsDetailsPage.displayedTopCloseButton();
			contractCostsDetailsPage.displayedTopSaveCostsButton();
			// contractCostsDetailsPage.containsValueCostsSectionTopCostTypeDropdownRowData("Adult");
			// contractCostsDetailsPage.containsValueCostsSectionTopEstimatedActualDropdownRowData("Actual");
			// contractCostsDetailsPage.containsValueCostsSectionTopQuantityInputRowData("1");
			// contractCostsDetailsPage.containsValueCostsSectionTopRateTypeDropdownRowData("Per Day");
			// contractCostsDetailsPage.containsValueCostsSectionTopCostInputRowData("0.00");
			// contractCostsDetailsPage.containsValueCostsSectionTopTaxInputRowData("0.00");
			// contractCostsDetailsPage.containsValueCostsSectionTopGSTInputRowData("0.00");
			// contractCostsDetailsPage.checkConfigurationDetailsSectionGuestConfigurationDropdownOptions(expectedGuestConfigurationValuesMany);
		}
		else if (arg1.contains("Transfer")) {
			contractCostsDetailsPage.displayedConfigurationDetailsSectionGuestConfigurationSingleSelectDropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory1Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionCategory2Dropdown();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMinimumPaxInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumPaxInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionMaximumChildAgeInput();
			contractCostsDetailsPage.displayedConfigurationDetailsSectionViewButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionImportButton();
			contractCostsDetailsPage.displayedSeasonGroupsSectionAddButton();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopDeleteSeasonGroupButtonRowData();
			// contractCostsDetailsPage.displayedSeasonGroupsSectionTopSeasonGroupLinkRowData();
			contractCostsDetailsPage.displayedDateRangesSectionAddDateRangeButton();
			// contractCostsDetailsPage.displayedDateRangesSectionDateRangesTable();
			contractCostsDetailsPage.displayedCostsSectionAddCostButton();
			// contractCostsDetailsPage.displayedCostsSectionCostsTable();
			contractCostsDetailsPage.displayedTopCloseButton();
			contractCostsDetailsPage.displayedTopSaveCostsButton();
			// contractCostsDetailsPage.checkConfigurationDetailsSectionGuestConfigurationDropdownOptions(expectedGuestConfigurationValuesFew);
		}
	}
	
	@When("^user closes the contract costs details page$")
	public void user_closes_the_contract_costs_details_page() throws Throwable {
		contractDetailsPage = contractCostsDetailsPage.clickTopCloseButton();
	}
	
	@When("^user cancels the closing of the contract costs details page$")
	public void user_cancels_the_closing_of_the_contract_costs_details_page() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'Cancel']"));
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user confirms the closing of the contract costs details page$")
	public void user_confirms_the_closing_of_the_contract_costs_details_page() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'OK']"));
		CommonFunctions.pause(10000, false);
	}
	
	@Then("^user sees the add cost popup fields and buttons with its default values for the contract type \"([^\"]*)\"$")
	public void user_sees_the_add_cost_popup_fields_and_buttons_with_its_default_values_for_the_contract_type(String arg1) throws Throwable {
		if (arg1.contains("Coach")) {
			contractCostsDetailsPage.displayedAddCostPopupCostTypeDropdown();
			contractCostsDetailsPage.displayedAddCostPopupEstimatedActualDropdown();
			contractCostsDetailsPage.displayedAddCostPopupQuantityInput();
			contractCostsDetailsPage.displayedAddCostPopupCostInput();
			contractCostsDetailsPage.displayedAddCostPopupTaxInput();
			contractCostsDetailsPage.displayedAddCostPopupGSTInput();
			contractCostsDetailsPage.displayedAddCostPopupPerDayRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupPerDurationRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupNumberOfDaysInput();
			contractCostsDetailsPage.checkAddCostPopupPerDayRadioButtonIsToggled();
			contractCostsDetailsPage.checkAddCostPopupPerDurationRadioButtonIsNotToggled();
			contractCostsDetailsPage.disabledAddCostPopupNumberOfDaysInput();
		}
		else if (arg1.contains("Cruise")) {
			contractCostsDetailsPage.displayedAddCostPopupCostTypeDropdown();
			contractCostsDetailsPage.displayedAddCostPopupEstimatedActualDropdown();
			contractCostsDetailsPage.displayedAddCostPopupQuantityInput();
			contractCostsDetailsPage.displayedAddCostPopupCostInput();
			contractCostsDetailsPage.displayedAddCostPopupTaxInput();
			contractCostsDetailsPage.displayedAddCostPopupGSTInput();
			contractCostsDetailsPage.displayedAddCostPopupPerDayRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupPerDurationRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupNumberOfDaysInput();
			contractCostsDetailsPage.checkAddCostPopupPerDayRadioButtonIsNotToggled();
			contractCostsDetailsPage.checkAddCostPopupPerDurationRadioButtonIsToggled();
			contractCostsDetailsPage.disabledAddCostPopupNumberOfDaysInput();
		}
		else if (arg1.contains("Foreign Operator / Land")) {
			contractCostsDetailsPage.displayedAddCostPopupCostTypeDropdown();
			contractCostsDetailsPage.displayedAddCostPopupEstimatedActualDropdown();
			contractCostsDetailsPage.displayedAddCostPopupQuantityInput();
			contractCostsDetailsPage.displayedAddCostPopupCostInput();
			contractCostsDetailsPage.displayedAddCostPopupTaxInput();
			contractCostsDetailsPage.displayedAddCostPopupGSTInput();
			contractCostsDetailsPage.displayedAddCostPopupPerDayRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupPerDurationRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupNumberOfDaysInput();
			contractCostsDetailsPage.checkAddCostPopupPerDayRadioButtonIsNotToggled();
			contractCostsDetailsPage.checkAddCostPopupPerDurationRadioButtonIsToggled();
			contractCostsDetailsPage.disabledAddCostPopupNumberOfDaysInput();
		}
		else if (arg1.contains("Hotel")) {
			contractCostsDetailsPage.displayedAddCostPopupCostTypeDropdown();
			contractCostsDetailsPage.displayedAddCostPopupEstimatedActualDropdown();
			contractCostsDetailsPage.displayedAddCostPopupQuantityInput();
			contractCostsDetailsPage.displayedAddCostPopupCostInput();
			contractCostsDetailsPage.displayedAddCostPopupTaxInput();
			contractCostsDetailsPage.displayedAddCostPopupGSTInput();
			contractCostsDetailsPage.displayedAddCostPopupPerDayRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupPerDurationRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupNumberOfDaysInput();
			contractCostsDetailsPage.checkAddCostPopupPerDayRadioButtonIsToggled();
			contractCostsDetailsPage.checkAddCostPopupPerDurationRadioButtonIsNotToggled();
			contractCostsDetailsPage.disabledAddCostPopupNumberOfDaysInput();
		}
		else if (arg1.contains("Miscellaneous")) {
			contractCostsDetailsPage.displayedAddCostPopupCostTypeDropdown();
			contractCostsDetailsPage.displayedAddCostPopupEstimatedActualDropdown();
			contractCostsDetailsPage.displayedAddCostPopupQuantityInput();
			contractCostsDetailsPage.displayedAddCostPopupCostInput();
			contractCostsDetailsPage.displayedAddCostPopupTaxInput();
			contractCostsDetailsPage.displayedAddCostPopupGSTInput();
			contractCostsDetailsPage.displayedAddCostPopupPerDayRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupPerDurationRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupNumberOfDaysInput();
			contractCostsDetailsPage.checkAddCostPopupPerDayRadioButtonIsToggled();
			contractCostsDetailsPage.checkAddCostPopupPerDurationRadioButtonIsNotToggled();
			contractCostsDetailsPage.disabledAddCostPopupNumberOfDaysInput();
		}
		else if (arg1.contains("Rail")) {
			contractCostsDetailsPage.displayedAddCostPopupCostTypeDropdown();
			contractCostsDetailsPage.displayedAddCostPopupEstimatedActualDropdown();
			contractCostsDetailsPage.displayedAddCostPopupQuantityInput();
			contractCostsDetailsPage.displayedAddCostPopupCostInput();
			contractCostsDetailsPage.displayedAddCostPopupTaxInput();
			contractCostsDetailsPage.displayedAddCostPopupGSTInput();
			contractCostsDetailsPage.displayedAddCostPopupPerDayRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupPerDurationRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupNumberOfDaysInput();
			contractCostsDetailsPage.checkAddCostPopupPerDayRadioButtonIsNotToggled();
			contractCostsDetailsPage.checkAddCostPopupPerDurationRadioButtonIsToggled();
			contractCostsDetailsPage.disabledAddCostPopupNumberOfDaysInput();
		}
		else if (arg1.contains("Transfer")) {
			contractCostsDetailsPage.displayedAddCostPopupCostTypeDropdown();
			contractCostsDetailsPage.displayedAddCostPopupEstimatedActualDropdown();
			contractCostsDetailsPage.displayedAddCostPopupQuantityInput();
			contractCostsDetailsPage.displayedAddCostPopupCostInput();
			contractCostsDetailsPage.displayedAddCostPopupTaxInput();
			contractCostsDetailsPage.displayedAddCostPopupGSTInput();
			contractCostsDetailsPage.displayedAddCostPopupPerDayRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupPerDurationRadioButton();
			contractCostsDetailsPage.displayedAddCostPopupNumberOfDaysInput();
			contractCostsDetailsPage.checkAddCostPopupPerDayRadioButtonIsToggled();
			contractCostsDetailsPage.checkAddCostPopupPerDurationRadioButtonIsNotToggled();
			contractCostsDetailsPage.disabledAddCostPopupNumberOfDaysInput();
		}
	}
	
	@When("^user adds the cost$")
	public void user_adds_the_cost() throws Throwable {
		contractCostsDetailsPage.clickAddCostPopupAddButton();
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the cost detail cost type dropdown$")
	public void user_ticks_the_option_of_the_cost_detail_cost_type_dropdown(String arg1) throws Throwable {
		contractCostsDetailsPage.selectAddCostPopupCostTypeDropdownValue(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the cost detail quantity field$")
	public void user_puts_in_the_cost_detail_quantity_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setAddCostPopupQuantityInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the cost detail cost field$")
	public void user_puts_in_the_cost_detail_cost_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setAddCostPopupCostInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the cost detail tax field$")
	public void user_puts_in_the_cost_detail_tax_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setAddCostPopupTaxInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the cost detail gst field$")
	public void user_puts_in_the_cost_detail_gst_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setAddCostPopupGSTInput(arg1);
	}
	
	@Then("^user sees that the cost detail quantity field contains \"([^\"]*)\"$")
	public void user_sees_that_the_cost_detail_quantity_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueAddCostPopupQuantityInput(arg1);
	}
	
	@Then("^user sees that the cost detail cost field contains \"([^\"]*)\"$")
	public void user_sees_that_the_cost_detail_cost_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueAddCostPopupCostInput(arg1);
	}
	
	@Then("^user sees that the cost detail tax field contains \"([^\"]*)\"$")
	public void user_sees_that_the_cost_detail_tax_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueAddCostPopupTaxInput(arg1);
	}
	
	@Then("^user sees that the cost detail gst field contains \"([^\"]*)\"$")
	public void user_sees_that_the_cost_detail_gst_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueAddCostPopupGSTInput(arg1);
	}
	
	@When("^user cancels the addition of the new cost$")
	public void user_cancels_the_addition_of_the_new_cost() throws Throwable {
		contractCostsDetailsPage.clickAddCostPopupCancelButton();
	}
	
	@When("^user cancels the cancellation of the addition of the new cost$")
	public void user_cancels_the_cancellation_of_the_addition_of_the_new_cost() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'Cancel']"));
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Add Cost']");
	}
	
	@Then("^user sees the add cost popup$")
	public void user_sees_the_add_cost_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Add Cost']")));
	}
	
	@When("^user confirms the cancellation of the addition of the new cost$")
	public void user_confirms_the_cancellation_of_the_addition_of_the_new_cost() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'OK']"));
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user does not see the add cost popup$")
	public void user_does_not_see_the_add_cost_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[text() = 'Add Cost']");
	}
	
	@Then("^user sees the newly added cost in the costs table$")
	public void user_sees_the_newly_added_cost_in_the_costs_table() throws Throwable {
		CommonFunctions.textVisibleInPage("Pensioner");
	}
	
	@When("^user deletes the first cost in the contract costs table$")
	public void user_deletes_the_first_cost_in_the_contract_costs_table() throws Throwable {
		contractCostsDetailsPage.clickCostsSectionTopDeleteCostButtonRowData();
	}
	
	@Then("^user does not see the cost deleted in the contract costs table$")
	public void user_does_not_see_the_cost_deleted_in_the_contract_costs_table() throws Throwable {
		contractCostsDetailsPage.containsValueCostsSectionTopCostTypeDropdownRowData("Pensioner");
	}
	
	@When("^user ticks the per duration option as the rate type of the new cost$")
	public void user_ticks_the_per_duration_option_as_the_rate_type_of_the_new_cost() throws Throwable {
		contractCostsDetailsPage.clickAddCostPopupPerDurationRadioButton();
	}
	
	@Then("^user sees the number of days enabled and with default value of 1$")
	public void user_sees_the_number_of_days_enabled_and_with_default_value_of_1() throws Throwable {
		contractCostsDetailsPage.enabledAddCostPopupNumberOfDaysInput();
		contractCostsDetailsPage.containsValueAddCostPopupNumberOfDaysInput("1");
	}
	
	@Then("^user sees the number of days disabled$")
	public void user_sees_the_number_of_days_disabled() throws Throwable {
		contractCostsDetailsPage.disabledAddCostPopupNumberOfDaysInput();
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract cost configuration detail guest configuration dropdown$")
	public void user_ticks_the_option_of_the_contract_cost_configuration_detail_guest_configuration_dropdown(String arg1) throws Throwable {
		contractCostsDetailsPage.clickConfigurationDetailsSectionGuestConfigurationDropdownOption(arg1);
	}
	
	@When("^user selects the \"([^\"]*)\" option of the contract cost configuration detail guest configuration dropdown$")
	public void user_selects_the_option_of_the_contract_cost_configuration_detail_guest_configuration_dropdown(String arg1) throws Throwable {
		contractCostsDetailsPage.selectConfigurationDetailsSectionGuestConfigurationSingleSelectDropdown(arg1);
	}
	
	@Then("^user sees the contract cost configuration detail guest configuration dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_contract_cost_configuration_detail_guest_configuration_dropdown_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueConfigurationDetailsSectionGuestConfigurationDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract cost configuration detail category 1 dropdown$")
	public void user_ticks_the_option_of_the_contract_cost_configuration_detail_category_1_dropdown(String arg1) throws Throwable {
		contractCostsDetailsPage.clickConfigurationDetailsSectionCategory1DropdownOption(arg1);
	}
	
	@Then("^user sees the contract cost configuration detail category 1 dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_contract_cost_configuration_detail_category_1_dropdown_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueConfigurationDetailsSectionCategory1Dropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract cost configuration detail category 2 dropdown$")
	public void user_ticks_the_option_of_the_contract_cost_configuration_detail_category_2_dropdown(String arg1) throws Throwable {
		contractCostsDetailsPage.clickConfigurationDetailsSectionCategory2DropdownOption(arg1);
	}
	
	@Then("^user sees the contract cost configuration detail category 2 dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_contract_cost_configuration_detail_category_2_dropdown_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueConfigurationDetailsSectionCategory2Dropdown(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost configuration detail maximum child age field$")
	public void user_puts_in_the_contract_cost_configuration_detail_maximum_child_age_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setConfigurationDetailsSectionMaximumChildAgeInput(arg1);
	}
	
	@Then("^user sees that the contract cost configuration detail maximum child age field contains \"([^\"]*)\"$")
	public void user_sees_that_the_contract_cost_configuration_detail_maximum_child_age_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueConfigurationDetailsSectionMaximumChildAgeInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost configuration detail minimum pax field$")
	public void user_puts_in_the_contract_cost_configuration_detail_minimum_pax_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setConfigurationDetailsSectionMinimumPaxInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost configuration detail maximum pax field$")
	public void user_puts_in_the_contract_cost_configuration_detail_maximum_pax_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setConfigurationDetailsSectionMaximumPaxInput(arg1);
	}
	
	@When("^user saves the contract costs$")
	public void user_saves_the_contract_costs() throws Throwable {
		contractCostsDetailsPage.clickTopSaveButton();
	}
	
	@Then("^user sees an error message that contains the message minimum pax value cant be greater than the maximum pax value$")
	public void user_sees_an_error_message_that_contains_the_message_minimum_pax_value_cant_be_greater_than_the_maximum_pax_value() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[contains(text(), 'Minimum Pax can') and contains(text(), 't be greater than Maximum Pax')]")));
	}
	
	@Then("^user does not see the error message that contains the message minimum pax value cant be greater than the maximum pax value$")
	public void user_does_not_see_the_error_message_that_contains_the_message_minimum_pax_value_cant_be_greater_than_the_maximum_pax_value() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[contains(text(), 'Minimum Pax can') and contains(text(), 't be greater than Maximum Pax')]");
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost configuration detail minimum days field$")
	public void user_puts_in_the_contract_cost_configuration_detail_minimum_days_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setConfigurationDetailsSectionMinimumDaysInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost configuration detail maximum days field$")
	public void user_puts_in_the_contract_cost_configuration_detail_maximum_days_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setConfigurationDetailsSectionMaximumDaysInput(arg1);
	}
	
	@Then("^user sees an error message that contains the message minimum days value cant be greater than the maximum days value$")
	public void user_sees_an_error_message_that_contains_the_message_minimum_days_value_cant_be_greater_than_the_maximum_days_value() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[contains(text(), 'Minimum Days can') and contains(text(), 't be greater than Maximum Days')]")));
	}
	
	@Then("^user does not see the error message that contains the message minimum days value cant be greater than the maximum days value$")
	public void user_does_not_see_the_error_message_that_contains_the_message_minimum_days_value_cant_be_greater_than_the_maximum_days_value() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[contains(text(), 'Minimum Nights Days') and contains(text(), 't be greater than Maximum Days')]");
	}
	
	@Then("^user sees the contract cost configuration detail category 1 dropdown disabled$")
	public void user_sees_the_contract_cost_configuration_detail_category_1_dropdown_disabled() throws Throwable {
		contractCostsDetailsPage.disabledConfigurationDetailsSectionCategory1Dropdown();
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost configuration detail minimum nights field$")
	public void user_puts_in_the_contract_cost_configuration_detail_minimum_nights_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setConfigurationDetailsSectionMinimumNightsInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost configuration detail maximum nights field$")
	public void user_puts_in_the_contract_cost_configuration_detail_maximum_nights_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setConfigurationDetailsSectionMaximumNightsInput(arg1);
	}
	
	@Then("^user sees an error message that contains the message minimum nights value cant be greater than the maximum nights value$")
	public void user_sees_an_error_message_that_contains_the_message_minimum_nights_value_cant_be_greater_than_the_maximum_nights_value() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[contains(text(), 'Minimum Nights can') and contains(text(), 't be greater than Maximum Nights')]")));
	}
	
	@Then("^user does not see the error message that contains the message minimum nights value cant be greater than the maximum nights value$")
	public void user_does_not_see_the_error_message_that_contains_the_message_minimum_nights_value_cant_be_greater_than_the_maximum_nights_value() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[contains(text(), 'Minimum Nights can') and contains(text(), 't be greater than Maximum Nights')]");
	}
	
	@When("^user views the guest configuration of the new contract cost$")
	public void user_views_the_guest_configuration_of_the_new_contract_cost() throws Throwable {
		contractCostsDetailsPage.clickConfigurationDetailsSectionViewButton();
	}
	
	@Then("^user sees the list of all configuration combination$")
	public void user_sees_the_list_of_all_configuration_combination() throws Throwable {
		CommonFunctions.textVisibleInPage("Selected Configurations");
	}
	
	@Then("^user sees the view contract costs contents$")
	public void user_sees_the_view_contract_costs_contents() throws Throwable {
		CommonFunctions.textVisibleInPage("View Contract Costs");
	}
	
	@When("^user closes the view contract costs$")
	public void user_closes_the_view_contract_costs() throws Throwable {
		contractDetailsPage = contractCostsDetailsPage.clickTopCancelButton();
	}
	
	@When("^user adds a new seasons group$")
	public void user_adds_a_new_seasons_group() throws Throwable {
		contractCostsDetailsPage.clickSeasonGroupsSectionAddButton();
	}
	
	@Then("^user sees the new season added to the seasons group list$")
	public void user_sees_the_new_season_added_to_the_seasons_group_list() throws Throwable {
		CommonFunctions.textVisibleInPage("Season 2");
	}
	
	@When("^user selects the top season in the seasons group list$")
	public void user_selects_the_top_season_in_the_seasons_group_list() throws Throwable {
		contractCostsDetailsPage.clickSeasonGroupsSectionTopSeasonGroupLinkRowData();
	}
	
	@Then("^user sees the contract costs details for the top season group$")
	public void user_sees_the_contract_costs_details_for_the_top_season_group() throws Throwable {
		contractCostsDetailsPage.containsValueCostsSectionTopCostTypeDropdownRowData("Adult");
	}
	
	@When("^user deletes the top season group in the seasons group list$")
	public void user_deletes_the_top_season_group_in_the_seasons_group_list() throws Throwable {
		contractCostsDetailsPage.clickSeasonGroupsSectionTopDeleteSeasonGroupButtonRowData();
	}
	
	@Then("^user does not see the deleted season group$")
	public void user_does_not_see_the_deleted_season_group() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'SeasonLists')]//div[contains(@id, 'seasonsLink')])[1]/ancestor-or-self::div[contains(text(), 'Season 1')]");
	}
	
	@When("^user opens the add date range popup$")
	public void user_opens_the_add_date_range_popup() throws Throwable {
		contractCostsDetailsPage.clickDateRangesSectionAddDateRangeButton();
	}
	
	@Then("^user sees the add date range popup fields and buttons with its default values$")
	public void user_sees_the_add_date_range_popup_fields_and_buttons_with_its_default_values() throws Throwable {
		contractCostsDetailsPage.displayedAddDateRangePopupStartDateInput();
		contractCostsDetailsPage.displayedAddDateRangePopupEndDateInput();
		contractCostsDetailsPage.displayedAddDateRangePopupAddButton();
		contractCostsDetailsPage.displayedAddDateRangePopupAllotmentCodeInput();
		contractCostsDetailsPage.displayedAddDateRangePopupDaysDropdown();
		contractCostsDetailsPage.displayedAddDateRangePopupShareAllowedCheckbox();
		contractCostsDetailsPage.displayedAddDateRangePopupPrintVoucherCheckbox();
		contractCostsDetailsPage.displayedAddDateRangePopupInvoiceCommentsTextArea();
		contractCostsDetailsPage.displayedAddDateRangePopupVoucherCommentsTextArea();
		contractCostsDetailsPage.containsValueAddDateRangePopupEndDateInput("31 Dec 2050");
		contractCostsDetailsPage.containsValueAddDateRangePopupAllotmentCodeInput("FREESALE");
		contractCostsDetailsPage.containsValueAddDateRangePopupDaysDropdown("All Selected");
	}
	
	@Then("^user sees the add date range share allowed toggle is enabled$")
	public void user_sees_the_add_date_range_share_allowed_toggle_is_enabled() throws Throwable {
		contractCostsDetailsPage.enabledAddDateRangePopupShareAllowedCheckbox();
	}
	
	@When("^user cancels the addition of the new date range$")
	public void user_cancels_the_addition_of_the_new_date_range() throws Throwable {
		contractCostsDetailsPage.clickAddDateRangePopupCancelButton();
	}
	
	@Then("^user sees the add date range share allowed toggle is disabled$")
	public void user_sees_the_add_date_range_share_allowed_toggle_is_disabled() throws Throwable {
		contractCostsDetailsPage.disabledAddDateRangePopupShareAllowedCheckbox();
	}
	
	@When("^user adds the date ranges to the table$")
	public void user_adds_the_date_ranges_to_the_table() throws Throwable {
		contractCostsDetailsPage.clickAddDateRangePopupAddToTableButton();
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost add date range start date field$")
	public void user_puts_in_the_contract_cost_add_date_range_start_date_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setAddDateRangePopupStartDateInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost add date range end date field$")
	public void user_puts_in_the_contract_cost_add_date_range_end_date_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setAddDateRangePopupEndDateInput(arg1);
	}
	
	@When("^user adds the new date range$")
	public void user_adds_the_new_date_range() throws Throwable {
		contractCostsDetailsPage.clickAddDateRangePopupAddButton();
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost add date range allotment code field$")
	public void user_puts_in_the_contract_cost_add_date_range_allotment_code_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setAddDateRangePopupAllotmentCodeInput(arg1);
	}
	
	@Then("^user sees the newly added date range in the contract cost date ranges table$")
	public void user_sees_the_newly_added_date_range_in_the_contract_cost_date_ranges_table() throws Throwable {
		contractCostsDetailsPage.containsValueDateRangesSectionTopStartDateInputRowData("01 Sep 2002");
	}
	
	@When("^user deletes the top date range in the contract cost date ranges table$")
	public void user_deletes_the_top_date_range_in_the_contract_cost_date_ranges_table() throws Throwable {
		contractCostsDetailsPage.clickDateRangesSectionTopDeleteDateRangeButtonRowData();
	}
	
	@Then("^user does not see the date range deleted in the contract cost date ranges table$")
	public void user_does_not_see_the_date_range_deleted_in_the_contract_cost_date_ranges_table() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("((//table[contains(@id, 'DateRangesLists')]//tbody//tr)[2]//td)[1]//a");
	}
	
	@When("^user cancels the cancellation of the addition of the new date range$")
	public void user_cancels_the_cancellation_of_the_addition_of_the_new_date_range() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'Cancel']"));
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Add Date Range']");
	}
	
	@Then("^user sees the add date range popup$")
	public void user_sees_the_add_date_range_popup() throws Throwable {
		CommonFunctions.elementEnabled(driver.findElement(By.xpath("//*[text() = 'Add Date Range']")));
	}
	
	@When("^user confirms the cancellation of the addition of the new date range$")
	public void user_confirms_the_cancellation_of_the_addition_of_the_new_date_range() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'OK']"));
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user does not see the add date range popup$")
	public void user_does_not_see_the_add_date_range_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[text() = 'Add Date Range']");
	}
	
	@Then("^user sees the update contract costs fields and buttons with its default values$")
	public void user_sees_the_update_contract_costs_fields_and_buttons_with_its_default_values() throws Throwable {
		contractCostsDetailsPage.displayedConfigurationDetailsSectionEditConfigurationButton();
		contractCostsDetailsPage.displayedSeasonGroupsSectionImportButton();
		contractCostsDetailsPage.displayedSeasonGroupsSectionAddButton();
		contractCostsDetailsPage.displayedDateRangesSectionAddDateRangeButton();
		contractCostsDetailsPage.displayedDateRangesSectionDateRangesTable();
		contractCostsDetailsPage.displayedCostsSectionAddCostButton();
		contractCostsDetailsPage.displayedCostsSectionCostsTable();
		contractCostsDetailsPage.displayedTopCloseButton();
		contractCostsDetailsPage.displayedTopSaveCostsButton();
	}
	
	@When("^user confirms the deletion of the top date range in the contract cost date ranges table$")
	public void user_confirms_the_deletion_of_the_top_date_range_in_the_contract_cost_date_ranges_table() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the selected record(s)?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'OK']"));
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user cancels the deletion of the top date range in the contract cost date ranges table$")
	public void user_cancels_the_deletion_of_the_top_date_range_in_the_contract_cost_date_ranges_table() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the selected record(s)?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'Cancel']"));
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user cancels the deletion of the top cost in the contract costs table$")
	public void user_cancels_the_deletion_of_the_top_cost_in_the_contract_costs_table() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the selected record(s)?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'Cancel']"));
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user confirms the deletion of the top cost in the contract costs table$")
	public void user_confirms_the_deletion_of_the_top_cost_in_the_contract_costs_table() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the selected record(s)?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'OK']"));
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user sees the contract costs date range top allotment code cell has value \"([^\"]*)\"$")
	public void user_sees_the_contract_costs_date_range_top_allotment_code_cell_has_value(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueDateRangesSectionTopAllotmentCodeInputRowData(arg1);
	}
	
	@When("^user cancels the deletion of the top season group in the seasons group list$")
	public void user_cancels_the_deletion_of_the_top_season_group_in_the_seasons_group_list() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete all dates and costs in Season 1?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'Cancel']"));
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user confirms the deletion of the top season group in the seasons group list$")
	public void user_confirms_the_deletion_of_the_top_season_group_in_the_seasons_group_list() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete all dates and costs in Season 1?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[@value = 'OK']"));
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user edits the contract costs date range top invoice comments cell$")
	public void user_edits_the_contract_costs_date_range_top_invoice_comments_cell() throws Throwable {
		contractCostsDetailsPage.clickDateRangesSectionTopInvoiceCommentsInputRowData();
	}
	
	@When("^user puts \"([^\"]*)\" as contract costs date range invoice comments$")
	public void user_puts_as_contract_costs_date_range_invoice_comments(String arg1) throws Throwable {
		contractCostsDetailsPage.setEditInvoiceCommentPopupInvoiceCommentsTextArea(arg1);
	}
	
	@When("^user confirms the new value for the contract costs date range invoice comment$")
	public void user_confirms_the_new_value_for_the_contract_costs_date_range_invoice_comment() throws Throwable {
		contractCostsDetailsPage.clickEditInvoiceCommentPopupDoneButton();
	}
	
	@Then("^user sees \"([^\"]*)\" as the value of the contract costs date range top invoice comments cell$")
	public void user_sees_as_the_value_of_the_contract_costs_date_range_top_invoice_comments_cell(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueDateRangesSectionTopInvoiceCommentsInputRowData(arg1);
	}
	
	@When("^user discards the new value for the contract costs date range invoice comment$")
	public void user_discards_the_new_value_for_the_contract_costs_date_range_invoice_comment() throws Throwable {
		contractCostsDetailsPage.clickEditInvoiceCommentPopupCancelButton();
	}
	
	@When("^user edits the contract costs date range top voucher comments cell$")
	public void user_edits_the_contract_costs_date_range_top_voucher_comments_cell() throws Throwable {
		contractCostsDetailsPage.clickDateRangesSectionTopVoucherCommentsInputRowData();
	}
	
	@When("^user puts \"([^\"]*)\" as contract costs date range voucher comments$")
	public void user_puts_as_contract_costs_date_range_voucher_comments(String arg1) throws Throwable {
		contractCostsDetailsPage.setEditVoucherCommentPopupVoucherCommentsTextArea(arg1);
	}
	
	@When("^user confirms the new value for the contract costs date range voucher comment$")
	public void user_confirms_the_new_value_for_the_contract_costs_date_range_voucher_comment() throws Throwable {
		contractCostsDetailsPage.clickEditVoucherCommentPopupDoneButton();
	}
	
	@Then("^user sees \"([^\"]*)\" as the value of the contract costs date range top voucher comments cell$")
	public void user_sees_as_the_value_of_the_contract_costs_date_range_top_voucher_comments_cell(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueDateRangesSectionTopVoucherCommentsInputRowData(arg1);
	}
	
	@When("^user discards the new value for the contract costs date range voucher comment$")
	public void user_discards_the_new_value_for_the_contract_costs_date_range_voucher_comment() throws Throwable {
		contractCostsDetailsPage.clickEditVoucherCommentPopupCancelButton();
	}
	
	@Then("^user sees the new date range allotment dropdown$")
	public void user_sees_the_new_date_range_allotment_dropdown() throws Throwable {
		contractCostsDetailsPage.clickAddDateRangePopupAllotmentCodeInput();
		contractCostsDetailsPage.displayedAddDateRangePopupAllotmentCodeDropdownAllotmentCodeFilterInput();
		contractCostsDetailsPage.displayedAddDateRangePopupAllotmentCodeDropdownInventoryPoolFilterInput();
		user_hits_the_escape_key();
		user_removes_the_focus_on_the_field();
		user_searches_for_an_allotment_code_for_the_contract_costs_new_date_range_with_as_the_allotment_code_and_as_the_inventory_pool("ABC", "XYZ");
		CommonFunctions.elementNotExistingByXPath("(//label[text() = 'Allotment Code']//parent::div//div[contains(@id, 'Suggestions')]//div[@class = 'FullRow'])[3]//div[@class = 'Cell1']");
	}
	
	@When("^user puts \"([^\"]*)\" as the allotment code for the contract costs new date range$")
	public void user_puts_as_the_allotment_code_for_the_contract_costs_new_date_range(String arg1) throws Throwable {
		contractCostsDetailsPage.setAddDateRangePopupAllotmentCodeInput(arg1);
	}
	
	@Then("^user sees the contract costs new date range allotment code dropdown has value \"([^\"]*)\"$")
	public void user_sees_the_contract_costs_new_date_range_allotment_code_dropdown_has_value(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueAddDateRangePopupAllotmentCodeInput(arg1);
	}
	
	@When("^user searches for an allotment code for the contract costs new date range with \"([^\"]*)\" as the allotment code and \"([^\"]*)\" as the inventory pool$")
	public void user_searches_for_an_allotment_code_for_the_contract_costs_new_date_range_with_as_the_allotment_code_and_as_the_inventory_pool(String arg1, String arg2) throws Throwable {
		contractCostsDetailsPage.clickAddDateRangePopupAllotmentCodeInput();
		contractCostsDetailsPage.setAddDateRangePopupAllotmentCodeDropdownAllotmentCodeFilterInput(arg1);
		contractCostsDetailsPage.setAddDateRangePopupAllotmentCodeDropdownInventoryPoolFilterInput(arg2);
	}
	
	@When("^user selects the top allotment code search result in the dropdown for the contract costs new date range$")
	public void user_selects_the_top_allotment_code_search_result_in_the_dropdown_for_the_contract_costs_new_date_range() throws Throwable {
		contractCostsDetailsPage.clickAddDateRangePopupAllotmentCodeDropdownTopSearchResultRadioButton();
	}
	
	@Then("^user sees the contract costs table number of days field is disabled$")
	public void user_sees_the_contract_costs_table_number_of_days_field_is_disabled() throws Throwable {
		contractCostsDetailsPage.disabledCostsSectionTopNumberOfDaysInputRowData();
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract costs table top cost type dropdown$")
	public void user_ticks_the_option_of_the_contract_costs_table_top_cost_type_dropdown(String arg1) throws Throwable {
		contractCostsDetailsPage.selectCostsSectionTopCostTypeDropdownRowDataValue(arg1);
	}
	
	@When("^user saves the changes on the modification on the top row of the costs table$")
	public void user_saves_the_changes_on_the_modification_on_the_top_row_of_the_costs_table() throws Throwable {
		contractCostsDetailsPage.clickCostsSectionSaveButton();
	}
	
	@When("^user puts \"([^\"]*)\" in the contract costs table top quantity field$")
	public void user_puts_in_the_contract_costs_table_top_quantity_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setCostsSectionTopQuantityInputRowData(arg1);
	}
	
	@Then("^user sees that the contract costs table top quantity field contains \"([^\"]*)\"$")
	public void user_sees_that_the_contract_costs_table_top_quantity_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueCostsSectionTopQuantityInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract costs table top cost field$")
	public void user_puts_in_the_contract_costs_table_top_cost_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setCostsSectionTopCostInputRowData(arg1);
	}
	
	@Then("^user sees that the contract costs table top cost field contains \"([^\"]*)\"$")
	public void user_sees_that_the_contract_costs_table_top_cost_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueCostsSectionTopCostInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract costs table top tax field$")
	public void user_puts_in_the_contract_costs_table_top_tax_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setCostsSectionTopTaxInputRowData(arg1);
	}
	
	@Then("^user sees that the contract costs table top tax field contains \"([^\"]*)\"$")
	public void user_sees_that_the_contract_costs_table_top_tax_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueCostsSectionTopTaxInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract costs table top gst field$")
	public void user_puts_in_the_contract_costs_table_top_gst_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setCostsSectionTopGSTInputRowData(arg1);
	}
	
	@Then("^user sees that the contract costs table top gst field contains \"([^\"]*)\"$")
	public void user_sees_that_the_contract_costs_table_top_gst_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueCostsSectionTopGSTInputRowData(arg1);
	}
	
	@When("^user edits the contract costs configuration details$")
	public void user_edits_the_contract_costs_configuration_details() throws Throwable {
		contractCostsDetailsPage.clickConfigurationDetailsSectionEditConfigurationButton();
	}
	
	@Then("^user sees the edit contract cost configuration details popup contents for the contract type \"([^\"]*)\"$")
	public void user_sees_the_edit_contract_cost_configuration_details_popup_contents_for_the_contract_type(String arg1) throws Throwable {
		contractCostsDetailsPage.displayedEditConfigurationDetailsPopupGuestConfigurationDropdown();
		contractCostsDetailsPage.displayedEditConfigurationDetailsPopupCategory1Dropdown();
		contractCostsDetailsPage.displayedEditConfigurationDetailsPopupCategory2Dropdown();
		contractCostsDetailsPage.displayedEditConfigurationDetailsPopupMinimumNightsInput();
		contractCostsDetailsPage.displayedEditConfigurationDetailsPopupMaximumNightsInput();
		contractCostsDetailsPage.displayedEditConfigurationDetailsPopupMaximumChildAgeInput();
		contractCostsDetailsPage.displayedEditConfigurationDetailsPopupCancelButton();
		contractCostsDetailsPage.displayedEditConfigurationDetailsPopupUpdateButton();
	}
	
	@When("^user puts \"([^\"]*)\" in the edit contract cost configuration detail maximum child age field$")
	public void user_puts_in_the_edit_contract_cost_configuration_detail_maximum_child_age_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setEditConfigurationDetailsPopupMaximumChildAgeInput(arg1);
	}
	
	@Then("^user sees that the edit contract cost configuration detail maximum child age field contains \"([^\"]*)\"$")
	public void user_sees_that_the_edit_contract_cost_configuration_detail_maximum_child_age_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueEditConfigurationDetailsPopupMaximumChildAgeInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the edit contract cost configuration detail minimum nights field$")
	public void user_puts_in_the_edit_contract_cost_configuration_detail_minimum_nights_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setEditConfigurationDetailsPopupMinimumNightsInput(arg1);
	}
	
	@Then("^user sees that the edit contract cost configuration detail minimum nights field contains \"([^\"]*)\"$")
	public void user_sees_that_the_edit_contract_cost_configuration_detail_minimum_nights_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueEditConfigurationDetailsPopupMinimumNightsInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the edit contract cost configuration detail maximum nights field$")
	public void user_puts_in_the_edit_contract_cost_configuration_detail_maximum_nights_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setEditConfigurationDetailsPopupMaximumNightsInput(arg1);
	}
	
	@Then("^user sees that the edit contract cost configuration detail maximum nights field contains \"([^\"]*)\"$")
	public void user_sees_that_the_edit_contract_cost_configuration_detail_maximum_nights_field_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueEditConfigurationDetailsPopupMaximumNightsInput(arg1);
	}
	
	@When("^user updates the contract costs configuration details$")
	public void user_updates_the_contract_costs_configuration_details() throws Throwable {
		contractCostsDetailsPage.clickEditConfigurationDetailsPopupUpdateButton();
	}
	
	@Then("^user sees the updated contract costs configuration details$")
	public void user_sees_the_updated_contract_costs_configuration_details() throws Throwable {
		CommonFunctions.elementContainsText(driver.findElement(By.xpath("//label[text() = 'Maximum Nights']//parent::div")), "50");
	}
	
	@When("^user cancels the update of the contract costs configuration details$")
	public void user_cancels_the_update_of_the_contract_costs_configuration_details() throws Throwable {
		contractCostsDetailsPage.clickEditConfigurationDetailsPopupCancelButton();
	}
	
	@Then("^user does not see the edit configuration details popup$")
	public void user_does_not_see_the_edit_configuration_details_popup() throws Throwable {
		CommonFunctions.textHiddenInPage("Edit Configuration Details");
	}
	
	@When("^user updates the top contract costs date ranges allotment code$")
	public void user_updates_the_top_contract_costs_date_ranges_allotment_code() throws Throwable {
		contractCostsDetailsPage.clickDateRangesSectionTopAllotmentCodeInputRowData();
	}
	
	@Then("^user sees the contracts costs date ranges update allotment code popup contents$")
	public void user_sees_the_contracts_costs_date_ranges_update_allotment_code_popup_contents() throws Throwable {
		contractCostsDetailsPage.displayedAllotmentCodePopupAllotmentCodeInput();
		contractCostsDetailsPage.displayedAllotmentCodePopupAllotmentCodeFilterInput();
		contractCostsDetailsPage.displayedAllotmentCodePopupInventoryPoolFilterInput();
		contractCostsDetailsPage.displayedAllotmentCodePopupFirstRadioButtonRowData();
		contractCostsDetailsPage.containsValueAllotmentCodePopupFirstAllotmentCodeRowData("FREESALE");
		contractCostsDetailsPage.containsValueAllotmentCodePopupFirstInventoryPoolRowData("FREESALE");
		contractCostsDetailsPage.displayedAllotmentCodePopupSecondRadioButtonRowData();
		contractCostsDetailsPage.containsValueAllotmentCodePopupSecondAllotmentCodeRowData("ONREQUEST");
		contractCostsDetailsPage.containsValueAllotmentCodePopupSecondInventoryPoolRowData("ONREQUEST");
		contractCostsDetailsPage.displayedAllotmentCodePopupCancelButton();
		contractCostsDetailsPage.displayedAllotmentCodePopupDoneButton();
	}
	
	@When("^user puts \"([^\"]*)\" as the new allotment code for the contract costs date range allotment code$")
	public void user_puts_as_the_new_allotment_code_for_the_contract_costs_date_range_allotment_code(String arg1) throws Throwable {
		contractCostsDetailsPage.setAllotmentCodePopupAllotmentCodeInput(arg1);
	}
	
	@When("^user accepts the changes made on the contract costs date range allotment code$")
	public void user_accepts_the_changes_made_on_the_contract_costs_date_range_allotment_code() throws Throwable {
		contractCostsDetailsPage.clickAllotmentCodePopupDoneButton();
	}
	
	@When("^user searches for an allotment code for the contract costs date range allotment code with \"([^\"]*)\" as the allotment code and \"([^\"]*)\" as the inventory pool$")
	public void user_searches_for_an_allotment_code_for_the_contract_costs_date_range_allotment_code_with_as_the_allotment_code_and_as_the_inventory_pool(String arg1, String arg2) throws Throwable {
		contractCostsDetailsPage.setAllotmentCodePopupAllotmentCodeFilterInput(arg1);
		contractCostsDetailsPage.setAllotmentCodePopupInventoryPoolFilterInput(arg2);
	}
	
	@When("^user selects the top allotment code search result in the list$")
	public void user_selects_the_top_allotment_code_search_result_in_the_list() throws Throwable {
		contractCostsDetailsPage.clickAllotmentCodePopupThirdRadioButtonRowData();
	}
	
	@When("^user cancels the update of the contract costs date ranges allotment code$")
	public void user_cancels_the_update_of_the_contract_costs_date_ranges_allotment_code() throws Throwable {
		contractCostsDetailsPage.clickAllotmentCodePopupCancelButton();
	}
	
	@Then("^user does not see the contracts costs date ranges update allotment code popup$")
	public void user_does_not_see_the_contracts_costs_date_ranges_update_allotment_code_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id, 'SelectAllotmentCodeInput')]");
	}
	
	@When("^user accepts the changes made on the contract costs date range row$")
	public void user_accepts_the_changes_made_on_the_contract_costs_date_range_row() throws Throwable {
		contractCostsDetailsPage.clickDateRangesSectionSaveButton();
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost date range table top start date field$")
	public void user_puts_in_the_contract_cost_date_range_table_top_start_date_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setDateRangesSectionTopStartDateInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the contract cost date range table top end date field$")
	public void user_puts_in_the_contract_cost_date_range_table_top_end_date_field(String arg1) throws Throwable {
		contractCostsDetailsPage.setDateRangesSectionTopEndDateInputRowData(arg1);
	}
	
	@When("^user opens the import seasons popup$")
	public void user_opens_the_import_seasons_popup() throws Throwable {
		contractCostsDetailsPage.clickSeasonGroupsSectionImportButton();
	}
	
	@Then("^user sees the import seasons popup contents$")
	public void user_sees_the_import_seasons_popup_contents() throws Throwable {
		contractCostsDetailsPage.displayedImportSeasonsPopupImportFromDropdown();
		contractCostsDetailsPage.displayedImportSeasonsPopupSeasonDropdown();
		contractCostsDetailsPage.displayedImportSeasonsPopupIncludePastDatesCheckbox();
		contractCostsDetailsPage.displayedImportSeasonsPopupCancelButton();
		contractCostsDetailsPage.displayedImportSeasonsPopupDoneButton();
	}
	
	@When("^user searches for the contract cost import seasons popup import from dropdown value with \"([^\"]*)\" as the guest configuration, \"([^\"]*)\" as the category 1 and \"([^\"]*)\" as the category 2$")
	public void user_searches_for_the_contract_cost_import_seasons_popup_import_from_dropdown_value_with_as_the_guest_configuration_as_the_category_and_as_the_category(String arg1, String arg2, String arg3) throws Throwable {
		contractCostsDetailsPage.clickImportSeasonsPopupImportFromDropdown();
		contractCostsDetailsPage.setImportSeasonsPopupImportFromDropdownGuestConfigurationFilterInput(arg1);
		contractCostsDetailsPage.setImportSeasonsPopupImportFromDropdownCategory1FilterInput(arg2);
		contractCostsDetailsPage.setImportSeasonsPopupImportFromDropdownCategory2FilterInput(arg3);
	}
	
	@Then("^user sees the contract cost import seasons popup import from dropdown value with \"([^\"]*)\"$")
	public void user_sees_the_contract_cost_import_seasons_popup_import_from_dropdown_value_with(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueImportSeasonsPopupImportFromDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the contract cost import seasons popup season dropdown$")
	public void user_ticks_the_option_of_the_contract_cost_import_seasons_popup_season_dropdown(String arg1) throws Throwable {
		contractCostsDetailsPage.clickImportSeasonsPopupSeasonDropdownOption(arg1);
	}
	
	@Then("^user sees the contract cost import seasons popup season dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_contract_cost_import_seasons_popup_season_dropdown_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueImportSeasonsPopupSeasonDropdown(arg1);
	}
	
	@When("^user ticks the contract cost import seasons popup include past dates option$")
	public void user_ticks_the_contract_cost_import_seasons_popup_include_past_dates_option() throws Throwable {
		contractCostsDetailsPage.clickImportSeasonsPopupIncludePastDatesCheckbox();
	}
	
	@When("^user cancels the importing of season$")
	public void user_cancels_the_importing_of_season() throws Throwable {
		contractCostsDetailsPage.clickImportSeasonsPopupCancelButton();
	}
	
	@Then("^user does not see the import seasons popup$")
	public void user_does_not_see_the_import_seasons_popup() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//*[text() = 'Import Seasons']");
	}
	
	@When("^user selects the top import from search result in the list$")
	public void user_selects_the_top_import_from_search_result_in_the_list() throws Throwable {
		contractCostsDetailsPage.clickImportSeasonsPopupImportFromDropdownTopImportFromRadioButton();
		contractCostsDetailsPage.clickImportSeasonsPopupImportFromDropdown();
	}
	
	@Then("^user sees the contract cost configuration detail guest configuration single select dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_contract_cost_configuration_detail_guest_configuration_single_select_dropdown_contains(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueConfigurationDetailsSectionGuestConfigurationSingleSelectDropdown(arg1);
	}
	
	@Then("^user sees the cost type column of the default row in the cost table is disabled$")
	public void user_sees_the_cost_type_column_of_the_default_row_in_the_cost_table_is_disabled() throws Throwable {
		contractCostsDetailsPage.disabledCostsSectionTopCostTypeDropdownRowData();
	}
	
	@Then("^user sees the default row in the cost table is defaulted to estimated$")
	public void user_sees_the_default_row_in_the_cost_table_is_defaulted_to_estimated() throws Throwable {
		contractCostsDetailsPage.containsValueCostsSectionTopEstimatedActualDropdownRowData("Estimated");
	}
	
	@Then("^user sees the quantity column of the default row in the cost table is disabled$")
	public void user_sees_the_quantity_column_of_the_default_row_in_the_cost_table_is_disabled() throws Throwable {
		contractCostsDetailsPage.disabledCostsSectionTopQuantityInputRowData();
	}
	
	@Then("^user sees the add cost popup quantity field is disabled$")
	public void user_sees_the_add_cost_popup_quantity_field_is_disabled() throws Throwable {
		contractCostsDetailsPage.disabledAddCostPopupQuantityInput();
	}
	
	@Then("^user sees the cost type column of the default row in the cost table has only one option$")
	public void user_sees_the_cost_type_column_of_the_default_row_in_the_cost_table_has_only_one_option() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(((//table[contains(@id, 'CostsLists')]//tbody//tr)[1]//td)[2]//select//option)[2]");
	}
	
	@Then("^user sees the cost type dropdown of the add cost popup has only one option$")
	public void user_sees_the_cost_type_dropdown_of_the_add_cost_popup_has_only_one_option() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//label[text() = 'Cost Type']//parent::div//select//option)[2]");
	}
	
	@Then("^user sees the contract costs top cost type cell has value \"([^\"]*)\"$")
	public void user_sees_the_contract_costs_top_cost_type_cell_has_value(String arg1) throws Throwable {
		contractCostsDetailsPage.containsValueCostsSectionTopCostTypeDropdownRowData(arg1);
	}
	
	@Then("^user does not see any costs in the contract costs table$")
	public void user_does_not_see_any_costs_in_the_contract_costs_table() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//table[contains(@id, 'CostsLists')]//tbody//tr)[2]");
	}
	
	@When("^user clicks the contract cost configuration already exist icon$")
	public void user_clicks_the_contract_cost_configuration_already_exist_icon() throws Throwable {
		contractCostsDetailsPage.clickConfigurationDetailsSectionExistingConfigurationDetailsButton();
	}
	
	@Then("^user sees the contract cost existing configuration details$")
	public void user_sees_the_contract_cost_existing_configuration_details() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Existing Configurations']");
		contractCostsDetailsPage.containsValueExistingConfigurationDetailsPopupTopGuestConfigurationRowData("Twin");
		contractCostsDetailsPage.containsValueExistingConfigurationDetailsPopupTopCategory1RowData("Harbour View Room");
		contractCostsDetailsPage.containsValueExistingConfigurationDetailsPopupTopCategory2RowData("BB");
		contractCostsDetailsPage.containsValueExistingConfigurationDetailsPopupTopMinPaxRowData("1");
		contractCostsDetailsPage.containsValueExistingConfigurationDetailsPopupTopMaxPaxRowData("99");
	}
	
	@When("^user closes contract cost existing configuration popup$")
	public void user_closes_contract_cost_existing_configuration_popup() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user decides to remove all the contract cost existing configuration$")
	public void user_decides_to_remove_all_the_contract_cost_existing_configuration() throws Throwable {
		contractCostsDetailsPage.clickExistingConfigurationDetailsPopupRemoveAllButton();
	}
	
	@Then("^user sees feedback message that the record is imported successfully and click the save prices button to save the record$")
	public void user_sees_feedback_message_that_the_record_is_imported_successfully_and_click_the_save_prices_button_to_save_the_record() throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayedContainsString("Record(s) Imported successfully. Please click");
	}
	// End - Contract Costs Details Page Functions
	
	// Start - Recommended Itineraries Page Functions
	@Then("^user sees the recommended itinerary fields and buttons$")
	public void user_sees_the_recommended_itinerary_fields_and_buttons() throws Throwable {
		CommonFunctions.textVisibleInPage("Search Itinerary");
		recommendedItinerariesPage.displayedAddNewItineraryButton();
		recommendedItinerariesPage.displayedFindButton();
		recommendedItinerariesPage.displayedResetButton();
	}
	
	@Then("^user sees the recommended itinerary fields and default values$")
	public void user_sees_the_recommended_itinerary_fields_and_default_values() throws Throwable {
		recommendedItinerariesPage.displayedTourCodeDropdown();
		recommendedItinerariesPage.displayedItineraryNameInput();
		recommendedItinerariesPage.displayedCustomerMarketDropdown();
		recommendedItinerariesPage.displayedDepartureDateFromInput();
		recommendedItinerariesPage.displayedDepartureDateToInput();
	}
	
	@Then("^user sees the recommended itinerary table and its contents$")
	public void user_sees_the_recommended_itinerary_table_and_its_contents() throws Throwable {
		recommendedItinerariesPage.displayedTourCodeFilterInput();
		recommendedItinerariesPage.displayedItineraryNameFilterInput();
		recommendedItinerariesPage.displayedCustomerMarketFilterInput();
		recommendedItinerariesPage.displayedStatusFilterInput();
		recommendedItinerariesPage.displayedTopCopyButtonRowData();
		recommendedItinerariesPage.displayedTopEditButtonRowData();
		recommendedItinerariesPage.displayedTopDeleteButtonRowData();
		recommendedItinerariesPage.displayedTopTourCodeRowData();
		recommendedItinerariesPage.displayedTopItineraryNameRowData();
		recommendedItinerariesPage.displayedTopCustomerMarketRowData();
		recommendedItinerariesPage.displayedTopStatusRowData();
	}
	
	@When("^user decides to create a new itinerary$")
	public void user_decides_to_create_a_new_itinerary() throws Throwable {
		recommendedItineraryDetailsPage = recommendedItinerariesPage.clickAddNewItineraryButton();
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the search itinerary tour code dropdown$")
	public void user_ticks_the_option_of_the_search_itinerary_tour_code_dropdown(String arg1) throws Throwable {
		recommendedItinerariesPage.clickTourCodeDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the search itinerary customer market dropdown$")
	public void user_ticks_the_option_of_the_search_itinerary_customer_market_dropdown(String arg1) throws Throwable {
		recommendedItinerariesPage.clickCustomerMarketDropdownOption(arg1);
	}
	
	@When("^user searches for a recommended itinerary with the given search filters$")
	public void user_searches_for_a_recommended_itinerary_with_the_given_search_filters() throws Throwable {
		recommendedItinerariesPage.clickFindButton();
	}
	
	@When("^user resets the recommended itinerary search results$")
	public void user_resets_the_recommended_itinerary_search_results() throws Throwable {
		recommendedItinerariesPage.clickResetButton();
	}
	
	@Then("^user sees the recommended itinerary table was reverted to original display$")
	public void user_sees_the_recommended_itinerary_table_was_reverted_to_original_display() throws Throwable {
		CommonFunctions.textHiddenInPage("No matching records found.");
	}
	
	@When("^user ticks the search itinerary inactive checkbox$")
	public void user_ticks_the_search_itinerary_inactive_checkbox() throws Throwable {
		recommendedItinerariesPage.clickInactiveCheckbox();
	}
	
	@When("^user ticks the search itinerary use package specific rule checkbox$")
	public void user_ticks_the_search_itinerary_use_package_specific_rule_checkbox() throws Throwable {
		recommendedItinerariesPage.clickIncludePackageSpecificRuleCheckbox();
	}
	
	@Then("^user sees the recommended itinerary table shows \"([^\"]*)\" rows$")
	public void user_sees_the_recommended_itinerary_table_shows_rows(String arg1) throws Throwable {
		recommendedItinerariesPage.containsValueRowsDropdown(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the search itinerary departure date from field$")
	public void user_puts_in_the_search_itinerary_departure_date_from_field(String arg1) throws Throwable {
		recommendedItinerariesPage.setDepartureDateFromInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the search itinerary departure date to field$")
	public void user_puts_in_the_search_itinerary_departure_date_to_field(String arg1) throws Throwable {
		recommendedItinerariesPage.setDepartureDateToInput(arg1);
	}
	
	@Then("^user sees the recommended itinerary search results with the specific tour codes \"([^\"]*)\"$")
	public void user_sees_the_recommended_itinerary_search_results_with_the_specific_tour_codes(String arg1) throws Throwable {
		recommendedItinerariesPage.containsValueTopTourCodeRowData(arg1);
	}
	
	@Then("^user sees the recommended itinerary search results with the specific customer markets \"([^\"]*)\"$")
	public void user_sees_the_recommended_itinerary_search_results_with_the_specific_customer_markets(String arg1) throws Throwable {
		recommendedItinerariesPage.containsValueTopCustomerMarketRowData(arg1);
	}
	
	@Then("^user sees the recommended itinerary search results with the specific tour codes \"([^\"]*)\" and specific customer markets \"([^\"]*)\"$")
	public void user_sees_the_recommended_itinerary_search_results_with_the_specific_tour_codes_and_specific_customer_markets(String arg1, String arg2) throws Throwable {
		recommendedItinerariesPage.containsValueTopTourCodeRowData(arg1);
		recommendedItinerariesPage.containsValueTopCustomerMarketRowData(arg2);
	}
	
	@Then("^user sees the recommended itinerary search results that is inactive and that has package specific rule$")
	public void user_sees_the_recommended_itinerary_search_results_that_is_inactive_and_that_has_package_specific_rule() throws Throwable {
		recommendedItinerariesPage.containsValueTopStatusRowData("Inactive");
	}
	
	@When("^user removes the column filters of the recommended itinerary result$")
	public void user_removes_the_column_filters_of_the_recommended_itinerary_result() throws Throwable {
		recommendedItinerariesPage.setTourCodeFilterInput("");
		recommendedItinerariesPage.setCustomerMarketFilterInput("");
	}
	
	@When("^user puts \"([^\"]*)\" in the tour code column filter to filter the recommended itinerary result$")
	public void user_puts_in_the_tour_code_column_filter_to_filter_the_recommended_itinerary_result(String arg1) throws Throwable {
		recommendedItinerariesPage.setTourCodeFilterInput(arg1);
	}
	
	@When("^user edits the recommended itinerary$")
	public void user_edits_the_recommended_itinerary() throws Throwable {
		recommendedItineraryDetailsPage = recommendedItinerariesPage.clickTopEditButtonRowData();
	}
	
	@When("^user copies the recommended itinerary$")
	public void user_copies_the_recommended_itinerary() throws Throwable {
		recommendedItineraryDetailsPage = recommendedItinerariesPage.clickTopCopyButtonRowData();
	}
	
	@When("^user decides to delete the recommended itinerary$")
	public void user_decides_to_delete_the_recommended_itinerary() throws Throwable {
		recommendedItinerariesPage.clickTopDeleteButtonRowData();
	}
	
	@When("^user disregards the deletion of the recommended itinerary$")
	public void user_disregards_the_deletion_of_the_recommended_itinerary() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@Then("^user sees feedback message Recommended Itinerary \"([^\"]*)\"$")
	public void user_sees_feedback_message_Recommended_Itinerary(String arg1) throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayedContainsString(arg1);
	}
	
	@When("^user confirms the deletion of the recommended itinerary$")
	public void user_confirms_the_deletion_of_the_recommended_itinerary() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[contains(text(), 'Do you want to delete Itinerary')]");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user puts \"([^\"]*)\" in the customer market column filter to filter the recommended itinerary result$")
	public void user_puts_in_the_customer_market_column_filter_to_filter_the_recommended_itinerary_result(String arg1) throws Throwable {
		recommendedItinerariesPage.setCustomerMarketFilterInput(arg1);
	}
	
	@Then("^user sees feedback message Itinerary \"([^\"]*)\"$")
	public void user_sees_feedback_message_Itinerary(String arg1) throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayedContainsString(arg1);
	}
	
	@Then("^user sees the find button for the recommended itinerary table is disabled$")
	public void user_sees_the_find_button_for_the_recommended_itinerary_table_is_disabled() throws Throwable {
		recommendedItinerariesPage.disabledFindButton();
	}
	
	@Then("^user sees the recommended itinerary search include package specific rule checkbox is toggled by default$")
	public void user_sees_the_recommended_itinerary_search_include_package_specific_rule_checkbox_is_toggled_by_default() throws Throwable {
		recommendedItinerariesPage.checkIncludePackageSpecificRuleIsToggled();
	}
	
	@Then("^user sees the include inactive checkbox$")
	public void user_sees_the_include_inactive_checkbox() throws Throwable {
		CommonFunctions.textVisibleInPage("Include Inactive");
	}
	
	@When("^user enters \"([^\"]*)\" in the status column filter for recommended itinerary$")
	public void user_puts_in_the_status_column_filter_for_recommended_itinerary(String arg1) throws Throwable {
		recommendedItinerariesPage.setStatusFilterInput(arg1);
	}
	// End - Recommended Itineraries Page Functions
	
	// Start - Recommended Itinerary Details Page Functions
	@When("^user ticks the \"([^\"]*)\" option of the itinerary tour code dropdown$")
	public void user_ticks_the_option_of_the_itinerary_tour_code_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickTourCodeDropdownOption(arg1);
	}
	
	@Then("^user sees the itinerary tour code dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_tour_code_dropdown_contains(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.containsValueTourCodeDropdown(arg1);
	}
	
	@Then("^user sees the itinerary name field$")
	public void user_sees_the_itinerary_name_field() throws Throwable {
		recommendedItineraryDetailsPage.displayedItineraryNameInput();
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary customer market dropdown$")
	public void user_ticks_the_option_of_the_itinerary_customer_market_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickCustomerMarketDropdownOption(arg1);
	}
	
	@Then("^user sees the itinerary customer market dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_customer_market_dropdown_contains(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.containsValueCustomerMarketDropdown(arg1);
	}
	
	@Then("^user sees the itinerary inactive checkbox$")
	public void user_sees_the_itinerary_inactive_checkbox() throws Throwable {
		recommendedItineraryDetailsPage.displayedInactiveCheckbox();
	}
	
	@Then("^user sees the itinerary use package specific rule checkbox$")
	public void user_sees_the_itinerary_use_package_specific_rule_checkbox() throws Throwable {
		recommendedItineraryDetailsPage.displayedUsePackageSpecificRuleCheckbox();
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary name field$")
	public void user_puts_in_the_itinerary_name_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setItineraryNameInput(CommonFunctions.stringAppendDateTime(arg1));
	}
	
	@Then("^user sees the itinerary inbound and outbound accordion fields enabled$")
	public void user_sees_the_itinerary_inbound_and_outbound_accordion_fields_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledOutboundSectionTopFlyingFromDropdownRowData();
		recommendedItineraryDetailsPage.enabledOutboundSectionTopFlyingToDropdownRowData();
		recommendedItineraryDetailsPage.enabledOutboundSectionTopPackageDayIndicatorInputRowData();
		recommendedItineraryDetailsPage.enabledInboundSectionTopFlyingFromDropdownRowData();
		recommendedItineraryDetailsPage.enabledInboundSectionTopFlyingToDropdownRowData();
		recommendedItineraryDetailsPage.enabledInboundSectionTopPackageDayIndicatorInputRowData();
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary outbound top flying from dropdown$")
	public void user_ticks_the_option_of_the_itinerary_outbound_top_flying_from_dropdown(String arg1) throws Throwable {
		CommonFunctions.scrollToTop();
		CommonFunctions.pause(5000, false);
		recommendedItineraryDetailsPage.clickOutboundSectionTopFlyingFromDropdownRowDataOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary outbound second flying from dropdown$")
	public void user_ticks_the_option_of_the_itinerary_outbound_second_flying_from_dropdown(String arg1) throws Throwable {
		CommonFunctions.scrollToTop();
		CommonFunctions.pause(5000, false);
		recommendedItineraryDetailsPage.clickOutboundSectionSecondFlyingFromDropdownRowDataOption(arg1);
	}
	
	@Then("^user sees the itinerary outbound top flying from dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_outbound_top_flying_from_dropdown_contains(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.containsValueOutboundSectionTopFlyingFromDropdownRowData(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary outbound top flying to dropdown$")
	public void user_ticks_the_option_of_the_itinerary_outbound_top_flying_to_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickOutboundSectionTopFlyingToDropdownRowDataOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary outbound second flying to dropdown$")
	public void user_ticks_the_option_of_the_itinerary_outbound_second_flying_to_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickOutboundSectionSecondFlyingToDropdownRowDataOption(arg1);
	}
	
	@Then("^user sees the itinerary outbound top flying to dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_outbound_top_flying_to_dropdown_contains(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.containsValueOutboundSectionTopFlyingToDropdownRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary outbound top package day indicator field$")
	public void user_puts_in_the_itinerary_outbound_top_package_day_indicator_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setOutboundSectionTopPackageDayIndicatorInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary outbound second package day indicator field$")
	public void user_puts_in_the_itinerary_outbound_second_package_day_indicator_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setOutboundSectionSecondPackageDayIndicatorInputRowData(arg1);
	}
	
	@When("^user adds the outbound flight to the itinerary$")
	public void user_adds_the_outbound_flight_to_the_itinerary() throws Throwable {
		recommendedItineraryDetailsPage.clickOutboundSectionAddFlightButton();
	}
	
	@Then("^user sees another form for a new outbound flight$")
	public void user_sees_another_form_for_a_new_outbound_flight() throws Throwable {
		recommendedItineraryDetailsPage.displayedOutboundSectionSecondDeleteOutboundFlightButtonRowData();
	}
	
	@When("^user deletes the recently added outbound flight from the itinerary$")
	public void user_deletes_the_recently_added_outbound_flight_from_the_itinerary() throws Throwable {
		recommendedItineraryDetailsPage.clickOutboundSectionSecondDeleteOutboundFlightButtonRowData();
	}
	
	@Then("^user does not see the new outbound flight$")
	public void user_does_not_see_the_new_outbound_flight() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'OutboundFlightRecords')]//div[contains(@id, 'OutboundItem')])[2]//div[contains(@id, 'deleteOutboundIcon')]//a");
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary inbound top flying from dropdown$")
	public void user_ticks_the_option_of_the_itinerary_inbound_top_flying_from_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickInboundSectionTopFlyingFromDropdownRowDataOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary inbound second flying from dropdown$")
	public void user_ticks_the_option_of_the_itinerary_inbound_second_flying_from_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickInboundSectionSecondFlyingFromDropdownRowDataOption(arg1);
	}
	
	@Then("^user sees the itinerary inbound top flying from dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_inbound_top_flying_from_dropdown_contains(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.containsValueInboundSectionTopFlyingFromDropdownRowData(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary inbound top flying to dropdown$")
	public void user_ticks_the_option_of_the_itinerary_inbound_top_flying_to_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickInboundSectionTopFlyingToDropdownRowDataOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary inbound second flying to dropdown$")
	public void user_ticks_the_option_of_the_itinerary_inbound_second_flying_to_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickInboundSectionSecondFlyingToDropdownRowDataOption(arg1);
	}
	
	@Then("^user sees the itinerary inbound top flying to dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_inbound_top_flying_to_dropdown_contains(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.containsValueInboundSectionTopFlyingToDropdownRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary inbound top package day indicator field$")
	public void user_puts_in_the_itinerary_inbound_top_package_day_indicator_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setInboundSectionTopPackageDayIndicatorInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary inbound second package day indicator field$")
	public void user_puts_in_the_itinerary_inbound_second_package_day_indicator_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setInboundSectionSecondPackageDayIndicatorInputRowData(arg1);
	}
	
	@When("^user adds the inbound flight to the itinerary$")
	public void user_adds_the_inbound_flight_to_the_itinerary() throws Throwable {
		recommendedItineraryDetailsPage.clickInboundSectionAddFlightButton();
	}
	
	@Then("^user sees another form for a new inbound flight$")
	public void user_sees_another_form_for_a_new_inbound_flight() throws Throwable {
		recommendedItineraryDetailsPage.displayedInboundSectionSecondDeleteInboundFlightButtonRowData();
	}
	
	@When("^user deletes the recently added inbound flight from the itinerary$")
	public void user_deletes_the_recently_added_inbound_flight_from_the_itinerary() throws Throwable {
		recommendedItineraryDetailsPage.clickInboundSectionSecondDeleteInboundFlightButton();
	}
	
	@Then("^user does not see the new inbound flight$")
	public void user_does_not_see_the_new_inbound_flight() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'InboundFlightRecords')]//div[contains(@id, 'InboundItem')])[2]//div[contains(@id, 'deleteInboundIcon')]//a");
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary internal top flying from dropdown$")
	public void user_ticks_the_option_of_the_itinerary_internal_top_flying_from_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickInternalSectionTopFlyingFromDropdownRowDataOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary internal second flying from dropdown$")
	public void user_ticks_the_option_of_the_itinerary_internal_second_flying_from_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickInternalSectionSecondFlyingFromDropdownRowDataOption(arg1);
	}
	
	@Then("^user sees the itinerary internal top flying from dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_internal_top_flying_from_dropdown_contains(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.containsValueInternalSectionTopFlyingFromDropdownRowData(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary internal top flying to dropdown$")
	public void user_ticks_the_option_of_the_itinerary_internal_top_flying_to_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickInternalSectionTopFlyingToDropdownRowDataOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the itinerary internal second flying to dropdown$")
	public void user_ticks_the_option_of_the_itinerary_internal_second_flying_to_dropdown(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickInternalSectionSecondFlyingToDropdownRowDataOption(arg1);
	}
	
	@Then("^user sees the itinerary internal top flying to dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_internal_top_flying_to_dropdown_contains(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.containsValueInternalSectionTopFlyingToDropdownRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary internal top package day indicator field$")
	public void user_puts_in_the_itinerary_internal_top_package_day_indicator_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setInternalSectionTopPackageDayIndicatorInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary internal second package day indicator field$")
	public void user_puts_in_the_itinerary_internal_second_package_day_indicator_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setInternalSectionSecondPackageDayIndicatorInputRowData(arg1);
	}
	
	@When("^user adds the internal flight to the itinerary$")
	public void user_adds_the_internal_flight_to_the_itinerary() throws Throwable {
		recommendedItineraryDetailsPage.clickInternalSectionAddFlightButton();
	}
	
	@Then("^user sees another form for a new internal flight$")
	public void user_sees_another_form_for_a_new_internal_flight() throws Throwable {
		recommendedItineraryDetailsPage.displayedInternalSectionSecondDeleteInternalFlightButtonRowData();
	}
	
	@When("^user deletes the recently added internal flight from the itinerary$")
	public void user_deletes_the_recently_added_internal_flight_from_the_itinerary() throws Throwable {
		recommendedItineraryDetailsPage.clickInternalSectionSecondDeleteInternalFlightButton();
	}
	
	@Then("^user does not see the new internal flight$")
	public void user_does_not_see_the_new_internal_flight() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'InternalFlightRecords')]//div[contains(@id, 'InternalItem')])[2]//div[contains(@id, 'deleteInternalIcon')]//a");
	}
	
	@Then("^user sees the itinerary outbound flight icon$")
	public void user_sees_the_itinerary_outbound_flight_icon() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'OutboundContainer')]//span[contains(@class, 'plane-departure')]")));
	}
	
	@Then("^user sees the itinerary inbound flight icon$")
	public void user_sees_the_itinerary_inbound_flight_icon() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(@id, 'InboundlContainer')]//span[contains(@class, 'plane-arrival')]")));
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary comments internal field$")
	public void user_puts_in_the_itinerary_comments_internal_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setCommentsSectionInternalCommentsInput(arg1);
	}
	
	@Then("^user sees the itinerary comments internal field contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_comments_internal_field_contains(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.containsValueCommentsSectionInternalCommentsInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary comments external field$")
	public void user_puts_in_the_itinerary_comments_external_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setCommentsSectionExternalCommentsInput(arg1);
	}
	
	@Then("^user sees the itinerary comments external field contains \"([^\"]*)\"$")
	public void user_sees_the_itinerary_comments_external_field_contains(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.containsValueCommentsSectionExternalCommentsInput(arg1);
	}
	
	@Then("^user sees the itinerary date ranges departure date from and to textboxes enabled$")
	public void user_sees_the_itinerary_date_ranges_departure_date_from_and_to_textboxes_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledDateRangesSectionAddDepartureDateFromInput();
		recommendedItineraryDetailsPage.enabledDateRangesSectionAddDepartureDateToInput();
	}
	
	@Then("^user sees the update recommended itinerary title on the top left corner of the page$")
	public void user_sees_the_update_recommended_itinerary_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(text(), 'Update') and contains(text(), 'Itinerary')]")));
	}
	
	@Then("^user sees the itinerary inactive checkbox enabled$")
	public void user_sees_the_itinerary_inactive_checkbox_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledInactiveCheckbox();
	}
	
	@Then("^user sees the itinerary use package specific rule checkbox enabled$")
	public void user_sees_the_itinerary_use_package_specific_rule_checkbox_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledUsePackageSpecificRuleCheckbox();
	}
	
	@Then("^user sees the itinerary name field enabled$")
	public void user_sees_the_itinerary_name_field_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledItineraryNameInput();
	}
	
	@Then("^user sees the add inbound flight button is disabled$")
	public void user_sees_the_add_inbound_flight_button_is_disabled() throws Throwable {
		recommendedItineraryDetailsPage.disabledInboundSectionAddFlightButton();
	}
	
	@Then("^user sees the add inbound flight button is enabled$")
	public void user_sees_the_add_inbound_flight_button_is_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledInboundSectionAddFlightButton();
	}
	
	@Then("^user sees the copy recommended itinerary title on the top left corner of the page$")
	public void user_sees_the_copy_recommended_itinerary_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(text(), 'Copy Itinerary')]")));
	}
	
	@Then("^user sees recommended itinerary details fields enabled$")
	public void user_sees_recommended_itinerary_details_fields_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledTourCodeDropdown();
		recommendedItineraryDetailsPage.enabledItineraryNameInput();
		recommendedItineraryDetailsPage.enabledCustomerMarketDropdown();
		recommendedItineraryDetailsPage.enabledInactiveCheckbox();
		recommendedItineraryDetailsPage.enabledUsePackageSpecificRuleCheckbox();
	}
	
	@Then("^user sees recommended itinerary details comments section fields enabled$")
	public void user_sees_recommended_itinerary_details_comments_section_fields_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledCommentsSectionInternalCommentsInput();
		recommendedItineraryDetailsPage.enabledCommentsSectionExternalCommentsInput();
	}
	
	@Then("^user does not see the itinerary tour code dropdown contains the option \"([^\"]*)\"$")
	public void user_does_not_see_the_itinerary_tour_code_dropdown_contains_the_option(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.clickTourCodeDropdown();
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//label[text() = 'Tour Code']//parent::div//button//parent::div//div[contains(@class, 'search')]//input")), arg1);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//label[text() = 'Tour Code']//parent::div//ul//li[contains(@class, 'no-results')]")));
	}
	
	@Then("^user sees the existing itinerary date ranges departure date from and to textboxes enabled$")
	public void user_sees_the_existing_itinerary_date_ranges_departure_date_from_and_to_textboxes_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledDateRangesSectionSecondDepartureDateFromInputRowData();
		recommendedItineraryDetailsPage.enabledDateRangesSectionSecondDepartureDateToInputRowData();
	}
	
	@When("^user closes the recommended itinerary details$")
	public void user_closes_the_recommended_itinerary_details() throws Throwable {
		recommendedItinerariesPage = recommendedItineraryDetailsPage.clickCloseButton();
	}
	
	@When("^user disregards the closing of recommended itinerary details$")
	public void user_disregards_the_closing_of_recommended_itinerary_details() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user confirms the closing of recommended itinerary details$")
	public void user_confirms_the_closing_of_recommended_itinerary_details() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'This Itinerary is not created yet, are you sure you want to discard the changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
		CommonFunctions.pause(15000, false);
	}
	
	@When("^user saves the recommended itinerary details$")
	public void user_saves_the_recommended_itinerary_details() throws Throwable {
		recommendedItinerariesPage = recommendedItineraryDetailsPage.clickSaveButton();
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary date ranges departure date from field$")
	public void user_puts_in_the_itinerary_date_ranges_departure_date_from_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setDateRangesSectionAddDepartureDateFromInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the itinerary date ranges departure date to field$")
	public void user_puts_in_the_itinerary_date_ranges_departure_date_to_field(String arg1) throws Throwable {
		recommendedItineraryDetailsPage.setDateRangesSectionAddDepartureDateToInput(arg1);
	}
	
	@When("^user adds the new date range to the itinerary$")
	public void user_adds_the_new_date_range_to_the_itinerary() throws Throwable {
		recommendedItineraryDetailsPage.clickDateRangesSectionAddDateRangeButton();
	}
	
	@Then("^user sees the itinerary date ranges add date range button enabled$")
	public void user_sees_the_itinerary_date_ranges_add_date_ranges_button_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledDateRangesSectionAddDateRangeButton();
	}
	
	@Then("^user sees the itinerary date ranges departure date from and to textboxes are blank$")
	public void user_sees_the_itinerary_date_ranges_departure_date_from_and_to_textboxes_are_blank() throws Throwable {
		recommendedItineraryDetailsPage.containsValueDateRangesSectionAddDepartureDateFromInput("");
		recommendedItineraryDetailsPage.containsValueDateRangesSectionAddDepartureDateToInput("");
	}
	
	@Then("^user sees the itinerary date ranges add date range button disabled$")
	public void user_sees_the_itinerary_date_ranges_add_date_ranges_button_disabled() throws Throwable {
		recommendedItineraryDetailsPage.disabledDateRangesSectionAddDateRangeButton();
	}
	
	@When("^user deletes a date range of the itinerary$")
	public void user_deletes_a_date_range_of_the_itinerary() throws Throwable {
		recommendedItineraryDetailsPage.clickDateRangesSectionTopDeleteDateButtonRowData();
	}
	
	@Then("^user does not see the date range of the itinerary$")
	public void user_does_not_see_the_date_range_of_the_itinerary() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[text() = 'Delete Date'])[1]//parent::a");
	}
	
	@Then("^user sees the outbound flights, internal flights, inbound flights, and date ranges fields enabled$")
	public void user_sees_the_outbound_flights_internal_flights_inbound_flights_and_date_ranges_fields_enabled() throws Throwable {
		recommendedItineraryDetailsPage.enabledOutboundSectionAddFlightButton();
		recommendedItineraryDetailsPage.enabledInternalSectionAddFlightButton();
		recommendedItineraryDetailsPage.enabledInboundSectionAddFlightButton();
		recommendedItineraryDetailsPage.enabledDateRangesSectionAddDateRangeButton();
	}
	
	@Then("^user does not see the itinerary outbound delete flight button for the last row remaining$")
	public void user_does_not_see_the_itinerary_outbound_delete_flight_button_for_the_last_row_remaining() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'OutboundFlightRecords')]//div[contains(@id, 'OutboundItem')])[1]//div[contains(@id, 'deleteOutboundIcon')]//a");
	}
	
	@Then("^user does not see the itinerary internal delete flight button for the last row remaining$")
	public void user_does_not_see_the_itinerary_internal_delete_flight_button_for_the_last_row_remaining() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'InternalFlightRecords')]//div[contains(@id, 'InternalItem')])[1]//div[contains(@id, 'deleteInternalIcon')]//a");
	}
	
	@Then("^user does not see the itinerary inbound delete flight button for the last row remaining$")
	public void user_does_not_see_the_itinerary_inbound_delete_flight_button_for_the_last_row_remaining() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'InboundFlightRecords')]//div[contains(@id, 'InboundItem')])[1]//div[contains(@id, 'deleteInboundIcon')]//a");
	}
	
	@Then("^user does not see the delete icon for the last date range of the itinerary$")
	public void user_does_not_see_the_delete_icon_for_the_last_date_range_of_the_itinerary() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[text() = 'Delete Date'])[1]//parent::a");
	}
	
	@Then("^user sees the itinerary single select dropdowns have blank option$")
	public void user_sees_the_itinerary_single_select_dropdowns_have_blank_option() throws Throwable {
		recommendedItineraryDetailsPage.clickOutboundSectionTopFlyingToDropdownRowData();
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//ul[contains(@role, 'listbox')]//li//div[not(contains(text(), '-'))]")));
	}
	
	@Then("^user sees the recommended itinerary search results that is both active and inactive$")
	public void user_sees_the_recommended_itinerary_search_results_that_is_both_active_and_inactive() throws Throwable {
		CommonFunctions.textVisibleInPage("Active");
		CommonFunctions.textVisibleInPage("Inactive");
	}
	// End - Recommended Itinerary Details Page Functions
	
	// Start - Queue Place Settings Page Functions
	@Then("^user sees the queue place settings table and its contents$")
	public void user_sees_the_queue_place_settings_table_and_its_contents() throws Throwable {
		queuePlaceSettingsPage.displayedSettingNameColumnHeader();
		queuePlaceSettingsPage.displayedGDSQueueNumberColumnHeader();
		queuePlaceSettingsPage.displayedCustomerMarketColumnHeader();
		queuePlaceSettingsPage.displayedCustomerTypeColumnHeader();
		queuePlaceSettingsPage.displayedFlightActionColumnHeader();
		queuePlaceSettingsPage.displayedStatusColumnHeader();
		queuePlaceSettingsPage.displayedTopCopyButtonRowData();
		queuePlaceSettingsPage.displayedTopEditButtonRowData();
		queuePlaceSettingsPage.displayedTopDeleteButtonRowData();
		queuePlaceSettingsPage.displayedTopQueueNameRowData();
		queuePlaceSettingsPage.displayedTopGDSQueueNameRowData();
		queuePlaceSettingsPage.displayedTopCustomerMarketRowData();
		queuePlaceSettingsPage.displayedTopCustomerTypeRowData();
		queuePlaceSettingsPage.displayedTopFlightActionRowData();
		queuePlaceSettingsPage.displayedTopStatusRowData();
	}
	
	@Then("^user sees the queue place settings table shows \"([^\"]*)\" rows$")
	public void user_sees_the_queue_place_settings_table_shows_rows(String arg1) throws Throwable {
		queuePlaceSettingsPage.containsValuePaginationSectionRowsDropdown("Rows: " + arg1);
	}
	
	@Then("^user sees the queue place settings table filters$")
	public void user_sees_the_queue_place_settings_table_filters() throws Throwable {
		queuePlaceSettingsPage.displayedQueueNameFilterInput();
		queuePlaceSettingsPage.displayedGDSQueueNumberFilterInput();
		queuePlaceSettingsPage.displayedCustomerMarketFilterInput();
		queuePlaceSettingsPage.displayedCustomerTypeFilterInput();
		queuePlaceSettingsPage.displayedFlightActionFilterInput();
		queuePlaceSettingsPage.displayedStatusFilterInput();
	}
	
	@When("^user decides to create a new queue place rule$")
	public void user_decides_to_create_a_new_queue_place_rule() throws Throwable {
		queuePlaceSettingDetailsPage = queuePlaceSettingsPage.clickAddNewQueuePlaceRuleButton();
	}
	
	@Then("^user sees the search queue place setting exclude inactive rules checkbox$")
	public void user_sees_the_search_queue_place_setting_exclude_inactive_rules_checkbox() throws Throwable {
		queuePlaceSettingsPage.displayedExcludeInactiveRulesCheckbox();
	}
	
	@When("^user ticks the search queue place setting exclude inactive rules checkbox$")
	public void user_ticks_the_search_queue_place_setting_exclude_inactive_rules_checkbox() throws Throwable {
		queuePlaceSettingsPage.clickExcludeInactiveRulesCheckbox();
	}
	
	@When("^user puts \"([^\"]*)\" in the status column filter to filter the queue place setting results$")
	public void user_puts_in_the_status_column_filter_to_filter_the_queue_place_setting_results(String arg1) throws Throwable {
		queuePlaceSettingsPage.setStatusFilterInput(arg1);
	}
	
	@Then("^user sees the queue place setting search results with the specific status \"([^\"]*)\"$")
	public void user_sees_the_queue_place_setting_search_results_with_the_specific_status(String arg1) throws Throwable {
		queuePlaceSettingsPage.containsValueTopStatusRowData(arg1);
	}
	
	@When("^user copies the queue place rule$")
	public void user_copies_the_queue_place_rule() throws Throwable {
		queuePlaceSettingDetailsPage = queuePlaceSettingsPage.clickTopCopyButtonRowData();
	}
	
	@When("^user edits the queue place rule$")
	public void user_edits_the_queue_place_rule() throws Throwable {
		queuePlaceSettingDetailsPage = queuePlaceSettingsPage.clickTopEditButtonRowData();
	}
	
	@When("^user deletes a queue place setting$")
	public void user_deletes_a_queue_place_setting() throws Throwable {
		queuePlaceSettingsPage.clickTopDeleteButtonRowData();
	}
	
	@When("^user disregards the deletion of the queue place setting$")
	public void user_disregards_the_deletion_of_the_queue_place_setting() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@Then("^user sees the queue place setting is not deleted$")
	public void user_sees_the_queue_place_setting_is_not_deleted() throws Throwable {
		queuePlaceSettingsPage.containsValueTopQueueNameRowData("Test1234");
	}
	
	@When("^user confirms the deletion of the queue place setting$")
	public void user_confirms_the_deletion_of_the_queue_place_setting() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this Queue Rule?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user puts \"([^\"]*)\" in the queue name column filter to filter the queue place setting results$")
	public void user_puts_in_the_queue_name_column_filter_to_filter_the_queue_place_setting_results(String arg1) throws Throwable {
		queuePlaceSettingsPage.setQueueNameFilterInput(arg1);
	}
	
	@Then("^user sees the queue place settings table pagination buttons are enabled$")
	public void user_sees_the_queue_place_settings_table_pagination_buttons_are_enabled() throws Throwable {
		queuePlaceSettingsPage.enabledPaginationSectionRowsDropdown();
		// queuePlaceSettingsPage.enabledPaginationSectionNextButton();
		// queuePlaceSettingsPage.enabledPaginationSectionLastButton();
	}
	
	@Then("^user sees the queue place setting flight type column$")
	public void user_sees_the_queue_place_setting_flight_type_column() throws Throwable {
		queuePlaceSettingsPage.displayedFlightTypeColumnHeader();
		queuePlaceSettingsPage.displayedFlightTypeFilterInput();
	}
	// End - Queue Place Settings Page Functions
	
	// Start - Queue Place Setting Details Page Functions
	@Then("^user sees the add queue place rule title on the top left corner of the page$")
	public void user_sees_the_add_queue_place_rule_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[text() = 'Add Queue Place Rule']")));
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the queue place rule customer market dropdown$")
	public void user_ticks_the_option_of_the_queue_place_rule_customer_market_dropdown(String arg1) throws Throwable {
		queuePlaceSettingDetailsPage.clickCustomerMarketDropdownOption(arg1);
	}
	
	@Then("^user sees the queue place rule customer market dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_queue_place_rule_customer_market_dropdown_contains(String arg1) throws Throwable {
		queuePlaceSettingDetailsPage.containsValueCustomerMarketDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the queue place rule customer type dropdown$")
	public void user_ticks_the_option_of_the_queue_place_rule_customer_type_dropdown(String arg1) throws Throwable {
		queuePlaceSettingDetailsPage.clickCustomerTypeDropdownOption(arg1);
	}
	
	@Then("^user sees the queue place rule customer type dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_queue_place_rule_customer_type_dropdown_contains(String arg1) throws Throwable {
		queuePlaceSettingDetailsPage.containsValueCustomerTypeDropdown(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the queue place rule name field$")
	public void user_puts_in_the_queue_place_rule_name_field(String arg1) throws Throwable {
		queuePlaceSettingDetailsPage.setSettingNameInput(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the queue place rule flight action dropdown$")
	public void user_ticks_the_option_of_the_queue_place_rule_flight_action_dropdown(String arg1) throws Throwable {
		queuePlaceSettingDetailsPage.clickFlightActionDropdownOption(arg1);
	}
	
	@Then("^user sees the queue place rule flight action dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_queue_place_rule_flight_action_dropdown_contains(String arg1) throws Throwable {
		queuePlaceSettingDetailsPage.containsValueFlightActionDropdown(arg1);
	}
	
	@Then("^user sees the queue place rule inactive checkbox$")
	public void user_sees_the_queue_place_rule_inactive_checkbox() throws Throwable {
		queuePlaceSettingDetailsPage.displayedInactiveCheckbox();
	}
	
	@Then("^user sees the queue place rule details queue details fields enabled$")
	public void user_sees_the_queue_place_rule_details_queue_details_fields_enabled() throws Throwable {
		queuePlaceSettingDetailsPage.enabledQueueDetailsSectionTopFlightTypeDropdownRowData();
		queuePlaceSettingDetailsPage.enabledQueueDetailsSectionTopGDSQueueNumberInputRowData();
	}
	
	@Then("^user sees the queue place rule details flight type dropdown and its options$")
	public void user_sees_the_queue_place_rule_details_flight_type_dropdown_and_its_options() throws Throwable {
		queuePlaceSettingDetailsPage.clickQueueDetailsSectionTopFlightTypeDropdownRowDataOption("ALL");
		queuePlaceSettingDetailsPage.containsValueQueueDetailsSectionTopFlightTypeDropdownRowData("ALL");
		queuePlaceSettingDetailsPage.clickQueueDetailsSectionTopFlightTypeDropdownRowDataOption("Domestic");
		queuePlaceSettingDetailsPage.containsValueQueueDetailsSectionTopFlightTypeDropdownRowData("Domestic");
		queuePlaceSettingDetailsPage.clickQueueDetailsSectionTopFlightTypeDropdownRowDataOption("International");
		queuePlaceSettingDetailsPage.containsValueQueueDetailsSectionTopFlightTypeDropdownRowData("International");
		queuePlaceSettingDetailsPage.clickQueueDetailsSectionTopFlightTypeDropdownRowDataOption("Trans-Tasman");
		queuePlaceSettingDetailsPage.containsValueQueueDetailsSectionTopFlightTypeDropdownRowData("Trans-Tasman");
	}
	
	@When("^user puts \"([^\"]*)\" in the queue place rule details gds queue number field$")
	public void user_puts_in_the_queue_place_rule_details_gds_queue_number_field(String arg1) throws Throwable {
		queuePlaceSettingDetailsPage.setQueueDetailsSectionTopGDSQueueNumberInputRowData(arg1);
	}
	
	@Then("^user sees that the queue place rule details gds queue number field contains \"([^\"]*)\"$")
	public void user_sees_that_the_queue_place_rule_details_gds_queue_number_field_contains(String arg1) throws Throwable {
		queuePlaceSettingDetailsPage.containsValueQueueDetailsSectionTopGDSQueueNumberInputRowData(arg1);
	}
	
	@Then("^user sees the queue place rule close button$")
	public void user_sees_the_queue_place_rule_close_button() throws Throwable {
		queuePlaceSettingDetailsPage.displayedCloseButton();
	}
	
	@Then("^user sees the queue place rule save queue place rule button$")
	public void user_sees_the_queue_place_rule_save_queue_place_rule_button() throws Throwable {
		queuePlaceSettingDetailsPage.displayedSaveQueuePlaceRuleButton();
	}
	
	@When("^user closes the queue place rule details$")
	public void user_closes_the_queue_place_rule_details() throws Throwable {
		queuePlaceSettingDetailsPage.clickCloseButton();
	}
	
	@When("^user disregards the closing of queue place rule details$")
	public void user_disregards_the_closing_of_queue_place_rule_details() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user confirms the closing of queue place rule details$")
	public void user_confirms_the_closing_of_queue_place_rule_details() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user saves the queue place rule details$")
	public void user_saves_the_queue_place_rule_details() throws Throwable {
		queuePlaceSettingDetailsPage.clickSaveQueuePlaceRuleButton();
	}
	
	@Then("^user sees the copy queue place rule title on the top left corner of the page$")
	public void user_sees_the_copy_queue_place_rule_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(text(), 'Copy -')]")));
	}
	
	@Then("^user sees the queue place rule details fields enabled$")
	public void user_sees_the_queue_place_rule_details_fields_enabled() throws Throwable {
		queuePlaceSettingDetailsPage.enabledCustomerMarketDropdown();
		queuePlaceSettingDetailsPage.enabledCustomerTypeDropdown();
		queuePlaceSettingDetailsPage.enabledSettingNameInput();
		queuePlaceSettingDetailsPage.enabledFlightActionDropdown();
		queuePlaceSettingDetailsPage.enabledInactiveCheckbox();
	}
	
	@Then("^user sees the edit queue place rule title on the top left corner of the page$")
	public void user_sees_the_edit_queue_place_rule_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(text(), 'Update -')]")));
	}
	
	@When("^user deletes the queue place rule queue detail$")
	public void user_deletes_the_queue_place_rule_queue_detail() throws Throwable {
		queuePlaceSettingDetailsPage.clickQueueDetailsSectionTopDeleteQueueDetailButtonRowData();
	}
	
	@Then("^user does not see the queue place rule queue detail$")
	public void user_does_not_see_the_queue_place_rule_queue_detail() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[@class = 'ListRecords' and contains(@id, 'AirAdminQueue')]//span[contains(@class, 'trash')]//parent::a)[1]");
	}
	
	@When("^user adds a new queue place rule queue detail row$")
	public void user_adds_a_new_queue_place_rule_queue_detail_row() throws Throwable {
		queuePlaceSettingDetailsPage.clickQueueDetailsSectionAddQueueDetailsButton();
	}
	
	@Then("^user sees a new queue place rule queue detail row has been added$")
	public void user_sees_a_new_queue_place_rule_queue_detail_row_has_been_added() throws Throwable {
		queuePlaceSettingDetailsPage.containsValueQueueDetailsSectionSecondFlightTypeDropdownRowData("ALL");
	}
	
	@When("^user selects different values for the two dropdowns of the queue place rule details queue details flight type dropdowns$")
	public void user_selects_different_values_for_the_two_dropdowns_of_the_queue_place_rule_details_queue_details_flight_type_dropdowns() throws Throwable {
		queuePlaceSettingDetailsPage.clickQueueDetailsSectionTopFlightTypeDropdownRowDataOption("Domestic");
		queuePlaceSettingDetailsPage.clickQueueDetailsSectionSecondFlightTypeDropdownRowDataOption("International");
	}
	// End - Queue Place Setting Details Page Functions
	
	// Start - Markup Rules Page Functions
	@When("^user decides to create a new markup rule$")
	public void user_decides_to_create_a_new_markup_rule() throws Throwable {
		markupRuleDetailsPage = markupRulesPage.clickAddNewMarkupRuleButton();
	}
	
	@Then("^user sees the markup rule title on the top left corner of the page$")
	public void user_sees_the_markup_rule_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[text() = 'Markup Rule']")));
	}
	
	@Then("^user sees the markup rule fields and buttons$")
	public void user_sees_the_markup_rule_fields_and_buttons() throws Throwable {
		markupRulesPage.displayedAddNewMarkupRuleButton();
		markupRulesPage.displayedAirlineDropdown();
		markupRulesPage.displayedTourDestinationDropdown();
		markupRulesPage.displayedCustomerMarketDropdown();
		markupRulesPage.displayedSourceDropdown();
		markupRulesPage.displayedCabinClassDropdown();
		markupRulesPage.displayedFareTypeDropdown();
		markupRulesPage.displayedItineraryTypeDropdown();
		markupRulesPage.displayedFareBasicCodeInput();
		markupRulesPage.displayedInactiveCheckbox();
		markupRulesPage.displayedResetButton();
		markupRulesPage.displayedFindButton();
	}
	
	@Then("^user sees the markup rule page table and its contents$")
	public void user_sees_the_markup_rule_page_table_and_its_contents() throws Throwable {
		markupRulesPage.displayedAirlineColumnHeader();
		markupRulesPage.displayedAirlineFilterInput();
		markupRulesPage.displayedTourDestinationColumnHeader();
		markupRulesPage.displayedTourDestinationFilterInput();
		markupRulesPage.displayedCustomerMarketColumnHeader();
		markupRulesPage.displayedCustomerMarketFilterInput();
		markupRulesPage.displayedSourceColumnHeader();
		markupRulesPage.displayedSourceFilterInput();
		markupRulesPage.displayedCabinClassColumnHeader();
		markupRulesPage.displayedCabinClassFilterInput();
		markupRulesPage.displayedFareTypeColumnHeader();
		markupRulesPage.displayedFareTypeFilterInput();
		markupRulesPage.displayedItineraryTypeColumnHeader();
		markupRulesPage.displayedItineraryTypeFilterInput();
		markupRulesPage.displayedFareBasicCodeColumnHeader();
		markupRulesPage.displayedFareBasisCodeFilterInput();
		markupRulesPage.displayedStatusColumnHeader();
		markupRulesPage.displayedStatusFilterInput();
		markupRulesPage.displayedTopCopyButtonRowData();
		markupRulesPage.displayedTopEditButtonRowData();
		markupRulesPage.displayedTopDeleteButtonRowData();
		markupRulesPage.displayedTopAirlineRowData();
		markupRulesPage.displayedTopTourDestinationRowData();
		markupRulesPage.displayedTopCustomerMarketRowData();
		markupRulesPage.displayedTopSourceRowData();
		markupRulesPage.displayedTopCabinClassRowData();
		markupRulesPage.displayedTopFareTypeRowData();
		markupRulesPage.displayedTopItineraryTypeRowData();
		markupRulesPage.displayedTopFareBasisCodeRowData();
		markupRulesPage.displayedTopStatusRowData();
	}
	
	@When("^user copies the markup rule$")
	public void user_copies_the_markup_rule() throws Throwable {
		markupRuleDetailsPage = markupRulesPage.clickTopCopyButtonRowData();
	}
	
	@When("^user updates the markup rule$")
	public void user_updates_the_markup_rule() throws Throwable {
		markupRuleDetailsPage = markupRulesPage.clickTopEditButtonRowData();
	}
	
	@When("^user deletes a markup rule$")
	public void user_deletes_a_markup_rule() throws Throwable {
		markupRulesPage.clickTopDeleteButtonRowData();
	}
	
	@When("^user disregards the deletion of the markup rule$")
	public void user_disregards_the_deletion_of_the_markup_rule() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@Then("^user sees the markup rule is not deleted$")
	public void user_sees_the_markup_rule_is_not_deleted() throws Throwable {
		markupRulesPage.containsValueTopAirlineRowData("2L, 3K, 4D, 5H");
	}
	
	@When("^user confirms the deletion of the markup rule$")
	public void user_confirms_the_deletion_of_the_markup_rule() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Do you want to delete Markup Rule?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the search markup rule airline dropdown$")
	public void user_ticks_the_option_of_the_search_markup_rule_airline_dropdown(String arg1) throws Throwable {
		markupRulesPage.clickAirlineDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the search markup rule tour destination dropdown$")
	public void user_ticks_the_option_of_the_search_markup_rule_tour_destination_dropdown(String arg1) throws Throwable {
		markupRulesPage.clickTourDestinationDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the search markup rule customer market dropdown$")
	public void user_ticks_the_option_of_the_search_markup_rule_customer_market_dropdown(String arg1) throws Throwable {
		markupRulesPage.clickCustomerMarketDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the search markup rule cabin class dropdown$")
	public void user_ticks_the_option_of_the_search_markup_rule_cabin_class_dropdown(String arg1) throws Throwable {
		markupRulesPage.clickCabinClassDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the search markup rule fare type dropdown$")
	public void user_ticks_the_option_of_the_search_markup_rule_fare_type_dropdown(String arg1) throws Throwable {
		markupRulesPage.clickFareTypeDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the search markup rule itinerary type dropdown$")
	public void user_ticks_the_option_of_the_search_markup_rule_itinerary_type_dropdown(String arg1) throws Throwable {
		markupRulesPage.clickItineraryTypeDropdownOption(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the airline column filter to filter the markup rule results$")
	public void user_puts_in_the_airline_column_filter_to_filter_the_markup_rule_results(String arg1) throws Throwable {
		markupRulesPage.setAirlineFilterInput(arg1);
	}
	
	@Then("^user sees the markup rule search results with the specific airlines \"([^\"]*)\"$")
	public void user_sees_the_markup_rule_search_results_with_the_specific_airlines(String arg1) throws Throwable {
		markupRulesPage.containsValueTopAirlineRowData(arg1);
	}
	
	@When("^user resets the markup rule search results$")
	public void user_resets_the_markup_rule_search_results() throws Throwable {
		markupRulesPage.clickResetButton();
	}
	
	@Then("^user sees the markup rule table was reverted to original display$")
	public void user_sees_the_markup_rule_table_was_reverted_to_original_display() throws Throwable {
		CommonFunctions.textHiddenInPage("No matching records found.");
	}
	
	@When("^user searches for a markup rule with the given search filters$")
	public void user_searches_for_a_markup_rule_with_the_given_search_filters() throws Throwable {
		markupRulesPage.clickFindButton();
	}
	
	@When("^user ticks the inactive checkbox of the search markup rule$")
	public void user_ticks_the_inactive_checkbox_of_the_search_markup_rule() throws Throwable {
		markupRulesPage.clickInactiveCheckbox();
	}
	
	@Then("^user sees the markup rule search results includes inactive markup rules$")
	public void user_sees_the_markup_rule_search_results_includes_inactive_markup_rules() throws Throwable {
		CommonFunctions.textVisibleInPage("Active");
		markupRulesPage.setStatusFilterInput("Inactive");
		CommonFunctions.textVisibleInPage("Inactive");
	}
	// End - Markup Rules Page Functions
	
	// Start - Markup Rule Details Page Functions
	@Then("^user sees the add markup rule title on the top left corner of the page$")
	public void user_sees_the_add_markup_rule_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(text(), 'Add') and contains(text(), 'Markup Rule')]")));
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule airline dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_airline_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.clickAirlineDropdownOption(arg1);
	}
	
	@Then("^user sees the markup rule airline dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_markup_rule_airline_dropdown_contains(String arg1) throws Throwable {
		markupRuleDetailsPage.containsValueAirlineDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule tour destination dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_tour_destination_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.clickTourDestinationDropdownOption(arg1);
	}
	
	@Then("^user sees the markup rule tour destination dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_markup_rule_tour_destination_dropdown_contains(String arg1) throws Throwable {
		markupRuleDetailsPage.containsValueTourDestinationDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule customer market dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_customer_market_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.clickCustomerMarketDropdownOption(arg1);
	}
	
	@Then("^user sees the markup rule customer market dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_markup_rule_customer_market_dropdown_contains(String arg1) throws Throwable {
		markupRuleDetailsPage.containsValueCustomerMarketDropdown(arg1);
	}
	
	@When("^user selects the \"([^\"]*)\" option of the markup rule source dropdown$")
	public void user_selects_the_option_of_the_markup_rule_source_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.selectSourceValue(arg1);
	}
	
	@Then("^user sees the markup rule source dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_markup_rule_source_dropdown_contains(String arg1) throws Throwable {
		markupRuleDetailsPage.containsValueSourceDropdown(arg1);
	}
	
	@Then("^user sees the markup rule inactive checkbox enabled$")
	public void user_sees_the_markup_rule_inactive_checkbox_enabled() throws Throwable {
		markupRuleDetailsPage.enabledInactiveCheckbox();
	}
	
	@Then("^user sees the markup rule cost setting section$")
	public void user_sees_the_markup_rule_cost_setting_section() throws Throwable {
		CommonFunctions.textVisibleInPage("Cost Setting");
	}
	
	@Then("^user sees the markup rule price setting section$")
	public void user_sees_the_markup_rule_price_setting_section() throws Throwable {
		CommonFunctions.textVisibleInPage("Price Setting");
	}
	
	@Then("^user sees the markup rule cost setting cabin class dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_markup_rule_cost_setting_cabin_class_dropdown_contains(String arg1) throws Throwable {
		markupRuleDetailsPage.containsValueCostSettingSectionFirstCabinClassDropdown(arg1);
	}
	
	@Then("^user sees the markup rule cost setting fare type dropdown and its options$")
	public void user_sees_the_markup_rule_cost_setting_fare_type_dropdown_and_its_options() throws Throwable {
		markupRuleDetailsPage.clickCostSettingSectionFirstFareTypeDropdownOption("Negotiated");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstFareTypeDropdown("Negotiated");
		markupRuleDetailsPage.clickCostSettingSectionFirstFareTypeDropdownOption("Negotiated");
		markupRuleDetailsPage.clickCostSettingSectionFirstFareTypeDropdownOption("Published");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstFareTypeDropdown("Published");
		markupRuleDetailsPage.clickCostSettingSectionFirstFareTypeDropdownOption("Negotiated");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstFareTypeDropdown("All Selected");
	}
	
	@Then("^user sees the markup rule cost setting itinerary type dropdown and its options$")
	public void user_sees_the_markup_rule_cost_setting_itinerary_type_dropdown_and_its_options() throws Throwable {
		markupRuleDetailsPage.clickCostSettingSectionFirstItineraryTypeDropdownOption("Domestic");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstItineraryTypeDropdown("Domestic");
		markupRuleDetailsPage.clickCostSettingSectionFirstItineraryTypeDropdownOption("Domestic");
		markupRuleDetailsPage.clickCostSettingSectionFirstItineraryTypeDropdownOption("International");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstItineraryTypeDropdown("International");
		markupRuleDetailsPage.clickCostSettingSectionFirstItineraryTypeDropdownOption("International");
		markupRuleDetailsPage.clickCostSettingSectionFirstItineraryTypeDropdownOption("Trans-Tasman");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstItineraryTypeDropdown("Trans-Tasman");
		markupRuleDetailsPage.clickCostSettingSectionFirstItineraryTypeDropdownOption("Select All");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstItineraryTypeDropdown("All Selected");
	}
	
	@Then("^user sees the markup rule cost setting fare basic code field$")
	public void user_sees_the_markup_rule_cost_setting_fare_basic_code_field() throws Throwable {
		markupRuleDetailsPage.displayedCostSettingSectionFirstFareBasisCodeInput();
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule cost setting fare basic code field$")
	public void user_puts_in_the_markup_rule_cost_setting_fare_basic_code_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setCostSettingSectionFirstFareBasisCodeInput(arg1);
	}
	
	@Then("^user sees the markup rule cost setting markup style dropdown and its options$")
	public void user_sees_the_markup_rule_cost_setting_markup_style_dropdown_and_its_options() throws Throwable {
		markupRuleDetailsPage.selectCostSettingSectionFirstMarkupStyleValue("Down");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstMarkupStyleDropdown("Down");
		markupRuleDetailsPage.selectCostSettingSectionFirstMarkupStyleValue("Up");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstMarkupStyleDropdown("Up");
	}
	
	@Then("^user sees the markup rule cost setting markup type dropdown and its options$")
	public void user_sees_the_markup_rule_cost_setting_markup_type_dropdown_and_its_options() throws Throwable {
		markupRuleDetailsPage.selectCostSettingSectionFirstMarkupTypeValue("Amount");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstMarkupTypeDropdown("Amount");
		markupRuleDetailsPage.selectCostSettingSectionFirstMarkupTypeValue("Percentage");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstMarkupTypeDropdown("Percentage");
		markupRuleDetailsPage.selectCostSettingSectionFirstMarkupTypeValue("Both");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstMarkupTypeDropdown("Both");
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule cost setting % value field$")
	public void user_puts_in_the_markup_rule_cost_setting_value_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setCostSettingSectionFirstPercentageInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule cost setting amount value field$")
	public void user_puts_in_the_markup_rule_cost_setting_amount_value_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setCostSettingSectionFirstAmountInput(arg1);
	}
	
	@Then("^user sees the markup rule cost setting apply on dropdown and its options$")
	public void user_sees_the_markup_rule_cost_setting_apply_on_dropdown_and_its_options() throws Throwable {
		markupRuleDetailsPage.selectCostSettingSectionFirstApplyOnValue("Base Fare");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstApplyOnDropdown("Base Fare");
		markupRuleDetailsPage.selectCostSettingSectionFirstApplyOnValue("Total Fare");
		markupRuleDetailsPage.containsValueCostSettingSectionFirstApplyOnDropdown("Total Fare");
	}
	
	@Then("^user sees the markup rule cost setting travel date from field$")
	public void user_sees_the_markup_rule_cost_setting_travel_date_from_field() throws Throwable {
		markupRuleDetailsPage.displayedCostSettingSectionFirstTravelDateFromInput();
	}
	
	@Then("^user sees the markup rule cost setting travel date to field$")
	public void user_sees_the_markup_rule_cost_setting_travel_date_to_field() throws Throwable {
		markupRuleDetailsPage.displayedCostSettingSectionFirstTravelDateToInput();
	}
	
	@Then("^user sees the markup rule add cost setting button$")
	public void user_sees_the_markup_rule_add_cost_setting_button() throws Throwable {
		markupRuleDetailsPage.displayedCostSettingSectionAddCostSettingButton();
	}
	
	@Then("^user sees the markup rule close button$")
	public void user_sees_the_markup_rule_close_button() throws Throwable {
		markupRuleDetailsPage.displayedCloseButton();
	}
	
	@Then("^user sees the markup rule save button$")
	public void user_sees_the_markup_rule_save_button() throws Throwable {
		markupRuleDetailsPage.displayedSaveButton();
	}
	
	@Then("^user sees the markup rule price setting cabin class dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_markup_rule_price_setting_cabin_class_dropdown_contains(String arg1) throws Throwable {
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstCabinClassDropdown(arg1);
	}
	
	@Then("^user sees the markup rule price setting fare type dropdown and its options$")
	public void user_sees_the_markup_rule_price_setting_fare_type_dropdown_and_its_options() throws Throwable {
		markupRuleDetailsPage.clickPriceSettingSectionFirstFareTypeDropdownOption("Negotiated");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstFareTypeDropdown("Negotiated");
		markupRuleDetailsPage.clickPriceSettingSectionFirstFareTypeDropdownOption("Negotiated");
		markupRuleDetailsPage.clickPriceSettingSectionFirstFareTypeDropdownOption("Published");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstFareTypeDropdown("Published");
		markupRuleDetailsPage.clickPriceSettingSectionFirstFareTypeDropdownOption("Negotiated");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstFareTypeDropdown("All Selected");
	}
	
	@Then("^user sees the markup rule price setting itinerary type dropdown and its options$")
	public void user_sees_the_markup_rule_price_setting_itinerary_type_dropdown_and_its_options() throws Throwable {
		markupRuleDetailsPage.clickPriceSettingSectionFirstItineraryTypeDropdownOption("Domestic");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstItineraryTypeDropdown("Domestic");
		markupRuleDetailsPage.clickPriceSettingSectionFirstItineraryTypeDropdownOption("Domestic");
		markupRuleDetailsPage.clickPriceSettingSectionFirstItineraryTypeDropdownOption("International");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstItineraryTypeDropdown("International");
		markupRuleDetailsPage.clickPriceSettingSectionFirstItineraryTypeDropdownOption("International");
		markupRuleDetailsPage.clickPriceSettingSectionFirstItineraryTypeDropdownOption("Trans-Tasman");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstItineraryTypeDropdown("Trans-Tasman");
		markupRuleDetailsPage.clickPriceSettingSectionFirstItineraryTypeDropdownOption("Select All");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstItineraryTypeDropdown("All Selected");
	}
	
	@Then("^user sees the markup rule price setting fare basic code field$")
	public void user_sees_the_markup_rule_price_setting_fare_basic_code_field() throws Throwable {
		markupRuleDetailsPage.displayedPriceSettingSectionFirstFareBasisCodeInput();
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule price setting fare basic code field$")
	public void user_puts_in_the_markup_rule_price_setting_fare_basic_code_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setPriceSettingSectionFirstFareBasisCodeInput(arg1);
	}
	
	@Then("^user sees the markup rule price setting markup style dropdown and its options$")
	public void user_sees_the_markup_rule_price_setting_markup_style_dropdown_and_its_options() throws Throwable {
		markupRuleDetailsPage.selectPriceSettingSectionFirstMarkupStyleValue("Down");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstMarkupStyleDropdown("Down");
		markupRuleDetailsPage.selectPriceSettingSectionFirstMarkupStyleValue("Up");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstMarkupStyleDropdown("Up");
	}
	
	@Then("^user sees the markup rule price setting markup type dropdown and its options$")
	public void user_sees_the_markup_rule_price_setting_markup_type_dropdown_and_its_options() throws Throwable {
		markupRuleDetailsPage.selectPriceSettingSectionFirstMarkupTypeValue("Amount");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstMarkupTypeDropdown("Amount");
		markupRuleDetailsPage.selectPriceSettingSectionFirstMarkupTypeValue("Percentage");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstMarkupTypeDropdown("Percentage");
		markupRuleDetailsPage.selectPriceSettingSectionFirstMarkupTypeValue("Both");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstMarkupTypeDropdown("Both");
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule price setting % value field$")
	public void user_puts_in_the_markup_rule_price_setting_value_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setPriceSettingSectionFirstPercentageInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule price setting amount value field$")
	public void user_puts_in_the_markup_rule_price_setting_amount_value_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setPriceSettingSectionFirstAmountInput(arg1);
	}
	
	@Then("^user sees the markup rule price setting apply on dropdown and its options$")
	public void user_sees_the_markup_rule_price_setting_apply_on_dropdown_and_its_options() throws Throwable {
		markupRuleDetailsPage.selectPriceSettingSectionFirstApplyOnValue("Base Fare");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstApplyOnDropdown("Base Fare");
		markupRuleDetailsPage.selectPriceSettingSectionFirstApplyOnValue("Total Fare");
		markupRuleDetailsPage.containsValuePriceSettingSectionFirstApplyOnDropdown("Total Fare");
	}
	
	@Then("^user sees the markup rule price setting travel date from field$")
	public void user_sees_the_markup_rule_price_setting_travel_date_from_field() throws Throwable {
		markupRuleDetailsPage.displayedPriceSettingSectionFirstTravelDateFromInput();
	}
	
	@Then("^user sees the markup rule price setting travel date to field$")
	public void user_sees_the_markup_rule_price_setting_travel_date_to_field() throws Throwable {
		markupRuleDetailsPage.displayedPriceSettingSectionFirstTravelDateToInput();
	}
	
	@Then("^user sees the markup rule add price setting button$")
	public void user_sees_the_markup_rule_add_price_setting_button() throws Throwable {
		markupRuleDetailsPage.displayedPriceSettingSectionAddPriceSettingButton();
	}
	
	@When("^user adds a cost setting to the markup rule$")
	public void user_adds_a_cost_setting_to_the_markup_rule() throws Throwable {
		markupRuleDetailsPage.clickCostSettingSectionAddCostSettingButton();
	}
	
	@Then("^user sees another form for a new cost setting$")
	public void user_sees_another_form_for_a_new_cost_setting() throws Throwable {
		markupRuleDetailsPage.displayedCostSettingSectionSecondCabinClassDropdown();
	}
	
	@When("^user adds a price setting to the markup rule$")
	public void user_adds_a_price_setting_to_the_markup_rule() throws Throwable {
		markupRuleDetailsPage.clickPriceSettingSectionAddPriceSettingButton();
	}
	
	@Then("^user sees another form for a new price setting$")
	public void user_sees_another_form_for_a_new_price_setting() throws Throwable {
		markupRuleDetailsPage.displayedPriceSettingSectionSecondCabinClassDropdown();
	}
	
	@When("^user closes the markup rule details$")
	public void user_closes_the_markup_rule_details() throws Throwable {
		markupRuleDetailsPage.clickCloseButton();
	}
	
	@When("^user disregards the closing of markup rule details$")
	public void user_disregards_the_closing_of_markup_rule_details() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user confirms the closing of markup rule details$")
	public void user_confirms_the_closing_of_markup_rule_details() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to discard your changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@When("^user saves the markup rule details$")
	public void user_saves_the_markup_rule_details() throws Throwable {
		markupRulesPage = markupRuleDetailsPage.clickSaveButton();
	}
	
	@Then("^user sees the copy markup rule title on the top left corner of the page$")
	public void user_sees_the_copy_markup_rule_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(text(), 'Copy') and contains(text(), 'Markup Rule')]")));
	}
	
	@Then("^user sees the update markup rule title on the top left corner of the page$")
	public void user_sees_the_update_markup_rule_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(text(), 'Update') and contains(text(), 'Markup Rule')]")));
	}
	
	@Then("^user sees markup rule details fields enabled$")
	public void user_sees_markup_rule_details_fields_enabled() throws Throwable {
		markupRuleDetailsPage.enabledAirlineDropdown();
		markupRuleDetailsPage.enabledTourDestinationDropdown();
		markupRuleDetailsPage.enabledCustomerMarketDropdown();
		markupRuleDetailsPage.enabledSourceDropdown();
		markupRuleDetailsPage.enabledInactiveCheckbox();
	}
	
	@Then("^user sees the markup rule details cost setting fields enabled$")
	public void user_sees_the_markup_rule_details_cost_setting_fields_enabled() throws Throwable {
		markupRuleDetailsPage.enabledCostSettingSectionFirstCabinClassDropdown();
		markupRuleDetailsPage.enabledCostSettingSectionFirstFareTypeDropdown();
		markupRuleDetailsPage.enabledCostSettingSectionFirstItineraryTypeDropdown();
		markupRuleDetailsPage.enabledCostSettingSectionFirstFareBasisCodeInput();
		markupRuleDetailsPage.enabledCostSettingSectionFirstTravelDateFromInput();
		markupRuleDetailsPage.enabledCostSettingSectionFirstTravelDateToInput();
		markupRuleDetailsPage.enabledCostSettingSectionFirstMarkupStyleDropdown();
		markupRuleDetailsPage.enabledCostSettingSectionFirstMarkupTypeDropdown();
		markupRuleDetailsPage.selectCostSettingSectionFirstMarkupTypeValue("Both");
		markupRuleDetailsPage.enabledCostSettingSectionFirstPercentageInput();
		markupRuleDetailsPage.enabledCostSettingSectionFirstAmountInput();
		markupRuleDetailsPage.enabledCostSettingSectionFirstApplyOnDropdown();
	}
	
	@Then("^user sees the markup rule details price setting fields enabled$")
	public void user_sees_the_markup_rule_details_price_setting_fields_enabled() throws Throwable {
		markupRuleDetailsPage.enabledPriceSettingSectionFirstCabinClassDropdown();
		markupRuleDetailsPage.enabledPriceSettingSectionFirstFareTypeDropdown();
		markupRuleDetailsPage.enabledPriceSettingSectionFirstItineraryTypeDropdown();
		markupRuleDetailsPage.enabledPriceSettingSectionFirstFareBasisCodeInput();
		markupRuleDetailsPage.enabledPriceSettingSectionFirstTravelDateFromInput();
		markupRuleDetailsPage.enabledPriceSettingSectionFirstTravelDateToInput();
		markupRuleDetailsPage.enabledPriceSettingSectionFirstMarkupStyleDropdown();
		markupRuleDetailsPage.enabledPriceSettingSectionFirstMarkupTypeDropdown();
		markupRuleDetailsPage.selectPriceSettingSectionFirstMarkupTypeValue("Both");
		markupRuleDetailsPage.enabledPriceSettingSectionFirstPercentageInput();
		markupRuleDetailsPage.enabledPriceSettingSectionFirstAmountInput();
		markupRuleDetailsPage.enabledPriceSettingSectionFirstApplyOnDropdown();
	}
	
	@When("^user deletes a cost setting of the markup rule$")
	public void user_deletes_a_cost_setting_of_the_markup_rule() throws Throwable {
		CommonFunctions.scrollToTop();
		CommonFunctions.pause(7500, false);
		markupRuleDetailsPage.clickCostSettingSectionFirstDeleteButton();
	}
	
	@When("^user disregards the deletion of markup rule details cost setting$")
	public void user_disregards_the_deletion_of_markup_rule_details_cost_setting() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user confirms the deletion of markup rule details cost setting$")
	public void user_confirms_the_deletion_of_markup_rule_details_cost_setting() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Do you want to delete this Cost Setting?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@Then("^user does not see the markup rule details cost setting$")
	public void user_does_not_see_the_markup_rule_details_cost_setting() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'CostListRecords')]//input[contains(@id, 'DeleteCost')])[1]");
	}
	
	@When("^user deletes a price setting of the markup rule$")
	public void user_deletes_a_price_setting_of_the_markup_rule() throws Throwable {
		markupRuleDetailsPage.clickPriceSettingSectionFirstDeleteButton();
	}
	
	@When("^user disregards the deletion of markup rule details price setting$")
	public void user_disregards_the_deletion_of_markup_rule_details_price_setting() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user confirms the deletion of markup rule details price setting$")
	public void user_confirms_the_deletion_of_markup_rule_details_price_setting() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Do you want to delete this Price Setting?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@Then("^user does not see the markup rule details price setting$")
	public void user_does_not_see_the_markup_rule_details_price_setting() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'PriceListRecords')]//input[contains(@id, 'DeletePrice')])[1]");
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule cost setting cabin class dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_cost_setting_cabin_class_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.clickCostSettingSectionFirstCabinClassDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule cost setting itinerary type dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_cost_setting_itinerary_type_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.clickCostSettingSectionFirstItineraryTypeDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule price setting cabin class dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_price_setting_cabin_class_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.clickPriceSettingSectionFirstCabinClassDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule price setting itinerary type dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_price_setting_itinerary_type_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.clickPriceSettingSectionFirstItineraryTypeDropdownOption(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule cost setting fare type dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_cost_setting_fare_type_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.clickCostSettingSectionFirstFareTypeDropdownOption(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule cost setting fare basis code field$")
	public void user_puts_in_the_markup_rule_cost_setting_fare_basis_code_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setCostSettingSectionFirstFareBasisCodeInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule cost setting percentage field$")
	public void user_puts_in_the_markup_rule_cost_setting_percentage_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setCostSettingSectionFirstPercentageInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule cost setting amount field$")
	public void user_puts_in_the_markup_rule_cost_setting_amount_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setCostSettingSectionFirstAmountInput(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule cost setting apply on dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_cost_setting_apply_on_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.selectCostSettingSectionFirstApplyOnValue(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule price setting fare type dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_price_setting_fare_type_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.clickPriceSettingSectionFirstFareTypeDropdownOption(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule price setting fare basis code field$")
	public void user_puts_in_the_markup_rule_price_setting_fare_basis_code_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setPriceSettingSectionFirstFareBasisCodeInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule price setting percentage field$")
	public void user_puts_in_the_markup_rule_price_setting_percentage_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setPriceSettingSectionFirstPercentageInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule price setting amount field$")
	public void user_puts_in_the_markup_rule_price_setting_amount_field(String arg1) throws Throwable {
		markupRuleDetailsPage.setPriceSettingSectionFirstAmountInput(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule price setting apply on dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_price_setting_apply_on_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.selectPriceSettingSectionFirstApplyOnValue(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule cost setting travel date from field$")
	public void user_puts_in_the_markup_rule_cost_setting_travel_date_from_field(String arg1) throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
		markupRuleDetailsPage.setCostSettingSectionFirstTravelDateFromInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule cost setting travel date to field$")
	public void user_puts_in_the_markup_rule_cost_setting_travel_date_to_field(String arg1) throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
		markupRuleDetailsPage.setCostSettingSectionFirstTravelDateToInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule price setting travel date from field$")
	public void user_puts_in_the_markup_rule_price_setting_travel_date_from_field(String arg1) throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
		markupRuleDetailsPage.setPriceSettingSectionFirstTravelDateFromInput(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the markup rule price setting travel date to field$")
	public void user_puts_in_the_markup_rule_price_setting_travel_date_to_field(String arg1) throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
		markupRuleDetailsPage.setPriceSettingSectionFirstTravelDateToInput(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule cost setting markup type dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_cost_setting_markup_type_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.selectCostSettingSectionFirstMarkupTypeValue(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the markup rule price setting markup type dropdown$")
	public void user_ticks_the_option_of_the_markup_rule_price_setting_markup_type_dropdown(String arg1) throws Throwable {
		markupRuleDetailsPage.selectPriceSettingSectionFirstMarkupTypeValue(arg1);
	}
	// End - Markup Rule Details Page Functions
	
	// Start - Ticketing Time Limits Page Functions
	@When("^user decides to create a new ticketing time limit$")
	public void user_decides_to_create_a_new_ticketing_time_limit() throws Throwable {
		ticketingTimeLimitDetailsPage = ticketingTimeLimitsPage.clickAddNewTicketingTimeLimitButton();
	}
	
	@Then("^user sees the ticketing time limit table and its contents$")
	public void user_sees_the_ticketing_time_limit_table_and_its_contents() throws Throwable {
		ticketingTimeLimitsPage.displayedTopTicketingNameRowData();
		ticketingTimeLimitsPage.displayedTopCustomerMarketRowData();
		ticketingTimeLimitsPage.displayedTopAirlineRowData();
		ticketingTimeLimitsPage.displayedTopFareTypeRowData();
		ticketingTimeLimitsPage.displayedTopCustomerTypeRowData();
		ticketingTimeLimitsPage.displayedTopStatusRowData();
		ticketingTimeLimitsPage.displayedTopCopyButtonRowData();
		ticketingTimeLimitsPage.displayedTopEditButtonRowData();
		ticketingTimeLimitsPage.displayedTopDeleteButtonRowData();
	}
	
	@Then("^user sees the ticketing time limit table shows \"([^\"]*)\" rows$")
	public void user_sees_the_ticketing_time_limit_table_shows_rows(String arg1) throws Throwable {
		ticketingTimeLimitsPage.containsValueRowsDropdown(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the ticketing name column filter to filter the ticketing time limit result$")
	public void user_puts_in_the_ticketing_name_column_filter_to_filter_the_ticketing_time_limit_result(String arg1) throws Throwable {
		ticketingTimeLimitsPage.setTicketingNameFilterInput(arg1);
	}
	
	@Then("^user sees the ticketing time limit search results with the specific ticketing name \"([^\"]*)\"$")
	public void user_sees_the_ticketing_time_limit_search_results_with_the_specific_ticketing_name(String arg1) throws Throwable {
		ticketingTimeLimitsPage.containsValueTopTicketingNameRowData(arg1);
	}
	
	@Then("^user sees the exclude inactive rules checkbox for the ticketing time limit table$")
	public void user_sees_the_exclude_inactive_rules_checkbox_for_the_ticketing_time_limit_table() throws Throwable {
		ticketingTimeLimitsPage.displayedExcludeInactiveRulesCheckbox();
	}
	
	@When("^user edits the ticketing time limit$")
	public void user_edits_the_ticketing_time_limit() throws Throwable {
		ticketingTimeLimitDetailsPage = ticketingTimeLimitsPage.clickTopEditButtonRowData();
	}
	
	@When("^user deletes a ticketing time limit$")
	public void user_deletes_a_ticketing_time_limit() throws Throwable {
		ticketingTimeLimitsPage.clickTopDeleteButtonRowData();
	}
	
	@When("^user disregards the deletion of the ticketing time limit$")
	public void user_disregards_the_deletion_of_the_ticketing_time_limit() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@Then("^user sees the ticketing time limit is not deleted$")
	public void user_sees_the_ticketing_time_limit_is_not_deleted() throws Throwable {
		ticketingTimeLimitsPage.containsValueTopTicketingNameRowData("Test12345");
	}
	
	@When("^user confirms the deletion of the ticketing time limit$")
	public void user_confirms_the_deletion_of_the_ticketing_time_limit() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Do you want to Delete Ticketing Time Limit - Test12345?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	// End - Ticketing Time Limits Page Functions
	
	// Start - Ticketing Time Limit Details Page Functions
	@Then("^user sees the add ticketing time limit title on the top left corner of the page$")
	public void user_sees_the_add_ticketing_time_limit_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(text(), 'Add Ticketing Time Limit')]")));
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the ticketing time limit customer market dropdown$")
	public void user_ticks_the_option_of_the_ticketing_time_limit_customer_market_dropdown(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.clickCustomerMarketDropdownOption(arg1);
	}
	
	@Then("^user sees the ticketing time limit customer market dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_ticketing_time_limit_customer_market_dropdown_contains(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.containsValueCustomerMarketDropdown(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the ticketing time limit ticketing name field$")
	public void user_puts_in_the_ticketing_time_limit_ticketing_name_field(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.setTicketingNameInput(arg1);
	}
	
	@Then("^user sees the ticketing time limit ticketing name field contains \"([^\"]*)\"$")
	public void user_sees_the_ticketing_time_limit_ticketing_name_field_contains(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.containsValueTicketingNameInput(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the ticketing time limit fare type dropdown$")
	public void user_ticks_the_option_of_the_ticketing_time_limit_fare_type_dropdown(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.clickFareTypeDropdownOption(arg1);
	}
	
	@Then("^user sees the ticketing time limit fare type dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_ticketing_time_limit_fare_type_dropdown_contains(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.containsValueFareTypeDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the ticketing time limit airline dropdown$")
	public void user_ticks_the_option_of_the_ticketing_time_limit_airline_dropdown(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.clickAirlineDropdownOption(arg1);
	}
	
	@Then("^user sees the ticketing time limit airline dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_ticketing_time_limit_airline_dropdown_contains(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.containsValueAirlineDropdown(arg1);
	}
	
	@When("^user ticks the \"([^\"]*)\" option of the ticketing time limit customer type dropdown$")
	public void user_ticks_the_option_of_the_ticketing_time_limit_customer_type_dropdown(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.selectCustomerTypeValue(arg1);
	}
	
	@Then("^user sees the ticketing time limit customer type dropdown contains \"([^\"]*)\"$")
	public void user_sees_the_ticketing_time_limit_customer_type_dropdown_contains(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.containsValueCustomerTypeDropdown(arg1);
	}
	
	@Then("^user sees the ticketing time limit inactive checkbox enabled$")
	public void user_sees_the_ticketing_time_limit_inactive_checkbox_enabled() throws Throwable {
		ticketingTimeLimitDetailsPage.enabledInactiveCheckbox();
	}
	
	@When("^user puts \"([^\"]*)\" in the ticketing time limit ticketing time settings day range from field$")
	public void user_puts_in_the_ticketing_time_limit_ticketing_time_settings_day_range_from_field(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.setTicketingTimeSettingsSectionFirstDayRangeFromInputRowData(arg1);
	}
	
	@Then("^user sees the ticketing time limit ticketing time settings day range from field contains \"([^\"]*)\"$")
	public void user_sees_the_ticketing_time_limit_ticketing_time_settings_day_range_from_field_contains(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.containsValueTicketingTimeSettingsSectionFirstDayRangeFromInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the ticketing time limit ticketing time settings day range to field$")
	public void user_puts_in_the_ticketing_time_limit_ticketing_time_settings_day_range_to_field(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.setTicketingTimeSettingsSectionFirstDayRangeToInputRowData(arg1);
	}
	
	@Then("^user sees the ticketing time limit ticketing time settings day range to field contains \"([^\"]*)\"$")
	public void user_sees_the_ticketing_time_limit_ticketing_time_settings_day_range_to_field_contains(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.containsValueTicketingTimeSettingsSectionFirstDayRangeToInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the ticketing time limit ticketing time settings set ttl as booking\\+ field$")
	public void user_puts_in_the_ticketing_time_limit_ticketing_time_settings_set_ttl_as_booking_field(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.setTicketingTimeSettingsSectionFirstTTLAsBookingPlusInputRowData(arg1);
	}
	
	@Then("^user sees the ticketing time limit ticketing time settings set ttl as booking\\+ field contains \"([^\"]*)\"$")
	public void user_sees_the_ticketing_time_limit_ticketing_time_settings_set_ttl_as_booking_field_contains(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.containsValueTicketingTimeSettingsSectionFirstTTLAsBookingPlusInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the ticketing time limit ticketing time settings set ttl as ttl- field$")
	public void user_puts_in_the_ticketing_time_limit_ticketing_time_settings_set_ttl_as_ttl_field(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.setTicketingTimeSettingsSectionFirstTTLAsTTLMinusInputRowData(arg1);
	}
	
	@Then("^user sees the ticketing time limit ticketing time settings set ttl as ttl- field contains \"([^\"]*)\"$")
	public void user_sees_the_ticketing_time_limit_ticketing_time_settings_set_ttl_as_ttl_field_contains(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.containsValueTicketingTimeSettingsSectionFirstTTLAsTTLMinusInputRowData(arg1);
	}
	
	@When("^user adds a ticketing time limit setting$")
	public void user_adds_a_ticketing_time_limit_setting() throws Throwable {
		ticketingTimeLimitDetailsPage.clickTicketingTimeSettingsSectionAddTicketingTimeLimitSettingButton();
	}
	
	@Then("^user sees the delete button for the recently added ticketing time limit setting$")
	public void user_sees_the_delete_button_for_the_recently_added_ticketing_time_limit_setting() throws Throwable {
		ticketingTimeLimitDetailsPage.displayedTicketingTimeSettingsSectionSecondDeleteTicketingTimeLimitSettingButtonRowData();
	}
	
	@When("^user puts \"([^\"]*)\" in the ticketing time limit date ranges effective date from field$")
	public void user_puts_in_the_ticketing_time_limit_date_ranges_effective_date_from_field(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.setDateRangesSectionFirstEffectiveDateFromInputRowData(arg1);
	}
	
	@When("^user puts \"([^\"]*)\" in the ticketing time limit date ranges effective date to field$")
	public void user_puts_in_the_ticketing_time_limit_date_ranges_effective_date_to_field(String arg1) throws Throwable {
		ticketingTimeLimitDetailsPage.setDateRangesSectionFirstEffectiveDateToInputRowData(arg1);
	}
	
	@When("^user adds a ticketing time limit setting date range$")
	public void user_adds_a_ticketing_time_limit_setting_date_range() throws Throwable {
		ticketingTimeLimitDetailsPage.clickDateRangesSectionAddDateRangesButton();
	}
	
	@Then("^user sees the delete button for the recently added ticketing time limit date range$")
	public void user_sees_the_delete_button_for_the_recently_added_ticketing_time_limit_date_range() throws Throwable {
		ticketingTimeLimitDetailsPage.displayedDateRangesSectionSecondDeleteDateRangesButtonRowData();
	}
	
	@Then("^user sees the ticketing time limit close button$")
	public void user_sees_the_ticketing_time_limit_close_button() throws Throwable {
		ticketingTimeLimitDetailsPage.displayedCloseButton();
	}
	
	@Then("^user sees the ticketing time limit save button$")
	public void user_sees_the_ticketing_time_limit_save_button() throws Throwable {
		ticketingTimeLimitDetailsPage.displayedSaveTicketingTimeLimitButton();
	}
	
	@Then("^user sees the update ticketing time limit title on the top left corner of the page$")
	public void user_sees_the_update_ticketing_time_limit_title_on_the_top_left_corner_of_the_page() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[contains(text(), 'Update Ticketing Time Limit')]")));
	}
	
	@Then("^user sees ticketing time limit details fields enabled$")
	public void user_sees_ticketing_time_limit_details_fields_enabled() throws Throwable {
		ticketingTimeLimitDetailsPage.enabledCustomerMarketDropdown();
		ticketingTimeLimitDetailsPage.enabledTicketingNameInput();
		ticketingTimeLimitDetailsPage.enabledFareTypeDropdown();
		ticketingTimeLimitDetailsPage.enabledAirlineDropdown();
		ticketingTimeLimitDetailsPage.enabledCustomerTypeDropdown();
		ticketingTimeLimitDetailsPage.enabledInactiveCheckbox();
	}
	
	@Then("^user sees ticketing time limit details ticketing time settings fields enabled$")
	public void user_sees_ticketing_time_limit_details_ticketing_time_settings_fields_enabled() throws Throwable {
		ticketingTimeLimitDetailsPage.enabledTicketingTimeSettingsSectionFirstDayRangeFromInputRowData();
		ticketingTimeLimitDetailsPage.enabledTicketingTimeSettingsSectionFirstDayRangeToInputRowData();
		ticketingTimeLimitDetailsPage.enabledTicketingTimeSettingsSectionFirstTTLAsBookingPlusInputRowData();
		ticketingTimeLimitDetailsPage.enabledTicketingTimeSettingsSectionFirstTTLAsTTLMinusInputRowData();
	}
	
	@Then("^user sees ticketing time limit details date ranges fields enabled$")
	public void user_sees_ticketing_time_limit_details_date_ranges_fields_enabled() throws Throwable {
		ticketingTimeLimitDetailsPage.enabledDateRangesSectionFirstEffectiveDateFromInputRowData();
		ticketingTimeLimitDetailsPage.enabledDateRangesSectionFirstEffectiveDateToInputRowData();
	}
	
	@When("^user closes the ticketing time limit details$")
	public void user_closes_the_ticketing_time_limit_details() throws Throwable {
		ticketingTimeLimitsPage = ticketingTimeLimitDetailsPage.clickCloseButton();
	}
	
	@When("^user disregards the closing of ticketing time limit details$")
	public void user_disregards_the_closing_of_ticketing_time_limit_details() throws Throwable {
		user_hits_the_escape_key();
	}
	
	@When("^user confirms the closing of ticketing time limit details$")
	public void user_confirms_the_closing_of_ticketing_time_limit_details() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'This Ticketing Time Limit is not yet created. Are you sure you want to discard the changes?']");
		CommonFunctions.clickElement(CommonFunctions.getLastElementInListByXPath("//input[contains(@value, 'OK')]"));
	}
	
	@Then("^user sees the additional row for a ticketing time setting$")
	public void user_sees_the_additional_row_for_a_ticketing_time_setting() throws Throwable {
		ticketingTimeLimitDetailsPage.displayedTicketingTimeSettingsSectionSecondDeleteTicketingTimeLimitSettingButtonRowData();
	}
	
	@When("^user deletes the newly added ticketing time setting of the ticketing time limit$")
	public void user_deletes_the_newly_added_ticketing_time_setting_of_the_ticketing_time_limit() throws Throwable {
		ticketingTimeLimitDetailsPage.clickTicketingTimeSettingsSectionFirstDeleteTicketingTimeLimitSettingButtonRowData();
	}
	
	@Then("^user does not see the additional row of ticketing time setting$")
	public void user_does_not_see_the_additional_row_of_ticketing_time_setting() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'AddedTicketingTimeLimitSettingsRecord')]//span[contains(@class, 'trash')])[2]");
	}
	
	@When("^user saves the ticketing time limit details$")
	public void user_saves_the_ticketing_time_limit_details() throws Throwable {
		ticketingTimeLimitDetailsPage.clickSaveTicketingTimeLimitButton();
	}
	
	@Then("^user does not see the delete button for the one remaining ticketing time setting of the ticketing time limit$")
	public void user_does_not_see_the_delete_button_for_the_one_remaining_ticketing_time_setting_of_the_ticketing_time_limit() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'AddedTicketingTimeLimitSettingsRecord')]//span[contains(@class, 'trash')])[1]");
	}
	
	@Then("^user sees the ticketing time limit date range add date ranges button disabled$")
	public void user_sees_the_ticketing_time_limit_date_range_add_date_ranges_button_disabled() throws Throwable {
		ticketingTimeLimitDetailsPage.disabledDateRangesSectionAddDateRangesButton();
	}
	
	@When("^user deletes the newly added date range of the ticketing time limit$")
	public void user_deletes_the_newly_added_date_range_of_the_ticketing_time_limit() throws Throwable {
		ticketingTimeLimitDetailsPage.clickDateRangesSectionFirstDeleteDateRangesButtonButton();
	}
	
	@Then("^user does not see the delete button for the one remaining date range of the ticketing time limit$")
	public void user_does_not_see_the_delete_button_for_the_one_remaining_date_range_of_the_ticketing_time_limit() throws Throwable {
		CommonFunctions.elementNotExistingByXPath("(//span[contains(@id, 'AddedTTLDateRanges')]//span[contains(@class, 'trash')])[1]");
	}
	// End - Ticketing Time Limit Details Page Functions
	
	// Start - Price Maintenance Page Functions
	@Then("^user does not see add price$")
	public void user_does_not_see_add_price() throws Throwable {
		CommonFunctions.textHiddenInPage("Add Price");
	}
	
	@Then("^user sees add price is displayed$")
	public void user_sees_add_price_is_displayed() throws Throwable {
		CommonFunctions.textVisibleInPage("Add Price");
	}
	
	@Then("^user sees fields displayed in field definitions$")
	public void user_sees_fields_displayed_in_field_definitions() throws Throwable {
		priceMaintenancePage.displayedBatchNumber();
		priceMaintenancePage.displayedContractId();
		priceMaintenancePage.displayedRadioProcess();
		priceMaintenancePage.displayedRadioFuture();
		priceMaintenancePage.displayedPriceFind();
		priceMaintenancePage.displayedDownloadResults();
		CommonFunctions.pause(5000, false);
		
	}
	
	@When("^user inputs batch number with effective future$")
	public void user_inputs_batch_number_with_effective_future() throws Throwable {
		priceMaintenancePage.clickRadioFuture();
		priceMaintenancePage.clickBatchNumber();
		priceMaintenancePage.setInputBatchNumberFuture();
		// priceMaintenancePage.validateNoBatchNumberFuture();
		driver.navigate().refresh();
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user inputs batch number with effective processed$")
	public void user_inputs_batch_number_with_effective_processed() throws Throwable {
		priceMaintenancePage.clickRadioProcess();
		priceMaintenancePage.clickBatchNumber();
		priceMaintenancePage.setInputBatchNumberProcessed();
		CommonFunctions.pause(3000, false);
	}
	
	@Then("^user checks the first item containing the filtered text is selected$")
	public void user_checks_the_first_item_containing_the_filtered_text_is_selected() throws Throwable {
		priceMaintenancePage.validateBatchNumberProcessed();
	}
	
	@When("^user inputs a Contract ID from dropdown list$")
	public void user_inputs_a_Contract_ID_from_dropdown_list() throws Throwable {
		priceMaintenancePage.clickContractId();
		priceMaintenancePage.setInputSearchContractIdProcessed();
		priceMaintenancePage.clickSearchContractIdProcessed();
		driver.navigate().refresh();
		CommonFunctions.pause(3000, false);
	}
	
	@When("^user clicks on find price maintenance$")
	public void user_clicks_on_find_for_effective_batch_number() throws Throwable {
		priceMaintenancePage.clickPriceFind();
	}
	
	@Then("^user sees results displayed for future$")
	public void user_sees_batch_result_displayed_for_future() throws Throwable {
		priceMaintenancePage.viewResultsFuture();
		CommonFunctions.pause(3000, false);
		driver.navigate().refresh();
		CommonFunctions.pause(3000, false);
	}
	
	@Then("^user sees results displayed for processed$")
	public void user_sees_batch_result_displayed_for_processed() throws Throwable {
		priceMaintenancePage.viewResultsProcess();
		CommonFunctions.pause(3000, false);
		driver.navigate().refresh();
		CommonFunctions.pause(3000, false);
	}
	
	@Then("^user views columns displayed in price maintenance$")
	public void user_views_columns_displayed_in_price_maintenance() throws Throwable {
		priceMaintenancePage.displayColumns();
	}
	
	@Then("^user sees process and delete button is enabled$")
	public void user_sees_process_and_delete_button_is_enabled() throws Throwable {
		priceMaintenancePage.enabledProcessButton();
		priceMaintenancePage.enabledDeleteButton();
	}
	
	@Then("^user sees process and delete button is disabled$")
	public void user_sees_process_and_delete_button_is_disabled() throws Throwable {
		priceMaintenancePage.disabledProcessButton();
		priceMaintenancePage.disabledDeleteButton();
	}
	
	@When("^user inputs contract id with effect future$")
	public void user_inputs_contract_id_with_effect_future() throws Throwable {
		priceMaintenancePage.clickRadioFuture();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickContractId();
		priceMaintenancePage.setInputSearchContractIdFuture();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickSearchContractIdFuture();
		CommonFunctions.pause(3000, false);
	}
	
	@When("^user inputs contract id with effect processed$")
	public void user_inputs_contract_id_with_effect_processed() throws Throwable {
		priceMaintenancePage.clickRadioProcess();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickContractId();
		priceMaintenancePage.setInputSearchContractIdProcessed();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickSearchContractIdProcessed();
		CommonFunctions.pause(3000, false);
	}
	
	@When("^user inputs batch number and contract id with effect future$")
	public void user_inputs_batch_number_and_contract_id_with_effect_future() throws Throwable {
		priceMaintenancePage.clickRadioFuture();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickBatchNumber();
		priceMaintenancePage.setInputBatchNumberFuture();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickContractId();
		priceMaintenancePage.setInputSearchContractIdFuture();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickSearchContractIdFuture();
		CommonFunctions.pause(3000, false);
	}
	
	@When("^user inputs batch number and contract id with effect processed$")
	public void user_inputs_batch_number_and_contract_id_with_effect_processed() throws Throwable {
		priceMaintenancePage.clickRadioProcess();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickBatchNumber();
		priceMaintenancePage.setInputBatchNumberProcessed();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickContractId();
		priceMaintenancePage.setInputSearchContractIdProcessed();
		CommonFunctions.pause(3000, false);
		priceMaintenancePage.clickSearchContractIdProcessed();
		CommonFunctions.pause(3000, false);
	}
	
	@When("^user clicks on Download Results button$")
	public void user_clicks_on_Download_Results_button() throws Throwable {
		priceMaintenancePage.clickDownloadResults();
	}
	
	@When("^user searches for all processed price$")
	public void user_searches_for_all_processed_price() throws Throwable {
		priceMaintenancePage.clickRadioProcess();
		CommonFunctions.pause(5000, false);
		priceMaintenancePage.clickPriceFind();
	}
	
	@When("^user clicks view price on Price Maintenance page$")
	public void user_clicks_view_price_on_Price_Maintenance_page() throws Throwable {
		priceMaintenancePage.clickbutton_1stViewPrice();
	}
	
	@When("^user closes the view price popup$")
	public void user_closes_the_view_price_popup() throws Throwable {
		priceMaintenancePage.clickViewPricePopupCancelButton();
	}
	
	@When("^user sees fields displayed in textual fashion$")
	public void user_sees_fields_displayed_in_textual_fashion() throws Throwable {
		priceMaintenancePage.CheckFieldsDisplayedinTextualFashion();
	}
	
	@When("^user click add price on Price Maintenance page$")
	public void user_click_add_price_on_Price_Maintenance_page() throws Throwable {
		CommonFunctions.pause(5000, false);
		priceMaintenancePage.clickAddPriceButton();
	}
	
	@When("^user sees fields displayed in add price maintenance$")
	public void user_sees_fields_displayed_in_add_price_maintenance() throws Throwable {
		priceMaintenancePage.CheckFieldinAddPriceMaintenance();
	}
	
	@When("^user sees default value displayed in add price maintenance$")
	public void user_sees_default_value_displayed_in_add_price_maintenance() throws Throwable {
		priceMaintenancePage.CheckDefaultValuedinAddPriceMaintenance();
		
	}
	
	@Then("^user add minimum commission greater than maximun comission$")
	public void user_add_minimum_commission_greater_than_maximun_comission() throws Throwable {
		priceMaintenancePage.AddMinimumCommissionGreaterThanMaximumComission();
	}
	
	@Then("^user add less than zero minimum and maximum commission$")
	public void user_add_less_than_zero_minimum_and_maximum_commission() throws Throwable {
		priceMaintenancePage.AddLessthanZeroMinMaxCommission();
	}
	
	@Then("^user add greater than one hundred minimum and maximum commission$")
	public void user_add_greater_than_one_hundred_minimum_and_maximum_commission() throws Throwable {
		priceMaintenancePage.AddGreaterThanOneHundredMinMaxCommission();
	}
	
	@Then("^user check price fields validation message$")
	public void user_check_price_fields_validation_message() throws Throwable {
		priceMaintenancePage.CheckPriceFieldValidationMessage();
	}
	
	@When("^user enter negative value in the price fields$")
	public void user_enter_negative_value_in_the_price_fields() throws Throwable {
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id,'TwinInput')]")), "-1");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		priceMaintenancePage.CheckPriceFieldValidationMessageIsNotDisplayed();
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id,'TwinInput')]")), "0");
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id,'SingleInput')]")), "-1");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		priceMaintenancePage.CheckPriceFieldValidationMessageIsNotDisplayed();
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id,'SingleInput')]")), "0");
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id,'TripleInput')]")), "-1");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		priceMaintenancePage.CheckPriceFieldValidationMessageIsNotDisplayed();
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id,'TripleInput')]")), "0");
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id,'ChildInput')]")), "-1");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		priceMaintenancePage.CheckPriceFieldValidationMessageIsNotDisplayed();
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id,'ChildInput')]")), "0");
		CommonFunctions.clearThenEnterElementValue(driver.findElement(By.xpath("//input[contains(@id,'PensionerInput')]")), "-1");
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Add Price']")));
		CommonFunctions.pause(5000, false);
		priceMaintenancePage.CheckPriceFieldValidationMessageIsNotDisplayed();
	}
	
	@Then("^user hover over a certain cell and check the tooltip value$")
	public void user_hover_over_a_certain_cell_and_check_the_tooltip_value() throws Throwable {
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(//table[contains(@id,'PriceMaintenanceTable')]//tbody//tr)[3]//span[contains(@id, 'ContractDesc')]")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'tooltipster-content']")));
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(//table[contains(@id,'PriceMaintenanceTable')]//tbody//tr)[3]//span[contains(@id, 'Category1')]")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'tooltipster-content']")));
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(//table[contains(@id,'PriceMaintenanceTable')]//tbody//tr)[3]//span[contains(@id, 'Category2')]")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'tooltipster-content']")));
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(//table[contains(@id,'PriceMaintenanceTable')]//tbody//tr)[3]//span[contains(@id, 'ConfigTypeExp')]")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'tooltipster-content']")));
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(//table[contains(@id,'PriceMaintenanceTable')]//tbody//tr)[3]//span[contains(@id, 'UploadByExp')]")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'tooltipster-content']")));
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(//table[contains(@id,'PriceMaintenanceTable')]//tbody//tr)[3]//span[contains(@id, 'ModifiedByExp')]")));
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//div[@class = 'tooltipster-content']")));
	}
	
	@When("^user searches for the entered batch number and contract id$")
	public void user_searches_for_the_entered_batch_number_and_contract_id() throws Throwable {
		priceMaintenancePage.clickPriceFind();
		CommonFunctions.pause(5000, false);
	}
	
	@Then("^user check the price maintenance table value is in decimal format$")
	public void user_check_the_price_maintenance_table_value_is_in_decimal_format() throws Throwable {
		String substr1 = "";
		String var1 = driver.findElement(By.xpath("(//tbody//td[@class='PriceRow0 BatchNo20200114091218'])[5]//span[@class= 'alignedright']")).getText();
		substr1 = var1.substring(var1.indexOf("."), var1.length());
		int count1 = substr1.length();
		
		assertTrue(count1 == 3);
		
		String substr2 = "";
		String var2 = driver.findElement(By.xpath("(//tbody//td[@class='PriceRow0 BatchNo20200114091218'])[6]//span[@class= 'alignedright']")).getText();
		substr2 = var2.substring(var2.indexOf("."), var2.length());
		int count2 = substr2.length();
		
		assertTrue(count2 == 3);
		
		String substr3 = "";
		String var3 = driver.findElement(By.xpath("(//tbody//td[@class='PriceRow0 BatchNo20200114091218'])[7]//span[@class= 'alignedright']")).getText();
		substr3 = var3.substring(var3.indexOf("."), var3.length());
		int count3 = substr3.length();
		
		assertTrue(count3 == 3);
		
		String substr4 = "";
		String var4 = driver.findElement(By.xpath("(//tbody//td[@class='PriceRow0 BatchNo20200114091218'])[8]//span[@class= 'alignedright']")).getText();
		substr4 = var4.substring(var4.indexOf("."), var4.length());
		int count4 = substr4.length();
		
		assertTrue(count4 == 3);
		
		String substr5 = "";
		String var5 = driver.findElement(By.xpath("(//tbody//td[@class='PriceRow0 BatchNo20200114091218'])[9]//span[@class= 'alignedright']")).getText();
		substr5 = var5.substring(var5.indexOf("."), var5.length());
		int count5 = substr5.length();
		
		assertTrue(count5 == 3);
	}
	
	@Then("^user check the price maintenance table value is in right alignment$")
	public void user_check_the_price_maintenance_table_value_is_in_right_alignment() throws Throwable {
		priceMaintenancePage.alignPriceContentRight();
	}
	
	@Then("^user check the price format in the edit price maintenance popup$")
	public void user_check_the_price_format_in_the_edit_price_maintenance_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//table[contains(@id,'PriceMaintenanceTable')]//a[contains(@id,'EditLink')]")));
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Update Effective Date and Time']");
		
		String substr1 = "";
		String var1 = driver.findElement(By.xpath("//div[contains(@id,'twin')]")).getText();
		substr1 = var1.substring(var1.indexOf("."), var1.length());
		int count1 = substr1.length();
		
		assertTrue(count1 == 3);
		
		String substr2 = "";
		String var2 = driver.findElement(By.xpath("//div[contains(@id,'Single')]")).getText();
		substr2 = var2.substring(var2.indexOf("."), var2.length());
		int count2 = substr2.length();
		
		assertTrue(count2 == 3);
		
		String substr3 = "";
		String var3 = driver.findElement(By.xpath("//div[contains(@id,'Triple')]")).getText();
		substr3 = var3.substring(var3.indexOf("."), var3.length());
		int count3 = substr3.length();
		
		assertTrue(count3 == 3);
		
		String substr4 = "";
		String var4 = driver.findElement(By.xpath("//div[contains(@id,'child')]")).getText();
		substr4 = var4.substring(var4.indexOf("."), var4.length());
		int count4 = substr4.length();
		
		assertTrue(count4 == 3);
		
		String substr5 = "";
		String var5 = driver.findElement(By.xpath("//div[contains(@id,'Pensioner')]")).getText();
		substr5 = var5.substring(var5.indexOf("."), var5.length());
		int count5 = substr5.length();
		
		assertTrue(count5 == 3);
		
		String substr6 = "";
		String var6 = driver.findElement(By.xpath("(//span[contains(@id,'PriceTableAjaxRfrsh')]//td)[3]//div")).getText();
		substr6 = var6.substring(var6.indexOf("."), var6.length());
		int count6 = substr6.length();
		
		assertTrue(count6 == 3);
		
		String substr7 = "";
		String var7 = driver.findElement(By.xpath("(//span[contains(@id,'PriceTableAjaxRfrsh')]//td)[4]//div")).getText();
		substr7 = var7.substring(var7.indexOf("."), var7.length());
		int count7 = substr7.length();
		
		assertTrue(count7 == 3);
	}
	
	@When("^user open accordion for twenty five Seater cost$")
	public void user_open_accordion_for_twenty_five_Seater_cost() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id,'ContractCostContainer')]//div[@class='AccordionExpandable_header'])[4]//span[@class='fa fa-fw fa-angle-down']")));
		
	}
	
	@Given("^user clicks delete icon cost by row for twenty five Seater$")
	public void user_clicks_delete_icon_cost_by_row_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//div[@class = 'deleteRowDiv']//span)[6]")));
		CommonFunctions.pause(10000, false);
		
	}
	
	@Then("^user sees message for delete cost by row for twenty five Seater$")
	public void user_sees_message_for_delete_cost_by_row_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete the dates 01 Jan 2022 - 31 Dec 2023 across all Guest Configurations in 25 Seater and Adult?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Are you sure you want to delete the dates 01 Jan 2022 - 31 Dec 2023 across all Guest Configurations in 25 Seater and Adult?']")));
		
	}
	
	@When("^user sees message for delete cost by row with price for twenty five Seater$")
	public void user_sees_message_for_delete_cost_by_row_with_price_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Price exists. Are you sure you want to delete the selected cost record(s) and associated Prices?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Price exists. Are you sure you want to delete the selected cost record(s) and associated Prices?']")));
		
	}
	
	@When("^user sees message for delete cost by row with overlapping price date for twenty five Seater$")
	public void user_sees_message_for_delete_cost_by_row_with_overlapping_price_date_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Price exists that overlaps other cost records. Are you sure you want to delete the selected cost record(s) followed by adjusting the price dates manually?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Price exists that overlaps other cost records. Are you sure you want to delete the selected cost record(s) followed by adjusting the price dates manually?']")));
	}
	
	@Then("^user clicks on Cancel button in the delete row popup$")
	public void user_clicks_on_Cancel_button_in_the_delete_row_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Cancel']")));
	}
	
	@Given("^user clicks on delete icon by column$")
	public void user_clicks_on_delete_icon_by_column() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id, 'ContractCostContainer')]//i[@title='Delete'])[4]")));
		CommonFunctions.pause(5000, false);
	}
	
	@When("^user sees message for delete cost by column for twenty five Seater$")
	public void user_sees_message_for_delete_cost_by_column_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Do you wish to remove costs for 25 Seater from all Pax type records?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Do you wish to remove costs for 25 Seater from all Pax type records?']")));
	}
	
	@When("^user sees message for delete cost by column with overlapping price date for twenty five Seater$")
	public void user_sees_message_for_delete_cost_by_column_with_overlapping_price_date_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Do you wish to remove costs for 25 Seater from all Pax type records?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Do you wish to remove costs for 25 Seater from all Pax type records?']")));
	}
	
	@When("^user sees message for delete cost by column with price for twenty five Seater$")
	public void user_sees_message_for_delete_cost_by_column_with_price_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Do you wish to remove costs for 25 Seater from all Pax type records?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Do you wish to remove costs for 25 Seater from all Pax type records?']")));
	}
	
	@When("^user sees All Pax Types button in the popup$")
	public void user_sees_All_Pax_Types_button_in_the_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//input[@value='All Pax Types']")));
	}
	
	@When("^user sees This Pax Type Only button in the popup$")
	public void user_sees_This_Pax_Type_Only_button_in_the_popup() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//input[@value='This Pax Type Only']")));
	}
	
	@Then("^user clicks on close icon in the delete column popup$")
	public void user_clicks_on_close_icon_in_the_delete_column_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//div[contains(@id,'ClosePlaceholder')]//span[@class='fas fa-fw fas fa-times']")));
	}
	
	@Given("^user clicks on delete icon cost by cell for twenty five Seater$")
	public void user_clicks_on_delete_icon_cost_by_cell_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.hoverElement(driver.findElement(By.xpath("(//div[contains(@id,'ContractCostContainer')]//div[@class='AGGridDivs AGColHover'])[6]")));
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id,'ContractCostContainer')]//div[@role='grid'])[4]//span[@title='Delete Cost']")));
	}
	
	@When("^user sees delete cell popup message$")
	public void user_sees_delete_cell_popup_message() throws Throwable {
		CommonFunctions.pause(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete this cost record?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Are you sure you want to delete this cost record?']")));
	}
	
	@When("^user sees delete cell popup message with overlapping price date for twenty five Seater$")
	public void user_sees_delete_cell_popup_message_with_overlapping_price_date_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Price exists that overlaps other cost records. Are you sure you want to delete the selected cost record(s) followed by adjusting the price dates manually?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Price exists that overlaps other cost records. Are you sure you want to delete the selected cost record(s) followed by adjusting the price dates manually?']")));
	}
	
	@When("^user sees delete cell popup message with price for twenty five Seater$")
	public void user_sees_delete_cell_popup_message_with_price_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Price exists. Are you sure you want to delete the selected cost record(s) and associated Prices?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Price exists. Are you sure you want to delete the selected cost record(s) and associated Prices?']")));
	}
	
	@Then("^user clicks on Cancel button in delete cell popup$")
	public void user_clicks_on_Cancel_button_in_delete_cell_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Cancel']")));
	}
	
	@Given("^user clicks on delete link in the accordion$")
	public void user_clicks_on_delete_link_in_the_accordion() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//div[contains(@id,'ContractCostContainer')]//div[contains(@id,'Title')])[14]//a[contains(@id,'DeleteCostLink')]")));
		
	}
	
	@Given("^user sees message for delete cost by accordion for twenty five Seater$")
	public void user_sees_message_for_delete_cost_by_accordion_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to delete cost records for 25 Seater?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Are you sure you want to delete cost records for 25 Seater?']")));
	}
	
	@Given("^user sees message for delete cost by accordion with price for twenty five Seater$")
	public void user_sees_message_for_delete_cost_by_accordion_with_price_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Price exists. Are you sure you want to delete the selected cost record(s) and associated Prices?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Price exists. Are you sure you want to delete the selected cost record(s) and associated Prices?']")));
	}
	
	@Given("^user sees message for delete cost by accordion with overlapping price date for twenty five Seater$")
	public void user_sees_message_for_delete_cost_by_accordion_with_overlapping_price_date_for_twenty_five_Seater() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Price exists. Are you sure you want to delete the selected cost record(s) and associated Prices?']");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Price exists. Are you sure you want to delete the selected cost record(s) and associated Prices?']")));
	}
	
	@Then("^user clicks on Cancel button in the delete accordion popup$")
	public void user_clicks_on_Cancel_button_in_the_delete_accordion_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='Cancel']")));
	}
	
	@Then("^user clicks on Ok button in the delete accordion popup$")
	public void user_clicks_on_Ok_button_in_the_delete_accordion_popup() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//input[@value='OK']")));
	}
	// End - Price Maintenance Page Functions
	
	// End - Functions
}