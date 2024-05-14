@B33G5-138
Feature: Tasks Module Functionality
	User Story:
	As a user, I should be able to create a new task list or a single
	task and add any task to completed and important tasks list.



	@B33G5-133
  Scenario Outline: User creates a new list of tasks
    Given user is logged in as "<userType>"
    And user is on the Task Management Page
    When user creates a new list of tasks
    Then the new list should be visible in the task lists
    Examples:
      | userType |
      | user     |
      | employee |


  @B33G5-134
  Scenario Outline: User creates a new task
    Given the user is logged in as "<userType>"
    And  user is on the Task Management Page
    When user creates a new list of tasks
    When the user creates a new task
    Then the new task should be added to the task list
    Examples:
      | userType |
      | user     |
      | employee |


  @B33G5-135
  Scenario Outline: User marks a task as completed
    Given the user is logged in as "<userType>"
    And  user is on the Task Management Page
    And there are existing tasks in the task list
    When the user clicks on the checkbox near a task name
    Then the task should be marked as completed
    Examples:
      | userType |
      | user     |
      | employee |


  @B33G5-136
  Scenario Outline: User marks a task as important
    Given the user is logged in as "<userType>"
    And user is on the Task Management Page
    And there are existing tasks in the task list
    When the user clicks on the star icon next to a task
    Then the task should be marked as important
    Examples:
      | userType |
      | user     |
      | employee |


  @B33G5-137
  Scenario Outline: User views the number of uncompleted tasks
    Given the user is logged in as "<userType>"
    And  user is on the Task Management Page
    And there are existing tasks in the task list
    When the user navigates to the Current tab
    Then the user should see the number of uncompleted tasks next to the tab
    Examples:
      | userType |
      | user     |
      | employee |