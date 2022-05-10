Feature: Gui mot request
  @P1
  Scenario: User gui mot request don gian
    Given User co address
    When User gui request den endpoint
    Then User nhan duoc ket qua
