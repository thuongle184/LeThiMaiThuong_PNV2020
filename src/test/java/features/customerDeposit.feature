# new feature
# Tags: optional

Feature: Customer Deposit

  Scenario Outline: Customer Deposit Successfully
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer
    When I login with username as <username> successfully
    When I click deposit button
    And I type the depsit as <deposit>
    And I click deposit submit button
    Then I verify that customer deposit successfully

    Examples:
      |username | deposit |
      |Ron Weasly | 2000    |