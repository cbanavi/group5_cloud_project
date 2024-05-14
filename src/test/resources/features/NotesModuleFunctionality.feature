@B33G5-129
Feature: As a user, I should be able to create/delete any note and see the details of the note.

	
	@B33G5-125
	Scenario Outline: User can create a new note
		Given the user is logged in as "<userType>"
		And the user is on the Notes page
		When the user creates a new note
		Then the user verifies note successfully created
		Examples:
		| userType |
		| user |
		| employee |	

	
	@B33G5-126
	Scenario Outline: User can add any note to the favorites
		Given the user is logged in as "<userType>"
		    And the user is on the Notes page
		    When the user adds the note to favorites
		    Then  the user verifies the note is added to the favorites
		    Examples:
		      | userType |
		      | user     |
		      | employee |	

	
	@B33G5-127
	Scenario Outline: User can see the number of letters and words that the note includes under the note title when clicked on the details of the note
		Given the user is logged in as "<userType>"
		    And the user is on the Notes page
		    When the user creates a new note
		    And the user is on the Note Details Section
		    When the user clicks on the Details option
		    Then the user verifies the number of words and letters in the note
		    Examples:
		      | userType |
		      | user     |
		      | employee |	

	
	@B33G5-128
	Scenario Outline: User can delete any note
		Given the user is logged in as "<userType>"
		    And the user is on the Notes page
		    When the user deletes the note
		    Then the note should be successfully deleted
		    And the user verifies successful deletion of the note
		    Examples:
		      | userType |
		      | user     |
		      | employee |