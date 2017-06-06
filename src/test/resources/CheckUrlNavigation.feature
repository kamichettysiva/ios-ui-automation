#Feature: The URL navigation should work well between HP & SRP & PDP
#  In order to get correct result in HP & SRP & PDP
#  As the user
#  I need to check the URL between them
#
#  Background:
#    Given I open the "home" page "http://localhost:3000/buy"
##    Given I open the "home" page "http://10.205.21.143:3000/buy"
#
#  @cross
#  Scenario: Check the url navigation when backing with twice time for buy channel
#    When Expand to show more detail options in "HP"
#    And Select "Residential"-"Condo / Serviced Residence"-"" as "Property Type" in "HP"
#    And Click "Search" button
#    And Click the property name "Upper East Ampang" in search result page
#    And Back the browser
#    And Back the browser
#    Then The current url should be like "/buy"
#    And The current url shouldn't include parameters "upper,east,ampang,condo,serviced,residence"
#
#  @cross
#  Scenario: Check the url navigation when changing channel to rent in SRP
#    When Expand to show more detail options in "HP"
#    And Select "Residential"-"Condo / Serviced Residence"-"" as "Property Type" in "HP"
#    And Click "Search" button
#    And Click the channel "Rent"
#    Then The current url should be like "/rent"
#
##  @cross
##  Scenario: Check the url navigation when backing with twice time for rent channel
##    When Click the channel "Rent"
##    And Expand to show more detail options in "HP"
##    And Select "Residential"-"Terrace / Link / Townhouse"-"" as "Property Type" in "HP"
##    And Click "Search" button
##    And Click the property name "Ampang Hilir 4993364" in search result page
##    And Back the browser
##    And Back the browser
##    Then The current url should be like "/rent"
##    And The current url shouldn't include parameters "hilir,ampang,terrace,link,townhouse"
##
##  @cross
##  Scenario: Check the url navigation when changing channel to buy in SRP
##    When Select the channel "Rent"
##    And Expand to show more detail options in "HP"
##    And Select "Residential"-"Condo / Serviced Residence"-"" as "Property Type" in "HP"
##    And Click "Search" button
##    And Click the channel "Buy"
##    Then The current url should be like "/buy"
##
##  @cross
##  Scenario: The filters should be filled in SRP if a user set some filters in HP buy channel
##    When Expand to show more detail options in "HP"
##    And Type the "Kuala Lum" in search box and select "Kuala Lumpur" from list
##    And Select "Residential"-"Condo / Serviced Residence"-"" as "Property Type" in "HP"
##    And Select "RM 200,000" as "Min" for "Price Range" in "HP"
##    And Select "RM 300,000" as "Max" for "Price Range" in "HP"
##    And Select "400" as "Min" for "Build sq.ft" in "HP"
##    And Select "500" as "Max" for "Build sq.ft" in "HP"
##    And Select "1+" for "Bedrooms" in "HP"
##    And Select "4+" for "Bathrooms" in "HP"
##    And Click "Search" button
##    And Expand to show more detail options in "SRP"
##    And The info in search box should be "Kuala Lumpur"
##    Then The min price should be "RM 200,000" in "SRP"
##    And The max price should be "RM 300,000" in "SRP"
##    And The min build should be "400" in "SRP"
##    And The max build should be "500" in "SRP"
##    And The bedroom should be "1+" in "SRP"
##    And The bathroom should be "4+" in "SRP"
##    And The current url should be like "/buy/kuala-lumpur/condo-serviced-residence?mpr=200000&xpr=300000&mbu=400&xbu=500&br=1&btr=4&ptpid=RE&pn=Kuala%20Lumpur&pid="
##
##  @cross
##  Scenario: The filters should be filled in SRP if a user set some filters in HP rent channel
##    When Click the channel "Rent"
##    And Expand to show more detail options in "HP"
##    And Type the "Kuala Lum" in search box and select "Kuala Lumpur" from list
##    And Select "Residential"-"Condo / Serviced Residence"-"" as "Property Type" in "HP"
##    And Select "RM 500" as "Min" for "Price Range" in "HP"
##    And Select "RM 1,000" as "Max" for "Price Range" in "HP"
##    And Select "400" as "Min" for "Build sq.ft" in "HP"
##    And Select "500" as "Max" for "Build sq.ft" in "HP"
##    And Select "1+" for "Bedrooms" in "HP"
##    And Select "4+" for "Bathrooms" in "HP"
##    And Click "Search" button
##    And Expand to show more detail options in "SRP"
##    Then The info in search box should be "Kuala Lumpur"
##    And The min price should be "RM 500" in "SRP"
##    And The max price should be "RM 1,000" in "SRP"
##    And The min build should be "400" in "SRP"
##    And The max build should be "500" in "SRP"
##    And The bedroom should be "1+" in "SRP"
##    And The bathroom should be "4+" in "SRP"
##    And The current url should be like "/rent/kuala-lumpur/condo-serviced-residence?mpr=500&xpr=1000&mbu=400&xbu=500&br=1&btr=4&ptpid=RE&pn=Kuala%20Lumpur&pid="
