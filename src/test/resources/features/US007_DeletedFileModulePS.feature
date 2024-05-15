@B33G5-146
Feature: US-007 Deleted Files Tab Functionality under Files Module

  @B33G5-105
Scenario Outline: order the all deleted files by newest to oldest or vice versa
    Given the user logged in as "<userType>"
    Given user is on the Deleted File Tab
    When user chooses to order deleted files by time
    Then user can order the all deleted files by newest to oldest or vice versa
    Examples:
      | userType |
      | user     |
      | employee |

  @B33G5-142
  Scenario Outline: Permanently Removing a Deleted File

    Given the user logged in as "<userType>"
    Given user is on the Deleted File Tab
    When user should be able  to select the Delete permanently
    Then the permanently deleted file should be removed from the trash list
    Examples:
      | userType |
      | user     |
      | employee |

  @B33G5-143
    Scenario Outline: Restoring a Deleted file

      Given the user logged in as "<userType>"
      Given user is on the Deleted File Tab
      When user should be able to select the Restore
      Then User can see it again under the All Files tab
      Examples:
        | userType |
        | user     |
        | employee |