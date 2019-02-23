# -------------------- Almira ------------------------------------------
	#*User Story*
	#As a POS manager, I should have access to edit product on point of sale
	#*Acceptance Criteria *
	#1, Verify only at POSManager's level able to have access to create the point of sale
	#2, Verify POSUser's level not able to have access to create the point of sale
@BRIT-4310
Feature: POS Manager should have access to create point of sale

  Scenario Outline: Verify only POSmanager should be able to create point of sale
    Given user on the data base page
    When user selects the data base
    Then user logs in using "<email>" and "<password>"
    Then the user clicks on Point of Sale
    And the user clicks on Point of Sale under Configuration
    Then create button <expected> be displayed on the page

    Examples:
      | email                   | password   | expected   |
      | in_pos_manager@info.com | KjKtfgrs30 | should     |
      | in_pos_user@info.com    | KjKtfgrs37 | should not |