Feature: Mobile Search

  Scenario: Search mobiles and get last displayed item

    Given User launches Amazon website
    When User searches for mobiles
    And User scrolls down the page
    Then User captures last displayed mobile details