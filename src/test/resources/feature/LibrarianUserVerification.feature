
@smoke
Feature: Verification of user categories

  Background: User is already in login page
    Given user is on the login page


  Scenario:  As a librarian, I should be able to add users from users page
    Given user is on the login page
    When Librarian enter "<librarianEmail>" and "<Password>"
    Then Librarians click on UserTitle  link
    And Librarians click on User Group dropdown
    Then user should see the following options:
      | ALL       |
      | Librarian |
      | Students  |

  @wip
  Scenario: verify user status
    Given user is on the login page
    When Librarian enter "<librarianEmail>" and "<Password>"
    Then Librarians click on UserTitle  link
    And the user click Status dopdown
    Then the user should see the following options:

      | ACTIVE   |
      | INACTIVE |


