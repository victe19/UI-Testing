Feature: Test add chart functionality

  Scenario: I can add the succesfully samsung tablet to my chart
    Given I go to the home page
    When I click on "Tablets" button
    And I click on "Samsung Galaxy Tab 10.1" button
    And I click on "button-cart" to submmit
    Then I should see a "Success: " text
    And I click on cart button
    And I click on delete product


  Scenario: I can add the succesfully HTC phone to my chart
    Given I go to the home page
    When I click on "Phones & PDAs" button
    And I click on "HTC Touch HD" button
    And I click on "button-cart" to submmit
    Then I should see a "Success: " text
    And I click on cart button
    And I click on delete product

  Scenario: I can add the succesfully Palm phone to my chart
    Given I go to the home page
    When I click on "Phones & PDAs" button
    And I click on "Palm Treo Pro" button
    And I click on "button-cart" to submmit
    Then I should see a "Success: " text
    And I click on cart button
    And I click on delete product
