Feature: Handle GET request
  @P2
  Scenario: User get response after send GET request
      Given User co address so mot
      When User gui GET request den endpoint
      Then User nhan duoc ket qua

  @P20 @PC2000
  Scenario: User get response after send POST request
    Given User co address so mot
    When User gui POST request den endpoint
    Then User nhan duoc ket qua

  @P200
  Scenario: User get response after send PUT request
      Given User co address so ba
      When User gui PUT request den endpoint
      Then User nhan duoc ket qua
  @P200
  Scenario: User get response after send DELETE request
    Given User co address so tu
    When User gui DELETE request den endpoint
    Then User nhan duoc ket qua
