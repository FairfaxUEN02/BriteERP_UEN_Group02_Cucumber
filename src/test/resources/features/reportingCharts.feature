@wip
Feature: POS Manager should be able to check order reports using by different charts


  Background: Login as manager
    Given user on the data base page
    Then user selects the data base
    Then user logs in using "in_pos_manager@info.com" and "KjKtfgrs30"
    When the user clicks on Point of Sale
    Then user clicks on Orders under the Reporting


  Scenario: User should be able to view the reports with Bar Chart
    When user clicks Bar Chart
    Then verify that the Bar Chart displayed


  Scenario: User should be able to view the reports with Line Chart
    When user clicks Line Chart
    Then verify that the Line Chart displayed


  Scenario: should not be able to view total price
  (Negative / Positive Numbers) using by using Pie Chart
    When user clicks Pie Chart
    Then verify that the Error Message has displayed