Feature: APT - Commissions
	I want to use this feature file for testing APT - Commissions user stories

	@Regression
	Scenario: APT-39: 11. As a Sales Team Member, I want to CREATE a new Commission, so that  assign it to all Customers matching the specified criteria
		# Scenario 13: Database
		# Scenario 14: Database
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		Then user sees new commission button
		# Scenario 2:
		Given user is on "Commissions" page
		When user opens the create commission name popup
		Then user sees commission name field enabled and two add rules buttons disabled
		# Scenario 3:
		Given user is on "Commissions" page
		When user provides a new commission name
		Then user sees the two add rules buttons enabled
		# Scenario 4:
		# And Scenario 6:
		Given user is on "Commissions" page
		When user saves the new commission name and decides to add rules later
		Then user sees feedback message "Commission name has been created successfully."
		# Scenario 7:
		# And Scenario 8:
		Given user is on "Commissions" page
		When user opens the create commission name popup
		And user closes the create commission name popup
		Then user does not see the create commission name popup
		# Scenario 9:
		Given user is on "Commissions" page
		When user opens the create commission name popup
		And user provides an existing commission name
		And user saves the new commission name and decides to add rules later
		Then user sees error message "Commission Name already exists"
		# Scenario 5:
		Given user is on "Commissions" page
		When user provides a commission name
		And user saves the new commission name and decides to add rules now
		Then user is on "RuleDetails" page

	@Regression
	Scenario: APT-693: 02. As a Sales Team Member, I want to SEARCH a Commission Template, so that I can view the Commission  records - User with View only rights
		# Additional Scenario: APT-1229: 03. As a Sales Team Member, I want to SEARCH a Commission Template, so that I can view the Commission records - User with Edit Rights
		# Scenario 1:
		Given user opens browser
		When user with view rights logs into app
		And user navigates to commissions page
		Then user is on "Commissions" page
		# Scenario 2:
		Given user is on "Commissions" page
		Then user sees commission dropdown with search functionality
		# Scenario 3:
		Given user is on "Commissions" page
		When user clicks on commission dropdown
		Then user sees commissions list
		# Scenario 4:
		# And Scenario 5:
		Given user is on "Commissions" page
		When user searches for a commission by wildcard
		Then user sees the commissions list related to the entered word
		When user selects the commission
		Then user sees the commission rules table

	@Regression
	Scenario: APT-1142: 01. As a Sales Team member I want to view a new item called commissions under the modules section in the main menu so that I can access Commissions module.
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		Then user is on "Commissions" page

	@Regression
	Scenario: APT-1144: 04. As a user with commissions view only access, I want to view the commissions search result so that I can view all the rules associated to the selected commission Template - For View only access
		# Additional Scenario: APT-1158: 07. As a Sales Team member with view only access I want to view the past dated commissions from the commissions search page so that I can see the expired commission rules for a Commission .
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user with view rights logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		Then user sees the commission rules table
		And user sees toggle for showing past date commissions is turned off by default
		# Scenario 3:
		Given user is on "Commissions" page
		When user uses column filters to filter the commission rules
		Then user sees the filtered commission rules table
		When user removes the commission rules column filters
		Then user sees the unfiltered commission rules table
		When user toggles on the option to show the past date commissions
		Then user sees the past dated commissions
		When user toggles off the option to show the past date commissions
		Then user does not see the past dated commissions
		# Scenario 4: Cosmetic
		# Scenario 5:
		# And Scenario 7:
		Given user is on "Commissions" page
		Then user only sees the view icon for each commission rule
		# Scenario 6: Cosmetic
		# Scenario 8:
		Given user is on "Commissions" page
		When user views a commission rule
		Then user is on "View" page

	@Regression
	Scenario: APT-1160: 06. As a Sales Team member with Edit access, I want to view the commissions search result so that I can view all the rules associated to the selected commission .
		# Additional Scenario: APT-1159: 08. As a Sales Team member with edit access I want to view the past dated commissions from the commissions search page so that I can see the expired commission rules for a commission.
		# Scenario 5: Cosmetic
		# Scenario 6: Cosmetic
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		Then user sees the commission rules table
		And user sees toggle for showing past date commissions is turned off by default
		# Scenario 4:
		Given user is on "Commissions" page
		When user uses column filters to filter the commission rules
		Then user sees the filtered commission rules table
		When user removes the commission rules column filters
		Then user sees the unfiltered commission rules table
		When user toggles on the option to show the past date commissions
		Then user sees the past dated commissions
		When user toggles off the option to show the past date commissions
		Then user does not see the past dated commissions

	@Regression
	Scenario: APT-1161: 09. As a Sales Team member I want to view the Edit icon for commission rules in the commission search page so that I can click on the edit icon from the Commission search page to go the commission rule edit page.
		# Scenario 3: Attached to APT-1144
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		Then user can see edit icon for each commission rule
		# Scenario 2:
		Given user is on "Commissions" page
		When user updates the commission rule
		Then user is on "RuleDetails" page

	@Regression
	Scenario: APT-1168: 10. As a Sales Team member I want to Delete commission rules for a commission so that I can remove the unwanted commission rules from a Commission.
		# Scenario 5: Attached to APT-1144
		# Scenario 6: Database
		# Scenario 1:
		# And Scenario 2:
		# And Scenario 3:
		# And Scenario 4:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user decides to add a new commission rule
		And user provides basic information for the commission rule
		And user saves the commission rule
		And user uses column filters to find the newly added commission rule
		And user decides to delete the commission rule
		Then user sees delete message for the commission rule
		When user cancels the deletion of the commission rule
		And user decides to delete the commission rule
		And user confirms the deletion of the commission rule
		Then user does not see the commission rule

	@Regression
	Scenario: APT-1172: 13. As a sales Team member I want to ADD Basic information to the Commission Rule create page So that I can define specific criteria's for that Commission.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user decides to add a new commission rule
		Then user is on "RuleDetails" page
		# Scenario 2:
		Given user is on "RuleDetails" page
		Then user sees the commission rule fields
		# Scenario 3:
		Given user is on "RuleDetails" page
		Then user sees the commission rules default values of the fields
		# Scenario 4:
		Given user is on "RuleDetails" page
		When user selects value for the sales source field
		Then user sees the sales source field value changed
		# Scenario 5:
		Given user is on "RuleDetails" page
		When user selects value for the customer market field
		Then user sees the customer market field value changed
		# Scenario 7:
		# And Scenario 8:
		# And Scenario 9:
		Given user is on "RuleDetails" page
		When user provides a commission rate with alphabets and special characters and is above 6 characters
		Then user sees commission rate field is empty due to provided invalid characters being restricted
		# Scenario 6:
		Given user is on "RuleDetails" page
		When user provides a commission rate that exceeds the limit
		Then user sees error message "Invalid Commission rate exceeds limit."
		# Scenario 11:
		# And Scenario 10:
		Given user is on "RuleDetails" page
		When user cancels the creation of the new commission rule
		And user sees prompt message saying "This Commission rule has been modified. Are you sure you want to discard the changes?" and clicks on "Cancel"
		Then user is on "RuleDetails" page
		When user cancels the creation of the new commission rule
		And user sees prompt message saying "This Commission rule has been modified. Are you sure you want to discard the changes?" and clicks on "OK"
		Then user is on "Commissions" page
		# Scenario 12:
		Given user is on "Commissions" page
		When user decides to add a new commission rule
		And user cancels the creation of the new commission rule
		Then user is on "Commissions" page

	@Regression
	Scenario: APT-1181: 16. As a sales Team member I want to create commission Rules using *Packages* to the commission So that I can define specific criteria's for that Commission.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user decides to add a new commission rule
		Then user sees the packages and contracts accordion
		# Scenario 2:
		Given user is on "RuleDetails" page
		When user expands the packages and contracts accordion
		Then user sees packages options is selected by default
		And user sees packages option dropdowns
		# Scenario 3:
		Given user is on "RuleDetails" page
		Then user sees packages option fields is defaulted to all selected
		# Scenario 4:
		# And Scenario 5:
		# And Scenario 6:
		Given user is on "RuleDetails" page
		When user deselects all brands
		Then user sees tour market, package type, and tour classification fields are emptied
		When user selects all brands
		Then user sees tour market, package type, and tour classification fields are changed to all selected
		# Scenario 7:
		# And Scenario 8:
		# And Scenario 9:
		Given user is on "RuleDetails" page
		When user deselects all tour markets
		Then user sees package type, and tour classification fields are emptied
		When user selects all tour markets
		Then user sees package type, and tour classification fields are changed to all selected
		# Scenario 10:
		# And Scenario 11:
		# And Scenario 12:
		Given user is on "RuleDetails" page
		When user deselects all package types
		Then user sees tour classification field is emptied
		When user selects all package types
		Then user sees tour classification field is changed to all selected

	@Regression
	Scenario: APT-1182: 18. As a sales Team member I want to ADD Rules using *Contract Types* to the commissions Template So that I can define specific criteria's for that Commission Template. - Create page
		# Additional Scenario: APT-1238: 19. As a User I want to view filters for all sections in Contract Types under Packages and Contracts accordion So that I can search and select values from the drop downs instead of scrolling down the whole list.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user decides to add a new commission rule
		Then user sees the packages and contracts accordion
		# Scenario 2:
		Given user is on "RuleDetails" page
		When user expands the packages and contracts accordion
		And user selects option contract types for the commission rule
		Then user sees the contract type dropdown with all selected as the default value
		And user sees the miscellaneous type dropdown with all selected as the default value
		# Scenario 3:
		Given user is on "RuleDetails" page
		When user opens the contract type dropdown
		Then user sees the list of contract types in the contract types dropdown
		When user opens the miscellaneous type dropdown
		Then user sees the list of miscellaneous types in the dropdown

	@Regression
	Scenario: APT-1183: 21. As a sales Team member I want to create commission Rules using *Contracts* So that I can define specific criteria's for that Commission . - Create page
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user decides to add a new commission rule
		Then user sees the packages and contracts accordion
		# Scenario 2:
		Given user is on "RuleDetails" page
		When user expands the packages and contracts accordion
		And user selects option contracts for the commission rule
		Then user can see the add contract button
		# Scenario 10:
		Given user is on "RuleDetails" page
		When user provides basic information for the commission rule
		And user saves the commission rule
		Then user sees feedback message "Commission rule cannot be saved. Please review the field error message"
		And user sees error message "Please add at least one Contract before saving."
		# Scenario 3:
		Given user is on "RuleDetails" page
		When user decides to add a contract to the commission rule
		Then user sees the popup for adding contract to the commission rule
		# Scenario 4:
		Given user is on "RuleDetails" page
		Then user sees different search criterias for finding specific contracts and the miscellaneous type field disabled by default
		# Scenario 5:
		Given user is on "RuleDetails" page
		When user selects miscellaneous as the contract type in the search criteria
		Then user sees the miscellaneous type field enabled
		# Scenario 6:
		# And Scenario 7:
		# And Scenario 8:
		Given user is on "RuleDetails" page
		When user searches for a contract to be added to the commission rule
		Then user sees the result of the search in the table
		# Scenario 9:
		Given user is on "RuleDetails" page
		When user adds the contract to the commission rule
		Then user sees the contract in the packages and contracts section of the commission rule

	@Regression
	Scenario: APT-1189: 14. As a sales Team member I want to ADD Date ranges to Commission rules on Add rules pages So that I can define specific criteria's for that Commission .
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user decides to add a new commission rule
		Then user sees the commission dates accordion
		# Scenario 2:
		# And Scenario 3:
		Given user is on "RuleDetails" page
		When user expands the commission dates accordion
		Then user sees commission dates default values
		# Scenario 5:
		Given user is on "RuleDetails" page
		When user provides empty date ranges for the commission dates
		And user saves the commission rule
		Then user sees feedback message "Commission rule cannot be saved. Please review the field error message"
		And user sees error message "This is a mandatory field."
		# Scenario 4:
		# And Scenario 6:
		Given user is on "RuleDetails" page
		When user provides commission booking dates that the from date is greater than the to date
		Then user sees error message "Booking start date cannot be greater than booking end date."
		# Scenario 7:
		Given user is on "RuleDetails" page
		When user provides commission departure dates that the from date is greater than the to date
		Then user sees error message "Departure start date cannot be greater than departure end date."

	@Regression
	Scenario: APT-1190: 15. As a sales Team member I want to View the Packages and Contracts accordion on the Commissions Add Rules page So that I can define specific criteria's for that Commission Rule Template.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user decides to add a new commission rule
		Then user sees the packages and contracts accordion
		# Scenario 2:
		Given user is on "RuleDetails" page
		When user expands the packages and contracts accordion
		Then user sees the package, contract types, and contracts options
		# Scenario 3:
		Given user is on "RuleDetails" page
		Then user sees packages options is selected by default

	@Regression
	Scenario: APT-1192: 12. As Sales Team member I want to create a Commission Rule from the commission search list page so that I can create new rules record for the selected commission template from the search page.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		Then user sees the add rule button is enabled by default
		# Scenario 2:
		# And Scenario 4:
		Given user is on "Commissions" page
		When user decides to add a new commission rule
		Then user sees error message "Please select a Commission to add rules."
		# Scenario 3:
		Given user is on "Commissions" page
		When user searches for a commission
		And user selects the commission
		And user decides to add a new commission rule
		Then user is on "RuleDetails" page

	@Regression
	Scenario: APT-1199: 23. As a sales Team member I want to EDIT Commission Rules Basic Information section So that I can make necessary modifications to the rules for the selected Commission .
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user updates the commission rule
		Then user is on "RuleDetails" page
		# Scenario 2:
		Given user is on "RuleDetails" page
		Then user sees commission name and cannot be modified
		# Scenario 3:
		Given user is on "RuleDetails" page
		When user selects value for the sales source
		Then user sees the sales source dropdown value changed
		# Scenario 4:
		Given user is on "RuleDetails" page
		When user selects value for the customer market
		Then user sees the customer market dropdown value changed
		# Scenario 5:
		# And Scenario 6:
		# And Scenario 7:
		Given user is on "RuleDetails" page
		When user provides a commission rate with alphabets and special characters and is above 6 characters
		Then user sees commission rate field is empty due to provided invalid characters being restricted
		# Scenario 9:
		# And Scenario 10:
		# And Scenario 11:
		Given user is on "RuleDetails" page
		When user cancels the update of the commission rule
		And user sees prompt message saying "This Commission rule has been modified. Are you sure you want to discard the changes?" and clicks on "Cancel"
		Then user is on "RuleDetails" page
		When user provides a commission rate that exceeds the limit
		Then user sees error message "Invalid Commission rate exceeds limit."
		When user cancels the update of the commission rule
		And user sees prompt message saying "This Commission rule has been modified. Are you sure you want to discard the changes?" and clicks on "OK"
		Then user is on "Commissions" page
		# Scenario 8:
		Given user is on "Commissions" page
		When user goes to commissions page
		And user searches for a commission
		And user selects the commission
		And user updates the commission rule
		And user cancels the update of the commission rule
		Then user is on "Commissions" page

	@Regression
	Scenario: APT-1201: 24. As a sales Team member I want to EDIT Commission Rules Dates So that I can make necessary modifications to the rules for the selected Commission .
		# Scenario 1:
		# And Scenario 2:
		# And Scenario 3:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user updates the commission rule
		Then user is on "RuleDetails" page
		When user expands the commission dates accordion
		Then user sees previous booking and departure dates values
		# Scenario 4:
		# And Scenario 6:
		Given user is on "RuleDetails" page
		When user provides commission booking dates that the from date is greater than the to date
		Then user sees error message "Booking start date cannot be greater than booking end date."
		# Scenario 7:
		Given user is on "RuleDetails" page
		When user provides commission departure dates that the from date is greater than the to date
		Then user sees error message "Departure start date cannot be greater than departure end date."
		# Scenario 8:
		# And Scenario 9:
		# And Scenario 10:
		Given user is on "RuleDetails" page
		When user cancels the update of the commission rule
		And user sees prompt message saying "This Commission rule has been modified. Are you sure you want to discard the changes?" and clicks on "Cancel"
		Then user is on "RuleDetails" page
		When user cancels the update of the commission rule
		And user sees prompt message saying "This Commission rule has been modified. Are you sure you want to discard the changes?" and clicks on "OK"
		Then user is on "Commissions" page

	@Regression
	Scenario: APT-1203: 25. As a sales Team member I want to edit Packages and Contracts accordion on Commissions rule update page so that I can see the existing data under that accordion and make necessary changes.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user uses column filters to filter the commission rules
		And user updates the commission rule
		Then user sees the package, contract types, and contracts options
		# Scenario 2:
		# And Scenario 2.1:
		# And Scenario 3:
		# And Scenario 3.1:
		# And Scenario 4:
		# And Scenario 4.1:
		Given user is on "RuleDetails" page
		When user selects option contract types for the commission rule
		Then user sees contract types option fields
		When user selects "Miscellaneous" as the new value for the existing contract type
		And user selects option packages for the existing commission rule
		Then user sees packages option fields
		When user selects "Newmans" as the new value for the existing brand
		And user selects option contracts for the commission rule
		Then user sees the contract in the packages and contracts section of the commission rule
		# Scenario 5:
		# And Scenario 6:
		# And Scenario 7:
		Given user is on "RuleDetails" page
		When user selects option contract types for the commission rule
		Then user sees contract types option fields have retained the values selected
		When user selects option packages for the existing commission rule
		Then user sees packages option fields have retained the values selected
		When user selects option contracts for the commission rule
		Then user sees contracts option fields have retained the values selected

	@Regression
	Scenario: APT-1204: 26. As a sales Team member I want to edit the *Packages* section for a commission rule So that I can make necessary modifications for that section.
		# Additional Scenario: APT-1237: 17. As a User I want to view filters for all sections in packages under Packages and Contracts accordion So that I can search and select values from the drop downs instead of scrolling down the whole list.
		# Scenario 1:
		# And Scenario 14:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user updates the commission rule
		And user selects option packages for the existing commission rule
		Then user sees packages option fields
		# Scenario 8:
		# And Scenario 9:
		# And Scenario 10:
		# And Scenario 13:
		Given user is on "RuleDetails" page
		When user selects "Melbourne" as the new value for the existing tour classification
		And user selects "Day Tours" as the new value for the existing package type
		Then user sees the value of the tour classification changed to default
		And user sees the value of the existing package type is changed to "Day Tours"
		# Scenario 5:
		# And Scenario 6:
		# And Scenario 7:
		# And Scenario 12:
		Given user is on "RuleDetails" page
		When user selects "Australia" as the new value for the existing tour market
		And user selects "Day Tours" as the new value for the existing package type
		And user selects "Melbourne" as the new value for the existing tour classification
		And user selects "All Selected" as the new value for the existing tour market
		Then user sees the value of the tour classification changed to default
		And user sees the value of the package type changed to default
		And user sees the value of the existing tour market is changed to "All Selected"
		# Scenario 2:
		# And Scenario 3:
		# And Scenario 4:
		# And Scenario 11:
		Given user is on "RuleDetails" page
		When user selects "Downunder" as the new value for the existing brand
		And user selects "Australia" as the new value for the existing tour market
		And user selects "Day Tours" as the new value for the existing package type
		And user selects "Melbourne" as the new value for the existing tour classification
		And user selects "Newmans" as the new value for the existing brand
		Then user sees the value of the tour classification changed to default
		And user sees the value of the package type changed to default
		And user sees the value of the tour market changed to default
		And user sees the value of the existing brand is changed to "Newmans"

	@Regression
	Scenario: APT-1206: 29. As a sales Team member I want to edit the *Contract Types* section for a commission rule So that I can make necessary modifications to the related fields.
		# Scenario 1:
		# And Scenario 5:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user updates the commission rule
		And user selects option contract types for the commission rule
		Then user sees contract types option fields
		# Scenario 2:
		Given user is on "RuleDetails" page
		When user selects "Cruise" as the new value for the existing contract type
		Then user sees the value of the existing contract type is changed to "Cruise"
		# Scenario 3:
		# And Scenario 4:
		Given user is on "RuleDetails" page
		When user cancels the update of the commission rule
		And user sees prompt message saying "This Commission rule has been modified. Are you sure you want to discard the changes?" and clicks on "Cancel"
		Then user is on "RuleDetails" page
		When user cancels the update of the commission rule
		And user sees prompt message saying "This Commission rule has been modified. Are you sure you want to discard the changes?" and clicks on "OK"
		Then user is on "Commissions" page

	@Regression
	Scenario: APT-1207: 27. As a sales Team member I want to edit the  *Contracts* section for a commission rule So that I can make necessary modifications for that section.
		# Scenario 1:
		# And Scenario 6:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user uses column filters to find the commission rule that will be added with a contract
		And user updates the commission rule
		And user selects option contracts for the commission rule
		Then user can see the add contract button
		# Scenario 3:
		Given user is on "RuleDetails" page
		When user decides to add a contract to the commission rule
		Then user sees the popup for adding contract to the commission rule
		And user sees different search criterias for finding specific contracts and the miscellaneous type field disabled by default
		# Scenario 4:
		Given user is on "RuleDetails" page
		When user selects miscellaneous as the contract type in the search criteria
		Then user sees the miscellaneous type field enabled
		# Scenario 2:
		# And Scenario 5:
		Given user is on "RuleDetails" page
		When user searches for a contract to be added to the commission rule
		Then user sees the result of the search in the table
		When user adds the contract to the commission rule
		Then user sees the contract in the packages and contracts section of the commission rule

	@Regression
	Scenario: APT-1210: 33. As a Sales Team Member I want to edit/Rename the Commission Name so that I can update the Commission Name.
		# Scenario 10: Database
		# Scenario 8: External Apps
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		Then user sees edit commission name is disabled by default
		# Scenario 2:
		Given user is on "Commissions" page
		When user searches for a commission
		And user selects the commission
		Then user sees edit commission name is enabled
		# Scenario 3:
		# And Scenario 4:
		# And Scenario 9:
		Given user is on "Commissions" page
		When user edits the commission name
		Then user sees the update commission name popup
		# Scenario 5:
		# And Scenario 6:
		Given user is on "Commissions" page
		When user enters a new commission name
		And user saves the new commission name
		Then user sees feedback message "Commission name updated successfully"
		# Scenario 7:
		# And Scenario 8:
		Given user is on "Commissions" page
		When user edits the commission name
		And user enters a new commission name
		And user cancels the editing of the commission name
		Then user does not see the update commission name popup

	@Regression
	Scenario: APT-1233: 20. As a sales Team member I want to view the 'Miscellaneous' field under the Contract Types so that I can select the miscellaneous type for the selected contact type. -On create page
		# Scenario 1:
		# And Scenario 3:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user decides to add a new commission rule
		And user expands the packages and contracts accordion
		And user selects option contract types for the commission rule
		Then user sees the miscellaneous type dropdown
		# Scenario 2:
		Given user is on "RuleDetails" page
		When user opens the miscellaneous type dropdown
		Then user sees the list of miscellaneous types in the dropdown
		# Scenario 4:
		Given user is on "RuleDetails" page
		When user selects a contract type other than miscellaneous
		Then user does not see the miscellaneous type dropdown

	@Regression
	Scenario: APT-1234: 30. As a sales Team member I want to view the 'Miscellaneous' field under the Contract Types on Commission rule edit page so that I can modify the Miscellaneous type.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user updates the commission rule
		And user selects option contract types for the commission rule
		And user updates contract type to miscellaneous
		Then user sees the miscellaneous type dropdown
		# Scenario 2:
		Given user is on "RuleDetails" page
		When user updates contract type to any type other than miscellaneous
		Then user does not see the miscellaneous type dropdown

	@Regression
	Scenario: APT-1249: 22. As a sales Team member I want to save a newly created Commission Rule So that I can have the newly created record under the selected commission.
		# Additional Scenario: APT-1248: 31. As a sales Team Member I want to Save the Commissions Rule after edit so that the modifications will be saved against the record.
		# Scenario 1:
		# And Scenario 8:
		# And Scenario 15:
		Given user opens browser
		When user logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user decides to add a new commission rule
		And user provides information for the commission rule
		And user saves the commission rule
		Then user sees feedback message "Commission Rule created Successfully"
		And user is on "Commissions" page
		When user uses column filters to display the newly added commission rule
		Then user sees the newly added commission rule
		When user decides to add a new commission rule
		And user provides information for the commission rule
		And user saves the commission rule
		Then user sees feedback message "A commission rule exists with the same combination."
		# Scenario 2:
		Given user is on "RuleDetails" page
		When user provides a blank commission rate
		And user saves the commission rule
		Then user sees feedback message "Commission rule cannot be saved. Please review the field error message"
		And user sees error message "This is a mandatory field."
		# Scenario 3:
		Given user is on "RuleDetails" page
		When user provides information for the commission rule
		And user expands the commission dates accordion
		And user provides empty date ranges for the commission dates
		And user saves the commission rule
		Then user sees feedback message "Commission rule cannot be saved. Please review the field error message"
		And user sees error message "This is a mandatory field."
		# Scenario 4:
		Given user is on "RuleDetails" page
		When user provides valid commission booking dates
		And user expands the packages and contracts accordion
		And user deselects all brands
		And user saves the commission rule
		Then user sees feedback message "Commission rule cannot be saved. Please review the field error message"
		And user sees error message "This is a mandatory field."
		# Scenario 5:
		Given user is on "RuleDetails" page
		When user selects option contract types for the commission rule
		And user deselects all contract types
		And user saves the commission rule
		Then user sees feedback message "Commission rule cannot be saved. Please review the field error message"
		And user sees error message "This is a mandatory field."
		# Scenario 6: Cannot be blank.
		# Scenario 7:
		Given user is on "RuleDetails" page
		When user selects option contracts for the commission rule
		And user saves the commission rule
		Then user sees feedback message "Commission rule cannot be saved. Please review the field error message"
		And user sees error message "Please add at least one Contract before saving."
		# Scenario 9:
		Given user is on "RuleDetails" page
		When user provides a commission rate that exceeds the limit
		Then user sees error message "Invalid Commission rate exceeds limit."
		# Scenario 10: Cosmetic
		# Scenario 11: Cosmetic
		# Scenario 12: Cosmetic
		# Scenario 13: Database
		# Scenario 14: Database
		# Scenario for APT-1248:
		Given user is on "RuleDetails" page
		When user cancels the creation of the new commission rule
		And user sees prompt message saying "This Commission rule has been modified. Are you sure you want to discard the changes?" and clicks on "OK"
		Then user is on "Commissions" page
		When user uses column filters to display the newly added commission rule
		And user updates the commission rule
		And user provides updated information for the commission rule
		And user saves the commission rule
		Then user sees feedback message "Commission Rule updated Successfully"
		When user uses column filters to display the recently updated commission rule
		And user updates the commission rule
		And user provides a commission rate that exceeds the limit
		Then user sees error message "Invalid Commission rate exceeds limit."
		When user saves the commission rule
		Then user sees feedback message "Commission rule cannot be saved. Please review the field error message"
		When user provides a blank commission rate
		And user saves the commission rule
		Then user sees error message "This is a mandatory field."
		And user sees feedback message "Commission rule cannot be saved. Please review the field error message"
		When user provides updated information for the commission rule
		And user provides blank commission booking dates
		And user saves the commission rule
		Then user sees error message "This is a mandatory field."
		And user sees feedback message "Commission rule cannot be saved. Please review the field error message"
		When user cancels the update of the commission rule
		And user sees prompt message saying "This Commission rule has been modified. Are you sure you want to discard the changes?" and clicks on "OK"
		Then user is on "Commissions" page
		# Scenario 0:
		Given user is on "Commissions" page
		When user uses column filters to display the recently updated commission rule
		And user decides to delete the commission rule
		And user confirms the deletion of the commission rule
		Then user does not see the commission rule

	@Regression
	Scenario: APT-1290: 05. As a Sales Team Member with View only access I want to see the Commission rules read only page So that I can view rules associated to a commission.
		# Scenario 1:
		# And Scenario 2:
		# And Scenario 3:
		Given user opens browser
		When user with view rights logs into app
		And user navigates to commissions page
		And user searches for a commission
		And user selects the commission
		And user views the commission rule
		Then user is on "View" page
		# Scenario 4:
		Given user is on "View" page
		When user closes the view commission rule
		Then user is on "Commissions" page
