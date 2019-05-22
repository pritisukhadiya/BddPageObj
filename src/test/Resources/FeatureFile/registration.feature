@register

Feature: user should able to register successfully
  so that he can use all facility


  Scenario: User should able to register
    Given user is on homepage
    When user enters all details
    Then user should able to register successfully