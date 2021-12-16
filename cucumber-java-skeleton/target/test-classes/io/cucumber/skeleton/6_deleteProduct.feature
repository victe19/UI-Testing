Feature: Test delete product functionality

  Scenario: I can delete a Mac product
    Given I go to the home page
    When I click on a add to cart in product "43"
    And I click on cart button
    And I click on delete product
    And I click on cart button
    Then I should see information of "Your shopping cart is empty!"

  Scenario: I can delete a Phone product
    Given I go to the home page
    When I click on a add to cart in product "40"
    And I click on cart button
    And I click on delete product
    And I click on cart button
    Then I should see information of "Your shopping cart is empty!"
