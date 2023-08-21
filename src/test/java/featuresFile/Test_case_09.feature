Feature: Shopping Process

  Scenario: User enter as problem user and click add to cart button and see the cart is empty
    Given user lands on the main page
    When user clicks Target Market button
    And user enters "problem_user" to user name box
    And user enters "secret_password" to password box
    And user clicks Login button
    And user clicks smartphones bundle
    And user clicks add to cart button for samsung universe 9 item
    And user clicks cart symbol
    Then user sees "Your cart is empty." text