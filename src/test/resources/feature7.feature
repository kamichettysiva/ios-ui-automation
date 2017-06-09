Feature: Sign Up and Login
  In order to Sign Up and Login
  As the end user
  I need to have a valid email id/credentials

@complete-7
  Scenario: User guide verification
    Given Start the "my" for device "7"
    When Click "Start"
     And Check Search Field Userguide with title "Start your search" and text "Tap to begin your search"
     And Type the search criteria "kuala " in search box
     And Select location "Kuala Kedah" from auto suggestion
     And Check Filter Userguide with title "Filter results" and text "Tap here to set your search filter and narrow down your search"
     And Check Bookmark Userguide with title "Shortlist properties" and text "Tap to shortlist property to view it later"


  Scenario: Search by applying filters
    Given Start the "my" for device "7"
    And Type the search criteria "kuala " in search box
    And Select location "Kuala Lumpur" from auto suggestion
    And Click "Filter"
    And Tap on "All Residential" search "Condo" and select "Condominium"
    And Set price filter min "" and Max ""
    And Click on "Search now"
    Then Verify "1 Filter Applied" on snackbar
    And Click "CLEAR ALL"