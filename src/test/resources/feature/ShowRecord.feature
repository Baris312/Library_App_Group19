
Feature: Show record functionality

  Background: User is already in login page
    Given user is on the login page

  Scenario: verify default record count
     When Librarian enter "<librarianEmail>" and "<Password>"
    Then Librarians click on UserTitle  link
    Then show records default value should be 10
    Then show records count options

      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |