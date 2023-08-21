Feature: Shopping Process

  Scenario: User enters locked user and sees text
    Given user lands on the main page
    When user clicks Target Market button
    And user enters "locked_out_user" to user name box
    And user enters "secret_password" to password box
    And user clicks Login button
    Then user sees "Your account is locked." text