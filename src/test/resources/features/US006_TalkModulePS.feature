@B33G5-151
Feature:US-006 Talk Module Functionality

  @B33G5-149
Scenario Outline: User can create a new conversation by adding any selected participant

  Given the user logged in as "<userType>"
  Given user is on the Talk page
  When user should be able to add new participant
  And user should be able to create new conversation
  Then user should be able to see the newly created conversation in the list
  Examples:
    | userType |
    | user     |
    | employee |

  @B33G5-150
  Scenario Outline: User can delete a conversation
    Given the user logged in as "<userType>"
    Given user is on the Talk page
    When user should be able to delete a converstaion by clicking on three dot menu
    Then user should not be able to see the conversation in the list
    Examples:
      | userType |
      | user     |
      | employee |