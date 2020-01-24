Feature: APT - Users
	I want to use this feature file for testing APT - Users user stories

	@Regression
	Scenario: APT-889: Side Menu: Hamburger Expand/Collapse icon for the Side Menu on OxyAdmin screen
		# Scenario 1: Visibility of Hamburger Menu Icon
		Given user opens browser
		When user logs into app
		Then user sees the hamburger menu icon is displayed

	@Regression
	Scenario: APT-889: Side Menu: Hamburger Expand/Collapse icon for the Side Menu on OxyAdmin screen
		# Scenario 2: Behaviour of Hamburger Menu Icon - Display Menu List
		Given user opens browser
		When user logs into app
		And user clicks on the hamburger menu
		Then user sees the hamburger menu is expanded

	@Regression
	Scenario: APT-889: Side Menu: Hamburger Expand/Collapse icon for the Side Menu on OxyAdmin screen
		# Scenario 2: Behaviour of Hamburger Menu Icon - Highlight Previous Selection
		Given user opens browser
		When user logs into app
		And user navigates to contracts page
		And user clicks on the hamburger menu
		Then user sees the selected menu is higlighted

	@Regression
	Scenario: APT-889: Side Menu: Hamburger Expand/Collapse icon for the Side Menu on OxyAdmin screen
		# Scenario 2: Behaviour of Hamburger Menu Icon - Collapse Menu List
		Given user opens browser
		When user logs into app
		And user clicks on the hamburger menu
		Then user sees the hamburger menu is expanded
		And user clicks on the header
		Then user sees the hamburger menu is collapsed