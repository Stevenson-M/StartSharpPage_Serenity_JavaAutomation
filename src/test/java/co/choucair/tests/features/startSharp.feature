#Author: Jinson Stevenson Moreno

Feature: startSharp
  As a user of startSharp web app
  I want to be able to add new organizations to the site
  So that I can add meetings for that organization that i created

  Background:
    Given I am on StartSharp login page
    And I login with the admin credentials


  Scenario: Create new organization
    Given I want to create a new organization
    When I fill new business unit form
    Then I should create a new organization successfully and see the the pop up with the message "Save success"


  Scenario: Add new meeting to an organization
    Given I want to add a meeting
    When  I fill new meeting form
    Then   I should create a new meeting successfully and see the the pop up with the message "Save success"

