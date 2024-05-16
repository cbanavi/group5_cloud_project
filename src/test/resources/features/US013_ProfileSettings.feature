@B33G5-189
Feature: Edit/Enter Profile Settings Functionality

  @B33G5-186
  Scenario Outline: Verify that User can see at least following titles inside “Personal Info” under Profile Settings page; => Full name/Email/Phone number
    Given the user logged in as "<userType>"
    When the user is on the Settings page
    And the user selects a language "en"
    Then the user should see titles: "Full name", "Email", "Phone number"
    Examples:
      | userType |
      | user     |
      | employee |

  @B33G5-187
  Scenario Outline: Verify that Name of the user in the Settings field should be the same with Full Name input box
    Given the user logged in as "<userType>"
    When the user is on the Settings page
    When user click to the menu button
    And  user click to the Settings
    Then user should see the same name and username
    Examples:
      | userType |
      | user     |
      | employee |

  @B33G5-188
  Scenario Outline: Verify that User cannot pass any characters except numbers into the "Phone Number" input box.
    Given the user logged in as "<userType>"
    When the user is on the Settings page
    And the user enters "abc123" into the Phone Number input field
    Then the input should be rejected
    Examples:
      | userType |
      | user     |
      | employee |
