@EnterProfile
Feature: User Can See Personal Info
         As a user, I should be able to change profile info settings under the Profile module.

  Scenario Outline: Verify Personal Info Displayed
    Given the user logged in as "<userType>"
    When User navigates to Profile Settings page
    Then User should see Full name, Email, and Phone Number
      |Full name    |
      |Email        |
      |Phone number |
    Examples:
      | userType |
      | user     |
      | employee |

  Scenario Outline: Verify Name Matches Full Name Input Box
    Given the user logged in as "<userType>"
    When User navigates to Profile Settings page
    Then Name in Settings field should match Full Name input box
    Examples:
      | userType |
      | user     |
      | employee |

  Scenario Outline: Verify Only Numbers Allowed in Phone Number Input Box
    Given the user logged in as "<userType>"
    When User enters characters into Phone Number input box
    Then User should not be able to enter characters
    Examples:
      | userType |
      | user     |
      | employee |


