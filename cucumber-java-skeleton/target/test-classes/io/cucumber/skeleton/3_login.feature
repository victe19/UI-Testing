Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given I go to the home page
    When I click on "My Account" button
    And I click on "Login" button
    When user enters "skone@gmail.com" and "12345"
    And user clicks on "btn-primary" to submmit form
    Then user is navigated to the "My Account" page
    And I click on "Logout" button


  Scenario: Check login is unsuccessful with invalid pass
    Given I go to the home page
    When I click on "My Account" button
    And I click on "Login" button
    When user enters "skone@gmail.com" and "1234"
    And user clicks on "btn-primary" to submmit form
    Then user is navigated to the "Account Login" page


  Scenario: Check login is unsuccessful with inexistent email
    Given I go to the home page
    When I click on "My Account" button
    And I click on "Login" button
    When user enters "hola@gmail.com" and "1234"
    And user clicks on "btn-primary" to submmit form
    Then user is navigated to the "Account Login" page
