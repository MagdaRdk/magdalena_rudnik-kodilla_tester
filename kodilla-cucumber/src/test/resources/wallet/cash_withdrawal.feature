Feature: Cash Withdrawal


  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited 200 in my wallet
    When I request 30
    Then 30 should be dispensed
    And the balance of my wallet should be 170

  Scenario: Successful withdrawal all cash
    Given I have deposited 200 in my wallet
    When I request 200
    Then 200 should be dispensed
    And the balance of my wallet should be 0

  Scenario: Unsuccessful withdrawal more cash
    Given I have deposited 200 in my wallet
    When I request 201
    Then Should report error
    And the balance of my wallet should be 200

  Scenario: Unsuccessful withdrawal all cash
    Given I have deposited 200 in my wallet
    When I request 0
    Then Should report error
    And the balance of my wallet should be 200