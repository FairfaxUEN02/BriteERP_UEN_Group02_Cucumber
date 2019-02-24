@wip
Feature: Manager should be able to view and modify the Pos categories list under the configuration

	Background:
		Given user on the data base page
		Then user selects the data base
		Then user logs in using "in_pos_manager@info.com" and "KjKtfgrs30"
		When the user clicks on Point of Sale
		Then the user clicks on products
		Then the user click on Pos Categories

	Scenario: the user should be able to view the category detail
		When the user clicks on an existing category
		And the name of the category displayed on the main panel

	Scenario: the user should be able to select multiple category
		When the user clicks on the check box on the first row
		Then All the categories are checked

	Scenario: the user should be able to delete multiple categories
		When the user clicks on the multiple categories checkbox
		Then the user clicks on the action
		And the user click on the 'Delete' under the action
		And selected categories disappear from the categories list

	Scenario: the user should be able to switch the view type
		When the user clicks on the Kanban view option
		Then the categories displayed in kanban view

	Scenario: the user should be able to search using search box
		When the user enters valid category name
		Then the search box content is equals to the entered name