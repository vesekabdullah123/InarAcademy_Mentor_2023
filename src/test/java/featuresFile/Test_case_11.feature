Feature: Shopping Process

  Scenario: User checks the logout button
    Given user lands on the main page
    When user clicks Target Market button
    And user enters "standard_user" to user name box
    And user enters "secret_password" to password box
    And user clicks Login button
    And user clicks logout button
    Then user checks the text "Welcome Target Market, please login"