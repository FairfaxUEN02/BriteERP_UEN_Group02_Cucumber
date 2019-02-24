

Feature: POS Manager should be able to view the report with different options

  Background: Login as manager
    Given user on the data base page
    Then user selects the data base
    Then user logs in using "in_pos_manager@info.com" and "KjKtfgrs30"
    When the user clicks on Point of Sale
    Then user clicks on Orders under the Reporting

  Scenario: User should be able to change report view preference to Graph
    When the user clicks the graph view preference
    Then the system should display the graph view

  Scenario: User should be able to change report view preference to Pivot
    When the user clicks the pivot view preference
    Then the system should display the pivot view
