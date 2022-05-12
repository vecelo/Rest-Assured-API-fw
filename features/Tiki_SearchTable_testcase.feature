Feature: User can find product directly on Search Bar

  @TK02
  Scenario: User search iphone 13 on Search matrix

    Given User on Tiki homepage
    When User search with many criteria
    |keyword|dich vu|noiban|mau sac|
    |iphone11|re hon hoan ti|Ho chi minh|xanh|
    |iphone11|khong gioi han|Ha noi|hong|
#    Then User see greater than 10 product