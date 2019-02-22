

	#*User Story*
	#As a POS Manager, I should be able to edit the point of sale on its page.
	#*Acceptance Criteria*
	#1, Verify POSManager should able to edit the point of sale by changing the name
	#2, Verify POSManager should able to change point of sale status from active to archived
	#3, Verify POSManager should able to set point of sale as Bar/Restaurant
	#4, Verify POSManager should able to set start category on edit point of sale page
	#5, Verify POSManager should able to add header and footer of receipts on point of sale
	#6, Verify POSManager should able to change Operation Type on point of sale
	#
  @BRIT-4211
  Feature: Config POS edit page
  Background:
    Given user on the data base page
    When user selects the data base
    Then user logs in using "in_pos_manager@info.com" and "KjKtfgrs30"
    Then the user clicks on Point of Sale under Configuration

  Scenario: user should able to change point of sale status from active to archived
    Given user on the point of sale page under Configuration
    When user clicks on an existing point of sale name
    Then user clicks Archive button
    Then the archived text should display on the page

  Scenario: user should able to set point of sale as Bar/Restaurant
    Given user on the point of sale page under Configuration
    When user clicks on an existing point of sale name
    Then user clicks on edit button
    Then user clicks Is a Bar/Restaurant check box and save
    Then the Bar/Restaurant check box should be selected on the page

  Scenario: user should able to edit the point of sale by changing the name
    Given user on the point of sale page under Configuration
    When user clicks on an existing point of sale name
    Then user clicks edit button
    Then user change the name and click save
    Then the POS name should be displayed with edited name

  Scenario: user should able to edit the point of sale by set start category
    Given user on the point of sale page under Configuration
    When user clicks on an existing point of sale name
    Then user clicks edit button
    Then user clicks Set Start Category checkbox and choose category
    Then user clicks save button
    And the edited start Category should be displayed on the page

  Scenario: user should able to edit the point of sale by changing Operation Type
    Given user on the point of sale page under Configuration
    When user clicks on an existing point of sale name
    Then user clicks edit button
    Then user selects operation type and save
    Then the operation type should changed to selected type

  Scenario: user should able to edit the point of sale by add header and footer of receipts on point of sale
    Given user on the point of sale page under Configuration
    When user clicks on an existing point of sale name
    Then user clicks edit button
    Then user clicks the Header & Footer checkbox and enter valid credentials
    Then user clicks save button
