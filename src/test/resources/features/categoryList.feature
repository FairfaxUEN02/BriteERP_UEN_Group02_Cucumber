 #{color:#de350b}User Stroy{color}
	#As a PoS Manager, I should be able to view and modify the Pos categories list under the configuration.
	#
	#{color:#de350b} Acceptance Criteria{color}
	#1. Verify that manager is able to view the category detail by clicking the category name.
	#2. Verify that manager should is able to select multiple categories with the checkbox.
	#3. Verify that manager should is able to export multiple categories;
	#4. Verify that manager should is able to delete multiple categories;
	#h4.  
 @BRIT-4085

 Feature: Manager should be able to view and modify the Pos categories list under the configuration.

   Background:
     Given user on the data base page
     Then user selects the data base
     Then user logs in using "in_pos_manager@info.com" and "KjKtfgrs30"

   @l1
   Scenario: the user should be able to view the category detail
     When the user clicks on an existing category
     And the name of the category displayed on the main panel

   @l2
   Scenario: the user should be able to select multiple category
     When the user clicks on the check box on the first row
     Then All the categories are checked

   @3
   Scenario: the user should be able to delete multiple categories
     When the user clicks on the multiple categories checkbox
     Then the user clicks on the action
     And the user click on the 'Delete' under the action
     And selected categories disappear from the categories list

   @4
   Scenario: the user should be able to switch the view type
     When the user clicks on the Kanban view option
     Then the categories displayed in kanban view

   @5
   Scenario: the user should be able to search using search box
     When the user enters valid category name
     Then the search box content is equals to the entered name
		    