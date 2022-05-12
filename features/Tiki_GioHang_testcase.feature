Feature: Tiki Basic Scenario

  @TK01
  Scenario: User is redirect to Login form when click GioHang

    Given User on Tiki homepage
    When User click on Cart Logo
    Then User is navigated to Login form