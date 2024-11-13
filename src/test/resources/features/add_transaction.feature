Feature: Add  Transaction

  Scenario: Add new transaction
    Given User is logged into the application
      | user | pass |
    When User enters the required information for the new transaction
      | 12-12-2023 | 500 | transaction description |
    Then User should see a new transaction in the transaction list with correct details



