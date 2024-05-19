Feature:Add to Favorites/Rename/Comment on File Functionality

	User Story:As an user i should be able to add to Favorites/Rename/Comment on File Functionality.
	User can add any file to favorites/rename/comment  from its own three dots menu.

	@B33G5-103
	Scenario Outline: Add any file to favorites
		Given the user logged in as "<userType>"
		When user navigates to Files
		And user sellects random file and clicks on three dots menu
		Then user is adding file to favorites and verifies it
		Examples:
			| userType |
			| user     |
			| employee |


	@B33G5-130
	Scenario Outline: User can rename any file from its own three dots menu
		Given the user logged in as "<userType>"
		When user navigates to Files
		And user clicks on three dots menu of first file
		And user click Rename
		Then user verifys folders name
		Examples:
			| userType |
			| user     |
			| employee |

	@B33G5-131
	Scenario Outline: user can comment on File Functionality
		Given the user logged in as "<userType>"
		When user navigates to Files
		And user sellects random file and clicks on three dots menu
		And user clicks Details then Commend
		Then user adds his comment and verifies its displayed
		Examples:
			| userType |
			| user     |
			| employee |
