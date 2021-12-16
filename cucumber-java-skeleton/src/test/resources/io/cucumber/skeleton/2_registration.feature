Feature: Test register functionality

  Scenario: Check register is successful with unused credentials
    Given I go to the home page
    When I click on "My Account" button
    And I click on "Register" button
    When user enters parameters
    And user clicks on "btn-primary" to submit form
    Then user is navigated to the "Your Account Has Been Created!" page
    And I click on "Logout" button

  Scenario: Check register is unsuccessful with used email
    Given I go to the home page
    When I click on "My Account" button
    And I click on "Register" button
    When user enters parameters
    And user clicks on "btn-primary" to submit form
    Then user is navigated to the "Register Account" page

  Scenario: Check register is unsuccessful with used telephone
    Given I go to the home page
    When I click on "My Account" button
    And I click on "Register" button
    When user enters parameters
    And user clicks on "btn-primary" to submit form
    Then user is navigated to the "Register Account" page

