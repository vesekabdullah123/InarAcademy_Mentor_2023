Feature: Shopping Process

  Scenario: User does not enter address information and checks placeholder under address box
    Given user lands on the main page
    When user clicks Target Market button
    And user enters "standard_user" to user name box
    And user enters "secret_password" to password box
    And user clicks Login button
    And user clicks smartphones bundle
    And user clicks add to cart button
    And user clicks cart symbol
    And user clicks Go To Checkout button
    And user enters "Mauro" to first name box
    And user enters "Icardi" to last name box
    And user enters "1234567891234567" to card number box
    And user enters "1234567890" to phone number box
    And user clicks place order button
    Then user checks placeholder under adress box and sees "Address is required" text
