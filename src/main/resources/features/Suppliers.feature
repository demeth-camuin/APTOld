Feature: APT - Suppliers
	I want to use this feature file for testing APT - Suppliers user stories

	@Regression
	Scenario: APT-16: As a Product team member, I want to SEARCH Supplier records, so that results are returned against elected criteria
		# Additional Scenario: APT-2035: As a Product Team member, I should be able to do a WILDCARD search on the Supplier Name field when I search for Supplier so that I can search for a Supplier with any keywords
		# Scenario 1:
		# And Scenario 3:
		Given user opens browser
		When user with view rights logs into app
		And user navigates to suppliers page
		And user uses column filters to filter the suppliers result
		And user removes the suppliers column filters
		And user searches for a supplier
		Then user sees the supplier in the table
		# Scenario 4:
		Given user is on "Suppliers" page
		Then user does not see add supplier button
		# Scenario 5:
		Given user is on "Suppliers" page
		Then user sees view supplier icon
		# Scenario 6:
		Given user is on "Suppliers" page
		Then user does not see edit and copy supplier icons
		# Scenario 7:
		Given user is on "Suppliers" page
		When user searches for a supplier that is not existing
		Then user sees no results in the table
		# Scenario 2:
		Given user is on "Suppliers" page
		When user searches for a supplier by his id
		Then user is on "View" page

	@Regression
	Scenario: APT-17: As a Product team member, I want to access a READ-ONLY Supplier screen, to use when I don't have edit permissions
		# Scenario 1:
		# And Scenario 2:
		# And Scenario 4:
		Given user opens browser
		When user with view rights logs into app
		And user navigates to suppliers page
		And user searches for a supplier
		And user views the supplier details
		Then user is on "View" page
		# Scenario 3:
		Given user is on "View" page
		When user closes the view suppliers page
		Then user is on "Suppliers" page

	@Regression
	Scenario: APT-19: As a Product team member, I want to EDIT/UPDATE a Supplier record, so that I can manage the Supplier using the most current information
		# Scenario 10: Database
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user searches for a supplier
		And user edits the supplier
		And user saves the supplier
		Then user sees feedback message Supplier ID "updated successfully." displayed
		# Scenario 3:
		# And Scenario 4:
		Given user is on "Suppliers" page
		When user searches for a supplier
		And user edits the supplier
		And user modifies certain information of the supplier
		And user cancels the editing of the supplier
		And user sees prompt message saying "This Supplier has been modified. Are you sure you want to discard the changes?" and clicks on "Cancel"
		And user cancels the editing of the supplier
		And user sees prompt message saying "This Supplier has been modified. Are you sure you want to discard the changes?" and clicks on "OK"
		Then user is on "Suppliers" page
		# Scenario 5:
		# And Scenario 6:
		# And Scenario 8:
		Given user is on "Suppliers" page
		When user searches for a supplier
		And user edits the supplier
		And user removes the airline code
		And user sees prompt message saying "Deleting the Airline code will remove the existing Airline classes and Airline pricing. Do you wish to proceed?" and clicks on "OK"
		Then user sees the airline class and pricing of the airline code removed
		# Scenario 7:
		Given user is on "SupplierDetails" page
		Then user sees sage roll up button enabled
		# Scenario 9:
		Given user is on "SupplierDetails" page
		When user expands the third party accordion
		And user deletes the third party of the supplier
		Then user does not see the third party connected to the supplier

	@Regression
	Scenario: APT-20: As a Product team member, I want to CREATE a Supplier record, so that I can manage a Supplier's contract and information
		# Scenario 14: Covered in APT-20
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		Then user sees the new supplier form
		# Scenario 2:
		# And Scenario 9:
		# And Scenario 10:
		Given user is on "SupplierDetails" page
		When user provides necessary and valid information for the new supplier
		And user saves the supplier
		Then user sees feedback message Supplier ID "created successfully." displayed
		And user is on "Suppliers" page
		# Scenario 3:
		# And Scenario 8:
		Given user is on "Suppliers" page
		When user navigates to add new suppliers page
		When user puts Canada as the country of the new supplier
		And user saves the supplier
		Then user sees feedback message "Supplier cannot be saved. Please review the field error message"
		And user sees error message "This is a mandatory field."
		# Scenario 4:
		# And Scenario 5:
		# And Scenario 6:
		Given user is on "SupplierDetails" page
		When user provides some information for the new supplier
		And user cancels the adding of supplier
		And user sees prompt message saying "This Supplier is not created yet. Are you sure you want to discard it?" and clicks on "Cancel"
		Then user is on "SupplierDetails" page
		When user cancels the adding of supplier
		And user sees prompt message saying "This Supplier is not created yet. Are you sure you want to discard it?" and clicks on "OK"
		Then user is on "Suppliers" page
		# Scenario 7:
		Given user is on "Suppliers" page
		When user navigates to add new suppliers page
		And user cancels the adding of supplier
		Then user is on "Suppliers" page
		# Scenario 11:
		Given user is on "Suppliers" page
		When user navigates to add new suppliers page
		And user adds an already existing supplier
		And user saves the supplier
		Then user sees feedback message that supplier name already exists
		# Scenario 12:
		# And Scenario 13:
		Given user is on "SupplierDetails" page
		When user provides airline information that is already existing
		And user saves the supplier
		Then user sees feedback message that the airline is already existing

	@Regression
	Scenario: APT-21: As a Product team member, I want to Copy a Supplier record, so that I can use existing record configuration/information to create a "like" supplier.
		# Scenario 1:
		# And Scenario 5:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user searches for a supplier
		And user copies the supplier
		And user provides supplier name that is already existing
		And user saves the supplier
		Then user sees feedback message that supplier name already exists
		# Scenario 3:
		# And Scenario 6:
		Given user is on "SupplierDetails" page
		When user provides a new supplier name
		And user saves the supplier
		Then user sees feedback message that the airline is already existing
		When user cancels the copying of the supplier
		And user sees prompt message saying "This Supplier is not created yet. Are you sure you want to discard it?" and clicks on "OK"
		Then user is on "Suppliers" page
		# Scenario 4:
		Given user is on "Suppliers" page
		When user searches for a supplier
		And user copies the supplier
		And user cancels the copying of the supplier
		Then user is on "Suppliers" page
		# Scenario 2:
		Then user is on "Suppliers" page
		When user searches for a supplier
		And user copies the supplier
		And user provides a new supplier name
		And user removes the airline code
		And user saves the supplier
		Then user sees feedback message Supplier ID "created successfully." displayed

	@Regression
	Scenario: APT-385: As a Product team member, I want to SEARCH and SELECT a Third party supplier to assign to a New Supplier
		# Scenario 1: Search for a Third party supplier from the Add Supplier page
		# And Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user expands the third party accordion
		And user opens the third party popup
		And user searches for a third party
		Then user sees the third party information in the table
		# Scenario 3:
		Given user is on "SupplierDetails" page
		When user searches for a third party that is not existing
		Then user sees no results in the table
		# Scenario 4: Assigning a Third party Supplier to a Supplier
		# And Scenario 5:
		Given user is on "SupplierDetails" page
		When user searches for a third party
		And user adds a third party to the supplier
		Then user sees the third party under the supplier
		And user sees third party check boxes where print voucher for third party is selected by default
		# Scenario 6:
		Given user is on "SupplierDetails" page
		When user opens the third party popup
		And user closes the third party popup
		Then user sees third party accordion
		# Scenario 7:
		# And Scenario 8:
		# And Scenario 9:
		# And Scenario 10:
		Given user is on "SupplierDetails" page
		When user enables billing to third party
		And user sees prompt message saying "Billing details are already entered.This action will DELETE billing address details. Do you wish to proceed?" and clicks on "OK"
		And user enables correspondence to third party
		And user sees prompt message saying "Correspondence details are already entered.This action will DELETE correspondence address details. Do you wish to proceed?" and clicks on "OK"
		And user expands the location contact and address accordion
		Then user sees copy to billing address in location contact and address section is disabled
		And user sees copy to correspondence address in location contact and address section is disabled

	@Regression
	Scenario: APT-493: As a Product team member I want to Create / Update /Delete the Airline classes so that I can manage the Airline class details for an Airline Supplier.
		# Additional Scenario: APT-589: As a Yield team member, I want to save a promotion with zero rate
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user expands the airline accordion
		And user enters an airline code
		And user opens the airline class popup
		And user adds an airline class code
		And user saves the airline class
		Then user sees the airline class information added
		# Scenario 3:
		# And Scenario 4:
		# And Scenario 5:
		# And Scenario 6:
		Given user is on "SupplierDetails" page
		When user updates the airline class
		And user adds a blank airline code
		Then user sees error message "Required field!"
		When user adds an existing airline code
		#		Then user sees feedback message "Airline Class already exists."
		When user adds a new airline class code
		And user deletes the newly added airline class code
		And user sees prompt message saying "Are you sure you want to delete Air Class B" and clicks on "OK"
		And user saves the airline class
		Then user sees the airline class information added

	@Regression
	Scenario: APT-496: As a Product team member I want to Create / Update /Delete the Airline Pricing so that I can manage the Pricing details for an Airline Supplier.
		# Scenario 2: Cannot be tested because dropdown is always populated
		# And Scenario 3:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user expands the airline accordion
		And user enters an airline code
		And user opens the price entry code popup
		And user provides a price entry code information that has an empty price entry code
		And user saves the price entry code
		#		Then user sees feedback message "Enter Price Entry Code"
		# Scenario 4:
		Given user is on "SupplierDetails" page
		When user provides a price entry code information that has an empty price calc rate
		And user saves the price entry code
		#		Then user sees feedback message "The value of the Price Calc Rate must be between 0.01 and 1.99"
		# Scenario 5:
		Given user is on "SupplierDetails" page
		When user provides a price entry code information that has an empty cost calc rate
		And user saves the price entry code
		#		Then user sees feedback message "The value of the Cost Calc Rate must be between 0.01 and 1.99"
		# Scenario 7:
		Given user is on "SupplierDetails" page
		When user closes the price entry code popup
		Then user is on "SupplierDetails" page
		# Scenario 1:
		# And Scenario 6:
		# And Scenario 8:
		Given user is on "SupplierDetails" page
		When user opens the price entry code popup
		And user adds an price entry code
		And user adds an already existing price entry code
		And user saves the price entry code
		#		Then user sees feedback message "Price entry code already exists."
		When user removes the entry of the new price entry code
		And user saves the price entry code
		Then user sees the price entry code information added
		# Scenario 9:
		# And Scenario 10:
		Given user is on "SupplierDetails" page
		When user edits an existing price entry code
		Then user sees price entry and price entry code disabled for existing data
		When user adds a new price entry code
		And user deletes the last price entry code
		And user sees prompt message saying "Are you sure you want to delete Price Entry Code" and clicks on "OK"
		And user saves the price entry code
		Then user sees the price entry code information updated

	@Regression
	Scenario: APT-672: As a Product Team member I want to add multiple email addresses against the Supplier Contact details.
		# All Scenarios tested on Location Email Address input field
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user expands the location contact and address accordion
		And user enters a valid email address for the location contact and address section
		And user adds a second valid email address for the location contact and address section
		And user add three more valid email addresses for the location contact and address section
		Then user sees five valid email addresses in the location contact and address section
		# Scenario 5:
		Given user is on "SupplierDetails" page
		When user removes the last email addresses entered in the location contact and address section
		Then user does not see the email address removed from the location contact and address section
		# Scenario 2:
		# And Scenario 4:
		Given user is on "SupplierDetails" page
		When user enters an invalid email address for the location contact and address section
		Then user sees error message "Email Address is not valid"

	@Regression
	Scenario: APT-673: Search and Auto populate Address
		# Scenario 5: Same behavior as Scenario 4
		# Scenario 7: Disabled
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user expands the location contact and address accordion
		And user selects "AUSTRALIA" in the location contact and address section
		Then user sees address fields in the location contact and address section disabled
		When user searches for a specific address in the location contact and address section
		Then user sees the list of addresses that matches the entered text in the address search field
		# Scenario 2:
		Given user is on "SupplierDetails" page
		When user selects "BAHAMAS" in the location contact and address section
		Then user sees address fields in the location contact and address section enabled
		# Scenario 3: Disabled
		# Scenario 4:
		Given user is on "SupplierDetails" page
		When user selects "AUSTRALIA" in the location contact and address section
		And user searches for a specific address in the location contact and address section
		And user selects an address in the address search field results
		Then user sees the address auto populated the appropriate address fields
		# Scenario 6:
		Given user is on "SupplierDetails" page
		When user selects "NEW ZEALAND" in the location contact and address section
		And user searches for a specific address in the location contact and address section
		And user decides to enter the address manually
		Then user sees address fields in the location contact and address section enabled

	@Regression
	Scenario: APT-757: As a Product Team member I want to Create,Edit and Delete Rollup's under the Sage Section.
		# Scenario 1:
		# And Scenario 2:
		# And Scenario 3:
		# And Scenario 4:
		# And Scenario 5:
		# And Scenario 6:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user searches for a supplier
		And user edits the supplier
		And user expands the sage accordion
		And user opens the rollup popup
		And user adds a rollup without an option
		And user adds a rollup
		And user saves the supplier purchase rollup
		Then user sees the added rollup in the list of rollups
		When user opens the rollup popup
		And user removes all rollups of the supplier
		And user sees prompt message saying "Are you sure you want to remove this Rollup?" and clicks on "OK"
		And user saves the supplier purchase rollup
		Then user does not see any rollups for the supplier

	@Regression
	Scenario: APT-795: Supplier Country Field change Selected All to 'All'
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		Then user sees country is defaulted to all

	@Regression
	Scenario: APT-819: Supplier headings to be renamed
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		Then user sees supplier headings renamed

	@Regression
	Scenario: APT-839: As a Product Team Member I want to have an additional data validation for the Billing contact types so that I can ensure that selected contact type has valid data in it.
		# Additional Scenario: APT-842: As a Product Team Member I want to have an additional data validation for the Correspondence contact types so that I can ensure that selected contact type has valid data in it.
		# Scenario 6:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user expands the additional addresses accordion
		And user selects billing address contact type as "Location"
		Then user sees feedback message "Please note, details have not been entered for the Location contact"
		When user selects correspondence address contact type as "Location"
		Then user sees feedback message "Please note, details have not been entered for the Location contact"
		# Scenario 2:
		Given user is on "SupplierDetails" page
		When user selects billing address contact type as "Reservations"
		Then user sees feedback message "Please note, details have not been entered for the Reservation contact"
		When user selects correspondence address contact type as "Reservations"
		Then user sees feedback message "Please note, details have not been entered for the Reservation contact"
		# Scenario 3:
		Given user is on "SupplierDetails" page
		When user selects billing address contact type as "FIT"
		Then user sees feedback message "Please note, details have not been entered for the Fit contact"
		When user selects correspondence address contact type as "FIT"
		Then user sees feedback message "Please note, details have not been entered for the Fit contact"
		# Scenario 4:
		Given user is on "SupplierDetails" page
		When user selects billing address contact type as "Accounts"
		Then user sees feedback message "Please note, details have not been entered for the Accounts contact"
		When user selects correspondence address contact type as "Accounts"
		Then user sees feedback message "Please note, details have not been entered for the Accounts contact"
		# Scenario 5:
		Given user is on "SupplierDetails" page
		When user selects billing address contact type as "Other"
		Then user sees feedback message "Please note, details have not been entered for the Other contact"
		When user selects correspondence address contact type as "Other"
		Then user sees feedback message "Please note, details have not been entered for the Other contact"
		# Scenario 6:
		Given user is on "SupplierDetails" page
		When user expands the additional contacts accordion
		And user provides information in the reservation fields
		And user selects billing address contact type as "Reservations"
		Then user does not see feedback message "Please note, details have not been entered for the Reservation contact"

	@Regression
	Scenario: APT-863: Change request for Banner message and Field error message for mandatory fields in supplier.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user saves the supplier
		Then user sees error message "This is a mandatory field."
		And user sees feedback message "Supplier cannot be saved. Please review the field error message"

	#		And user sees feedback message "Supplier cannot be saved. Please review the field error message."
	@Regression
	Scenario: APT-864: Behavior change request for Auto address suggestion in Suppliers.
		# Additional Scenario: APT-966: Changes for City, Address Line 2 & 3 for country 'New Zealand'
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user expands the location contact and address accordion
		And user selects "AUSTRALIA" in the location contact and address section
		And user searches for a specific address in the location contact and address section and selects it
		And user disables copying of billing address
		And user disables copying of correspondence address
		Then user sees address fields in the location contact and address section enabled
		# Scenario 2:
		Given user is on "SupplierDetails" page
		When user expands the additional addresses accordion
		And user selects a country in the billing address section
		And user searches for a specific address in the billing address section and selects it
		Then user sees address fields in the billing address section enabled
		# Scenario 3:
		Given user is on "SupplierDetails" page
		And user selects a country in the correspondence address section
		And user searches for a specific address in the correspondence address section and selects it
		Then user sees address fields in the correspondence address section enabled

	@Regression
	Scenario: APT-880: Experian Search field to be disabled when selected country is apart from Aus/ NZ/ UK or no country selected
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user expands the location contact and address accordion
		Then user sees address search field in location contact and address section disabled

	@Regression
	Scenario: APT-975: Feature change - Remove the feature Copy Basic information city - Country - to Location country.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user selects "A Coruna, SPAIN" as the city in basic information section
		And user expands the location contact and address accordion
		Then user sees country in the location contact and address section empty

	@Regression
	Scenario: APT-1012: Searching by Supplier ID is not to open the Page but show in the results
		# Scenario 1: Cannot be tested because dropdown is always populated
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user searches for a supplier by his id
		Then user sees the supplier in the table
		# Scenario 2:
		Given user is on "Suppliers" page
		Then user sees edit and copy supplier icons

	@Regression
	Scenario: APT-2161: Pop Up closes on hitting ENTER key on filter text field on Update Packages PopUp for Suppliers Module
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to suppliers page
		And user navigates to add new suppliers page
		And user expands the third party accordion
		And user opens the third party popup
		And user uses the column filters then hit enter to lessen the third party results shown
		Then user sees the third party supplier
