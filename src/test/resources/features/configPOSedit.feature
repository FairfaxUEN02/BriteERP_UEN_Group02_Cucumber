Feature: As a POS Manager I should be able to edit the point of sale on it’s page
#  ======================   Almira   ==================================
	#*User Story*
	#As a POS Manager, I should be able to edit the point of sale on its page.
	#*Acceptance Criteria*
	#1, Verify POSManager should able to edit the point of sale by changing the name
	#2, Verify POSManager should able to change point of sale status from active to archived
	#3, Verify POSManager should able to set point of sale as Bar/Restaurant
	#4, Verify POSManager should able to set start category on edit point of sale page
	#5, Verify POSManager should able to add payment methods on point of sale
	#6, Verify POSManager should able to add header and footer of receipts on point of sale
	#7, Verify POSManager should able to change Operation Type on point of sale
	#
	@BRIT-4211
	@wip
	Scenario: As a POS Manager I should be able to edit the point of sale on it’s page
		Feature: Config POS edit page

		Background:
		     Given user on the point of sale page
		     Then the user clicks on Point of Sale under Configuration
			@wip
		 Scenario: user should able to change point of sale status from active to archived
		     Given user on the point of sale page under Configuration
		     When user clicks on an existing point of sale name
		     Then user clicks Archive button
		     Then the archived text should display on the page
			@wip
		 Scenario: user should able to set point of sale as Bar/Restaurant
		     Given user on the point of sale edit page
		     When user clicks Is a Bar/Restaurant check box and save
		     Then the Bar/Restaurant check box should be selected on the page
		