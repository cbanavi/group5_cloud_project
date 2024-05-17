@ati
Feature: User Interface Customization

  #Background:
    #Given the user is logged in

  #Scenario: User sees modules and username after login
  Scenario Outline: User sees modules and username after login
    Given the user logged in as "<userType>"
    When the user accesses the dashboard
    Then the user should see all modules
    And the user's username should be displayed
    Examples:
      | userType |
      | user     |
      | employee |


  #Scenario: User customizes widgets
  Scenario Outline: User customizes widgets
    Given the user logged in as "<userType>"
    When the user clicks on the Customize button
    And selects a widget
    Then the selected widget should be displayed
    Examples:
      | userType |
      | user     |
      | employee |

  #Scenario: User sets status
  Scenario Outline: User sets status
    When the user clicks on the Set Status button
    And selects a status option
    Given the user logged in as "<userType>"
    Examples:
      | userType |
      | user     |
      | employee |

