Feature: User can find product directly on Search Bar

  @TK02
  Scenario: User search iphone 13 on Search Bar

    Given User on Tiki homepage
    When User search for 'iphone 13'
    Then User see greater than 10 product

  @TK03
  Scenario: User search invalidd on Search Bar

    Given User on Tiki homepage
    When User search for 'invalidd'
    Then User see greater than 0 product

  @TK04
  Scenario: User search quần Jean in Hàng mới on Search Bar

    Given User on Tiki homepage
    When User search for 'quần Jean' in 'helo' category
    Then User see greater than 10 product

  @TK05
  Scenario Outline: User verify the page navigation and URL and Title

    Given User on Tiki homepage
    When User click on '<linka>'
    Then User validate the '<url>' and the title '<title>'
    Examples:
      | linka          | url                                                                                                                                                             | title         |
      | trái cây       | https://tiki.vn/tikingon/trai-cay/c44824                                                                                                                        | trái cây      |
      | Mua bán ASA/XU | https://exchange.tiki.vn/?src=top_desktop_icon                                                                                                                  | Tiki Exchange |
      | Xe tay ga      | https://tiki.vn/xe-tay-ga/c11878?itm_campaign=tiki-reco_UNK_DT_UNK_UNK_featured-categories_UNK_UNK_UNK_MD_batched_CID.11878&itm_medium=CPC&itm_source=tiki-reco | Xe tay gam     |


