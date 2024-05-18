@B33G5-195
Feature: Default

	#User can create a new board
	@B33G5-191
	Scenario Outline: User can create a new board
		Given the user logged in as "<userType>"
		Given User is on the deck page
		When user should be able to click on AddBoard button
		And user should be able to enter the desired name there
		Then user should be able to see the newly created board under all Board tab
		        Examples:
						| userType |
						| user     |
						| employee |	

	#User can create a new list of card/task under any board
	@B33G5-192
	Scenario Outline: User can create a new list of card/task under any board
		Given the user logged in as "<userType>"
		Given User is on the deck page
		When user should be able to choose any board by clicking on the name
		And user should be able to click on the Add List button
		And user should be able to write their desired name and click enter or click on the arrow
		Then user should be able to the new list under the chosen board name
		        Examples:
						| userType |
						| user     |
						| employee |	

	#User can add a new card/task on any list on the current board
	@B33G5-193
	Scenario Outline: User can add a new card/task on any list on the current board
		Given the user logged in as "<userType>"
		Given User is on the deck page
		When user should be able to click on add card button
		And user should be able to add the new name and click on arrow or click on enter
		Then user should be able to see the card under the chosen list 
		And on the right side of the window
		        Examples:
						| userType |
						| user     |
						| employee |	

	#User can assign any card/task to himself/herself by using the three dots on the related card
	@B33G5-194
	Scenario Outline: User can assign any card/task to himself/herself by using the three dots on the related card
		Given the user logged in as "<userType>"
		Given User is on the deck page
		When user should be able to click on three dots menu
		And user should be able to click on assign to me
		Then user should be able to see their profile icon displayed beside three dots same as profile icon.
		        Examples:
						| userType |
						| user     |
						| employee |