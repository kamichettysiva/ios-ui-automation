#Feature: Search property with location and some other attributes
#  In order to get correct result in SRP
#  As the user
#  I need to check the parsing URL after searching
#
#  @complete-hp
#  Scenario Outline: : Search with specified criteria to check the parsing URL in buy channel
#    Given I open the "home" page "http://localhost:3000/buy"
#    When Expand to show more detail options in "HP"
#    And Type the "<search_info>" in search box and select "<auto_suggest>" from list
#    And Select "<cate>"-"<sub>"-"<property>" as "Property Type" in "HP"
#    And Select "<min_price>" as "Min" for "Price Range" in "HP"
#    And Select "<max_price>" as "Max" for "Price Range" in "HP"
#    And Select "<min_build>" as "Min" for "Build sq.ft" in "HP"
#    And Select "<max_build>" as "Max" for "Build sq.ft" in "HP"
#    And Select "<bedroom_num>" for "Bedrooms" in "HP"
#    And Select "<bathroom_num>" for "Bathrooms" in "HP"
#    And Click "Search" button
#    Then The current url should be like "<parsing_url>"

#    Examples:
#      | search_info | auto_suggest           | cate        | sub                        | property | min_price  | max_price  | min_build | max_build | bedroom_num | bathroom_num | parsing_url                                                                                                                 |
#      | Kuala Lum   | Kuala Lumpur           | Residential | Condo / Serviced Residence |          | RM 200,000 | RM 300,000 | 400       | 500       | 1+          | 4+           | /buy/kuala-lumpur/condo-serviced-residence?mpr=200000&xpr=300000&mbu=400&xbu=500&br=1&btr=4&ptpid=RE&pn=Kuala%20Lumpur&pid= |
#      |             |                        |             |                            |          |            |            |           |           |             |              | /buy/property?ptpid=R                                                                                                       |
#      | Kuala Lum   | Kuala Lumpur           |             |                            |          |            |            |           |           |             |              | /buy/kuala-lumpur/property?ptpid=R&pn=Kuala%20Lumpur&pid=                                                                   |
#      | Bangsar     | Kuala Lumpur, Malaysia |             |                            |          |            |            |           |           |             |              | /buy/kuala-lumpur/bangsar/property?ptpid=R&pn=Bangsar%2C%20Kuala%20Lumpur&pid=                                              |
#      | Acacia      | Bangsar, Kuala Lumpur  |             |                            |          |            |            |           |           |             |              | /buy/kuala-lumpur/bangsar/condominium?ptpid=R&pn=Acacia%2C%20Bangsar%2C%20Kuala%20Lumpur&pid=                               |
#      | Kuala Lum   | Kuala Lumpur           | Residential | Condo / Serviced Residence |          |            |            |           |           |             |              | /buy/kuala-lumpur/condo-serviced-residence?ptpid=RE&pn=Kuala%20Lumpur&pid=                                                  |
#      |             |                        | Residential | Condo / Serviced Residence |          |            |            |           |           |             |              | /buy/condo-serviced-residence?ptpid=RE                                                                                      |#     | Robson      | Robson Condominium     |             |                            |          |            |            |           |           |             |              | /buy/kuala-lumpur/seputeh/condominium?ptpid=R&pn=Robson%20Condominium%2C%20Seputeh%2C%20Kuala%20Lumpur&pid=                 |
#      | Robson      | Robson Condominium     | Residential | Residential Land           |          |            |            |           |           |             |              | /buy/kuala-lumpur/seputeh/residential-land?ptpid=RR&pn=Robson%20Condominium%2C%20Seputeh%2C%20Kuala%20Lumpur&pid=           |


##  @complete-hp
##  Scenario Outline: Search with specified criteria to check the parsing URL in rent channel
##    Given I open the "home" page "http://localhost:3000/buy"
##    When Click the channel "Rent"
##    And Expand to show more detail options in "HP"
##    And Type the "<search_info>" in search box and select "<auto_suggest>" from list
##    And Select "<cate>"-"<sub>"-"<property>" as "Property Type" in "HP"
##    And Select "<min_price>" as "Min" for "Price Range" in "HP"
##    And Select "<max_price>" as "Max" for "Price Range" in "HP"
##    And Select "<min_build>" as "Min" for "Build sq.ft" in "HP"
##    And Select "<max_build>" as "Max" for "Build sq.ft" in "HP"
##    And Select "<bedroom_num>" for "Bedrooms" in "HP"
##    And Select "<bathroom_num>" for "Bathrooms" in "HP"
##    And Click "Search" button
##    Then The current url should be like "<parsing_url>"
##
##    Examples:
##      | search_info | auto_suggest           | cate        | sub                        | property | min_price | max_price | min_build | max_build | bedroom_num | bathroom_num | parsing_url                                                                                                              |
##      | Kuala Lum   | Kuala Lumpur           | Residential | Condo / Serviced Residence |          | RM 1,000  | RM 1,500  | 400       | 500       | 1+          | 4+           | /rent/kuala-lumpur/condo-serviced-residence?mpr=1000&xpr=1500&mbu=400&xbu=500&br=1&btr=4&ptpid=RE&pn=Kuala%20Lumpur&pid= |
##      |             |                        |             |                            |          |           |           |           |           |             |              | /rent/property?ptpid=R                                                                                                   |
##      | Kuala Lum   | Kuala Lumpur           |             |                            |          |           |           |           |           |             |              | /rent/kuala-lumpur/property?ptpid=R&pn=Kuala%20Lumpur&pid=                                                               |
##      | Bangsar     | Kuala Lumpur, Malaysia |             |                            |          |           |           |           |           |             |              | /rent/kuala-lumpur/bangsar/property?ptpid=R&pn=Bangsar%2C%20Kuala%20Lumpur&pid=                                          |
##      | Acacia      | Bangsar, Kuala Lumpur  |             |                            |          |           |           |           |           |             |              | /rent/kuala-lumpur/bangsar/condominium?ptpid=R&pn=Acacia%2C%20Bangsar%2C%20Kuala%20Lumpur&pid=                           |
##      | Kuala Lum   | Kuala Lumpur           | Residential | Condo / Serviced Residence |          |           |           |           |           |             |              | /rent/kuala-lumpur/condo-serviced-residence?ptpid=RE&pn=Kuala%20Lumpur&pid=                                              |
##      |             |                        | Residential | Condo / Serviced Residence |          |           |           |           |           |             |              | /rent/condo-serviced-residence?ptpid=RE                                                                                  |
##      | Robson      | Robson Condominium     |             |                            |          |           |           |           |           |             |              | /rent/kuala-lumpur/seputeh/condominium?ptpid=R&pn=Robson%20Condominium%2C%20Seputeh%2C%20Kuala%20Lumpur&pid=             |
##      | Robson      | Robson Condominium     | Residential | Residential Land           |          |           |           |           |           |             |              | /rent/kuala-lumpur/seputeh/residential-land?ptpid=RR&pn=Robson%20Condominium%2C%20Seputeh%2C%20Kuala%20Lumpur&pid=       |
#
#  @complete-hp
#  Scenario Outline: The ENG, Simplified Chinese and Traditional Chinese was supported in HP
#    Given I open the "home" page "http://localhost:3000/buy"
#    And The language labels "ENG, 简, 繁" should presents in "HP"
#    When Select language "<lang>" in "HP"
#    Then The page should display with "<lang>"
#    Examples:
#      | lang |
#      | 简    |
#      | 繁    |
