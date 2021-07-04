@HomePage
  Feature: Add an item to cart
  As a Bunnings web customer
  I want to search an item and add it to the cart

  Background: User has loaded bunnings website
    Given The title of the page is displayed as Australia DIY, Garden & Hardware Store - Bunnings Australia

  Scenario: Add an item to cart
    When The user enter Hammer in search bar
    And The user click on search button
    And The user choose to buy first product
    And The user click on add to cart button for first product
    And The user click on the Review & checkout Button
    Then The user verifies added item is on Review cart page
