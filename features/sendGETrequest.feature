Business Need: Microservice can handle all type of request
  Feature: Handle GET request
    Scenario: User get response after send GET request

      Given User co address so 2
      When User gui GET request den endpoint
      Then User nhan duoc ket qua

@P2
Feature: Handle PUT request
  Scenario: User get response after send PUT request

      Given User co address so 3
      When User gui GET request den endpoint
      Then User nhan duoc ket qua

@T2
Feature: Handle DELETE request
  Scenario: User get response after send DELETE request

    Given User co address so 4
    When User gui GET request den endpoint
    Then User nhan duoc ket qua
