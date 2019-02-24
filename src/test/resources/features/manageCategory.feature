
Feature:Manager should be able to manage the existing category

  Background:
    Given user on the data base page
    Then user selects the data base
    Then user logs in using "in_pos_manager@info.com" and "KjKtfgrs30"
    When the user clicks on Point of Sale
    Then the user clicks on products
    Then the user click on Pos Categories
    And the user clicks on any category

  Scenario: verify the user is able to attach file to the existing category
    Then the user clicks on the Attachments
    Then the user clicks on the Add under the Attachments
    Then user clicks on the valid file to open

  Scenario: verify the user is able to switch the type of existing category
    When the user clicks on the edit
    Then the user select the type from the dropdown box
    Then the user clicks on Save
