Feature: Tiki Basic Scenario

  @TK01
  Scenario: User can go to GioHang

    Given User on Tiki homepage
    When User click on Cart Logo
    Then User is navigated to Login form