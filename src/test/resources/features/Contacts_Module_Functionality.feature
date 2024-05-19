@test
Feature: Contact Management


  Scenario Outline: User creates a new contact
    Given the user logged in as "<userType>"
    Given the user is on the contact management page
    When the user adds a new contact with name "Medi " and lastname "Doe"
    Then the new contact should appear on the all contact list
    Examples:
      | userType |
      | user     |
      | employee |

  Scenario Outline: User views all contacts
    Given the user logged in as "<userType>"
    Given the user is on the contact management page
    Then the user should see all contacts listed
    And the total number of contacts should be displayed
    Examples:
      | userType |
      | user     |
      | employee |

  Scenario Outline: User changes profile picture of a contact
    Given the user logged in as "<userType>"
    Given the user is on the contact management page
    When the user selects a contact "Jane Smith"
    And the user changes the profile picture by choosing a file
    Examples:
      | userType |
      | user     |
      | employee |


  Scenario Outline: User deletes a contact
    Given the user logged in as "<userType>"
    Given the user is on the contact management page
    When the user selects a contact to delete
    Examples:
      | userType |
      | user     |
      | employee |
