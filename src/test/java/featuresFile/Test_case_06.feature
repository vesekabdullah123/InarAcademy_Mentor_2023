Feature: Shopping Process

  Scenario: User adds items on his cart and delete items at shopping cart page and see the text
    Given user lands on the main page
    When user clicks Target Market button
    And user enters "standard_user" to user name box
    And user enters "secret_password" to password box
    And user clicks Login button
    And User clicks Laptops bundle
    And User clicks add to cart button
    And User clicks cart symbol
    And User clicks on plus icon
    And user clicks on minus button until cart is empty
    Then user sees "Your cart is empty." text
