Feature: Google Search

  Scenario: User searches for a term
    Given the user is on the Google search page
    When the user enters "Shaik Abdul Shahriar" in the search bar
    And clicks the search button
    Then the search results page is displayed