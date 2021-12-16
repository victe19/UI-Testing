Feature: Test search bar functionality

  Scenario: My website has a "Search" option
    When I go to the home page
    Then I should find a search button

  Scenario: I can find a correct product
    Given I go to the home page
    When I write a product like "Mac"
    And I click on search button
    Then I should see information of "Mac"

  Scenario: I can't find a incorrect product
    Given I go to the home page
    When I write a product like "Pepino"
    And I click on search button
    Then I should see information of "There is no product that matches the search criteria"
