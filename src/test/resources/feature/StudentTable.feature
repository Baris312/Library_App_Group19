@smoke
Feature: students should be able to see tables with default info


  Background: User is already in login page
    Given user is on the login page

  Scenario Outline: student should be able to see tables with default info
    Given user is on the login page
    When user enter "<userEmail>" and "<Password>"
    Then the user should see following names
      | Action and Adventure |
      | ISBN                 |
      | Name                 |
      | Author               |
      | Category             |
      | Year                 |
      | Borrowed By          |


    Examples: user login info
      | userEmail          | Password |
      | student102@library | Aaf6GwsY |
