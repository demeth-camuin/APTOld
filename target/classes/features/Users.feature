Feature: APT - Users
  I want to use this feature file for testing APT - Users user stories

  @Regression
  Scenario: APT-78: As a User, I want to login to Oxy Admin portal so that I can access and use the portal
    # Scenario 1: Successful Login
    # And Scenario 2:
    Given user opens browser
    Then user is on "Login" page
    When user logs into app
    Then user is on "HomePage" page
    And user validates his account is logged in
    When user logs out of the app
    # Scenario 3: Login Unsuccessful
    Given user is on "Login" page
    When user logs into app with invalid credentials
    Then user sees feedback message "Invalid User Credentials"

  @Regression-Slow
  Scenario: APT-81: As an Administrator, I want Oxy Admin to log users out during periods of inactivity so that it prevents them from being used
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user becomes inactive for "20" minutes
    And user navigates to user profile page
    Then user sees feedback message "Session timed out"

  @Regression
  Scenario: APT-82: As an Administrator, I want users accounts to be locked after a number of unsuccessful login attempts so that unauthorised access can be prevented
    # Scenario 1:
    # And Scenario 2:
    Given user opens browser
    When user logs into app with invalid credentials "5" times
    Then user sees feedback message "Account has been locked due to unsuccessful login attempts. Please contact helpdesk."

  @Regression
  Scenario: APT-83: As an User, I want to manage my profile so that I can set a profile picture and reset my password
    # Scenario 1: Ability to see profile picture in application
    Given user opens browser
    When user logs into app
    Then user profile picture is displayed
    # Scenario 2: Accessing user profile menu
    Given user is on "HomePage" page
    When user clicks on user dropdown
    Then user sees user profile menu
    # Scenario 3: Log out
    Given user is on "HomePage" page
    When user logs out of the app
    Then user is on "Login" page
    # Scenario 4: View my Profile
    Given user is on "Login" page
    When user logs into app
    And user navigates to user profile page
    Then user is on "EditProfile" page
    And user sees own information
    # Scenario 5: Edit my Profile
    Given user is on "EditProfile" page
    When user updates own information
    Then user sees feedback message "Profile updated."
    # Scenario 6: Successful Password Change
    Given user is on "EditProfile" page
    When user updates password
    Then user sees feedback message "Password changed successfully"
    # Scenario 7: Unsuccessful Password Change
    Given user is on "EditProfile" page
    When user updates password invalidly
    Then user sees feedback message "Passwords do not match."

  @Regression
  Scenario: APT-126: As a Business Administrator, I want to CREATE users so that users can access their respective portal
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to users page
    And user navigates to new user creation page
    Then user is on "UserDetails" page
    # Scenario 2:
    # And Scenario 3:
    Given user is on "UserDetails" page
    Then user sees save button is disabled
    When user creates a new user
    Then user sees feedback message "Activation link is successfully sent to the User"
    # Scenario 4:
    Given user is on "User" page
    When user navigates to new user creation page
    And user creates a user that is already existing
    Then user sees feedback message "An account with this email id exist in the system"

  # Scenario 5:
  #Given user is on "UserDetails" page
  #When user closes add user page
  #Then user is on "User" page
  #
  @Regression
  Scenario: APT-159: As a Business Administrator, I want to SEARCH User records, so that I can manage the user accounts
    # Additional Scenario: APT-399: As an Administrator, I want to unlock a user's locked account so that the user may log into Oxy Admin
    # Scenario 1:
    # And Scenario 2:
    # And Scenario 3:
    Given user opens browser
    When user logs into app
    And user navigates to users page
    And user uses column filters to filter the users result
    And user removes the users column filters
    And user searches for an existing user
    Then user sees the existing user in the table
    # Scenario 4:
    Given user is on "User" page
    When user searches for a user that is not existing
    Then user sees no results in the table
    # Scenario 5:
    Given user is on "User" page
    When user searches for an existing user
    And user unlocks the existing user
    Then user sees feedback message "Account unlocked"
    # Scenario 6:
    Given user is on "User" page
    When user resets the password of the existing user
    Then user sees feedback message a reset password email has been sent
    # Scenario 7:
    Given user is on "User" page
    When user deactivates the existing user but cancels the request
    Then user sees that the user is still active

  @Regression
  Scenario: APT-161: As a Business Administrator, I want to VIEW and EDIT a user account so that I can maintain user accounts up-to date
    # Scenario 7: Covered in APT-182
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to users page
    And user searches for a user to be updated
    Then user sees user details information
    # Scenario 2:
    Given user is on "UserDetails" page
    When user updates user information
    Then user sees feedback message "User is updated"
    # Scenario 3:
    Given user is on "User" page
    When user searches for a user to be updated
    And user updates user email address
    Then user sees feedback message "User is updated"
    # Scenario 4:
    Given user is on "User" page
    When user searches for a user to be updated
    And user cleared a mandatory field
    Then user sees save button is disabled
    # Scenario 5:
    Given user is on "UserDetails" page
    When user closes add user page
    Then user is on "User" page
    # Scenario 6:
    Given user is on "User" page
    When user searches for a user to have his password reset
    And user sent a request for the link for the reset password
    Then user sees feedback message a reset password email has been sent

  @Regression
  Scenario: APT-182: As a Administrator, I want to resend the activation email so that a user receives a revised activation email
    # Scenario 1:
    Given user opens browser
    When user logs into app
    And user navigates to users page
    And user searches for a user to be activated
    Then user is on "UserDetails" page
    # Scenario 2:
    Given user is on "UserDetails" page
    When user sent a request for the link for the activation
    Then user sees feedback message "Activation link has been successfully resent to the User"
    # Scenario 3:
    #Given user is on "UserDetails" page
    #When user closes add user page
    #And user searches for a user that is already activated
    #Then user does not see the reactivation email button
