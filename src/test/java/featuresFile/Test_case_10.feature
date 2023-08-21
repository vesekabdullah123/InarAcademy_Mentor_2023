Feature: Shopping Process

  Scenario: User enter as a performance glitch user and accept alert
    Given user lands on the main page
    When user clicks Target Market button
    And user enters "performance_glitch_user" to user name box
    And user enters "secret_password" to password box
    And user clicks Login button and set sleep
    And user clicks smartphones bundle
    And user clicks add to cart button
    And user accept alerts
    And user clicks cart symbol


