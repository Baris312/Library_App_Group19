Feature: As a user ,I should be see home page

@wip
  Scenario Outline: user login verification
    Given user on login page
    When user enter "<userEmail>" and  "<Password>"
    Then user Logout from homePage
    Then user on login page


    Examples: user login and page on library
      | userEmail           | Password |
      | student102@library  | Aaf6GwsY |
      | student103@library  | 7zWoKREA |
      | student104@library  | 73ndoZd0 |
      | librarian14@library | 87x8afWY |