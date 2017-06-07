Feature: xxx
  In order to xxx
  As the xxx
  I need to xxx

@complete-7
  Scenario: User guide verification
    Given Start the "my" for device "7"
    When Click "Start"
    And Check Search Field Userguide with title "Start your search" and text "Tap to begin your search"
    And Type the search criteria "kuala " in search box
    And Select location "Kuala Kedah" from auto suggestion
    And Check Filter Userguide with title "Filter results" and text "Tap here to set your search filter and narrow down your search"
    And Check Bookmark Userguide with title "Shortlist properties" and text "Tap to shortlist property to view it later"