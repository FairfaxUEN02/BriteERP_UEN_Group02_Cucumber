Feature: login functionality


@wip
  Scenario: Pos manager login
    Given user on the data base page
    Then user selects the data base
    Then user logs in using "in_pos_manager@info.com" and "KjKtfgrs30"
    When the user clicks on Point of Sale

