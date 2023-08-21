Feature: Shopping Process

  Scenario: User enter as problem user and click laptop icon and check situation
    Given user lands on the main page
    When user clicks Target Market button
    And user enters "problem_user" to user name box
    And user enters "secret_password" to password box
    And user clicks Login button
    And user clicks laptops bundle
    Then User checks page navigate laptop's page or not