Feature: BlazeDemo Flight Reservation

  Scenario: Reserve a flight
    Given I navigate to "https://blazedemo.com/"
    When I select "Mexico City" as the departure city
    And I select "Berlin" as the destination city
    And I click "Find Flights"
    And I select the 5th flight
    And I fill in the reservation form
    Then the reservation should be successful

