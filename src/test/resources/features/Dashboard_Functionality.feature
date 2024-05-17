@ati
Feature: User Interface Customization

  Background:
    Given the user is logged in

  Scenario: User sees modules and username after login
    When the user accesses the dashboard
    Then the user should see all modules
    And the user's username should be displayed



  Scenario: User customizes widgets
    When the user clicks on the Customize button
    And selects a widget
    Then the selected widget should be displayed


  Scenario: User sets status
    When the user clicks on the Set Status button
    And selects a status option


