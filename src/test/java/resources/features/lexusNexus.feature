Feature: Check Homepage
In order to check the Home Page is displayed correctly
As a user
I want to check that the required fields are displayed and are clickable

  Background:
    Given I have navigated to the Homepage

  Scenario: Check that theFinancial Services element is displayed and clickable on Homepage
    Given I accept the cookies popup if present
    When the Financial Services element is displayed
    #Then the Financial Services element is clickable



