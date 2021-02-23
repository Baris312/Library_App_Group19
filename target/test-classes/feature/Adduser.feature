



Feature: User should be able to add users from users page


 Background: User is already in login page
  Given user is on the login page

  Scenario:  As a librarian, I should be able to add users from users page
   Given user is on the login page
    When Librarian enter "<librarianEmail>" and "<Password>"
    Then Librarians click on UserTitle  link
    Then Librarians click on Add User link
    Then Librarians add users with all valid info
    Then Librarians click on close button
    Then Librarians click on Edit User button
    Then Librarians click on Save changes
    Then Librarians sees the user updated  alert


