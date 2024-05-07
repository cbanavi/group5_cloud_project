@FolderFiles
Feature: Folder View Order and File Selection.
  As a user, I should be able to change folder view order by using Name/Size/Modified buttons
  Folder and files will be noted as Options in the steps.

  Background:
    Given User is logged In
    Then User is on the Files page


  Scenario: User changes folder view order by Name
    When User changes the folder view order by Name
    Then User verifies options are displayed in alphabetical order

  Scenario: User changes folder view order by Size
    When User changes the folder view order by Size
    Then User verifies options are displayed in ascending order of size

  Scenario: User changes folder view order by Modified
    When User changes the folder view order by Modified
    Then User verifies options are displayed in chronological order of modification

  Scenario: User selects all files and sees the total values
    Given User is viewing all created options with multiple folder or files
    When User selects all options using the "select all" checkbox
    Then User verifies total values of all options are displayed on the first line