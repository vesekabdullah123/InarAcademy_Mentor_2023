Feature: Shopping Process

  Scenario: User enters invalid card number and check the placeholder under the card number box
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
    And user enters "Galatasaray" to adress box
    And user enters "123456789123456" to card number box
    And user enters "123" to phone number box
    And user clicks place order button
    Then user checks placeholder under phone number box and sees "Phone number must be 10 digits" text