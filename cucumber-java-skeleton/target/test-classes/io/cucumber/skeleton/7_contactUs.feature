#Feature1
Feature: Test contact us functionality

  Scenario: I can go to contact us page
    Given I go to the home page
    When I click on a contact us text
    Then I should see a "Contact Form" text

  Scenario: I can do a contact form
    Given I go to the home page
    When I click on a contact us text
    And I type my "name" which is "Carlos López" in the form
    And I type my "email" which is "carlos99sbd@gmail.com" in the form
    And I type my "enquiry" which is "Que vivan las prácticas de TQS" in the form
    And I click on submit button
    Then I should see information of "Continue"
