Feature: APT - Customers
	I want to use this feature file for testing APT - Customers user stories

	@Regression
	Scenario: APT-23: As a Sales team member, I want to CREATE a Customer, so that I can create and save new customer records in Oxy Admin
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user navigates to add new customers page
		Then user is on "Add Customer" page
		# Scenario 2:
		Given user is on "Add Customer" page
		When user provides necessary information for the new customer
		And user saves the customer
		Then user sees feedback message Customer ID "created successfully." displayed
		And user is on "Customers" page
		# Scenario 3A:
		# And Scenario 3B:
		# And Scenario 10:
		# And Scenario 11:
		# And Scenario 13:
		Given user is on "Customers" page
		When user navigates to add new customers page
		And user provides some information for the new customer
		And user saves the customer
		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "This is a mandatory field."
		# Scenario 4:
		# And Scenario 6:
		Given user is on "Add Customer" page
		When user cancels the addition of the new customer
		And user sees prompt message saying "This Customer is not created yet. Are you sure you want to discard it?" and clicks on "Cancel"
		Then user is on "Add Customer" page
		# Scenario 5:
		Given user is on "Add Customer" page
		When user cancels the addition of the new customer
		And user sees prompt message saying "This Customer is not created yet. Are you sure you want to discard it?" and clicks on "OK"
		Then user is on "Customers" page
		# Scenario 7:
		Given user is on "Customers" page
		When user navigates to add new customers page
		And user cancels the addition of the new customer
		Then user is on "Customers" page
		# Scenario 8: Attached to APT-780
		# Scenario 9: Attached to APT-780
		# Scenario 12: Attached to APT-27
		# Scenario 14: Disabled
		# Scenario 15: Attached to APT-24
		# Scenario 16:
		Given user is on "Customers" page
		When user navigates to add new customers page
		And user provides email for customer
		And user saves the customer
		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "Email address is not Valid."

	@Regression
	Scenario: APT-24: As a Sales team member, I want to Copy a Customer record, so that I can use existing record configuration/information to create a "like" Customer
		# Additional Scenario: APT-1272: Visibility of "Trade Site Setup" accordion
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user searches for a customer
		And user copies the customer
		Then user is on "Copy Customer" page
		And user sees some customer fields after copy are emptied
		# Scenario 3:
		Given user is on "Copy Customer" page
		When user provides the required information for the new customer after copying an existing customer
		And user saves the customer
		Then user sees feedback message Customer ID "created successfully." displayed
		# Scenario 6:
		Given user is on "Customers" page
		When user searches for a customer
		And user copies the customer
		And user provides a name that is the same as the original customer
		And user saves the customer
		And user sees prompt message saying "A Customer with this Name and Address already exists. Do you want to continue?" and clicks on "Cancel"
		Then user is on "Copy Customer" page
		# Scenario 4:
		Given user is on "Copy Customer" page
		When user cancels the copying of the customer
		And user sees prompt message saying "This Customer is not created yet. Are you sure you want to discard it?" and clicks on "OK"
		Then user is on "Customers" page
		# Scenario 5:
		Given user is on "Customers" page
		When user searches for a customer
		And user copies the customer
		And user cancels the copying of the customer
		Then user is on "Customers" page
		# Scenario 7:
		# And Scenario 9:
		# And Scenario 10:
		Given user is on "Customers" page
		When user searches for a customer that has the type direct
		And user copies the customer
		Then user sees the agency chain is direct
		And user sees some fields are disabled due to the customer type being direct
		And user does not see trade booking setup accordion
		When user changes the customer type from direct to wholesaler
		Then user sees the agency chain is empty
		# Scenario 8:
		# And Scenario 11:
		# And Scenario 12:
		# And Scenario 13:
		Given user is on "Copy Customer" page
		When user changes the customer type from wholesaler to staff
		Then user sees the agency chain is disabled
		And user sees some fields are disabled due to the customer type being staff
		And user sees exclude from crm option is auto-selected

	@Regression
	Scenario: APT-26: As a Sales team member, I want to access a READ-ONLY Customers screen, to use when I don't have edit permissions
		# Scenario 5: Need to access external apps
		# Scenario 6: Need to access external apps
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user with view rights logs into app
		And user navigates to customers page
		And user searches for a customer
		And user views the customer
		Then user is on "View" page
		# Scenario 4:
		Given user is on "View" page
		When user clicks on addresses accordion
		Then user sees the customer address information
		# Scenario 7: Disabled for now
		#		Given user is on "View" page
		#		When user clicks on trade booking setup accordion
		#		Then user sees the password is encrypted
		# Scenario 3:
		Given user is on "View" page
		When user closes the view customer page
		Then user is on "Customers" page

	@Regression
	Scenario: APT-27: As a Sales Team Member, I want to SEARCH a Customer record, so that I can see the customer details.
		# Scenario 1:
		# And Scenario 3:
		# And Scenario 4:
		# And Scenario 10:
		Given user opens browser
		When user with view rights logs into app
		And user navigates to customers page
		And user uses column filters to filter the customers result
		And user removes the customers column filters
		And user opens the advanced search filters of the customers
		Then user sees the additional search options for the customers
		# Scenario 5:
		Given user is on "Customers" page
		Then user does not see the add new customer button
		# Scenario 6: Attached to APT-26
		# Scenario 7: Attached to APT-37
		# Scenario 8:
		Given user is on "Customers" page
		When user searches for a customer that is not existing
		Then user sees no results in the table
		# Scenario 9:
		Given user is on "Customers" page
		When user resets the customer search options
		Then user sees the customer search options will be emptied
		# Scenario 2:
		Given user is on "Customers" page
		When user searches for a customer by id
		Then user sees the customer information

	@Regression
	Scenario: APT-37: As a Sales Team Member, I want to EDIT a Customer record, so that I can update the Customer details with most current information.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user searches for a customer
		And user updates the customer
		Then user is on "Update Customer" page
		# Scenario 2:
		Given user is on "Update Customer" page
		When user updates some information for the customer
		And user saves the customer
		Then user sees feedback message Customer ID "updated successfully." displayed
		And user is on "Customers" page
		# Scenario 3:
		Given user is on "Customers" page
		When user searches for a customer
		And user updates the customer
		And user updates some information for the customer
		And user cancels the update of the customer
		And user sees prompt message saying "This Customer has been modified. Are you sure you want to discard the changes?" and clicks on "OK"
		Then user is on "Customers" page
		# Scenario 4:
		Given user is on "Customers" page
		When user searches for a customer
		And user updates the customer
		And user cancels the update of the customer
		Then user is on "Customers" page
		# Scenario 5: Database
		# Scenario 6:
		# And Scenario 7:
		# And Scenario 8:
		# And Scenario 10:
		Given user is on "Customers" page
		When user searches for a customer
		And user updates the customer
		And user updates some information for the customer but misses some fields
		And user saves the customer
		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "This is a mandatory field."
		# Scenario 9:
		# Scenario 12: Attached to APT-23
		Given user is on "Update Customer" page
		When user changes the customer type to direct
		Then user sees the agency chain is direct and is disabled
		# Scenario 11: Attached to APT-24
		# Scenario 12: Attached to APT-23
		# Scenario 13: Attached to APT-23
		# Scenario 14:
		Given user is on "Update Customer" page
		When user changes the customer type to inbound operator
		Then user sees the agency chain is empty and enabled
		# Scenario 15:
		Given user is on "Update Customer" page
		When user changes the customer type to staff
		Then user does not see trade booking setup accordion
		# Scenario 16: Attached to APT-24
		# Scenario 17: Attached to APT-24
		# Scenario 18: Attached to APT-24
		# Scenario 19: Attached to APT-24
		# Scenario 20:
		Given user is on "Update Customer" page
		When user expands the addresses accordion
		Then user sees address fields in the location addresses section enabled
		When user selects "NEW ZEALAND" in the location addresses section
		Then user sees address fields in the location addresses section disabled
		# Scenario 21:
		Given user is on "Update Customer" page
		Then user sees copy to postal address in the location addresses section is enabled
		When user disables the copy to postal address in the location addresses section
		Then user sees the country field in the postal addresses section enabled

	@Regression
	Scenario: APT-778: As a Sales Team member I want to search and select a BDM / BDM area against a Customer so that I can assign a BDM to a Customer. - Create
		# Scenario 1:
		# And Scenario 2:
		# And Scenario 3:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user navigates to add new customers page
		And user searches for a bdm that is not existing
		And user searches and selects a bdm
		Then user sees the selected bdm in the bdm field

	@Regression
	Scenario: APT-779: As a Sales Team member I want Auto address suggestion feature for the customer module, So that  I can insert a valid address to the address fields without typing in as whole. - on Create Page
		# Additional Scenario: APT-1240: As a Sales Team member I want Auto address suggestion feature for the customer module, So that  I can insert a valid address to the address fields without typing in as whole. - on Edit Page
		# Additional Scenario: APT-1241:  As a Sales Team member I want Auto address suggestion feature for the customer module, So that I can insert a valid address to the address fields without typing in as whole. - on Copy Page
		# Scenario 9: Disabled
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user navigates to add new customers page
		And user expands the addresses accordion
		And user selects "AUSTRALIA" in the location addresses section
		Then user sees address fields in the location addresses section disabled
		When user searches for a specific address in the location addresses section
		Then user sees the list of addresses that matches the entered text in the address search field
		# Scenario 3:
		Given user is on "Add Customer" page
		When user selects "BAHAMAS" in the location addresses section
		Then user sees address fields in the location addresses section enabled
		# Scenario 4:
		# And Scenario 8:
		Given user is on "Add Customer" page
		When user selects "AUSTRALIA" in the location addresses section
		And user searches for a specific address in the location addresses section
		And user selects an address in the address search field results
		Then user sees the address auto populated the appropriate address fields
		# Scenario 5:
		# And Scenario 6:
		# And Scenario 7:
		Given user is on "Add Customer" page
		When user selects "NEW ZEALAND" in the location addresses section
		And user searches for a specific address in the location addresses section
		And user decides to enter the address manually
		Then user sees address fields in the location addresses section enabled

	@Regression
	Scenario: APT-780: As a Sales Team member I want to copy the Location address to the Postal Address so that I can save time from manual entry. - On Create
		# Scenario 1: Database
		# Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user navigates to add new customers page
		And user expands the addresses accordion
		Then user sees copy to postal address in the location addresses section is enabled by default
		And user sees the country field in the postal addresses section disabled
		# Scenario 3:
		Given user is on "Add Customer" page
		When user disables the copy to postal address in the location addresses section
		Then user sees the country field in the postal addresses section enabled
		# Scenario 4:
		Given user is on "Add Customer" page
		When user saves the customer
		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "This is a mandatory field."
		# Scenario 5: Attached to APT-23
		# Scenario 6: Database
		# Scenario 7: Database
		# Scenario 8:
		Given user is on "Add Customer" page
		When user selects "AUSTRALIA" in the postal addresses section
		And user saves the customer
		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "This is a mandatory field."
		# Scenario 9:
		Given user is on "Add Customer" page
		When user selects "UNITED KINGDOM" in the postal addresses section
		And user searches for a specific address in the postal addresses section
		And user selects an address in the address search field results
		Then user sees state dropdown in the postal addresses section contains values that can be selected

	@Regression
	Scenario: APT-781: As a Sales Team member I want to Create Authentication for the customers so that they can access to Trade Site. - Create and Copy page
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user navigates to add new customers page
		And user provides necessary information for the new customer
		And user expands the trade booking setup accordion
		Then user sees the username and password fields and the disabled toggle for giving customers the apt group site access
		# Scenario 5:
		# And Scenario 6:
		# And Scenario 7:
		Given user is on "Add Customer" page
		When user provides username but left password empty for trade booking authentication
		Then user sees the toggle for giving customers the apt group site access disabled
		When user saves the customer
#		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "This is a mandatory field."
		When user provides password but left username empty for trade booking authentication
		And user saves the customer
#		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "This is a Mandatory field!"
		#		And user sees error message "This is a mandatory field."
		# Scenario 8:
		Given user is on "Add Customer" page
		When user provides existing username
		And user saves the customer
		Then user sees error message "Username already exists"
		# Scenario 9:
		Given user is on "Add Customer" page
		When user provides invalid password
		Then user sees error message "Invalid Password - refer to Password criteria"
		# Scenario 10:
		Given user is on "Add Customer" page
		When user clicks on the password field
		Then user sees the password rules
		# Scenario 11:
		Given user is on "Add Customer" page
		When user provides username with quotation marks
		Then user sees error message "Username should not contain quote marks"
		When user saves the customer
		Then user sees feedback message "Customer cannot be saved. Please review the field error message"
		#		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		# Scenario 2:
		Given user is on "Add Customer" page
		When user provides username and password for trade booking authentication
		Then user sees the toggle for giving customers the apt group site access enabled
		# Scenario 3:
		Given user is on "Add Customer" page
		When user gives customer access to apt group site
		Then user sees customer access levels and login tracking enabled
		# Scenario 4:
		Given user is on "Add Customer" page
		Then user sees the toggle for generating an email for registration

	@Regression
	Scenario: APT-797: As a Sales Team member I want to generate a registration email so that I can share the registration details with the Customer. - Create and copy page
		# Additional Scenario: APT-1087: As a Sales Team member I want to generate A registration email so that I can share the registration details with the Customer. (Edit Page)
		# Scenario 8: External Apps
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user navigates to add new customers page
		And user provides necessary information for the new customer
		And user expands the trade booking setup accordion
		And user provides username and password for trade booking authentication
		And user gives customer access to apt group site
		Then user sees the option for sending a registration email enabled
		# Scenario 2:
		# And Scenario 4:
		# And Scenario 5:
		Given user is on "Add Customer" page
		When user enables the sending a registration email option
		Then user sees the email form
		# Scenario 3:
		# And Scenario 3.1:
		Given user is on "Add Customer" page
		Then user sees the to field with the value from the basic information
		And user sees the username and password provided in the authentication section
		And user sees the url source from the database
		And user sees the cc and bcc fields
		# Scenario 6:
		# And Scenario 7:
		# And Scenario 9:
		# And Scenario 10:
		Given user is on "Add Customer" page
		When user saves the customer
		Then user sees feedback message Customer ID "created successfully and the Registration email has been sent." displayed

	@Regression
	Scenario: APT-798: As a Sales Team Member I want to setup Trade Site permissions so that I can ensure customers have relevant access to the Trade Site. - Create and Copy Page
		# Additional Scenario: APT-1081: As a Sales Team Member I want to setup Trade Site permissions so that I can ensure customers have relevant access to the Trade Site.(Edit Page)
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user navigates to add new customers page
		And user expands the trade booking setup accordion
		And user provides username and password for trade booking authentication
		And user gives customer access to apt group site
		And user enables customer to edit bookings
		Then user sees certain fields of the trade booking setup accordion enabled
		And user sees customer is enabled to create bookings
		# Scenario 3:
		Given user is on "Add Customer" page
		When user gives customer rights to edit all bookings
		Then user sees customer is also enabled to view all bookings
		# Scenario 4:
		Given user is on "Add Customer" page
		When user revokes the customer rights to view all bookings
		Then user sees customer is also disabled to edit all bookings
		# Scenario 5:
		Given user is on "Add Customer" page
		When user revokes the access of the customer to apt group site
		Then user sees trade booking setup options remain unchanged

	@Regression
	Scenario: APT-799: As a Sales Team Member I want to Create Trade Site Access So that I can assign brands,packages,Tour classification and Tour market for the Customers to view/book. - Applicable to Create, Copy page
		# Additional Scenario: APT-800: As a Sales Team Member, I want to Edit the Trade Site access records so that the trade access records will be up-to date.
		# Additional Scenario: APT-955: As a Sales Team Member, I want to delete the Trade Site access records so that I can remove the unwanted trade access records .
		# Scenario 1:
		# And Scenario 6:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user navigates to add new customers page
		And user provides necessary information for the new customer
		And user expands the trade booking setup accordion
		And user provides username and password for trade booking authentication
		And user gives customer access to apt group site
		And user enables customer to edit bookings
		And user saves the customer
		Then user sees feedback message "Please add Trade Site access details"
		# Scenario 4:
		Given user is on "Add Customer" page
		When user opens the add product access level popup
		And user cancels the addition of new product access level
		Then user does not see the add product access level popup
		# Scenario 5:
		Given user is on "Add Customer" page
		When user opens the add product access level popup
		Then user sees the customer field in the add product access level popup
		# Scenario 7:
		# And Scenario 8:
		# And Scenario 9:
		Given user is on "Add Customer" page
		When user saves the product access level
		Then user sees error message "This is a mandatory field."
		# Scenario 2:
		# And Scenario 3:
		Given user is on "Add Customer" page
		Then user sees the add product access level popup with its fields
		When user selects valid product access level information
		And user saves the product access level
		Then user sees the added product access level
		# Scenario for APT-800:
		Given user is on "Add Customer" page
		When user edits the recently added product access level
		Then user sees the existing product access level
		When user modifies the recently added product access level
		And user saves the product access level
		Then user sees the modified product access level
		When user decides to add a new product access level
		Then user sees the additional product access level
		# Scenario for APT-955:
		Given user is on "Add Customer" page
		When user deletes the recently added product access level
		And user cancels the deletion of the recently added product access level
		Then user sees the recently added product access level
		When user deletes the recently added product access level
		And user confirms the deletion of the recently added product access level
		Then user does not see the recently added product access level

	@Regression
	Scenario: APT-876: As a Sales Team member I want to add billing details against a customer record so that I ensure that the customer payment details are recorded. - On create
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user navigates to add new customers page
		And user expands the billing accordion
		Then user can see the payments and accounts contract section
		# Scenario 2:
		Given user is on "Add Customer" page
		Then user sees cheque as default payment type
		And user sees some payment method fields are hidden
		# Scenario 3:
		Given user is on "Add Customer" page
		When user selects eft as payment type
		Then user sees some payment method fields are shown
		# Scenario 4:
		# And Scenario 5:
		# And Scenario 6:
		# And Scenario 7:
		Given user is on "Add Customer" page
		When user provides necessary information for the new customer
		And user saves the customer
		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "This is a mandatory field."
		# Scenario 8:
		# And Scenario 9:
		Given user is on "Add Customer" page
		When user provides email for billing
		And user saves the customer
		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "Email address is not Valid."

	@Regression
	Scenario: APT-931: As a Sales Team member I want to add billing details against a customer record so that I ensure that the customer payment details are recorded. - On Edit and Copy Page
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user searches for a customer
		And user updates the customer
		And user expands the billing accordion
		And user selects eft as payment type
		Then user sees some payment method fields are shown
		# Scenario 2:
		# And Scenario 3:
		# And Scenario 4:
		# And Scenario 5:
		Given user is on "Update Customer" page
		When user saves the customer
		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "This is a mandatory field."
		# Scenario 6:
		Given user is on "Update Customer" page
		When user selects cheque as payment type
		Then user sees some payment method fields are hidden
		# Scenario 8:
		# And Scenario 9:
		Given user is on "Update Customer" page
		When user provides invalid email for billing
		And user saves the customer
		Then user sees feedback message "Customer cannot be saved. Please review the field error message."
		And user sees error message "Email address is not Valid."

	@Regression
	Scenario: APT-1067: As a Sales Team member I want to search and select a BDM / BDM area against a Customer so that I can assign a BDM to a Customer. - on Edit page
		# Additional Scenario: APT-1068: As a Sales Team member I want to search and select a BDM / BDM area against a Customer so that I can assign a BDM to a Customer.(on Copy page)
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user searches for a customer
		And user updates the customer
		Then user sees bdm field
		When user searches for a bdm
		Then user sees the bdm search results
		# Scenario 3:
		Given user is on "Update Customer" page
		When user selects a bdm among the search results
		Then user sees the new bdm in the bdm field
		# Scenario 5:
		Given user is on "Update Customer" page
		When user searches for a new bdm
		Then user sees the newly selected bdm in the bdm field
		# Scenario 4:
		Given user is on "Update Customer" page
		When user searches for an invalid bdm
		Then user sees there are no bdm search results

	@Regression
	Scenario: APT-1072: As a Sales Team member I want to Create Authentication for the customers so that they can access to Trade Site. - On edit page
		# Scenario 3: Attached to APT-781
		# Scenario 4: Attached to APT-781
		# Scenario 5: Attached to APT-781
		# Scenario 6: Attached to APT-781
		# Scenario 7: Attached to APT-781
		# Scenario 8: Attached to APT-781
		# Scenario 9: Attached to APT-781
		# Scenario 10: Attached to APT-781
		# Scenario 11: Attached to APT-781
		# Scenario 12: Attached to APT-781
		# Scenario 13: Database
		# Scenario 14: Database
		# Scenario 1:
		# And Scenario 2:
		# And Scenario 15:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user searches for a customer
		And user updates the customer
		Then user sees that the customer does not have apt group site access
		And user sees certain fields of the trade booking setup accordion disabled

	@Regression
	Scenario: APT-1311: 08. Behavior change request for Reservations Booking Access under Customer Create Page and Copy  pages
		# Additional Scenario: APT-1362: 09. Behavior change request for Reservations Booking Access under Customer- Edit page
		# Scenario 1:
		# And Scenario 3:
		Given user opens browser
		When user logs into app
		And user navigates to customers page
		And user navigates to add new customers page
		And user provides necessary information for the new customer
		And user expands the trade booking setup accordion
		And user provides username but left password empty for trade booking authentication
		Then user sees the toggle for giving customers the apt group site access disabled
		And user sees the fields under the booking permissions group disabled
		And user sees the locked checkbox under the login tracking group disabled
		And user sees the fields under the agency chain group disabled
		And user sees the add product access level button disabled
		And user sees the hide commissions toggle disabled
		When user provides username and password for trade booking authentication
		Then user sees the toggle for giving customers the apt group site access enabled
		And user sees the fields under the booking permissions group enabled
		And user sees the locked checkbox under the login tracking group enabled
		And user sees the fields under the agency chain group disabled
		And user sees the add product access level button disabled
		And user sees the hide commissions toggle disabled
		# Scenario 2:
		Given user is on "Add Customer" page
		Then user sees the toggle for giving customers the apt group site access enabled
		And user sees the fields under the booking permissions group enabled
		And user sees the locked checkbox under the login tracking group enabled
		When user enables customer to edit bookings
		Then user sees the fields under the agency chain group enabled
		And user sees the add product access level button enabled
		And user sees the hide commissions toggle enabled
		# Scenario 4:
		# And Scenario 5:
		# And Scenario 6:
		Given user is on "Add Customer" page
		When user gives customer access to apt group site
		And user gives customer rights to edit all bookings
		And user decides to add a new product access level
		And user decides to hide the commissions of the customer
		And user decides to lock the login tracking of the customer
		And user provides username but left password empty for trade booking authentication
		Then user sees the toggle for giving customers the apt group site access enabled
		And user sees the fields under the booking permissions group enabled
		And user sees the locked checkbox under the login tracking group enabled
		And user sees the fields under the agency chain group enabled
		And user sees the add product access level button enabled
		And user sees the hide commissions toggle enabled
		And user sees the trade booking setup values thats been provided is not removed
		When user provides both username and password empty for trade booking authentication
		Then user sees the toggle for giving customers the apt group site access disabled
		And user sees the fields under the booking permissions group disabled
		And user sees the locked checkbox under the login tracking group disabled
		And user sees the fields under the agency chain group disabled
		And user sees the add product access level button disabled
		And user sees the hide commissions toggle disabled
		And user sees that the customer does not have apt group site access
		And user sees that the customer is unable to edit bookings
		And user sees that the customer does not have rights to edit all bookings
		And user sees that the toggle for hiding the commissions of the customer has been turned off
		And user sees that the toggle for locking the login tracking of the customer has been turned off
