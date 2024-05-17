Feature:Add to Favorites/Rename/Comment on File Functionality

	User Story:As an user i should be able to add to Favorites/Rename/Comment on File Functionality.
	User can add any file to favorites/rename/comment  from its own three dots menu.

	@B33G5-103
	Scenario Outline: Add any file to favorites
		Given user logged in as "usertype"
		And user navigates to Files
		Then user is adding all the files to favorites and verifies it
		Examples:
			| userType |
			| user     |
			| employee |


	@B33G5-130
	Scenario Outline: User can rename any file from its own three dots menu
		Given user logged in as "usertype"
		And user navigates to Files
		And user renames existing menues
		Then user verifys folders name
		Examples:
			| userType |
			| user     |
			#| employee |

	@B33G5-131
	Scenario Outline: user can comment on File Functionality
		Given user logged in as "usertype"
		And user navigates to Files
		And user clicks three dots menu of all files
		And user clicks Details
		And user clicks on Coments
		And user wites his coments and clicks enter
		Then user verifys his coment is displayed
		Examples:
			| userType |
			| user     |
			| employee |
