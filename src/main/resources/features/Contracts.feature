Feature: APT - Contracts
  I want to use this feature file for testing APT - Contracts user stories

  @Regression
  Scenario: APT-1250: 01. As a Product team member, I want to access the CONTRACTS module so that I can view and edit contract records
    # Additional Scenario: APT-1251: 02. As a Product team member, I want to arrive at the contracts search screen when I press the contracts menu item
    # Additional Scenario: APT-1253: 03. As a Product team member, I want to search for contracts so that I can find the one I am looking for
    # Additional Scenario: APT-1317: 07. As a Product team member, I want office and department fields to be cascading so that department dropdown is populated depending on selection in office field
    # Scenario 1: Cosmetic
    # Scenario 2:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    Then user is on "Contracts" page
    # Scenario for APT-1251:
    # And Scenario for APT-1253:
    # And Scenario for APT-1317:
    Given user is on "Contracts" page
    Then user sees contracts fields and its default values
    And user sees contracts table
    And user sees the create new contract button
    When user sorts contracts
    And user uses column filters to filter the contracts result
    And user removes the contracts column filters
    And user selects an office for filtering the contracts search results
    Then user sees department list is based on the office selected
    When user selects a department for filtering the contracts search results
    And user selects all offices for filtering the contracts search results
    Then user sees department is back to default
    When user searches for a contract
    Then user sees the contract
    When user resets the search filters
    Then user sees contracts fields and its default values
    When user searches for a contract by id
    Then user sees the contract
    And user sees edit and copy icons with tooltips and does not see view icon for each contract

  @Regression
  Scenario: APT-1262: 04. As a Product team member, I want to specify basic information of a contract when creating or editing the contract
    # Additional Scenario: APT-1287: 10. As a Product team member, I want to specify contract options when creating or editing a contract
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user decides to add a new contract
    Then user sees the add new contract page title, fields and its default values
    When user expands the contract options accordion
    And user sees the add new contract page contract options fields and its default values
    # Scenario 2:
    Given user is on "Contract Details" page
    When user cancels the creation of the new contract
    And user searches for a contract by id
    And user updates the contract
    And user opens the update contract basic information popup
    Then user sees the update contract page title, fields and its values
    When user expands the contract options accordion
    Then user sees the update contract page contract options fields and its values
    # Scenario 3:
    Given user is on "Contract Details" page
    When user cancels the update of the contract basic information
    And user cancels the update of the contract
    And user searches for a contract by id
    And user copies the contract
    Then user sees the copy contract page title, fields and its values
    And user sees the copy contract page contract options fields and its values
    # Scenario 5:
    Given user is on "Contract Details" page
    When user opens the office dropdown of the contract
    And user searches for an office with a specific keyword for the contract
    Then user sees the list of offices that can be selected for the contract
    # Scenario 4:
    Given user is on "Contract Details" page
    When user logs out of the app
    And user with view rights logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user views the contract
    Then user sees the view contract page title, fields and its values
    And user sees the view contract page contract options fields and its values

  @Regression
  Scenario: APT-1318: 08. As a Product team member, I want to specify date parameters in any date format so that I can use the format that I am comfortable with
    # Additional Scenario: APT-1320: 09. As a Product team member, I want to be notified when I enter invalid dates so that I can correct the dates entered
    # Scenario for APT-1318:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user decides to add a new contract
    And user provides the contract dates in invalid format
    Then user sees error message "Unsupported Date Format"
    # Scenario for APT-1320:
    Given user is on "Contract Details" page
    When user adds a contract date range with the start date is greater than the end date
    Then user sees error message "Start Date cannot be greater than End Date."

  @Regression
  Scenario: APT-1341: 12. As a Product team member, I want irrelevant contract options to be disabled depending on specified contract type
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user decides to add a new contract
    Then user sees the add new contract page contract options fields and its default values
    # Scenario 2:
    Given user is on "Contract Details" page
    When user selects "Coach" as the type for the new contract
    Then user sees the add new contract page contract options fields defaults for the contract type coach
    # Scenario 3:
    Given user is on "Contract Details" page
    When user selects "Cruise" as the type for the new contract
    Then user sees the add new contract page contract options fields defaults for the contract type cruise
    # Scenario 4:
    Given user is on "Contract Details" page
    When user selects "Foreign Operator / Land" as the type for the new contract
    Then user sees the add new contract page contract options fields defaults for the contract type foreign operator / land
    # Scenario 5:
    Given user is on "Contract Details" page
    When user selects "Hotel" as the type for the new contract
    Then user sees the add new contract page contract options fields defaults for the contract type hotel
    # Scenario 6:
    # And Scenario 7:
    # And Scenario 8:
    Given user is on "Contract Details" page
    When user selects "Miscellaneous" as the type for the new contract
    Then user sees the add new contract page contract options fields defaults for the contract type miscellaneous
    When user enables the option indicative pricing for the contract
    Then user sees the min and max contract value fields enabled
    When user disables the option indicative pricing for the contract
    Then user sees the min and max contract value fields disabled
    # Scenario 9:
    Given user is on "Contract Details" page
    When user selects "Rail" as the type for the new contract
    Then user sees the add new contract page contract options fields defaults for the contract type rail
    # Scenario 10:
    Given user is on "Contract Details" page
    When user selects "Transfer" as the type for the new contract
    Then user sees the add new contract page contract options fields defaults for the contract type transfer

  @Regression
  Scenario: APT-1345: 11. As a Product team member, I want Contract Value Range fields to accept numbers only
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user decides to add a new contract
    And user selects "Miscellaneous" as the type for the new contract
    And user enables the option indicative pricing for the contract
    Then user sees the min and max contract value fields enabled
    When user provides alphabets in the min and max contract value fields
    Then user sees the the min and max contract value fields rejected the alphabets
    # Scenario 2:
    # And Scenario 3:
    # And Scenario 4:
    Given user is on "Contract Details" page
    When user provides special characters in the min and max contract value fields
    Then user sees the the min and max contract value fields rejected the special characters
    # Scenario 5:
    Given user is on "Contract Details" page
    When user provides min and max contract values with the min contract value is greater than the max contract value
    Then user sees error message "Minimum Value cannot be greater than Maximum Value."
    # Scenario 6:
    Given user is on "Contract Details" page
    When user provides valid min and max contract values
    Then user does not see the error message "Minimum Value cannot be greater than Maximum Value."

  @Regression
  Scenario: APT-1424: 13. As a Product team member, I want to view cost information for a selected contract
    # Additional Scenario: APT-1429: 17. As a Product team member, I want a cell in the cost table to display as empty and greyed out when cost is not specified
    # Additional Scenario: APT-1434: 21. As a Product team member, I want action icons to be displayed in a cell in the cost table when I hover on the cell
    # Additional Scenario: APT-1489: 15. As a Product team member, I want ALLOTMENT CODE to be displayed in Cost Tables
    # Additional Scenario: APT-1938: 37. Show/Hide old dates in Cost Table when Updating a Contract
    # Additional Scenario: APT-2483: Cost Tables should display costs as gst exclusive
    # Additional Scenario: APT-3321: Cost accordion changes for Foreign Operator, Coach, Misc and Transfer
    # Scenario 1: Disabled due to APT-1817
    # Scenario 2:
    # And Scenario 6:
    # And Scenario 7:
    # And Scenario for APT-2483:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user toggles the hide past dates option
    And user expands the first contract costs category accordion
    And user uses column filters to filter the first contract costs category data
    Then user sees the add costs button
    And user sees the delete all costs button enabled
    And user sees the first contract costs category accordion expanded and its contents
    And user sees the second contract costs category accordion collapsed
    When user hovers over a certain cell that is not empty in the contract costs table
    Then user sees the edit and delete icons beside the contract cost data
    # Scenario 4:
    Given user is on "Contract Details" page
    When user expands the second contract costs category accordion
    Then user sees the second contract costs category contents
    # Scenario 5:
    Given user is on "Contract Details" page
    When user collapses the second contract costs category accordion
    Then user does not see the second contract costs category contents
    # Scenario 3:
    Given user is on "Contract Details" page
    When user logs out of the app
    And user with view rights logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user views the contract
    Then user does not see the add costs button
    And user does not see the delete all costs button
    And user sees the first contract costs category accordion expanded and its contents without the write options
    When user uses column filters to filter the first contract costs category data
    And user hovers over a certain cell that is not empty in the contract costs table
    Then user sees the view icon beside the contract cost data

  @Regression
  Scenario: APT-1436: 23. As a Product team member, I want to delete all cost information in a contract
    # Additional Scenario: APT-1437: 24. As a Product team member, I want to delete cost for a specific CATEGORY1 in a contract
    # Additional Scenario: APT-1438: 25. As a Product team member, I want to delete cost for a specific GUEST CONFIGURATION in a contract
    # Additional Scenario: APT-1439: 26. As a Yield team member, I want to delete a single cost record in a contract
    # Additional Scenario: APT-1545: 28. As a Product team member, I do NOT want to be able to "Delete All Costs" when the contract is used in packages/bookings
    # Additional Scenario: APT-2029: 39. Delete a row of costs in Cost Table
    # Additional Scenario: APT-2834: Deleting cost against a guest configuration across all categories should only delete it for matching categories
    # Scenario for APT-1545:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user decides to delete all costs of the contract
    Then user sees error message "Costs cannot be deleted, as this contract is used in a package or a booking."
    When user cancels the update of the contract
    And user copies the contract
    And user provides a new name for the contract
    When user saves the contract
    Then user sees feedback message Contract ID has been "created successfully." displayed
    # Scenario for APT-2029:
    Given user is on "Contract Details" page
    When user decides to delete a row of costs
    Then user sees a confirmation message for the deletion of the row of costs
    When user cancels the deletion of the row of costs
    Then user sees the row of costs is not deleted
    When user decides to delete a row of costs
    And user confirms the deletion of the row of costs
    Then user sees the row of costs is deleted
    # Scenario for APT-1439:
    Given user is on "Contract Details" page
    When user hovers over a certain cell that is not empty in the contract costs table
    And user deletes the contract cost
    And user cancels the deletion of the contract cost
    Then user sees the contract cost is not deleted
    When user hovers over a certain cell that is not empty in the contract costs table
    And user deletes the contract cost
    And user confirms the deletion of the contract cost
    Then user sees the contract cost is deleted
    # Scenario for APT-1438:
    # And Scenario for APT-2834:
    Given user is on "Contract Details" page
    When user decides to delete a guest configuration of the cost category
    And user cancels the deletion of the guest configuration of the cost category
    Then user sees the guest configuration of the cost category is not deleted
    When user decides to delete a guest configuration of the cost category
    And user chooses to delete the guest configuration for the cost category only
    Then user sees the guest configuration for the cost category is deleted
    When user decides to delete a guest configuration of the cost category
    And user chooses to delete the guest configuration for all cost categories
    Then user sees the guest configuration for all cost categories is deleted
    # Scenario for APT-1437:
    Given user is on "Contract Details" page
    When user decides to delete a contract cost category
    And user cancels the deletion of the contract cost category
    Then user sees the contract cost category is not deleted
    When user decides to delete a contract cost category
    And user confirms the deletion of the contract cost category
    Then user sees the contract cost category is deleted
    # Scenario for APT-1436:
    Given user is on "Contract Details" page
    When user decides to delete all prices of the contract
    And user confirms the deletion of prices of the contract
    And user decides to delete all costs of the contract
    And user cancels the deletion of the costs
    Then user sees the costs are not deleted
    When user decides to delete all costs of the contract
    And user confirms the deletion of costs of the contract
    Then user sees the costs of the contract are deleted
    And user sees the delete all costs button disabled

  #	@Regression-Disabled
  #	Scenario: APT-1453: 01. As a Product team member, I want to arrive at COST RECORD POP-UP in a contract
  #		# Additional Scenario: APT-1455: 02. As a Product team member, I want to specify BASIC cost information of a cost record in a contract
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the add new contract cost popup
  #		# Scenario 2:
  #		Given user is on "Contract Details" page
  #		When user closes the add new contract cost popup
  #		And user toggles the hide past dates option
  #		And user uses column filters to filter the first contract costs category data
  #		And user hovers over a certain cell that is not empty in the contract costs table
  #		And user edits the contract cost
  #		Then user sees the edit contract cost popup
  #		# Scenario 3:
  #		Given user is on "Contract Details" page
  #		When user closes the edit contract cost popup
  #		And user logs out of the app
  #		And user with view rights logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user views the contract
  #		And user uses column filters to filter the first contract costs category data
  #		And user hovers over a certain cell that is not empty in the contract costs table
  #		And user views the contract cost
  #		Then user sees the view contract cost popup
  #
  @Regression
  Scenario: APT-1465: 19. As a Product team member, I want to indicate that GST has been specified for a cost in a contract
    # Additional Scenario: APT-1466: 20. As a Product team member, I want to indicate that share is allowed on twin rooms for a cost in a contract
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    Then user sees the guest configuration with gst with a coloured dot and also the legend explaining the coloured dot means
    # Scenario for APT-1466:
    Given user is on "Contract Details" page
    Then user sees the guest configuration twin with double coloured dots and also the legend explaining the coloured dot means

  @Regression
  Scenario: APT-1488: 14. As a Product team member, I want MEAL PLAN to be displayed in Cost Tables for each CATEGORY, depending on contract type
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    Then user sees the meal plan
    When user cancels the update of the contract
    And user finds a contract by id
    And user updates the contract
    And user toggles the hide past dates option
    Then user does not see the meal plan

  @Regression
  Scenario: APT-1490: 16. As a Product team member, I want PAX number to be displayed in Cost Tables, depending on contract type
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    Then user sees the guest configuration with defined pax number

  @Regression
  Scenario: APT-1498: 05. As a Product team member, I want to search for supplier and select from a list of matching suppliers, when creating or editing the contract
    # Scenario 1:
    # And Scenario 2:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user decides to add a new contract
    And user selects a supplier for the contract
    Then user sees the selected supplier for the contract in the supplier field

  @Regression
  Scenario: APT-1499: 06. As a Product team member, I want to  search for city and select from a list of matching cities, when creating or editing the contract
    # Scenario 3: Cosmetic
    # Scenario 4: Cosmetic
    # Scenario 5: Cosmetic
    # Scenario 6: Cosmetic
    # Scenario 7: Cosmetic
    # Scenario 1:
    # And Scenario 2:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user decides to add a new contract
    And user selects a city for the contract
    Then user sees the selected city for the contract in the city field

  #	@Regression-Disabled
  #	Scenario: APT-1524: 27. As a Product team member, I do NOT want the cost table to be grouped by CATEGORY1 when contract type is FOREIGN OPERATOR/LAND
  #		# Additional Scenario: APT-1718: 11. As a Product team member, I do NOT want the price table to be grouped by CATEGORY1 when contract type is FOREIGN OPERATOR/LAND
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract with type foreign operator / land and with contract costs
  #		And user updates the contract
  #		And user toggles the hide past dates option
  #		Then user does not see contract cost category grouped
  #		When user toggles the hide past dates option for the contract prices
  #		Then user sees the contract prices content of the contract with type foreign operator / land while editing
  #		And user sees the contract prices add prices and delete all prices buttons
  #		When user cancels the update of the contract
  #		And user copies the contract
  #		Then user sees the contract prices content of the contract with type foreign operator / land while copying
  #		And user does not see the contract prices add prices and delete all prices buttons
  #		# Scenario 2:
  #		Given user is on "Contract Details" page
  #		When user logs out of the app
  #		And user with view rights logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract with type foreign operator / land and with contract costs
  #		And user views the contract
  #		Then user does not see contract cost category grouped
  #		And user sees the contract prices content without the write options
  #		And user does not see the contract prices add prices and delete all prices buttons
  #
  #	@Regression-Disabled
  #	Scenario: APT-1549: 08. As a Product team member, I want MINIMUM PAX and MAXIMUM PAX fields in a cost record to only accept numbers greater than zero
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user finds a contract by id
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user puts alphabets, special characters, negative numbers, and decimals in the minimum and maximum pax fields
  #		Then user sees that the minimum and maximum pax fields does not accept alphabets, special characters, negative numbers, and decimals
  #		# Scenario 2:
  #		Given user is on "Contract Details" page
  #		When user puts zero in both the minimum and maximum pax fields
  #		Then user sees error message "Minimum Pax only accepts numbers greater than zero."
  #		And user sees error message "Maximum Pax only accepts numbers greater than zero."
  #		# Scenario 3:
  #		# And Scenario 4:
  #		Given user is on "Contract Details" page
  #		When user enters minimum pax greater than maximum pax
  #		Then user sees error message "Minimum Pax cannot be greater than Maximum Days."
  #		And user does not see the error message "Minimum Pax only accepts numbers greater than zero."
  #
  #	@Regression-Disabled
  #	Scenario: APT-1559: 09. As a Product team member, I want MAXIMUM CHILD AGE field in a cost record to only accept numbers
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user puts alphabets, special characters, negative numbers, and decimals in the maximum child age field
  #		Then user sees that the maximum child age field does not accept alphabets, special characters, negative numbers, and decimals
  #
  #	@Regression-Disabled
  #	Scenario: APT-1560: 03. As a Product team member, I want GUEST CONFIGURATION dropdown box in a cost record to list applicable values depending on contract type
  #		# Scenario 5: Attached to APT-1579
  #		# Scenario 2:
  #		# And Scenario 4:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for contracts with type "Cruise" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user opens the guest configuration dropdown
  #		Then user does not see the options per person and per item
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Foreign Operator / Land" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user opens the guest configuration dropdown
  #		Then user does not see the options per person and per item
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Hotel" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user opens the guest configuration dropdown
  #		Then user does not see the options per person and per item
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Rail" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user opens the guest configuration dropdown
  #		Then user does not see the options per person and per item
  #		# Scenario 1:
  #		# And Scenario 3:
  #		Given user is on "Contract Details" page
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Transfer" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user opens the guest configuration dropdown
  #		Then user sees the options are per person and per item
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Coach" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user opens the guest configuration dropdown
  #		Then user sees the options are per person and per item
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Miscellaneous" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user opens the guest configuration dropdown
  #		Then user sees the options are per person and per item
  #
  #	@Regression-Disabled
  #	Scenario: APT-1562: 05. As a Product team member, I do NOT want to specify CATEGORY1 in a cost record when contract type is FOREIGN OPERATOR/LAND
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract with type foreign operator / land and with contract costs
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the category 1 dropdown is empty and disabled
  #		# Scenario 3:
  #		Given user is on "Contract Details" page
  #		When user closes the add new contract cost popup
  #		And user toggles the hide past dates option
  #		And user hovers over a certain cell that is not empty in the contract costs table
  #		And user edits the contract cost
  #		Then user sees the category 1 dropdown is empty and disabled
  #		# Scenario 2:
  #		Given user is on "Contract Details" page
  #		When user closes the edit contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the category 1 dropdown is enabled
  #		# Scenario 4:
  #		Given user is on "Contract Details" page
  #		When user closes the add new contract cost popup
  #		And user toggles the hide past dates option
  #		And user hovers over a certain cell that is not empty in the contract costs table
  #		And user edits the contract cost
  #		Then user sees the category 1 dropdown is enabled
  #		# Scenario 5:
  #		Given user is on "Contract Details" page
  #		When user closes the edit contract cost popup
  #		And user logs out of the app
  #		And user with view rights logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract with type foreign operator / land and with contract costs
  #		And user views the contract
  #		And user hovers over a certain cell that is not empty in the contract costs table
  #		And user views the contract cost
  #		Then user does not see the category 1 field
  #		# Scenario 6:
  #		Given user is on "View" page
  #		When user closes the view contract cost popup
  #		And user closes the view contract page
  #		And user resets the search filters
  #		And user searches for a contract by id
  #		And user views the contract
  #		And user uses column filters to filter the first contract costs category data
  #		And user hovers over a certain cell that is not empty in the contract costs table
  #		And user views the contract cost
  #		Then user sees the category 1 field
  #
  #	@Regression-Disabled
  #	Scenario: APT-1565: 06. As a Product team member, I want CATEGORY2 dropdown box in a cost record to list applicable values depending on contract type
  #		# Scenario 1: Database
  #		# Scenario 2: Database
  #		# Scenario 3: Database
  #		# Scenario 4: Database
  #		# Scenario 5: Database
  #		# Scenario 6: Database
  #		# Scenario 7:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		When user selects "ROW" option as the category 2
  #		Then user sees "ROW" as the category 2 value for the contract cost
  #
  #	@Regression-Disabled
  #	Scenario: APT-1566: 07. As a Product team member, I want MINIMUM PAX and MAXIMUM PAX fields in a cost record to display appropriate label names depending on contract type
  #		# Scenario 1:
  #		# And Scenario 4:
  #		# And Scenario 7:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for contracts with type "Hotel" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the minimum and maximum nights fields
  #		# Scenario 2:
  #		# And Scenario 5:
  #		# And Scenario 8:
  #		Given user is on "Contract Details" page
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Cruise" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the minimum and maximum days fields
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Rail" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the minimum and maximum days fields
  #		# Scenario 3:
  #		# And Scenario 6:
  #		# And Scenario 9:
  #		Given user is on "Contract Details" page
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Coach" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the minimum and maximum pax fields
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Foreign Operator / Land" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the minimum and maximum pax fields
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Transfer" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the minimum and maximum pax fields
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Miscellaneous" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the minimum and maximum pax fields
  #
  #	@Regression-Disabled
  #	Scenario: APT-1571: 10. As a Product team member, I want to specify ALLOTMENT CODE for a cost item in a contract
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the allotment code is "FREESALE"
  #		# Scenario 2:
  #		Given user is on "Contract Details" page
  #		When user selects "Twin" option as the guest configuration
  #		And user selects "Superior Mountain Side Room" option as the category 1
  #		And user selects "DBB" option as the category 2
  #		Then user sees the allotment code is "HBAGRASM RT12"
  #		# Scenario 3:
  #		Given user is on "Contract Details" page
  #		When user closes the add new contract cost popup
  #		And user toggles the hide past dates option
  #		And user uses column filters to filter the first contract costs category data
  #		And user hovers over a certain cell that is not empty in the contract costs table
  #		And user edits the contract cost
  #		Then user sees the allotment code is "HBAGRA"
  #		# Scenario 4:
  #		# And Scenario 5:
  #		Given user is on "Contract Details" page
  #		When user closes the edit contract cost popup
  #		And user opens the add new contract cost popup
  #		And user puts "APT" in the allotment field
  #		Then user sees the list of suggestions for the allotment code with the inventory pool
  #		When user selects one from the list of suggestions for the allotment code
  #		Then user sees the allotment code is "ADELS LUNCH"
  #		And user does not see the list of suggestions for the allotment code
  #		# Scenario 6:
  #		Given user is on "Contract Details" page
  #		When user puts "APT" in the allotment field
  #		And user selects "Double" option as the guest configuration
  #		Then user does not see the list of suggestions for the allotment code
  #		# Scenario 7:
  #		Given user is on "Contract Details" page
  #		When user puts "TESTAPT" in the allotment field
  #		Then user sees the allotment code is "TESTAPT"
  #
  #	@Regression-Disabled
  #	Scenario: APT-1579: 04. As a Yield team member, I want SHARE ALLOWED checkbox to be disabled when not applicable
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user selects "Twin" option as the guest configuration
  #		Then user sees the share allowed box is enabled
  #		When user selects "Triple" option as the guest configuration
  #		Then user sees the share allowed box is enabled
  #		When user selects "Crew - Twin" option as the guest configuration
  #		Then user sees the share allowed box is enabled
  #		# Scenario 2:
  #		Given user is on "Contract Details" page
  #		When user selects "Double" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Single" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Crew - Single" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Twin - 1 Adult & 1 Child" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Triple - 2 Adults & 1 Child" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Triple - 1 Adult & 2 Children" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Quad" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Quad - 2 Adults & 2 Children" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Crew - Double" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Crew - Quad" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Multi Share" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #		When user selects "Crew - Multi Share" option as the guest configuration
  #		Then user sees the share allowed box is disabled
  #
  #	@Regression-Disabled
  #	Scenario: APT-1580: 11. As a Product team member, I want QUANTITY field in a cost record to only accept numbers
  #		# Scenario 1:
  #		# And Scenario 2:
  #		# And Scenario 3:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user puts alphabets, special characters, negative numbers, and decimals in the quantity field
  #		Then user sees that the quantity field does not accept alphabets, special characters, negative numbers, and decimals
  #
  #	@Regression-Disabled
  #	Scenario: APT-1582: 14. As a Product team member, I want set default value of RATE TYPE depending on contract type
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for contracts with type "Cruise" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the contract cost rate type is defaulted to "Per Duration"
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Rail" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the contract cost rate type is defaulted to "Per Duration"
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Foreign Operator / Land" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the contract cost rate type is defaulted to "Per Duration"
  #		# Scenario 2:
  #		Given user is on "Contract Details" page
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Coach" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the contract cost rate type is defaulted to "Per Day"
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Hotel" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the contract cost rate type is defaulted to "Per Day"
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Transfer" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the contract cost rate type is defaulted to "Per Day"
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Miscellaneous" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the contract cost rate type is defaulted to "Per Day"
  #
  @Regression
  Scenario: APT-1611: 29. As a Yield team member, I want DEPARTMENT dropdown to be disabled when not applicable
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user decides to add a new contract
    Then user sees the department dropdown is empty and disabled
    # Scenario 2: Database
    # Scenario 3:
    # And Scenario 4:
    Given user is on "Contract Details" page
    When user selects an office for the contract
    Then user sees the department dropdown is enabled
    When user opens the department dropdown
    Then user sees the department dropdown options that is based on the office selected
    # Scenario 5:
    Given user is on "Contract Details" page
    When user selects an empty office for the contract
    Then user sees the department dropdown is empty and disabled

  #@Regression-Disabled
  #Scenario: APT-1620: 01. As a Product team member, I want to arrive at CREATE BULK COSTS POP-UP in a contract
  # Additional Scenario: APT-1621: 02. As a Product team member, I want certain dropdown values in CREATE BULK COSTS POP-UP to be populated depending on selected ROOM TYPE
  # Additional Scenario: APT-1814: 06. As a Product team member, I want cost fields in CREATE BULK COSTS POP-UP to only allow numbers
  # Scenario 1:
  #Given user opens browser
  #When user logs into app
  #And user navigates to contracts page
  #And user searches for a contract by id
  #And user updates the contract
  #Then user sees the create bulk costs popup icon
  # Scenario 2:
  #Given user is on "Contract Details" page
  #When user opens the create bulk costs popup
  #Then user sees the create bulk costs popup
  # Scenario 3:
  #Given user is on "Contract Details" page
  #Then user sees the create bulk costs popup fields and its default values
  # Scenario 4:
  # And Scenario 5:
  #Given user is on "Contract Details" page
  #When user selects "3 Star Room" as the room type in the create bulk costs popup
  #Then user sees the meal / pax configuration and meal plans fields are enabled
  #When user selects "Select" as the room type in the create bulk costs popup
  #Then user sees the meal / pax configuration and meal plans fields are disabled
  # Scenario 6:
  # And Scenario 7:
  #Given user is on "Contract Details" page
  #When user enters 3 new date ranges in the create bulk costs popup
  #Then user sees the newly added date ranges along with the delete button in the create bulk costs popup
  # Scenario 8:
  #Given user is on "Contract Details" page
  #Then user sees the date range fields and add date range button disabled in the create bulk costs popup
  # Scenario 9:
  #Given user is on "Contract Details" page
  #When user deletes a date range in the create bulk costs popup
  #Then user sees the date range fields and add date range button enabled in the create bulk costs popup
  # Scenario for APT-1814:
  #Given user is on "Contract Details" page
  #When user selects "3 Star Room" as the room type in the create bulk costs popup
  #And user enters "-!@#$%^&*()=_[]{}|;:,<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" at the "Room Only Twin" adult cost field in the create bulk costs popup
  #Then user sees that the cost fields does not accept alphabets, and special characters in the create bulk costs popup
  #When user enters "12.34" at the "Room Only Twin" adult cost field in the create bulk costs popup
  #Then user sees that the cost fields does accept decimals in the create bulk costs popup
  #
  #	@Regression-Disabled
  #	Scenario: APT-1635: 12. As a Product team member, I want NUMBER OF DAYS field to be disabled when not applicable
  #		# Additional Scenario: APT-1581: 13. As a Product team member, I want NUMBER OF DAYS field in a cost record to only accept numbers
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		Then user sees the number of days field is disabled and the default value is empty
  #		# Scenario 2:
  #		Given user is on "Contract Details" page
  #		When user closes the add new contract cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Miscellaneous" and on loading status
  #		And user updates the contract
  #		And user opens the add new contract cost popup
  #		And user changes the contract cost rate type to "Per Duration"
  #		Then user sees the number of days field is enabled and the default value is 1
  #		When user puts alphabets, special characters, negative numbers, and decimals in the number of days field
  #		Then user sees that the number of days field does not accept alphabets, special characters, negative numbers, and decimals
  #		# Scenario 3:
  #		Given user is on "Contract Details" page
  #		When user changes the contract cost rate type to "Per Day"
  #		Then user sees the number of days field is disabled and the default value is empty
  #
  @Regression
  Scenario: APT-1645: 01. As a Product team member, I want to view PRICE information for a selected contract
    # Additional Scenario: APT-1655: 04. As a Product team member, I want to indicate that Non-Commission has been specified for a price in a contract
    # Additional Scenario: APT-1656: 05. As a Product team member, I want action icons to be displayed in a cell in the price table when I hover on the cell
    # Additional Scenario: APT-1657: 06. As a Product team member, I want to navigate between pages in Price Tables in contract prices accordion
    # Additional Scenario: APT-2484: Price Tables should display prices as gst exclusive
    # Additional Scenario: APT-3303: Price accordion Changes for Foreign Operator, Coach, Misc and Transfer
    # Scenario 1:
    # And Scenario 3:
    # And Scenario 4:
    # And Scenario 5:
    # And Scenario 6:
    # And Scenario 7:
    # And Scenario for APT-2484:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with contract prices
    And user updates the contract
    Then user sees the buttons of the contract price section
    When user toggles the hide past dates option for the contract prices
    And user uses column filters to filter the first contract prices category data
    Then user sees the first contract prices category accordion expanded and its contents
    When user expands the second contract price category
    Then user sees the second contract price category contents
    #		And user sees the price that is non commission with a coloured dot and also the legend explaining the coloured dot means
    When user collapses the second contract price category
    Then user does not see the second contract price category contents
    When user hovers over a certain cell that is not empty in the contract prices table
    Then user sees the edit and delete icons beside the contract price data
    # Scenario 2:
    Given user is on "Contract Details" page
    When user logs out of the app
    And user with view rights logs into app
    And user navigates to contracts page
    And user searches for a contract with contract prices
    And user views the contract
    Then user sees the contract price section and its contents without the write options
    When user hovers over a certain cell that is not empty in the contract prices table
    Then user sees the view icon beside the contract price data

  @Regression
  Scenario: APT-1658: 23. 07. As a Product team member, I want to delete all price information in a contract
    # Additional Scenario: APT-1659: 08. As a Product team member, I want to delete price for a specific CATEGORY1 in a contract
    # Additional Scenario: APT-1660: 09. As a Product team member, I want to delete price for a specific GUEST CONFIGURATION in a contract
    # Additional Scenario: APT-1661: 10. As a Product team member, I want to delete a single price record in a contract
    # Additional Scenario: APT-1719: 12. As a Product team member, I do NOT want to be able to "Delete All Price" when the contract is used in packages/bookings
    # Additional Scenario: APT-2030: 17. Delete a row of prices in Price Table
    # Additional Scenario: APT-2237: Don't close Price accordions when Deleting Guest Config or inline deleting of a specific Price
    # Scenario for APT-1719:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with contract prices
    And user updates the contract
    And user decides to delete all prices of the contract
    Then user sees error message "Price cannot be deleted, as this contract is used in a package or a booking."
    When user cancels the update of the contract
    And user copies the contract
    And user provides a new name for the contract
    When user saves the contract
    Then user sees feedback message Contract ID has been "created successfully." displayed
    # Scenario for APT-2030:
    Given user is on "Contract Details" page
    When user toggles the hide past dates option for the contract prices
    And user uses column filters to filter the first contract prices category data
    And user decides to delete a row of prices
    And user disregards the deletion of the row of prices
    Then user sees the row of prices is not deleted
    When user decides to delete a row of prices
    And user confirms the deletion of the row of prices
    Then user sees the row of prices is deleted
    # Scenario for APT-1661:
    Given user is on "Contract Details" page
    When user hovers over a certain cell that is not empty in the contract prices table
    And user deletes the contract price
    And user cancels the deletion of the contract price
    Then user sees the contract price is not deleted
    When user hovers over a certain cell that is not empty in the contract prices table
    And user deletes the contract price
    And user confirms the deletion of the contract price
    Then user sees the contract price is deleted
    # Scenario for APT-1660:
    Given user is on "Contract Details" page
    When user decides to delete a guest configuration of the price category
    And user cancels the deletion of the guest configuration of the price category
    Then user sees the guest configuration of the price category is not deleted
    When user decides to delete a guest configuration of the price category
    And user chooses to delete the guest configuration for the price category only
    Then user sees the guest configuration for the price category is deleted
    When user decides to delete a guest configuration of the price category
    And user chooses to delete the guest configuration for all price categories
    Then user sees the guest configuration for all price categories is deleted
    # Scenario for APT-1659:
    Given user is on "Contract Details" page
    When user decides to delete a contract price category
    And user cancels the deletion of the contract price category
    Then user sees the contract price category is not deleted
    When user decides to delete a contract price category
    And user confirms the deletion of the contract price category
    Then user sees the contract price category is deleted
    # Scenario for APT-1658:
    Given user is on "Contract Details" page
    When user decides to delete all prices of the contract
    And user cancels the deletion of the prices
    Then user sees the prices are not deleted
    When user decides to delete all prices of the contract
    And user confirms the deletion of prices of the contract
    Then user sees the prices of the contract are deleted
    And user sees the delete all prices button disabled

  @Regression
  Scenario: APT-1722: 01. Arrive at ADD PRICE POP-UP in a contract
    # Additional Scenario: APT-1736: 02. Price Configuration multi-column Field
    # Scenario 1: ‘Add Price’ pop up
    # And Scenario 2: ‘Add Price’ pop up - Default Display
    # And Scenario 3: ‘Add Price’ pop up - Import from Price
    # And Scenario 4: ‘Add Price’ pop up - Add Custom Dates
    # And Scenario 5: 'Add Price' Field Drop-downs
    # And Scenario 6: Drop-down
    # And Scenario 7: Currency Drop-down filter
    # And Scenario 8: Add Price is only enabled for Pending or Loading Contracts
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract price popup
    Then user sees the contract price popup import from cost option contents
    When user toggles the import from price option of the contract price popup
    Then user sees the contract price popup import from price option contents
    When user opens the contract price add custom dates section
    Then user sees the contract price popup add custom dates section contents
    When user opens the contract price import dates section
    And user toggles the import from cost option of the contract price popup
    And user searches for the contract price configuration with "Sing" as the guest configuration, "Superior Mountain" as the category 1 and "DBB" as the category 2
    And user selects the top price configuration search result in the list
    Then user sees the contract price configuration with "Single" as the guest configuration, "Superior Mountain Side Room" as the category 1 and "DBB" as the category 2
    When user ticks the "NZD" option of the contract price import dates currency dropdown
    Then user sees the contract price import dates currency dropdown contains "AUD, NZD"

  @Regression
  Scenario: APT-1733: 29. As a Product team member, I want to INLINE-EDIT a cost in the COST TABLE for a contract
    # Additional Scenario: APT-2158: While in-line editing a cost, the user should be able to add a number less than zero with the 'negative' symbol
    # Scenario 1: APT-1424
    # Scenario 2:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user toggles the hide past dates option
    And user expands the first contract costs category accordion
    And user uses column filters to filter the first contract costs category data
    And user clicks a certain cell in the contract costs table
    Then user sees the save and cancel icons beside the contract cost data
    # Scenario 3:
    # And Scenario 4:
    # And Scenario 6:
    Given user is on "Contract Details" page
    When user provides "ABCDEFGHIJKLMNOPQRSTUVWXYZ" as the contract cost
    And user saves the contract cost
    Then user sees the contract cost cannot be saved
    When user provides "!@#$%^&*()_+-=[]{};:,.<>?/" as the contract cost
    And user saves the contract cost
    Then user sees the contract cost cannot be saved
    When user hits the escape key
    And user clicks a certain cell in the contract costs table
    Then user sees the save and cancel icons beside the contract cost data
    When user clicks outside the contract cost data
    Then user does not see the save and cancel icons beside the contract cost data
    # Scenario 5:
    # And Scenario for APT-2158:
    Given user is on "Contract Details" page
    When user clicks a certain cell in the contract costs table
    And user provides "-999" as the contract cost
    And user saves the contract cost
    #		Then user sees feedback message "Cost has been updated for Contract 53 successfully."
    When user uses column filters to filter the first contract costs category data
    Then user sees the contract cost is changed to "-999.00"
    When user clicks a certain cell in the contract costs table
    And user provides "106.14" as the contract cost
    And user saves the contract cost
    And user uses column filters to filter the first contract costs category data
    Then user sees the contract cost is changed to "106.14"

  @Regression
  Scenario: APT-1737: 13. As a Product team member, I want to INLINE-EDIT a price in the PRICE TABLE for a contract
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with contract prices
    And user updates the contract
    And user toggles the hide past dates option for the contract prices
    And user uses column filters to filter the first contract prices category data
    Then user sees the first contract prices category accordion expanded and its contents
    When user hovers over a certain cell that is not empty in the contract prices table
    Then user sees the edit and delete icons beside the contract price data
    # Scenario 2:
    # And Scenario 3:
    # And Scenario 4:
    # And Scenario 6:
    Given user is on "Contract Details" page
    When user clicks a certain cell in the contract prices table
    And user provides "ABCDEFGHIJKLMNOPQRSTUVWXYZ" as the contract price
    And user saves the contract price
    Then user sees the contract price cannot be saved
    When user provides "!@#$%^&*()_+-=[]{};:,.<>?/" as the contract price
    And user saves the contract price
    Then user sees the contract price cannot be saved
    When user hits the escape key
    And user clicks a certain cell in the contract prices table
    Then user sees the save and cancel icons beside the contract price data
    When user clicks outside the contract price data
    Then user does not see the save and cancel icons beside the contract price data
    # Scenario 5:
    Given user is on "Contract Details" page
    When user clicks a certain cell in the contract prices table
    And user provides "999" as the contract price
    And user saves the contract price
    #		Then user sees feedback message "Price has been updated for Contract 59963 successfully."
    When user uses column filters to filter the first contract prices category data
    Then user sees the contract price is changed to "999.00"
    When user uses column filters to filter the first contract prices category data
    And user clicks a certain cell in the contract prices table
    And user provides "400" as the contract price
    And user saves the contract price
    And user uses column filters to filter the first contract prices category data
    Then user sees the contract price is changed to "400.00"

  #	@Regression-Disabled
  #	Scenario: APT-1759: 02. As a Product team member, I want to specify parameters in IMPORT DATES POP-UP in the interest of creating price information in a contract
  #		# Additional Scenario: APT-1766: 08. As a Product team member, I want to IMPORT DATES using IMPORT DATES POP-UP
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user copies the contract
  #		And user provides a new name for the contract
  #		And user saves the contract
  #		And user opens the import dates from price popup
  #		Then user sees the import dates from price popup fields and buttons
  #		# Scenario 2:
  #		Given user is on "Contract Details" page
  #		When user searches for a specific cost configuration for the import dates from price
  #		Then user sees the specific cost configuration for the import dates from price
  #		# Scenario 3:
  #		# And Scenario 4:
  #		Given user is on "Contract Details" page
  #		Then user sees the twin guest configuration radio button is not toggled in the import dates from price popup
  #		# Scenario 5:
  #		# And Scenario 6:
  #		Given user is on "Contract Details" page
  #		When user selects few currencies for the import dates from price
  #		Then user sees the selected currencies displayed in the import dates from price popup
  #		# Scenario for APT-1766:
  #		Given user is on "Contract Details" page
  #		When user provides information for the import dates from price but leaves some fields empty
  #		And user decides to import the dates from price
  #		Then user sees error message "This is a mandatory field."
  #		When user provides valid information for the import dates from price
  #		Then user does not see the error message "This is a mandatory field."
  #		When user decides to import the dates from price
  #		Then user sees feedback message "Dates have been imported from Costs successfully."
  #		When user opens the import dates from price popup
  #		And user closes the import dates from price popup
  #		Then user does not see the import dates from price popup
  #
  #	@Regression-Disabled
  #	Scenario: APT-1760: 03. As a Product team member, I do NOT want to specify IMPORT FROM parameters in IMPORT DATES POP-UP for certain contract types
  #		# Scenario 2:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for contracts with type "Hotel" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from price popup
  #		Then user sees respective guest configuration is selected by default
  #		And user sees radio buttons in import dates from price popup is enabled
  #		When user closes the import dates from price popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Foreign Operator / Land" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from price popup
  #		Then user sees respective guest configuration is selected by default
  #		And user sees radio buttons in import dates from price popup is enabled
  #		When user closes the import dates from price popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Cruise" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from price popup
  #		Then user sees respective guest configuration is selected by default
  #		And user sees radio buttons in import dates from price popup is enabled
  #		When user closes the import dates from price popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Rail" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from price popup
  #		Then user sees respective guest configuration is selected by default
  #		And user sees radio buttons in import dates from price popup is enabled
  #		# Scenario 1:
  #		Given user is on "Contract Details" page
  #		When user closes the import dates from price popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Coach" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from price popup
  #		Then user sees respective guest configuration is selected by default
  #		And user sees radio buttons in import dates from price popup is disabled
  #		When user closes the import dates from price popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Miscellaneous" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from price popup
  #		Then user sees respective guest configuration is selected by default
  #		And user sees radio buttons in import dates from price popup is disabled
  #		When user closes the import dates from price popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Transfer" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from price popup
  #		Then user sees respective guest configuration is selected by default
  #		And user sees radio buttons in import dates from price popup is disabled
  #
  #	@Regression-Disabled
  #	Scenario: APT-1764: 05. As a Product team member, I want PRICE an NON-COMMISSION fields in IMPORT DATES POP-UP to only allow numbers
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the import dates from price popup
  #		And user puts "!@#$%^&*()=_[]{}|;:,<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into the price field in the import dates from price popup
  #		Then user sees that the price field does not accept alphabets, and special characters in the import dates from price popup
  #		When user puts ".12" into the price field in the import dates from price popup
  #		Then user sees that the price field does accept decimals in the import dates from price popup
  #		# Scenario 2: Not Applicable
  #		# Scenario 3:
  #		Given user is on "Contract Details" page
  #		When user puts "-1" into the price field in the import dates from price popup
  #		Then user sees that the price field does accept negative numbers in the import dates from price popup
  #		# Scenario 4:
  #		Given user is on "Contract Details" page
  #		When user puts "!@#$%^&*()=_[]{}|;:,<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into the non-commission field in the import dates from price popup
  #		Then user sees that the non-commission field does not accept alphabets, and special characters in the import dates from price popup
  #		When user puts ".12" into the non-commission field in the import dates from price popup
  #		Then user sees that the non-commission field does accept decimals in the import dates from price popup
  #		# Scenario 5: Not Applicable
  #		# Scenario 6:
  #		Given user is on "Contract Details" page
  #		When user puts "-1" into the non-commission field in the import dates from price popup
  #		Then user sees that the non-commission field does accept negative numbers in the import dates from price popup
  #
  #	@Regression-Disabled
  #	Scenario: APT-1765: 06. As a Product team member, I want COMMISSION fields in IMPORT DATES POP-UP to only accept percentages between 0 and 100
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the import dates from price popup
  #		And user puts "!@#$%^&*()=_[]{}|;:,<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into the minimum commission field in the import dates from price popup
  #		And user puts "!@#$%^&*()=_[]{}|;:,<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into the maximum commission field in the import dates from price popup
  #		Then user sees that the minimum and maximum commission fields does not accept alphabets, and special characters in the import dates from price popup
  #		When user puts ".1" into the minimum commission field in the import dates from price popup
  #		And user puts ".2" into the maximum commission field in the import dates from price popup
  #		Then user sees that the minimum and maximum commission fields does accept decimals in the import dates from price popup
  #		# Scenario 2: Not Applicable
  #		# Scenario 3:
  #		Given user is on "Contract Details" page
  #		When user puts "101" into the minimum commission field in the import dates from price popup
  #		Then user sees error message "Minimum Commission cannot be greater than 100."
  #		When user puts "101" into the maximum commission field in the import dates from price popup
  #		Then user sees error message "Maximum Commission cannot be greater than 100."
  #		# Scenario 4:
  #		Given user is on "Contract Details" page
  #		When user puts "1" into the minimum commission field in the import dates from price popup
  #		Then user does not see the error message "Minimum Commission cannot be greater than 100."
  #		When user puts "100" into the maximum commission field in the import dates from price popup
  #		Then user does not see the error message "Maximum Commission cannot be greater than 100."
  #
  @Regression
  Scenario: APT-1781: 01. Access VIEW PRICE POP-UP in a contract
    # Scenario 1: Accessing ‘View Price’ pop-up
    # And Scenario 2: Accessing ‘View Price’ pop-up for Closed contracts
    # And Scenario 3: ‘View Price’ pop-up Display
    # And Scenario 4: Contract Price table - Default Sort
    # And Scenario 5: Contract Price table - Sort by Currency
    # And Scenario 6: Contract Price table - Sort by Pax Type
    # And Scenario 7: Contract Price table - Sort by Start Date
    # And Scenario 8: Contract Price table - Sort by Price
    # And Scenario 9: Change Filter in Contract Prices table
    # And Scenario 10: Close ‘View Price’ pop-up
    Given user opens browser
    When user with view rights logs into app
    And user navigates to contracts page
    And user searches for a contract with contract prices
    And user views the contract
    And user hovers over a certain cell that is not empty in the contract prices table
    And user views the contract price
    Then user sees the view contract price popup
    When user closes the view contract price popup
    Then user does not see the view contract price popup

  @Regression
  Scenario: APT-1787: 04. User can only specify VALID DATES in ADD PRICE POP-UP
    # Additional Scenario: APT-1788: 03. User can only specify VALID DATES in EDIT PRICE POP-UP
    # Scenario 1: Calendar search or manual date input
    # And Scenario 2: Invalid date format error message
    # And Scenario 3: Re-validation of error message – Invalid date format
    # And Scenario 4: Multiple date formats
    # And Scenario 5: Auto-correct to preferred date format
    # And Scenario 6: Start Date > End Date error message
    # And Scenario 7: Re-validation of error message – Start Date > End Date
    # And Scenario 8: Date falls outside of contract date range error message
    # And Scenario 9: Re-validation of error message – Contract date range
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract price popup
    And user opens the contract price add custom dates section
    And user puts "ABC" in the contract price start date field
    Then user sees error message "Invalid format"
    When user puts "01-09-2020" in the contract price start date field
    Then user does not see the error message "Invalid format"
    When user puts "XYZ" in the contract price end date field
    Then user sees error message "Invalid format"
    When user puts "01/09/2019" in the contract price end date field
    Then user does not see the error message "Invalid format"
    And user sees error message "Start Date cannot be greater than End Date."
    When user puts "01/09/2021" in the contract price end date field
    Then user does not see the error message "Start Date cannot be greater than End Date."
    When user puts "01-09-2001" in the contract price start date field
    Then user sees error message "Date falls outside the date range of the contract."
    When user puts "01 Sep 2002" in the contract price start date field
    Then user does not see the error message "Date falls outside the date range of the contract."

  @Regression
  Scenario: APT-1789: 09. SAVE Price Records from ADD PRICE POP-UP
    # Additional Scenario: APT-1724: 01. Access EDIT PRICE POP-UP in a contract
    # Additional Scenario: APT-1741: 02. Edit Price records in EDIT PRICE POP-UP
    # Additional Scenario: APT-1790: 05. Add new Price records in EDIT PRICE POP-UP
    # Additional Scenario: APT-2874: 07. Save Price changes from EDIT PRICE POP-UP
    # Scenario 1: Can’t save when there are open error messages
    # And Scenario 2: Mandatory fields
    # And Scenario 3: Duplicate price error message
    # And Scenario 4: Successfully Save price
    # And Scenario 5: Cancel the Add Price pop-up - unsaved changes
    # And Scenario 6: Cancel the Add Price pop-up - no changes
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract without costs
    And user updates the contract
    And user opens the add contract costs page
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user opens the add contract costs page
    And user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Half Day" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "Adult" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    And user opens the add date range popup
    And user puts "01 Dec 2005" in the contract cost add date range end date field
    And user adds the new date range
    And user adds the date ranges to the table
    And user saves the contract costs
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user toggles the hide past dates option
    And user expands the first contract costs category accordion
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Per Person" as the guest configuration, "Half Day" as the category 1 and "Adult" as the category 2
    And user selects the top price configuration search result in the list
    And user ticks the include past dates in importing dates for the contract prices
    #		And user ticks the "Adult" option of the contract price import dates from cost pax type dropdown
    And user adds the contract prices import dates from cost to the table
    And user saves the contract prices
    And user hovers over a certain cell that is not empty in the contract prices table
    And user edits the contract price
    Then user sees the edit contract price popup
    When user puts "50" in the contract prices popup contract prices table top price field
    And user puts "50" in the contract prices popup contract prices table top non-commission field
    And user saves the contract prices
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Per Person" as the guest configuration, "Half Day" as the category 1 and "Adult" as the category 2
    And user selects the top price configuration search result in the list
    And user closes the contract prices details popup
    And user cancels the closing of the contract prices details popup
    Then user sees the add contract price popup
    When user closes the contract prices details popup
    And user confirms the closing of the contract prices details popup
    Then user does not see the add contract price popup
    When user opens the add contract price popup
    And user closes the contract prices details popup
    Then user does not see the add contract price popup
    # Cleanup:
    When user decides to delete all prices of the contract
    And user confirms the deletion of prices of the contract
    And user decides to delete all costs of the contract
    And user confirms the deletion of costs of the contract

  #@Regression-Disabled
  #Scenario: APT-1797: 03. As a Product team member, I do NOT want some fields in CREATE BULK COSTS POP-UP to be applicable for certain contract types
  # Scenario 2:
  #Given user opens browser
  #When user logs into app
  #And user navigates to contracts page
  #And user searches for contracts with type "Cruise" and on loading status
  #And user updates the contract
  #And user opens the create bulk costs popup
  #Then user sees the create bulk costs popup fields and its default values for the contract type "Cruise"
  #When user closes the create bulk costs popup
  #And user cancels the update of the contract
  #And user resets the search filters
  #And user searches for contracts with type "Hotel" and on loading status
  #And user updates the contract
  #And user opens the create bulk costs popup
  #Then user sees the create bulk costs popup fields and its default values for the contract type "Hotel"
  #When user closes the create bulk costs popup
  #And user cancels the update of the contract
  #And user resets the search filters
  #And user searches for contracts with type "Rail" and on loading status
  #And user updates the contract
  #And user opens the create bulk costs popup
  #Then user sees the create bulk costs popup fields and its default values for the contract type "Rail"
  # Scenario 1:
  #Given user is on "Contract Details" page
  #When user closes the create bulk costs popup
  #And user cancels the update of the contract
  #And user resets the search filters
  #And user searches for contracts with type "Coach" and on loading status
  #And user updates the contract
  #And user opens the create bulk costs popup
  #Then user sees the create bulk costs popup fields and its default values for the contract type "Coach"
  #When user closes the create bulk costs popup
  #And user cancels the update of the contract
  #And user resets the search filters
  #And user searches for contracts with type "Foreign Operator / Land" and on loading status
  #And user updates the contract
  #And user opens the create bulk costs popup
  #Then user sees the create bulk costs popup fields and its default values for the contract type "Foreign Operator / Land"
  #When user closes the create bulk costs popup
  #And user cancels the update of the contract
  #And user resets the search filters
  #And user searches for contracts with type "Transfer" and on loading status
  #And user updates the contract
  #And user opens the create bulk costs popup
  #Then user sees the create bulk costs popup fields and its default values for the contract type "Transfer"
  #When user closes the create bulk costs popup
  #And user cancels the update of the contract
  #And user resets the search filters
  #And user searches for contracts with type "Miscellaneous" and on loading status
  #And user updates the contract
  #And user opens the create bulk costs popup
  #Then user sees the create bulk costs popup fields and its default values for the contract type "Miscellaneous"
  #
  #@Regression-Disabled
  #Scenario: APT-1798: 04. As a Product team member, I want to specify ALLOTMENT CODE in CREATE BULK COSTS POP-UP in a contract
  # Scenario 1:
  #Given user opens browser
  #When user logs into app
  #And user navigates to contracts page
  #And user searches for a contract by id
  #And user updates the contract
  #And user opens the create bulk costs popup
  #Then user sees the allotment code is "FREESALE" in the create bulk costs popup
  # Scenario 2:
  # And Scenario 4:
  #Given user is on "Contract Details" page
  #When user puts "LOSELEY TOUR" in the allotment field in the create bulk costs popup
  #Then user sees the list of suggestions for the allotment code with the inventory pool in the create bulk costs popup
  #When user selects one from the list of suggestions for the allotment code in the create bulk costs popup
  #Then user sees the allotment code is "LOSELEY TOUR" in the create bulk costs popup
  #And user does not see the list of suggestions for the allotment code in the create bulk costs popup
  # Scenario 3: Cosmetic
  # Scenario 5:
  #Given user is on "Contract Details" page
  #When user puts "LOSELEY TOUR" in the allotment field in the create bulk costs popup
  #And user removes the focus on the field
  #Then user does not see the list of suggestions for the allotment code in the create bulk costs popup
  # Scenario 6:
  #Given user is on "Contract Details" page
  #When user puts "QWERTY" in the allotment field in the create bulk costs popup
  #Then user does not see the list of suggestions for the allotment code in the create bulk costs popup
  #
  #@Regression-Disabled
  #Scenario: APT-1799: 05. As a Product team member, I want to only specify VALID DATES in CREATE BULK COSTS POP-UP in a contract
  # Scenario 1:
  #Given user opens browser
  #When user logs into app
  #And user navigates to contracts page
  #And user searches for a contract by id
  #And user updates the contract
  #And user opens the create bulk costs popup
  #And user clicks on the start date field in the create bulk costs popup
  #Then user sees the calendar popup
  #When user clicks on the end date field in the create bulk costs popup
  #Then user sees the calendar popup
  # Scenario 2:
  #Given user is on "Contract Details" page
  #When user provides dates in unsupported formats in the start and end date fields in the create bulk costs popup
  #Then user sees error message "Invalid format"
  # Scenario 3:
  #Given user is on "Contract Details" page
  #When user empties the start and end date fields in the create bulk costs popup
  #Then user does not see the error message "Invalid format"
  # Scenario 6:
  #Given user is on "Contract Details" page
  #When user provides a date range where the start date is greater than the end date in the create bulk costs popup date fields
  #Then user sees that the add date button is disabled in the create bulk costs popup
  # Scenario 8:
  #Given user is on "Contract Details" page
  #When user provides a date range where the date range is not within the date range of the contract
  #Then user sees error message "Date falls outside the date range of the contract."
  # Scenario 4:
  # And Scenario 5:
  # And Scenario 7:
  # And Scenario 9:
  #Given user is on "Contract Details" page
  #When user provides a valid date range in the create bulk costs popup
  #Then user does not see the error message "Date falls outside the date range of the contract."
  #And user sees that the add date button is enabled in the create bulk costs popup
  #
  #@Regression-Disabled
  #Scenario: APT-1800: 07. As a Product team member, I want cost table in CREATE BULK COSTS POP-UP to depend on selected meal/pax configuration
  # Scenario 4: Not Applicable
  # Scenario 6: Not Applicable
  # Scenario 7: Not Applicable
  # Scenario 9: Not Applicable
  # Scenario 10: Not Applicable
  # Scenario 12: Not Applicable
  # Scenario 13: Not Applicable
  # Scenario 1:
  #Given user opens browser
  #When user logs into app
  #And user navigates to contracts page
  #And user searches for contracts with type "Cruise" and on loading status
  #And user updates the contract
  #And user opens the create bulk costs popup
  #And user selects "AA Superior" as the room type in the create bulk costs popup
  #And user selects "1. Alaska (Single)" as the meal/pax configuration in the create bulk costs popup
  #Then user sees costs table in the create bulk costs popup empty
  #When user selects "1. Alaska (Twin,Dbl,Sgl)" as the meal/pax configuration in the create bulk costs popup
  #Then user sees costs table in the create bulk costs popup empty
  #When user selects "1. Alaska (Twin,Double Only)" as the meal/pax configuration in the create bulk costs popup
  #Then user sees costs table in the create bulk costs popup empty
  # Scenario 2:
  #Given user is on "Contract Details" page
  #When user selects "1. Alaska (Triple)" as the meal/pax configuration in the create bulk costs popup
  #Then user sees the triple field inside the adult column in the costs table in the create bulk costs popup
  # Scenario 3:
  #Given user is on "Contract Details" page
  #When user selects "1. Europe" as the meal/pax configuration in the create bulk costs popup
  #Then user sees the twin, and single fields inside the adult column in the costs table in the create bulk costs popup
  # Scenario 14:
  #Given user is on "Contract Details" page
  #When user selects "1. Spirit (Tpl Adult)" as the meal/pax configuration in the create bulk costs popup
  #Then user sees the triple, and quad fields inside the adult, and child columns in the costs table in the create bulk costs popup
  # Scenario 15:
  #Given user is on "Contract Details" page
  #When user selects "1. Spirit (Tpl Pen)" as the meal/pax configuration in the create bulk costs popup
  #Then user sees the triple, and quad fields in both the pensioner and senior columns while the child field inside the pensioner column only in the costs table in the create bulk costs popup
  # Scenario 16:
  #Given user is on "Contract Details" page
  #When user selects "1. Spirit (Twn Adult)" as the meal/pax configuration in the create bulk costs popup
  #Then user sees the twin, and single fields inside the adult, and child columns in the costs table in the create bulk costs popup
  # Scenario 17:
  #Given user is on "Contract Details" page
  #When user selects "1. Spirit (Twn Pen)" as the meal/pax configuration in the create bulk costs popup
  #Then user sees the twin, and single fields in both the pensioner and senior columns while the child field inside the pensioner column only in the costs table in the create bulk costs popup
  # Scenario 5:
  #Given user is on "Contract Details" page
  #When user closes the create bulk costs popup
  #And user cancels the update of the contract
  #And user resets the search filters
  #And user searches for contracts with type "Hotel" and on loading status
  #And user updates the contract
  #And user opens the create bulk costs popup
  #And user selects "3 Star Room" as the room type in the create bulk costs popup
  #And user selects "1. APT Tour" as the meal/pax configuration in the create bulk costs popup
  #Then user sees the extra person, breakfast, lunch and dinner fields in both the adult and child columns while the room only twin, and room only single fields inside the adult column only in the costs table in the create bulk costs popup
  #When user selects "1. APT Pre/Post" as the meal/pax configuration in the create bulk costs popup
  #Then user sees the extra person, breakfast, lunch and dinner fields in both the adult and child columns while the room only twin, and room only single fields inside the adult column only in the costs table in the create bulk costs popup
  # Scenario 8:
  #Given user is on "Contract Details" page
  #When user selects "1. Europe Pre/Post" as the meal/pax configuration in the create bulk costs popup
  #Then user sees the room only twin, room only single, and breakfast fields inside the adult column in the costs table in the create bulk costs popup
  # Scenario 11:
  #Given user is on "Contract Details" page
  #When user selects "1. Europe Tour Hotel" as the meal/pax configuration in the create bulk costs popup
  #Then user sees the room only twin, room only single, breakfast, and dinner fields inside the adult column in the costs table in the create bulk costs popup
  #
  @Regression
  Scenario: APT-1801: 07. As a Product team member, I want cost table in CREATE BULK COSTS POP-UP to depend on selected meal/pax configuration
    # Scenario 1:
    # And Scenario 2:
    # And Scenario 3:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user copies the contract
    And user provides a new name for the contract
    And user saves the contract
    And user opens the create bulk costs popup
    And user decides to create the costs
    #		Then user sees feedback message "Unable to Create Costs. Please review the error messages below."
    Then user sees error message "This is a mandatory field."
    And user sees error message "At least one date range must be specified."
    # Scenario 5:
    Given user is on "Contract Details" page
    When user closes the create bulk costs popup
    Then user does not see the create bulk costs popup
    # Scenario 4:
    Given user is on "Contract Details" page
    When user opens the create bulk costs popup
    And user provides valid information on all the fields of create bulk costs popup
    And user decides to create the costs
    Then user sees feedback message "Costs have been created successfully."

  @Regression
  Scenario: APT-1806: 06. PRICE and COMMISSION fields validations in ADD PRICES POP-UP
    # Additional Scenario: APT-2013: 07. Auto-calculate Non-Commission field based on values entered in Maximum Commission and Price fields
    # Additional Scenario: APT-2014: 04. PRICE and COMMISSION fields validations in EDIT PRICES POP-UP
    # Additional Scenario: APT-2263: Maximum commission % should be equal or greater than the Minimum Commission %, Non-Commission validation when negative
    # Additional Scenario: APT-2740: 05. In-line Edit of Price Records in ADD PRICE Pop-up
    # Additional Scenario: APT-3342: Contract Add and Edit Price - Non-Commission validation when negative Price and 0 Max commission
    # Scenario 1: ‘Price’ field error message
    # And Scenario 2: Re-validation of error message – Invalid price input
    # And Scenario 3: Accept Price = negative number
    # And Scenario 4: ‘Non-Commission’ error message
    # And Scenario 5: Re-validation of error message – Non Commission
    # And Scenario 6: Accept Non-Commission = negative number
    # And Scenario 7: Min & Max Commission fields - input error message
    # And Scenario 8: Commission <0 error message
    # And Scenario 9: Commission >100 error message
    # And Scenario 10: Re-validation of error message – 0-100 input
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Crew - S" as the guest configuration, "Driver" as the category 1 and "RO" as the category 2
    And user selects the top price configuration search result in the list
    And user opens the contract price add custom dates section
    And user puts "01 Sep 2020" in the contract price start date field
    And user adds the contract prices custom dates to the table
    And user puts "-0.02" in the contract prices popup contract prices table top price field
    Then user sees that the contract prices popup contract prices table top price field contains "-0.02"
    When user puts "-0.03" in the contract prices popup contract prices table top non-commission field
    Then user sees that the contract prices popup contract prices table top non-commission field contains "-0.03"
    And user sees the error message Cannot be greater than Price
    When user puts "-0.01" in the contract prices popup contract prices table top non-commission field
    Then user does not see the error message Cannot be greater than Price
    When user puts "75.01" in the contract prices popup contract prices table top minimum commission field
    Then user sees that the contract prices popup contract prices table top minimum commission field contains "75.01"
    When user puts "10" in the contract prices popup contract prices table top maximum commission field
    Then user sees that the contract prices popup contract prices table top maximum commission field contains "10"
    And user sees the error message Cannot be greater than Max Comm
    #		And user sees the error message Cannot be less than Min Comm
    When user puts "95.01" in the contract prices popup contract prices table top maximum commission field
    And user puts "75.01" in the contract prices popup contract prices table top minimum commission field
    Then user does not see the error message Cannot be greater than Max Comm
    And user does not see the error message Cannot be less than Min Comm
    When user puts "0" in the contract prices popup contract prices table top maximum commission field
    Then user sees that the contract prices popup contract prices table top non-commission field contains "-0.02"
    When user puts "100" in the contract prices popup contract prices table top maximum commission field
    Then user sees that the contract prices popup contract prices table top non-commission field contains "0.00"

  #		When user puts "-0.03" in the contract prices popup contract prices table top non-commission field
  #		And user puts "10" in the contract prices popup contract prices table top price field
  #		Then user sees error message "Cannot be negative"
  #		When user puts "5" in the contract prices popup contract prices table top non-commission field
  #		Then user does not see the error message "Cannot be negative"
  #		When user puts "0" in the contract prices popup contract prices table top maximum commission field
  #		Then user sees that the contract prices popup contract prices table top non-commission field contains "10.00"
  #
  @Regression
  Scenario: APT-1807: 08. Filter and Delete in ADD PRICE pop-up
    # Additional Scenario: APT-1751: 06. Delete Price records in EDIT PRICE POP-UP
    # Additional Scenario: APT-1784: 03. Add Dates manually using the ADD PRICE pop-up
    # Scenario 1: Filter option in Contract Price table
    # And Scenario 2: Filter price records
    # And Scenario 3: Clear price record filter
    # And Scenario 4: Delete a row from Contract Price
    # And Scenario 5: Delete multiple Price records
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Crew - S" as the guest configuration, "Driver" as the category 1 and "RO" as the category 2
    And user selects the top price configuration search result in the list
    And user opens the contract price add custom dates section
    And user puts "" in the contract price start date field
    And user puts "" in the contract price end date field
    #		And user adds the contract prices custom dates to the table
    #		Then user sees error message "*Mandatory field"
    Then user sees the contract prices custom dates add to table button disabled
    When user puts "01 Sep 2020" in the contract price start date field
    And user puts "31 Dec 2050" in the contract price end date field
    And user adds the contract prices custom dates to the table
    And user adds the contract prices custom dates to the table
    Then user sees error message "Duplicate record(s) exists as indicated below."
    When user puts "01 Sep 2021" in the contract price start date field
    And user ticks the "AUD" option of the contract price add custom dates currency dropdown
    And user ticks the "NZD" option of the contract price add custom dates currency dropdown
    And user adds the contract prices custom dates to the table
    And user puts "01 Sep 2022" in the contract price start date field
    And user ticks the "NZD" option of the contract price add custom dates currency dropdown
    And user ticks the "EUR" option of the contract price add custom dates currency dropdown
    And user adds the contract prices custom dates to the table
    Then user sees the contract prices table filters
    When user ticks "01 Sep 2020" in the contract price start date filter field
    And user ticks "01 Sep 2021" in the contract price start date filter field
    And user ticks the checkbox of the top row of the contract price table
    And user decides to delete the selected rows of the contract price table
    And user cancels the deletion of the selected rows of the contract price table
    Then user sees the selected row of the contract price table is not deleted
    When user decides to delete the selected rows of the contract price table
    And user confirms the deletion of the selected rows of the contract price table
    Then user sees the selected row of the contract price table is deleted
    When user puts "Select All" in the contract price start date filter field
    And user ticks the checkbox of all rows of the contract price table
    And user decides to delete the selected rows of the contract price table
    And user cancels the deletion of the selected rows of the contract price table
    Then user sees the selected rows of the contract price table is not deleted
    When user decides to delete the selected rows of the contract price table
    And user confirms the deletion of the selected rows of the contract price table
    Then user sees the selected rows of the contract price table is deleted
    When user opens the contract price import dates section
    Then user sees the contract price popup import from cost option contents

  @Regression
  Scenario: APT-1817: 001. CREATE NEW CONTRACT page and all its contents, validations and functionalities
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    Then user sees the create new contract button
    And user sees the contracts table is defaulted to display 20 records per page
    # Scenario 2:
    # And Scenario 3:
    Given user is on "Contracts" page
    When user changes the number of records to be displayed in the contracts table to 50
    Then user sees the contracts table is displaying 50 records per page
    # Scenario 4:
    Given user is on "Contracts" page
    When user decides to add a new contract
    Then user sees the add new contract page title, fields and its default values

  @Regression
  Scenario: APT-1819: 002. CREATE CONTRACT after validations
    # Scenario 1:
    # And Scenario 2:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user decides to add a new contract
    And user saves the contract
    Then user sees error message "*Mandatory field"
    And user sees feedback message "Unable to create contract. Please review error message(s) below."
    # Scenario 3:
    # And Scenario 5:
    Given user is on "Contract Details" page
    When user provides the basic information of the contract
    And user provides a contract name that is already existing
    And user saves the contract
    And user disregards the saving of the contract with duplicate name
    Then user is on "Contract Details" page
    # Scenario 7:
    # And Scenario 8:
    Given user is on "Contract Details" page
    When user cancels the creation of the new contract
    And user disregards the cancellation of the new contract
    Then user is on "Contract Details" page
    # Scenario 9:
    Given user is on "Contract Details" page
    When user cancels the creation of the new contract
    And user confirms the cancellation of the new contract
    Then user is on "Contracts" page
    # Scenario 10:
    Given user is on "Contracts" page
    When user decides to add a new contract
    And user cancels the creation of the new contract
    Then user is on "Contracts" page
    # Scenario 4:
    Given user is on "Contracts" page
    When user decides to add a new contract
    And user provides the basic information of the contract but with a name that is already existing
    And user saves the contract
    And user confirms the saving of the contract with duplicate name
    Then user sees feedback message Contract ID has been "created successfully." displayed
    And user is on "Contract Details" page
    # Scenario 6:
    Given user is on "Contract Details" page
    When user cancels the update of the contract
    And user decides to add a new contract
    And user provides the basic information of the contract
    And user saves the contract
    Then user sees feedback message Contract ID has been "created successfully." displayed
    And user is on "Contract Details" page

  @Regression
  Scenario: APT-1820: 006. COPY CONTRACT page and all its contents, validations and functionalities
    # Scenario 3:
    # And Scenario 4:
    # And Scenario 5:
    # And Scenario 6:
    # And Scenario 8:
    # And Scenario 11:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract without costs
    And user copies the contract
    Then user sees include costs when copying contract option is disabled and untoggled
    When user saves the contract
    Then user sees error message "*Mandatory field"
    And user sees feedback message "Unable to create contract. Please review error message(s) below."
    When user provides an existing name for the contract
    And user saves the contract
    And user confirms the saving of the contract with duplicate name
    Then user sees feedback message Contract ID has been "created successfully." displayed
    And user sees the newly created contract from copying without contract costs
    # Scenario 1:
    # And Scenario 2:
    Given user is on "Contract Details" page
    When user cancels the update of the contract
    And user searches for a contract by id
    And user copies the contract
    Then user sees the copy contract basic information, options, and costs
    # Scenario 7:
    Given user is on "Contract Details" page
    When user provides an existing name for the contract
    And user saves the contract
    And user confirms the saving of the contract with duplicate name
    Then user sees feedback message Contract ID has been "created successfully." displayed
    And user sees the newly created contract from copying with contract costs
    # Scenario 9:
    Given user is on "Contract Details" page
    When user cancels the update of the contract
    And user searches for a contract by id
    And user copies the contract
    And user provides an existing name for the contract
    And user saves the contract
    And user disregards the saving of the contract with duplicate name
    Then user is on "Contract Details" page
    # Scenario 10:
    Given user is on "Contract Details" page
    When user provides a new name for the contract
    And user saves the contract
    Then user sees feedback message Contract ID has been "created successfully." displayed
    # Scenario 12:
    # And Scenario 13:
    # And Scenario 14:
    Given user is on "Contract Details" page
    When user cancels the update of the contract
    And user searches for a contract by id
    And user copies the contract
    And user provides a new name for the contract
    And user cancels the copying of the contract
    And user disregards the cancellation of the contract duplication
    And user cancels the copying of the contract
    And user confirms the cancellation of the contract duplication
    Then user is on "Contracts" page
    # Scenario 15:
    Given user is on "Contracts" page
    When user searches for a contract by id
    And user copies the contract
    And user cancels the copying of the contract
    Then user is on "Contracts" page

  @Regression
  Scenario: APT-1821: 003. UPDATE CONTRACT page and contents, validations and functionalities in BASIC INFORMATION
    # Scenario 1:
    # And Scenario 2:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the update contract basic information popup
    Then user sees the update contract page title, fields and its values
    # Scenario 3:
    Given user is on "Contract Details" page
    When user cancels the update of the contract basic information
    And user cancels the update of the contract
    Then user is on "Contracts" page

  #	@Regression-Disabled
  #	Scenario: APT-1822: 004. UPDATE CONTRACT BASIC INFORMATION pop-up and all its content, validations and functionalities
  #		# Additional Scenario: APT-2115: Confirmation Wording on Pop up on Update Basic Info Pop Up is not consistent with other modules
  #		# Scenario 1:
  #		# And Scenario 11:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract by id
  #		And user updates the contract
  #		And user opens the update contract basic information popup
  #		Then user sees the update contract page title, fields and its values
  #		And user sees the update contract page contract options fields and its values
  #		# Scenario 2:
  #		# And Scenario 3:
  #		Given user is on "Contract Details" page
  #		When user provides an empty name for the contract
  #		And user saves the update of contract basic information
  #		Then user sees error message "This is a mandatory field."
  #		And user sees feedback message "Unable to update basic information of the contract. Please review error message(s) below."
  #		# Scenario 7:
  #		Given user is on "Contract Details" page
  #		When user provides a new name for the contract
  #		And user saves the update of contract basic information
  #		Then user sees feedback message "Record saved successfully."
  #		#		Then user sees feedback message Contract ID has been "updated successfully." displayed
  #		# Scenario 8:
  #		# And Scenario 9:
  #		# And Scenario 10:
  #		Given user is on "Contract Details" page
  #		When user opens the update contract basic information popup
  #		And user provides a new name for the contract
  #		And user cancels the update of the contract basic information
  #		And user disregards the cancellation of the update of the contract basic information
  #		And user cancels the update of the contract basic information
  #		And user confirms the cancellation of the update of the contract basic information
  #		Then user does not see the update contract basic information popup
  #		# Scenario 4:
  #		# And Scenario 5:
  #		# And Scenario 6:
  #		Given user is on "Contract Details" page
  #		When user opens the update contract basic information popup
  #		And user provides an existing name for the contract
  #		And user saves the update of contract basic information
  #		And user disregards the updating of the contract with duplicate name
  #		And user saves the update of contract basic information
  #		And user confirms the updating of the contract with duplicate name
  #		Then user sees the name of the contract is updated
  #
  @Regression
  Scenario: APT-1824: 005. VIEW CONTRACT page and content, validations and functionalities
    # Scenario 1:
    Given user opens browser
    When user with view rights logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user views the contract
    Then user is on "View" page
    # Scenario 2:
    Given user is on "View" page
    Then user sees the contract information, options, and costs in view mode
    # Scenario 3:
    Given user is on "View" page
    When user closes the view contract page
    Then user is on "Contracts" page

  @Regression
  Scenario: APT-1825: 02. I want to view existing PRICE information when copying a contract
    # Scenario 1: Attached to APT-1645
    # Scenario 2:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract without contract prices
    And user copies the contract
    Then user sees include prices when copying contract option is unchecked and disabled
    # Scenario 3:
    Given user is on "Contract Details" page
    When user cancels the copying of the contract
    And user searches for a contract with contract prices
    And user copies the contract
    And user ticks the include costs when copying contract option
    Then user sees include prices when copying contract option is unchecked and disabled
    # Scenario 4:
    Given user is on "Contract Details" page
    Then user sees include costs when copying contract option is unchecked
    And user sees include prices when copying contract option is unchecked and disabled
    When user ticks the include costs when copying contract option
    Then user sees include prices when copying contract option is enabled
    # Scenario 5: Attached to APT-1645
    # Scenario 6: Attached to APT-1645
    # Scenario 7: Attached to APT-1645
    # Scenario 8: Attached to APT-1645
    # Scenario 10:
    Given user is on "Contract Details" page
    When user ticks the include prices when copying contract option
    And user provides a new name for the contract
    And user saves the contract
    And user cancels the update of the contract
    And user resets the search filters
    And user searches for the newly created contract
    And user copies the contract
    Then user sees the contract prices of the original contract has been copied
    # Scenario 9:
    Given user is on "Contract Details" page
    When user ticks the include prices when copying contract option
    And user provides a new name for the contract
    And user saves the contract
    And user cancels the update of the contract
    And user resets the search filters
    And user searches for the newly created contract
    And user copies the contract
    Then user sees the contract prices of the original contract has not been copied

  @Regression
  Scenario: APT-1837: 14. As a Product team member, I want to INLINE-EDIT MAXIMUM COMMISSION for a price in the PRICE TABLE for a contract
    # Additional Scenario: APT-2472: INLINE-EDIT MAXIMUM COMMISSION for a price must allow decimals
    # Scenario 1: Inline editing functionality for ‘Maximum Commission’ field
    # And Scenario 2: Edit ‘Maximum Commission’ confirmation messages
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with contract prices
    And user updates the contract
    And user toggles the hide past dates option for the contract prices
    And user uses column filters to filter the first contract prices category data
    And user hovers over a certain maximum commission cell that is not empty in the contract prices table
    And user clicks on a certain maximum commission cell in the contract prices table
    Then user sees the save and cancel icons beside the contract price maximum commission data
    # Scenario 3: Edit ‘Maximum Commission’ – Manually Click white space Cancel
    Given user is on "Contract Details" page
    When user clicks outside the contract price maximum commission data
    Then user does not see the save and cancel icons beside the contract price maximum commission data
    # Scenario 4: Edit ‘Maximum Commission’ error message – Invalid value
    Given user is on "Contract Details" page
    When user hovers over a certain maximum commission cell that is not empty in the contract prices table
    And user clicks on a certain maximum commission cell in the contract prices table
    And user provides "ABCDEFGHIJKLMNOPQRSTUVWXYZ" as the contract price maximum commission
    And user saves the contract price maximum commission
    Then user sees the contract price maximum commission cannot be saved
    When user provides "!@#$%^&*()_+-=[]{};:,.<>?/" as the contract price maximum commission
    And user saves the contract price maximum commission
    Then user sees the contract price maximum commission cannot be saved
    # Scenario 6: Edit ‘Maximum Commission’ – Manually Click Cancel or Escape Key Cancel
    Given user is on "Contract Details" page
    When user hits the escape key
    Then user does not see the save and cancel icons beside the contract price maximum commission data
    # Scenario 5: Successful inline edit
    # And Scenario for APT-2472:
    Given user is on "Contract Details" page
    When user hovers over a certain maximum commission cell that is not empty in the contract prices table
    And user clicks on a certain maximum commission cell in the contract prices table
    And user provides "9.99" as the contract price maximum commission
    And user saves the contract price maximum commission
    #		Then user sees feedback message "Maximum Commission has been updated for Contract 59963 successfully."
    Then user sees notification prompt regarding non commission
    When user close notification prompt regarding non commission
    And user uses column filters to filter the first contract prices category data
    Then user sees the contract price maximum commission is changed to "9.99"
    When user hovers over a certain maximum commission cell that is not empty in the contract prices table
    And user clicks on a certain maximum commission cell in the contract prices table
    And user provides "10" as the contract price maximum commission
    And user saves the contract price maximum commission
    #		Then user sees feedback message "Maximum Commission has been updated for Contract 59963 successfully."
    Then user sees notification prompt regarding non commission
    When user close notification prompt regarding non commission
    And user uses column filters to filter the first contract prices category data
    Then user sees the contract price maximum commission is changed to "10"

  @Regression
  Scenario: APT-1900: 32. Pagination in Cost Tables must be defaulted to 100
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    Then user sees the contract cost table is paginated to display 100 rows in a page by default

  @Regression
  Scenario: APT-1937: 35. Remove Season column from Cost Table
    # Scenario 1:
    # And Scenario 2:
    # And Scenario 3:
    # And Scenario 4:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    Then user does not see the season column in the contract cost category table
    When user logs out of the app
    And user with view rights logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user views the contract
    Then user does not see the season column in the contract cost category table

  #	@Regression-Disabled
  #	Scenario: APT-1946: 01. Arrive at IMPORT DATES POP-UP in Cost Table
  #		# Additional Scenario: APT-1758: 01. As a Product team member, I want to arrive at IMPORT DATES POP-UP from Contract Prices accordion in a contract
  #		# Additional Scenario: APT-1805: 04. As a Product team member, I want PAX RANGE column name in IMPORT DATES POP-UP to be dynamically displayed depending on contract type
  #		# Scenario 33: Cosmetic
  #		# Scenario 34: Cosmetic
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		# Scenario for Contract Type - Coach:
  #		And user searches for contracts with type "Coach" and on loading status
  #		And user updates the contract
  #		Then user sees import dates button inside the contract costs accordion
  #		# Scenario 2 and for APT-1758:
  #		# And Scenario 3:
  #		# And Scenario 4:
  #		Given user is on "Contract Details" page
  #		When user opens the import dates from cost popup
  #		Then user sees the import dates from cost popup fields and buttons
  #		# Scenario 5:
  #		Given user is on "Contract Details" page
  #		When user searches for a specific cost configuration for the import dates from cost
  #		Then user sees the specific cost configuration for the import dates from cost
  #		# Scenario 6:
  #		Given user is on "Contract Details" page
  #		When user selects a specific cost configuration for the import dates from cost
  #		Then user sees season for the import dates from cost is "All Selected"
  #		# Scenario 7:
  #		# And Scenario 8:
  #		Given user is on "Contract Details" page
  #		When user selects few seasons for the import dates from cost
  #		Then user sees season for the import dates from cost is "Season 1"
  #		When user searches for a specific cost configuration for the import dates from cost
  #		And user selects a specific cost configuration for the import dates from cost
  #		Then user sees season for the import dates from cost is "All Selected"
  #		# Scenario 9: Cosmetic
  #		# Scenario 10: Cosmetic
  #		# Scenario 13:
  #		Given user is on "Contract Details" page
  #		When user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into minimum pax field in the import dates from cost popup
  #		And user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into maximum pax field in the import dates from cost popup
  #		Then user sees that the minimum and maximum pax fields does not accept alphabets, special characters, negative numbers, and decimals in the import dates from cost popup
  #		# Scenario 14:
  #		Given user is on "Contract Details" page
  #		When user puts "0" into minimum pax field in the import dates from cost popup
  #		Then user sees error message "Minimum Pax only accepts numbers greater than zero"
  #		When user puts "0" into maximum pax field in the import dates from cost popup
  #		Then user sees error message "Maximum Pax only accepts numbers greater than zero"
  #		# Scenario 15:
  #		Given user is on "Contract Details" page
  #		When user puts "1" into minimum pax field in the import dates from cost popup
  #		Then user does not see the error message "Minimum Pax only accepts numbers greater than zero"
  #		When user puts "10" into maximum pax field in the import dates from cost popup
  #		Then user does not see the error message "Maximum Pax only accepts numbers greater than zero"
  #		# Scenario 21:
  #		Given user is on "Contract Details" page
  #		When user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into quantity field in the import dates from cost popup
  #		Then user sees that the quantity field does not accept alphabets, special characters, negative numbers, and decimals in the import dates from cost popup
  #		# Scenario 22:
  #		Given user is on "Contract Details" page
  #		When user puts "0" into quantity field in the import dates from cost popup
  #		Then user sees error message "Quantity only accepts numbers greater than zero"
  #		# Scenario 23:
  #		Given user is on "Contract Details" page
  #		When user puts "1" into quantity field in the import dates from cost popup
  #		Then user does not see the error message "Quantity only accepts numbers greater than zero"
  #		# Scenario 12:
  #		Given user is on "Contract Details" page
  #		Then user sees category 1 field is enabled in the import dates from cost popup
  #		# Scenario 17:
  #		Given user is on "Contract Details" page
  #		Then user sees rate type is defaulted to "Per Day" in the import dates from cost popup
  #		# Scenario 18:
  #		Given user is on "Contract Details" page
  #		Then user sees number of days field is disabled and empty in the import dates from cost popup
  #		# Scenario 29:
  #		Given user is on "Contract Details" page
  #		When user opens the cost configuration for the import dates from cost
  #		Then user sees the pax range column inside the cost configuration table
  #		# Scenario 32:
  #		Given user is on "Contract Details" page
  #		Then user sees the minimum and maximum pax fields in the import dates from cost popup
  #		# Scenario for Contract Type - Cruise:
  #		# Scenario 12:
  #		Given user is on "Contract Details" page
  #		When user closes the import dates from cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Cruise" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from cost popup
  #		Then user sees category 1 field is enabled in the import dates from cost popup
  #		# Scenario 16:
  #		Given user is on "Contract Details" page
  #		Then user sees rate type is defaulted to "Per Duration" in the import dates from cost popup
  #		# Scenario 18:
  #		Given user is on "Contract Details" page
  #		Then user sees number of days field is disabled and empty in the import dates from cost popup
  #		# Scenario 28:
  #		Given user is on "Contract Details" page
  #		When user opens the cost configuration for the import dates from cost
  #		Then user sees the days column inside the cost configuration table
  #		# Scenario 31:
  #		Given user is on "Contract Details" page
  #		Then user sees the minimum and maximum days fields in the import dates from cost popup
  #		# Scenario for Contract Type - Foreign Operator / Land:
  #		Given user is on "Contract Details" page
  #		When user closes the import dates from cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Foreign Operator / Land" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from cost popup
  #		Then user sees category 1 field is disabled and empty in the import dates from cost popup
  #		# Scenario 16:
  #		Given user is on "Contract Details" page
  #		Then user sees rate type is defaulted to "Per Duration" in the import dates from cost popup
  #		# Scenario 18:
  #		Given user is on "Contract Details" page
  #		Then user sees number of days field is disabled and empty in the import dates from cost popup
  #		# Scenario 29:
  #		Given user is on "Contract Details" page
  #		When user opens the cost configuration for the import dates from cost
  #		Then user sees the pax range column inside the cost configuration table
  #		# Scenario 32:
  #		Given user is on "Contract Details" page
  #		Then user sees the minimum and maximum pax fields in the import dates from cost popup
  #		# Scenario for Contract Type - Hotel:
  #		# Scenario 12:
  #		Given user is on "Contract Details" page
  #		When user closes the import dates from cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Hotel" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from cost popup
  #		Then user sees category 1 field is enabled in the import dates from cost popup
  #		# Scenario 17:
  #		Given user is on "Contract Details" page
  #		Then user sees rate type is defaulted to "Per Day" in the import dates from cost popup
  #		# Scenario 18:
  #		Given user is on "Contract Details" page
  #		Then user sees number of days field is disabled and empty in the import dates from cost popup
  #		# Scenario 27:
  #		Given user is on "Contract Details" page
  #		When user opens the cost configuration for the import dates from cost
  #		Then user sees the nights column inside the cost configuration table
  #		# Scenario 30:
  #		Given user is on "Contract Details" page
  #		Then user sees the minimum and maximum nights fields in the import dates from cost popup
  #		# Scenario for Contract Type - Miscellaneous:
  #		# Scenario 12:
  #		Given user is on "Contract Details" page
  #		When user closes the import dates from cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Miscellaneous" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from cost popup
  #		Then user sees category 1 field is enabled in the import dates from cost popup
  #		# Scenario 17:
  #		Given user is on "Contract Details" page
  #		Then user sees rate type is defaulted to "Per Day" in the import dates from cost popup
  #		# Scenario 19:
  #		Given user is on "Contract Details" page
  #		When user selects "Per Duration" as the rate type in the import dates from cost popup
  #		Then user sees number of days is enabled and defaulted to 1 in the import dates from cost popup
  #		# Scenario 20:
  #		Given user is on "Contract Details" page
  #		When user selects "Per Day" as the rate type in the import dates from cost popup
  #		Then user sees number of days field is disabled and empty in the import dates from cost popup
  #		# Scenario 24:
  #		Given user is on "Contract Details" page
  #		When user selects "Per Duration" as the rate type in the import dates from cost popup
  #		And user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into number of days field in the import dates from cost popup
  #		Then user sees that the number of days field does not accept alphabets, special characters, negative numbers, and decimals in the import dates from cost popup
  #		# Scenario 25:
  #		Given user is on "Contract Details" page
  #		When user puts "0" into number of days field in the import dates from cost popup
  #		Then user sees error message "Number of Days only accepts numbers greater than zero"
  #		# Scenario 26:
  #		Given user is on "Contract Details" page
  #		When user puts "1" into number of days field in the import dates from cost popup
  #		Then user does not see the error message "Number of Days only accepts numbers greater than zero"
  #		# Scenario 29:
  #		Given user is on "Contract Details" page
  #		When user opens the cost configuration for the import dates from cost
  #		Then user sees the pax range column inside the cost configuration table
  #		# Scenario 32:
  #		Given user is on "Contract Details" page
  #		Then user sees the minimum and maximum pax fields in the import dates from cost popup
  #		# Scenario for Contract Type - Rail:
  #		# Scenario 12:
  #		Given user is on "Contract Details" page
  #		When user closes the import dates from cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Rail" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from cost popup
  #		Then user sees category 1 field is enabled in the import dates from cost popup
  #		# Scenario 16:
  #		Given user is on "Contract Details" page
  #		Then user sees rate type is defaulted to "Per Duration" in the import dates from cost popup
  #		# Scenario 18:
  #		Given user is on "Contract Details" page
  #		Then user sees number of days field is disabled and empty in the import dates from cost popup
  #		# Scenario 28:
  #		Given user is on "Contract Details" page
  #		When user opens the cost configuration for the import dates from cost
  #		Then user sees the days column inside the cost configuration table
  #		# Scenario 31:
  #		Given user is on "Contract Details" page
  #		Then user sees the minimum and maximum days fields in the import dates from cost popup
  #		# Scenario for Contract Type - Transfer:
  #		# Scenario 12:
  #		Given user is on "Contract Details" page
  #		When user closes the import dates from cost popup
  #		And user cancels the update of the contract
  #		And user resets the search filters
  #		And user searches for contracts with type "Transfer" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from cost popup
  #		Then user sees category 1 field is enabled in the import dates from cost popup
  #		# Scenario 17:
  #		Given user is on "Contract Details" page
  #		Then user sees rate type is defaulted to "Per Day" in the import dates from cost popup
  #		# Scenario 18:
  #		Given user is on "Contract Details" page
  #		Then user sees number of days field is disabled and empty in the import dates from cost popup
  #		# Scenario 29:
  #		Given user is on "Contract Details" page
  #		When user opens the cost configuration for the import dates from cost
  #		Then user sees the pax range column inside the cost configuration table
  #		# Scenario 32:
  #		Given user is on "Contract Details" page
  #		Then user sees the minimum and maximum pax fields in the import dates from cost popup
  #
  #	@Regression-Disabled
  #	Scenario: APT-1950: 02. IMPORT DATES using IMPORT DATES POP-UP in Cost Table
  #		# Scenario 1:
  #		# And Scenario 2:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for contracts with type "Coach" and on loading status
  #		And user updates the contract
  #		And user opens the import dates from cost popup
  #		And user saves the import dates from cost popup
  #		Then user sees error message "This is a mandatory field"
  #		And user sees feedback message "Unable to Import Dates. Please review the error messages below."
  #		# Scenario 4:
  #		# And Scenario 3:
  #		Given user is on "Contract Details" page
  #		When user closes the import dates from cost popup
  #		And user opens the import dates from cost popup
  #		And user provides the necessary information for the import dates from cost popup
  #		And user saves the import dates from cost popup
  #		Then user sees feedback message "Dates have been imported successfully."
  #
  @Regression
  Scenario: APT-1956: 01. Ability to Mass-Update Packages with new contract name or supplier name
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    Then user sees update packages button
    # Scenario 2:
    # And Scenario 5:
    # And Scenario 6:
    Given user is on "Contract Details" page
    When user opens the update packages popup
    Then user sees the update packages popup package selected status is loading, one sale, and pending by default
    And user sees the update packages popup table with its columns, rows, filters, and pagination elements
    And user sees the update packages popup buttons
    # Scenario 3: Database
    # Scenario 4: Database
    # Scenario 7:
    Given user is on "Contract Details" page
    When user cancels the update of packages of the contracts
    Then user does not see the update packages popup

  @Regression
  Scenario: APT-1959: 02. Update selected Packages with new Supplier name or Contract name
    # Scenario 2: Database
    # Scenario 3: Database
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with type foreign operator / land and with contract costs
    And user updates the contract
    And user opens the update packages popup
    And user decides to update supplier name
    Then user sees error message "At least one package must be selected."

  @Regression
  Scenario: APT-1990: 16. Show/Hide old dates in Price Table when Updating a Contract
    # Scenario 1: Disable ‘Hide Past Dates’ checkbox if no prices are present
    # And Scenario 6: When Present date prices are deleted and no dates remain, disable ‘Hide Past Dates’ checkbox
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract without contract prices
    And user updates the contract
    Then user sees hide past dates option disabled for the contract prices
    # Scenario 2: Enable ‘Hide Past Dates’ checkbox if prices are present
    # And Scenario 3: Unhide ‘Past Dates’
    # And Scenario 4: Enable ‘Hide Past Dates’ checkbox if only past date prices exist
    # And Scenario 5: Enable ‘Hide Past Dates’ checkbox if only present date prices exist
    Given user is on "Contract Details" page
    When user cancels the update of the contract
    And user searches for a contract with contract prices
    And user updates the contract
    Then user sees hide past dates option enabled and toggled for the contract prices
    When user toggles the hide past dates option for the contract prices
    Then user sees the first contract prices category accordion expanded and its contents

  @Regression
  Scenario: APT-1993: 02a. Add new cancellation rule to contract after validations
    # Scenario 1: Add ‘Cancellation Rule’ skeleton
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the payment cancellation rules tab
    And user opens the add payment cancellation rule popup
    Then user sees the add payment cancellation rule popup fields
    When user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into minimum days field in the payment cancellation rule popup
    Then user sees that the minimum days field does not accept alphabets, special characters, negative numbers, and decimals in the payment cancellation rule popup
    When user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into maximum days field in the payment cancellation rule popup
    Then user sees that the maximum days field does not accept alphabets, special characters, negative numbers, and decimals in the payment cancellation rule popup
    # Scenario 2: Dropdown filter
    Given user is on "Contract Details" page
    When user selects "New Zealand Domestic" as the customer market value for the cancellation rule
    And user selects "Direct" as the customer type value for the cancellation rule
    Then user sees "New Zealand Domestic" as the customer market value for the cancellation rule
    And user sees "Direct" as the customer type value for the cancellation rule
    # Scenario 3: Replace with % symbol if Action field = Percentage
    Given user is on "Contract Details" page
    When user selects "Percentage" as the action for the cancellation rule
    Then user sees the percentage field
    # Scenario 4: Replace with $ symbol if Action field = Amount
    Given user is on "Contract Details" page
    When user selects "Amount" as the action for the cancellation rule
    Then user sees the amount field

  @Regression
  Scenario: APT-1997: 04. Display Cancellation Rules in a new Payment Rules Accordion in view contract screen
    # Additional Scenario: APT-2001: 04. Display Deposit Rules in a new Payment Rules Accordion in view contract screen
    # Scenario 1: View 'Cancellation Rules' skeleton
    # And Scenario 2: Column sort - Booking/'Departure Date Range
    Given user opens browser
    When user with view rights logs into app
    And user navigates to contracts page
    And user finds a contract by id
    And user views the contract
    And user opens the payment deposit rules tab
    Then user sees the payment deposit rules tab table
    # Scenario for APT-2001:
    Given user is on "View" page
    When user opens the payment cancellation rules tab
    Then user sees the payment cancellation rules tab table

  @Regression
  Scenario: APT-1999: 02a. Add new Deposit rule to contract after validations
    # Scenario 1: Add ‘Cancellation Rule’ skeleton
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the payment deposit rules tab
    And user opens the add payment deposit rule popup
    Then user sees the add payment deposit rule popup fields
    When user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into minimum days field in the payment deposit rule popup
    Then user sees that the minimum days field does not accept alphabets, special characters, negative numbers, and decimals in the payment deposit rule popup
    # Scenario 2: Dropdown filter
    Given user is on "Contract Details" page
    When user selects "New Zealand Domestic" as the customer market value for the deposit rule
    And user selects "Direct" as the customer type value for the deposit rule
    Then user sees "New Zealand Domestic" as the customer market value for the deposit rule
    And user sees "Direct" as the customer type value for the deposit rule
    # Scenario 3: Replace with % symbol if Action field = Percentage
    Given user is on "Contract Details" page
    When user selects "Percentage" as the action for the deposit rule
    Then user sees the percentage field
    # Scenario 4: Replace with $ symbol if Action field = Amount
    Given user is on "Contract Details" page
    When user selects "Amount" as the action for the deposit rule
    Then user sees the amount field

  @Regression
  Scenario: APT-2006: 02a. Add new Final Payment rule to contract after validations
    # Scenario 1: Add ‘Payment Rule’ skeleton
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the final payment rules tab
    And user opens the add final payment rule popup
    Then user sees the add final payment rule popup fields
    When user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into minimum days field in the final payment rule popup
    Then user sees that the minimum days field does not accept alphabets, special characters, negative numbers, and decimals in the final payment rule popup
    # Scenario 2: Dropdown filter
    Given user is on "Contract Details" page
    When user selects "New Zealand Domestic" as the customer market value for the final payment rule
    And user selects "Direct" as the customer type value for the final payment rule
    Then user sees "New Zealand Domestic" as the customer market value for the final payment rule
    And user sees "Direct" as the customer type value for the final payment rule
    # Scenario 3: Disable ‘Minimum days’ when ‘Due Date’ is enabled
    Given user is on "Contract Details" page
    When user selects due date as the option for the final payment rule
    Then user sees due date field is enabled and minimum days field is disabled
    # Scenario 4: Disable ‘Due Date’ when ‘Minimum days’ is enabled
    Given user is on "Contract Details" page
    When user selects minimum days as the option for the final payment rule
    Then user sees minimum days field is enabled and due date field is disabled

  @Regression-Slow
  Scenario: APT-2033: 40. Read-only cost table depending on status of contract
    # Additional Scenario: APT-2034: 18. Read-only price table depending on status of contract
    # Additional Scenario: APT-2149: Read only contract cost accordion for "Closed", "On Sale" & "Internal Sale Only" contract status
    # Additional Scenario: APT-2168: Duplicate Contract message should NOT appear when updating same Contract
    # Additional Scenario: APT-3414: View Save and cancel buttons when the Edit 'Basic info' pop up is opened
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with contract prices
    And user updates the contract
    And user opens the update contract basic information popup
    And user changes the status of the contract to "On Sale"
    And user expands the contract options accordion
    And user saves the update of contract basic information
    And user toggles the hide past dates option
    Then user sees the contracts costs accordion contents are disabled
    When user toggles the hide past dates option for the contract prices
    Then user sees the contracts prices accordion contents are disabled
    When user opens the update contract basic information popup
    And user changes the status of the contract to "Internal Sale Only"
    And user expands the contract options accordion
    And user saves the update of contract basic information
    Then user sees the contracts costs accordion contents are disabled
    And user sees the contracts prices accordion contents are disabled
    When user opens the update contract basic information popup
    And user changes the status of the contract to "Closed"
    And user expands the contract options accordion
    And user saves the update of contract basic information
    Then user sees the contracts costs accordion contents are disabled
    And user sees the contracts prices accordion contents are disabled
    # Scenario 2:
    # And Scenario 3:
    Given user is on "Contract Details" page
    When user opens the update contract basic information popup
    And user changes the status of the contract to "Pending"
    And user expands the contract options accordion
    And user saves the update of contract basic information
    Then user sees the contracts costs accordion contents are enabled
    And user sees the contracts prices accordion contents are enabled
    When user opens the update contract basic information popup
    And user changes the status of the contract to "Loading"
    And user expands the contract options accordion
    And user saves the update of contract basic information
    Then user sees the contracts costs accordion contents are enabled
    And user sees the contracts prices accordion contents are enabled

  @Regression
  Scenario: APT-2040: 01. New contract search field called Category1
    # Scenario 1:
    # And Scenario 3:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    Then user sees the category 1 field for filtering the contracts search results
    When user opens the category 1 field
    Then user sees category 1 field option is only all
    And user sees category 1 field value is "All"
    # Scenario 2:
    # And Scenario 4:
    # And Scenario 5:
    Given user is on "Contracts" page
    When user changes the type of contract to be searched to "Coach"
    And user opens the category 1 field
    Then user sees category 1 field options
    When user finds and selects one of the options as the contract 1 field value
    Then user sees category 1 field value is "Manifest"

  @Regression
  Scenario: APT-2067: 01. On Edit and Copy, don't allow the Contract Type to be changed
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the update contract basic information popup
    Then user sees contract type dropdown is disabled
    When user cancels the update of the contract basic information
    And user cancels the update of the contract
    And user copies the contract
    Then user sees contract type dropdown is disabled

  @Regression
  Scenario: APT-2073 - Menu and Screen for Price Maintenance - User with edit only permission
    # Scenario 1: New menu category beneath Contracts menu item
    Given user opens browser
    When user logs into app
    And user expands contracts accordion
    Then user sees price maintenance under contracts
    # Scenario 2: Collapsing new category hides new menu item
    When user collapses contracts accordion
    Then user does not see price maintenance
    # Scenario 3:
    When user navigates to price maintenance page
    Then user sees add price is displayed
    And user sees fields displayed in field definitions
    And user inputs batch number with effective future
    #Scenario4
    Given user is on "Price Maintenance" page
    When user inputs batch number with effective processed
    Then user checks the first item containing the filtered text is selected
    #Scenario5a - Input Batch Number - Future - As per vivek, dynamic pricing for pricemaintenance is not moved to test
    Given user is on "Price Maintenance" page
    When user inputs batch number with effective future
    #Scenario5b - Input Batch Number Only Processed
    Given user is on "Price Maintenance" page
    When user inputs batch number with effective processed
    #Scenario6
    Given user is on "Price Maintenance" page
    When user inputs a Contract ID from dropdown list
    #Scenario7a - Search Batch Number Future
    Given user is on "Price Maintenance" page
    When user inputs batch number with effective future
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is enabled
    And user sees results displayed for future
    #Scenario7b - Search Batch Number Process
    Given user is on "Price Maintenance" page
    When user inputs batch number with effective processed
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is disabled
    And user sees results displayed for processed
    #Scenario8a - Search Contract ID Future
    Given user is on "Price Maintenance" page
    When user inputs contract id with effect future
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is enabled
    And user sees results displayed for future
    #Scenario8b - Search Contract ID Process
    Given user is on "Price Maintenance" page
    When user inputs contract id with effect processed
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is disabled
    And user sees results displayed for processed
    #Scenario9a - Search Batch Number and Contract ID Future
    Given user is on "Price Maintenance" page
    When user inputs batch number and contract id with effect future
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is enabled
    And user sees results displayed for future
    #Scenario9b - Search Batch Number and Contract ID Process
    Given user is on "Price Maintenance" page
    When user inputs batch number and contract id with effect processed
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is disabled
    And user sees results displayed for processed
    #Scenario10
    Given user is on "Price Maintenance" page
    When user inputs batch number and contract id with effect future
    And user clicks on find price maintenance
    And user clicks on Download Results button

  @Regression
  Scenario: APT-2097: Pressing UPDATE EFFECTIVE DATE icon against record in search results brings up a pop-up
    # Scenario 1:
    # And Scenario 2: Invalid formats in effective date field
    # And Scenario 3 - Effective Date greater than End Date
    # And Scenario 4: Remove field-level error message on typing valid dates
    # And Scenario 5 - Invalid Effective Time
    # And Scenario 6 - Remove field-level error messages on typing valid time
    # And Scenario 7 - Do not allow update when error messages exist
    # And Scenario 8 - Mandatory validation
    # And Scenario 9 - Update Price
    # And Scenario 10 - Cancel Pop-Up
    Given user opens browser
    When user logs into app
    And user navigates to price maintenance page
    And user search for future batch number "20200114091218"
    And user searches for the entered batch number and contract id
    And user open update effective date and time popup
    Then user sees fields displayed in textual fashion for price maintenance page
    And user checks contract id and contract name
    And user checks price maintenance popup fields
    When user enter invalid data in the price maintenance popup
    And user enter effective date greater than the end date
    Then user sees error message "Effective Date cannot be greater than End Date."
    When user enter valid effective date error message is not displayed
    And user enter invalid effective time
    Then user sees error message "Invalid 24 hour time"
    And user enter valid effective time error message is not displayed
    And effective date and time are mandatory fields
    When user successfully updated a price
    Then user sees feedback message "Record saved successfully."
    And user click cancel button or close icon then price maintenance popup disappear

  @Regression
  Scenario: APT-2099: 05. View price records that were effective in the past
    # Scenario 1:
    # And Scenario 2:
    Given user opens browser
    When user logs into app
    And user navigates to price maintenance page
    And user searches for all processed price
    And user clicks view price on Price Maintenance page
    Then user sees fields displayed in textual fashion

  @Regression
  Scenario: APT-2127: 'Hide Past Dates' for contract Costs should be enabled even when only Past Dates exist
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for an old contract by id
    And user updates the contract
    Then user sees hide past dates option enabled and toggled

  #	@Regression-Disabled
  #	Scenario: APT-2136: When deleting a row of costs, the delete message should not show Cat 1 and Cat 2 if it is not applicable to that contract
  #		# Scenario 1:
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract with type foreign operator / land and with contract costs
  #		And user updates the contract
  #		And user toggles the hide past dates option
  #		And user decides to delete a specific row of costs
  #		Then user sees the confirmation message for the deletion of the specific row of costs
  #
  @Regression
  Scenario: APT-2150: Hide first column having Delete icons in the Cost table for Copy Contract UI
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user copies the contract
    Then user does not see the delete icons in the left hand side of the contract cost table

  @Regression
  Scenario: APT-2160: Pop Up closes on hitting ENTER key on filter text field on Update Packages PopUp
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the update packages popup
    And user presses the enter key
    Then user sees the update packages popup package selected status is loading, one sale, and pending by default
    And user sees the update packages popup table with its columns, rows, filters, and pagination elements
    And user sees the update packages popup buttons

  @Regression
  Scenario: APT-2162: Only selected package rows should remain as checked on clicking either " Update Supplier Name" or "Update Contract Name"
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the update packages popup
    And user unselects all the packages in the update packages popup
    And user selects one package in the update packages popup
    And user updates the supplier name of the selected packages
    Then user sees the selected packages are the only ones checked after the update of the supplier name

  @Regression
  Scenario: APT-2252: Inline Edit of Contract Price or Max Commission should also update any Non Comm value and only update the Adult Price
    #Scenario 1: Editing Price in the contract summary should update the required Pax Type records only
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "96682" id
    And user updates the contract
    And user hovers over a certain cell that is not empty in the contract prices table
    And user edits the contract price
    #If MAX_COMM is 0% then NON_COMM = PRICE
    When user puts "0" in the contract prices popup contract prices table top maximum commission field
    And user saves the contract prices
    And user hovers over a certain cell that is not empty in the contract prices table
    And user edits the contract price
    Then user sees that the contract prices popup contract prices table top price field contains "1.00"
    And user sees that the contract prices popup contract prices table top non-commission field contains "1.00"
    #If MAXX_COMM is > 0% and NON_COMM is 0% then do not update NON_COMM
    When user puts "1" in the contract prices popup contract prices table top maximum commission field
    And user saves the contract prices
    And user hovers over a certain cell that is not empty in the contract prices table
    And user edits the contract price
    And user puts "2" in the contract prices popup contract prices table top maximum commission field
    Then user sees that the contract prices popup contract prices table top non-commission field contains "0"
    When user puts "1" in the contract prices popup contract prices table top non-commission field
    And user saves the contract prices

  @Regression
  Scenario: APT-2252: Inline Edit of Contract Price or Max Commission should also update any Non Comm value and only update the Adult Price
    #If MAX_COMM is > 0% and NON_COMM > 0% then:
    #If new PRICE is positive - do not update existing NON_COMM, but display a notification prompt "Please update Non-commission if required"
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user hovers over a certain maximum commission cell that is not empty in the contract prices table
    And user clicks on a certain maximum commission cell in the contract prices table
    And user provides "99" as the contract price maximum commission
    And user saves the contract price maximum commission
    Then user sees notification prompt regarding non commission
    When user close notification prompt regarding non commission
    And user hovers over a certain maximum commission cell that is not empty in the contract prices table
    And user clicks on a certain maximum commission cell in the contract prices table
    And user provides "10" as the contract price maximum commission
    And user saves the contract price maximum commission
    Then user sees notification prompt regarding non commission

  @Regression
  Scenario: APT-2326: 02b. Search for Itinerary Template, and Add to contract after validations
    # Scenario 1: Day > 0 error message
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add itinerary template popup
    And user puts "0" as the day for the itinerary template
    Then user sees error message "Day only accepts number greater than 0"
    # Scenario 2: Re-validation of field-level error messages – Day
    Given user is on "Contract Details" page
    When user puts "5" as the day for the itinerary template
    Then user does not see the error message "Day only accepts number greater than 0"
    # Scenario 3: Invalid ‘hh’ input error message
    # And Scenario 4: Invalid ‘mm’ input error message
    Given user is on "Contract Details" page
    When user puts "24:00" as the time for the itinerary template
    Then user sees error message "Invalid 24 hour time"
    When user puts "23:60	" as the time for the itinerary template
    Then user sees error message "Invalid 24 hour time"
    # Scenario 5: Re-validation of field-level error messages – Time
    Given user is on "Contract Details" page
    When user puts "23:59" as the time for the itinerary template
    Then user does not see the error message "Invalid 24 hour time"

  @Regression
  Scenario: APT-2327: 02c. Search for Itinerary Template, and Add to contract after validations
    # Scenario 1: Calendar search function
    # And Scenario 2: Invalid date format error message
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add itinerary template popup
    And user puts "Test" as the start date for the itinerary template
    And user puts "Test" as the end date for the itinerary template
    Then user sees error message "Invalid format"
    # Scenario 3: Re-validation of field-level error messages – Start Date or End Date
    # And Scenario 4: 4: Multiple date formats
    # And Scenario 5: Auto-correct date to preferred format
    Given user is on "Contract Details" page
    When user puts "08/12/2019" as the start date for the itinerary template
    And user puts "08 12 2020" as the end date for the itinerary template
    Then user does not see the error message "Invalid format"
    # Scenario 6: Start Date > End Date error message
    Given user is on "Contract Details" page
    When user puts "08 Dec 2019" as the start date for the itinerary template
    And user puts "07 Dec 2019" as the end date for the itinerary template
    Then user sees error message "Start Date cannot be greater than End Date."
    # Scenario 7: Re-validation of field-level error messages – Start Date > End Date
    Given user is on "Contract Details" page
    When user puts "09 Dec 2019" as the end date for the itinerary template
    Then user does not see the error message "Start Date cannot be greater than End Date."
    # Scenario 8: Date falls outside of contract range error message
    Given user is on "Contract Details" page
    When user puts "01 Sep 2001" as the start date for the itinerary template
    And user puts "31 Dec 2051" as the end date for the itinerary template
    Then user sees error message "Date falls outside the date range of the contract."
    # Scenario 9: Re-validation of field-level error messages – Contract date range
    Given user is on "Contract Details" page
    When user puts "01 Sep 2003" as the start date for the itinerary template
    And user puts "31 Dec 2049" as the end date for the itinerary template
    Then user does not see the error message "Date falls outside the date range of the contract."

  @Regression
  Scenario: APT-2328: 02d. Search for Itinerary Template, and Add to contract after validations
    # Additional Scenario: APT-1911: 01a. Display Itinerary Templates as a new accordion in edit contract screen
    # Additional Scenario: APT-1912: 02a. Search for Itinerary Template, and Add to contract after validations
    # Additional Scenario: APT-1992: 04. Display Itinerary Templates as a new accordion in view contract screen
    # Additional Scenario: APT-2331: 03b. Edit details of an Itinerary Template attached to a contract
    # Additional Scenario: APT-2332: 03c. Edit details of an Itinerary Template attached to a contract
    # Additional Scenario: APT-2333: 03d. Edit details of an Itinerary Template attached to a contract
    # Additional Scenario: APT-2561: Behavior change required when user clicks on "x" button on "Add Itinerary template" pop up
    # Additional Scenario: APT-2597: Behavior change required when user clicks on "x" button on "Update Itinerary template" pop up
    # Scenario 8: No updates – No confirmation message
    # And Scenario for APT-2561:
    # And Scenario for APT-2:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add itinerary template popup
    And user cancels the addition of itinerary template
    Then user does not see the add itinerary template popup
    # Scenario 2: Mandatory field – Itinerary Template
    Given user is on "Contract Details" page
    When user opens the add itinerary template popup
    And user saves the itinerary template
    Then user sees error message "This is a mandatory field."
    # Scenario 3: Mandatory fields – Start Date, End Date or Time
    # And Scenario for APT-1912:
    Given user is on "Contract Details" page
    When user selects "APTCLUB ADAPTOR" as the itinerary template
    Then user sees the itinerary template description for "APTCLUB ADAPTOR"
    When user puts "" as the day for the itinerary template
    And user puts "" as the start date for the itinerary template
    And user puts "" as the end date for the itinerary template
    And user puts "" as the time for the itinerary template
    And user saves the itinerary template
    Then user sees error message "This is a mandatory field."
    # Scenario 4: Re-validation of field-level error messages – Itinerary Template
    Given user is on "Contract Details" page
    When user puts "1" as the day for the itinerary template
    And user puts "08 Dec 2019" as the start date for the itinerary template
    And user puts "08 Dec 2020" as the end date for the itinerary template
    And user puts "23:59" as the time for the itinerary template
    Then user does not see the error message "This is a mandatory field."
    # Scenario 5: Cancel updates on ‘Add Itinerary Template’ confirmation message
    # And Scenario 6: Cancel updates on ‘Add Itinerary Template’ – Cancel
    # And Scenario 7: Cancel updates on ‘Add Itinerary Template’ – Confirm
    Given user is on "Contract Details" page
    When user cancels the addition of itinerary template
    And user disregards the cancellation of the new itinerary template
    Then user sees the add itinerary template popup
    When user cancels the addition of itinerary template
    And user confirms the cancellation of the new itinerary template
    Then user does not see the add itinerary template popup
    When user opens the add itinerary template popup
    And user selects "APTCLUB ADAPTOR" as the itinerary template
    And user cancels the addition of itinerary template
    And user disregards the cancellation of the new itinerary template
    Then user sees the add itinerary template popup
    When user cancels the addition of itinerary template
    And user confirms the cancellation of the new itinerary template
    Then user does not see the add itinerary template popup
    # Scenario 1: Successfully add a new Itinerary Template
    Given user is on "Contract Details" page
    When user opens the add itinerary template popup
    And user selects "APTCLUB ADAPTOR" as the itinerary template
    And user puts "08 Dec 2019" as the start date for the itinerary template
    And user puts "08 Dec 2020" as the end date for the itinerary template
    And user saves the itinerary template
    Then user sees feedback message "Itinerary Template has been successfully added to the contract."
    # Scenario for APT-2333:
    # And Scenario for APT-2331:
    # And Scenario for APT-2332:
    Given user is on "Contract Details" page
    When user edits the top itinerary template
    And user cancels the update of the itinerary template
    Then user does not see the update itinerary template popup
    When user edits the top itinerary template
    And user selects "APTCLUB TOTE BAG" as the itinerary template
    Then user sees the itinerary template description for "APTCLUB ADAPTOR"
    When user puts "" as the day for the itinerary template
    And user puts "" as the start date for the itinerary template
    And user puts "" as the end date for the itinerary template
    And user puts "" as the time for the itinerary template
    And user saves the itinerary template
    Then user sees error message "This is a mandatory field."
    When user puts "1" as the day for the itinerary template
    And user puts "08 Dec 2019" as the start date for the itinerary template
    And user puts "08 Dec 2020" as the end date for the itinerary template
    And user puts "23:59" as the time for the itinerary template
    Then user does not see the error message "This is a mandatory field."
    When user cancels the update of the itinerary template
    And user disregards the cancellation of the update of the itinerary template
    Then user sees the update itinerary template popup
    When user cancels the update of the itinerary template
    And user confirms the cancellation of the update of the itinerary template
    Then user does not see the update itinerary template popup
    When user edits the top itinerary template
    And user puts "0" as the day for the itinerary template
    Then user sees error message "Day only accepts number greater than 0"
    When user puts "5" as the day for the itinerary template
    Then user does not see the error message "Day only accepts number greater than 0"
    When user puts "24:00" as the time for the itinerary template
    Then user sees error message "Invalid 24 hour time"
    When user puts "23:60	" as the time for the itinerary template
    Then user sees error message "Invalid 24 hour time"
    When user puts "23:59" as the time for the itinerary template
    Then user does not see the error message "Invalid 24 hour time"
    When user puts "Test" as the start date for the itinerary template
    And user puts "Test" as the end date for the itinerary template
    Then user sees error message "Invalid format"
    When user puts "08/12/2019" as the start date for the itinerary template
    And user puts "08 12 2020" as the end date for the itinerary template
    Then user does not see the error message "Invalid format"
    When user puts "08 Dec 2019" as the start date for the itinerary template
    And user puts "07 Dec 2019" as the end date for the itinerary template
    Then user sees error message "Start Date cannot be greater than End Date."
    When user puts "09 Dec 2019" as the end date for the itinerary template
    Then user does not see the error message "Start Date cannot be greater than End Date."
    When user puts "01 Sep 2001" as the start date for the itinerary template
    And user puts "31 Dec 2051" as the end date for the itinerary template
    Then user sees error message "Date falls outside the date range of the contract."
    When user puts "01 Sep 2003" as the start date for the itinerary template
    And user puts "31 Dec 2049" as the end date for the itinerary template
    Then user does not see the error message "Date falls outside the date range of the contract."
    When user selects "APTCLUB TOTE BAG" as the itinerary template
    And user puts "08 Dec 2019" as the start date for the itinerary template
    And user puts "08 Dec 2020" as the end date for the itinerary template
    And user saves the itinerary template
    Then user sees feedback message "Itinerary Template has been successfully updated in the contract."
    # Scenario for APT-1911:
    Given user is on "Contract Details" page
    When user deletes the top itinerary template
    And user disregards the deletion of the itinerary template
    Then user sees the itinerary template
    When user deletes the top itinerary template
    And user confirms the deletion of the itinerary template
    Then user does not see the itinerary template

  @Regression
  Scenario: APT-2336: 02b. Add new cancellation rule to contract after validations
    # Additional Scenario: APT-2988: Behavior change when user clicks on "x" button on "Add/Update Cancellation Rule" pop up
    # Scenario 1: Cancel ‘Add Cancellation Rule’ confirmation message
    # And Scenario 2: Cancel ‘Add Cancellation Rule’ – Cancel
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the payment cancellation rules tab
    And user opens the add payment cancellation rule popup
    And user selects "New Zealand Domestic" as the customer market value for the cancellation rule
    And user cancels the addition of the new cancellation rule
    And user disregards the cancellation of the new cancellation rule
    Then user sees the add payment cancellation rule popup
    # Scenario 3: Cancel ‘Add Cancellation Rule’ – Confirm
    Given user is on "Contract Details" page
    When user cancels the addition of the new cancellation rule
    And user confirms the cancellation of the new cancellation rule
    Then user does not see the add payment cancellation rule popup
    # Scenario 4: No Updates – No confirmation message
    Given user is on "Contract Details" page
    When user opens the add payment cancellation rule popup
    And user cancels the addition of the new cancellation rule
    Then user does not see the add payment cancellation rule popup
    # Scenario for APT-2988:
    Given user is on "Contract Details" page
    When user opens the add payment cancellation rule popup
    And user cancels the addition of the new cancellation rule
    Then user does not see the add payment cancellation rule popup
    When user opens the add payment cancellation rule popup
    And user selects "New Zealand Domestic" as the customer market value for the cancellation rule
    And user cancels the addition of the new cancellation rule
    And user disregards the cancellation of the new cancellation rule
    Then user sees the add payment cancellation rule popup
    And user cancels the addition of the new cancellation rule
    And user confirms the cancellation of the new cancellation rule
    Then user does not see the add payment cancellation rule popup

  @Regression
  Scenario: APT-2337: 02c. Add new cancellation rule to contract after validations
    # Scenario 1: Calendar search function
    # And Scenario 2: Invalid date format error message
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the payment cancellation rules tab
    And user opens the add payment cancellation rule popup
    And user puts "Test" as the booking start date for the cancellation rule
    And user puts "Test" as the booking end date for the cancellation rule
    And user puts "Test" as the departure start date for the cancellation rule
    And user puts "Test" as the departure end date for the cancellation rule
    Then user sees error message "Invalid format"
    # Scenario 3: Re-validation of error messages – Date
    # And Scenario 4: Multiple date formats
    # And Scenario 5: Auto-correct date to preferred format
    Given user is on "Contract Details" page
    When user puts "08/12/2019" as the booking start date for the cancellation rule
    And user puts "08 12 2020" as the booking end date for the cancellation rule
    And user puts "09-12-2020" as the departure start date for the cancellation rule
    And user puts "09-Dec-2021" as the departure end date for the cancellation rule
    Then user does not see the error message "Invalid format"
    # Scenario 6: Start Date > End Date error message
    Given user is on "Contract Details" page
    When user puts "07 Dec 2019" as the booking end date for the cancellation rule
    And user puts "08 Dec 2020" as the departure end date for the cancellation rule
    Then user sees error message "Start Date cannot be greater than End Date."
    # Scenario 7: Re-validation of error messages – Start Date > End Date
    Given user is on "Contract Details" page
    When user puts "08 Dec 2020" as the booking end date for the cancellation rule
    And user puts "09 Dec 2021" as the departure end date for the cancellation rule
    Then user does not see the error message "Start Date cannot be greater than End Date."
    # Scenario 8: Date falls outside of contract range error message
    Given user is on "Contract Details" page
    When user puts "01 Sep 2001" as the booking end date for the cancellation rule
    And user puts "31 Dec 2051" as the departure end date for the cancellation rule
    Then user sees error message "Date falls outside the date range of the contract."
    # Scenario 9: Re-validation of error messages – Contract date range
    Given user is on "Contract Details" page
    When user puts "08 Dec 2020" as the booking end date for the deposit rule
    And user puts "09 Dec 2021" as the departure end date for the deposit rule
    Then user does not see the error message "Date falls outside the date range of the contract."

  @Regression
  Scenario: APT-2339: 02d. Add new cancellation rule to contract after validations
    # Scenario 1: >0 days error message - Not Applicable
    # Scenario 2: >$0 amount error message - Not Applicable
    # Scenario 3: >0% percentage error message - Not Applicable
    # Scenario 4: <100% percentage error message
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the payment cancellation rules tab
    And user opens the add payment cancellation rule popup
    And user selects "Percentage" as the action for the cancellation rule
    And user puts "1A2B3" as the percentage for the cancellation rule
    Then user sees error message "Percentage cannot be greater than 100"

  @Regression
  Scenario: APT-2340: 02e. Add new cancellation rule to contract after validations
    # Additional Scenario: APT-1989: 01. Display Cancellation Rules in a new Payment Rules Accordion in edit contract screen
    # Additional Scenario: APT-1995: 03a. Edit cancellation rule added to a contract
    # Additional Scenario: APT-2341: 03b. Edit cancellation rule added to a contract
    # Additional Scenario: APT-2342: 03c. Edit cancellation rule added to a contract
    # Additional Scenario: APT-2343: 03d. Edit cancellation rule added to a contract
    # Additional Scenario: APT-2344: 03e. Edit cancellation rule added to a contract
    # Additional Scenario: APT-2580: Don't Allow duplicate Deposit Rules to be added to a contract
    # Additional Scenario: APT-2645: Minimum Days should not be greater than Maximum Days
    # Scenario 1: Mandatory fields error message - Attached to several APT-### tasks
    # Scenario 2: Re-validation of error messages – Mandatory fields - Attached to several APT-### tasks
    # Scenario 3: Successfully add new ‘Cancellation Rule’
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the payment cancellation rules tab
    And user opens the add payment cancellation rule popup
    And user saves the cancellation rule
    Then user sees feedback message "Cancellation Rule has been successfully added to the contract."
    # Scenario for APT-2580:
    Given user is on "Contract Details" page
    When user opens the add payment cancellation rule popup
    And user saves the cancellation rule
    Then user sees error message "A cancellation rule already exists with the specified details."
    When user puts "5" into minimum days field in the payment cancellation rule popup
    And user puts "10" into maximum days field in the payment cancellation rule popup
    Then user does not see the error message "A cancellation rule already exists with the specified details."
    # Scenario for APT-2341:
    # And Scenario for APT-2343:
    Given user is on "Contract Details" page
    When user cancels the addition of the new cancellation rule
    And user confirms the cancellation of the new cancellation rule
    Then user does not see the update cancellation rule popup
    When user edits the top cancellation rule
    And user selects "Percentage" as the action for the cancellation rule
    And user puts "1A2B3" as the percentage for the cancellation rule
    Then user sees error message "Percentage cannot be greater than 100"
    When user cancels the update of the cancellation rule
    And user disregards the cancellation of the update of the cancellation rule
    Then user sees the update cancellation rule popup
    When user cancels the update of the cancellation rule
    And user confirms the cancellation of the update of the cancellation rule
    Then user does not see the update cancellation rule popup
    # Scenario for APT-2342:
    Given user is on "Contract Details" page
    When user edits the top cancellation rule
    And user puts "Test" as the booking start date for the cancellation rule
    And user puts "Test" as the booking end date for the cancellation rule
    And user puts "Test" as the departure start date for the cancellation rule
    And user puts "Test" as the departure end date for the cancellation rule
    Then user sees error message "Invalid format"
    When user puts "08/12/2019" as the booking start date for the cancellation rule
    And user puts "08 12 2020" as the booking end date for the cancellation rule
    And user puts "09-12-2020" as the departure start date for the cancellation rule
    And user puts "09-Dec-2021" as the departure end date for the cancellation rule
    Then user does not see the error message "Invalid format"
    When user puts "07 Dec 2019" as the booking end date for the cancellation rule
    And user puts "08 Dec 2020" as the departure end date for the cancellation rule
    Then user sees error message "Start Date cannot be greater than End Date."
    When user puts "08 Dec 2020" as the booking end date for the cancellation rule
    And user puts "09 Dec 2021" as the departure end date for the cancellation rule
    Then user does not see the error message "Start Date cannot be greater than End Date."
    When user puts "01 Sep 2001" as the booking end date for the cancellation rule
    And user puts "31 Dec 2051" as the departure end date for the cancellation rule
    Then user sees error message "Date falls outside the date range of the contract."
    When user puts "08 Dec 2020" as the booking end date for the deposit rule
    And user puts "09 Dec 2021" as the departure end date for the deposit rule
    Then user does not see the error message "Date falls outside the date range of the contract."
    # Scenario for APT-1995:
    Given user is on "Contract Details" page
    When user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into minimum days field in the payment cancellation rule popup
    Then user sees that the minimum days field does not accept alphabets, special characters, negative numbers, and decimals in the payment cancellation rule popup
    When user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into maximum days field in the payment cancellation rule popup
    Then user sees that the maximum days field does not accept alphabets, special characters, negative numbers, and decimals in the payment cancellation rule popup
    When user selects "New Zealand Domestic" as the customer market value for the cancellation rule
    And user selects "Direct" as the customer type value for the cancellation rule
    Then user sees "New Zealand Domestic" as the customer market value for the cancellation rule
    And user sees "Direct" as the customer type value for the cancellation rule
    When user selects "Percentage" as the action for the cancellation rule
    Then user sees the percentage field
    When user selects "Amount" as the action for the cancellation rule
    Then user sees the amount field
    # Scenario for APT-2645:
    Given user is on "Contract Details" page
    When user puts "2" into minimum days field in the payment cancellation rule popup
    And user puts "1" into maximum days field in the payment cancellation rule popup
    Then user sees error message "Minimum Days cannot be greater than Maximum Days"
    When user puts "1" into minimum days field in the payment cancellation rule popup
    And user puts "2" into maximum days field in the payment cancellation rule popup
    Then user does not see the error message "Minimum Days cannot be greater than Maximum Days"
    # Scenario for APT-2344:
    Given user is on "Contract Details" page
    When user puts "5" into minimum days field in the payment cancellation rule popup
    And user puts "10" into maximum days field in the payment cancellation rule popup
    And user selects "Percentage" as the action for the cancellation rule
    And user puts "50" as the percentage for the cancellation rule
    And user saves the cancellation rule
    Then user sees feedback message "Cancellation Rule has been successfully updated in the contract."
    # Scenario for APT-1989:
    Given user is on "Contract Details" page
    When user deletes the top cancellation rule
    And user disregards the deletion of the cancellation rule
    Then user sees the cancellation rule is not deleted
    When user deletes the top cancellation rule
    And user confirms the deletion of the cancellation rule
    Then user sees the cancellation rule is deleted

  @Regression
  Scenario: APT-2345: 02b. Add new Deposit rule to contract after validations
    # Additional Scenario: APT-2969: Behavior change when user clicks on "x" button on "Add/Update Deposit Rule" pop up
    # Scenario 1: Cancel ‘Add Deposit Rule’ confirmation message
    # And Scenario 2: Cancel ‘Add Deposit Rule’ – Cancel
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the payment deposit rules tab
    And user opens the add payment deposit rule popup
    And user selects "New Zealand Domestic" as the customer market value for the deposit rule
    And user cancels the addition of the new deposit rule
    And user disregards the cancellation of the new deposit rule
    Then user sees the add payment deposit rule popup
    # Scenario 3: Cancel ‘Add Deposit Rule’ – Confirm
    Given user is on "Contract Details" page
    When user cancels the addition of the new deposit rule
    And user confirms the cancellation of the new deposit rule
    Then user does not see the add payment deposit rule popup
    # Scenario 4: No Update – No confirmation message
    Given user is on "Contract Details" page
    When user opens the add payment deposit rule popup
    And user cancels the addition of the new deposit rule
    Then user does not see the add payment deposit rule popup
    # Scenario for APT-2969:
    Given user is on "Contract Details" page
    When user opens the add payment deposit rule popup
    And user cancels the addition of the new deposit rule
    Then user does not see the add payment deposit rule popup
    When user opens the add payment deposit rule popup
    And user selects "New Zealand Domestic" as the customer market value for the deposit rule
    And user cancels the addition of the new deposit rule
    And user disregards the cancellation of the new deposit rule
    Then user sees the add payment deposit rule popup
    When user cancels the addition of the new deposit rule
    And user confirms the cancellation of the new deposit rule
    Then user does not see the add payment deposit rule popup

  @Regression
  Scenario: APT-2346: 02c. Add new Deposit rule to contract after validations
    # Scenario 1: Calendar search function
    # And Scenario 2: Invalid date format error message
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the payment deposit rules tab
    And user opens the add payment deposit rule popup
    And user puts "Test" as the booking start date for the deposit rule
    And user puts "Test" as the booking end date for the deposit rule
    And user puts "Test" as the departure start date for the deposit rule
    And user puts "Test" as the departure end date for the deposit rule
    Then user sees error message "Invalid format"
    # Scenario 3: Re-validation of error messages – Date
    # And Scenario 4: Multiple date formats
    # And Scenario 5: Auto-correct date to preferred format
    Given user is on "Contract Details" page
    When user puts "08/12/2019" as the booking start date for the deposit rule
    And user puts "08 12 2020" as the booking end date for the deposit rule
    And user puts "09-12-2020" as the departure start date for the deposit rule
    And user puts "09-Dec-2021" as the departure end date for the deposit rule
    Then user does not see the error message "Invalid format"
    # Scenario 6: Start Date > End Date error message
    Given user is on "Contract Details" page
    When user puts "07 Dec 2019" as the booking end date for the deposit rule
    And user puts "08 Dec 2020" as the departure end date for the deposit rule
    Then user sees error message "Start Date cannot be greater than End Date."
    # Scenario 7: Re-validation of error messages – Start Date > End Date
    Given user is on "Contract Details" page
    When user puts "08 Dec 2020" as the booking end date for the deposit rule
    And user puts "09 Dec 2021" as the departure end date for the deposit rule
    Then user does not see the error message "Invalid format"
    # Scenario 8: Date falls outside of contract range error message
    Given user is on "Contract Details" page
    When user puts "01 Sep 2001" as the booking end date for the deposit rule
    And user puts "31 Dec 2051" as the departure end date for the deposit rule
    Then user sees error message "Date falls outside the date range of the contract."
    # Scenario 9: Re-validation of error messages – Contract date range
    Given user is on "Contract Details" page
    When user puts "08 Dec 2020" as the booking end date for the deposit rule
    And user puts "09 Dec 2021" as the departure end date for the deposit rule
    Then user does not see the error message "Invalid format"

  @Regression
  Scenario: APT-2347: 02d. Add new Deposit rule to contract after validations
    # Scenario 1: >0 days error message - Not Applicable
    # Scenario 2: >$0 amount error message - Not Applicable
    # Scenario 3: >0% percentage error message - Not Applicable
    # Scenario 4: <100% percentage error message
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the payment deposit rules tab
    And user opens the add payment deposit rule popup
    And user selects "Percentage" as the action for the deposit rule
    And user puts "101" as the percentage for the deposit rule
    Then user sees error message "Percentage cannot be greater than 100"

  @Regression
  Scenario: APT-2348: 002e. Add new Deposit rule to contract after validations
    # Additional Scenario: APT-1998: 01. Display Deposit Rules in Deposit tab in Payment Rules Accordion in edit contract screen
    # Additional Scenario: APT-2000: 03a. Edit deposit rule added to a contract
    # Additional Scenario: APT-2349: 03b. Edit deposit rule added to a contract
    # Additional Scenario: APT-2350: 03c. Edit deposit rule added to a contract
    # Additional Scenario: APT-2351: 03d. Edit deposit rule added to a contract
    # Additional Scenario: APT-2352: 03e. Edit deposit rule added to a contract
    # Additional Scenario: APT-2581: Don't Allow duplicate Cancellation Rules to be added to a contract
    # Scenario 1: Mandatory fields error message - Attached to several APT-### tasks
    # Scenario 2: Re-validation of error messages – Mandatory fields - Attached to several APT-### tasks
    # Scenario 3: Successfully add new ‘Deposit Rule’
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the payment deposit rules tab
    And user opens the add payment deposit rule popup
    And user saves the deposit rule
    Then user sees feedback message "Deposit Rule has been successfully added to the contract."
    # Scenario for APT-2581:
    Given user is on "Contract Details" page
    When user opens the add payment deposit rule popup
    And user saves the deposit rule
    Then user sees error message "A deposit rule already exists with the specified details."
    When user puts "5" into minimum days field in the payment deposit rule popup
    Then user does not see the error message "A deposit rule already exists with the specified details."
    # Scenario for APT-2349:
    # And Scenario for APT-2351:
    Given user is on "Contract Details" page
    When user cancels the addition of the new deposit rule
    And user confirms the cancellation of the new deposit rule
    Then user does not see the update deposit rule popup
    When user edits the top deposit rule
    And user selects "Percentage" as the action for the deposit rule
    And user puts "1A2B3" as the percentage for the deposit rule
    Then user sees error message "Percentage cannot be greater than 100"
    When user cancels the update of the deposit rule
    And user disregards the cancellation of the update of the deposit rule
    Then user sees the update deposit rule popup
    When user cancels the update of the deposit rule
    And user confirms the cancellation of the update of the deposit rule
    Then user does not see the update deposit rule popup
    # Scenario for APT-2350:
    Given user is on "Contract Details" page
    When user edits the top deposit rule
    And user puts "Test" as the booking start date for the deposit rule
    And user puts "Test" as the booking end date for the deposit rule
    And user puts "Test" as the departure start date for the deposit rule
    And user puts "Test" as the departure end date for the deposit rule
    Then user sees error message "Invalid format"
    When user puts "08/12/2019" as the booking start date for the deposit rule
    And user puts "08 12 2020" as the booking end date for the deposit rule
    And user puts "09-12-2020" as the departure start date for the deposit rule
    And user puts "09-Dec-2021" as the departure end date for the deposit rule
    Then user does not see the error message "Invalid format"
    When user puts "07 Dec 2019" as the booking end date for the deposit rule
    And user puts "08 Dec 2020" as the departure end date for the deposit rule
    Then user sees error message "Start Date cannot be greater than End Date."
    When user puts "08 Dec 2020" as the booking end date for the deposit rule
    And user puts "09 Dec 2021" as the departure end date for the deposit rule
    Then user does not see the error message "Start Date cannot be greater than End Date."
    When user puts "01 Sep 2001" as the booking end date for the deposit rule
    And user puts "31 Dec 2051" as the departure end date for the deposit rule
    Then user sees error message "Date falls outside the date range of the contract."
    When user puts "08 Dec 2020" as the booking end date for the deposit rule
    And user puts "09 Dec 2021" as the departure end date for the deposit rule
    Then user does not see the error message "Date falls outside the date range of the contract."
    # Scenario for APT-2000:
    Given user is on "Contract Details" page
    When user puts "-!@#$%^&*()=_[]{}|;:,.<>/?ABCDEFGHIJKLMNOPQRSTUVWXYZ" into minimum days field in the payment deposit rule popup
    Then user sees that the minimum days field does not accept alphabets, special characters, negative numbers, and decimals in the payment deposit rule popup
    When user selects "New Zealand Domestic" as the customer market value for the deposit rule
    And user selects "Direct" as the customer type value for the deposit rule
    Then user sees "New Zealand Domestic" as the customer market value for the deposit rule
    And user sees "Direct" as the customer type value for the deposit rule
    When user selects "Percentage" as the action for the deposit rule
    Then user sees the percentage field
    When user selects "Amount" as the action for the deposit rule
    Then user sees the amount field
    # Scenario for APT-2352:
    Given user is on "Contract Details" page
    When user puts "5" into minimum days field in the payment deposit rule popup
    And user selects "Percentage" as the action for the deposit rule
    And user puts "50" as the percentage for the deposit rule
    And user saves the deposit rule
    Then user sees feedback message "Deposit Rule has been successfully updated in the contract."
    # Scenario for APT-1998:
    Given user is on "Contract Details" page
    When user deletes the top deposit rule
    And user disregards the deletion of the deposit rule
    Then user sees the deposit rule is not deleted
    When user deletes the top deposit rule
    And user confirms the deletion of the deposit rule
    Then user sees the deposit rule is deleted

  @Regression
  Scenario: APT-2353: 02b. Add new Final Payment rule to contract after validations
    # Additional Scenario: APT-2968: Behavior change when user clicks on "x" button on "Add/Update Final Payment Rule" pop up
    # Scenario 1: Cancel ‘Add Final Payment Rule’ confirmation message
    # And Scenario 2: Cancel ‘Add Final Payment Rule’ – Cancel
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the final payment rules tab
    And user opens the add final payment rule popup
    And user selects "New Zealand Domestic" as the customer market value for the final payment rule
    And user cancels the addition of the new final payment rule
    And user disregards the cancellation of the new final payment rule
    Then user sees the add final payment rule popup
    # Scenario 3: Cancel ‘Add Deposit Rule’ – Confirm
    Given user is on "Contract Details" page
    When user cancels the addition of the new final payment rule
    And user confirms the cancellation of the new final payment rule
    Then user does not see the add final payment rule popup
    # Scenario 4: No Update – No confirmation message
    Given user is on "Contract Details" page
    When user opens the add final payment rule popup
    And user cancels the addition of the new final payment rule
    Then user does not see the add final payment rule popup
    # Scenario for APT-2968:
    Given user is on "Contract Details" page
    When user opens the add final payment rule popup
    And user cancels the addition of the new final payment rule
    Then user does not see the add final payment rule popup
    When user opens the add final payment rule popup
    And user selects "New Zealand Domestic" as the customer market value for the deposit rule
    And user cancels the addition of the new final payment rule
    And user disregards the cancellation of the new final payment rule
    Then user sees the add final payment rule popup
    When user cancels the addition of the new final payment rule
    And user confirms the cancellation of the new final payment rule
    Then user does not see the add final payment rule popup

  @Regression
  Scenario: APT-2354: 02c. Add new Final Payment rule to contract after validations
    # Scenario 1: Calendar search function
    # And Scenario 2: Invalid date format error message
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the final payment rules tab
    And user opens the add final payment rule popup
    And user puts "Test" as the booking start date for the final payment rule
    And user puts "Test" as the booking end date for the final payment rule
    And user puts "Test" as the departure start date for the final payment rule
    And user puts "Test" as the departure end date for the final payment rule
    Then user sees error message "Unsupported Date Format"
    # Scenario 3: Re-validation of error messages – Date
    # And Scenario 4: Multiple date formats
    # And Scenario 5: Auto-correct date to preferred format
    Given user is on "Contract Details" page
    When user puts "08/12/2019" as the booking start date for the final payment rule
    And user puts "08 12 2020" as the booking end date for the final payment rule
    And user puts "09-12-2020" as the departure start date for the final payment rule
    And user puts "09-Dec-2021" as the departure end date for the final payment rule
    Then user does not see the error message "Unsupported Date Format"
    # Scenario 6: Start Date > End Date error message
    Given user is on "Contract Details" page
    When user puts "07 Dec 2019" as the booking end date for the final payment rule
    And user puts "08 Dec 2020" as the departure end date for the final payment rule
    Then user sees error message "Start Date cannot be greater than End Date."
    # Scenario 7: Re-validation of error messages – Start Date > End Date
    Given user is on "Contract Details" page
    When user puts "08 Dec 2020" as the booking end date for the final payment rule
    And user puts "09 Dec 2021" as the departure end date for the final payment rule
    Then user does not see the error message "Unsupported Date Format"
    # Scenario 8: Date falls outside of contract range error message
    Given user is on "Contract Details" page
    When user puts "01 Sep 2001" as the booking end date for the final payment rule
    And user puts "31 Dec 2051" as the departure end date for the final payment rule
    Then user sees error message "Date falls outside the date range of the contract."
    # Scenario 9: Re-validation of error messages – Contract date range
    Given user is on "Contract Details" page
    When user puts "08 Dec 2020" as the booking end date for the final payment rule
    And user puts "09 Dec 2021" as the departure end date for the final payment rule
    Then user does not see the error message "Unsupported Date Format"

  @Regression
  Scenario: APT-2355: 02d. Add new Final Payment rule to contract after validations
    # Additional Scenario: APT-2002: 01. Display Final Payment Rules in Final Payment tab in Payment Rules Accordion in edit contract screen
    # Additional Scenario: APT-2007: 03a. Edit Final Payment rule added to a contract
    # Additional Scenario: APT-2357: 03b. Edit Final Payment rule added to a contract
    # Additional Scenario: APT-2358: 03c. Edit Final Payment rule added to a contract
    # Additional Scenario: APT-2359: 03d. Edit Final Payment rule added to a contract
    # Additional Scenario: APT-2644: Don't Allow duplicate Final Payment Rules to be added to a contract
    # Scenario 1: > 0 Days error message - Not Applicable
    # Scenario 2: Mandatory fields error message
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the final payment rules tab
    And user opens the add final payment rule popup
    And user provides empty values on the final payment rule popup fields
    And user saves the final payment rule
    Then user sees error message "This is a mandatory field"
    # Scenario 3: Re-validation of error messages – All fields
    # And Scenario 4: Successfully add new ‘Final Payment Rule’
    Given user is on "Contract Details" page
    When user provides valid values on the final payment rule popup fields
    And user saves the final payment rule
    Then user sees feedback message "Final Payment Rule has been successfully added to the contract."
    And user does not see the error message "This is a mandatory field"
    # Scenario for APT-2644:
    Given user is on "Contract Details" page
    When user opens the add final payment rule popup
    And user provides valid values on the final payment rule popup fields
    And user saves the final payment rule
    Then user sees error message "A final payment rule already exists with the specified details."
    When user puts "1" into minimum days field in the final payment rule popup
    And user does not see the error message "A final payment rule already exists with the specified details."
    # Scenario for APT-2007:
    # And Scenario for APT-2357:
    # And Scenario for APT-2358:
    # And Scenario for APT-2359:
    Given user is on "Contract Details" page
    When user cancels the addition of the new final payment rule
    And user confirms the cancellation of the new final payment rule
    And user edits the top final payment rule
    Then user sees the edit final payment rule popup fields
    When user selects "New Zealand Domestic" as the customer market value for the final payment rule
    And user selects "Direct" as the customer type value for the final payment rule
    Then user sees "New Zealand Domestic" as the customer market value for the final payment rule
    And user sees "Direct" as the customer type value for the final payment rule
    When user puts "Test" as the booking start date for the final payment rule
    And user puts "Test" as the booking end date for the final payment rule
    And user puts "Test" as the departure start date for the final payment rule
    And user puts "Test" as the departure end date for the final payment rule
    Then user sees error message "Unsupported Date Format"
    When user puts "08/12/2019" as the booking start date for the final payment rule
    And user puts "08 12 2020" as the booking end date for the final payment rule
    And user puts "09-12-2020" as the departure start date for the final payment rule
    And user puts "09-Dec-2021" as the departure end date for the final payment rule
    Then user does not see the error message "Unsupported Date Format"
    When user puts "07 Dec 2019" as the booking end date for the final payment rule
    And user puts "08 Dec 2020" as the departure end date for the final payment rule
    Then user sees error message "Start Date cannot be greater than End Date."
    When user puts "08 Dec 2020" as the booking end date for the final payment rule
    And user puts "09 Dec 2021" as the departure end date for the final payment rule
    Then user does not see the error message "Unsupported Date Format"
    When user puts "01 Sep 2001" as the booking end date for the final payment rule
    And user puts "31 Dec 2051" as the departure end date for the final payment rule
    Then user sees error message "Date falls outside the date range of the contract."
    When user puts "08 Dec 2020" as the booking end date for the final payment rule
    And user puts "09 Dec 2021" as the departure end date for the final payment rule
    Then user does not see the error message "Unsupported Date Format"
    When user selects due date as the option for the final payment rule
    Then user sees due date field is enabled and minimum days field is disabled
    When user selects minimum days as the option for the final payment rule
    Then user sees minimum days field is enabled and due date field is disabled
    When user puts "" into minimum days field in the final payment rule popup
    And user saves the final payment rule
    Then user sees error message "This is a mandatory field."
    When user puts "-10" into minimum days field in the final payment rule popup
    Then user sees "10" as the minimum days value for the final payment rule
    When user cancels the update of the final payment rule
    And user disregards the cancellation of the update final payment rule
    Then user sees the update final payment rule popup
    When user cancels the update of the final payment rule
    And user confirms the cancellation of the update final payment rule
    Then user does not see the update final payment rule popup
    When user edits the top final payment rule
    And user cancels the update of the final payment rule
    Then user does not see the update final payment rule popup
    # Scenario for APT-2002:
    Given user is on "Contract Details" page
    When user deletes the top final payment rule
    And user disregards the deletion of the final payment rule
    Then user sees the final payment rule is not deleted
    When user deletes the top final payment rule
    And user confirms the deletion of the final payment rule
    Then user sees the final payment rule is deleted

  #	@Regression-Disabled
  #	Scenario: APT-2479: Duplicate check when importing dates in price
  #		# Scenario 1: Duplicated Price records found + error message
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract with contract prices
  #		And user updates the contract
  #		And user opens the import dates from price popup
  #		And user decides to import the dates from price
  #		Then user sees feedback message "Unable to Import Dates. Please review the error messages below."
  #		And user sees error message "One or more dates being imported, already exists for the selected configuration."
  #
  @Regression @RegressionContractCostPage
  Scenario: APT-2480: 09a. Import Seasons in Add Contract Costs page
    # Additional Scenario: APT-2860: 09b. Import Season(s) in Update Contract Costs page
    # Scenario 1: Load Import Season pop-up
    # And Scenario 2: Filter functionality in Import From dropdown
    # And Scenario 3: Load Season on selection of Import From dropdown
    # And Scenario 4: Filter functionality in Season dropdown
    # And Scenario 5: Selecting season populates Date Ranges list box
    # And Scenario 6: Include Past Dates after selecting seasons
    # And Scenario 7: Changing Import From selection resets everything
    # And Scenario 8: Duplicate dates validation
    # And Scenario 9: Overlapping dates validation
    # And Scenario 10: Season logic is implemented, all cost types are imported, only future dates are imported
    # And Scenario 11: Season logic is implemented, all cost types are imported, past and future dates are imported
    # And Scenario 12: Cancel importing season
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract costs page
    And user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "3 Star Room" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "2CDCB" option of the contract cost configuration detail category 2 dropdown
    And user opens the import seasons popup
    Then user sees the import seasons popup contents
    When user searches for the contract cost import seasons popup import from dropdown value with "Crew" as the guest configuration, "Mountain Side Room - Driver" as the category 1 and "DBB" as the category 2
    And user selects the top import from search result in the list
    Then user sees the contract cost import seasons popup import from dropdown value with "Crew - Single      Mountain Side Room - Driver      DBB      1 - 99"
    When user ticks the "Season 2" option of the contract cost import seasons popup season dropdown
    Then user sees the contract cost import seasons popup season dropdown contains "Season 2"
    When user ticks the contract cost import seasons popup include past dates option
    And user ticks the "Season 1" option of the contract cost import seasons popup season dropdown
    Then user sees the contract cost import seasons popup season dropdown contains "All Selected"
    When user searches for the contract cost import seasons popup import from dropdown value with "Crew - T" as the guest configuration, "Run of House" as the category 1 and "DBB" as the category 2
    And user selects the top import from search result in the list
    Then user sees the contract cost import seasons popup season dropdown contains ""
    When user cancels the importing of season
    Then user does not see the import seasons popup

  #	@Regression-Disabled
  #	Scenario: APT-2518: Duplicate check when importing dates in cost
  #		# Scenario 1: Duplicated Cost records found + error message
  #		Given user opens browser
  #		When user logs into app
  #		And user navigates to contracts page
  #		And user searches for a contract with type foreign operator / land and with contract costs
  #		And user updates the contract
  #		And user toggles the hide past dates option
  #		And user opens the import dates from cost popup
  #		And user opens the cost configuration for the import dates from cost
  #		And user selects a specific cost configuration for the import dates from cost
  #		And user saves the import dates from cost popup
  #		Then user sees feedback message "Unable to Import Dates. Please review the error messages below."
  #		And user sees error message "One or more dates being imported, already exists for the selected configuration."
  #
  @Regression
  Scenario: APT-2555: Contract cannot be put on sale if at least one price record does not exist
    # Scenario 1: Cannot put contract on sale when it does not have prices
    # And Scenario 2: Cannot save if error message exists
    # And Scenario 3: Error message disappears on status other than on sale and internal sale
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract without contract prices
    And user updates the contract
    And user opens the update contract basic information popup
    And user changes the status of the contract to "On Sale"
    Then user sees error message "Contract cannot be put on sale as it does not have a valid Price."
    When user changes the status of the contract to "Loading"
    Then user does not see the error message "Contract cannot be put on sale as it does not have a valid Price."
    When user changes the status of the contract to "Internal Sale Only"
    Then user sees error message "Contract cannot be put on sale as it does not have a valid Price."

  @Regression-Slow @RegressionContractCostPage
  Scenario: APT-2560: 01a. Load and display ADD CONTRACT COSTS page
    # Additional Scenario: APT-2625: 06a. Add new costs in Add Contract Costs page
    # Additional Scenario: APT-2628: 07a. Add new costs in Update Contract Costs page
    # Additional Scenario: APT-2853: 06b. Delete a cost in Add Contract Costs page
    # Additional Scenario: APT-3192: Avoid defaults and duplicates in Add Contract Costs page and changes to dropdowns
    # Scenario 1: 'Add Contract Costs' skeleton
    # And Scenario 2: Populate 'Guest configuration' dropdown when contract type is transfer, coach or misc
    # And Scenario 3: Populate 'Guest configuration' dropdown when contract type is NOT transfer, coach or misc
    # And Scenario 4: Populate 'Category 1' dropdown when contract type is NOT Foreign Operator/Land
    # And Scenario 5: Empty and disable 'Category 1' dropdown when contract type is Foreign Operator/Land
    # And Scenario 6: Populate 'Category 2' dropdown when contract type is hotel or cruise
    # And Scenario 7: Populate 'Category 2' dropdown when contract type is rail
    # And Scenario 8: Populate 'Category 2' dropdown when contract type is NOT hotel, cruise or rail
    # And Scenario 9: Set field label of 'Min/Max Pax' when contract type is hotel
    # And Scenario 10: Set field label of 'Min/Max Pax' when contract type is cruise or rail
    # And Scenario 11: Set field label of 'Min/Max Pax' when contract type is NOT hotel, cruise or rail
    # And Scenario 12: Number validations on 'Min/Max Pax'
    # And Scenario 13: Number validations on 'Max Child Age'
    # And Scenario 14: Filter functionality in applicable Dropdowns
    # And Scenario 15: Cancel button
    #
    # Scenario for Contract Type "Coach":
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for contracts with type "Coach" and on loading status
    And user updates the contract
    And user opens the add contract costs page
    Then user is on "Add Contract Costs" page
    And user sees the add contract costs fields and buttons with its default values for the contract type "Coach"
    When user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    Then user sees the contract cost configuration detail guest configuration single select dropdown contains "Per Person"
    When user ticks the "Manifest" option of the contract cost configuration detail category 1 dropdown
    Then user sees the contract cost configuration detail category 1 dropdown contains "Manifest"
    When user ticks the "Pensioner" option of the contract cost configuration detail category 2 dropdown
    Then user sees the contract cost configuration detail category 2 dropdown contains "Pensioner"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/10" in the contract cost configuration detail maximum child age field
    Then user sees that the contract cost configuration detail maximum child age field contains "10"
    When user puts "10" in the contract cost configuration detail minimum pax field
    And user puts "5" in the contract cost configuration detail maximum pax field
    And user saves the contract costs
    Then user sees an error message that contains the message minimum pax value cant be greater than the maximum pax value
    When user puts "1" in the contract cost configuration detail minimum pax field
    Then user does not see the error message that contains the message minimum pax value cant be greater than the maximum pax value
    When user adds a new seasons group
    And user opens the add cost popup
    Then user sees the add cost popup fields and buttons with its default values for the contract type "Coach"
    When user ticks the per duration option as the rate type of the new cost
    Then user sees the number of days disabled
    When user cancels the addition of the new cost
    And user confirms the cancellation of the addition of the new cost
    And user closes the contract costs details page
    And user cancels the closing of the contract costs details page
    Then user is on "Add Contract Costs" page
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    Then user is on "Contract Details" page
    When user opens the add contract costs page
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user cancels the update of the contract
    Then user is on "Contracts" page
    # Scenario for Contract Type "Cruise":
    Given user is on "Contracts" page
    When user resets the search filters
    And user searches for contracts with type "Cruise" and on loading status
    And user updates the contract
    And user opens the add contract costs page
    Then user is on "Add Contract Costs" page
    And user sees the add contract costs fields and buttons with its default values for the contract type "Cruise"
    When user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    Then user sees the contract cost configuration detail guest configuration dropdown contains "Twin"
    When user ticks the "Balcony Suite" option of the contract cost configuration detail category 1 dropdown
    Then user sees the contract cost configuration detail category 1 dropdown contains "Balcony Suite"
    When user ticks the "BB" option of the contract cost configuration detail category 2 dropdown
    Then user sees the contract cost configuration detail category 2 dropdown contains "BB"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/10" in the contract cost configuration detail maximum child age field
    Then user sees that the contract cost configuration detail maximum child age field contains "10"
    When user puts "10" in the contract cost configuration detail minimum days field
    And user puts "5" in the contract cost configuration detail maximum days field
    And user saves the contract costs
    Then user sees an error message that contains the message minimum days value cant be greater than the maximum days value
    When user puts "1" in the contract cost configuration detail minimum days field
    Then user does not see the error message that contains the message minimum days value cant be greater than the maximum days value
    When user adds a new seasons group
    And user opens the add cost popup
    Then user sees the add cost popup fields and buttons with its default values for the contract type "Cruise"
    And user sees the number of days disabled
    When user cancels the addition of the new cost
    And user closes the contract costs details page
    And user cancels the closing of the contract costs details page
    Then user is on "Add Contract Costs" page
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    Then user is on "Contract Details" page
    When user opens the add contract costs page
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user cancels the update of the contract
    Then user is on "Contracts" page
    # Scenario for Contract Type "Foreign Operator / Land":
    Given user is on "Contracts" page
    When user resets the search filters
    And user searches for contracts with type "Foreign Operator / Land" and on loading status
    And user updates the contract
    And user opens the add contract costs page
    Then user is on "Add Contract Costs" page
    And user sees the add contract costs fields and buttons with its default values for the contract type "Foreign Operator / Land"
    When user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    Then user sees the contract cost configuration detail guest configuration dropdown contains "Twin"
    And user sees the contract cost configuration detail category 1 dropdown disabled
    When user ticks the "Pensioner" option of the contract cost configuration detail category 2 dropdown
    Then user sees the contract cost configuration detail category 2 dropdown contains "Pensioner"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/10" in the contract cost configuration detail maximum child age field
    Then user sees that the contract cost configuration detail maximum child age field contains "10"
    When user puts "10" in the contract cost configuration detail minimum pax field
    And user puts "5" in the contract cost configuration detail maximum pax field
    And user saves the contract costs
    Then user sees an error message that contains the message minimum pax value cant be greater than the maximum pax value
    When user puts "1" in the contract cost configuration detail minimum pax field
    Then user does not see the error message that contains the message minimum pax value cant be greater than the maximum pax value
    When user adds a new seasons group
    And user opens the add cost popup
    Then user sees the add cost popup fields and buttons with its default values for the contract type "Foreign Operator / Land"
    And user sees the number of days disabled
    When user cancels the addition of the new cost
    And user closes the contract costs details page
    And user cancels the closing of the contract costs details page
    Then user is on "Add Contract Costs" page
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    Then user is on "Contract Details" page
    When user opens the add contract costs page
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user cancels the update of the contract
    Then user is on "Contracts" page
    # Scenario for Contract Type "Hotel":
    Given user is on "Contracts" page
    # Contract ID 53 with type Hotel
    When user resets the search filters
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract costs page
    Then user is on "Add Contract Costs" page
    And user sees the add contract costs fields and buttons with its default values for the contract type "Hotel"
    When user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Harbour View Room" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "BB" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    Then user sees error message "Configuration(s) already exists in contract"
    When user clicks the contract cost configuration already exist icon
    When user closes contract cost existing configuration popup
    Then user sees error message "Configuration(s) already exists in contract"
    When user clicks the contract cost configuration already exist icon
    Then user sees the contract cost existing configuration details
    When user decides to remove all the contract cost existing configuration
    Then user does not see the error message "Configuration(s) already exists in contract"
    When user ticks the "Harbour View Room" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "BB" option of the contract cost configuration detail category 2 dropdown
    And user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    Then user sees the contract cost configuration detail guest configuration dropdown contains "Twin"
    When user ticks the "Balcony Suite" option of the contract cost configuration detail category 1 dropdown
    Then user sees the contract cost configuration detail category 1 dropdown contains "Balcony Suite"
    When user ticks the "BB" option of the contract cost configuration detail category 2 dropdown
    Then user sees the contract cost configuration detail category 2 dropdown contains "BB"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/10" in the contract cost configuration detail maximum child age field
    Then user sees that the contract cost configuration detail maximum child age field contains "10"
    When user puts "10" in the contract cost configuration detail minimum nights field
    And user puts "5" in the contract cost configuration detail maximum nights field
    And user saves the contract costs
    Then user sees an error message that contains the message minimum nights value cant be greater than the maximum nights value
    When user puts "1" in the contract cost configuration detail minimum nights field
    Then user does not see the error message that contains the message minimum nights value cant be greater than the maximum nights value
    When user adds a new seasons group
    And user opens the add cost popup
    Then user sees the add cost popup fields and buttons with its default values for the contract type "Hotel"
    When user adds the cost
    Then user sees error message "Duplicate record exists."
    When user ticks the "Pensioner" option of the cost detail cost type dropdown
    Then user does not see the error message "Duplicate record exists."
    When user puts "" in the cost detail quantity field
    And user puts "" in the cost detail cost field
    And user puts "" in the cost detail tax field
    And user puts "" in the cost detail gst field
    And user adds the cost
    Then user sees error message "*Mandatory field"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/10" in the cost detail quantity field
    Then user sees that the cost detail quantity field contains "10"
    When user puts "-1.01" in the cost detail cost field
    Then user sees that the cost detail cost field contains "-1.01"
    When user puts "-1.02" in the cost detail tax field
    Then user sees that the cost detail tax field contains "-1.02"
    When user puts "-1.03" in the cost detail gst field
    Then user sees that the cost detail gst field contains "-1.03"
    When user cancels the addition of the new cost
    And user cancels the cancellation of the addition of the new cost
    Then user sees the add cost popup
    When user cancels the addition of the new cost
    And user confirms the cancellation of the addition of the new cost
    Then user does not see the add cost popup
    When user opens the add cost popup
    And user cancels the addition of the new cost
    Then user does not see the add cost popup
    When user opens the add cost popup
    And user ticks the "Pensioner" option of the cost detail cost type dropdown
    And user adds the cost
    Then user sees the newly added cost in the costs table
    When user deletes the first cost in the contract costs table
    Then user does not see the cost deleted in the contract costs table
    When user opens the add cost popup
    And user ticks the per duration option as the rate type of the new cost
    Then user sees the number of days disabled
    When user cancels the addition of the new cost
    And user confirms the cancellation of the addition of the new cost
    And user closes the contract costs details page
    And user cancels the closing of the contract costs details page
    Then user is on "Add Contract Costs" page
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    Then user is on "Contract Details" page
    When user opens the add contract costs page
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user cancels the update of the contract
    Then user is on "Contracts" page
    # Scenario for Contract Type "Miscellaneous":
    Given user is on "Contracts" page
    When user resets the search filters
    And user searches for contracts with type "Miscellaneous" and on loading status
    And user updates the contract
    And user opens the add contract costs page
    Then user is on "Add Contract Costs" page
    And user sees the add contract costs fields and buttons with its default values for the contract type "Miscellaneous"
    When user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    Then user sees the contract cost configuration detail guest configuration single select dropdown contains "Per Person"
    When user ticks the "Bag" option of the contract cost configuration detail category 1 dropdown
    Then user sees the contract cost configuration detail category 1 dropdown contains "Bag"
    When user ticks the "Pensioner" option of the contract cost configuration detail category 2 dropdown
    Then user sees the contract cost configuration detail category 2 dropdown contains "Pensioner"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/10" in the contract cost configuration detail maximum child age field
    Then user sees that the contract cost configuration detail maximum child age field contains "10"
    When user puts "10" in the contract cost configuration detail minimum pax field
    And user puts "5" in the contract cost configuration detail maximum pax field
    And user saves the contract costs
    Then user sees an error message that contains the message minimum pax value cant be greater than the maximum pax value
    When user puts "1" in the contract cost configuration detail minimum pax field
    Then user does not see the error message that contains the message minimum pax value cant be greater than the maximum pax value
    When user adds a new seasons group
    And user opens the add cost popup
    Then user sees the add cost popup fields and buttons with its default values for the contract type "Miscellaneous"
    When user ticks the per duration option as the rate type of the new cost
    Then user sees the number of days enabled and with default value of 1
    When user cancels the addition of the new cost
    And user confirms the cancellation of the addition of the new cost
    And user closes the contract costs details page
    And user cancels the closing of the contract costs details page
    Then user is on "Add Contract Costs" page
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    Then user is on "Contract Details" page
    When user opens the add contract costs page
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user cancels the update of the contract
    Then user is on "Contracts" page
    # Scenario for Contract Type "Rail":
    Given user is on "Contracts" page
    When user resets the search filters
    And user searches for contracts with type "Rail" and on loading status
    And user updates the contract
    And user opens the add contract costs page
    Then user is on "Add Contract Costs" page
    And user sees the add contract costs fields and buttons with its default values for the contract type "Rail"
    When user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    Then user sees the contract cost configuration detail guest configuration dropdown contains "Twin"
    When user ticks the "Cabin Triple" option of the contract cost configuration detail category 1 dropdown
    Then user sees the contract cost configuration detail category 1 dropdown contains "Cabin Triple"
    When user ticks the "No Meals" option of the contract cost configuration detail category 2 dropdown
    Then user sees the contract cost configuration detail category 2 dropdown contains "No Meals"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/10" in the contract cost configuration detail maximum child age field
    Then user sees that the contract cost configuration detail maximum child age field contains "10"
    When user puts "10" in the contract cost configuration detail minimum days field
    And user puts "5" in the contract cost configuration detail maximum days field
    And user saves the contract costs
    Then user sees an error message that contains the message minimum days value cant be greater than the maximum days value
    When user puts "1" in the contract cost configuration detail minimum days field
    Then user does not see the error message that contains the message minimum days value cant be greater than the maximum days value
    When user adds a new seasons group
    And user opens the add cost popup
    Then user sees the add cost popup fields and buttons with its default values for the contract type "Rail"
    And user sees the number of days disabled
    When user cancels the addition of the new cost
    And user closes the contract costs details page
    And user cancels the closing of the contract costs details page
    Then user is on "Add Contract Costs" page
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    Then user is on "Contract Details" page
    When user opens the add contract costs page
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user cancels the update of the contract
    Then user is on "Contracts" page
    # Scenario for Contract Type "Transfer":
    Given user is on "Contracts" page
    When user resets the search filters
    And user searches for contracts with type "Transfer" and on loading status
    And user updates the contract
    And user opens the add contract costs page
    Then user is on "Add Contract Costs" page
    And user sees the add contract costs fields and buttons with its default values for the contract type "Transfer"
    When user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    Then user sees the contract cost configuration detail guest configuration single select dropdown contains "Per Person"
    When user ticks the "Dropoff: Hotel" option of the contract cost configuration detail category 1 dropdown
    Then user sees the contract cost configuration detail category 1 dropdown contains "Dropoff: Hotel"
    When user ticks the "Pensioner" option of the contract cost configuration detail category 2 dropdown
    Then user sees the contract cost configuration detail category 2 dropdown contains "Pensioner"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/10" in the contract cost configuration detail maximum child age field
    Then user sees that the contract cost configuration detail maximum child age field contains "10"
    When user puts "10" in the contract cost configuration detail minimum pax field
    And user puts "5" in the contract cost configuration detail maximum pax field
    And user saves the contract costs
    Then user sees an error message that contains the message minimum pax value cant be greater than the maximum pax value
    When user puts "1" in the contract cost configuration detail minimum pax field
    Then user does not see the error message that contains the message minimum pax value cant be greater than the maximum pax value
    When user adds a new seasons group
    And user opens the add cost popup
    Then user sees the add cost popup fields and buttons with its default values for the contract type "Transfer"
    When user ticks the per duration option as the rate type of the new cost
    Then user sees the number of days disabled
    When user cancels the addition of the new cost
    And user confirms the cancellation of the addition of the new cost
    And user closes the contract costs details page
    And user cancels the closing of the contract costs details page
    Then user is on "Add Contract Costs" page
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    Then user is on "Contract Details" page
    When user opens the add contract costs page
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user cancels the update of the contract
    Then user is on "Contracts" page

  @Regression @RegressionContractCostPage
  Scenario: APT-2598: 01b. Load and display UPDATE CONTRACT COSTS page
    # Additional Scenario: APT-2843: 03b. Delete a date range in Update Contract Costs page
    # Additional Scenario: APT-2856: 07b. Delete a cost in Update Contract Costs page
    # Scenario 1: 'Update Contract Costs' skeleton
    # And Scenario 2: Set field label of 'Min/Max Pax' when contract type is hotel
    # And Scenario 3: Set field label of 'Min/Max Pax' when contract type is cruise or rail
    # And Scenario 4: Set field label of 'Min/Max Pax' when contract type is NOT hotel, cruise or rail
    # And Scenario 5: Load dates and costs as per season selected
    # And Scenario 6: Cancel button
    # And Scenario for APT-2843:
    # And Scenario for APT-2856:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user hovers over a certain cell that is not empty in the contract costs table
    And user edits the contract cost
    Then user is on "Update Contract Costs" page
    And user sees the update contract costs fields and buttons with its default values
    When user deletes the top date range in the contract cost date ranges table
    And user cancels the deletion of the top date range in the contract cost date ranges table
    And user deletes the top date range in the contract cost date ranges table
    And user confirms the deletion of the top date range in the contract cost date ranges table
    And user deletes the first cost in the contract costs table
    And user cancels the deletion of the top cost in the contract costs table
    And user deletes the first cost in the contract costs table
    And user confirms the deletion of the top cost in the contract costs table
    And user closes the contract costs details page
    And user cancels the closing of the contract costs details page
    Then user is on "Update Contract Costs" page
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    Then user is on "Contract Details" page
    When user hovers over a certain cell that is not empty in the contract costs table
    And user edits the contract cost
    And user closes the contract costs details page
    Then user is on "Contract Details" page

  @Regression
  Scenario: APT-2600: 01c. Load and display VIEW CONTRACT COSTS page
    # Scenario 1: 'View Contract Costs' skeleton
    # And Scenario 2: Set field label of 'Min/Max Pax' when contract type is hotel
    # And Scenario 3: Set field label of 'Min/Max Pax' when contract type is cruise or rail
    # And Scenario 4: 'View Contract Costs' skeleton
    # And Scenario 5: 'View Contract Costs' skeleton
    # And Scenario 6: Cancel page
    # And Scenario 7: View Invoice Comments and Voucher Comments
    Given user opens browser
    When user with view rights logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user views the contract
    And user sees the first contract costs category accordion expanded and its contents without the write options
    And user uses column filters to filter the first contract costs category data
    And user hovers over a certain cell that is not empty in the contract costs table
    And user views the contract cost
    Then user sees the view contract costs contents
    When user closes the view contract costs
    Then user is on "View" page

  @Regression @RegressionContractCostPage
  Scenario: APT-2603: 04a. Allotment Code field behaviour in Add New Date Range pop-up
    # Scenario 1: Set default value in 'Allotment Code' field when a dates record exists in Dates Table
    # And Scenario 2: Set default value in 'Allotment Code' field as FREESALE in all other cases
    # And Scenario 3: Display dropdown list when clicked on 'Allotment Code' field
    # And Scenario 4: Column filter bar behaviour of 'Allotment Code' dropdown list when typed into one column filter bar
    # And Scenario 5: Column filter bar behaviour of 'Allotment Code' dropdown list when typed into both column filter bars
    # And Scenario 6: Select an 'Allotment Code' from the dropdown list
    # And Scenario 7: Navigate away from 'Allotment Code' field without selecting an allotment code
    # And Scenario 8: No matched results in 'Allotment Code' search
    # And Scenario 9: Typing inside 'Allotment Code' field instead of column filter bars
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract costs page
    And user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Balcony Suite" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "BB" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    And user opens the add date range popup
    Then user sees the new date range allotment dropdown
    When user puts "Test" as the allotment code for the contract costs new date range
    #		Then user sees the contract costs new date range allotment code dropdown has value "TEST"
    And user searches for an allotment code for the contract costs new date range with "TOK" as the allotment code and "Botanica" as the inventory pool
    And user selects the top allotment code search result in the dropdown for the contract costs new date range
    Then user sees the contract costs new date range allotment code dropdown has value "TOKNEW BTJP16"

  @Regression @RegressionContractCostPage
  Scenario: APT-2613: 02a.i Add new date range in Add Contract Costs page
    # Additional Scenario: APT-2619: 03a. Add new dates in Update Contract Costs page
    # Additional Scenario: APT-2842: 02b. Delete a date range in Add Contract Costs page
    # Additional Scenario: APT-2986: 02a.ii Date Fields and Validations in Add Date Range pop-up
    # Additional Scenario: APT-3745: Add and Edit Cost Screen changes
    # Scenario 1: Add New Date Range brings up a pop-up
    # And Scenario 2: 'Share Allowed' field
    # And Scenario 3: Mandatory validation on date range
    # And Scenario 4: Mandatory validation on allotment code
    # And Scenario 5: Cancel pop-up
    # And Scenario 6: Add new date ranges
    # And Scenario for APT-2619:
    # And Scenario for APT-2842:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract costs page
    And user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "3 Star Room" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "2CDCB" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    And user opens the add date range popup
    Then user sees the add date range popup fields and buttons with its default values
    And user sees the add date range share allowed toggle is enabled
    When user cancels the addition of the new date range
    And user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Double" option of the contract cost configuration detail guest configuration dropdown
    And user opens the add date range popup
    Then user sees the add date range share allowed toggle is disabled
    When user cancels the addition of the new date range
    And user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    And user cancels the update of the contract
    And user searches for a contract without costs
    And user updates the contract
    And user opens the add contract costs page
    And user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Full Day" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "Adult" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    And user opens the add date range popup
    And user adds the date ranges to the table
    Then user sees error message "At least one date range must be added."
    When user puts "01/09/2002" in the contract cost add date range start date field
    And user puts "01 Sep 2003" in the contract cost add date range end date field
    And user adds the new date range
    And user puts "" in the contract cost add date range allotment code field
    And user adds the date ranges to the table
    Then user does not see the error message "At least one date range must be added."
    And user sees error message "*Mandatory field"
    When user puts "FREESALE" in the contract cost add date range allotment code field
    And user adds the date ranges to the table
    Then user sees the newly added date range in the contract cost date ranges table
    When user deletes the top date range in the contract cost date ranges table
    Then user does not see the date range deleted in the contract cost date ranges table
    When user opens the add date range popup
    And user puts "01 Jan 2048" in the contract cost add date range start date field
    And user cancels the addition of the new date range
    And user cancels the cancellation of the addition of the new date range
    Then user sees the add date range popup
    When user cancels the addition of the new date range
    And user confirms the cancellation of the addition of the new date range
    Then user does not see the add date range popup
    # Scenario for APT-2986:
    Given user is on "Add Contract Costs" page
    When user opens the add date range popup
    And user puts "ABC" in the contract cost add date range start date field
    And user puts "XYZ" in the contract cost add date range end date field
    Then user sees error message "Invalid format"
    When user puts "" in the contract cost add date range start date field
    And user puts "" in the contract cost add date range end date field
    And user adds the new date range
    Then user sees error message "*Mandatory field"
    When user puts "01 Sep 2003" in the contract cost add date range start date field
    And user puts "01 Sep 2002" in the contract cost add date range end date field
    And user adds the new date range
    Then user sees error message "Start Date cannot be greater than End Date."
    When user puts "01 Sep 2002" in the contract cost add date range start date field
    And user puts "01 Sep 2003" in the contract cost add date range end date field
    And user adds the new date range
    And user puts "01 Sep 2002" in the contract cost add date range start date field
    And user puts "01 Sep 2003" in the contract cost add date range end date field
    And user adds the new date range
    Then user sees error message "Duplicate record exists."
    When user puts "01 Sep 2003" in the contract cost add date range start date field
    And user puts "01 Sep 2004" in the contract cost add date range end date field
    And user adds the new date range
    Then user sees error message "Duplicate record exists."

  @Regression @RegressionContractCostPage
  Scenario: APT-2623: 02c. Inline-Edit date ranges in Add Contract Costs page
    # Additional Scenario: APT-2624: 03c. Inline-Edit date ranges in Update Contract Costs page
    # Scenario 1: Table behaviour for inline edit
    # And Scenario 2: Start date and End date cell behaviour and validations
    # And Scenario 3: 'Share Allowed' cell
    # And Scenario 4: Date falls outside of contract date range
    # And Scenario 5: Duplicate date range validation
    # And Scenario 6: Overlapping date range validation
    # And Scenario 7: Mandatory validation on date range
    # And Scenario 8: Mandatory validation on allotment code
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user hovers over a certain cell that is not empty in the contract costs table
    And user edits the contract cost
    And user puts "01/09/2001" in the contract cost date range table top start date field
    And user puts "01 Sep 2003" in the contract cost date range table top end date field
    And user accepts the changes made on the contract costs date range row
    Then user sees error message "Date falls outside the date range of the contract."
    When user puts "01 Sep 2002" in the contract cost date range table top start date field
    And user puts "01 Sep 2003" in the contract cost date range table top end date field
    And user accepts the changes made on the contract costs date range row
    Then user does not see the error message "Date falls outside the date range of the contract."
    When user puts "01 Sep 2007" in the contract cost date range table top start date field
    And user puts "31 Aug 2008" in the contract cost date range table top end date field
    And user accepts the changes made on the contract costs date range row
    #		Then user sees error message "The date range overlaps with another date range."
    Then user sees error message "Duplicate record exists."
    When user puts "01 Sep 2025" in the contract cost date range table top start date field
    And user puts "01 Dec 2033" in the contract cost date range table top end date field
    And user accepts the changes made on the contract costs date range row
    Then user does not see the error message "Duplicate record exists."
    When user puts "" in the contract cost date range table top start date field
    And user puts "" in the contract cost date range table top end date field
    And user accepts the changes made on the contract costs date range row
    Then user sees error message "*Mandatory field"
    When user puts "01 Sep 2019" in the contract cost date range table top start date field
    And user puts "01 Aug 2020" in the contract cost date range table top end date field
    And user accepts the changes made on the contract costs date range row
    Then user does not see the error message "*Mandatory field"
    When user puts "ABC" in the contract cost date range table top start date field
    And user puts "XYZ" in the contract cost date range table top end date field
    And user accepts the changes made on the contract costs date range row
    Then user sees error message "Invalid format"
    When user puts "01 Sep 2019" in the contract cost date range table top start date field
    And user puts "01 Aug 2020" in the contract cost date range table top end date field
    And user accepts the changes made on the contract costs date range row
    Then user does not see the error message "Invalid format"
    When user puts "01 Sep 2021" in the contract cost date range table top start date field
    And user puts "01 Aug 2020" in the contract cost date range table top end date field
    And user accepts the changes made on the contract costs date range row
    Then user sees error message "Start Date cannot be greater than End Date."
    When user puts "01 Sep 2019" in the contract cost date range table top start date field
    And user puts "01 Aug 2020" in the contract cost date range table top end date field
    And user accepts the changes made on the contract costs date range row
    Then user does not see the error message "Start Date cannot be greater than End Date."

  @Regression @RegressionContractCostPage
  Scenario: APT-2629: 06c. Inline-Edit costs in Add Contract Costs page
    # Additional Scenario: APT-2630: 07c. Inline-Edit costs in Update Contract Costs page
    # Scenario 1: Table behaviour for inline edit
    # And Scenario 2: 'Number of Days' cell
    # And Scenario 3: Number validations on 'Quantity'
    # And Scenario 4: Number validations on 'Number of Days'
    # And Scenario 5: Currency validations on 'Cost'
    # And Scenario 6: Currency validations on 'Tax'
    # And Scenario 7: Currency validations on 'GST'
    # And Scenario 8: Mandatory validation for adding new cost
    # And Scenario 9: Mandatory validation error goes away
    # And Scenario 10: Cannot add already added cost type
    # And Scenario 11: Duplicate cost type error goes away
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user hovers over a certain cell that is not empty in the contract costs table
    And user edits the contract cost
    Then user sees the contract costs table number of days field is disabled
    #		When user opens the add cost popup
    #		And user ticks the "Pensioner" option of the cost detail cost type dropdown
    #		And user adds the cost
    #		And user ticks the "Pensioner" option of the contract costs table top cost type dropdown
    #		And user saves the changes on the modification on the top row of the costs table
    #		Then user sees error message "Duplicate record exists."
    #		When user ticks the "Adult" option of the contract costs table top cost type dropdown
    #		And user saves the changes on the modification on the top row of the costs table
    #		Then user does not see the error message "Duplicate record exists."
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/10" in the contract costs table top quantity field
    And user saves the changes on the modification on the top row of the costs table
    Then user sees that the contract costs table top quantity field contains "10"
    When user puts "-.01" in the contract costs table top cost field
    And user saves the changes on the modification on the top row of the costs table
    Then user sees that the contract costs table top cost field contains "-0.01"
    When user puts "-.02" in the contract costs table top tax field
    And user saves the changes on the modification on the top row of the costs table
    Then user sees that the contract costs table top tax field contains "-0.02"
    When user puts "-.03" in the contract costs table top gst field
    And user saves the changes on the modification on the top row of the costs table
    Then user sees that the contract costs table top gst field contains "-0.03"
    When user puts "" in the contract costs table top quantity field
    And user saves the changes on the modification on the top row of the costs table
    Then user sees error message "*Mandatory field"
    When user puts "2" in the contract costs table top quantity field
    And user saves the changes on the modification on the top row of the costs table
    Then user does not see the error message "*Mandatory field"

  @Regression @RegressionContractCostPage
  Scenario: APT-2631: 10b. Create cost records in Add Contract Costs page
    # Additional Scenario: APT-2632: 10c. Update cost record(s) in Update Contract Costs page
    # Additional Scenario: APT-3320: Closing the Add or Update Contract Cost screen after Save
    # Scenario 1: Mandatory validation before creating record(s)
    # And Scenario 2: At least one Season is mandatory
    # And Scenario 3: At least one Date Range is mandatory
    # And Scenario 4: At least one Cost record is mandatory
    # And Scenario 5: Adult cost type is mandatory depending on contract type
    # And Scenario 6: Mandatory fields validation error goes away
    # And Scenario 7: Mandatory validation error on Season goes away
    # And Scenario 8: Mandatory validation error on Date Ranges goes away
    # And Scenario 9: Mandatory validation error on Costs goes away
    # And Scenario 10: Mandatory validation error on Cost Type goes away
    # And Scenario 11: Save action cancelled when there are error messages
    # And Scenario 12: Check for duplicate configuration
    # And Scenario 13: Create cost record(s)
    # And Scenario 14: Cancel ‘Add Cost’
    # And Scenario 15: Discard changes confirmation message
    # And Scenario 16: Discard changes – confirm
    # And Scenario 17: Discard changes – Cancel
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract without costs
    And user updates the contract
    And user opens the add contract costs page
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user opens the add contract costs page
    And user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Full Day" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "Adult" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    And user opens the add date range popup
    And user puts "31 Dec 2010" in the contract cost add date range end date field
    And user adds the new date range
    And user adds the date ranges to the table
    And user saves the contract costs
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    When user toggles the hide past dates option
    And user expands the first contract costs category accordion
    And user hovers over a certain cell that is not empty in the contract costs table
    And user edits the contract cost
    And user puts "-.01" in the contract costs table top cost field
    And user saves the changes on the modification on the top row of the costs table
    And user saves the contract costs
    And user closes the contract costs details page
    Then user is on "Contract Details" page
    And user sees the contract cost is changed to "-0.01"
    # Cleanup:
    When user decides to delete all costs of the contract
    And user confirms the deletion of costs of the contract

  @Regression
  Scenario: APT-2636: 01. Load 'Import Dates from Cost' tab
    # Scenario 1: Display of Import From Cost tab
    # And Scenario 2: Display of Equivalent Cost Configuration
    # And Scenario 3: Select Price Currency
    # And Scenario 4: Select Pax Type(s)
    # And Scenario 5: Select ALL Pax Types
    # And Scenario 6: Enable 'Add to Table' button
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Sing" as the guest configuration, "Superior Mountain" as the category 1 and "DBB" as the category 2
    And user selects the top price configuration search result in the list
    Then user sees the contract price equivalent cost configuration with "Single" as the guest configuration, "Superior Mountain Side Room" as the category 1 and "DBB" as the category 2
    When user ticks the "NZD" option of the contract price import dates currency dropdown
    Then user sees the contract price import dates currency dropdown contains "AUD, NZD"
    And user adds the contract prices import dates add to table button enabled

  @Regression
  Scenario: APT-2639: 02. Create new price records by importing dates from cost
    # Additional Scenario: APT-3345: Cost validation while creating or editing Price records in Edit Price popup
    # Scenario 1: Create price records - only future dates
    # And Scenario 2: Create price records - including past dates
    # And Scenario 3: Mandatory validations
    # And Scenario 4: Error - Cost record with future dates does not exist
    # And Scenario 5: Validate new dates against existing rows
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Twin - 1 Adult & 1 Child" as the guest configuration, "Superior Mountain Side Room" as the category 1 and "RO" as the category 2
    And user selects the top price configuration search result in the list
    And user adds the contract prices import dates from cost to the table
    Then user sees error message "Cost does not exist for future dates."
    When user ticks the include past dates in importing dates for the contract prices
    And user adds the contract prices import dates from cost to the table
    And user adds the contract prices import dates from cost to the table
    Then user sees error message "Duplicate record(s) exists as indicated below."
    When user searches for the contract price configuration with "Crew" as the guest configuration, "Mountain Side Room - Driver" as the category 1 and "DBB" as the category 2
    And user selects the top price configuration search result in the list
    And user ticks the include past dates in importing dates for the contract prices
    And user adds the contract prices import dates from cost to the table
    And user ticks the "AUD" option of the contract price import dates currency dropdown
    And user adds the contract prices import dates from cost to the table
    Then user sees error message "*Mandatory field"

  @Regression
  Scenario: APT-2640: 03. Load 'Import Dates from Price' tab
    # Scenario 1: Display of Import From Price tab
    # And Scenario 2: Dropdown values for "From Price Configuration" field
    # And Scenario 3: Select Price Currency
    # And Scenario 4: Select Pax Type(s)
    # And Scenario 5: Select ALL Pax Types
    # And Scenario 6: Enable 'Add to Table' button
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Sing" as the guest configuration, "Superior Mountain" as the category 1 and "DBB" as the category 2
    And user selects the top price configuration search result in the list
    Then user sees the contract price equivalent cost configuration with "Single" as the guest configuration, "Superior Mountain Side Room" as the category 1 and "DBB" as the category 2
    When user toggles the import from price option of the contract price popup
    And user ticks the "NZD" option of the contract price import dates currency dropdown
    Then user sees the contract price import dates currency dropdown contains "NZD"
    And user adds the contract prices import dates add to table button enabled

  @Regression
  Scenario: APT-2641: 04. Create new price records by importing dates from price
    # Additional Scenario: APT-3331: 10c. Update cost record(s) in Update Contract Costs page
    # Scenario 1: Create price records with future dates
    # And Scenario 2: Create price records - including past dates
    # And Scenario 3: Import from Price - without copying price & commission values
    # And Scenario 4: Mandatory validations
    # And Scenario 5: No price exists
    # And Scenario 6: Error - Price record with future dates does not exist
    # And Scenario 7: Validate new dates against existing rows
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with contract prices
    And user updates the contract
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Twin" as the guest configuration, "Category SB" as the category 1 and "FB" as the category 2
    And user selects the top price configuration search result in the list
    And user toggles the import from price option of the contract price popup
    And user adds the contract prices import dates from price to the table
    Then user sees error message "*Mandatory field"
    When user searches for the contract price import from price with "Twin" as the guest configuration, "Category SS Triple" as the category 1 and "FB" as the category 2
    And user selects the top import from price search result in the list
    And user adds the contract prices import dates from price to the table
    Then user does not see the error message "*Mandatory field"
    And user sees error message "Price does not exist for future dates."
    When user ticks the "AUD" option of the contract price import dates currency dropdown
    And user ticks the "GBP" option of the contract price import dates currency dropdown
    And user ticks the "NZD" option of the contract price import dates currency dropdown
    And user ticks the "USD" option of the contract price import dates currency dropdown
    And user ticks the include past dates in importing dates for the contract prices
    And user adds the contract prices import dates from price to the table
    Then user does not see the error message "Price does not exist for future dates."
    And user sees error message "Price does not exist for entered criteria"
    When user ticks the "USD" option of the contract price import dates currency dropdown
    And user ticks the "AUD" option of the contract price import dates currency dropdown
    And user adds the contract prices import dates from price to the table
    And user adds the contract prices import dates from price to the table
    Then user sees error message "Duplicate record(s) exists as indicated below."

  @Regression
  Scenario: APT-2642: Due Date must be greater than today's date
    # Scenario 1: Default in Due Date field must be tomorrow's date
    # And Scenario 2: Due Date should be greater than today's date
    # And Scenario 3: Remove error message when value is edited
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the final payment rules tab
    And user opens the add final payment rule popup
    And user selects due date as the option for the final payment rule
    And user puts "01 Jan 1990" as the due date for the final payment rule
    Then user sees error message "Due Date must be greater than today."
    When user puts "31 Dec 2050" as the due date for the final payment rule
    Then user does not see the error message "Due Date must be greater than today."

  @Regression @RegressionContractCostPage
  Scenario: APT-2643: 05a. Comments cell inline-edit behaviour in Add Contract Costs page
    # Additional Scenario: APT-2844: 05b. Comments cell inline-edit behaviour in Update Contract Costs page
    # Scenario 1: Inline-edit Invoice and Voucher Comments
    # And Scenario 2: Edit Invoice and Voucher Comments in pop-up
    # And Scenario 3: Cancel editing Invoice and Voucher Comments in pop-up
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user hovers over a certain cell that is not empty in the contract costs table
    And user edits the contract cost
    And user edits the contract costs date range top invoice comments cell
    And user puts "Test Automation" as contract costs date range invoice comments
    And user confirms the new value for the contract costs date range invoice comment
    Then user sees "Test Automation" as the value of the contract costs date range top invoice comments cell
    When user edits the contract costs date range top invoice comments cell
    And user puts "Test Automation Cancel" as contract costs date range invoice comments
    And user discards the new value for the contract costs date range invoice comment
    Then user sees "Test Automation" as the value of the contract costs date range top invoice comments cell
    When user edits the contract costs date range top voucher comments cell
    And user puts "Test Automation" as contract costs date range voucher comments
    And user confirms the new value for the contract costs date range voucher comment
    Then user sees "Test Automation" as the value of the contract costs date range top voucher comments cell
    When user edits the contract costs date range top voucher comments cell
    And user puts "Test Automation Cancel" as contract costs date range voucher comments
    And user discards the new value for the contract costs date range voucher comment
    Then user sees "Test Automation" as the value of the contract costs date range top voucher comments cell

  @Regression @RegressionContractCostPage
  Scenario: APT-2852: 04c. Allotment Code cell inline-edit behaviour in Update Contract Costs page
    # Additional Scenario: APT-2606: 04b. Allotment Code cell inline-edit behaviour in Add Contract Costs page
    # Scenario 1: Display a pop-up with dropdown list when clicked on 'Allotment Code' cell
    # And Scenario 2: Single column filter bar behaviour of 'Allotment Code' dropdown list
    # And Scenario 3: Filter on both columns in 'Allotment Code' dropdown list
    # And Scenario 4: Select an 'Allotment Code' from the dropdown list
    # And Scenario 5: Navigate away from 'Allotment Code' cell without selecting an allotment code
    # And Scenario 6: No matched results in 'Allotment Code' search
    # And Scenario 7: Typing inside 'Allotment Code' cell instead of column filter bars
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user hovers over a certain cell that is not empty in the contract costs table
    And user edits the contract cost
    And user updates the top contract costs date ranges allotment code
    Then user sees the contracts costs date ranges update allotment code popup contents
    When user puts "Test" as the new allotment code for the contract costs date range allotment code
    And user accepts the changes made on the contract costs date range allotment code
    And user accepts the changes made on the contract costs date range row
    Then user sees the contract costs date range top allotment code cell has value "Test"
    When user updates the top contract costs date ranges allotment code
    And user searches for an allotment code for the contract costs date range allotment code with "TOK" as the allotment code and "Botanica" as the inventory pool
    And user selects the top allotment code search result in the list
    And user accepts the changes made on the contract costs date range allotment code
    And user accepts the changes made on the contract costs date range row
    Then user sees the contract costs date range top allotment code cell has value "TOKNEW BTJP16"
    When user updates the top contract costs date ranges allotment code
    And user accepts the changes made on the contract costs date range allotment code
    Then user sees error message "*Mandatory Field"
    When user cancels the update of the contract costs date ranges allotment code
    Then user does not see the contracts costs date ranges update allotment code popup

  @Regression @RegressionContractCostPage
  Scenario: APT-2855: 08a. Season to populate dates and costs in Add Contract Costs page
    # Scenario 1: Add new season
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract costs page
    And user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Balcony Suite" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "BB" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    And user deletes the first cost in the contract costs table
    And user adds a new seasons group
    Then user sees the new season added to the seasons group list
    # Scenario 2: Go back to season 1 after creating season 2
    Given user is on "Add Contract Costs" page
    When user selects the top season in the seasons group list
    Then user sees the contract costs details for the top season group
    # Scenario 3: Delete a season
    Given user is on "Add Contract Costs" page
    When user deletes the top season group in the seasons group list
    Then user does not see the deleted season group

  @Regression @RegressionContractCostPage
  Scenario: APT-2858: 08b. Season to populate dates and costs in Update Contract Costs page
    # Scenario 1: Load dates and costs as per season selected
    # And Scenario 2: Add new season
    # And Scenario 3: Go back to season 1 after creating season 2
    # And Scenario 4: Delete a season confirmation message
    # And Scenario 5: Confirming delete season
    # And Scenario 6: Cancelling delete season
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user hovers over a certain cell that is not empty in the contract costs table
    And user edits the contract cost
    And user deletes the top season group in the seasons group list
    And user cancels the deletion of the top season group in the seasons group list
    And user deletes the top season group in the seasons group list
    And user confirms the deletion of the top season group in the seasons group list
    Then user does not see the deleted season group

  @Regression @RegressionContractCostPage
  Scenario: APT-2863: 10a. Edit configuration details in Update Contract Costs page
    # Scenario 1: Load Edit Configuration Details pop-up
    # And Scenario 2: Populate 'Guest configuration' dropdown when contract type is transfer, coach or misc
    # And Scenario 3: Populate 'Guest configuration' dropdown when contract type is NOT transfer, coach or misc
    # And Scenario 4: Populate 'Category 1' dropdown when contract type is NOT Foreign Operator/Land
    # And Scenario 5: Empty and disable 'Category 1' dropdown when contract type is Foreign Operator/Land
    # And Scenario 6: Populate 'Category 2' dropdown when contract type is hotel or cruise
    # And Scenario 7: Populate 'Category 2' dropdown when contract type is rail
    # And Scenario 8: Populate 'Category 2' dropdown when contract type is NOT hotel, cruise or rail
    # And Scenario 9: Set field label of 'Min/Max Pax' when contract type is hotel
    # And Scenario 10: Set field label of 'Min/Max Pax' when contract type is cruise or rail
    # And Scenario 11: Set field label of 'Min/Max Pax' when contract type is NOT hotel, cruise or rail
    # And Scenario 12: Number validations on 'Min/Max Pax'
    # And Scenario 13: Number validations on 'Max Child Age'
    # And Scenario 14: Filter functionality in applicable Dropdowns
    # And Scenario 15: Mandatory validation
    # And Scenario 16: Mandatory fields validation error goes away
    # And Scenario 17: Duplicate configuration validation
    # And Scenario 18: Duplicate configuration validation error goes away
    # And Scenario 19: Cancel button
    # And Scenario 20: Edit Configuration Details
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user hovers over a certain cell that is not empty in the contract costs table
    And user edits the contract cost
    And user edits the contract costs configuration details
    Then user sees the edit contract cost configuration details popup contents for the contract type "Hotel"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/10" in the edit contract cost configuration detail maximum child age field
    Then user sees that the edit contract cost configuration detail maximum child age field contains "10"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/50" in the edit contract cost configuration detail minimum nights field
    Then user sees that the edit contract cost configuration detail minimum nights field contains "50"
    When user puts "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+-=[]{};:,.<>?/25" in the edit contract cost configuration detail maximum nights field
    Then user sees that the edit contract cost configuration detail maximum nights field contains "25"
    When user updates the contract costs configuration details
    Then user sees an error message that contains the message minimum nights value cant be greater than the maximum nights value
    When user puts "10" in the edit contract cost configuration detail minimum nights field
    Then user does not see the error message that contains the message minimum nights value cant be greater than the maximum nights value
    When user puts "" in the edit contract cost configuration detail maximum child age field
    And user puts "" in the edit contract cost configuration detail minimum nights field
    And user puts "" in the edit contract cost configuration detail maximum nights field
    And user updates the contract costs configuration details
    Then user sees error message "*Mandatory field"
    When user puts "10" in the edit contract cost configuration detail maximum child age field
    And user puts "1" in the edit contract cost configuration detail minimum nights field
    And user puts "50" in the edit contract cost configuration detail maximum nights field
    Then user does not see the error message "*Mandatory field"
    When user updates the contract costs configuration details
    Then user sees the updated contract costs configuration details
    When user edits the contract costs configuration details
    And user cancels the update of the contract costs configuration details
    Then user does not see the edit configuration details popup
    When user edits the contract costs configuration details
    And user puts "99" in the edit contract cost configuration detail maximum nights field
    And user updates the contract costs configuration details
    Then user does not see the edit configuration details popup

  @Regression
  Scenario: APT-2873 - Menu and Screen for Price Maintenance - User with view only permission
    # Scenario 1: New menu category beneath Contracts menu item
    Given user opens browser
    When user with view rights logs into app
    And user expands contracts accordion
    Then user sees price maintenance under contracts
    # Scenario 2: Collapsing new category hides new menu item
    When user collapses contracts accordion
    Then user does not see price maintenance
    # Scenario 3:
    When user navigates to price maintenance page
    Then user does not see add price
    And user sees fields displayed in field definitions
    When user inputs batch number with effective future
    #Scenario4
    Given user is on "Price Maintenance" page
    When user inputs batch number with effective processed
    Then user checks the first item containing the filtered text is selected
    #Scenario5a - Input Batch Number Future
    Given user is on "Price Maintenance" page
    When user inputs batch number with effective future
    #Scenario5b - Input Batch Number Only Processed
    Given user is on "Price Maintenance" page
    When user inputs batch number with effective processed
    #Scenario6
    Given user is on "Price Maintenance" page
    When user inputs a Contract ID from dropdown list
    #Scenario7a - Search Batch Number Future
    Given user is on "Price Maintenance" page
    When user inputs batch number with effective future
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is disabled
    And user sees results displayed for future
    #Scenario7b - Search Batch Number Process
    Given user is on "Price Maintenance" page
    When user inputs batch number with effective processed
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is disabled
    And user sees results displayed for processed
    #Scenario8a - Search Contract ID Future
    Given user is on "Price Maintenance" page
    When user inputs contract id with effect future
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is disabled
    And user sees results displayed for future
    #Scenario8b - Search Contract ID Process
    Given user is on "Price Maintenance" page
    When user inputs contract id with effect processed
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is disabled
    And user sees results displayed for processed
    #Scenario9a - Search Batch Number and Contract ID Future
    Given user is on "Price Maintenance" page
    When user inputs batch number and contract id with effect future
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is disabled
    And user sees results displayed for future
    #Scenario9b - Search Batch Number and Contract ID Process
    Given user is on "Price Maintenance" page
    When user inputs batch number and contract id with effect processed
    And user clicks on find price maintenance
    Then user views columns displayed in price maintenance
    And user sees process and delete button is disabled
    And user sees results displayed for processed
    #Scenario10
    Given user is on "Price Maintenance" page
    When user inputs batch number and contract id with effect processed
    And user clicks on find price maintenance
    And user clicks on Download Results button

  @Regression
  Scenario: APT-2876: 00. Remove/hide icons for Create Bulk Costs and Import Dates
    # Scenario 1: Remove icons from cost accordion
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    Then user does not see the create bulk costs and import dates icon in the contract costs accordion
    # Scenario 2: Remove icons from price accordion
    Given user is on "Contract Details" page
    Then user does not see the create bulk costs and import dates icon in the contract prices accordion

  @Regression
  Scenario: APT-2966: Contract Itinerary - Overlap Validation should only be against the same Day
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add itinerary template popup
    And user selects "APTCLUB ADAPTOR" as the itinerary template
    And user puts "1" as the day for the itinerary template
    And user puts "01 Jan 2020" as the start date for the itinerary template
    And user puts "31 Dec 2020" as the end date for the itinerary template
    And user saves the itinerary template
    Then user sees feedback message "Itinerary Template has been successfully added to the contract."
    When user opens the add itinerary template popup
    And user selects "APTCLUB ADAPTOR" as the itinerary template
    And user puts "2" as the day for the itinerary template
    And user puts "01 Jan 2020" as the start date for the itinerary template
    And user puts "31 Dec 2020" as the end date for the itinerary template
    And user saves the itinerary template
    Then user sees feedback message "Itinerary Template has been successfully added to the contract."
    When user deletes the top itinerary template
    And user confirms the deletion of the itinerary template
    And user deletes the top itinerary template
    And user confirms the deletion of the itinerary template
    Then user does not see the itinerary template

  @Regression
  Scenario: APT-2980: Contract Itinerary - Change overlapping Date Message
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add itinerary template popup
    And user selects "APTCLUB ADAPTOR" as the itinerary template
    Then user sees the itinerary template start date input field contains "01 Sep 2002"
    And user sees the itinerary template end date input field contains "31 Dec 2050"
    When user saves the itinerary template
    And user opens the add itinerary template popup
    And user selects "APTCLUB ADAPTOR" as the itinerary template
    Then user sees the itinerary template start date input field contains "01 Sep 2002"
    And user sees the itinerary template end date input field contains "31 Dec 2050"
    When user saves the itinerary template
    Then user sees in itinerary template start and end date fields validation message
    When user cancels the addition of itinerary template
    And user confirms the cancellation of the new itinerary template
    And user deletes the top itinerary template
    And user confirms the deletion of the itinerary template
    Then user does not see the itinerary template

  @Regression
  Scenario: APT-3010: Contract cannot be put on sale if price records are not valid for future dates
    # Scenario 1: Cannot put contract on sale when it does not have prices for dates >= today
    # And Scenario 2: Cannot save if error message exists
    # And Scenario 3: Error message disappears on status other than on sale and internal sale
    # And Scenario 4: Successfully put the contract on sale
    # And Scenario 5: Successfully put the contract on sale - when itinerary is not valid
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract without costs
    And user updates the contract
    And user opens the update contract basic information popup
    And user changes the status of the contract to "On Sale"
    And user expands the contract options accordion
    And user saves the update of contract basic information
    Then user sees error message "Contract cannot be put on sale as it does not have a valid Price."
    When user changes the status of the contract to "Loading"
    Then user does not see the error message "Contract cannot be put on sale as it does not have a valid Price."
    When user cancels the update of the contract basic information
    And user confirms the cancellation of the update of the contract basic information
    And user cancels the update of the contract
    And user searches for a contract with contract prices
    And user updates the contract
    And user opens the update contract basic information popup
    And user changes the status of the contract to "On Sale"
    And user expands the contract options accordion
    And user saves the update of contract basic information
    And user opens the update contract basic information popup
    And user changes the status of the contract to "Loading"
    And user expands the contract options accordion
    And user saves the update of contract basic information

  #Then user sees feedback message "Record saved successfully."
  @Regression @RegressionContractCostPage
  Scenario: APT-3022: 1.d View Configurations to be created in Add Contract Cost page
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract costs page
    And user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Balcony Suite" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "BB" option of the contract cost configuration detail category 2 dropdown
    And user views the guest configuration of the new contract cost
    Then user sees the list of all configuration combination

  @Regression @RegressionContractCostPage
  Scenario: APT-3114: Add/Edit Contract Costs screen - Triple 2 Adults & 1 Child default qty not correct for Pen, Sen, Stud
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract costs page
    And user ticks the "Triple - 2 Adults & 1 Child" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Balcony Suite" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "BB" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    And user opens the add cost popup
    Then user sees that the cost detail quantity field contains "2"
    When user ticks the "Pensioner" option of the cost detail cost type dropdown
    Then user sees that the cost detail quantity field contains "2"
    When user ticks the "Child" option of the cost detail cost type dropdown
    Then user sees that the cost detail quantity field contains "1"
    When user ticks the "Student" option of the cost detail cost type dropdown
    Then user sees that the cost detail quantity field contains "2"
    When user ticks the "Senior" option of the cost detail cost type dropdown
    Then user sees that the cost detail quantity field contains "2"

  @Regression
  Scenario: APT-3126: Menu access redesign for Contracts
    # Additional Scenario: APT-2302: 01. Sub-Menu for Upload Costs
    # Scenario 1: Bring a first level menu named CONTRACTS
    # And Scenario 2: Move existing Contracts menu as sub-menu within CONTRACTS
    # And Scenario 3: Other sub-menu links under CONTRACTS
    # And Scenario 4: Collapsing CONTRACTS main menu
    Given user opens browser
    When user logs into app
    Then user sees the contracts accordion and its sub-menu links
    When user navigates to upload costs page
    Then user is on "Upload Costs" page

  @Regression @RegressionContractCostPage
  Scenario: APT-3293: Add Season creates default cost record, changes in Import Season, Estimate Cost display
    # Additional Scenario: APT-3245: Cost Type correction in Cost screens for Misc, Transfer, Coach and Foreign Operator
    # Scenario 1: Create default Cost record during Add Season - Add Contract Costs page
    # And Scenario 2: Create default Cost record during Add Season - Update Contract Costs page
    # And Scenario 3: Estimate Cost records
    # And Scenario 4: Show error icon against Seasons without data
    # And Scenario 5: Position of 'Include past dates' checkbox to be changed in Import Seasons pop-up
    # And Scenario 6: Order of Guest Configuration in Import from dropdown in Import Seasons pop-up
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for contracts with type "Coach" and on loading status
    And user updates the contract
    And user opens the add contract costs page
    And user selects the "Per Item" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Full Day" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "Adult" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    Then user sees the cost type column of the default row in the cost table has only one option
    And user sees the default row in the cost table is defaulted to estimated
    When user opens the add cost popup
    Then user sees the cost type dropdown of the add cost popup has only one option
    When user cancels the addition of the new cost
    And user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    Then user sees the contract costs top cost type cell has value "Per Person"
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    And user cancels the update of the contract
    And user searches for contracts with type "Miscellaneous" and on loading status
    And user updates the contract
    And user opens the add contract costs page
    And user selects the "Per Item" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Full Day 4WD Tour" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "Adult" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    Then user sees the cost type column of the default row in the cost table has only one option
    And user sees the default row in the cost table is defaulted to estimated
    When user opens the add cost popup
    Then user sees the cost type dropdown of the add cost popup has only one option
    When user cancels the addition of the new cost
    And user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    Then user sees the contract costs top cost type cell has value "Per Person"
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    And user cancels the update of the contract
    And user searches for contracts with type "Transfer" and on loading status
    And user updates the contract
    And user opens the add contract costs page
    And user selects the "Per Item" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Pickup Rail - Dropoff Port" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "Adult" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    Then user sees the cost type column of the default row in the cost table has only one option
    And user sees the default row in the cost table is defaulted to estimated
    When user opens the add cost popup
    Then user sees the cost type dropdown of the add cost popup has only one option
    When user cancels the addition of the new cost
    And user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    Then user sees the contract costs top cost type cell has value "Per Person"
    When user closes the contract costs details page
    And user confirms the closing of the contract costs details page
    And user cancels the update of the contract
    And user searches for contracts with type "Foreign Operator / Land" and on loading status
    And user updates the contract
    And user opens the add contract costs page
    And user ticks the "Crew - Multi Share" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Adult" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    Then user sees the cost type column of the default row in the cost table has only one option
    And user sees the default row in the cost table is defaulted to estimated
    When user opens the add cost popup
    Then user sees the cost type dropdown of the add cost popup has only one option
    When user cancels the addition of the new cost
    And user ticks the "Adult" option of the contract cost configuration detail category 2 dropdown
    And user ticks the "Child" option of the contract cost configuration detail category 2 dropdown
    Then user does not see any costs in the contract costs table

  @Regression @RegressionContractCostPage
  Scenario: APT-3310: Quantity field behaviour when multiple Guest Configuration is selected
    # Scenario 1: Default value for Quantity field when multiple guest configuration is selected
    # And Scenario 2: Quantity is not editable when multiple guest configuration is selected
    # And Scenario 3: Quantity value change
    # And Scenario 4: Save correct quantity when saving cost records
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract costs page
    And user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Double" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "3 Star Room" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "2CDCB" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    Then user sees the quantity column of the default row in the cost table is disabled
    And user sees that the contract costs table top quantity field contains "2"
    When user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Double" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Triple" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Quad" option of the contract cost configuration detail guest configuration dropdown
    Then user sees that the contract costs table top quantity field contains "3"
    When user opens the add cost popup
    Then user sees the add cost popup quantity field is disabled

  @Regression
  Scenario: APT-3370: Deleting Costs should delete the related price records from Contract Summary
    #Scenario 1: Delete Cost in Update Contract page
    #Scenario 2.a: Delete Cost in Update Contract page - cost cell level
    #Scenario 2.b: Delete Cost in Update Contract page - Date level
    #Scenario 4: Delete Cost in Update Contract page - Category level
    #Scenario 5: Delete Cost in Update Contract page - All Costs
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "96682" id
    And user updates the contract
    And user opens the add contract costs page
    And user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "25 Seater" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "Adult" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    And user opens the add date range popup
    And user puts "01 Jan 2022" in the contract cost add date range start date field
    And user puts "31 Dec 2023" in the contract cost add date range end date field
    And user adds the new date range
    And user adds the date ranges to the table
    And user saves the contract costs
    And user closes the contract costs details page
    #DELETE BY ROW WITHOUT PRICE
    Given user open accordion for twenty five Seater cost
    When user clicks delete icon cost by row for twenty five Seater
    Then user sees message for delete cost by row for twenty five Seater
    When user clicks on Cancel button in the delete row popup
    #DELETE BY COLUMN WITHOUT PRICE
    Given user clicks on delete icon by column
    When user sees message for delete cost by column for twenty five Seater
    And user sees All Pax Types button in the popup
    And user sees This Pax Type Only button in the popup
    Then user clicks on close icon in the delete column popup
    #DELETE BY CELL WITHOUT PRICE
    Given user clicks on delete icon cost by cell for twenty five Seater
    When user sees delete cell popup message
    Then user clicks on Cancel button in delete cell popup
    #DELETE BY ACCORDION WITHOUT PRICE
    Given user clicks on delete link in the accordion
    And user sees message for delete cost by accordion for twenty five Seater
    Then user clicks on Cancel button in the delete accordion popup
    #Add price
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Per Person" as the guest configuration, "25 Seater" as the category 1 and "Adult" as the category 2
    And user selects the top price configuration search result in the list
    And user opens the contract price add custom dates section
    And user puts "01 Jan 2022" in the contract price start date field
    And user puts "31 Dec 2023" in the contract price end date field
    And user adds the contract prices custom dates to the table
    And user puts "150" in the contract prices popup contract prices table top price field
    Then user saves the contract prices
    #DELETE BY ROW WITH PRICE
    Given user clicks delete icon cost by row for twenty five Seater
    And user sees message for delete cost by row with price for twenty five Seater
    Then user clicks on Cancel button in the delete row popup
    #DELETE BY COLUMN WITH PRICE
    Given user clicks on delete icon by column
    When user sees message for delete cost by column with price for twenty five Seater
    And user sees All Pax Types button in the popup
    And user sees This Pax Type Only button in the popup
    Then user clicks on close icon in the delete column popup
    #DELETE BY CELL WITH PRICE
    Given user clicks on delete icon cost by cell for twenty five Seater
    When user sees delete cell popup message with price for twenty five Seater
    Then user clicks on Cancel button in delete cell popup
    #DELETE BY ACCORDION WITH PRICE
    Given user clicks on delete link in the accordion
    When user sees message for delete cost by accordion with price for twenty five Seater
    Then user clicks on Ok button in the delete accordion popup

  @Regression
  Scenario: APT-3370: Deleting Costs should delete the related price records from Contract Summary
    #Scenario 6a: User confirms deletion - when price record date range is within the date validity of deleted cost records
    #Scenario 6b: Price does not exist for the cost being deleted in scenarios 3.a to 3.f
    #Scenario 6c: User rejects deletion
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "96682" id
    And user updates the contract
    And user opens the add contract costs page
    And user selects the "Per Person" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "25 Seater" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "Adult" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    And user opens the add date range popup
    And user puts "01 Jan 2022" in the contract cost add date range start date field
    And user puts "31 Dec 2023" in the contract cost add date range end date field
    And user adds the new date range
    And user puts "01 Jan 2024" in the contract cost add date range start date field
    And user puts "31 Dec 2025" in the contract cost add date range end date field
    And user adds the new date range
    And user adds the date ranges to the table
    And user saves the contract costs
    And user closes the contract costs details page
    #Add price
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Per Person" as the guest configuration, "25 Seater" as the category 1 and "Adult" as the category 2
    And user selects the top price configuration search result in the list
    And user opens the contract price add custom dates section
    And user puts "01 Jan 2022" in the contract price start date field
    And user puts "31 Dec 2025" in the contract price end date field
    And user adds the contract prices custom dates to the table
    And user puts "150" in the contract prices popup contract prices table top price field
    Then user saves the contract prices
    #DELETE BY ROW WITH OVERLAPPING PRICE
    Given user open accordion for twenty five Seater cost
    When user clicks delete icon cost by row for twenty five Seater
    And user sees message for delete cost by row with overlapping price date for twenty five Seater
    Then user clicks on Cancel button in the delete row popup
    #DELETE BY COLUMN WITH OVERLAPPING PRICE
    Given user clicks on delete icon by column
    When user sees message for delete cost by column with overlapping price date for twenty five Seater
    And user sees All Pax Types button in the popup
    And user sees This Pax Type Only button in the popup
    Then user clicks on close icon in the delete column popup
    #DELETE BY CELL WITH OVERLAPPING PRICE
    Given user clicks on delete icon cost by cell for twenty five Seater
    When user sees delete cell popup message with overlapping price date for twenty five Seater
    Then user clicks on Cancel button in delete cell popup
    #DELETE BY ACCORDION WITH OVERLAPPING PRICE
    Given user clicks on delete link in the accordion
    When user sees message for delete cost by accordion with overlapping price date for twenty five Seater
    Then user clicks on Ok button in the delete accordion popup

  @Regression
  Scenario: APT-3411: Show Created By and Date in Contract Basic Information
    # Scenario 1: Save the Created By and Created Date when the contract is created already implemented
    # And Scenario 2: Show the Created By and Created Date in the Basic Information section in the Update Contract page
    # And Scenario 3: Show the Created By and Created Date in the Update Basic Information popup
    # And Scenario 4: Show the Created By and Created Date in the View Contract page
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    Then user sees the created by and created date information
    When user opens the update contract basic information popup
    Then user sees the created by and created date information on the update contract basic information popup
    When user cancels the update of the contract basic information
    And user cancels the update of the contract
    And user logs out of the app
    And user with view rights logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user views the contract
    Then user sees the created by and created date information

  @Regression
  Scenario: APT-3416: Hover required over 'Contract Name' and 'Comments' in the contract Search results table.
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    Then user sees the tooltip for the contract name when hovered over contract name in the contracts page
    And user sees the tooltip for the comments when hovered over comments in the contracts page

  @Regression
  Scenario: APT-3462: 1.1 Add Hotel - Price Configuration & Pax Type in Add or Edit Price screens
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "53" id
    And user clicks on edit contract button of any contracts in the list
    And user opens the add contract price popup
    Then user checks if the default value for pax type dropdown on cost import date is not set
    When user selects Import from price
    Then user checks if the default value for pax type dropdown on price import date is not set
    When user opens the contract price add custom dates section
    Then user checks if the default value for pax type dropdown is not set
    When user searches for the contract price configuration with "Quad - 2 Adults & 2 Children" as the guest configuration, "Run of House" as the category 1 and "BB" as the category 2
    And user selects the top price configuration search result in the list
    Then user checks if the default value for pax type dropdown is set to adult
    When user opens the contract price import dates section
    Then user checks if the default value for pax type dropdown on price import date is set to adult
    And user checks if import from price field value is null
    When user selects Import from cost
    Then user checks if the default value for pax type dropdown on cost import date is set to adult
    When user selects Import from price
    And user searches for the contract price configuration with "Twin" as the guest configuration, "Harbour View Room" as the category 1 and "BB" as the category 2
    And user selects the top price configuration search result in the list
    Then user checks if import from price field value is contains to "Twin" "Harbour View Room" "BB" "1-99"

  @Regression
  Scenario: APT-3462: 1.1 Edit Hotel - Price Configuration & Pax Type in Add or Edit Price screens
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "53" id
    And user clicks on edit contract button of any contracts in the list
    And user hovers over a certain cell that is not empty in the contract price table
    And user edits the contract price
    And user opens the contract price edit custom dates section
    And user searches for the contract price configuration with "Quad - 2 Adults & 2 Children" as the guest configuration, "Run of House" as the category 1 and "BB" as the category 2
    And user selects the top price configuration search result in the list
    Then user checks if the default value for pax type dropdown is set to adult

  @Regression
  Scenario: APT-3462: 1.2 Add Coach - Price Configuration & Pax Type in Add or Edit Price screens
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "28" id
    And user clicks on edit contract button of any contracts in the list
    And user opens the add contract price popup
    Then user checks if the default value for pax type dropdown on cost import date is not set
    When user selects Import from price
    Then user checks if the default value for pax type dropdown on price import date is not set
    When user opens the contract price add custom dates section
    Then user checks if the default value for pax type dropdown is not set
    When user searches for the contract price configuration with "Per Item" as the guest configuration, "Seat Inventory" as the category 1 and "Adult" as the category 2
    And user selects the top price configuration search result in the list
    Then user checks if the default value for pax type dropdown is set to adult
    When user opens the contract price import dates section
    Then user checks if the default value for pax type dropdown on price import date is set to adult
    #NO DATA
    #And user checks if import from price field value is null
    When user selects Import from cost
    Then user checks if the default value for pax type dropdown on cost import date is set to adult
    When user selects Import from price
    And user searches for the contract price configuration with "Per Item" as the guest configuration, "Seat Inventory" as the category 1 and "Adult" as the category 2
    And user selects the top price configuration search result in the list
    Then user checks if import from price field value is contains to "Per Item" "Seat Inventory" "Adult" "1-1"

  @Regression
  Scenario: APT-3462: 1.2 Edit Coach - Price Configuration & Pax Type in Add or Edit Price screens
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "28" id
    And user clicks on edit contract button of any contracts in the list
    And user hovers over a certain cell that is not empty in the contract price table
    And user edits the contract price
    And user opens the contract price edit custom dates section
    And user searches for the contract price configuration with "Per Item" as the guest configuration, "Seat Inventory" as the category 1 and "Adult" as the category 2
    And user selects the top price configuration search result in the list
    Then user checks if the default value for pax type dropdown is equal to category two of the chosen price configuration

  @Regression
  Scenario: APT-3462: 1.3 Add Cruise - Price Configuration & Pax Type in Add or Edit Price screens
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "42922" id
    And user clicks on edit contract button of any contracts in the list
    When user opens the add contract price popup
    Then user checks if the default value for pax type dropdown on cost import date is not set
    When user selects Import from price
    Then user checks if the default value for pax type dropdown on price import date is not set
    When user opens the contract price add custom dates section
    Then user checks if the default value for pax type dropdown is not set
    When user searches for the contract price configuration with "Triple" as the guest configuration, "Category K Triple" as the category 1 and "FB" as the category 2
    And user selects the top price configuration search result in the list
    Then user checks if the default value for pax type dropdown is set to adult
    When user opens the contract price import dates section
    Then user checks if the default value for pax type dropdown on price import date is set to adult
    And user checks if import from price field value is null
    When user selects Import from cost
    Then user checks if the default value for pax type dropdown on cost import date is set to adult
    When user selects Import from price
    And user searches for the contract price configuration with "Twin" as the guest configuration, "Category AA" as the category 1 and "FB" as the category 2
    And user selects the top price configuration search result in the list
    Then user checks if import from price field value is contains to "Twin" "Category AA" "FB" "1-99"

  @Regression
  Scenario: APT-3462: 1.3 Edit Cruise - Price Configuration & Pax Type in Add or Edit Price screens
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "42922" id
    And user clicks on edit contract button of any contracts in the list
    And user hovers over a certain cell that is not empty in the contract price table
    And user edits the contract price
    And user opens the contract price edit custom dates section
    And user searches for the contract price configuration with "Triple" as the guest configuration, "Category K Triple" as the category 1 and "FB" as the category 2
    And user selects the top price configuration search result in the list
    Then user checks if the default value for pax type dropdown is set to adult

  @Regression
  Scenario: APT-3462: Error checking
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "53" id
    And user clicks on edit contract button of any contracts in the list
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Twin" as the guest configuration, "Harbour View Room" as the category 1 and "BB" as the category 2
    And user selects the top price configuration search result in the list
    And user selects Import from price
    And user ticks the "AUD" option of the contract price import dates currency dropdown
    And user ticks the "YZ2" option of the contract price import dates currency dropdown
    And user click add to table button
    And user sees error message for no existing cost in adding custom price

  @Regression
  Scenario: APT-3509: Start & End dates in ADD Itinerary Template needs to default from contract start & end dates
    # Additional Scenario: APT-3510: 'Time' in Add Itinerary Template needs to default to 22:00
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add itinerary template popup
    Then user sees the itinerary template start date input field contains "01 Sep 2002"
    And user sees the itinerary template end date input field contains "31 Dec 2050"
    And user sees the itinerary template time input field contains "22:00"

  @Regression
  Scenario: APT-3536: 01.Rename fields in Add, Update and View popup
    Given user opens browser
    When user logs into app
    And user navigates to price maintenance page
    Then user is on "Price Maintenance" page
    When user click add price on Price Maintenance page
    Then user sees fields displayed in add price maintenance

  @Regression
  Scenario: APT-3536: 02.Default value for Min and Max Commission
    Given user opens browser
    When user logs into app
    And user navigates to price maintenance page
    Then user is on "Price Maintenance" page
    When user click add price on Price Maintenance page
    Then user sees fields displayed in add price maintenance
    And user sees default value displayed in add price maintenance
    And user add minimum commission greater than maximun comission
    And user add less than zero minimum and maximum commission
    And user add greater than one hundred minimum and maximum commission

  @Regression
  Scenario: APT-3536: 03. and 04.
    Given user opens browser
    When user logs into app
    And user navigates to price maintenance page
    Then user is on "Price Maintenance" page
    When user click add price on Price Maintenance page
    Then user check price fields validation message
    And user enter negative value in the price fields

  @Regression
  Scenario: APT-3536: 05.Field value to be displayed as hover in Price Maintenance
    Given user opens browser
    When user logs into app
    And user navigates to price maintenance page
    Then user is on "Price Maintenance" page
    When user inputs batch number and contract id with effect future
    And user searches for the entered batch number and contract id
    Then user hover over a certain cell and check the tooltip value

  @Regression
  Scenario: APT-3571: Copy Contract - Disable buttons and icons for Itinerary template and payment rule accordions
    # Scenario 1 : Disable Add buttons
    # And Scenario 2: Disable Edit and Delete options
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    Then user is on "Contracts" page
    When user searches for a contract with iterinary template and payment rule by id
    And user clicks on copy contract button of any contracts in the list
    Then user checks if Add iterinary template button is disabled
    And user checks if Add rule button is disabled
    And user checks if Edit iterinary template button is disabled
    And user checks if Delete iterinary template button is disabled
    And user checks if Edit payment rule button is disabled
    And user checks if Delete payment rule button is disabled

  @Regression
  Scenario: APT-3603: Cost configuration should not be allowed for overlapping min/max range
    Given user opens browser
    When user logs into app
    Then user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the add contract costs page
    And user ticks the "Twin" option of the contract cost configuration detail guest configuration dropdown
    And user ticks the "Harbour View Room" option of the contract cost configuration detail category 1 dropdown
    And user ticks the "BB" option of the contract cost configuration detail category 2 dropdown
    And user adds a new seasons group
    Then user sees an error message that contains the message Configurations already exists in contract
    Then user enters minimum pax greater than maximum pax
    And user adds a new seasons group
    Then user sees an error message that contains the message Configurations already exists in contract

  @Regression
  Scenario: APT-3654: Price Maintenance $ values to be right aligned and show decimal values
    #Scenario 1: On View and Edit Access Pages of Price Maintenance, for both Future and Processed search results
    #Scenario 2: When displaying the Popup accessed by Editing a row or clicking on the View Access
    Given user opens browser
    When user logs into app
    And user navigates to price maintenance page
    Then user search for future batch number "20200114091218"
    And user searches for the entered batch number and contract id
    And user check the price maintenance table value is in decimal format
    And user check the price maintenance table value is in right alignment
    And user check the price format in the edit price maintenance popup

  @Regression
  Scenario: APT-3708: Default filter and Clearing of filters in the Data Grid in Contract Price Popup
    # Scenario 1a: Add Custom Date
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "96682" id
    And user updates the contract
    And user hovers over a certain cell that is not empty in the contract prices table
    And user edits the contract price
    And user opens the contract price add custom dates accordion
    And user puts "01 Mar 2022" in the contract price start date field
    And user puts "31 Dec 2050" in the contract price end date field
    And user ticks the "AUD" option of the contract price add custom dates currency dropdown
    And user ticks the "EUR" option of the contract price add custom dates currency dropdown
    And user adds the contract prices custom dates to the table
    Then user sees the added price in the contract prices table

  @Regression
  Scenario: APT-3723: Delete Contracts when it is not used on packages/bookings
    #Navigate to Contracts PAge
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    Then user decides to add a new contract
    #Create Contract
    Given user is on "Contract Details" page
    And user enter details of the contract
    When user saves the contract
    Then user sees feedback message Contract ID has been "created successfully." displayed
    And user close details page for the newly created contract
    #Check Delete button
    Given user is on "Contracts" page
    When user searches for a contract name "TestContract"
    Then user sees a delete icon in the contract shown in the list
    #Delete un-used contract
    Given user clicks on delete button
    And confirmation popup message is displayed for unused contract
    When user clicks on OK button in the delete popup
    Then user sees feedback message "Contract and all associated details deleted successfully. "
    #Search for used contract
    Given user is on "Contracts" page
    And user searches for a contract by id
    #Delete used contract
    Given user clicks on delete button
    And confirmation popup message is displayed for used contract
    When user clicks on OK button in the popup
    Then selected contract is not deleted

  @Regression
  Scenario: APT-3744: Hover for long text, field validations in Edit Basic Info popup
    # Scenario 1:
    # And Scenario 2:
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract by id
    And user updates the contract
    And user opens the update contract basic information popup
    Then user sees the update contract basic information fields tooltips when hovered

  @Regression
  Scenario: APT-3801: Copy contract to allow bulk changes to Allotment Code
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "96682" id
    And user copies the contract
    Then expected fields are displayed
    #Scenario 3: Mandatory field
    Given user is on "Contract Details" page
    When user create contract without populating new allotment code
    Then user sees in field validation message for new allotment code
    When user create contract without populating replace allotment code
    Then user sees in field validation message for replace allotment code
    When user create contract without populating add characters to code
    Then user sees in field validation message for add characters to code
    #Scenario 2.a: Changing Allotment Codes to a new Code
    #Scenario 4: Hide 'Create Bulk Cost' button
    Given user is on "Contract Details" page
    When user create new allotment code
    Then existing allotment code for the existing contracts will be created
    #Scenario 2.b: Replace part of existing Allotment Code with a new text
    Given user is on "Contract Details" page
    When user replace an existing allotment code
    Then existing allotment code for the contracts will be replaced
    #Scenario 2.c: Add characters to the end of existing Allotment Code
    Given user is on "Contract Details" page
    When user add characters to an existing allotment code
    Then characters to the existing allotment code will be appended

  @Regression
  Scenario: APT-3942: Add to Table button behavior and Price Configuration field changes in Edit Price popup
    #Scenario 1: Add to Table is not disabled if all fields have value
    Given user opens browser
    When user logs into app
    And user navigates to contracts page
    And user searches for a contract with "96682" id
    And user updates the contract
    And user opens the add contract price popup
    And user searches for the contract price configuration with "Per Person" as the guest configuration, "Porterage" as the category 1 and "Adult" as the category 2
    And user selects the top price configuration search result in the list
    And user opens the contract price add custom dates section
    And user sees that add to table button is enabled
    And user puts "01 Jan 2022" in the contract price start date field
    And user puts "" in the contract price end date field
    And user sees that add to table button is disabled
    Then user click cancel button in the add contract prices popup
    #Scenario 2: Price Configuration value does not reverts to original value if there is an error
    Given user is on "Contract Details" page
    When user hovers over a certain cell that is not empty in the contract prices table
    And user edits the contract price
    And user searches for the contract price configuration with "Per Item" as the guest configuration, "Porterage" as the category 1 and "Child" as the category 2
    And user selects the top price configuration search result in the list
    Then user saves the contract prices
    And user sees error message "Cannot change value as Price already exists."
    When price configuration dropdown is not reverted to the original value
    Then user click cancel button in the add contract prices popup
    #Scenario 3: Hide the Edit and Delete icons in the Max Commission column in Price Table
    Given user is on "Contract Details" page
    When user hovers over a certain maximum commission cell that is not empty in the contract prices table
    Then edit and delete icon is not visible in maximum commission cell
