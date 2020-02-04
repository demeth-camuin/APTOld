Feature: APT - Air
	I want to use this feature file for testing APT - Air user stories

	@Regression
	Scenario: APT-2221: 02. As a Flight Admin User I want to Display Recommended Itinerary Details and Other Setup Tabs on Flight Admin Landing Page So I can Access All Flight Setups from a single Page
		# Scenario 1: Deleted
		# Scenario 2: Other Sub Menu Display - Attached to APT-2621
		# Scenario 8: Display Sorting - Not Applicable
		# Scenario 3: Page Title - Recommended Itinerary
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		Then user is on "Recommended Itinerary" page
		# Scenario 4: Page Header Details
		Given user is on "Recommended Itinerary" page
		Then user sees the recommended itinerary fields and buttons
		# Scenario 5: Page Header Field and Label
		Given user is on "Recommended Itinerary" page
		Then user sees the recommended itinerary fields and default values
		# Scenario 6: Table Field and Label - Default Display
		# And Scenario 7: Display Filter
		# And Scenario 9: Copy/Edit/Delete Icon Visibility
		Given user is on "Recommended Itinerary" page
		Then user sees the recommended itinerary table and its contents

	@Regression
	Scenario: APT-2227: 04. As a Flight Admin User, I want to  Edit Flight Itineraries For Packages So I can use modified Itineraries for related booking packages
		# Additional Scenario: APT-2673: Modify Date Range  - Improvement
		# Scenario 1: Display Page Title
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user ticks the "IS18" option of the search itinerary tour code dropdown
		And user ticks the "New Zealand Domestic" option of the search itinerary customer market dropdown
		And user puts "01 Jan 1990" in the search itinerary departure date from field
		And user searches for a recommended itinerary with the given search filters
		And user puts "IS18, VEM08" in the tour code column filter to filter the recommended itinerary result
		And user edits the recommended itinerary
		Then user sees the update recommended itinerary title on the top left corner of the page
		# Scenario 2: Edit Tour Code Field
		Given user is on "Update Recommended Itinerary" page
		When user ticks the "Select All" option of the itinerary tour code dropdown
		And user ticks the "Select All" option of the itinerary tour code dropdown
		And user ticks the "AFC19" option of the itinerary tour code dropdown
		Then user sees the itinerary tour code dropdown contains "AFC19"
		# Scenario 3: Edit Itinerary Name Field
		Given user is on "Update Recommended Itinerary" page
		Then user sees the itinerary name field enabled
		# Scenario 4: Edit Customer Market Field
		Given user is on "Update Recommended Itinerary" page
		When user ticks the "Select All" option of the itinerary customer market dropdown
		And user ticks the "Select All" option of the itinerary customer market dropdown
		And user ticks the "Australia Domestic" option of the itinerary customer market dropdown
		And user ticks the "New Zealand Domestic" option of the itinerary customer market dropdown
		Then user sees the itinerary customer market dropdown contains "Australia Domestic, New Zealand Domestic"
		# Scenario 5: Edit Use Package Specific Rule
		Given user is on "Update Recommended Itinerary" page
		Then user sees the itinerary inactive checkbox enabled
		And user sees the itinerary use package specific rule checkbox enabled
		# Scenario 6: Edit Internal Itinerary
		# And Scenario 7: Modify Itinerary Details
		# And Scenario 8: Add/Remove multiple destination
		# And Scenario 9: Modify Package Day Indicator
		# And Scenario 13: Last Inbound Flying To Validation - Disable Add Flight Button
		# And Scenario 14: Last Inbound Flying To Validation- Enable Add Flight Button
		Given user is on "Update Recommended Itinerary" page
		Then user sees the itinerary inbound and outbound accordion fields enabled
		When user ticks the "AUH -" option of the itinerary outbound top flying from dropdown
		Then user sees the itinerary outbound top flying from dropdown contains "Abu Dhabi"
		When user ticks the "SAT -" option of the itinerary outbound top flying to dropdown
		Then user sees the itinerary outbound top flying to dropdown contains "San Antonio"
		When user puts "1" in the itinerary outbound top package day indicator field
		And user adds the outbound flight to the itinerary
		Then user sees another form for a new outbound flight
		When user deletes the recently added outbound flight from the itinerary
		Then user does not see the new outbound flight
		When user ticks the "AMS -" option of the itinerary inbound top flying from dropdown
		Then user sees the itinerary inbound top flying from dropdown contains "Amsterdam"
		When user ticks the "DXB -" option of the itinerary inbound top flying to dropdown
		Then user sees the itinerary inbound top flying to dropdown contains "Dubai"
		When user puts "2" in the itinerary inbound top package day indicator field
		And user adds the inbound flight to the itinerary
		Then user sees another form for a new inbound flight
		When user deletes the recently added inbound flight from the itinerary
		Then user does not see the new inbound flight
		When user ticks the "AUH -" option of the itinerary inbound top flying from dropdown
		And user ticks the "ZVJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "SHJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "XNB" option of the itinerary inbound top flying to dropdown
		And user puts "5" in the itinerary inbound top package day indicator field
		#		And user adds the inbound flight to the itinerary
		Then user sees the add inbound flight button is disabled
		When user ticks the "ZVJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "SHJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "XNB" option of the itinerary inbound top flying to dropdown
		Then user sees the add inbound flight button is enabled
		When user ticks the "MNL -" option of the itinerary internal top flying from dropdown
		Then user sees the itinerary internal top flying from dropdown contains "Manila"
		When user ticks the "MEL -" option of the itinerary internal top flying to dropdown
		Then user sees the itinerary internal top flying to dropdown contains "Melbourne"
		When user puts "3" in the itinerary internal top package day indicator field
		And user adds the internal flight to the itinerary
		Then user sees another form for a new internal flight
		When user deletes the recently added internal flight from the itinerary
		Then user does not see the new internal flight
		# Scenario 10: Modify Internal Comment
		Given user is on "Update Recommended Itinerary" page
		When user puts "Update Internal" in the itinerary comments internal field
		Then user sees the itinerary comments internal field contains "Update Internal"
		# Scenario 11: Modify External Comment
		Given user is on "Update Recommended Itinerary" page
		When user puts "Update External" in the itinerary comments external field
		Then user sees the itinerary comments external field contains "Update External"
		# Scenario 12: Modify Date Range
		Given user is on "Update Recommended Itinerary" page
		Then user sees the itinerary date ranges departure date from and to textboxes enabled
		# Scenario for APT-2673:
		Given user is on "Update Recommended Itinerary" page
		Then user sees the existing itinerary date ranges departure date from and to textboxes enabled

	@Regression
	Scenario: APT-2239: 03. As a Flight Admin User I want to Search for Recommended Itinerary So I can Identify and Manage existing Package Flight setup
		# Additional Scenario: APT-2794: Recommended Itinerary Date Range Search
		# Additional Scenario: APT-2887: Improvement - Search Recommend Itinerary
		# Additional Scenario: APT-3032: Use Package Specific Rule should be auto selected by default
		# Scenario 6: Sort Search Result - Not Applicable
		# Scenario for APT-2887:
		# And Scenario for APT-3032:
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user puts "" in the search itinerary departure date from field
		And user puts "" in the search itinerary departure date to field
		Then user sees the find button for the recommended itinerary table is disabled
		And user sees the recommended itinerary search include package specific rule checkbox is toggled by default
		# Scenario 1: Search by Tour Code Alone
		# And Scenario for APT-2794:
		Given user is on "Recommended Itinerary" page
		When user ticks the "IS18" option of the search itinerary tour code dropdown
		And user ticks the "Select All" option of the search itinerary customer market dropdown
		And user puts "01 Jan 1990" in the search itinerary departure date from field
		And user puts "31 Dec 2050" in the search itinerary departure date to field
		And user searches for a recommended itinerary with the given search filters
		And user puts "IS18" in the tour code column filter to filter the recommended itinerary result
		Then user sees the recommended itinerary search results with the specific tour codes "IS18"
		# Scenario 2: Search by Customer Market Alone
		Given user is on "Recommended Itinerary" page
		When user removes the column filters of the recommended itinerary result
		And user ticks the "Select All" option of the search itinerary tour code dropdown
		And user ticks the "Select All" option of the search itinerary customer market dropdown
		And user ticks the "New Zealand Domestic" option of the search itinerary customer market dropdown
		And user searches for a recommended itinerary with the given search filters
		And user puts "New Zealand Domestic" in the customer market column filter to filter the recommended itinerary result
		Then user sees the recommended itinerary search results with the specific customer markets "New Zealand Domestic"
		# Scenario 3: Search by Tour Code/Customer Market Combination
		# And Scenario 7: Filter Search Result
		Given user is on "Recommended Itinerary" page
		When user removes the column filters of the recommended itinerary result
		And user ticks the "Select All" option of the search itinerary tour code dropdown
		And user ticks the "IS18" option of the search itinerary tour code dropdown
		And user searches for a recommended itinerary with the given search filters
		And user puts "IS18, VEM08" in the tour code column filter to filter the recommended itinerary result
		And user puts "New Zealand Domestic" in the customer market column filter to filter the recommended itinerary result
		Then user sees the recommended itinerary search results with the specific tour codes "IS18, VEM08" and specific customer markets "New Zealand Domestic"
		# Scenario 4: Reset Button Functionality
		Given user is on "Recommended Itinerary" page
		When user resets the recommended itinerary search results
		Then user sees the recommended itinerary table was reverted to original display
		When user removes the column filters of the recommended itinerary result
		And user ticks the "Select All" option of the search itinerary tour code dropdown
		And user ticks the "Select All" option of the search itinerary customer market dropdown
		And user ticks the search itinerary inactive checkbox
		And user puts "01 Jan 1990" in the search itinerary departure date from field
		And user puts "31 Dec 2050" in the search itinerary departure date to field
		And user searches for a recommended itinerary with the given search filters
		And user enters "Inactive" in the status column filter for recommended itinerary
		Then user sees the recommended itinerary search results that is inactive and that has package specific rule
		# Scenario 5: Display Search Result - Pagination
		Given user is on "Recommended Itinerary" page
		Then user sees the recommended itinerary table shows "20" rows

	@Regression
	Scenario: APT-2242: 01. As a Flight Admin User I want to Create Flight Itineraries for Packages So that all related bookings can have Flight Details.
		# Additional Scenario: APT-2819: Recommended Itinerary - Add Itinerary button for consistency should be Add New Itinerary
		# Scenario 1: Add Recommended Itinerary Button Functionality From Landing Page
		# And Scenario for APT-2819:
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user decides to create a new itinerary
		Then user is on "Add Recommended Itinerary" page
		# Scenario 2: Tour Code Field Functionality - Multi-Select Field
		Given user is on "Add Recommended Itinerary" page
		When user ticks the "IS18" option of the itinerary tour code dropdown
		And user ticks the "VEM08" option of the itinerary tour code dropdown
		Then user sees the itinerary tour code dropdown contains "IS18, VEM08"
		# Scenario 3: Itinerary Name Field Functionality - Input Field
		Given user is on "Add Recommended Itinerary" page
		Then user sees the itinerary name field
		# Scenario 4: Customer Market Field Functionality - Multi-Select Field
		Given user is on "Add Recommended Itinerary" page
		When user ticks the "Australia Domestic" option of the itinerary customer market dropdown
		And user ticks the "New Zealand Domestic" option of the itinerary customer market dropdown
		Then user sees the itinerary customer market dropdown contains "Australia Domestic, New Zealand Domestic"
		And user sees the itinerary inactive checkbox
		And user sees the itinerary use package specific rule checkbox
		# Scenario 5: Enable Inbound/Outbound Accordion
		# And Scenario 9:
		# And Scenario 10:
		# And Scenario 11: Add Recommended Itinerary button Visibility From Add Recommended Itinerary Page
		# And Scenario 14: Remove Icon Visibility From Add Recommended Itinerary Page
		Given user is on "Add Recommended Itinerary" page
		When user puts "Test" in the itinerary name field
		Then user sees the itinerary inbound and outbound accordion fields enabled
		When user ticks the "AUH -" option of the itinerary outbound top flying from dropdown
		Then user sees the itinerary outbound top flying from dropdown contains "Abu Dhabi"
		When user ticks the "SAT -" option of the itinerary outbound top flying to dropdown
		Then user sees the itinerary outbound top flying to dropdown contains "San Antonio"
		When user puts "1" in the itinerary outbound top package day indicator field
		And user adds the outbound flight to the itinerary
		Then user sees another form for a new outbound flight
		When user deletes the recently added outbound flight from the itinerary
		Then user does not see the new outbound flight
		When user ticks the "AMS -" option of the itinerary inbound top flying from dropdown
		Then user sees the itinerary inbound top flying from dropdown contains "Amsterdam"
		When user ticks the "DXB -" option of the itinerary inbound top flying to dropdown
		Then user sees the itinerary inbound top flying to dropdown contains "Dubai"
		When user puts "2" in the itinerary inbound top package day indicator field
		And user adds the inbound flight to the itinerary
		Then user sees another form for a new inbound flight
		When user deletes the recently added inbound flight from the itinerary
		Then user does not see the new inbound flight
		# Scenario 16: Last Inbound Flying To Validation - Disable Add Flight Button
		Given user is on "Add Recommended Itinerary" page
		When user ticks the "AUH -" option of the itinerary inbound top flying from dropdown
		And user ticks the "ZVJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "SHJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "XNB" option of the itinerary inbound top flying to dropdown
		And user puts "5" in the itinerary inbound top package day indicator field
		#		And user adds the inbound flight to the itinerary
		Then user sees the add inbound flight button is disabled
		# Scenario 17: Last Inbound Flying To Validation- Enable Add Flight Button
		Given user is on "Add Recommended Itinerary" page
		When user ticks the "ZVJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "SHJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "XNB" option of the itinerary inbound top flying to dropdown
		Then user sees the add inbound flight button is enabled
		# Scenario 6: Internal Itinerary Accordion
		Given user is on "Add Recommended Itinerary" page
		When user ticks the "MNL -" option of the itinerary internal top flying from dropdown
		Then user sees the itinerary internal top flying from dropdown contains "Manila"
		When user ticks the "MEL -" option of the itinerary internal top flying to dropdown
		Then user sees the itinerary internal top flying to dropdown contains "Melbourne"
		When user puts "3" in the itinerary internal top package day indicator field
		And user adds the internal flight to the itinerary
		Then user sees another form for a new internal flight
		When user deletes the recently added internal flight from the itinerary
		Then user does not see the new internal flight
		# Scenario 7: Visibility of Outbound Icon
		Given user is on "Add Recommended Itinerary" page
		Then user sees the itinerary outbound flight icon
		# Scenario 8: Visibility of Inbound Icon
		Given user is on "Add Recommended Itinerary" page
		Then user sees the itinerary inbound flight icon
		# Scenario 12: Internal Comment Functionality
		Given user is on "Add Recommended Itinerary" page
		When user puts "Test Internal" in the itinerary comments internal field
		Then user sees the itinerary comments internal field contains "Test Internal"
		# Scenario 13: External Comment Functionality
		Given user is on "Add Recommended Itinerary" page
		When user puts "Test External" in the itinerary comments external field
		Then user sees the itinerary comments external field contains "Test External"
		# Scenario 15: Date Ranges
		Given user is on "Add Recommended Itinerary" page
		Then user sees the itinerary date ranges departure date from and to textboxes enabled

	@Regression
	Scenario: APT-2293: 05. As a Flight Admin User, I want to Copy Flight Itineraries For Packages So I can use details of existing Itineraries to create a new one.
		# Scenario 1: Display Page Title
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user ticks the "IS18" option of the search itinerary tour code dropdown
		And user ticks the "New Zealand Domestic" option of the search itinerary customer market dropdown
		And user puts "01 Jan 1990" in the search itinerary departure date from field
		And user searches for a recommended itinerary with the given search filters
		And user puts "IS18, VEM08" in the tour code column filter to filter the recommended itinerary result
		And user copies the recommended itinerary
		Then user sees the copy recommended itinerary title on the top left corner of the page
		# Scenario 2: Edit Tour Code Field
		# And Scenario 3: Edit Itinerary Name Field
		# And Scenario 4: Edit Customer Market Field
		# And Scenario 5: Edit Use Package Specific Rule/Inactive Checkbox
		Given user is on "Copy Recommended Itinerary" page
		Then user sees recommended itinerary details fields enabled
		# Scenario 6: Copy Internal Itinerary
		# And Scenario 7: Modify Itinerary Details
		# And Scenario 8: Add/Remove multiple destination
		# And Scenario 9: Modify Package Day Indicator
		# And Scenario 13: Last Inbound Flying To Validation - Disable Add Flight Button
		# And Scenario 14: Last Inbound Flying To Validation- Enable Add Flight Button
		Given user is on "Copy Recommended Itinerary" page
		Then user sees the itinerary inbound and outbound accordion fields enabled
		When user ticks the "AUH -" option of the itinerary outbound top flying from dropdown
		Then user sees the itinerary outbound top flying from dropdown contains "Abu Dhabi"
		When user ticks the "SAT -" option of the itinerary outbound top flying to dropdown
		Then user sees the itinerary outbound top flying to dropdown contains "San Antonio"
		When user puts "1" in the itinerary outbound top package day indicator field
		And user adds the outbound flight to the itinerary
		Then user sees another form for a new outbound flight
		When user deletes the recently added outbound flight from the itinerary
		Then user does not see the new outbound flight
		When user ticks the "AMS -" option of the itinerary inbound top flying from dropdown
		Then user sees the itinerary inbound top flying from dropdown contains "Amsterdam"
		When user ticks the "DXB -" option of the itinerary inbound top flying to dropdown
		Then user sees the itinerary inbound top flying to dropdown contains "Dubai"
		When user puts "2" in the itinerary inbound top package day indicator field
		And user adds the inbound flight to the itinerary
		Then user sees another form for a new inbound flight
		When user deletes the recently added inbound flight from the itinerary
		Then user does not see the new inbound flight
		When user ticks the "AUH -" option of the itinerary inbound top flying from dropdown
		And user ticks the "ZVJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "SHJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "XNB" option of the itinerary inbound top flying to dropdown
		And user puts "5" in the itinerary inbound top package day indicator field
		#		And user adds the inbound flight to the itinerary
		Then user sees the add inbound flight button is disabled
		When user ticks the "ZVJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "SHJ" option of the itinerary inbound top flying to dropdown
		And user ticks the "XNB" option of the itinerary inbound top flying to dropdown
		Then user sees the add inbound flight button is enabled
		When user ticks the "MNL -" option of the itinerary internal top flying from dropdown
		Then user sees the itinerary internal top flying from dropdown contains "Manila"
		When user ticks the "MEL -" option of the itinerary internal top flying to dropdown
		Then user sees the itinerary internal top flying to dropdown contains "Melbourne"
		When user puts "3" in the itinerary internal top package day indicator field
		And user adds the internal flight to the itinerary
		Then user sees another form for a new internal flight
		When user deletes the recently added internal flight from the itinerary
		Then user does not see the new internal flight
		# Scenario 10: Modify Internal Comment
		# And Scenario 11: Modify External Comment
		Given user is on "Copy Recommended Itinerary" page
		Then user sees recommended itinerary details comments section fields enabled
		# Scenario 12: Modify Date Range
		Given user is on "Copy Recommended Itinerary" page
		Then user sees the itinerary date ranges departure date from and to textboxes enabled

	@Regression
	Scenario: APT-2296: 07. As a Flight Admin User, I want to Close/Save Flight Itineraries Page So I can maintain integrity of Recommended itineraries
		# Additional Scenario: APT-2295: 06.  Delete Flight Itineraries - Add Screen
		# Additional Scenario: APT-2734: Update the Message wording on deleting Itinerary on Landing Page
		# Additional Scenario: APT-2800: Update the Message wording on deleting Itinerary on Landing Page
		# Scenario 1: Close Itinerary From Add Recommended Itinerary Page
		# And Scenario 3: Close Itinerary From Copy Recommended Itinerary Page
		# And Scenario 5: Close Itinerary From Edit Itinerary Page
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user decides to create a new itinerary
		And user ticks the "BTBAL13" option of the itinerary tour code dropdown
		And user closes the recommended itinerary details
		And user disregards the closing of recommended itinerary details
		Then user is on "Add Recommended Itinerary" page
		When user closes the recommended itinerary details
		And user confirms the closing of recommended itinerary details
		Then user is on "Recommended Itinerary" page
		# Scenario 2: Save Itinerary From Create Itinerary Page
		# And Scenario 4: Save Itinerary From Copy Recommended Itinerary Page
		# And Scenario 6: Save Itinerary From Edit Itinerary Page
		# And Scenario for APT-2295:
		Given user is on "Recommended Itinerary" page
		When user decides to create a new itinerary
		And user ticks the "BTBAL13" option of the itinerary tour code dropdown
		And user ticks the "NOBCTK14" option of the itinerary tour code dropdown
		And user ticks the "Asia" option of the itinerary customer market dropdown
		And user puts "Test" in the itinerary name field
		And user puts "01 Jan 2087" in the itinerary date ranges departure date from field
		And user puts "31 Dec 2088" in the itinerary date ranges departure date to field
		#		And user adds the new date range to the itinerary
		And user saves the recommended itinerary details
		Then user sees feedback message Recommended Itinerary "has been successfully saved"
		When user decides to delete the recommended itinerary
		And user disregards the deletion of the recommended itinerary
		Then user sees the recommended itinerary search results with the specific tour codes "BTBAL13, NOBCTK14"
		When user decides to delete the recommended itinerary
		And user confirms the deletion of the recommended itinerary
		Then user sees feedback message Recommended Itinerary "deleted successfully"

	@Regression
	Scenario: APT-2297: 1b. Recommended Itinerary Save-Input Validation Rules - Create Screen
		# Feedback message commented out as it loads very slow
		# Additional Scenario: APT-2481: 5a. Recommended Itinerary Save-Input Validation Rules - Copy Screen
		# Additional Scenario: APT-2482: 4a. Recommended Itinerary Save-Input Validation Rules - Edit Screen
		# Additional Scenario: APT-2559: Overlapping dates validation when adding/editing itinerary
		# Additional Scenario: APT-2610: 9.0 Recommended Itinerary Drop-down Validation
		# Additional Scenario: APT-2777: Itineraries cannot be saved with duplicate Tour Code/Customer Market values except ALL is selected
		# Additional Scenario: APT-2900: Improvement - Recommended Itinerary Accordion/Date Order
		# Additional Scenario: APT-2905: Improvement: Add/Edit/Copy Recommend Itin - Save allowed when Dates left as DD MMM YYYY
		# Scenario 1:
		# And Scenario for APT-2587:
		# And Scenario for APT-2588:
		# And Scenario for APT-2591:
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user decides to create a new itinerary
		And user saves the recommended itinerary details
		#		Then user sees feedback message "Itinerary cannot be saved. Please review the error message(s)."
		Then user sees error message "This is a mandatory field."
		# Scenario 2:
		# And Scenario for APT-2777:
		# And Scenario for APT-2777:
		# And Scenario for APT-2905:
		Given user is on "Add Recommended Itinerary" page
		When user ticks the "IS18" option of the itinerary tour code dropdown
		And user ticks the "VEM08" option of the itinerary tour code dropdown
		And user ticks the "New Zealand Domestic" option of the itinerary customer market dropdown
		And user puts "Test" in the itinerary name field
		And user saves the recommended itinerary details
		#		Then user sees feedback message Itinerary "and this Date Range or overlapping Date Range, already exists"
		Then user sees error message "Overlapping Dates"
		When user puts "" in the itinerary date ranges departure date from field
		And user puts "" in the itinerary date ranges departure date to field
		When user saves the recommended itinerary details
		#		Then user sees feedback message "Itinerary cannot be saved. Please review the error message(s)."
		Then user sees error message "This is a mandatory field."
		And user does not see the error message "Overlapping Dates"
		# Scenario 3:
		# And Scenario for APT-2610:
		Given user is on "Add Recommended Itinerary" page
		When user ticks the "AUH -" option of the itinerary outbound top flying from dropdown
		And user ticks the "SAT -" option of the itinerary outbound top flying to dropdown
		And user puts "1" in the itinerary outbound top package day indicator field
		And user adds the outbound flight to the itinerary
		And user ticks the "AUH -" option of the itinerary outbound second flying from dropdown
		And user ticks the "SAT -" option of the itinerary outbound second flying to dropdown
		And user puts "1" in the itinerary outbound second package day indicator field
		And user adds the outbound flight to the itinerary
		Then user sees error message "Duplicate Itinerary details"
		When user deletes the recently added outbound flight from the itinerary
		Then user does not see the error message "Duplicate Itinerary details"
		And user does not see the itinerary outbound delete flight button for the last row remaining
		When user ticks the "SHJ -" option of the itinerary internal top flying from dropdown
		And user ticks the "XNB -" option of the itinerary internal top flying to dropdown
		And user puts "3" in the itinerary internal top package day indicator field
		And user adds the internal flight to the itinerary
		And user ticks the "SHJ -" option of the itinerary internal second flying from dropdown
		And user ticks the "XNB -" option of the itinerary internal second flying to dropdown
		And user puts "3" in the itinerary internal second package day indicator field
		And user adds the internal flight to the itinerary
		Then user sees error message "Duplicate Itinerary details"
		When user deletes the recently added internal flight from the itinerary
		Then user does not see the error message "Duplicate Itinerary details"
		And user does not see the itinerary internal delete flight button for the last row remaining
		When user ticks the "ZVJ -" option of the itinerary inbound top flying from dropdown
		And user ticks the "EZE -" option of the itinerary inbound top flying to dropdown
		And user puts "2" in the itinerary inbound top package day indicator field
		And user adds the inbound flight to the itinerary
		And user ticks the "ZVJ -" option of the itinerary inbound second flying from dropdown
		And user ticks the "EZE -" option of the itinerary inbound second flying to dropdown
		And user puts "2" in the itinerary inbound second package day indicator field
		And user adds the inbound flight to the itinerary
		Then user sees error message "Duplicate Itinerary details"
		When user deletes the recently added inbound flight from the itinerary
		Then user does not see the error message "Duplicate Itinerary details"
		And user does not see the itinerary inbound delete flight button for the last row remaining

	@Regression
	Scenario: APT-2315: 02. As a Flight Admin User I want to Display Air Cost/Price Rules So I Can Manage Costing/Pricing For Airlines/Customer Market Combinations
		# Scenario 6: Sort Result in Tabular Section - Not Applicable
		# Scenario 1: Navigating to Markup Rule Landing Page
		Given user opens browser
		When user logs into app
		And user navigates to mark up rule page
		Then user is on "Air Markup Rule" page
		# Scenario 2: Visibility Of Page Title
		Given user is on "Air Markup Rule" page
		Then user sees the markup rule title on the top left corner of the page
		# Scenario 3: Visibility of Page Header Section
		Given user is on "Air Markup Rule" page
		Then user sees the markup rule fields and buttons
		# Scenario 4: Visibility of Page Tabular Section
		# And Scenario 5: Filter Result in Tabular Section
		# And Scenario 7: Visibility of Copy Icon
		Given user is on "Air Markup Rule" page
		Then user sees the markup rule page table and its contents

	@Regression
	Scenario: APT-2316: 01. As a Flight Admin User I want to Create Air Costing Rules So I Can Add new Costing Combinations for a given Airline/Destination Combination
		# Additional Scenario: APT-2430: 01a. As a Flight Admin User I want to Create Air Pricing Rules So I Can Add new Pricing Combinations for a given Airline
		# Scenario 1: Navigating to Add Markup Rule Page
		Given user opens browser
		When user logs into app
		And user navigates to mark up rule page
		And user decides to create a new markup rule
		Then user is on "Add Markup Rule" page
		# Scenario 2: Visibility Of Page Title
		Given user is on "Add Markup Rule" page
		Then user sees the add markup rule title on the top left corner of the page
		# Scenario 3: Functionality of Page Header Section
		Given user is on "Add Markup Rule" page
		When user ticks the "8P" option of the markup rule airline dropdown
		And user ticks the "D8" option of the markup rule airline dropdown
		Then user sees the markup rule airline dropdown contains "8P - Pacific Coastal Airlines, D8 - Norwegian Air International"
		When user ticks the "Australia" option of the markup rule tour destination dropdown
		And user ticks the "New Zealand" option of the markup rule tour destination dropdown
		Then user sees the markup rule tour destination dropdown contains "Australia, New Zealand"
		When user ticks the "Australia Domestic" option of the markup rule customer market dropdown
		And user ticks the "New Zealand Domestic" option of the markup rule customer market dropdown
		Then user sees the markup rule customer market dropdown contains "Australia Domestic, New Zealand Domestic"
		When user selects the "Sabre" option of the markup rule source dropdown
		Then user sees the markup rule source dropdown contains "Sabre"
		And user sees the markup rule inactive checkbox enabled
		# Scenario 4: Cost Setting functionalities
		Given user is on "Add Markup Rule" page
		When user adds a cost setting to the markup rule
		Then user sees the markup rule cost setting section
		And user sees the markup rule price setting section
		And user sees the markup rule cost setting cabin class dropdown contains "All Selected"
		And user sees the markup rule cost setting fare type dropdown and its options
		And user sees the markup rule cost setting itinerary type dropdown and its options
		And user sees the markup rule cost setting fare basic code field
		When user puts "ABC12" in the markup rule cost setting fare basic code field
		Then user sees the markup rule cost setting markup style dropdown and its options
		And user sees the markup rule cost setting markup type dropdown and its options
		When user puts "50" in the markup rule cost setting % value field
		And user puts "123456789" in the markup rule cost setting amount value field
		Then user sees the markup rule cost setting apply on dropdown and its options
		# Scenario 5: Date Ranges
		Given user is on "Add Markup Rule" page
		Then user sees the markup rule cost setting travel date from field
		And user sees the markup rule cost setting travel date to field
		# Scenario 6: Add Cost Markup
		Given user is on "Add Markup Rule" page
		Then user sees the markup rule add cost setting button
		When user adds a cost setting to the markup rule
		Then user sees another form for a new cost setting
		# Scenario 7: Visibility of Close Button
		Given user is on "Add Markup Rule" page
		Then user sees the markup rule close button
		# Scenario 8: Visibility of Save Markup Button
		Given user is on "Add Markup Rule" page
		Then user sees the markup rule save button
		# Scenario for APT-2430:
		Given user is on "Add Markup Rule" page
		When user adds a price setting to the markup rule
		Then user sees the markup rule price setting cabin class dropdown contains "All Selected"
		And user sees the markup rule price setting fare type dropdown and its options
		And user sees the markup rule price setting itinerary type dropdown and its options
		And user sees the markup rule price setting fare basic code field
		When user puts "ABC12" in the markup rule price setting fare basic code field
		Then user sees the markup rule price setting markup style dropdown and its options
		And user sees the markup rule price setting markup type dropdown and its options
		When user puts "50" in the markup rule price setting % value field
		And user puts "123456789" in the markup rule price setting amount value field
		Then user sees the markup rule price setting apply on dropdown and its options
		And user sees the markup rule price setting travel date from field
		And user sees the markup rule price setting travel date to field
		And user sees the markup rule add price setting button
		When user adds a price setting to the markup rule
		Then user sees another form for a new price setting

	@Regression
	Scenario: APT-2324: 03. As a Flight Admin User I want to Modify Air Cost Rules So I Can Manage Existings Costing Combinations for a given Airline
		# Additional Scenario: APT-2431: 03b. As a Flight Admin User I want to Modify Air Price Rules So I Can Manage Existings Pricing Combinations for a given Airline
		# Scenario 1: Navigating to Update Markup Rule Page
		Given user opens browser
		When user logs into app
		And user navigates to mark up rule page
		And user updates the markup rule
		Then user is on "Update Markup Rule" page
		# Scenario 2: Visibility Of Page Title
		Given user is on "Update Markup Rule" page
		Then user sees the update markup rule title on the top left corner of the page
		# Scenario 3: Functionality of Page Header Section
		Given user is on "Update Markup Rule" page
		Then user sees markup rule details fields enabled
		# Scenario 4: Cost Setting Fields
		# And Scenario 5: Modify Date Range Functionality(From Travel Date/To Travel Date)
		# And Scenario for APT-2431:
		Given user is on "Update Markup Rule" page
		When user adds a cost setting to the markup rule
		Then user sees the markup rule details cost setting fields enabled
		When user adds a price setting to the markup rule
		Then user sees the markup rule details price setting fields enabled

	@Regression
	Scenario: APT-2330: 04. As a Flight Admin User I want to Copy Air Cost/Price Markup Rules So I Can Create New Rules from Existings Costing/Pricing Combinations for a given Airline
		# Scenario 1: Navigating to Update Markup Rule Page
		Given user opens browser
		When user logs into app
		And user navigates to mark up rule page
		And user copies the markup rule
		Then user is on "Copy Markup Rule" page
		# Scenario 2: Visibility Of Page Title
		Given user is on "Copy Markup Rule" page
		Then user sees the copy markup rule title on the top left corner of the page
		# Scenario 3: Functionality of Page Header Section
		Given user is on "Copy Markup Rule" page
		Then user sees markup rule details fields enabled
		# Scenario 4: Cost Setting Fields
		# And Scenario 5: Modify Date Range Functionality(From Travel Date/To Travel Date)
		Given user is on "Copy Markup Rule" page
		When user adds a cost setting to the markup rule
		Then user sees the markup rule details cost setting fields enabled
		When user adds a price setting to the markup rule
		Then user sees the markup rule details price setting fields enabled

	@Regression
	Scenario: APT-2338: 05. As a Flight Admin User I want to Add Air Cost/Price Markup Rule Details So I Can Manage Existings Costing/Pricing Combinations for a given Airline
		# Scenario 1: Visibility of Add Icon
		# And Scenario 2: Functionality of Add button in COST SETTING Section (Add Page)
		Given user opens browser
		When user logs into app
		And user navigates to mark up rule page
		And user decides to create a new markup rule
		And user ticks the "8P" option of the markup rule airline dropdown
		And user ticks the "New Zealand" option of the markup rule tour destination dropdown
		And user ticks the "New Zealand Domestic" option of the markup rule customer market dropdown
		Then user sees the markup rule add cost setting button
		And user sees the markup rule add price setting button
		When user adds a cost setting to the markup rule
		Then user sees the markup rule details cost setting fields enabled
		When user adds a price setting to the markup rule
		Then user sees the markup rule details price setting fields enabled
		When user closes the markup rule details
		And user confirms the closing of markup rule details
		And user copies the markup rule
		Then user sees the markup rule add cost setting button
		And user sees the markup rule add price setting button
		When user adds a cost setting to the markup rule
		Then user sees the markup rule details cost setting fields enabled
		When user adds a price setting to the markup rule
		Then user sees the markup rule details price setting fields enabled
		When user closes the markup rule details
		And user confirms the closing of markup rule details
		And user updates the markup rule
		Then user sees the markup rule add cost setting button
		And user sees the markup rule add price setting button
		When user adds a cost setting to the markup rule
		Then user sees the markup rule details cost setting fields enabled
		When user adds a price setting to the markup rule
		Then user sees the markup rule details price setting fields enabled

	@Regression
	Scenario: APT-2401: 2.0 AS a Flight Desk Administrator I want to Display Queue Place Settings So I can Prioritise Flights Based On Flight Actions
		# Additional Scenario: APT-2407: 3.0 As a Flight Desk Administrator I want to View and Filter the Stored Queue Rules on the Home Page
		# Additional Scenario: APT-2862: Pagination options to be enabled for Queue Place settings landing page on page load
		# Scenario 5: Sort Result in Tabular Section - Not Applicable
		# Scenario 1: Navigation Menu - Attached to APT-2621
		# Scenario 2: Page Title – Queue Place Setting
		Given user opens browser
		When user logs into app
		And user navigates to queue place setting page
		Then user is on "Queue Place Setting" page
		# Scenario 3: Pagination - Visibility of Page Tabular Section
		# And Scenario for APT-2862:
		Given user is on "Queue Place Setting" page
		Then user sees the queue place settings table and its contents
		And user sees the queue place settings table shows "20" rows
		And user sees the queue place settings table pagination buttons are enabled
		# Scenario 4: Filter Result in Tabular Section
		Given user is on "Queue Place Setting" page
		Then user sees the queue place settings table filters
		# Scenario for APT-2407:
		Given user is on "Queue Place Setting" page
		Then user sees the search queue place setting exclude inactive rules checkbox
		When user ticks the search queue place setting exclude inactive rules checkbox
		And user puts "Inactive" in the status column filter to filter the queue place setting results
		Then user sees the queue place setting search results with the specific status "Inactive"

	@Regression
	Scenario: APT-2402: 1.0 AS a Flight Desk Administrator I want to Create Queue Place Settings So I can New Queue Rules for To existing Ones
		# Additional Scenario: APT-2711: Improvement - GDS Queue Number Character Length
		# Scenario 1: Navigating to Create Queue Place Rule Page
		Given user opens browser
		When user logs into app
		And user navigates to queue place setting page
		And user decides to create a new queue place rule
		Then user is on "Add Queue Place Rule" page
		# Scenario 2: Visibility Of Page Title
		Given user is on "Add Queue Place Rule" page
		Then user sees the add queue place rule title on the top left corner of the page
		# Scenario 3: Functionality
		Given user is on "Add Queue Place Rule" page
		When user ticks the "Australia Domestic" option of the queue place rule customer market dropdown
		And user ticks the "New Zealand Domestic" option of the queue place rule customer market dropdown
		Then user sees the queue place rule customer market dropdown contains "Australia Domestic, New Zealand Domestic"
		When user ticks the "Direct Customer" option of the queue place rule customer type dropdown
		And user ticks the "Internal Staff" option of the queue place rule customer type dropdown
		Then user sees the queue place rule customer type dropdown contains "Direct Customer, Internal Staff"
		When user puts "Test1234" in the queue place rule name field
		And user ticks the "Ready to Ticket" option of the queue place rule flight action dropdown
		And user ticks the "PNR Creation" option of the queue place rule flight action dropdown
		Then user sees the queue place rule flight action dropdown contains "PNR Creation"
		And user sees the queue place rule inactive checkbox
		# Scenario 4: Queue Details functionalities
		# And Scenario for APT-2711:
		Given user is on "Add Queue Place Rule" page
		Then user sees the queue place rule details queue details fields enabled
		And user sees the queue place rule details flight type dropdown and its options
		When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/1234" in the queue place rule details gds queue number field
		Then user sees that the queue place rule details gds queue number field contains "1234"
		# Scenario 5: Visibility of Close Button
		Given user is on "Add Queue Place Rule" page
		Then user sees the queue place rule close button
		# Scenario 6: Visibility of Save Queue Place Rule Button
		Given user is on "Add Queue Place Rule" page
		Then user sees the queue place rule save queue place rule button

	@Regression
	Scenario: APT-2405: 07. As a Flight Admin User I want to Search for Air Cost/Price Rules So I Can Find Costing/Pricing For Airlines/Market Combinations
		# Additional Scenario: APT-3031: When searching for an Inactive mark up rule by ticking the check box, both inactive and active should display
		# Scenario 1: Search by Airline Alone
		# Scenario 2: Search by Tour Destination Alone
		# Scenario 3: Search by Customer Market Alone
		# Scenario 4: Search by Customer Market Alone
		# Scenario 5: Search by Cabin Class Alone
		# Scenario 6: Search by Fare Type Alone
		# Scenario 7: Search by Itinerary Type Alone
		# Scenario 8: Search by Fare Basis Code Alone
		# Scenario 9: Search by Combination
		# And Scenario 11: Display Search Result
		# And Scenario 13: Filter Search Result
		Given user opens browser
		When user logs into app
		And user navigates to mark up rule page
		And user ticks the "8P" option of the search markup rule airline dropdown
		And user ticks the "New Zealand" option of the search markup rule tour destination dropdown
		And user ticks the "New Zealand Domestic" option of the search markup rule customer market dropdown
		And user ticks the "Select All" option of the search markup rule cabin class dropdown
		And user ticks the "Select All" option of the search markup rule fare type dropdown
		And user ticks the "Select All" option of the search markup rule itinerary type dropdown
		And user searches for a markup rule with the given search filters
		And user puts "8P, D8" in the airline column filter to filter the markup rule results
		Then user sees the markup rule search results with the specific airlines "8P, D8"
		# Scenario 10: Reset Button Functionality
		Given user is on "Air Markup Rule" page
		When user resets the markup rule search results
		Then user sees the markup rule table was reverted to original display
		# Scenario for APT-3031:
		Given user is on "Air Markup Rule" page
		When user ticks the inactive checkbox of the search markup rule
		And user searches for a markup rule with the given search filters
		Then user sees the markup rule search results includes inactive markup rules

	@Regression
	Scenario: APT-2427: 1c. Air Cost/Price Save-Input Validation Rules - Create
		# Additional Scenario: APT-2450: 4b. Air Cost/Price Save-Input Validation Rules - Copy
		# Additional Scenario: APT-2451: 3c. Air Cost/Price Save-Input Validation Rules - Modify
		# Additional Scenario: APT-2680: Behaviour of Markup Rule Cost+Price sections for Add/Edit/Copy
		# Scenario 1: Save Validation From Add Markup Rule Page
		Given user opens browser
		When user logs into app
		And user navigates to mark up rule page
		And user decides to create a new markup rule
		And user saves the markup rule details
		Then user sees feedback message "Markup Rule cannot be saved. Please review the error message(s)."
		And user sees error message "This is a mandatory field."
		# Scenario 2: Cost/Price Section Validation
		Given user is on "Add Markup Rule" page
		When user ticks the "8P" option of the markup rule airline dropdown
		And user ticks the "New Zealand" option of the markup rule tour destination dropdown
		And user ticks the "New Zealand Domestic" option of the markup rule customer market dropdown
		And user adds a cost setting to the markup rule
		And user ticks the "Select All" option of the markup rule cost setting cabin class dropdown
		And user ticks the "Both" option of the markup rule cost setting markup type dropdown
		And user adds a price setting to the markup rule
		And user ticks the "Select All" option of the markup rule price setting cabin class dropdown
		And user ticks the "Both" option of the markup rule price setting markup type dropdown
		And user saves the markup rule details
		Then user sees feedback message "Markup Rule cannot be saved. Please review the error message(s)."
		And user sees error message "This is a mandatory field."
		# Scenario 3: Date Validations
		Given user is on "Add Markup Rule" page
		When user ticks the "Select All" option of the markup rule cost setting cabin class dropdown
		And user ticks the "Select All" option of the markup rule cost setting fare type dropdown
		And user ticks the "Select All" option of the markup rule cost setting itinerary type dropdown
		And user puts "10" in the markup rule cost setting percentage field
		And user puts "12345" in the markup rule cost setting amount field
		And user puts "Test" in the markup rule cost setting fare basis code field
		And user ticks the "Total Fare" option of the markup rule cost setting apply on dropdown
		And user ticks the "Select All" option of the markup rule price setting cabin class dropdown
		And user ticks the "Select All" option of the markup rule price setting fare type dropdown
		And user ticks the "Select All" option of the markup rule price setting itinerary type dropdown
		And user puts "10" in the markup rule price setting percentage field
		And user puts "12345" in the markup rule price setting amount field
		And user puts "Test" in the markup rule price setting fare basis code field
		And user ticks the "Total Fare" option of the markup rule price setting apply on dropdown
		Then user does not see the error message "This is a mandatory field."
		When user puts "01/Jan/2019" in the markup rule cost setting travel date from field
		And user puts "31/Dec/2020" in the markup rule cost setting travel date to field
		And user puts "01/Jan/2019" in the markup rule price setting travel date from field
		And user puts "31/Dec/2020" in the markup rule price setting travel date to field
		And user adds a cost setting to the markup rule
		And user adds a price setting to the markup rule
		And user ticks the "Select All" option of the markup rule cost setting fare type dropdown
		And user ticks the "Select All" option of the markup rule cost setting itinerary type dropdown
		And user ticks the "Both" option of the markup rule cost setting markup type dropdown
		And user puts "10" in the markup rule cost setting percentage field
		And user puts "12345" in the markup rule cost setting amount field
		And user puts "Test" in the markup rule cost setting fare basis code field
		And user ticks the "Total Fare" option of the markup rule cost setting apply on dropdown
		And user puts "01/Jan/2019" in the markup rule cost setting travel date from field
		And user puts "31/Dec/2020" in the markup rule cost setting travel date to field
		And user ticks the "Select All" option of the markup rule price setting fare type dropdown
		And user ticks the "Select All" option of the markup rule price setting itinerary type dropdown
		And user ticks the "Both" option of the markup rule price setting markup type dropdown
		And user puts "10" in the markup rule price setting percentage field
		And user puts "12345" in the markup rule price setting amount field
		And user puts "Test" in the markup rule price setting fare basis code field
		And user ticks the "Total Fare" option of the markup rule price setting apply on dropdown
		And user puts "01/Jan/2019" in the markup rule price setting travel date from field
		And user puts "31/Dec/2020" in the markup rule price setting travel date to field
		And user adds a cost setting to the markup rule
		And user adds a price setting to the markup rule
		Then user sees error message "Overlapping Dates"
		When user puts "01/Jan/2019" in the markup rule cost setting travel date from field
		And user puts "31/Dec/2018" in the markup rule cost setting travel date to field
		Then user sees error message "Start Date cannot be greater than End Date."
		When user puts "31/Dec/2020" in the markup rule cost setting travel date to field
		Then user does not see the error message "Start Date cannot be greater than End Date."
		When user puts "01/Jan/2019" in the markup rule price setting travel date from field
		And user puts "31/Dec/2018" in the markup rule price setting travel date to field
		Then user sees error message "Start Date cannot be greater than End Date."
		When user puts "31/Dec/2020" in the markup rule price setting travel date to field
		Then user does not see the error message "Start Date cannot be greater than End Date."
		# Scenario 4: Duplicate Details
		Given user is on "Add Markup Rule" page
		When user saves the markup rule details
		Then user sees error message "Markup Rule Already Exist"

	@Regression
	Scenario: APT-2437: 4.0 AS a Flight Desk Administrator I want to Modify Queue Place Settings So I can Manage Existing Queue Place Details
		# Scenario 1: Navigating to Edit Queue Place Setting Page
		Given user opens browser
		When user logs into app
		And user navigates to queue place setting page
		And user edits the queue place rule
		Then user sees the edit queue place rule title on the top left corner of the page
		# Scenario 2: Modify Customer Market Field
		# And Scenario 3: Modify CustomerType Field
		# And Scenario 4: Modify Queue Name Field
		# And Scenario 5: Modify Flight Action Field
		# And Scenario 6: Modify Inactive check box
		# And Scenario 7: Modify Queue Details Section
		# And Scenario 8: Modify GDS Queue Number Field
		Given user is on "Update Queue Place Rule" page
		Then user sees the queue place rule details fields enabled
		And user sees the queue place rule details queue details fields enabled

	@Regression
	Scenario: APT-2438: 5.0 As a Flight Desk Administrator I want to Copy Queue Place Setting Rule So I can create new rules from Existing Details
		# Scenario 1: Navigating to Copy Queue Place Setting Page
		Given user opens browser
		When user logs into app
		And user navigates to queue place setting page
		And user copies the queue place rule
		Then user sees the copy queue place rule title on the top left corner of the page
		# Scenario 2: Modify Customer Market Field
		# And Scenario 3: Modify CustomerType Field
		# And Scenario 4: Modify Queue Name Field
		# And Scenario 5: Modify Flight Action Field
		# And Scenario 6: Modify Inactive check box
		# And Scenario 7: Modify Queue Details Section
		# And Scenario 8: Modify GDS Queue Number Field
		Given user is on "Copy Queue Place Rule" page
		Then user sees the queue place rule details fields enabled
		And user sees the queue place rule details queue details fields enabled

	@Regression
	Scenario: APT-2442: 7.0 AS a Flight Desk Administrator I want to Add Information to Queue Place Settings So I can manage New/Existing Queue Rules
		# Scenario 1: Visibility from Create Queue Place Rule Page
		# And Scenario 3: Functionality of Add Queue Details in Queue Detail Sections
		Given user opens browser
		When user logs into app
		And user navigates to queue place setting page
		And user decides to create a new queue place rule
		And user ticks the "Select All" option of the queue place rule customer market dropdown
		And user ticks the "Select All" option of the queue place rule customer type dropdown
		And user puts "Test" in the queue place rule name field
		And user adds a new queue place rule queue detail row
		Then user sees a new queue place rule queue detail row has been added
		# Scenario 2:
		# And Scenario 4:
		Given user is on "Add Queue Place Rule" page
		When user closes the queue place rule details
		And user confirms the closing of queue place rule details
		And user puts "TestAutomationDoNotEdit" in the queue name column filter to filter the queue place setting results
		And user copies the queue place rule
		And user adds a new queue place rule queue detail row
		Then user sees a new queue place rule queue detail row has been added
		When user closes the queue place rule details
		And user confirms the closing of queue place rule details
		And user puts "TestAutomationDoNotEdit" in the queue name column filter to filter the queue place setting results
		And user edits the queue place rule
		And user adds a new queue place rule queue detail row
		Then user sees a new queue place rule queue detail row has been added

	@Regression
	Scenario: APT-2446: 1b. Queue Save/Input Place Validation Rule - Create Screen
		# Additional Scenario: APT-2448: 4b. Queue Save/Input Place Validation Rule - Modify Screen
		# Additional Scenario: APT-2449: 5b. Queue Save/Input Place Validation Rule - Copy Screen
		# Additional Scenario: APT-2916: 5b. Queue Save/Input Place Validation Rule - Copy Screen
		# Scenario 6: Attached to APT-2653
		# Scenario 1:
		# And Scenario 2:
		# And Scenario 3:
		# And Scenario for APT-2916:
		Given user opens browser
		When user logs into app
		And user navigates to queue place setting page
		And user decides to create a new queue place rule
		And user saves the queue place rule details
		Then user sees feedback message "Queue Place Rule cannot be saved. Please review the error message(s)."
		And user sees error message "This is a mandatory field."
		# Scenario 4:
		Given user is on "Add Queue Place Rule" page
		When user ticks the "Australia Domestic" option of the queue place rule customer market dropdown
		And user ticks the "Direct Customer" option of the queue place rule customer type dropdown
		And user puts "TestValidationABC" in the queue place rule name field
		And user saves the queue place rule details
		Then user sees feedback message a that the Queue Place Rule with the combinations given is already existing
		And user sees error message "This is a mandatory field."
		# Scenario 5:
		# And Scenario 7:
		Given user is on "Add Queue Place Rule" page
		When user puts "50" in the queue place rule details gds queue number field
		And user puts "TestAutomationDoNotEdit" in the queue place rule name field
		And user saves the queue place rule details
		Then user sees feedback message "Queue Place Rule cannot be saved. Please review the error message(s)."
		And user sees error message "Queue name already exists."

	@Regression
	Scenario: APT-2457: 2.0 As a Flight Admin User I want to Display Ticketing Time Limits So I Can Keep Track of Flight Schedules
		# Scenario 1: Navigating to TTL Landing Page
		# And Scenario 2: Visibility Of Page Title
		Given user opens browser
		When user logs into app
		And user navigates to ticketing time limit page
		Then user is on "Ticketing Time Limit" page
		# Scenario 3: Visibility of Page Tabular Section - Pagination
		# And Scenario 6: Copy/Edit/Delete Icon Visibility
		Given user is on "Ticketing Time Limit" page
		Then user sees the ticketing time limit table and its contents
		And user sees the ticketing time limit table shows "20" rows
		# Scenario 4: Filter Result in Tabular Section
		Given user is on "Ticketing Time Limit" page
		When user puts "TestAutomation" in the ticketing name column filter to filter the ticketing time limit result
		Then user sees the ticketing time limit search results with the specific ticketing name "TestAutomationDoNotEdit"
		# Scenario 5: Display Sorting - Not Applicable
		# Scenario 7: Exclude Inactive Rule
		Given user is on "Ticketing Time Limit" page
		Then user sees the exclude inactive rules checkbox for the ticketing time limit table

	@Regression
	Scenario: APT-2461: 1.0 As a Flight Admin User I want to Create Ticketing Time Limits So I Can Add New TTL Settings to existing ones
		# Scenario 1: Navigating to Add TTL Page
		# And Scenario 2: Visibility Of Page Title
		Given user opens browser
		When user logs into app
		And user navigates to ticketing time limit page
		And user decides to create a new ticketing time limit
		Then user is on "Add Ticketing Time Limit" page
		And user sees the add ticketing time limit title on the top left corner of the page
		# Scenario 3: Functionality of Page Header Section
		Given user is on "Add Ticketing Time Limit" page
		When user ticks the "Australia Domestic" option of the ticketing time limit customer market dropdown
		And user ticks the "New Zealand Domestic" option of the ticketing time limit customer market dropdown
		Then user sees the ticketing time limit customer market dropdown contains "Australia Domestic, New Zealand Domestic"
		When user puts "Test" in the ticketing time limit ticketing name field
		Then user sees the ticketing time limit ticketing name field contains "Test"
		When user ticks the "Published" option of the ticketing time limit fare type dropdown
		Then user sees the ticketing time limit fare type dropdown contains "Published"
		When user ticks the "8P" option of the ticketing time limit airline dropdown
		And user ticks the "D8" option of the ticketing time limit airline dropdown
		Then user sees the ticketing time limit airline dropdown contains "8P - Pacific Coastal Airlines, D8 - Norwegian Air International"
		When user ticks the "Trade Partner" option of the ticketing time limit customer type dropdown
		Then user sees the ticketing time limit customer type dropdown contains "Trade Partner"
		And user sees the ticketing time limit inactive checkbox enabled
		# Scenario 4: Functionality of TTL Settings Section
		# And Scenario 7: Visibility of Save Ticketing Time Limit Button
		Given user is on "Add Ticketing Time Limit" page
		When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/1" in the ticketing time limit ticketing time settings day range from field
		Then user sees the ticketing time limit ticketing time settings day range from field contains "1"
		When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/2" in the ticketing time limit ticketing time settings day range to field
		Then user sees the ticketing time limit ticketing time settings day range to field contains "2"
		When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/3" in the ticketing time limit ticketing time settings set ttl as booking+ field
		Then user sees the ticketing time limit ticketing time settings set ttl as booking+ field contains "3"
		When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/4" in the ticketing time limit ticketing time settings set ttl as ttl- field
		Then user sees the ticketing time limit ticketing time settings set ttl as ttl- field contains "4"
		When user adds a ticketing time limit setting
		Then user sees the delete button for the recently added ticketing time limit setting
		# Scenario 5: Add Date Range Functionality(Effective Date From/Effective Date To)
		Given user is on "Add Ticketing Time Limit" page
		When user puts "01 Jan 1990" in the ticketing time limit date ranges effective date from field
		And user puts "31 Dec 2050" in the ticketing time limit date ranges effective date to field
		And user adds a ticketing time limit setting date range
		Then user sees the delete button for the recently added ticketing time limit date range
		# Scenario 6: Visibility of Close Button
		Given user is on "Add Ticketing Time Limit" page
		Then user sees the ticketing time limit close button
		# Scenario 8: Visibility of Delete Icon
		Given user is on "Add Ticketing Time Limit" page
		Then user sees the ticketing time limit save button

	@Regression
	Scenario: APT-2462: 3.0 As a Flight Admin User I want to Modify Ticketing Time Limits So I Can manage Existing TTL Settings
		# Scenario 1: Navigating to Edit TTL Page
		# And Scenario 2: Visibility Of Page Title
		Given user opens browser
		When user logs into app
		And user navigates to ticketing time limit page
		And user edits the ticketing time limit
		Then user is on "Update Ticketing Time Limit" page
		And user sees the update ticketing time limit title on the top left corner of the page
		# Scenario 3: Functionality of Page Header Section
		Given user is on "Update Ticketing Time Limit" page
		Then user sees ticketing time limit details fields enabled
		# Scenario 4: Air Out Settings Section
		Given user is on "Update Ticketing Time Limit" page
		Then user sees ticketing time limit details ticketing time settings fields enabled
		# Scenario 5: Modify Date Ranges
		Given user is on "Update Ticketing Time Limit" page
		Then user sees ticketing time limit details date ranges fields enabled

	@Regression
	Scenario: APT-2469: 8. TTL Save -Input Validateion - Create Screen
		# Additional Scenario: APT-2470: 8b. TTL Save -Input Validateion - Copy Screen
		# Additional Scenario: APT-2471: 8c. TTL Save -Input Validateion - Modify Screen
		# Additional Scenario: APT-2934: Add, Edit, Copy Ticketing Time Limit  - Ticketing Name Field error message correction needed
		# Scenario 1: Save Validation From Add Ticketing Time Limit Page
		# And Scenario for APT-2934:
		Given user opens browser
		When user logs into app
		And user navigates to ticketing time limit page
		And user decides to create a new ticketing time limit
		And user puts "1" in the ticketing time limit ticketing time settings day range from field
		And user puts "2" in the ticketing time limit ticketing time settings day range to field
		And user saves the ticketing time limit details
		Then user sees feedback message "Ticketing Time Limit cannot be saved. Please review the error message(s)."
		And user sees error message "This is a mandatory field."
		When user ticks the "Australia Domestic" option of the ticketing time limit customer market dropdown
		And user puts "Test" in the ticketing time limit ticketing name field
		And user ticks the "Published" option of the ticketing time limit fare type dropdown
		And user ticks the "8P" option of the ticketing time limit airline dropdown
		And user ticks the "Trade Partner" option of the ticketing time limit customer type dropdown
		And user saves the ticketing time limit details
		Then user sees feedback message "Ticketing Time Limit cannot be saved. Please review the error message(s)."
		And user sees error message "Ticketing name already exists"
		# Scenario 2: Ticketing Time Limit Settings Section Validation
		Given user is on "Add Ticketing Time Limit" page
		When user puts "" in the ticketing time limit ticketing time settings day range from field
		And user puts "" in the ticketing time limit ticketing time settings day range to field
		And user saves the ticketing time limit details
		Then user sees feedback message "Ticketing Time Limit cannot be saved. Please review the error message(s)."
		And user sees error message "This is a mandatory field."
		When user puts "-1" in the ticketing time limit ticketing time settings day range from field
		Then user sees the ticketing time limit ticketing time settings day range from field contains "1"
		When user puts "-2" in the ticketing time limit ticketing time settings day range to field
		Then user sees the ticketing time limit ticketing time settings day range to field contains "2"
		When user puts "2" in the ticketing time limit ticketing time settings day range from field
		And user puts "1" in the ticketing time limit ticketing time settings day range to field
		Then user sees error message "Day Range From cannot be greater than Day Range To"
		When user puts "1" in the ticketing time limit ticketing time settings day range from field
		And user puts "2" in the ticketing time limit ticketing time settings day range to field
		Then user does not see the error message "Day Range From cannot be greater than Day Range To"
		# Scenario 3: Duplicate TTL Validations
		Given user is on "Add Ticketing Time Limit" page
		When user puts "31 Dec 2051" in the ticketing time limit date ranges effective date from field
		And user puts "31 Dec 2050" in the ticketing time limit date ranges effective date to field
		Then user sees error message "Effective Date From cannot be greater than Effective Date To"
		When user puts "01 Jan 1990" in the ticketing time limit date ranges effective date from field
		And user adds a ticketing time limit setting date range
		When user puts "01 Jan 1990" in the ticketing time limit date ranges effective date from field
		And user puts "31 Dec 2050" in the ticketing time limit date ranges effective date to field
		And user saves the ticketing time limit details
		Then user sees feedback message "Ticketing Time Limit cannot be saved. Please review the error message(s)."
		And user sees error message "Overlapping Dates."
		When user ticks the "New Zealand Domestic" option of the ticketing time limit customer market dropdown
		And user puts "TestExistingTicktetingTimeLimit" in the ticketing time limit ticketing name field
		And user ticks the "Published" option of the ticketing time limit fare type dropdown
		And user ticks the "Negotiated" option of the ticketing time limit fare type dropdown
		And user ticks the "D8" option of the ticketing time limit airline dropdown
		And user ticks the "Direct Customer" option of the ticketing time limit customer type dropdown
		And user puts "01 Jan 2051" in the ticketing time limit date ranges effective date from field
		And user puts "31 Dec 2052" in the ticketing time limit date ranges effective date to field
		And user saves the ticketing time limit details
		Then user sees feedback message "Ticketing Time Limit with these selected parameters already exists."

	@Regression
	Scenario: APT-2507: 4.0. As an OPT/Air Admin User I want to ADD Air Details to Indicative Contracts So I can Capture Airline, Cabin Class and Location per Air Contracts
		# Additional Scenario: APT-2522: 5.0. As an OPT/Air Admin User I want to MODIFY Air Details to Indicative Contracts So I can Manage Airline, Cabin Class and Location per Air Contracts
		# Additional Scenario: APT-2523: 6.0. As an OPT/Air Admin User I want to COPY Air Details to Indicative Contracts So I can Create New Air Details from existing one
		# Additional Scenario: APT-2533: 7c. Indicative Contract Save Validation - Copy Contract
		# Additional Scenario: APT-2534: 7b. Indicative Contract  Save Validation - Update Contract
		# Additional Scenario: APT-2535: 3.0b. Save/CloseTicketing Time Limit - Modify Page
		# Additional Scenario: APT-2616: Cabin Class Selection Add Cost Category 1
		# Additional Scenario: APT-2946: The 'Location' field in the Indicative Air accordion within Contracts should be multi select
		# Additional Scenario: APT-2959: Validation on Update of Cabin Class - Indicative Air Contracts
		# Scenario 1: Visibility of Indicative Air Section
		Given user opens browser
		When user logs into app
		And user navigates to contracts page
		And user decides to add a new contract
		And user provides the basic information of the contract with the type miscellaneous
		Then user sees the contract indicative air section
		# Scenario 2: Functionality of Indicative Air Section Fields
		# And Scenario for APT-2535:
		Given user is on "Contract Details" page
		#		When user saves the contract
		#		Then user sees feedback message "Unable to create contract. Please review error message(s) below."
		#		And user sees error message "This is a mandatory field."
		Then user sees contract indicative air airline input is readonly
		And user sees the contract indicative air airline input contains "TST"
		And user sees the contract indicative air cabin class dropdown and its options
		When user ticks the "First Class" option of the contract indicative air cabin class dropdown
		And user ticks the "MLB" option of the contract indicative air location dropdown
		And user ticks the "DXB" option of the contract indicative air location dropdown
		Then user sees the contract indicative air location dropdown contains "Dubai"
		And user sees the contract indicative air location dropdown contains "Melbourne International"
		When user saves the contract
		Then user sees feedback message Contract ID has been "created successfully." displayed
		# Scenario for APT-2616:
		Given user is on "Contract Details" page
		When user opens the update contract basic information popup
		And user ticks the "Economy" option of the contract indicative air cabin class dropdown
		And user saves the contract
		And user opens the add contract costs page
		Then user sees the category 1 field options when the indicative air cabin class is "Economy"
		When user closes the contract costs details page
		And user confirms the closing of the contract costs details page
		And user opens the update contract basic information popup
		And user ticks the "Premium Economy" option of the contract indicative air cabin class dropdown
		And user saves the contract
		And user opens the add contract costs page
		Then user sees the category 1 field options when the indicative air cabin class is "Premium Economy"
		When user closes the contract costs details page
		And user confirms the closing of the contract costs details page
		And user opens the update contract basic information popup
		And user ticks the "Business Class" option of the contract indicative air cabin class dropdown
		And user saves the contract
		And user opens the add contract costs page
		Then user sees the category 1 field options when the indicative air cabin class is "Business Class"
		When user closes the contract costs details page
		And user confirms the closing of the contract costs details page
		And user opens the update contract basic information popup
		And user ticks the "First Class" option of the contract indicative air cabin class dropdown
		And user saves the contract
		And user opens the add contract costs page
		Then user sees the category 1 field options when the indicative air cabin class is "First Class"
		# Scenario for APT-2522:
		# And Scenario for APT-2534:
		Given user is on "Add Contract Costs" page
		When user closes the contract costs details page
		And user confirms the closing of the contract costs details page
		And user opens the update contract basic information popup
		Then user sees contract indicative air airline input is readonly
		And user sees the contract indicative air airline input contains "TST"
		And user sees the contract indicative air cabin class dropdown and its options
		When user ticks the "AUH" option of the contract indicative air location dropdown
		Then user sees the contract indicative air location dropdown contains "Abu Dhabi Intl"
		When user ticks the "Business Class" option of the contract indicative air cabin class dropdown
		Then user sees the contract indicative air cabin class dropdown contains "Business Class"
		When user saves the contract
		Then user sees feedback message "Record saved successfully."
		# Scenario for APT-2523:
		# And Scenario for APT-2533:
		Given user is on "Contract Details" page
		When user cancels the update of the contract
		And user puts "AirInd" in the name column filter to filter the contract results
		And user copies the contract
		And user puts "AirInd" as the name for the contract
		Then user sees contract indicative air airline input is readonly
		And user sees the contract indicative air airline input contains "TST"
		And user sees the contract indicative air cabin class dropdown and its options
		When user ticks the "ACY" option of the contract indicative air location dropdown
		And user ticks the "DXB" option of the contract indicative air location dropdown
		Then user sees the contract indicative air location dropdown contains "Atlantic City International"
		When user ticks the "First Class" option of the contract indicative air cabin class dropdown
		Then user sees the contract indicative air cabin class dropdown contains "First Class"
		When user saves the contract
		Then user sees feedback message Contract ID has been "created successfully." displayed
		# Scenario for cleanup:
		Given user is on "Contract Details" page
		When user opens the update contract basic information popup
		And user provides different information for the contract
		And user saves the contract
		And user cancels the update of the contract
		And user puts "AirInd" in the name column filter to filter the contract results
		And user updates the contract
		And user opens the update contract basic information popup
		And user provides different information for the contract
		And user saves the contract
		Then user is on "Contract Details" page
		# Scenario for APT-2959:
		Given user is on "Contract Details" page
		When user cancels the update of the contract
		And user searches for a contract with type miscellaneous
    And user updates the contract
		And user opens the update contract basic information popup
		And user ticks the "Economy" option of the contract indicative air cabin class dropdown
		And user saves the contract
		Then user sees error message "Cannot change value as cost already exists"

	@Regression
	Scenario: APT-2525: 1.0. As an Yield User I want to ADD Air Details to Air Promotions So I can Capture Airline, Cabin Class and Location per Air Promotion
		# Additional Scenario: APT-2519: 2.0. As a Yield User I want to MODIFY Indicative Air Details to Air Promotions So I can Capture existing Airline, Cabin Class and Location per selected Air Promotion
		# Additional Scenario: APT-2520: 3.0. As a Yield User I want to COPY Indicative Air Details to Air Promotions So I can Created new Airline, Cabin Class and Location from existing Air Promotion
		# Additional Scenario: APT-2942: Indicative Air Promotion Save Validation - Create Promotion
		# Additional Scenario: APT-2944: Indicative Air Promotion Save Validation - Update Promotion
		# Additional Scenario: APT-2945: Indicative Air Promotion Save Validation - Copy Promotion
		# Scenario 1: Visibility of Indicative Air Section
		# And Scenario 2: Functionality of Indicative Air Section Fields
		# And Scenario for APT-2519:
		# And Scenario for APT-2520:
		# And Scenario for APT-2942:
		# And Scenario for APT-2944:
		# And Scenario for APT-2945:
		Given user opens browser
		When user logs into app
		And user navigates to promotions page
		And user navigates to add promotion page
		And user provides necessary and valid information for the promotion that has the revenue allocation air
		Then user sees the promotion indicative air section
		And user sees the promotion indicative air cabin class dropdown contains "All Selected"
		When user ticks the "Select All" option of the promotion indicative air cabin class dropdown
		And user saves the promotion
		Then user sees error message "*Mandatory field"
		And user sees the promotion indicative air airline dropdown contains "All Selected"
		When user ticks the "Select All" option of the promotion indicative air airline dropdown
		And user saves the promotion
		Then user sees error message "*Mandatory field"
		When user ticks the "8P" option of the promotion indicative air airline dropdown
		And user ticks the "D8" option of the promotion indicative air airline dropdown
		Then user sees the promotion indicative air airline dropdown contains "8P, D8"
		When user ticks the "Business Class" option of the promotion indicative air cabin class dropdown
		And user ticks the "First Class" option of the promotion indicative air cabin class dropdown
		Then user sees the promotion indicative air cabin class dropdown contains "Business Class, First Class"
		When user ticks the "AUH" option of the promotion indicative air location dropdown
		Then user sees the promotion indicative air location dropdown contains "Abu Dhabi Intl"
		When user saves the promotion
		And user puts "ProIndAir" in the promotion code column filter to filter the promotion results
		And user edits the promotion
		And user puts "EditProIndAir" as the code for the promotion
		Then user sees the promotion indicative air section
		When user ticks the "Select All" option of the promotion indicative air airline dropdown
		And user ticks the "Select All" option of the promotion indicative air airline dropdown
		And user saves the promotion
		Then user sees error message "*Mandatory field"
		When user ticks the "8P" option of the promotion indicative air airline dropdown
		And user ticks the "Select All" option of the promotion indicative air cabin class dropdown
		And user ticks the "Select All" option of the promotion indicative air cabin class dropdown
		And user saves the promotion
		Then user sees error message "*Mandatory field"
		When user ticks the "First Class" option of the promotion indicative air cabin class dropdown
		And user ticks the "AUH" option of the promotion indicative air location dropdown
		And user ticks the "MLB" option of the promotion indicative air location dropdown
		And user saves the promotion
		And user puts "EditProIndAir" in the promotion code column filter to filter the promotion results
		And user copies the promotion
		And user puts "CopyProIndAir" as the code for the promotion
		Then user sees the promotion indicative air section
		When user ticks the "Select All" option of the promotion indicative air airline dropdown
		And user ticks the "Select All" option of the promotion indicative air airline dropdown
		And user saves the promotion
		Then user sees error message "*Mandatory field"
		When user ticks the "D8" option of the promotion indicative air airline dropdown
		And user ticks the "Select All" option of the promotion indicative air cabin class dropdown
		And user ticks the "Select All" option of the promotion indicative air cabin class dropdown
		And user saves the promotion
		Then user sees error message "*Mandatory field"
		When user ticks the "Business Class" option of the promotion indicative air cabin class dropdown
		And user ticks the "MLB" option of the promotion indicative air location dropdown
		And user ticks the "San Antonio" option of the promotion indicative air location dropdown
		And user saves the promotion
		Then user sees feedback message "Record(s) saved successfully."

	@Regression
	Scenario: APT-2621: 2b. Air Sub-menu Display
		# Scenario 1: Navigation Menu
		Given user opens browser
		When user logs into app
		And user opens the air accordion
		Then user sees the sub menus of the air accordion

	@Regression
	Scenario: APT-2651: 1.0b. Save/CloseTicketing Time Limit - Create Page
		# Additional Scenario: APT-2466: 6.0  As a Flight Admin User I want to Delete Ticketing Time Limits So I Can Manage New/Existing TTL Settings
		# Additional Scenario: APT-2779: 3.0b. Save/CloseTicketing Time Limit - Modify Page
		# Additional Scenario: APT-2870: Improvement - Delete Ticketing Time Limit
		# Additional Scenario: APT-2883: 3.0b Ticketing Time Limit - Correct Modify save banner message
		# Scenario 1: Close Ticketing Time Limit From Add Ticketing Time Limit Page
		# And Scenario 2: Save Ticketing Time Limit From Add Ticketing Time Limit Page
		# And Scenario for APT-2466:
		# And Scenario for APT-2799:
		# And Scenario for APT-2870:
		# And Scenario for APT-2883:
		Given user opens browser
		When user logs into app
		And user navigates to ticketing time limit page
		And user decides to create a new ticketing time limit
		And user puts "Test" in the ticketing time limit ticketing name field
		And user closes the ticketing time limit details
		And user disregards the closing of ticketing time limit details
		Then user is on "Add Ticketing Time Limit" page
		When user closes the ticketing time limit details
		And user confirms the closing of ticketing time limit details
		Then user is on "Ticketing Time Limit" page
		When user decides to create a new ticketing time limit
		And user ticks the "Germanic" option of the ticketing time limit customer market dropdown
		And user puts "Test1234" in the ticketing time limit ticketing name field
		And user ticks the "Negotiated" option of the ticketing time limit fare type dropdown
		And user ticks the "1" option of the ticketing time limit airline dropdown
		And user ticks the "2" option of the ticketing time limit airline dropdown
		And user ticks the "3" option of the ticketing time limit airline dropdown
		And user ticks the "4" option of the ticketing time limit airline dropdown
		And user ticks the "5" option of the ticketing time limit airline dropdown
		And user ticks the "Unspecified" option of the ticketing time limit customer type dropdown
		And user puts "1" in the ticketing time limit ticketing time settings day range from field
		And user puts "2" in the ticketing time limit ticketing time settings day range to field
		And user puts "3" in the ticketing time limit ticketing time settings set ttl as booking+ field
		And user puts "4" in the ticketing time limit ticketing time settings set ttl as ttl- field
		And user adds a ticketing time limit setting
		Then user sees the additional row for a ticketing time setting
		When user deletes the newly added ticketing time setting of the ticketing time limit
		Then user does not see the additional row of ticketing time setting
		And user does not see the delete button for the one remaining ticketing time setting of the ticketing time limit
		When user adds a ticketing time limit setting date range
		Then user sees the ticketing time limit date range add date ranges button disabled
		When user deletes the newly added date range of the ticketing time limit
		Then user does not see the delete button for the one remaining date range of the ticketing time limit
		When user saves the ticketing time limit details
		Then user sees feedback message "Ticketing Time Limit created successfully"
		When user edits the ticketing time limit
		And user puts "Test12345" in the ticketing time limit ticketing name field
		And user saves the ticketing time limit details
		Then user sees feedback message "Ticketing Time Limit updated successfully"
		When user deletes a ticketing time limit
		And user disregards the deletion of the ticketing time limit
		Then user sees the ticketing time limit is not deleted
		When user deletes a ticketing time limit
		And user confirms the deletion of the ticketing time limit
		Then user sees feedback message "Ticketing Time Limit Test12345 Deleted Successfully"

	@Regression
	Scenario: APT-2653: 8.0  Save/Close Queue Place Settings
		# Additional Scenario: APT-2439: 6.0 AS a Flight Desk Administrator I want to Delete Queue Place Settings So I can manage New/Existing Queue Rules
		# Additional Scenario: APT-2682: 8.0a  Save/Close Queue Place Settings - Copy Page
		# Additional Scenario: APT-2684: 8.0b  Save/Close Queue Place Settings - Update Page
		# Additional Scenario: APT-2814: Improvement - Duplicate Queue
		# Scenario 1: Close Queue Place Setting From Add Queue Place Setting Page
		# And Scenario 2: Save Queue Place Setting From Add Queue Place Setting Page
		# And Scenario for APT-2439:
		# And Scenario for APT-2682:
		# And Scenario for APT-2684:
		# And Scenario for APT-2814:
		Given user opens browser
		When user logs into app
		And user navigates to queue place setting page
		And user decides to create a new queue place rule
		And user puts "Test1234" in the queue place rule name field
		And user closes the queue place rule details
		And user disregards the closing of queue place rule details
		Then user is on "Add Queue Place Rule" page
		When user closes the queue place rule details
		And user confirms the closing of queue place rule details
		Then user is on "Queue Place Setting" page
		When user decides to create a new queue place rule
		And user ticks the "Australia Domestic" option of the queue place rule customer market dropdown
		And user ticks the "New Zealand Domestic" option of the queue place rule customer market dropdown
		And user ticks the "Direct Customer" option of the queue place rule customer type dropdown
		And user ticks the "Internal Staff" option of the queue place rule customer type dropdown
		And user puts "Test1234" in the queue place rule name field
		And user ticks the "Ready to Ticket" option of the queue place rule flight action dropdown
		And user ticks the "PNR Creation" option of the queue place rule flight action dropdown
		And user saves the queue place rule details
		Then user sees feedback message a that the Queue Place Rule with the combinations given is already existing
		When user ticks the "Australia Domestic" option of the queue place rule customer market dropdown
		And user ticks the "New Zealand Domestic" option of the queue place rule customer market dropdown
		And user ticks the "Germanic" option of the queue place rule customer market dropdown
		And user ticks the "Direct Customer" option of the queue place rule customer type dropdown
		And user ticks the "Internal Staff" option of the queue place rule customer type dropdown
		And user ticks the "Trade Partner" option of the queue place rule customer type dropdown
		And user adds a new queue place rule queue detail row
		And user deletes the queue place rule queue detail
		Then user does not see the queue place rule queue detail
		When user puts "50" in the queue place rule details gds queue number field
		And user saves the queue place rule details
		Then user sees feedback message "Queue Place Setting created successfully."
		When user deletes a queue place setting
		And user disregards the deletion of the queue place setting
		Then user sees the queue place setting is not deleted
		When user deletes a queue place setting
		And user confirms the deletion of the queue place setting
		Then user sees feedback message "Queue Place Setting Rule has been successfully deleted"

	@Regression
	Scenario: APT-2654: 10.0 Save/Close Markup Rule
		# Additional Scenario: APT-2356: 06.  Delete  Cost Markup Rule- Add Page
		# Additional Scenario: APT-2432: 06b. Delete Markup - Add Page
		# Additional Scenario: APT-2694: 06ii.  Delete  Cost Markup Rule- Copy Page
		# Additional Scenario: APT-2695: 06iii.  Delete  Cost Markup Rule- Modify Page
		# Additional Scenario: APT-2696: 06bi. Delete Price Setting Markup - Copy Page
		# Additional Scenario: APT-2697: 06bii. Delete Price Setting Markup - Modify Page
		# Additional Scenario: APT-2736: Markup rule can be saved with duplicate cost/price records when multiple values or ALL is selected
		# Additional Scenario: APT-3011: MAdd/Edit/Copy Markup Rule - Fare Basis Code as Optional field for Cost/ Price Sections
		# Scenario 1: Close Markup Rule From Add Markup Rule Page
		# And Scenario 3: Close Markup Rule From Copy Markup Rule Page
		# And Scenario 5: Close Markup Rule From Edit Markup Rule Page
		Given user opens browser
		When user logs into app
		And user navigates to mark up rule page
		And user decides to create a new markup rule
		And user ticks the "EZY" option of the markup rule airline dropdown
		And user closes the markup rule details
		And user disregards the closing of markup rule details
		Then user is on "Add Markup Rule" page
		When user closes the markup rule details
		And user confirms the closing of markup rule details
		Then user is on "Air Markup Rule" page
		# Scenario 2: Save Markup Rule From Add Markup Rule Page
		# And Scenario 4: Save Markup Rule From Copy Markup Rule Page
		# And Scenario 6: Save Markup Rule From Update Markup Rule Page
		# And Scenario for APT-2356:
		# And Scenario for APT-2432:
		# And Scenario for APT-2694:
		# And Scenario for APT-2695:
		# And Scenario for APT-2696:
		# And Scenario for APT-2697:
		# And Scenario for APT-2736:
		# And Scenario for APT-3011:
		Given user is on "Air Markup Rule" page
		When user decides to create a new markup rule
		And user ticks the "8P" option of the markup rule airline dropdown
		And user ticks the "D8" option of the markup rule airline dropdown
		And user ticks the "Australia" option of the markup rule tour destination dropdown
		And user ticks the "New Zealand" option of the markup rule tour destination dropdown
		And user ticks the "Australia Domestic" option of the markup rule customer market dropdown
		And user ticks the "New Zealand Domestic" option of the markup rule customer market dropdown
		And user saves the markup rule details
		Then user sees feedback message "Markup Rule cannot be saved. Please review the error message(s)."
		And user sees error message "Markup Rule Already Exist"
		When user ticks the "Select All" option of the markup rule airline dropdown
		And user ticks the "Select All" option of the markup rule airline dropdown
		And user ticks the "2" option of the markup rule airline dropdown
		And user ticks the "3" option of the markup rule airline dropdown
		And user ticks the "4" option of the markup rule airline dropdown
		And user ticks the "5" option of the markup rule airline dropdown
		And user ticks the "Australia" option of the markup rule tour destination dropdown
		And user ticks the "New Zealand" option of the markup rule tour destination dropdown
		And user ticks the "Africa" option of the markup rule tour destination dropdown
		And user ticks the "Select All" option of the markup rule customer market dropdown
		And user adds a cost setting to the markup rule
		And user ticks the "Both" option of the markup rule cost setting markup type dropdown
		And user ticks the "Select All" option of the markup rule cost setting fare type dropdown
		And user ticks the "Select All" option of the markup rule cost setting itinerary type dropdown
		And user puts "Test" in the markup rule cost setting fare basis code field
		And user puts "10" in the markup rule cost setting percentage field
		And user puts "10" in the markup rule cost setting amount field
		And user ticks the "Total Fare" option of the markup rule cost setting apply on dropdown
		And user adds a cost setting to the markup rule
		And user ticks the "Both" option of the markup rule cost setting markup type dropdown
		And user ticks the "Select All" option of the markup rule cost setting fare type dropdown
		And user ticks the "Select All" option of the markup rule cost setting itinerary type dropdown
		And user puts "Test" in the markup rule cost setting fare basis code field
		And user puts "10" in the markup rule cost setting percentage field
		And user puts "10" in the markup rule cost setting amount field
		And user ticks the "Total Fare" option of the markup rule cost setting apply on dropdown
		And user adds a price setting to the markup rule
		And user ticks the "Both" option of the markup rule price setting markup type dropdown
		And user ticks the "Select All" option of the markup rule price setting fare type dropdown
		And user ticks the "Select All" option of the markup rule price setting itinerary type dropdown
		And user puts "Test" in the markup rule price setting fare basis code field
		And user puts "10" in the markup rule price setting percentage field
		And user puts "10" in the markup rule price setting amount field
		And user ticks the "Total Fare" option of the markup rule price setting apply on dropdown
		And user adds a price setting to the markup rule
		And user ticks the "Both" option of the markup rule price setting markup type dropdown
		And user ticks the "Select All" option of the markup rule price setting fare type dropdown
		And user ticks the "Select All" option of the markup rule price setting itinerary type dropdown
		And user puts "Test" in the markup rule price setting fare basis code field
		And user puts "10" in the markup rule price setting percentage field
		And user puts "10" in the markup rule price setting amount field
		And user ticks the "Total Fare" option of the markup rule price setting apply on dropdown
		And user saves the markup rule details
		Then user sees feedback message "Markup Rule cannot be saved. Please review the error message(s)."
		And user sees error message "Markup Rule Already Exist"
		When user deletes a cost setting of the markup rule
		#		And user confirms the deletion of markup rule details cost setting
		And user deletes a cost setting of the markup rule
		#		And user confirms the deletion of markup rule details cost setting
		And user deletes a price setting of the markup rule
		#		And user confirms the deletion of markup rule details price setting
		And user deletes a price setting of the markup rule
		#		And user confirms the deletion of markup rule details price setting
		And user adds a cost setting to the markup rule
		Then user sees the markup rule details cost setting fields enabled
		When user deletes a cost setting of the markup rule
		#		And user disregards the deletion of markup rule details cost setting
		#		Then user sees the markup rule details cost setting fields enabled
		#		When user deletes a cost setting of the markup rule
		#		And user confirms the deletion of markup rule details cost setting
		Then user does not see the markup rule details cost setting
		When user adds a price setting to the markup rule
		Then user sees the markup rule details price setting fields enabled
		When user deletes a price setting of the markup rule
		#		And user disregards the deletion of markup rule details price setting
		#		Then user sees the markup rule details price setting fields enabled
		#		When user deletes a price setting of the markup rule
		#		And user confirms the deletion of markup rule details price setting
		Then user does not see the markup rule details price setting
		When user adds a cost setting to the markup rule
		And user ticks the "Both" option of the markup rule cost setting markup type dropdown
		And user ticks the "Select All" option of the markup rule cost setting fare type dropdown
		And user ticks the "Select All" option of the markup rule cost setting itinerary type dropdown
		And user puts "10" in the markup rule cost setting percentage field
		And user puts "10" in the markup rule cost setting amount field
		And user ticks the "Total Fare" option of the markup rule cost setting apply on dropdown
		And user adds a price setting to the markup rule
		And user ticks the "Both" option of the markup rule price setting markup type dropdown
		And user ticks the "Select All" option of the markup rule price setting fare type dropdown
		And user ticks the "Select All" option of the markup rule price setting itinerary type dropdown
		And user puts "10" in the markup rule price setting percentage field
		And user puts "10" in the markup rule price setting amount field
		And user ticks the "Total Fare" option of the markup rule price setting apply on dropdown
		And user saves the markup rule details
		Then user sees feedback message "Markup Rule created successfully"
		When user ticks the "2" option of the search markup rule airline dropdown
		And user ticks the "3" option of the search markup rule airline dropdown
		And user ticks the "4" option of the search markup rule airline dropdown
		And user ticks the "5" option of the search markup rule airline dropdown
		And user searches for a markup rule with the given search filters
		And user puts "2L, 3K, 4D, 5H" in the airline column filter to filter the markup rule results
		And user deletes a markup rule
		And user disregards the deletion of the markup rule
		Then user sees the markup rule is not deleted
		When user deletes a markup rule
		And user confirms the deletion of the markup rule
		Then user sees feedback message "Markup Rule Deleted"

	@Regression
	Scenario: APT-2674: Recommended Itin -  Add Recommended Itinerary Tour Code, don't display past tours
		# Scenario 1: Tour Code Drop Down in Search Itinerary
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user ticks the "IS18" option of the search itinerary tour code dropdown
		And user ticks the "Select All" option of the search itinerary customer market dropdown
		When user puts "01 Jan 1990" in the search itinerary departure date from field
		And user puts "31 Dec 2050" in the search itinerary departure date to field
		And user searches for a recommended itinerary with the given search filters
		And user puts "IS18" in the tour code column filter to filter the recommended itinerary result
		Then user sees the recommended itinerary search results with the specific tour codes "IS18"
		# Scenario 2: Tour Code Drop Down in Add Recommended Itinerary
		# And Scenario 3: Tour Code Drop Down in Modify Itinerary
		# And Scenario 4: Tour Code Drop Down in Copy Recommended Itinerary
		Given user is on "Recommended Itinerary" page
		When user decides to create a new itinerary
		Then user does not see the itinerary tour code dropdown contains the option "AFRK17"

	@Regression
	Scenario: APT-2714: Flight Type Drop-Down Display - Improvement
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to queue place setting page
		And user decides to create a new queue place rule
		And user ticks the "Select All" option of the queue place rule customer market dropdown
		And user ticks the "Select All" option of the queue place rule customer type dropdown
		And user puts "Test" in the queue place rule name field
		And user adds a new queue place rule queue detail row
		And user adds a new queue place rule queue detail row
		Then user sees error message "Duplicate Flight Type cannot be added."
		When user selects different values for the two dropdowns of the queue place rule details queue details flight type dropdowns
		Then user does not see the error message "Duplicate Flight Type cannot be added."

	@Regression
	Scenario: APT-2781: Improvement Story Markup Type
		# Scenario 1: Amount Markup Type - On field Validation
		# And Scenario 2: Percentage Markup Type - On field Validation
		# And Scenario 3: Both Markup Type - On field Validation
		# And Scenario 4:
		# And Scenario 5:
		# And Scenario 6:
		# And Scenario 7:
		Given user opens browser
		When user logs into app
		And user navigates to mark up rule page
		And user decides to create a new markup rule
		And user ticks the "Select All" option of the markup rule airline dropdown
		And user ticks the "Select All" option of the markup rule tour destination dropdown
		And user ticks the "Select All" option of the markup rule customer market dropdown
		And user adds a cost setting to the markup rule
		And user ticks the "Both" option of the markup rule cost setting markup type dropdown
		And user puts "9991.9999" in the markup rule cost setting percentage field
		Then user sees error message "Value exceeds limit max 999.9999%"
		When user puts "999991.99" in the markup rule cost setting amount field
		Then user sees error message "Value exceeds limit max 99999.99"
		When user puts "999.9999" in the markup rule cost setting percentage field
		Then user does not see the error message "Value exceeds limit max 999.9999%"
		When user puts "99999.99" in the markup rule cost setting amount field
		Then user does not see the error message "Value exceeds limit max 99999.99"
		When user adds a price setting to the markup rule
		And user ticks the "Both" option of the markup rule price setting markup type dropdown
		And user puts "9991.9999" in the markup rule price setting percentage field
		Then user sees error message "Value exceeds limit max 999.9999%"
		When user puts "999991.99" in the markup rule price setting amount field
		Then user sees error message "Value exceeds limit max 99999.99"
		When user puts "999.9999" in the markup rule price setting percentage field
		Then user does not see the error message "Value exceeds limit max 999.9999%"
		When user puts "99999.99" in the markup rule price setting amount field
		Then user does not see the error message "Value exceeds limit max 99999.99"

	@Regression
	Scenario: APT-2784: Improvement - Recommended Itinerary Date Display
		# Additional Scenario: APT-2675: Delete Icon For Date Range in Add/Edit/Copy Itinerary Screen - Improvement
		# Additional Scenario: APT-2982: Date ranges - Improvement of Delete functionality
		# Scenario 1: From Add Itinerary Page
		# And Scenario 2: From Copy/Edit Itinerary Page
		# And Scenario for APT-2982:
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user decides to create a new itinerary
		Then user sees the itinerary date ranges departure date from and to textboxes enabled
		And user sees the itinerary date ranges add date range button enabled
		When user puts "01 Jan 2087" in the itinerary date ranges departure date from field
		And user puts "31 Dec 2088" in the itinerary date ranges departure date to field
		And user adds the new date range to the itinerary
		Then user sees the itinerary date ranges departure date from and to textboxes are blank
#		And user sees the itinerary date ranges add date range button disabled
		When user deletes a date range of the itinerary
		Then user does not see the date range of the itinerary
		And user does not see the delete icon for the last date range of the itinerary

	@Regression
	Scenario: APT-2872: Optimize Recommended Itinerary Page
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user decides to create a new itinerary
		Then user sees the outbound flights, internal flights, inbound flights, and date ranges fields enabled

	@Regression
	Scenario: APT-2931: Recommended Itinerary - New record display in Date Ranges accordion for Update/Copy
		# Scenario 1: New record display - Edit/Copy
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user edits the recommended itinerary
		Then user sees the itinerary date ranges add date range button enabled
		When user closes the recommended itinerary details
		And user copies the recommended itinerary
		Then user sees the itinerary date ranges add date range button enabled
		# Scenario 2: Add button to be enabled always
		Given user is on "Copy Recommended Itinerary" page
		When user closes the recommended itinerary details
		And user decides to create a new itinerary
		Then user sees the itinerary date ranges add date range button enabled

	@Regression
	Scenario: APT-2996: Rec Itin - Adding a blank row as first option for all single select dropdowns in Outbound/Internal/Inbound
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user decides to create a new itinerary
		Then user sees the itinerary single select dropdowns have blank option

	@Regression
	Scenario: APT-3025: Add 'Flight Type' to home page for additional Search/Filter and reorder columns and width.
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to queue place setting page
		Then user sees the queue place setting flight type column

	@Regression
	Scenario: APT-3047: Inactive wording needs to change to 'Include Inactive'
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		Then user sees the include inactive checkbox

	@Regression
	Scenario: APT-3088: Cabin Class should only be mandatory if 'Indicative Pricing' checkbox is selected
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to contracts page
		And user decides to add a new contract
		And user provides the basic information of the contract with the type miscellaneous
		And user enables the option indicative pricing for the contract
		And user saves the contract
		Then user sees error message "*Mandatory field."

	@Regression
	Scenario: APT-3100: When searching for an Inactive Recommended Itin by ticking the check box, both inactive and active should display
		# Scenario 1:
		Given user opens browser
		When user logs into app
		And user navigates to recommended itinerary page
		And user ticks the "Select All" option of the search itinerary tour code dropdown
		And user ticks the "Select All" option of the search itinerary customer market dropdown
		And user ticks the search itinerary inactive checkbox
		And user puts "01 Jan 1990" in the search itinerary departure date from field
		And user puts "31 Dec 2050" in the search itinerary departure date to field
		And user searches for a recommended itinerary with the given search filters
		Then user sees the recommended itinerary search results that is both active and inactive
