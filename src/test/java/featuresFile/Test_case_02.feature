Feature: Shopping Process

  Scenario: User add phone to his cart and increase the count of phone on shopping cart page
    Given User lands on the main page
    When user clicks Target Market button
    And user enters "standard_user" to user name box
    And user enters "secret_password" to password box
    And user clicks Login button
    And User clicks smartphones bundle
    And User clicks add to cart button
    And User clicks cart symbol
    And User clicks on plus icon
    Then User checks the count of phones