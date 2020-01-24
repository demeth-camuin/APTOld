Feature: APT - Promotions
	I want to use this feature file for testing APT - Promotions user stories

	@RegressionE2E
	Scenario: APT-E2EP: End to End Test Case for Promotions
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user fills up the form for the new promotion
		And user saves the promotion
		Then user sees feedback message "Record(s) saved successfully."
		When user searches for the newly added promotion
		And user edits the promotion
		Then user sees the promotion created recently
		When user fills up the form for the promotion to be updated
		And user saves the promotion
		Then user sees feedback message "Record(s) saved successfully."
		When user searches for the recently updated promotion
		And user edits the promotion
		Then user sees the promotion updated recently

	@Regression
	Scenario: APT-217: As a Promotions User, I want to CREATE a Promotion, so that it can be applied to Packages
		# Additional Scenario: APT-589: As a Yield team member, I want to save a promotion with zero rate
		# Additional Scenario: APT-658: When a promotion is saved I want to see the ID of the promotion in the success message
		# Additional Scenario: APT-736: "First Deposit Due Date Override Number of Days" field must allow to save 0
		# Additional Scenario: APT-733: As a Yield team member I want to select suppliers from a simple short list quickly, so that I do not have to use a complex search to select supplier
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		Then user is on "Add Promotion" page
		# Scenario 2:
		# And Scenario 3:
		# And Scenario 4:
		# And Scenario: ASD-736:
		Given user is on "Add Promotion" page
		When user provides necessary and valid information for the new promotion
		And user saves the promotion
		Then user sees feedback message "Record(s) saved successfully."
		And user is on "Promotions" page
		# Scenario 5:
		Given user is on "Promotions" page
		When user navigates to add promotion page
		And user cancels the adding of promotion
		Then user is on "Promotions" page
		# Scenario 6:
		Given user is on "Promotions" page
		When user navigates to add promotion page
		And user puts some information and cancels the adding of promotion
		And user sees prompt message saying "Are you sure you want to discard your changes?" and clicks on "Cancel"
		Then user is on "Add Promotion" page
		# Scenario 7:
		Given user is on "Add Promotion" page
		When user saves the promotion with incomplete information
		Then user sees error message "*Mandatory field"
		# Scenario: ASD-761: Modified for APT-1423
		Given user is on "Add Promotion" page
		When user changes market offer to none
		#		And user saves the promotion data
		#		And user sees prompt message saying "None is selected as the market offer category. Do you want to proceed?" and clicks on "OK"
		Then user sees the market offer dropdown is none
		# Scenario: ASD-738:
		Given user is on "Add Promotion" page
		When user expands the package accordion
		And user opens the add package popup
		And user searches for a package
		And user adds a package to the promotion
		Then user sees cabin category value is defaulted to all selected

	@Regression
	Scenario: APT-229: As a Promotions User, I want to UPDATE a Promotion, so that it is up to date
		# Additional Scenario: APT-658: When a promotion is saved I want to see the ID of the promotion in the success message
		# Scenario 5: Covered in APT-217
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user edits the promotion
		Then user is on "Update Promotion" page
		# Scenario 2:
		Given user is on "Update Promotion" page
		When user updates the information of the promotion
		And user saves the promotion
		Then user sees feedback message "Record(s) saved successfully."
		# Scenario 3:
		# And Scenario 4:
		Given user is on "Promotions" page
		When user edits the promotion
		And user updates the information of the promotion
		And user discards saving of the promotion
		And user sees prompt message saying "Are you sure you want to discard your changes?" and clicks on "Cancel"
		Then user is on "Update Promotion" page
		When user discards saving of the promotion
		And user sees prompt message saying "Are you sure you want to discard your changes?" and clicks on "OK"
		Then user is on "Promotions" page

	@Regression
	Scenario: APT-230: As a Promotions User, I want to READ/VIEW a Promotion, so that I can verify it is correct
		# Additional Scenario: APT-698: Remove "Promotion Group" field from READ-ONLY promotion screen
		# Scenario 1:
		Given user opens browser
		When user with view rights logs into app
		And user navigates to promotions page
		And user selects a promotion with special fare type to view
		Then user is on "View" page
		# Scenario 2:
		Given user is on "View" page
		Then user sees promotion ID
		And user does not see promotion group related fields
		# Scenario 3:
		Given user is on "View" page
		When user closes the view promotions page
		Then user is on "Promotions" page
		# Scenario 4:
		# And Scenario 5:
		Given user is on "Promotions" page
		When user selects a promotion with special fare type to view
		When user expands the contract accordion
		Then user sees contract information

	@Regression
	Scenario: APT-319: As a Promotions User, I want to REPLICATE Promotion, so that I can use existing record configuration/information to create a "like" Promotion
		# Additional Scenario: APT-658: When a promotion is saved I want to see the ID of the promotion in the success message
		# Scenario 4: Covered in APT-659
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user copies the promotion
		Then user is on "Copy Promotion" page
		# Scenario 2:
		# And Scenario 3:
		Given user is on "Copy Promotion" page
		When user provides necessary information for the copied promotion
		And user saves the promotion
		Then user sees feedback message "Record(s) saved successfully."
		And user is on "Promotions" page

	@Regression
	Scenario: APT-320: As a Promotions User, I want to SEARCH Promotions Table, so that results are returned against elected criteria
		# Additional Scenario: APT-560: As a Promotions User, I want to Promotion Classification details displayed in the search results when searching for a promotion
		# Scenario 7: Covered in APT-217
		# Scenario 8: Covered in APT-319
		# Scenario 1: Search for a promotion
		# And Scenario 4: Filter from Columns by single or multiple fields
		# And Scenario 5: Sort Results
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user sorts promotion
		And user uses column filters to filter the promotions result
		And user removes the promotions column filters
		And user searches for a promotion
		Then user sees the promotion
		# Scenario 2: Search with invalid text
		# And Scenario 6: Reset all Filters
		Given user is on "Promotions" page
		When user searches for a non existing promotion
		Then user sees no results in the table
		When user resets the search results
		Then user sees all of the data in the table
		# Scenario 3: Advance search
		Given user is on "Promotions" page
		When user uses the advance search to find a promotion
		Then user sees the promotion

	@Regression
	Scenario: APT-372: As a Yield Team Member I want to enter multiple departure date ranges against a single booking date range, so that I don't have to duplicate date ranges
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the package accordion
		And user opens the add package popup
		And user searches for a package
		And user adds a package to the promotion
		Then user sees the package in the list under the promotion
		And user sees date ranges accordion
		# Scenario 2:
		# And Scenario 3:
		Given user is on "Add Promotion" page
		When user expands the date ranges accordion
		Then user sees date range dropdown defaulted to booking date
		# Scenario 4: Disabled
		#		Given user is on "Add Promotion" page
		#		When user adds an empty date range
		#		Then user sees error message "Booking start date and end date are mandatory."
		# Scenario 6:
		Given user is on "Add Promotion" page
		When user adds a date range with the start date is greater than the end date
		Then user sees error message "Booking start date cannot be greater than booking end date."
		# Scenario 7:
		# And Scenario 8:
		# And Scenario 9:
		# And Scenario 10:
		# And Scenario 11:
		Given user is on "Add Promotion" page
		When user adds a valid date range
		Then user sees booking date range popup
		And user sees suggestions based on packages
		# Scenario 12:
		Given user is on "Add Promotion" page
		When user removes the existing packages in the promotion
		And user adds a valid date range
		Then user sees booking date range popup
		And user does not see any suggested dates based on packages
		# Scenario 13: Disabled
		# Scenario 15:
		Given user is on "Add Promotion" page
		When user adds a departure date range with the start date is greater than the end date on the booking date range popup
		Then user sees error message "Departure start date cannot be greater than departure end date."
		# Scenario 16:
		# And Scenario 14:
		Given user is on "Add Promotion" page
		When user adds a valid departure date range on the booking date range popup
		And user adds a departure date range that falls between the existing departure date ranges on the booking date range popup
		Then user sees error message "Departure start date and end date must be exclusive of other departure dates in the promotion."
		# Scenario 17:
		Given user is on "Add Promotion" page
		When user removes a departure date range on the booking date range popup
		Then user does not see departure date range deleted on the booking date range popup
		# Scenario 18:
		Given user is on "Add Promotion" page
		When user adds valid departure date ranges on the booking date range popup
		And user saves the booking date range popup entries
		Then user sees the new date range entries in the list
		# Scenario 5:
		Given user is on "Add Promotion" page
		When user adds a date range that falls between on a start and end date of an existing booking
		Then user sees error message "Booking start date and end date must be exclusive of other booking dates in the promotion."
		# Scenario 19: Covered in APT-230
		# Scenario 20:
		Given user is on "Add Promotion" page
		Then user sees date range entry with edit and remove icons
		# Scenario 21:
		Given user is on "Add Promotion" page
		When user edits a date range entry
		Then user sees the dates entered and can be changed
		# Scenario 22:
		Given user is on "Add Promotion" page
		When user removes a date range entry
		Then user does not see the date range entry in the list
		# Scenario 23: Covered in APT-217
		# Scenario 24:
		Given user is on "Add Promotion" page
		When user provides necessary information for the new promotion but leaves date ranges empty
		And user saves the promotion
		Then user sees feedback message "Please input at least one Date Range"

	@Regression
	Scenario: APT-381: As a Promotions User, I want to SEARCH, FIND AND ADD one or more customers to assign to a promotion
		# Additional Scenario: APT-598: Dropdowns in "Search and Select Customer" pop-up must be single-select dropdown with "All" as the first item in it
		# Scenario 1: Search for a customer from the Add Promotion page
		# And Scenario 2: View Customer List
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the customer accordion
		And user opens the add customer popup
		Then user sees customer dropdowns defaulted to all
		When user searches for a customer in the customer popup
		Then user sees the customer information in the table of the customer popup
		# Scenario 3: Add Customer to the Promotion
		Given user is on "Add Promotion" page
		When user adds a customer to the promotion
		Then user sees the customer in the list under the promotion
		# Scenario 4: Invalid search
		Given user is on "Add Promotion" page
		When user opens the add customer popup
		And user searches for a customer in the customer popup that is not existing
		Then user sees no results in the table
		# Scenario 5: Cancel Search
		# And Scenario 6: Remove Customers from the promotion
		Given user is on "Add Promotion" page
		When user closes the customer popup
		And user deletes a customer from the promotion
		Then user does not see the customer in the list under the promotion

	@Regression
	Scenario: APT-382: As a Promotions User, I want to SEARCH, FIND and ADD one or more packages to assign to a promotion
		# Additional Scenario: APT-528: As a Yield team member I want to see package status when searching for packages
		# Additional Scenario: APT-623: As a Yield team member I do not want to see Tour Classification field if selecting Packages
		# Additional Scenario: APT-694: Promotion Tour Length related fields disabled in Add
		# Additional Scenario: APT-719: Cabin Category is ONLY applicable when individual packages are added to promotion
		# Scenario 1: Search for a package from the Add Promotion page
		# And Scenario 2: View Package List
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the package accordion
		And user does not see cabin category dropdown
		And user opens the add package popup
		And user searches for a package
		Then user sees the package information in the table
		# Scenario 3: Add Package to the promotion
		# And Scenario 6: View Packages
		Given user is on "Add Promotion" page
		When user adds a package to the promotion
		Then user sees the package in the list under the promotion
		And user does not see tour classification and tour length dropdowns
		And user sees cabin category dropdown
		# Scenario 4: Invalid search
		Given user is on "Add Promotion" page
		When user opens the add package popup
		And user searches for a package that is not existing
		Then user sees no results in the table
		# Scenario 5: Cancel Search
		# And Scenario 7: Remove Packages from the promotion
		Given user is on "Add Promotion" page
		When user closes the package popup
		And user deletes a package from the promotion
		Then user does not see the package in the list

	@Regression
	Scenario: APT-384: As a Promotions User, I want to SEARCH, FIND and SELECT a contract to assign to a promotion
		# Scenario 1: View Contract section from the Add Promotion page
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user changes the promotion type to special fare
		Then user sees contract section
		# Scenario 2: Search for a Contract from the Add Promotion page
		# And Scenario 3: View Contract List
		Given user is on "Add Promotion" page
		When user expands the contract accordion
		And user opens the add contract popup
		And user searches for a contract for the promotion
		Then user sees the contract information in the table
		# Scenario 4: Add a Contract to the promotion
		Given user is on "Add Promotion" page
		When user adds a contract to the promotion
		Then user sees the contract in the list under the promotion
		# Scenario 5: Invalid search
		Given user is on "Add Promotion" page
		When user opens the add contract popup
		And user searches for a contract that is not existing
		Then user sees no results in the table
		# Scenario 6: Cancel Search
		# And Scenario 7: Remove Contract from the promotion
		Given user is on "Add Promotion" page
		When user closes the contract popup
		And user deletes a contract from the promotion
		Then user does not see the contract in the list of customers

	@Regression
	Scenario: APT-462: Ability to search for promotions that have Allotment ID
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user opens the advanced search filters of the promotions
		Then user sees allotment dropdown with its values

	@Regression
	Scenario: APT-531: As a Yield team member I want to open or close a promotion instead of marking it as active/inactive
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		Then user sees promotion status dropdown with its values

	@Regression
	Scenario: APT-532: Display promotion id when editing, viewing or replicating a promotion
		# Scenario 1: Viewing is covered in APT-230
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user searches for a promotion
		Then user sees the promotion
		When user edits the promotion
		Then user is on "Update Promotion" page
		And user sees promotion id
		When user closes the promotion details page
		And user searches for a promotion
		Then user sees the promotion
		When user copies the promotion
		Then user is on "Copy Promotion" page
		And user sees promotion id

	@Regression
	Scenario: APT-564: Return promotions whose booking date ranges falls between the specified date ranges in search
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user searches for a promotion within a specific departure date
		Then user sees the promotion

	@Regression
	Scenario: APT-570: As a Yield team member I should not be able to add more than 20 packages to a promotion at a time, so that the application does not hang
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the package accordion
		And user opens the add package popup
		And user searches for packages that has a specific brand
		And user adds the packages in the table
		#		Then user sees feedback message "You can only add up to 20 packages at a time."
		When user closes the package popup
		Then user is on "Add Promotion" page
		# Scenario 2:
		# And Scenario 3:
		Given user is on "Add Promotion" page
		When user opens the add package popup
		And user adds the packages in the table
		Then user sees 20 packages added to the promotion
		# Scenario 4:
		Given user is on "Add Promotion" page
		When user opens the add package popup
		And user tries to add packages without selecting to the promotions

	#		Then user sees feedback message "You must select one or more Package"
	#
	@Regression
	Scenario: APT-580: As a Promotion User, I want to specify an Allotment Code in a promotion
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the allotment accordion
		Then user sees allotment options
		When user changes the promotion type to special fare
		Then user does not see allotment accordion

	@Regression
	Scenario: APT-597: Do not allow double-click on package and customer textboxes in promotion search
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user double clicks on package textbox
		Then user does not see list of package
		When user opens the advanced search filters of the promotions
		And user double clicks on customer textbox
		Then user does not see list of customer

	@Regression
	Scenario: APT-599: When a dropdown is refreshed because of selection of parent dropdown, all items in child dropdown must be auto-selected
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the customer accordion
		And user selects a specific customer market
		And user selects a specific customer type
		Then user sees customer market dropdown changed back to all

	@Regression
	Scenario: APT-603: Dropdowns in "Search and Select Package" pop-up must be single-select dropdown with "All" as the first item in it
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the package accordion
		And user opens the add package popup
		Then user sees package popup dropdowns defaulted to All
		When user searches packages without putting any filters

	#		Then user sees feedback message "Search for all packages is not allowed. Please specify at least one criteria to search by."
	#
	@Regression
	Scenario: APT-621: Remove date ranges from contract search screen as all contracts have end date as 31-Dec-2050
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user changes the promotion type to special fare
		And user expands the contract accordion
		And user opens the add contract popup
		And user searches contract without putting any filters

	#		Then user sees feedback message "Search for all contract is not allowed. Please specify at least one criteria to search by."
	#
	@Regression
	Scenario: APT-627: As a Promotions User, I want to validate the pax number entered into Minimum Pax Applies field
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user enables minimum pax and puts invalid number of pax
		Then user sees error message "Minimum passengers must be 2 or greater when applicable."

	@Regression
	Scenario: APT-630: Remove "Promotion Group" field from create, edit and replicate screens
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		Then user does not see promotion group

	@Regression
	Scenario: APT-634: Provide Tooltips for some icons and buttons in Promotions module
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		Then user sees the tooltips on the functional icons when hovered

	@Regression
	Scenario: APT-657: When "Early Payment Discounts" is checked then "Final Due Type" must be defaulted to "Before Departure Date" value and disabled
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the payment rules accordion
		And user enables final due applicable and puts necessary information
		And user decides to enable early payment discount
		Then user sees that final due type is defaulted to before departure date

	@Regression
	Scenario: APT-659: Additional validations/Business Rules to a Replicate Promotion.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user selects a promotion with general promotion type to copy
		Then user sees the description field empty
		When user closes the promotion details page
		Then user is on "Promotions" page
		# Scenario 2:
		Given user is on "Promotions" page
		When user selects a promotion with special fare type to copy
		Then user sees the promotion code field empty

	@Regression
	Scenario: APT-671: Department dropdown values must have Office appended to them
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the market accordion
		Then user sees on department dropdown that values are appended with the office associated to it

	@Regression
	Scenario: APT-680: Override Promotion Line Commission wont save with 0%
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user provides necessary information for the new promotion but puts an invalid data on override promotion line commission
		And user saves the promotion
		#		Then user sees feedback message "Commission cannot be greater than 100%"
		Then user sees feedback message "Unable to Save. Please review the error message(s)."

	@Regression
	Scenario: APT-715: Payment Sections should not allow dates of 31 Dec 9999 to save, option to type in Dates
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user provides necessary information for the new promotion and user enables second deposit applicable but puts an invalid date
		And user saves the promotion
		Then user sees error message "Please enter a valid Second Deposit Due Date."
		When user puts a valid second deposit due date
		And user enables final due applicable and puts an invalid date
		And user saves the promotion
		Then user sees error message "Please enter a valid Final Due Date."

	@Regression
	Scenario: APT-717: "Rounding Rule" and "Rounding Amount" fields does not apply to "Special Fare"
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user changes the promotion type to special fare
		Then user does not see Rounding Rule and Rounding amount fields

	@Regression
	Scenario: APT-718: Hide irrelevant fields from Special Fare Promotions
		# Scenario 0:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		Then user does not see some certain fields when promotion type is special fare

	@Regression
	Scenario: APT-731: Override Default Commission must display "10%" by default when form loads
		# Scenario 0:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		Then user sees override default commission is defaulted to 10%

	@Regression
	Scenario: APT-732: Second Deposit For must be defaulted to miscellaneous when form loads
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the payment rules accordion
		And user decides to enable second deposit applicable
		Then user sees second deposit for is defaulted to miscellaneous

	@Regression
	Scenario: APT-751: As a Yield team member, when selecting a deposit amount the 'Deposit Type' should be defaulted to 'PER PERSON'.
		# Scenario 0:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the payment rules accordion
		And user decides to enable first deposit applicable
		Then user sees first deposit type is defaulted to per person
		When user decides to enable second deposit applicable
		Then user sees second deposit type is defaulted to per person

	@Regression
	Scenario: APT-755: As a Yield team member I should not be able to add more than 20 customers to a promotion at a time, so that the application does not hang
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the customer accordion
		And user opens the add customer popup
		And user searches for customers in a specific country
		And user adds the customers in the table
		#		Then user sees feedback message "You can only add up to 20 Customers at a time."
		When user closes the customer popup
		Then user is on "Add Promotion" page
		# Scenario 2:
		# And Scenario 3:
		Given user is on "Add Promotion" page
		When user opens the add customer popup
		And user adds the customers in the table
		Then user sees 20 customers added to the promotion
		# Scenario 4:
		Given user is on "Add Promotion" page
		When user opens the add customer popup
		And user tries to add customers without selecting to the promotions

	#		Then user sees feedback message "You must select one or more Customers at a time."
	#
	@Regression
	Scenario: APT-764: As a Yield Team Member I want to enter multiple booking date ranges against a single departure date range, so that I don't have to duplicate date ranges
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		Then user sees date ranges accordion
		# Scenario 2:
		# And Scenario 3:
		Given user is on "Add Promotion" page
		When user expands the date ranges accordion
		Then user sees date range dropdown defaulted to booking date
		# Scenario 4: Disabled
		# Scenario 6:
		Given user is on "Add Promotion" page
		When user selected departure date to start entering date ranges by
		And user adds a date range with the start date is greater than the end date
		Then user sees error message "Departure start date cannot be greater than departure end date."
		# Scenario 7:
		# And Scenario 8:
		# And Scenario 9:
		Given user is on "Add Promotion" page
		When user adds a valid date range
		Then user sees departure date range popup
		# Scenario 10: Disabled
		# Scenario 12:
		Given user is on "Add Promotion" page
		When user adds a booking date range with the start date is greater than the end date on the departure date range popup
		Then user sees error message "Booking start date cannot be greater than booking end date"
		# Scenario 13:
		# And Scenario 11:
		Given user is on "Add Promotion" page
		When user adds a valid booking date range on the departure date range popup
		And user adds a booking date range that falls between the existing booking date ranges on the departure date range popup
		Then user sees error message "Booking start date and end date must be exclusive of other booking dates in the promotion."
		# Scenario 14:
		Given user is on "Add Promotion" page
		When user removes a booking date range on the departure date range popup
		Then user does not see booking date range deleted on the departure date rage popup
		# Scenario 15:
		Given user is on "Add Promotion" page
		When user adds valid booking date ranges on the departure date range popup
		And user saves the departure date range popup entries
		Then user sees the new date range entries in the list
		# Scenario 5:
		Given user is on "Add Promotion" page
		When user adds a date range that falls between on a start and end date of an existing departure
		Then user sees error message "Departure start date and end date must be exclusive of other departure dates in the promotion."
		# Scenario 16: Covered in APT-230
		# Scenario 17:
		Given user is on "Add Promotion" page
		Then user sees date range entry with edit and remove icons
		# Scenario 18:
		Given user is on "Add Promotion" page
		When user edits a date range entry
		Then user sees the dates entered and can be changed
		# Scenario 19:
		Given user is on "Add Promotion" page
		When user removes a date range entry
		Then user does not see the date range entry in the list
		# Scenario 20: Covered in APT-217
		# Scenario 21:
		Given user is on "Add Promotion" page
		When user provides necessary information for the new promotion but leaves date ranges empty
		And user saves the promotion
		Then user sees feedback message "Please input at least one Date Range"

	@Regression
	Scenario: APT-774: Dropdowns in promotion search does not have filter bar
		# Scenario 0:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user opens the advanced search filters of the promotions
		Then user sees filter bars for certain promotion field dropdowns available

	@Regression
	Scenario: APT-828: Add New Promotion - Display On section enhancements
		# Additional Scenario: APT-961: "Applicable" field should default to "Per Person"
		# Scenario 0:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		Then user sees applicable to and assign labels
		And user sees assign dropdown defaulted to per passenger
		When user saves the promotion
		Then user sees error message "Please select at least one"

	@Regression
	Scenario: APT-832: As a Yield team member I want to see an error notification when my save is unsuccessful, so that it is clear that the record was not saved
		# Scenario 0:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user saves the promotion
		#		Then user sees feedback message "Promotion cannot be saved. Please review and fix the errors highlighted against each field below."
		Then user sees feedback message "Unable to Save. Please review the error message(s)."

	@Regression
	Scenario: APT-962: "Promotion Description" should be copied into "Invoice Description" automatically
		# Scenario 4: Covered in APT-217
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user provides a promotion description
		Then user sees promotion description input text is copied into invoice description input
		# Scenario 2: Covered in APT-217
		# Scenario 3:
		Given user is on "Add Promotion" page
		When user cancels the adding of promotion
		And user sees prompt message saying "Are you sure you want to discard your changes?" and clicks on "OK"
		And user edits a general promotion
		And user provides a promotion description
		Then user sees a warning that the invoice description has been updated

	@Regression
	Scenario: APT-970: As a Yield team member, I want to be notified when I am enabling a promotion that have combinability data specified before so that I can review and verify that it is up-to-date
		# Scenario 1:
		# And Scenario 2:
		# And Scenario 3:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user searches for a promotion that in the internal discount category
		And user edits the promotion
		And user changes the promotion category from internal discount to air deal
		Then user sees a warning message about the promotion being combinable to specific promotions only

	@Regression
	Scenario: APT-971: As a Yield team member, I want to be notified when I change critical attributes of a promotion so that I am aware when eligible promotions list change
		# Scenario 1:
		# And Scenario 3:
		# And Scenario 4:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user edits the promotion with promotion combinability
		And user expands the customer accordion
		And user selects a specific customer market
		And user expands the combinability accordion
		Then user sees a warning message about the promotion being invalid with the change

	@Regression
	Scenario: APT-974: As a Yield team member I want to see the combinability table in a textual fashion in View Promotions page so that it is consistent with tables in view page of other modules
		# Scenario 1:
		# And Scenario 3:
		# And Scenario 4:
		Given user opens browser
		When user with view rights logs into app
		And user navigates to promotions page
		And user searches for a combinable promotion
		Then user sees table of checked promotions
		# Scenario 2:
		Given user is on "View" page
		When user closes the view promotions page
		And user searches for a promotion that is closed
		Then user sees promotion is not combinable with any promotions

	@Regression
	Scenario: APT-1145: As a Yield Team member I want to see a new field in the promotions page called 'Market offer' so that I can assign the promotions to a market offer category. - Create Page
		# Additional Scenario: APT-1148: As a Yield Team member I want to see a new field in the promotions page called 'Market offer' so that I can assign the promotions to a market offer category. (On Edit or Copy Page)
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		Then user sees market offer dropdown is disabled
		And user sees market offer dropdown is defaulted to select
		# Scenario 2:
		Given user is on "Add Promotion" page
		When user selects air deal as the promotion category
		Then user sees market offer dropdown is enabled
		And user sees market offer dropdown is defaulted to select
		# Scenario 3:
		Given user is on "Add Promotion" page
		When user selects bonus offer as the promotion category
		Then user sees market offer dropdown is enabled
		And user sees market offer dropdown is defaulted to select
		# Scenario 5:
		# And Scenario 6:
		# And Scenario 7:
		Given user is on "Add Promotion" page
		When user selects air deal as the promotion category
		And user saves the promotion data
		Then user sees error message "*Mandatory field"
		And user sees feedback message "Unable to Save. Please review the error message(s)."
		# Scenario 4:
		# And Scenario 8:
		# And Scenario 9:
		Given user is on "Add Promotion" page
		When user selects main as the market offer
		And user saves the promotion
		Then user is on "Add Promotion" page
		And user sees feedback message "Unable to Save. Please review the error message(s)."

	@Regression
	Scenario: APT-1149: As a Yield Team member I want to see a new field in the promotions page called 'Combinability Group' so that I can map the promotions to the new combinability category. - On create Pag)
		# Scenario 1:
		# And Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user sees combinability group dropdown value is defaulted to select
		# Scenario 3:
		Given user is on "Add Promotion" page
		When user opens the promotion combinability group dropdown
		Then user sees the promotion combinability group dropdown contains several options to be selected
		# Scenario 4:
		Given user is on "Add Promotion" page
		When user saves the promotion
		Then user sees error message "*Mandatory field"
		And user sees feedback message "Unable to Save. Please review the error message(s)."

	@Regression
	Scenario: APT-1150: As a Yield Team member I want the combinability group field to be auto filled/selected as per the selection in Promotion category field so that I dont have to select the combinability group manually. - Create Page
		# Additional Scenario: APT-1157: As a Yield Team member I want the combinability group field to be auto filled/selected as per the selection in Promotion category field so that I dont have to select the combinability group manually(Edit and Copy Page)
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user selects "Bonus Offer" as promotion category
		Then user sees "Bonus Offer" as promotion combinability group
		# Scenario 2
		Given user is on "Add Promotion" page
		When user selects "Distress Offer" as promotion category
		Then user sees "Hot Deal" as promotion combinability group
		# Scenario 3
		Given user is on "Add Promotion" page
		When user selects "Event Offer" as promotion category
		Then user sees "Event Offer" as promotion combinability group
		# Scenario 4
		Given user is on "Add Promotion" page
		When user selects "Internal Discount" as promotion category
		Then user sees "Internal Discount" as promotion combinability group
		# Scenario 5
		Given user is on "Add Promotion" page
		When user selects "Loyalty/Affiliate Offer" as promotion category
		Then user sees "Loyalty Offer" as promotion combinability group
		# Scenario 6
		Given user is on "Add Promotion" page
		When user selects "Air Deal" as promotion category
		Then user sees "Air Deal" as promotion combinability group
		# Scenario 7
		Given user is on "Add Promotion" page
		When user selects "Saving" as promotion category
		Then user sees "Saving" as promotion combinability group
		# Scenario 8
		Given user is on "Add Promotion" page
		When user selects "Solo Traveller" as promotion category
		Then user sees "Solo Traveller Offer" as promotion combinability group
		# Scenario 9
		Given user is on "Add Promotion" page
		When user selects "Miscellaneous" as promotion category
		Then user sees "Miscellaneous" as promotion combinability group
		# Scenario 10
		Given user is on "Add Promotion" page
		When user selects a promotion combinability group
		Then user sees unchanged promotion category

	@Regression
	Scenario: APT-1156: As a Yield Team member I want to see a new field in the promotions page called 'Combinability Group' so that I can map the existing promotions to the new category. - On Edit/Copy Page
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user edits the promotion with promotion combinability
		And user selects blank promotion combinability group
		And user saves the promotion
		Then user sees error message "*Mandatory field"
		And user sees feedback message "Unable to Save. Please review the error message(s)."
		# Scenario 2:
		Given user is on "Update Promotion" page
		When user opens the promotion combinability group dropdown
		Then user sees the promotion combinability group dropdown contains several options to be selected

	@Regression
	Scenario: APT-1186: 'Type' column on the promotions main page is to be removed. 
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		Then user does not see the type column in the promotions table

	@Regression
	Scenario: APT-1197: Calender should show month and year as per date entered by user
		# Scenario 0:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user expands the date ranges accordion
		And user enter a booking date from by typing
		Then user sees the booking date from in the calendar shows the entered date

	@Regression
	Scenario: APT-1223: As a Yield team member, I do not want to see "Market Offer" and "Combinability Group" fields when not applicable
		# Scenario 2:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user selects "Air Deal" as promotion category
		And user selects main as the market offer
		Then user sees market offer, and combinability group fields
		# Scenario 1:
		Given user is on "Add Promotion" page
		When user changes the promotion type to special fare
		Then user does not see promotion category, market offer, and combinability group fields
		# Scenario 3:
		Given user is on "Add Promotion" page
		When user changes the promotion type to gen promotion
		Then user sees previously selected values for promotion category, market offer, and combinability group fields

	@Regression
	Scenario: APT-3023: 01. As a Yield/OPT Team Member I WANT TO populate the NEW Field ‘Consumer Web Medium Description’ in the Promotions Module of Oxy Admin SO THAT the Consumer Web Medium Description contains all the relevant data for display on the APT Consumer Website.
		# Additional Scenario: APT-3083: 02. As a Yield/OPT Team Member I WANT TO Modify Consumer Web Medium Description SO THAT I can create a more refined description to be displayed on the consumer web
		# Additional Scenario: APT-3084: 03. As a Yield/OPT Team Member I WANT TO validate the NEW Field ‘Consumer Web Medium Description’ in the Promotions Module of Oxy Admin SO THAT the Consumer Web Medium Description is restricted to 74 characters
		# Additional Scenario: APT-3090: 04. As a Yield/OPT Team Member I WANT TO COPY the populated field ‘Consumer Web Medium Description’ when I COPY a Promotion SO THAT the Consumer Web Medium Description is already populated
		# Additional Scenario: APT-3142: 01. Promo Consumer Web Med Desc - values over 1000 to have a comma separator
		# Additional Scenario: APT-3143: 01. Promo Consumer Web Med Desc - use same rounding rules as Short Desc
		# Additional Scenario: APT-3194: Validation on Rate Per Person Field when -'ve Value is Found AND Associated Field Error Message
		# Scenario 1: Populate Consumer Web Medium Description
		# And Scenario 2: Saving Consumer Web Medium Description - Success
		# And Scenario 3: Close
		# And Scenario 4: Where Medium Description has an <Amount> Keyword - Currency Symbol
		# And Scenario 5:
		# And Scenario 6: Where Medium Description has a <Percent> Keyword - Value NOT Found
		# And Scenario 7: Where Medium Description has <Amount> AND<Airline> Keywords - Value NOT Found
		# And Scenario 8: Update Medium Description upon updating Keywords
		# And Scenario 9: Where Medium Description has no Keywords
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user searches for a promotion
		And user edits the promotion
		Then user sees the promotion consumer web medium description field
		When user toggles the atg consumer web option
		Then user does not see the promotion consumer web medium description field
		When user toggles the atg consumer web option
		And user puts "DO NOT ALTER / DELETE $" in the promotion basic information description field
		And user saves the promotion
		Then user sees feedback message "Unable to Save. Please review the error message(s)."
		And user sees error message "Description has a $ symbol but does not have a value."
		When user puts "DO NOT ALTER / DELETE 1500" in the promotion basic information description field
		And user saves the promotion
		Then user sees feedback message "Unable to Save. Please review the error message(s)."
		And user sees error message "Description has a value but does not have a $ symbol."
		And user does not see the error message "Description has a $ symbol but does not have a value."
		When user puts "DO NOT ALTER / DELETE" in the promotion basic information description field
		Then user does not see the error message "Description has a value but does not have a $ symbol."
		When user ticks the "Dollar Discount" option of the promotion basic information classification dropdown
		And user puts "0" in the promotion basic information rate per person field
		And user saves the promotion
		Then user sees error message "Rate Per Person cannot be equal to 0."
		When user puts "1500.00" in the promotion basic information rate per person field
		Then user sees that the promotion consumer web medium description field contains "Save $1,500 Per Person"
		When user puts "Consumer Web Medium Description Characters Left Testing if over seventy four characters" in the promotion basic information consumer web medium description field
		And user saves the promotion
		Then user sees error message "Consumer Web Medium Description cannot be greater than 74 characters."
		And user does not see the error message "Rate Per Person cannot be equal to 0."
		When user ticks the "Air Credit" option of the promotion basic information classification dropdown
		And user saves the promotion
		Then user sees feedback message "Record(s) saved successfully."

	@Regression
	Scenario: APT-3095: 05. As a Yield/OPT Team Member I WANT TO View Consumer Web Medium Description SO THAT I can determine what will be displayed on the consumer web
		Given user opens browser
		When user with view rights logs into app
		And user navigates to promotions page
		And user searches for a promotion
		And user views the promotion
		Then user sees the promotion consumer web medium description field

	@Regression
	Scenario: APT-3145: As a user with View only access, I want to see the Indicative Air under the promotions module
		Given user opens browser
		When user with view rights logs into app
		And user navigates to promotions page
		And user searches for a promotion with the revenue location air
		And user views the promotion
		Then user sees the promotion indicative air section fields

	@Regression
	Scenario: APT-3173: Promo Consumer Web Medium Description - $ and % differentiator to be drawn through from 'Action Field'
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user ticks the "Air" option of the promotion basic information revenue allocation dropdown
		And user ticks the "Select All" option of the promotion indicative air airline dropdown
		And user ticks the "NZ" option of the promotion indicative air airline dropdown
		And user puts "Test $2000.12" in the promotion basic information description field
		And user toggles the atg consumer web option
		And user puts "-1500.12" in the promotion basic information rate per person field
		And user expands the customer accordion
		# AMOUNT/PERCENT ONLY
		And user ticks the "2 for 1" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web short description field contains "2 for 1*"
		And user sees that the promotion consumer web medium description field contains "2 for 1, Save £1,500 Per Person"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web short description field contains "2 for 1*"
		And user sees that the promotion consumer web medium description field contains "2 for 1, Save $1,500 Per Person"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web short description field contains "2 for 1*"
		And user sees that the promotion consumer web medium description field contains "2 for 1, Save 1,500% Per Person"
		When user ticks the "Dollar Discount" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web short description field contains "Save £1,500*"
		And user sees that the promotion consumer web medium description field contains "Save £1,500 Per Person"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web short description field contains "Save $1,500*"
		And user sees that the promotion consumer web medium description field contains "Save $1,500 Per Person"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web short description field contains "Save $1,500*"
		And user sees that the promotion consumer web medium description field contains "Save 1,500% Per Person"
		When user ticks the "Early Payment Discount" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Early Payment Discount, Save £1,500"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web medium description field contains "Early Payment Discount, Save $1,500"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Early Payment Discount, Save 1,500%"
		When user ticks the "Cabin Upgrade Discounted" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "£1,500 Off Cabin Upgrade"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web medium description field contains "$1,500 Off Cabin Upgrade"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "1,500% Off Cabin Upgrade"
		When user ticks the "Flight Not Booked By Discount" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Save £1,500 Per Person"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web medium description field contains "Save $1,500 Per Person"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Save 1,500% Per Person"
		When user ticks the "Solo Traveller % Discount" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Single Traveller £1,500 Off Discount"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web medium description field contains "Single Traveller $1,500 Off Discount"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Single Traveller 1,500% Off Discount"
		When user ticks the "Solo Traveller Air Credit" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Single Air Credit, £1,500. Flights must be booked with us."
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web medium description field contains "Single Air Credit, $1,500. Flights must be booked with us."
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Single Air Credit, 1,500%. Flights must be booked with us."
		When user ticks the "Solo Traveller Offer" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Single Traveller Special, Save £1,500"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web medium description field contains "Single Traveller Special, Save $1,500"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Single Traveller Special, Save 1,500%"
		When user ticks the "Expo Offer" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Expo Offer Special, Save £1,500"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web medium description field contains "Expo Offer Special, Save $1,500"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Expo Offer Special, Save 1,500%"
		When user ticks the "Info Session" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Info Session Special, Save £1,500"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web medium description field contains "Info Session Special, Save $1,500"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Info Session Special, Save 1,500%"
		When user ticks the "Onboard Credit" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Onboard Credit of £1,500"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web medium description field contains "Onboard Credit of $1,500"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web medium description field contains "Onboard Credit of 1,500%"
		# AIRLINE ONLY
		When user ticks the "2 for 1 Airfares Including Taxes" option of the promotion basic information classification dropdown
		And user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "2 for 1 Airfares*"
		And user sees that the promotion consumer web medium description field contains "2 for 1 Economy Airfares Including Taxes"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "2 for 1 Airfares*"
		And user sees that the promotion consumer web medium description field contains "2 for 1 Economy Airfares Including Taxes Air New Zealand"
		When user ticks the "2 for 1 Airfares Excluding Taxes" option of the promotion basic information classification dropdown
		And user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "2 for 1 Airfares*"
		And user sees that the promotion consumer web medium description field contains "2 for 1 Economy Airfares Excluding Taxes"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "2 for 1 Airfares*"
		And user sees that the promotion consumer web medium description field contains "2 for 1 Economy Airfares Excluding Taxes Air New Zealand"
		When user ticks the "CFF Including Taxes" option of the promotion basic information classification dropdown
		And user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Companion Fly Free*"
		And user sees that the promotion consumer web medium description field contains "Companion Fly Free Economy Including Taxes"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Companion Fly Free*"
		And user sees that the promotion consumer web medium description field contains "Companion Fly Free Economy Including Taxes Air New Zealand"
		When user ticks the "CFF Must Pay Taxes" option of the promotion basic information classification dropdown
		And user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Companion Fly Free*"
		And user sees that the promotion consumer web medium description field contains "Companion Fly Free Economy Excluding Taxes"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Companion Fly Free*"
		And user sees that the promotion consumer web medium description field contains "Companion Fly Free Economy Excluding Taxes Air New Zealand"
		When user ticks the "Fly Free Including Taxes" option of the promotion basic information classification dropdown
		And user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Free*"
		And user sees that the promotion consumer web medium description field contains "Fly Free Economy Including Taxes"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Free*"
		And user sees that the promotion consumer web medium description field contains "Fly Free Economy Including Taxes Air New Zealand"
		When user ticks the "Fly Free Must Pay Taxes" option of the promotion basic information classification dropdown
		And user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Free*"
		And user sees that the promotion consumer web medium description field contains "Fly Free Economy Must Pay Taxes"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Free*"
		And user sees that the promotion consumer web medium description field contains "Fly Free Economy Must Pay Taxes Air New Zealand"
		When user ticks the "Free Business Class Upgrade" option of the promotion basic information classification dropdown
		And user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Free Business Upgrade*"
		And user sees that the promotion consumer web medium description field contains "Free Business Class Upgrade"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Free Business Upgrade*"
		And user sees that the promotion consumer web medium description field contains "Free Business Class Upgrade Air New Zealand"
		When user ticks the "Free Business Class" option of the promotion basic information classification dropdown
		And user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Free Business Class*"
		And user sees that the promotion consumer web medium description field contains "Fly Free Business Class"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Free Business Class*"
		And user sees that the promotion consumer web medium description field contains "Fly Free Business Class Air New Zealand"
		# AMOUNT AND AIRLINE
		When user ticks the "Fly Business For" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Business For £1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly Business Class For £1,500 Air New Zealand"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Business For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly Business Class For $1,500 Air New Zealand"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Business For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly Business Class For 1,500% Air New Zealand"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Business For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly Business Class For 1,500%"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Business For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly Business Class For 1,500% Air New Zealand"
		When user ticks the "Fly For" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web short description field contains "Fly For £1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly For £1,500 Air New Zealand"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web short description field contains "Fly For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly For $1,500 Air New Zealand"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web short description field contains "Fly For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly For 1,500% Air New Zealand"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly For 1,500%"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly For 1,500% Air New Zealand"
		When user ticks the "Fly Premium Economy For" option of the promotion basic information classification dropdown
		And user ticks the "Select All" option of the promotion customer market dropdown
		And user ticks the "Europe" option of the promotion customer market dropdown
		And user ticks the "UK" option of the promotion customer market dropdown
		And user ticks the "$ - Dollar Amount" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Prem Econ For £1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly Premium Economy For £1,500 Air New Zealand"
		When user ticks the "Select All" option of the promotion customer market dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Prem Econ For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly Premium Economy For $1,500 Air New Zealand"
		When user ticks the "% - Percent" option of the promotion basic information action dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Prem Econ For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly Premium Economy For 1,500% Air New Zealand"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Prem Econ For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly Premium Economy For 1,500%"
		When user ticks the "0B" option of the promotion indicative air airline dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Prem Econ For $1,500*"
		And user sees that the promotion consumer web medium description field contains "Fly Premium Economy For 1,500% Air New Zealand"
		# NO SPECIAL INSTRUCTIONS
		When user ticks the "Free Cabin Upgrade" option of the promotion basic information classification dropdown
		Then user sees that the promotion consumer web short description field contains "Free Cabin Upgrade*"
		And user sees that the promotion consumer web medium description field contains "Free Cabin Upgrade, One Category"
		When user ticks the "50% off Cabin Upgrade" option of the promotion basic information classification dropdown
		Then user sees that the promotion consumer web medium description field contains "50% Off Cabin Upgrade"
		When user ticks the "Cabin Upgrade Complimentary" option of the promotion basic information classification dropdown
		Then user sees that the promotion consumer web medium description field contains "Free Cabin Upgrade"
		When user ticks the "Solo Traveller Cabin Offer" option of the promotion basic information classification dropdown
		Then user sees that the promotion consumer web medium description field contains "Single Traveller Cabin Upgrade Offer"
		When user ticks the "Free City Stay" option of the promotion basic information classification dropdown
		Then user sees that the promotion consumer web medium description field contains "Free City Stay"
		When user ticks the "Free Pre & Post" option of the promotion basic information classification dropdown
		Then user sees that the promotion consumer web medium description field contains "Free Pre & Post Accommodation"
		When user ticks the "Free Premium Economy Upgrade" option of the promotion basic information classification dropdown
		Then user sees that the promotion consumer web medium description field contains "Free Premium Economy Upgrade"
		When user ticks the "Free Transfer" option of the promotion basic information classification dropdown
		Then user sees that the promotion consumer web medium description field contains "Free Transfer"
		When user ticks the "Fly Free Domestic" option of the promotion basic information classification dropdown
		Then user sees that the promotion consumer web short description field contains "Fly Free*"
		And user sees that the promotion consumer web medium description field contains "Fly Free Economy"
		# AIR CREDIT ONLY
		When user ticks the "Air Credit" option of the promotion basic information classification dropdown
		Then user sees that the promotion consumer web short description field contains "Air Credit $2,000*"
		And user sees that the promotion consumer web medium description field contains "Air Credit, Save $2,000. Flights must be booked with us."
