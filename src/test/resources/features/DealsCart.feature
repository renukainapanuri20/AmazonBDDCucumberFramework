Feature: Deals Cart

  Scenario: Add third deal product to cart

    Given User launches Amazon website
    When User clicks Today's Deals
    And User selects third deal
    And User adds item to cart
    Then Verify cart quantity