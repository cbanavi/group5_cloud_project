@B33G5-181
Feature: Check/Change Profile Settings Functionality

  @B33G5-173
  Scenario Outline: Full name and username should be the same
    Given the user logged in as "<userType>"
    When the user is on the Settings page
    When user click to the Avatar
    And  user click to the Settings
    Then user should see the same name and username
    Examples:
      | userType |
      | user     |
      | employee |


  @B33G5-177
  Scenario Outline: User can enter a proper e-mail to Email input box.
    Given the user logged in as "<userType>"
    When the user is on the Settings page
    And the user enters a proper email address to email input box
    Then the email field should display user's proper address
    Examples:
      | userType |
      | user     |
      | employee |

  @B33G5-178
  Scenario Outline: Verify user can change Language.
    Given the user logged in as "<userType>"
    When the user is on the Settings page
    And the user's preferred language is "English (US)"
    When the user selects a language "Español (España)"
    Then the language field should display "Español (España)"
    And website's language changed to "Español (España)"
    Examples:
      | userType |
      | user     |
      | employee |
