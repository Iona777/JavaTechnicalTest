Feature: Check Homepage
In order to check the Home Page is displayed correctly
As a user
I want to check that the required fields are displayed and are clickable

  Background:
    Given I have navigated to the Homepage

  Scenario Outline: Check that the given element is displayed and clickable on Home page
    Given I accept the cookies popup if present
    When the "<element>" element is displayed
    Then the "<element>" element is clickable
    Examples:
      | element              |
      | Insurance            |
      | Financial Services   |
      | Life And Pensions    |
      | Corps And NonProfits |


  Scenario Outline: Check that the given element is displayed and clickable on Financial Services page
    Given I accept the cookies popup if present
    And I select Industries Select Financial Services under the Choose your Industry tab
    When the "<element>" element is displayed
    Then the "<element>" element is clickable
    Examples:
      | element                          |
      | Financial Crime Compliance       |
      | Fraud And Identity               |
      | Customer Data                    |
      | Credit Risk                      |
      | Collections And Recovery         |
       #Note: 'Tracing and Investigations' link appears to have been renamed
      | Investigations And Due Diligence |

