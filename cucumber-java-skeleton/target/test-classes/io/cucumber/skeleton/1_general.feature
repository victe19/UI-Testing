Feature: Tests a page using Selenium WebDriver
  In order to evaluate Selenium Framework
  As a developer
  I want to interact with my web

  Scenario: My website have "Your Store" section
    When I go to the home page
    Then I should see a "Your Store" button

  Scenario: My website has a "Desktops" section
    Given I go to the home page
    When I click on "Your Store" button
    Then I should see a "Desktops" text

  Scenario: My website has a "Components" section
    Given I go to the home page
    When I click on "Components" button
    Then I should see a "Monitors" text
